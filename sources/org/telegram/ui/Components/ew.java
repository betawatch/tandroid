package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ew(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r9 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (r9 > 0) goto L35;
     */
    /* JADX WARN: Type inference failed for: r0v62, types: [org.telegram.ui.Components.ml] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int L;
        int i10;
        int i11 = 16;
        final int i12 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                vy vyVar = (vy) this.b;
                if (vyVar.B0.s != null) {
                    return;
                }
                vyVar.X1 = false;
                vyVar.Z();
                return;
            case 1:
                tz tzVar = (tz) this.b;
                if (tzVar.O) {
                    float f7 = tzVar.p0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 320.0f);
                    tzVar.p0 = f7;
                    tzVar.setAnimationIdicatorProgress(tzVar.i0.getInterpolation(f7));
                    if (tzVar.p0 > 1.0f) {
                        tzVar.p0 = 1.0f;
                    }
                    if (tzVar.p0 < 1.0f) {
                        org.telegram.messenger.i0.g3(tzVar.v0);
                        return;
                    }
                    tzVar.O = false;
                    tzVar.setEnabled(true);
                    oz ozVar = tzVar.J;
                    if (ozVar != null) {
                        ((org.telegram.ui.rx) ozVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                org.telegram.messenger.i0.h3(fragmentContextView.t0, 1000L);
                return;
            case 3:
                TextureView textureView = ((x40) this.b).H0.p0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.i0.g3(new at(i11, this, textureView.getBitmap(org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f))));
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                b60 b60Var = (b60) this.b;
                c60 c60Var = b60Var.D;
                p50 p50Var = c60Var.M1;
                if (p50Var != null && p50Var.getAdapter() != null) {
                    c60Var.M1.getClass();
                    int R = RecyclerView.R(b60Var);
                    if (R >= 0) {
                        c60Var.K1.t(c60Var.M1.T(b60Var), R);
                    }
                }
                org.telegram.messenger.i0.g3(this);
                return;
            case 5:
                ab0 ab0Var = (ab0) this.b;
                ValueAnimator valueAnimator = ab0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                ab0Var.h.start();
                return;
            case 6:
                ((zc0) this.b).e();
                return;
            case 7:
                mh0 mh0Var = (mh0) this.b;
                mh0Var.y = true;
                ValueAnimator valueAnimator2 = mh0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                mh0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                mh0Var.z = ofFloat;
                ofFloat.addUpdateListener(mh0Var.b0);
                mh0Var.z.setInterpolator(new LinearInterpolator());
                mh0Var.z.setDuration(150L);
                mh0Var.z.start();
                return;
            case 8:
                tk0 tk0Var = (tk0) this.b;
                m.c3 c3Var = tk0Var.f2;
                int[] iArr = tk0Var.k2;
                org.telegram.ui.un unVar = (org.telegram.ui.un) c3Var.d;
                iArr[0] = (int) unVar.L9;
                iArr[1] = unVar.Ua;
                if (tk0Var.h2) {
                    L = -org.telegram.messenger.i0.L(12.0f);
                    tk0Var.M0(0.0f, tk0Var.k2[0]);
                } else {
                    L = org.telegram.messenger.i0.L(12.0f);
                    tk0Var.M0(0.0f, tk0Var.getMeasuredHeight() - tk0Var.k2[1]);
                }
                ((org.telegram.ui.un) tk0Var.f2.d).z0.scrollBy(0, L);
                if (tk0Var.g2) {
                    org.telegram.messenger.i0.g3(tk0Var.C2);
                    return;
                }
                return;
            case 9:
                zj0 zj0Var = (zj0) this.b;
                ew ewVar = zj0Var.i0;
                if (zj0Var.n) {
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 4000L);
                    return;
                } else {
                    zj0Var.U = false;
                    zj0Var.invalidate();
                    return;
                }
            case 10:
                xk0 xk0Var = (xk0) this.b;
                RecyclerView recyclerView = xk0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (xk0Var.g) {
                    recyclerView.scrollBy(0, -xk0Var.i);
                    org.telegram.messenger.i0.g3(this);
                    return;
                } else {
                    if (xk0Var.h) {
                        recyclerView.scrollBy(0, xk0Var.i);
                        org.telegram.messenger.i0.g3(this);
                        return;
                    }
                    return;
                }
            case 11:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.H) {
                    float f10 = scrollSlidingTextTabStrip.S + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f10;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f10));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        org.telegram.messenger.i0.g3(scrollSlidingTextTabStrip.d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    xl0 xl0Var = scrollSlidingTextTabStrip.b;
                    if (xl0Var != null) {
                        xl0Var.E0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ShutterButton shutterButton = (ShutterButton) this.b;
                eu0 eu0Var = shutterButton.e;
                if (eu0Var != null) {
                    final nl nlVar = (nl) eu0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
                    bi biVar = chatAttachAlertPhotoLayout.b;
                    wl wlVar = chatAttachAlertPhotoLayout.R;
                    int i14 = biVar.K2;
                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                    if ((i14 == 2 || (k2Var instanceof org.telegram.ui.un)) && !chatAttachAlertPhotoLayout.s0 && !biVar.M1 && chatAttachAlertPhotoLayout.P != null && !biVar.x1) {
                        if (k2Var == null) {
                            k2Var = LaunchActivity.Q();
                        }
                        if (k2Var != null && k2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i15 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i16 = 0; i16 < 2; i16++) {
                                        chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(org.telegram.messenger.i0.L(30.0f)).setDuration(150L).setInterpolator(gr.f).start();
                                    }
                                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-org.telegram.messenger.i0.L(30.0f)).setDuration(150L);
                                    gr grVar = gr.f;
                                    duration.setInterpolator(grVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                    org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                                    nlVar.a = org.telegram.messenger.i0.s0((k2Var2 instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var2).z());
                                    org.telegram.messenger.i0.W3(wlVar, true);
                                    wlVar.setText(org.telegram.messenger.i0.g0(0, true, false));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.ml
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = nlVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i17 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i17;
                                                        chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.i0.g0(i17, true, false));
                                                        org.telegram.messenger.i0.h3(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.h3(nlVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    org.telegram.messenger.i0.f2(k2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), nlVar.a, biVar.K2 != 0, new t(nlVar, i15), new Runnable() { // from class: org.telegram.ui.Components.ml
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = nlVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i17 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i17;
                                                        chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.i0.g0(i17, true, false));
                                                        org.telegram.messenger.i0.h3(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.h3(nlVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(fu0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    return;
                                }
                                chatAttachAlertPhotoLayout.Q0 = true;
                                k2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                org.telegram.messenger.m5.o(null, 2131749547, new cc(chatAttachAlertPhotoLayout.P, nlVar.c), null);
                            }
                        }
                    }
                    shutterButton.w = false;
                    return;
                }
                return;
            case 13:
                dw0 dw0Var = (dw0) this.b;
                View view = dw0Var.s;
                if (view == null) {
                    dw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    dw0Var.s.setVisibility(0);
                    dw0Var.s.setAlpha(0.0f);
                }
                dw0Var.s.animate().setListener(null).cancel();
                dw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 14:
                ((ThemeEditorView) this.b).a = false;
                try {
                    org.telegram.ui.ActionBar.t6.l();
                    org.telegram.ui.ActionBar.t6.o();
                    org.telegram.ui.ActionBar.t6.q();
                    org.telegram.ui.ActionBar.t6.k(false, false);
                    org.telegram.ui.ActionBar.a7.c0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 15:
                v71 v71Var = (v71) this.b;
                if (v71Var.J) {
                    float f11 = v71Var.f0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 200.0f);
                    v71Var.f0 = f11;
                    v71Var.setAnimationIdicatorProgress(v71Var.a0.getInterpolation(f11));
                    if (v71Var.f0 > 1.0f) {
                        v71Var.f0 = 1.0f;
                    }
                    if (v71Var.f0 < 1.0f) {
                        org.telegram.messenger.i0.g3(v71Var.i0);
                        return;
                    }
                    v71Var.J = false;
                    v71Var.setEnabled(true);
                    u71 u71Var = v71Var.D;
                    if (u71Var != null) {
                        ((n2.u) u71Var).J(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                org.telegram.ui.y20 y20Var = (org.telegram.ui.y20) this.b;
                if (!y20Var.b || y20Var.Q0.q2 != null) {
                    org.telegram.messenger.i0.h3(y20Var.h0, 3000L);
                    return;
                } else {
                    y20Var.g0 = false;
                    y20Var.setUiVisible(false);
                    return;
                }
            case 17:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
                if (z0Var.d && z0Var.e && z0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.i0.h3(this, 15000L);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.b;
                if (b6Var.a == null || b6Var.e == null) {
                    return;
                }
                b6Var.V0();
                if (b6Var.s) {
                    b6Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.b;
                org.telegram.ui.Wallet.n6 n6Var = g6Var.G;
                if (g6Var.a0) {
                    long nanoTime = System.nanoTime();
                    if (n6Var.a) {
                        if (n6Var.j == 0) {
                            n6Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r8) * 1.0E-9f));
                            n6Var.j = nanoTime;
                            if (n6Var.i - n6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f12 = n6Var.d;
                                n6Var.d = c3.i0.z(n6Var.b, f12, exp, f12);
                                float f13 = n6Var.e;
                                n6Var.e = c3.i0.z(n6Var.c, f13, exp, f13);
                            }
                        }
                    }
                    g6Var.K = n6Var.a ? Math.max(-15.0f, Math.min(15.0f, n6Var.b - n6Var.d)) : 0.0f;
                    float c10 = org.telegram.ui.Wallet.g6.c((n6Var.a ? Math.max(-15.0f, Math.min(15.0f, n6Var.c - n6Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f14 = g6Var.K;
                    float f15 = g6Var.L;
                    float z10 = c3.i0.z(f14, f15, 1.0f, f15);
                    g6Var.L = z10;
                    float f16 = g6Var.M;
                    float z11 = c3.i0.z(c10, f16, 1.0f, f16);
                    g6Var.M = z11;
                    float f17 = g6Var.e0;
                    g6Var.b((z10 * f17) + g6Var.N + g6Var.d0, (z11 * f17) + g6Var.O);
                    g6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 20:
                if (org.telegram.utils.twidget.p.h.remove(this)) {
                    org.telegram.messenger.i0.r(this);
                    ((org.telegram.ui.me) this.b).run();
                    return;
                }
                return;
            case 21:
                ((p4.t0) this.b).c();
                return;
            case 22:
                p8.a aVar = (p8.a) this.b;
                synchronized (aVar.a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 23:
                qh.y yVar = (qh.y) this.b;
                CameraView cameraView = yVar.b;
                if (!yVar.h0 || cameraView == null) {
                    return;
                }
                TextureView textureView2 = cameraView.getTextureView();
                int width = textureView2.getWidth();
                int height = textureView2.getHeight();
                if (width > 0 && height > 0) {
                    if (width > 720 || height > 720) {
                        float f18 = width;
                        float f19 = height;
                        float min2 = Math.min(720.0f / f18, 720.0f / f19);
                        width = Math.max(1, (int) (f18 * min2));
                        height = Math.max(1, (int) (f19 * min2));
                    }
                    Bitmap bitmap = ((qh.y) this.b).k0;
                    if (bitmap == null || bitmap.getWidth() != width || ((qh.y) this.b).k0.getHeight() != height) {
                        ((qh.y) this.b).k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                    try {
                        textureView2.getBitmap(((qh.y) this.b).k0);
                        qh.y yVar2 = (qh.y) this.b;
                        m4.c f20 = qh.y.f(yVar2.k0, yVar2.i0, yVar2.j0, yVar2.O);
                        if (f20 != null) {
                            org.telegram.messenger.i0.g3(new org.telegram.ui.web.v1(i11, this, f20));
                            return;
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.g(th2, true);
                    }
                }
                if (((qh.y) this.b).h0) {
                    ((qh.y) this.b).g0.postDelayed(this, 150L);
                    return;
                }
                return;
            case 24:
                for (Thread thread : rf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        rf.e.w.remove(thread);
                    }
                }
                if (rf.e.w.isEmpty()) {
                    rf.e.x = false;
                    return;
                } else {
                    org.telegram.messenger.i0.h3(((rf.e) this.b).p, 5000L);
                    return;
                }
            case 25:
                rf.v vVar = (rf.v) this.b;
                if (vVar.F.get()) {
                    vVar.invalidate();
                    vVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 26:
                s4.x xVar = (s4.x) this.b;
                s4.u uVar = xVar.y;
                if (xVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = xVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    s4.n0 layoutManager = xVar.H.getLayoutManager();
                    if (xVar.Q == null) {
                        xVar.Q = new Rect();
                    }
                    layoutManager.c(xVar.c.a, xVar.Q);
                    if (layoutManager.d()) {
                        int i17 = (int) (xVar.s + xVar.n);
                        i10 = (i17 - xVar.Q.left) - xVar.H.getPaddingLeft();
                        float f21 = xVar.n;
                        if (f21 < 0.0f) {
                        }
                        if (f21 > 0.0f) {
                            i10 = ((xVar.c.a.getWidth() + i17) + xVar.Q.right) - (xVar.H.getWidth() - xVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                        int i18 = (int) (xVar.w + xVar.r);
                        int paddingTop = (i18 - xVar.Q.top) - xVar.H.getPaddingTop();
                        float f22 = xVar.r;
                        if ((f22 < 0.0f && paddingTop < 0) || (f22 > 0.0f && (paddingTop = ((xVar.c.a.getHeight() + i18) + xVar.Q.bottom) - (xVar.H.getHeight() - xVar.H.getPaddingBottom())) > 0)) {
                            i13 = paddingTop;
                        }
                    }
                    if (i10 != 0) {
                        int width2 = xVar.c.a.getWidth();
                        xVar.H.getWidth();
                        i10 = uVar.i(width2, i10, j11);
                    }
                    if (i13 != 0) {
                        int height2 = xVar.c.a.getHeight();
                        xVar.H.getHeight();
                        i13 = uVar.i(height2, i13, j11);
                    }
                    if (i10 == 0 && i13 == 0) {
                        xVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (xVar.R == Long.MIN_VALUE) {
                        xVar.R = currentTimeMillis;
                    }
                    xVar.H.scrollBy(i10, i13);
                    s4.c1 c1Var = xVar.c;
                    if (c1Var != null) {
                        xVar.p(c1Var);
                    }
                    xVar.H.removeCallbacks(xVar.I);
                    RecyclerView recyclerView2 = xVar.H;
                    WeakHashMap weakHashMap = r0.h0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 27:
                th.z2 z2Var = (th.z2) this.b;
                if (z2Var.t1 && z2Var.K0) {
                    th.o7 o7Var = ((th.f7) z2Var.z1).d;
                    o7Var.l1 = false;
                    o7Var.d0();
                    return;
                }
                return;
            case 28:
                ((th.q) this.b).L0 = false;
                return;
            default:
                th.b6 b6Var2 = (th.b6) this.b;
                b6Var2.b = false;
                b6Var2.invalidate();
                return;
        }
    }
}
