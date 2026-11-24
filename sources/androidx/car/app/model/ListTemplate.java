package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ListTemplate implements pib {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;
    private final CarText mTitle;

    public ListTemplate(p76 p76Var) {
        this.mIsLoading = p76Var.a;
        this.mTitle = p76Var.d;
        this.mHeaderAction = p76Var.e;
        this.mSingleList = p76Var.b;
        this.mSectionedLists = ttd.a(p76Var.c);
        this.mActionStrip = p76Var.f;
        this.mActions = ttd.a(p76Var.g);
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        q76 q76Var = new q76();
        q76Var.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), q76Var), sectionedItemList.getHeader().toCharSequence()));
            if (q76Var.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, q76 q76Var) {
        pt5 pt5Var = new pt5(itemList);
        ArrayList arrayList = pt5Var.a;
        arrayList.clear();
        for (ot5 ot5Var : itemList.getItems()) {
            if (!(ot5Var instanceof ConversationItem)) {
                if (q76Var.a < 1) {
                    break;
                }
                Objects.requireNonNull(ot5Var);
                arrayList.add(ot5Var);
                q76Var.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) ot5Var;
                if (q76Var.a < 2) {
                    break;
                }
                tx2 tx2Var = new tx2(conversationItem);
                int i = q76Var.a - 1;
                q76Var.a = i;
                int min = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                tx2Var.f = conversationItem.getMessages().subList(size - min2, size);
                arrayList.add(new ConversationItem(tx2Var));
                q76Var.a -= min2;
            }
        }
        if (pt5Var.c != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                dq9.m("A selectable list cannot be empty");
                return null;
            }
            int i2 = pt5Var.b;
            if (i2 >= size2) {
                throw new IllegalStateException("The selected item index (" + i2 + ") is larger than the size of the list (" + size2 + ")");
            }
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                ot5 ot5Var2 = (ot5) obj;
                if (ItemList.getOnClickDelegate(ot5Var2) != null) {
                    dq9.m("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    return null;
                }
                if (ItemList.getToggle(ot5Var2) != null) {
                    dq9.m("Items that belong to selectable lists can't have a toggle");
                    return null;
                }
            }
        }
        return new ItemList(pt5Var);
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

    public p76 toBuilder() {
        return new p76(this);
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
