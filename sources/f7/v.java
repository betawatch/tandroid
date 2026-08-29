package f7;

import a4.c0;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import bg.y3;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j3.t1;
import j7.l1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v implements a4.m, androidx.car.app.messaging.model.b, a9.e, e9.a, Continuation, h3.a, k6.c, w, mf.a, n9.b, nf.a, o9.a, zn0, j1, pa.m, r4.q, com.google.android.gms.common.api.internal.s, a3.b {
    public static v b;
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i10) {
        this.a = i10;
    }

    public static long D(p2.u uVar) {
        Throwable th2 = (IOException) uVar.c;
        if ((th2 instanceof t1) || (th2 instanceof FileNotFoundException) || (th2 instanceof e0) || (th2 instanceof p0)) {
            return -9223372036854775807L;
        }
        int i10 = com.google.android.exoplayer2.upstream.n.b;
        while (th2 != null) {
            if ((th2 instanceof com.google.android.exoplayer2.upstream.n) && ((com.google.android.exoplayer2.upstream.n) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((uVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    public static MediaCodec q(a4.l lVar) {
        lVar.a.getClass();
        String str = lVar.a.a;
        f5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        f5.a.q();
        return createByCodecName;
    }

    public static n9.a r(ya.a aVar) {
        return new n9.a(System.currentTimeMillis() + 3600000, new a5.c(8), new kb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static k0 z(j0 j0Var, p2.u uVar) {
        IOException iOException = (IOException) uVar.c;
        if (!(iOException instanceof h0)) {
            return null;
        }
        int i10 = ((h0) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (j0Var.a(1)) {
            return new k0(1, 300000L);
        }
        if (j0Var.a(2)) {
            return new k0(2, 60000L);
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        return false;
    }

    public int B(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        switch (this.a) {
            case 5:
                return new db.a();
            default:
                return new ab.d(jVar.c(ab.i.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // mf.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        y3.b = f9 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // e9.a
    public void a(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v6.d dVar = (v6.d) ((v6.e) obj).u();
        n6.b bVar = new n6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = v6.c.a;
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

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // n9.b
    public n9.a d(ya.a aVar, JSONObject jSONObject) {
        return r(aVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // h3.a
    public long e() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // pc.a
    public Object get() {
        return new h6.a(Executors.newSingleThreadExecutor());
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // l.w
    public boolean h(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // k6.c
    public int i(Context context, String str, boolean z10) {
        return k6.e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // k6.c
    public int l(Context context, String str) {
        return k6.e.a(context, str);
    }

    @Override // o9.a
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        return false;
    }

    @Override // pa.m
    public Object p2() {
        switch (this.a) {
            case 20:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // r4.q
    public s0 q0(r4.m mVar, r4.j jVar) {
        return new r4.p(mVar, jVar);
    }

    @Override // nf.a
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(l1.k(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f9 = remaining;
        float f10 = f9 / f9;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f9;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        return false;
    }

    @Override // r4.q
    public s0 v1() {
        return new r4.p(r4.m.n, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // a4.m
    public a4.n x(a4.l lVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = q(lVar);
            f5.a.c("configureCodec");
            mediaCodec.configure(lVar.b, lVar.d, lVar.e, 0);
            f5.a.q();
            f5.a.c("startCodec");
            mediaCodec.start();
            f5.a.q();
            return new c0(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        return null;
    }

    public /* synthetic */ v(v6.a aVar) {
        this.a = 23;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, hh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
    }

    @Override // mf.a
    public int M1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
