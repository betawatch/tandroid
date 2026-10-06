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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d30 implements NotificationCenter.NotificationCenterDelegate {
    public static d30 d0 = null;
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
    public final j30 U;
    public final nj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final b30 a;
    public final ai.f0 b;
    public final ci.r6 c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final org.telegram.ui.x7 e;
    public final h30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final k9 s;
    public final kj0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final z20 S = new z20(this, 0);
    public final z20 T = new z20(this, 1);
    public boolean a0 = false;
    public float b0 = 0.0f;

    public d30(final Context context, int i10) {
        this.h = i10;
        b30 b30Var = new b30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = b30Var;
        b30Var.setAlpha(0.7f);
        j30 j30Var = new j30(i10, context, false);
        this.U = j30Var;
        b30Var.addView(j30Var, w7.z5.e(-1, -1, 17));
        k9 k9Var = new k9(context, true);
        this.s = k9Var;
        k9Var.setStyle(5);
        k9Var.setCentered(true);
        k9Var.setVisibility(8);
        k9Var.setDelegate(new aq(this, 19));
        g(false);
        b30Var.addView(k9Var, w7.z5.e(108, 36, 49));
        ai.f0 f0Var = new ai.f0(this, context, 15);
        this.b = f0Var;
        ci.r6 r6Var = new ci.r6(this, context);
        this.c = r6Var;
        f0Var.addView(r6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        nj0 nj0Var = new nj0(context);
        this.V = nj0Var;
        nj0Var.setScaleType(ImageView.ScaleType.CENTER);
        kj0 kj0Var = new kj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = kj0Var;
        kj0Var.h = true;
        nj0Var.setAnimation(kj0Var);
        nj0Var.setColorFilter(-1);
        frameLayout.addView(nj0Var, w7.z5.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, 2);
        this.e = x7Var;
        x7Var.setOnClickListener(new f0(this, 21));
        x7Var.setClipChildren(false);
        final h30 h30Var = new h30(context);
        h30Var.f = new RectF();
        Paint paint = new Paint(1);
        h30Var.h = paint;
        h30Var.w = true;
        h30Var.setOrientation(1);
        h30Var.x = i10;
        paint.setAlpha(234);
        g30 g30Var = new g30(context);
        g30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w9 w9Var = new w9(context);
        h30Var.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        g30Var.addView(w9Var, w7.z5.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        g30Var.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, 0, k10, k10));
        g30Var.setOnClickListener(new f0(h30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        h30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.z5.n(-1, -2), context);
        h30Var.b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(h, w7.z5.n(-1, -2));
        g30Var.addView(linearLayout, w7.z5.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        h30Var.addView(g30Var, w7.z5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        h30Var.c = w2Var;
        w2Var.setTextSize(12);
        final int i11 = 0;
        w2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h30.a(h30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        h30 h30Var2 = h30Var;
                        h30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = h30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h30.b(h30Var, context);
                        break;
                }
            }
        });
        w2Var.setCheckable(true);
        w2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        h30Var.d = w2Var2;
        w2Var2.setTextSize(12);
        final int i12 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h30.a(h30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        h30 h30Var2 = h30Var;
                        h30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = h30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h30.b(h30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        w2Var3.setTextSize(12);
        w2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i13 = 2;
        w2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        h30.a(h30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        h30 h30Var2 = h30Var;
                        h30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = h30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h30.b(h30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(context);
        s1Var.setChildSize(68);
        s1Var.setUseStartPadding(false);
        s1Var.addView(w2Var, w7.z5.c(63.0f, 68));
        s1Var.addView(w2Var2, w7.z5.c(63.0f, 68));
        s1Var.addView(w2Var3, w7.z5.c(63.0f, 68));
        h30Var.setWillNotDraw(false);
        h30Var.addView(s1Var, w7.z5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = h30Var;
        x7Var.addView(h30Var, w7.z5.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.k1.d0.V || d0 != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || e0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.h60.E3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || e0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.h60.E3)) {
            d30 d30Var = d0;
            if (d30Var != null) {
                d30Var.e(false);
                d30 d30Var2 = d0;
                WindowManager windowManager = d30Var2.n;
                b30 b30Var = d30Var2.a;
                b30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new x20(b30Var, d30Var2.b, d30Var2.d, windowManager, d30Var2.e)).start();
                d0.d();
                d0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (d0 == null) {
            d0 = new d30(context, account);
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
            d30 d30Var3 = d0;
            d30Var3.r = b12;
            windowManager2.addView(d30Var3.a, b12);
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
        k9 k9Var = d0.s;
        if (k9Var.getTag() != null) {
            return;
        }
        k9Var.animate().setListener(null).cancel();
        if (k9Var.getVisibility() != 0) {
            k9Var.setVisibility(0);
            k9Var.setAlpha(0.0f);
            k9Var.setScaleX(0.5f);
            k9Var.setScaleY(0.5f);
        }
        k9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        k9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.X || this.w;
        if (this.Y != z10) {
            this.Y = z10;
            b30 b30Var = this.a;
            if (z10) {
                b30Var.animate().alpha(1.0f).start();
            } else {
                b30Var.animate().alpha(0.7f).start();
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
            org.telegram.ui.x7 x7Var = this.e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            h30 h30Var = this.f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    h30Var.setScaleX(0.7f);
                    h30Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 2));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                h30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                h30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new y20(this, 1)).start();
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
            ci.r6 r6Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.ALPHA, r6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.SCALE_X, r6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.SCALE_Y, r6Var.getScaleY(), 0.5f));
                this.Z.addListener(new y20(this, i10));
                this.Z.setDuration(150L);
                this.Z.start();
                return;
            }
            ai.f0 f0Var = this.b;
            if (f0Var.getVisibility() != 0) {
                f0Var.setVisibility(0);
                r6Var.setAlpha(0.0f);
                r6Var.setScaleX(0.5f);
                r6Var.setScaleY(0.5f);
                this.v.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.ALPHA, r6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.SCALE_X, r6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.SCALE_Y, r6Var.getScaleY(), 1.0f));
            this.Z.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        k9 k9Var = this.s;
        j9 j9Var = k9Var.a;
        if (j9Var.f != null) {
            j9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                k9Var.b(i10, null, i11);
                i10++;
            }
            k9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    k9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                k9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        k9Var.b(2, null, i11);
        k9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        b30 b30Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - b30Var.getMeasuredWidth()));
        k9 k9Var = this.s;
        if (min < 0.0f) {
            k9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - b30Var.getMeasuredWidth()) {
            k9Var.setTranslationX((-Math.abs(min - (i10 - b30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            k9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ai.f0 f0Var = this.b;
        float measuredWidth = (f0Var.getMeasuredWidth() / 2.0f) + f7;
        b30 b30Var = this.a;
        float measuredHeight = (((f0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (b30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f10 = this.O;
        float f11 = this.b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) (((measuredWidth - (b30Var.getMeasuredWidth() / 2.0f)) * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (b30Var.getParent() != null) {
            this.n.updateViewLayout(b30Var, this.r);
        }
    }
}
