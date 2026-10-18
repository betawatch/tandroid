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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class o51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.dh0 d;
    public final View e;
    public final org.telegram.ui.Components.vn0 f;
    public final org.telegram.ui.Cells.b6 h;
    public n51 n;
    public float r;
    public ValueAnimator s;
    public sy0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ z51 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(z51 z51Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = z51Var.Z0;
        this.y = z51Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ci.n1 n1Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp2));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.vn0 vn0Var = new org.telegram.ui.Components.vn0();
        this.f = vn0Var;
        vn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.h6.Je;
        vn0Var.a(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        imageView.setImageDrawable(vn0Var);
        final q41 q41Var = (q41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.k51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var = q41Var2.h;
                        if (q41Var2.f.k == 1) {
                            b6Var.setText("");
                            q41Var2.y.v(null, true, false);
                            n51 n51Var = q41Var2.n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.n.H1(true, true);
                                q41Var2.n.E1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var4.h;
                        b6Var2.setText("");
                        q41Var4.y.v(null, true, false);
                        n51 n51Var2 = q41Var4.n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.n.H1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(q41Var, context, z10);
        this.d = dh0Var;
        frameLayout.addView(dh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(q41Var, context, d6Var, i11);
        this.h = b6Var;
        b6Var.addTextChangedListener(new o0(q41Var, 15));
        b6Var.setBackground(null);
        b6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        b6Var.setTextSize(1, 16.0f);
        b6Var.setHint(LocaleController.getString(R.string.Search));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        b6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        b6Var.setImeOptions(268435459);
        b6Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        b6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b6Var.setGravity(19);
        b6Var.setCursorWidth(1.5f);
        b6Var.setMaxLines(1);
        b6Var.setSingleLine(true);
        b6Var.setLines(1);
        b6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        dh0Var.addView(b6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            dh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.k51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var2.h;
                        if (q41Var2.f.k == 1) {
                            b6Var2.setText("");
                            q41Var2.y.v(null, true, false);
                            n51 n51Var = q41Var2.n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.n.H1(true, true);
                                q41Var2.n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = q41Var4.h;
                        b6Var22.setText("");
                        q41Var4.y.v(null, true, false);
                        n51 n51Var2 = q41Var4.n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(q41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.k51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var2.h;
                        if (q41Var2.f.k == 1) {
                            b6Var2.setText("");
                            q41Var2.y.v(null, true, false);
                            n51 n51Var = q41Var2.n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.n.H1(true, true);
                                q41Var2.n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = q41Var4.h;
                        b6Var22.setText("");
                        q41Var4.y.v(null, true, false);
                        n51 n51Var2 = q41Var4.n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
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

    public static void a(q41 q41Var, boolean z10) {
        if (z10) {
            if (q41Var.v == null) {
                sy0 sy0Var = new sy0(q41Var, 15);
                q41Var.v = sy0Var;
                AndroidUtilities.runOnUIThread(sy0Var, 340L);
                return;
            }
            return;
        }
        sy0 sy0Var2 = q41Var.v;
        if (sy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(sy0Var2);
            q41Var.v = null;
        }
        AndroidUtilities.updateViewShow(q41Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        z51 z51Var = this.y;
        int i10 = z51Var.W;
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
                n51 n51Var = new n51(this, getContext(), i11, z51Var.Z0);
                this.n = n51Var;
                n51Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                n51 n51Var2 = this.n;
                org.telegram.ui.Cells.b6 b6Var = this.h;
                n51Var2.setDontOccupyWidth((int) b6Var.getPaint().measureText(((Object) b6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.l51
                    public final /* synthetic */ o51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                o51 o51Var = this.b;
                                o51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                o51Var.c(num.intValue() > 0);
                                o51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.lx0 lx0Var = (org.telegram.ui.Components.lx0) obj;
                                o51 o51Var2 = this.b;
                                z51 z51Var2 = o51Var2.y;
                                if (o51Var2.n.getSelectedCategory() != lx0Var) {
                                    z51Var2.v(lx0Var.a, false, false);
                                    o51Var2.n.G1(lx0Var);
                                    break;
                                } else {
                                    z51Var2.v(null, false, false);
                                    o51Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.l51
                    public final /* synthetic */ o51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                o51 o51Var = this.b;
                                o51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                o51Var.c(num.intValue() > 0);
                                o51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.lx0 lx0Var = (org.telegram.ui.Components.lx0) obj;
                                o51 o51Var2 = this.b;
                                z51 z51Var2 = o51Var2.y;
                                if (o51Var2.n.getSelectedCategory() != lx0Var) {
                                    z51Var2.v(lx0Var.a, false, false);
                                    o51Var2.n.G1(lx0Var);
                                    break;
                                } else {
                                    z51Var2.v(null, false, false);
                                    o51Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            n51 n51Var3 = new n51(this, getContext(), i11, z51Var.Z0);
            this.n = n51Var3;
            n51Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            n51 n51Var22 = this.n;
            org.telegram.ui.Cells.b6 b6Var2 = this.h;
            n51Var22.setDontOccupyWidth((int) b6Var2.getPaint().measureText(((Object) b6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.l51
                public final /* synthetic */ o51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            o51 o51Var = this.b;
                            o51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            o51Var.c(num.intValue() > 0);
                            o51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.lx0 lx0Var = (org.telegram.ui.Components.lx0) obj;
                            o51 o51Var2 = this.b;
                            z51 z51Var2 = o51Var2.y;
                            if (o51Var2.n.getSelectedCategory() != lx0Var) {
                                z51Var2.v(lx0Var.a, false, false);
                                o51Var2.n.G1(lx0Var);
                                break;
                            } else {
                                z51Var2.v(null, false, false);
                                o51Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.l51
                public final /* synthetic */ o51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            o51 o51Var = this.b;
                            o51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            o51Var.c(num.intValue() > 0);
                            o51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.lx0 lx0Var = (org.telegram.ui.Components.lx0) obj;
                            o51 o51Var2 = this.b;
                            z51 z51Var2 = o51Var2.y;
                            if (o51Var2.n.getSelectedCategory() != lx0Var) {
                                z51Var2.v(lx0Var.a, false, false);
                                o51Var2.n.G1(lx0Var);
                                break;
                            } else {
                                z51Var2.v(null, false, false);
                                o51Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new e11(this, 7));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.bs.h);
        this.s.start();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.y.Z0))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(boolean z10) {
        n51 n51Var;
        n51 n51Var2;
        org.telegram.ui.Components.vn0 vn0Var = this.f;
        int i10 = vn0Var.k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        if (i10 != 2 || ((b6Var.length() == 0 && ((n51Var2 = this.n) == null || n51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (b6Var.length() > 0 || ((n51Var = this.n) != null && n51Var.m3 > 0.5f && (n51Var.h3 || n51Var.getSelectedCategory() != null))) ? 1 : 0;
            vn0Var.b(r62);
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
