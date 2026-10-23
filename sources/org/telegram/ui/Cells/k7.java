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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.nk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bw;
import org.telegram.ui.h30;
import org.telegram.ui.qn;
import org.telegram.ui.si;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [org.telegram.ui.Components.bm] */
    @Override // java.lang.Runnable
    public final void run() {
        int dp;
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) obj;
                if (m7Var.b == null) {
                    m7Var.b = new androidx.emoji2.text.j(m7Var, 4);
                }
                androidx.emoji2.text.j jVar = m7Var.b;
                int i13 = m7Var.c + 1;
                m7Var.c = i13;
                jVar.b = i13;
                m7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 1:
                v7 v7Var = (v7) obj;
                RectF rectF = v7Var.n;
                v7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.y, 1000L);
                break;
            case 2:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) obj;
                org.telegram.ui.Components.k8 k8Var = t7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = k8Var.J0 + 1;
                    k8Var.J0 = i14;
                    if (i14 == 1) {
                        t7Var.v = true;
                        k8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            k8Var.D0();
                        } else if (k8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(k8Var.N0);
                            k8Var.L0 = 0L;
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
            case 3:
                org.telegram.ui.Components.k8 k8Var2 = (org.telegram.ui.Components.k8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    k8Var2.K0 = System.currentTimeMillis();
                    break;
                } else {
                    float f7 = k8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k8Var2.K0;
                    k8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - k8Var2.L0;
                    int i15 = k8Var2.J0;
                    float f10 = ((long) ((f7 * r2) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    k8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = k8Var2.I0;
                        }
                        k8Var2.G0(playingMessageObject, false);
                    }
                    if (k8Var2.H0 == 1 && k8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || k8Var2.I0 == 0.0f) {
                            k8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (k8Var2.J0 > 0 && k8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k8Var2.N0, 16L);
                            break;
                        }
                    }
                }
                break;
            case 4:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f.performHapticFeedback(0);
                Runnable runnable = fdVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    break;
                }
                break;
            case 6:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (bnVar.J != null && !bnVar.K) {
                    int computeVerticalScrollOffset = bnVar.r.computeVerticalScrollOffset();
                    boolean z10 = bnVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (anVar.e() - anVar.r) + anVar.n;
                    float max = Math.max(0.0f, (bnVar.E - Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((bnVar.r.getMeasuredHeight() - (bnVar.E - computeVerticalScrollOffset)) - bnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= bnVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i16 = (int) dp3;
                    if (Math.abs(i16) > 0 && bnVar.r.canScrollVertically(i16) && (dp3 <= 0.0f || !z10)) {
                        bnVar.E += dp3;
                        bnVar.r.scrollBy(0, i16);
                        anVar.invalidate();
                    }
                    anVar.L = true;
                    anVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 7:
                fo foVar = (fo) obj;
                k7 k7Var = foVar.U0;
                c6 c6Var = foVar.g1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!foVar.H && editField != null && foVar.G && !foVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        AndroidUtilities.runOnUIThread(k7Var, 100L);
                        break;
                    }
                }
                break;
            case 8:
                qu quVar = (qu) obj;
                k7 k7Var2 = quVar.P;
                lu luVar = quVar.a;
                if (!quVar.y && luVar != null && quVar.N && !quVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    luVar.requestFocus();
                    AndroidUtilities.showKeyboard(luVar);
                    AndroidUtilities.cancelRunOnUIThread(k7Var2);
                    AndroidUtilities.runOnUIThread(k7Var2, 100L);
                    break;
                }
                break;
            case 9:
                c2.b bVar = (c2.b) ((ci.p3) obj).d;
                if (bVar.a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 10:
                tz tzVar = (tz) obj;
                if (tzVar.B0.s == null) {
                    tzVar.X1 = false;
                    tzVar.Y();
                    break;
                }
                break;
            case 11:
                s00 s00Var = (s00) obj;
                if (s00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = s00Var.p0 + (elapsedRealtime / 320.0f);
                    s00Var.p0 = f11;
                    s00Var.setAnimationIdicatorProgress(s00Var.i0.getInterpolation(f11));
                    if (s00Var.p0 > 1.0f) {
                        s00Var.p0 = 1.0f;
                    }
                    if (s00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.v0);
                        break;
                    } else {
                        s00Var.O = false;
                        s00Var.setEnabled(true);
                        n00 n00Var = s00Var.J;
                        if (n00Var != null) {
                            ((bw) n00Var).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 12:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.t0, 1000L);
                break;
            case 13:
                TextureView textureView = ((f60) obj).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new yt(15, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 14:
                k70 k70Var = (k70) obj;
                l70 l70Var = k70Var.x;
                y60 y60Var = l70Var.V;
                if (y60Var != null && y60Var.getAdapter() != null) {
                    l70Var.V.getClass();
                    int R = RecyclerView.R(k70Var);
                    if (R >= 0) {
                        l70Var.T.v(l70Var.V.T(k70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 15:
                oc0 oc0Var = (oc0) obj;
                ValueAnimator valueAnimator = oc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    oc0Var.h.start();
                    break;
                }
                break;
            case 16:
                ((me0) obj).e();
                break;
            case 17:
                fj0 fj0Var = (fj0) obj;
                fj0Var.y = true;
                ValueAnimator valueAnimator2 = fj0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                fj0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                fj0Var.z = ofFloat;
                ofFloat.addUpdateListener(fj0Var.b0);
                fj0Var.z.setInterpolator(new LinearInterpolator());
                fj0Var.z.setDuration(150L);
                fj0Var.z.start();
                break;
            case 18:
                jm0 jm0Var = (jm0) obj;
                si siVar = jm0Var.f2;
                int[] iArr = jm0Var.k2;
                qn qnVar = siVar.d;
                iArr[0] = (int) qnVar.s9;
                iArr[1] = qnVar.Ba;
                if (jm0Var.h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    jm0Var.M0(0.0f, jm0Var.k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    jm0Var.M0(0.0f, jm0Var.getMeasuredHeight() - jm0Var.k2[1]);
                }
                jm0Var.f2.d.x0.scrollBy(0, dp);
                if (jm0Var.g2) {
                    AndroidUtilities.runOnUIThread(jm0Var.B2);
                    break;
                }
                break;
            case 19:
                ql0 ql0Var = (ql0) obj;
                k7 k7Var3 = ql0Var.i0;
                if (ql0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(k7Var3);
                    AndroidUtilities.runOnUIThread(k7Var3, 4000L);
                    break;
                } else {
                    ql0Var.U = false;
                    ql0Var.invalidate();
                    break;
                }
            case 20:
                lm0 lm0Var = (lm0) obj;
                RecyclerView recyclerView = lm0Var.a;
                if (recyclerView != null) {
                    if (lm0Var.g) {
                        recyclerView.scrollBy(0, -lm0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    } else if (lm0Var.h) {
                        recyclerView.scrollBy(0, lm0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    }
                }
                break;
            case 21:
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
                        kn0 kn0Var = scrollSlidingTextTabStrip.b;
                        if (kn0Var != null) {
                            kn0Var.k0(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ShutterButton shutterButton = (ShutterButton) obj;
                zv0 zv0Var = shutterButton.e;
                if (zv0Var != null) {
                    final cm cmVar = (cm) zv0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.b;
                    mm mmVar = chatAttachAlertPhotoLayout.R;
                    int i17 = tiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                    if ((i17 == 2 || (n2Var instanceof qn)) && !chatAttachAlertPhotoLayout.s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i18 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i19 = 0; i19 < 2; i19++) {
                                        chatAttachAlertPhotoLayout.S[i19].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(bs.f).start();
                                    }
                                    ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                    bs bsVar = bs.f;
                                    duration2.setInterpolator(bsVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                    org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f0;
                                    cmVar.a = AndroidUtilities.generateVideoPath((n2Var2 instanceof qn) && ((qn) n2Var2).x());
                                    AndroidUtilities.updateViewVisibilityAnimated(mmVar, true);
                                    mmVar.setText(AndroidUtilities.formatLongDuration(0));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.bm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(cmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), cmVar.a, tiVar.T0 != 0, new org.telegram.ui.Components.s(cmVar, i18), new Runnable() { // from class: org.telegram.ui.Components.bm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(cmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(aw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    break;
                                } else {
                                    chatAttachAlertPhotoLayout.Q0 = true;
                                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                                }
                            } else {
                                nk.q(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, cmVar.c), null);
                            }
                        }
                    }
                    shutterButton.v = false;
                    break;
                }
                break;
            case 23:
                tx0 tx0Var = (tx0) obj;
                View view = tx0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        tx0Var.s.setVisibility(0);
                        tx0Var.s.setAlpha(0.0f);
                    }
                    tx0Var.s.animate().setListener(null).cancel();
                    tx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    tx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 24:
                d91 d91Var = (d91) obj;
                if (d91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = d91Var.f0 + (elapsedRealtime3 / 200.0f);
                    d91Var.f0 = f13;
                    d91Var.setAnimationIdicatorProgress(d91Var.a0.getInterpolation(f13));
                    if (d91Var.f0 > 1.0f) {
                        d91Var.f0 = 1.0f;
                    }
                    if (d91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(d91Var.i0);
                        break;
                    } else {
                        d91Var.J = false;
                        d91Var.setEnabled(true);
                        c91 c91Var = d91Var.y;
                        if (c91Var != null) {
                            ((l2.f) c91Var).I(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 25:
                h30 h30Var = (h30) obj;
                if (!h30Var.b || h30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(h30Var.h0, 3000L);
                    break;
                } else {
                    h30Var.g0 = false;
                    h30Var.setUiVisible(false);
                    break;
                }
            case 26:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) obj;
                if (a1Var.d && a1Var.e && a1Var.k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        break;
                    } else {
                        a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.l) + " ms ago");
                        a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        AndroidUtilities.runOnUIThread(this, 15000L);
                        break;
                    }
                }
                break;
            case 27:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.a != null && o5Var.d != null) {
                    o5Var.Q0();
                    if (o5Var.r) {
                        o5Var.a.postOnAnimation(this);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                org.telegram.ui.Wallet.z5 z5Var = s5Var.G;
                if (s5Var.a0) {
                    long nanoTime = System.nanoTime();
                    if (z5Var.a) {
                        if (z5Var.j == 0) {
                            z5Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r4) * 1.0E-9f));
                            z5Var.j = nanoTime;
                            if (z5Var.i - z5Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f14 = z5Var.d;
                                z5Var.d = com.google.android.gms.internal.play_billing.k3.y(z5Var.b, f14, exp, f14);
                                float f15 = z5Var.e;
                                z5Var.e = com.google.android.gms.internal.play_billing.k3.y(z5Var.c, f15, exp, f15);
                            }
                        }
                    }
                    s5Var.K = z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.b - z5Var.d)) : 0.0f;
                    float c10 = org.telegram.ui.Wallet.s5.c((z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.c - z5Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f16 = s5Var.K;
                    float f17 = s5Var.L;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f16, f17, 1.0f, f17);
                    s5Var.L = y3;
                    float f18 = s5Var.M;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(c10, f18, 1.0f, f18);
                    s5Var.M = y10;
                    float f19 = s5Var.e0;
                    s5Var.b((y3 * f19) + s5Var.N + s5Var.d0, (y10 * f19) + s5Var.O);
                    s5Var.postOnAnimation(this);
                    break;
                }
                break;
            default:
                ((p4.s0) obj).c();
                break;
        }
    }
}
