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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ad8 {
    public final vc8 a;
    public final yc3 b;
    public byte c = 0;
    public byte d = 0;
    public tl4 e;
    public boolean f;
    public boolean g;

    public ad8(yc3 yc3Var, vc8 vc8Var) {
        this.b = yc3Var;
        this.a = vc8Var;
    }

    public final void a(qac qacVar) {
        tl4 tl4Var;
        if (this.c != 1 || (tl4Var = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = (byte) 0;
        tl4Var.K = true;
        tl4Var.d();
        gm.d3(new ve4(tl4Var, qacVar, (byte) 12), 100L);
        this.b.d();
    }

    public final void b() {
        byte b = this.c;
        if (b == 3) {
            return;
        }
        this.c = (byte) 3;
        tl4 tl4Var = this.e;
        yc3 yc3Var = this.b;
        vc8 vc8Var = this.a;
        if (tl4Var == null) {
            vc8Var.e0();
            yc3Var.j(this, b);
            return;
        }
        this.e = null;
        boolean z = b == 1;
        Objects.requireNonNull(vc8Var);
        q78 q78Var = new q78(vc8Var, (byte) 16);
        if (!tl4Var.K) {
            tl4Var.K = true;
            tl4Var.d();
            zna znaVar = tl4Var.D;
            if (znaVar != null) {
                znaVar.d();
                tl4Var.E.d();
            }
            if (z && tl4Var.g) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(d53.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new u5(tl4Var, q78Var, (byte) 21));
                animatorSet.start();
            } else {
                tl4Var.f(q78Var);
            }
        }
        yc3Var.j(this, b);
    }

    public final Bitmap c() {
        Bitmap bitmap;
        tl4 tl4Var = this.e;
        if (tl4Var == null) {
            return null;
        }
        try {
            ImageView imageView = tl4Var.l;
            if (imageView != null && imageView.getVisibility() == 0 && (tl4Var.l.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) tl4Var.l.getDrawable()).getBitmap()) != null && !bitmap.isRecycled()) {
                return bitmap.copy(bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888, false);
            }
            bd8 bd8Var = tl4Var.j;
            if (bd8Var == null || !bd8Var.isAvailable()) {
                return null;
            }
            return tl4Var.j.getBitmap();
        } catch (Throwable th) {
            fc4.g(th, true);
            return null;
        }
    }

    public final void d() {
        tl4 tl4Var = this.e;
        if (tl4Var != null) {
            tl4Var.k();
        }
        this.b.d();
    }

    public final boolean e() {
        return this.c != 3;
    }

    public final boolean f() {
        if (this.e == null) {
            return false;
        }
        byte b = this.c;
        return b == 1 || (b == 2 && this.d == 1);
    }

    public final void g() {
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

    public final bd8 h(Activity activity, Bitmap bitmap, boolean z) {
        byte b;
        if (this.c != 0) {
            i2d.e(this.c, "startFloating in state ");
            return null;
        }
        yc3 yc3Var = this.b;
        ArrayList arrayList = (ArrayList) yc3Var.c;
        final byte b2 = 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ad8 ad8Var = (ad8) arrayList.get(size);
            if (ad8Var != this && ad8Var.f()) {
                ad8Var.b();
            }
        }
        final tl4 tl4Var = new tl4(this, activity);
        this.e = tl4Var;
        RectF rectF = new RectF();
        vc8 vc8Var = tl4Var.b;
        tl4.j(rectF, vc8Var.S(), vc8Var.o0());
        tl4Var.z = ((SharedPreferences) lj4.t().a).getFloat("scale_factor", 1.0f);
        Point point = gm.q;
        tl4Var.A = (Math.min(point.x, point.y) - (tl4.m() * 2.0f)) / tl4Var.h();
        tl4Var.x = (int) rectF.width();
        tl4Var.y = (int) rectF.height();
        tl4Var.B = rectF.left;
        tl4Var.C = rectF.top - gm.m;
        int S = vc8Var.S();
        int o0 = vc8Var.o0();
        float f = ((S <= 0 || o0 <= 0) ? 0.5625f : ((float) o0) / ((float) S)) < 1.0f ? 0.6f : 0.45f;
        ucc uccVar = tl4Var.F;
        uccVar.q = f;
        uccVar.a();
        zna znaVar = new zna(tl4Var, tl4.Q);
        aoa aoaVar = new aoa();
        aoaVar.a(0.75f);
        aoaVar.b(650.0f);
        znaVar.m = aoaVar;
        final byte b3 = 0;
        znaVar.a(new ht3() { // from class: ol4
            @Override // ht3
            public final void a(zna znaVar2, boolean z2, float f2, float f3) {
                byte b4 = b3;
                tl4 tl4Var2 = tl4Var;
                switch (b4) {
                    case 0:
                        ((SharedPreferences) lj4.t().a).edit().putFloat("x", f2).apply();
                        tl4Var2.a.b.d();
                        break;
                    default:
                        ((SharedPreferences) lj4.t().a).edit().putFloat("y", f2).apply();
                        tl4Var2.a.b.d();
                        break;
                }
            }
        });
        tl4Var.D = znaVar;
        zna znaVar2 = new zna(tl4Var, tl4.R);
        aoa aoaVar2 = new aoa();
        aoaVar2.a(0.75f);
        aoaVar2.b(650.0f);
        znaVar2.m = aoaVar2;
        znaVar2.a(new ht3() { // from class: ol4
            @Override // ht3
            public final void a(zna znaVar22, boolean z2, float f2, float f3) {
                byte b4 = b2;
                tl4 tl4Var2 = tl4Var;
                switch (b4) {
                    case 0:
                        ((SharedPreferences) lj4.t().a).edit().putFloat("x", f2).apply();
                        tl4Var2.a.b.d();
                        break;
                    default:
                        ((SharedPreferences) lj4.t().a).edit().putFloat("y", f2).apply();
                        tl4Var2.a.b.d();
                        break;
                }
            }
        });
        tl4Var.E = znaVar2;
        Activity activity2 = tl4Var.c;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new f43(tl4Var, b2));
        tl4Var.p = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        tl4Var.p.setStylusScaleEnabled(false);
        tl4Var.q = new ai4(activity2, new sl4(tl4Var, scaledTouchSlop));
        tl4Var.i = new pl4(tl4Var, activity2, b2);
        s8 s8Var = new s8(b2, activity2, tl4Var);
        tl4Var.h = s8Var;
        s8Var.addView(tl4Var.i, qoe.c(-1.0f, -1));
        pl4 pl4Var = tl4Var.i;
        float L = gm.L(10.0f);
        xj xjVar = agc.a;
        pl4Var.setOutlineProvider(new yfc(0, L));
        tl4Var.i.setClipToOutline(true);
        anb.h(cmb.Wg, null, tl4Var.i);
        ImageView imageView = new ImageView(activity2);
        tl4Var.l = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tl4Var.l.setVisibility(8);
        tl4Var.i.addView(tl4Var.l, qoe.c(-1.0f, -1));
        uccVar.n = new k44(tl4Var, (byte) 3);
        tl4Var.m = new pl4(tl4Var, activity2, b3);
        pl4 pl4Var2 = tl4Var.m;
        Objects.requireNonNull(pl4Var2);
        tl4Var.G = new lx9(new a14((Object) pl4Var2, (byte) 25), true);
        tl4Var.m.setWillNotDraw(false);
        tl4Var.m.setAlpha(0.0f);
        View view = new View(activity2);
        view.setBackgroundColor(1275068416);
        tl4Var.m.addView(view, qoe.c(-1.0f, -1));
        int L2 = gm.L(8.0f);
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_close);
        int i = cmb.Xg;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView2, i, null, mode);
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i2, false), 1, -1);
        wmb M = anb.M(i2);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M, null);
        imageView2.setPadding(L2, L2, L2, L2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ml4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                byte b4 = b3;
                tl4 tl4Var2 = tl4Var;
                switch (b4) {
                    case 0:
                        tl4Var2.a.b();
                        break;
                    case 1:
                        ad8 ad8Var2 = tl4Var2.a;
                        if (ad8Var2.c == 1) {
                            yc3 yc3Var2 = ad8Var2.b;
                            q78 q78Var = new q78(ad8Var2, (byte) 17);
                            if (yc3Var2.b && (launchActivity = (LaunchActivity) yc3Var2.f) != null && !gm.F1(launchActivity)) {
                                q78Var.run();
                                break;
                            } else {
                                ((ArrayList) yc3Var2.d).add(q78Var);
                                if (((LaunchActivity) yc3Var2.f) != null && !yc3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) yc3Var2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        a.b.startActivity(intent);
                                        break;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        vc8 vc8Var2 = tl4Var2.b;
                        if (vc8Var2.i()) {
                            vc8Var2.c();
                        } else {
                            if (tl4Var2.H) {
                                vc8Var2.e(0L);
                                tl4Var2.H = false;
                            }
                            vc8Var2.j();
                        }
                        tl4Var2.k();
                        tl4Var2.a.b.d();
                        break;
                }
            }
        });
        tl4Var.m.addView(imageView2, qoe.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity2);
        imageView3.setImageResource(R.drawable.pip_video_expand);
        anb.s(imageView3, i, null, mode);
        final byte b4 = 1;
        fg0 f02 = cmb.f0(cmb.w0(null, i2, false), 1, -1);
        wmb M2 = anb.M(i2);
        imageView3.setBackground(f02);
        anb.j(imageView3, f02, null, M2, null);
        imageView3.setPadding(L2, L2, L2, L2);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: ml4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                byte b42 = b4;
                tl4 tl4Var2 = tl4Var;
                switch (b42) {
                    case 0:
                        tl4Var2.a.b();
                        break;
                    case 1:
                        ad8 ad8Var2 = tl4Var2.a;
                        if (ad8Var2.c == 1) {
                            yc3 yc3Var2 = ad8Var2.b;
                            q78 q78Var = new q78(ad8Var2, (byte) 17);
                            if (yc3Var2.b && (launchActivity = (LaunchActivity) yc3Var2.f) != null && !gm.F1(launchActivity)) {
                                q78Var.run();
                                break;
                            } else {
                                ((ArrayList) yc3Var2.d).add(q78Var);
                                if (((LaunchActivity) yc3Var2.f) != null && !yc3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) yc3Var2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        a.b.startActivity(intent);
                                        break;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        vc8 vc8Var2 = tl4Var2.b;
                        if (vc8Var2.i()) {
                            vc8Var2.c();
                        } else {
                            if (tl4Var2.H) {
                                vc8Var2.e(0L);
                                tl4Var2.H = false;
                            }
                            vc8Var2.j();
                        }
                        tl4Var2.k();
                        tl4Var2.a.b.d();
                        break;
                }
            }
        });
        tl4Var.m.addView(imageView3, qoe.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity2);
        tl4Var.n = imageView4;
        anb.s(imageView4, i, null, mode);
        anb.R(tl4Var.n, cmb.f0(cmb.w0(null, i2, false), 1, -1), null, anb.M(i2), null);
        final byte b5 = 2;
        tl4Var.n.setOnClickListener(new View.OnClickListener() { // from class: ml4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                byte b42 = b5;
                tl4 tl4Var2 = tl4Var;
                switch (b42) {
                    case 0:
                        tl4Var2.a.b();
                        break;
                    case 1:
                        ad8 ad8Var2 = tl4Var2.a;
                        if (ad8Var2.c == 1) {
                            yc3 yc3Var2 = ad8Var2.b;
                            q78 q78Var = new q78(ad8Var2, (byte) 17);
                            if (yc3Var2.b && (launchActivity = (LaunchActivity) yc3Var2.f) != null && !gm.F1(launchActivity)) {
                                q78Var.run();
                                break;
                            } else {
                                ((ArrayList) yc3Var2.d).add(q78Var);
                                if (((LaunchActivity) yc3Var2.f) != null && !yc3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) yc3Var2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        a.b.startActivity(intent);
                                        break;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        vc8 vc8Var2 = tl4Var2.b;
                        if (vc8Var2.i()) {
                            vc8Var2.c();
                        } else {
                            if (tl4Var2.H) {
                                vc8Var2.e(0L);
                                tl4Var2.H = false;
                            }
                            vc8Var2.j();
                        }
                        tl4Var2.k();
                        tl4Var2.a.b.d();
                        break;
                }
            }
        });
        tl4Var.n.setVisibility(vc8Var.A0() ? 0 : 8);
        tl4Var.m.addView(tl4Var.n, qoe.e(38, 38, 17));
        yc ycVar = new yc(tl4Var, activity2);
        tl4Var.o = ycVar;
        ycVar.setVisibility(vc8Var.A0() ? 0 : 8);
        tl4Var.m.addView(tl4Var.o, qoe.c(-1.0f, -1));
        tl4Var.i.addView(tl4Var.m, qoe.c(-1.0f, -1));
        View O = vc8Var.O();
        tl4Var.k = O;
        if (O != null) {
            gm.B2(O);
            tl4Var.i.addView(tl4Var.k, 0, qoe.c(-1.0f, -1));
        } else {
            bd8 bd8Var = new bd8(activity2);
            tl4Var.j = bd8Var;
            tl4Var.i.addView(bd8Var, 0, qoe.c(-1.0f, -1));
        }
        if (bitmap != null && tl4Var.j != null) {
            tl4Var.l.setImageBitmap(bitmap);
            tl4Var.l.setVisibility(0);
            tl4Var.j.setFirstFrameCallback(new nl4(tl4Var, (byte) 3));
        }
        tl4Var.a();
        if (z) {
            tl4Var.h.setAlpha(0.0f);
            tl4Var.h.setScaleX(0.1f);
            tl4Var.h.setScaleY(0.1f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(d53.f);
            b = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(tl4Var.h, (Property<s8, Float>) View.SCALE_Y, 1.0f));
            animatorSet.start();
        } else {
            b = 1;
        }
        tl4Var.k();
        bd8 bd8Var2 = tl4Var.j;
        this.c = b;
        yc3Var.d();
        return bd8Var2;
    }
}
