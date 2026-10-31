package k2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.widget.FrameLayout;
import bi.d5;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.k2;
import m4.j1;
import m4.n1;
import m4.t1;
import mg.i2;
import mg.r1;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ll;
import org.telegram.ui.un;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        int i10;
        t1 t1Var;
        TLObject d22;
        TLObject d23;
        switch (this.a) {
            case 0:
                hf.b bVar = (hf.b) this.b;
                String str = (String) this.c;
                w wVar = (w) bVar.c;
                String str2 = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1012, new j2.e(U, str, 11));
                return;
            case 1:
                hf.b bVar2 = (hf.b) this.b;
                i2.c cVar = (i2.c) this.c;
                w wVar2 = (w) bVar2.c;
                String str3 = e2.l0.a;
                n4.q.f(((i2.c0) wVar2).a.F, cVar);
                return;
            case 2:
                f0.a((f0) this.b, (AudioRouting) this.c);
                return;
            case 3:
                f0 f0Var = (f0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (f0Var.d == null || (eVar = ((n0) f0Var.b.a).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                b2.f fVar = eVar.j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo, a2));
                return;
            case 4:
                kg.q0 q0Var = (kg.q0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = q0Var.a2;
                tk0 tk0Var = q0Var.k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    q0Var.A2 = false;
                    q0Var.B2.b(q0Var.f2 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= tk0Var.getChildCount()) {
                            i10 = 0;
                        } else if (tk0Var.getChildAt(i11) instanceof kg.p0) {
                            i10 = tk0Var.getChildAt(i11).getTop();
                        } else {
                            i11++;
                        }
                    }
                    q0Var.G1();
                    if (q0Var.d2 >= 0 && i10 != 0) {
                        ((s4.a0) tk0Var.getLayoutManager()).h1(q0Var.d2 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), q0Var.E2.b);
                q0Var.p2.i(max, false);
                q0Var.p2.setBagePosition(max / q0Var.E2.c);
                kg.o0 o0Var = q0Var.p2;
                o0Var.H = true;
                o0Var.requestLayout();
                return;
            case 5:
                ((kg.q0) this.b).h1((s80) this.c, true);
                return;
            case 6:
                k2 k2Var = (k2) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                b8.G(k2Var.s);
                org.telegram.messenger.i0.g3(new u(7, k2Var, b8.I(document)));
                return;
            case 7:
                k2 k2Var2 = (k2) this.b;
                k2Var2.e = (File) this.c;
                k2Var2.a();
                return;
            case 8:
                ki.k kVar = (ki.k) this.b;
                Throwable th2 = (Throwable) this.c;
                kVar.getClass();
                kVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 9:
                ki.k kVar2 = (ki.k) this.b;
                File file = (File) this.c;
                synchronized (kVar2.m) {
                    while (r4 < kVar2.m.size()) {
                        try {
                            File file2 = (File) kVar2.m.get(r4);
                            r4 = (file != null && file.equals(file2)) ? r4 + 1 : 0;
                            if (file2.exists() && !file2.delete()) {
                                kVar2.h.b("temporary file deletion failed: " + file2.getName());
                            }
                        } finally {
                        }
                    }
                    kVar2.m.clear();
                }
                return;
            case 10:
                ((lg.g) this.b).c((ArrayList) this.c);
                return;
            case 11:
                lg.t tVar = (lg.t) this.b;
                lg.v vVar = (lg.v) this.c;
                tVar.getClass();
                try {
                    EGLDisplay eGLDisplay = tVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = tVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, tVar.k);
                        EGLSurface eGLSurface2 = vVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(tVar.j, eGLSurface2);
                        }
                        vVar.h = EGL14.EGL_NO_SURFACE;
                        if (tVar.g.length == 0) {
                            tVar.b();
                        }
                    }
                    vVar.b.release();
                    return;
                } finally {
                    vVar.b.release();
                }
            case 12:
                ((li.l) this.b).a0((li.q0) this.c);
                return;
            case 13:
                li.l lVar = (li.l) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                lVar.k();
                li.o oVar = lVar.x;
                if (oVar != null) {
                    long p5 = oVar.p();
                    li.v vVar2 = lVar.w;
                    if (vVar2 != null && p5 != Long.MAX_VALUE) {
                        vVar2.q = Math.max(0L, p5) * 1000;
                        Handler handler = vVar2.u;
                        if (handler != null) {
                            handler.removeCallbacks(vVar2.x0);
                        }
                    }
                }
                lVar.p();
                li.o oVar2 = lVar.x;
                if (oVar2 != null) {
                    oVar2.u();
                    lVar.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 14:
                li.v vVar3 = (li.v) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                vVar3.getClass();
                try {
                    try {
                        vVar3.f();
                        vVar3.r0 = true;
                    } catch (RuntimeException e) {
                        vVar3.w0 = e;
                        vVar3.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 15:
                a4.l lVar2 = (a4.l) this.b;
                li.q0 q0Var2 = (li.q0) this.c;
                li.x0 x0Var = (li.x0) lVar2.b;
                x0Var.Q++;
                x0Var.y = true;
                x0Var.m.b("camera switch started: target=" + q0Var2);
                d50 d50Var = (d50) x0Var.d.a;
                FrameLayout frameLayout = d50Var.x;
                d50Var.s0++;
                ValueAnimator valueAnimator = d50Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    d50Var.b0.cancel();
                    d50Var.b0 = null;
                }
                d50Var.n0 = true;
                d50Var.o0 = false;
                d50Var.p0 = false;
                d50Var.q0 = false;
                d50Var.r0 = SystemClock.elapsedRealtime();
                ll llVar = d50Var.D;
                d50Var.y(false);
                Bitmap bitmap = d50Var.t0;
                if (bitmap != null) {
                    llVar.setImageBitmap(bitmap);
                    d50Var.m0 = true;
                    llVar.animate().cancel();
                    llVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i12 = d50Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                d50Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                d50Var.b0.setInterpolator(gr.h);
                d50Var.b0.addUpdateListener(new nh.b(d50Var, i12, 5));
                d50Var.b0.addListener(new d5(d50Var, i12, 9));
                d50Var.b0.start();
                f8.b("RoundVideo camera flip started: facing=" + q0Var2 + ", minimumDurationMs=580");
                d50Var.B();
                x0Var.o();
                return;
            case 16:
                ((m4.f0) this.b).u(null, (n1) this.c);
                return;
            case 17:
                m4.f0 f0Var2 = (m4.f0) this.b;
                Runnable runnable = (Runnable) this.c;
                f0Var2.getClass();
                runnable.run();
                return;
            case 18:
                ((c0.i) this.c).a(Boolean.valueOf(((m4.f0) this.b).o()));
                return;
            case 19:
                j9.w wVar3 = (j9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    t1Var = (t1) wVar3.a;
                    t6.l(t1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                } catch (CancellationException e10) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    t1Var = new t1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                }
                resultReceiver.send(t1Var.a, t1Var.b);
                return;
            case 20:
                j1 j1Var = (j1) this.b;
                m4.m mVar = (m4.m) this.c;
                xa.n nVar = j1Var.b;
                m4.w B = nVar.B(mVar.asBinder());
                if (B != null) {
                    nVar.U(B);
                    return;
                }
                return;
            case 21:
                ((j1) this.b).b.u((m4.w) this.c);
                return;
            case 22:
                com.google.android.gms.internal.cast.o oVar3 = (com.google.android.gms.internal.cast.o) this.b;
                lf.b bVar3 = (lf.b) this.c;
                if (((AtomicBoolean) oVar3.e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((r1) this.b).a((ArrayList) this.c);
                return;
            case 24:
                ((mg.o0) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 25:
                hs hsVar = (hs) this.b;
                q20 q20Var = (q20) this.c;
                HashMap h02 = hsVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.i0.g3(new mg.j0(q20Var, h02, 0));
                return;
            case 26:
                ((vg) this.b).a((ArrayList) this.c);
                return;
            case 27:
                wb I = cc.a0((un) this.b).I(R.raw.stars_send, cd.L0(2131745110, null), org.telegram.messenger.i0.W2(cd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 28:
                zs.f(d20.s0).k(zs.V2, ((mg.w0) this.b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            default:
                i2 i2Var = (i2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = i2Var.c2;
                arrayList2.clear();
                i2Var.p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    vp r12 = vp.r1(i2Var.a);
                    r12.V3(tL_contacts_found.users, false);
                    r12.P3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Peer peer = arrayList3.get(i13);
                        i13++;
                        long o10 = o5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o10)) && (d23 = r12.d2(o10)) != null) {
                            arrayList2.add(d23);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                    int size2 = arrayList4.size();
                    while (r4 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(r4);
                        r4++;
                        long o11 = o5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o11)) && (d22 = r12.d2(o11)) != null) {
                            arrayList2.add(d22);
                            hashSet.add(Long.valueOf(o11));
                        }
                    }
                }
                i2Var.p1(true, true);
                return;
        }
    }

    public /* synthetic */ u(m4.f0 f0Var, m4.w wVar, Runnable runnable) {
        this.a = 17;
        this.b = f0Var;
        this.c = runnable;
    }
}
