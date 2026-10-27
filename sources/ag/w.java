package ag;

import a8.ed;
import a8.me;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.j1;
import b2.q1;
import b2.r1;
import b2.v1;
import bi.ad;
import bi.ba;
import bi.h7;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import f9.s1;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Vector.TLDeserializer, e9.k, s9.d, b2, c7, d7, kw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i10) {
        this.a = i10;
    }

    @Override // e9.k
    public Object apply(Object obj) {
        s1 f7;
        s1 b10;
        int i10 = 0;
        switch (this.a) {
            case 5:
                b2.b0 b0Var = (b2.b0) obj;
                return b0Var.a + ": " + b0Var.b;
            case 6:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = j1Var.a;
                if (i11 != 0) {
                    bundle.putInt(j1.d, i11);
                }
                int i12 = j1Var.b;
                if (i12 != 0) {
                    bundle.putInt(j1.e, i12);
                }
                int i13 = j1Var.c;
                if (i13 != 0) {
                    bundle.putInt(j1.f, i13);
                }
                return bundle;
            case 7:
                b2.o0 o0Var = (b2.o0) obj;
                o0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.o0.h, o0Var.a);
                String str = o0Var.b;
                if (str != null) {
                    bundle2.putString(b2.o0.i, str);
                }
                String str2 = o0Var.c;
                if (str2 != null) {
                    bundle2.putString(b2.o0.j, str2);
                }
                int i14 = o0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(b2.o0.k, i14);
                }
                int i15 = o0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(b2.o0.l, i15);
                }
                String str3 = o0Var.f;
                if (str3 != null) {
                    bundle2.putString(b2.o0.m, str3);
                }
                String str4 = o0Var.g;
                if (str4 != null) {
                    bundle2.putString(b2.o0.n, str4);
                }
                return bundle2;
            case 8:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.o0.h);
                uri.getClass();
                String string = bundle3.getString(b2.o0.i);
                String string2 = bundle3.getString(b2.o0.j);
                int i16 = bundle3.getInt(b2.o0.k, 0);
                int i17 = bundle3.getInt(b2.o0.l, 0);
                String string3 = bundle3.getString(b2.o0.m);
                String string4 = bundle3.getString(b2.o0.n);
                b2.n0 n0Var = new b2.n0();
                n0Var.c = uri;
                n0Var.d = b2.w0.n(string);
                n0Var.e = string2;
                n0Var.a = i16;
                n0Var.b = i17;
                n0Var.f = string3;
                n0Var.g = string4;
                return new b2.o0(n0Var);
            case 9:
                Bundle bundle4 = (Bundle) obj;
                b2.x xVar = b2.x.V;
                b2.w wVar = new b2.w();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.e.class.getClassLoader();
                    String str5 = e2.n0.a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.x.W);
                String str6 = xVar.a;
                if (string5 == null) {
                    string5 = str6;
                }
                wVar.a = string5;
                String string6 = bundle4.getString(b2.x.X);
                String str7 = xVar.b;
                if (string6 == null) {
                    string6 = str7;
                }
                wVar.b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.x.B0);
                if (parcelableArrayList == null) {
                    f7 = s1.e;
                } else {
                    f9.f0 t10 = f9.i0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.b0.c);
                        String string8 = bundle5.getString(b2.b0.d);
                        string8.getClass();
                        t10.c(new b2.b0(string7, string8));
                    }
                    f7 = t10.f();
                }
                wVar.c = f9.i0.u(f7);
                String string9 = bundle4.getString(b2.x.Y);
                String str8 = xVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                wVar.d = string9;
                wVar.e = bundle4.getInt(b2.x.Z, xVar.e);
                wVar.f = bundle4.getInt(b2.x.a0, xVar.f);
                wVar.g = bundle4.getInt(b2.x.C0, xVar.g);
                wVar.h = bundle4.getInt(b2.x.b0, xVar.h);
                wVar.i = bundle4.getInt(b2.x.c0, xVar.i);
                String string10 = bundle4.getString(b2.x.d0);
                String str9 = xVar.k;
                if (string10 == null) {
                    string10 = str9;
                }
                wVar.j = string10;
                String string11 = bundle4.getString(b2.x.G0);
                String str10 = xVar.m;
                if (string11 == null) {
                    string11 = str10;
                }
                wVar.l = string11;
                String string12 = bundle4.getString(b2.x.e0);
                String str11 = xVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                wVar.q = b2.w0.n(string12);
                String string13 = bundle4.getString(b2.x.f0);
                String str12 = xVar.s;
                if (string13 == null) {
                    string13 = str12;
                }
                wVar.r = b2.w0.n(string13);
                wVar.s = bundle4.getInt(b2.x.g0, xVar.t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.x.h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        wVar.u = arrayList;
                        wVar.v = (b2.t) bundle4.getParcelable(b2.x.i0);
                        wVar.w = bundle4.getLong(b2.x.j0, xVar.x);
                        wVar.y = bundle4.getInt(b2.x.k0, xVar.z);
                        wVar.z = bundle4.getInt(b2.x.l0, xVar.A);
                        wVar.A = bundle4.getInt(b2.x.E0, xVar.B);
                        wVar.B = bundle4.getInt(b2.x.F0, xVar.C);
                        wVar.C = bundle4.getFloat(b2.x.m0, xVar.D);
                        wVar.D = bundle4.getInt(b2.x.n0, xVar.E);
                        wVar.E = bundle4.getFloat(b2.x.o0, xVar.F);
                        wVar.F = bundle4.getByteArray(b2.x.p0);
                        wVar.G = bundle4.getInt(b2.x.q0, xVar.H);
                        wVar.I = bundle4.getInt(b2.x.D0, xVar.J);
                        Bundle bundle6 = bundle4.getBundle(b2.x.r0);
                        if (bundle6 != null) {
                            wVar.H = new b2.o(bundle6.getInt(b2.o.i, -1), bundle6.getInt(b2.o.j, -1), bundle6.getInt(b2.o.k, -1), bundle6.getByteArray(b2.o.l), bundle6.getInt(b2.o.m, -1), bundle6.getInt(b2.o.n, -1));
                        }
                        wVar.J = bundle4.getInt(b2.x.s0, xVar.K);
                        wVar.K = bundle4.getInt(b2.x.t0, xVar.L);
                        wVar.L = bundle4.getInt(b2.x.u0, xVar.M);
                        wVar.M = bundle4.getInt(b2.x.v0, xVar.N);
                        wVar.N = bundle4.getInt(b2.x.w0, xVar.O);
                        wVar.O = bundle4.getInt(b2.x.x0, xVar.P);
                        wVar.Q = bundle4.getInt(b2.x.z0, xVar.R);
                        wVar.R = bundle4.getInt(b2.x.A0, xVar.S);
                        wVar.S = bundle4.getInt(b2.x.y0, xVar.T);
                        return new b2.x(wVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 10:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(r1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(q1.f);
                if (parcelableArrayList2 == null) {
                    f9.g0 g0Var = f9.i0.b;
                    b10 = s1.e;
                } else {
                    b10 = e2.e.b(new w(9), parcelableArrayList2);
                }
                q1 q1Var = new q1(bundle8.getString(q1.g, ""), (b2.x[]) b10.toArray(new b2.x[0]));
                int[] intArray = bundle7.getIntArray(r1.d);
                intArray.getClass();
                return new r1(q1Var, ed.a(intArray));
            default:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(v1.f, v1Var.b.c());
                bundle9.putIntArray(v1.g, v1Var.d);
                bundle9.putBooleanArray(v1.h, v1Var.e);
                bundle9.putBoolean(v1.i, v1Var.c);
                return bundle9;
        }
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        ((ba) view).setColor(i10);
    }

    @Override // s9.d
    public Object d1(me meVar) {
        bb.m mVar;
        bb.m0 m0Var;
        bb.g0 g0Var;
        db.h hVar;
        bb.t tVar;
        bb.q0 q0Var;
        switch (this.a) {
            case 19:
                mVar = FirebaseSessionsRegistrar.getComponents$lambda-0(meVar);
                return mVar;
            case 20:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(meVar);
                return m0Var;
            case 21:
                g0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(meVar);
                return g0Var;
            case 22:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(meVar);
                return hVar;
            case 23:
                tVar = FirebaseSessionsRegistrar.getComponents$lambda-4(meVar);
                return tVar;
            default:
                q0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(meVar);
                return q0Var;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        return ((ba) view).x;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 25:
                int i11 = h7.A1;
                break;
            default:
                h7.D2(new fg1(6, null));
                break;
        }
    }

    @Override // org.telegram.ui.Components.kw0
    public RecyclerView i(View view) {
        return ((ad) view).a;
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    public /* synthetic */ w(h7 h7Var) {
        this.a = 26;
    }
}
