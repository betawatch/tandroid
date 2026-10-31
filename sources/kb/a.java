package kb;

import ae.j;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.v;
import c3.b0;
import c3.k0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.l0;
import ea.b;
import ea.c;
import ea.e;
import g2.g;
import g2.h;
import gf.f;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.l;
import l.x;
import m2.t;
import n2.o;
import n2.p;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.za;
import org.telegram.ui.qs0;
import r2.u;
import r9.d;
import y2.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class a implements ai, q, e, g, d, OnFailureListener, n, x, n2.q, ab, l1, q0, u, uf.a, vf.a, Continuation, y6.d {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static c O1(t7.u uVar) {
        return new c(System.currentTimeMillis() + 3600000, new j(8), new b(true, false, false), 10.0d, 1.2d, 60);
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
    public static boolean Q1(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int min;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z11 = true;
                                    }
                                } else if (!z11) {
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
                            boolean z12 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
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
                                        z12 = true;
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
                v[] vVarArr = (v[]) editable.getSpans(selectionStart, min, v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (v vVar : vVarArr) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override // l.x
    public boolean B(l lVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // c3.q
    public k0 I1(int i10, int i11) {
        return new c3.n();
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        jb.a aVar = new jb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(2);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new jb.l(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new j9.u(18, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // vf.a
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f7 = ceil;
        float f10 = f7 / f7;
        float f11 = i13;
        float f12 = f11 / f11;
        while (ceil > 0 && i13 > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f10 = ceil / f7;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f12 = i13 / f11;
            }
        }
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

    @Override // n2.q
    public byte[] P0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        return false;
    }

    public boolean R1(CharSequence charSequence) {
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

    @Override // r2.u
    public boolean T0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // r2.u
    public boolean V(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // r2.u
    public int V0() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // n2.q
    public h2.b X(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n2.q
    public void X0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // n2.q
    public o Y0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // n2.q
    public byte[] b0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // g2.g
    public h createDataSource() {
        return new g2.u(false);
    }

    @Override // r2.u
    public MediaCodecInfo d(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // n2.q
    public int d1() {
        return 1;
    }

    @Override // y6.d
    public a3.l e(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int p02 = cVar.p0(context, str, true);
        lVar.b = p02;
        if (p02 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int x12 = cVar.x1(context, str);
        lVar.a = x12;
        if (x12 != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        return 0;
    }

    @Override // y2.n
    public Object g1(Uri uri, g2.l lVar) {
        return Long.valueOf(l0.V(new BufferedReader(new InputStreamReader(lVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ k2 h0() {
        return null;
    }

    @Override // ea.e
    public c h1(t7.u uVar, JSONObject jSONObject) {
        return O1(uVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ boolean i1(s0 s0Var, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // n2.q
    public Map k(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ab
    public void m(bb bbVar, la laVar, ja jaVar, ma maVar) {
        o1.j jVar = new o1.j(bbVar, bb.IN_OUT_OFFSET_Y, bbVar.getHeight());
        jVar.m.a(0.8f);
        jVar.m.b(400.0f);
        jVar.a(new na(jaVar, 1));
        jVar.b(new ya(maVar, bbVar, 0));
        jVar.h();
        laVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    @Override // r2.u
    public boolean o1() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Components.ab
    public void p0(bb bbVar, la laVar, tf tfVar, gl glVar) {
        bbVar.setInOutOffset(bbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(bbVar.getTranslationY()));
        o1.j jVar = new o1.j((Object) bbVar, bb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.m.a(0.8f);
        jVar.m.b(400.0f);
        jVar.a(new za(0, bbVar, tfVar));
        jVar.b(new ya(glVar, bbVar, 1));
        jVar.h();
        laVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // n2.q
    public void q0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // uf.a
    public int t1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // n2.q
    public p u() {
        throw new IllegalStateException();
    }

    @Override // uf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(hb.a.B0(s10, s11));
            }
        }
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

    @Override // n2.q
    public boolean x1(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // c3.q
    public void Q0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
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

    @Override // n2.q
    public void release() {
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

    @Override // n2.q
    public void B0(byte[] bArr) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void E0(long j10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void F(s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void G0(s0 s0Var) {
    }

    @Override // c3.q
    public void G1(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void I(s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void w(s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
    }

    @Override // n2.q
    public void y(t tVar) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void e1(s0 s0Var, String str) {
    }

    @Override // l.x
    public void g(l lVar, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
    }

    @Override // n2.q
    public /* synthetic */ void p(byte[] bArr, j2.l lVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void r(s0 s0Var, int i10) {
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void E(s0 s0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void R0(s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void t0(s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void M1(s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
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
