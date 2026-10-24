package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class q51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final /* synthetic */ b61 F;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.hh0 d;
    public final View e;
    public final org.telegram.ui.Components.zn0 f;
    public final org.telegram.ui.Cells.c6 h;
    public p51 n;
    public float r;
    public ValueAnimator s;
    public my0 v;
    public boolean w;
    public boolean x;
    public ShapeDrawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(b61 b61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = b61Var.Z0;
        this.F = b61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, g6Var);
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.k6.He;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, g6Var);
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ci.n1 n1Var = zf.j0.a;
        frameLayout.setOutlineProvider(new zf.i0(0, dp2));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0();
        this.f = zn0Var;
        zn0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.k6.Je;
        zn0Var.a(org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        imageView.setImageDrawable(zn0Var);
        final s41 s41Var = (s41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            c6Var.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.n.M1(true, true);
                                s41Var2.n.J1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var4.h;
                        c6Var2.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.n.M1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(s41Var, context, z10);
        this.d = hh0Var;
        frameLayout.addView(hh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(s41Var, context, g6Var, i11);
        this.h = c6Var;
        c6Var.addTextChangedListener(new n0(s41Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.r6.F(c6Var, i13, g6Var);
        org.telegram.ui.ActionBar.r6.W(c6Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        c6Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(c6Var, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        hh0Var.addView(c6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.r6.z(this, mutate, i12, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            hh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            c6Var2.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.n.M1(true, true);
                                s41Var2.n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = s41Var4.h;
                        c6Var22.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(s41Var));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O2, g6Var);
        imageView2.setAlpha(0.0f);
        final int i15 = 2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            c6Var2.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.n.M1(true, true);
                                s41Var2.n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = s41Var4.h;
                        c6Var22.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
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

    public static void a(s41 s41Var, boolean z10) {
        if (z10) {
            if (s41Var.v == null) {
                my0 my0Var = new my0(s41Var, 16);
                s41Var.v = my0Var;
                AndroidUtilities.runOnUIThread(my0Var, 340L);
                return;
            }
            return;
        }
        my0 my0Var2 = s41Var.v;
        if (my0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(my0Var2);
            s41Var.v = null;
        }
        AndroidUtilities.updateViewShow(s41Var.c, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        b61 b61Var = this.F;
        int i10 = b61Var.W;
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
                p51 p51Var = new p51(this, getContext(), i11, b61Var.Z0);
                this.n = p51Var;
                p51Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                p51 p51Var2 = this.n;
                org.telegram.ui.Cells.c6 c6Var = this.h;
                p51Var2.setDontOccupyWidth((int) c6Var.getPaint().measureText(((Object) c6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                    public final /* synthetic */ q51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                q51 q51Var = this.b;
                                q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                q51Var.c(num.intValue() > 0);
                                q51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                                q51 q51Var2 = this.b;
                                b61 b61Var2 = q51Var2.F;
                                if (q51Var2.n.getSelectedCategory() != qx0Var) {
                                    b61Var2.v(qx0Var.a, false, false);
                                    q51Var2.n.L1(qx0Var);
                                    break;
                                } else {
                                    b61Var2.v(null, false, false);
                                    q51Var2.n.L1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                    public final /* synthetic */ q51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                q51 q51Var = this.b;
                                q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                q51Var.c(num.intValue() > 0);
                                q51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                                q51 q51Var2 = this.b;
                                b61 b61Var2 = q51Var2.F;
                                if (q51Var2.n.getSelectedCategory() != qx0Var) {
                                    b61Var2.v(qx0Var.a, false, false);
                                    q51Var2.n.L1(qx0Var);
                                    break;
                                } else {
                                    b61Var2.v(null, false, false);
                                    q51Var2.n.L1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            p51 p51Var3 = new p51(this, getContext(), i11, b61Var.Z0);
            this.n = p51Var3;
            p51Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            p51 p51Var22 = this.n;
            org.telegram.ui.Cells.c6 c6Var2 = this.h;
            p51Var22.setDontOccupyWidth((int) c6Var2.getPaint().measureText(((Object) c6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                public final /* synthetic */ q51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            q51 q51Var = this.b;
                            q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            q51Var.c(num.intValue() > 0);
                            q51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                            q51 q51Var2 = this.b;
                            b61 b61Var2 = q51Var2.F;
                            if (q51Var2.n.getSelectedCategory() != qx0Var) {
                                b61Var2.v(qx0Var.a, false, false);
                                q51Var2.n.L1(qx0Var);
                                break;
                            } else {
                                b61Var2.v(null, false, false);
                                q51Var2.n.L1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                public final /* synthetic */ q51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            q51 q51Var = this.b;
                            q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            q51Var.c(num.intValue() > 0);
                            q51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.qx0 qx0Var = (org.telegram.ui.Components.qx0) obj;
                            q51 q51Var2 = this.b;
                            b61 b61Var2 = q51Var2.F;
                            if (q51Var2.n.getSelectedCategory() != qx0Var) {
                                b61Var2.v(qx0Var.a, false, false);
                                q51Var2.n.L1(qx0Var);
                                break;
                            } else {
                                b61Var2.v(null, false, false);
                                q51Var2.n.L1(null);
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
        ofFloat.addUpdateListener(new g11(this, 7));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.bs.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        p51 p51Var;
        p51 p51Var2;
        org.telegram.ui.Components.zn0 zn0Var = this.f;
        int i10 = zn0Var.k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        if (i10 != 2 || ((c6Var.length() == 0 && ((p51Var2 = this.n) == null || p51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (c6Var.length() > 0 || ((p51Var = this.n) != null && p51Var.p3 > 0.5f && (p51Var.k3 || p51Var.getSelectedCategory() != null))) ? 1 : 0;
            zn0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.g6 g6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.zn0 zn0Var = this.f;
            if (zn0Var != null) {
                zn0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!this.x || (frameLayout = this.a) == null) {
            return;
        }
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        if (this.y != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.y;
            if (background == shapeDrawable) {
                if (o12 != this.E) {
                    org.telegram.ui.ActionBar.k6.z1(o12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.E = o12;
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), o12);
        this.y = c02;
        frameLayout.setBackground(c02);
        this.E = o12;
    }
}
