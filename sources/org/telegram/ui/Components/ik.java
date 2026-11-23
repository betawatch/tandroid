package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ik implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ik(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v31, types: [org.telegram.ui.Components.wl] */
    @Override // java.lang.Runnable
    public final void run() {
        int L;
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                lk lkVar = (lk) obj;
                if (lkVar.T) {
                    lkVar.O.clear();
                    lkVar.Q.clear();
                    lkVar.R.clear();
                    lkVar.f();
                    break;
                }
                break;
            case 1:
                qm qmVar = (qm) obj;
                rm rmVar = qmVar.Q;
                if (rmVar.K != null && !rmVar.L) {
                    int computeVerticalScrollOffset = rmVar.r.computeVerticalScrollOffset();
                    boolean z10 = rmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (qmVar.e() - qmVar.r) + qmVar.n;
                    float max = Math.max(0.0f, (rmVar.F - Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((rmVar.r.getMeasuredHeight() - (rmVar.F - computeVerticalScrollOffset)) - rmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    float L3 = (max >= L2 || computeVerticalScrollOffset <= rmVar.getListTopPadding()) ? max2 < L2 ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2)) : 0.0f : (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    int i12 = (int) L3;
                    if (Math.abs(i12) > 0 && rmVar.r.canScrollVertically(i12) && (L3 <= 0.0f || !z10)) {
                        rmVar.F += L3;
                        rmVar.r.scrollBy(0, i12);
                        qmVar.invalidate();
                    }
                    qmVar.M = true;
                    qmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 2:
                tn tnVar = (tn) obj;
                ik ikVar = tnVar.V0;
                org.telegram.ui.Cells.b6 b6Var = tnVar.h1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!tnVar.I && editField != null && tnVar.H && !tnVar.f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(ikVar);
                        org.telegram.messenger.g0.h3(ikVar, 100L);
                        break;
                    }
                }
                break;
            case 3:
                yt ytVar = (yt) obj;
                ik ikVar2 = ytVar.Q;
                tt ttVar = ytVar.a;
                if (!ytVar.E && ttVar != null && ytVar.O && !ytVar.w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    ttVar.requestFocus();
                    org.telegram.messenger.g0.I3(ttVar);
                    org.telegram.messenger.g0.r(ikVar2);
                    org.telegram.messenger.g0.h3(ikVar2, 100L);
                    break;
                }
                break;
            case 4:
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
            case 5:
                ty tyVar = (ty) obj;
                if (tyVar.C0.s == null) {
                    tyVar.Y1 = false;
                    tyVar.Z();
                    break;
                }
                break;
            case 6:
                rz rzVar = (rz) obj;
                if (rzVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = rzVar.q0 + (elapsedRealtime / 320.0f);
                    rzVar.q0 = f10;
                    rzVar.setAnimationIdicatorProgress(rzVar.j0.getInterpolation(f10));
                    if (rzVar.q0 > 1.0f) {
                        rzVar.q0 = 1.0f;
                    }
                    if (rzVar.q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(rzVar.w0);
                        break;
                    } else {
                        rzVar.P = false;
                        rzVar.setEnabled(true);
                        nz nzVar = rzVar.K;
                        if (nzVar != null) {
                            ((org.telegram.ui.tw) nzVar).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.h3(fragmentContextView.u0, 1000L);
                break;
            case 8:
                TextureView textureView = ((u40) obj).I0.q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new ou(14, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 9:
                z50 z50Var = (z50) obj;
                a60 a60Var = z50Var.E;
                n50 n50Var = a60Var.Q1;
                if (n50Var != null && n50Var.getAdapter() != null) {
                    a60Var.Q1.getClass();
                    int R = RecyclerView.R(z50Var);
                    if (R >= 0) {
                        a60Var.O1.t(a60Var.Q1.T(z50Var), R);
                    }
                }
                org.telegram.messenger.g0.g3(this);
                break;
            case 10:
                wa0 wa0Var = (wa0) obj;
                ValueAnimator valueAnimator = wa0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    wa0Var.h.start();
                    break;
                }
                break;
            case 11:
                ((qc0) obj).e();
                break;
            case 12:
                zg0 zg0Var = (zg0) obj;
                zg0Var.y = true;
                ValueAnimator valueAnimator2 = zg0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                zg0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zg0Var.z = ofFloat;
                ofFloat.addUpdateListener(zg0Var.b0);
                zg0Var.z.setInterpolator(new LinearInterpolator());
                zg0Var.z.setDuration(150L);
                zg0Var.z.start();
                break;
            case 13:
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
            case 14:
                jj0 jj0Var = (jj0) obj;
                ik ikVar3 = jj0Var.j0;
                if (jj0Var.n) {
                    org.telegram.messenger.g0.r(ikVar3);
                    org.telegram.messenger.g0.h3(ikVar3, 4000L);
                    break;
                } else {
                    jj0Var.V = false;
                    jj0Var.invalidate();
                    break;
                }
            case 15:
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
            case 16:
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
                            jl0Var.g(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                nt0 nt0Var = shutterButton.e;
                if (nt0Var != null) {
                    final xl xlVar = (xl) nt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.e;
                    ui uiVar = chatAttachAlertPhotoLayout.b;
                    em emVar = chatAttachAlertPhotoLayout.S;
                    int i13 = uiVar.O2;
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
                    if ((i13 == 2 || (g2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.t0 && !uiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !uiVar.B1) {
                        if (g2Var == null) {
                            g2Var = LaunchActivity.Q();
                        }
                        if (g2Var != null && g2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                org.telegram.messenger.f3.o(null, 2131749362, new lc(chatAttachAlertPhotoLayout.Q, xlVar.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    chatAttachAlertPhotoLayout.T[i14].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(nr.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                nr nrVar = nr.f;
                                duration.setInterpolator(nrVar).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                                org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.a2;
                                xlVar.a = org.telegram.messenger.g0.s0((g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).z());
                                org.telegram.messenger.g0.V3(emVar, true);
                                emVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() { // from class: org.telegram.ui.Components.wl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = xlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i15;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.messenger.g0.h3(xlVar.e.i0, 1000L);
                                                break;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(g2Var.getParentActivity());
                                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), xlVar.a, uiVar.O2 != 0, new c0(xlVar, 20), new Runnable() { // from class: org.telegram.ui.Components.wl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = xlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i15;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.messenger.g0.h3(xlVar.e.i0, 1000L);
                                                break;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.l0.a(ot0.b);
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
            case 18:
                nv0 nv0Var = (nv0) obj;
                View view = nv0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        nv0Var.s.setVisibility(0);
                        nv0Var.s.setAlpha(0.0f);
                    }
                    nv0Var.s.animate().setListener(null).cancel();
                    nv0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    nv0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 19:
                ((ThemeEditorView) obj).a = false;
                try {
                    org.telegram.ui.ActionBar.m6.l();
                    org.telegram.ui.ActionBar.m6.o();
                    org.telegram.ui.ActionBar.m6.q();
                    org.telegram.ui.ActionBar.m6.k(false, false);
                    org.telegram.ui.ActionBar.t6.b0(null, true);
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
            case 20:
                i71 i71Var = (i71) obj;
                if (i71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f12 = i71Var.g0 + (elapsedRealtime3 / 200.0f);
                    i71Var.g0 = f12;
                    i71Var.setAnimationIdicatorProgress(i71Var.b0.getInterpolation(f12));
                    if (i71Var.g0 > 1.0f) {
                        i71Var.g0 = 1.0f;
                    }
                    if (i71Var.g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(i71Var.j0);
                        break;
                    } else {
                        i71Var.K = false;
                        i71Var.setEnabled(true);
                        h71 h71Var = i71Var.E;
                        if (h71Var != null) {
                            h71Var.g(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) obj;
                if (a0Var.w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.h3(this, 250L);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) obj;
                if (!b20Var.b || b20Var.R0.u2 != null) {
                    org.telegram.messenger.g0.h3(b20Var.i0, 3000L);
                    break;
                } else {
                    b20Var.h0 = false;
                    b20Var.setUiVisible(false);
                    break;
                }
            case 23:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                org.telegram.ui.Components.voip.t0 t0Var = j1Var.e;
                if (t0Var != null) {
                    if (!j1Var.b.a(j1Var.s)) {
                        if (j1Var.h == null) {
                            j1Var.h = new org.telegram.ui.Components.voip.h1();
                        }
                        VideoFrame videoFrame = j1Var.h.b;
                        if (videoFrame != null) {
                            t0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 500L);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) obj;
                i1Var.a();
                if (i1Var.b) {
                    org.telegram.messenger.g0.h3(this, 500L);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) obj;
                org.telegram.ui.Components.voip.m mVar = i2Var.b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != i2Var.c || a10 != i2Var.d) {
                    i2Var.c = c10;
                    i2Var.d = a10;
                    wi.n nVar = i2Var.a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.h3(this, 500L);
                break;
            case 26:
                org.telegram.ui.Wallet.i1 i1Var2 = (org.telegram.ui.Wallet.i1) obj;
                if (i1Var2.d && i1Var2.e && i1Var2.k != null) {
                    if (SystemClock.elapsedRealtime() - i1Var2.l >= 30000) {
                        i1Var2.f("heartbeat timed out");
                        break;
                    } else {
                        i1Var2.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - i1Var2.l) + " ms ago");
                        i1Var2.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        org.telegram.messenger.g0.h3(this, 15000L);
                        break;
                    }
                }
                break;
            case 27:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.a != null && n6Var.e != null) {
                    n6Var.b1();
                    if (n6Var.s) {
                        n6Var.a.postOnAnimation(this);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                org.telegram.ui.Wallet.z6 z6Var = s6Var.H;
                if (s6Var.b0) {
                    long nanoTime = System.nanoTime();
                    if (z6Var.a) {
                        if (z6Var.j == 0) {
                            z6Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r4) * 1.0E-9f));
                            z6Var.j = nanoTime;
                            if (z6Var.i - z6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f13 = z6Var.d;
                                z6Var.d = com.google.android.gms.internal.vision.e2.z(z6Var.b, f13, exp, f13);
                                float f14 = z6Var.e;
                                z6Var.e = com.google.android.gms.internal.vision.e2.z(z6Var.c, f14, exp, f14);
                            }
                        }
                    }
                    s6Var.L = z6Var.a ? Math.max(-15.0f, Math.min(15.0f, z6Var.b - z6Var.d)) : 0.0f;
                    float c11 = org.telegram.ui.Wallet.s6.c((z6Var.a ? Math.max(-15.0f, Math.min(15.0f, z6Var.c - z6Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f15 = s6Var.L;
                    float f16 = s6Var.M;
                    float z11 = com.google.android.gms.internal.vision.e2.z(f15, f16, 1.0f, f16);
                    s6Var.M = z11;
                    float f17 = s6Var.N;
                    float z12 = com.google.android.gms.internal.vision.e2.z(c11, f17, 1.0f, f17);
                    s6Var.N = z12;
                    float f18 = s6Var.f0;
                    s6Var.b((z11 * f18) + s6Var.O + s6Var.e0, (z12 * f18) + s6Var.P);
                    s6Var.postOnAnimation(this);
                    break;
                }
                break;
            default:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.zd) obj).run();
                    break;
                }
                break;
        }
    }
}
