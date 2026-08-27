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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n20 implements NotificationCenter.NotificationCenterDelegate {
    public static n20 Z = null;
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
    public final t20 Q;
    public final ri0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public AnimatorSet V;
    public ValueAnimator Y;
    public final k20 a;
    public final ag.p1 b;
    public final ag.t0 c;
    public final FrameLayout d;
    public final org.telegram.ui.u7 e;
    public final r20 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final b9 s;
    public final oi0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float A = 0.0f;
    public final int[] C = new int[2];
    public final float[] D = new float[2];
    public float G = -1.0f;
    public float H = -1.0f;
    public final i20 O = new i20(this, 0);
    public final i20 P = new i20(this, 1);
    public boolean W = false;
    public float X = 0.0f;

    public n20(final Context context, int i10) {
        this.h = i10;
        k20 k20Var = new k20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = k20Var;
        k20Var.setAlpha(0.7f);
        t20 t20Var = new t20(i10, context, false);
        this.Q = t20Var;
        k20Var.addView(t20Var, h7.z5.e(-1, -1, 17));
        b9 b9Var = new b9(context, true);
        this.s = b9Var;
        b9Var.setStyle(5);
        b9Var.setCentered(true);
        b9Var.setVisibility(8);
        b9Var.setDelegate(new lp(this, 19));
        g(false);
        k20Var.addView(b9Var, h7.z5.e(108, 36, 49));
        ag.p1 p1Var = new ag.p1(this, context, 21);
        this.b = p1Var;
        ag.t0 t0Var = new ag.t0(this, context);
        this.c = t0Var;
        p1Var.addView(t0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ri0 ri0Var = new ri0(context);
        this.R = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        oi0 oi0Var = new oi0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = oi0Var;
        oi0Var.h = true;
        ri0Var.setAnimation(oi0Var);
        ri0Var.setColorFilter(-1);
        frameLayout.addView(ri0Var, h7.z5.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, 2);
        this.e = u7Var;
        u7Var.setOnClickListener(new f0(this, 21));
        u7Var.setClipChildren(false);
        final r20 r20Var = new r20(context);
        r20Var.f = new RectF();
        Paint paint = new Paint(1);
        r20Var.h = paint;
        r20Var.w = true;
        r20Var.setOrientation(1);
        r20Var.x = i10;
        paint.setAlpha(234);
        q20 q20Var = new q20(context);
        q20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        n9 n9Var = new n9(context);
        r20Var.e = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        q20Var.addView(n9Var, h7.z5.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.b.k(-1, 76);
        q20Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k10, k10));
        q20Var.setOnClickListener(new f0(r20Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        r20Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.n(-1, -2), context);
        r20Var.b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.b.k(-1, 153));
        linearLayout.addView(i11, h7.z5.n(-1, -2));
        q20Var.addView(linearLayout, h7.z5.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        r20Var.addView(q20Var, h7.z5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        r20Var.c = u2Var;
        u2Var.setTextSize(12);
        final int i12 = 0;
        u2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        r20.a(r20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        r20 r20Var2 = r20Var;
                        r20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        r20.b(r20Var, context);
                        break;
                }
            }
        });
        u2Var.setCheckable(true);
        u2Var.a(i0.b.k(-1, 38), i0.b.k(-1, 76));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        r20Var.d = u2Var2;
        u2Var2.setTextSize(12);
        final int i13 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        r20.a(r20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        r20 r20Var2 = r20Var;
                        r20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        r20.b(r20Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        u2Var3.setTextSize(12);
        u2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i14 = 2;
        u2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        r20.a(r20Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        r20 r20Var2 = r20Var;
                        r20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r20Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        r20.b(r20Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(context);
        o1Var.setChildSize(68);
        o1Var.setUseStartPadding(false);
        o1Var.addView(u2Var, h7.z5.c(63.0f, 68));
        o1Var.addView(u2Var2, h7.z5.c(63.0f, 68));
        o1Var.addView(u2Var3, h7.z5.c(63.0f, 68));
        r20Var.setWillNotDraw(false);
        r20Var.addView(o1Var, h7.z5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = r20Var;
        u7Var.addView(r20Var, h7.z5.c(-2.0f, -2));
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
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.s50.A3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || a0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.s50.A3)) {
            n20 n20Var = Z;
            if (n20Var != null) {
                n20Var.e(false);
                n20 n20Var2 = Z;
                WindowManager windowManager = n20Var2.n;
                k20 k20Var = n20Var2.a;
                k20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new g20(k20Var, n20Var2.b, n20Var2.d, windowManager, n20Var2.e)).start();
                Z.d();
                Z = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (Z == null) {
            Z = new n20(context, account);
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
            n20 n20Var3 = Z;
            n20Var3.r = b12;
            windowManager2.addView(n20Var3.a, b12);
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
        b9 b9Var = Z.s;
        if (b9Var.getTag() != null) {
            return;
        }
        b9Var.animate().setListener(null).cancel();
        if (b9Var.getVisibility() != 0) {
            b9Var.setVisibility(0);
            b9Var.setAlpha(0.0f);
            b9Var.setScaleX(0.5f);
            b9Var.setScaleY(0.5f);
        }
        b9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        b9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.T || this.w;
        if (this.U != z10) {
            this.U = z10;
            k20 k20Var = this.a;
            if (z10) {
                k20Var.animate().alpha(1.0f).start();
            } else {
                k20Var.animate().alpha(0.7f).start();
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
            r20 r20Var = this.f;
            if (z11) {
                if (u7Var.getVisibility() != 0) {
                    u7Var.setVisibility(0);
                    u7Var.setAlpha(0.0f);
                    r20Var.setScaleX(0.7f);
                    r20Var.setScaleY(0.7f);
                }
                u7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.y9(this, 2));
                u7Var.animate().alpha(1.0f).setDuration(150L).start();
                r20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                r20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                u7Var.animate().alpha(0.0f).setDuration(150L).setListener(new h20(this, 1)).start();
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
            int i10 = 0;
            ag.t0 t0Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.ALPHA, t0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.SCALE_X, t0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.SCALE_Y, t0Var.getScaleY(), 0.5f));
                this.V.addListener(new h20(this, i10));
                this.V.setDuration(150L);
                this.V.start();
                return;
            }
            ag.p1 p1Var = this.b;
            if (p1Var.getVisibility() != 0) {
                p1Var.setVisibility(0);
                t0Var.setAlpha(0.0f);
                t0Var.setScaleX(0.5f);
                t0Var.setScaleY(0.5f);
                this.v.K(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.V = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.ALPHA, t0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.SCALE_X, t0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.SCALE_Y, t0Var.getScaleY(), 1.0f));
            this.V.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        b9 b9Var = this.s;
        a9 a9Var = b9Var.a;
        if (a9Var.f != null) {
            a9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                b9Var.b(i10, null, i11);
                i10++;
            }
            b9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    b9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                b9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        b9Var.b(2, null, i11);
        b9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        k20 k20Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - k20Var.getMeasuredWidth()));
        b9 b9Var = this.s;
        if (min < 0.0f) {
            b9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - k20Var.getMeasuredWidth()) {
            b9Var.setTranslationX((-Math.abs(min - (i10 - k20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            b9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.J - this.M;
        ag.p1 p1Var = this.b;
        float measuredWidth = (p1Var.getMeasuredWidth() / 2.0f) + f10;
        k20 k20Var = this.a;
        float measuredHeight = (((p1Var.getMeasuredHeight() / 2.0f) + (this.I - this.N)) - (k20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f11 = this.K;
        float f12 = this.X;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (k20Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.L));
        h();
        if (k20Var.getParent() != null) {
            this.n.updateViewLayout(k20Var, this.r);
        }
    }
}
