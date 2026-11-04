package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lt(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i3;
        tg.s0 s0Var = (tg.s0) this.b;
        if (!s0Var.f || s0Var.E.E) {
            return;
        }
        tg.s0.a(s0Var);
        GLES20.glBindFramebuffer(36160, 0);
        tg.s0 s0Var2 = (tg.s0) this.b;
        GLES20.glViewport(0, 0, s0Var2.n, s0Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(TLObject.FLAG_14);
        tg.i0 i0Var = ((tg.s0) this.b).E.c;
        if (i0Var.r != null) {
            if (i0Var.D != null && i0Var.F != null && i0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                tg.v0 v0Var = (tg.v0) i0Var.r.get("videoBlur");
                if (v0Var != null) {
                    GLES20.glUseProgram(v0Var.a);
                    GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(i0Var.y));
                    GLES20.glUniform1f(v0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, i0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(v0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ca caVar = i0Var.F.m;
                    GLES20.glBindTexture(3553, caVar != null ? caVar.s[2] : -1);
                    if (i0Var.b == null || !(i0Var.i instanceof tg.d)) {
                        GLES20.glUniform1f(v0Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(v0Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(v0Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, i0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) i0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) i0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (i0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (i0Var.b != null) {
                i0Var.n(i0Var.g(), i0Var.b, (1.0f - (i0Var.I * 0.5f)) - (i0Var.J * 0.5f));
            } else if (i0Var.c != null) {
                i0Var.o(i0Var.j(), i0Var.g(), i0Var.c, 1.0f);
            } else {
                int j10 = i0Var.j();
                f10 = 0.0f;
                tg.v0 v0Var2 = (tg.v0) i0Var.r.get(i0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && v0Var2 != null) {
                    GLES20.glUseProgram(v0Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(v0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(i0Var.y));
                    GLES20.glUniform1f(v0Var2.d("alpha"), 1.0f);
                    if (i0Var.G) {
                        GLES20.glUniform1i(v0Var2.d("texture"), 1);
                        GLES20.glUniform1i(v0Var2.d("mask"), 0);
                        GLES20.glUniform1f(v0Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, i0Var.l.c());
                    } else {
                        GLES20.glUniform1i(v0Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) i0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) i0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    x7.e0.a();
                    i3 = i0Var.q;
                    if (i3 != 0 && i0Var.d != null && i0Var.I > f10) {
                        i0Var.o(i3, i0Var.g(), i0Var.d, (i0Var.J * f11) + (i0Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i3 = i0Var.q;
                if (i3 != 0) {
                    i0Var.o(i3, i0Var.g(), i0Var.d, (i0Var.J * f11) + (i0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i3 = i0Var.q;
            if (i3 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        tg.s0 s0Var3 = (tg.s0) this.b;
        s0Var3.b.eglSwapBuffers(s0Var3.c, s0Var3.e);
        tg.u0 u0Var = ((tg.s0) this.b).E;
        if (!u0Var.s) {
            u0Var.s = true;
            org.telegram.messenger.g0.h3(new r4.u(this, 7));
        }
        if (((tg.s0) this.b).h) {
            return;
        }
        ((tg.s0) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (r12 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f1, code lost:
    
        if (r12 > 0) goto L50;
     */
    /* JADX WARN: Type inference failed for: r0v68, types: [org.telegram.ui.Components.fl] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int L;
        int i3;
        int R;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                b4.n nVar = (b4.n) ((ei.k3) this.b).d;
                if (!nVar.a || ((ArrayList) nVar.d).isEmpty() || ((AnimatorSet) nVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) nVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ey eyVar = (ey) this.b;
                if (eyVar.C0.s != null) {
                    return;
                }
                eyVar.Y1 = false;
                eyVar.Z();
                return;
            case 2:
                bz bzVar = (bz) this.b;
                if (bzVar.P) {
                    float f10 = bzVar.q0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 320.0f);
                    bzVar.q0 = f10;
                    bzVar.setAnimationIdicatorProgress(bzVar.j0.getInterpolation(f10));
                    if (bzVar.q0 > 1.0f) {
                        bzVar.q0 = 1.0f;
                    }
                    if (bzVar.q0 < 1.0f) {
                        org.telegram.messenger.g0.h3(bzVar.w0);
                        return;
                    }
                    bzVar.P = false;
                    bzVar.setEnabled(true);
                    xy xyVar = bzVar.K;
                    if (xyVar != null) {
                        ((org.telegram.ui.kw) xyVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.u0, 1000L);
                return;
            case 4:
                TextureView textureView = ((c40) this.b).I0.q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new cl(27, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 5:
                h50 h50Var = (h50) this.b;
                i50 i50Var = h50Var.E;
                v40 v40Var = i50Var.N1;
                if (v40Var != null && v40Var.getAdapter() != null) {
                    i50Var.N1.getClass();
                    int R2 = RecyclerView.R(h50Var);
                    if (R2 >= 0) {
                        i50Var.L1.t(i50Var.N1.T(h50Var), R2);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 6:
                da0 da0Var = (da0) this.b;
                ValueAnimator valueAnimator = da0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                da0Var.h.start();
                return;
            case 7:
                ((zb0) this.b).e();
                return;
            case 8:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.y = true;
                ValueAnimator valueAnimator2 = ng0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ng0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ng0Var.z = ofFloat;
                ofFloat.addUpdateListener(ng0Var.b0);
                ng0Var.z.setInterpolator(new LinearInterpolator());
                ng0Var.z.setDuration(150L);
                ng0Var.z.start();
                return;
            case 9:
                tj0 tj0Var = (tj0) this.b;
                m.b3 b3Var = tj0Var.g2;
                int[] iArr = tj0Var.l2;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) b3Var.d;
                iArr[0] = (int) wmVar.M9;
                iArr[1] = wmVar.Va;
                if (tj0Var.i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    tj0Var.M0(0.0f, tj0Var.l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    tj0Var.M0(0.0f, tj0Var.getMeasuredHeight() - tj0Var.l2[1]);
                }
                ((org.telegram.ui.wm) tj0Var.g2.d).A0.scrollBy(0, L);
                if (tj0Var.h2) {
                    org.telegram.messenger.g0.h3(tj0Var.D2);
                    return;
                }
                return;
            case 10:
                yi0 yi0Var = (yi0) this.b;
                lt ltVar = yi0Var.j0;
                if (yi0Var.n) {
                    org.telegram.messenger.g0.r(ltVar);
                    org.telegram.messenger.g0.i3(ltVar, 4000L);
                    return;
                } else {
                    yi0Var.V = false;
                    yi0Var.invalidate();
                    return;
                }
            case 11:
                xj0 xj0Var = (xj0) this.b;
                RecyclerView recyclerView = xj0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (xj0Var.g) {
                    recyclerView.scrollBy(0, -xj0Var.i);
                    org.telegram.messenger.g0.h3(this);
                    return;
                } else {
                    if (xj0Var.h) {
                        recyclerView.scrollBy(0, xj0Var.i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    }
                    return;
                }
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.I) {
                    float f11 = scrollSlidingTextTabStrip.T + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / scrollSlidingTextTabStrip.c0);
                    scrollSlidingTextTabStrip.T = f11;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f11));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    yk0 yk0Var = scrollSlidingTextTabStrip.b;
                    if (yk0Var != null) {
                        yk0Var.F0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ShutterButton shutterButton = (ShutterButton) this.b;
                at0 at0Var = shutterButton.e;
                if (at0Var != null) {
                    final gl glVar = (gl) at0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.e;
                    bi biVar = chatAttachAlertPhotoLayout.b;
                    nl nlVar = chatAttachAlertPhotoLayout.S;
                    int i12 = biVar.L2;
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if ((i12 == 2 || (d2Var instanceof org.telegram.ui.wm)) && !chatAttachAlertPhotoLayout.t0 && !biVar.N1 && chatAttachAlertPhotoLayout.Q != null && !biVar.y1) {
                        if (d2Var == null) {
                            d2Var = LaunchActivity.Q();
                        }
                        if (d2Var != null && d2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.x0) {
                                int i13 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i14 = 0; i14 < 2; i14++) {
                                        chatAttachAlertPhotoLayout.T[i14].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(xq.f).start();
                                    }
                                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                    xq xqVar = xq.f;
                                    duration.setInterpolator(xqVar).start();
                                    chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                    org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                                    glVar.a = org.telegram.messenger.g0.s0((d2Var2 instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var2).z());
                                    org.telegram.messenger.g0.X3(nlVar, true);
                                    nlVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                    chatAttachAlertPhotoLayout.h0 = 0;
                                    chatAttachAlertPhotoLayout.i0 = new Runnable() { // from class: org.telegram.ui.Components.fl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = glVar.e;
                                                    if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                        int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                        chatAttachAlertPhotoLayout2.h0 = i15;
                                                        chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(glVar.e.i0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    org.telegram.messenger.g0.f2(d2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), glVar.a, biVar.L2 != 0, new t(glVar, i13), new Runnable() { // from class: org.telegram.ui.Components.fl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = glVar.e;
                                                    if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                        int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                        chatAttachAlertPhotoLayout2.h0 = i15;
                                                        chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(glVar.e.i0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.Q);
                                    chatAttachAlertPhotoLayout.l0.a(bt0.b);
                                    chatAttachAlertPhotoLayout.Q.runHaptic();
                                    return;
                                }
                                chatAttachAlertPhotoLayout.R0 = true;
                                d2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                org.telegram.messenger.k5.p(null, 2131749546, new fc(chatAttachAlertPhotoLayout.Q, glVar.c), null);
                            }
                        }
                    }
                    shutterButton.w = false;
                    return;
                }
                return;
            case 14:
                zu0 zu0Var = (zu0) this.b;
                View view = zu0Var.s;
                if (view == null) {
                    zu0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    zu0Var.s.setVisibility(0);
                    zu0Var.s.setAlpha(0.0f);
                }
                zu0Var.s.animate().setListener(null).cancel();
                zu0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 15:
                ((ThemeEditorView) this.b).a = false;
                try {
                    org.telegram.ui.ActionBar.k6.l();
                    org.telegram.ui.ActionBar.k6.o();
                    org.telegram.ui.ActionBar.k6.q();
                    org.telegram.ui.ActionBar.k6.k(false, false);
                    org.telegram.ui.ActionBar.r6.c0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 16:
                m61 m61Var = (m61) this.b;
                if (m61Var.K) {
                    float f12 = m61Var.g0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 200.0f);
                    m61Var.g0 = f12;
                    m61Var.setAnimationIdicatorProgress(m61Var.b0.getInterpolation(f12));
                    if (m61Var.g0 > 1.0f) {
                        m61Var.g0 = 1.0f;
                    }
                    if (m61Var.g0 < 1.0f) {
                        org.telegram.messenger.g0.h3(m61Var.j0);
                        return;
                    }
                    m61Var.K = false;
                    m61Var.setEnabled(true);
                    l61 l61Var = m61Var.E;
                    if (l61Var != null) {
                        ((y00) l61Var).x(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                org.telegram.ui.u10 u10Var = (org.telegram.ui.u10) this.b;
                if (!u10Var.b || u10Var.R0.r2 != null) {
                    org.telegram.messenger.g0.i3(u10Var.i0, 3000L);
                    return;
                } else {
                    u10Var.h0 = false;
                    u10Var.setUiVisible(false);
                    return;
                }
            case 18:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.b;
                if (x0Var.d && x0Var.e && x0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - x0Var.l >= 30000) {
                        x0Var.f("heartbeat timed out");
                        return;
                    }
                    x0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - x0Var.l) + " ms ago");
                    x0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.b;
                if (w5Var.a == null || w5Var.e == null) {
                    return;
                }
                w5Var.W0();
                if (w5Var.s) {
                    w5Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.b;
                org.telegram.ui.Wallet.h6 h6Var = a6Var.H;
                if (a6Var.b0) {
                    long nanoTime = System.nanoTime();
                    if (h6Var.a) {
                        if (h6Var.j == 0) {
                            h6Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r5) * 1.0E-9f));
                            h6Var.j = nanoTime;
                            if (h6Var.i - h6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f13 = h6Var.d;
                                h6Var.d = com.google.android.recaptcha.internal.a.y(h6Var.b, f13, exp, f13);
                                float f14 = h6Var.e;
                                h6Var.e = com.google.android.recaptcha.internal.a.y(h6Var.c, f14, exp, f14);
                            }
                        }
                    }
                    a6Var.L = h6Var.a ? Math.max(-15.0f, Math.min(15.0f, h6Var.b - h6Var.d)) : 0.0f;
                    float c2 = org.telegram.ui.Wallet.a6.c((h6Var.a ? Math.max(-15.0f, Math.min(15.0f, h6Var.c - h6Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f15 = a6Var.L;
                    float f16 = a6Var.M;
                    float y9 = com.google.android.recaptcha.internal.a.y(f15, f16, 1.0f, f16);
                    a6Var.M = y9;
                    float f17 = a6Var.N;
                    float y10 = com.google.android.recaptcha.internal.a.y(c2, f17, 1.0f, f17);
                    a6Var.N = y10;
                    float f18 = a6Var.f0;
                    a6Var.b((y9 * f18) + a6Var.O + a6Var.e0, (y10 * f18) + a6Var.P);
                    a6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 21:
                if (org.telegram.utils.twidget.p.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.yd) this.b).run();
                    return;
                }
                return;
            case 22:
                ((ne.h) this.b).o();
                return;
            case 23:
                r8.a aVar = (r8.a) this.b;
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
            case 24:
                a();
                return;
            case 25:
                u0.d dVar = (u0.d) this.b;
                m.r1 r1Var = dVar.c;
                u0.a aVar2 = dVar.a;
                if (dVar.F) {
                    if (dVar.y) {
                        dVar.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.g = -1L;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) || !dVar.e()) {
                        dVar.F = false;
                        return;
                    }
                    if (dVar.E) {
                        dVar.E = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar2.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.H.scrollListBy((int) (j10 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar2.d));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 26:
                u4.y yVar = (u4.y) this.b;
                u4.v vVar = yVar.y;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = yVar.S;
                    long j12 = j11 != Long.MIN_VALUE ? currentTimeMillis - j11 : 0L;
                    u4.o0 layoutManager = yVar.I.getLayoutManager();
                    if (yVar.R == null) {
                        yVar.R = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.R);
                    if (layoutManager.d()) {
                        int i15 = (int) (yVar.s + yVar.n);
                        i3 = (i15 - yVar.R.left) - yVar.I.getPaddingLeft();
                        float f19 = yVar.n;
                        if (f19 < 0.0f) {
                        }
                        if (f19 > 0.0f) {
                            i3 = ((yVar.c.a.getWidth() + i15) + yVar.R.right) - (yVar.I.getWidth() - yVar.I.getPaddingRight());
                            break;
                        }
                    }
                    i3 = 0;
                    if (layoutManager.e()) {
                        int i16 = (int) (yVar.w + yVar.r);
                        int paddingTop = (i16 - yVar.R.top) - yVar.I.getPaddingTop();
                        float f20 = yVar.r;
                        if ((f20 < 0.0f && paddingTop < 0) || (f20 > 0.0f && (paddingTop = ((yVar.c.a.getHeight() + i16) + yVar.R.bottom) - (yVar.I.getHeight() - yVar.I.getPaddingBottom())) > 0)) {
                            i11 = paddingTop;
                        }
                    }
                    if (i3 != 0) {
                        int width = yVar.c.a.getWidth();
                        yVar.I.getWidth();
                        i3 = vVar.i(width, i3, j12);
                    }
                    if (i11 != 0) {
                        int height = yVar.c.a.getHeight();
                        yVar.I.getHeight();
                        i11 = vVar.i(height, i11, j12);
                    }
                    if (i3 == 0 && i11 == 0) {
                        yVar.S = Long.MIN_VALUE;
                        return;
                    }
                    if (yVar.S == Long.MIN_VALUE) {
                        yVar.S = currentTimeMillis;
                    }
                    yVar.I.scrollBy(i3, i11);
                    u4.d1 d1Var = yVar.c;
                    if (d1Var != null) {
                        yVar.p(d1Var);
                    }
                    yVar.I.removeCallbacks(yVar.J);
                    RecyclerView recyclerView2 = yVar.I;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 27:
                ug.j jVar = ((org.telegram.ui.lp0) this.b).C0;
                if (jVar instanceof ug.l2) {
                    ((ug.l2) jVar).getEditText();
                    return;
                }
                return;
            case 28:
                vg.r0 r0Var = (vg.r0) this.b;
                ArrayList arrayList = r0Var.o3;
                if (r0Var.v3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((vg.l1) k2.p1.h(1, arrayList))) >= 0) {
                        View m10 = r0Var.g3.m(R + 1);
                        if (m10 != null) {
                            r0Var.l3 = false;
                            r0Var.z1(m10, true);
                            r0Var.w0(0, m10.getTop() - ((r0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                        }
                    }
                    r0Var.A1();
                    return;
                }
                return;
            default:
                vg.t1 t1Var = (vg.t1) this.b;
                try {
                    vg.s1 s1Var = t1Var.a;
                    if (s1Var != null) {
                        s1Var.g();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
