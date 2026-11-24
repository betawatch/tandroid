// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class g31 implements aq4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ g31(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d6  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    @Override // aq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f;
        int i;
        String str;
        float f2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        w59 f3;
        w59 b;
        byte b2 = 18;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                return ((j74) obj).a().getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(u33.s);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(u33.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = parcelableArrayList.get(i6);
                            i6++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i7 = bundle2.getInt(w43.a);
                            int i8 = bundle2.getInt(w43.b);
                            int i9 = bundle2.getInt(w43.c);
                            int i10 = bundle2.getInt(w43.d, -1);
                            Bundle bundle3 = bundle2.getBundle(w43.e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(co9.c);
                                string.getClass();
                                charSequence2.setSpan(new co9(string, bundle3.getInt(co9.d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new khb(bundle3.getInt(khb.d), bundle3.getInt(khb.e), bundle3.getInt(khb.f)), i7, i8, i9);
                            } else if (i10 == 3) {
                                charSequence2.setSpan(new yf5(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(njc.b);
                                string2.getClass();
                                charSequence2.setSpan(new njc(string2), i7, i8, i9);
                            }
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(u33.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(u33.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(u33.w);
                if (bitmap2 == null) {
                    byte[] byteArray = bundle.getByteArray(u33.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = u33.y;
                        containsKey = bundle.containsKey(str4);
                        int i11 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str5 = u33.z;
                            if (bundle.containsKey(str5)) {
                                f = bundle.getFloat(str4);
                                i = bundle.getInt(str5);
                                String str6 = u33.A;
                                int i12 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = u33.B;
                                float f4 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = u33.C;
                                int i13 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = u33.E;
                                if (bundle.containsKey(str)) {
                                    String str9 = u33.D;
                                    if (bundle.containsKey(str9)) {
                                        f2 = bundle.getFloat(str);
                                        i2 = bundle.getInt(str9);
                                        String str10 = u33.F;
                                        float f5 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = u33.G;
                                        float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = u33.H;
                                        if (bundle.containsKey(str2)) {
                                            i3 = -16777216;
                                            b3 = 0;
                                        } else {
                                            i3 = bundle.getInt(str2);
                                        }
                                        int i14 = i3;
                                        ?? r30 = bundle.getBoolean(u33.I, false) ? 0 : b3;
                                        str3 = u33.J;
                                        if (bundle.containsKey(str3)) {
                                            i11 = bundle.getInt(str3);
                                        }
                                        int i15 = i11;
                                        String str12 = u33.K;
                                        float f7 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = u33.L;
                                        return new u33(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6, r30, i14, i15, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f2 = -3.4028235E38f;
                                i2 = Integer.MIN_VALUE;
                                String str102 = u33.F;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = u33.G;
                                float f62 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = u33.H;
                                if (bundle.containsKey(str2)) {
                                }
                                int i142 = i3;
                                if (bundle.getBoolean(u33.I, false)) {
                                }
                                str3 = u33.J;
                                if (bundle.containsKey(str3)) {
                                }
                                int i152 = i11;
                                String str122 = u33.K;
                                if (!bundle.containsKey(str122)) {
                                }
                                String str132 = u33.L;
                                return new u33(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f62, r30, i142, i152, f7, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                        String str62 = u33.A;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = u33.B;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = u33.C;
                        if (bundle.containsKey(str82)) {
                        }
                        str = u33.E;
                        if (bundle.containsKey(str)) {
                        }
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                        String str1022 = u33.F;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = u33.G;
                        float f622 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = u33.H;
                        if (bundle.containsKey(str2)) {
                        }
                        int i1422 = i3;
                        if (bundle.getBoolean(u33.I, false)) {
                        }
                        str3 = u33.J;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1522 = i11;
                        String str1222 = u33.K;
                        if (!bundle.containsKey(str1222)) {
                        }
                        String str1322 = u33.L;
                        return new u33(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f622, r30, i1422, i1522, f7, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                bitmap = bitmap2;
                charSequence = null;
                String str42 = u33.y;
                containsKey = bundle.containsKey(str42);
                int i112 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
                String str622 = u33.A;
                if (bundle.containsKey(str622)) {
                }
                String str722 = u33.B;
                if (bundle.containsKey(str722)) {
                }
                String str822 = u33.C;
                if (bundle.containsKey(str822)) {
                }
                str = u33.E;
                if (bundle.containsKey(str)) {
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str10222 = u33.F;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = u33.G;
                float f6222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = u33.H;
                if (bundle.containsKey(str2)) {
                }
                int i14222 = i3;
                if (bundle.getBoolean(u33.I, false)) {
                }
                str3 = u33.J;
                if (bundle.containsKey(str3)) {
                }
                int i15222 = i112;
                String str12222 = u33.K;
                if (!bundle.containsKey(str12222)) {
                }
                String str13222 = u33.L;
                return new u33(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6222, r30, i14222, i15222, f7, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 2:
                return Integer.valueOf(((u33) obj).r);
            case 3:
                long j = ((x33) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 4:
                return mm5.u(Integer.valueOf(((eh2) obj).a));
            case 5:
                txb txbVar = (txb) obj;
                txbVar.getClass();
                Bundle bundle4 = new Bundle();
                String str14 = txb.e;
                w59 w59Var = txbVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(w59Var.d);
                km5 listIterator = w59Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((sxb) listIterator.next()).c());
                }
                bundle4.putParcelableArrayList(str14, arrayList);
                return bundle4;
            case 6:
                return new l93((adb) obj);
            case 7:
                sw5 sw5Var = (sw5) obj;
                return sw5Var.a + ": " + sw5Var.b;
            case 8:
                tf5 tf5Var = (tf5) obj;
                tf5Var.b();
                return mm5.q(tne.b(tf5Var.Z.b, new g31(b2)));
            case 9:
                t8b t8bVar = (t8b) obj;
                t8bVar.getClass();
                Bundle bundle5 = new Bundle();
                int i16 = t8bVar.a;
                if (i16 != 0) {
                    bundle5.putInt(t8b.d, i16);
                }
                int i17 = t8bVar.b;
                if (i17 != 0) {
                    bundle5.putInt(t8b.e, i17);
                }
                int i18 = t8bVar.c;
                if (i18 != 0) {
                    bundle5.putInt(t8b.f, i18);
                }
                return bundle5;
            case 10:
                ar6 ar6Var = (ar6) obj;
                ar6Var.getClass();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable(ar6.h, ar6Var.a);
                String str15 = ar6Var.b;
                if (str15 != null) {
                    bundle6.putString(ar6.i, str15);
                }
                String str16 = ar6Var.c;
                if (str16 != null) {
                    bundle6.putString(ar6.j, str16);
                }
                int i19 = ar6Var.d;
                if (i19 != 0) {
                    bundle6.putInt(ar6.k, i19);
                }
                int i20 = ar6Var.e;
                if (i20 != 0) {
                    bundle6.putInt(ar6.l, i20);
                }
                String str17 = ar6Var.f;
                if (str17 != null) {
                    bundle6.putString(ar6.m, str17);
                }
                String str18 = ar6Var.g;
                if (str18 != null) {
                    bundle6.putString(ar6.n, str18);
                }
                return bundle6;
            case 11:
                Bundle bundle7 = (Bundle) obj;
                Uri uri = (Uri) bundle7.getParcelable(ar6.h);
                uri.getClass();
                String string3 = bundle7.getString(ar6.i);
                String string4 = bundle7.getString(ar6.j);
                int i21 = bundle7.getInt(ar6.k, 0);
                int i22 = bundle7.getInt(ar6.l, 0);
                String string5 = bundle7.getString(ar6.m);
                String string6 = bundle7.getString(ar6.n);
                r75 r75Var = new r75();
                r75Var.c = uri;
                r75Var.d = ud7.n(string3);
                r75Var.e = string4;
                r75Var.a = i21;
                r75Var.b = i22;
                r75Var.f = string5;
                r75Var.g = string6;
                return new ar6(r75Var);
            case 12:
                String str19 = (String) obj;
                pj1 pj1Var = hy6.g;
                pj1Var.getClass();
                int length = str19.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (pj1Var.b(str19.charAt(length))) {
                            length--;
                        } else {
                            b3 = 0;
                        }
                    }
                }
                if (b3 != 0 && !str19.isEmpty()) {
                    return str19;
                }
                StringBuilder sb = new StringBuilder(str19.length() + 16);
                sb.append('\"');
                while (r6 < str19.length()) {
                    char charAt = str19.charAt(r6);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                    r6++;
                }
                sb.append('\"');
                return sb.toString();
            case 13:
                Collection collection = (Collection) obj;
                int i23 = wm5.d;
                if (collection instanceof wm5) {
                    return (wm5) collection;
                }
                boolean z = collection instanceof wm5;
                if (z) {
                    c69 c69Var = (c69) ((wm5) collection);
                    vm5 vm5Var = c69Var.h;
                    if (vm5Var == null) {
                        vm5Var = new vm5(c69Var, b3);
                        c69Var.h = vm5Var;
                    }
                    i4 = vm5Var.size();
                } else {
                    i4 = 11;
                }
                um5 um5Var = new um5();
                um5Var.b = false;
                wn7 wn7Var = new wn7();
                wn7Var.d(i4);
                um5Var.a = wn7Var;
                if (z) {
                    wm5 wm5Var = (wm5) collection;
                    wn7 wn7Var2 = wm5Var instanceof c69 ? ((c69) wm5Var).e : null;
                    if (wn7Var2 != null) {
                        wn7Var.a(Math.max(wn7Var.c, wn7Var2.c));
                        if (wn7Var2.c != 0) {
                            i5 = -1;
                            while (i5 >= 0) {
                                gre.j(i5, wn7Var2.c);
                                Object obj3 = wn7Var2.a[i5];
                                gre.j(i5, wn7Var2.c);
                                um5Var.c(wn7Var2.b[i5], obj3);
                                i5++;
                                if (i5 >= wn7Var2.c) {
                                }
                            }
                        }
                        i5 = -1;
                    } else {
                        ym5 o = wm5Var.o();
                        wn7 wn7Var3 = um5Var.a;
                        wn7Var3.a(Math.max(wn7Var3.c, o.size()));
                        for (vn7 vn7Var : wm5Var.o()) {
                            um5Var.c(vn7Var.a(), vn7Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        um5Var.a(it.next());
                    }
                }
                Objects.requireNonNull(um5Var.a);
                if (um5Var.a.c == 0) {
                    return c69.n;
                }
                um5Var.b = true;
                return new c69(um5Var.a);
            case 14:
                return Long.valueOf(((x33) obj).b);
            case 15:
                return Long.valueOf(((x33) obj).c);
            case 16:
                return mm5.q(tne.b(((sr6) obj).q().b, new g31(b2)));
            case 17:
                Bundle bundle8 = (Bundle) obj;
                fm4 fm4Var = fm4.Z;
                em4 em4Var = new em4();
                if (bundle8 != null) {
                    ClassLoader classLoader = v21.class.getClassLoader();
                    String str20 = g8c.a;
                    bundle8.setClassLoader(classLoader);
                }
                String string7 = bundle8.getString(fm4.a0);
                String str21 = fm4Var.a;
                if (string7 == null) {
                    string7 = str21;
                }
                em4Var.a = string7;
                String string8 = bundle8.getString(fm4.b0);
                String str22 = fm4Var.b;
                if (string8 == null) {
                    string8 = str22;
                }
                em4Var.b = string8;
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(fm4.F0);
                if (parcelableArrayList2 == null) {
                    km5 km5Var = mm5.b;
                    f3 = w59.e;
                } else {
                    jm5 p = mm5.p();
                    for (int i24 = 0; i24 < parcelableArrayList2.size(); i24++) {
                        Bundle bundle9 = (Bundle) parcelableArrayList2.get(i24);
                        bundle9.getClass();
                        String string9 = bundle9.getString(sw5.c);
                        String string10 = bundle9.getString(sw5.d);
                        string10.getClass();
                        p.c(new sw5(string9, string10));
                    }
                    f3 = p.f();
                }
                em4Var.c = mm5.q(f3);
                String string11 = bundle8.getString(fm4.c0);
                String str23 = fm4Var.d;
                if (string11 == null) {
                    string11 = str23;
                }
                em4Var.d = string11;
                em4Var.e = bundle8.getInt(fm4.d0, fm4Var.e);
                em4Var.f = bundle8.getInt(fm4.e0, fm4Var.f);
                em4Var.g = bundle8.getFloat(fm4.O0, fm4Var.g);
                em4Var.h = bundle8.getInt(fm4.G0, fm4Var.h);
                em4Var.i = bundle8.getInt(fm4.f0, fm4Var.i);
                em4Var.j = bundle8.getInt(fm4.g0, fm4Var.j);
                String string12 = bundle8.getString(fm4.h0);
                String str24 = fm4Var.l;
                if (string12 == null) {
                    string12 = str24;
                }
                em4Var.k = string12;
                String string13 = bundle8.getString(fm4.K0);
                String str25 = fm4Var.n;
                if (string13 == null) {
                    string13 = str25;
                }
                em4Var.m = string13;
                String string14 = bundle8.getString(fm4.i0);
                String str26 = fm4Var.s;
                if (string14 == null) {
                    string14 = str26;
                }
                em4Var.r = ud7.n(string14);
                String string15 = bundle8.getString(fm4.j0);
                String str27 = fm4Var.t;
                if (string15 == null) {
                    string15 = str27;
                }
                em4Var.s = ud7.n(string15);
                em4Var.t = bundle8.getInt(fm4.k0, fm4Var.u);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray2 = bundle8.getByteArray(fm4.l0 + "_" + Integer.toString(r6, 36));
                    if (byteArray2 == null) {
                        float f8 = bundle8.getFloat(fm4.q0, fm4Var.F);
                        if (f8 <= 0.0f) {
                            f8 = -1.0f;
                        }
                        em4Var.v = arrayList2;
                        em4Var.w = (qq3) bundle8.getParcelable(fm4.m0);
                        em4Var.x = bundle8.getLong(fm4.n0, fm4Var.y);
                        em4Var.z = bundle8.getInt(fm4.o0, fm4Var.A);
                        em4Var.A = bundle8.getInt(fm4.p0, fm4Var.B);
                        em4Var.B = bundle8.getInt(fm4.N0, fm4Var.C);
                        em4Var.C = bundle8.getInt(fm4.I0, fm4Var.D);
                        em4Var.D = bundle8.getInt(fm4.J0, fm4Var.E);
                        em4Var.a(f8);
                        em4Var.F = bundle8.getInt(fm4.r0, fm4Var.G);
                        em4Var.G = bundle8.getBoolean(fm4.M0, fm4Var.H);
                        em4Var.H = bundle8.getFloat(fm4.s0, fm4Var.I);
                        em4Var.I = bundle8.getByteArray(fm4.t0);
                        em4Var.J = bundle8.getInt(fm4.u0, fm4Var.K);
                        em4Var.L = bundle8.getInt(fm4.H0, fm4Var.M);
                        Bundle bundle10 = bundle8.getBundle(fm4.v0);
                        if (bundle10 != null) {
                            em4Var.K = new hl2(bundle10.getInt(hl2.i, -1), bundle10.getInt(hl2.j, -1), bundle10.getInt(hl2.k, -1), bundle10.getByteArray(hl2.l), bundle10.getInt(hl2.m, -1), bundle10.getInt(hl2.n, -1));
                        }
                        em4Var.M = bundle8.getInt(fm4.w0, fm4Var.N);
                        em4Var.N = bundle8.getInt(fm4.L0, fm4Var.O);
                        em4Var.O = bundle8.getInt(fm4.x0, fm4Var.P);
                        em4Var.P = bundle8.getInt(fm4.y0, fm4Var.Q);
                        em4Var.Q = bundle8.getInt(fm4.z0, fm4Var.R);
                        em4Var.R = bundle8.getInt(fm4.A0, fm4Var.S);
                        em4Var.S = bundle8.getInt(fm4.B0, fm4Var.T);
                        em4Var.U = bundle8.getInt(fm4.D0, fm4Var.V);
                        em4Var.V = bundle8.getInt(fm4.E0, fm4Var.W);
                        em4Var.W = bundle8.getInt(fm4.C0, fm4Var.X);
                        return new fm4(em4Var);
                    }
                    arrayList2.add(byteArray2);
                    r6++;
                }
            case 18:
                return Integer.valueOf(((sxb) obj).c);
            case 19:
                Bundle bundle11 = (Bundle) obj;
                Bundle bundle12 = bundle11.getBundle(yxb.c);
                bundle12.getClass();
                ArrayList parcelableArrayList3 = bundle12.getParcelableArrayList(sxb.f);
                if (parcelableArrayList3 == null) {
                    km5 km5Var2 = mm5.b;
                    b = w59.e;
                } else {
                    b = v21.b(new g31((byte) 17), parcelableArrayList3);
                }
                sxb sxbVar = new sxb(bundle12.getString(sxb.g, ""), (fm4[]) b.toArray(new fm4[0]));
                int[] intArray = bundle11.getIntArray(yxb.d);
                intArray.getClass();
                return new yxb(sxbVar, gle.a(intArray));
            default:
                dyb dybVar = (dyb) obj;
                dybVar.getClass();
                Bundle bundle13 = new Bundle();
                bundle13.putBundle(dyb.f, dybVar.b.c());
                bundle13.putIntArray(dyb.g, dybVar.d);
                bundle13.putBooleanArray(dyb.h, dybVar.e);
                bundle13.putBoolean(dyb.i, dybVar.c);
                return bundle13;
        }
    }
}
