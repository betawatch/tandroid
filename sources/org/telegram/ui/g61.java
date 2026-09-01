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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class g61 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final fg.y d;
    public final View e;
    public final org.telegram.ui.Components.gn0 f;
    public final eh.b h;
    public f61 n;
    public float r;
    public ValueAnimator s;
    public xy0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ r61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(r61 r61Var, Context context, boolean z4) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = r61Var.W0;
        this.y = r61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z4) {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.k6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.v0(i12, g6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        hg.j1 j1Var = lf.q0.a;
        frameLayout.setOutlineProvider(new lf.p0(0, dp2));
        addView(frameLayout, k7.c6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.gn0 gn0Var = new org.telegram.ui.Components.gn0();
        this.f = gn0Var;
        gn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.k6.Je;
        gn0Var.a(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        imageView.setImageDrawable(gn0Var);
        final i51 i51Var = (i51) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar = i51Var2.h;
                        if (i51Var2.f.k == 1) {
                            bVar.setText("");
                            i51Var2.y.v(null, true, false);
                            f61 f61Var = i51Var2.n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.n.G1(true, true);
                                i51Var2.n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar2 = i51Var4.h;
                        bVar2.setText("");
                        i51Var4.y.v(null, true, false);
                        f61 f61Var2 = i51Var4.n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        fg.y yVar = new fg.y(i51Var, context, z4);
        this.d = yVar;
        frameLayout.addView(yVar, k7.c6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        eh.b bVar = new eh.b(i51Var, context, g6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(i51Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Mh, g6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z4) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, k7.c6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar2 = i51Var2.h;
                        if (i51Var2.f.k == 1) {
                            bVar2.setText("");
                            i51Var2.y.v(null, true, false);
                            f61 f61Var = i51Var2.n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.n.G1(true, true);
                                i51Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar22 = i51Var4.h;
                        bVar22.setText("");
                        i51Var4.y.v(null, true, false);
                        f61 f61Var2 = i51Var4.n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(i51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        final int i14 = 2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar2 = i51Var2.h;
                        if (i51Var2.f.k == 1) {
                            bVar2.setText("");
                            i51Var2.y.v(null, true, false);
                            f61 f61Var = i51Var2.n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.n.G1(true, true);
                                i51Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar22 = i51Var4.h;
                        bVar22.setText("");
                        i51Var4.y.v(null, true, false);
                        f61 f61Var2 = i51Var4.n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        if (ng.g0.d) {
            return;
        }
        b();
    }

    public static void a(i51 i51Var, boolean z4) {
        if (z4) {
            if (i51Var.v == null) {
                xy0 xy0Var = new xy0(i51Var, 15);
                i51Var.v = xy0Var;
                AndroidUtilities.runOnUIThread(xy0Var, 340L);
                return;
            }
            return;
        }
        xy0 xy0Var2 = i51Var.v;
        if (xy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xy0Var2);
            i51Var.v = null;
        }
        AndroidUtilities.updateViewShow(i51Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        r61 r61Var = this.y;
        int i10 = r61Var.T;
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
                f61 f61Var = new f61(this, getContext(), i11, r61Var.W0);
                this.n = f61Var;
                f61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                f61 f61Var2 = this.n;
                eh.b bVar = this.h;
                f61Var2.setDontOccupyWidth((int) bVar.getPaint().measureText(((Object) bVar.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.d61
                    public final /* synthetic */ g61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                g61 g61Var = this.b;
                                g61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                g61Var.c(num.intValue() > 0);
                                g61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.uw0 uw0Var = (org.telegram.ui.Components.uw0) obj;
                                g61 g61Var2 = this.b;
                                r61 r61Var2 = g61Var2.y;
                                if (g61Var2.n.getSelectedCategory() != uw0Var) {
                                    r61Var2.v(uw0Var.a, false, false);
                                    g61Var2.n.F1(uw0Var);
                                    break;
                                } else {
                                    r61Var2.v(null, false, false);
                                    g61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.d61
                    public final /* synthetic */ g61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                g61 g61Var = this.b;
                                g61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                g61Var.c(num.intValue() > 0);
                                g61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.uw0 uw0Var = (org.telegram.ui.Components.uw0) obj;
                                g61 g61Var2 = this.b;
                                r61 r61Var2 = g61Var2.y;
                                if (g61Var2.n.getSelectedCategory() != uw0Var) {
                                    r61Var2.v(uw0Var.a, false, false);
                                    g61Var2.n.F1(uw0Var);
                                    break;
                                } else {
                                    r61Var2.v(null, false, false);
                                    g61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, k7.c6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            f61 f61Var3 = new f61(this, getContext(), i11, r61Var.W0);
            this.n = f61Var3;
            f61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            f61 f61Var22 = this.n;
            eh.b bVar2 = this.h;
            f61Var22.setDontOccupyWidth((int) bVar2.getPaint().measureText(((Object) bVar2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.d61
                public final /* synthetic */ g61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            g61 g61Var = this.b;
                            g61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            g61Var.c(num.intValue() > 0);
                            g61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.uw0 uw0Var = (org.telegram.ui.Components.uw0) obj;
                            g61 g61Var2 = this.b;
                            r61 r61Var2 = g61Var2.y;
                            if (g61Var2.n.getSelectedCategory() != uw0Var) {
                                r61Var2.v(uw0Var.a, false, false);
                                g61Var2.n.F1(uw0Var);
                                break;
                            } else {
                                r61Var2.v(null, false, false);
                                g61Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.d61
                public final /* synthetic */ g61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            g61 g61Var = this.b;
                            g61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            g61Var.c(num.intValue() > 0);
                            g61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.uw0 uw0Var = (org.telegram.ui.Components.uw0) obj;
                            g61 g61Var2 = this.b;
                            r61 r61Var2 = g61Var2.y;
                            if (g61Var2.n.getSelectedCategory() != uw0Var) {
                                r61Var2.v(uw0Var.a, false, false);
                                g61Var2.n.F1(uw0Var);
                                break;
                            } else {
                                r61Var2.v(null, false, false);
                                g61Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, k7.c6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new j11(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.pr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z4) {
        f61 f61Var;
        f61 f61Var2;
        org.telegram.ui.Components.gn0 gn0Var = this.f;
        int i10 = gn0Var.k;
        eh.b bVar = this.h;
        if (i10 != 2 || ((bVar.length() == 0 && ((f61Var2 = this.n) == null || f61Var2.getSelectedCategory() == null)) || z4)) {
            ?? r62 = (bVar.length() > 0 || ((f61Var = this.n) != null && f61Var.l3 > 0.5f && (f61Var.g3 || f61Var.getSelectedCategory() != null))) ? 1 : 0;
            gn0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.y.W0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
