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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class xy extends FrameLayout implements le.d {
    public xp E;
    public boolean F;
    public final /* synthetic */ kz G;
    public final le.b a;
    public final int b;
    public final ym0 c;
    public final iq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final wy r;
    public final ci.n6 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(kz kzVar, Context context, int i10) {
        super(context);
        this.G = kzVar;
        final int i11 = 0;
        this.a = new le.b(0, this, qr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = kzVar.z(org.telegram.ui.ActionBar.j6.Ke);
        boolean z11 = kzVar.i2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (kzVar.u0) {
            view2.setBackgroundColor(kzVar.z(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), z11 ? kzVar.v(0.06f) : kzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ai.k2 k2Var = yf.j0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.n6 n6Var = new ci.n6(this, context, 10);
        this.s = n6Var;
        frameLayout.addView(n6Var, w7.x5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ym0 ym0Var = new ym0();
        this.c = ym0Var;
        ym0Var.c(0, false, false);
        ym0Var.a(z11 ? kzVar.v(0.4f) : kzVar.z(org.telegram.ui.ActionBar.j6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(ym0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uy
            public final /* synthetic */ xy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        xy xyVar = this.b;
                        wy wyVar = xyVar.r;
                        iq iqVar = xyVar.d;
                        if (xyVar.c.k == 1) {
                            iqVar.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.E1();
                                wyVar.G1(null);
                                wyVar.H1(true, true);
                            }
                            xyVar.f(false);
                            iqVar.clearAnimation();
                            iqVar.animate().translationX(0.0f).setInterpolator(qr.h).start();
                            xyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        xy xyVar2 = this.b;
                        iq iqVar2 = xyVar2.d;
                        iqVar2.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.r;
                        if (wyVar2 != null) {
                            wyVar2.E1();
                            wyVar2.G1(null);
                            wyVar2.H1(true, true);
                        }
                        xyVar2.f(false);
                        iqVar2.clearAnimation();
                        iqVar2.animate().translationX(0.0f).setInterpolator(qr.h).start();
                        xyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        iq iqVar = new iq(this, context, i10, i12);
        this.d = iqVar;
        iqVar.setTextSize(1, 16.0f);
        iqVar.setHintTextColor(z11 ? kzVar.v(0.45f) : kzVar.z(org.telegram.ui.ActionBar.j6.Je));
        iqVar.setTextColor(z11 ? kzVar.v(0.8f) : kzVar.z(org.telegram.ui.ActionBar.j6.G6));
        iqVar.setBackgroundDrawable(null);
        iqVar.setPadding(0, 0, 0, 0);
        iqVar.setMaxLines(1);
        iqVar.setLines(1);
        iqVar.setSingleLine(true);
        iqVar.setImeOptions(268435459);
        iqVar.setHint(LocaleController.getString(R.string.Search));
        iqVar.setCursorColor(kzVar.z(org.telegram.ui.ActionBar.j6.Mh));
        iqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        iqVar.setCursorWidth(1.5f);
        iqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        n6Var.addView(iqVar, w7.x5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar.addTextChangedListener(new ci.i2(this, 8));
        if (kzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.z(org.telegram.ui.ActionBar.j6.He), kzVar.z(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            n6Var.addView(view3, w7.x5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, kzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uy
            public final /* synthetic */ xy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        xy xyVar = this.b;
                        wy wyVar = xyVar.r;
                        iq iqVar2 = xyVar.d;
                        if (xyVar.c.k == 1) {
                            iqVar2.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.E1();
                                wyVar.G1(null);
                                wyVar.H1(true, true);
                            }
                            xyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(qr.h).start();
                            xyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        xy xyVar2 = this.b;
                        iq iqVar22 = xyVar2.d;
                        iqVar22.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.r;
                        if (wyVar2 != null) {
                            wyVar2.E1();
                            wyVar2.G1(null);
                            wyVar2.H1(true, true);
                        }
                        xyVar2.f(false);
                        iqVar22.clearAnimation();
                        iqVar22.animate().translationX(0.0f).setInterpolator(qr.h).start();
                        xyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 != 1 || (kzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            wy wyVar = new wy(this, context, i10 == 0 ? 3 : 0, kzVar.Z1, i10);
            this.r = wyVar;
            wyVar.w3 = z11;
            wyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) iqVar.getPaint().measureText(((Object) iqVar.getHint()) + "")));
            if (kzVar.u0) {
                wyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.z(org.telegram.ui.ActionBar.j6.He), kzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
            }
            final int i14 = 0;
            wyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vy
                public final /* synthetic */ xy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            xy xyVar = this.b;
                            xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            xyVar.d(num.intValue() > 0);
                            xyVar.g(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            xy xyVar2 = this.b;
                            kz kzVar2 = xyVar2.G;
                            wy wyVar2 = xyVar2.r;
                            if (tw0Var != null) {
                                if (wyVar2.getSelectedCategory() != tw0Var) {
                                    xyVar2.c(tw0Var.a, false);
                                    wyVar2.G1(tw0Var);
                                    break;
                                } else {
                                    xyVar2.c(null, false);
                                    wyVar2.G1(null);
                                    break;
                                }
                            } else {
                                xyVar2.d(false);
                                wyVar2.G1(null);
                                kzVar2.o0.d.setText("");
                                kzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            wyVar.setOnTouchListener(new m.c2(this, 2));
            final int i15 = 1;
            wyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vy
                public final /* synthetic */ xy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            xy xyVar = this.b;
                            xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            xyVar.d(num.intValue() > 0);
                            xyVar.g(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            xy xyVar2 = this.b;
                            kz kzVar2 = xyVar2.G;
                            wy wyVar2 = xyVar2.r;
                            if (tw0Var != null) {
                                if (wyVar2.getSelectedCategory() != tw0Var) {
                                    xyVar2.c(tw0Var.a, false);
                                    wyVar2.G1(tw0Var);
                                    break;
                                } else {
                                    xyVar2.c(null, false);
                                    wyVar2.G1(null);
                                    break;
                                }
                            } else {
                                xyVar2.d(false);
                                wyVar2.G1(null);
                                kzVar2.o0.d.setText("");
                                kzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(wyVar, w7.x5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(xy xyVar, boolean z10, boolean z11) {
        xyVar.a.a(z10, z11);
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
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
        kz kzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                kzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    kzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        fz fzVar = kzVar.z0;
        dz dzVar = fzVar.O;
        kz kzVar2 = fzVar.Q;
        vw vwVar = kzVar2.G0;
        sw swVar = kzVar2.D0;
        if (fzVar.L != 0) {
            ConnectionsManager.getInstance(kzVar2.c1).cancelRequest(fzVar.L, true);
            fzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            fzVar.N = null;
            fzVar.E.clear();
            fzVar.H.clear();
            fzVar.K = new ArrayList();
            s4.h0 adapter = swVar.getAdapter();
            bz bzVar = kzVar2.y0;
            if (adapter != bzVar) {
                swVar.setAdapter(bzVar);
            }
            fzVar.d = 0L;
            kzVar2.a.a(false, true);
            fzVar.l();
            vwVar.e(false);
        } else {
            fzVar.N = str.toLowerCase();
            vwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(dzVar);
        AndroidUtilities.runOnUIThread(dzVar, 300L);
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
        ofFloat.addUpdateListener(new i6(this, 22));
        this.y.setDuration(120L);
        this.y.setInterpolator(qr.h);
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
                xp xpVar = new xp(this, 15);
                this.E = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 340L);
                return;
            }
            return;
        }
        xp xpVar2 = this.E;
        if (xpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        iq iqVar = this.d;
        wy wyVar = this.r;
        if (!z11 || ((iqVar.length() == 0 && (wyVar == null || wyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((iqVar.length() > 0 || (wyVar != null && wyVar.o3 > 0.5f && (wyVar.j3 || wyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
