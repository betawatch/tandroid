// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eef implements aq2, a5a, yyb, e51, bv7, sab, yq3, ebc, vyc, al0, pma, bb2 {
    public static eef b;
    public static final eef c = new eef(1);
    public static final eef d = new eef(2);
    public static final /* synthetic */ eef e = new eef(4);
    public static final eef f = new eef(5);
    public static final eef h = new eef(6);
    public static final eef n = new eef(7);
    public static final eef r = new eef(8);
    public static final /* synthetic */ eef s = new eef(9);
    public static final eef w = new eef(10);
    public static final eef x = new eef(11);
    public static final /* synthetic */ eef y = new eef(12);
    public final /* synthetic */ byte a;

    public /* synthetic */ eef(byte b2) {
        this.a = b2;
    }

    public static qj0 A(byte[][] bArr, int i) {
        int i2 = i << 1;
        qj0 qj0Var = new qj0(bArr[0].length + i2, bArr.length + i2);
        int[] iArr = qj0Var.d;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (qj0Var.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    qj0Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return qj0Var;
    }

    public static byte[][] N3(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static void Q3(String str) {
        if (str == null || str.length() == 0) {
            throw new v40("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new v40("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static void T3(qnd qndVar, u56 u56Var, boolean z, TaskCompletionSource taskCompletionSource) {
        synchronized (qndVar.G) {
            dmd dmdVar = (dmd) qndVar.G.remove(u56Var);
            if (dmdVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            f84 f84Var = null;
            dmdVar.b.h().b = null;
            if (z) {
                xme xmeVar = qndVar.B;
                f84[] f84VarArr = xmeVar == null ? null : xmeVar.b;
                if (f84VarArr != null) {
                    int length = f84VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        f84 f84Var2 = f84VarArr[i];
                        if ("location_updates_with_callback".equals(f84Var2.a)) {
                            f84Var = f84Var2;
                            break;
                        }
                        i++;
                    }
                    if (f84Var != null && f84Var.b() >= 1) {
                        z2f z2fVar = (z2f) qndVar.k();
                        bkd bkdVar = new bkd(Boolean.TRUE, taskCompletionSource);
                        Parcel R = z2fVar.R();
                        int i2 = rgd.a;
                        R.writeInt(1);
                        int r2 = jte.r(R, 20293);
                        jte.q(R, 1, 4);
                        R.writeInt(2);
                        jte.f(R, 3, dmdVar);
                        jte.s(R, r2);
                        rgd.c(R, bkdVar);
                        z2fVar.V(R, 89);
                    }
                }
                z2f z2fVar2 = (z2f) qndVar.k();
                nkd nkdVar = new nkd(taskCompletionSource);
                int i3 = dmd.c;
                IInterface queryLocalInterface = dmdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                IInterface k7fVar = queryLocalInterface instanceof bbf ? (bbf) queryLocalInterface : new k7f(dmdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                IInterface queryLocalInterface2 = nkdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                IInterface wheVar = queryLocalInterface2 instanceof gse ? (gse) queryLocalInterface2 : new whe(nkdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                Parcel R2 = z2fVar2.R();
                int i4 = rgd.a;
                R2.writeInt(1);
                int r3 = jte.r(R2, 20293);
                jte.q(R2, 1, 4);
                R2.writeInt(2);
                jte.f(R2, 5, k7fVar.asBinder());
                jte.f(R2, 6, wheVar.asBinder());
                jte.s(R2, r3);
                z2fVar2.V(R2, 59);
            } else {
                taskCompletionSource.setResult(Boolean.TRUE);
            }
        }
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void B0() {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void C2() {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void E(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final gib E2() {
        byte b2 = this.a;
        return null;
    }

    @Override // bb2
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void I(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean J0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // aq2
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(n4c.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            case 4:
                return new ig7(gl2Var.O(hg7.class));
            case 9:
                return new hg7(gl2Var.d(jnd.class));
            default:
                return new u3d();
        }
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        d01.t(gb2Var.getContext(), str);
    }

    @Override // al0
    public final int L() {
        return 0;
    }

    @Override // bb2
    public final void M(gb2 gb2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean N() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean N1() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean P() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final int Q() {
        byte b2 = this.a;
        return 0;
    }

    @Override // bb2
    public final void R1() {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void S(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final int U(gb2 gb2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override // al0
    public final float U0() {
        return 0.0f;
    }

    @Override // bb2
    public final void V(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final vu1 W() {
        byte b2 = this.a;
        return null;
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void X(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void X1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final ma8 Z1() {
        byte b2 = this.a;
        return null;
    }

    @Override // al0
    public final int a1() {
        return 0;
    }

    @Override // yyb
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // bb2
    public final boolean b() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void b0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // bb2
    public final void b2(String str, String str2) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void c() {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void c0(int i) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean c2(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // yq3
    public final sq3 d(vq3 vq3Var, fm4 fm4Var) {
        if (fm4Var.x == null) {
            return null;
        }
        return new y34(new rq3(6001, new g6c()));
    }

    @Override // bb2
    public final boolean d0() {
        byte b2 = this.a;
        return false;
    }

    @Override // al0
    public final int d1() {
        return 0;
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
        byte b2 = this.a;
    }

    @Override // a5a
    public final Object e() {
        return new ih7(true);
    }

    @Override // bb2
    public final CharacterStyle e0(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // yq3
    public final xq3 f(vq3 vq3Var, fm4 fm4Var) {
        return xq3.t;
    }

    @Override // e51
    public final byte[] g(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        byte b2 = this.a;
        return true;
    }

    @Override // sab
    public final boolean h(fm4 fm4Var) {
        String str = fm4Var.t;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // bb2
    public final boolean h0() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override // a5a
    public final void i(Object obj, p4c p4cVar) {
        fs4 a;
        Map a2 = ((ih7) obj).a();
        og8 n2 = qg8.n();
        for (Map.Entry entry : a2.entrySet()) {
            lg8 lg8Var = (lg8) entry.getKey();
            Object value = entry.getValue();
            String str = lg8Var.a;
            if (value instanceof Boolean) {
                tg8 v = vg8.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((vg8) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                tg8 v2 = vg8.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((vg8) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                tg8 v3 = vg8.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((vg8) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                tg8 v4 = vg8.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((vg8) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                tg8 v5 = vg8.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((vg8) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                tg8 v6 = vg8.v();
                v6.c();
                ((vg8) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                tg8 v7 = vg8.v();
                rg8 o = sg8.o();
                o.c();
                ((sg8) o.b).l((Set) value);
                v7.c();
                ((vg8) v7.b).D((sg8) o.a());
                a = v7.a();
            } else {
                if (!(value instanceof byte[])) {
                    sc8.j("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                tg8 v8 = vg8.v();
                byte[] bArr = (byte[]) value;
                f51 j = f51.j(0, bArr.length, bArr);
                v8.c();
                ((vg8) v8.b).x(j);
                a = v8.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((qg8) n2.b).m().put(str, (vg8) a);
        }
        qg8 qg8Var = (qg8) n2.a();
        int a3 = qg8Var.a(null);
        Logger logger = ck2.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        ck2 ck2Var = new ck2(p4cVar, a3);
        qg8Var.b(ck2Var);
        if (ck2Var.d > 0) {
            ck2Var.j();
        }
    }

    @Override // bb2
    public final void i0(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void i1() {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // pma
    public final StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // al0
    public final int j0() {
        return 0;
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override // ebc
    public final boolean k() {
        n40 n40Var = bkb.c5;
        if (n40Var == null) {
            n40Var = new n40();
            bkb.c5 = n40Var;
        }
        return n40Var.i != null;
    }

    @Override // bb2
    public final void k0(String str) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final boolean l() {
        byte b2 = this.a;
        return true;
    }

    @Override // bb2
    public final void l0(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // a5a
    public final Object m(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            qg8 o = qg8.o(fileInputStream);
            ih7 ih7Var = new ih7(false);
            mg8[] mg8VarArr = (mg8[]) Arrays.copyOf(new mg8[0], 0);
            ih7Var.b();
            if (mg8VarArr.length > 0) {
                mg8 mg8Var = mg8VarArr[0];
                throw null;
            }
            Map l = o.l();
            l.getClass();
            for (Map.Entry entry : l.entrySet()) {
                String str = (String) entry.getKey();
                vg8 vg8Var = (vg8) entry.getValue();
                str.getClass();
                vg8Var.getClass();
                int u = vg8Var.u();
                switch (u == 0 ? -1 : ng8.a[ug8.F(u)]) {
                    case -1:
                        throw new fx2("Value case is null.", null);
                    case 0:
                    default:
                        throw new gp2();
                    case 1:
                        ih7Var.d(new lg8(str), Boolean.valueOf(vg8Var.l()));
                        break;
                    case 2:
                        ih7Var.d(new lg8(str), Float.valueOf(vg8Var.p()));
                        break;
                    case 3:
                        ih7Var.d(new lg8(str), Double.valueOf(vg8Var.o()));
                        break;
                    case 4:
                        ih7Var.d(new lg8(str), Integer.valueOf(vg8Var.q()));
                        break;
                    case 5:
                        ih7Var.d(new lg8(str), Long.valueOf(vg8Var.r()));
                        break;
                    case 6:
                        lg8 lg8Var = new lg8(str);
                        String s2 = vg8Var.s();
                        s2.getClass();
                        ih7Var.d(lg8Var, s2);
                        break;
                    case 7:
                        lg8 lg8Var2 = new lg8(str);
                        lp5 n2 = vg8Var.t().n();
                        n2.getClass();
                        ih7Var.d(lg8Var2, yk2.m(n2));
                        break;
                    case 8:
                        lg8 lg8Var3 = new lg8(str);
                        f51 m = vg8Var.m();
                        int size = m.size();
                        if (size == 0) {
                            bArr = mp5.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            m.k(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        ih7Var.d(lg8Var3, bArr);
                        break;
                    case 9:
                        throw new fx2("Value not set.", null);
                }
            }
            return new ih7(new LinkedHashMap(ih7Var.a()), true);
        } catch (zp5 e2) {
            throw new fx2("Unable to parse preferences proto.", e2);
        }
    }

    @Override // al0
    public final int m0() {
        return 0;
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0547  */
    @Override // vyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qj0 n(String str, ze0 ze0Var, EnumMap enumMap) {
        int i;
        n24 n24Var;
        gs3 gs3Var;
        boolean z;
        char c2;
        char c3;
        boolean z2;
        int i2;
        int i3;
        int[][] iArr;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        char charAt;
        int i7;
        char charAt2;
        if (ze0Var != ze0.c) {
            w26.i(ze0Var, "Can only encode PDF_417, but got ");
            return null;
        }
        n24 n24Var2 = n24.d;
        boolean parseBoolean = enumMap.containsKey(n24Var2) ? Boolean.parseBoolean(enumMap.get(n24Var2).toString()) : false;
        n24 n24Var3 = n24.e;
        if (enumMap.containsKey(n24Var3)) {
            String obj = enumMap.get(n24Var3).toString();
            if (obj == null) {
                fvc.f("Name is null");
            } else if (!obj.equals("AUTO")) {
                if (obj.equals("TEXT")) {
                    i = 2;
                } else if (obj.equals("BYTE")) {
                    i = 3;
                } else if (obj.equals("NUMERIC")) {
                    i = 4;
                } else {
                    w26.j("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(obj));
                }
                n24Var = n24.f;
                if (enumMap.containsKey(n24Var)) {
                    enumMap.get(n24Var).getClass();
                    fyb.g();
                    return null;
                }
                n24 n24Var4 = n24.c;
                int parseInt = enumMap.containsKey(n24Var4) ? Integer.parseInt(enumMap.get(n24Var4).toString()) : 30;
                n24 n24Var5 = n24.a;
                int parseInt2 = enumMap.containsKey(n24Var5) ? Integer.parseInt(enumMap.get(n24Var5).toString()) : 2;
                n24 n24Var6 = n24.b;
                Charset forName = enumMap.containsKey(n24Var6) ? Charset.forName(enumMap.get(n24Var6).toString()) : null;
                n24 n24Var7 = n24.h;
                boolean z5 = enumMap.containsKey(n24Var7) && Boolean.parseBoolean(enumMap.get(n24Var7).toString());
                if (parseInt2 < 0 || parseInt2 > 8) {
                    w26.j("Error correction level must be between 0 and 8!");
                    return null;
                }
                int i8 = 1 << (parseInt2 + 1);
                byte[] bArr = ir7.a;
                if (str.isEmpty()) {
                    throw new v30("Empty message not allowed");
                }
                if (2 == i) {
                    ir7.a(kk7.K1, str, "Consider specifying Compaction.AUTO instead of Compaction.TEXT");
                }
                if (forName == null && !z5) {
                    ir7.a(kk7.d4, str, "Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET");
                }
                StringBuilder sb = new StringBuilder(str.length());
                if (z5) {
                    gs3Var = new pj4(str, forName);
                } else {
                    lo5 lo5Var = new lo5((byte) 1);
                    lo5Var.b = str;
                    Charset charset = ir7.e;
                    if (forName == null) {
                        forName = charset;
                        gs3Var = lo5Var;
                    } else {
                        gs3Var = lo5Var;
                        if (!charset.equals(forName)) {
                            ak1 a = ak1.a(forName);
                            gs3Var = lo5Var;
                            if (a != null) {
                                ir7.f(a.a[0], sb);
                                gs3Var = lo5Var;
                            }
                        }
                    }
                }
                int length = gs3Var.length();
                int F = ug8.F(i);
                if (F == 1) {
                    z = parseBoolean;
                    ir7.e(0, length, 0, gs3Var, sb);
                } else if (F == 2) {
                    z = parseBoolean;
                    if (z5) {
                        ir7.c(0, gs3Var.length(), 0, gs3Var, sb);
                    } else {
                        byte[] bytes = gs3Var.toString().getBytes(forName);
                        ir7.b(bytes.length, 1, sb, bytes);
                    }
                } else if (F != 3) {
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    loop0: while (i9 < length) {
                        while (i9 < length) {
                            if (gs3Var.c(i9)) {
                                ir7.f(gs3Var.b(i9), sb);
                                i9++;
                            } else {
                                int length2 = gs3Var.length();
                                char c4 = '0';
                                if (i9 < length2) {
                                    int i12 = i9;
                                    int i13 = 0;
                                    while (i12 < length2 && !gs3Var.c(i12)) {
                                        char charAt3 = gs3Var.charAt(i12);
                                        if (charAt3 < c4 || charAt3 > '9') {
                                            break;
                                        }
                                        i13++;
                                        i12++;
                                        c4 = '0';
                                    }
                                    i4 = i13;
                                } else {
                                    i4 = 0;
                                }
                                int i14 = 13;
                                if (i4 >= 13) {
                                    sb.append((char) 902);
                                    ir7.d(gs3Var, i9, i4, sb);
                                    i9 += i4;
                                    z3 = parseBoolean;
                                    z4 = z5;
                                    i10 = 2;
                                    i11 = 0;
                                } else {
                                    int length3 = gs3Var.length();
                                    int i15 = i9;
                                    while (true) {
                                        z3 = parseBoolean;
                                        if (i15 >= length3) {
                                            z4 = z5;
                                            break;
                                        }
                                        int i16 = 0;
                                        while (i16 < i14 && i15 < length3 && !gs3Var.c(i15)) {
                                            char charAt4 = gs3Var.charAt(i15);
                                            z4 = z5;
                                            if (charAt4 < '0' || charAt4 > '9') {
                                                i7 = 13;
                                                break;
                                            }
                                            i16++;
                                            i15++;
                                            z5 = z4;
                                            i14 = 13;
                                        }
                                        z4 = z5;
                                        i7 = i14;
                                        if (i16 >= i7) {
                                            i5 = (i15 - i9) - i16;
                                            break;
                                        }
                                        if (i16 <= 0) {
                                            if (gs3Var.c(i15) || ((charAt2 = gs3Var.charAt(i15)) != '\t' && charAt2 != '\n' && charAt2 != '\r' && (charAt2 < ' ' || charAt2 > '~'))) {
                                                break;
                                            }
                                            i15++;
                                        }
                                        parseBoolean = z3;
                                        z5 = z4;
                                        i14 = 13;
                                    }
                                    i5 = i15 - i9;
                                    if (i5 >= 5 || i4 == length) {
                                        if (i10 != 0) {
                                            sb.append((char) 900);
                                            i6 = 0;
                                            i10 = 0;
                                        } else {
                                            i6 = i11;
                                        }
                                        int e2 = ir7.e(i9, i5, i6, gs3Var, sb);
                                        i9 += i5;
                                        i11 = e2;
                                    } else {
                                        Charset charset2 = z4 ? null : forName;
                                        CharsetEncoder newEncoder = charset2 == null ? null : charset2.newEncoder();
                                        int length4 = gs3Var.length();
                                        int i17 = i9;
                                        while (i17 < length4) {
                                            int i18 = i17;
                                            int i19 = 0;
                                            while (i19 < 13 && !gs3Var.c(i18) && (charAt = gs3Var.charAt(i18)) >= '0' && charAt <= '9' && (i18 = i17 + (i19 = i19 + 1)) < length4) {
                                            }
                                            if (i19 >= 13) {
                                                break;
                                            }
                                            if (newEncoder != null && !newEncoder.canEncode(gs3Var.charAt(i17))) {
                                                char charAt5 = gs3Var.charAt(i17);
                                                throw new v30("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                            }
                                            i17++;
                                        }
                                        int i20 = i17 - i9;
                                        if (i20 == 0) {
                                            i20 = 1;
                                        }
                                        byte[] bytes2 = z4 ? null : gs3Var.subSequence(i9, i9 + i20).toString().getBytes(forName);
                                        if (bytes2 != null ? bytes2.length == 1 : i20 == 1) {
                                            if (i10 == 0) {
                                                if (z4) {
                                                    ir7.c(i9, 1, 0, gs3Var, sb);
                                                } else {
                                                    ir7.b(1, 0, sb, bytes2);
                                                }
                                                i9 += i20;
                                            }
                                        }
                                        if (z4) {
                                            ir7.c(i9, i9 + i20, i10, gs3Var, sb);
                                        } else {
                                            ir7.b(bytes2.length, i10, sb, bytes2);
                                        }
                                        i10 = 1;
                                        i11 = 0;
                                        i9 += i20;
                                    }
                                }
                                parseBoolean = z3;
                                z5 = z4;
                            }
                        }
                        break loop0;
                    }
                    z = parseBoolean;
                } else {
                    z = parseBoolean;
                    sb.append((char) 902);
                    ir7.d(gs3Var, 0, length, sb);
                }
                String sb2 = sb.toString();
                int length5 = sb2.length();
                float f2 = 0.0f;
                int[] iArr2 = null;
                int i21 = 2;
                int i22 = 2;
                while (true) {
                    if (i21 > 30) {
                        i21 = i22;
                        break;
                    }
                    int i23 = length5 + 1 + i8;
                    int i24 = i23 / i21;
                    int i25 = i24 + 1;
                    if (i21 * i25 < i23 + i21) {
                        i24 = i25;
                    }
                    if (i24 < 2) {
                        break;
                    }
                    if (i24 <= 30) {
                        float f3 = (((i21 * 17) + 69) * 0.357f) / (i24 * 2.0f);
                        if (iArr2 == null || Math.abs(f3 - 3.0f) <= Math.abs(f2 - 3.0f)) {
                            iArr2 = new int[]{i21, i24};
                            f2 = f3;
                        }
                    }
                    i22 = i21;
                    i21++;
                }
                if (iArr2 == null) {
                    int i26 = length5 + 1 + i8;
                    int i27 = i26 / i21;
                    int i28 = i27 + 1;
                    if (i21 * i28 < i26 + i21) {
                        i27 = i28;
                    }
                    if (i27 < 2) {
                        c2 = 0;
                        c3 = 1;
                        iArr2 = new int[]{2, 2};
                        if (iArr2 != null) {
                            throw new v30("Unable to fit message in columns");
                        }
                        int i29 = iArr2[c2];
                        int i30 = iArr2[c3];
                        int i31 = (i29 * i30) - i8 > length5 + 1 ? (r5 - length5) - 1 : 0;
                        if (length5 + i8 + 1 > 929) {
                            throw new v30("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                        }
                        int i32 = length5 + i31 + 1;
                        StringBuilder sb3 = new StringBuilder(i32);
                        sb3.append((char) i32);
                        sb3.append(sb2);
                        for (int i33 = 0; i33 < i31; i33++) {
                            sb3.append((char) 900);
                        }
                        String sb4 = sb3.toString();
                        if (parseInt2 < 0 || parseInt2 > 8) {
                            w26.j("Error correction level must be between 0 and 8!");
                            return null;
                        }
                        char[] cArr = new char[i8];
                        int length6 = sb4.length();
                        for (int i34 = 0; i34 < length6; i34++) {
                            int i35 = i8 - 1;
                            int charAt6 = (sb4.charAt(i34) + cArr[i35]) % 929;
                            while (true) {
                                iArr = sbd.a;
                                if (i35 >= 1) {
                                    cArr[i35] = (char) ((cArr[i35 - 1] + (929 - ((iArr[parseInt2][i35] * charAt6) % 929))) % 929);
                                    i35--;
                                }
                            }
                            cArr[0] = (char) ((929 - ((charAt6 * iArr[parseInt2][0]) % 929)) % 929);
                        }
                        StringBuilder sb5 = new StringBuilder(i8);
                        for (int i36 = i8 - 1; i36 >= 0; i36--) {
                            char c5 = cArr[i36];
                            if (c5 != 0) {
                                cArr[i36] = (char) (929 - c5);
                            }
                            sb5.append(cArr[i36]);
                        }
                        String sb6 = sb5.toString();
                        af0 af0Var = new af0();
                        af0Var.d = new bf0[i30];
                        for (int i37 = 0; i37 < i30; i37++) {
                            ((bf0[]) af0Var.d)[i37] = new bf0(((i29 + 4) * 17) + 1);
                        }
                        af0Var.c = i29 * 17;
                        af0Var.b = i30;
                        af0Var.a = -1;
                        String concat = sb4.concat(sb6);
                        int i38 = 0;
                        for (int i39 = 0; i39 < i30; i39++) {
                            int i40 = i39 % 3;
                            af0Var.a++;
                            rbd.a(130728, 17, af0Var.b());
                            if (i40 == 0) {
                                int i41 = (i39 / 3) * 30;
                                i2 = ug8.g(i30, 1, 3, i41);
                                i3 = (i29 - 1) + i41;
                            } else if (i40 == 1) {
                                int i42 = (i39 / 3) * 30;
                                int i43 = i30 - 1;
                                int i44 = (parseInt2 * 3) + i42 + (i43 % 3);
                                int i45 = i42 + (i43 / 3);
                                i2 = i44;
                                i3 = i45;
                            } else {
                                int i46 = (i39 / 3) * 30;
                                i2 = (i29 - 1) + i46;
                                i3 = (parseInt2 * 3) + i46 + ((i30 - 1) % 3);
                            }
                            int[][] iArr3 = rbd.a;
                            rbd.a(iArr3[i40][i2], 17, af0Var.b());
                            for (int i47 = 0; i47 < i29; i47++) {
                                rbd.a(iArr3[i40][concat.charAt(i38)], 17, af0Var.b());
                                i38++;
                            }
                            if (z) {
                                rbd.a(260649, 1, af0Var.b());
                            } else {
                                rbd.a(iArr3[i40][i3], 17, af0Var.b());
                                rbd.a(260649, 18, af0Var.b());
                            }
                        }
                        byte[][] d2 = af0Var.d(1, 4);
                        if (d2[0].length < d2.length) {
                            d2 = N3(d2);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int min = Math.min(0 / d2[0].length, 0 / d2.length);
                        if (min <= 1) {
                            return A(d2, parseInt);
                        }
                        byte[][] d3 = af0Var.d(min, min << 2);
                        if (z2) {
                            d3 = N3(d3);
                        }
                        return A(d3, parseInt);
                    }
                }
                c2 = 0;
                c3 = 1;
                if (iArr2 != null) {
                }
            }
            i = 0;
            n24Var = n24.f;
            if (enumMap.containsKey(n24Var)) {
            }
        }
        i = 1;
        n24Var = n24.f;
        if (enumMap.containsKey(n24Var)) {
        }
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // ebc
    public final void o(boolean z, float[] fArr) {
        n40 n40Var = bkb.c5;
        if (n40Var == null) {
            n40Var = new n40();
            bkb.c5 = n40Var;
        }
        n40Var.d(z, fArr);
    }

    @Override // bb2
    public final void p() {
        byte b2 = this.a;
    }

    @Override // al0
    public final float p0() {
        return -1.0f;
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void q0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void q1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // sab
    public final uab r(fm4 fm4Var) {
        char c2;
        String str = fm4Var.t;
        List list = fm4Var.w;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    eq2 eq2Var = new eq2();
                    xu7 xu7Var = new xu7((byte[]) list.get(0));
                    int H = xu7Var.H();
                    int H2 = xu7Var.H();
                    Paint paint = new Paint();
                    eq2Var.a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    eq2Var.b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    eq2Var.c = new Canvas();
                    eq2Var.d = new pr3(719, 575, 0, 719, 0, 575);
                    eq2Var.e = new or3(0, new int[]{0, -1, -16777216, -8421505}, eq2.j(), eq2.k());
                    eq2Var.f = new ur3(H, H2);
                    return eq2Var;
                case 1:
                    return new wtc((byte) 11);
                case 2:
                    gi3 gi3Var = new gi3();
                    gi3Var.a = new xu7();
                    return gi3Var;
                case 3:
                    return new aec((byte) 2);
                case 4:
                    return new q3c(list);
                case 5:
                    return new bma(list);
                case 6:
                    return new tic(list);
                case 7:
                    return new gab();
                case '\b':
                    return new p2c();
            }
        }
        w26.j(b00.h("Unsupported MIME type: ", str));
        return null;
    }

    @Override // bb2
    public final boolean r0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override // al0
    public final float s0() {
        return -1.0f;
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void t() {
        byte b2 = this.a;
    }

    @Override // al0
    public final int t1() {
        return 0;
    }

    @Override // bb2
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void u2() {
        byte b2 = this.a;
    }

    @Override // bv7
    public final Object v(Uri uri, s63 s63Var) {
        return Long.valueOf(g8c.W(new BufferedReader(new InputStreamReader(s63Var)).readLine()));
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // yq3
    public final int w(fm4 fm4Var) {
        return fm4Var.x != null ? 1 : 0;
    }

    @Override // bb2
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final String x(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override // sab
    public final int y(fm4 fm4Var) {
        String str = fm4Var.t;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        w26.j(b00.h("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // bb2
    public final boolean y1() {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final boolean y2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // bb2
    public final void z(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final void z0(gb2 gb2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // bb2
    public final /* synthetic */ boolean z1(k27 k27Var) {
        byte b2 = this.a;
        return oo1.a(k27Var);
    }

    private final void D3() {
    }

    private final void E3() {
    }

    private final void H3() {
    }

    private final void I3() {
    }

    private final void L3() {
    }

    private final void M3() {
    }

    private final void R() {
    }

    private final void R3() {
    }

    private final void S3() {
    }

    private final void T() {
    }

    private final void T2() {
    }

    private final void U2() {
    }

    private final void f2() {
    }

    private final void h2() {
    }

    private final void n0() {
    }

    private final void o0() {
    }

    @Override // yq3
    public final void a() {
    }

    @Override // yq3
    public final void release() {
    }

    private final void A2(gb2 gb2Var) {
    }

    private final void C0(gb2 gb2Var) {
    }

    private final void G0(gb2 gb2Var) {
    }

    private final void J1(gb2 gb2Var) {
    }

    private final void J2(gb2 gb2Var) {
    }

    private final void J3(int i) {
    }

    private final void K2(gb2 gb2Var) {
    }

    private final void K3(int i) {
    }

    private final void L1(gb2 gb2Var) {
    }

    private final void L2(gb2 gb2Var) {
    }

    private final void M2(gb2 gb2Var) {
    }

    private final void N2(gb2 gb2Var) {
    }

    private final void O0(gb2 gb2Var) {
    }

    private final void O2(gb2 gb2Var) {
    }

    private final void O3(k27 k27Var) {
    }

    private final void P0(gb2 gb2Var) {
    }

    private final void P1(gb2 gb2Var) {
    }

    private final void P3(k27 k27Var) {
    }

    private final void Q0(h27 h27Var) {
    }

    private final void Q1(gb2 gb2Var) {
    }

    private final void R0(h27 h27Var) {
    }

    private final void R2(gb2 gb2Var) {
    }

    private final void S0(gb2 gb2Var) {
    }

    private final void S2(gb2 gb2Var) {
    }

    private final void W0(gb2 gb2Var) {
    }

    private final void Z(gb2 gb2Var) {
    }

    private final void a0(gb2 gb2Var) {
    }

    private final void b3(String str) {
    }

    private final void c3(String str) {
    }

    private final void f0(gb2 gb2Var) {
    }

    private final void f1(gb2 gb2Var) {
    }

    private final void g0(gb2 gb2Var) {
    }

    private final void g1(gb2 gb2Var) {
    }

    private final void h3(gb2 gb2Var) {
    }

    private final void i3(gb2 gb2Var) {
    }

    private final void l3(gb2 gb2Var) {
    }

    private final void m3(gb2 gb2Var) {
    }

    private final void n3(k27 k27Var) {
    }

    private final void o1(gb2 gb2Var) {
    }

    private final void o3(k27 k27Var) {
    }

    private final void p1(gb2 gb2Var) {
    }

    private final void p3(gb2 gb2Var) {
    }

    private final void q3(gb2 gb2Var) {
    }

    private final void t0(gb2 gb2Var) {
    }

    private final void t3(gb2 gb2Var) {
    }

    private final void u3(gb2 gb2Var) {
    }

    private final void x0(gb2 gb2Var) {
    }

    private final void z2(gb2 gb2Var) {
    }

    private final void A0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B1(gb2 gb2Var, int i) {
    }

    private final void B3(gb2 gb2Var, boolean z) {
    }

    private final void D2(String str, String str2) {
    }

    private final void E1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void F2(String str, String str2) {
    }

    private final void G(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void H1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void J(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V1(gb2 gb2Var, int i) {
    }

    private final void Z0(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void a2(gb2 gb2Var, int i) {
    }

    private final void d3(gb2 gb2Var, long j) {
    }

    private final void e1(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void e3(gb2 gb2Var, long j) {
    }

    private final void j1(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k1(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r3(gb2 gb2Var, k08 k08Var) {
    }

    private final void s3(gb2 gb2Var, k08 k08Var) {
    }

    private final void v3(gb2 gb2Var, boolean z) {
    }

    private final void w1(gb2 gb2Var, int i) {
    }

    private final void x3(gb2 gb2Var, boolean z) {
    }

    private final void y0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void z3(gb2 gb2Var, boolean z) {
    }

    @Override // yq3
    public final void u(Looper looper, uc8 uc8Var) {
    }

    private final void A3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void B(gb2 gb2Var, float f2, float f3) {
    }

    private final void C(gb2 gb2Var, float f2, float f3) {
    }

    private final void C3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void G2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void I2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void K0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void L0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void P2(gb2 gb2Var, float f2, float f3) {
    }

    private final void Q2(gb2 gb2Var, float f2, float f3) {
    }

    private final void V2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void W2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void j3(gb2 gb2Var, float f2, float f3) {
    }

    private final void k3(gb2 gb2Var, float f2, float f3) {
    }

    private final void m2(gb2 gb2Var, float f2, float f3) {
    }

    private final void n2(gb2 gb2Var, float f2, float f3) {
    }

    private final void s1(gb2 gb2Var, int i, int i2) {
    }

    private final void u1(gb2 gb2Var, int i, int i2) {
    }

    private final void w3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void y3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void S1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void U1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void X2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Y2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Z2(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void a3(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void o2(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void p2(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void f3(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void g3(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void q2(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void r2(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void t2(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void w2(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void H0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void I0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void F3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void G3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
