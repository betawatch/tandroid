package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getValue()).compareTo(((Map.Entry) obj2).getValue());
    }
}
