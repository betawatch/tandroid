package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e2 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final fl0 d;
    public final ah.i e;
    public final int f;
    public d2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public v10 x;

    public e2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = -1;
        this.a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.k6.xf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
        final int i10 = 1;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ha.d(-1, 36.0f, qs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fl0 fl0Var = new fl0();
        this.d = fl0Var;
        final int i11 = 0;
        fl0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.k6.yf;
        fl0Var.a(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        imageView.setImageDrawable(fl0Var);
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        ah.i iVar = new ah.i(i10, context, this);
        this.e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.E(iVar, i12, f6Var);
        org.telegram.ui.ActionBar.r6.V(iVar, org.telegram.ui.ActionBar.k6.G6, f6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(id.M0(2131745839, null));
        int i13 = org.telegram.ui.ActionBar.k6.Ai;
        org.telegram.ui.ActionBar.r6.m(iVar, 30, i13, f6Var);
        org.telegram.ui.ActionBar.r6.m(iVar, 36, i13, f6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 4));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new c2(f6Var));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, f6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a2
            public final /* synthetic */ e2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        e2 e2Var = this.b;
                        int i15 = e2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                e2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a2
            public final /* synthetic */ e2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        e2 e2Var = this.b;
                        int i15 = e2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                e2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i7, boolean z9) {
        if (this.f != i7 || this.h == null) {
            d2 d2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (d2Var != null) {
                frameLayout.removeView(d2Var);
            }
            d2 d2Var2 = new d2(this, getContext(), i7 == 1 ? 3 : 0, this.a, z9);
            this.h = d2Var2;
            ah.i iVar = this.e;
            d2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) iVar.getPaint().measureText(((Object) iVar.getHint()) + "")));
            final int i10 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new c20(this) { // from class: fi.b2
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            e2 e2Var = this.b;
                            ah.i iVar2 = e2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            e2Var.d(false);
                            break;
                        default:
                            uu0 uu0Var = (uu0) obj;
                            e2 e2Var2 = this.b;
                            d2 d2Var3 = e2Var2.h;
                            if (d2Var3 != null) {
                                if (d2Var3.getSelectedCategory() != uu0Var) {
                                    e2Var2.h.I1(uu0Var);
                                    String str = uu0Var.a;
                                    int categoryIndex = e2Var2.h.getCategoryIndex();
                                    v10 v10Var = e2Var2.x;
                                    if (v10Var != null) {
                                        v10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    e2Var2.h.I1(null);
                                    v10 v10Var2 = e2Var2.x;
                                    if (v10Var2 != null) {
                                        v10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.h.setOnCategoryClick(new c20(this) { // from class: fi.b2
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            e2 e2Var = this.b;
                            ah.i iVar2 = e2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            e2Var.d(false);
                            break;
                        default:
                            uu0 uu0Var = (uu0) obj;
                            e2 e2Var2 = this.b;
                            d2 d2Var3 = e2Var2.h;
                            if (d2Var3 != null) {
                                if (d2Var3.getSelectedCategory() != uu0Var) {
                                    e2Var2.h.I1(uu0Var);
                                    String str = uu0Var.a;
                                    int categoryIndex = e2Var2.h.getCategoryIndex();
                                    v10 v10Var = e2Var2.x;
                                    if (v10Var != null) {
                                        v10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    e2Var2.h.I1(null);
                                    v10 v10Var2 = e2Var2.x;
                                    if (v10Var2 != null) {
                                        v10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        v10 v10Var = this.x;
        if (v10Var != null) {
            v10Var.a(null, -1);
        }
        d2 d2Var = this.h;
        if (d2Var != null) {
            d2Var.I1(null);
        }
    }

    public final void c(boolean z9) {
        this.w = z9;
        if (z9) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z9) {
        d2 d2Var;
        d2 d2Var2;
        boolean z10 = this.w;
        ah.i iVar = this.e;
        if (!z10 || ((iVar.length() == 0 && ((d2Var2 = this.h) == null || d2Var2.getSelectedCategory() == null)) || z9)) {
            this.d.b((iVar.length() > 0 || ((d2Var = this.h) != null && d2Var.v3 > 0.5f && ((d2Var != null && d2Var.q3) || d2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            fl0 fl0Var = this.d;
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, f6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Ai;
                iVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
