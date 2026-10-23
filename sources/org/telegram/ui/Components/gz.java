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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class gz extends FrameLayout implements ne.d {
    public hq E;
    public boolean F;
    public final /* synthetic */ tz G;
    public final ne.b a;
    public final int b;
    public final wn0 c;
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
        int i11;
        this.G = tzVar;
        final int i12 = 0;
        this.a = new ne.b(0, this, bs.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A = tzVar.A(org.telegram.ui.ActionBar.h6.Ke);
        boolean z10 = tzVar.i2;
        view.setBackgroundColor(A);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (tzVar.u0) {
            view2.setBackgroundColor(tzVar.A(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), z10 ? tzVar.w(0.06f) : tzVar.A(org.telegram.ui.ActionBar.h6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ci.o1 o1Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp));
        int i13 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.v vVar = new ah.v(this, context, 13);
        this.s = vVar;
        frameLayout.addView(vVar, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        wn0 wn0Var = new wn0();
        this.c = wn0Var;
        wn0Var.c(0, false, false);
        wn0Var.a(z10 ? tzVar.w(0.4f) : tzVar.A(org.telegram.ui.ActionBar.h6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(wn0Var);
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
                        sq sqVar = gzVar.d;
                        if (gzVar.c.k == 1) {
                            sqVar.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.E1();
                                fzVar.G1(null);
                                fzVar.H1(true, true);
                            }
                            gzVar.f(false);
                            sqVar.clearAnimation();
                            sqVar.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        gz gzVar2 = this.b;
                        sq sqVar2 = gzVar2.d;
                        sqVar2.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.r;
                        if (fzVar2 != null) {
                            fzVar2.E1();
                            fzVar2.G1(null);
                            fzVar2.H1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar2.clearAnimation();
                        sqVar2.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        sq sqVar = new sq(this, context, i10, i13);
        this.d = sqVar;
        sqVar.setTextSize(1, 16.0f);
        sqVar.setHintTextColor(z10 ? tzVar.w(0.45f) : tzVar.A(org.telegram.ui.ActionBar.h6.Je));
        sqVar.setTextColor(z10 ? tzVar.w(0.8f) : tzVar.A(org.telegram.ui.ActionBar.h6.G6));
        sqVar.setBackgroundDrawable(null);
        sqVar.setPadding(0, 0, 0, 0);
        sqVar.setMaxLines(1);
        sqVar.setLines(1);
        sqVar.setSingleLine(true);
        sqVar.setImeOptions(268435459);
        sqVar.setHint(LocaleController.getString(R.string.Search));
        sqVar.setCursorColor(tzVar.A(org.telegram.ui.ActionBar.h6.Mh));
        sqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        sqVar.setCursorWidth(1.5f);
        sqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(sqVar, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        sqVar.addTextChangedListener(new ai.u(this, 9));
        if (tzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(tzVar.A(org.telegram.ui.ActionBar.h6.He), tzVar.A(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(this));
        final int i14 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, tzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dz
            public final /* synthetic */ gz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i14) {
                    case 0:
                        gz gzVar = this.b;
                        fz fzVar = gzVar.r;
                        sq sqVar2 = gzVar.d;
                        if (gzVar.c.k == 1) {
                            sqVar2.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.E1();
                                fzVar.G1(null);
                                fzVar.H1(true, true);
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
                        sq sqVar22 = gzVar2.d;
                        sqVar22.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.r;
                        if (fzVar2 != null) {
                            fzVar2.E1();
                            fzVar2.G1(null);
                            fzVar2.H1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar22.clearAnimation();
                        sqVar22.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 != 1 || (tzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            fz fzVar = new fz(this, context, i10 == 0 ? i11 : 0, tzVar.Z1, i10);
            this.r = fzVar;
            fzVar.u3 = z10;
            fzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) sqVar.getPaint().measureText(((Object) sqVar.getHint()) + "")));
            if (tzVar.u0) {
                fzVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(tzVar.A(org.telegram.ui.ActionBar.h6.He), tzVar.A(org.telegram.ui.ActionBar.h6.Ie)));
            }
            final int i15 = 0;
            fzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.ez
                public final /* synthetic */ gz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            gz gzVar = this.b;
                            gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gzVar.d(num.intValue() > 0);
                            gzVar.g(false);
                            break;
                        default:
                            nx0 nx0Var = (nx0) obj;
                            gz gzVar2 = this.b;
                            tz tzVar2 = gzVar2.G;
                            fz fzVar2 = gzVar2.r;
                            if (nx0Var != null) {
                                if (fzVar2.getSelectedCategory() != nx0Var) {
                                    gzVar2.c(nx0Var.a, false);
                                    fzVar2.G1(nx0Var);
                                    break;
                                } else {
                                    gzVar2.c(null, false);
                                    fzVar2.G1(null);
                                    break;
                                }
                            } else {
                                gzVar2.d(false);
                                fzVar2.G1(null);
                                tzVar2.o0.d.setText("");
                                tzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            fzVar.setOnTouchListener(new m.d2(this, 2));
            final int i16 = 1;
            fzVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.ez
                public final /* synthetic */ gz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            gz gzVar = this.b;
                            gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gzVar.d(num.intValue() > 0);
                            gzVar.g(false);
                            break;
                        default:
                            nx0 nx0Var = (nx0) obj;
                            gz gzVar2 = this.b;
                            tz tzVar2 = gzVar2.G;
                            fz fzVar2 = gzVar2.r;
                            if (nx0Var != null) {
                                if (fzVar2.getSelectedCategory() != nx0Var) {
                                    gzVar2.c(nx0Var.a, false);
                                    fzVar2.G1(nx0Var);
                                    break;
                                } else {
                                    gzVar2.c(null, false);
                                    fzVar2.G1(null);
                                    break;
                                }
                            } else {
                                gzVar2.d(false);
                                fzVar2.G1(null);
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
                hq hqVar = new hq(this, 15);
                this.E = hqVar;
                AndroidUtilities.runOnUIThread(hqVar, 340L);
                return;
            }
            return;
        }
        hq hqVar2 = this.E;
        if (hqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(hqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        sq sqVar = this.d;
        fz fzVar = this.r;
        if (!z11 || ((sqVar.length() == 0 && (fzVar == null || fzVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((sqVar.length() > 0 || (fzVar != null && fzVar.m3 > 0.5f && (fzVar.h3 || fzVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
