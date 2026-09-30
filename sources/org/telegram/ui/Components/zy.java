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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public abstract class zy extends FrameLayout implements le.e {
    public zp E;
    public boolean F;
    public final /* synthetic */ mz G;
    public final le.c a;
    public final int b;
    public final mn0 c;
    public final kq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final yy r;
    public final ci.m6 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(mz mzVar, Context context, int i10) {
        super(context);
        this.G = mzVar;
        final int i11 = 0;
        this.a = new le.c(0, this, sr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = mzVar.z(org.telegram.ui.ActionBar.h6.Ke);
        boolean z11 = mzVar.i2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (mzVar.u0) {
            view2.setBackgroundColor(mzVar.z(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, mzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(18.0f), z11 ? mzVar.v(0.06f) : mzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ai.k2 k2Var = yf.i0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.s = m6Var;
        frameLayout.addView(m6Var, w7.y5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        mn0 mn0Var = new mn0();
        this.c = mn0Var;
        mn0Var.c(0, false, false);
        mn0Var.a(z11 ? mzVar.v(0.4f) : mzVar.z(org.telegram.ui.ActionBar.h6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(mn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wy
            public final /* synthetic */ zy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        zy zyVar = this.b;
                        yy yyVar = zyVar.r;
                        kq kqVar = zyVar.d;
                        if (zyVar.c.k == 1) {
                            kqVar.setText("");
                            zyVar.c(null, false);
                            if (yyVar != null) {
                                yyVar.D1();
                                yyVar.F1(null);
                                yyVar.G1(true, true);
                            }
                            zyVar.f(false);
                            kqVar.clearAnimation();
                            kqVar.animate().translationX(0.0f).setInterpolator(sr.h).start();
                            zyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        zy zyVar2 = this.b;
                        kq kqVar2 = zyVar2.d;
                        kqVar2.setText("");
                        zyVar2.c(null, false);
                        yy yyVar2 = zyVar2.r;
                        if (yyVar2 != null) {
                            yyVar2.D1();
                            yyVar2.F1(null);
                            yyVar2.G1(true, true);
                        }
                        zyVar2.f(false);
                        kqVar2.clearAnimation();
                        kqVar2.animate().translationX(0.0f).setInterpolator(sr.h).start();
                        zyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        kq kqVar = new kq(this, context, i10, i12);
        this.d = kqVar;
        kqVar.setTextSize(1, 16.0f);
        kqVar.setHintTextColor(z11 ? mzVar.v(0.45f) : mzVar.z(org.telegram.ui.ActionBar.h6.Je));
        kqVar.setTextColor(z11 ? mzVar.v(0.8f) : mzVar.z(org.telegram.ui.ActionBar.h6.G6));
        kqVar.setBackgroundDrawable(null);
        kqVar.setPadding(0, 0, 0, 0);
        kqVar.setMaxLines(1);
        kqVar.setLines(1);
        kqVar.setSingleLine(true);
        kqVar.setImeOptions(268435459);
        kqVar.setHint(LocaleController.getString(R.string.Search));
        kqVar.setCursorColor(mzVar.z(org.telegram.ui.ActionBar.h6.Mh));
        kqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        kqVar.setCursorWidth(1.5f);
        kqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(kqVar, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        kqVar.addTextChangedListener(new ci.i2(this, 8));
        if (mzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(mzVar.z(org.telegram.ui.ActionBar.h6.He), mzVar.z(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.y5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, mzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wy
            public final /* synthetic */ zy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        zy zyVar = this.b;
                        yy yyVar = zyVar.r;
                        kq kqVar2 = zyVar.d;
                        if (zyVar.c.k == 1) {
                            kqVar2.setText("");
                            zyVar.c(null, false);
                            if (yyVar != null) {
                                yyVar.D1();
                                yyVar.F1(null);
                                yyVar.G1(true, true);
                            }
                            zyVar.f(false);
                            kqVar2.clearAnimation();
                            kqVar2.animate().translationX(0.0f).setInterpolator(sr.h).start();
                            zyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        zy zyVar2 = this.b;
                        kq kqVar22 = zyVar2.d;
                        kqVar22.setText("");
                        zyVar2.c(null, false);
                        yy yyVar2 = zyVar2.r;
                        if (yyVar2 != null) {
                            yyVar2.D1();
                            yyVar2.F1(null);
                            yyVar2.G1(true, true);
                        }
                        zyVar2.f(false);
                        kqVar22.clearAnimation();
                        kqVar22.animate().translationX(0.0f).setInterpolator(sr.h).start();
                        zyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (i10 != 1 || (mzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            yy yyVar = new yy(this, context, i10 == 0 ? 3 : 0, mzVar.Z1, i10);
            this.r = yyVar;
            yyVar.w3 = z11;
            yyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) kqVar.getPaint().measureText(((Object) kqVar.getHint()) + "")));
            if (mzVar.u0) {
                yyVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(mzVar.z(org.telegram.ui.ActionBar.h6.He), mzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
            }
            final int i14 = 0;
            yyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.xy
                public final /* synthetic */ zy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            zy zyVar = this.b;
                            zyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            zyVar.d(num.intValue() > 0);
                            zyVar.g(false);
                            break;
                        default:
                            ex0 ex0Var = (ex0) obj;
                            zy zyVar2 = this.b;
                            mz mzVar2 = zyVar2.G;
                            yy yyVar2 = zyVar2.r;
                            if (ex0Var != null) {
                                if (yyVar2.getSelectedCategory() != ex0Var) {
                                    zyVar2.c(ex0Var.a, false);
                                    yyVar2.F1(ex0Var);
                                    break;
                                } else {
                                    zyVar2.c(null, false);
                                    yyVar2.F1(null);
                                    break;
                                }
                            } else {
                                zyVar2.d(false);
                                yyVar2.F1(null);
                                mzVar2.o0.d.setText("");
                                mzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            yyVar.setOnTouchListener(new m.c2(this, 2));
            final int i15 = 1;
            yyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.xy
                public final /* synthetic */ zy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            zy zyVar = this.b;
                            zyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            zyVar.d(num.intValue() > 0);
                            zyVar.g(false);
                            break;
                        default:
                            ex0 ex0Var = (ex0) obj;
                            zy zyVar2 = this.b;
                            mz mzVar2 = zyVar2.G;
                            yy yyVar2 = zyVar2.r;
                            if (ex0Var != null) {
                                if (yyVar2.getSelectedCategory() != ex0Var) {
                                    zyVar2.c(ex0Var.a, false);
                                    yyVar2.F1(ex0Var);
                                    break;
                                } else {
                                    zyVar2.c(null, false);
                                    yyVar2.F1(null);
                                    break;
                                }
                            } else {
                                zyVar2.d(false);
                                yyVar2.F1(null);
                                mzVar2.o0.d.setText("");
                                mzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(yyVar, w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(zy zyVar, boolean z10, boolean z11) {
        zyVar.a.a(z10, z11);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        mz mzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                mzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    mzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        hz hzVar = mzVar.z0;
        fz fzVar = hzVar.O;
        mz mzVar2 = hzVar.Q;
        yw ywVar = mzVar2.G0;
        vw vwVar = mzVar2.D0;
        if (hzVar.L != 0) {
            ConnectionsManager.getInstance(mzVar2.c1).cancelRequest(hzVar.L, true);
            hzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            hzVar.N = null;
            hzVar.E.clear();
            hzVar.H.clear();
            hzVar.K = new ArrayList();
            s4.h0 adapter = vwVar.getAdapter();
            dz dzVar = mzVar2.y0;
            if (adapter != dzVar) {
                vwVar.setAdapter(dzVar);
            }
            hzVar.d = 0L;
            mzVar2.a.a(false, true);
            hzVar.l();
            ywVar.e(false);
        } else {
            hzVar.N = str.toLowerCase();
            ywVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(fzVar);
        AndroidUtilities.runOnUIThread(fzVar, 300L);
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
        ofFloat.addUpdateListener(new k6(this, 22));
        this.y.setDuration(120L);
        this.y.setInterpolator(sr.h);
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
                zp zpVar = new zp(this, 15);
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
        kq kqVar = this.d;
        yy yyVar = this.r;
        if (!z11 || ((kqVar.length() == 0 && (yyVar == null || yyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((kqVar.length() > 0 || (yyVar != null && yyVar.o3 > 0.5f && (yyVar.j3 || yyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
