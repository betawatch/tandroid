package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dw;
import org.telegram.ui.k30;
import org.telegram.ui.si;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v75, types: [org.telegram.ui.Components.bm] */
    @Override // java.lang.Runnable
    public final void run() {
        int dp;
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new m.a(this, 14));
                v5Var.d.start();
                break;
            case 1:
                t6 t6Var = (t6) obj;
                t6Var.a();
                RectF rectF = t6Var.r;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.y, 1000L);
                break;
            case 2:
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
            case 3:
                v7 v7Var = (v7) obj;
                RectF rectF2 = v7Var.s;
                v7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.F, 1000L);
                break;
            case 4:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) obj;
                org.telegram.ui.Components.k8 k8Var = t7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = k8Var.I0 + 1;
                    k8Var.I0 = i14;
                    if (i14 == 1) {
                        t7Var.v = true;
                        k8Var.G0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            k8Var.J0();
                        } else if (k8Var.G0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(k8Var.N0);
                            k8Var.K0 = 0L;
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
            case 5:
                org.telegram.ui.Components.k8 k8Var2 = (org.telegram.ui.Components.k8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    k8Var2.J0 = System.currentTimeMillis();
                    break;
                } else {
                    float f7 = k8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k8Var2.J0;
                    k8Var2.J0 = currentTimeMillis;
                    long j11 = currentTimeMillis - k8Var2.K0;
                    int i15 = k8Var2.I0;
                    float f10 = ((long) ((f7 * r3) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    k8Var2.H0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = k8Var2.H0;
                        }
                        k8Var2.M0(playingMessageObject, false);
                    }
                    if (k8Var2.G0 == 1 && k8Var2.I0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || k8Var2.H0 == 0.0f) {
                            k8Var2.K0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (k8Var2.I0 > 0 && k8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k8Var2.N0, 16L);
                            break;
                        }
                    }
                }
                break;
            case 6:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f.performHapticFeedback(0);
                Runnable runnable = fdVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    break;
                }
                break;
            case 8:
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
            case 9:
                fo foVar = (fo) obj;
                u5 u5Var = foVar.U0;
                d6 d6Var = foVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!foVar.H && editField != null && foVar.G && !foVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        AndroidUtilities.runOnUIThread(u5Var, 100L);
                        break;
                    }
                }
                break;
            case 10:
                qu quVar = (qu) obj;
                u5 u5Var2 = quVar.P;
                lu luVar = quVar.a;
                if (!quVar.y && luVar != null && quVar.N && !quVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    luVar.requestFocus();
                    AndroidUtilities.showKeyboard(luVar);
                    AndroidUtilities.cancelRunOnUIThread(u5Var2);
                    AndroidUtilities.runOnUIThread(u5Var2, 100L);
                    break;
                }
                break;
            case 11:
                c2.b bVar = (c2.b) ((ci.o3) obj).d;
                if (bVar.a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 12:
                tz tzVar = (tz) obj;
                if (tzVar.B0.s == null) {
                    tzVar.X1 = false;
                    tzVar.Y();
                    break;
                }
                break;
            case 13:
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
                            ((dw) n00Var).b(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.t0, 1000L);
                break;
            case 15:
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
            case 16:
                l70 l70Var = (l70) obj;
                m70 m70Var = l70Var.y;
                z60 z60Var = m70Var.V;
                if (z60Var != null && z60Var.getAdapter() != null) {
                    m70Var.V.getClass();
                    int R = RecyclerView.R(l70Var);
                    if (R >= 0) {
                        m70Var.T.v(m70Var.V.T(l70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 17:
                rc0 rc0Var = (rc0) obj;
                ValueAnimator valueAnimator = rc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    rc0Var.h.start();
                    break;
                }
                break;
            case 18:
                ((pe0) obj).e();
                break;
            case 19:
                ij0 ij0Var = (ij0) obj;
                ij0Var.y = true;
                ValueAnimator valueAnimator2 = ij0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ij0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ij0Var.z = ofFloat;
                ofFloat.addUpdateListener(ij0Var.b0);
                ij0Var.z.setInterpolator(new LinearInterpolator());
                ij0Var.z.setDuration(150L);
                ij0Var.z.start();
                break;
            case 20:
                mm0 mm0Var = (mm0) obj;
                si siVar = mm0Var.f2;
                int[] iArr = mm0Var.k2;
                sn snVar = siVar.d;
                iArr[0] = (int) snVar.E9;
                iArr[1] = snVar.Na;
                if (mm0Var.h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.k2[1]);
                }
                mm0Var.f2.d.x0.scrollBy(0, dp);
                if (mm0Var.g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.C2);
                    break;
                }
                break;
            case 21:
                tl0 tl0Var = (tl0) obj;
                u5 u5Var3 = tl0Var.i0;
                if (tl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(u5Var3);
                    AndroidUtilities.runOnUIThread(u5Var3, 4000L);
                    break;
                } else {
                    tl0Var.U = false;
                    tl0Var.invalidate();
                    break;
                }
            case 22:
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
            case 23:
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
                            nn0Var.k0(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 24:
                ShutterButton shutterButton = (ShutterButton) obj;
                cw0 cw0Var = shutterButton.e;
                if (cw0Var != null) {
                    final cm cmVar = (cm) cw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.b;
                    mm mmVar = chatAttachAlertPhotoLayout.R;
                    int i17 = tiVar.T0;
                    org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
                    if ((i17 == 2 || (o2Var instanceof sn)) && !chatAttachAlertPhotoLayout.s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (o2Var == null) {
                            o2Var = LaunchActivity.R();
                        }
                        if (o2Var != null && o2Var.getParentActivity() != null) {
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
                                    org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f0;
                                    cmVar.a = AndroidUtilities.generateVideoPath((o2Var2 instanceof sn) && ((sn) o2Var2).x());
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
                                    AndroidUtilities.lockOrientation(o2Var.getParentActivity());
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
                                    chatAttachAlertPhotoLayout.k0.a(dw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    break;
                                } else {
                                    chatAttachAlertPhotoLayout.Q0 = true;
                                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                                }
                            } else {
                                sl.q(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, cmVar.c), null);
                            }
                        }
                    }
                    shutterButton.v = false;
                    break;
                }
                break;
            case 25:
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
            case 26:
                ((ThemeEditorView) obj).a = false;
                try {
                    org.telegram.ui.ActionBar.k6.k();
                    org.telegram.ui.ActionBar.k6.n();
                    org.telegram.ui.ActionBar.k6.p();
                    org.telegram.ui.ActionBar.k6.j(false, false);
                    org.telegram.ui.ActionBar.r6.e0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.J1;
                    if (launchActivity != null) {
                        launchActivity.d0();
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 27:
                k91 k91Var = (k91) obj;
                if (k91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = k91Var.f0 + (elapsedRealtime3 / 200.0f);
                    k91Var.f0 = f13;
                    k91Var.setAnimationIdicatorProgress(k91Var.a0.getInterpolation(f13));
                    if (k91Var.f0 > 1.0f) {
                        k91Var.f0 = 1.0f;
                    }
                    if (k91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k91Var.i0);
                        break;
                    } else {
                        k91Var.J = false;
                        k91Var.setEnabled(true);
                        j91 j91Var = k91Var.y;
                        if (j91Var != null) {
                            ((l2.f) j91Var).I(1.0f);
                            break;
                        }
                    }
                }
                break;
            case 28:
                k30 k30Var = (k30) obj;
                if (!k30Var.b || k30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(k30Var.h0, 3000L);
                    break;
                } else {
                    k30Var.g0 = false;
                    k30Var.setUiVisible(false);
                    break;
                }
            default:
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
        }
    }
}
