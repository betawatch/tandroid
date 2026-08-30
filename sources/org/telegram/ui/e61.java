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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class e61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final eg.y d;
    public final View e;
    public final org.telegram.ui.Components.fn0 f;
    public final dh.b h;
    public d61 n;
    public float r;
    public ValueAnimator s;
    public vy0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ q61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(q61 q61Var, Context context, boolean z4) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = q61Var.W0;
        this.y = q61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z4) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        gg.j1 j1Var = lf.q0.a;
        frameLayout.setOutlineProvider(new lf.p0(0, dp2));
        addView(frameLayout, k7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.fn0 fn0Var = new org.telegram.ui.Components.fn0();
        this.f = fn0Var;
        fn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.j6.Je;
        fn0Var.a(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        imageView.setImageDrawable(fn0Var);
        final g51 g51Var = (g51) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g51 g51Var2 = g51Var;
                        dh.b bVar = g51Var2.h;
                        if (g51Var2.f.k == 1) {
                            bVar.setText("");
                            g51Var2.y.v(null, true, false);
                            d61 d61Var = g51Var2.n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.n.G1(true, true);
                                g51Var2.n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar2 = g51Var4.h;
                        bVar2.setText("");
                        g51Var4.y.v(null, true, false);
                        d61 d61Var2 = g51Var4.n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        eg.y yVar = new eg.y(g51Var, context, z4);
        this.d = yVar;
        frameLayout.addView(yVar, k7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        dh.b bVar = new dh.b(g51Var, context, f6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(g51Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z4) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, k7.b6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        g51 g51Var2 = g51Var;
                        dh.b bVar2 = g51Var2.h;
                        if (g51Var2.f.k == 1) {
                            bVar2.setText("");
                            g51Var2.y.v(null, true, false);
                            d61 d61Var = g51Var2.n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.n.G1(true, true);
                                g51Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar22 = g51Var4.h;
                        bVar22.setText("");
                        g51Var4.y.v(null, true, false);
                        d61 d61Var2 = g51Var4.n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(g51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        final int i14 = 2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        g51 g51Var2 = g51Var;
                        dh.b bVar2 = g51Var2.h;
                        if (g51Var2.f.k == 1) {
                            bVar2.setText("");
                            g51Var2.y.v(null, true, false);
                            d61 d61Var = g51Var2.n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.n.G1(true, true);
                                g51Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar22 = g51Var4.h;
                        bVar22.setText("");
                        g51Var4.y.v(null, true, false);
                        d61 d61Var2 = g51Var4.n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        if (mg.g0.d) {
            return;
        }
        b();
    }

    public static void a(g51 g51Var, boolean z4) {
        if (z4) {
            if (g51Var.v == null) {
                vy0 vy0Var = new vy0(g51Var, 16);
                g51Var.v = vy0Var;
                AndroidUtilities.runOnUIThread(vy0Var, 340L);
                return;
            }
            return;
        }
        vy0 vy0Var2 = g51Var.v;
        if (vy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(vy0Var2);
            g51Var.v = null;
        }
        AndroidUtilities.updateViewShow(g51Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        q61 q61Var = this.y;
        int i10 = q61Var.T;
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
                d61 d61Var = new d61(this, getContext(), i11, q61Var.W0);
                this.n = d61Var;
                d61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                d61 d61Var2 = this.n;
                dh.b bVar = this.h;
                d61Var2.setDontOccupyWidth((int) bVar.getPaint().measureText(((Object) bVar.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.b61
                    public final /* synthetic */ e61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                e61 e61Var = this.b;
                                e61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                e61Var.c(num.intValue() > 0);
                                e61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                                e61 e61Var2 = this.b;
                                q61 q61Var2 = e61Var2.y;
                                if (e61Var2.n.getSelectedCategory() != tw0Var) {
                                    q61Var2.v(tw0Var.a, false, false);
                                    e61Var2.n.F1(tw0Var);
                                    break;
                                } else {
                                    q61Var2.v(null, false, false);
                                    e61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.b61
                    public final /* synthetic */ e61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                e61 e61Var = this.b;
                                e61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                e61Var.c(num.intValue() > 0);
                                e61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                                e61 e61Var2 = this.b;
                                q61 q61Var2 = e61Var2.y;
                                if (e61Var2.n.getSelectedCategory() != tw0Var) {
                                    q61Var2.v(tw0Var.a, false, false);
                                    e61Var2.n.F1(tw0Var);
                                    break;
                                } else {
                                    q61Var2.v(null, false, false);
                                    e61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, k7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            d61 d61Var3 = new d61(this, getContext(), i11, q61Var.W0);
            this.n = d61Var3;
            d61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            d61 d61Var22 = this.n;
            dh.b bVar2 = this.h;
            d61Var22.setDontOccupyWidth((int) bVar2.getPaint().measureText(((Object) bVar2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.b61
                public final /* synthetic */ e61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            e61 e61Var = this.b;
                            e61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            e61Var.c(num.intValue() > 0);
                            e61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                            e61 e61Var2 = this.b;
                            q61 q61Var2 = e61Var2.y;
                            if (e61Var2.n.getSelectedCategory() != tw0Var) {
                                q61Var2.v(tw0Var.a, false, false);
                                e61Var2.n.F1(tw0Var);
                                break;
                            } else {
                                q61Var2.v(null, false, false);
                                e61Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.b61
                public final /* synthetic */ e61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            e61 e61Var = this.b;
                            e61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            e61Var.c(num.intValue() > 0);
                            e61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                            e61 e61Var2 = this.b;
                            q61 q61Var2 = e61Var2.y;
                            if (e61Var2.n.getSelectedCategory() != tw0Var) {
                                q61Var2.v(tw0Var.a, false, false);
                                e61Var2.n.F1(tw0Var);
                                break;
                            } else {
                                q61Var2.v(null, false, false);
                                e61Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, k7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z4) {
        if (z4 == this.w) {
            return;
        }
        this.w = z4;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z4 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new h11(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.nr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z4) {
        d61 d61Var;
        d61 d61Var2;
        org.telegram.ui.Components.fn0 fn0Var = this.f;
        int i10 = fn0Var.k;
        dh.b bVar = this.h;
        if (i10 != 2 || ((bVar.length() == 0 && ((d61Var2 = this.n) == null || d61Var2.getSelectedCategory() == null)) || z4)) {
            ?? r62 = (bVar.length() > 0 || ((d61Var = this.n) != null && d61Var.l3 > 0.5f && (d61Var.g3 || d61Var.getSelectedCategory() != null))) ? 1 : 0;
            fn0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.y.W0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
