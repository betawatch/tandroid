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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ry extends FrameLayout implements vd.b {
    public rp A;
    public boolean B;
    public final /* synthetic */ fz C;
    public final vd.a a;
    public final int b;
    public final vm0 c;
    public final cq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final qy r;
    public final bg.d1 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(fz fzVar, Context context, int i10) {
        super(context);
        this.C = fzVar;
        final int i11 = 0;
        this.a = new vd.a(0, this, jr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A = fzVar.A(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = fzVar.e2;
        view.setBackgroundColor(A);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (fzVar.q0) {
            view2.setBackgroundColor(fzVar.A(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, fzVar.X0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), z10 ? fzVar.v(0.06f) : fzVar.A(org.telegram.ui.ActionBar.g6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        eg.k1 k1Var = jf.q0.a;
        frameLayout.setOutlineProvider(new jf.p0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bg.d1 d1Var = new bg.d1(this, context, 13);
        this.s = d1Var;
        frameLayout.addView(d1Var, i7.f6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        vm0 vm0Var = new vm0();
        this.c = vm0Var;
        vm0Var.c(0, false, false);
        vm0Var.a(z10 ? fzVar.v(0.4f) : fzVar.A(org.telegram.ui.ActionBar.g6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(vm0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oy
            public final /* synthetic */ ry b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ry ryVar = this.b;
                        qy qyVar = ryVar.r;
                        cq cqVar = ryVar.d;
                        if (ryVar.c.k == 1) {
                            cqVar.setText("");
                            ryVar.c(null, false);
                            if (qyVar != null) {
                                qyVar.D1();
                                qyVar.F1(null);
                                qyVar.G1(true, true);
                            }
                            ryVar.f(false);
                            cqVar.clearAnimation();
                            cqVar.animate().translationX(0.0f).setInterpolator(jr.h).start();
                            ryVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ry ryVar2 = this.b;
                        cq cqVar2 = ryVar2.d;
                        cqVar2.setText("");
                        ryVar2.c(null, false);
                        qy qyVar2 = ryVar2.r;
                        if (qyVar2 != null) {
                            qyVar2.D1();
                            qyVar2.F1(null);
                            qyVar2.G1(true, true);
                        }
                        ryVar2.f(false);
                        cqVar2.clearAnimation();
                        cqVar2.animate().translationX(0.0f).setInterpolator(jr.h).start();
                        ryVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        cq cqVar = new cq(this, context, i10, i12);
        this.d = cqVar;
        cqVar.setTextSize(1, 16.0f);
        cqVar.setHintTextColor(z10 ? fzVar.v(0.45f) : fzVar.A(org.telegram.ui.ActionBar.g6.Je));
        cqVar.setTextColor(z10 ? fzVar.v(0.8f) : fzVar.A(org.telegram.ui.ActionBar.g6.G6));
        cqVar.setBackgroundDrawable(null);
        cqVar.setPadding(0, 0, 0, 0);
        cqVar.setMaxLines(1);
        cqVar.setLines(1);
        cqVar.setSingleLine(true);
        cqVar.setImeOptions(268435459);
        cqVar.setHint(LocaleController.getString(R.string.Search));
        cqVar.setCursorColor(fzVar.A(org.telegram.ui.ActionBar.g6.Mh));
        cqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        cqVar.setCursorWidth(1.5f);
        cqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        d1Var.addView(cqVar, i7.f6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        cqVar.addTextChangedListener(new bh.c(this, 9));
        if (fzVar.q0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(fzVar.A(org.telegram.ui.ActionBar.g6.He), fzVar.A(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            d1Var.addView(view3, i7.f6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new nh.b2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, fzVar.V1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oy
            public final /* synthetic */ ry b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        ry ryVar = this.b;
                        qy qyVar = ryVar.r;
                        cq cqVar2 = ryVar.d;
                        if (ryVar.c.k == 1) {
                            cqVar2.setText("");
                            ryVar.c(null, false);
                            if (qyVar != null) {
                                qyVar.D1();
                                qyVar.F1(null);
                                qyVar.G1(true, true);
                            }
                            ryVar.f(false);
                            cqVar2.clearAnimation();
                            cqVar2.animate().translationX(0.0f).setInterpolator(jr.h).start();
                            ryVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ry ryVar2 = this.b;
                        cq cqVar22 = ryVar2.d;
                        cqVar22.setText("");
                        ryVar2.c(null, false);
                        qy qyVar2 = ryVar2.r;
                        if (qyVar2 != null) {
                            qyVar2.D1();
                            qyVar2.F1(null);
                            qyVar2.G1(true, true);
                        }
                        ryVar2.f(false);
                        cqVar22.clearAnimation();
                        cqVar22.animate().translationX(0.0f).setInterpolator(jr.h).start();
                        ryVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        if (i10 != 1 || (fzVar.Y1 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            qy qyVar = new qy(this, context, i10 == 0 ? 3 : 0, fzVar.V1, i10);
            this.r = qyVar;
            qyVar.s3 = z10;
            qyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) cqVar.getPaint().measureText(((Object) cqVar.getHint()) + "")));
            if (fzVar.q0) {
                qyVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(fzVar.A(org.telegram.ui.ActionBar.g6.He), fzVar.A(org.telegram.ui.ActionBar.g6.Ie)));
            }
            final int i14 = 0;
            qyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.py
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            ry ryVar = this.b;
                            ryVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            ryVar.d(num.intValue() > 0);
                            ryVar.g(false);
                            break;
                        default:
                            kw0 kw0Var = (kw0) obj;
                            ry ryVar2 = this.b;
                            fz fzVar2 = ryVar2.C;
                            qy qyVar2 = ryVar2.r;
                            if (kw0Var != null) {
                                if (qyVar2.getSelectedCategory() != kw0Var) {
                                    ryVar2.c(kw0Var.a, false);
                                    qyVar2.F1(kw0Var);
                                    break;
                                } else {
                                    ryVar2.c(null, false);
                                    qyVar2.F1(null);
                                    break;
                                }
                            } else {
                                ryVar2.d(false);
                                qyVar2.F1(null);
                                fzVar2.k0.d.setText("");
                                fzVar2.e0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            qyVar.setOnTouchListener(new m.d2(this, 2));
            final int i15 = 1;
            qyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.py
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            ry ryVar = this.b;
                            ryVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            ryVar.d(num.intValue() > 0);
                            ryVar.g(false);
                            break;
                        default:
                            kw0 kw0Var = (kw0) obj;
                            ry ryVar2 = this.b;
                            fz fzVar2 = ryVar2.C;
                            qy qyVar2 = ryVar2.r;
                            if (kw0Var != null) {
                                if (qyVar2.getSelectedCategory() != kw0Var) {
                                    ryVar2.c(kw0Var.a, false);
                                    qyVar2.F1(kw0Var);
                                    break;
                                } else {
                                    ryVar2.c(null, false);
                                    qyVar2.F1(null);
                                    break;
                                }
                            } else {
                                ryVar2.d(false);
                                qyVar2.F1(null);
                                fzVar2.k0.d.setText("");
                                fzVar2.e0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(qyVar, i7.f6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(ry ryVar, boolean z10, boolean z11) {
        ryVar.a.a(z10, z11);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f9);
            view.setVisibility(f9 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        fz fzVar = this.C;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                fzVar.O.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    fzVar.f0.G(str, z10);
                    return;
                }
                return;
            }
        }
        az azVar = fzVar.v0;
        yy yyVar = azVar.K;
        fz fzVar2 = azVar.M;
        ow owVar = fzVar2.C0;
        lw lwVar = fzVar2.z0;
        if (azVar.H != 0) {
            ConnectionsManager.getInstance(fzVar2.Y0).cancelRequest(azVar.H, true);
            azVar.H = 0;
        }
        if (TextUtils.isEmpty(str)) {
            azVar.J = null;
            azVar.A.clear();
            azVar.D.clear();
            azVar.G = new ArrayList();
            f2.p0 adapter = lwVar.getAdapter();
            wy wyVar = fzVar2.u0;
            if (adapter != wyVar) {
                lwVar.setAdapter(wyVar);
            }
            azVar.d = 0L;
            fzVar2.a.a(false, true);
            azVar.l();
            owVar.e(false);
        } else {
            azVar.J = str.toLowerCase();
            owVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(yyVar);
        AndroidUtilities.runOnUIThread(yyVar, 300L);
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
        ofFloat.addUpdateListener(new j6(this, 22));
        this.y.setDuration(120L);
        this.y.setInterpolator(jr.h);
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
                rp rpVar = new rp(this, 15);
                this.A = rpVar;
                AndroidUtilities.runOnUIThread(rpVar, 340L);
                return;
            }
            return;
        }
        rp rpVar2 = this.A;
        if (rpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rpVar2);
            this.A = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.B;
        cq cqVar = this.d;
        qy qyVar = this.r;
        if (!z11 || ((cqVar.length() == 0 && (qyVar == null || qyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((cqVar.length() > 0 || (qyVar != null && qyVar.k3 > 0.5f && (qyVar.f3 || qyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.B = false;
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
