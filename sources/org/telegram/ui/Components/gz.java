package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class gz extends FrameLayout implements org.telegram.ui.ActionBar.b6, ne.d {
    public zp E;
    public boolean F;
    public final /* synthetic */ tz G;
    public final ne.b a;
    public final int b;
    public final zn0 c;
    public final sq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final fz r;
    public final ah.v s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(tz tzVar, Context context, int i10) {
        super(context);
        sq sqVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        this.G = tzVar;
        this.a = new ne.b(0, this, bs.g, 200L, false);
        final int i12 = 0;
        this.x = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.k6.Ke;
        org.telegram.ui.ActionBar.g6 g6Var = tzVar.Z1;
        boolean z10 = tzVar.i2;
        org.telegram.ui.ActionBar.r6.i(i13, view, g6Var);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (tzVar.u0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.He, view2, g6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), z10 ? tzVar.w(0.06f) : tzVar.A(org.telegram.ui.ActionBar.k6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ci.n1 n1Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp));
        int i14 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.v vVar = new ah.v(this, context, 13);
        this.s = vVar;
        frameLayout.addView(vVar, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        zn0 zn0Var = new zn0();
        this.c = zn0Var;
        zn0Var.c(0, false, false);
        zn0Var.a(z10 ? tzVar.w(0.4f) : tzVar.A(org.telegram.ui.ActionBar.k6.Je));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(zn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dz
            public final /* synthetic */ gz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        gz gzVar = this.b;
                        fz fzVar = gzVar.r;
                        sq sqVar2 = gzVar.d;
                        if (gzVar.c.k == 1) {
                            sqVar2.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.J1();
                                fzVar.L1(null);
                                fzVar.M1(true, true);
                            }
                            gzVar.f(false);
                            sqVar2.clearAnimation();
                            sqVar2.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        gz gzVar2 = this.b;
                        sq sqVar3 = gzVar2.d;
                        sqVar3.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.r;
                        if (fzVar2 != null) {
                            fzVar2.J1();
                            fzVar2.L1(null);
                            fzVar2.M1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar3.clearAnimation();
                        sqVar3.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        sq sqVar2 = new sq(this, context, i10, i14);
        this.d = sqVar2;
        sqVar2.setTextSize(1, 16.0f);
        sqVar2.setHintTextColor(z10 ? tzVar.w(0.45f) : tzVar.A(org.telegram.ui.ActionBar.k6.Je));
        sqVar2.setTextColor(z10 ? tzVar.w(0.8f) : tzVar.A(org.telegram.ui.ActionBar.k6.G6));
        sqVar2.setBackgroundDrawable(null);
        sqVar2.setPadding(0, 0, 0, 0);
        sqVar2.setMaxLines(1);
        sqVar2.setLines(1);
        sqVar2.setSingleLine(true);
        sqVar2.setImeOptions(268435459);
        sqVar2.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.r6.m(sqVar2, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        sqVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        sqVar2.setCursorWidth(1.5f);
        sqVar2.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(sqVar2, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        sqVar2.addTextChangedListener(new ai.u(this, 9));
        if (tzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie);
            sqVar = sqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, mutate, q6.a, q6.b, 4, 0.0f, g6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            sqVar = sqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(this));
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        final int i16 = 1;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i15, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dz
            public final /* synthetic */ gz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i16) {
                    case 0:
                        gz gzVar = this.b;
                        fz fzVar = gzVar.r;
                        sq sqVar22 = gzVar.d;
                        if (gzVar.c.k == 1) {
                            sqVar22.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.J1();
                                fzVar.L1(null);
                                fzVar.M1(true, true);
                            }
                            gzVar.f(false);
                            sqVar22.clearAnimation();
                            sqVar22.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        gz gzVar2 = this.b;
                        sq sqVar3 = gzVar2.d;
                        sqVar3.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.r;
                        if (fzVar2 != null) {
                            fzVar2.J1();
                            fzVar2.L1(null);
                            fzVar2.M1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar3.clearAnimation();
                        sqVar3.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 != 1 || (tzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            fz fzVar = new fz(this, context, i10 == 0 ? i11 : 0, tzVar.Z1, i10);
            this.r = fzVar;
            fzVar.x3 = z10;
            fzVar.setDontOccupyWidth(AndroidUtilities.dp(f7) + ((int) sqVar.getPaint().measureText(((Object) sqVar.getHint()) + "")));
            if (tzVar.u0) {
                org.telegram.ui.ActionBar.r6.j(fzVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie), g6Var);
            }
            final int i17 = 0;
            fzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.ez
                public final /* synthetic */ gz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            gz gzVar = this.b;
                            gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gzVar.d(num.intValue() > 0);
                            gzVar.g(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            gz gzVar2 = this.b;
                            tz tzVar2 = gzVar2.G;
                            fz fzVar2 = gzVar2.r;
                            if (qx0Var != null) {
                                if (fzVar2.getSelectedCategory() != qx0Var) {
                                    gzVar2.c(qx0Var.a, false);
                                    fzVar2.L1(qx0Var);
                                    break;
                                } else {
                                    gzVar2.c(null, false);
                                    fzVar2.L1(null);
                                    break;
                                }
                            } else {
                                gzVar2.d(false);
                                fzVar2.L1(null);
                                tzVar2.o0.d.setText("");
                                tzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            fzVar.setOnTouchListener(new m.d2(this, 2));
            final int i18 = 1;
            fzVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.ez
                public final /* synthetic */ gz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i18) {
                        case 0:
                            Integer num = (Integer) obj;
                            gz gzVar = this.b;
                            gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gzVar.d(num.intValue() > 0);
                            gzVar.g(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            gz gzVar2 = this.b;
                            tz tzVar2 = gzVar2.G;
                            fz fzVar2 = gzVar2.r;
                            if (qx0Var != null) {
                                if (fzVar2.getSelectedCategory() != qx0Var) {
                                    gzVar2.c(qx0Var.a, false);
                                    fzVar2.L1(qx0Var);
                                    break;
                                } else {
                                    gzVar2.c(null, false);
                                    fzVar2.L1(null);
                                    break;
                                }
                            } else {
                                gzVar2.d(false);
                                fzVar2.L1(null);
                                tzVar2.o0.d.setText("");
                                tzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(fzVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(gz gzVar, boolean z10, boolean z11) {
        gzVar.a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        tz tzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                tzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    tzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        oz ozVar = tzVar.z0;
        mz mzVar = ozVar.O;
        tz tzVar2 = ozVar.Q;
        dx dxVar = tzVar2.G0;
        ax axVar = tzVar2.D0;
        if (ozVar.L != 0) {
            ConnectionsManager.getInstance(tzVar2.c1).cancelRequest(ozVar.L, true);
            ozVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            ozVar.N = null;
            ozVar.E.clear();
            ozVar.H.clear();
            ozVar.K = new ArrayList();
            s4.g0 adapter = axVar.getAdapter();
            kz kzVar = tzVar2.y0;
            if (adapter != kzVar) {
                axVar.setAdapter(kzVar);
            }
            ozVar.d = 0L;
            tzVar2.a.a(false, true);
            ozVar.l();
            dxVar.e(false);
        } else {
            ozVar.N = str.toLowerCase();
            dxVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(mzVar);
        AndroidUtilities.runOnUIThread(mzVar, 300L);
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
        ofFloat.addUpdateListener(new l6(this, 23));
        this.y.setDuration(120L);
        this.y.setInterpolator(bs.h);
        this.y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                zp zpVar = new zp(this, 16);
                this.E = zpVar;
                AndroidUtilities.runOnUIThread(zpVar, 340L);
                return;
            }
            return;
        }
        zp zpVar2 = this.E;
        if (zpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(zpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        sq sqVar = this.d;
        fz fzVar = this.r;
        if (!z11 || ((sqVar.length() == 0 && (fzVar == null || fzVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((sqVar.length() > 0 || (fzVar != null && fzVar.p3 > 0.5f && (fzVar.k3 || fzVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.k6.Mh));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
