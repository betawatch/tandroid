package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ListTemplate implements x0 {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;
    private final CarText mTitle;

    public ListTemplate(u uVar) {
        this.mIsLoading = uVar.a;
        this.mTitle = uVar.d;
        this.mHeaderAction = uVar.e;
        this.mSingleList = uVar.b;
        this.mSectionedLists = androidx.car.app.utils.j.g(uVar.c);
        this.mActionStrip = uVar.f;
        this.mActions = androidx.car.app.utils.j.g(uVar.g);
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        v vVar = new v();
        vVar.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), vVar), sectionedItemList.getHeader().toCharSequence()));
            if (vVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, v vVar) {
        r rVar = new r(itemList);
        ArrayList arrayList = rVar.a;
        arrayList.clear();
        for (q qVar : itemList.getItems()) {
            if (!(qVar instanceof ConversationItem)) {
                if (vVar.a < 1) {
                    break;
                }
                Objects.requireNonNull(qVar);
                arrayList.add(qVar);
                vVar.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) qVar;
                if (vVar.a < 2) {
                    break;
                }
                androidx.car.app.messaging.model.f fVar = new androidx.car.app.messaging.model.f(conversationItem);
                int i10 = vVar.a - 1;
                vVar.a = i10;
                int min = Math.min(i10, 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                fVar.f = conversationItem.getMessages().subList(size - min2, size);
                arrayList.add(new ConversationItem(fVar));
                vVar.a -= min2;
            }
        }
        if (rVar.c != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            int i11 = rVar.b;
            if (i11 >= size2) {
                throw new IllegalStateException("The selected item index (" + i11 + ") is larger than the size of the list (" + size2 + ")");
            }
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj = arrayList.get(i12);
                i12++;
                q qVar2 = (q) obj;
                if (ItemList.getOnClickDelegate(qVar2) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(qVar2) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(rVar);
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

    public u toBuilder() {
        return new u(this);
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
