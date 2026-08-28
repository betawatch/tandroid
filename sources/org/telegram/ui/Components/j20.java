package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j20 implements NotificationCenter.NotificationCenterDelegate {
    public static j20 Z = null;
    public static boolean a0 = true;
    public boolean B;
    public int E;
    public int F;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public final p20 Q;
    public final pi0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public AnimatorSet V;
    public ValueAnimator Y;
    public final h20 a;
    public final fh.d2 b;
    public final kh.h6 c;
    public final FrameLayout d;
    public final org.telegram.ui.t7 e;
    public final n20 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final c9 s;
    public final mi0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float A = 0.0f;
    public final int[] C = new int[2];
    public final float[] D = new float[2];
    public float G = -1.0f;
    public float H = -1.0f;
    public final f20 O = new f20(this, 0);
    public final f20 P = new f20(this, 1);
    public boolean W = false;
    public float X = 0.0f;

    public j20(final Context context, int i9) {
        this.h = i9;
        h20 h20Var = new h20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = h20Var;
        h20Var.setAlpha(0.7f);
        p20 p20Var = new p20(i9, context, false);
        this.Q = p20Var;
        h20Var.addView(p20Var, g7.e6.e(-1, -1, 17));
        c9 c9Var = new c9(context, true);
        this.s = c9Var;
        c9Var.setStyle(5);
        c9Var.setCentered(true);
        c9Var.setVisibility(8);
        c9Var.setDelegate(new np(this, 19));
        g(false);
        h20Var.addView(c9Var, g7.e6.e(108, 36, 49));
        fh.d2 d2Var = new fh.d2(this, context, 18);
        this.b = d2Var;
        kh.h6 h6Var = new kh.h6(this, context);
        this.c = h6Var;
        d2Var.addView(h6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        pi0 pi0Var = new pi0(context);
        this.R = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        mi0 mi0Var = new mi0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = mi0Var;
        mi0Var.h = true;
        pi0Var.setAnimation(mi0Var);
        pi0Var.setColorFilter(-1);
        frameLayout.addView(pi0Var, g7.e6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.t7 t7Var = new org.telegram.ui.t7(this, context, 2);
        this.e = t7Var;
        t7Var.setOnClickListener(new f0(this, 21));
        t7Var.setClipChildren(false);
        final n20 n20Var = new n20(context);
        n20Var.f = new RectF();
        Paint paint = new Paint(1);
        n20Var.h = paint;
        n20Var.w = true;
        n20Var.setOrientation(1);
        n20Var.x = i9;
        paint.setAlpha(234);
        m20 m20Var = new m20(context);
        m20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        o9 o9Var = new o9(context);
        n20Var.e = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        m20Var.addView(o9Var, g7.e6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        m20Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        m20Var.setOnClickListener(new f0(n20Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        n20Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.n(-1, -2), context);
        n20Var.b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(h, g7.e6.n(-1, -2));
        m20Var.addView(linearLayout, g7.e6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        n20Var.addView(m20Var, g7.e6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        n20Var.c = u2Var;
        u2Var.setTextSize(12);
        final int i10 = 0;
        u2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        n20.a(n20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n20 n20Var2 = n20Var;
                        n20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        n20.b(n20Var, context);
                        break;
                }
            }
        });
        u2Var.setCheckable(true);
        u2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        n20Var.d = u2Var2;
        u2Var2.setTextSize(12);
        final int i11 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n20.a(n20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n20 n20Var2 = n20Var;
                        n20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        n20.b(n20Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        u2Var3.setTextSize(12);
        u2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i12 = 2;
        u2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        n20.a(n20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n20 n20Var2 = n20Var;
                        n20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        n20.b(n20Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(context);
        o1Var.setChildSize(68);
        o1Var.setUseStartPadding(false);
        o1Var.addView(u2Var, g7.e6.c(63.0f, 68));
        o1Var.addView(u2Var2, g7.e6.c(63.0f, 68));
        o1Var.addView(u2Var3, g7.e6.c(63.0f, 68));
        n20Var.setWillNotDraw(false);
        n20Var.addView(o1Var, g7.e6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = n20Var;
        t7Var.addView(n20Var, g7.e6.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = AndroidUtilities.dp(105.0f);
        layoutParams.width = AndroidUtilities.dp(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!AndroidUtilities.checkInlinePermissions(context)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static boolean c() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.g1.Z.R || Z != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || a0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.o50.A3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || a0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.o50.A3)) {
            j20 j20Var = Z;
            if (j20Var != null) {
                j20Var.e(false);
                j20 j20Var2 = Z;
                WindowManager windowManager = j20Var2.n;
                h20 h20Var = j20Var2.a;
                h20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d20(h20Var, j20Var2.b, j20Var2.d, windowManager, j20Var2.e)).start();
                Z.d();
                Z = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (Z == null) {
            Z = new j20(context, account);
            WindowManager windowManager2 = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            Z.n = windowManager2;
            WindowManager.LayoutParams b10 = b(context);
            b10.width = -1;
            b10.height = -1;
            b10.dimAmount = 0.25f;
            b10.flags = 522;
            windowManager2.addView(Z.e, b10);
            Z.e.setVisibility(8);
            WindowManager.LayoutParams b11 = b(context);
            b11.gravity = 81;
            b11.width = AndroidUtilities.dp(100.0f);
            b11.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(Z.b, b11);
            WindowManager.LayoutParams b12 = b(context);
            j20 j20Var3 = Z;
            j20Var3.r = b12;
            windowManager2.addView(j20Var3.a, b12);
            WindowManager.LayoutParams b13 = b(context);
            b13.gravity = 81;
            b13.width = AndroidUtilities.dp(100.0f);
            b13.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(Z.d, b13);
            Z.b.setVisibility(8);
            Z.a.setScaleX(0.5f);
            Z.a.setScaleY(0.5f);
            Z.a.setAlpha(0.0f);
            Z.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            NotificationCenter.getInstance(Z.h).addObserver(Z, NotificationCenter.groupCallUpdated);
            NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.didEndCall);
        }
        c9 c9Var = Z.s;
        if (c9Var.getTag() != null) {
            return;
        }
        c9Var.animate().setListener(null).cancel();
        if (c9Var.getVisibility() != 0) {
            c9Var.setVisibility(0);
            c9Var.setAlpha(0.0f);
            c9Var.setScaleX(0.5f);
            c9Var.setScaleY(0.5f);
        }
        c9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        c9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.T || this.w;
        if (this.U != z10) {
            this.U = z10;
            h20 h20Var = this.a;
            if (z10) {
                h20Var.animate().alpha(1.0f).start();
            } else {
                h20Var.animate().alpha(0.7f).start();
            }
            this.Q.setPressedState(z10);
        }
    }

    public final void d() {
        NotificationCenter.getInstance(this.h).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.groupCallUpdated || i9 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            g(true);
        } else if (i9 == NotificationCenter.didEndCall) {
            j(ApplicationLoader.applicationContext);
        }
    }

    public final void e(boolean z10) {
        if (z10 != this.w) {
            this.w = z10;
            org.telegram.ui.t7 t7Var = this.e;
            t7Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            n20 n20Var = this.f;
            if (z11) {
                if (t7Var.getVisibility() != 0) {
                    t7Var.setVisibility(0);
                    t7Var.setAlpha(0.0f);
                    n20Var.setScaleX(0.7f);
                    n20Var.setScaleY(0.7f);
                }
                t7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 2));
                t7Var.animate().alpha(1.0f).setDuration(150L).start();
                n20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                n20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                t7Var.animate().alpha(0.0f).setDuration(150L).setListener(new e20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.x != z10) {
            this.x = z10;
            AnimatorSet animatorSet = this.V;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.V.cancel();
            }
            int i9 = 0;
            kh.h6 h6Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.ALPHA, h6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.SCALE_X, h6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.SCALE_Y, h6Var.getScaleY(), 0.5f));
                this.V.addListener(new e20(this, i9));
                this.V.setDuration(150L);
                this.V.start();
                return;
            }
            fh.d2 d2Var = this.b;
            if (d2Var.getVisibility() != 0) {
                d2Var.setVisibility(0);
                h6Var.setAlpha(0.0f);
                h6Var.setScaleX(0.5f);
                h6Var.setScaleY(0.5f);
                this.v.K(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.V = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.ALPHA, h6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.SCALE_X, h6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.SCALE_Y, h6Var.getScaleY(), 1.0f));
            this.V.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        c9 c9Var = this.s;
        b9 b9Var = c9Var.a;
        if (b9Var.f != null) {
            b9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i9 = 0;
        int i10 = this.h;
        if (call == null) {
            while (i9 < 3) {
                c9Var.b(i9, null, i10);
                i9++;
            }
            c9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i11 = 0;
        while (i9 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i11);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    c9Var.b(i9, groupCallParticipant, i10);
                }
                i11++;
            } else {
                c9Var.b(i9, null, i10);
            }
            i9++;
            i11++;
        }
        c9Var.b(2, null, i10);
        c9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i9 = AndroidUtilities.displaySize.x;
        h20 h20Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i9 - h20Var.getMeasuredWidth()));
        c9 c9Var = this.s;
        if (min < 0.0f) {
            c9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i9 - h20Var.getMeasuredWidth()) {
            c9Var.setTranslationX((-Math.abs(min - (i9 - h20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            c9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.J - this.M;
        fh.d2 d2Var = this.b;
        float measuredWidth = (d2Var.getMeasuredWidth() / 2.0f) + f10;
        h20 h20Var = this.a;
        float measuredHeight = (((d2Var.getMeasuredHeight() / 2.0f) + (this.I - this.N)) - (h20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f11 = this.K;
        float f12 = this.X;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (h20Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.L));
        h();
        if (h20Var.getParent() != null) {
            this.n.updateViewLayout(h20Var, this.r);
        }
    }
}
