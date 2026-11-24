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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class o41 implements bs4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ o41(byte b) {
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
    @Override // bs4
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
        y79 f3;
        y79 b;
        byte b2 = 18;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                return ((s84) obj).a().getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(f53.s);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(f53.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = parcelableArrayList.get(i6);
                            i6++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i7 = bundle2.getInt(h63.a);
                            int i8 = bundle2.getInt(h63.b);
                            int i9 = bundle2.getInt(h63.c);
                            int i10 = bundle2.getInt(h63.d, -1);
                            Bundle bundle3 = bundle2.getBundle(h63.e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(eq9.c);
                                string.getClass();
                                charSequence2.setSpan(new eq9(string, bundle3.getInt(eq9.d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new ljb(bundle3.getInt(ljb.d), bundle3.getInt(ljb.e), bundle3.getInt(ljb.f)), i7, i8, i9);
                            } else if (i10 == 3) {
                                charSequence2.setSpan(new xh5(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(nlc.b);
                                string2.getClass();
                                charSequence2.setSpan(new nlc(string2), i7, i8, i9);
                            }
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f53.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(f53.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(f53.w);
                if (bitmap2 == null) {
                    byte[] byteArray = bundle.getByteArray(f53.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = f53.y;
                        containsKey = bundle.containsKey(str4);
                        int i11 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str5 = f53.z;
                            if (bundle.containsKey(str5)) {
                                f = bundle.getFloat(str4);
                                i = bundle.getInt(str5);
                                String str6 = f53.A;
                                int i12 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = f53.B;
                                float f4 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = f53.C;
                                int i13 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = f53.E;
                                if (bundle.containsKey(str)) {
                                    String str9 = f53.D;
                                    if (bundle.containsKey(str9)) {
                                        f2 = bundle.getFloat(str);
                                        i2 = bundle.getInt(str9);
                                        String str10 = f53.F;
                                        float f5 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = f53.G;
                                        float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = f53.H;
                                        if (bundle.containsKey(str2)) {
                                            i3 = -16777216;
                                            b3 = 0;
                                        } else {
                                            i3 = bundle.getInt(str2);
                                        }
                                        int i14 = i3;
                                        ?? r30 = bundle.getBoolean(f53.I, false) ? 0 : b3;
                                        str3 = f53.J;
                                        if (bundle.containsKey(str3)) {
                                            i11 = bundle.getInt(str3);
                                        }
                                        int i15 = i11;
                                        String str12 = f53.K;
                                        float f7 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = f53.L;
                                        return new f53(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6, r30, i14, i15, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f2 = -3.4028235E38f;
                                i2 = Integer.MIN_VALUE;
                                String str102 = f53.F;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = f53.G;
                                float f62 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = f53.H;
                                if (bundle.containsKey(str2)) {
                                }
                                int i142 = i3;
                                if (bundle.getBoolean(f53.I, false)) {
                                }
                                str3 = f53.J;
                                if (bundle.containsKey(str3)) {
                                }
                                int i152 = i11;
                                String str122 = f53.K;
                                if (!bundle.containsKey(str122)) {
                                }
                                String str132 = f53.L;
                                return new f53(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f62, r30, i142, i152, f7, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                        String str62 = f53.A;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = f53.B;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = f53.C;
                        if (bundle.containsKey(str82)) {
                        }
                        str = f53.E;
                        if (bundle.containsKey(str)) {
                        }
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                        String str1022 = f53.F;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = f53.G;
                        float f622 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = f53.H;
                        if (bundle.containsKey(str2)) {
                        }
                        int i1422 = i3;
                        if (bundle.getBoolean(f53.I, false)) {
                        }
                        str3 = f53.J;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1522 = i11;
                        String str1222 = f53.K;
                        if (!bundle.containsKey(str1222)) {
                        }
                        String str1322 = f53.L;
                        return new f53(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f622, r30, i1422, i1522, f7, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                bitmap = bitmap2;
                charSequence = null;
                String str42 = f53.y;
                containsKey = bundle.containsKey(str42);
                int i112 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
                String str622 = f53.A;
                if (bundle.containsKey(str622)) {
                }
                String str722 = f53.B;
                if (bundle.containsKey(str722)) {
                }
                String str822 = f53.C;
                if (bundle.containsKey(str822)) {
                }
                str = f53.E;
                if (bundle.containsKey(str)) {
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str10222 = f53.F;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = f53.G;
                float f6222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = f53.H;
                if (bundle.containsKey(str2)) {
                }
                int i14222 = i3;
                if (bundle.getBoolean(f53.I, false)) {
                }
                str3 = f53.J;
                if (bundle.containsKey(str3)) {
                }
                int i15222 = i112;
                String str12222 = f53.K;
                if (!bundle.containsKey(str12222)) {
                }
                String str13222 = f53.L;
                return new f53(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6222, r30, i14222, i15222, f7, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 2:
                return Integer.valueOf(((f53) obj).r);
            case 3:
                long j = ((i53) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 4:
                return mo5.u(Integer.valueOf(((si2) obj).a));
            case 5:
                vzb vzbVar = (vzb) obj;
                vzbVar.getClass();
                Bundle bundle4 = new Bundle();
                String str14 = vzb.e;
                y79 y79Var = vzbVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(y79Var.d);
                ko5 listIterator = y79Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((uzb) listIterator.next()).c());
                }
                bundle4.putParcelableArrayList(str14, arrayList);
                return bundle4;
            case 6:
                return new xa3((bfb) obj);
            case 7:
                sy5 sy5Var = (sy5) obj;
                return sy5Var.a + ": " + sy5Var.b;
            case 8:
                sh5 sh5Var = (sh5) obj;
                sh5Var.d();
                return mo5.q(wpe.b(sh5Var.Z.b, new o41(b2)));
            case 9:
                vab vabVar = (vab) obj;
                vabVar.getClass();
                Bundle bundle5 = new Bundle();
                int i16 = vabVar.a;
                if (i16 != 0) {
                    bundle5.putInt(vab.d, i16);
                }
                int i17 = vabVar.b;
                if (i17 != 0) {
                    bundle5.putInt(vab.e, i17);
                }
                int i18 = vabVar.c;
                if (i18 != 0) {
                    bundle5.putInt(vab.f, i18);
                }
                return bundle5;
            case 10:
                at6 at6Var = (at6) obj;
                at6Var.getClass();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable(at6.h, at6Var.a);
                String str15 = at6Var.b;
                if (str15 != null) {
                    bundle6.putString(at6.i, str15);
                }
                String str16 = at6Var.c;
                if (str16 != null) {
                    bundle6.putString(at6.j, str16);
                }
                int i19 = at6Var.d;
                if (i19 != 0) {
                    bundle6.putInt(at6.k, i19);
                }
                int i20 = at6Var.e;
                if (i20 != 0) {
                    bundle6.putInt(at6.l, i20);
                }
                String str17 = at6Var.f;
                if (str17 != null) {
                    bundle6.putString(at6.m, str17);
                }
                String str18 = at6Var.g;
                if (str18 != null) {
                    bundle6.putString(at6.n, str18);
                }
                return bundle6;
            case 11:
                Bundle bundle7 = (Bundle) obj;
                Uri uri = (Uri) bundle7.getParcelable(at6.h);
                uri.getClass();
                String string3 = bundle7.getString(at6.i);
                String string4 = bundle7.getString(at6.j);
                int i21 = bundle7.getInt(at6.k, 0);
                int i22 = bundle7.getInt(at6.l, 0);
                String string5 = bundle7.getString(at6.m);
                String string6 = bundle7.getString(at6.n);
                q95 q95Var = new q95();
                q95Var.c = uri;
                q95Var.d = wf7.n(string3);
                q95Var.e = string4;
                q95Var.a = i21;
                q95Var.b = i22;
                q95Var.f = string5;
                q95Var.g = string6;
                return new at6(q95Var);
            case 12:
                String str19 = (String) obj;
                xk1 xk1Var = h07.g;
                xk1Var.getClass();
                int length = str19.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (xk1Var.b(str19.charAt(length))) {
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
                int i23 = wo5.d;
                if (collection instanceof wo5) {
                    return (wo5) collection;
                }
                boolean z = collection instanceof wo5;
                if (z) {
                    e89 e89Var = (e89) ((wo5) collection);
                    vo5 vo5Var = e89Var.h;
                    if (vo5Var == null) {
                        vo5Var = new vo5(e89Var, b3);
                        e89Var.h = vo5Var;
                    }
                    i4 = vo5Var.size();
                } else {
                    i4 = 11;
                }
                uo5 uo5Var = new uo5();
                uo5Var.b = false;
                zp7 zp7Var = new zp7();
                zp7Var.d(i4);
                uo5Var.a = zp7Var;
                if (z) {
                    wo5 wo5Var = (wo5) collection;
                    zp7 zp7Var2 = wo5Var instanceof e89 ? ((e89) wo5Var).e : null;
                    if (zp7Var2 != null) {
                        zp7Var.a(Math.max(zp7Var.c, zp7Var2.c));
                        if (zp7Var2.c != 0) {
                            i5 = -1;
                            while (i5 >= 0) {
                                jte.j(i5, zp7Var2.c);
                                Object obj3 = zp7Var2.a[i5];
                                jte.j(i5, zp7Var2.c);
                                uo5Var.c(zp7Var2.b[i5], obj3);
                                i5++;
                                if (i5 >= zp7Var2.c) {
                                }
                            }
                        }
                        i5 = -1;
                    } else {
                        yo5 o = wo5Var.o();
                        zp7 zp7Var3 = uo5Var.a;
                        zp7Var3.a(Math.max(zp7Var3.c, o.size()));
                        for (yp7 yp7Var : wo5Var.o()) {
                            uo5Var.c(yp7Var.a(), yp7Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        uo5Var.a(it.next());
                    }
                }
                Objects.requireNonNull(uo5Var.a);
                if (uo5Var.a.c == 0) {
                    return e89.n;
                }
                uo5Var.b = true;
                return new e89(uo5Var.a);
            case 14:
                return Long.valueOf(((i53) obj).b);
            case 15:
                return Long.valueOf(((i53) obj).c);
            case 16:
                return mo5.q(wpe.b(((tt6) obj).q().b, new o41(b2)));
            case 17:
                Bundle bundle8 = (Bundle) obj;
                go4 go4Var = go4.Z;
                fo4 fo4Var = new fo4();
                if (bundle8 != null) {
                    ClassLoader classLoader = d41.class.getClassLoader();
                    String str20 = hac.a;
                    bundle8.setClassLoader(classLoader);
                }
                String string7 = bundle8.getString(go4.a0);
                String str21 = go4Var.a;
                if (string7 == null) {
                    string7 = str21;
                }
                fo4Var.a = string7;
                String string8 = bundle8.getString(go4.b0);
                String str22 = go4Var.b;
                if (string8 == null) {
                    string8 = str22;
                }
                fo4Var.b = string8;
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(go4.F0);
                if (parcelableArrayList2 == null) {
                    ko5 ko5Var = mo5.b;
                    f3 = y79.e;
                } else {
                    jo5 p = mo5.p();
                    for (int i24 = 0; i24 < parcelableArrayList2.size(); i24++) {
                        Bundle bundle9 = (Bundle) parcelableArrayList2.get(i24);
                        bundle9.getClass();
                        String string9 = bundle9.getString(sy5.c);
                        String string10 = bundle9.getString(sy5.d);
                        string10.getClass();
                        p.c(new sy5(string9, string10));
                    }
                    f3 = p.f();
                }
                fo4Var.c = mo5.q(f3);
                String string11 = bundle8.getString(go4.c0);
                String str23 = go4Var.d;
                if (string11 == null) {
                    string11 = str23;
                }
                fo4Var.d = string11;
                fo4Var.e = bundle8.getInt(go4.d0, go4Var.e);
                fo4Var.f = bundle8.getInt(go4.e0, go4Var.f);
                fo4Var.g = bundle8.getFloat(go4.O0, go4Var.g);
                fo4Var.h = bundle8.getInt(go4.G0, go4Var.h);
                fo4Var.i = bundle8.getInt(go4.f0, go4Var.i);
                fo4Var.j = bundle8.getInt(go4.g0, go4Var.j);
                String string12 = bundle8.getString(go4.h0);
                String str24 = go4Var.l;
                if (string12 == null) {
                    string12 = str24;
                }
                fo4Var.k = string12;
                String string13 = bundle8.getString(go4.K0);
                String str25 = go4Var.n;
                if (string13 == null) {
                    string13 = str25;
                }
                fo4Var.m = string13;
                String string14 = bundle8.getString(go4.i0);
                String str26 = go4Var.s;
                if (string14 == null) {
                    string14 = str26;
                }
                fo4Var.r = wf7.n(string14);
                String string15 = bundle8.getString(go4.j0);
                String str27 = go4Var.t;
                if (string15 == null) {
                    string15 = str27;
                }
                fo4Var.s = wf7.n(string15);
                fo4Var.t = bundle8.getInt(go4.k0, go4Var.u);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray2 = bundle8.getByteArray(go4.l0 + "_" + Integer.toString(r6, 36));
                    if (byteArray2 == null) {
                        float f8 = bundle8.getFloat(go4.q0, go4Var.F);
                        if (f8 <= 0.0f) {
                            f8 = -1.0f;
                        }
                        fo4Var.v = arrayList2;
                        fo4Var.w = (as3) bundle8.getParcelable(go4.m0);
                        fo4Var.x = bundle8.getLong(go4.n0, go4Var.y);
                        fo4Var.z = bundle8.getInt(go4.o0, go4Var.A);
                        fo4Var.A = bundle8.getInt(go4.p0, go4Var.B);
                        fo4Var.B = bundle8.getInt(go4.N0, go4Var.C);
                        fo4Var.C = bundle8.getInt(go4.I0, go4Var.D);
                        fo4Var.D = bundle8.getInt(go4.J0, go4Var.E);
                        fo4Var.a(f8);
                        fo4Var.F = bundle8.getInt(go4.r0, go4Var.G);
                        fo4Var.G = bundle8.getBoolean(go4.M0, go4Var.H);
                        fo4Var.H = bundle8.getFloat(go4.s0, go4Var.I);
                        fo4Var.I = bundle8.getByteArray(go4.t0);
                        fo4Var.J = bundle8.getInt(go4.u0, go4Var.K);
                        fo4Var.L = bundle8.getInt(go4.H0, go4Var.M);
                        Bundle bundle10 = bundle8.getBundle(go4.v0);
                        if (bundle10 != null) {
                            fo4Var.K = new tm2(bundle10.getInt(tm2.i, -1), bundle10.getInt(tm2.j, -1), bundle10.getInt(tm2.k, -1), bundle10.getByteArray(tm2.l), bundle10.getInt(tm2.m, -1), bundle10.getInt(tm2.n, -1));
                        }
                        fo4Var.M = bundle8.getInt(go4.w0, go4Var.N);
                        fo4Var.N = bundle8.getInt(go4.L0, go4Var.O);
                        fo4Var.O = bundle8.getInt(go4.x0, go4Var.P);
                        fo4Var.P = bundle8.getInt(go4.y0, go4Var.Q);
                        fo4Var.Q = bundle8.getInt(go4.z0, go4Var.R);
                        fo4Var.R = bundle8.getInt(go4.A0, go4Var.S);
                        fo4Var.S = bundle8.getInt(go4.B0, go4Var.T);
                        fo4Var.U = bundle8.getInt(go4.D0, go4Var.V);
                        fo4Var.V = bundle8.getInt(go4.E0, go4Var.W);
                        fo4Var.W = bundle8.getInt(go4.C0, go4Var.X);
                        return new go4(fo4Var);
                    }
                    arrayList2.add(byteArray2);
                    r6++;
                }
            case 18:
                return Integer.valueOf(((uzb) obj).c);
            case 19:
                Bundle bundle11 = (Bundle) obj;
                Bundle bundle12 = bundle11.getBundle(a0c.c);
                bundle12.getClass();
                ArrayList parcelableArrayList3 = bundle12.getParcelableArrayList(uzb.f);
                if (parcelableArrayList3 == null) {
                    ko5 ko5Var2 = mo5.b;
                    b = y79.e;
                } else {
                    b = d41.b(new o41((byte) 17), parcelableArrayList3);
                }
                uzb uzbVar = new uzb(bundle12.getString(uzb.g, ""), (go4[]) b.toArray(new go4[0]));
                int[] intArray = bundle11.getIntArray(a0c.d);
                intArray.getClass();
                return new a0c(uzbVar, ine.a(intArray));
            default:
                f0c f0cVar = (f0c) obj;
                f0cVar.getClass();
                Bundle bundle13 = new Bundle();
                bundle13.putBundle(f0c.f, f0cVar.b.c());
                bundle13.putIntArray(f0c.g, f0cVar.d);
                bundle13.putBooleanArray(f0c.h, f0cVar.e);
                bundle13.putBoolean(f0c.i, f0cVar.c);
                return bundle13;
        }
    }
}
