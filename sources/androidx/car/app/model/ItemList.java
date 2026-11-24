package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ItemList {
    private final List<ot5> mItems;
    private final CarText mNoItemsMessage;
    private final gr7 mOnItemVisibilityChangedDelegate;
    private final kr7 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(pt5 pt5Var) {
        this.mSelectedIndex = pt5Var.b;
        this.mItems = ttd.a(pt5Var.a);
        this.mNoItemsMessage = pt5Var.e;
        this.mOnSelectedDelegate = pt5Var.c;
        this.mOnItemVisibilityChangedDelegate = pt5Var.d;
    }

    public static br7 getOnClickDelegate(ot5 ot5Var) {
        if (ot5Var instanceof Row) {
            return ((Row) ot5Var).getOnClickDelegate();
        }
        if (ot5Var instanceof GridItem) {
            return ((GridItem) ot5Var).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(ot5 ot5Var) {
        if (ot5Var instanceof Row) {
            return ((Row) ot5Var).getToggle();
        }
        return null;
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

    public List<ot5> getItems() {
        List<ot5> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public gr7 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public kr7 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public pt5 toBuilder() {
        return new pt5(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<ot5> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return hg9.k(sb, this.mSelectedIndex, "]");
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
