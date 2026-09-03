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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b30 implements NotificationCenter.NotificationCenterDelegate {
    public static b30 a0 = null;
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
    public final h30 R;
    public final jj0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator Z;
    public final z20 a;
    public final dg.u2 b;
    public final eg.i0 c;
    public final FrameLayout d;
    public final org.telegram.ui.y7 e;
    public final f30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final d9 s;
    public final gj0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float B = 0.0f;
    public final int[] D = new int[2];
    public final float[] E = new float[2];
    public float H = -1.0f;
    public float I = -1.0f;
    public final x20 P = new x20(this, 0);
    public final x20 Q = new x20(this, 1);
    public boolean X = false;
    public float Y = 0.0f;

    public b30(final Context context, int i10) {
        this.h = i10;
        z20 z20Var = new z20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = z20Var;
        z20Var.setAlpha(0.7f);
        h30 h30Var = new h30(i10, context, false);
        this.R = h30Var;
        z20Var.addView(h30Var, k7.b6.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.s = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new up(this, 19));
        g(false);
        z20Var.addView(d9Var, k7.b6.e(108, 36, 49));
        dg.u2 u2Var = new dg.u2(this, context, 21);
        this.b = u2Var;
        eg.i0 i0Var = new eg.i0(this, context);
        this.c = i0Var;
        u2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        jj0 jj0Var = new jj0(context);
        this.S = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        gj0 gj0Var = new gj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = gj0Var;
        gj0Var.h = true;
        jj0Var.setAnimation(gj0Var);
        jj0Var.setColorFilter(-1);
        frameLayout.addView(jj0Var, k7.b6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, context, 2);
        this.e = y7Var;
        y7Var.setOnClickListener(new g0(this, 21));
        y7Var.setClipChildren(false);
        final f30 f30Var = new f30(context);
        f30Var.f = new RectF();
        Paint paint = new Paint(1);
        f30Var.h = paint;
        f30Var.w = true;
        f30Var.setOrientation(1);
        f30Var.x = i10;
        paint.setAlpha(234);
        e30 e30Var = new e30(context);
        e30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        p9 p9Var = new p9(context);
        f30Var.e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        e30Var.addView(p9Var, k7.b6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        e30Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        e30Var.setOnClickListener(new g0(f30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        f30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.ai.i(linearLayout, textView, k7.b6.n(-1, -2), context);
        f30Var.b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(i11, k7.b6.n(-1, -2));
        e30Var.addView(linearLayout, k7.b6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        f30Var.addView(e30Var, k7.b6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        f30Var.c = v2Var;
        v2Var.setTextSize(12);
        final int i12 = 0;
        v2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f30.a(f30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        f30 f30Var2 = f30Var;
                        f30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = f30Var2.d.h;
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
                        f30.b(f30Var, context);
                        break;
                }
            }
        });
        v2Var.setCheckable(true);
        v2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        f30Var.d = v2Var2;
        v2Var2.setTextSize(12);
        final int i13 = 1;
        v2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        f30.a(f30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        f30 f30Var2 = f30Var;
                        f30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = f30Var2.d.h;
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
                        f30.b(f30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        v2Var3.setTextSize(12);
        v2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i14 = 2;
        v2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        f30.a(f30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        f30 f30Var2 = f30Var;
                        f30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = f30Var2.d.h;
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
                        f30.b(f30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(context);
        o1Var.setChildSize(68);
        o1Var.setUseStartPadding(false);
        o1Var.addView(v2Var, k7.b6.c(63.0f, 68));
        o1Var.addView(v2Var2, k7.b6.c(63.0f, 68));
        o1Var.addView(v2Var3, k7.b6.c(63.0f, 68));
        f30Var.setWillNotDraw(false);
        f30Var.addView(o1Var, k7.b6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = f30Var;
        y7Var.addView(f30Var, k7.b6.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.g1.a0.S || a0 != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || b0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.e60.B3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z4 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z4 || b0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.e60.B3)) {
            b30 b30Var = a0;
            if (b30Var != null) {
                b30Var.e(false);
                b30 b30Var2 = a0;
                WindowManager windowManager = b30Var2.n;
                z20 z20Var = b30Var2.a;
                z20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new v20(z20Var, b30Var2.b, b30Var2.d, windowManager, b30Var2.e)).start();
                a0.d();
                a0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (a0 == null) {
            a0 = new b30(context, account);
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
            b30 b30Var3 = a0;
            b30Var3.r = b12;
            windowManager2.addView(b30Var3.a, b12);
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
            z20 z20Var = this.a;
            if (z4) {
                z20Var.animate().alpha(1.0f).start();
            } else {
                z20Var.animate().alpha(0.7f).start();
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
            org.telegram.ui.y7 y7Var = this.e;
            y7Var.animate().setListener(null).cancel();
            boolean z10 = this.w;
            f30 f30Var = this.f;
            if (z10) {
                if (y7Var.getVisibility() != 0) {
                    y7Var.setVisibility(0);
                    y7Var.setAlpha(0.0f);
                    f30Var.setScaleX(0.7f);
                    f30Var.setScaleY(0.7f);
                }
                y7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.aa(this, 2));
                y7Var.animate().alpha(1.0f).setDuration(150L).start();
                f30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                f30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                y7Var.animate().alpha(0.0f).setDuration(150L).setListener(new w20(this, 1)).start();
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
            eg.i0 i0Var = this.c;
            if (!z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 0.5f));
                this.W.addListener(new w20(this, i10));
                this.W.setDuration(150L);
                this.W.start();
                return;
            }
            dg.u2 u2Var = this.b;
            if (u2Var.getVisibility() != 0) {
                u2Var.setVisibility(0);
                i0Var.setAlpha(0.0f);
                i0Var.setScaleX(0.5f);
                i0Var.setScaleY(0.5f);
                this.v.K(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.W = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.ALPHA, i0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.SCALE_X, i0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.SCALE_Y, i0Var.getScaleY(), 1.0f));
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
        z20 z20Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - z20Var.getMeasuredWidth()));
        d9 d9Var = this.s;
        if (min < 0.0f) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - z20Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i10 - z20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.K - this.N;
        dg.u2 u2Var = this.b;
        float measuredWidth = (u2Var.getMeasuredWidth() / 2.0f) + f10;
        z20 z20Var = this.a;
        float measuredHeight = (((u2Var.getMeasuredHeight() / 2.0f) + (this.J - this.O)) - (z20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f11 = this.L;
        float f12 = this.Y;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (z20Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.M));
        h();
        if (z20Var.getParent() != null) {
            this.n.updateViewLayout(z20Var, this.r);
        }
    }
}
