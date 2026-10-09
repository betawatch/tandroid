package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.sw;
import org.telegram.ui.y30;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v74, types: [org.telegram.ui.Components.hm] */
    @Override // java.lang.Runnable
    public final void run() {
        int dp;
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                break;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.b == null) {
                    n7Var.b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.b;
                int i13 = n7Var.c + 1;
                n7Var.c = i13;
                jVar.b = i13;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.y, 1000L);
                break;
            case 3:
                org.telegram.ui.Components.u7 u7Var = (org.telegram.ui.Components.u7) obj;
                org.telegram.ui.Components.l8 l8Var = u7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = l8Var.J0 + 1;
                    l8Var.J0 = i14;
                    if (i14 == 1) {
                        u7Var.v = true;
                        l8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            l8Var.D0();
                        } else if (l8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(l8Var.N0);
                            l8Var.L0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    } else if (i14 == 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.l8 l8Var2 = (org.telegram.ui.Components.l8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    l8Var2.K0 = System.currentTimeMillis();
                    break;
                } else {
                    float f7 = l8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - l8Var2.K0;
                    l8Var2.K0 = currentTimeMillis;
                    long j10 = currentTimeMillis - l8Var2.L0;
                    int i15 = l8Var2.J0;
                    float f10 = ((long) ((f7 * r3) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j3) - j3))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    l8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = l8Var2.I0;
                        }
                        l8Var2.G0(playingMessageObject, false);
                    }
                    if (l8Var2.H0 == 1 && l8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j10 > 200 || l8Var2.I0 == 0.0f) {
                            l8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (l8Var2.J0 > 0 && l8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(l8Var2.N0, 16L);
                            break;
                        }
                    }
                }
                break;
            case 5:
                id idVar = (id) obj;
                idVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                idVar.f.performHapticFeedback(0);
                Runnable runnable = idVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                rk rkVar = (rk) obj;
                if (rkVar.S) {
                    rkVar.N.clear();
                    rkVar.P.clear();
                    rkVar.Q.clear();
                    rkVar.l();
                    break;
                }
                break;
            case 7:
                gn gnVar = (gn) obj;
                hn hnVar = gnVar.P;
                if (hnVar.J != null && !hnVar.K) {
                    int computeVerticalScrollOffset = hnVar.r.computeVerticalScrollOffset();
                    boolean z10 = hnVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gnVar.e() - gnVar.r) + gnVar.n;
                    float max = Math.max(0.0f, (hnVar.E - Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hnVar.r.getMeasuredHeight() - (hnVar.E - computeVerticalScrollOffset)) - hnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= hnVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i16 = (int) dp3;
                    if (Math.abs(i16) > 0 && hnVar.r.canScrollVertically(i16) && (dp3 <= 0.0f || !z10)) {
                        hnVar.E += dp3;
                        hnVar.r.scrollBy(0, i16);
                        gnVar.invalidate();
                    }
                    gnVar.L = true;
                    gnVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 8:
                lo loVar = (lo) obj;
                t6 t6Var = loVar.U0;
                d6 d6Var = loVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!loVar.H && editField != null && loVar.G && !loVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var, 100L);
                        break;
                    }
                }
                break;
            case 9:
                zu zuVar = (zu) obj;
                t6 t6Var2 = zuVar.P;
                uu uuVar = zuVar.a;
                if (!zuVar.y && uuVar != null && zuVar.N && !zuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    uuVar.requestFocus();
                    AndroidUtilities.showKeyboard(uuVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    break;
                }
                break;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.z4) obj).d;
                if (mVar.a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 11:
                a00 a00Var = (a00) obj;
                if (a00Var.B0.s == null) {
                    a00Var.X1 = false;
                    a00Var.Y();
                    break;
                }
                break;
            case 12:
                a10 a10Var = (a10) obj;
                if (a10Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = a10Var.p0 + (elapsedRealtime / 320.0f);
                    a10Var.p0 = f11;
                    a10Var.setAnimationIdicatorProgress(a10Var.i0.getInterpolation(f11));
                    if (a10Var.p0 > 1.0f) {
                        a10Var.p0 = 1.0f;
                    }
                    if (a10Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(a10Var.v0);
                        break;
                    } else {
                        a10Var.O = false;
                        a10Var.setEnabled(true);
                        u00 u00Var = a10Var.J;
                        if (u00Var != null) {
                            ((sw) u00Var).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.t0, 1000L);
                break;
            case 14:
                TextureView textureView = ((l60) obj).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new zr(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 15:
                s70 s70Var = (s70) obj;
                t70 t70Var = s70Var.x;
                g70 g70Var = t70Var.V;
                if (g70Var != null && g70Var.getAdapter() != null) {
                    t70Var.V.getClass();
                    int R = RecyclerView.R(s70Var);
                    if (R >= 0) {
                        t70Var.T.v(t70Var.V.T(s70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 16:
                vc0 vc0Var = (vc0) obj;
                ValueAnimator valueAnimator = vc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vc0Var.h.start();
                    break;
                }
                break;
            case 17:
                ((te0) obj).e();
                break;
            case 18:
                nj0 nj0Var = (nj0) obj;
                nj0Var.y = true;
                ValueAnimator valueAnimator2 = nj0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nj0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nj0Var.z = ofFloat;
                ofFloat.addUpdateListener(nj0Var.b0);
                nj0Var.z.setInterpolator(new LinearInterpolator());
                nj0Var.z.setDuration(150L);
                nj0Var.z.start();
                break;
            case 19:
                qm0 qm0Var = (qm0) obj;
                bj bjVar = qm0Var.f2;
                int[] iArr = qm0Var.k2;
                zn znVar = bjVar.d;
                iArr[0] = (int) znVar.s9;
                iArr[1] = znVar.Ba;
                if (qm0Var.h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    qm0Var.M0(0.0f, qm0Var.k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    qm0Var.M0(0.0f, qm0Var.getMeasuredHeight() - qm0Var.k2[1]);
                }
                qm0Var.f2.d.x0.scrollBy(0, dp);
                if (qm0Var.g2) {
                    AndroidUtilities.runOnUIThread(qm0Var.B2);
                    break;
                }
                break;
            case 20:
                xl0 xl0Var = (xl0) obj;
                t6 t6Var3 = xl0Var.i0;
                if (xl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    break;
                } else {
                    xl0Var.U = false;
                    xl0Var.invalidate();
                    break;
                }
            case 21:
                sm0 sm0Var = (sm0) obj;
                RecyclerView recyclerView = sm0Var.a;
                if (recyclerView != null) {
                    if (sm0Var.g) {
                        recyclerView.scrollBy(0, -sm0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    } else if (sm0Var.h) {
                        recyclerView.scrollBy(0, sm0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    }
                }
                break;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f12 = scrollSlidingTextTabStrip.S + (elapsedRealtime2 / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f12;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f12));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.d0);
                        break;
                    } else {
                        scrollSlidingTextTabStrip.H = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        rn0 rn0Var = scrollSlidingTextTabStrip.b;
                        if (rn0Var != null) {
                            rn0Var.u0(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                gw0 gw0Var = shutterButton.e;
                if (gw0Var != null) {
                    final im imVar = (im) gw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.e;
                    yi yiVar = chatAttachAlertPhotoLayout.b;
                    sm smVar = chatAttachAlertPhotoLayout.R;
                    int i17 = yiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                    if ((i17 == 2 || (n2Var instanceof zn)) && !chatAttachAlertPhotoLayout.s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i18 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i19 = 0; i19 < 2; i19++) {
                                        chatAttachAlertPhotoLayout.S[i19].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(hs.f).start();
                                    }
                                    ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                    hs hsVar = hs.f;
                                    duration2.setInterpolator(hsVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(hsVar).start();
                                    org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
                                    imVar.a = AndroidUtilities.generateVideoPath((n2Var2 instanceof zn) && ((zn) n2Var2).v());
                                    AndroidUtilities.updateViewVisibilityAnimated(smVar, true);
                                    smVar.setText(AndroidUtilities.formatLongDuration(0));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.hm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(imVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), imVar.a, yiVar.T0 != 0, new org.telegram.ui.Components.s(imVar, i18), new Runnable() { // from class: org.telegram.ui.Components.hm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(imVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(hw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    break;
                                } else {
                                    chatAttachAlertPhotoLayout.Q0 = true;
                                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                                }
                            } else {
                                bi.q(R.string.GlobalAttachVideoRestricted, new ad(chatAttachAlertPhotoLayout.P, imVar.c), null);
                            }
                        }
                    }
                    shutterButton.v = false;
                    break;
                }
                break;
            case 24:
                ay0 ay0Var = (ay0) obj;
                View view = ay0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        ay0Var.s.setVisibility(0);
                        ay0Var.s.setAlpha(0.0f);
                    }
                    ay0Var.s.animate().setListener(null).cancel();
                    ay0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    ay0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 25:
                n91 n91Var = (n91) obj;
                if (n91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = n91Var.f0 + (elapsedRealtime3 / 200.0f);
                    n91Var.f0 = f13;
                    n91Var.setAnimationIdicatorProgress(n91Var.a0.getInterpolation(f13));
                    if (n91Var.f0 > 1.0f) {
                        n91Var.f0 = 1.0f;
                    }
                    if (n91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(n91Var.i0);
                        break;
                    } else {
                        n91Var.J = false;
                        n91Var.setEnabled(true);
                        m91 m91Var = n91Var.y;
                        if (m91Var != null) {
                            ((m2.t) m91Var).D(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 26:
                y30 y30Var = (y30) obj;
                if (!y30Var.b || y30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(y30Var.h0, 3000L);
                    break;
                } else {
                    y30Var.g0 = false;
                    y30Var.setUiVisible(false);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.e && z0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        break;
                    } else {
                        z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.l) + " ms ago");
                        z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        AndroidUtilities.runOnUIThread(this, 15000L);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) obj;
                if (a5Var.a != null && a5Var.d != null) {
                    a5Var.E0();
                    if (a5Var.r) {
                        a5Var.a.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                org.telegram.ui.Wallet.m5 m5Var = d5Var.x;
                if (d5Var.isAttachedToWindow()) {
                    m5Var.b(System.nanoTime());
                    d5Var.G = m5Var.a ? Math.max(-15.0f, Math.min(15.0f, m5Var.b - m5Var.d)) : 0.0f;
                    float max3 = m5Var.a ? Math.max(-15.0f, Math.min(15.0f, m5Var.c - m5Var.e)) : 0.0f;
                    float f14 = d5Var.G;
                    float f15 = d5Var.H;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f14, f15, 1.0f, f15);
                    d5Var.H = y3;
                    float f16 = d5Var.I;
                    float y10 = com.google.android.gms.internal.vision.e2.y(max3, f16, 1.0f, f16);
                    d5Var.I = y10;
                    float f17 = d5Var.U;
                    d5Var.b((y3 * f17) + d5Var.J + d5Var.T, (y10 * f17) + d5Var.K);
                    d5Var.postOnAnimation(this);
                    break;
                }
                break;
        }
    }
}
