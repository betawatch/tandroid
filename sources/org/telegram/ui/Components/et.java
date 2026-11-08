package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class et implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ et(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        s8.a aVar = (s8.a) this.b;
        synchronized (aVar.a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [org.telegram.ui.Components.gl] */
    @Override // java.lang.Runnable
    public final void run() {
        int L;
        float f10;
        int i7;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                lt ltVar = (lt) this.b;
                et etVar = ltVar.P;
                ft ftVar = ltVar.a;
                if (ltVar.D || ftVar == null || !ltVar.N || ltVar.w || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || !org.telegram.messenger.g0.Q1()) {
                    return;
                }
                ftVar.requestFocus();
                org.telegram.messenger.g0.K3(ftVar);
                org.telegram.messenger.g0.r(etVar);
                org.telegram.messenger.g0.i3(etVar, 100L);
                return;
            case 1:
                ab.q qVar = (ab.q) ((di.h3) this.b).d;
                if (!qVar.a || ((ArrayList) qVar.d).isEmpty() || ((AnimatorSet) qVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) qVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                hy hyVar = (hy) this.b;
                if (hyVar.B0.s != null) {
                    return;
                }
                hyVar.X1 = false;
                hyVar.Z();
                return;
            case 3:
                fz fzVar = (fz) this.b;
                if (fzVar.O) {
                    float f11 = fzVar.p0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 320.0f);
                    fzVar.p0 = f11;
                    fzVar.setAnimationIdicatorProgress(fzVar.i0.getInterpolation(f11));
                    if (fzVar.p0 > 1.0f) {
                        fzVar.p0 = 1.0f;
                    }
                    if (fzVar.p0 < 1.0f) {
                        org.telegram.messenger.g0.h3(fzVar.v0);
                        return;
                    }
                    fzVar.O = false;
                    fzVar.setEnabled(true);
                    bz bzVar = fzVar.J;
                    if (bzVar != null) {
                        ((org.telegram.ui.nw) bzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.t0, 1000L);
                return;
            case 5:
                TextureView textureView = ((g40) this.b).H0.p0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new fq(22, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 6:
                l50 l50Var = (l50) this.b;
                m50 m50Var = l50Var.D;
                z40 z40Var = m50Var.M1;
                if (z40Var != null && z40Var.getAdapter() != null) {
                    m50Var.M1.getClass();
                    int R = RecyclerView.R(l50Var);
                    if (R >= 0) {
                        m50Var.K1.t(m50Var.M1.T(l50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 7:
                ia0 ia0Var = (ia0) this.b;
                ValueAnimator valueAnimator = ia0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                ia0Var.h.start();
                return;
            case 8:
                ((ec0) this.b).e();
                return;
            case 9:
                kg0 kg0Var = (kg0) this.b;
                kg0Var.y = true;
                ValueAnimator valueAnimator2 = kg0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                kg0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                kg0Var.z = ofFloat;
                ofFloat.addUpdateListener(kg0Var.b0);
                kg0Var.z.setInterpolator(new LinearInterpolator());
                kg0Var.z.setDuration(150L);
                kg0Var.z.start();
                return;
            case 10:
                pj0 pj0Var = (pj0) this.b;
                m.c3 c3Var = pj0Var.f2;
                int[] iArr = pj0Var.k2;
                org.telegram.ui.an anVar = (org.telegram.ui.an) c3Var.d;
                iArr[0] = (int) anVar.L9;
                iArr[1] = anVar.Ua;
                if (pj0Var.h2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.k2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.getMeasuredHeight() - pj0Var.k2[1]);
                }
                ((org.telegram.ui.an) pj0Var.f2.d).z0.scrollBy(0, L);
                if (pj0Var.g2) {
                    org.telegram.messenger.g0.h3(pj0Var.C2);
                    return;
                }
                return;
            case 11:
                ui0 ui0Var = (ui0) this.b;
                et etVar2 = ui0Var.i0;
                if (ui0Var.n) {
                    org.telegram.messenger.g0.r(etVar2);
                    org.telegram.messenger.g0.i3(etVar2, 4000L);
                    return;
                } else {
                    ui0Var.U = false;
                    ui0Var.invalidate();
                    return;
                }
            case 12:
                tj0 tj0Var = (tj0) this.b;
                RecyclerView recyclerView = tj0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (tj0Var.g) {
                    recyclerView.scrollBy(0, -tj0Var.i);
                    org.telegram.messenger.g0.h3(this);
                    return;
                } else {
                    if (tj0Var.h) {
                        recyclerView.scrollBy(0, tj0Var.i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    }
                    return;
                }
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.H) {
                    float f12 = scrollSlidingTextTabStrip.S + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f12;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f12));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    uk0 uk0Var = scrollSlidingTextTabStrip.b;
                    if (uk0Var != null) {
                        uk0Var.F0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ShutterButton shutterButton = (ShutterButton) this.b;
                bt0 bt0Var = shutterButton.e;
                if (bt0Var != null) {
                    final hl hlVar = (hl) bt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.e;
                    di diVar = chatAttachAlertPhotoLayout.b;
                    ol olVar = chatAttachAlertPhotoLayout.R;
                    int i12 = diVar.K2;
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if ((i12 == 2 || (f2Var instanceof org.telegram.ui.an)) && !chatAttachAlertPhotoLayout.s0 && !diVar.M1 && chatAttachAlertPhotoLayout.P != null && !diVar.x1) {
                        if (f2Var == null) {
                            f2Var = LaunchActivity.Q();
                        }
                        if (f2Var != null && f2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i13 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i14 = 0; i14 < 2; i14++) {
                                        chatAttachAlertPhotoLayout.S[i14].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(xq.f).start();
                                    }
                                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                    xq xqVar = xq.f;
                                    duration.setInterpolator(xqVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                    org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                                    hlVar.a = org.telegram.messenger.g0.s0((f2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var2).z());
                                    org.telegram.messenger.g0.X3(olVar, true);
                                    olVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.gl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i15 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i15;
                                                        chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(hlVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    org.telegram.messenger.g0.f2(f2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), hlVar.a, diVar.K2 != 0, new u(hlVar, i13), new Runnable() { // from class: org.telegram.ui.Components.gl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i15 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i15;
                                                        chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(hlVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(ct0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    return;
                                }
                                chatAttachAlertPhotoLayout.Q0 = true;
                                f2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                org.telegram.messenger.k5.p(null, 2131749539, new hc(chatAttachAlertPhotoLayout.P, hlVar.c), null);
                            }
                        }
                    }
                    shutterButton.w = false;
                    return;
                }
                return;
            case 15:
                av0 av0Var = (av0) this.b;
                View view = av0Var.s;
                if (view == null) {
                    av0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    av0Var.s.setVisibility(0);
                    av0Var.s.setAlpha(0.0f);
                }
                av0Var.s.animate().setListener(null).cancel();
                av0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 16:
                ((ThemeEditorView) this.b).a = false;
                try {
                    org.telegram.ui.ActionBar.k6.l();
                    org.telegram.ui.ActionBar.k6.o();
                    org.telegram.ui.ActionBar.k6.q();
                    org.telegram.ui.ActionBar.k6.k(false, false);
                    org.telegram.ui.ActionBar.r6.c0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 17:
                u61 u61Var = (u61) this.b;
                if (u61Var.J) {
                    float f13 = u61Var.f0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 200.0f);
                    u61Var.f0 = f13;
                    u61Var.setAnimationIdicatorProgress(u61Var.a0.getInterpolation(f13));
                    if (u61Var.f0 > 1.0f) {
                        u61Var.f0 = 1.0f;
                    }
                    if (u61Var.f0 < 1.0f) {
                        org.telegram.messenger.g0.h3(u61Var.i0);
                        return;
                    }
                    u61Var.J = false;
                    u61Var.setEnabled(true);
                    t61 t61Var = u61Var.D;
                    if (t61Var != null) {
                        ((n) t61Var).y(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.b;
                if (a0Var.w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.b;
                if (!z10Var.b || z10Var.Q0.q2 != null) {
                    org.telegram.messenger.g0.i3(z10Var.h0, 3000L);
                    return;
                } else {
                    z10Var.g0 = false;
                    z10Var.setUiVisible(false);
                    return;
                }
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                org.telegram.ui.Components.voip.q0 q0Var = g1Var.e;
                if (q0Var == null) {
                    return;
                }
                if (!g1Var.b.a(g1Var.s)) {
                    if (g1Var.h == null) {
                        g1Var.h = new org.telegram.ui.Components.voip.e1();
                    }
                    VideoFrame videoFrame = g1Var.h.b;
                    if (videoFrame != null) {
                        q0Var.onFrame(videoFrame);
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 21:
                org.telegram.ui.Components.voip.f1 f1Var = (org.telegram.ui.Components.voip.f1) this.b;
                f1Var.a();
                if (f1Var.b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.voip.f2 f2Var3 = (org.telegram.ui.Components.voip.f2) this.b;
                org.telegram.ui.Components.voip.m mVar = f2Var3.b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != f2Var3.c || a10 != f2Var3.d) {
                    f2Var3.c = c10;
                    f2Var3.d = a10;
                    ti.o oVar = f2Var3.a;
                    if (oVar != null) {
                        oVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 23:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
                if (z0Var.d && z0Var.e && z0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.b;
                if (x5Var.a == null || x5Var.e == null) {
                    return;
                }
                x5Var.W0();
                if (x5Var.s) {
                    x5Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.b;
                org.telegram.ui.Wallet.i6 i6Var = b6Var.G;
                if (b6Var.a0) {
                    long nanoTime = System.nanoTime();
                    if (i6Var.a) {
                        if (i6Var.j == 0) {
                            i6Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r5) * 1.0E-9f));
                            i6Var.j = nanoTime;
                            if (i6Var.i - i6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f14 = i6Var.d;
                                i6Var.d = com.google.android.recaptcha.internal.a.z(i6Var.b, f14, exp, f14);
                                float f15 = i6Var.e;
                                i6Var.e = com.google.android.recaptcha.internal.a.z(i6Var.c, f15, exp, f15);
                            }
                        }
                    }
                    b6Var.K = i6Var.a ? Math.max(-15.0f, Math.min(15.0f, i6Var.b - i6Var.d)) : 0.0f;
                    float c11 = org.telegram.ui.Wallet.b6.c((i6Var.a ? Math.max(-15.0f, Math.min(15.0f, i6Var.c - i6Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f16 = b6Var.K;
                    float f17 = b6Var.L;
                    float z9 = com.google.android.recaptcha.internal.a.z(f16, f17, 1.0f, f17);
                    b6Var.L = z9;
                    float f18 = b6Var.M;
                    float z10 = com.google.android.recaptcha.internal.a.z(c11, f18, 1.0f, f18);
                    b6Var.M = z10;
                    float f19 = b6Var.e0;
                    b6Var.b((z9 * f19) + b6Var.N + b6Var.d0, (z10 * f19) + b6Var.O);
                    b6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 26:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.ae) this.b).run();
                    return;
                }
                return;
            case 27:
                ((qe.h) this.b).o();
                return;
            case 28:
                a();
                return;
            default:
                sg.u0 u0Var = (sg.u0) this.b;
                if (!u0Var.f || u0Var.D.D) {
                    return;
                }
                sg.u0.a(u0Var);
                GLES20.glBindFramebuffer(36160, 0);
                sg.u0 u0Var2 = (sg.u0) this.b;
                GLES20.glViewport(0, 0, u0Var2.n, u0Var2.r);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
                sg.j0 j0Var = ((sg.u0) this.b).D.c;
                if (j0Var.r != null) {
                    if (j0Var.D != null && j0Var.F != null && j0Var.E) {
                        GLES20.glBindFramebuffer(36160, 0);
                        sg.x0 x0Var = (sg.x0) j0Var.r.get("videoBlur");
                        if (x0Var != null) {
                            GLES20.glUseProgram(x0Var.a);
                            GLES20.glUniformMatrix4fv(x0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.y));
                            GLES20.glUniform1f(x0Var.d("flipy"), 0.0f);
                            GLES20.glUniform1i(x0Var.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, j0Var.D.c());
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glUniform1i(x0Var.d("blured"), 1);
                            GLES20.glActiveTexture(33985);
                            da daVar = j0Var.F.m;
                            GLES20.glBindTexture(3553, daVar != null ? daVar.s[2] : -1);
                            if (j0Var.b == null || !(j0Var.i instanceof sg.d)) {
                                GLES20.glUniform1f(x0Var.d("eraser"), 0.0f);
                            } else {
                                GLES20.glUniform1f(x0Var.d("eraser"), 1.0f);
                                GLES20.glUniform1i(x0Var.d("mask"), 2);
                                GLES20.glActiveTexture(33986);
                                GLES20.glBindTexture(3553, j0Var.g());
                            }
                            GLES20.glBlendFunc(1, 0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            synchronized (j0Var.F.h) {
                                GLES20.glDrawArrays(5, 0, 4);
                            }
                        }
                    }
                    if (j0Var.b != null) {
                        j0Var.n(j0Var.g(), j0Var.b, (1.0f - (j0Var.I * 0.5f)) - (j0Var.J * 0.5f));
                    } else if (j0Var.c != null) {
                        j0Var.o(j0Var.j(), j0Var.g(), j0Var.c, 1.0f);
                    } else {
                        int j3 = j0Var.j();
                        f10 = 0.5f;
                        sg.x0 x0Var2 = (sg.x0) j0Var.r.get(j0Var.G ? "maskingBlit" : "blit");
                        if (j3 != 0 && x0Var2 != null) {
                            GLES20.glUseProgram(x0Var2.a);
                            GLES20.glUniformMatrix4fv(x0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.y));
                            GLES20.glUniform1f(x0Var2.d("alpha"), 1.0f);
                            if (j0Var.G) {
                                GLES20.glUniform1i(x0Var2.d("texture"), 1);
                                GLES20.glUniform1i(x0Var2.d("mask"), 0);
                                GLES20.glUniform1f(x0Var2.d("preview"), 0.4f);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j3);
                                GLES20.glActiveTexture(33985);
                                GLES20.glBindTexture(3553, j0Var.l.c());
                            } else {
                                GLES20.glUniform1i(x0Var2.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j3);
                            }
                            GLES20.glBlendFunc(1, 771);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            GLES20.glDrawArrays(5, 0, 4);
                            c8.fc.a();
                        }
                        i7 = j0Var.q;
                        if (i7 != 0 && j0Var.d != null && j0Var.I > 0.0f) {
                            j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f10) + (j0Var.I * f10));
                        }
                    }
                    f10 = 0.5f;
                    i7 = j0Var.q;
                    if (i7 != 0) {
                        j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f10) + (j0Var.I * f10));
                    }
                }
                GLES20.glBlendFunc(1, 771);
                sg.u0 u0Var3 = (sg.u0) this.b;
                u0Var3.b.eglSwapBuffers(u0Var3.c, u0Var3.e);
                sg.w0 w0Var = ((sg.u0) this.b).D;
                if (!w0Var.s) {
                    w0Var.s = true;
                    org.telegram.messenger.g0.h3(new sg.t0(this, i11));
                }
                if (((sg.u0) this.b).h) {
                    return;
                }
                ((sg.u0) this.b).h = true;
                return;
        }
    }
}
