package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d2 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final ul0 d;
    public final ah.i e;
    public final int f;
    public c2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public r10 x;

    public d2(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f = -1;
        this.a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        final int i10 = 1;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ma.d(-1, 36.0f, ls.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ul0 ul0Var = new ul0();
        this.d = ul0Var;
        final int i11 = 0;
        ul0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.m6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        imageView.setImageDrawable(ul0Var);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        ah.i iVar = new ah.i(i10, context, this);
        this.e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.D(iVar, i12, h6Var);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(hd.N0(2131745640, null));
        int i13 = org.telegram.ui.ActionBar.m6.Di;
        org.telegram.ui.ActionBar.t6.l(iVar, 30, i13, h6Var);
        org.telegram.ui.ActionBar.t6.l(iVar, 36, i13, h6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 6));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(h6Var));
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z1
            public final /* synthetic */ d2 b;

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
                        d2 d2Var = this.b;
                        int i15 = d2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
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
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z1
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
                        int i15 = d2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
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

    public final void a(int i7, boolean z10) {
        if (this.f != i7 || this.h == null) {
            c2 c2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (c2Var != null) {
                frameLayout.removeView(c2Var);
            }
            c2 c2Var2 = new c2(this, getContext(), i7 == 1 ? 3 : 0, this.a, z10);
            this.h = c2Var2;
            ah.i iVar = this.e;
            c2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) iVar.getPaint().measureText(((Object) iVar.getHint()) + "")));
            final int i10 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new y10(this) { // from class: hi.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            d2 d2Var = this.b;
                            ah.i iVar2 = d2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            hv0 hv0Var = (hv0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.h;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != hv0Var) {
                                    d2Var2.h.I1(hv0Var);
                                    String str = hv0Var.a;
                                    int categoryIndex = d2Var2.h.getCategoryIndex();
                                    r10 r10Var = d2Var2.x;
                                    if (r10Var != null) {
                                        r10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.h.I1(null);
                                    r10 r10Var2 = d2Var2.x;
                                    if (r10Var2 != null) {
                                        r10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.h.setOnCategoryClick(new y10(this) { // from class: hi.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            d2 d2Var = this.b;
                            ah.i iVar2 = d2Var.e;
                            iVar2.animate().cancel();
                            iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            d2Var.d(false);
                            break;
                        default:
                            hv0 hv0Var = (hv0) obj;
                            d2 d2Var2 = this.b;
                            c2 c2Var3 = d2Var2.h;
                            if (c2Var3 != null) {
                                if (c2Var3.getSelectedCategory() != hv0Var) {
                                    d2Var2.h.I1(hv0Var);
                                    String str = hv0Var.a;
                                    int categoryIndex = d2Var2.h.getCategoryIndex();
                                    r10 r10Var = d2Var2.x;
                                    if (r10Var != null) {
                                        r10Var.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    d2Var2.h.I1(null);
                                    r10 r10Var2 = d2Var2.x;
                                    if (r10Var2 != null) {
                                        r10Var2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        r10 r10Var = this.x;
        if (r10Var != null) {
            r10Var.a(null, -1);
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
        ah.i iVar = this.e;
        if (!z11 || ((iVar.length() == 0 && ((c2Var2 = this.h) == null || c2Var2.getSelectedCategory() == null)) || z10)) {
            this.d.b((iVar.length() > 0 || ((c2Var = this.h) != null && c2Var.w3 > 0.5f && ((c2Var != null && c2Var.r3) || c2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            ul0 ul0Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
