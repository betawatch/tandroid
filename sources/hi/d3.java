package hi;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class d3 extends FrameLayout implements is {
    public static final ve k0 = new ve(-1, null, null);
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
    public s10 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public u10 b0;
    public final Paint c;
    public final ArrayList c0;
    public final di.c1 d;
    public boolean d0;
    public final gi.g e;
    public boolean e0;
    public final x2 f;
    public ve f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public bi.v1 j0;
    public final uj0 n;
    public final v2 r;
    public final cv0 s;
    public final p3 w;
    public boolean x;
    public final org.telegram.ui.ActionBar.k y;

    public d3(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ve veVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f10;
        this.a = i7;
        this.b = e6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), TLObject.FLAG_27);
        di.c1 c1Var = new di.c1(this, context, e6Var, 3);
        this.d = c1Var;
        c1Var.setItemSelectorColorProvider(new g0.e(27));
        x2 x2Var = new x2(this);
        this.f = x2Var;
        c1Var.setAdapter(x2Var);
        gi.g gVar = new gi.g(1, this);
        this.e = gVar;
        c1Var.setLayoutManager(gVar);
        c1Var.setFastScrollEnabled(1);
        c1Var.setFastScrollVisible(true);
        c1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.y1(this, 7);
        c1Var.i(new fi.k(2));
        final int i10 = 0;
        c1Var.setClipToPadding(false);
        addView(c1Var, c8.ja.e(-1, -1, ns.E1));
        c1Var.setOnItemClickListener(new gj0(this) { // from class: hi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i11, View view) {
                s10 s10Var;
                switch (i10) {
                    case 0:
                        d3 d3Var = this.b;
                        ArrayList arrayList2 = d3Var.c0;
                        ArrayList arrayList3 = d3Var.i0;
                        if (i11 >= 2 && d3Var.a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i12 = i11 - 2;
                            if (!d3Var.d0) {
                                if (d3Var.e0) {
                                    if (i12 >= 0 && i12 < arrayList2.size()) {
                                        d7 d7Var = (d7) arrayList2.get(i12);
                                        d3Var.a0.a(d7Var, d7Var.K ? d3.d(z2Var) : null);
                                        break;
                                    } else {
                                        i12 -= arrayList2.size();
                                    }
                                }
                            } else if (i12 == 0) {
                                d3Var.e(d3.k0, true);
                                break;
                            } else {
                                i12 = i11 - 3;
                            }
                            if (i12 >= 0 && i12 < d3Var.g0.size()) {
                                ff ffVar = (ff) d3Var.g0.get(i12);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    s10 s10Var2 = d3Var.a0;
                                    if (ffVar.b && !ffVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    s10Var2.a(ffVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(ffVar)) {
                                        arrayList3.remove(ffVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i13 = -d3Var.O;
                                        d3Var.O = i13;
                                        org.telegram.messenger.g0.F3(i13, z2Var, null);
                                        org.telegram.messenger.p2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(ffVar);
                                    }
                                    org.telegram.messenger.g0.a4(d3Var.d);
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
                        if (i11 >= 0 && i11 < v2Var.c.size() && (s10Var = d3Var2.a0) != null) {
                            s10Var.a(v2Var.c.get(i11), null);
                            break;
                        }
                        break;
                }
            }
        });
        c1Var.setOnItemLongClickListener(new di.z6(this, 18));
        c1Var.setOnScrollListener(new t2(this, i10));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.F(436207615, false);
        kVar.H(-1, false);
        kVar.H(-1, true);
        addView(kVar, c8.ja.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.x4(this, 3));
        org.telegram.ui.ActionBar.y s5 = kVar.s();
        u2 u2Var = new u2(this, context, s5, e6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        kVar.addView(u2Var, 0, c8.ja.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: hi.p2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.G.V(null, null);
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
        u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ja.e(-1, -1, ns.E1));
        uj0 uj0Var = new uj0(context, e6Var);
        this.n = uj0Var;
        uj0Var.setLayoutManager(new v4.s(3));
        v2 v2Var = new v2(this);
        this.r = v2Var;
        uj0Var.setAdapter(v2Var);
        int i11 = 1;
        uj0Var.setOnScrollListener(new t2(this, i11));
        uj0Var.setClipToPadding(true);
        uj0Var.i(new fi.k(i11));
        frameLayout.addView(uj0Var, c8.ja.e(-1, -1, ns.E1));
        q2 q2Var = new q2(i10, context, e6Var);
        float f11 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, c8.ja.e(-1, -1, ns.E1));
        cv0 cv0Var = new cv0(context, q2Var, 11, e6Var);
        this.s = cv0Var;
        xh.l lVar = cv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(lVar, org.telegram.ui.ActionBar.j6.y6, e6Var);
        lVar.setTypeface(null);
        lVar.setText(hd.M0(2131745760, null));
        this.w = new p3(this, false, new ai.f0(this, 24));
        frameLayout.addView(cv0Var, c8.ja.e(-1, -1, ns.E1));
        uj0Var.setEmptyView(cv0Var);
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(hd.M0(2131745761, null));
        final int i12 = 1;
        uj0Var.setOnItemClickListener(new gj0(this) { // from class: hi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i112, View view) {
                s10 s10Var;
                switch (i12) {
                    case 0:
                        d3 d3Var = this.b;
                        ArrayList arrayList2 = d3Var.c0;
                        ArrayList arrayList3 = d3Var.i0;
                        if (i112 >= 2 && d3Var.a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i122 = i112 - 2;
                            if (!d3Var.d0) {
                                if (d3Var.e0) {
                                    if (i122 >= 0 && i122 < arrayList2.size()) {
                                        d7 d7Var = (d7) arrayList2.get(i122);
                                        d3Var.a0.a(d7Var, d7Var.K ? d3.d(z2Var) : null);
                                        break;
                                    } else {
                                        i122 -= arrayList2.size();
                                    }
                                }
                            } else if (i122 == 0) {
                                d3Var.e(d3.k0, true);
                                break;
                            } else {
                                i122 = i112 - 3;
                            }
                            if (i122 >= 0 && i122 < d3Var.g0.size()) {
                                ff ffVar = (ff) d3Var.g0.get(i122);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    s10 s10Var2 = d3Var.a0;
                                    if (ffVar.b && !ffVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    s10Var2.a(ffVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(ffVar)) {
                                        arrayList3.remove(ffVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i13 = -d3Var.O;
                                        d3Var.O = i13;
                                        org.telegram.messenger.g0.F3(i13, z2Var, null);
                                        org.telegram.messenger.p2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(ffVar);
                                    }
                                    org.telegram.messenger.g0.a4(d3Var.d);
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
                        if (i112 >= 0 && i112 < v2Var2.c.size() && (s10Var = d3Var2.a0) != null) {
                            s10Var.a(v2Var2.c.get(i112), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = np.s1(i7).P1().w.b;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                d7 d7Var = (d7) obj;
                if (!d7Var.g && !d7Var.w) {
                    this.c0.add(d7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, linearLayout, e6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : f11) + org.telegram.messenger.g0.n);
            addView(linearLayout, c8.ja.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            final int i14 = 1;
            d g10 = i20.g(24, context, e6Var, true);
            this.K = g10;
            g10.i(hd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) { // from class: hi.p2
                    public final /* synthetic */ d3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.G.V(null, null);
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
            d g11 = i20.g(24, context, e6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            eq eqVar = new eq(R.drawable.mini_collage, 0);
            float f12 = -org.telegram.messenger.g0.L(1.33f);
            float L = org.telegram.messenger.g0.L(0.66f);
            eqVar.r = f12;
            eqVar.s = L;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131744779, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i15 = 2;
            g11.setOnClickListener(new View.OnClickListener(this) { // from class: hi.p2
                public final /* synthetic */ d3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            this.b.G.V(null, null);
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
            int i16 = org.telegram.ui.ActionBar.j6.Fi;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.j6.L(L2, org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
            imageView.setBackground(L3);
            org.telegram.ui.ActionBar.q6.j(imageView, L3, M, null, e6Var);
            c8.na.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ja.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.p2
                public final /* synthetic */ d3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.G.V(null, null);
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
        ve veVar2 = k0;
        if (veVar == null || (veVar == veVar2 && this.c0.size() <= 0)) {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (ve) this.h0.get(0);
            }
        } else {
            this.f0 = veVar;
        }
        this.g0 = b(this.f0);
        i();
        ve veVar3 = this.f0;
        if (veVar3 == MediaController.a2) {
            this.E.setText(hd.M0(2131752238, null));
        } else if (veVar3 == veVar2) {
            this.E.setText(hd.M0(2131744679, null));
        } else {
            this.E.setText(veVar3.c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var == null || (bitmap = z2Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.E(6.0f, bitmap);
    }

    public final ArrayList b(ve veVar) {
        if (veVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = veVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ff ffVar = (ff) arrayList.get(i7);
            if (!this.M || !ffVar.b) {
                arrayList2.add(ffVar);
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.r2;
        x2 x2Var = this.f;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ns.y5) {
                ArrayList arrayList = this.c0;
                arrayList.clear();
                if (!this.M) {
                    ArrayList arrayList2 = np.s1(this.a).P1().w.b;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        d7 d7Var = (d7) obj;
                        if (!d7Var.g && !d7Var.w) {
                            arrayList.add(d7Var);
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
                ve veVar = (ve) MediaController.c2.get(i12);
                int i13 = veVar.a;
                ve veVar2 = this.f0;
                if (i13 == veVar2.a && veVar.b == veVar2.b) {
                    this.f0 = veVar;
                    break;
                }
                i12++;
            }
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (ve) this.h0.get(0);
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
        float g10 = g();
        boolean z10 = g10 <= ((float) i5.c.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, 0));
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z10 != this.x) {
            this.x = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.x ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.y;
        if (kVar != null) {
            kVar.setAlpha(d);
            int i7 = d <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i7) {
                kVar.setVisibility(i7);
            }
        }
        bi.v1 v1Var = this.j0;
        if (v1Var != null) {
            v1Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ve veVar, boolean z10) {
        this.f0 = veVar;
        this.g0 = b(veVar);
        this.i0.clear();
        i();
        ve veVar2 = this.f0;
        ve veVar3 = MediaController.a2;
        TextView textView = this.E;
        if (veVar2 == veVar3) {
            textView.setText(hd.M0(2131752238, null));
        } else if (veVar2 == k0) {
            textView.setText(hd.M0(2131744679, null));
        } else {
            textView.setText(veVar2.c);
        }
        this.f.f();
        gi.g gVar = this.e;
        if (!z10) {
            gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        pi.l lVar = new pi.l(getContext(), 2);
        lVar.a = 1;
        lVar.p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        gVar.w0(lVar);
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
            this.a0.a((ff) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            di.c1 c1Var = this.d;
            if (i7 >= size) {
                this.b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                org.telegram.messenger.g0.a4(c1Var);
                j();
                return;
            }
            Object obj = arrayList.get(i7);
            i7++;
            ff ffVar = (ff) obj;
            if (!ffVar.b || ffVar.d()) {
                bitmap = null;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= c1Var.getChildCount()) {
                        z2Var = null;
                        break;
                    }
                    View childAt = c1Var.getChildAt(i10);
                    if (childAt instanceof z2) {
                        z2Var = (z2) childAt;
                        if (z2Var.T == ffVar) {
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
        di.c1 c1Var = this.d;
        if (c1Var == null || c1Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
                View childAt = c1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        }
        return c1Var == null ? padding : org.telegram.messenger.g0.W1(c1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.q.y * 0.35f);
    }

    public ve getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        return hd.M0(this.M ? 2131754428 : 2131752121, null);
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
        Collections.sort(arrayList2, new di.p4(arrayList, 2));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        ve veVar = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, veVar);
        }
        boolean isEmpty2 = this.h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.h0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ve veVar2 = (ve) this.h0.get(i7);
            if (veVar2 == veVar) {
                aVar = new a(getContext(), veVar2.d, hd.N0("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(veVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), veVar2.d, veVar2.c, b10.size(), this.b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.t2(20, this, veVar2));
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
            i20.n(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -org.telegram.messenger.g0.n : org.telegram.messenger.g0.L(8.0f)), er.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            d dVar = this.K;
            if (dVar != null) {
                dVar.i(hd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.g0.n);
            if (this.U != z10) {
                this.U = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(32.0f) : 0.0f).setInterpolator(er.h).setDuration(320L).setListener(new bi.v4(10, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ns.e().c(this, ns.r2);
        ns.f(this.a).c(this, ns.y5);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.r2);
        ns.f(this.a).n(this, ns.y5);
        z2.f0.clear();
        z2.g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = z2.d0;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((org.telegram.messenger.q5) arrayList.get(i7)).cleanupQueue();
                ((org.telegram.messenger.q5) arrayList.get(i7)).recycle();
                i7++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        di.c1 c1Var = this.d;
        c1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L((org.telegram.messenger.g0.n > 0 ? 0 : 10) + ns.z1);
        }
        c1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.n);
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
                super.onMeasure(i7, i10);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i7, i10);
    }

    public void setMaxCount(int i7) {
        this.S = i7;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            org.telegram.messenger.g0.a4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(s10 s10Var) {
        this.a0 = s10Var;
    }

    public void setOnSelectMultipleListener(u10 u10Var) {
        this.b0 = u10Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
