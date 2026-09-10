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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class ez extends FrameLayout implements le.d {
    public dq E;
    public boolean F;
    public final /* synthetic */ rz G;
    public final le.b a;
    public final int b;
    public final hn0 c;
    public final oq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final dz r;
    public final bi.n7 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(rz rzVar, Context context, int i10) {
        super(context);
        this.G = rzVar;
        final int i11 = 0;
        this.a = new le.b(0, this, wr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z10 = rzVar.z(org.telegram.ui.ActionBar.j6.Ke);
        boolean z11 = rzVar.i2;
        view.setBackgroundColor(z10);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (rzVar.u0) {
            view2.setBackgroundColor(rzVar.z(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, rzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), z11 ? rzVar.v(0.06f) : rzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        bi.g gVar = xf.k0.a;
        frameLayout.setOutlineProvider(new xf.j0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.n7 n7Var = new bi.n7(this, context, 10);
        this.s = n7Var;
        frameLayout.addView(n7Var, w7.a6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        hn0 hn0Var = new hn0();
        this.c = hn0Var;
        hn0Var.c(0, false, false);
        hn0Var.a(z11 ? rzVar.v(0.4f) : rzVar.z(org.telegram.ui.ActionBar.j6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(hn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bz
            public final /* synthetic */ ez b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ez ezVar = this.b;
                        dz dzVar = ezVar.r;
                        oq oqVar = ezVar.d;
                        if (ezVar.c.k == 1) {
                            oqVar.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.C1();
                                dzVar.E1(null);
                                dzVar.F1(true, true);
                            }
                            ezVar.f(false);
                            oqVar.clearAnimation();
                            oqVar.animate().translationX(0.0f).setInterpolator(wr.h).start();
                            ezVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ez ezVar2 = this.b;
                        oq oqVar2 = ezVar2.d;
                        oqVar2.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.r;
                        if (dzVar2 != null) {
                            dzVar2.C1();
                            dzVar2.E1(null);
                            dzVar2.F1(true, true);
                        }
                        ezVar2.f(false);
                        oqVar2.clearAnimation();
                        oqVar2.animate().translationX(0.0f).setInterpolator(wr.h).start();
                        ezVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        oq oqVar = new oq(this, context, i10, i12);
        this.d = oqVar;
        oqVar.setTextSize(1, 16.0f);
        oqVar.setHintTextColor(z11 ? rzVar.v(0.45f) : rzVar.z(org.telegram.ui.ActionBar.j6.Je));
        oqVar.setTextColor(z11 ? rzVar.v(0.8f) : rzVar.z(org.telegram.ui.ActionBar.j6.G6));
        oqVar.setBackgroundDrawable(null);
        oqVar.setPadding(0, 0, 0, 0);
        oqVar.setMaxLines(1);
        oqVar.setLines(1);
        oqVar.setSingleLine(true);
        oqVar.setImeOptions(268435459);
        oqVar.setHint(LocaleController.getString(R.string.Search));
        oqVar.setCursorColor(rzVar.z(org.telegram.ui.ActionBar.j6.Mh));
        oqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oqVar.setCursorWidth(1.5f);
        oqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        n7Var.addView(oqVar, w7.a6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        oqVar.addTextChangedListener(new bi.u2(this, 8));
        if (rzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(rzVar.z(org.telegram.ui.ActionBar.j6.He), rzVar.z(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            n7Var.addView(view3, w7.a6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new bi.v2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, rzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bz
            public final /* synthetic */ ez b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        ez ezVar = this.b;
                        dz dzVar = ezVar.r;
                        oq oqVar2 = ezVar.d;
                        if (ezVar.c.k == 1) {
                            oqVar2.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.C1();
                                dzVar.E1(null);
                                dzVar.F1(true, true);
                            }
                            ezVar.f(false);
                            oqVar2.clearAnimation();
                            oqVar2.animate().translationX(0.0f).setInterpolator(wr.h).start();
                            ezVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ez ezVar2 = this.b;
                        oq oqVar22 = ezVar2.d;
                        oqVar22.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.r;
                        if (dzVar2 != null) {
                            dzVar2.C1();
                            dzVar2.E1(null);
                            dzVar2.F1(true, true);
                        }
                        ezVar2.f(false);
                        oqVar22.clearAnimation();
                        oqVar22.animate().translationX(0.0f).setInterpolator(wr.h).start();
                        ezVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (i10 != 1 || (rzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            dz dzVar = new dz(this, context, i10 == 0 ? 3 : 0, rzVar.Z1, i10);
            this.r = dzVar;
            dzVar.w3 = z11;
            dzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) oqVar.getPaint().measureText(((Object) oqVar.getHint()) + "")));
            if (rzVar.u0) {
                dzVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(rzVar.z(org.telegram.ui.ActionBar.j6.He), rzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
            }
            final int i14 = 0;
            dzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.cz
                public final /* synthetic */ ez b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            ez ezVar = this.b;
                            ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            ezVar.d(num.intValue() > 0);
                            ezVar.g(false);
                            break;
                        default:
                            dx0 dx0Var = (dx0) obj;
                            ez ezVar2 = this.b;
                            rz rzVar2 = ezVar2.G;
                            dz dzVar2 = ezVar2.r;
                            if (dx0Var != null) {
                                if (dzVar2.getSelectedCategory() != dx0Var) {
                                    ezVar2.c(dx0Var.a, false);
                                    dzVar2.E1(dx0Var);
                                    break;
                                } else {
                                    ezVar2.c(null, false);
                                    dzVar2.E1(null);
                                    break;
                                }
                            } else {
                                ezVar2.d(false);
                                dzVar2.E1(null);
                                rzVar2.o0.d.setText("");
                                rzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            dzVar.setOnTouchListener(new m.c2(this, 2));
            final int i15 = 1;
            dzVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.cz
                public final /* synthetic */ ez b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            ez ezVar = this.b;
                            ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            ezVar.d(num.intValue() > 0);
                            ezVar.g(false);
                            break;
                        default:
                            dx0 dx0Var = (dx0) obj;
                            ez ezVar2 = this.b;
                            rz rzVar2 = ezVar2.G;
                            dz dzVar2 = ezVar2.r;
                            if (dx0Var != null) {
                                if (dzVar2.getSelectedCategory() != dx0Var) {
                                    ezVar2.c(dx0Var.a, false);
                                    dzVar2.E1(dx0Var);
                                    break;
                                } else {
                                    ezVar2.c(null, false);
                                    dzVar2.E1(null);
                                    break;
                                }
                            } else {
                                ezVar2.d(false);
                                dzVar2.E1(null);
                                rzVar2.o0.d.setText("");
                                rzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(dzVar, w7.a6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(ez ezVar, boolean z10, boolean z11) {
        ezVar.a.a(z10, z11);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
        rz rzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                rzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    rzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        mz mzVar = rzVar.z0;
        kz kzVar = mzVar.O;
        rz rzVar2 = mzVar.Q;
        bx bxVar = rzVar2.G0;
        yw ywVar = rzVar2.D0;
        if (mzVar.L != 0) {
            ConnectionsManager.getInstance(rzVar2.c1).cancelRequest(mzVar.L, true);
            mzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            mzVar.N = null;
            mzVar.E.clear();
            mzVar.H.clear();
            mzVar.K = new ArrayList();
            s4.h0 adapter = ywVar.getAdapter();
            iz izVar = rzVar2.y0;
            if (adapter != izVar) {
                ywVar.setAdapter(izVar);
            }
            mzVar.d = 0L;
            rzVar2.a.a(false, true);
            mzVar.l();
            bxVar.e(false);
        } else {
            mzVar.N = str.toLowerCase();
            bxVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(kzVar);
        AndroidUtilities.runOnUIThread(kzVar, 300L);
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
        this.y.setInterpolator(wr.h);
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
                dq dqVar = new dq(this, 15);
                this.E = dqVar;
                AndroidUtilities.runOnUIThread(dqVar, 340L);
                return;
            }
            return;
        }
        dq dqVar2 = this.E;
        if (dqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(dqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        oq oqVar = this.d;
        dz dzVar = this.r;
        if (!z11 || ((oqVar.length() == 0 && (dzVar == null || dzVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((oqVar.length() > 0 || (dzVar != null && dzVar.o3 > 0.5f && (dzVar.j3 || dzVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
