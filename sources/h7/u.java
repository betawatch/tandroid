package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.tasks.OnFailureListener;
import d4.w;
import g5.o0;
import h5.d0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kf.k0;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class u implements s0, OnFailureListener, w, c9.f, h3.a, m6.c, nf.a, of.a, j1, p9.c, q9.a, o0, ra.m {
    public static u b;
    public static u c;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    @Override // d4.w
    public boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // p9.c
    public p9.b K(cb.b bVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        c5.c cVar = jSONObject.has("session") ? new c5.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new c5.c(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new p9.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), cVar, new mb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // nf.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // d4.w
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 b(Class cls) {
        switch (this.a) {
            case 2:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // d4.w
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // d4.w
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        switch (this.a) {
            case 6:
                return new fb.a();
            default:
                return new cb.d(jVar.c(cb.i.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // m6.c
    public int h(Context context, String str, boolean z4) {
        return m6.e.d(context, str, z4);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // g5.o0
    public Object k(Uri uri, g5.o oVar) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // h3.a
    public long l() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
        int i10 = this.a;
    }

    public Signature[] n3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // androidx.lifecycle.s0
    public p0 p(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return b(cls);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // of.a
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(k0.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f10 = ceil;
        float f11 = f10 / f10;
        float f12 = i13;
        float f13 = f12 / f12;
        while (ceil > 0 && i13 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f11 = ceil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f13 = i13 / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object u2() {
        return new ConcurrentSkipListMap();
    }

    @Override // q9.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
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
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // d4.w
    public int x() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // m6.c
    public int z(Context context, String str) {
        return m6.e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B1() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C1() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void J() {
    }

    private final /* synthetic */ void V() {
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void j0() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void H0(s1 s1Var) {
    }

    private final /* synthetic */ void J0(s1 s1Var) {
    }

    private final /* synthetic */ void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void O0(s1 s1Var) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void P0(s1 s1Var) {
    }

    private final /* synthetic */ void T2(s1 s1Var) {
    }

    private final /* synthetic */ void U2(s1 s1Var) {
    }

    private final /* synthetic */ void V0(s1 s1Var) {
    }

    private final /* synthetic */ void X(s1 s1Var) {
    }

    private final /* synthetic */ void X2(s1 s1Var) {
    }

    private final /* synthetic */ void Y(s1 s1Var) {
    }

    private final /* synthetic */ void Y0(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(s1 s1Var) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void b3(s1 s1Var) {
    }

    private final /* synthetic */ void c3(s1 s1Var) {
    }

    private final /* synthetic */ void d2(s1 s1Var) {
    }

    private final /* synthetic */ void e0(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void f3(s1 s1Var) {
    }

    private final /* synthetic */ void g1(s1 s1Var) {
    }

    private final /* synthetic */ void g3(s1 s1Var) {
    }

    private final /* synthetic */ void h2(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m0(s1 s1Var) {
    }

    private final /* synthetic */ void m2(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void n0(s1 s1Var) {
    }

    private final /* synthetic */ void n2(s1 s1Var) {
    }

    private final /* synthetic */ void o2(s1 s1Var) {
    }

    private final /* synthetic */ void p2(s1 s1Var) {
    }

    private final /* synthetic */ void q1(s1 s1Var) {
    }

    private final /* synthetic */ void q2(s1 s1Var) {
    }

    private final /* synthetic */ void r0(s1 s1Var) {
    }

    private final /* synthetic */ void s1(s1 s1Var) {
    }

    private final /* synthetic */ void t1(s1 s1Var) {
    }

    private final /* synthetic */ void t2(s1 s1Var) {
    }

    private final /* synthetic */ void u0(s1 s1Var) {
    }

    private final /* synthetic */ void u3(int i10) {
    }

    private final /* synthetic */ void v1(s1 s1Var) {
    }

    private final /* synthetic */ void v3(int i10) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void A1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void H(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void P2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void Q0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Z0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void e3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void i2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void i3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void k1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void k3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void l1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void n1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void y1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void C(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void C0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void D(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void D1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void E1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void H2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void I2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void V2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void W2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void i1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void j1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void w2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void y2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void z0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // nf.a
    public int P1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void G1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void J1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void J2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void w1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void x1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void N1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void X1(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void b2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void w0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void x0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
