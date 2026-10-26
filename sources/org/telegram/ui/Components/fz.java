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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class fz extends FrameLayout implements org.telegram.ui.ActionBar.p6, oe.d {
    public bq E;
    public boolean F;
    public final /* synthetic */ sz G;
    public final oe.b a;
    public final int b;
    public final eo0 c;
    public final uq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final ez r;
    public final bh.p s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(sz szVar, Context context, int i10) {
        super(context);
        uq uqVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        this.G = szVar;
        this.a = new oe.b(0, this, ds.g, 200L, false);
        final int i12 = 0;
        this.x = false;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.a;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.y6.Ke;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        boolean z10 = szVar.i2;
        org.telegram.ui.ActionBar.f7.i(i13, view, u6Var);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (szVar.u0) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.He, view2, u6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, szVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), z10 ? szVar.v(0.06f) : szVar.A(org.telegram.ui.ActionBar.y6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ag.v0 v0Var = ag.z0.a;
        frameLayout.setOutlineProvider(new ag.x0(0, dp));
        int i14 = 2;
        if (i10 == 2) {
            addView(frameLayout, gb1.h(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, gb1.h(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bh.p pVar = new bh.p(this, context, 12);
        this.s = pVar;
        frameLayout.addView(pVar, gb1.h(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        eo0 eo0Var = new eo0();
        this.c = eo0Var;
        eo0Var.c(0, false, false);
        eo0Var.a(z10 ? szVar.v(0.4f) : szVar.A(org.telegram.ui.ActionBar.y6.Je));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(eo0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cz
            public final /* synthetic */ fz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        fz fzVar = this.b;
                        ez ezVar = fzVar.r;
                        uq uqVar2 = fzVar.d;
                        if (fzVar.c.k == 1) {
                            uqVar2.setText("");
                            fzVar.c(null, false);
                            if (ezVar != null) {
                                ezVar.J1();
                                ezVar.L1(null);
                                ezVar.M1(true, true);
                            }
                            fzVar.f(false);
                            uqVar2.clearAnimation();
                            uqVar2.animate().translationX(0.0f).setInterpolator(ds.h).start();
                            fzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        fz fzVar2 = this.b;
                        uq uqVar3 = fzVar2.d;
                        uqVar3.setText("");
                        fzVar2.c(null, false);
                        ez ezVar2 = fzVar2.r;
                        if (ezVar2 != null) {
                            ezVar2.J1();
                            ezVar2.L1(null);
                            ezVar2.M1(true, true);
                        }
                        fzVar2.f(false);
                        uqVar3.clearAnimation();
                        uqVar3.animate().translationX(0.0f).setInterpolator(ds.h).start();
                        fzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, gb1.i(36, 36, 51));
        uq uqVar2 = new uq(this, context, i10, i14);
        this.d = uqVar2;
        uqVar2.setTextSize(1, 16.0f);
        uqVar2.setHintTextColor(z10 ? szVar.v(0.45f) : szVar.A(org.telegram.ui.ActionBar.y6.Je));
        uqVar2.setTextColor(z10 ? szVar.v(0.8f) : szVar.A(org.telegram.ui.ActionBar.y6.G6));
        uqVar2.setBackgroundDrawable(null);
        uqVar2.setPadding(0, 0, 0, 0);
        uqVar2.setMaxLines(1);
        uqVar2.setLines(1);
        uqVar2.setSingleLine(true);
        uqVar2.setImeOptions(268435459);
        uqVar2.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.f7.m(uqVar2, 30, org.telegram.ui.ActionBar.y6.Mh, u6Var);
        uqVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        uqVar2.setCursorWidth(1.5f);
        uqVar2.setTranslationY(AndroidUtilities.dp(-2.0f));
        pVar.addView(uqVar2, gb1.h(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        uqVar2.addTextChangedListener(new bi.u(this, 9));
        if (szVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(org.telegram.ui.ActionBar.y6.He, org.telegram.ui.ActionBar.y6.Ie);
            uqVar = uqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.f7.l(this, mutate, q5.a, q5.b, 4, 0.0f, u6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            pVar.addView(view3, gb1.i(18, -1, 3));
        } else {
            uqVar = uqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.d2(this));
        int i15 = org.telegram.ui.ActionBar.y6.i6;
        final int i16 = 1;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i15, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cz
            public final /* synthetic */ fz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i16) {
                    case 0:
                        fz fzVar = this.b;
                        ez ezVar = fzVar.r;
                        uq uqVar22 = fzVar.d;
                        if (fzVar.c.k == 1) {
                            uqVar22.setText("");
                            fzVar.c(null, false);
                            if (ezVar != null) {
                                ezVar.J1();
                                ezVar.L1(null);
                                ezVar.M1(true, true);
                            }
                            fzVar.f(false);
                            uqVar22.clearAnimation();
                            uqVar22.animate().translationX(0.0f).setInterpolator(ds.h).start();
                            fzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        fz fzVar2 = this.b;
                        uq uqVar3 = fzVar2.d;
                        uqVar3.setText("");
                        fzVar2.c(null, false);
                        ez ezVar2 = fzVar2.r;
                        if (ezVar2 != null) {
                            ezVar2.J1();
                            ezVar2.L1(null);
                            ezVar2.M1(true, true);
                        }
                        fzVar2.f(false);
                        uqVar3.clearAnimation();
                        uqVar3.animate().translationX(0.0f).setInterpolator(ds.h).start();
                        fzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, gb1.i(36, 36, 53));
        if (i10 != 1 || (szVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            ez ezVar = new ez(this, context, i10 == 0 ? i11 : 0, szVar.Z1, i10);
            this.r = ezVar;
            ezVar.E3 = z10;
            ezVar.setDontOccupyWidth(AndroidUtilities.dp(f7) + ((int) uqVar.getPaint().measureText(((Object) uqVar.getHint()) + "")));
            if (szVar.u0) {
                org.telegram.ui.ActionBar.f7.j(ezVar, org.telegram.ui.ActionBar.f7.q(org.telegram.ui.ActionBar.y6.He, org.telegram.ui.ActionBar.y6.Ie), u6Var);
            }
            final int i17 = 0;
            ezVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.dz
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            fz fzVar = this.b;
                            fzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            fzVar.d(num.intValue() > 0);
                            fzVar.g(false);
                            break;
                        default:
                            xx0 xx0Var = (xx0) obj;
                            fz fzVar2 = this.b;
                            sz szVar2 = fzVar2.G;
                            ez ezVar2 = fzVar2.r;
                            if (xx0Var != null) {
                                if (ezVar2.getSelectedCategory() != xx0Var) {
                                    fzVar2.c(xx0Var.a, false);
                                    ezVar2.L1(xx0Var);
                                    break;
                                } else {
                                    fzVar2.c(null, false);
                                    ezVar2.L1(null);
                                    break;
                                }
                            } else {
                                fzVar2.d(false);
                                ezVar2.L1(null);
                                szVar2.o0.d.setText("");
                                szVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            ezVar.setOnTouchListener(new m.c2(this, 2));
            final int i18 = 1;
            ezVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.dz
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i18) {
                        case 0:
                            Integer num = (Integer) obj;
                            fz fzVar = this.b;
                            fzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            fzVar.d(num.intValue() > 0);
                            fzVar.g(false);
                            break;
                        default:
                            xx0 xx0Var = (xx0) obj;
                            fz fzVar2 = this.b;
                            sz szVar2 = fzVar2.G;
                            ez ezVar2 = fzVar2.r;
                            if (xx0Var != null) {
                                if (ezVar2.getSelectedCategory() != xx0Var) {
                                    fzVar2.c(xx0Var.a, false);
                                    ezVar2.L1(xx0Var);
                                    break;
                                } else {
                                    fzVar2.c(null, false);
                                    ezVar2.L1(null);
                                    break;
                                }
                            } else {
                                fzVar2.d(false);
                                ezVar2.L1(null);
                                szVar2.o0.d.setText("");
                                szVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(ezVar, gb1.h(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(fz fzVar, boolean z10, boolean z11) {
        fzVar.a.a(z10, z11);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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
        sz szVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                szVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    szVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        nz nzVar = szVar.z0;
        lz lzVar = nzVar.O;
        sz szVar2 = nzVar.Q;
        cx cxVar = szVar2.G0;
        zw zwVar = szVar2.D0;
        if (nzVar.L != 0) {
            ConnectionsManager.getInstance(szVar2.c1).cancelRequest(nzVar.L, true);
            nzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            nzVar.N = null;
            nzVar.E.clear();
            nzVar.H.clear();
            nzVar.K = new ArrayList();
            s4.h0 adapter = zwVar.getAdapter();
            jz jzVar = szVar2.y0;
            if (adapter != jzVar) {
                zwVar.setAdapter(jzVar);
            }
            nzVar.d = 0L;
            szVar2.a.a(false, true);
            nzVar.l();
            cxVar.e(false);
        } else {
            nzVar.N = str.toLowerCase();
            cxVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(lzVar);
        AndroidUtilities.runOnUIThread(lzVar, 300L);
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
        ofFloat.addUpdateListener(new n6(this, 23));
        this.y.setDuration(120L);
        this.y.setInterpolator(ds.h);
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
                bq bqVar = new bq(this, 16);
                this.E = bqVar;
                AndroidUtilities.runOnUIThread(bqVar, 340L);
                return;
            }
            return;
        }
        bq bqVar2 = this.E;
        if (bqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        uq uqVar = this.d;
        ez ezVar = this.r;
        if (!z11 || ((uqVar.length() == 0 && (ezVar == null || ezVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((uqVar.length() > 0 || (ezVar != null && ezVar.w3 > 0.5f && (ezVar.r3 || ezVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.y6.Mh));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
