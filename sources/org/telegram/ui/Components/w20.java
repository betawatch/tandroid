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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w20 implements NotificationCenter.NotificationCenterDelegate {
    public static w20 Z = null;
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
    public final c30 Q;
    public final aj0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public AnimatorSet V;
    public ValueAnimator Y;
    public final t20 a;
    public final bg.x2 b;
    public final cg.i0 c;
    public final FrameLayout d;
    public final org.telegram.ui.s7 e;
    public final a30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final h9 s;
    public final xi0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float A = 0.0f;
    public final int[] C = new int[2];
    public final float[] D = new float[2];
    public float G = -1.0f;
    public float H = -1.0f;
    public final r20 O = new r20(this, 0);
    public final r20 P = new r20(this, 1);
    public boolean W = false;
    public float X = 0.0f;

    public w20(final Context context, int i10) {
        this.h = i10;
        t20 t20Var = new t20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = t20Var;
        t20Var.setAlpha(0.7f);
        c30 c30Var = new c30(i10, context, false);
        this.Q = c30Var;
        t20Var.addView(c30Var, i7.f6.e(-1, -1, 17));
        h9 h9Var = new h9(context, true);
        this.s = h9Var;
        h9Var.setStyle(5);
        h9Var.setCentered(true);
        h9Var.setVisibility(8);
        h9Var.setDelegate(new rp(this, 19));
        g(false);
        t20Var.addView(h9Var, i7.f6.e(108, 36, 49));
        bg.x2 x2Var = new bg.x2(this, context, 23);
        this.b = x2Var;
        cg.i0 i0Var = new cg.i0(this, context);
        this.c = i0Var;
        x2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        aj0 aj0Var = new aj0(context);
        this.R = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        xi0 xi0Var = new xi0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        aj0Var.setAnimation(xi0Var);
        aj0Var.setColorFilter(-1);
        frameLayout.addView(aj0Var, i7.f6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.s7 s7Var = new org.telegram.ui.s7(this, context, 2);
        this.e = s7Var;
        s7Var.setOnClickListener(new h0(this, 21));
        s7Var.setClipChildren(false);
        final a30 a30Var = new a30(context);
        a30Var.f = new RectF();
        Paint paint = new Paint(1);
        a30Var.h = paint;
        a30Var.w = true;
        a30Var.setOrientation(1);
        a30Var.x = i10;
        paint.setAlpha(234);
        z20 z20Var = new z20(context);
        z20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        t9 t9Var = new t9(context);
        a30Var.e = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        z20Var.addView(t9Var, i7.f6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k9 = i0.a.k(-1, 76);
        z20Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        z20Var.setOnClickListener(new h0(a30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        a30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.th.i(linearLayout, textView, i7.f6.n(-1, -2), context);
        a30Var.b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(i11, i7.f6.n(-1, -2));
        z20Var.addView(linearLayout, i7.f6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        a30Var.addView(z20Var, i7.f6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.x2 x2Var2 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        a30Var.c = x2Var2;
        x2Var2.setTextSize(12);
        final int i12 = 0;
        x2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        a30.a(a30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        a30 a30Var2 = a30Var;
                        a30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = a30Var2.d.h;
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
                        a30.b(a30Var, context);
                        break;
                }
            }
        });
        x2Var2.setCheckable(true);
        x2Var2.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.x2 x2Var3 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        a30Var.d = x2Var3;
        x2Var3.setTextSize(12);
        final int i13 = 1;
        x2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        a30.a(a30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        a30 a30Var2 = a30Var;
                        a30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = a30Var2.d.h;
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
                        a30.b(a30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.x2 x2Var4 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        x2Var4.setTextSize(12);
        x2Var4.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i14 = 2;
        x2Var4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        a30.a(a30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        a30 a30Var2 = a30Var;
                        a30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = a30Var2.d.h;
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
                        a30.b(a30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(context);
        p1Var.setChildSize(68);
        p1Var.setUseStartPadding(false);
        p1Var.addView(x2Var2, i7.f6.c(63.0f, 68));
        p1Var.addView(x2Var3, i7.f6.c(63.0f, 68));
        p1Var.addView(x2Var4, i7.f6.c(63.0f, 68));
        a30Var.setWillNotDraw(false);
        a30Var.addView(p1Var, i7.f6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = a30Var;
        s7Var.addView(a30Var, i7.f6.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.h1.Z.R || Z != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || a0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.r50.A3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || a0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.r50.A3)) {
            w20 w20Var = Z;
            if (w20Var != null) {
                w20Var.e(false);
                w20 w20Var2 = Z;
                WindowManager windowManager = w20Var2.n;
                t20 t20Var = w20Var2.a;
                t20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new p20(t20Var, w20Var2.b, w20Var2.d, windowManager, w20Var2.e)).start();
                Z.d();
                Z = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (Z == null) {
            Z = new w20(context, account);
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
            w20 w20Var3 = Z;
            w20Var3.r = b12;
            windowManager2.addView(w20Var3.a, b12);
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
        h9 h9Var = Z.s;
        if (h9Var.getTag() != null) {
            return;
        }
        h9Var.animate().setListener(null).cancel();
        if (h9Var.getVisibility() != 0) {
            h9Var.setVisibility(0);
            h9Var.setAlpha(0.0f);
            h9Var.setScaleX(0.5f);
            h9Var.setScaleY(0.5f);
        }
        h9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        h9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.T || this.w;
        if (this.U != z10) {
            this.U = z10;
            t20 t20Var = this.a;
            if (z10) {
                t20Var.animate().alpha(1.0f).start();
            } else {
                t20Var.animate().alpha(0.7f).start();
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
            org.telegram.ui.s7 s7Var = this.e;
            s7Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            a30 a30Var = this.f;
            if (z11) {
                if (s7Var.getVisibility() != 0) {
                    s7Var.setVisibility(0);
                    s7Var.setAlpha(0.0f);
                    a30Var.setScaleX(0.7f);
                    a30Var.setScaleY(0.7f);
                }
                s7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.z9(this, 2));
                s7Var.animate().alpha(1.0f).setDuration(150L).start();
                a30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                a30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                s7Var.animate().alpha(0.0f).setDuration(150L).setListener(new q20(this, 1)).start();
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
            cg.i0 i0Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 0.5f));
                this.V.addListener(new q20(this, i10));
                this.V.setDuration(150L);
                this.V.start();
                return;
            }
            bg.x2 x2Var = this.b;
            if (x2Var.getVisibility() != 0) {
                x2Var.setVisibility(0);
                i0Var.setAlpha(0.0f);
                i0Var.setScaleX(0.5f);
                i0Var.setScaleY(0.5f);
                this.v.K(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.V = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 1.0f));
            this.V.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        h9 h9Var = this.s;
        g9 g9Var = h9Var.a;
        if (g9Var.f != null) {
            g9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                h9Var.b(i10, null, i11);
                i10++;
            }
            h9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    h9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                h9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        h9Var.b(2, null, i11);
        h9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        t20 t20Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - t20Var.getMeasuredWidth()));
        h9 h9Var = this.s;
        if (min < 0.0f) {
            h9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - t20Var.getMeasuredWidth()) {
            h9Var.setTranslationX((-Math.abs(min - (i10 - t20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            h9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f9 = this.J - this.M;
        bg.x2 x2Var = this.b;
        float measuredWidth = (x2Var.getMeasuredWidth() / 2.0f) + f9;
        t20 t20Var = this.a;
        float measuredHeight = (((x2Var.getMeasuredHeight() / 2.0f) + (this.I - this.N)) - (t20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f10 = this.K;
        float f11 = this.X;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) (((measuredWidth - (t20Var.getMeasuredWidth() / 2.0f)) * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.L));
        h();
        if (t20Var.getParent() != null) {
            this.n.updateViewLayout(t20Var, this.r);
        }
    }
}
