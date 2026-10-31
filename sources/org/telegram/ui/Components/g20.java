package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g20 implements org.telegram.messenger.us {
    public static g20 d0 = null;
    public static boolean e0 = true;
    public boolean D;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final c20 S;
    public final c20 T;
    public final m20 U;
    public final ei0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final e20 a;
    public final jg.l0 b;
    public final kg.f0 c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final org.telegram.ui.w7 e;
    public final k20 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final u8 s;
    public final bi0 w;
    public boolean x;
    public boolean y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public boolean a0 = false;
    public float b0 = 0.0f;

    public g20(final Context context, int i10) {
        final int i11 = 2;
        final int i12 = 0;
        this.S = new c20(this, i12);
        final int i13 = 1;
        this.T = new c20(this, i13);
        this.h = i10;
        e20 e20Var = new e20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = e20Var;
        e20Var.setAlpha(0.7f);
        m20 m20Var = new m20(i10, context, false);
        this.U = m20Var;
        e20Var.addView(m20Var, w7.b6.e(-1, -1, 17));
        u8 u8Var = new u8(context, true);
        this.s = u8Var;
        u8Var.setStyle(5);
        u8Var.setCentered(true);
        u8Var.setVisibility(8);
        int i14 = 20;
        u8Var.setDelegate(new ho(this, i14));
        g(false);
        e20Var.addView(u8Var, w7.b6.e(org.telegram.messenger.zs.t1, 36, 49));
        int i15 = 19;
        jg.l0 l0Var = new jg.l0(this, context, i15);
        this.b = l0Var;
        kg.f0 f0Var = new kg.f0(this, context);
        this.c = f0Var;
        l0Var.addView(f0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ei0 ei0Var = new ei0(context);
        this.V = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        bi0 bi0Var = new bi0(R.raw.group_pip_delete_icon, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f), true, null);
        this.w = bi0Var;
        bi0Var.h = true;
        ei0Var.setAnimation(bi0Var);
        ei0Var.setColorFilter(-1);
        frameLayout.addView(ei0Var, w7.b6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, i11);
        this.e = w7Var;
        w7Var.setOnClickListener(new h0(this, i15));
        w7Var.setClipChildren(false);
        final k20 k20Var = new k20(context);
        k20Var.f = new RectF();
        Paint paint = new Paint(1);
        k20Var.h = paint;
        k20Var.x = true;
        k20Var.setOrientation(1);
        k20Var.y = i10;
        paint.setAlpha(org.telegram.messenger.zs.J3);
        j20 j20Var = new j20(context);
        j20Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        g9 g9Var = new g9(context);
        k20Var.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
        j20Var.addView(g9Var, w7.b6.c(44.0f, 44));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(-1, 76);
        j20Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        j20Var.setOnClickListener(new h0(k20Var, i14));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        k20Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView, w7.b6.o(-1, -2), context);
        k20Var.b = f7;
        f7.setTextSize(12.0f);
        f7.setTextColor(i0.b.o(-1, org.telegram.messenger.zs.j2));
        linearLayout.addView(f7, w7.b6.o(-1, -2));
        j20Var.addView(linearLayout, w7.b6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        k20Var.addView(j20Var, w7.b6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.b2 b2Var = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        k20Var.c = b2Var;
        b2Var.setTextSize(12);
        b2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k20 k20Var2 = k20Var;
                        k20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = k20Var.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = k20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        b2Var.setCheckable(true);
        b2Var.a(i0.b.o(-1, 38), i0.b.o(-1, 76));
        org.telegram.ui.Components.voip.b2 b2Var2 = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        k20Var.d = b2Var2;
        b2Var2.setTextSize(12);
        b2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        k20 k20Var2 = k20Var;
                        k20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = k20Var.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = k20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.b2 b2Var3 = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        b2Var3.setTextSize(12);
        b2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, false);
        b2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k20 k20Var2 = k20Var;
                        k20Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = k20Var.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = k20Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.y0 y0Var = new org.telegram.ui.Components.voip.y0(context);
        y0Var.setChildSize(68);
        y0Var.setUseStartPadding(false);
        y0Var.addView(b2Var, w7.b6.c(63.0f, 68));
        y0Var.addView(b2Var2, w7.b6.c(63.0f, 68));
        y0Var.addView(b2Var3, w7.b6.c(63.0f, 68));
        k20Var.setWillNotDraw(false);
        k20Var.addView(y0Var, w7.b6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = k20Var;
        w7Var.addView(k20Var, w7.b6.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = org.telegram.messenger.i0.L(105.0f);
        layoutParams.width = org.telegram.messenger.i0.L(105.0f);
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

    public static boolean c() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.s0.d0.V || d0 != null) {
            return true;
        }
        if (!org.telegram.messenger.w0.F || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || e0) {
            return false;
        }
        return org.telegram.messenger.w0.y || !org.telegram.ui.b50.v5;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.w0.b;
        Typeface typeface = org.telegram.messenger.i0.a;
        if (!Settings.canDrawOverlays(context2) || !z10 || e0 || (!org.telegram.messenger.w0.y && org.telegram.ui.b50.v5)) {
            g20 g20Var = d0;
            if (g20Var != null) {
                g20Var.e(false);
                g20 g20Var2 = d0;
                WindowManager windowManager = g20Var2.n;
                e20 e20Var = g20Var2.a;
                e20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new a20(e20Var, g20Var2.b, g20Var2.d, windowManager, g20Var2.e)).start();
                d0.d();
                d0 = null;
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (d0 == null) {
            d0 = new g20(context, account);
            WindowManager windowManager2 = (WindowManager) org.telegram.messenger.w0.b.getSystemService("window");
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
            b11.width = org.telegram.messenger.i0.L(100.0f);
            b11.height = org.telegram.messenger.i0.L(150.0f);
            windowManager2.addView(d0.b, b11);
            WindowManager.LayoutParams b12 = b(context);
            g20 g20Var3 = d0;
            g20Var3.r = b12;
            windowManager2.addView(g20Var3.a, b12);
            WindowManager.LayoutParams b13 = b(context);
            b13.gravity = 81;
            b13.width = org.telegram.messenger.i0.L(100.0f);
            b13.height = org.telegram.messenger.i0.L(150.0f);
            windowManager2.addView(d0.d, b13);
            d0.b.setVisibility(8);
            d0.a.setScaleX(0.5f);
            d0.a.setScaleY(0.5f);
            d0.a.setAlpha(0.0f);
            d0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            org.telegram.messenger.zs.f(d0.h).b(d0, org.telegram.messenger.zs.w2);
            org.telegram.messenger.zs.e().b(d0, org.telegram.messenger.zs.O4);
            org.telegram.messenger.zs.e().b(d0, org.telegram.messenger.zs.D2);
        }
        u8 u8Var = d0.s;
        if (u8Var.getTag() != null) {
            return;
        }
        u8Var.animate().setListener(null).cancel();
        if (u8Var.getVisibility() != 0) {
            u8Var.setVisibility(0);
            u8Var.setAlpha(0.0f);
            u8Var.setScaleX(0.5f);
            u8Var.setScaleY(0.5f);
        }
        u8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        u8Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.X || this.x;
        if (this.Y != z10) {
            this.Y = z10;
            e20 e20Var = this.a;
            if (z10) {
                e20Var.animate().alpha(1.0f).start();
            } else {
                e20Var.animate().alpha(0.7f).start();
            }
            this.U.setPressedState(z10);
        }
    }

    public final void d() {
        org.telegram.messenger.zs.f(this.h).n(this, org.telegram.messenger.zs.w2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.F2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D2);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.w2 || i10 == org.telegram.messenger.zs.O4) {
            g(true);
        } else if (i10 == org.telegram.messenger.zs.D2) {
            j(org.telegram.messenger.w0.b);
        }
    }

    public final void e(boolean z10) {
        if (z10 != this.x) {
            this.x = z10;
            org.telegram.ui.w7 w7Var = this.e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.x;
            k20 k20Var = this.f;
            if (z11) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    k20Var.setScaleX(0.7f);
                    k20Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.l1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                k20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                k20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new b20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.y != z10) {
            this.y = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            int i10 = 0;
            kg.f0 f0Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.ALPHA, f0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.SCALE_X, f0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.SCALE_Y, f0Var.getScaleY(), 0.5f));
                this.Z.addListener(new b20(this, i10));
                this.Z.setDuration(150L);
                this.Z.start();
                return;
            }
            jg.l0 l0Var = this.b;
            if (l0Var.getVisibility() != 0) {
                l0Var.setVisibility(0);
                f0Var.setAlpha(0.0f);
                f0Var.setScaleX(0.5f);
                f0Var.setScaleY(0.5f);
                this.w.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.ALPHA, f0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.SCALE_X, f0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.SCALE_Y, f0Var.getScaleY(), 1.0f));
            this.Z.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        u8 u8Var = this.s;
        t8 t8Var = u8Var.a;
        if (t8Var.f != null) {
            t8Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.u3 u3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i10 = 0;
        int i11 = this.h;
        if (u3Var == null) {
            while (i10 < 3) {
                u8Var.b(i10, i11, null);
                i10++;
            }
            u8Var.a(z10);
            return;
        }
        ArrayList arrayList = u3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i12 = 0;
        while (i10 < 2) {
            if (i12 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i12);
                if (org.telegram.messenger.jj.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    u8Var.b(i10, i11, groupCallParticipant);
                }
                i12++;
            } else {
                u8Var.b(i10, i11, null);
            }
            i10++;
            i12++;
        }
        u8Var.b(2, i11, null);
        u8Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -org.telegram.messenger.i0.L(36.0f));
        int i10 = org.telegram.messenger.i0.q.x;
        e20 e20Var = this.a;
        float min = Math.min(max, org.telegram.messenger.i0.L(36.0f) + (i10 - e20Var.getMeasuredWidth()));
        u8 u8Var = this.s;
        if (min < 0.0f) {
            u8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - e20Var.getMeasuredWidth()) {
            u8Var.setTranslationX((-Math.abs(min - (i10 - e20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            u8Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        jg.l0 l0Var = this.b;
        float measuredWidth = (l0Var.getMeasuredWidth() / 2.0f) + f7;
        e20 e20Var = this.a;
        float measuredHeight = (((l0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (e20Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.i0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f10 = this.O;
        float f11 = this.b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) (((measuredWidth - (e20Var.getMeasuredWidth() / 2.0f)) * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (e20Var.getParent() != null) {
            this.n.updateViewLayout(e20Var, this.r);
        }
    }
}
