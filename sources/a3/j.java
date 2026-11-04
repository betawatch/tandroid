package a3;

import ai.h6;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ke;
import b8.od;
import ci.d9;
import ci.l6;
import ci.tb;
import d2.h1;
import d2.l0;
import d2.m0;
import d2.o1;
import d2.u0;
import d2.z;
import g2.n0;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.e9;
import org.telegram.messenger.t10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements g2.k, p1, t10, e9, f9.k, t9.d, Vector.TLDeserializer, o6, p6, et0 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.a) {
        }
        return Boolean.FALSE;
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049a  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // f9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f10;
        int i3;
        String str;
        float f11;
        int i10;
        String str2;
        int i11;
        boolean z10;
        String str3;
        s1 f12;
        s1 b10;
        int i12 = -1;
        switch (this.a) {
            case 8:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(f2.b.s);
                int i13 = 1;
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(f2.b.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = parcelableArrayList.get(i14);
                            i14++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i15 = bundle2.getInt(f2.d.a);
                            int i16 = bundle2.getInt(f2.d.b);
                            int i17 = bundle2.getInt(f2.d.c);
                            int i18 = bundle2.getInt(f2.d.d, i12);
                            Bundle bundle3 = bundle2.getBundle(f2.d.e);
                            if (i18 == i13) {
                                bundle3.getClass();
                                String string = bundle3.getString(f2.f.c);
                                string.getClass();
                                charSequence2.setSpan(new f2.f(string, bundle3.getInt(f2.f.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new f2.g(bundle3.getInt(f2.g.d), bundle3.getInt(f2.g.e), bundle3.getInt(f2.g.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new f2.e(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(f2.h.b);
                                string2.getClass();
                                charSequence2.setSpan(new f2.h(string2), i15, i16, i17);
                            }
                            i12 = -1;
                            i13 = 1;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f2.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(f2.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(f2.b.w);
                if (bitmap2 == null) {
                    byte[] byteArray = bundle.getByteArray(f2.b.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = f2.b.y;
                        containsKey = bundle.containsKey(str4);
                        int i19 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str5 = f2.b.z;
                            if (bundle.containsKey(str5)) {
                                f10 = bundle.getFloat(str4);
                                i3 = bundle.getInt(str5);
                                String str6 = f2.b.A;
                                int i20 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = f2.b.B;
                                float f13 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = f2.b.C;
                                int i21 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = f2.b.E;
                                if (bundle.containsKey(str)) {
                                    String str9 = f2.b.D;
                                    if (bundle.containsKey(str9)) {
                                        f11 = bundle.getFloat(str);
                                        i10 = bundle.getInt(str9);
                                        String str10 = f2.b.F;
                                        float f14 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = f2.b.G;
                                        float f15 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = f2.b.H;
                                        if (bundle.containsKey(str2)) {
                                            i11 = -16777216;
                                            z10 = false;
                                        } else {
                                            i11 = bundle.getInt(str2);
                                            z10 = true;
                                        }
                                        int i22 = i11;
                                        boolean z11 = bundle.getBoolean(f2.b.I, false) ? false : z10;
                                        str3 = f2.b.J;
                                        if (bundle.containsKey(str3)) {
                                            i19 = bundle.getInt(str3);
                                        }
                                        int i23 = i19;
                                        String str12 = f2.b.K;
                                        float f16 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = f2.b.L;
                                        return new f2.b(charSequence, alignment2, alignment4, bitmap, f10, i3, i20, f13, i21, i10, f11, f14, f15, z11, i22, i23, f16, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f11 = -3.4028235E38f;
                                i10 = Integer.MIN_VALUE;
                                String str102 = f2.b.F;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = f2.b.G;
                                float f152 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = f2.b.H;
                                if (bundle.containsKey(str2)) {
                                }
                                int i222 = i11;
                                if (bundle.getBoolean(f2.b.I, false)) {
                                }
                                str3 = f2.b.J;
                                if (bundle.containsKey(str3)) {
                                }
                                int i232 = i19;
                                String str122 = f2.b.K;
                                float f162 = !bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f;
                                String str132 = f2.b.L;
                                return new f2.b(charSequence, alignment2, alignment4, bitmap, f10, i3, i20, f13, i21, i10, f11, f14, f152, z11, i222, i232, f162, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f10 = -3.4028235E38f;
                        i3 = Integer.MIN_VALUE;
                        String str62 = f2.b.A;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = f2.b.B;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = f2.b.C;
                        if (bundle.containsKey(str82)) {
                        }
                        str = f2.b.E;
                        if (bundle.containsKey(str)) {
                        }
                        f11 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                        String str1022 = f2.b.F;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = f2.b.G;
                        float f1522 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = f2.b.H;
                        if (bundle.containsKey(str2)) {
                        }
                        int i2222 = i11;
                        if (bundle.getBoolean(f2.b.I, false)) {
                        }
                        str3 = f2.b.J;
                        if (bundle.containsKey(str3)) {
                        }
                        int i2322 = i19;
                        String str1222 = f2.b.K;
                        float f1622 = !bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f;
                        String str1322 = f2.b.L;
                        return new f2.b(charSequence, alignment2, alignment4, bitmap, f10, i3, i20, f13, i21, i10, f11, f14, f1522, z11, i2222, i2322, f1622, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                bitmap = bitmap2;
                charSequence = null;
                String str42 = f2.b.y;
                containsKey = bundle.containsKey(str42);
                int i192 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f10 = -3.4028235E38f;
                i3 = Integer.MIN_VALUE;
                String str622 = f2.b.A;
                if (bundle.containsKey(str622)) {
                }
                String str722 = f2.b.B;
                if (bundle.containsKey(str722)) {
                }
                String str822 = f2.b.C;
                if (bundle.containsKey(str822)) {
                }
                str = f2.b.E;
                if (bundle.containsKey(str)) {
                }
                f11 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
                String str10222 = f2.b.F;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = f2.b.G;
                float f15222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = f2.b.H;
                if (bundle.containsKey(str2)) {
                }
                int i22222 = i11;
                if (bundle.getBoolean(f2.b.I, false)) {
                }
                str3 = f2.b.J;
                if (bundle.containsKey(str3)) {
                }
                int i23222 = i192;
                String str12222 = f2.b.K;
                float f16222 = !bundle.containsKey(str12222) ? bundle.getFloat(str12222) : 0.0f;
                String str13222 = f2.b.L;
                return new f2.b(charSequence, alignment2, alignment4, bitmap, f10, i3, i20, f13, i21, i10, f11, f14, f15222, z11, i22222, i23222, f16222, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 9:
                long j10 = ((b4.a) obj).b;
                if (j10 == -9223372036854775807L) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
            case 24:
                z zVar = (z) obj;
                return zVar.a + ": " + zVar.b;
            case 25:
                h1 h1Var = (h1) obj;
                h1Var.getClass();
                Bundle bundle4 = new Bundle();
                int i24 = h1Var.a;
                if (i24 != 0) {
                    bundle4.putInt(h1.d, i24);
                }
                int i25 = h1Var.b;
                if (i25 != 0) {
                    bundle4.putInt(h1.e, i25);
                }
                int i26 = h1Var.c;
                if (i26 != 0) {
                    bundle4.putInt(h1.f, i26);
                }
                return bundle4;
            case 26:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable(m0.h, m0Var.a);
                String str14 = m0Var.b;
                if (str14 != null) {
                    bundle5.putString(m0.i, str14);
                }
                String str15 = m0Var.c;
                if (str15 != null) {
                    bundle5.putString(m0.j, str15);
                }
                int i27 = m0Var.d;
                if (i27 != 0) {
                    bundle5.putInt(m0.k, i27);
                }
                int i28 = m0Var.e;
                if (i28 != 0) {
                    bundle5.putInt(m0.l, i28);
                }
                String str16 = m0Var.f;
                if (str16 != null) {
                    bundle5.putString(m0.m, str16);
                }
                String str17 = m0Var.g;
                if (str17 != null) {
                    bundle5.putString(m0.n, str17);
                }
                return bundle5;
            case 27:
                Bundle bundle6 = (Bundle) obj;
                Uri uri = (Uri) bundle6.getParcelable(m0.h);
                uri.getClass();
                String string3 = bundle6.getString(m0.i);
                String string4 = bundle6.getString(m0.j);
                int i29 = bundle6.getInt(m0.k, 0);
                int i30 = bundle6.getInt(m0.l, 0);
                String string5 = bundle6.getString(m0.m);
                String string6 = bundle6.getString(m0.n);
                l0 l0Var = new l0();
                l0Var.c = uri;
                l0Var.d = u0.n(string3);
                l0Var.e = string4;
                l0Var.a = i29;
                l0Var.b = i30;
                l0Var.f = string5;
                l0Var.g = string6;
                return new m0(l0Var);
            case 28:
                Bundle bundle7 = (Bundle) obj;
                d2.v vVar = d2.v.V;
                d2.u uVar = new d2.u();
                if (bundle7 != null) {
                    ClassLoader classLoader = g2.f.class.getClassLoader();
                    String str18 = n0.a;
                    bundle7.setClassLoader(classLoader);
                }
                String string7 = bundle7.getString(d2.v.W);
                String str19 = vVar.a;
                if (string7 == null) {
                    string7 = str19;
                }
                uVar.a = string7;
                String string8 = bundle7.getString(d2.v.X);
                String str20 = vVar.b;
                if (string8 == null) {
                    string8 = str20;
                }
                uVar.b = string8;
                ArrayList parcelableArrayList2 = bundle7.getParcelableArrayList(d2.v.B0);
                if (parcelableArrayList2 == null) {
                    f12 = s1.e;
                } else {
                    f0 p10 = i0.p();
                    for (int i31 = 0; i31 < parcelableArrayList2.size(); i31++) {
                        Bundle bundle8 = (Bundle) parcelableArrayList2.get(i31);
                        bundle8.getClass();
                        String string9 = bundle8.getString(z.c);
                        String string10 = bundle8.getString(z.d);
                        string10.getClass();
                        p10.c(new z(string9, string10));
                    }
                    f12 = p10.f();
                }
                uVar.c = i0.q(f12);
                String string11 = bundle7.getString(d2.v.Y);
                String str21 = vVar.d;
                if (string11 == null) {
                    string11 = str21;
                }
                uVar.d = string11;
                uVar.e = bundle7.getInt(d2.v.Z, vVar.e);
                uVar.f = bundle7.getInt(d2.v.a0, vVar.f);
                uVar.g = bundle7.getInt(d2.v.C0, vVar.g);
                uVar.h = bundle7.getInt(d2.v.b0, vVar.h);
                uVar.i = bundle7.getInt(d2.v.c0, vVar.i);
                String string12 = bundle7.getString(d2.v.d0);
                String str22 = vVar.k;
                if (string12 == null) {
                    string12 = str22;
                }
                uVar.j = string12;
                String string13 = bundle7.getString(d2.v.G0);
                String str23 = vVar.m;
                if (string13 == null) {
                    string13 = str23;
                }
                uVar.l = string13;
                String string14 = bundle7.getString(d2.v.e0);
                String str24 = vVar.r;
                if (string14 == null) {
                    string14 = str24;
                }
                uVar.q = u0.n(string14);
                String string15 = bundle7.getString(d2.v.f0);
                String str25 = vVar.s;
                if (string15 == null) {
                    string15 = str25;
                }
                uVar.r = u0.n(string15);
                uVar.s = bundle7.getInt(d2.v.g0, vVar.t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray2 = bundle7.getByteArray(d2.v.h0 + "_" + Integer.toString(r3, 36));
                    if (byteArray2 == null) {
                        uVar.u = arrayList;
                        uVar.v = (d2.s) bundle7.getParcelable(d2.v.i0);
                        uVar.w = bundle7.getLong(d2.v.j0, vVar.x);
                        uVar.y = bundle7.getInt(d2.v.k0, vVar.z);
                        uVar.z = bundle7.getInt(d2.v.l0, vVar.A);
                        uVar.A = bundle7.getInt(d2.v.E0, vVar.B);
                        uVar.B = bundle7.getInt(d2.v.F0, vVar.C);
                        uVar.C = bundle7.getFloat(d2.v.m0, vVar.D);
                        uVar.D = bundle7.getInt(d2.v.n0, vVar.E);
                        uVar.E = bundle7.getFloat(d2.v.o0, vVar.F);
                        uVar.F = bundle7.getByteArray(d2.v.p0);
                        uVar.G = bundle7.getInt(d2.v.q0, vVar.H);
                        uVar.I = bundle7.getInt(d2.v.D0, vVar.J);
                        Bundle bundle9 = bundle7.getBundle(d2.v.r0);
                        if (bundle9 != null) {
                            uVar.H = new d2.n(bundle9.getInt(d2.n.i, -1), bundle9.getInt(d2.n.j, -1), bundle9.getInt(d2.n.k, -1), bundle9.getByteArray(d2.n.l), bundle9.getInt(d2.n.m, -1), bundle9.getInt(d2.n.n, -1));
                        }
                        uVar.J = bundle7.getInt(d2.v.s0, vVar.K);
                        uVar.K = bundle7.getInt(d2.v.t0, vVar.L);
                        uVar.L = bundle7.getInt(d2.v.u0, vVar.M);
                        uVar.M = bundle7.getInt(d2.v.v0, vVar.N);
                        uVar.N = bundle7.getInt(d2.v.w0, vVar.O);
                        uVar.O = bundle7.getInt(d2.v.x0, vVar.P);
                        uVar.Q = bundle7.getInt(d2.v.z0, vVar.R);
                        uVar.R = bundle7.getInt(d2.v.A0, vVar.S);
                        uVar.S = bundle7.getInt(d2.v.y0, vVar.T);
                        return new d2.v(uVar);
                    }
                    arrayList.add(byteArray2);
                    r3++;
                }
            default:
                Bundle bundle10 = (Bundle) obj;
                Bundle bundle11 = bundle10.getBundle(d2.p1.c);
                bundle11.getClass();
                ArrayList parcelableArrayList3 = bundle11.getParcelableArrayList(o1.f);
                if (parcelableArrayList3 == null) {
                    g0 g0Var = i0.b;
                    b10 = s1.e;
                } else {
                    b10 = g2.f.b(new j(28), parcelableArrayList3);
                }
                o1 o1Var = new o1(bundle11.getString(o1.g, ""), (d2.v[]) b10.toArray(new d2.v[0]));
                int[] intArray = bundle10.getIntArray(d2.p1.d);
                intArray.getClass();
                return new d2.p1(o1Var, od.a(intArray));
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i3, z10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void f(int i3, View view) {
        ((d9) view).setColor(i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                s1Var.dismiss();
                break;
            case 2:
                s1Var.dismiss();
                break;
            case 18:
                int i10 = l6.t3;
                break;
            default:
                l6.c2(new ra1(6, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int h(View view) {
        return ((d9) view).y;
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ float i(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        int i3 = h6.d2;
        return 0;
    }

    @Override // org.telegram.ui.Components.et0
    public RecyclerView m(View view) {
        return ((tb) view).a;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        Set I = keVar.I(bb.a.class);
        bb.c cVar = bb.c.c;
        if (cVar == null) {
            synchronized (bb.c.class) {
                try {
                    cVar = bb.c.c;
                    if (cVar == null) {
                        cVar = new bb.c(0);
                        bb.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new bb.b(I, cVar);
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    public /* synthetic */ j(Object obj, int i3) {
        this.a = i3;
    }
}
