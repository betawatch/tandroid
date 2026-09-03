package ab;

import a4.h;
import af.g;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import c9.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.i;
import d4.j;
import d4.k;
import d4.z;
import g5.b0;
import g5.e0;
import g5.g0;
import g5.j0;
import g5.l0;
import g5.n;
import g5.o0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import kh.f;
import l7.w0;
import m6.d;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
import p2.v;
import p9.b;
import r0.s;
import ra.m;
import u4.l;
import u4.o;
import u4.p;
import x6.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements h, OnFailureListener, j, Continuation, j0, kf.a, d, of.a, k1, b, s, m, p, com.google.android.gms.common.api.internal.s, e {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static c4.e m3(g0 g0Var, v vVar) {
        IOException iOException = (IOException) vVar.c;
        if (!(iOException instanceof e0)) {
            return null;
        }
        int i10 = ((e0) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (g0Var.a(1)) {
            return new c4.e(1, 300000L);
        }
        if (g0Var.a(2)) {
            return new c4.e(2, 60000L);
        }
        return null;
    }

    public static long o3(v vVar) {
        Throwable th2 = (IOException) vVar.c;
        if ((th2 instanceof r1) || (th2 instanceof FileNotFoundException) || (th2 instanceof b0) || (th2 instanceof l0)) {
            return -9223372036854775807L;
        }
        int i10 = n.b;
        while (th2 != null) {
            if ((th2 instanceof n) && ((n) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((vVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p3(q1.b bVar, Editable editable, int i10, int i11, boolean z4) {
        int min;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int max = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z10) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z10 = true;
                                    }
                                } else if (!z10) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i11, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z11 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    min = Math.min(selectionEnd + i11, editable.length());
                }
                androidx.emoji2.text.v[] vVarArr = (androidx.emoji2.text.v[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (androidx.emoji2.text.v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static MediaCodec w(i iVar) {
        iVar.a.getClass();
        String str = iVar.a.a;
        h5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        h5.a.q();
        return createByCodecName;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // d4.j
    public k A1(i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = w(iVar);
            h5.a.c("configureCodec");
            mediaCodec.configure(iVar.b, iVar.d, iVar.e, 0);
            h5.a.q();
            h5.a.c("startCodec");
            mediaCodec.start();
            h5.a.q();
            return new z(mediaCodec);
        } catch (IOException | RuntimeException e6) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e6;
        }
    }

    @Override // u4.p
    public o0 B(l lVar, u4.i iVar) {
        return new o(lVar, iVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // u4.p
    public o0 G() {
        return new o(l.n, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean H1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void I0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 I2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q(t1 t1Var, f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle W1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // of.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vg.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // g5.j0
    public void a() {
        synchronized (h5.a.h) {
            Object obj = h5.a.i;
            synchronized (obj) {
                if (h5.a.j) {
                    return;
                }
                long a2 = h5.a.a();
                synchronized (obj) {
                    h5.a.k = a2;
                    h5.a.j = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a2() {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        x6.d dVar = (x6.d) ((x6.e) obj).u();
        p6.b bVar = new p6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = c.a;
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

    @Override // kf.a
    public boolean b(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b1(t1 t1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // a4.h
    public long c(r3.l lVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        cb.a aVar = new cb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(1);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new cb.n(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new androidx.biometric.k(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p9.b
    public p9.a f(db.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        c5.c cVar = jSONObject.has("session") ? new c5.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new c5.c(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new p9.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), cVar, new mb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ cv0 g2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // a4.h
    public r3.s h() {
        return new r3.n(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // m6.d
    public e8.a k(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        int u10 = cVar.u(context, str, true);
        aVar.b = u10;
        if (u10 != 0) {
            aVar.c = 1;
            return aVar;
        }
        int G = cVar.G(context, str);
        aVar.a = G;
        if (G != 0) {
            aVar.c = -1;
        }
        return aVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        switch (this.a) {
        }
        return false;
    }

    public int n3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // kf.a
    public boolean p(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 6:
                if (!task.isSuccessful()) {
                    Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                    break;
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object y2() {
        switch (this.a) {
            case 22:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z2() {
        int i10 = this.a;
    }

    public /* synthetic */ a(x6.a aVar) {
        this.a = 25;
    }

    public a(Context context, r3.i iVar) {
        this.a = 14;
        f7.b bVar = new f7.b(context, 4);
        w0 w0Var = new w0(iVar, 16);
        if (bVar != ((f7.b) w0Var.d)) {
            w0Var.d = bVar;
            ((HashMap) w0Var.b).clear();
            ((HashMap) w0Var.c).clear();
        }
    }

    private final /* synthetic */ void A2() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void I() {
    }

    private final /* synthetic */ void J() {
    }

    private final /* synthetic */ void b0() {
    }

    private final /* synthetic */ void d0() {
    }

    private final /* synthetic */ void q3() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void u3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void x2() {
    }

    private final /* synthetic */ void y1() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void z1() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // g5.j0
    public void l() {
    }

    private final /* synthetic */ void A3(MessageObject messageObject) {
    }

    private final /* synthetic */ void B0(t1 t1Var) {
    }

    private final /* synthetic */ void B3(MessageObject messageObject) {
    }

    private final /* synthetic */ void E0(t1 t1Var) {
    }

    private final /* synthetic */ void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void J0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void L0(t1 t1Var) {
    }

    private final /* synthetic */ void M0(t1 t1Var) {
    }

    private final /* synthetic */ void M2(String str) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void Q0(t1 t1Var) {
    }

    private final /* synthetic */ void Q1(t1 t1Var) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void T0(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void U(t1 t1Var) {
    }

    private final /* synthetic */ void V1(t1 t1Var) {
    }

    private final /* synthetic */ void W(t1 t1Var) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void X(t1 t1Var) {
    }

    private final /* synthetic */ void X2(t1 t1Var) {
    }

    private final /* synthetic */ void Y(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z0(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void b3(t1 t1Var) {
    }

    private final /* synthetic */ void e1(t1 t1Var) {
    }

    private final /* synthetic */ void e3(t1 t1Var) {
    }

    private final /* synthetic */ void f2(t1 t1Var) {
    }

    private final /* synthetic */ void f3(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final /* synthetic */ void h0(t1 t1Var) {
    }

    private final /* synthetic */ void h2(t1 t1Var) {
    }

    private final /* synthetic */ void i2(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final /* synthetic */ void j0(t1 t1Var) {
    }

    private final /* synthetic */ void k3(t1 t1Var) {
    }

    private final /* synthetic */ void l3(t1 t1Var) {
    }

    private final /* synthetic */ void m2(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void n2(t1 t1Var) {
    }

    private final /* synthetic */ void o1(t1 t1Var) {
    }

    private final /* synthetic */ void p2(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void r0(t1 t1Var) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void t0(t1 t1Var) {
    }

    private final /* synthetic */ void t2(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void w3(int i10) {
    }

    private final /* synthetic */ void x3(int i10) {
    }

    @Override // a4.h
    public void u(long j10) {
    }

    private final /* synthetic */ void C(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void O2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void P0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void P2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void V0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void Y0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void Z1(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void b2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void c3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void d3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void h3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void i1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void j1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void j3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void k1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void l1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void w1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void x1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void A(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void C1(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void C2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void D1(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void D2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void U2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void V2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void f1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void h1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void r2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void s2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void w0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void x(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void y0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // of.a
    public int S1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void E1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void F1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void F2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void L2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void t1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void u1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // r0.s
    public void onScrollLimit(int i10, int i11, int i12, boolean z4) {
    }

    @Override // r0.s
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final /* synthetic */ void G1(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void I1(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void K1(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void M1(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void R2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void u0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void v0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
