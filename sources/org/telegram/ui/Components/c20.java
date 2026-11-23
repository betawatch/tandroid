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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c20 implements org.telegram.messenger.gs {
    public static c20 f0 = null;
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
    public final y10 U;
    public final y10 V;
    public final i20 W;
    public final rh0 X;
    public boolean Y;
    public boolean Z;
    public final a20 a;
    public boolean a0;
    public final bi.e3 b;
    public AnimatorSet b0;
    public final hi.l5 c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 e;
    public ValueAnimator e0;
    public final g20 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final e9 w;
    public final oh0 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public boolean c0 = false;
    public float d0 = 0.0f;

    public c20(final Context context, int i7) {
        final int i10 = 2;
        final int i11 = 0;
        this.U = new y10(this, i11);
        final int i12 = 1;
        this.V = new y10(this, i12);
        this.h = i7;
        a20 a20Var = new a20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = a20Var;
        a20Var.setAlpha(0.7f);
        i20 i20Var = new i20(context, i7);
        this.W = i20Var;
        a20Var.addView(i20Var, c8.ma.e(-1, -1, 17));
        e9 e9Var = new e9(context, true);
        this.w = e9Var;
        e9Var.setStyle(5);
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        e9Var.setDelegate(new oo(this, 20));
        h(false);
        a20Var.addView(e9Var, c8.ma.e(org.telegram.messenger.ls.t1, 36, 49));
        bi.e3 e3Var = new bi.e3(21, context, this);
        this.b = e3Var;
        hi.l5 l5Var = new hi.l5(this, context);
        this.c = l5Var;
        e3Var.addView(l5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        rh0 rh0Var = new rh0(context);
        this.X = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        oh0 oh0Var = new oh0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.x = oh0Var;
        oh0Var.h = true;
        rh0Var.setAnimation(oh0Var);
        rh0Var.setColorFilter(-1);
        frameLayout.addView(rh0Var, c8.ma.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, i10);
        this.e = w7Var;
        w7Var.setOnClickListener(new o0(this, 22));
        w7Var.setClipChildren(false);
        final g20 g20Var = new g20(context);
        g20Var.f = new RectF();
        Paint paint = new Paint(1);
        g20Var.h = paint;
        g20Var.x = true;
        g20Var.setOrientation(1);
        g20Var.y = i7;
        paint.setAlpha(234);
        f20 f20Var = new f20(context);
        f20Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        q9 q9Var = new q9(context);
        g20Var.e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        f20Var.addView(q9Var, c8.ma.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        f20Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        f20Var.setOnClickListener(new o0(g20Var, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        g20Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.o(-1, -2), context);
        g20Var.b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, org.telegram.messenger.ls.j2));
        linearLayout.addView(f10, c8.ma.o(-1, -2));
        f20Var.addView(linearLayout, c8.ma.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        g20Var.addView(f20Var, c8.ma.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        g20Var.c = q2Var;
        q2Var.setTextSize(12);
        q2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g20 g20Var2 = g20Var;
                        g20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = g20Var.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        Context context3 = g20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        q2Var.setCheckable(true);
        q2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        g20Var.d = q2Var2;
        q2Var2.setTextSize(12);
        q2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g20 g20Var2 = g20Var;
                        g20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = g20Var.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        Context context3 = g20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.q2 q2Var3 = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        q2Var3.setTextSize(12);
        q2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.N0(2131743119, null), false, false);
        q2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g20 g20Var2 = g20Var;
                        g20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = g20Var.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        Context context3 = g20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.m1 m1Var = new org.telegram.ui.Components.voip.m1(context);
        m1Var.setChildSize(68);
        m1Var.setUseStartPadding(false);
        m1Var.addView(q2Var, c8.ma.c(63.0f, 68));
        m1Var.addView(q2Var2, c8.ma.c(63.0f, 68));
        m1Var.addView(q2Var3, c8.ma.c(63.0f, 68));
        g20Var.setWillNotDraw(false);
        g20Var.addView(m1Var, c8.ma.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = g20Var;
        w7Var.addView(g20Var, c8.ma.c(-2.0f, -2));
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
        c20 c20Var = f0;
        if (c20Var != null) {
            c20Var.f(false);
            c20 c20Var2 = f0;
            WindowManager windowManager = c20Var2.n;
            a20 a20Var = c20Var2.a;
            a20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new w10(a20Var, c20Var2.b, c20Var2.d, windowManager, c20Var2.e)).start();
            f0.e();
            f0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.j1.j() || f0 != null) {
            return true;
        }
        if (!org.telegram.messenger.t0.G || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || g0) {
            return false;
        }
        return org.telegram.messenger.t0.y || !org.telegram.ui.f40.D5;
    }

    public static void k(Context context) {
        org.telegram.ui.Components.voip.e0 e0Var;
        c20 c20Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.t0.b;
        Typeface typeface = org.telegram.messenger.g0.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        boolean z11 = !org.telegram.ui.Components.voip.j1.j() && (!canDrawOverlays ? !z10 || g0 || W == null || org.telegram.messenger.t0.y || org.telegram.ui.f40.D5 || org.telegram.messenger.g0.H1(W) || !((e0Var = org.telegram.ui.Components.voip.e0.e) == null || e0Var.b == null) : !z10 || g0 || (!org.telegram.messenger.t0.y && org.telegram.ui.f40.D5));
        if (z11 && (c20Var = f0) != null && c20Var.r != canDrawOverlays) {
            c();
        }
        if (!z11) {
            c20 c20Var2 = f0;
            if (c20Var2 != null && !c20Var2.r) {
                c20Var2.a.setVisibility(8);
            }
            c();
            return;
        }
        int account = sharedInstance.getAccount();
        if (f0 == null) {
            boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.b);
            Activity W2 = org.telegram.messenger.g0.W(context);
            if (canDrawOverlays2 || W2 != null) {
                c20 c20Var3 = new c20(context, account);
                f0 = c20Var3;
                c20Var3.r = canDrawOverlays2;
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
                c20 c20Var4 = f0;
                c20Var4.s = b12;
                windowManager.addView(c20Var4.a, b12);
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
                org.telegram.messenger.ls.f(f0.h).b(f0, org.telegram.messenger.ls.w2);
                org.telegram.messenger.ls.e().b(f0, org.telegram.messenger.ls.R4);
                org.telegram.messenger.ls.e().b(f0, org.telegram.messenger.ls.D2);
                org.telegram.ui.Components.voip.e0.k();
            }
        }
        c20 c20Var5 = f0;
        if (c20Var5 != null) {
            e9 e9Var = c20Var5.w;
            if (e9Var.getTag() != null) {
                return;
            }
            e9Var.animate().setListener(null).cancel();
            if (e9Var.getVisibility() != 0) {
                e9Var.setVisibility(0);
                e9Var.setAlpha(0.0f);
                e9Var.setScaleX(0.5f);
                e9Var.setScaleY(0.5f);
            }
            e9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            e9Var.setTag(1);
        }
    }

    public final void a() {
        boolean z10 = this.Z || this.y;
        if (this.a0 != z10) {
            this.a0 = z10;
            a20 a20Var = this.a;
            if (z10) {
                a20Var.animate().alpha(1.0f).start();
            } else {
                a20Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.w2 || i7 == org.telegram.messenger.ls.R4) {
            h(true);
        } else if (i7 == org.telegram.messenger.ls.D2) {
            k(org.telegram.messenger.t0.b);
        }
    }

    public final void e() {
        org.telegram.messenger.ls.f(this.h).n(this, org.telegram.messenger.ls.w2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.R4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.F2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.y) {
            this.y = z10;
            org.telegram.ui.w7 w7Var = this.e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.y;
            g20 g20Var = this.f;
            if (z11) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    g20Var.setScaleX(0.7f);
                    g20Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                g20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                g20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new x10(this, 1)).start();
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
            hi.l5 l5Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.ALPHA, l5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.SCALE_X, l5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.SCALE_Y, l5Var.getScaleY(), 0.5f));
                this.b0.addListener(new x10(this, i7));
                this.b0.setDuration(150L);
                this.b0.start();
                return;
            }
            bi.e3 e3Var = this.b;
            if (e3Var.getVisibility() != 0) {
                e3Var.setVisibility(0);
                l5Var.setAlpha(0.0f);
                l5Var.setScaleX(0.5f);
                l5Var.setScaleY(0.5f);
                this.x.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.ALPHA, l5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.SCALE_X, l5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(l5Var, (Property<hi.l5, Float>) View.SCALE_Y, l5Var.getScaleY(), 1.0f));
            this.b0.setDuration(150L).start();
        }
    }

    public final void h(boolean z10) {
        e9 e9Var = this.w;
        d9 d9Var = e9Var.a;
        if (d9Var.f != null) {
            d9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.t3 t3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i7 = 0;
        int i10 = this.h;
        if (t3Var == null) {
            while (i7 < 3) {
                e9Var.b(i7, i10, null);
                i7++;
            }
            e9Var.a(z10);
            return;
        }
        ArrayList arrayList = t3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i11 = 0;
        while (i7 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    e9Var.b(i7, i10, groupCallParticipant);
                }
                i11++;
            } else {
                e9Var.b(i7, i10, null);
            }
            i7++;
            i11++;
        }
        e9Var.b(2, i10, null);
        e9Var.a(z10);
    }

    public final void i() {
        float max = Math.max(this.s.x, -org.telegram.messenger.g0.L(36.0f));
        int i7 = org.telegram.messenger.g0.q.x;
        a20 a20Var = this.a;
        float min = Math.min(max, org.telegram.messenger.g0.L(36.0f) + (i7 - a20Var.getMeasuredWidth()));
        e9 e9Var = this.w;
        if (min < 0.0f) {
            e9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - a20Var.getMeasuredWidth()) {
            e9Var.setTranslationX((-Math.abs(min - (i7 - a20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            e9Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.e3 e3Var = this.b;
        float measuredWidth = (e3Var.getMeasuredWidth() / 2.0f) + f10;
        a20 a20Var = this.a;
        float measuredHeight = (((e3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (a20Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f11 = this.Q;
        float f12 = this.d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (a20Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (a20Var.getParent() != null) {
            this.n.updateViewLayout(a20Var, this.s);
        }
    }
}
