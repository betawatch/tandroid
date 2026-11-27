package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ItemList {
    private final List<rt5> mItems;
    private final CarText mNoItemsMessage;
    private final ds7 mOnItemVisibilityChangedDelegate;
    private final hs7 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(st5 st5Var) {
        this.mSelectedIndex = st5Var.b;
        this.mItems = gwd.a(st5Var.a);
        this.mNoItemsMessage = st5Var.e;
        this.mOnSelectedDelegate = st5Var.c;
        this.mOnItemVisibilityChangedDelegate = st5Var.d;
    }

    public static yr7 getOnClickDelegate(rt5 rt5Var) {
        if (rt5Var instanceof Row) {
            return ((Row) rt5Var).getOnClickDelegate();
        }
        if (rt5Var instanceof GridItem) {
            return ((GridItem) rt5Var).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(rt5 rt5Var) {
        if (rt5Var instanceof Row) {
            return ((Row) rt5Var).getToggle();
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

    public List<rt5> getItems() {
        List<rt5> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public ds7 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public hs7 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public st5 toBuilder() {
        return new st5(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<rt5> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return uh9.l(sb, this.mSelectedIndex, "]");
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
