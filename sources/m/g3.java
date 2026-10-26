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
import org.telegram.messenger.vh;
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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rx;
import org.telegram.ui.ti;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                szVar.Y();
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
                        ((rx) n00Var).b(1.0f);
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
                TextureView textureView = ((h60) obj).H0.q0;
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
                m70 m70Var = (m70) obj;
                n70 n70Var = m70Var.y;
                a70 a70Var = n70Var.V;
                if (a70Var != null && a70Var.getAdapter() != null) {
                    n70Var.V.getClass();
                    int R = RecyclerView.R(m70Var);
                    if (R >= 0) {
                        n70Var.T.v(n70Var.V.T(m70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 21:
                nc0 nc0Var = (nc0) obj;
                ValueAnimator valueAnimator = nc0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                nc0Var.h.start();
                return;
            case 22:
                ((le0) obj).e();
                return;
            case 23:
                hj0 hj0Var = (hj0) obj;
                hj0Var.y = true;
                ValueAnimator valueAnimator2 = hj0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                hj0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hj0Var.z = ofFloat;
                ofFloat.addUpdateListener(hj0Var.b0);
                hj0Var.z.setInterpolator(new LinearInterpolator());
                hj0Var.z.setDuration(150L);
                hj0Var.z.start();
                return;
            case 24:
                mm0 mm0Var = (mm0) obj;
                ti tiVar = mm0Var.f2;
                int[] iArr = mm0Var.k2;
                un unVar = tiVar.d;
                iArr[0] = (int) unVar.E9;
                iArr[1] = unVar.Na;
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
                    return;
                }
                return;
            case 25:
                sl0 sl0Var = (sl0) obj;
                g3 g3Var3 = sl0Var.i0;
                if (sl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var3);
                    AndroidUtilities.runOnUIThread(g3Var3, 4000L);
                    return;
                } else {
                    sl0Var.U = false;
                    sl0Var.invalidate();
                    return;
                }
            case 26:
                qm0 qm0Var = (qm0) obj;
                RecyclerView recyclerView = qm0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (qm0Var.g) {
                    recyclerView.scrollBy(0, -qm0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (qm0Var.h) {
                        recyclerView.scrollBy(0, qm0Var.i);
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
                    sn0 sn0Var = scrollSlidingTextTabStrip.b;
                    if (sn0Var != null) {
                        sn0Var.z0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ShutterButton shutterButton = (ShutterButton) obj;
                fw0 fw0Var = shutterButton.e;
                if (fw0Var != null) {
                    final dm dmVar = (dm) fw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
                    org.telegram.ui.Components.ti tiVar2 = chatAttachAlertPhotoLayout.b;
                    nm nmVar = chatAttachAlertPhotoLayout.R;
                    int i18 = tiVar2.T0;
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar2.f0;
                    if ((i18 == 2 || (r2Var instanceof un)) && !chatAttachAlertPhotoLayout.s0 && !tiVar2.V && chatAttachAlertPhotoLayout.P != null && !tiVar2.G) {
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
                                    org.telegram.ui.ActionBar.r2 r2Var2 = tiVar2.f0;
                                    dmVar.a = AndroidUtilities.generateVideoPath((r2Var2 instanceof un) && ((un) r2Var2).w());
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
                                    CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), dmVar.a, tiVar2.T0 != 0, new org.telegram.ui.Components.s(dmVar, i19), new Runnable() { // from class: org.telegram.ui.Components.cm
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
                                    chatAttachAlertPhotoLayout.k0.a(gw0.b);
                                    chatAttachAlertPhotoLayout.P.runHaptic();
                                    return;
                                }
                                chatAttachAlertPhotoLayout.Q0 = true;
                                r2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                vh.n(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, dmVar.c), null);
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
