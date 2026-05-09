package androidx.car.app.model.constraints;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Item;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Row;
import androidx.car.app.model.SectionedItemList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class RowListConstraints {
    public static final RowListConstraints MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_CONSERVATIVE;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_FULL_LIST;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_PANE;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_ROUTE_PREVIEW;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_SIMPLE;
    private final boolean mAllowSelectableLists;
    private final int mMaxActions;
    private final RowConstraints mRowConstraints;

    static {
        RowListConstraints build = new Builder().setMaxActions(0).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_CONSERVATIVE).setAllowSelectableLists(false).build();
        ROW_LIST_CONSTRAINTS_CONSERVATIVE = build;
        ROW_LIST_CONSTRAINTS_PANE = new Builder(build).setMaxActions(2).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_PANE).setAllowSelectableLists(false).build();
        Builder builder = new Builder(build);
        RowConstraints rowConstraints = RowConstraints.ROW_CONSTRAINTS_SIMPLE;
        ROW_LIST_CONSTRAINTS_SIMPLE = builder.setRowConstraints(rowConstraints).build();
        ROW_LIST_CONSTRAINTS_ROUTE_PREVIEW = new Builder(build).setRowConstraints(rowConstraints).setAllowSelectableLists(true).build();
        MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE = new Builder(build).setRowConstraints(rowConstraints).setAllowSelectableLists(true).build();
        ROW_LIST_CONSTRAINTS_FULL_LIST = new Builder(build).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_FULL_LIST).setAllowSelectableLists(true).build();
    }

    public int getMaxActions() {
        return this.mMaxActions;
    }

    public RowConstraints getRowConstraints() {
        return this.mRowConstraints;
    }

    public boolean isAllowSelectableLists() {
        return this.mAllowSelectableLists;
    }

    public void validateOrThrow(ItemList itemList) {
        if (itemList.getOnSelectedDelegate() != null && !this.mAllowSelectableLists) {
            throw new IllegalArgumentException("Selectable lists are not allowed");
        }
        validateRows(itemList.getItems());
    }

    public void validateOrThrow(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ItemList itemList = ((SectionedItemList) it.next()).getItemList();
            if (itemList.getOnSelectedDelegate() != null && !this.mAllowSelectableLists) {
                throw new IllegalArgumentException("Selectable lists are not allowed");
            }
            arrayList.addAll(itemList.getItems());
        }
        validateRows(arrayList);
    }

    private void validateRows(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            if (item instanceof Row) {
                this.mRowConstraints.validateOrThrow((Row) item);
            } else if (!(item instanceof ConversationItem)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", item.getClass().getSimpleName()));
            }
        }
    }

    RowListConstraints(Builder builder) {
        this.mMaxActions = builder.mMaxActions;
        this.mRowConstraints = builder.mRowConstraints;
        this.mAllowSelectableLists = builder.mAllowSelectableLists;
    }

    public static final class Builder {
        boolean mAllowSelectableLists;
        int mMaxActions;
        RowConstraints mRowConstraints;

        public Builder setMaxActions(int i) {
            this.mMaxActions = i;
            return this;
        }

        public Builder setRowConstraints(RowConstraints rowConstraints) {
            this.mRowConstraints = rowConstraints;
            return this;
        }

        public Builder setAllowSelectableLists(boolean z) {
            this.mAllowSelectableLists = z;
            return this;
        }

        public RowListConstraints build() {
            return new RowListConstraints(this);
        }

        public Builder() {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
        }

        public Builder(RowListConstraints rowListConstraints) {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
            Objects.requireNonNull(rowListConstraints);
            this.mMaxActions = rowListConstraints.getMaxActions();
            this.mRowConstraints = rowListConstraints.getRowConstraints();
            this.mAllowSelectableLists = rowListConstraints.isAllowSelectableLists();
        }
    }
}
