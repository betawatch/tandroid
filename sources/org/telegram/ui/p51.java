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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class p51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ag.d0 d;
    public final View e;
    public final org.telegram.ui.Components.lm0 f;
    public final gh.r h;
    public o51 n;
    public float r;
    public ValueAnimator s;
    public ky0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ a61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(a61 a61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = a61Var.V0;
        this.y = a61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        cg.l1 l1Var = gf.r0.a;
        frameLayout.setOutlineProvider(new gf.q0(0, dp2));
        addView(frameLayout, h7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0();
        this.f = lm0Var;
        lm0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.g6.Je;
        lm0Var.a(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        imageView.setImageDrawable(lm0Var);
        final r41 r41Var = (r41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.l51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar = r41Var2.h;
                        if (r41Var2.f.k == 1) {
                            rVar.setText("");
                            r41Var2.y.v(null, true, false);
                            o51 o51Var = r41Var2.n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.n.G1(true, true);
                                r41Var2.n.D1();
                            }
                            rVar.clearAnimation();
                            rVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar2 = r41Var4.h;
                        rVar2.setText("");
                        r41Var4.y.v(null, true, false);
                        o51 o51Var2 = r41Var4.n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.n.G1(true, true);
                        }
                        rVar2.clearAnimation();
                        rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, h7.z5.e(36, 36, 51));
        ag.d0 d0Var = new ag.d0(r41Var, context, z10);
        this.d = d0Var;
        frameLayout.addView(d0Var, h7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        gh.r rVar = new gh.r(r41Var, context, c6Var, i14);
        this.h = rVar;
        rVar.addTextChangedListener(new p0(r41Var, 15));
        rVar.setBackground(null);
        rVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        rVar.setTextSize(1, 16.0f);
        rVar.setHint(LocaleController.getString(R.string.Search));
        rVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setImeOptions(268435459);
        rVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        rVar.setCursorSize(AndroidUtilities.dp(20.0f));
        rVar.setGravity(19);
        rVar.setCursorWidth(1.5f);
        rVar.setMaxLines(1);
        rVar.setSingleLine(true);
        rVar.setLines(1);
        rVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        d0Var.addView(rVar, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            d0Var.addView(view, h7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.l51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar2 = r41Var2.h;
                        if (r41Var2.f.k == 1) {
                            rVar2.setText("");
                            r41Var2.y.v(null, true, false);
                            o51 o51Var = r41Var2.n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.n.G1(true, true);
                                r41Var2.n.D1();
                            }
                            rVar2.clearAnimation();
                            rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar22 = r41Var4.h;
                        rVar22.setText("");
                        r41Var4.y.v(null, true, false);
                        o51 o51Var2 = r41Var4.n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.n.G1(true, true);
                        }
                        rVar22.clearAnimation();
                        rVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new lh.c2(r41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.l51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar2 = r41Var2.h;
                        if (r41Var2.f.k == 1) {
                            rVar2.setText("");
                            r41Var2.y.v(null, true, false);
                            o51 o51Var = r41Var2.n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.n.G1(true, true);
                                r41Var2.n.D1();
                            }
                            rVar2.clearAnimation();
                            rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar22 = r41Var4.h;
                        rVar22.setText("");
                        r41Var4.y.v(null, true, false);
                        o51 o51Var2 = r41Var4.n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.n.G1(true, true);
                        }
                        rVar22.clearAnimation();
                        rVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, h7.z5.e(36, 36, 53));
        if (ig.g0.d) {
            return;
        }
        b();
    }

    public static void a(r41 r41Var, boolean z10) {
        if (z10) {
            if (r41Var.v == null) {
                ky0 ky0Var = new ky0(r41Var, 16);
                r41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = r41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            r41Var.v = null;
        }
        AndroidUtilities.updateViewShow(r41Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        a61 a61Var = this.y;
        int i10 = a61Var.S;
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
                o51 o51Var = new o51(this, getContext(), i11, a61Var.V0);
                this.n = o51Var;
                o51Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                o51 o51Var2 = this.n;
                gh.r rVar = this.h;
                o51Var2.setDontOccupyWidth((int) rVar.getPaint().measureText(((Object) rVar.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.m51
                    public final /* synthetic */ p51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                p51 p51Var = this.b;
                                p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                p51Var.c(num.intValue() > 0);
                                p51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                                p51 p51Var2 = this.b;
                                a61 a61Var2 = p51Var2.y;
                                if (p51Var2.n.getSelectedCategory() != cw0Var) {
                                    a61Var2.v(cw0Var.a, false, false);
                                    p51Var2.n.F1(cw0Var);
                                    break;
                                } else {
                                    a61Var2.v(null, false, false);
                                    p51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.m51
                    public final /* synthetic */ p51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                p51 p51Var = this.b;
                                p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                p51Var.c(num.intValue() > 0);
                                p51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                                p51 p51Var2 = this.b;
                                a61 a61Var2 = p51Var2.y;
                                if (p51Var2.n.getSelectedCategory() != cw0Var) {
                                    a61Var2.v(cw0Var.a, false, false);
                                    p51Var2.n.F1(cw0Var);
                                    break;
                                } else {
                                    a61Var2.v(null, false, false);
                                    p51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, h7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            o51 o51Var3 = new o51(this, getContext(), i11, a61Var.V0);
            this.n = o51Var3;
            o51Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            o51 o51Var22 = this.n;
            gh.r rVar2 = this.h;
            o51Var22.setDontOccupyWidth((int) rVar2.getPaint().measureText(((Object) rVar2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.m51
                public final /* synthetic */ p51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            p51 p51Var = this.b;
                            p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            p51Var.c(num.intValue() > 0);
                            p51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                            p51 p51Var2 = this.b;
                            a61 a61Var2 = p51Var2.y;
                            if (p51Var2.n.getSelectedCategory() != cw0Var) {
                                a61Var2.v(cw0Var.a, false, false);
                                p51Var2.n.F1(cw0Var);
                                break;
                            } else {
                                a61Var2.v(null, false, false);
                                p51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.m51
                public final /* synthetic */ p51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            p51 p51Var = this.b;
                            p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            p51Var.c(num.intValue() > 0);
                            p51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                            p51 p51Var2 = this.b;
                            a61 a61Var2 = p51Var2.y;
                            if (p51Var2.n.getSelectedCategory() != cw0Var) {
                                a61Var2.v(cw0Var.a, false, false);
                                p51Var2.n.F1(cw0Var);
                                break;
                            } else {
                                a61Var2.v(null, false, false);
                                p51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, h7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new w01(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.er.h);
        this.s.start();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.y.V0))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(boolean z10) {
        o51 o51Var;
        o51 o51Var2;
        org.telegram.ui.Components.lm0 lm0Var = this.f;
        int i10 = lm0Var.k;
        gh.r rVar = this.h;
        if (i10 != 2 || ((rVar.length() == 0 && ((o51Var2 = this.n) == null || o51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (rVar.length() > 0 || ((o51Var = this.n) != null && o51Var.k3 > 0.5f && (o51Var.f3 || o51Var.getSelectedCategory() != null))) ? 1 : 0;
            lm0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
