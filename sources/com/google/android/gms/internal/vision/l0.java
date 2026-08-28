package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l0 {
    protected int zza;

    public static void a(Iterable iterable, List list) {
        Charset charset = j1.a;
        iterable.getClass();
        if (iterable instanceof t1) {
            List zzd = ((t1) iterable).zzd();
            t1 t1Var = (t1) list;
            int size = list.size();
            for (Object obj : zzd) {
                if (obj == null) {
                    int size2 = t1Var.size() - size;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    for (int size3 = t1Var.size() - 1; size3 >= size; size3--) {
                        t1Var.remove(size3);
                    }
                    throw new NullPointerException(sb3);
                }
                if (obj instanceof q0) {
                    t1Var.m((q0) obj);
                } else {
                    t1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof i2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("Element at index ");
                sb4.append(size5);
                sb4.append(" is null.");
                String sb5 = sb4.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(sb5);
            }
            list.add(obj2);
        }
    }

    public abstract void b(int i9);

    public abstract int c();
}
