package androidx.car.app.model;

import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ItemList {
    private final List<Item> mItems;
    private final CarText mNoItemsMessage;
    private final OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
    private final OnSelectedDelegate mOnSelectedDelegate;
    private final int mSelectedIndex;

    public interface OnItemVisibilityChangedListener {
    }

    public interface OnSelectedListener {
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public OnSelectedDelegate getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public OnItemVisibilityChangedDelegate getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public List<Item> getItems() {
        return CollectionUtils.emptyIfNull(this.mItems);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ items: ");
        List<Item> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Boolean.valueOf(this.mOnSelectedDelegate == null).equals(Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    ItemList(Builder builder) {
        this.mSelectedIndex = builder.mSelectedIndex;
        this.mItems = CollectionUtils.unmodifiableCopy(builder.mItems);
        this.mNoItemsMessage = builder.mNoItemsMessage;
        this.mOnSelectedDelegate = builder.mOnSelectedDelegate;
        this.mOnItemVisibilityChangedDelegate = builder.mOnItemVisibilityChangedDelegate;
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    static OnClickDelegate getOnClickDelegate(Item item) {
        if (item instanceof Row) {
            return ((Row) item).getOnClickDelegate();
        }
        if (item instanceof GridItem) {
            return ((GridItem) item).getOnClickDelegate();
        }
        return null;
    }

    static Toggle getToggle(Item item) {
        if (item instanceof Row) {
            return ((Row) item).getToggle();
        }
        return null;
    }

    public static final class Builder {
        final List mItems;
        CarText mNoItemsMessage;
        OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
        OnSelectedDelegate mOnSelectedDelegate;
        int mSelectedIndex;

        public Builder addItem(Item item) {
            List list = this.mItems;
            Objects.requireNonNull(item);
            list.add(item);
            return this;
        }

        public Builder clearItems() {
            this.mItems.clear();
            return this;
        }

        public ItemList build() {
            if (this.mOnSelectedDelegate != null) {
                int size = this.mItems.size();
                if (size == 0) {
                    throw new IllegalStateException("A selectable list cannot be empty");
                }
                if (this.mSelectedIndex >= size) {
                    throw new IllegalStateException("The selected item index (" + this.mSelectedIndex + ") is larger than the size of the list (" + size + ")");
                }
                for (Item item : this.mItems) {
                    if (ItemList.getOnClickDelegate(item) != null) {
                        throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    }
                    if (ItemList.getToggle(item) != null) {
                        throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                    }
                }
            }
            return new ItemList(this);
        }

        Builder(ItemList itemList) {
            this.mSelectedIndex = itemList.getSelectedIndex();
            this.mOnSelectedDelegate = itemList.getOnSelectedDelegate();
            this.mOnItemVisibilityChangedDelegate = itemList.getOnItemVisibilityChangedDelegate();
            this.mNoItemsMessage = itemList.getNoItemsMessage();
            this.mItems = new ArrayList(itemList.getItems());
        }
    }
}
