package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v31, types: [org.telegram.ui.Components.ul] */
    @Override // java.lang.Runnable
    public final void run() {
        int L;
        ac0 ac0Var;
        org.telegram.ui.mq0 mq0Var;
        int i7 = this.a;
        hi.o7 o7Var = null;
        char c10 = 1;
        final int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                tc tcVar = (tc) obj;
                tcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                tcVar.f.performHapticFeedback(0);
                Runnable runnable = tcVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                jk jkVar = (jk) obj;
                if (jkVar.T) {
                    jkVar.O.clear();
                    jkVar.Q.clear();
                    jkVar.R.clear();
                    jkVar.f();
                    break;
                }
                break;
            case 2:
                om omVar = (om) obj;
                pm pmVar = omVar.Q;
                if (pmVar.K != null && !pmVar.L) {
                    int computeVerticalScrollOffset = pmVar.r.computeVerticalScrollOffset();
                    Object[] objArr = pmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (omVar.e() - omVar.r) + omVar.n;
                    float max = Math.max(0.0f, (pmVar.F - Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((pmVar.r.getMeasuredHeight() - (pmVar.F - computeVerticalScrollOffset)) - pmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    float L3 = (max >= L2 || computeVerticalScrollOffset <= pmVar.getListTopPadding()) ? max2 < L2 ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2)) : 0.0f : (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    int i11 = (int) L3;
                    if (Math.abs(i11) > 0 && pmVar.r.canScrollVertically(i11) && (L3 <= 0.0f || objArr == false)) {
                        pmVar.F += L3;
                        pmVar.r.scrollBy(0, i11);
                        omVar.invalidate();
                    }
                    omVar.M = true;
                    omVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 3:
                qn qnVar = (qn) obj;
                rc rcVar = qnVar.V0;
                org.telegram.ui.Cells.a6 a6Var = qnVar.h1;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!qnVar.I && editField != null && qnVar.H && !qnVar.f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(rcVar);
                        org.telegram.messenger.g0.h3(rcVar, 100L);
                        break;
                    }
                }
                break;
            case 4:
                wt wtVar = (wt) obj;
                rc rcVar2 = wtVar.Q;
                rt rtVar = wtVar.a;
                if (!wtVar.E && rtVar != null && wtVar.O && !wtVar.w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    rtVar.requestFocus();
                    org.telegram.messenger.g0.I3(rtVar);
                    org.telegram.messenger.g0.r(rcVar2);
                    org.telegram.messenger.g0.h3(rcVar2, 100L);
                    break;
                }
                break;
            case 5:
                ab.q qVar = (ab.q) ((fi.a3) obj).d;
                if (qVar.a && !((ArrayList) qVar.d).isEmpty() && !((AnimatorSet) qVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) qVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 6:
                qy qyVar = (qy) obj;
                if (qyVar.C0.s == null) {
                    qyVar.Y1 = false;
                    qyVar.Z();
                    break;
                }
                break;
            case 7:
                oz ozVar = (oz) obj;
                if (ozVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = ozVar.q0 + (elapsedRealtime / 320.0f);
                    ozVar.q0 = f10;
                    ozVar.setAnimationIdicatorProgress(ozVar.j0.getInterpolation(f10));
                    if (ozVar.q0 > 1.0f) {
                        ozVar.q0 = 1.0f;
                    }
                    if (ozVar.q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(ozVar.w0);
                        break;
                    } else {
                        ozVar.P = false;
                        ozVar.setEnabled(true);
                        kz kzVar = ozVar.K;
                        if (kzVar != null) {
                            ((org.telegram.ui.sw) kzVar).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 8:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.h3(fragmentContextView.u0, 1000L);
                break;
            case 9:
                TextureView textureView = ((r40) obj).I0.q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new bt(16, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 10:
                w50 w50Var = (w50) obj;
                x50 x50Var = w50Var.E;
                k50 k50Var = x50Var.Q1;
                if (k50Var != null && k50Var.getAdapter() != null) {
                    x50Var.Q1.getClass();
                    int R = RecyclerView.R(w50Var);
                    if (R >= 0) {
                        x50Var.O1.t(x50Var.Q1.T(w50Var), R);
                    }
                }
                org.telegram.messenger.g0.g3(this);
                break;
            case 11:
                ta0 ta0Var = (ta0) obj;
                ValueAnimator valueAnimator = ta0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ta0Var.h.start();
                    break;
                }
                break;
            case 12:
                cc0 cc0Var = (cc0) obj;
                if (cc0Var.n && cc0Var.isAttachedToWindow()) {
                    cc0Var.d();
                    cc0Var.postOnAnimation(this);
                    break;
                }
                break;
            case 13:
                ((oc0) obj).e();
                break;
            case 14:
                yg0 yg0Var = (yg0) obj;
                yg0Var.y = true;
                ValueAnimator valueAnimator2 = yg0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                yg0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yg0Var.z = ofFloat;
                ofFloat.addUpdateListener(yg0Var.b0);
                yg0Var.z.setInterpolator(new LinearInterpolator());
                yg0Var.z.setDuration(150L);
                yg0Var.z.start();
                break;
            case 15:
                ek0 ek0Var = (ek0) obj;
                m.b3 b3Var = ek0Var.g2;
                int[] iArr = ek0Var.l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (ek0Var.i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.getMeasuredHeight() - ek0Var.l2[1]);
                }
                ((org.telegram.ui.bn) ek0Var.g2.d).A0.scrollBy(0, L);
                if (ek0Var.h2) {
                    org.telegram.messenger.g0.g3(ek0Var.D2);
                    break;
                }
                break;
            case 16:
                jj0 jj0Var = (jj0) obj;
                rc rcVar3 = jj0Var.j0;
                if (jj0Var.n) {
                    org.telegram.messenger.g0.r(rcVar3);
                    org.telegram.messenger.g0.h3(rcVar3, 4000L);
                    break;
                } else {
                    jj0Var.V = false;
                    jj0Var.invalidate();
                    break;
                }
            case 17:
                ik0 ik0Var = (ik0) obj;
                RecyclerView recyclerView = ik0Var.a;
                if (recyclerView != null) {
                    if (ik0Var.g) {
                        recyclerView.scrollBy(0, -ik0Var.i);
                        org.telegram.messenger.g0.g3(this);
                        break;
                    } else if (ik0Var.h) {
                        recyclerView.scrollBy(0, ik0Var.i);
                        org.telegram.messenger.g0.g3(this);
                        break;
                    }
                }
                break;
            case 18:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.I) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f11 = scrollSlidingTextTabStrip.T + (elapsedRealtime2 / scrollSlidingTextTabStrip.c0);
                    scrollSlidingTextTabStrip.T = f11;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f11));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.g3(scrollSlidingTextTabStrip.e0);
                        break;
                    } else {
                        scrollSlidingTextTabStrip.I = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        jl0 jl0Var = scrollSlidingTextTabStrip.b;
                        if (jl0Var != null) {
                            jl0Var.c(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 19:
                ShutterButton shutterButton = (ShutterButton) obj;
                mt0 mt0Var = shutterButton.e;
                if (mt0Var != null) {
                    final vl vlVar = (vl) mt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.b;
                    cm cmVar = chatAttachAlertPhotoLayout.S;
                    int i12 = tiVar.O2;
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
                    if ((i12 == 2 || (g2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.t0 && !tiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !tiVar.B1) {
                        if (g2Var == null) {
                            g2Var = LaunchActivity.Q();
                        }
                        if (g2Var != null && g2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                org.telegram.messenger.f3.o(null, 2131749362, new kc(chatAttachAlertPhotoLayout.Q, vlVar.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                for (int i13 = 0; i13 < 2; i13++) {
                                    chatAttachAlertPhotoLayout.T[i13].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(kr.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                kr krVar = kr.f;
                                duration.setInterpolator(krVar).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                                org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
                                vlVar.a = org.telegram.messenger.g0.s0((g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).y());
                                org.telegram.messenger.g0.V3(cmVar, true);
                                cmVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() { // from class: org.telegram.ui.Components.ul
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i14 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i14;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i14, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.e.i0, 1000L);
                                                break;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(g2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = vlVar.a;
                                boolean z10 = tiVar.O2 != 0;
                                b0 b0Var = new b0(vlVar, 20);
                                final char c11 = c10 == true ? 1 : 0;
                                cameraController.recordVideo(cameraSessionObject, file, z10, b0Var, new Runnable() { // from class: org.telegram.ui.Components.ul
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (c11) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i14 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i14;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i14, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.e.i0, 1000L);
                                                break;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.l0.a(nt0.b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                break;
                            } else {
                                chatAttachAlertPhotoLayout.R0 = true;
                                g2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            }
                        }
                    }
                    shutterButton.w = false;
                    break;
                }
                break;
            case 20:
                mv0 mv0Var = (mv0) obj;
                View view = mv0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        mv0Var.s.setVisibility(0);
                        mv0Var.s.setAlpha(0.0f);
                    }
                    mv0Var.s.animate().setListener(null).cancel();
                    mv0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    mv0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 21:
                ((ThemeEditorView) obj).a = false;
                try {
                    org.telegram.ui.ActionBar.n6.l();
                    org.telegram.ui.ActionBar.n6.o();
                    org.telegram.ui.ActionBar.n6.q();
                    org.telegram.ui.ActionBar.n6.k(false, false);
                    org.telegram.ui.ActionBar.u6.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 22:
                j61 j61Var = (j61) obj;
                if (j61Var.d && (ac0Var = j61Var.f) != null && ac0Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = j61Var.a.a;
                    h61 h61Var = photoViewer.G2;
                    long S = h61Var != null ? h61Var.S() : 0L;
                    hi.r7 r7Var = j61Var.b;
                    if (r7Var != null && r7Var.o && !r7Var.h && !r7Var.e(hi.r7.a(S))) {
                        r7Var.f();
                    }
                    if (j61Var.g != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < j61Var.g.size()) {
                                hi.o7 o7Var2 = (hi.o7) j61Var.g.get(i14);
                                if (S < o7Var2.a || S >= o7Var2.b) {
                                    i14++;
                                } else {
                                    o7Var = o7Var2;
                                }
                            }
                        }
                    }
                    boolean z11 = (o7Var == null || TextUtils.isEmpty(o7Var.c)) ? false : true;
                    if (z11) {
                        if (o7Var != j61Var.h || !TextUtils.equals(o7Var.c, j61Var.f.getText())) {
                            j61Var.h = o7Var;
                            j61Var.f.setText(o7Var.c);
                        }
                        j61Var.f.setSpokenWords(o7Var.d);
                        j61Var.f.A(S);
                    }
                    if (z11 != j61Var.i) {
                        j61Var.i = z11;
                        j61Var.f.animate().cancel();
                        j61Var.f.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(z11 ? 120L : 180L).start();
                    }
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.cr0 cr0Var = photoViewer.i3;
                    if (cr0Var != null && cr0Var.getVisibility() == 0) {
                        height = org.telegram.messenger.g0.T1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    org.telegram.ui.wp0 wp0Var = photoViewer.U1;
                    if (wp0Var != null && photoViewer.a2 != null && wp0Var.getVisibility() == 0 && (mq0Var = photoViewer.R1) != null && mq0Var.getVisibility() == 0) {
                        height = org.telegram.messenger.g0.T1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L4 = (height - org.telegram.messenger.g0.L(8.0f)) - j61Var.f.getHeight();
                    if (j61Var.f.getTranslationY() != L4) {
                        j61Var.f.setTranslationY(L4);
                    }
                    j61Var.f.postOnAnimation(this);
                    break;
                }
                break;
            case 23:
                j71 j71Var = (j71) obj;
                if (j71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f12 = j71Var.g0 + (elapsedRealtime3 / 200.0f);
                    j71Var.g0 = f12;
                    j71Var.setAnimationIdicatorProgress(j71Var.b0.getInterpolation(f12));
                    if (j71Var.g0 > 1.0f) {
                        j71Var.g0 = 1.0f;
                    }
                    if (j71Var.g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(j71Var.j0);
                        break;
                    } else {
                        j71Var.K = false;
                        j71Var.setEnabled(true);
                        i71 i71Var = j71Var.E;
                        if (i71Var != null) {
                            i71Var.c(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.b0 b0Var2 = (org.telegram.ui.Components.voip.b0) obj;
                if (b0Var2.w) {
                    b0Var2.j(false);
                    org.telegram.messenger.g0.h3(this, 250L);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) obj;
                if (!a20Var.b || a20Var.R0.u2 != null) {
                    org.telegram.messenger.g0.h3(a20Var.i0, 3000L);
                    break;
                } else {
                    a20Var.h0 = false;
                    a20Var.setUiVisible(false);
                    break;
                }
            case 26:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                org.telegram.ui.Components.voip.u0 u0Var = k1Var.e;
                if (u0Var != null) {
                    if (!k1Var.b.a(k1Var.s)) {
                        if (k1Var.h == null) {
                            k1Var.h = new org.telegram.ui.Components.voip.i1();
                        }
                        VideoFrame videoFrame = k1Var.h.b;
                        if (videoFrame != null) {
                            u0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 500L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                j1Var.a();
                if (j1Var.b) {
                    org.telegram.messenger.g0.h3(this, 500L);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) obj;
                org.telegram.ui.Components.voip.m mVar = j2Var.b;
                if (mVar != null) {
                    mVar.b();
                }
                long c12 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c12 != j2Var.c || a10 != j2Var.d) {
                    j2Var.c = c12;
                    j2Var.d = a10;
                    wi.n nVar = j2Var.a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.h3(this, 500L);
                break;
            default:
                org.telegram.ui.Wallet.j1 j1Var2 = (org.telegram.ui.Wallet.j1) obj;
                if (j1Var2.d && j1Var2.e && j1Var2.k != null) {
                    if (SystemClock.elapsedRealtime() - j1Var2.l >= 30000) {
                        j1Var2.f("heartbeat timed out");
                        break;
                    } else {
                        j1Var2.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - j1Var2.l) + " ms ago");
                        j1Var2.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        org.telegram.messenger.g0.h3(this, 15000L);
                        break;
                    }
                }
                break;
        }
    }
}
