// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o85 implements gk7 {
    public static o85 f0 = null;
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
    public final k85 U;
    public final k85 V;
    public final t85 W;
    public final ry8 X;
    public boolean Y;
    public boolean Z;
    public final m85 a;
    public boolean a0;
    public final yc b;
    public AnimatorSet b0;
    public final s71 c;
    public final FrameLayout d;
    public final r71 e;
    public ValueAnimator e0;
    public final r85 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final hc0 w;
    public final oy8 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public boolean c0 = false;
    public float d0 = 0.0f;

    public o85(final Context context, int i) {
        final byte b = 2;
        final byte b2 = 0;
        this.U = new k85(this, b2);
        final byte b3 = 1;
        this.V = new k85(this, b3);
        this.h = i;
        m85 m85Var = new m85(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = m85Var;
        m85Var.setAlpha(0.7f);
        t85 t85Var = new t85(context, i);
        this.W = t85Var;
        m85Var.addView(t85Var, nme.e(-1, -1, 17));
        hc0 hc0Var = new hc0(context, true);
        this.w = hc0Var;
        hc0Var.setStyle(5);
        hc0Var.setCentered(true);
        hc0Var.setVisibility(8);
        hc0Var.setDelegate(new iu4(this, (byte) 17));
        h(false);
        m85Var.addView(hc0Var, nme.e(kk7.s1, 36, 49));
        yc ycVar = new yc((byte) 23, context, (Object) this);
        this.b = ycVar;
        s71 s71Var = new s71(this, context);
        this.c = s71Var;
        ycVar.addView(s71Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ry8 ry8Var = new ry8(context);
        this.X = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        oy8 oy8Var = new oy8(R.raw.group_pip_delete_icon, gl.L(40.0f), gl.L(40.0f), true, null);
        this.x = oy8Var;
        oy8Var.h = true;
        ry8Var.setAnimation(oy8Var);
        ry8Var.setColorFilter(-1);
        frameLayout.addView(ry8Var, nme.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        r71 r71Var = new r71(this, context, b);
        this.e = r71Var;
        r71Var.setOnClickListener(new yj3(this, (byte) 28));
        r71Var.setClipChildren(false);
        final r85 r85Var = new r85(context);
        r85Var.f = new RectF();
        Paint paint = new Paint(1);
        r85Var.h = paint;
        r85Var.x = true;
        r85Var.setOrientation(1);
        r85Var.y = i;
        paint.setAlpha(234);
        q85 q85Var = new q85(context);
        q85Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        be0 be0Var = new be0(context);
        r85Var.e = be0Var;
        be0Var.setRoundRadius(gl.L(22.0f));
        q85Var.addView(be0Var, nme.c(44.0f, 44));
        int L = gl.L(6.0f);
        int o = bm2.o(-1, 76);
        q85Var.setBackground(bkb.i0(L, L, L, L, 0, o, o));
        q85Var.setOnClickListener(new yj3(r85Var, (byte) 29));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        r85Var.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        TextView m = ug8.m(linearLayout, textView, nme.o(-1, -2), context);
        r85Var.b = m;
        m.setTextSize(12.0f);
        m.setTextColor(bm2.o(-1, kk7.i2));
        linearLayout.addView(m, nme.o(-1, -2));
        q85Var.addView(linearLayout, nme.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        r85Var.addView(q85Var, nme.t(-1, -2, 0, 10, 10, 10, 10));
        dic dicVar = new dic(context, 44.0f);
        r85Var.c = dicVar;
        dicVar.setTextSize(12);
        dicVar.setOnClickListener(new View.OnClickListener() { // from class: p85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                Context context2 = context;
                r85 r85Var2 = r85Var;
                switch (b4) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var2.getContext(), Settings.canDrawOverlays(context2));
                            break;
                        }
                        break;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r85Var2.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h75.l1(r85Var2.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        break;
                }
            }
        });
        dicVar.setCheckable(true);
        dicVar.a(bm2.o(-1, 38), bm2.o(-1, 76));
        dic dicVar2 = new dic(context, 44.0f);
        r85Var.d = dicVar2;
        dicVar2.setTextSize(12);
        dicVar2.setOnClickListener(new View.OnClickListener() { // from class: p85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                Context context2 = context;
                r85 r85Var2 = r85Var;
                switch (b4) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var2.getContext(), Settings.canDrawOverlays(context2));
                            break;
                        }
                        break;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r85Var2.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h75.l1(r85Var2.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        break;
                }
            }
        });
        dic dicVar3 = new dic(context, 44.0f);
        dicVar3.setTextSize(12);
        dicVar3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, k96.M0(2131743122, null), false, false);
        dicVar3.setOnClickListener(new View.OnClickListener() { // from class: p85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                Context context2 = context;
                r85 r85Var2 = r85Var;
                switch (b4) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var2.getContext(), Settings.canDrawOverlays(context2));
                            break;
                        }
                        break;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                                break;
                            } else {
                                TextView[] textViewArr = r85Var2.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        h75.l1(r85Var2.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        break;
                }
            }
        });
        mfc mfcVar = new mfc(context);
        mfcVar.setChildSize(68);
        mfcVar.setUseStartPadding(false);
        mfcVar.addView(dicVar, nme.c(63.0f, 68));
        mfcVar.addView(dicVar2, nme.c(63.0f, 68));
        mfcVar.addView(dicVar3, nme.c(63.0f, 68));
        r85Var.setWillNotDraw(false);
        r85Var.addView(mfcVar, nme.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = r85Var;
        r71Var.addView(r85Var, nme.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = gl.L(105.0f);
        layoutParams.width = gl.L(105.0f);
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
        o85 o85Var = f0;
        if (o85Var != null) {
            o85Var.f(false);
            o85 o85Var2 = f0;
            WindowManager windowManager = o85Var2.n;
            m85 m85Var = o85Var2.a;
            m85Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new i85(m85Var, o85Var2.b, o85Var2.d, windowManager, o85Var2.e)).start();
            f0.e();
            f0 = null;
            a95.c();
            kk7.e().k(kk7.E2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (sn9.c() || f0 != null) {
            return true;
        }
        if (!a.G || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || g0) {
            return false;
        }
        return a.y || !h75.t5;
    }

    public static void k(Context context) {
        o85 o85Var;
        a95 a95Var;
        a95.d();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        Context context2 = a.b;
        Typeface typeface = gl.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = gl.W(context);
        boolean z2 = !sn9.c() && (!canDrawOverlays ? !z || g0 || W == null || a.y || h75.t5 || gl.F1(W) || !((a95Var = a95.e) == null || a95Var.b == null) : !z || g0 || (!a.y && h75.t5));
        if (z2 && (o85Var = f0) != null && o85Var.r != canDrawOverlays) {
            c();
        }
        if (!z2) {
            o85 o85Var2 = f0;
            if (o85Var2 != null && !o85Var2.r) {
                o85Var2.a.setVisibility(8);
            }
            c();
            return;
        }
        int account = sharedInstance.getAccount();
        if (f0 == null) {
            boolean canDrawOverlays2 = Settings.canDrawOverlays(a.b);
            Activity W2 = gl.W(context);
            if (canDrawOverlays2 || W2 != null) {
                o85 o85Var3 = new o85(context, account);
                f0 = o85Var3;
                o85Var3.r = canDrawOverlays2;
                WindowManager windowManager = canDrawOverlays2 ? (WindowManager) a.b.getSystemService("window") : W2.getWindowManager();
                f0.n = windowManager;
                WindowManager.LayoutParams b = b(context);
                b.width = -1;
                b.height = -1;
                b.dimAmount = 0.25f;
                b.flags = 522;
                windowManager.addView(f0.e, b);
                f0.e.setVisibility(8);
                WindowManager.LayoutParams b2 = b(context);
                b2.gravity = 81;
                b2.width = gl.L(100.0f);
                b2.height = gl.L(150.0f);
                windowManager.addView(f0.b, b2);
                WindowManager.LayoutParams b3 = b(context);
                o85 o85Var4 = f0;
                o85Var4.s = b3;
                windowManager.addView(o85Var4.a, b3);
                WindowManager.LayoutParams b4 = b(context);
                b4.gravity = 81;
                b4.width = gl.L(100.0f);
                b4.height = gl.L(150.0f);
                windowManager.addView(f0.d, b4);
                f0.b.setVisibility(8);
                f0.a.setScaleX(0.5f);
                f0.a.setScaleY(0.5f);
                f0.a.setAlpha(0.0f);
                f0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                kk7.f(f0.h).a(f0, kk7.v2);
                kk7.e().a(f0, kk7.Q4);
                kk7.e().a(f0, kk7.C2);
                a95.c();
            }
        }
        o85 o85Var5 = f0;
        if (o85Var5 != null) {
            hc0 hc0Var = o85Var5.w;
            if (hc0Var.getTag() == null) {
                hc0Var.animate().setListener(null).cancel();
                if (hc0Var.getVisibility() != 0) {
                    hc0Var.setVisibility(0);
                    hc0Var.setAlpha(0.0f);
                    hc0Var.setScaleX(0.5f);
                    hc0Var.setScaleY(0.5f);
                }
                hc0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                hc0Var.setTag(1);
            }
        }
    }

    public final void a() {
        boolean z = this.Z || this.y;
        if (this.a0 != z) {
            this.a0 = z;
            m85 m85Var = this.a;
            if (z) {
                m85Var.animate().alpha(1.0f).start();
            } else {
                m85Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.v2 || i == kk7.Q4) {
            h(true);
        } else if (i == kk7.C2) {
            k(a.b);
        }
    }

    public final void e() {
        kk7.f(this.h).n(this, kk7.v2);
        kk7.e().n(this, kk7.Q4);
        kk7.e().n(this, kk7.E2);
        kk7.e().n(this, kk7.C2);
    }

    public final void f(boolean z) {
        if (z != this.y) {
            this.y = z;
            r71 r71Var = this.e;
            r71Var.animate().setListener(null).cancel();
            boolean z2 = this.y;
            r85 r85Var = this.f;
            if (z2) {
                if (r71Var.getVisibility() != 0) {
                    r71Var.setVisibility(0);
                    r71Var.setAlpha(0.0f);
                    r85Var.setScaleX(0.7f);
                    r85Var.setScaleY(0.7f);
                }
                r71Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 4));
                r71Var.animate().alpha(1.0f).setDuration(150L).start();
                r85Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                r85Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                r71Var.animate().alpha(0.0f).setDuration(150L).setListener(new j85(this, (byte) 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z) {
        if (this.E != z) {
            this.E = z;
            AnimatorSet animatorSet = this.b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.b0.cancel();
            }
            byte b = 0;
            s71 s71Var = this.c;
            if (!z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.ALPHA, s71Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.SCALE_X, s71Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.SCALE_Y, s71Var.getScaleY(), 0.5f));
                this.b0.addListener(new j85(this, b));
                this.b0.setDuration(150L);
                this.b0.start();
                return;
            }
            yc ycVar = this.b;
            if (ycVar.getVisibility() != 0) {
                ycVar.setVisibility(0);
                s71Var.setAlpha(0.0f);
                s71Var.setScaleX(0.5f);
                s71Var.setScaleY(0.5f);
                this.x.H(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.ALPHA, s71Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.SCALE_X, s71Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.SCALE_Y, s71Var.getScaleY(), 1.0f));
            this.b0.setDuration(150L).start();
        }
    }

    public final void h(boolean z) {
        hc0 hc0Var = this.w;
        gc0 gc0Var = hc0Var.a;
        if (gc0Var.f != null) {
            gc0Var.g = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        fc2 fc2Var = sharedInstance != null ? sharedInstance.groupCall : null;
        int i = 0;
        int i2 = this.h;
        if (fc2Var == null) {
            while (i < 3) {
                hc0Var.b(i, i2, null);
                i++;
            }
            hc0Var.a(z);
            return;
        }
        ArrayList arrayList = fc2Var.e;
        long selfId = sharedInstance.getSelfId();
        int size = arrayList.size();
        int i3 = 0;
        while (i < 2) {
            if (i3 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                if (k27.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                    hc0Var.b(i, i2, groupCallParticipant);
                }
                i3++;
            } else {
                hc0Var.b(i, i2, null);
            }
            i++;
            i3++;
        }
        hc0Var.b(2, i2, null);
        hc0Var.a(z);
    }

    public final void i() {
        float max = Math.max(this.s.x, -gl.L(36.0f));
        int i = gl.q.x;
        m85 m85Var = this.a;
        float min = Math.min(max, gl.L(36.0f) + (i - m85Var.getMeasuredWidth()));
        hc0 hc0Var = this.w;
        if (min < 0.0f) {
            hc0Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i - m85Var.getMeasuredWidth()) {
            hc0Var.setTranslationX((-Math.abs(min - (i - m85Var.getMeasuredWidth()))) / 3.0f);
        } else {
            hc0Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f = this.P - this.S;
        yc ycVar = this.b;
        float measuredWidth = (ycVar.getMeasuredWidth() / 2.0f) + f;
        m85 m85Var = this.a;
        float measuredHeight = (((ycVar.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (m85Var.getMeasuredHeight() / 2.0f)) - gl.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f2 = this.Q;
        float f3 = this.d0;
        float f4 = 1.0f - f3;
        layoutParams.x = (int) (((measuredWidth - (m85Var.getMeasuredWidth() / 2.0f)) * f3) + (f2 * f4));
        layoutParams.y = (int) ((measuredHeight * f3) + (f4 * this.R));
        i();
        if (m85Var.getParent() != null) {
            this.n.updateViewLayout(m85Var, this.s);
        }
    }
}
