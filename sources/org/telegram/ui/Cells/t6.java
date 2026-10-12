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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
import org.telegram.ui.fj;
import org.telegram.ui.fo;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v74, types: [org.telegram.ui.Components.em] */
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
                org.telegram.ui.Components.v7 v7Var = (org.telegram.ui.Components.v7) obj;
                org.telegram.ui.Components.m8 m8Var = v7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = m8Var.J0 + 1;
                    m8Var.J0 = i14;
                    if (i14 == 1) {
                        v7Var.v = true;
                        m8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            m8Var.D0();
                        } else if (m8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(m8Var.N0);
                            m8Var.L0 = 0L;
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
                org.telegram.ui.Components.m8 m8Var2 = (org.telegram.ui.Components.m8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    m8Var2.K0 = System.currentTimeMillis();
                    break;
                } else {
                    float f7 = m8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - m8Var2.K0;
                    m8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - m8Var2.L0;
                    int i15 = m8Var2.J0;
                    float f10 = ((long) ((f7 * r3) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    m8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = m8Var2.I0;
                        }
                        m8Var2.G0(playingMessageObject, false);
                    }
                    if (m8Var2.H0 == 1 && m8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || m8Var2.I0 == 0.0f) {
                            m8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (m8Var2.J0 > 0 && m8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(m8Var2.N0, 16L);
                            break;
                        }
                    }
                }
                break;
            case 5:
                hd hdVar = (hd) obj;
                hdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                hdVar.f.performHapticFeedback(0);
                Runnable runnable = hdVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ok okVar = (ok) obj;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    break;
                }
                break;
            case 7:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (enVar.J != null && !enVar.K) {
                    int computeVerticalScrollOffset = enVar.r.computeVerticalScrollOffset();
                    boolean z10 = enVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (dnVar.e() - dnVar.r) + dnVar.n;
                    float max = Math.max(0.0f, (enVar.E - Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((enVar.r.getMeasuredHeight() - (enVar.E - computeVerticalScrollOffset)) - enVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= enVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i16 = (int) dp3;
                    if (Math.abs(i16) > 0 && enVar.r.canScrollVertically(i16) && (dp3 <= 0.0f || !z10)) {
                        enVar.E += dp3;
                        enVar.r.scrollBy(0, i16);
                        dnVar.invalidate();
                    }
                    dnVar.L = true;
                    dnVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 8:
                io ioVar = (io) obj;
                t6 t6Var = ioVar.U0;
                d6 d6Var = ioVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!ioVar.H && editField != null && ioVar.G && !ioVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var, 100L);
                        break;
                    }
                }
                break;
            case 9:
                vu vuVar = (vu) obj;
                t6 t6Var2 = vuVar.P;
                qu quVar = vuVar.a;
                if (!vuVar.y && quVar != null && vuVar.N && !vuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    quVar.requestFocus();
                    AndroidUtilities.showKeyboard(quVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    break;
                }
                break;
            case 10:
                c2.b bVar = (c2.b) ((bi.m4) obj).d;
                if (bVar.a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 11:
                wz wzVar = (wz) obj;
                if (wzVar.B0.s == null) {
                    wzVar.X1 = false;
                    wzVar.Y();
                    break;
                }
                break;
            case 12:
                w00 w00Var = (w00) obj;
                if (w00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = w00Var.p0 + (elapsedRealtime / 320.0f);
                    w00Var.p0 = f11;
                    w00Var.setAnimationIdicatorProgress(w00Var.i0.getInterpolation(f11));
                    if (w00Var.p0 > 1.0f) {
                        w00Var.p0 = 1.0f;
                    }
                    if (w00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(w00Var.v0);
                        break;
                    } else {
                        w00Var.O = false;
                        w00Var.setEnabled(true);
                        q00 q00Var = w00Var.J;
                        if (q00Var != null) {
                            ((xw) q00Var).b(1.0f);
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
                TextureView textureView = ((i60) obj).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new f60(i11, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 15:
                o70 o70Var = (o70) obj;
                p70 p70Var = o70Var.x;
                c70 c70Var = p70Var.V;
                if (c70Var != null && c70Var.getAdapter() != null) {
                    p70Var.V.getClass();
                    int R = RecyclerView.R(o70Var);
                    if (R >= 0) {
                        p70Var.T.v(p70Var.V.T(o70Var), R);
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
                ((re0) obj).e();
                break;
            case 18:
                jj0 jj0Var = (jj0) obj;
                jj0Var.y = true;
                ValueAnimator valueAnimator2 = jj0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                jj0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                jj0Var.z = ofFloat;
                ofFloat.addUpdateListener(jj0Var.b0);
                jj0Var.z.setInterpolator(new LinearInterpolator());
                jj0Var.z.setDuration(150L);
                jj0Var.z.start();
                break;
            case 19:
                mm0 mm0Var = (mm0) obj;
                fj fjVar = mm0Var.f2;
                int[] iArr = mm0Var.k2;
                fo foVar = fjVar.d;
                iArr[0] = (int) foVar.s9;
                iArr[1] = foVar.Ba;
                if (mm0Var.h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.k2[1]);
                }
                mm0Var.f2.d.x0.scrollBy(0, dp);
                if (mm0Var.g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.B2);
                    break;
                }
                break;
            case 20:
                tl0 tl0Var = (tl0) obj;
                t6 t6Var3 = tl0Var.i0;
                if (tl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    break;
                } else {
                    tl0Var.U = false;
                    tl0Var.invalidate();
                    break;
                }
            case 21:
                om0 om0Var = (om0) obj;
                RecyclerView recyclerView = om0Var.a;
                if (recyclerView != null) {
                    if (om0Var.g) {
                        recyclerView.scrollBy(0, -om0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    } else if (om0Var.h) {
                        recyclerView.scrollBy(0, om0Var.i);
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
                        nn0 nn0Var = scrollSlidingTextTabStrip.b;
                        if (nn0Var != null) {
                            nn0Var.B0(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                cw0 cw0Var = shutterButton.e;
                if (cw0Var != null) {
                    final fm fmVar = (fm) cw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.e;
                    vi viVar = chatAttachAlertPhotoLayout.b;
                    pm pmVar = chatAttachAlertPhotoLayout.R;
                    int i17 = viVar.T0;
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                    if ((i17 == 2 || (m2Var instanceof fo)) && !chatAttachAlertPhotoLayout.s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
                        if (m2Var == null) {
                            m2Var = LaunchActivity.R();
                        }
                        if (m2Var != null && m2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i18 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i19 = 0; i19 < 2; i19++) {
                                        chatAttachAlertPhotoLayout.S[i19].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(es.f).start();
                                    }
                                    ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                    es esVar = es.f;
                                    duration2.setInterpolator(esVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                    org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
                                    fmVar.a = AndroidUtilities.generateVideoPath((m2Var2 instanceof fo) && ((fo) m2Var2).x());
                                    AndroidUtilities.updateViewVisibilityAnimated(pmVar, true);
                                    pmVar.setText(AndroidUtilities.formatLongDuration(0));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.em
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = fmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(fmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), fmVar.a, viVar.T0 != 0, new org.telegram.ui.Components.s(fmVar, i18), new Runnable() { // from class: org.telegram.ui.Components.em
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = fmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i20 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i20;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i20));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(fmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(dw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    break;
                                } else {
                                    chatAttachAlertPhotoLayout.Q0 = true;
                                    m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                                }
                            } else {
                                yh.p(R.string.GlobalAttachVideoRestricted, new zc(chatAttachAlertPhotoLayout.P, fmVar.c), null);
                            }
                        }
                    }
                    shutterButton.v = false;
                    break;
                }
                break;
            case 24:
                wx0 wx0Var = (wx0) obj;
                View view = wx0Var.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        wx0Var.s.setVisibility(0);
                        wx0Var.s.setAlpha(0.0f);
                    }
                    wx0Var.s.animate().setListener(null).cancel();
                    wx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                } else {
                    wx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                }
            case 25:
                j91 j91Var = (j91) obj;
                if (j91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = j91Var.f0 + (elapsedRealtime3 / 200.0f);
                    j91Var.f0 = f13;
                    j91Var.setAnimationIdicatorProgress(j91Var.a0.getInterpolation(f13));
                    if (j91Var.f0 > 1.0f) {
                        j91Var.f0 = 1.0f;
                    }
                    if (j91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(j91Var.i0);
                        break;
                    } else {
                        j91Var.J = false;
                        j91Var.setEnabled(true);
                        i91 i91Var = j91Var.y;
                        if (i91Var != null) {
                            ((l2.f) i91Var).j(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 26:
                e40 e40Var = (e40) obj;
                if (!e40Var.b || e40Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(e40Var.h0, 3000L);
                    break;
                } else {
                    e40Var.g0 = false;
                    e40Var.setUiVisible(false);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
                if (y0Var.d && y0Var.e && y0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        break;
                    } else {
                        y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.l) + " ms ago");
                        y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                        AndroidUtilities.runOnUIThread(this, 15000L);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) obj;
                if (z4Var.a != null && z4Var.d != null) {
                    z4Var.E0();
                    if (z4Var.r) {
                        z4Var.a.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                org.telegram.ui.Wallet.l5 l5Var = c5Var.x;
                if (c5Var.isAttachedToWindow()) {
                    l5Var.b(System.nanoTime());
                    c5Var.G = l5Var.a ? Math.max(-15.0f, Math.min(15.0f, l5Var.b - l5Var.d)) : 0.0f;
                    float max3 = l5Var.a ? Math.max(-15.0f, Math.min(15.0f, l5Var.c - l5Var.e)) : 0.0f;
                    float f14 = c5Var.G;
                    float f15 = c5Var.H;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f14, f15, 1.0f, f15);
                    c5Var.H = y3;
                    float f16 = c5Var.I;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(max3, f16, 1.0f, f16);
                    c5Var.I = y10;
                    float f17 = c5Var.U;
                    c5Var.b((y3 * f17) + c5Var.J + c5Var.T, (y10 * f17) + c5Var.K);
                    c5Var.postOnAnimation(this);
                    break;
                }
                break;
        }
    }
}
