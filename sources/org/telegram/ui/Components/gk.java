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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v31, types: [org.telegram.ui.Components.ul] */
    @Override // java.lang.Runnable
    public final void run() {
        int L;
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                jk jkVar = (jk) obj;
                if (jkVar.T) {
                    jkVar.O.clear();
                    jkVar.Q.clear();
                    jkVar.R.clear();
                    jkVar.f();
                    break;
                }
                break;
            case 1:
                om omVar = (om) obj;
                pm pmVar = omVar.Q;
                if (pmVar.K != null && !pmVar.L) {
                    int computeVerticalScrollOffset = pmVar.r.computeVerticalScrollOffset();
                    boolean z10 = pmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (omVar.e() - omVar.r) + omVar.n;
                    float max = Math.max(0.0f, (pmVar.F - Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((pmVar.r.getMeasuredHeight() - (pmVar.F - computeVerticalScrollOffset)) - pmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    float L3 = (max >= L2 || computeVerticalScrollOffset <= pmVar.getListTopPadding()) ? max2 < L2 ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2)) : 0.0f : (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    int i12 = (int) L3;
                    if (Math.abs(i12) > 0 && pmVar.r.canScrollVertically(i12) && (L3 <= 0.0f || !z10)) {
                        pmVar.F += L3;
                        pmVar.r.scrollBy(0, i12);
                        omVar.invalidate();
                    }
                    omVar.M = true;
                    omVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 2:
                rn rnVar = (rn) obj;
                gk gkVar = rnVar.V0;
                org.telegram.ui.Cells.b6 b6Var = rnVar.h1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!rnVar.I && editField != null && rnVar.H && !rnVar.f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(gkVar);
                        org.telegram.messenger.g0.h3(gkVar, 100L);
                        break;
                    }
                }
                break;
            case 3:
                wt wtVar = (wt) obj;
                gk gkVar2 = wtVar.Q;
                rt rtVar = wtVar.a;
                if (!wtVar.E && rtVar != null && wtVar.O && !wtVar.w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    rtVar.requestFocus();
                    org.telegram.messenger.g0.I3(rtVar);
                    org.telegram.messenger.g0.r(gkVar2);
                    org.telegram.messenger.g0.h3(gkVar2, 100L);
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
                ry ryVar = (ry) obj;
                if (ryVar.C0.s == null) {
                    ryVar.Y1 = false;
                    ryVar.Z();
                    break;
                }
                break;
            case 6:
                pz pzVar = (pz) obj;
                if (pzVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = pzVar.q0 + (elapsedRealtime / 320.0f);
                    pzVar.q0 = f10;
                    pzVar.setAnimationIdicatorProgress(pzVar.j0.getInterpolation(f10));
                    if (pzVar.q0 > 1.0f) {
                        pzVar.q0 = 1.0f;
                    }
                    if (pzVar.q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(pzVar.w0);
                        break;
                    } else {
                        pzVar.P = false;
                        pzVar.setEnabled(true);
                        lz lzVar = pzVar.K;
                        if (lzVar != null) {
                            ((org.telegram.ui.tw) lzVar).b(1.0f);
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
                TextureView textureView = ((r40) obj).I0.q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new dw(12, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 9:
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
            case 10:
                ua0 ua0Var = (ua0) obj;
                ValueAnimator valueAnimator = ua0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ua0Var.h.start();
                    break;
                }
                break;
            case 11:
                ((pc0) obj).e();
                break;
            case 12:
                xg0 xg0Var = (xg0) obj;
                xg0Var.y = true;
                ValueAnimator valueAnimator2 = xg0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                xg0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xg0Var.z = ofFloat;
                ofFloat.addUpdateListener(xg0Var.b0);
                xg0Var.z.setInterpolator(new LinearInterpolator());
                xg0Var.z.setDuration(150L);
                xg0Var.z.start();
                break;
            case 13:
                ck0 ck0Var = (ck0) obj;
                m.b3 b3Var = ck0Var.g2;
                int[] iArr = ck0Var.l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (ck0Var.i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    ck0Var.M0(0.0f, ck0Var.l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    ck0Var.M0(0.0f, ck0Var.getMeasuredHeight() - ck0Var.l2[1]);
                }
                ((org.telegram.ui.bn) ck0Var.g2.d).A0.scrollBy(0, L);
                if (ck0Var.h2) {
                    org.telegram.messenger.g0.g3(ck0Var.D2);
                    break;
                }
                break;
            case 14:
                hj0 hj0Var = (hj0) obj;
                gk gkVar3 = hj0Var.j0;
                if (hj0Var.n) {
                    org.telegram.messenger.g0.r(gkVar3);
                    org.telegram.messenger.g0.h3(gkVar3, 4000L);
                    break;
                } else {
                    hj0Var.V = false;
                    hj0Var.invalidate();
                    break;
                }
            case 15:
                gk0 gk0Var = (gk0) obj;
                RecyclerView recyclerView = gk0Var.a;
                if (recyclerView != null) {
                    if (gk0Var.g) {
                        recyclerView.scrollBy(0, -gk0Var.i);
                        org.telegram.messenger.g0.g3(this);
                        break;
                    } else if (gk0Var.h) {
                        recyclerView.scrollBy(0, gk0Var.i);
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
                        hl0 hl0Var = scrollSlidingTextTabStrip.b;
                        if (hl0Var != null) {
                            hl0Var.g(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                kt0 kt0Var = shutterButton.e;
                if (kt0Var != null) {
                    final vl vlVar = (vl) kt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.e;
                    si siVar = chatAttachAlertPhotoLayout.b;
                    cm cmVar = chatAttachAlertPhotoLayout.S;
                    int i13 = siVar.O2;
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                    if ((i13 == 2 || (h2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.t0 && !siVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !siVar.B1) {
                        if (h2Var == null) {
                            h2Var = LaunchActivity.Q();
                        }
                        if (h2Var != null && h2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                org.telegram.messenger.f3.o(null, 2131749363, new lc(chatAttachAlertPhotoLayout.Q, vlVar.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    chatAttachAlertPhotoLayout.T[i14].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(lr.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                lr lrVar = lr.f;
                                duration.setInterpolator(lrVar).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                                org.telegram.ui.ActionBar.h2 h2Var2 = siVar.a2;
                                vlVar.a = org.telegram.messenger.g0.s0((h2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var2).z());
                                org.telegram.messenger.g0.V3(cmVar, true);
                                cmVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() { // from class: org.telegram.ui.Components.ul
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i15;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
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
                                org.telegram.messenger.g0.f2(h2Var.getParentActivity());
                                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), vlVar.a, siVar.O2 != 0, new b0(vlVar, 20), new Runnable() { // from class: org.telegram.ui.Components.ul
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i15 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i15;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i15, true, false));
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
                                chatAttachAlertPhotoLayout.l0.a(lt0.b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                break;
                            } else {
                                chatAttachAlertPhotoLayout.R0 = true;
                                h2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            }
                        }
                    }
                    shutterButton.w = false;
                    break;
                }
                break;
            case 18:
                kv0 kv0Var = (kv0) obj;
                View view = kv0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        kv0Var.s.setVisibility(0);
                        kv0Var.s.setAlpha(0.0f);
                    }
                    kv0Var.s.animate().setListener(null).cancel();
                    kv0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    kv0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 19:
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
            case 20:
                f71 f71Var = (f71) obj;
                if (f71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f12 = f71Var.g0 + (elapsedRealtime3 / 200.0f);
                    f71Var.g0 = f12;
                    f71Var.setAnimationIdicatorProgress(f71Var.b0.getInterpolation(f12));
                    if (f71Var.g0 > 1.0f) {
                        f71Var.g0 = 1.0f;
                    }
                    if (f71Var.g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(f71Var.j0);
                        break;
                    } else {
                        f71Var.K = false;
                        f71Var.setEnabled(true);
                        e71 e71Var = f71Var.E;
                        if (e71Var != null) {
                            e71Var.g(1.0f);
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
