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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a20 implements org.telegram.messenger.fs {
    public static a20 f0 = null;
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
    public final w10 U;
    public final w10 V;
    public final g20 W;
    public final qh0 X;
    public boolean Y;
    public boolean Z;
    public final y10 a;
    public boolean a0;
    public final bi.g3 b;
    public AnimatorSet b0;
    public final hi.w5 c;
    public final FrameLayout d;
    public final org.telegram.ui.x7 e;
    public ValueAnimator e0;
    public final e20 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final d9 w;
    public final nh0 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public boolean c0 = false;
    public float d0 = 0.0f;

    public a20(final Context context, int i7) {
        final int i10 = 2;
        final int i11 = 0;
        this.U = new w10(this, i11);
        final int i12 = 1;
        this.V = new w10(this, i12);
        this.h = i7;
        y10 y10Var = new y10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = y10Var;
        y10Var.setAlpha(0.7f);
        g20 g20Var = new g20(context, i7);
        this.W = g20Var;
        y10Var.addView(g20Var, c8.na.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.w = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new lo(this, 20));
        h(false);
        y10Var.addView(d9Var, c8.na.e(org.telegram.messenger.ks.t1, 36, 49));
        bi.g3 g3Var = new bi.g3(21, context, this);
        this.b = g3Var;
        hi.w5 w5Var = new hi.w5(this, context);
        this.c = w5Var;
        g3Var.addView(w5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        qh0 qh0Var = new qh0(context);
        this.X = qh0Var;
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        nh0 nh0Var = new nh0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.x = nh0Var;
        nh0Var.h = true;
        qh0Var.setAnimation(nh0Var);
        qh0Var.setColorFilter(-1);
        frameLayout.addView(qh0Var, c8.na.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, i10);
        this.e = x7Var;
        x7Var.setOnClickListener(new n0(this, 22));
        x7Var.setClipChildren(false);
        final e20 e20Var = new e20(context);
        e20Var.f = new RectF();
        Paint paint = new Paint(1);
        e20Var.h = paint;
        e20Var.x = true;
        e20Var.setOrientation(1);
        e20Var.y = i7;
        paint.setAlpha(234);
        d20 d20Var = new d20(context);
        d20Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        p9 p9Var = new p9(context);
        e20Var.e = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        d20Var.addView(p9Var, c8.na.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        d20Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
        d20Var.setOnClickListener(new n0(e20Var, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        e20Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView, c8.na.o(-1, -2), context);
        e20Var.b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, org.telegram.messenger.ks.j2));
        linearLayout.addView(f10, c8.na.o(-1, -2));
        d20Var.addView(linearLayout, c8.na.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        e20Var.addView(d20Var, c8.na.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        e20Var.c = r2Var;
        r2Var.setTextSize(12);
        r2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e20 e20Var2 = e20Var;
                        e20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = e20Var.d.h;
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
                        Context context3 = e20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        r2Var.setCheckable(true);
        r2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        e20Var.d = r2Var2;
        r2Var2.setTextSize(12);
        r2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e20 e20Var2 = e20Var;
                        e20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = e20Var.d.h;
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
                        Context context3 = e20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        r2Var3.setTextSize(12);
        r2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.gd.N0(2131743114, null), false, false);
        r2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e20 e20Var2 = e20Var;
                        e20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = e20Var.d.h;
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
                        Context context3 = e20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(context);
        n1Var.setChildSize(68);
        n1Var.setUseStartPadding(false);
        n1Var.addView(r2Var, c8.na.c(63.0f, 68));
        n1Var.addView(r2Var2, c8.na.c(63.0f, 68));
        n1Var.addView(r2Var3, c8.na.c(63.0f, 68));
        e20Var.setWillNotDraw(false);
        e20Var.addView(n1Var, c8.na.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = e20Var;
        x7Var.addView(e20Var, c8.na.c(-2.0f, -2));
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
        a20 a20Var = f0;
        if (a20Var != null) {
            a20Var.f(false);
            a20 a20Var2 = f0;
            WindowManager windowManager = a20Var2.n;
            y10 y10Var = a20Var2.a;
            y10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new u10(y10Var, a20Var2.b, a20Var2.d, windowManager, a20Var2.e)).start();
            f0.e();
            f0 = null;
            org.telegram.ui.Components.voip.f0.g();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.k1.e() || f0 != null) {
            return true;
        }
        if (!org.telegram.messenger.t0.G || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || g0) {
            return false;
        }
        return org.telegram.messenger.t0.y || !org.telegram.ui.e40.D5;
    }

    public static void k(Context context) {
        org.telegram.ui.Components.voip.f0 f0Var;
        a20 a20Var;
        org.telegram.ui.Components.voip.f0.h();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.t0.b;
        Typeface typeface = org.telegram.messenger.g0.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        boolean z11 = !org.telegram.ui.Components.voip.k1.e() && (!canDrawOverlays ? !z10 || g0 || W == null || org.telegram.messenger.t0.y || org.telegram.ui.e40.D5 || org.telegram.messenger.g0.H1(W) || !((f0Var = org.telegram.ui.Components.voip.f0.e) == null || f0Var.b == null) : !z10 || g0 || (!org.telegram.messenger.t0.y && org.telegram.ui.e40.D5));
        if (z11 && (a20Var = f0) != null && a20Var.r != canDrawOverlays) {
            c();
        }
        if (!z11) {
            a20 a20Var2 = f0;
            if (a20Var2 != null && !a20Var2.r) {
                a20Var2.a.setVisibility(8);
            }
            c();
            return;
        }
        int account = sharedInstance.getAccount();
        if (f0 == null) {
            boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.b);
            Activity W2 = org.telegram.messenger.g0.W(context);
            if (canDrawOverlays2 || W2 != null) {
                a20 a20Var3 = new a20(context, account);
                f0 = a20Var3;
                a20Var3.r = canDrawOverlays2;
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
                a20 a20Var4 = f0;
                a20Var4.s = b12;
                windowManager.addView(a20Var4.a, b12);
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
                org.telegram.messenger.ks.f(f0.h).b(f0, org.telegram.messenger.ks.w2);
                org.telegram.messenger.ks.e().b(f0, org.telegram.messenger.ks.R4);
                org.telegram.messenger.ks.e().b(f0, org.telegram.messenger.ks.D2);
                org.telegram.ui.Components.voip.f0.g();
            }
        }
        a20 a20Var5 = f0;
        if (a20Var5 != null) {
            d9 d9Var = a20Var5.w;
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
    }

    public final void a() {
        boolean z10 = this.Z || this.y;
        if (this.a0 != z10) {
            this.a0 = z10;
            y10 y10Var = this.a;
            if (z10) {
                y10Var.animate().alpha(1.0f).start();
            } else {
                y10Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.w2 || i7 == org.telegram.messenger.ks.R4) {
            h(true);
        } else if (i7 == org.telegram.messenger.ks.D2) {
            k(org.telegram.messenger.t0.b);
        }
    }

    public final void e() {
        org.telegram.messenger.ks.f(this.h).n(this, org.telegram.messenger.ks.w2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.F2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.y) {
            this.y = z10;
            org.telegram.ui.x7 x7Var = this.e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.y;
            e20 e20Var = this.f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    e20Var.setScaleX(0.7f);
                    e20Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                e20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                e20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new v10(this, 1)).start();
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
            hi.w5 w5Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.ALPHA, w5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.SCALE_X, w5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.SCALE_Y, w5Var.getScaleY(), 0.5f));
                this.b0.addListener(new v10(this, i7));
                this.b0.setDuration(150L);
                this.b0.start();
                return;
            }
            bi.g3 g3Var = this.b;
            if (g3Var.getVisibility() != 0) {
                g3Var.setVisibility(0);
                w5Var.setAlpha(0.0f);
                w5Var.setScaleX(0.5f);
                w5Var.setScaleY(0.5f);
                this.x.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.ALPHA, w5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.SCALE_X, w5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(w5Var, (Property<hi.w5, Float>) View.SCALE_Y, w5Var.getScaleY(), 1.0f));
            this.b0.setDuration(150L).start();
        }
    }

    public final void h(boolean z10) {
        d9 d9Var = this.w;
        c9 c9Var = d9Var.a;
        if (c9Var.f != null) {
            c9Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.t3 t3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i7 = 0;
        int i10 = this.h;
        if (t3Var == null) {
            while (i7 < 3) {
                d9Var.b(i7, i10, null);
                i7++;
            }
            d9Var.a(z10);
            return;
        }
        ArrayList arrayList = t3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i11 = 0;
        while (i7 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    d9Var.b(i7, i10, groupCallParticipant);
                }
                i11++;
            } else {
                d9Var.b(i7, i10, null);
            }
            i7++;
            i11++;
        }
        d9Var.b(2, i10, null);
        d9Var.a(z10);
    }

    public final void i() {
        float max = Math.max(this.s.x, -org.telegram.messenger.g0.L(36.0f));
        int i7 = org.telegram.messenger.g0.q.x;
        y10 y10Var = this.a;
        float min = Math.min(max, org.telegram.messenger.g0.L(36.0f) + (i7 - y10Var.getMeasuredWidth()));
        d9 d9Var = this.w;
        if (min < 0.0f) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - y10Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i7 - y10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.g3 g3Var = this.b;
        float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + f10;
        y10 y10Var = this.a;
        float measuredHeight = (((g3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (y10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f11 = this.Q;
        float f12 = this.d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (y10Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (y10Var.getParent() != null) {
            this.n.updateViewLayout(y10Var, this.s);
        }
    }
}
