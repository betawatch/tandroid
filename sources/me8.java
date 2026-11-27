// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class me8 {
    public final je8 a;
    public final fc3 b;
    public byte c = 0;
    public byte d = 0;
    public xl4 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public me8(fc3 fc3Var, je8 je8Var) {
        this.b = fc3Var;
        this.a = je8Var;
    }

    public final void a(pcc pccVar) {
        xl4 xl4Var;
        if (this.c != 1 || (xl4Var = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = (byte) 0;
        xl4Var.N = true;
        xl4Var.d();
        hl.d3(new se4(xl4Var, pccVar, (byte) 8), 100L);
        this.b.d();
    }

    public final void b() {
        c(true, false);
    }

    public final void c(boolean z, boolean z2) {
        byte b = this.c;
        if (b == 3) {
            return;
        }
        this.c = (byte) 3;
        this.f = z2;
        xl4 xl4Var = this.e;
        fc3 fc3Var = this.b;
        je8 je8Var = this.a;
        if (xl4Var == null) {
            je8Var.g0();
            fc3Var.j(this, b);
            return;
        }
        this.e = null;
        boolean z3 = z && b == 1;
        Objects.requireNonNull(je8Var);
        x38 x38Var = new x38(je8Var, (byte) 24);
        if (!xl4Var.N) {
            xl4Var.N = true;
            xl4Var.d();
            vpa vpaVar = xl4Var.G;
            if (vpaVar != null) {
                vpaVar.d();
                xl4Var.H.d();
            }
            if (z3 && xl4Var.h) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(k43.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new v5(xl4Var, x38Var, (byte) 21));
                animatorSet.start();
            } else {
                xl4Var.f(x38Var);
            }
        }
        fc3Var.j(this, b);
    }

    public final Bitmap d() {
        Bitmap bitmap;
        xl4 xl4Var = this.e;
        if (xl4Var == null) {
            return null;
        }
        try {
            ImageView imageView = xl4Var.n;
            if (imageView != null && imageView.getVisibility() == 0 && (xl4Var.n.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) xl4Var.n.getDrawable()).getBitmap()) != null && !bitmap.isRecycled()) {
                return bitmap.copy(bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888, false);
            }
            ne8 ne8Var = xl4Var.l;
            if (ne8Var == null || !ne8Var.isAvailable()) {
                return null;
            }
            return xl4Var.l.getBitmap();
        } catch (Throwable th) {
            cc4.g(th, true);
            return null;
        }
    }

    public final void e() {
        xl4 xl4Var = this.e;
        if (xl4Var != null) {
            xl4Var.l();
        }
        this.b.d();
    }

    public final boolean f() {
        return this.c != 3;
    }

    public final boolean g() {
        if (this.e == null) {
            return false;
        }
        byte b = this.c;
        return b == 1 || (b == 2 && this.d == 1);
    }

    public final void h() {
        byte b = this.c;
        if (b == 3) {
            return;
        }
        if (b != 0) {
            b();
        } else {
            this.c = (byte) 3;
            this.b.j(this, 0);
        }
    }

    public final ne8 i(Activity activity, Bitmap bitmap, boolean z) {
        fc3 fc3Var;
        float f;
        int i;
        byte b;
        if (this.c != 0) {
            p3d.e(this.c, "startFloating in state ");
            return null;
        }
        fc3 fc3Var2 = this.b;
        ArrayList arrayList = (ArrayList) fc3Var2.c;
        final byte b2 = 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            me8 me8Var = (me8) arrayList.get(size);
            if (me8Var != this && me8Var.g() && me8Var.a.S() == this.a.S()) {
                me8Var.b();
            }
        }
        final xl4 xl4Var = new xl4(this, activity);
        this.e = xl4Var;
        RectF rectF = new RectF();
        je8 je8Var = xl4Var.b;
        boolean z2 = xl4Var.d;
        if (z2) {
            float L = hl.L(126.0f);
            SharedPreferences sharedPreferences = (SharedPreferences) kj4.Q(true).b;
            float f2 = sharedPreferences.getFloat("x", -1.0f);
            float f3 = sharedPreferences.getFloat("y", -1.0f);
            float p = f2 != -1.0f ? xl4.p(f2, L) : (hl.q.x - L) - xl4.n();
            float e = (f3 != -1.0f ? xl4.e(f3, L) : xl4.e(xl4.n() + a.getCurrentActionBarHeight(), L)) + hl.m;
            rectF.set(p, e, p + L, L + e);
            xl4Var.D = 1.0f;
            xl4Var.C = 1.0f;
        } else {
            xl4.k(rectF, je8Var.U(), je8Var.q0());
            xl4Var.C = ((SharedPreferences) kj4.Q(z2).b).getFloat("scale_factor", 1.0f);
            Point point = hl.q;
            xl4Var.D = (Math.min(point.x, point.y) - (xl4.n() * 2.0f)) / xl4Var.i();
        }
        xl4Var.A = (int) rectF.width();
        xl4Var.B = (int) rectF.height();
        xl4Var.E = rectF.left;
        xl4Var.F = rectF.top - hl.m;
        int U = je8Var.U();
        int q0 = je8Var.q0();
        float f4 = ((U <= 0 || q0 <= 0) ? 0.5625f : ((float) q0) / ((float) U)) < 1.0f ? 0.6f : 0.45f;
        rec recVar = xl4Var.I;
        recVar.q = f4;
        recVar.a();
        vpa vpaVar = new vpa(xl4Var, xl4.W);
        wpa wpaVar = new wpa();
        wpaVar.a(0.75f);
        wpaVar.b(650.0f);
        vpaVar.m = wpaVar;
        final byte b3 = 0;
        vpaVar.a(new ps3() { // from class: ol4
            @Override // ps3
            public final void a(vpa vpaVar2, boolean z3, float f5, float f6) {
                byte b4 = b3;
                xl4 xl4Var2 = xl4Var;
                switch (b4) {
                    case 0:
                        ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("x", f5).apply();
                        xl4Var2.a.b.d();
                        break;
                    default:
                        ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("y", f5).apply();
                        xl4Var2.a.b.d();
                        break;
                }
            }
        });
        xl4Var.G = vpaVar;
        vpa vpaVar2 = new vpa(xl4Var, xl4.X);
        wpa wpaVar2 = new wpa();
        wpaVar2.a(0.75f);
        wpaVar2.b(650.0f);
        vpaVar2.m = wpaVar2;
        vpaVar2.a(new ps3() { // from class: ol4
            @Override // ps3
            public final void a(vpa vpaVar22, boolean z3, float f5, float f6) {
                byte b4 = b2;
                xl4 xl4Var2 = xl4Var;
                switch (b4) {
                    case 0:
                        ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("x", f5).apply();
                        xl4Var2.a.b.d();
                        break;
                    default:
                        ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("y", f5).apply();
                        xl4Var2.a.b.d();
                        break;
                }
            }
        });
        xl4Var.H = vpaVar2;
        Activity activity2 = xl4Var.c;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new m33(xl4Var, b2));
        xl4Var.s = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        xl4Var.s.setStylusScaleEnabled(false);
        xl4Var.t = new xh4(activity2, new tl4(xl4Var, scaledTouchSlop));
        xl4Var.k = new pl4(xl4Var, activity2, b2);
        wl4 wl4Var = new wl4(xl4Var, activity2);
        xl4Var.j = wl4Var;
        wl4Var.addView(xl4Var.k, tre.c(-1.0f, -1));
        pl4 pl4Var = xl4Var.k;
        if (z2) {
            pl4Var.setOutlineProvider(yhc.a);
        } else {
            float L2 = hl.L(10.0f);
            yi yiVar = yhc.a;
            pl4Var.setOutlineProvider(new whc(0, L2));
            yob.h(aob.Xg, null, xl4Var.k);
        }
        xl4Var.k.setClipToOutline(true);
        ImageView imageView = new ImageView(activity2);
        xl4Var.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        xl4Var.n.setVisibility(8);
        xl4Var.k.addView(xl4Var.n, tre.c(-1.0f, -1));
        byte b4 = 2;
        if (z2) {
            ul4 ul4Var = new ul4(xl4Var, activity2);
            xl4Var.r = ul4Var;
            xl4Var.k.addView(ul4Var, tre.c(-1.0f, -1));
            fc3Var = fc3Var2;
            f = -1.0f;
            i = -1;
        } else {
            recVar.n = new v34(xl4Var, b4);
            xl4Var.o = new pl4(xl4Var, activity2, b3);
            pl4 pl4Var2 = xl4Var.o;
            Objects.requireNonNull(pl4Var2);
            xl4Var.J = new cz9(new rj4(pl4Var2, b2), true);
            xl4Var.o.setWillNotDraw(false);
            xl4Var.o.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            xl4Var.o.addView(view, tre.c(-1.0f, -1));
            int L3 = hl.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_close);
            int i2 = aob.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView2, i2, null, mode);
            int i3 = aob.i6;
            fc3Var = fc3Var2;
            hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
            uob M = yob.M(i3);
            imageView2.setBackground(f0);
            yob.j(imageView2, f0, null, M, null);
            imageView2.setPadding(L3, L3, L3, L3);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: ml4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b5 = b3;
                    xl4 xl4Var2 = xl4Var;
                    switch (b5) {
                        case 0:
                            xl4Var2.a.c(true, true);
                            break;
                        case 1:
                            me8 me8Var2 = xl4Var2.a;
                            if (me8Var2.c == 1) {
                                fc3 fc3Var3 = me8Var2.b;
                                x38 x38Var = new x38(me8Var2, (byte) 25);
                                if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                    x38Var.run();
                                    break;
                                } else {
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(TLObject.FLAG_28);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            break;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            xl4Var2.r();
                            break;
                    }
                }
            });
            xl4Var.o.addView(imageView2, tre.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(R.drawable.pip_video_expand);
            yob.s(imageView3, i2, null, mode);
            final byte b5 = 1;
            hf0 f02 = aob.f0(aob.w0(null, i3, false), 1, -1);
            uob M2 = yob.M(i3);
            imageView3.setBackground(f02);
            yob.j(imageView3, f02, null, M2, null);
            imageView3.setPadding(L3, L3, L3, L3);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: ml4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b52 = b5;
                    xl4 xl4Var2 = xl4Var;
                    switch (b52) {
                        case 0:
                            xl4Var2.a.c(true, true);
                            break;
                        case 1:
                            me8 me8Var2 = xl4Var2.a;
                            if (me8Var2.c == 1) {
                                fc3 fc3Var3 = me8Var2.b;
                                x38 x38Var = new x38(me8Var2, (byte) 25);
                                if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                    x38Var.run();
                                    break;
                                } else {
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(TLObject.FLAG_28);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            break;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            xl4Var2.r();
                            break;
                    }
                }
            });
            xl4Var.o.addView(imageView3, tre.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            xl4Var.p = imageView4;
            yob.s(imageView4, i2, null, mode);
            yob.R(xl4Var.p, aob.f0(aob.w0(null, i3, false), 1, -1), null, yob.M(i3), null);
            final byte b6 = 2;
            xl4Var.p.setOnClickListener(new View.OnClickListener() { // from class: ml4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b52 = b6;
                    xl4 xl4Var2 = xl4Var;
                    switch (b52) {
                        case 0:
                            xl4Var2.a.c(true, true);
                            break;
                        case 1:
                            me8 me8Var2 = xl4Var2.a;
                            if (me8Var2.c == 1) {
                                fc3 fc3Var3 = me8Var2.b;
                                x38 x38Var = new x38(me8Var2, (byte) 25);
                                if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                    x38Var.run();
                                    break;
                                } else {
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(TLObject.FLAG_28);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            break;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            xl4Var2.r();
                            break;
                    }
                }
            });
            xl4Var.p.setVisibility(je8Var.E0() ? 0 : 8);
            xl4Var.o.addView(xl4Var.p, tre.e(38, 38, 17));
            vl4 vl4Var = new vl4(xl4Var, activity2);
            xl4Var.q = vl4Var;
            vl4Var.setVisibility(je8Var.E0() ? 0 : 8);
            f = -1.0f;
            i = -1;
            xl4Var.o.addView(xl4Var.q, tre.c(-1.0f, -1));
            xl4Var.k.addView(xl4Var.o, tre.c(-1.0f, -1));
        }
        View P = je8Var.P();
        xl4Var.m = P;
        if (P != null) {
            hl.B2(P);
            xl4Var.k.addView(xl4Var.m, 0, tre.c(f, i));
        } else {
            ne8 ne8Var = new ne8(activity2);
            xl4Var.l = ne8Var;
            if (z2) {
                ne8Var.setScaleX(1.0166667f);
                xl4Var.l.setScaleY(1.0166667f);
            }
            xl4Var.k.addView(xl4Var.l, 0, tre.c(-1.0f, -1));
        }
        byte b7 = 3;
        if (bitmap != null && xl4Var.l != null) {
            xl4Var.n.setImageBitmap(bitmap);
            xl4Var.n.setVisibility(0);
            xl4Var.l.setFirstFrameCallback(new nl4(xl4Var, b7));
        }
        xl4Var.a();
        if (z) {
            xl4Var.j.setAlpha(0.0f);
            xl4Var.j.setScaleX(0.1f);
            xl4Var.j.setScaleY(0.1f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(k43.f);
            b = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_Y, 1.0f));
            animatorSet.start();
        } else {
            b = 1;
        }
        xl4Var.l();
        ne8 ne8Var2 = xl4Var.l;
        this.c = b;
        fc3Var.d();
        return ne8Var2;
    }
}
