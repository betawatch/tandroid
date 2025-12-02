package kotlin.enums;

import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class EnumEntriesList extends AbstractList implements EnumEntries, Serializable {
    private final Enum[] entries;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }

    public EnumEntriesList(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Enum get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.entries.length);
        return this.entries[i];
    }

    public boolean contains(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) ArraysKt.getOrNull(this.entries, element.ordinal())) == element;
    }

    public int indexOf(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) ArraysKt.getOrNull(this.entries, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element);
    }
}
