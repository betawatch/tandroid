package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ListTemplate implements kkb {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;
    private final CarText mTitle;

    public ListTemplate(t76 t76Var) {
        this.mIsLoading = t76Var.a;
        this.mTitle = t76Var.d;
        this.mHeaderAction = t76Var.e;
        this.mSingleList = t76Var.b;
        this.mSectionedLists = gwd.a(t76Var.c);
        this.mActionStrip = t76Var.f;
        this.mActions = gwd.a(t76Var.g);
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        u76 u76Var = new u76();
        u76Var.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), u76Var), sectionedItemList.getHeader().toCharSequence()));
            if (u76Var.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, u76 u76Var) {
        st5 st5Var = new st5(itemList);
        ArrayList arrayList = st5Var.a;
        arrayList.clear();
        for (rt5 rt5Var : itemList.getItems()) {
            if (!(rt5Var instanceof ConversationItem)) {
                if (u76Var.a < 1) {
                    break;
                }
                Objects.requireNonNull(rt5Var);
                arrayList.add(rt5Var);
                u76Var.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) rt5Var;
                if (u76Var.a < 2) {
                    break;
                }
                dx2 dx2Var = new dx2(conversationItem);
                int i = u76Var.a - 1;
                u76Var.a = i;
                int min = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                dx2Var.f = conversationItem.getMessages().subList(size - min2, size);
                arrayList.add(new ConversationItem(dx2Var));
                u76Var.a -= min2;
            }
        }
        if (st5Var.c != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                grb.i("A selectable list cannot be empty");
                return null;
            }
            int i2 = st5Var.b;
            if (i2 >= size2) {
                throw new IllegalStateException("The selected item index (" + i2 + ") is larger than the size of the list (" + size2 + ")");
            }
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                rt5 rt5Var2 = (rt5) obj;
                if (ItemList.getOnClickDelegate(rt5Var2) != null) {
                    grb.i("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    return null;
                }
                if (ItemList.getToggle(rt5Var2) != null) {
                    grb.i("Items that belong to selectable lists can't have a toggle");
                    return null;
                }
            }
        }
        return new ItemList(st5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public t76 toBuilder() {
        return new t76(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
    }
}
