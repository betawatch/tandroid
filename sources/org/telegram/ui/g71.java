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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class g71 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.jh0 d;
    public final View e;
    public final org.telegram.ui.Components.zn0 f;
    public final org.telegram.ui.Cells.c6 h;
    public f71 n;
    public float r;
    public ValueAnimator s;
    public tz0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ r71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(r71 r71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = r71Var.Z0;
        this.y = r71Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.w0(i12, c6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        bi.a2 a2Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp2));
        addView(frameLayout, w7.z5.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0();
        this.f = zn0Var;
        zn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.g6.Je;
        zn0Var.a(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        imageView.setImageDrawable(zn0Var);
        final i61 i61Var = (i61) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = i61Var2.h;
                        if (i61Var2.f.k == 1) {
                            c6Var2.setText("");
                            i61Var2.y.v(null, true, false);
                            f71 f71Var = i61Var2.n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.n.H1(true, true);
                                i61Var2.n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.y.v(null, true, false);
                        f71 f71Var2 = i61Var4.n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(i61Var, context, z10);
        this.d = jh0Var;
        frameLayout.addView(jh0Var, w7.z5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(i61Var, context, c6Var, i11);
        this.h = c6Var2;
        c6Var2.addTextChangedListener(new n0(i61Var, 15));
        c6Var2.setBackground(null);
        c6Var2.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var2.setTextSize(1, 16.0f);
        c6Var2.setHint(LocaleController.getString(R.string.Search));
        c6Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        c6Var2.setImeOptions(268435459);
        c6Var2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        c6Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var2.setGravity(19);
        c6Var2.setCursorWidth(1.5f);
        c6Var2.setMaxLines(1);
        c6Var2.setSingleLine(true);
        c6Var2.setLines(1);
        c6Var2.setTranslationY(AndroidUtilities.dp(-1.0f));
        jh0Var.addView(c6Var2, w7.z5.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            jh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = i61Var2.h;
                        if (i61Var2.f.k == 1) {
                            c6Var22.setText("");
                            i61Var2.y.v(null, true, false);
                            f71 f71Var = i61Var2.n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.n.H1(true, true);
                                i61Var2.n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.y.v(null, true, false);
                        f71 f71Var2 = i61Var4.n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.i2(i61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = i61Var2.h;
                        if (i61Var2.f.k == 1) {
                            c6Var22.setText("");
                            i61Var2.y.v(null, true, false);
                            f71 f71Var = i61Var2.n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.n.H1(true, true);
                                i61Var2.n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.y.v(null, true, false);
                        f71 f71Var2 = i61Var4.n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (ah.x0.d) {
            return;
        }
        b();
    }

    public static void a(i61 i61Var, boolean z10) {
        if (z10) {
            if (i61Var.v == null) {
                tz0 tz0Var = new tz0(i61Var, 15);
                i61Var.v = tz0Var;
                AndroidUtilities.runOnUIThread(tz0Var, 340L);
                return;
            }
            return;
        }
        tz0 tz0Var2 = i61Var.v;
        if (tz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(tz0Var2);
            i61Var.v = null;
        }
        AndroidUtilities.updateViewShow(i61Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        r71 r71Var = this.y;
        int i10 = r71Var.W;
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
                f71 f71Var = new f71(this, getContext(), i11, r71Var.Z0);
                this.n = f71Var;
                f71Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                f71 f71Var2 = this.n;
                org.telegram.ui.Cells.c6 c6Var = this.h;
                f71Var2.setDontOccupyWidth((int) c6Var.getPaint().measureText(((Object) c6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.d71
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                g71 g71Var = this.b;
                                g71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                g71Var.c(num.intValue() > 0);
                                g71Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                                g71 g71Var2 = this.b;
                                r71 r71Var2 = g71Var2.y;
                                if (g71Var2.n.getSelectedCategory() != qx0Var) {
                                    r71Var2.v(qx0Var.a, false, false);
                                    g71Var2.n.G1(qx0Var);
                                    break;
                                } else {
                                    r71Var2.v(null, false, false);
                                    g71Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.d71
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                g71 g71Var = this.b;
                                g71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                g71Var.c(num.intValue() > 0);
                                g71Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                                g71 g71Var2 = this.b;
                                r71 r71Var2 = g71Var2.y;
                                if (g71Var2.n.getSelectedCategory() != qx0Var) {
                                    r71Var2.v(qx0Var.a, false, false);
                                    g71Var2.n.G1(qx0Var);
                                    break;
                                } else {
                                    r71Var2.v(null, false, false);
                                    g71Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.z5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
            }
            i11 = 1;
            f71 f71Var3 = new f71(this, getContext(), i11, r71Var.Z0);
            this.n = f71Var3;
            f71Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            f71 f71Var22 = this.n;
            org.telegram.ui.Cells.c6 c6Var2 = this.h;
            f71Var22.setDontOccupyWidth((int) c6Var2.getPaint().measureText(((Object) c6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.d71
                public final /* synthetic */ g71 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            g71 g71Var = this.b;
                            g71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            g71Var.c(num.intValue() > 0);
                            g71Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                            g71 g71Var2 = this.b;
                            r71 r71Var2 = g71Var2.y;
                            if (g71Var2.n.getSelectedCategory() != qx0Var) {
                                r71Var2.v(qx0Var.a, false, false);
                                g71Var2.n.G1(qx0Var);
                                break;
                            } else {
                                r71Var2.v(null, false, false);
                                g71Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.d71
                public final /* synthetic */ g71 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            g71 g71Var = this.b;
                            g71Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            g71Var.c(num.intValue() > 0);
                            g71Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                            g71 g71Var2 = this.b;
                            r71 r71Var2 = g71Var2.y;
                            if (g71Var2.n.getSelectedCategory() != qx0Var) {
                                r71Var2.v(qx0Var.a, false, false);
                                g71Var2.n.G1(qx0Var);
                                break;
                            } else {
                                r71Var2.v(null, false, false);
                                g71Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.z5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
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
        this.s.setInterpolator(org.telegram.ui.Components.es.h);
        this.s.start();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.y.Z0))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(boolean z10) {
        f71 f71Var;
        f71 f71Var2;
        org.telegram.ui.Components.zn0 zn0Var = this.f;
        int i10 = zn0Var.k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        if (i10 != 2 || ((c6Var.length() == 0 && ((f71Var2 = this.n) == null || f71Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (c6Var.length() > 0 || ((f71Var = this.n) != null && f71Var.m3 > 0.5f && (f71Var.h3 || f71Var.getSelectedCategory() != null))) ? 1 : 0;
            zn0Var.b(r62);
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
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
