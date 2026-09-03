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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class yy extends FrameLayout implements xd.b {
    public xp B;
    public boolean C;
    public final /* synthetic */ mz D;
    public final xd.a a;
    public final int b;
    public final fn0 c;
    public final iq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final xy r;
    public final ag.l s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(mz mzVar, Context context, int i10) {
        super(context);
        this.D = mzVar;
        final int i11 = 0;
        this.a = new xd.a(0, this, pr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A = mzVar.A(org.telegram.ui.ActionBar.k6.Ke);
        boolean z4 = mzVar.f2;
        view.setBackgroundColor(A);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (mzVar.r0) {
            view2.setBackgroundColor(mzVar.A(org.telegram.ui.ActionBar.k6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, mzVar.Y0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), z4 ? mzVar.v(0.06f) : mzVar.A(org.telegram.ui.ActionBar.k6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        hg.j1 j1Var = lf.q0.a;
        frameLayout.setOutlineProvider(new lf.p0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ag.l lVar = new ag.l(this, context, 14);
        this.s = lVar;
        frameLayout.addView(lVar, k7.c6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fn0 fn0Var = new fn0();
        this.c = fn0Var;
        fn0Var.c(0, false, false);
        fn0Var.a(z4 ? mzVar.v(0.4f) : mzVar.A(org.telegram.ui.ActionBar.k6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(fn0Var);
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
                        iq iqVar = yyVar.d;
                        if (yyVar.c.k == 1) {
                            iqVar.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.C1();
                                xyVar.E1(null);
                                xyVar.F1(true, true);
                            }
                            yyVar.f(false);
                            iqVar.clearAnimation();
                            iqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            yyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yy yyVar2 = this.b;
                        iq iqVar2 = yyVar2.d;
                        iqVar2.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.r;
                        if (xyVar2 != null) {
                            xyVar2.C1();
                            xyVar2.E1(null);
                            xyVar2.F1(true, true);
                        }
                        yyVar2.f(false);
                        iqVar2.clearAnimation();
                        iqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        yyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        iq iqVar = new iq(this, context, i10, i12);
        this.d = iqVar;
        iqVar.setTextSize(1, 16.0f);
        iqVar.setHintTextColor(z4 ? mzVar.v(0.45f) : mzVar.A(org.telegram.ui.ActionBar.k6.Je));
        iqVar.setTextColor(z4 ? mzVar.v(0.8f) : mzVar.A(org.telegram.ui.ActionBar.k6.G6));
        iqVar.setBackgroundDrawable(null);
        iqVar.setPadding(0, 0, 0, 0);
        iqVar.setMaxLines(1);
        iqVar.setLines(1);
        iqVar.setSingleLine(true);
        iqVar.setImeOptions(268435459);
        iqVar.setHint(LocaleController.getString(R.string.Search));
        iqVar.setCursorColor(mzVar.A(org.telegram.ui.ActionBar.k6.Mh));
        iqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        iqVar.setCursorWidth(1.5f);
        iqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        lVar.addView(iqVar, k7.c6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar.addTextChangedListener(new eh.c(this, 8));
        if (mzVar.r0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v(mzVar.A(org.telegram.ui.ActionBar.k6.He), mzVar.A(org.telegram.ui.ActionBar.k6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            lVar.addView(view3, k7.c6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, mzVar.W1), 1, AndroidUtilities.dp(15.0f)));
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
                        iq iqVar2 = yyVar.d;
                        if (yyVar.c.k == 1) {
                            iqVar2.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.C1();
                                xyVar.E1(null);
                                xyVar.F1(true, true);
                            }
                            yyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            yyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yy yyVar2 = this.b;
                        iq iqVar22 = yyVar2.d;
                        iqVar22.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.r;
                        if (xyVar2 != null) {
                            xyVar2.C1();
                            xyVar2.E1(null);
                            xyVar2.F1(true, true);
                        }
                        yyVar2.f(false);
                        iqVar22.clearAnimation();
                        iqVar22.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        yyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        if (i10 != 1 || (mzVar.Z1 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            xy xyVar = new xy(this, context, i10 == 0 ? 3 : 0, mzVar.W1, i10);
            this.r = xyVar;
            xyVar.t3 = z4;
            xyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) iqVar.getPaint().measureText(((Object) iqVar.getHint()) + "")));
            if (mzVar.r0) {
                xyVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v(mzVar.A(org.telegram.ui.ActionBar.k6.He), mzVar.A(org.telegram.ui.ActionBar.k6.Ie)));
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
                            tw0 tw0Var = (tw0) obj;
                            yy yyVar2 = this.b;
                            mz mzVar2 = yyVar2.D;
                            xy xyVar2 = yyVar2.r;
                            if (tw0Var != null) {
                                if (xyVar2.getSelectedCategory() != tw0Var) {
                                    yyVar2.c(tw0Var.a, false);
                                    xyVar2.E1(tw0Var);
                                    break;
                                } else {
                                    yyVar2.c(null, false);
                                    xyVar2.E1(null);
                                    break;
                                }
                            } else {
                                yyVar2.d(false);
                                xyVar2.E1(null);
                                mzVar2.l0.d.setText("");
                                mzVar2.f0.h1(0, 0);
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
                            tw0 tw0Var = (tw0) obj;
                            yy yyVar2 = this.b;
                            mz mzVar2 = yyVar2.D;
                            xy xyVar2 = yyVar2.r;
                            if (tw0Var != null) {
                                if (xyVar2.getSelectedCategory() != tw0Var) {
                                    yyVar2.c(tw0Var.a, false);
                                    xyVar2.E1(tw0Var);
                                    break;
                                } else {
                                    yyVar2.c(null, false);
                                    xyVar2.E1(null);
                                    break;
                                }
                            } else {
                                yyVar2.d(false);
                                xyVar2.E1(null);
                                mzVar2.l0.d.setText("");
                                mzVar2.f0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(xyVar, k7.c6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(yy yyVar, boolean z4, boolean z10) {
        yyVar.a.a(z4, z10);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z4) {
        mz mzVar = this.D;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                mzVar.P.F(str, z4);
                return;
            } else {
                if (i10 == 2) {
                    mzVar.g0.G(str, z4);
                    return;
                }
                return;
            }
        }
        hz hzVar = mzVar.w0;
        fz fzVar = hzVar.L;
        mz mzVar2 = hzVar.N;
        uw uwVar = mzVar2.D0;
        rw rwVar = mzVar2.A0;
        if (hzVar.I != 0) {
            ConnectionsManager.getInstance(mzVar2.Z0).cancelRequest(hzVar.I, true);
            hzVar.I = 0;
        }
        if (TextUtils.isEmpty(str)) {
            hzVar.K = null;
            hzVar.B.clear();
            hzVar.E.clear();
            hzVar.H = new ArrayList();
            f2.p0 adapter = rwVar.getAdapter();
            dz dzVar = mzVar2.v0;
            if (adapter != dzVar) {
                rwVar.setAdapter(dzVar);
            }
            hzVar.d = 0L;
            mzVar2.a.a(false, true);
            hzVar.l();
            uwVar.e(false);
        } else {
            hzVar.K = str.toLowerCase();
            uwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(fzVar);
        AndroidUtilities.runOnUIThread(fzVar, 300L);
    }

    public final void d(boolean z4) {
        if (z4 == this.x) {
            return;
        }
        this.x = z4;
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z4 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 22));
        this.y.setDuration(120L);
        this.y.setInterpolator(pr.h);
        this.y.start();
    }

    public final void e(boolean z4) {
        this.C = z4;
        if (z4) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z4) {
        if (z4) {
            if (this.B == null) {
                xp xpVar = new xp(this, 15);
                this.B = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 340L);
                return;
            }
            return;
        }
        xp xpVar2 = this.B;
        if (xpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xpVar2);
            this.B = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z4) {
        boolean z10 = this.C;
        iq iqVar = this.d;
        xy xyVar = this.r;
        if (!z10 || ((iqVar.length() == 0 && (xyVar == null || xyVar.getSelectedCategory() == null)) || z4)) {
            this.c.b((iqVar.length() > 0 || (xyVar != null && xyVar.l3 > 0.5f && (xyVar.g3 || xyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.C = false;
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
