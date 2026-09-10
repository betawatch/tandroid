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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j30 implements NotificationCenter.NotificationCenterDelegate {
    public static j30 d0 = null;
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
    public final p30 U;
    public final kj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final h30 a;
    public final bi.ld b;
    public final bi.s7 c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final org.telegram.ui.t7 e;
    public final n30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final j9 s;
    public final hj0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final f30 S = new f30(this, 0);
    public final f30 T = new f30(this, 1);
    public boolean a0 = false;
    public float b0 = 0.0f;

    public j30(final Context context, int i10) {
        this.h = i10;
        h30 h30Var = new h30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = h30Var;
        h30Var.setAlpha(0.7f);
        p30 p30Var = new p30(i10, context, false);
        this.U = p30Var;
        h30Var.addView(p30Var, w7.a6.e(-1, -1, 17));
        j9 j9Var = new j9(context, true);
        this.s = j9Var;
        j9Var.setStyle(5);
        j9Var.setCentered(true);
        j9Var.setVisibility(8);
        j9Var.setDelegate(new dq(this, 19));
        g(false);
        h30Var.addView(j9Var, w7.a6.e(108, 36, 49));
        bi.ld ldVar = new bi.ld(this, context, 13);
        this.b = ldVar;
        bi.s7 s7Var = new bi.s7(this, context);
        this.c = s7Var;
        ldVar.addView(s7Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        kj0 kj0Var = new kj0(context);
        this.V = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        hj0 hj0Var = new hj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = hj0Var;
        hj0Var.h = true;
        kj0Var.setAnimation(hj0Var);
        kj0Var.setColorFilter(-1);
        frameLayout.addView(kj0Var, w7.a6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.t7 t7Var = new org.telegram.ui.t7(this, context, 2);
        this.e = t7Var;
        t7Var.setOnClickListener(new h0(this, 21));
        t7Var.setClipChildren(false);
        final n30 n30Var = new n30(context);
        n30Var.f = new RectF();
        Paint paint = new Paint(1);
        n30Var.h = paint;
        n30Var.w = true;
        n30Var.setOrientation(1);
        n30Var.x = i10;
        paint.setAlpha(234);
        m30 m30Var = new m30(context);
        m30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w9 w9Var = new w9(context);
        n30Var.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        m30Var.addView(w9Var, w7.a6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        m30Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        m30Var.setOnClickListener(new h0(n30Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        n30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.n(-1, -2), context);
        n30Var.b = g10;
        g10.setTextSize(12.0f);
        g10.setTextColor(i0.a.k(-1, 153));
        linearLayout.addView(g10, w7.a6.n(-1, -2));
        m30Var.addView(linearLayout, w7.a6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        n30Var.addView(m30Var, w7.a6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        n30Var.c = u2Var;
        u2Var.setTextSize(12);
        final int i11 = 0;
        u2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n30.a(n30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n30 n30Var2 = n30Var;
                        n30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n30Var2.d.h;
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
                        n30.b(n30Var, context);
                        break;
                }
            }
        });
        u2Var.setCheckable(true);
        u2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        n30Var.d = u2Var2;
        u2Var2.setTextSize(12);
        final int i12 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        n30.a(n30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n30 n30Var2 = n30Var;
                        n30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n30Var2.d.h;
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
                        n30.b(n30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        u2Var3.setTextSize(12);
        u2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i13 = 2;
        u2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        n30.a(n30Var, context);
                        break;
                    case 1:
                        Context context2 = context;
                        n30 n30Var2 = n30Var;
                        n30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = n30Var2.d.h;
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
                        n30.b(n30Var, context);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.q1 q1Var = new org.telegram.ui.Components.voip.q1(context);
        q1Var.setChildSize(68);
        q1Var.setUseStartPadding(false);
        q1Var.addView(u2Var, w7.a6.c(63.0f, 68));
        q1Var.addView(u2Var2, w7.a6.c(63.0f, 68));
        q1Var.addView(u2Var3, w7.a6.c(63.0f, 68));
        n30Var.setWillNotDraw(false);
        n30Var.addView(q1Var, w7.a6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = n30Var;
        t7Var.addView(n30Var, w7.a6.c(-2.0f, -2));
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
        if (org.telegram.ui.Components.voip.i1.d0.V || d0 != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || e0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.j60.E3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || e0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.j60.E3)) {
            j30 j30Var = d0;
            if (j30Var != null) {
                j30Var.e(false);
                j30 j30Var2 = d0;
                WindowManager windowManager = j30Var2.n;
                h30 h30Var = j30Var2.a;
                h30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d30(h30Var, j30Var2.b, j30Var2.d, windowManager, j30Var2.e)).start();
                d0.d();
                d0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (d0 == null) {
            d0 = new j30(context, account);
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
            j30 j30Var3 = d0;
            j30Var3.r = b12;
            windowManager2.addView(j30Var3.a, b12);
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
        j9 j9Var = d0.s;
        if (j9Var.getTag() != null) {
            return;
        }
        j9Var.animate().setListener(null).cancel();
        if (j9Var.getVisibility() != 0) {
            j9Var.setVisibility(0);
            j9Var.setAlpha(0.0f);
            j9Var.setScaleX(0.5f);
            j9Var.setScaleY(0.5f);
        }
        j9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        j9Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.X || this.w;
        if (this.Y != z10) {
            this.Y = z10;
            h30 h30Var = this.a;
            if (z10) {
                h30Var.animate().alpha(1.0f).start();
            } else {
                h30Var.animate().alpha(0.7f).start();
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
            org.telegram.ui.t7 t7Var = this.e;
            t7Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            n30 n30Var = this.f;
            if (z11) {
                if (t7Var.getVisibility() != 0) {
                    t7Var.setVisibility(0);
                    t7Var.setAlpha(0.0f);
                    n30Var.setScaleX(0.7f);
                    n30Var.setScaleY(0.7f);
                }
                t7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 2));
                t7Var.animate().alpha(1.0f).setDuration(150L).start();
                n30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                n30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                t7Var.animate().alpha(0.0f).setDuration(150L).setListener(new e30(this, 1)).start();
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
            bi.s7 s7Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.ALPHA, s7Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.SCALE_X, s7Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.SCALE_Y, s7Var.getScaleY(), 0.5f));
                this.Z.addListener(new e30(this, i10));
                this.Z.setDuration(150L);
                this.Z.start();
                return;
            }
            bi.ld ldVar = this.b;
            if (ldVar.getVisibility() != 0) {
                ldVar.setVisibility(0);
                s7Var.setAlpha(0.0f);
                s7Var.setScaleX(0.5f);
                s7Var.setScaleY(0.5f);
                this.v.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.ALPHA, s7Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.SCALE_X, s7Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.SCALE_Y, s7Var.getScaleY(), 1.0f));
            this.Z.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        j9 j9Var = this.s;
        i9 i9Var = j9Var.a;
        if (i9Var.f != null) {
            i9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                j9Var.b(i10, null, i11);
                i10++;
            }
            j9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    j9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                j9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        j9Var.b(2, null, i11);
        j9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        h30 h30Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - h30Var.getMeasuredWidth()));
        j9 j9Var = this.s;
        if (min < 0.0f) {
            j9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - h30Var.getMeasuredWidth()) {
            j9Var.setTranslationX((-Math.abs(min - (i10 - h30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            j9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        bi.ld ldVar = this.b;
        float measuredWidth = (ldVar.getMeasuredWidth() / 2.0f) + f7;
        h30 h30Var = this.a;
        float measuredHeight = (((ldVar.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (h30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f10 = this.O;
        float f11 = this.b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) (((measuredWidth - (h30Var.getMeasuredWidth() / 2.0f)) * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (h30Var.getParent() != null) {
            this.n.updateViewLayout(h30Var, this.r);
        }
    }
}
