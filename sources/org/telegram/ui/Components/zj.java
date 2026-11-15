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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v31, types: [org.telegram.ui.Components.nl] */
    @Override // java.lang.Runnable
    public final void run() {
        int L;
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ck ckVar = (ck) obj;
                if (ckVar.T) {
                    ckVar.O.clear();
                    ckVar.Q.clear();
                    ckVar.R.clear();
                    ckVar.f();
                    break;
                }
                break;
            case 1:
                hm hmVar = (hm) obj;
                im imVar = hmVar.Q;
                if (imVar.K != null && !imVar.L) {
                    int computeVerticalScrollOffset = imVar.r.computeVerticalScrollOffset();
                    boolean z10 = imVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (hmVar.e() - hmVar.r) + hmVar.n;
                    float max = Math.max(0.0f, (imVar.F - Math.max(0, computeVerticalScrollOffset - imVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((imVar.r.getMeasuredHeight() - (imVar.F - computeVerticalScrollOffset)) - imVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    float L3 = (max >= L2 || computeVerticalScrollOffset <= imVar.getListTopPadding()) ? max2 < L2 ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2)) : 0.0f : (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    int i12 = (int) L3;
                    if (Math.abs(i12) > 0 && imVar.r.canScrollVertically(i12) && (L3 <= 0.0f || !z10)) {
                        imVar.F += L3;
                        imVar.r.scrollBy(0, i12);
                        hmVar.invalidate();
                    }
                    hmVar.M = true;
                    hmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 2:
                jn jnVar = (jn) obj;
                zj zjVar = jnVar.V0;
                org.telegram.ui.Cells.z5 z5Var = jnVar.h1;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!jnVar.I && editField != null && jnVar.H && !jnVar.f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.J3(editField);
                        org.telegram.messenger.g0.r(zjVar);
                        org.telegram.messenger.g0.i3(zjVar, 100L);
                        break;
                    }
                }
                break;
            case 3:
                rt rtVar = (rt) obj;
                zj zjVar2 = rtVar.Q;
                mt mtVar = rtVar.a;
                if (!rtVar.E && mtVar != null && rtVar.O && !rtVar.w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    mtVar.requestFocus();
                    org.telegram.messenger.g0.J3(mtVar);
                    org.telegram.messenger.g0.r(zjVar2);
                    org.telegram.messenger.g0.i3(zjVar2, 100L);
                    break;
                }
                break;
            case 4:
                ab.q qVar = (ab.q) ((fi.c3) obj).d;
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
                ly lyVar = (ly) obj;
                if (lyVar.C0.s == null) {
                    lyVar.Y1 = false;
                    lyVar.Z();
                    break;
                }
                break;
            case 6:
                iz izVar = (iz) obj;
                if (izVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = izVar.q0 + (elapsedRealtime / 320.0f);
                    izVar.q0 = f10;
                    izVar.setAnimationIdicatorProgress(izVar.j0.getInterpolation(f10));
                    if (izVar.q0 > 1.0f) {
                        izVar.q0 = 1.0f;
                    }
                    if (izVar.q0 < 1.0f) {
                        org.telegram.messenger.g0.h3(izVar.w0);
                        break;
                    } else {
                        izVar.P = false;
                        izVar.setEnabled(true);
                        ez ezVar = izVar.K;
                        if (ezVar != null) {
                            ((org.telegram.ui.pw) ezVar).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.u0, 1000L);
                break;
            case 8:
                TextureView textureView = ((j40) obj).I0.q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new vs(16, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 9:
                o50 o50Var = (o50) obj;
                p50 p50Var = o50Var.E;
                c50 c50Var = p50Var.Q1;
                if (c50Var != null && c50Var.getAdapter() != null) {
                    p50Var.Q1.getClass();
                    int R = RecyclerView.R(o50Var);
                    if (R >= 0) {
                        p50Var.O1.t(p50Var.Q1.T(o50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                break;
            case 10:
                ja0 ja0Var = (ja0) obj;
                ValueAnimator valueAnimator = ja0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ja0Var.h.start();
                    break;
                }
                break;
            case 11:
                ((fc0) obj).e();
                break;
            case 12:
                ng0 ng0Var = (ng0) obj;
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
                break;
            case 13:
                uj0 uj0Var = (uj0) obj;
                m.b3 b3Var = uj0Var.g2;
                int[] iArr = uj0Var.l2;
                org.telegram.ui.an anVar = (org.telegram.ui.an) b3Var.d;
                iArr[0] = (int) anVar.O9;
                iArr[1] = anVar.Xa;
                if (uj0Var.i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    uj0Var.M0(0.0f, uj0Var.l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    uj0Var.M0(0.0f, uj0Var.getMeasuredHeight() - uj0Var.l2[1]);
                }
                ((org.telegram.ui.an) uj0Var.g2.d).A0.scrollBy(0, L);
                if (uj0Var.h2) {
                    org.telegram.messenger.g0.h3(uj0Var.D2);
                    break;
                }
                break;
            case 14:
                zi0 zi0Var = (zi0) obj;
                zj zjVar3 = zi0Var.j0;
                if (zi0Var.n) {
                    org.telegram.messenger.g0.r(zjVar3);
                    org.telegram.messenger.g0.i3(zjVar3, 4000L);
                    break;
                } else {
                    zi0Var.V = false;
                    zi0Var.invalidate();
                    break;
                }
            case 15:
                yj0 yj0Var = (yj0) obj;
                RecyclerView recyclerView = yj0Var.a;
                if (recyclerView != null) {
                    if (yj0Var.g) {
                        recyclerView.scrollBy(0, -yj0Var.i);
                        org.telegram.messenger.g0.h3(this);
                        break;
                    } else if (yj0Var.h) {
                        recyclerView.scrollBy(0, yj0Var.i);
                        org.telegram.messenger.g0.h3(this);
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
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.e0);
                        break;
                    } else {
                        scrollSlidingTextTabStrip.I = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        zk0 zk0Var = scrollSlidingTextTabStrip.b;
                        if (zk0Var != null) {
                            zk0Var.D0(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                ct0 ct0Var = shutterButton.e;
                if (ct0Var != null) {
                    final ol olVar = (ol) ct0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.e;
                    ki kiVar = chatAttachAlertPhotoLayout.b;
                    vl vlVar = chatAttachAlertPhotoLayout.S;
                    int i13 = kiVar.O2;
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                    if ((i13 == 2 || (e2Var instanceof org.telegram.ui.an)) && !chatAttachAlertPhotoLayout.t0 && !kiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !kiVar.B1) {
                        if (e2Var == null) {
                            e2Var = LaunchActivity.Q();
                        }
                        if (e2Var != null && e2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.x0) {
                                int i14 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i15 = 0; i15 < 2; i15++) {
                                        chatAttachAlertPhotoLayout.T[i15].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(er.f).start();
                                    }
                                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                    er erVar = er.f;
                                    duration.setInterpolator(erVar).start();
                                    chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                                    org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
                                    olVar.a = org.telegram.messenger.g0.s0((e2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var2).z());
                                    org.telegram.messenger.g0.W3(vlVar, true);
                                    vlVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                    chatAttachAlertPhotoLayout.h0 = 0;
                                    chatAttachAlertPhotoLayout.i0 = new Runnable() { // from class: org.telegram.ui.Components.nl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = olVar.e;
                                                    if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                        int i16 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                        chatAttachAlertPhotoLayout2.h0 = i16;
                                                        chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i16, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(olVar.e.i0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    org.telegram.messenger.g0.f2(e2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), olVar.a, kiVar.O2 != 0, new s(olVar, i14), new Runnable() { // from class: org.telegram.ui.Components.nl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = olVar.e;
                                                    if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                        int i16 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                        chatAttachAlertPhotoLayout2.h0 = i16;
                                                        chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i16, true, false));
                                                        org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.i3(olVar.e.i0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.Q);
                                    chatAttachAlertPhotoLayout.l0.a(dt0.b);
                                    chatAttachAlertPhotoLayout.Q.runHaptic();
                                    break;
                                } else {
                                    chatAttachAlertPhotoLayout.R0 = true;
                                    e2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                                }
                            } else {
                                org.telegram.messenger.k5.o(null, 2131749538, new cc(chatAttachAlertPhotoLayout.Q, olVar.c), null);
                            }
                        }
                    }
                    shutterButton.w = false;
                    break;
                }
                break;
            case 18:
                cv0 cv0Var = (cv0) obj;
                View view = cv0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        cv0Var.s.setVisibility(0);
                        cv0Var.s.setAlpha(0.0f);
                    }
                    cv0Var.s.animate().setListener(null).cancel();
                    cv0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    cv0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 19:
                ((ThemeEditorView) obj).a = false;
                try {
                    org.telegram.ui.ActionBar.j6.l();
                    org.telegram.ui.ActionBar.j6.o();
                    org.telegram.ui.ActionBar.j6.q();
                    org.telegram.ui.ActionBar.j6.k(false, false);
                    org.telegram.ui.ActionBar.q6.b0(null, true);
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
                v61 v61Var = (v61) obj;
                if (v61Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f12 = v61Var.g0 + (elapsedRealtime3 / 200.0f);
                    v61Var.g0 = f12;
                    v61Var.setAnimationIdicatorProgress(v61Var.b0.getInterpolation(f12));
                    if (v61Var.g0 > 1.0f) {
                        v61Var.g0 = 1.0f;
                    }
                    if (v61Var.g0 < 1.0f) {
                        org.telegram.messenger.g0.h3(v61Var.j0);
                        break;
                    } else {
                        v61Var.K = false;
                        v61Var.setEnabled(true);
                        u61 u61Var = v61Var.E;
                        if (u61Var != null) {
                            ((cf) u61Var).q(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) obj;
                if (b0Var.w) {
                    b0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) obj;
                if (!y10Var.b || y10Var.R0.u2 != null) {
                    org.telegram.messenger.g0.i3(y10Var.i0, 3000L);
                    break;
                } else {
                    y10Var.h0 = false;
                    y10Var.setUiVisible(false);
                    break;
                }
            case 23:
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
                    org.telegram.messenger.g0.i3(this, 500L);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                j1Var.a();
                if (j1Var.b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) obj;
                org.telegram.ui.Components.voip.m mVar = j2Var.b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != j2Var.c || a10 != j2Var.d) {
                    j2Var.c = c10;
                    j2Var.d = a10;
                    wi.n nVar = j2Var.a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                break;
            case 26:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
                if (y0Var.d && y0Var.e && y0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        break;
                    } else {
                        y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.l) + " ms ago");
                        y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        org.telegram.messenger.g0.i3(this, 15000L);
                        break;
                    }
                }
                break;
            case 27:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.a != null && y5Var.e != null) {
                    y5Var.X0();
                    if (y5Var.s) {
                        y5Var.a.postOnAnimation(this);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                org.telegram.ui.Wallet.j6 j6Var = c6Var.H;
                if (c6Var.b0) {
                    long nanoTime = System.nanoTime();
                    if (j6Var.a) {
                        if (j6Var.j == 0) {
                            j6Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r4) * 1.0E-9f));
                            j6Var.j = nanoTime;
                            if (j6Var.i - j6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f13 = j6Var.d;
                                j6Var.d = com.google.android.gms.internal.vision.e2.z(j6Var.b, f13, exp, f13);
                                float f14 = j6Var.e;
                                j6Var.e = com.google.android.gms.internal.vision.e2.z(j6Var.c, f14, exp, f14);
                            }
                        }
                    }
                    c6Var.L = j6Var.a ? Math.max(-15.0f, Math.min(15.0f, j6Var.b - j6Var.d)) : 0.0f;
                    float c11 = org.telegram.ui.Wallet.c6.c((j6Var.a ? Math.max(-15.0f, Math.min(15.0f, j6Var.c - j6Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f15 = c6Var.L;
                    float f16 = c6Var.M;
                    float z11 = com.google.android.gms.internal.vision.e2.z(f15, f16, 1.0f, f16);
                    c6Var.M = z11;
                    float f17 = c6Var.N;
                    float z12 = com.google.android.gms.internal.vision.e2.z(c11, f17, 1.0f, f17);
                    c6Var.N = z12;
                    float f18 = c6Var.f0;
                    c6Var.b((z11 * f18) + c6Var.O + c6Var.e0, (z12 * f18) + c6Var.P);
                    c6Var.postOnAnimation(this);
                    break;
                }
                break;
            default:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.yd) obj).run();
                    break;
                }
                break;
        }
    }
}
