package kotlin.enums;

import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class EnumEntriesList extends AbstractList implements EnumEntries, Serializable {
    private volatile Enum[] _entries;
    private final Function0 entriesProvider;

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

    public EnumEntriesList(Function0 entriesProvider) {
        Intrinsics.checkNotNullParameter(entriesProvider, "entriesProvider");
        this.entriesProvider = entriesProvider;
    }

    private final Enum[] getEntries() {
        Enum[] enumArr = this._entries;
        if (enumArr != null) {
            return enumArr;
        }
        Enum[] enumArr2 = (Enum[]) this.entriesProvider.invoke();
        this._entries = enumArr2;
        return enumArr2;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return getEntries().length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Enum get(int i) {
        Enum[] entries = getEntries();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, entries.length);
        return entries[i];
    }

    public boolean contains(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) ArraysKt.getOrNull(getEntries(), element.ordinal())) == element;
    }

    public int indexOf(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) ArraysKt.getOrNull(getEntries(), ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element);
    }
}
