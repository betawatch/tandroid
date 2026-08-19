package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class SmallSortedMap extends AbstractMap {
    private List entryList;
    private boolean isImmutable;
    private volatile DescendingEntrySet lazyDescendingEntrySet;
    private volatile EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map overflowEntries;
    private Map overflowEntriesDescending;

    static SmallSortedMap newFieldMap(int i) {
        return new SmallSortedMap(i) { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.1
            @Override // java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                return super.put((Comparable) null, obj2);
            }

            @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    if (getNumArrayEntries() > 0) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(getArrayEntryAt(0).getKey());
                        throw null;
                    }
                    Iterator it = getOverflowEntries().iterator();
                    if (it.hasNext()) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                }
                super.makeImmutable();
            }
        };
    }

    private SmallSortedMap(int i) {
        this.maxArraySize = i;
        this.entryList = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    public void makeImmutable() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.isImmutable) {
            return;
        }
        if (this.overflowEntries.isEmpty()) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(this.overflowEntries);
        }
        this.overflowEntries = unmodifiableMap;
        if (this.overflowEntriesDescending.isEmpty()) {
            unmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap2 = DesugarCollections.unmodifiableMap(this.overflowEntriesDescending);
        }
        this.overflowEntriesDescending = unmodifiableMap2;
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public Map.Entry getArrayEntryAt(int i) {
        return (Map.Entry) this.entryList.get(i);
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return EmptySet.iterable();
        }
        return this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return ((Entry) this.entryList.get(binarySearchInArray)).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public Object put(Comparable comparable, Object obj) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return ((Entry) this.entryList.get(binarySearchInArray)).setValue(obj);
        }
        ensureEntryArrayMutable();
        int i = -(binarySearchInArray + 1);
        if (i >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        int size = this.entryList.size();
        int i2 = this.maxArraySize;
        if (size == i2) {
            Entry entry = (Entry) this.entryList.remove(i2 - 1);
            getOverflowEntriesMutable().put(entry.getKey(), entry.getValue());
        }
        this.entryList.add(i, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeArrayEntryAt(int i) {
        checkMutable();
        Object value = ((Entry) this.entryList.remove(i)).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int binarySearchInArray(Comparable comparable) {
        int i;
        int size = this.entryList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((Entry) this.entryList.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((Entry) this.entryList.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet();
        }
        return this.lazyEntrySet;
    }

    Set descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new DescendingEntrySet();
        }
        return this.lazyDescendingEntrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof ArrayList)) {
            return;
        }
        this.entryList = new ArrayList(this.maxArraySize);
    }

    private class Entry implements Map.Entry, Comparable {
        private final Comparable key;
        private Object value;

        Entry(SmallSortedMap smallSortedMap, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        Entry(Comparable comparable, Object obj) {
            this.key = comparable;
            this.value = obj;
        }

        @Override // java.util.Map.Entry
        public Comparable getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            SmallSortedMap.this.checkMutable();
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.key;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.value;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    private class EntrySet extends AbstractSet {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }
    }

    private class DescendingEntrySet extends EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    private class EntryIterator implements Iterator {
        private Iterator lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < SmallSortedMap.this.entryList.size() || (!SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext());
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < SmallSortedMap.this.entryList.size()) {
                return (Map.Entry) SmallSortedMap.this.entryList.get(this.pos);
            }
            return (Map.Entry) getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            SmallSortedMap.this.checkMutable();
            if (this.pos < SmallSortedMap.this.entryList.size()) {
                SmallSortedMap smallSortedMap = SmallSortedMap.this;
                int i = this.pos;
                this.pos = i - 1;
                smallSortedMap.removeArrayEntryAt(i);
                return;
            }
            getOverflowIterator().remove();
        }

        private Iterator getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    private class DescendingEntryIterator implements Iterator {
        private Iterator lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = SmallSortedMap.this.entryList.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            return (i > 0 && i <= SmallSortedMap.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            if (!getOverflowIterator().hasNext()) {
                List list = SmallSortedMap.this.entryList;
                int i = this.pos - 1;
                this.pos = i;
                return (Map.Entry) list.get(i);
            }
            return (Map.Entry) getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    private static class EmptySet {
        private static final Iterator ITERATOR = new Iterator() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable ITERABLE = new Iterable() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return EmptySet.ITERATOR;
            }
        };

        static Iterable iterable() {
            return ITERABLE;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(smallSortedMap.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(smallSortedMap.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            i += ((Entry) this.entryList.get(i2)).hashCode();
        }
        return getNumOverflowEntries() > 0 ? i + this.overflowEntries.hashCode() : i;
    }
}
