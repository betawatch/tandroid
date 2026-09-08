package na;

import a3.l;
import a3.m0;
import ah.u;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fb.n;
import g2.t;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.x;
import n6.k;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.i71;
import org.telegram.ui.ov0;
import org.telegram.ui.yd;
import p2.r;
import p2.s;
import qb.h;
import y2.j;
import y2.o;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements m0, i71, bg.a, c3.g, cg.a, ea.a, n, g2.g, eh.a, x, k, q9.d, eo0, k1, s, OnFailureListener, r4.c, u9.a, SuccessContinuation, x9.c, y6.d, j {
    public static d a;

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // ea.a
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
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
            i10 = i11;
            i13 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        return new qb.d(cVar.c(h.class));
    }

    @Override // bg.a
    public int E1(int i10, int i11, int i12) {
        return (i11 == 6 ? bg.a.l : i11 > i12 ? bg.a.i : i11 < i12 ? bg.a.j : bg.a.k).E1(i10, i11, i12);
    }

    @Override // eh.a
    public int G() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        return false;
    }

    @Override // eh.a
    public int J() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // bg.a
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? bg.a.l : i10 > i11 ? bg.a.i : i10 < i11 ? bg.a.j : bg.a.k).O0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        return false;
    }

    @Override // p2.s
    public o U() {
        return new r(p2.o.n, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        yd.b = f7 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X0(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // y2.j
    public void a() {
        synchronized (z2.c.a) {
            Object obj = z2.c.b;
            synchronized (obj) {
                if (z2.c.c) {
                    return;
                }
                long a2 = z2.c.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.c.d = a2;
                    z2.c.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // u9.a
    public void b0(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new t(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // x9.c
    public String e() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int f0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // y6.d
    public l h(Context context, String str, y6.c cVar) {
        l lVar = new l();
        int b10 = cVar.b(context, str, true);
        lVar.b = b10;
        if (b10 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int e7 = cVar.e(context, str);
        lVar.a = e7;
        if (e7 != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // fb.n
    public Object h2() {
        return new ConcurrentSkipListMap();
    }

    @Override // p2.s
    public o i0(p2.o oVar, p2.l lVar) {
        return new r(oVar, lVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        return false;
    }

    @Override // n6.k
    public /* bridge */ /* synthetic */ Object k(q qVar) {
        return null;
    }

    @Override // eh.a
    public int k0() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(z5 z5Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // eh.a
    public int p() {
        return 872415231;
    }

    @Override // l.x
    public boolean q(l.l lVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 q2() {
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // cg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // a3.m0
    public /* synthetic */ void H() {
    }

    @Override // a3.m0
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // y2.j
    public void W() {
    }

    @Override // x9.c
    public void b() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
    }

    @Override // a3.m0
    public /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // a3.m0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // r4.c
    public void v() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(t1 t1Var) {
    }

    @Override // c3.g
    public long l(long j3) {
        return j3;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, u uVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, long j3) {
    }

    @Override // l.x
    public void d(l.l lVar, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, boolean z10) {
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
