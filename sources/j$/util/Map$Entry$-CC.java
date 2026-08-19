package j$.util;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class Map$Entry$-CC {
    public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue() {
        return new y();
    }
}
