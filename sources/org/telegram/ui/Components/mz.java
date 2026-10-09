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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class mz extends FrameLayout implements me.d {
    public nq E;
    public boolean F;
    public final /* synthetic */ a00 G;
    public final me.b a;
    public final int b;
    public final do0 c;
    public final yq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final lz r;
    public final ci.m6 s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(a00 a00Var, Context context, int i10) {
        super(context);
        int i11;
        this.G = a00Var;
        final int i12 = 0;
        this.a = new me.b(0, this, hs.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int B = a00Var.B(org.telegram.ui.ActionBar.i6.Ke);
        boolean z10 = a00Var.i2;
        view.setBackgroundColor(B);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (a00Var.u0) {
            view2.setBackgroundColor(a00Var.B(org.telegram.ui.ActionBar.i6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, a00Var.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), z10 ? a00Var.w(0.06f) : a00Var.B(org.telegram.ui.ActionBar.i6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        ai.l2 l2Var = yf.i0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp));
        int i13 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.s = m6Var;
        frameLayout.addView(m6Var, w7.x5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        do0 do0Var = new do0();
        this.c = do0Var;
        do0Var.c(0, false, false);
        do0Var.a(z10 ? a00Var.w(0.4f) : a00Var.B(org.telegram.ui.ActionBar.i6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(do0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jz
            public final /* synthetic */ mz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        mz mzVar = this.b;
                        lz lzVar = mzVar.r;
                        yq yqVar = mzVar.d;
                        if (mzVar.c.k == 1) {
                            yqVar.setText("");
                            mzVar.c(null, false);
                            if (lzVar != null) {
                                lzVar.E1();
                                lzVar.G1(null);
                                lzVar.H1(true, true);
                            }
                            mzVar.f(false);
                            yqVar.clearAnimation();
                            yqVar.animate().translationX(0.0f).setInterpolator(hs.h).start();
                            mzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        mz mzVar2 = this.b;
                        yq yqVar2 = mzVar2.d;
                        yqVar2.setText("");
                        mzVar2.c(null, false);
                        lz lzVar2 = mzVar2.r;
                        if (lzVar2 != null) {
                            lzVar2.E1();
                            lzVar2.G1(null);
                            lzVar2.H1(true, true);
                        }
                        mzVar2.f(false);
                        yqVar2.clearAnimation();
                        yqVar2.animate().translationX(0.0f).setInterpolator(hs.h).start();
                        mzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        yq yqVar = new yq(this, context, i10, i13);
        this.d = yqVar;
        yqVar.setTextSize(1, 16.0f);
        yqVar.setHintTextColor(z10 ? a00Var.w(0.45f) : a00Var.B(org.telegram.ui.ActionBar.i6.Je));
        yqVar.setTextColor(z10 ? a00Var.w(0.8f) : a00Var.B(org.telegram.ui.ActionBar.i6.G6));
        yqVar.setBackgroundDrawable(null);
        yqVar.setPadding(0, 0, 0, 0);
        yqVar.setMaxLines(1);
        yqVar.setLines(1);
        yqVar.setSingleLine(true);
        yqVar.setImeOptions(268435459);
        yqVar.setHint(LocaleController.getString(R.string.Search));
        yqVar.setCursorColor(a00Var.B(org.telegram.ui.ActionBar.i6.Mh));
        yqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        yqVar.setCursorWidth(1.5f);
        yqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(yqVar, w7.x5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        yqVar.addTextChangedListener(new ci.h2(this, 8));
        if (a00Var.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v(a00Var.B(org.telegram.ui.ActionBar.i6.He), a00Var.B(org.telegram.ui.ActionBar.i6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            m6Var.addView(view3, w7.x5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(this));
        final int i14 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, a00Var.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jz
            public final /* synthetic */ mz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i14) {
                    case 0:
                        mz mzVar = this.b;
                        lz lzVar = mzVar.r;
                        yq yqVar2 = mzVar.d;
                        if (mzVar.c.k == 1) {
                            yqVar2.setText("");
                            mzVar.c(null, false);
                            if (lzVar != null) {
                                lzVar.E1();
                                lzVar.G1(null);
                                lzVar.H1(true, true);
                            }
                            mzVar.f(false);
                            yqVar2.clearAnimation();
                            yqVar2.animate().translationX(0.0f).setInterpolator(hs.h).start();
                            mzVar.d(false);
                            break;
                        }
                        break;
                    default:
                        mz mzVar2 = this.b;
                        yq yqVar22 = mzVar2.d;
                        yqVar22.setText("");
                        mzVar2.c(null, false);
                        lz lzVar2 = mzVar2.r;
                        if (lzVar2 != null) {
                            lzVar2.E1();
                            lzVar2.G1(null);
                            lzVar2.H1(true, true);
                        }
                        mzVar2.f(false);
                        yqVar22.clearAnimation();
                        yqVar22.animate().translationX(0.0f).setInterpolator(hs.h).start();
                        mzVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 != 1 || (a00Var.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            lz lzVar = new lz(this, context, i10 == 0 ? i11 : 0, a00Var.Z1, i10);
            this.r = lzVar;
            lzVar.u3 = z10;
            lzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) yqVar.getPaint().measureText(((Object) yqVar.getHint()) + "")));
            if (a00Var.u0) {
                lzVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v(a00Var.B(org.telegram.ui.ActionBar.i6.He), a00Var.B(org.telegram.ui.ActionBar.i6.Ie)));
            }
            final int i15 = 0;
            lzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.kz
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            mz mzVar = this.b;
                            mzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            mzVar.d(num.intValue() > 0);
                            mzVar.g(false);
                            break;
                        default:
                            ux0 ux0Var = (ux0) obj;
                            mz mzVar2 = this.b;
                            a00 a00Var2 = mzVar2.G;
                            lz lzVar2 = mzVar2.r;
                            if (ux0Var != null) {
                                if (lzVar2.getSelectedCategory() != ux0Var) {
                                    mzVar2.c(ux0Var.a, false);
                                    lzVar2.G1(ux0Var);
                                    break;
                                } else {
                                    mzVar2.c(null, false);
                                    lzVar2.G1(null);
                                    break;
                                }
                            } else {
                                mzVar2.d(false);
                                lzVar2.G1(null);
                                a00Var2.o0.d.setText("");
                                a00Var2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            lzVar.setOnTouchListener(new m.c2(this, 2));
            final int i16 = 1;
            lzVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.kz
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            mz mzVar = this.b;
                            mzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            mzVar.d(num.intValue() > 0);
                            mzVar.g(false);
                            break;
                        default:
                            ux0 ux0Var = (ux0) obj;
                            mz mzVar2 = this.b;
                            a00 a00Var2 = mzVar2.G;
                            lz lzVar2 = mzVar2.r;
                            if (ux0Var != null) {
                                if (lzVar2.getSelectedCategory() != ux0Var) {
                                    mzVar2.c(ux0Var.a, false);
                                    lzVar2.G1(ux0Var);
                                    break;
                                } else {
                                    mzVar2.c(null, false);
                                    lzVar2.G1(null);
                                    break;
                                }
                            } else {
                                mzVar2.d(false);
                                lzVar2.G1(null);
                                a00Var2.o0.d.setText("");
                                a00Var2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(lzVar, w7.x5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        }
    }

    public static void a(mz mzVar, boolean z10, boolean z11) {
        mzVar.a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        a00 a00Var = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                a00Var.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    a00Var.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        vz vzVar = a00Var.z0;
        tz tzVar = vzVar.O;
        a00 a00Var2 = vzVar.Q;
        lx lxVar = a00Var2.G0;
        ix ixVar = a00Var2.D0;
        if (vzVar.L != 0) {
            ConnectionsManager.getInstance(a00Var2.c1).cancelRequest(vzVar.L, true);
            vzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            vzVar.N = null;
            vzVar.E.clear();
            vzVar.H.clear();
            vzVar.K = new ArrayList();
            s4.i0 adapter = ixVar.getAdapter();
            qz qzVar = a00Var2.y0;
            if (adapter != qzVar) {
                ixVar.setAdapter(qzVar);
            }
            vzVar.d = 0L;
            a00Var2.a.a(false, true);
            vzVar.l();
            lxVar.e(false);
        } else {
            vzVar.N = str.toLowerCase();
            lxVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(tzVar);
        AndroidUtilities.runOnUIThread(tzVar, 300L);
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
        ofFloat.addUpdateListener(new m6(this, 23));
        this.y.setDuration(120L);
        this.y.setInterpolator(hs.h);
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
                nq nqVar = new nq(this, 15);
                this.E = nqVar;
                AndroidUtilities.runOnUIThread(nqVar, 340L);
                return;
            }
            return;
        }
        nq nqVar2 = this.E;
        if (nqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        yq yqVar = this.d;
        lz lzVar = this.r;
        if (!z11 || ((yqVar.length() == 0 && (lzVar == null || lzVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((yqVar.length() > 0 || (lzVar != null && lzVar.m3 > 0.5f && (lzVar.h3 || lzVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
