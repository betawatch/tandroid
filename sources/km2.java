// default package

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class km2 extends qm2 {
    public static final void e(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, rr4 rr4Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            ibb.a(sb, obj, rr4Var);
        }
        sb.append(charSequence3);
    }

    public static String f(Iterable iterable, String str, String str2, String str3, rr4 rr4Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            rr4Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        e(iterable, sb, str4, str5, str6, "...", rr4Var);
        return sb.toString();
    }

    public static List g(Iterable iterable, int i) {
        Object next;
        iterable.getClass();
        if (i < 0) {
            c1b.a(td4.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        n34 n34Var = n34.a;
        if (i == 0) {
            return n34Var;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return k(iterable);
            }
            if (i == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    next = list.get(0);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return lm2.a(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : lm2.a(arrayList.get(0)) : n34Var;
    }

    public static byte[] h(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void i(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] j(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List k(Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        n34 n34Var = n34.a;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                i(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : lm2.a(arrayList.get(0)) : n34Var;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return n34Var;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return lm2.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] l(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Set m(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(sk6.b(collection.size()));
                    i(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            i(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return q34.a;
    }
}
