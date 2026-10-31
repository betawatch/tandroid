package jb;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x;
import c3.b0;
import c3.k0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import n2.y;
import org.telegram.messenger.c20;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;
import org.telegram.ui.qs0;
import p2.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements c3.q, fa.a, r9.d, OnFailureListener, n2.m, sf, l1, t, r0.q, Continuation, uf.a, vf.a, s0, y6.c, y2.i {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static String A4(uc.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static final CharSequence F4(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.m
    public n2.g B0(n2.j jVar, x xVar) {
        if (xVar.w == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new y()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 E0(Class cls, v1.b bVar) {
        return d(cls);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, c20 c20Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, s2 s2Var) {
        int i10 = this.a;
    }

    @Override // c3.q
    public void G1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ int H0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public k0 I1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
        int i10 = this.a;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        return new d(dVar.c(h.class));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // vf.a
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            vf.a.A.L(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            vf.a.z.L(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(q1 q1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p2.t
    public y2.n M1() {
        return new p2.s(p2.p.n, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public void Q0() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        int i10 = this.a;
        return f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(q1 q1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Components.sf
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(q1 q1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p2.t
    public y2.n a2(p2.p pVar, p2.m mVar) {
        return new p2.s(pVar, mVar);
    }

    @Override // y2.i
    public void b() {
        synchronized (z2.b.a) {
            Object obj = z2.b.b;
            synchronized (obj) {
                if (z2.b.c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ kn b0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(q1 q1Var, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 d(Class cls) {
        return new w1.b();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // fa.a
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i13 = 1;
            i10 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(q1 q1Var, int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // n2.m
    public /* synthetic */ n2.l p(n2.j jVar, x xVar) {
        return n2.l.l;
    }

    @Override // y6.c
    public int p0(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ int r() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // n2.m
    public int t0(x xVar) {
        return xVar.w != null ? 1 : 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TLRPC.Peer u() {
        return null;
    }

    @Override // uf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        switch (this.a) {
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // y6.c
    public int x1(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    public /* synthetic */ b(Context context, int i10) {
        this.a = i10;
    }

    private final /* synthetic */ void D4() {
    }

    private final /* synthetic */ void E4() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void H3() {
    }

    private final /* synthetic */ void g3() {
    }

    private final /* synthetic */ void h3() {
    }

    private final /* synthetic */ void m2() {
    }

    private final /* synthetic */ void n2() {
    }

    private final /* synthetic */ void q4() {
    }

    private final /* synthetic */ void r4() {
    }

    private final /* synthetic */ void s2() {
    }

    private final /* synthetic */ void t2() {
    }

    private final /* synthetic */ void u4() {
    }

    private final /* synthetic */ void v4() {
    }

    private final /* synthetic */ void y4() {
    }

    private final /* synthetic */ void z4() {
    }

    @Override // org.telegram.ui.Components.sf
    public void C() {
    }

    @Override // org.telegram.ui.Components.sf
    public void D() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void O1() {
    }

    @Override // y2.i
    public void R1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void T1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.sf
    public void X0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void Y1() {
    }

    @Override // n2.m
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void d1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void d2() {
    }

    @Override // org.telegram.ui.Components.sf
    public void e() {
    }

    @Override // org.telegram.ui.Components.sf
    public void h2() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void j0() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void o1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void q0() {
    }

    @Override // n2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void w() {
    }

    private final /* synthetic */ void A3(q1 q1Var) {
    }

    private final /* synthetic */ void B3(q1 q1Var) {
    }

    private final /* synthetic */ void B4(jj jjVar) {
    }

    private final /* synthetic */ void C4(jj jjVar) {
    }

    private final /* synthetic */ void E2(q1 q1Var) {
    }

    private final /* synthetic */ void E3(q1 q1Var) {
    }

    private final /* synthetic */ void F2(q1 q1Var) {
    }

    private final /* synthetic */ void F3(q1 q1Var) {
    }

    private final /* synthetic */ void G2(gj gjVar) {
    }

    private final /* synthetic */ void H2(gj gjVar) {
    }

    private final /* synthetic */ void I2(q1 q1Var) {
    }

    private final /* synthetic */ void J2(q1 q1Var) {
    }

    private final /* synthetic */ void M2(q1 q1Var) {
    }

    private final /* synthetic */ void N2(q1 q1Var) {
    }

    private final /* synthetic */ void O3(String str) {
    }

    private final /* synthetic */ void P3(String str) {
    }

    private final /* synthetic */ void Q2(q1 q1Var) {
    }

    private final /* synthetic */ void R2(q1 q1Var) {
    }

    private final /* synthetic */ void U3(q1 q1Var) {
    }

    private final /* synthetic */ void V3(q1 q1Var) {
    }

    private final /* synthetic */ void Y2(q1 q1Var) {
    }

    private final /* synthetic */ void Y3(q1 q1Var) {
    }

    private final /* synthetic */ void Z2(q1 q1Var) {
    }

    private final /* synthetic */ void Z3(q1 q1Var) {
    }

    private final /* synthetic */ void a3(q1 q1Var) {
    }

    private final /* synthetic */ void a4(jj jjVar) {
    }

    private final /* synthetic */ void b3(q1 q1Var) {
    }

    private final /* synthetic */ void b4(jj jjVar) {
    }

    private final /* synthetic */ void c4(q1 q1Var) {
    }

    private final /* synthetic */ void d4(q1 q1Var) {
    }

    private final /* synthetic */ void g4(q1 q1Var) {
    }

    private final /* synthetic */ void h4(q1 q1Var) {
    }

    private final /* synthetic */ void m4(q1 q1Var) {
    }

    private final /* synthetic */ void o2(q1 q1Var) {
    }

    private final /* synthetic */ void o4(q1 q1Var) {
    }

    private final /* synthetic */ void p2(q1 q1Var) {
    }

    private final /* synthetic */ void q2(q1 q1Var) {
    }

    private final /* synthetic */ void q3(q1 q1Var) {
    }

    private final /* synthetic */ void r2(q1 q1Var) {
    }

    private final /* synthetic */ void r3(q1 q1Var) {
    }

    private final /* synthetic */ void u2(q1 q1Var) {
    }

    private final /* synthetic */ void v2(q1 q1Var) {
    }

    private final /* synthetic */ void w3(q1 q1Var) {
    }

    private final /* synthetic */ void w4(int i10) {
    }

    private final /* synthetic */ void x3(q1 q1Var) {
    }

    private final /* synthetic */ void x4(int i10) {
    }

    private final /* synthetic */ void y2(q1 q1Var) {
    }

    private final /* synthetic */ void y3(q1 q1Var) {
    }

    private final /* synthetic */ void z2(q1 q1Var) {
    }

    private final /* synthetic */ void z3(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void G0(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void Q1(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void U1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void V(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void y(float f7) {
    }

    private final /* synthetic */ void K2(q1 q1Var, s2 s2Var) {
    }

    private final /* synthetic */ void L2(q1 q1Var, s2 s2Var) {
    }

    private final /* synthetic */ void O2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void P2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void Q3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void R3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void U2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void V2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void W2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void X2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void e3(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void e4(q1 q1Var, c20 c20Var) {
    }

    private final /* synthetic */ void f3(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void f4(q1 q1Var, c20 c20Var) {
    }

    private final /* synthetic */ void i4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void k2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void l2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void s3(String str, String str2) {
    }

    private final /* synthetic */ void t3(String str, String str2) {
    }

    private final /* synthetic */ void u3(q1 q1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void v3(q1 q1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void w2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void x2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.sf
    public void I(float f7, int i10) {
    }

    @Override // n2.m
    public void g(Looper looper, j2.l lVar) {
    }

    private final /* synthetic */ void C2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void C3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void D2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void D3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void I3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void J3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void S2(q1 q1Var, int i10, int i11) {
    }

    private final /* synthetic */ void T2(q1 q1Var, int i10, int i11) {
    }

    private final /* synthetic */ void W3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void i2(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void i3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void j2(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void j3(q1 q1Var, float f7, float f10) {
    }

    private final void j4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void l4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void n4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void p4(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.sf
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.sf
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // uf.a
    public int t1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void K3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void L3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void M3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void N3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void c3(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void d3(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void k3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void l3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.q
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.q
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final /* synthetic */ void S3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void T3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void m3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void n3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void o3(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void p3(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    private final /* synthetic */ void A2(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void B2(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    private final /* synthetic */ void s4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void t4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
