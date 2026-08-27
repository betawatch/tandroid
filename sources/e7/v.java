package e7;

import android.content.Context;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.d0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.t5;
import org.telegram.ui.hn;
import org.telegram.ui.ou0;
import p8.l0;
import p8.z;
import y3.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v implements androidx.car.app.messaging.model.b, Continuation, com.google.android.exoplayer2.upstream.l, f3.a, j6.d, ke.b, kf.a, lf.a, m3.c, m9.b, n9.a, oa.m, ag, j1, t0, mg.a, z8.d, y3.j, OnFailureListener {
    public static v b;
    public static v c;
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i10) {
        this.a = i10;
    }

    public static MediaCodec r2(y3.i iVar) {
        iVar.a.getClass();
        String str = iVar.a.a;
        d5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        d5.a.q();
        return createByCodecName;
    }

    public static Calendar s2() {
        if (c == null) {
            c = new v(7);
        }
        c.getClass();
        return Calendar.getInstance();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // kf.a
    public int C1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // kf.a
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // f3.a
    public long E() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // mg.a
    public int J1() {
        return 0;
    }

    @Override // mg.a
    public int K0() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ hn P() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ int P0() {
        return 0;
    }

    @Override // m9.b
    public m9.a P1(ab.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar2 = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new m9.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar2, new jb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // ke.b
    public ke.a V0(g5.b bVar) {
        return new ge.j(bVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ boolean X0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, s1 s1Var) {
        return false;
    }

    @Override // j6.d
    public b8.b Y1(Context context, String str, j6.c cVar) {
        b8.b bVar = new b8.b();
        int g10 = cVar.g(context, str, true);
        bVar.b = g10;
        if (g10 != 0) {
            bVar.c = 1;
            return bVar;
        }
        int A = cVar.A(context, str);
        bVar.a = A;
        if (A != 0) {
            bVar.c = -1;
        }
        return bVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // n9.a
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ag
    public boolean b1() {
        return false;
    }

    @Override // lf.a
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            lf.a.q.c0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            lf.a.p.c0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new d0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // oa.m
    public Object f2() {
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean g2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        return null;
    }

    @Override // mg.a
    public int h0() {
        return 872415231;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ int i() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ TLRPC.Peer l() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // mg.a
    public int p2() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        return false;
    }

    @Override // y3.j
    public y3.k t1(y3.i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = r2(iVar);
            d5.a.c("configureCodec");
            mediaCodec.configure(iVar.b, iVar.d, iVar.e, 0);
            d5.a.q();
            d5.a.c("startCodec");
            mediaCodec.start();
            d5.a.q();
            return new x(mediaCodec);
        } catch (IOException | RuntimeException e9) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e9;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        switch (this.a) {
            case 24:
                return new za.h();
            default:
                synchronized (t.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    t.d(new o());
                }
                return new xa.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ n2 y0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public v() {
        this.a = 8;
        p8.x xVar = z.b;
        l0 l0Var = l0.e;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.Components.ag
    public void U1() {
    }

    @Override // org.telegram.ui.Components.ag
    public void c() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.ag
    public void e2() {
    }

    @Override // org.telegram.ui.Components.ag
    public void f1() {
    }

    @Override // org.telegram.ui.Components.ag
    public void g0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.ag
    public void k1() {
    }

    @Override // org.telegram.ui.Components.ag
    public void l2() {
    }

    @Override // org.telegram.ui.Components.ag
    public void m() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.ag
    public void q2() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ag
    public void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.ag
    public void w1() {
    }

    @Override // m3.c
    public long B(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Components.ag
    public void G(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void I(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void K(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ag
    public void N0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void S(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.ag
    public void S1(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ag
    public void W1(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void n(float f10) {
    }

    @Override // org.telegram.ui.Components.ag
    public void n1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void p1(long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void q1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.ag
    public /* synthetic */ void r(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Components.ag
    public void A(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void C(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void T1(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Components.ag
    public void o0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void A1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void J(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Z0(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.ag
    public void c1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.ag
    public void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void j2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.ag
    public void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.ag
    public void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
