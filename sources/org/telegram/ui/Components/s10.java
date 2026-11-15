package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
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
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s10 implements org.telegram.messenger.is {
    public static s10 f0 = null;
    public static boolean g0 = true;
    public boolean E;
    public boolean F;
    public boolean H;
    public int K;
    public int L;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final o10 U;
    public final o10 V;
    public final y10 W;
    public final fh0 X;
    public boolean Y;
    public boolean Z;
    public final q10 a;
    public boolean a0;
    public final bi.g2 b;
    public AnimatorSet b0;
    public final hi.n5 c;
    public final FrameLayout d;
    public final org.telegram.ui.x7 e;
    public ValueAnimator e0;
    public final w10 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final w8 w;
    public final ch0 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public boolean c0 = false;
    public float d0 = 0.0f;

    public s10(final Context context, int i7) {
        final int i10 = 2;
        final int i11 = 0;
        this.U = new o10(this, i11);
        final int i12 = 1;
        this.V = new o10(this, i12);
        this.h = i7;
        q10 q10Var = new q10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = q10Var;
        q10Var.setAlpha(0.7f);
        y10 y10Var = new y10(context, i7);
        this.W = y10Var;
        q10Var.addView(y10Var, c8.ja.e(-1, -1, 17));
        w8 w8Var = new w8(context, true);
        this.w = w8Var;
        w8Var.setStyle(5);
        w8Var.setCentered(true);
        w8Var.setVisibility(8);
        w8Var.setDelegate(new fo(this, 20));
        h(false);
        q10Var.addView(w8Var, c8.ja.e(org.telegram.messenger.ns.t1, 36, 49));
        int i13 = 21;
        bi.g2 g2Var = new bi.g2(i13, context, this);
        this.b = g2Var;
        hi.n5 n5Var = new hi.n5(this, context);
        this.c = n5Var;
        g2Var.addView(n5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        fh0 fh0Var = new fh0(context);
        this.X = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0 ch0Var = new ch0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.x = ch0Var;
        ch0Var.h = true;
        fh0Var.setAnimation(ch0Var);
        fh0Var.setColorFilter(-1);
        frameLayout.addView(fh0Var, c8.ja.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, i10);
        this.e = x7Var;
        x7Var.setOnClickListener(new e0(this, i13));
        x7Var.setClipChildren(false);
        final w10 w10Var = new w10(context);
        w10Var.f = new RectF();
        Paint paint = new Paint(1);
        w10Var.h = paint;
        w10Var.x = true;
        w10Var.setOrientation(1);
        w10Var.y = i7;
        paint.setAlpha(org.telegram.messenger.ns.J3);
        v10 v10Var = new v10(context);
        v10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        i9 i9Var = new i9(context);
        w10Var.e = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        v10Var.addView(i9Var, c8.ja.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        v10Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
        v10Var.setOnClickListener(new e0(w10Var, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        w10Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.o(-1, -2), context);
        w10Var.b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, org.telegram.messenger.ns.j2));
        linearLayout.addView(f10, c8.ja.o(-1, -2));
        v10Var.addView(linearLayout, c8.ja.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        w10Var.addView(v10Var, c8.ja.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        w10Var.c = r2Var;
        r2Var.setTextSize(12);
        r2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        w10 w10Var2 = w10Var;
                        w10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = w10Var.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = w10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        r2Var.setCheckable(true);
        r2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        w10Var.d = r2Var2;
        r2Var2.setTextSize(12);
        r2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        w10 w10Var2 = w10Var;
                        w10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = w10Var.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = w10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        r2Var3.setTextSize(12);
        r2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.M0(2131743364, null), false, false);
        r2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        w10 w10Var2 = w10Var;
                        w10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var2.getContext(), Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = w10Var.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = w10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(context);
        n1Var.setChildSize(68);
        n1Var.setUseStartPadding(false);
        n1Var.addView(r2Var, c8.ja.c(63.0f, 68));
        n1Var.addView(r2Var2, c8.ja.c(63.0f, 68));
        n1Var.addView(r2Var3, c8.ja.c(63.0f, 68));
        w10Var.setWillNotDraw(false);
        w10Var.addView(n1Var, c8.ja.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = w10Var;
        x7Var.addView(w10Var, c8.ja.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(105.0f);
        layoutParams.width = org.telegram.messenger.g0.L(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!Settings.canDrawOverlays(context)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static void c() {
        s10 s10Var = f0;
        if (s10Var != null) {
            s10Var.f(false);
            s10 s10Var2 = f0;
            WindowManager windowManager = s10Var2.n;
            q10 q10Var = s10Var2.a;
            q10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new m10(q10Var, s10Var2.b, s10Var2.d, windowManager, s10Var2.e)).start();
            f0.e();
            f0 = null;
            org.telegram.ui.Components.voip.f0.k();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.k1.i() || f0 != null) {
            return true;
        }
        if (!org.telegram.messenger.t0.G || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || g0) {
            return false;
        }
        return org.telegram.messenger.t0.y || !org.telegram.ui.c40.D5;
    }

    public static void k(Context context) {
        org.telegram.ui.Components.voip.f0 f0Var;
        s10 s10Var;
        org.telegram.ui.Components.voip.f0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.t0.b;
        Typeface typeface = org.telegram.messenger.g0.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        boolean z11 = !org.telegram.ui.Components.voip.k1.i() && (!canDrawOverlays ? !z10 || g0 || W == null || org.telegram.messenger.t0.y || org.telegram.ui.c40.D5 || org.telegram.messenger.g0.H1(W) || !((f0Var = org.telegram.ui.Components.voip.f0.e) == null || f0Var.b == null) : !z10 || g0 || (!org.telegram.messenger.t0.y && org.telegram.ui.c40.D5));
        if (z11 && (s10Var = f0) != null && s10Var.r != canDrawOverlays) {
            c();
        }
        if (!z11) {
            s10 s10Var2 = f0;
            if (s10Var2 != null && !s10Var2.r) {
                s10Var2.a.setVisibility(8);
            }
            c();
            return;
        }
        int account = sharedInstance.getAccount();
        if (f0 == null) {
            boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.b);
            Activity W2 = org.telegram.messenger.g0.W(context);
            if (canDrawOverlays2 || W2 != null) {
                s10 s10Var3 = new s10(context, account);
                f0 = s10Var3;
                s10Var3.r = canDrawOverlays2;
                WindowManager windowManager = canDrawOverlays2 ? (WindowManager) org.telegram.messenger.t0.b.getSystemService("window") : W2.getWindowManager();
                f0.n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f0.e, b10);
                f0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = org.telegram.messenger.g0.L(100.0f);
                b11.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(f0.b, b11);
                WindowManager.LayoutParams b12 = b(context);
                s10 s10Var4 = f0;
                s10Var4.s = b12;
                windowManager.addView(s10Var4.a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = org.telegram.messenger.g0.L(100.0f);
                b13.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(f0.d, b13);
                f0.b.setVisibility(8);
                f0.a.setScaleX(0.5f);
                f0.a.setScaleY(0.5f);
                f0.a.setAlpha(0.0f);
                f0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                org.telegram.messenger.ns.f(f0.h).b(f0, org.telegram.messenger.ns.w2);
                org.telegram.messenger.ns.e().b(f0, org.telegram.messenger.ns.O4);
                org.telegram.messenger.ns.e().b(f0, org.telegram.messenger.ns.D2);
                org.telegram.ui.Components.voip.f0.k();
            }
        }
        s10 s10Var5 = f0;
        if (s10Var5 != null) {
            w8 w8Var = s10Var5.w;
            if (w8Var.getTag() != null) {
                return;
            }
            w8Var.animate().setListener(null).cancel();
            if (w8Var.getVisibility() != 0) {
                w8Var.setVisibility(0);
                w8Var.setAlpha(0.0f);
                w8Var.setScaleX(0.5f);
                w8Var.setScaleY(0.5f);
            }
            w8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            w8Var.setTag(1);
        }
    }

    public final void a() {
        boolean z10 = this.Z || this.y;
        if (this.a0 != z10) {
            this.a0 = z10;
            q10 q10Var = this.a;
            if (z10) {
                q10Var.animate().alpha(1.0f).start();
            } else {
                q10Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.w2 || i7 == org.telegram.messenger.ns.O4) {
            h(true);
        } else if (i7 == org.telegram.messenger.ns.D2) {
            k(org.telegram.messenger.t0.b);
        }
    }

    public final void e() {
        org.telegram.messenger.ns.f(this.h).n(this, org.telegram.messenger.ns.w2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.O4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.F2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.y) {
            this.y = z10;
            org.telegram.ui.x7 x7Var = this.e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.y;
            w10 w10Var = this.f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    w10Var.setScaleX(0.7f);
                    w10Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                w10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                w10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new n10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            AnimatorSet animatorSet = this.b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.b0.cancel();
            }
            int i7 = 0;
            hi.n5 n5Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.ALPHA, n5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.SCALE_X, n5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.SCALE_Y, n5Var.getScaleY(), 0.5f));
                this.b0.addListener(new n10(this, i7));
                this.b0.setDuration(150L);
                this.b0.start();
                return;
            }
            bi.g2 g2Var = this.b;
            if (g2Var.getVisibility() != 0) {
                g2Var.setVisibility(0);
                n5Var.setAlpha(0.0f);
                n5Var.setScaleX(0.5f);
                n5Var.setScaleY(0.5f);
                this.x.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.ALPHA, n5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.SCALE_X, n5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.SCALE_Y, n5Var.getScaleY(), 1.0f));
            this.b0.setDuration(150L).start();
        }
    }

    public final void h(boolean z10) {
        w8 w8Var = this.w;
        v8 v8Var = w8Var.a;
        if (v8Var.f != null) {
            v8Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.r3 r3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i7 = 0;
        int i10 = this.h;
        if (r3Var == null) {
            while (i7 < 3) {
                w8Var.b(i7, i10, null);
                i7++;
            }
            w8Var.a(z10);
            return;
        }
        ArrayList arrayList = r3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i11 = 0;
        while (i7 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    w8Var.b(i7, i10, groupCallParticipant);
                }
                i11++;
            } else {
                w8Var.b(i7, i10, null);
            }
            i7++;
            i11++;
        }
        w8Var.b(2, i10, null);
        w8Var.a(z10);
    }

    public final void i() {
        float max = Math.max(this.s.x, -org.telegram.messenger.g0.L(36.0f));
        int i7 = org.telegram.messenger.g0.q.x;
        q10 q10Var = this.a;
        float min = Math.min(max, org.telegram.messenger.g0.L(36.0f) + (i7 - q10Var.getMeasuredWidth()));
        w8 w8Var = this.w;
        if (min < 0.0f) {
            w8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - q10Var.getMeasuredWidth()) {
            w8Var.setTranslationX((-Math.abs(min - (i7 - q10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            w8Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.g2 g2Var = this.b;
        float measuredWidth = (g2Var.getMeasuredWidth() / 2.0f) + f10;
        q10 q10Var = this.a;
        float measuredHeight = (((g2Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (q10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f11 = this.Q;
        float f12 = this.d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (q10Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (q10Var.getParent() != null) {
            this.n.updateViewLayout(q10Var, this.s);
        }
    }
}
