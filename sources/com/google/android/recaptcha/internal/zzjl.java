package com.google.android.recaptcha.internal;

import hd.e;
import hd.f;
import java.util.Collection;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzjl implements zzjt {
    public static final zzjl zza = new zzjl();

    private zzjl() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        String g10;
        String str;
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        int i10 = 0;
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            int[] iArr = (int[]) zza2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int length = iArr.length;
            int i11 = 0;
            while (i10 < length) {
                int i12 = iArr[i10];
                i11++;
                if (i11 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i12));
                i10++;
            }
            sb2.append((CharSequence) "]");
            g10 = sb2.toString();
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, xd.a.a);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i13 = 0;
                while (i10 < length2) {
                    long j3 = jArr[i10];
                    i13++;
                    if (i13 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j3));
                    i10++;
                }
                sb3.append((CharSequence) "]");
                g10 = sb3.toString();
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i14 = 0;
                while (i10 < length3) {
                    short s5 = sArr[i10];
                    i14++;
                    if (i14 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s5));
                    i10++;
                }
                sb4.append((CharSequence) "]");
                g10 = sb4.toString();
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i15 = 0;
                while (i10 < length4) {
                    float f10 = fArr[i10];
                    i15++;
                    if (i15 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f10));
                    i10++;
                }
                sb5.append((CharSequence) "]");
                g10 = sb5.toString();
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i16 = 0;
                while (i10 < length5) {
                    double d = dArr[i10];
                    i16++;
                    if (i16 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d));
                    i10++;
                }
                sb6.append((CharSequence) "]");
                g10 = sb6.toString();
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                g10 = e.f((Object[]) zza2);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzdm(4, 5, null);
                }
                g10 = f.g((Iterable) zza2, ",", "[", "]", null, 56);
            }
            g10 = str;
        }
        zzizVar.zzc().zze(i7, g10);
    }
}
