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
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.ue;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class d3 extends FrameLayout implements fs {
    public static final ue k0 = new ue(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final u2 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final ImageView I;
    public final LinearLayout J;
    public final e K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final org.telegram.ui.Components.d6 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int a;
    public q10 a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public s10 b0;
    public final Paint c;
    public final ArrayList c0;
    public final di.b1 d;
    public boolean d0;
    public final gi.g e;
    public boolean e0;
    public final x2 f;
    public ue f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public bi.t2 j0;
    public final ek0 n;
    public final v2 r;
    public final nv0 s;
    public final o3 w;
    public boolean x;
    public final org.telegram.ui.ActionBar.k y;

    public d3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ue ueVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f10;
        this.a = i7;
        this.b = h6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), TLObject.FLAG_27);
        di.b1 b1Var = new di.b1(this, context, h6Var, 3);
        this.d = b1Var;
        b1Var.setItemSelectorColorProvider(new g0.e(28));
        x2 x2Var = new x2(this);
        this.f = x2Var;
        b1Var.setAdapter(x2Var);
        gi.g gVar = new gi.g(1, this);
        this.e = gVar;
        b1Var.setLayoutManager(gVar);
        b1Var.setFastScrollEnabled(1);
        b1Var.setFastScrollVisible(true);
        b1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.w2(this, 7);
        b1Var.i(new fi.k(2));
        final int i10 = 0;
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.ma.e(-1, -1, ks.E1));
        b1Var.setOnItemClickListener(new qj0(this) { // from class: hi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i11, View view) {
                q10 q10Var;
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
                                        c7 c7Var = (c7) arrayList2.get(i12);
                                        d3Var.a0.a(c7Var, c7Var.K ? d3.d(z2Var) : null);
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
                                ef efVar = (ef) d3Var.g0.get(i12);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    q10 q10Var2 = d3Var.a0;
                                    if (efVar.b && !efVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    q10Var2.a(efVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(efVar)) {
                                        arrayList3.remove(efVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i13 = -d3Var.O;
                                        d3Var.O = i13;
                                        org.telegram.messenger.g0.E3(i13, z2Var, null);
                                        org.telegram.messenger.q2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(efVar);
                                    }
                                    org.telegram.messenger.g0.Z3(d3Var.d);
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
                        if (i11 >= 0 && i11 < v2Var.c.size() && (q10Var = d3Var2.a0) != null) {
                            q10Var.a(v2Var.c.get(i11), null);
                            break;
                        }
                        break;
                }
            }
        });
        b1Var.setOnItemLongClickListener(new di.v6(this, 19));
        b1Var.setOnScrollListener(new t2(this, i10));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        this.y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.F(436207615, false);
        kVar.G(-1, false);
        kVar.G(-1, true);
        addView(kVar, c8.ma.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.v1(this, 5));
        org.telegram.ui.ActionBar.y s5 = kVar.s();
        u2 u2Var = new u2(this, context, s5, h6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        kVar.addView(u2Var, 0, c8.ma.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
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
        u2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        ek0 ek0Var = new ek0(context, h6Var);
        this.n = ek0Var;
        ek0Var.setLayoutManager(new v4.t(3));
        v2 v2Var = new v2(this);
        this.r = v2Var;
        ek0Var.setAdapter(v2Var);
        int i11 = 1;
        ek0Var.setOnScrollListener(new t2(this, i11));
        ek0Var.setClipToPadding(true);
        ek0Var.i(new fi.k(i11));
        frameLayout.addView(ek0Var, c8.ma.e(-1, -1, ks.E1));
        q2 q2Var = new q2(i10, context, h6Var);
        float f11 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, c8.ma.e(-1, -1, ks.E1));
        nv0 nv0Var = new nv0(context, q2Var, 11, h6Var);
        this.s = nv0Var;
        xh.l lVar = nv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(lVar, org.telegram.ui.ActionBar.m6.y6, h6Var);
        lVar.setTypeface(null);
        lVar.setText(gd.N0(2131745564, null));
        this.w = new o3(this, false, new ai.h0(this, 25));
        frameLayout.addView(nv0Var, c8.ma.e(-1, -1, ks.E1));
        ek0Var.setEmptyView(nv0Var);
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(gd.N0(2131745565, null));
        final int i12 = 1;
        ek0Var.setOnItemClickListener(new qj0(this) { // from class: hi.o2
            public final /* synthetic */ d3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i112, View view) {
                q10 q10Var;
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
                                        c7 c7Var = (c7) arrayList2.get(i122);
                                        d3Var.a0.a(c7Var, c7Var.K ? d3.d(z2Var) : null);
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
                                ef efVar = (ef) d3Var.g0.get(i122);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    q10 q10Var2 = d3Var.a0;
                                    if (efVar.b && !efVar.d()) {
                                        r6 = d3.d(z2Var);
                                    }
                                    q10Var2.a(efVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(efVar)) {
                                        arrayList3.remove(efVar);
                                    } else if (arrayList3.size() + 1 > d3Var.S) {
                                        int i13 = -d3Var.O;
                                        d3Var.O = i13;
                                        org.telegram.messenger.g0.E3(i13, z2Var, null);
                                        org.telegram.messenger.q2.E.a();
                                        break;
                                    } else {
                                        arrayList3.add(efVar);
                                    }
                                    org.telegram.messenger.g0.Z3(d3Var.d);
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
                        if (i112 >= 0 && i112 < v2Var2.c.size() && (q10Var = d3Var2.a0) != null) {
                            q10Var.a(v2Var2.c.get(i112), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = mp.u1(i7).R1().w.b;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                c7 c7Var = (c7) obj;
                if (!c7Var.g && !c7Var.w) {
                    this.c0.add(c7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, linearLayout, h6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : f11) + org.telegram.messenger.g0.n);
            addView(linearLayout, c8.ma.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            final int i14 = 1;
            e g10 = n10.g(24, context, h6Var, true);
            this.K = g10;
            g10.i(gd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
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
            e g11 = n10.g(24, context, h6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            nq nqVar = new nq(R.drawable.mini_collage, 0);
            float f12 = -org.telegram.messenger.g0.L(1.33f);
            float L = org.telegram.messenger.g0.L(0.66f);
            nqVar.r = f12;
            nqVar.s = L;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131744538, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
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
            int i16 = org.telegram.ui.ActionBar.m6.Fi;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.m6.L(L2, org.telegram.ui.ActionBar.m6.w0(i16, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
            imageView.setBackground(L3);
            org.telegram.ui.ActionBar.t6.j(imageView, L3, M, null, h6Var);
            c8.ra.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
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
        ue ueVar2 = k0;
        if (ueVar == null || (ueVar == ueVar2 && this.c0.size() <= 0)) {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (ue) this.h0.get(0);
            }
        } else {
            this.f0 = ueVar;
        }
        this.g0 = b(this.f0);
        i();
        ue ueVar3 = this.f0;
        if (ueVar3 == MediaController.a2) {
            this.E.setText(gd.N0(2131752226, null));
        } else if (ueVar3 == ueVar2) {
            this.E.setText(gd.N0(2131744438, null));
        } else {
            this.E.setText(ueVar3.c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var == null || (bitmap = z2Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.E(6.0f, bitmap);
    }

    public final ArrayList b(ue ueVar) {
        if (ueVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = ueVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ef efVar = (ef) arrayList.get(i7);
            if (!this.M || !efVar.b) {
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.r2;
        x2 x2Var = this.f;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ks.B5) {
                ArrayList arrayList = this.c0;
                arrayList.clear();
                if (!this.M) {
                    ArrayList arrayList2 = mp.u1(this.a).R1().w.b;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        c7 c7Var = (c7) obj;
                        if (!c7Var.g && !c7Var.w) {
                            arrayList.add(c7Var);
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
                ue ueVar = (ue) MediaController.c2.get(i12);
                int i13 = ueVar.a;
                ue ueVar2 = this.f0;
                if (i13 == ueVar2.a && ueVar.b == ueVar2.b) {
                    this.f0 = ueVar;
                    break;
                }
                i12++;
            }
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f0 = MediaController.a2;
            } else {
                this.f0 = (ue) this.h0.get(0);
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
        bi.t2 t2Var = this.j0;
        if (t2Var != null) {
            t2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ue ueVar, boolean z10) {
        this.f0 = ueVar;
        this.g0 = b(ueVar);
        this.i0.clear();
        i();
        ue ueVar2 = this.f0;
        ue ueVar3 = MediaController.a2;
        TextView textView = this.E;
        if (ueVar2 == ueVar3) {
            textView.setText(gd.N0(2131752226, null));
        } else if (ueVar2 == k0) {
            textView.setText(gd.N0(2131744438, null));
        } else {
            textView.setText(ueVar2.c);
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
            this.a0.a((ef) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.d;
            if (i7 >= size) {
                this.b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                org.telegram.messenger.g0.Z3(b1Var);
                j();
                return;
            }
            Object obj = arrayList.get(i7);
            i7++;
            ef efVar = (ef) obj;
            if (!efVar.b || efVar.d()) {
                bitmap = null;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= b1Var.getChildCount()) {
                        z2Var = null;
                        break;
                    }
                    View childAt = b1Var.getChildAt(i10);
                    if (childAt instanceof z2) {
                        z2Var = (z2) childAt;
                        if (z2Var.T == efVar) {
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
        di.b1 b1Var = this.d;
        if (b1Var == null || b1Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                View childAt = b1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        }
        return b1Var == null ? padding : org.telegram.messenger.g0.W1(b1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.q.y * 0.35f);
    }

    public ue getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        return gd.N0(this.M ? 2131754425 : 2131752109, null);
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
        Collections.sort(arrayList2, new di.s4(arrayList, 2));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        ue ueVar = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, ueVar);
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
            ue ueVar2 = (ue) this.h0.get(i7);
            if (ueVar2 == ueVar) {
                aVar = new a(getContext(), ueVar2.d, gd.O0("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(ueVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), ueVar2.d, ueVar2.c, b10.size(), this.b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.x2(21, this, ueVar2));
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
            n10.o(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -org.telegram.messenger.g0.n : org.telegram.messenger.g0.L(8.0f)), nr.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            e eVar = this.K;
            if (eVar != null) {
                eVar.i(gd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.g0.n);
            if (this.U != z10) {
                this.U = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(32.0f) : 0.0f).setInterpolator(nr.h).setDuration(320L).setListener(new bi.h7(10, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ks.e().c(this, ks.r2);
        ks.f(this.a).c(this, ks.B5);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.r2);
        ks.f(this.a).n(this, ks.B5);
        z2.f0.clear();
        z2.g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = z2.d0;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((org.telegram.messenger.r5) arrayList.get(i7)).cleanupQueue();
                ((org.telegram.messenger.r5) arrayList.get(i7)).recycle();
                i7++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        di.b1 b1Var = this.d;
        b1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L((org.telegram.messenger.g0.n > 0 ? 0 : 10) + ks.z1);
        }
        b1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.n);
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
            org.telegram.messenger.g0.Z3(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(q10 q10Var) {
        this.a0 = q10Var;
    }

    public void setOnSelectMultipleListener(s10 s10Var) {
        this.b0 = s10Var;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
