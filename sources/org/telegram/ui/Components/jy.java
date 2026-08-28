package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class jy extends FrameLayout implements td.b {
    public np A;
    public boolean B;
    public final /* synthetic */ wy C;
    public final td.a a;
    public final int b;
    public final im0 c;
    public final yp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final iy r;
    public final fh.v s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(wy wyVar, Context context, int i9) {
        super(context);
        this.C = wyVar;
        final int i10 = 0;
        this.a = new td.a(0, this, gr.g, 200L, false);
        this.x = false;
        this.b = i9;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = wyVar.z(org.telegram.ui.ActionBar.f6.Ke);
        boolean z11 = wyVar.e2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (wyVar.q0) {
            view2.setBackgroundColor(wyVar.z(org.telegram.ui.ActionBar.f6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, wyVar.X0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), z11 ? wyVar.v(0.06f) : wyVar.z(org.telegram.ui.ActionBar.f6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        bg.q1 q1Var = ff.r0.a;
        frameLayout.setOutlineProvider(new ff.q0(0, dp));
        int i11 = 2;
        if (i9 == 2) {
            addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        fh.v vVar = new fh.v(this, context, 12);
        this.s = vVar;
        frameLayout.addView(vVar, g7.e6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        im0 im0Var = new im0();
        this.c = im0Var;
        im0Var.c(0, false, false);
        im0Var.a(z11 ? wyVar.v(0.4f) : wyVar.z(org.telegram.ui.ActionBar.f6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gy
            public final /* synthetic */ jy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        jy jyVar = this.b;
                        iy iyVar = jyVar.r;
                        yp ypVar = jyVar.d;
                        if (jyVar.c.k == 1) {
                            ypVar.setText("");
                            jyVar.c(null, false);
                            if (iyVar != null) {
                                iyVar.D1();
                                iyVar.F1(null);
                                iyVar.G1(true, true);
                            }
                            jyVar.f(false);
                            ypVar.clearAnimation();
                            ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            jyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        jy jyVar2 = this.b;
                        yp ypVar2 = jyVar2.d;
                        ypVar2.setText("");
                        jyVar2.c(null, false);
                        iy iyVar2 = jyVar2.r;
                        if (iyVar2 != null) {
                            iyVar2.D1();
                            iyVar2.F1(null);
                            iyVar2.G1(true, true);
                        }
                        jyVar2.f(false);
                        ypVar2.clearAnimation();
                        ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        jyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        yp ypVar = new yp(this, context, i9, i11);
        this.d = ypVar;
        ypVar.setTextSize(1, 16.0f);
        ypVar.setHintTextColor(z11 ? wyVar.v(0.45f) : wyVar.z(org.telegram.ui.ActionBar.f6.Je));
        ypVar.setTextColor(z11 ? wyVar.v(0.8f) : wyVar.z(org.telegram.ui.ActionBar.f6.G6));
        ypVar.setBackgroundDrawable(null);
        ypVar.setPadding(0, 0, 0, 0);
        ypVar.setMaxLines(1);
        ypVar.setLines(1);
        ypVar.setSingleLine(true);
        ypVar.setImeOptions(268435459);
        ypVar.setHint(LocaleController.getString(R.string.Search));
        ypVar.setCursorColor(wyVar.z(org.telegram.ui.ActionBar.f6.Mh));
        ypVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ypVar.setCursorWidth(1.5f);
        ypVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(ypVar, g7.e6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        ypVar.addTextChangedListener(new bh.f(this, 9));
        if (wyVar.q0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v(wyVar.z(org.telegram.ui.ActionBar.f6.He), wyVar.z(org.telegram.ui.ActionBar.f6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            vVar.addView(view3, g7.e6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new kh.e2(this));
        final int i12 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, wyVar.V1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gy
            public final /* synthetic */ jy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i12) {
                    case 0:
                        jy jyVar = this.b;
                        iy iyVar = jyVar.r;
                        yp ypVar2 = jyVar.d;
                        if (jyVar.c.k == 1) {
                            ypVar2.setText("");
                            jyVar.c(null, false);
                            if (iyVar != null) {
                                iyVar.D1();
                                iyVar.F1(null);
                                iyVar.G1(true, true);
                            }
                            jyVar.f(false);
                            ypVar2.clearAnimation();
                            ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            jyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        jy jyVar2 = this.b;
                        yp ypVar22 = jyVar2.d;
                        ypVar22.setText("");
                        jyVar2.c(null, false);
                        iy iyVar2 = jyVar2.r;
                        if (iyVar2 != null) {
                            iyVar2.D1();
                            iyVar2.F1(null);
                            iyVar2.G1(true, true);
                        }
                        jyVar2.f(false);
                        ypVar22.clearAnimation();
                        ypVar22.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        jyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        if (i9 != 1 || (wyVar.Y1 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            iy iyVar = new iy(this, context, i9 == 0 ? 3 : 0, wyVar.V1, i9);
            this.r = iyVar;
            iyVar.s3 = z11;
            iyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) ypVar.getPaint().measureText(((Object) ypVar.getHint()) + "")));
            if (wyVar.q0) {
                iyVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v(wyVar.z(org.telegram.ui.ActionBar.f6.He), wyVar.z(org.telegram.ui.ActionBar.f6.Ie)));
            }
            final int i13 = 0;
            iyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.hy
                public final /* synthetic */ jy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i13) {
                        case 0:
                            Integer num = (Integer) obj;
                            jy jyVar = this.b;
                            jyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            jyVar.d(num.intValue() > 0);
                            jyVar.g(false);
                            break;
                        default:
                            aw0 aw0Var = (aw0) obj;
                            jy jyVar2 = this.b;
                            wy wyVar2 = jyVar2.C;
                            iy iyVar2 = jyVar2.r;
                            if (aw0Var != null) {
                                if (iyVar2.getSelectedCategory() != aw0Var) {
                                    jyVar2.c(aw0Var.a, false);
                                    iyVar2.F1(aw0Var);
                                    break;
                                } else {
                                    jyVar2.c(null, false);
                                    iyVar2.F1(null);
                                    break;
                                }
                            } else {
                                jyVar2.d(false);
                                iyVar2.F1(null);
                                wyVar2.k0.d.setText("");
                                wyVar2.e0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            iyVar.setOnTouchListener(new m.d2(this, 2));
            final int i14 = 1;
            iyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.hy
                public final /* synthetic */ jy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            jy jyVar = this.b;
                            jyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            jyVar.d(num.intValue() > 0);
                            jyVar.g(false);
                            break;
                        default:
                            aw0 aw0Var = (aw0) obj;
                            jy jyVar2 = this.b;
                            wy wyVar2 = jyVar2.C;
                            iy iyVar2 = jyVar2.r;
                            if (aw0Var != null) {
                                if (iyVar2.getSelectedCategory() != aw0Var) {
                                    jyVar2.c(aw0Var.a, false);
                                    iyVar2.F1(aw0Var);
                                    break;
                                } else {
                                    jyVar2.c(null, false);
                                    iyVar2.F1(null);
                                    break;
                                }
                            } else {
                                jyVar2.d(false);
                                iyVar2.F1(null);
                                wyVar2.k0.d.setText("");
                                wyVar2.e0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(iyVar, g7.e6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(jy jyVar, boolean z10, boolean z11) {
        jyVar.a.a(z10, z11);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        wy wyVar = this.C;
        int i9 = this.b;
        if (i9 != 0) {
            if (i9 == 1) {
                wyVar.O.F(str, z10);
                return;
            } else {
                if (i9 == 2) {
                    wyVar.f0.G(str, z10);
                    return;
                }
                return;
            }
        }
        ry ryVar = wyVar.v0;
        py pyVar = ryVar.K;
        wy wyVar2 = ryVar.M;
        iw iwVar = wyVar2.C0;
        fw fwVar = wyVar2.z0;
        if (ryVar.H != 0) {
            ConnectionsManager.getInstance(wyVar2.Y0).cancelRequest(ryVar.H, true);
            ryVar.H = 0;
        }
        if (TextUtils.isEmpty(str)) {
            ryVar.J = null;
            ryVar.A.clear();
            ryVar.D.clear();
            ryVar.G = new ArrayList();
            f2.r0 adapter = fwVar.getAdapter();
            ny nyVar = wyVar2.u0;
            if (adapter != nyVar) {
                fwVar.setAdapter(nyVar);
            }
            ryVar.d = 0L;
            wyVar2.a.a(false, true);
            ryVar.l();
            iwVar.e(false);
        } else {
            ryVar.J = str.toLowerCase();
            iwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(pyVar);
        AndroidUtilities.runOnUIThread(pyVar, 300L);
    }

    public final void d(boolean z10) {
        if (z10 == this.x) {
            return;
        }
        this.x = z10;
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 22));
        this.y.setDuration(120L);
        this.y.setInterpolator(gr.h);
        this.y.start();
    }

    public final void e(boolean z10) {
        this.B = z10;
        if (z10) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.A == null) {
                np npVar = new np(this, 15);
                this.A = npVar;
                AndroidUtilities.runOnUIThread(npVar, 340L);
                return;
            }
            return;
        }
        np npVar2 = this.A;
        if (npVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(npVar2);
            this.A = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.B;
        yp ypVar = this.d;
        iy iyVar = this.r;
        if (!z11 || ((ypVar.length() == 0 && (iyVar == null || iyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((ypVar.length() > 0 || (iyVar != null && iyVar.k3 > 0.5f && (iyVar.f3 || iyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.B = false;
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
