package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.vision.e2;
import hd.g;
import hd.i;
import java.util.ArrayList;
import java.util.Iterator;
import ud.b;
import ud.e;
import w7.t7;
import xd.a;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzkp implements zzjt {
    public static final zzkp zza = new zzkp();

    private zzkp() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzdm(4, 5, null);
        }
        zzizVar.zzc().zze(i10, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                    i10++;
                }
                return g.j(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    i10 = e2.d(charArray[i10] ^ ((Number) obj2).intValue(), i10, 1, arrayList2);
                }
                return g.l(arrayList2);
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length;
            ArrayList arrayList5 = new ArrayList(length3);
            int i11 = 0;
            while (i11 < length3) {
                i11 = e2.d(iArr[i11] ^ ((Number) obj).intValue(), i11, 1, arrayList5);
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            int length4 = jArr.length;
            ArrayList arrayList6 = new ArrayList(length4);
            int i12 = 0;
            while (i12 < length4) {
                i12 = e2.f(jArr[i12] ^ ((Number) obj).longValue(), arrayList6, i12, 1);
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z14 = obj instanceof byte[];
        if (z14 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z15 = obj instanceof short[];
        if (z15 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z16 = obj instanceof int[];
        if (z16 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length5 = iArr2.length;
            ArrayList arrayList9 = new ArrayList(length5);
            int i13 = 0;
            while (i13 < length5) {
                i13 = e2.d(iArr2[i13] ^ ((Number) obj2).intValue(), i13, 1, arrayList9);
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof long[];
        if (z17 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            int length6 = jArr2.length;
            ArrayList arrayList10 = new ArrayList(length6);
            int i14 = 0;
            while (i14 < length6) {
                i14 = e2.f(jArr2[i14] ^ ((Number) obj2).longValue(), arrayList10, i14, 1);
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length7 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzjs.zza(this, length7, bArr4.length);
            e a2 = t7.a(0, length7);
            ArrayList arrayList11 = new ArrayList(i.d(a2));
            Iterator it = a2.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.d) {
                    return arrayList11.toArray(new Byte[0]);
                }
                int nextInt = bVar.nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[nextInt] ^ bArr3[nextInt])));
            }
        } else if (z15 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length8 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzjs.zza(this, length8, sArr4.length);
            e a10 = t7.a(0, length8);
            ArrayList arrayList12 = new ArrayList(i.d(a10));
            Iterator it2 = a10.iterator();
            while (true) {
                b bVar2 = (b) it2;
                if (!bVar2.d) {
                    return arrayList12.toArray(new Short[0]);
                }
                int nextInt2 = bVar2.nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[nextInt2] ^ sArr3[nextInt2])));
            }
        } else if (z16 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length9 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzjs.zza(this, length9, iArr4.length);
            e a11 = t7.a(0, length9);
            ArrayList arrayList13 = new ArrayList(i.d(a11));
            Iterator it3 = a11.iterator();
            while (true) {
                b bVar3 = (b) it3;
                if (!bVar3.d) {
                    return arrayList13.toArray(new Integer[0]);
                }
                int nextInt3 = bVar3.nextInt();
                arrayList13.add(Integer.valueOf(iArr4[nextInt3] ^ iArr3[nextInt3]));
            }
        } else {
            if (!z17 || !(obj2 instanceof long[])) {
                throw new zzdm(4, 5, null);
            }
            long[] jArr3 = (long[]) obj;
            int length10 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzjs.zza(this, length10, jArr4.length);
            e a12 = t7.a(0, length10);
            ArrayList arrayList14 = new ArrayList(i.d(a12));
            Iterator it4 = a12.iterator();
            while (true) {
                b bVar4 = (b) it4;
                if (!bVar4.d) {
                    return arrayList14.toArray(new Long[0]);
                }
                int nextInt4 = bVar4.nextInt();
                arrayList14.add(Long.valueOf(jArr3[nextInt4] ^ jArr4[nextInt4]));
            }
        }
    }
}
