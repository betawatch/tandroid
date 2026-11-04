package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d3 extends FrameLayout implements cs {
    public static final pe k0 = new pe(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final u2 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final ImageView I;
    public final LinearLayout J;
    public final d K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final org.telegram.ui.Components.u5 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int a;
    public n10 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public p10 b0;
    public final Paint c;
    public final ArrayList c0;
    public final ci.j1 d;
    public boolean d0;
    public final fi.g e;
    public boolean e0;
    public final x2 f;
    public pe f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public ai.d2 j0;
    public final tj0 n;
    public final v2 r;
    public final zu0 s;
    public final p3 w;
    public boolean x;
    public final org.telegram.ui.ActionBar.k y;

    public d3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, pe peVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f10;
        this.a = i3;
        this.b = e6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), TLObject.FLAG_27);
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 3);
        this.d = j1Var;
        j1Var.setItemSelectorColorProvider(new d2.t1(29));
        x2 x2Var = new x2(this);
        this.f = x2Var;
        j1Var.setAdapter(x2Var);
        fi.g gVar = new fi.g(1, this);
        this.e = gVar;
        j1Var.setLayoutManager(gVar);
        j1Var.setFastScrollEnabled(1);
        j1Var.setFastScrollVisible(true);
        j1Var.getFastScroll().setAlpha(0.0f);
        int i10 = 7;
        gVar.O = new ai.g2(this, i10);
        j1Var.i(new ei.l(2));
        final int i11 = 0;
        j1Var.setClipToPadding(false);
        addView(j1Var, mf.e(-1, -1, hs.E1));
        j1Var.setOnItemClickListener(new fj0(this) { // from class: gi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i12, View view) {
                n10 n10Var;
                switch (i11) {
                    case 0:
                        d3 d3Var = this.b;
                        ArrayList arrayList2 = d3Var.c0;
                        ArrayList arrayList3 = d3Var.i0;
                        if (i12 >= 2 && d3Var.a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i13 = i12 - 2;
                            if (!d3Var.d0) {
                                if (d3Var.e0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        f7 f7Var = (f7) arrayList2.get(i13);
                                        d3Var.a0.a(f7Var, f7Var.K ? d3.d(z2Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                d3Var.e(d3.k0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < d3Var.g0.size()) {
                                ye yeVar = (ye) d3Var.g0.get(i13);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    n10 n10Var2 = d3Var.a0;
                                    if (yeVar.b && !yeVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    n10Var2.a(yeVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(yeVar)) {
                                        arrayList3.remove(yeVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i14 = -d3Var.O;
                                        d3Var.O = i14;
                                        org.telegram.messenger.g0.G3(i14, z2Var, null);
                                        org.telegram.messenger.p2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(yeVar);
                                    }
                                    org.telegram.messenger.g0.b4(d3Var.d);
                                    d3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        d3 d3Var2 = this.b;
                        v2 v2Var = d3Var2.r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < v2Var.c.size() && (n10Var = d3Var2.a0) != null) {
                            n10Var.a(v2Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        j1Var.setOnItemLongClickListener(new ei.y8(this, i10));
        j1Var.setOnScrollListener(new t2(this, i11));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.C(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, mf.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new ai.g5(this, 3));
        org.telegram.ui.ActionBar.x q10 = kVar.q();
        u2 u2Var = new u2(this, context, q10, e6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        kVar.addView(u2Var, 0, mf.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: gi.p2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.G.U(null, null);
                        break;
                    case 1:
                        d3 d3Var = this.b;
                        if (d3Var.J.getAlpha() >= 0.25f) {
                            d3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        d3 d3Var2 = this.b;
                        if (d3Var2.J.getAlpha() >= 0.25f) {
                            d3Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, mf.e(-1, -1, hs.E1));
        tj0 tj0Var = new tj0(context, e6Var);
        this.n = tj0Var;
        tj0Var.setLayoutManager(new u4.s(3));
        v2 v2Var = new v2(this);
        this.r = v2Var;
        tj0Var.setAdapter(v2Var);
        int i12 = 1;
        tj0Var.setOnScrollListener(new t2(this, i12));
        tj0Var.setClipToPadding(true);
        tj0Var.i(new ei.l(i12));
        frameLayout.addView(tj0Var, mf.e(-1, -1, hs.E1));
        q2 q2Var = new q2(i11, context, e6Var);
        float f11 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, mf.e(-1, -1, hs.E1));
        zu0 zu0Var = new zu0(context, q2Var, 11, e6Var);
        this.s = zu0Var;
        yh.l lVar = zu0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.y6, e6Var);
        lVar.setTypeface(null);
        lVar.setText(bd.M0(2131745770, null));
        this.w = new p3(this, false, new ai.v2(this, 23));
        frameLayout.addView(zu0Var, mf.e(-1, -1, hs.E1));
        tj0Var.setEmptyView(zu0Var);
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(bd.M0(2131745771, null));
        final int i13 = 1;
        tj0Var.setOnItemClickListener(new fj0(this) { // from class: gi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i122, View view) {
                n10 n10Var;
                switch (i13) {
                    case 0:
                        d3 d3Var = this.b;
                        ArrayList arrayList2 = d3Var.c0;
                        ArrayList arrayList3 = d3Var.i0;
                        if (i122 >= 2 && d3Var.a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i132 = i122 - 2;
                            if (!d3Var.d0) {
                                if (d3Var.e0) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        f7 f7Var = (f7) arrayList2.get(i132);
                                        d3Var.a0.a(f7Var, f7Var.K ? d3.d(z2Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                d3Var.e(d3.k0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < d3Var.g0.size()) {
                                ye yeVar = (ye) d3Var.g0.get(i132);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    n10 n10Var2 = d3Var.a0;
                                    if (yeVar.b && !yeVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    n10Var2.a(yeVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(yeVar)) {
                                        arrayList3.remove(yeVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i14 = -d3Var.O;
                                        d3Var.O = i14;
                                        org.telegram.messenger.g0.G3(i14, z2Var, null);
                                        org.telegram.messenger.p2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(yeVar);
                                    }
                                    org.telegram.messenger.g0.b4(d3Var.d);
                                    d3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        d3 d3Var2 = this.b;
                        v2 v2Var2 = d3Var2.r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < v2Var2.c.size() && (n10Var = d3Var2.a0) != null) {
                            n10Var.a(v2Var2.c.get(i122), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = hp.s1(i3).P1().w.b;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                f7 f7Var = (f7) obj;
                if (!f7Var.g && !f7Var.w) {
                    this.c0.add(f7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, linearLayout, e6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : f11) + org.telegram.messenger.g0.n);
            addView(linearLayout, mf.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            final int i15 = 1;
            d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
            this.K = h;
            h.i(bd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(h, mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                h.setOnClickListener(new View.OnClickListener(this) { // from class: gi.p2
                    public final /* synthetic */ d3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.G.U(null, null);
                                break;
                            case 1:
                                d3 d3Var = this.b;
                                if (d3Var.J.getAlpha() >= 0.25f) {
                                    d3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var2 = this.b;
                                if (d3Var2.J.getAlpha() >= 0.25f) {
                                    d3Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.b.f(false);
                                break;
                        }
                    }
                });
            }
            d h7 = org.telegram.messenger.k5.h(24, context, e6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            wp wpVar = new wp(R.drawable.mini_collage, 0);
            float f12 = -org.telegram.messenger.g0.L(1.33f);
            float L = org.telegram.messenger.g0.L(0.66f);
            wpVar.r = f12;
            wpVar.s = L;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131744789, null));
            h7.i(spannableStringBuilder, false, true);
            linearLayout.addView(h7, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            h7.setOnClickListener(new View.OnClickListener(this) { // from class: gi.p2
                public final /* synthetic */ d3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.G.U(null, null);
                            break;
                        case 1:
                            d3 d3Var = this.b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            d3 d3Var2 = this.b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
        } else {
            this.J = null;
            this.K = null;
            ImageView imageView = new ImageView(context);
            this.I = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            int L2 = org.telegram.messenger.g0.L(56.0f);
            int i17 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i17, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
            imageView.setBackground(L3);
            org.telegram.ui.ActionBar.r6.k(imageView, L3, N, null, e6Var);
            pf.b(imageView, 0.1f, 1.5f);
            addView(imageView, mf.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i18 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: gi.p2
                public final /* synthetic */ d3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            this.b.G.U(null, null);
                            break;
                        case 1:
                            d3 d3Var = this.b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            d3 d3Var2 = this.b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        pe peVar2 = k0;
        if (peVar == null || (peVar == peVar2 && this.c0.size() <= 0)) {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (pe) this.h0.get(0);
            }
        } else {
            this.f0 = peVar;
        }
        this.g0 = b(this.f0);
        i();
        pe peVar3 = this.f0;
        if (peVar3 == MediaController.a2) {
            this.E.setText(bd.M0(2131752238, null));
        } else if (peVar3 == peVar2) {
            this.E.setText(bd.M0(2131744689, null));
        } else {
            this.E.setText(peVar3.c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var == null || (bitmap = z2Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.E(6.0f, bitmap);
    }

    public final ArrayList b(pe peVar) {
        if (peVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = peVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ye yeVar = (ye) arrayList.get(i3);
            if (!this.M || !yeVar.b) {
                arrayList2.add(yeVar);
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.r2;
        x2 x2Var = this.f;
        int i12 = 0;
        if (i3 != i11) {
            if (i3 == hs.y5) {
                ArrayList arrayList = this.c0;
                arrayList.clear();
                if (!this.M) {
                    ArrayList arrayList2 = hp.s1(this.a).P1().w.b;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        f7 f7Var = (f7) obj;
                        if (!f7Var.g && !f7Var.w) {
                            arrayList.add(f7Var);
                        }
                    }
                }
                h();
                i();
                if (x2Var != null) {
                    x2Var.f();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.f0 != null) {
            while (true) {
                if (i12 >= MediaController.c2.size()) {
                    break;
                }
                pe peVar = (pe) MediaController.c2.get(i12);
                int i13 = peVar.a;
                pe peVar2 = this.f0;
                if (i13 == peVar2.a && peVar.b == peVar2.b) {
                    this.f0 = peVar;
                    break;
                }
                i12++;
            }
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (pe) this.h0.get(0);
            }
        }
        this.g0 = b(this.f0);
        this.i0.clear();
        i();
        if (x2Var != null) {
            x2Var.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g7 = g();
        boolean z10 = g7 <= ((float) k2.p1.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, 0));
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g7, 0.0f, d);
        if (z10 != this.x) {
            this.x = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.x ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.y;
        if (kVar != null) {
            kVar.setAlpha(d);
            int i3 = d <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i3) {
                kVar.setVisibility(i3);
            }
        }
        ai.d2 d2Var = this.j0;
        if (d2Var != null) {
            d2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(pe peVar, boolean z10) {
        this.f0 = peVar;
        this.g0 = b(peVar);
        this.i0.clear();
        i();
        pe peVar2 = this.f0;
        pe peVar3 = MediaController.a2;
        TextView textView = this.E;
        if (peVar2 == peVar3) {
            textView.setText(bd.M0(2131752238, null));
        } else if (peVar2 == k0) {
            textView.setText(bd.M0(2131744689, null));
        } else {
            textView.setText(peVar2.c);
        }
        this.f.f();
        fi.g gVar = this.e;
        if (!z10) {
            gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        ni.m mVar = new ni.m(getContext(), 2);
        mVar.a = 1;
        mVar.p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        gVar.w0(mVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        z2 z2Var;
        if (this.b0 == null) {
            return;
        }
        ArrayList arrayList = this.i0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.a0.a((ye) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            ci.j1 j1Var = this.d;
            if (i3 >= size) {
                this.b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                org.telegram.messenger.g0.b4(j1Var);
                j();
                return;
            }
            Object obj = arrayList.get(i3);
            i3++;
            ye yeVar = (ye) obj;
            if (!yeVar.b || yeVar.d()) {
                bitmap = null;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= j1Var.getChildCount()) {
                        z2Var = null;
                        break;
                    }
                    View childAt = j1Var.getChildAt(i10);
                    if (childAt instanceof z2) {
                        z2Var = (z2) childAt;
                        if (z2Var.T == yeVar) {
                            break;
                        }
                    }
                    i10++;
                }
                bitmap = d(z2Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        ci.j1 j1Var = this.d;
        if (j1Var == null || j1Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i10 = 0; i10 < j1Var.getChildCount(); i10++) {
                View childAt = j1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i3 = Math.min(i3, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i3, getHeight()));
        }
        return j1Var == null ? padding : org.telegram.messenger.g0.W1(j1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.q.y * 0.35f);
    }

    public pe getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        return bd.M0(this.M ? 2131754428 : 2131752121, null);
    }

    public final void h() {
        a aVar;
        u2 u2Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.h0 = arrayList2;
        Collections.sort(arrayList2, new ci.y4(arrayList, 2));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        pe peVar = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, peVar);
        }
        boolean isEmpty2 = this.h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.h0.size();
        for (int i3 = 0; i3 < size; i3++) {
            pe peVar2 = (pe) this.h0.get(i3);
            if (peVar2 == peVar) {
                aVar = new a(getContext(), peVar2.d, bd.N0("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(peVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), peVar2.d, peVar2.c, b10.size(), this.b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.d(19, this, peVar2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h0;
        boolean z10 = true;
        boolean z11 = arrayList2 != null && !arrayList2.isEmpty() && this.h0.get(0) == this.f0 && this.c0.size() > 2;
        this.d0 = z11;
        if (z11 || (this.f0 != k0 && ((arrayList = this.h0) == null || arrayList.isEmpty() || this.h0.get(0) != this.f0))) {
            z10 = false;
        }
        this.e0 = z10;
    }

    public final void j() {
        ArrayList arrayList = this.i0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        ImageView imageView = this.I;
        if (imageView != null) {
            org.telegram.messenger.camera.q.l(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -org.telegram.messenger.g0.n : org.telegram.messenger.g0.L(8.0f)), xq.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            d dVar = this.K;
            if (dVar != null) {
                dVar.i(bd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.g0.n);
            if (this.U != z10) {
                this.U = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(32.0f) : 0.0f).setInterpolator(xq.h).setDuration(320L).setListener(new dh.x(10, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        hs.e().c(this, hs.r2);
        hs.f(this.a).c(this, hs.y5);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.r2);
        hs.f(this.a).n(this, hs.y5);
        z2.f0.clear();
        z2.g0.evictAll();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = z2.d0;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((org.telegram.messenger.q5) arrayList.get(i3)).cleanupQueue();
                ((org.telegram.messenger.q5) arrayList.get(i3)).recycle();
                i3++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int L;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ci.j1 j1Var = this.d;
        j1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L((org.telegram.messenger.g0.n > 0 ? 0 : 10) + hs.z1);
        }
        j1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.n);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.g0.n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.n;
        int i11 = org.telegram.messenger.g0.m;
        int L4 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i11, L4, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i3, i10);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i3, i10);
    }

    public void setMaxCount(int i3) {
        this.S = i3;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            org.telegram.messenger.g0.b4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(n10 n10Var) {
        this.a0 = n10Var;
    }

    public void setOnSelectMultipleListener(p10 p10Var) {
        this.b0 = p10Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
