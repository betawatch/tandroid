package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ItemList {
    private final List<pr5> mItems;
    private final CarText mNoItemsMessage;
    private final dp7 mOnItemVisibilityChangedDelegate;
    private final hp7 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(qr5 qr5Var) {
        this.mSelectedIndex = qr5Var.b;
        this.mItems = qrd.a(qr5Var.a);
        this.mNoItemsMessage = qr5Var.e;
        this.mOnSelectedDelegate = qr5Var.c;
        this.mOnItemVisibilityChangedDelegate = qr5Var.d;
    }

    public static yo7 getOnClickDelegate(pr5 pr5Var) {
        if (pr5Var instanceof Row) {
            return ((Row) pr5Var).getOnClickDelegate();
        }
        if (pr5Var instanceof GridItem) {
            return ((GridItem) pr5Var).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(pr5 pr5Var) {
        if (pr5Var instanceof Row) {
            return ((Row) pr5Var).getToggle();
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

    public List<pr5> getItems() {
        List<pr5> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public dp7 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public hp7 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public qr5 toBuilder() {
        return new qr5(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<pr5> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return de9.l(sb, this.mSelectedIndex, "]");
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
