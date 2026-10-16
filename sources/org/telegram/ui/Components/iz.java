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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class iz extends FrameLayout implements ne.d {
    public kq E;
    public boolean F;
    public final /* synthetic */ wz G;
    public final ne.b a;
    public final int b;
    public final zn0 c;
    public final vq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final hz r;
    public final ah.v s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(wz wzVar, Context context, int i10) {
        super(context);
        int i11;
        this.G = wzVar;
        final int i12 = 0;
        this.a = new ne.b(0, this, es.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int B = wzVar.B(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = wzVar.i2;
        view.setBackgroundColor(B);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (wzVar.u0) {
            view2.setBackgroundColor(wzVar.B(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, wzVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), z10 ? wzVar.w(0.06f) : wzVar.B(org.telegram.ui.ActionBar.g6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        bi.a2 a2Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp));
        int i13 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.z5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.z5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ah.v vVar = new ah.v(this, context, 12);
        this.s = vVar;
        frameLayout.addView(vVar, w7.z5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        zn0 zn0Var = new zn0();
        this.c = zn0Var;
        zn0Var.c(0, false, false);
        zn0Var.a(z10 ? wzVar.w(0.4f) : wzVar.B(org.telegram.ui.ActionBar.g6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(zn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fz
            public final /* synthetic */ iz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        iz izVar = this.b;
                        hz hzVar = izVar.r;
                        vq vqVar = izVar.d;
                        if (izVar.c.k == 1) {
                            vqVar.setText("");
                            izVar.c(null, false);
                            if (hzVar != null) {
                                hzVar.E1();
                                hzVar.G1(null);
                                hzVar.H1(true, true);
                            }
                            izVar.f(false);
                            vqVar.clearAnimation();
                            vqVar.animate().translationX(0.0f).setInterpolator(es.h).start();
                            izVar.d(false);
                            break;
                        }
                        break;
                    default:
                        iz izVar2 = this.b;
                        vq vqVar2 = izVar2.d;
                        vqVar2.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.r;
                        if (hzVar2 != null) {
                            hzVar2.E1();
                            hzVar2.G1(null);
                            hzVar2.H1(true, true);
                        }
                        izVar2.f(false);
                        vqVar2.clearAnimation();
                        vqVar2.animate().translationX(0.0f).setInterpolator(es.h).start();
                        izVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        vq vqVar = new vq(this, context, i10, i13);
        this.d = vqVar;
        vqVar.setTextSize(1, 16.0f);
        vqVar.setHintTextColor(z10 ? wzVar.w(0.45f) : wzVar.B(org.telegram.ui.ActionBar.g6.Je));
        vqVar.setTextColor(z10 ? wzVar.w(0.8f) : wzVar.B(org.telegram.ui.ActionBar.g6.G6));
        vqVar.setBackgroundDrawable(null);
        vqVar.setPadding(0, 0, 0, 0);
        vqVar.setMaxLines(1);
        vqVar.setLines(1);
        vqVar.setSingleLine(true);
        vqVar.setImeOptions(268435459);
        vqVar.setHint(LocaleController.getString(R.string.Search));
        vqVar.setCursorColor(wzVar.B(org.telegram.ui.ActionBar.g6.Mh));
        vqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        vqVar.setCursorWidth(1.5f);
        vqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(vqVar, w7.z5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        vqVar.addTextChangedListener(new di.h2(this, 8));
        if (wzVar.u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(wzVar.B(org.telegram.ui.ActionBar.g6.He), wzVar.B(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
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
        imageView2.setImageDrawable(new di.i2(this));
        final int i14 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, wzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fz
            public final /* synthetic */ iz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i14) {
                    case 0:
                        iz izVar = this.b;
                        hz hzVar = izVar.r;
                        vq vqVar2 = izVar.d;
                        if (izVar.c.k == 1) {
                            vqVar2.setText("");
                            izVar.c(null, false);
                            if (hzVar != null) {
                                hzVar.E1();
                                hzVar.G1(null);
                                hzVar.H1(true, true);
                            }
                            izVar.f(false);
                            vqVar2.clearAnimation();
                            vqVar2.animate().translationX(0.0f).setInterpolator(es.h).start();
                            izVar.d(false);
                            break;
                        }
                        break;
                    default:
                        iz izVar2 = this.b;
                        vq vqVar22 = izVar2.d;
                        vqVar22.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.r;
                        if (hzVar2 != null) {
                            hzVar2.E1();
                            hzVar2.G1(null);
                            hzVar2.H1(true, true);
                        }
                        izVar2.f(false);
                        vqVar22.clearAnimation();
                        vqVar22.animate().translationX(0.0f).setInterpolator(es.h).start();
                        izVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 != 1 || (wzVar.c2 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            hz hzVar = new hz(this, context, i10 == 0 ? i11 : 0, wzVar.Z1, i10);
            this.r = hzVar;
            hzVar.u3 = z10;
            hzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) vqVar.getPaint().measureText(((Object) vqVar.getHint()) + "")));
            if (wzVar.u0) {
                hzVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(wzVar.B(org.telegram.ui.ActionBar.g6.He), wzVar.B(org.telegram.ui.ActionBar.g6.Ie)));
            }
            final int i15 = 0;
            hzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.gz
                public final /* synthetic */ iz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            iz izVar = this.b;
                            izVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            izVar.d(num.intValue() > 0);
                            izVar.g(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            iz izVar2 = this.b;
                            wz wzVar2 = izVar2.G;
                            hz hzVar2 = izVar2.r;
                            if (qx0Var != null) {
                                if (hzVar2.getSelectedCategory() != qx0Var) {
                                    izVar2.c(qx0Var.a, false);
                                    hzVar2.G1(qx0Var);
                                    break;
                                } else {
                                    izVar2.c(null, false);
                                    hzVar2.G1(null);
                                    break;
                                }
                            } else {
                                izVar2.d(false);
                                hzVar2.G1(null);
                                wzVar2.o0.d.setText("");
                                wzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            hzVar.setOnTouchListener(new m.e2(this, 2));
            final int i16 = 1;
            hzVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.gz
                public final /* synthetic */ iz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            iz izVar = this.b;
                            izVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            izVar.d(num.intValue() > 0);
                            izVar.g(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            iz izVar2 = this.b;
                            wz wzVar2 = izVar2.G;
                            hz hzVar2 = izVar2.r;
                            if (qx0Var != null) {
                                if (hzVar2.getSelectedCategory() != qx0Var) {
                                    izVar2.c(qx0Var.a, false);
                                    hzVar2.G1(qx0Var);
                                    break;
                                } else {
                                    izVar2.c(null, false);
                                    hzVar2.G1(null);
                                    break;
                                }
                            } else {
                                izVar2.d(false);
                                hzVar2.G1(null);
                                wzVar2.o0.d.setText("");
                                wzVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(hzVar, w7.z5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        }
    }

    public static void a(iz izVar, boolean z10, boolean z11) {
        izVar.a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        wz wzVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                wzVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    wzVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        rz rzVar = wzVar.z0;
        pz pzVar = rzVar.O;
        wz wzVar2 = rzVar.Q;
        hx hxVar = wzVar2.G0;
        ex exVar = wzVar2.D0;
        if (rzVar.L != 0) {
            ConnectionsManager.getInstance(wzVar2.c1).cancelRequest(rzVar.L, true);
            rzVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            rzVar.N = null;
            rzVar.E.clear();
            rzVar.H.clear();
            rzVar.K = new ArrayList();
            s4.g0 adapter = exVar.getAdapter();
            mz mzVar = wzVar2.y0;
            if (adapter != mzVar) {
                exVar.setAdapter(mzVar);
            }
            rzVar.d = 0L;
            wzVar2.a.a(false, true);
            rzVar.l();
            hxVar.e(false);
        } else {
            rzVar.N = str.toLowerCase();
            hxVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(pzVar);
        AndroidUtilities.runOnUIThread(pzVar, 300L);
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
        this.y.setInterpolator(es.h);
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
                kq kqVar = new kq(this, 15);
                this.E = kqVar;
                AndroidUtilities.runOnUIThread(kqVar, 340L);
                return;
            }
            return;
        }
        kq kqVar2 = this.E;
        if (kqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(kqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        vq vqVar = this.d;
        hz hzVar = this.r;
        if (!z11 || ((vqVar.length() == 0 && (hzVar == null || hzVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((vqVar.length() > 0 || (hzVar != null && hzVar.m3 > 0.5f && (hzVar.h3 || hzVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
