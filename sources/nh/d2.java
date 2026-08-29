package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final FrameLayout b;
    public final vm0 c;
    public final ig.f d;
    public final int e;
    public c2 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public d2(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = -1;
        this.a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ie, c6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new eg.k1(6));
        addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        vm0 vm0Var = new vm0();
        this.c = vm0Var;
        vm0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.g6.Je;
        vm0Var.a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        imageView.setImageDrawable(vm0Var);
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        ig.f fVar = new ig.f(this, context, 1);
        this.d = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.g6.Mh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        fVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(fVar, i7.f6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fVar.addTextChangedListener(new bh.c(this, 5));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(c6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: nh.z1
            public final /* synthetic */ d2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        d2 d2Var = this.b;
                        int i13 = d2Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                d2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            d2Var.b();
                            c2 c2Var = d2Var.f;
                            if (c2Var != null) {
                                c2Var.D1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: nh.z1
            public final /* synthetic */ d2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        d2 d2Var = this.b;
                        int i132 = d2Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                d2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            d2Var.b();
                            c2 c2Var = d2Var.f;
                            if (c2Var != null) {
                                c2Var.D1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        if (this.e != i10 || this.f == null) {
            c2 c2Var = this.f;
            FrameLayout frameLayout = this.b;
            if (c2Var != null) {
                frameLayout.removeView(c2Var);
            }
            c2 c2Var2 = new c2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.f = c2Var2;
            ig.f fVar = this.d;
            c2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) fVar.getPaint().measureText(((Object) fVar.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: nh.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            d2 d2Var = this.b;
                            ig.f fVar2 = d2Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            kw0 kw0Var = (kw0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.f;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != kw0Var) {
                                    d2Var2.f.F1(kw0Var);
                                    String str = kw0Var.a;
                                    int categoryIndex = d2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = d2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = d2Var2.v;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: nh.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            d2 d2Var = this.b;
                            ig.f fVar2 = d2Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            kw0 kw0Var = (kw0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.f;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != kw0Var) {
                                    d2Var2.f.F1(kw0Var);
                                    String str = kw0Var.a;
                                    int categoryIndex = d2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = d2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = d2Var2.v;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), i7.f6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        c2 c2Var = this.f;
        if (c2Var != null) {
            c2Var.F1(null);
        }
    }

    public final void c(boolean z10) {
        this.s = z10;
        if (z10) {
            this.c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        c2 c2Var;
        c2 c2Var2;
        boolean z11 = this.s;
        ig.f fVar = this.d;
        if (!z11 || ((fVar.length() == 0 && ((c2Var2 = this.f) == null || c2Var2.getSelectedCategory() == null)) || z10)) {
            this.c.b((fVar.length() > 0 || ((c2Var = this.f) != null && c2Var.k3 > 0.5f && ((c2Var != null && c2Var.f3) || c2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
