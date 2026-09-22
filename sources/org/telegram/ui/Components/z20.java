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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z20 implements NotificationCenter.NotificationCenterDelegate {
    public static z20 d0 = null;
    public static boolean e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final f30 U;
    public final aj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final x20 a;
    public final ai.f0 b;
    public final ci.s6 c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final org.telegram.ui.u7 e;
    public final d30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final i9 s;
    public final xi0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final v20 S = new v20(this, 0);
    public final v20 T = new v20(this, 1);
    public boolean a0 = false;
    public float b0 = 0.0f;

    public z20(final Context context, int i10) {
        this.h = i10;
        x20 x20Var = new x20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = x20Var;
        x20Var.setAlpha(0.7f);
        f30 f30Var = new f30(i10, context, false);
        this.U = f30Var;
        x20Var.addView(f30Var, w7.x5.e(-1, -1, 17));
        i9 i9Var = new i9(context, true);
        this.s = i9Var;
        i9Var.setStyle(5);
        i9Var.setCentered(true);
        i9Var.setVisibility(8);
        i9Var.setDelegate(new xp(this, 19));
        g(false);
        x20Var.addView(i9Var, w7.x5.e(108, 36, 49));
        ai.f0 f0Var = new ai.f0(this, context, 15);
        this.b = f0Var;
        ci.s6 s6Var = new ci.s6(this, context);
        this.c = s6Var;
        f0Var.addView(s6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        aj0 aj0Var = new aj0(context);
        this.V = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        xi0 xi0Var = new xi0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        aj0Var.setAnimation(xi0Var);
        aj0Var.setColorFilter(-1);
        frameLayout.addView(aj0Var, w7.x5.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, 2);
        this.e = u7Var;
        u7Var.setOnClickListener(new f0(this, 21));
        u7Var.setClipChildren(false);
        final d30 d30Var = new d30(context);
        d30Var.f = new RectF();
        Paint paint = new Paint(1);
        d30Var.h = paint;
        d30Var.w = true;
        d30Var.setOrientation(1);
        d30Var.x = i10;
        paint.setAlpha(234);
        c30 c30Var = new c30(context);
        c30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        u9 u9Var = new u9(context);
        d30Var.e = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        c30Var.addView(u9Var, w7.x5.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        c30Var.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, 0, k10, k10));
        c30Var.setOnClickListener(new f0(d30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        d30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.n(-1, -2), context);
        d30Var.b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(h, w7.x5.n(-1, -2));
        c30Var.addView(linearLayout, w7.x5.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        d30Var.addView(c30Var, w7.x5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        d30Var.c = v2Var;
        v2Var.setTextSize(12);
        final int i11 = 0;
        v2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d30.a(d30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        d30 d30Var2 = d30Var;
                        d30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = d30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        d30.b(d30Var, context);
                        break;
                }
            }
        });
        v2Var.setCheckable(true);
        v2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        d30Var.d = v2Var2;
        v2Var2.setTextSize(12);
        final int i12 = 1;
        v2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        d30.a(d30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        d30 d30Var2 = d30Var;
                        d30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = d30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        d30.b(d30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        v2Var3.setTextSize(12);
        v2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i13 = 2;
        v2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        d30.a(d30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        d30 d30Var2 = d30Var;
                        d30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = d30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        d30.b(d30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(context);
        r1Var.setChildSize(68);
        r1Var.setUseStartPadding(false);
        r1Var.addView(v2Var, w7.x5.c(63.0f, 68));
        r1Var.addView(v2Var2, w7.x5.c(63.0f, 68));
        r1Var.addView(v2Var3, w7.x5.c(63.0f, 68));
        d30Var.setWillNotDraw(false);
        d30Var.addView(r1Var, w7.x5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = d30Var;
        u7Var.addView(d30Var, w7.x5.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.j1.d0.V || d0 != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || e0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.i60.E3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || e0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.i60.E3)) {
            z20 z20Var = d0;
            if (z20Var != null) {
                z20Var.e(false);
                z20 z20Var2 = d0;
                WindowManager windowManager = z20Var2.n;
                x20 x20Var = z20Var2.a;
                x20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new t20(x20Var, z20Var2.b, z20Var2.d, windowManager, z20Var2.e)).start();
                d0.d();
                d0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (d0 == null) {
            d0 = new z20(context, account);
            WindowManager windowManager2 = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            d0.n = windowManager2;
            WindowManager.LayoutParams b10 = b(context);
            b10.width = -1;
            b10.height = -1;
            b10.dimAmount = 0.25f;
            b10.flags = 522;
            windowManager2.addView(d0.e, b10);
            d0.e.setVisibility(8);
            WindowManager.LayoutParams b11 = b(context);
            b11.gravity = 81;
            b11.width = AndroidUtilities.dp(100.0f);
            b11.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(d0.b, b11);
            WindowManager.LayoutParams b12 = b(context);
            z20 z20Var3 = d0;
            z20Var3.r = b12;
            windowManager2.addView(z20Var3.a, b12);
            WindowManager.LayoutParams b13 = b(context);
            b13.gravity = 81;
            b13.width = AndroidUtilities.dp(100.0f);
            b13.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(d0.d, b13);
            d0.b.setVisibility(8);
            d0.a.setScaleX(0.5f);
            d0.a.setScaleY(0.5f);
            d0.a.setAlpha(0.0f);
            d0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            NotificationCenter.getInstance(d0.h).addObserver(d0, NotificationCenter.groupCallUpdated);
            NotificationCenter.getGlobalInstance().addObserver(d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(d0, NotificationCenter.didEndCall);
        }
        i9 i9Var = d0.s;
        if (i9Var.getTag() != null) {
            return;
        }
        i9Var.animate().setListener(null).cancel();
        if (i9Var.getVisibility() != 0) {
            i9Var.setVisibility(0);
            i9Var.setAlpha(0.0f);
            i9Var.setScaleX(0.5f);
            i9Var.setScaleY(0.5f);
        }
        i9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        i9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.X || this.w;
        if (this.Y != z10) {
            this.Y = z10;
            x20 x20Var = this.a;
            if (z10) {
                x20Var.animate().alpha(1.0f).start();
            } else {
                x20Var.animate().alpha(0.7f).start();
            }
            this.U.setPressedState(z10);
        }
    }

    public final void d() {
        NotificationCenter.getInstance(this.h).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            g(true);
        } else if (i10 == NotificationCenter.didEndCall) {
            j(ApplicationLoader.applicationContext);
        }
    }

    public final void e(boolean z10) {
        if (z10 != this.w) {
            this.w = z10;
            org.telegram.ui.u7 u7Var = this.e;
            u7Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            d30 d30Var = this.f;
            if (z11) {
                if (u7Var.getVisibility() != 0) {
                    u7Var.setVisibility(0);
                    u7Var.setAlpha(0.0f);
                    d30Var.setScaleX(0.7f);
                    d30Var.setScaleY(0.7f);
                }
                u7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 2));
                u7Var.animate().alpha(1.0f).setDuration(150L).start();
                d30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                d30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                u7Var.animate().alpha(0.0f).setDuration(150L).setListener(new u20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.x != z10) {
            this.x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            int i10 = 0;
            ci.s6 s6Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.ALPHA, s6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.SCALE_X, s6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.SCALE_Y, s6Var.getScaleY(), 0.5f));
                this.Z.addListener(new u20(this, i10));
                this.Z.setDuration(150L);
                this.Z.start();
                return;
            }
            ai.f0 f0Var = this.b;
            if (f0Var.getVisibility() != 0) {
                f0Var.setVisibility(0);
                s6Var.setAlpha(0.0f);
                s6Var.setScaleX(0.5f);
                s6Var.setScaleY(0.5f);
                this.v.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.ALPHA, s6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.SCALE_X, s6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s6Var, (Property<ci.s6, Float>) View.SCALE_Y, s6Var.getScaleY(), 1.0f));
            this.Z.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        i9 i9Var = this.s;
        h9 h9Var = i9Var.a;
        if (h9Var.f != null) {
            h9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                i9Var.b(i10, null, i11);
                i10++;
            }
            i9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    i9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                i9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        i9Var.b(2, null, i11);
        i9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        x20 x20Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - x20Var.getMeasuredWidth()));
        i9 i9Var = this.s;
        if (min < 0.0f) {
            i9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - x20Var.getMeasuredWidth()) {
            i9Var.setTranslationX((-Math.abs(min - (i10 - x20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            i9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ai.f0 f0Var = this.b;
        float measuredWidth = (f0Var.getMeasuredWidth() / 2.0f) + f7;
        x20 x20Var = this.a;
        float measuredHeight = (((f0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (x20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f10 = this.O;
        float f11 = this.b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) (((measuredWidth - (x20Var.getMeasuredWidth() / 2.0f)) * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (x20Var.getParent() != null) {
            this.n.updateViewLayout(x20Var, this.r);
        }
    }
}
