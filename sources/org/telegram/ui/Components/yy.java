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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class yy extends FrameLayout implements le.e {
    public yp E;
    public boolean F;
    public final /* synthetic */ lz G;
    public final le.c a;
    public final int b;
    public final kn0 c;
    public final jq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final xy r;
    public final ci.m6 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(lz lzVar, Context context, int i10) {
        super(context);
        this.G = lzVar;
        final int i11 = 0;
        this.a = new le.c(0, this, rr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = lzVar.z(org.telegram.ui.ActionBar.h6.Ke);
        boolean z11 = lzVar.i2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (lzVar.u0) {
            view2.setBackgroundColor(lzVar.z(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, lzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(18.0f), z11 ? lzVar.v(0.06f) : lzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
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
        kn0 kn0Var = new kn0();
        this.c = kn0Var;
        kn0Var.c(0, false, false);
        kn0Var.a(z11 ? lzVar.v(0.4f) : lzVar.z(org.telegram.ui.ActionBar.h6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(kn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vy
            public final /* synthetic */ yy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        yy yyVar = this.b;
                        xy xyVar = yyVar.r;
                        jq jqVar = yyVar.d;
                        if (yyVar.c.k == 1) {
                            jqVar.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.D1();
                                xyVar.F1(null);
                                xyVar.G1(true, true);
                            }
                            yyVar.f(false);
                            jqVar.clearAnimation();
                            jqVar.animate().translationX(0.0f).setInterpolator(rr.h).start();
                            yyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yy yyVar2 = this.b;
                        jq jqVar2 = yyVar2.d;
                        jqVar2.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.r;
                        if (xyVar2 != null) {
                            xyVar2.D1();
                            xyVar2.F1(null);
                            xyVar2.G1(true, true);
                        }
                        yyVar2.f(false);
                        jqVar2.clearAnimation();
                        jqVar2.animate().translationX(0.0f).setInterpolator(rr.h).start();
                        yyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        jq jqVar = new jq(this, context, i10, i12);
        this.d = jqVar;
        jqVar.setTextSize(1, 16.0f);
        jqVar.setHintTextColor(z11 ? lzVar.v(0.45f) : lzVar.z(org.telegram.ui.ActionBar.h6.Je));
        jqVar.setTextColor(z11 ? lzVar.v(0.8f) : lzVar.z(org.telegram.ui.ActionBar.h6.G6));
        jqVar.setBackgroundDrawable(null);
        jqVar.setPadding(0, 0, 0, 0);
        jqVar.setMaxLines(1);
        jqVar.setLines(1);
        jqVar.setSingleLine(true);
        jqVar.setImeOptions(268435459);
        jqVar.setHint(LocaleController.getString(R.string.Search));
        jqVar.setCursorColor(lzVar.z(org.telegram.ui.ActionBar.h6.Mh));
        jqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        jqVar.setCursorWidth(1.5f);
        jqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(jqVar, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        jqVar.addTextChangedListener(new ci.i2(this, 8));
        if (lzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(lzVar.z(org.telegram.ui.ActionBar.h6.He), lzVar.z(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.y5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, lzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vy
            public final /* synthetic */ yy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        yy yyVar = this.b;
                        xy xyVar = yyVar.r;
                        jq jqVar2 = yyVar.d;
                        if (yyVar.c.k == 1) {
                            jqVar2.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.D1();
                                xyVar.F1(null);
                                xyVar.G1(true, true);
                            }
                            yyVar.f(false);
                            jqVar2.clearAnimation();
                            jqVar2.animate().translationX(0.0f).setInterpolator(rr.h).start();
                            yyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yy yyVar2 = this.b;
                        jq jqVar22 = yyVar2.d;
                        jqVar22.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.r;
                        if (xyVar2 != null) {
                            xyVar2.D1();
                            xyVar2.F1(null);
                            xyVar2.G1(true, true);
                        }
                        yyVar2.f(false);
                        jqVar22.clearAnimation();
                        jqVar22.animate().translationX(0.0f).setInterpolator(rr.h).start();
                        yyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (i10 != 1 || (lzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            xy xyVar = new xy(this, context, i10 == 0 ? 3 : 0, lzVar.Z1, i10);
            this.r = xyVar;
            xyVar.w3 = z11;
            xyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) jqVar.getPaint().measureText(((Object) jqVar.getHint()) + "")));
            if (lzVar.u0) {
                xyVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(lzVar.z(org.telegram.ui.ActionBar.h6.He), lzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
            }
            final int i14 = 0;
            xyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.wy
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            yy yyVar = this.b;
                            yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            yyVar.d(num.intValue() > 0);
                            yyVar.g(false);
                            break;
                        default:
                            cx0 cx0Var = (cx0) obj;
                            yy yyVar2 = this.b;
                            lz lzVar2 = yyVar2.G;
                            xy xyVar2 = yyVar2.r;
                            if (cx0Var != null) {
                                if (xyVar2.getSelectedCategory() != cx0Var) {
                                    yyVar2.c(cx0Var.a, false);
                                    xyVar2.F1(cx0Var);
                                    break;
                                } else {
                                    yyVar2.c(null, false);
                                    xyVar2.F1(null);
                                    break;
                                }
                            } else {
                                yyVar2.d(false);
                                xyVar2.F1(null);
                                lzVar2.o0.d.setText("");
                                lzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            xyVar.setOnTouchListener(new m.c2(this, 2));
            final int i15 = 1;
            xyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.wy
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            yy yyVar = this.b;
                            yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            yyVar.d(num.intValue() > 0);
                            yyVar.g(false);
                            break;
                        default:
                            cx0 cx0Var = (cx0) obj;
                            yy yyVar2 = this.b;
                            lz lzVar2 = yyVar2.G;
                            xy xyVar2 = yyVar2.r;
                            if (cx0Var != null) {
                                if (xyVar2.getSelectedCategory() != cx0Var) {
                                    yyVar2.c(cx0Var.a, false);
                                    xyVar2.F1(cx0Var);
                                    break;
                                } else {
                                    yyVar2.c(null, false);
                                    xyVar2.F1(null);
                                    break;
                                }
                            } else {
                                yyVar2.d(false);
                                xyVar2.F1(null);
                                lzVar2.o0.d.setText("");
                                lzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(xyVar, w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(yy yyVar, boolean z10, boolean z11) {
        yyVar.a.a(z10, z11);
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
        lz lzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                lzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    lzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        gz gzVar = lzVar.z0;
        ez ezVar = gzVar.O;
        lz lzVar2 = gzVar.Q;
        xw xwVar = lzVar2.G0;
        tw twVar = lzVar2.D0;
        if (gzVar.L != 0) {
            ConnectionsManager.getInstance(lzVar2.c1).cancelRequest(gzVar.L, true);
            gzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            gzVar.N = null;
            gzVar.E.clear();
            gzVar.H.clear();
            gzVar.K = new ArrayList();
            s4.h0 adapter = twVar.getAdapter();
            cz czVar = lzVar2.y0;
            if (adapter != czVar) {
                twVar.setAdapter(czVar);
            }
            gzVar.d = 0L;
            lzVar2.a.a(false, true);
            gzVar.l();
            xwVar.e(false);
        } else {
            gzVar.N = str.toLowerCase();
            xwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(ezVar);
        AndroidUtilities.runOnUIThread(ezVar, 300L);
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
        this.y.setInterpolator(rr.h);
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
                yp ypVar = new yp(this, 15);
                this.E = ypVar;
                AndroidUtilities.runOnUIThread(ypVar, 340L);
                return;
            }
            return;
        }
        yp ypVar2 = this.E;
        if (ypVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ypVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        jq jqVar = this.d;
        xy xyVar = this.r;
        if (!z11 || ((jqVar.length() == 0 && (xyVar == null || xyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((jqVar.length() > 0 || (xyVar != null && xyVar.o3 > 0.5f && (xyVar.j3 || xyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
