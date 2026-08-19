package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getValue()).compareTo(((Map.Entry) obj2).getValue());
    }
}
