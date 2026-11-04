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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l10 implements org.telegram.messenger.cs {
    public static l10 e0 = null;
    public static boolean f0 = true;
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
    public final h10 T;
    public final h10 U;
    public final r10 V;
    public final fh0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final j10 a;
    public AnimatorSet a0;
    public final ai.o2 b;
    public final gi.n5 c;
    public final FrameLayout d;
    public ValueAnimator d0;
    public final org.telegram.ui.x7 e;
    public final p10 f;
    public final int h;
    public WindowManager n;
    public WindowManager.LayoutParams r;
    public final x8 s;
    public final ch0 w;
    public boolean x;
    public boolean y;
    public float F = 0.0f;
    public final int[] H = new int[2];
    public final float[] I = new float[2];
    public float L = -1.0f;
    public float M = -1.0f;
    public boolean b0 = false;
    public float c0 = 0.0f;

    public l10(final Context context, int i3) {
        final int i10 = 2;
        final int i11 = 0;
        this.T = new h10(this, i11);
        final int i12 = 1;
        this.U = new h10(this, i12);
        this.h = i3;
        j10 j10Var = new j10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = j10Var;
        j10Var.setAlpha(0.7f);
        r10 r10Var = new r10(i3, context, false);
        this.V = r10Var;
        j10Var.addView(r10Var, b8.mf.e(-1, -1, 17));
        x8 x8Var = new x8(context, true);
        this.s = x8Var;
        x8Var.setStyle(5);
        x8Var.setCentered(true);
        x8Var.setVisibility(8);
        x8Var.setDelegate(new gp(this, 18));
        g(false);
        j10Var.addView(x8Var, b8.mf.e(org.telegram.messenger.hs.t1, 36, 49));
        ai.o2 o2Var = new ai.o2(22, context, this);
        this.b = o2Var;
        gi.n5 n5Var = new gi.n5(this, context);
        this.c = n5Var;
        o2Var.addView(n5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        fh0 fh0Var = new fh0(context);
        this.W = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0 ch0Var = new ch0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.w = ch0Var;
        ch0Var.h = true;
        fh0Var.setAnimation(ch0Var);
        fh0Var.setColorFilter(-1);
        frameLayout.addView(fh0Var, b8.mf.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, i10);
        this.e = x7Var;
        x7Var.setOnClickListener(new f0(this, 20));
        x7Var.setClipChildren(false);
        final p10 p10Var = new p10(context);
        p10Var.f = new RectF();
        Paint paint = new Paint(1);
        p10Var.h = paint;
        p10Var.x = true;
        p10Var.setOrientation(1);
        p10Var.y = i3;
        paint.setAlpha(org.telegram.messenger.hs.J3);
        o10 o10Var = new o10(context);
        o10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        k9 k9Var = new k9(context);
        p10Var.e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        o10Var.addView(k9Var, b8.mf.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o10 = i0.a.o(-1, 76);
        o10Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
        o10Var.setOnClickListener(new f0(p10Var, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        p10Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.o(-1, -2), context);
        p10Var.b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, org.telegram.messenger.hs.j2));
        linearLayout.addView(f10, b8.mf.o(-1, -2));
        o10Var.addView(linearLayout, b8.mf.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        p10Var.addView(o10Var, b8.mf.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.c2 c2Var = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        p10Var.c = c2Var;
        c2Var.setTextSize(12);
        c2Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        p10 p10Var2 = p10Var;
                        p10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = p10Var.d.h;
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
                        Context context3 = p10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        c2Var.setCheckable(true);
        c2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.c2 c2Var2 = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        p10Var.d = c2Var2;
        c2Var2.setTextSize(12);
        c2Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        p10 p10Var2 = p10Var;
                        p10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = p10Var.d.h;
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
                        Context context3 = p10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.c2 c2Var3 = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        c2Var3.setTextSize(12);
        c2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, false);
        c2Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        p10 p10Var2 = p10Var;
                        p10Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var2.getContext(), Settings.canDrawOverlays(context));
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
                                TextView[] textViewArr = p10Var.d.h;
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
                        Context context3 = p10Var.getContext();
                        Context context4 = context;
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.y0 y0Var = new org.telegram.ui.Components.voip.y0(context);
        y0Var.setChildSize(68);
        y0Var.setUseStartPadding(false);
        y0Var.addView(c2Var, b8.mf.c(63.0f, 68));
        y0Var.addView(c2Var2, b8.mf.c(63.0f, 68));
        y0Var.addView(c2Var3, b8.mf.c(63.0f, 68));
        p10Var.setWillNotDraw(false);
        p10Var.addView(y0Var, b8.mf.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = p10Var;
        x7Var.addView(p10Var, b8.mf.c(-2.0f, -2));
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

    public static boolean c() {
        VoIPService sharedInstance;
        if (org.telegram.ui.Components.voip.s0.e0.W || e0 != null) {
            return true;
        }
        if (!org.telegram.messenger.t0.G || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || f0) {
            return false;
        }
        return org.telegram.messenger.t0.y || !org.telegram.ui.x30.w5;
    }

    public static void j(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = org.telegram.messenger.t0.b;
        Typeface typeface = org.telegram.messenger.g0.a;
        if (!Settings.canDrawOverlays(context2) || !z10 || f0 || (!org.telegram.messenger.t0.y && org.telegram.ui.x30.w5)) {
            l10 l10Var = e0;
            if (l10Var != null) {
                l10Var.e(false);
                l10 l10Var2 = e0;
                WindowManager windowManager = l10Var2.n;
                j10 j10Var = l10Var2.a;
                j10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new f10(j10Var, l10Var2.b, l10Var2.d, windowManager, l10Var2.e)).start();
                e0.d();
                e0 = null;
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (e0 == null) {
            e0 = new l10(context, account);
            WindowManager windowManager2 = (WindowManager) org.telegram.messenger.t0.b.getSystemService("window");
            e0.n = windowManager2;
            WindowManager.LayoutParams b10 = b(context);
            b10.width = -1;
            b10.height = -1;
            b10.dimAmount = 0.25f;
            b10.flags = 522;
            windowManager2.addView(e0.e, b10);
            e0.e.setVisibility(8);
            WindowManager.LayoutParams b11 = b(context);
            b11.gravity = 81;
            b11.width = org.telegram.messenger.g0.L(100.0f);
            b11.height = org.telegram.messenger.g0.L(150.0f);
            windowManager2.addView(e0.b, b11);
            WindowManager.LayoutParams b12 = b(context);
            l10 l10Var3 = e0;
            l10Var3.r = b12;
            windowManager2.addView(l10Var3.a, b12);
            WindowManager.LayoutParams b13 = b(context);
            b13.gravity = 81;
            b13.width = org.telegram.messenger.g0.L(100.0f);
            b13.height = org.telegram.messenger.g0.L(150.0f);
            windowManager2.addView(e0.d, b13);
            e0.b.setVisibility(8);
            e0.a.setScaleX(0.5f);
            e0.a.setScaleY(0.5f);
            e0.a.setAlpha(0.0f);
            e0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            org.telegram.messenger.hs.f(e0.h).b(e0, org.telegram.messenger.hs.w2);
            org.telegram.messenger.hs.e().b(e0, org.telegram.messenger.hs.O4);
            org.telegram.messenger.hs.e().b(e0, org.telegram.messenger.hs.D2);
        }
        x8 x8Var = e0.s;
        if (x8Var.getTag() != null) {
            return;
        }
        x8Var.animate().setListener(null).cancel();
        if (x8Var.getVisibility() != 0) {
            x8Var.setVisibility(0);
            x8Var.setAlpha(0.0f);
            x8Var.setScaleX(0.5f);
            x8Var.setScaleY(0.5f);
        }
        x8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        x8Var.setTag(1);
    }

    public final void a() {
        boolean z10 = this.Y || this.x;
        if (this.Z != z10) {
            this.Z = z10;
            j10 j10Var = this.a;
            if (z10) {
                j10Var.animate().alpha(1.0f).start();
            } else {
                j10Var.animate().alpha(0.7f).start();
            }
            this.V.setPressedState(z10);
        }
    }

    public final void d() {
        org.telegram.messenger.hs.f(this.h).n(this, org.telegram.messenger.hs.w2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.F2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D2);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.w2 || i3 == org.telegram.messenger.hs.O4) {
            g(true);
        } else if (i3 == org.telegram.messenger.hs.D2) {
            j(org.telegram.messenger.t0.b);
        }
    }

    public final void e(boolean z10) {
        if (z10 != this.x) {
            this.x = z10;
            org.telegram.ui.x7 x7Var = this.e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.x;
            p10 p10Var = this.f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    p10Var.setScaleX(0.7f);
                    p10Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                p10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                p10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new g10(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.y != z10) {
            this.y = z10;
            AnimatorSet animatorSet = this.a0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.a0.cancel();
            }
            int i3 = 0;
            gi.n5 n5Var = this.c;
            if (!z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.a0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.ALPHA, n5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.SCALE_X, n5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.SCALE_Y, n5Var.getScaleY(), 0.5f));
                this.a0.addListener(new g10(this, i3));
                this.a0.setDuration(150L);
                this.a0.start();
                return;
            }
            ai.o2 o2Var = this.b;
            if (o2Var.getVisibility() != 0) {
                o2Var.setVisibility(0);
                n5Var.setAlpha(0.0f);
                n5Var.setScaleX(0.5f);
                n5Var.setScaleY(0.5f);
                this.w.M(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.a0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.ALPHA, n5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.SCALE_X, n5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.SCALE_Y, n5Var.getScaleY(), 1.0f));
            this.a0.setDuration(150L).start();
        }
    }

    public final void g(boolean z10) {
        x8 x8Var = this.s;
        w8 w8Var = x8Var.a;
        if (w8Var.f != null) {
            w8Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.messenger.r3 r3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i3 = 0;
        int i10 = this.h;
        if (r3Var == null) {
            while (i3 < 3) {
                x8Var.b(i3, i10, null);
                i3++;
            }
            x8Var.a(z10);
            return;
        }
        ArrayList arrayList = r3Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i11 = 0;
        while (i3 < 2) {
            if (i11 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (org.telegram.messenger.zi.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    x8Var.b(i3, i10, groupCallParticipant);
                }
                i11++;
            } else {
                x8Var.b(i3, i10, null);
            }
            i3++;
            i11++;
        }
        x8Var.b(2, i10, null);
        x8Var.a(z10);
    }

    public final void h() {
        float max = Math.max(this.r.x, -org.telegram.messenger.g0.L(36.0f));
        int i3 = org.telegram.messenger.g0.q.x;
        j10 j10Var = this.a;
        float min = Math.min(max, org.telegram.messenger.g0.L(36.0f) + (i3 - j10Var.getMeasuredWidth()));
        x8 x8Var = this.s;
        if (min < 0.0f) {
            x8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i3 - j10Var.getMeasuredWidth()) {
            x8Var.setTranslationX((-Math.abs(min - (i3 - j10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            x8Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.O - this.R;
        ai.o2 o2Var = this.b;
        float measuredWidth = (o2Var.getMeasuredWidth() / 2.0f) + f10;
        j10 j10Var = this.a;
        float measuredHeight = (((o2Var.getMeasuredHeight() / 2.0f) + (this.N - this.S)) - (j10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.r;
        float f11 = this.P;
        float f12 = this.c0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) (((measuredWidth - (j10Var.getMeasuredWidth() / 2.0f)) * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.Q));
        h();
        if (j10Var.getParent() != null) {
            this.n.updateViewLayout(j10Var, this.r);
        }
    }
}
