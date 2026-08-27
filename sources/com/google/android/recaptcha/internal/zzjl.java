package com.google.android.recaptcha.internal;

import java.util.Collection;
import qc.f;
import qc.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzjl implements zzjt {
    public static final zzjl zza = new zzjl();

    private zzjl() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        String h;
        String str;
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        int i11 = 0;
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
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                i12++;
                if (i12 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i13));
                i11++;
            }
            sb2.append((CharSequence) "]");
            h = sb2.toString();
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, gd.a.a);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i14 = 0;
                while (i11 < length2) {
                    long j10 = jArr[i11];
                    i14++;
                    if (i14 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j10));
                    i11++;
                }
                sb3.append((CharSequence) "]");
                h = sb3.toString();
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i15 = 0;
                while (i11 < length3) {
                    short s10 = sArr[i11];
                    i15++;
                    if (i15 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s10));
                    i11++;
                }
                sb4.append((CharSequence) "]");
                h = sb4.toString();
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i16 = 0;
                while (i11 < length4) {
                    float f10 = fArr[i11];
                    i16++;
                    if (i16 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f10));
                    i11++;
                }
                sb5.append((CharSequence) "]");
                h = sb5.toString();
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i17 = 0;
                while (i11 < length5) {
                    double d = dArr[i11];
                    i17++;
                    if (i17 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d));
                    i11++;
                }
                sb6.append((CharSequence) "]");
                h = sb6.toString();
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                h = f.f((Object[]) zza2);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzdm(4, 5, null);
                }
                h = g.h((Iterable) zza2, ",", "[", "]", null, 56);
            }
            h = str;
        }
        zzizVar.zzc().zze(i10, h);
    }
}
