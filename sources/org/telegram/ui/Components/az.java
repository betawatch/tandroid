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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class az extends FrameLayout implements le.d {
    public aq E;
    public boolean F;
    public final /* synthetic */ nz G;
    public final le.b a;
    public final int b;
    public final qn0 c;
    public final lq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final zy r;
    public final ci.m6 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(nz nzVar, Context context, int i10) {
        super(context);
        this.G = nzVar;
        final int i11 = 0;
        this.a = new le.b(0, this, tr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = nzVar.z(org.telegram.ui.ActionBar.i6.Ke);
        boolean z11 = nzVar.i2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (nzVar.u0) {
            view2.setBackgroundColor(nzVar.z(org.telegram.ui.ActionBar.i6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, nzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), z11 ? nzVar.v(0.06f) : nzVar.z(org.telegram.ui.ActionBar.i6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ai.k2 k2Var = yf.f0.a;
        frameLayout.setOutlineProvider(new yf.d0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.s = m6Var;
        frameLayout.addView(m6Var, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        qn0 qn0Var = new qn0();
        this.c = qn0Var;
        qn0Var.c(0, false, false);
        qn0Var.a(z11 ? nzVar.v(0.4f) : nzVar.z(org.telegram.ui.ActionBar.i6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(qn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xy
            public final /* synthetic */ az b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        az azVar = this.b;
                        zy zyVar = azVar.r;
                        lq lqVar = azVar.d;
                        if (azVar.c.k == 1) {
                            lqVar.setText("");
                            azVar.c(null, false);
                            if (zyVar != null) {
                                zyVar.E1();
                                zyVar.G1(null);
                                zyVar.H1(true, true);
                            }
                            azVar.f(false);
                            lqVar.clearAnimation();
                            lqVar.animate().translationX(0.0f).setInterpolator(tr.h).start();
                            azVar.d(false);
                            break;
                        }
                        break;
                    default:
                        az azVar2 = this.b;
                        lq lqVar2 = azVar2.d;
                        lqVar2.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.r;
                        if (zyVar2 != null) {
                            zyVar2.E1();
                            zyVar2.G1(null);
                            zyVar2.H1(true, true);
                        }
                        azVar2.f(false);
                        lqVar2.clearAnimation();
                        lqVar2.animate().translationX(0.0f).setInterpolator(tr.h).start();
                        azVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        lq lqVar = new lq(this, context, i10, i12);
        this.d = lqVar;
        lqVar.setTextSize(1, 16.0f);
        lqVar.setHintTextColor(z11 ? nzVar.v(0.45f) : nzVar.z(org.telegram.ui.ActionBar.i6.Je));
        lqVar.setTextColor(z11 ? nzVar.v(0.8f) : nzVar.z(org.telegram.ui.ActionBar.i6.G6));
        lqVar.setBackgroundDrawable(null);
        lqVar.setPadding(0, 0, 0, 0);
        lqVar.setMaxLines(1);
        lqVar.setLines(1);
        lqVar.setSingleLine(true);
        lqVar.setImeOptions(268435459);
        lqVar.setHint(LocaleController.getString(R.string.Search));
        lqVar.setCursorColor(nzVar.z(org.telegram.ui.ActionBar.i6.Mh));
        lqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        lqVar.setCursorWidth(1.5f);
        lqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(lqVar, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        lqVar.addTextChangedListener(new ci.i2(this, 8));
        if (nzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v(nzVar.z(org.telegram.ui.ActionBar.i6.He), nzVar.z(org.telegram.ui.ActionBar.i6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.z5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, nzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xy
            public final /* synthetic */ az b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        az azVar = this.b;
                        zy zyVar = azVar.r;
                        lq lqVar2 = azVar.d;
                        if (azVar.c.k == 1) {
                            lqVar2.setText("");
                            azVar.c(null, false);
                            if (zyVar != null) {
                                zyVar.E1();
                                zyVar.G1(null);
                                zyVar.H1(true, true);
                            }
                            azVar.f(false);
                            lqVar2.clearAnimation();
                            lqVar2.animate().translationX(0.0f).setInterpolator(tr.h).start();
                            azVar.d(false);
                            break;
                        }
                        break;
                    default:
                        az azVar2 = this.b;
                        lq lqVar22 = azVar2.d;
                        lqVar22.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.r;
                        if (zyVar2 != null) {
                            zyVar2.E1();
                            zyVar2.G1(null);
                            zyVar2.H1(true, true);
                        }
                        azVar2.f(false);
                        lqVar22.clearAnimation();
                        lqVar22.animate().translationX(0.0f).setInterpolator(tr.h).start();
                        azVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 != 1 || (nzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            zy zyVar = new zy(this, context, i10 == 0 ? 3 : 0, nzVar.Z1, i10);
            this.r = zyVar;
            zyVar.D3 = z11;
            zyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) lqVar.getPaint().measureText(((Object) lqVar.getHint()) + "")));
            if (nzVar.u0) {
                zyVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v(nzVar.z(org.telegram.ui.ActionBar.i6.He), nzVar.z(org.telegram.ui.ActionBar.i6.Ie)));
            }
            final int i14 = 0;
            zyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.yy
                public final /* synthetic */ az b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            az azVar = this.b;
                            azVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            azVar.d(num.intValue() > 0);
                            azVar.g(false);
                            break;
                        default:
                            ox0 ox0Var = (ox0) obj;
                            az azVar2 = this.b;
                            nz nzVar2 = azVar2.G;
                            zy zyVar2 = azVar2.r;
                            if (ox0Var != null) {
                                if (zyVar2.getSelectedCategory() != ox0Var) {
                                    azVar2.c(ox0Var.a, false);
                                    zyVar2.G1(ox0Var);
                                    break;
                                } else {
                                    azVar2.c(null, false);
                                    zyVar2.G1(null);
                                    break;
                                }
                            } else {
                                azVar2.d(false);
                                zyVar2.G1(null);
                                nzVar2.o0.d.setText("");
                                nzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            zyVar.setOnTouchListener(new m.c2(this, 2));
            final int i15 = 1;
            zyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.yy
                public final /* synthetic */ az b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            az azVar = this.b;
                            azVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            azVar.d(num.intValue() > 0);
                            azVar.g(false);
                            break;
                        default:
                            ox0 ox0Var = (ox0) obj;
                            az azVar2 = this.b;
                            nz nzVar2 = azVar2.G;
                            zy zyVar2 = azVar2.r;
                            if (ox0Var != null) {
                                if (zyVar2.getSelectedCategory() != ox0Var) {
                                    azVar2.c(ox0Var.a, false);
                                    zyVar2.G1(ox0Var);
                                    break;
                                } else {
                                    azVar2.c(null, false);
                                    zyVar2.G1(null);
                                    break;
                                }
                            } else {
                                azVar2.d(false);
                                zyVar2.G1(null);
                                nzVar2.o0.d.setText("");
                                nzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(zyVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(az azVar, boolean z10, boolean z11) {
        azVar.a.a(z10, z11);
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
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
        nz nzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                nzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    nzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        iz izVar = nzVar.z0;
        gz gzVar = izVar.O;
        nz nzVar2 = izVar.Q;
        zw zwVar = nzVar2.G0;
        vw vwVar = nzVar2.D0;
        if (izVar.L != 0) {
            ConnectionsManager.getInstance(nzVar2.c1).cancelRequest(izVar.L, true);
            izVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            izVar.N = null;
            izVar.E.clear();
            izVar.H.clear();
            izVar.K = new ArrayList();
            s4.h0 adapter = vwVar.getAdapter();
            ez ezVar = nzVar2.y0;
            if (adapter != ezVar) {
                vwVar.setAdapter(ezVar);
            }
            izVar.d = 0L;
            nzVar2.a.a(false, true);
            izVar.l();
            zwVar.e(false);
        } else {
            izVar.N = str.toLowerCase();
            zwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(gzVar);
        AndroidUtilities.runOnUIThread(gzVar, 300L);
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
        this.y.setInterpolator(tr.h);
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
                aq aqVar = new aq(this, 15);
                this.E = aqVar;
                AndroidUtilities.runOnUIThread(aqVar, 340L);
                return;
            }
            return;
        }
        aq aqVar2 = this.E;
        if (aqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(aqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        lq lqVar = this.d;
        zy zyVar = this.r;
        if (!z11 || ((lqVar.length() == 0 && (zyVar == null || zyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((lqVar.length() > 0 || (zyVar != null && zyVar.v3 > 0.5f && (zyVar.q3 || zyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
