package m;

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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.wh;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ux;
import org.telegram.ui.wi;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v79, types: [org.telegram.ui.Components.cm] */
    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        int dp;
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) obj).a;
                if (actionMenuView == null || (hVar = actionMenuView.J) == null) {
                    return;
                }
                hVar.l();
                return;
            case 1:
                mg.e eVar = (mg.e) obj;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 2:
                Object obj2 = ((b6.i) obj).b;
                return;
            case 3:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) obj;
                if (zVar.b == null) {
                    zVar.b = new androidx.emoji2.text.j(zVar, 3);
                }
                androidx.emoji2.text.j jVar = zVar.b;
                int i13 = zVar.c + 1;
                zVar.c = i13;
                jVar.b = i13;
                zVar.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 4:
                z5 z5Var = (z5) obj;
                TextView textView = z5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                z5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(z5Var.a, (Property<TextView, Float>) property, 1.0f));
                z5Var.d.setDuration(250L);
                z5Var.d.setInterpolator(new DecelerateInterpolator());
                z5Var.d.addListener(new kg.e(this, 16));
                z5Var.d.start();
                return;
            case 5:
                x6 x6Var = (x6) obj;
                x6Var.a();
                RectF rectF = x6Var.r;
                x6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(x6Var.y, 1000L);
                return;
            case 6:
                r7 r7Var = (r7) obj;
                if (r7Var.b == null) {
                    r7Var.b = new androidx.emoji2.text.j(r7Var, 4);
                }
                androidx.emoji2.text.j jVar2 = r7Var.b;
                int i14 = r7Var.c + 1;
                r7Var.c = i14;
                jVar2.b = i14;
                r7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                z7 z7Var = (z7) obj;
                RectF rectF2 = z7Var.s;
                z7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(z7Var.F, 1000L);
                return;
            case 8:
                v7 v7Var = (v7) obj;
                m8 m8Var = v7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i15 = m8Var.I0 + 1;
                m8Var.I0 = i15;
                if (i15 != 1) {
                    if (i15 != 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    }
                }
                v7Var.v = true;
                m8Var.G0 = 1;
                if (MediaController.getInstance().isMessagePaused()) {
                    m8Var.J0();
                } else if (m8Var.G0 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(m8Var.N0);
                    m8Var.K0 = 0L;
                }
                MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                AndroidUtilities.runOnUIThread(this, 2000L);
                return;
            case 9:
                m8 m8Var2 = (m8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    m8Var2.J0 = System.currentTimeMillis();
                    return;
                }
                float f7 = m8Var2.H0;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - m8Var2.J0;
                m8Var2.J0 = currentTimeMillis;
                long j11 = currentTimeMillis - m8Var2.K0;
                int i16 = m8Var2.I0;
                float f10 = ((long) ((f7 * r3) + (((i16 == 1 ? 3L : i16 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                m8Var2.H0 = f10;
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().getPlayingMessageObject().audioProgress = m8Var2.H0;
                    }
                    m8Var2.M0(playingMessageObject, false);
                }
                if (m8Var2.G0 == 1 && m8Var2.I0 > 0 && MediaController.getInstance().isMessagePaused()) {
                    if (j11 > 200 || m8Var2.H0 == 0.0f) {
                        m8Var2.K0 = currentTimeMillis;
                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                    }
                    if (m8Var2.I0 <= 0 || m8Var2.H0 <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(m8Var2.N0, 16L);
                    return;
                }
                return;
            case 10:
                ed edVar = (ed) obj;
                edVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                edVar.f.performHapticFeedback(0);
                Runnable runnable = edVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    return;
                }
                return;
            case 12:
                bn bnVar = (bn) obj;
                cn cnVar = bnVar.P;
                if (cnVar.J == null || cnVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = cnVar.r.computeVerticalScrollOffset();
                boolean z10 = cnVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (bnVar.e() - bnVar.r) + bnVar.n;
                float max = Math.max(0.0f, (cnVar.E - Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((cnVar.r.getMeasuredHeight() - (cnVar.E - computeVerticalScrollOffset)) - cnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp2 = AndroidUtilities.dp(32.0f);
                float dp3 = (max >= dp2 || computeVerticalScrollOffset <= cnVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                int i17 = (int) dp3;
                if (Math.abs(i17) > 0 && cnVar.r.canScrollVertically(i17) && (dp3 <= 0.0f || !z10)) {
                    cnVar.E += dp3;
                    cnVar.r.scrollBy(0, i17);
                    bnVar.invalidate();
                }
                bnVar.L = true;
                bnVar.postDelayed(this, 15L);
                return;
            case 13:
                go goVar = (go) obj;
                g3 g3Var = goVar.U0;
                h6 h6Var = goVar.g1;
                if (h6Var != null) {
                    EditTextBoldCursor editField = h6Var.getEditField();
                    if (goVar.H || editField == null || !goVar.G || goVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    AndroidUtilities.runOnUIThread(g3Var, 100L);
                    return;
                }
                return;
            case 14:
                ru ruVar = (ru) obj;
                g3 g3Var2 = ruVar.P;
                mu muVar = ruVar.a;
                if (ruVar.y || muVar == null || !ruVar.N || ruVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                muVar.requestFocus();
                AndroidUtilities.showKeyboard(muVar);
                AndroidUtilities.cancelRunOnUIThread(g3Var2);
                AndroidUtilities.runOnUIThread(g3Var2, 100L);
                return;
            case 15:
                c2.b bVar = (c2.b) ((di.o3) obj).d;
                if (!bVar.a || ((ArrayList) bVar.d).isEmpty() || ((AnimatorSet) bVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) bVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                sz szVar = (sz) obj;
                if (szVar.B0.s != null) {
                    return;
                }
                szVar.X1 = false;
                szVar.Z();
                return;
            case 17:
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
                        return;
                    }
                    s00Var.O = false;
                    s00Var.setEnabled(true);
                    n00 n00Var = s00Var.J;
                    if (n00Var != null) {
                        ((ux) n00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.t0, 1000L);
                return;
            case 19:
                TextureView textureView = ((h60) obj).H0.p0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new so(25, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 20:
                n70 n70Var = (n70) obj;
                o70 o70Var = n70Var.y;
                b70 b70Var = o70Var.V;
                if (b70Var != null && b70Var.getAdapter() != null) {
                    o70Var.V.getClass();
                    int R = RecyclerView.R(n70Var);
                    if (R >= 0) {
                        o70Var.T.v(o70Var.V.T(n70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 21:
                oc0 oc0Var = (oc0) obj;
                ValueAnimator valueAnimator = oc0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                oc0Var.h.start();
                return;
            case 22:
                ((me0) obj).e();
                return;
            case 23:
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
                return;
            case 24:
                nm0 nm0Var = (nm0) obj;
                wi wiVar = nm0Var.f2;
                int[] iArr = nm0Var.k2;
                wn wnVar = wiVar.d;
                iArr[0] = (int) wnVar.I9;
                iArr[1] = wnVar.Ra;
                if (nm0Var.h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    nm0Var.M0(0.0f, nm0Var.k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    nm0Var.M0(0.0f, nm0Var.getMeasuredHeight() - nm0Var.k2[1]);
                }
                nm0Var.f2.d.x0.scrollBy(0, dp);
                if (nm0Var.g2) {
                    AndroidUtilities.runOnUIThread(nm0Var.C2);
                    return;
                }
                return;
            case 25:
                tl0 tl0Var = (tl0) obj;
                g3 g3Var3 = tl0Var.i0;
                if (tl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var3);
                    AndroidUtilities.runOnUIThread(g3Var3, 4000L);
                    return;
                } else {
                    tl0Var.U = false;
                    tl0Var.invalidate();
                    return;
                }
            case 26:
                rm0 rm0Var = (rm0) obj;
                RecyclerView recyclerView = rm0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (rm0Var.g) {
                    recyclerView.scrollBy(0, -rm0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (rm0Var.h) {
                        recyclerView.scrollBy(0, rm0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 27:
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
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    tn0 tn0Var = scrollSlidingTextTabStrip.b;
                    if (tn0Var != null) {
                        tn0Var.z0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ShutterButton shutterButton = (ShutterButton) obj;
                gw0 gw0Var = shutterButton.e;
                if (gw0Var != null) {
                    final dm dmVar = (dm) gw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.b;
                    nm nmVar = chatAttachAlertPhotoLayout.R;
                    int i18 = tiVar.T0;
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                    if ((i18 == 2 || (r2Var instanceof wn)) && !chatAttachAlertPhotoLayout.s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (r2Var == null) {
                            r2Var = LaunchActivity.R();
                        }
                        if (r2Var != null && r2Var.getParentActivity() != null) {
                            if (chatAttachAlertPhotoLayout.w0) {
                                int i19 = 21;
                                if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                                    for (int i20 = 0; i20 < 2; i20++) {
                                        chatAttachAlertPhotoLayout.S[i20].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(ds.f).start();
                                    }
                                    ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                    ds dsVar = ds.f;
                                    duration2.setInterpolator(dsVar).start();
                                    chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                    org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                                    dmVar.a = AndroidUtilities.generateVideoPath((r2Var2 instanceof wn) && ((wn) r2Var2).w());
                                    AndroidUtilities.updateViewVisibilityAnimated(nmVar, true);
                                    nmVar.setText(AndroidUtilities.formatLongDuration(0));
                                    chatAttachAlertPhotoLayout.g0 = 0;
                                    chatAttachAlertPhotoLayout.h0 = new Runnable() { // from class: org.telegram.ui.Components.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i21 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i21;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i21));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(dmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    };
                                    AndroidUtilities.lockOrientation(r2Var.getParentActivity());
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), dmVar.a, tiVar.T0 != 0, new org.telegram.ui.Components.s(dmVar, i19), new Runnable() { // from class: org.telegram.ui.Components.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar.e;
                                                    if (chatAttachAlertPhotoLayout2.h0 != null) {
                                                        int i21 = chatAttachAlertPhotoLayout2.g0 + 1;
                                                        chatAttachAlertPhotoLayout2.g0 = i21;
                                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i21));
                                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(dmVar.e.h0, 1000L);
                                                    break;
                                            }
                                        }
                                    }, chatAttachAlertPhotoLayout.P);
                                    chatAttachAlertPhotoLayout.k0.a(hw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    return;
                                }
                                chatAttachAlertPhotoLayout.Q0 = true;
                                r2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                wh.n(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, dmVar.c), null);
                            }
                        }
                    }
                    shutterButton.v = false;
                    return;
                }
                return;
            default:
                System.currentTimeMillis();
                throw null;
        }
    }

    public g3(b6.i iVar, int i10) {
        this.a = 2;
        this.b = iVar;
    }
}
