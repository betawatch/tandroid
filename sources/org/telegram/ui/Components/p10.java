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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p10 implements org.telegram.messenger.ls {
    public static p10 e0 = null;
    public static boolean f0 = true;
    public boolean D;
    public boolean E;
    public boolean G;
    public int J;
    public int K;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public final l10 T;
    public final l10 U;
    public final v10 V;
    public final ch0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final n10 a;
    public AnimatorSet a0;
    public final bi.e5 b;
    public final fi.p5 c;
    public final FrameLayout d;
    public ValueAnimator d0;
    public final org.telegram.ui.w7 e;
    public final t10 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final z8 w;
    public final zg0 x;
    public boolean y;
    public float F = 0.0f;
    public final int[] H = new int[2];
    public final float[] I = new float[2];
    public float L = -1.0f;
    public float M = -1.0f;
    public boolean b0 = false;
    public float c0 = 0.0f;

    public p10(final Context context, int i7) {
        final int i10 = 2;
        final int i11 = 0;
        this.T = new l10(this, i11);
        final int i12 = 1;
        this.U = new l10(this, i12);
        this.h = i7;
        n10 n10Var = new n10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = n10Var;
        n10Var.setAlpha(0.7f);
        v10 v10Var = new v10(context, i7);
        this.V = v10Var;
        n10Var.addView(v10Var, c8.ha.e(-1, -1, 17));
        z8 z8Var = new z8(context, true);
        this.w = z8Var;
        z8Var.setStyle(5);
        z8Var.setCentered(true);
        z8Var.setVisibility(8);
        z8Var.setDelegate(new gp(this, 18));
        h(false);
        n10Var.addView(z8Var, c8.ha.e(org.telegram.messenger.qs.t1, 36, 49));
        int i13 = 20;
        bi.e5 e5Var = new bi.e5(i13, context, this);
        this.b = e5Var;
        fi.p5 p5Var = new fi.p5(this, context);
        this.c = p5Var;
        e5Var.addView(p5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ch0 ch0Var = new ch0(context);
        this.W = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        zg0 zg0Var = new zg0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.x = zg0Var;
        zg0Var.h = true;
        ch0Var.setAnimation(zg0Var);
        ch0Var.setColorFilter(-1);
        frameLayout.addView(ch0Var, c8.ha.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, i10);
        this.e = w7Var;
        w7Var.setOnClickListener(new h0(this, i13));
        w7Var.setClipChildren(false);
        final t10 t10Var = new t10(context);
        t10Var.f = new RectF();
        Paint paint = new Paint(1);
        t10Var.h = paint;
        t10Var.x = true;
        t10Var.setOrientation(1);
        t10Var.y = i7;
        paint.setAlpha(org.telegram.messenger.qs.J3);
        s10 s10Var = new s10(context);
        s10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        l9 l9Var = new l9(context);
        t10Var.e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        s10Var.addView(l9Var, c8.ha.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        s10Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
        s10Var.setOnClickListener(new h0(t10Var, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        t10Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.o(-1, -2), context);
        t10Var.b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, org.telegram.messenger.qs.j2));
        linearLayout.addView(f10, c8.ha.o(-1, -2));
        s10Var.addView(linearLayout, c8.ha.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        t10Var.addView(s10Var, c8.ha.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        t10Var.c = n2Var;
        n2Var.setTextSize(12);
        n2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        t10 t10Var2 = t10Var;
                        t10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = t10Var.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        Context context3 = t10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        n2Var.setCheckable(true);
        n2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        t10Var.d = n2Var2;
        n2Var2.setTextSize(12);
        n2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t10 t10Var2 = t10Var;
                        t10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = t10Var.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        Context context3 = t10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        n2Var3.setTextSize(12);
        n2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.id.M0(2131743367, null), false, false);
        n2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t10 t10Var2 = t10Var;
                        t10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = t10Var.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        Context context3 = t10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(context);
        j1Var.setChildSize(68);
        j1Var.setUseStartPadding(false);
        j1Var.addView(n2Var, c8.ha.c(63.0f, 68));
        j1Var.addView(n2Var2, c8.ha.c(63.0f, 68));
        j1Var.addView(n2Var3, c8.ha.c(63.0f, 68));
        t10Var.setWillNotDraw(false);
        t10Var.addView(j1Var, c8.ha.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = t10Var;
        w7Var.addView(t10Var, c8.ha.c(-2.0f, -2));
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
        p10 p10Var = e0;
        if (p10Var != null) {
            p10Var.f(false);
            p10 p10Var2 = e0;
            WindowManager windowManager = p10Var2.n;
            n10 n10Var = p10Var2.a;
            n10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new j10(n10Var, p10Var2.b, p10Var2.d, windowManager, p10Var2.e)).start();
            e0.e();
            e0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.g1.i() || e0 != null) {
            return true;
        }
        if (!org.telegram.messenger.t0.F || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || f0) {
            return false;
        }
        return org.telegram.messenger.t0.y || !org.telegram.ui.c40.v5;
    }

    public static void k(Context context) {
        org.telegram.ui.Components.voip.e0 e0Var;
        p10 p10Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z9 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.t0.b;
        Typeface typeface = org.telegram.messenger.g0.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        boolean z10 = !org.telegram.ui.Components.voip.g1.i() && (!canDrawOverlays ? !z9 || f0 || W == null || org.telegram.messenger.t0.y || org.telegram.ui.c40.v5 || org.telegram.messenger.g0.H1(W) || !((e0Var = org.telegram.ui.Components.voip.e0.e) == null || e0Var.b == null) : !z9 || f0 || (!org.telegram.messenger.t0.y && org.telegram.ui.c40.v5));
        if (z10 && (p10Var = e0) != null && p10Var.r != canDrawOverlays) {
            c();
        }
        if (!z10) {
            p10 p10Var2 = e0;
            if (p10Var2 != null && !p10Var2.r) {
                p10Var2.a.setVisibility(8);
            }
            c();
            return;
        }
        int account = sharedInstance.getAccount();
        if (e0 == null) {
            boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.b);
            Activity W2 = org.telegram.messenger.g0.W(context);
            if (canDrawOverlays2 || W2 != null) {
                p10 p10Var3 = new p10(context, account);
                e0 = p10Var3;
                p10Var3.r = canDrawOverlays2;
                WindowManager windowManager = canDrawOverlays2 ? (WindowManager) org.telegram.messenger.t0.b.getSystemService("window") : W2.getWindowManager();
                e0.n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(e0.e, b10);
                e0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = org.telegram.messenger.g0.L(100.0f);
                b11.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(e0.b, b11);
                WindowManager.LayoutParams b12 = b(context);
                p10 p10Var4 = e0;
                p10Var4.s = b12;
                windowManager.addView(p10Var4.a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = org.telegram.messenger.g0.L(100.0f);
                b13.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(e0.d, b13);
                e0.b.setVisibility(8);
                e0.a.setScaleX(0.5f);
                e0.a.setScaleY(0.5f);
                e0.a.setAlpha(0.0f);
                e0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                org.telegram.messenger.qs.f(e0.h).b(e0, org.telegram.messenger.qs.w2);
                org.telegram.messenger.qs.e().b(e0, org.telegram.messenger.qs.O4);
                org.telegram.messenger.qs.e().b(e0, org.telegram.messenger.qs.D2);
                org.telegram.ui.Components.voip.e0.k();
            }
        }
        p10 p10Var5 = e0;
        if (p10Var5 != null) {
            z8 z8Var = p10Var5.w;
            if (z8Var.getTag() != null) {
                return;
            }
            z8Var.animate().setListener(null).cancel();
            if (z8Var.getVisibility() != 0) {
                z8Var.setVisibility(0);
                z8Var.setAlpha(0.0f);
                z8Var.setScaleX(0.5f);
                z8Var.setScaleY(0.5f);
            }
            z8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            z8Var.setTag(1);
        }
    }

    public final void a() {
        boolean z9 = this.Y || this.y;
        if (this.Z != z9) {
            this.Z = z9;
            n10 n10Var = this.a;
            if (z9) {
                n10Var.animate().alpha(1.0f).start();
            } else {
                n10Var.animate().alpha(0.7f).start();
            }
            this.V.setPressedState(z9);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.w2 || i7 == org.telegram.messenger.qs.O4) {
            h(true);
        } else if (i7 == org.telegram.messenger.qs.D2) {
            k(org.telegram.messenger.t0.b);
        }
    }

    public final void e() {
        org.telegram.messenger.qs.f(this.h).n(this, org.telegram.messenger.qs.w2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.F2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
    }

    public final void f(boolean z9) {
        if (z9 != this.y) {
            this.y = z9;
            org.telegram.ui.w7 w7Var = this.e;
            w7Var.animate().setListener(null).cancel();
            boolean z10 = this.y;
            t10 t10Var = this.f;
            if (z10) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    t10Var.setScaleX(0.7f);
                    t10Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                t10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                t10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new k10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            AnimatorSet animatorSet = this.a0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.a0.cancel();
            }
            int i7 = 0;
            fi.p5 p5Var = this.c;
            if (!z9) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.a0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.ALPHA, p5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.SCALE_X, p5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.SCALE_Y, p5Var.getScaleY(), 0.5f));
                this.a0.addListener(new k10(this, i7));
                this.a0.setDuration(150L);
                this.a0.start();
                return;
            }
            bi.e5 e5Var = this.b;
            if (e5Var.getVisibility() != 0) {
                e5Var.setVisibility(0);
                p5Var.setAlpha(0.0f);
                p5Var.setScaleX(0.5f);
                p5Var.setScaleY(0.5f);
                this.x.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.a0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.ALPHA, p5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.SCALE_X, p5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.SCALE_Y, p5Var.getScaleY(), 1.0f));
            this.a0.setDuration(150L).start();
        }
    }

    public final void h(boolean z9) {
        z8 z8Var = this.w;
        y8 y8Var = z8Var.a;
        if (y8Var.f != null) {
            y8Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.r3 r3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i7 = 0;
        int i10 = this.h;
        if (r3Var == null) {
            while (i7 < 3) {
                z8Var.b(i7, i10, null);
                i7++;
            }
            z8Var.a(z9);
            return;
        }
        ArrayList arrayList = r3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i11 = 0;
        while (i7 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (org.telegram.messenger.ij.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    z8Var.b(i7, i10, groupCallParticipant);
                }
                i11++;
            } else {
                z8Var.b(i7, i10, null);
            }
            i7++;
            i11++;
        }
        z8Var.b(2, i10, null);
        z8Var.a(z9);
    }

    public final void i() {
        float max = Math.max(this.s.x, -org.telegram.messenger.g0.L(36.0f));
        int i7 = org.telegram.messenger.g0.q.x;
        n10 n10Var = this.a;
        float min = Math.min(max, org.telegram.messenger.g0.L(36.0f) + (i7 - n10Var.getMeasuredWidth()));
        z8 z8Var = this.w;
        if (min < 0.0f) {
            z8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - n10Var.getMeasuredWidth()) {
            z8Var.setTranslationX((-Math.abs(min - (i7 - n10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            z8Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.O - this.R;
        bi.e5 e5Var = this.b;
        float measuredWidth = (e5Var.getMeasuredWidth() / 2.0f) + f10;
        n10 n10Var = this.a;
        float measuredHeight = (((e5Var.getMeasuredHeight() / 2.0f) + (this.N - this.S)) - (n10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f11 = this.P;
        float f12 = this.c0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (n10Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.Q));
        i();
        if (n10Var.getParent() != null) {
            this.n.updateViewLayout(n10Var, this.s);
        }
    }
}
