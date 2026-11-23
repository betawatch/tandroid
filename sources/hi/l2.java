package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l2 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final ul0 d;
    public final ah.i e;
    public final int f;
    public k2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public p10 x;

    public l2(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f = -1;
        this.a = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        final int i10 = 1;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.na.d(-1, 36.0f, ks.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.na.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ul0 ul0Var = new ul0();
        this.d = ul0Var;
        final int i11 = 0;
        ul0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.n6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        imageView.setImageDrawable(ul0Var);
        frameLayout.addView(imageView, c8.na.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.D(iVar, i12, i6Var);
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(gd.N0(2131745640, null));
        int i13 = org.telegram.ui.ActionBar.n6.Di;
        org.telegram.ui.ActionBar.u6.l(iVar, 30, i13, i6Var);
        org.telegram.ui.ActionBar.u6.l(iVar, 36, i13, i6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.na.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 6));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new j2(i6Var));
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.h2
            public final /* synthetic */ l2 b;

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
                        l2 l2Var = this.b;
                        int i15 = l2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                l2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            l2Var.b();
                            k2 k2Var = l2Var.h;
                            if (k2Var != null) {
                                k2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.na.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.h2
            public final /* synthetic */ l2 b;

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
                        l2 l2Var = this.b;
                        int i15 = l2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                l2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            l2Var.b();
                            k2 k2Var = l2Var.h;
                            if (k2Var != null) {
                                k2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i7, boolean z10) {
        if (this.f != i7 || this.h == null) {
            k2 k2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (k2Var != null) {
                frameLayout.removeView(k2Var);
            }
            k2 k2Var2 = new k2(this, getContext(), i7 == 1 ? 3 : 0, this.a, z10);
            this.h = k2Var2;
            ah.i iVar = this.e;
            k2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) iVar.getPaint().measureText(((Object) iVar.getHint()) + "")));
            final int i10 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new w10(this) { // from class: hi.i2
                public final /* synthetic */ l2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            l2 l2Var = this.b;
                            ah.i iVar2 = l2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            l2Var.d(false);
                            break;
                        default:
                            gv0 gv0Var = (gv0) obj;
                            l2 l2Var2 = this.b;
                            k2 k2Var3 = l2Var2.h;
                            if (k2Var3 != null) {
                                if (k2Var3.getSelectedCategory() != gv0Var) {
                                    l2Var2.h.I1(gv0Var);
                                    String str = gv0Var.a;
                                    int categoryIndex = l2Var2.h.getCategoryIndex();
                                    p10 p10Var = l2Var2.x;
                                    if (p10Var != null) {
                                        p10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    l2Var2.h.I1(null);
                                    p10 p10Var2 = l2Var2.x;
                                    if (p10Var2 != null) {
                                        p10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.h.setOnCategoryClick(new w10(this) { // from class: hi.i2
                public final /* synthetic */ l2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            l2 l2Var = this.b;
                            ah.i iVar2 = l2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            l2Var.d(false);
                            break;
                        default:
                            gv0 gv0Var = (gv0) obj;
                            l2 l2Var2 = this.b;
                            k2 k2Var3 = l2Var2.h;
                            if (k2Var3 != null) {
                                if (k2Var3.getSelectedCategory() != gv0Var) {
                                    l2Var2.h.I1(gv0Var);
                                    String str = gv0Var.a;
                                    int categoryIndex = l2Var2.h.getCategoryIndex();
                                    p10 p10Var = l2Var2.x;
                                    if (p10Var != null) {
                                        p10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    l2Var2.h.I1(null);
                                    p10 p10Var2 = l2Var2.x;
                                    if (p10Var2 != null) {
                                        p10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.na.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        p10 p10Var = this.x;
        if (p10Var != null) {
            p10Var.a(null, -1);
        }
        k2 k2Var = this.h;
        if (k2Var != null) {
            k2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        k2 k2Var;
        k2 k2Var2;
        boolean z11 = this.w;
        ah.i iVar = this.e;
        if (!z11 || ((iVar.length() == 0 && ((k2Var2 = this.h) == null || k2Var2.getSelectedCategory() == null)) || z10)) {
            this.d.b((iVar.length() > 0 || ((k2Var = this.h) != null && k2Var.w3 > 0.5f && ((k2Var != null && k2Var.r3) || k2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            ul0 ul0Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = this.a;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
