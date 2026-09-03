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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class wy extends FrameLayout implements xd.b {
    public up B;
    public boolean C;
    public final /* synthetic */ kz D;
    public final xd.a a;
    public final int b;
    public final en0 c;
    public final fq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final vy r;
    public final ah.e s;
    public final View v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(kz kzVar, Context context, int i10) {
        super(context);
        this.D = kzVar;
        final int i11 = 0;
        this.a = new xd.a(0, this, mr.g, 200L, false);
        this.x = false;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A = kzVar.A(org.telegram.ui.ActionBar.j6.Ke);
        boolean z4 = kzVar.f2;
        view.setBackgroundColor(A);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (kzVar.r0) {
            view2.setBackgroundColor(kzVar.A(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.Y0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), z4 ? kzVar.v(0.06f) : kzVar.A(org.telegram.ui.ActionBar.j6.Ie)));
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(18.0f);
        gg.j1 j1Var = kf.r0.a;
        frameLayout.setOutlineProvider(new kf.q0(0, dp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.e eVar = new ah.e(this, context, 13);
        this.s = eVar;
        frameLayout.addView(eVar, k7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        en0 en0Var = new en0();
        this.c = en0Var;
        en0Var.c(0, false, false);
        en0Var.a(z4 ? kzVar.v(0.4f) : kzVar.A(org.telegram.ui.ActionBar.j6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(en0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ty
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        wy wyVar = this.b;
                        vy vyVar = wyVar.r;
                        fq fqVar = wyVar.d;
                        if (wyVar.c.k == 1) {
                            fqVar.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.C1();
                                vyVar.E1(null);
                                vyVar.F1(true, true);
                            }
                            wyVar.f(false);
                            fqVar.clearAnimation();
                            fqVar.animate().translationX(0.0f).setInterpolator(mr.h).start();
                            wyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        wy wyVar2 = this.b;
                        fq fqVar2 = wyVar2.d;
                        fqVar2.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.r;
                        if (vyVar2 != null) {
                            vyVar2.C1();
                            vyVar2.E1(null);
                            vyVar2.F1(true, true);
                        }
                        wyVar2.f(false);
                        fqVar2.clearAnimation();
                        fqVar2.animate().translationX(0.0f).setInterpolator(mr.h).start();
                        wyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        fq fqVar = new fq(this, context, i10, i12);
        this.d = fqVar;
        fqVar.setTextSize(1, 16.0f);
        fqVar.setHintTextColor(z4 ? kzVar.v(0.45f) : kzVar.A(org.telegram.ui.ActionBar.j6.Je));
        fqVar.setTextColor(z4 ? kzVar.v(0.8f) : kzVar.A(org.telegram.ui.ActionBar.j6.G6));
        fqVar.setBackgroundDrawable(null);
        fqVar.setPadding(0, 0, 0, 0);
        fqVar.setMaxLines(1);
        fqVar.setLines(1);
        fqVar.setSingleLine(true);
        fqVar.setImeOptions(268435459);
        fqVar.setHint(LocaleController.getString(R.string.Search));
        fqVar.setCursorColor(kzVar.A(org.telegram.ui.ActionBar.j6.Mh));
        fqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fqVar.setCursorWidth(1.5f);
        fqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        eVar.addView(fqVar, k7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fqVar.addTextChangedListener(new dh.c(this, 8));
        if (kzVar.r0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            eVar.addView(view3, k7.b6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, kzVar.W1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ty
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i13) {
                    case 0:
                        wy wyVar = this.b;
                        vy vyVar = wyVar.r;
                        fq fqVar2 = wyVar.d;
                        if (wyVar.c.k == 1) {
                            fqVar2.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.C1();
                                vyVar.E1(null);
                                vyVar.F1(true, true);
                            }
                            wyVar.f(false);
                            fqVar2.clearAnimation();
                            fqVar2.animate().translationX(0.0f).setInterpolator(mr.h).start();
                            wyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        wy wyVar2 = this.b;
                        fq fqVar22 = wyVar2.d;
                        fqVar22.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.r;
                        if (vyVar2 != null) {
                            vyVar2.C1();
                            vyVar2.E1(null);
                            vyVar2.F1(true, true);
                        }
                        wyVar2.f(false);
                        fqVar22.clearAnimation();
                        fqVar22.animate().translationX(0.0f).setInterpolator(mr.h).start();
                        wyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        if (i10 != 1 || (kzVar.Z1 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            vy vyVar = new vy(this, context, i10 == 0 ? 3 : 0, kzVar.W1, i10);
            this.r = vyVar;
            vyVar.t3 = z4;
            vyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) fqVar.getPaint().measureText(((Object) fqVar.getHint()) + "")));
            if (kzVar.r0) {
                vyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)));
            }
            final int i14 = 0;
            vyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.uy
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            wy wyVar = this.b;
                            wyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            wyVar.d(num.intValue() > 0);
                            wyVar.g(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            wy wyVar2 = this.b;
                            kz kzVar2 = wyVar2.D;
                            vy vyVar2 = wyVar2.r;
                            if (tw0Var != null) {
                                if (vyVar2.getSelectedCategory() != tw0Var) {
                                    wyVar2.c(tw0Var.a, false);
                                    vyVar2.E1(tw0Var);
                                    break;
                                } else {
                                    wyVar2.c(null, false);
                                    vyVar2.E1(null);
                                    break;
                                }
                            } else {
                                wyVar2.d(false);
                                vyVar2.E1(null);
                                kzVar2.l0.d.setText("");
                                kzVar2.f0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            vyVar.setOnTouchListener(new m.d2(this, 2));
            final int i15 = 1;
            vyVar.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.Components.uy
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            wy wyVar = this.b;
                            wyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            wyVar.d(num.intValue() > 0);
                            wyVar.g(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            wy wyVar2 = this.b;
                            kz kzVar2 = wyVar2.D;
                            vy vyVar2 = wyVar2.r;
                            if (tw0Var != null) {
                                if (vyVar2.getSelectedCategory() != tw0Var) {
                                    wyVar2.c(tw0Var.a, false);
                                    vyVar2.E1(tw0Var);
                                    break;
                                } else {
                                    wyVar2.c(null, false);
                                    vyVar2.E1(null);
                                    break;
                                }
                            } else {
                                wyVar2.d(false);
                                vyVar2.E1(null);
                                kzVar2.l0.d.setText("");
                                kzVar2.f0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(vyVar, k7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(wy wyVar, boolean z4, boolean z10) {
        wyVar.a.a(z4, z10);
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
        kz kzVar = this.D;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                kzVar.P.F(str, z4);
                return;
            } else {
                if (i10 == 2) {
                    kzVar.g0.G(str, z4);
                    return;
                }
                return;
            }
        }
        fz fzVar = kzVar.w0;
        dz dzVar = fzVar.L;
        kz kzVar2 = fzVar.N;
        sw swVar = kzVar2.D0;
        pw pwVar = kzVar2.A0;
        if (fzVar.I != 0) {
            ConnectionsManager.getInstance(kzVar2.Z0).cancelRequest(fzVar.I, true);
            fzVar.I = 0;
        }
        if (TextUtils.isEmpty(str)) {
            fzVar.K = null;
            fzVar.B.clear();
            fzVar.E.clear();
            fzVar.H = new ArrayList();
            f2.o0 adapter = pwVar.getAdapter();
            bz bzVar = kzVar2.v0;
            if (adapter != bzVar) {
                pwVar.setAdapter(bzVar);
            }
            fzVar.d = 0L;
            kzVar2.a.a(false, true);
            fzVar.l();
            swVar.e(false);
        } else {
            fzVar.K = str.toLowerCase();
            swVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(dzVar);
        AndroidUtilities.runOnUIThread(dzVar, 300L);
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
        this.y.setInterpolator(mr.h);
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
                up upVar = new up(this, 15);
                this.B = upVar;
                AndroidUtilities.runOnUIThread(upVar, 340L);
                return;
            }
            return;
        }
        up upVar2 = this.B;
        if (upVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(upVar2);
            this.B = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z4) {
        boolean z10 = this.C;
        fq fqVar = this.d;
        vy vyVar = this.r;
        if (!z10 || ((fqVar.length() == 0 && (vyVar == null || vyVar.getSelectedCategory() == null)) || z4)) {
            this.c.b((fqVar.length() > 0 || (vyVar != null && vyVar.l3 > 0.5f && (vyVar.g3 || vyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.C = false;
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
