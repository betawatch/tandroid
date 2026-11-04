package gi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final jl0 d;
    public final bh.g e;
    public final int f;
    public c2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public n10 x;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = -1;
        this.a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i3 = org.telegram.ui.ActionBar.k6.xf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        final int i10 = 1;
        frameLayout.setClipToOutline(true);
        int i11 = 4;
        frameLayout.setOutlineProvider(new cg.p0(i11));
        addView(frameLayout, mf.d(-1, 36.0f, hs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, mf.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        jl0 jl0Var = new jl0();
        this.d = jl0Var;
        final int i12 = 0;
        jl0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.k6.yf;
        jl0Var.a(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        imageView.setImageDrawable(jl0Var);
        frameLayout.addView(imageView, mf.e(36, 36, 51));
        bh.g gVar = new bh.g(i10, context, this);
        this.e = gVar;
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.E(gVar, i13, e6Var);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setImeOptions(268435459);
        gVar.setHint(bd.M0(2131745846, null));
        int i14 = org.telegram.ui.ActionBar.k6.Ai;
        org.telegram.ui.ActionBar.r6.m(gVar, 30, i14, e6Var);
        org.telegram.ui.ActionBar.r6.m(gVar, 36, i14, e6Var);
        gVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(gVar, mf.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gVar.addTextChangedListener(new bh.h(this, i11));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(e6Var));
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: gi.z1
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
                        int i16 = d2Var.d.k;
                        if (i16 != 1) {
                            if (i16 == 0) {
                                d2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, mf.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: gi.z1
            public final /* synthetic */ d2 b;

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
                        d2 d2Var = this.b;
                        int i16 = d2Var.d.k;
                        if (i16 != 1) {
                            if (i16 == 0) {
                                d2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i3, boolean z10) {
        if (this.f != i3 || this.h == null) {
            c2 c2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (c2Var != null) {
                frameLayout.removeView(c2Var);
            }
            c2 c2Var2 = new c2(this, getContext(), i3 == 1 ? 3 : 0, this.a, z10);
            this.h = c2Var2;
            bh.g gVar = this.e;
            c2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) gVar.getPaint().measureText(((Object) gVar.getHint()) + "")));
            final int i10 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new u10(this) { // from class: gi.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            d2 d2Var = this.b;
                            bh.g gVar2 = d2Var.e;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            tu0 tu0Var = (tu0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.h;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != tu0Var) {
                                    d2Var2.h.I1(tu0Var);
                                    String str = tu0Var.a;
                                    int categoryIndex = d2Var2.h.getCategoryIndex();
                                    n10 n10Var = d2Var2.x;
                                    if (n10Var != null) {
                                        n10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.h.I1(null);
                                    n10 n10Var2 = d2Var2.x;
                                    if (n10Var2 != null) {
                                        n10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.h.setOnCategoryClick(new u10(this) { // from class: gi.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            d2 d2Var = this.b;
                            bh.g gVar2 = d2Var.e;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            tu0 tu0Var = (tu0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.h;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != tu0Var) {
                                    d2Var2.h.I1(tu0Var);
                                    String str = tu0Var.a;
                                    int categoryIndex = d2Var2.h.getCategoryIndex();
                                    n10 n10Var = d2Var2.x;
                                    if (n10Var != null) {
                                        n10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.h.I1(null);
                                    n10 n10Var2 = d2Var2.x;
                                    if (n10Var2 != null) {
                                        n10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), mf.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        n10 n10Var = this.x;
        if (n10Var != null) {
            n10Var.a(null, -1);
        }
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.I1(null);
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
        c2 c2Var;
        c2 c2Var2;
        boolean z11 = this.w;
        bh.g gVar = this.e;
        if (!z11 || ((gVar.length() == 0 && ((c2Var2 = this.h) == null || c2Var2.getSelectedCategory() == null)) || z10)) {
            this.d.b((gVar.length() > 0 || ((c2Var = this.h) != null && c2Var.w3 > 0.5f && ((c2Var != null && c2Var.r3) || c2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            jl0 jl0Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            if (jl0Var != null) {
                jl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, e6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            bh.g gVar = this.e;
            if (gVar != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Ai;
                gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                gVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
