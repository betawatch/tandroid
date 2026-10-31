package hb;

import a3.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.b2;
import b2.w0;
import c3.b0;
import c3.g;
import c3.p;
import c3.t;
import c5.x;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.v;
import g2.y;
import gf.f;
import ib.b;
import j7.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;
import ki.h;
import li.c0;
import n6.k;
import org.telegram.messenger.c20;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.o61;
import org.telegram.ui.qs0;
import r4.c;
import r9.d;
import z3.m;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements n0, g, fa.a, d, s, h, k, o61, l1, c, uf.a, v9.a, ai, x3.g, cn0, z3.k {
    public static a b;
    public static a c;
    public static a d;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static short B0(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    public static void E0(String str) {
        if (str == null || str.length() == 0) {
            throw new nc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new nc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static Calendar k0() {
        if (c == null) {
            c = new a(18);
        }
        c.getClass();
        return Calendar.getInstance();
    }

    public static k4.d p0(c0 c0Var, x xVar) {
        IOException iOException = (IOException) xVar.c;
        if (!(iOException instanceof y)) {
            return null;
        }
        int i10 = ((y) iOException).c;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (c0Var.a(1)) {
            return new k4.d(1, 300000L);
        }
        if (c0Var.a(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    public static long t0(x xVar) {
        for (Throwable th2 = (IOException) xVar.c; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof v) || (th2 instanceof y2.k)) {
                return -9223372036854775807L;
            }
            if ((th2 instanceof g2.k) && ((g2.k) th2).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((xVar.b - 1) * 1000, 5000);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.o61
    public void B(boolean z10, float[] fArr) {
        t6.A0().e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // x3.g
    public b0 E() {
        return new t(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // z3.k
    public boolean F(b2.x xVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        return null;
    }

    @Override // v9.a
    public void I(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        switch (this.a) {
            case 7:
                return new ib.c(dVar.J(b.class));
            default:
                return new b(dVar.c(a.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        return f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((e) obj).v();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // n6.k
    public /* bridge */ /* synthetic */ Object e(q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // fa.a
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.o61
    public boolean k() {
        return t6.A0().i != null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override // z3.k
    public m m(b2.x xVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    @Override // r4.c
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public int q0(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // r4.c
    public void r(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // uf.a
    public int t1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // uf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(B0(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // x3.g
    public long w(p pVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // z3.k
    public int y(b2.x xVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        return null;
    }

    public /* synthetic */ a(j7.a aVar) {
        this.a = 9;
    }

    public a() {
        this.a = 11;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // a3.n0
    public /* synthetic */ void V() {
    }

    @Override // a3.n0
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Components.cn0
    public void finish() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // a3.n0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.cn0
    public void L(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.cn0
    public void a(float f7) {
    }

    @Override // x3.g
    public void b0(long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // a3.n0
    public /* synthetic */ void d(b2 b2Var) {
    }

    @Override // c3.g
    public long g(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(q1 q1Var) {
    }

    @Override // ki.h
    public void u(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override // ki.h
    public void b(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
