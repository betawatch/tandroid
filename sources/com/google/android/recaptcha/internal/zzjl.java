package com.google.android.recaptcha.internal;

import java.util.Collection;
import jd.a;
import tc.f;
import tc.g;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                i12++;
                if (i12 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i13));
                i11++;
            }
            sb.append((CharSequence) "]");
            h = sb.toString();
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, a.a);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i14 = 0;
                while (i11 < length2) {
                    long j10 = jArr[i11];
                    i14++;
                    if (i14 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j10));
                    i11++;
                }
                sb2.append((CharSequence) "]");
                h = sb2.toString();
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i15 = 0;
                while (i11 < length3) {
                    short s6 = sArr[i11];
                    i15++;
                    if (i15 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s6));
                    i11++;
                }
                sb3.append((CharSequence) "]");
                h = sb3.toString();
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i16 = 0;
                while (i11 < length4) {
                    float f10 = fArr[i11];
                    i16++;
                    if (i16 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f10));
                    i11++;
                }
                sb4.append((CharSequence) "]");
                h = sb4.toString();
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i17 = 0;
                while (i11 < length5) {
                    double d = dArr[i11];
                    i17++;
                    if (i17 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d));
                    i11++;
                }
                sb5.append((CharSequence) "]");
                h = sb5.toString();
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
