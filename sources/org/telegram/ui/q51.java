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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class q51 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.tf0 d;
    public final View e;
    public final org.telegram.ui.Components.im0 f;
    public final fh.s h;
    public p51 n;
    public float r;
    public ValueAnimator s;
    public ky0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ b61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(b61 b61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        this.y = b61Var;
        final int i9 = 0;
        this.w = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.f6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        bg.q1 q1Var = ff.r0.a;
        frameLayout.setOutlineProvider(new ff.q0(0, dp2));
        addView(frameLayout, g7.e6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0();
        this.f = im0Var;
        im0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.f6.Je;
        im0Var.a(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        imageView.setImageDrawable(im0Var);
        final s41 s41Var = (s41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            sVar.setText("");
                            s41Var2.y.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.n.G1(true, true);
                                s41Var2.n.D1();
                            }
                            sVar.clearAnimation();
                            sVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar2 = s41Var4.h;
                        sVar2.setText("");
                        s41Var4.y.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.n.G1(true, true);
                        }
                        sVar2.clearAnimation();
                        sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i13 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(s41Var, context, z10);
        this.d = tf0Var;
        frameLayout.addView(tf0Var, g7.e6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        fh.s sVar = new fh.s(s41Var, context, b6Var, i13);
        this.h = sVar;
        sVar.addTextChangedListener(new o0(s41Var, 15));
        sVar.setBackground(null);
        sVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        sVar.setTextSize(1, 16.0f);
        sVar.setHint(LocaleController.getString(R.string.Search));
        sVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        sVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        sVar.setImeOptions(268435459);
        sVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Mh, b6Var));
        sVar.setCursorSize(AndroidUtilities.dp(20.0f));
        sVar.setGravity(19);
        sVar.setCursorWidth(1.5f);
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setLines(1);
        sVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        tf0Var.addView(sVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            tf0Var.addView(view, g7.e6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar2 = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            sVar2.setText("");
                            s41Var2.y.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.n.G1(true, true);
                                s41Var2.n.D1();
                            }
                            sVar2.clearAnimation();
                            sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar22 = s41Var4.h;
                        sVar22.setText("");
                        s41Var4.y.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.n.G1(true, true);
                        }
                        sVar22.clearAnimation();
                        sVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new kh.e2(s41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar2 = s41Var2.h;
                        if (s41Var2.f.k == 1) {
                            sVar2.setText("");
                            s41Var2.y.v(null, true, false);
                            p51 p51Var = s41Var2.n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.n.G1(true, true);
                                s41Var2.n.D1();
                            }
                            sVar2.clearAnimation();
                            sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar22 = s41Var4.h;
                        sVar22.setText("");
                        s41Var4.y.v(null, true, false);
                        p51 p51Var2 = s41Var4.n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.n.G1(true, true);
                        }
                        sVar22.clearAnimation();
                        sVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        if (hg.h0.d) {
            return;
        }
        b();
    }

    public static void a(s41 s41Var, boolean z10) {
        if (z10) {
            if (s41Var.v == null) {
                ky0 ky0Var = new ky0(s41Var, 16);
                s41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = s41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            s41Var.v = null;
        }
        AndroidUtilities.updateViewShow(s41Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        b61 b61Var = this.y;
        int i9 = b61Var.S;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i10 = 2;
        if (i9 == 1 || i9 == 11 || i9 == 2 || i9 == 0 || i9 == 12 || i9 == 4 || i9 == 10 || i9 == 9 || i9 == 14) {
            if (i9 != 0) {
                if (i9 != 4) {
                    if (i9 != 12) {
                        i10 = 0;
                    }
                }
                p51 p51Var = new p51(this, getContext(), i10, b61Var.V0);
                this.n = p51Var;
                p51Var.setShownButtonsAtStart(i9 != 4 ? 6.5f : 4.5f);
                p51 p51Var2 = this.n;
                fh.s sVar = this.h;
                p51Var2.setDontOccupyWidth((int) sVar.getPaint().measureText(((Object) sVar.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                    public final /* synthetic */ q51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                q51 q51Var = this.b;
                                q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                q51Var.c(num.intValue() > 0);
                                q51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) obj;
                                q51 q51Var2 = this.b;
                                b61 b61Var2 = q51Var2.y;
                                if (q51Var2.n.getSelectedCategory() != aw0Var) {
                                    b61Var2.v(aw0Var.a, false, false);
                                    q51Var2.n.F1(aw0Var);
                                    break;
                                } else {
                                    b61Var2.v(null, false, false);
                                    q51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
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
                                q51Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) obj;
                                q51 q51Var2 = this.b;
                                b61 b61Var2 = q51Var2.y;
                                if (q51Var2.n.getSelectedCategory() != aw0Var) {
                                    b61Var2.v(aw0Var.a, false, false);
                                    q51Var2.n.F1(aw0Var);
                                    break;
                                } else {
                                    b61Var2.v(null, false, false);
                                    q51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, g7.e6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            p51 p51Var3 = new p51(this, getContext(), i10, b61Var.V0);
            this.n = p51Var3;
            p51Var3.setShownButtonsAtStart(i9 != 4 ? 6.5f : 4.5f);
            p51 p51Var22 = this.n;
            fh.s sVar2 = this.h;
            p51Var22.setDontOccupyWidth((int) sVar2.getPaint().measureText(((Object) sVar2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
                public final /* synthetic */ q51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            q51 q51Var = this.b;
                            q51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            q51Var.c(num.intValue() > 0);
                            q51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) obj;
                            q51 q51Var2 = this.b;
                            b61 b61Var2 = q51Var2.y;
                            if (q51Var2.n.getSelectedCategory() != aw0Var) {
                                b61Var2.v(aw0Var.a, false, false);
                                q51Var2.n.F1(aw0Var);
                                break;
                            } else {
                                b61Var2.v(null, false, false);
                                q51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.n51
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
                            q51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) obj;
                            q51 q51Var2 = this.b;
                            b61 b61Var2 = q51Var2.y;
                            if (q51Var2.n.getSelectedCategory() != aw0Var) {
                                b61Var2.v(aw0Var.a, false, false);
                                q51Var2.n.F1(aw0Var);
                                break;
                            } else {
                                b61Var2.v(null, false, false);
                                q51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, g7.e6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new v01(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.gr.h);
        this.s.start();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.y.V0))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(boolean z10) {
        p51 p51Var;
        p51 p51Var2;
        org.telegram.ui.Components.im0 im0Var = this.f;
        int i9 = im0Var.k;
        fh.s sVar = this.h;
        if (i9 != 2 || ((sVar.length() == 0 && ((p51Var2 = this.n) == null || p51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (sVar.length() > 0 || ((p51Var = this.n) != null && p51Var.k3 > 0.5f && (p51Var.f3 || p51Var.getSelectedCategory() != null))) ? 1 : 0;
            im0Var.b(r62);
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
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
