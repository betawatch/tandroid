package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class ItemList {
    private final List<q> mItems;
    private final CarText mNoItemsMessage;
    private final f0 mOnItemVisibilityChangedDelegate;
    private final h0 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(r rVar) {
        this.mSelectedIndex = rVar.b;
        this.mItems = androidx.car.app.utils.i.g(rVar.a);
        this.mNoItemsMessage = rVar.e;
        this.mOnSelectedDelegate = rVar.c;
        this.mOnItemVisibilityChangedDelegate = rVar.d;
    }

    public static b0 getOnClickDelegate(q qVar) {
        if (qVar instanceof Row) {
            return ((Row) qVar).getOnClickDelegate();
        }
        if (qVar instanceof GridItem) {
            return ((GridItem) qVar).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(q qVar) {
        if (qVar instanceof Row) {
            return ((Row) qVar).getToggle();
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

    public List<q> getItems() {
        List<q> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public f0 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public h0 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public r toBuilder() {
        return new r(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ items: ");
        List<q> list = this.mItems;
        sb2.append(list != null ? list.toString() : null);
        sb2.append(", selected: ");
        return a4.a.n(this.mSelectedIndex, "]", sb2);
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
