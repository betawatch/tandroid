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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c30 implements NotificationCenter.NotificationCenterDelegate {
    public static c30 a0 = null;
    public static boolean b0 = true;
    public boolean C;
    public int F;
    public int G;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public final i30 R;
    public final lj0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator Z;
    public final a30 a;
    public final eg.s2 b;
    public final fg.i0 c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 e;
    public final g30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final d9 s;
    public final ij0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float B = 0.0f;
    public final int[] D = new int[2];
    public final float[] E = new float[2];
    public float H = -1.0f;
    public float I = -1.0f;
    public final y20 P = new y20(this, 0);
    public final y20 Q = new y20(this, 1);
    public boolean X = false;
    public float Y = 0.0f;

    public c30(final Context context, int i10) {
        this.h = i10;
        a30 a30Var = new a30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = a30Var;
        a30Var.setAlpha(0.7f);
        i30 i30Var = new i30(i10, context, false);
        this.R = i30Var;
        a30Var.addView(i30Var, k7.c6.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.s = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new xp(this, 19));
        g(false);
        a30Var.addView(d9Var, k7.c6.e(108, 36, 49));
        eg.s2 s2Var = new eg.s2(this, context, 21);
        this.b = s2Var;
        fg.i0 i0Var = new fg.i0(this, context);
        this.c = i0Var;
        s2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        lj0 lj0Var = new lj0(context);
        this.S = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        ij0 ij0Var = new ij0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = ij0Var;
        ij0Var.h = true;
        lj0Var.setAnimation(ij0Var);
        lj0Var.setColorFilter(-1);
        frameLayout.addView(lj0Var, k7.c6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.e = w7Var;
        w7Var.setOnClickListener(new g0(this, 21));
        w7Var.setClipChildren(false);
        final g30 g30Var = new g30(context);
        g30Var.f = new RectF();
        Paint paint = new Paint(1);
        g30Var.h = paint;
        g30Var.w = true;
        g30Var.setOrientation(1);
        g30Var.x = i10;
        paint.setAlpha(234);
        f30 f30Var = new f30(context);
        f30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        p9 p9Var = new p9(context);
        g30Var.e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        f30Var.addView(p9Var, k7.c6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        f30Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k10, k10));
        f30Var.setOnClickListener(new g0(g30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        g30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.yh.i(linearLayout, textView, k7.c6.n(-1, -2), context);
        g30Var.b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(i11, k7.c6.n(-1, -2));
        f30Var.addView(linearLayout, k7.c6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        g30Var.addView(f30Var, k7.c6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        g30Var.c = w2Var;
        w2Var.setTextSize(12);
        final int i12 = 0;
        w2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g30.a(g30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        g30 g30Var2 = g30Var;
                        g30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = g30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        g30.b(g30Var, context);
                        break;
                }
            }
        });
        w2Var.setCheckable(true);
        w2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        g30Var.d = w2Var2;
        w2Var2.setTextSize(12);
        final int i13 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g30.a(g30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        g30 g30Var2 = g30Var;
                        g30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = g30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        g30.b(g30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        w2Var3.setTextSize(12);
        w2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i14 = 2;
        w2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g30.a(g30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        g30 g30Var2 = g30Var;
                        g30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = g30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        g30.b(g30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(context);
        p1Var.setChildSize(68);
        p1Var.setUseStartPadding(false);
        p1Var.addView(w2Var, k7.c6.c(63.0f, 68));
        p1Var.addView(w2Var2, k7.c6.c(63.0f, 68));
        p1Var.addView(w2Var3, k7.c6.c(63.0f, 68));
        g30Var.setWillNotDraw(false);
        g30Var.addView(p1Var, k7.c6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = g30Var;
        w7Var.addView(g30Var, k7.c6.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.h1.a0.S || a0 != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || b0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.d60.B3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z4 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z4 || b0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.d60.B3)) {
            c30 c30Var = a0;
            if (c30Var != null) {
                c30Var.e(false);
                c30 c30Var2 = a0;
                WindowManager windowManager = c30Var2.n;
                a30 a30Var = c30Var2.a;
                a30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new v20(a30Var, c30Var2.b, c30Var2.d, windowManager, c30Var2.e)).start();
                a0.d();
                a0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (a0 == null) {
            a0 = new c30(context, account);
            WindowManager windowManager2 = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            a0.n = windowManager2;
            WindowManager.LayoutParams b10 = b(context);
            b10.width = -1;
            b10.height = -1;
            b10.dimAmount = 0.25f;
            b10.flags = 522;
            windowManager2.addView(a0.e, b10);
            a0.e.setVisibility(8);
            WindowManager.LayoutParams b11 = b(context);
            b11.gravity = 81;
            b11.width = AndroidUtilities.dp(100.0f);
            b11.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(a0.b, b11);
            WindowManager.LayoutParams b12 = b(context);
            c30 c30Var3 = a0;
            c30Var3.r = b12;
            windowManager2.addView(c30Var3.a, b12);
            WindowManager.LayoutParams b13 = b(context);
            b13.gravity = 81;
            b13.width = AndroidUtilities.dp(100.0f);
            b13.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(a0.d, b13);
            a0.b.setVisibility(8);
            a0.a.setScaleX(0.5f);
            a0.a.setScaleY(0.5f);
            a0.a.setAlpha(0.0f);
            a0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            NotificationCenter.getInstance(a0.h).addObserver(a0, NotificationCenter.groupCallUpdated);
            NotificationCenter.getGlobalInstance().addObserver(a0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(a0, NotificationCenter.didEndCall);
        }
        d9 d9Var = a0.s;
        if (d9Var.getTag() != null) {
            return;
        }
        d9Var.animate().setListener(null).cancel();
        if (d9Var.getVisibility() != 0) {
            d9Var.setVisibility(0);
            d9Var.setAlpha(0.0f);
            d9Var.setScaleX(0.5f);
            d9Var.setScaleY(0.5f);
        }
        d9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        d9Var.setTag(1);
    }

    public final void a() {
        boolean z4 = this.U || this.w;
        if (this.V != z4) {
            this.V = z4;
            a30 a30Var = this.a;
            if (z4) {
                a30Var.animate().alpha(1.0f).start();
            } else {
                a30Var.animate().alpha(0.7f).start();
            }
            this.R.setPressedState(z4);
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

    public final void e(boolean z4) {
        if (z4 != this.w) {
            this.w = z4;
            org.telegram.ui.w7 w7Var = this.e;
            w7Var.animate().setListener(null).cancel();
            boolean z10 = this.w;
            g30 g30Var = this.f;
            if (z10) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    g30Var.setScaleX(0.7f);
                    g30Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 2));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                g30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                g30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new w20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z4) {
        if (this.x != z4) {
            this.x = z4;
            AnimatorSet animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.W.cancel();
            }
            int i10 = 0;
            fg.i0 i0Var = this.c;
            if (!z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 0.5f));
                this.W.addListener(new w20(this, i10));
                this.W.setDuration(150L);
                this.W.start();
                return;
            }
            eg.s2 s2Var = this.b;
            if (s2Var.getVisibility() != 0) {
                s2Var.setVisibility(0);
                i0Var.setAlpha(0.0f);
                i0Var.setScaleX(0.5f);
                i0Var.setScaleY(0.5f);
                this.v.K(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.W = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 1.0f));
            this.W.setDuration(150L).start();
        }
    }

    public final void g(boolean z4) {
        d9 d9Var = this.s;
        c9 c9Var = d9Var.a;
        if (c9Var.f != null) {
            c9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                d9Var.b(i10, null, i11);
                i10++;
            }
            d9Var.a(z4);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    d9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                d9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        d9Var.b(2, null, i11);
        d9Var.a(z4);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        a30 a30Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - a30Var.getMeasuredWidth()));
        d9 d9Var = this.s;
        if (min < 0.0f) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - a30Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i10 - a30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.K - this.N;
        eg.s2 s2Var = this.b;
        float measuredWidth = (s2Var.getMeasuredWidth() / 2.0f) + f10;
        a30 a30Var = this.a;
        float measuredHeight = (((s2Var.getMeasuredHeight() / 2.0f) + (this.J - this.O)) - (a30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f11 = this.L;
        float f12 = this.Y;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (a30Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.M));
        h();
        if (a30Var.getParent() != null) {
            this.n.updateViewLayout(a30Var, this.r);
        }
    }
}
