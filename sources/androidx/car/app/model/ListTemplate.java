package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ListTemplate implements ogb {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;
    private final CarText mTitle;

    public ListTemplate(p56 p56Var) {
        this.mIsLoading = p56Var.a;
        this.mTitle = p56Var.d;
        this.mHeaderAction = p56Var.e;
        this.mSingleList = p56Var.b;
        this.mSectionedLists = qrd.a(p56Var.c);
        this.mActionStrip = p56Var.f;
        this.mActions = qrd.a(p56Var.g);
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        q56 q56Var = new q56();
        q56Var.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), q56Var), sectionedItemList.getHeader().toCharSequence()));
            if (q56Var.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, q56 q56Var) {
        qr5 qr5Var = new qr5(itemList);
        ArrayList arrayList = qr5Var.a;
        arrayList.clear();
        for (pr5 pr5Var : itemList.getItems()) {
            if (!(pr5Var instanceof ConversationItem)) {
                if (q56Var.a < 1) {
                    break;
                }
                Objects.requireNonNull(pr5Var);
                arrayList.add(pr5Var);
                q56Var.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) pr5Var;
                if (q56Var.a < 2) {
                    break;
                }
                jw2 jw2Var = new jw2(conversationItem);
                int i = q56Var.a - 1;
                q56Var.a = i;
                int min = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                jw2Var.f = conversationItem.getMessages().subList(size - min2, size);
                arrayList.add(new ConversationItem(jw2Var));
                q56Var.a -= min2;
            }
        }
        if (qr5Var.c != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                sc8.j("A selectable list cannot be empty");
                return null;
            }
            int i2 = qr5Var.b;
            if (i2 >= size2) {
                throw new IllegalStateException("The selected item index (" + i2 + ") is larger than the size of the list (" + size2 + ")");
            }
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                pr5 pr5Var2 = (pr5) obj;
                if (ItemList.getOnClickDelegate(pr5Var2) != null) {
                    sc8.j("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    return null;
                }
                if (ItemList.getToggle(pr5Var2) != null) {
                    sc8.j("Items that belong to selectable lists can't have a toggle");
                    return null;
                }
            }
        }
        return new ItemList(qr5Var);
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

    public p56 toBuilder() {
        return new p56(this);
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
