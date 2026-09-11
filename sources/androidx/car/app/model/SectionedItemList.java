package androidx.car.app.model;

import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class SectionedItemList {
    private final CarText mHeader;
    private final ItemList mItemList;

    private SectionedItemList(ItemList itemList, CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }

    public static SectionedItemList create(ItemList itemList, CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        CarText create = CarText.create(charSequence);
        t.c cVar = t.c.b;
        cVar.getClass();
        cVar.a(create.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = create.getSpansForVariants().iterator();
        while (it.hasNext()) {
            cVar.a(it.next());
        }
        Objects.requireNonNull(itemList);
        return new SectionedItemList(itemList, create);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    public CarText getHeader() {
        CarText carText = this.mHeader;
        Objects.requireNonNull(carText);
        return carText;
    }

    public ItemList getItemList() {
        ItemList itemList = this.mItemList;
        Objects.requireNonNull(itemList);
        return itemList;
    }

    public int hashCode() {
        return Objects.hash(this.mItemList, this.mHeader);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ items: ");
        sb2.append(this.mItemList);
        sb2.append(", has header: ");
        sb2.append(this.mHeader != null);
        sb2.append("]");
        return sb2.toString();
    }

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }
}
