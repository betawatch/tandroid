package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class a71 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.sg0 d;
    public final View e;
    public final org.telegram.ui.Components.hn0 f;
    public final org.telegram.ui.Cells.d6 h;
    public z61 n;
    public float r;
    public ValueAnimator s;
    public k01 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ l71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(l71 l71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = l71Var.Z0;
        this.y = l71Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        bi.g gVar = xf.k0.a;
        frameLayout.setOutlineProvider(new xf.j0(0, dp2));
        addView(frameLayout, w7.a6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0();
        this.f = hn0Var;
        hn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.j6.Je;
        hn0Var.a(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        imageView.setImageDrawable(hn0Var);
        final c61 c61Var = (c61) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.w61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var = c61Var2.h;
                        if (c61Var2.f.k == 1) {
                            d6Var.setText("");
                            c61Var2.y.v(null, true, false);
                            z61 z61Var = c61Var2.n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.n.F1(true, true);
                                c61Var2.n.C1();
                            }
                            d6Var.clearAnimation();
                            d6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var4.h;
                        d6Var2.setText("");
                        c61Var4.y.v(null, true, false);
                        z61 z61Var2 = c61Var4.n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.n.F1(true, true);
                        }
                        d6Var2.clearAnimation();
                        d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(c61Var, context, z10);
        this.d = sg0Var;
        frameLayout.addView(sg0Var, w7.a6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(c61Var, context, f6Var, i11);
        this.h = d6Var;
        d6Var.addTextChangedListener(new m0(c61Var, 15));
        d6Var.setBackground(null);
        d6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        d6Var.setTextSize(1, 16.0f);
        d6Var.setHint(LocaleController.getString(R.string.Search));
        d6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        d6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        d6Var.setImeOptions(268435459);
        d6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        d6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        d6Var.setGravity(19);
        d6Var.setCursorWidth(1.5f);
        d6Var.setMaxLines(1);
        d6Var.setSingleLine(true);
        d6Var.setLines(1);
        d6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        sg0Var.addView(d6Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            sg0Var.addView(view, w7.a6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.w61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var2.h;
                        if (c61Var2.f.k == 1) {
                            d6Var2.setText("");
                            c61Var2.y.v(null, true, false);
                            z61 z61Var = c61Var2.n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.n.F1(true, true);
                                c61Var2.n.C1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = c61Var4.h;
                        d6Var22.setText("");
                        c61Var4.y.v(null, true, false);
                        z61 z61Var2 = c61Var4.n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.n.F1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new bi.v2(c61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.w61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var2.h;
                        if (c61Var2.f.k == 1) {
                            d6Var2.setText("");
                            c61Var2.y.v(null, true, false);
                            z61 z61Var = c61Var2.n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.n.F1(true, true);
                                c61Var2.n.C1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = c61Var4.h;
                        d6Var22.setText("");
                        c61Var4.y.v(null, true, false);
                        z61 z61Var2 = c61Var4.n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.n.F1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (yg.f0.d) {
            return;
        }
        b();
    }

    public static void a(c61 c61Var, boolean z10) {
        if (z10) {
            if (c61Var.v == null) {
                k01 k01Var = new k01(c61Var, 14);
                c61Var.v = k01Var;
                AndroidUtilities.runOnUIThread(k01Var, 340L);
                return;
            }
            return;
        }
        k01 k01Var2 = c61Var.v;
        if (k01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(k01Var2);
            c61Var.v = null;
        }
        AndroidUtilities.updateViewShow(c61Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        l71 l71Var = this.y;
        int i10 = l71Var.W;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i11 = 2;
        if (i10 == 1 || i10 == 11 || i10 == 2 || i10 == 0 || i10 == 12 || i10 == 4 || i10 == 10 || i10 == 9 || i10 == 14) {
            if (i10 != 0) {
                if (i10 != 4) {
                    if (i10 != 12) {
                        i11 = 0;
                    }
                }
                z61 z61Var = new z61(this, getContext(), i11, l71Var.Z0);
                this.n = z61Var;
                z61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                z61 z61Var2 = this.n;
                org.telegram.ui.Cells.d6 d6Var = this.h;
                z61Var2.setDontOccupyWidth((int) d6Var.getPaint().measureText(((Object) d6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.x61
                    public final /* synthetic */ a71 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                a71 a71Var = this.b;
                                a71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                a71Var.c(num.intValue() > 0);
                                a71Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.dx0 dx0Var = (org.telegram.ui.Components.dx0) obj;
                                a71 a71Var2 = this.b;
                                l71 l71Var2 = a71Var2.y;
                                if (a71Var2.n.getSelectedCategory() != dx0Var) {
                                    l71Var2.v(dx0Var.a, false, false);
                                    a71Var2.n.E1(dx0Var);
                                    break;
                                } else {
                                    l71Var2.v(null, false, false);
                                    a71Var2.n.E1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.x61
                    public final /* synthetic */ a71 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                a71 a71Var = this.b;
                                a71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                a71Var.c(num.intValue() > 0);
                                a71Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.dx0 dx0Var = (org.telegram.ui.Components.dx0) obj;
                                a71 a71Var2 = this.b;
                                l71 l71Var2 = a71Var2.y;
                                if (a71Var2.n.getSelectedCategory() != dx0Var) {
                                    l71Var2.v(dx0Var.a, false, false);
                                    a71Var2.n.E1(dx0Var);
                                    break;
                                } else {
                                    l71Var2.v(null, false, false);
                                    a71Var2.n.E1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.a6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            z61 z61Var3 = new z61(this, getContext(), i11, l71Var.Z0);
            this.n = z61Var3;
            z61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            z61 z61Var22 = this.n;
            org.telegram.ui.Cells.d6 d6Var2 = this.h;
            z61Var22.setDontOccupyWidth((int) d6Var2.getPaint().measureText(((Object) d6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.x61
                public final /* synthetic */ a71 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            a71 a71Var = this.b;
                            a71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            a71Var.c(num.intValue() > 0);
                            a71Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.dx0 dx0Var = (org.telegram.ui.Components.dx0) obj;
                            a71 a71Var2 = this.b;
                            l71 l71Var2 = a71Var2.y;
                            if (a71Var2.n.getSelectedCategory() != dx0Var) {
                                l71Var2.v(dx0Var.a, false, false);
                                a71Var2.n.E1(dx0Var);
                                break;
                            } else {
                                l71Var2.v(null, false, false);
                                a71Var2.n.E1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.x61
                public final /* synthetic */ a71 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            a71 a71Var = this.b;
                            a71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            a71Var.c(num.intValue() > 0);
                            a71Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.dx0 dx0Var = (org.telegram.ui.Components.dx0) obj;
                            a71 a71Var2 = this.b;
                            l71 l71Var2 = a71Var2.y;
                            if (a71Var2.n.getSelectedCategory() != dx0Var) {
                                l71Var2.v(dx0Var.a, false, false);
                                a71Var2.n.E1(dx0Var);
                                break;
                            } else {
                                l71Var2.v(null, false, false);
                                a71Var2.n.E1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.a6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.w) {
            return;
        }
        this.w = z10;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new f21(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.wr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        z61 z61Var;
        z61 z61Var2;
        org.telegram.ui.Components.hn0 hn0Var = this.f;
        int i10 = hn0Var.k;
        org.telegram.ui.Cells.d6 d6Var = this.h;
        if (i10 != 2 || ((d6Var.length() == 0 && ((z61Var2 = this.n) == null || z61Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (d6Var.length() > 0 || ((z61Var = this.n) != null && z61Var.o3 > 0.5f && (z61Var.j3 || z61Var.getSelectedCategory() != null))) ? 1 : 0;
            hn0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.y.Z0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
