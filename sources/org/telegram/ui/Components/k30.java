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
import android.provider.Settings;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k30 implements NotificationCenter.NotificationCenterDelegate {
    public static k30 d0 = null;
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
    public final q30 U;
    public final bk0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final h30 a;
    public final bh.r b;
    public final fi.f6 c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final org.telegram.ui.a8 e;
    public final o30 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final m9 s;
    public final yj0 v;
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

    public k30(final Context context, int i10) {
        this.h = i10;
        h30 h30Var = new h30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = h30Var;
        h30Var.setAlpha(0.7f);
        q30 q30Var = new q30(i10, context, false);
        this.U = q30Var;
        h30Var.addView(q30Var, kb1.i(-1, -1, 17));
        m9 m9Var = new m9(context, true);
        this.s = m9Var;
        m9Var.setStyle(5);
        m9Var.setCentered(true);
        m9Var.setVisibility(8);
        m9Var.setDelegate(new cp(this, 22));
        g(false);
        h30Var.addView(m9Var, kb1.i(108, 36, 49));
        bh.r rVar = new bh.r(this, context, 18);
        this.b = rVar;
        fi.f6 f6Var = new fi.f6(this, context);
        this.c = f6Var;
        rVar.addView(f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bk0 bk0Var = new bk0(context);
        this.V = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        yj0 yj0Var = new yj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = yj0Var;
        yj0Var.h = true;
        bk0Var.setAnimation(yj0Var);
        bk0Var.setColorFilter(-1);
        frameLayout.addView(bk0Var, kb1.h(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, context, 2);
        this.e = a8Var;
        a8Var.setOnClickListener(new f0(this, 20));
        a8Var.setClipChildren(false);
        final o30 o30Var = new o30(context);
        o30Var.f = new RectF();
        Paint paint = new Paint(1);
        o30Var.h = paint;
        o30Var.w = true;
        o30Var.setOrientation(1);
        o30Var.x = i10;
        paint.setAlpha(234);
        n30 n30Var = new n30(context);
        n30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        y9 y9Var = new y9(context);
        o30Var.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        n30Var.addView(y9Var, kb1.g(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(-1, 76);
        n30Var.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        n30Var.setOnClickListener(new f0(o30Var, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        o30Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView, kb1.r(-1, -2), context);
        o30Var.b = e;
        e.setTextSize(12.0f);
        e.setTextColor(i0.a.o(-1, 153));
        linearLayout.addView(e, kb1.r(-1, -2));
        n30Var.addView(linearLayout, kb1.h(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        o30Var.addView(n30Var, kb1.x(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        o30Var.c = w2Var;
        w2Var.setTextSize(12);
        final int i11 = 0;
        w2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o30 o30Var2 = o30Var;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        o30 o30Var3 = o30Var;
                        o30Var3.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = o30Var3.d.h;
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
                        Context context3 = o30Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        w2Var.setCheckable(true);
        w2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        o30Var.d = w2Var2;
        w2Var2.setTextSize(12);
        final int i12 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        o30 o30Var2 = o30Var;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        o30 o30Var3 = o30Var;
                        o30Var3.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = o30Var3.d.h;
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
                        Context context3 = o30Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        w2Var3.setTextSize(12);
        w2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i13 = 2;
        w2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        o30 o30Var2 = o30Var;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        o30 o30Var3 = o30Var;
                        o30Var3.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = o30Var3.d.h;
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
                        Context context3 = o30Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(context);
        s1Var.setChildSize(68);
        s1Var.setUseStartPadding(false);
        s1Var.addView(w2Var, kb1.g(63.0f, 68));
        s1Var.addView(w2Var2, kb1.g(63.0f, 68));
        s1Var.addView(w2Var3, kb1.g(63.0f, 68));
        o30Var.setWillNotDraw(false);
        o30Var.addView(s1Var, kb1.x(-1, -2, 0, 6, 0, 6, 0));
        this.f = o30Var;
        a8Var.addView(o30Var, kb1.g(-2.0f, -2));
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
        if (!ApplicationLoader.canDrawOverlays || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || e0) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.x50.E3;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z10 || e0 || (!ApplicationLoader.mainInterfaceStopped && org.telegram.ui.x50.E3)) {
            k30 k30Var = d0;
            if (k30Var != null) {
                k30Var.e(false);
                k30 k30Var2 = d0;
                WindowManager windowManager = k30Var2.n;
                h30 h30Var = k30Var2.a;
                h30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d30(h30Var, k30Var2.b, k30Var2.d, windowManager, k30Var2.e)).start();
                d0.d();
                d0 = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (d0 == null) {
            d0 = new k30(context, account);
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
            k30 k30Var3 = d0;
            k30Var3.r = b12;
            windowManager2.addView(k30Var3.a, b12);
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
        m9 m9Var = d0.s;
        if (m9Var.getTag() != null) {
            return;
        }
        m9Var.animate().setListener(null).cancel();
        if (m9Var.getVisibility() != 0) {
            m9Var.setVisibility(0);
            m9Var.setAlpha(0.0f);
            m9Var.setScaleX(0.5f);
            m9Var.setScaleY(0.5f);
        }
        m9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        m9Var.setTag(1);
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
            org.telegram.ui.a8 a8Var = this.e;
            a8Var.animate().setListener(null).cancel();
            boolean z11 = this.w;
            o30 o30Var = this.f;
            if (z11) {
                if (a8Var.getVisibility() != 0) {
                    a8Var.setVisibility(0);
                    a8Var.setAlpha(0.0f);
                    o30Var.setScaleX(0.7f);
                    o30Var.setScaleY(0.7f);
                }
                a8Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 2));
                a8Var.animate().alpha(1.0f).setDuration(150L).start();
                o30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                o30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                a8Var.animate().alpha(0.0f).setDuration(150L).setListener(new e30(this, 1)).start();
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
            fi.f6 f6Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.ALPHA, f6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.SCALE_X, f6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.SCALE_Y, f6Var.getScaleY(), 0.5f));
                this.Z.addListener(new e30(this, i10));
                this.Z.setDuration(150L);
                this.Z.start();
                return;
            }
            bh.r rVar = this.b;
            if (rVar.getVisibility() != 0) {
                rVar.setVisibility(0);
                f6Var.setAlpha(0.0f);
                f6Var.setScaleX(0.5f);
                f6Var.setScaleY(0.5f);
                this.v.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.ALPHA, f6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.SCALE_X, f6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(f6Var, (Property<fi.f6, Float>) View.SCALE_Y, f6Var.getScaleY(), 1.0f));
            this.Z.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        m9 m9Var = this.s;
        l9 l9Var = m9Var.a;
        if (l9Var.f != null) {
            l9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (call == null) {
            while (i10 < 3) {
                m9Var.b(i10, null, i11);
                i10++;
            }
            m9Var.a(z10);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call.sortedParticipants.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    m9Var.b(i10, groupCallParticipant, i11);
                }
                i12++;
            } else {
                m9Var.b(i10, null, i11);
            }
            i10++;
            i12++;
        }
        m9Var.b(2, null, i11);
        m9Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -AndroidUtilities.dp(36.0f));
        int i10 = AndroidUtilities.displaySize.x;
        h30 h30Var = this.a;
        float min = Math.min(max, AndroidUtilities.dp(36.0f) + (i10 - h30Var.getMeasuredWidth()));
        m9 m9Var = this.s;
        if (min < 0.0f) {
            m9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - h30Var.getMeasuredWidth()) {
            m9Var.setTranslationX((-Math.abs(min - (i10 - h30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            m9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        bh.r rVar = this.b;
        float measuredWidth = (rVar.getMeasuredWidth() / 2.0f) + f7;
        h30 h30Var = this.a;
        float measuredHeight = (((rVar.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (h30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
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
