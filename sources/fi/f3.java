package fi;

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
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class f3 extends FrameLayout implements ls {
    public static final we j0 = new we(-1, null, null);
    public final TextView D;
    public final Drawable E;
    public final w2 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.w5 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public v10 W;
    public final int a;
    public x10 a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public final ArrayList b0;
    public final Paint c;
    public boolean c0;
    public final bi.q1 d;
    public boolean d0;
    public final ei.h e;
    public we e0;
    public final z2 f;
    public ArrayList f0;
    public ArrayList g0;
    public final FrameLayout h;
    public final ArrayList h0;
    public di.a4 i0;
    public final pj0 n;
    public final x2 r;
    public final av0 s;
    public final q3 w;
    public boolean x;
    public final org.telegram.ui.ActionBar.k y;

    public f3(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, we weVar, boolean z9, float f10, boolean z10, boolean z11) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = new ArrayList();
        this.O = f10;
        this.a = i7;
        this.b = f6Var;
        this.L = z9;
        this.M = z10;
        this.P = z11;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), TLObject.FLAG_27);
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 3);
        this.d = q1Var;
        q1Var.setItemSelectorColorProvider(new di.a1(22));
        z2 z2Var = new z2(this);
        this.f = z2Var;
        q1Var.setAdapter(z2Var);
        ei.h hVar = new ei.h(1, this);
        this.e = hVar;
        q1Var.setLayoutManager(hVar);
        q1Var.setFastScrollEnabled(1);
        q1Var.setFastScrollVisible(true);
        q1Var.getFastScroll().setAlpha(0.0f);
        hVar.O = new ai.l(this, 4);
        q1Var.i(new di.k(2));
        final int i10 = 0;
        q1Var.setClipToPadding(false);
        addView(q1Var, c8.ha.e(-1, -1, qs.E1));
        q1Var.setOnItemClickListener(new bj0(this) { // from class: fi.q2
            public final /* synthetic */ f3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i11, View view) {
                v10 v10Var;
                switch (i10) {
                    case 0:
                        f3 f3Var = this.b;
                        ArrayList arrayList2 = f3Var.b0;
                        ArrayList arrayList3 = f3Var.h0;
                        if (i11 >= 2 && f3Var.W != null && (view instanceof b3)) {
                            b3 b3Var = (b3) view;
                            int i12 = i11 - 2;
                            if (!f3Var.c0) {
                                if (f3Var.d0) {
                                    if (i12 >= 0 && i12 < arrayList2.size()) {
                                        e7 e7Var = (e7) arrayList2.get(i12);
                                        f3Var.W.a(e7Var, e7Var.K ? f3.d(b3Var) : null);
                                        break;
                                    } else {
                                        i12 -= arrayList2.size();
                                    }
                                }
                            } else if (i12 == 0) {
                                f3Var.e(f3.j0, true);
                                break;
                            } else {
                                i12 = i11 - 3;
                            }
                            if (i12 >= 0 && i12 < f3Var.f0.size()) {
                                gf gfVar = (gf) f3Var.f0.get(i12);
                                if (arrayList3.isEmpty() && !f3Var.Q) {
                                    v10 v10Var2 = f3Var.W;
                                    if (gfVar.b && !gfVar.d()) {
                                        r6 = f3.d(b3Var);
                                    }
                                    v10Var2.a(gfVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(gfVar)) {
                                        arrayList3.remove(gfVar);
                                    } else if (arrayList3.size() + 1 > f3Var.R) {
                                        int i13 = -f3Var.N;
                                        f3Var.N = i13;
                                        org.telegram.messenger.g0.G3(i13, b3Var, null);
                                        org.telegram.messenger.p2.D.a();
                                        break;
                                    } else {
                                        arrayList3.add(gfVar);
                                    }
                                    org.telegram.messenger.g0.b4(f3Var.d);
                                    f3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        f3 f3Var2 = this.b;
                        x2 x2Var = f3Var2.r;
                        org.telegram.ui.ActionBar.r0 r0Var = f3Var2.G;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < x2Var.c.size() && (v10Var = f3Var2.W) != null) {
                            v10Var.a(x2Var.c.get(i11), null);
                            break;
                        }
                        break;
                }
            }
        });
        q1Var.setOnItemLongClickListener(new di.q4(this, 11));
        q1Var.setOnScrollListener(new v2(this, i10));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.C(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, c8.ha.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.s(this, 2));
        org.telegram.ui.ActionBar.y q10 = kVar.q();
        w2 w2Var = new w2(this, context, q10, f6Var, 0);
        this.F = w2Var;
        w2Var.setSubMenuOpenSide(1);
        kVar.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r2
            public final /* synthetic */ f3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.F.U(null, null);
                        break;
                    case 1:
                        f3 f3Var = this.b;
                        if (f3Var.I.getAlpha() >= 0.25f) {
                            f3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        f3 f3Var2 = this.b;
                        if (f3Var2.I.getAlpha() >= 0.25f) {
                            f3Var2.f(true);
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
        this.D = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(10.0f), 0);
        w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ha.e(-1, -1, qs.E1));
        pj0 pj0Var = new pj0(context, f6Var);
        this.n = pj0Var;
        pj0Var.setLayoutManager(new v4.s(3));
        x2 x2Var = new x2(this);
        this.r = x2Var;
        pj0Var.setAdapter(x2Var);
        int i11 = 1;
        pj0Var.setOnScrollListener(new v2(this, i11));
        pj0Var.setClipToPadding(true);
        pj0Var.i(new di.k(i11));
        frameLayout.addView(pj0Var, c8.ha.e(-1, -1, qs.E1));
        s2 s2Var = new s2(i10, context, f6Var);
        float f11 = 10.0f;
        s2Var.setViewType(2);
        s2Var.setAlpha(0.0f);
        s2Var.setVisibility(8);
        frameLayout.addView(s2Var, c8.ha.e(-1, -1, qs.E1));
        av0 av0Var = new av0(context, s2Var, 11, f6Var);
        this.s = av0Var;
        xh.l lVar = av0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.y6, f6Var);
        lVar.setTypeface(null);
        lVar.setText(id.M0(2131745763, null));
        this.w = new q3(this, false, new ai.i(this, 20));
        frameLayout.addView(av0Var, c8.ha.e(-1, -1, qs.E1));
        pj0Var.setEmptyView(av0Var);
        org.telegram.ui.ActionBar.r0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new u2(this);
        this.G = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(id.M0(2131745764, null));
        final int i12 = 1;
        pj0Var.setOnItemClickListener(new bj0(this) { // from class: fi.q2
            public final /* synthetic */ f3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i112, View view) {
                v10 v10Var;
                switch (i12) {
                    case 0:
                        f3 f3Var = this.b;
                        ArrayList arrayList2 = f3Var.b0;
                        ArrayList arrayList3 = f3Var.h0;
                        if (i112 >= 2 && f3Var.W != null && (view instanceof b3)) {
                            b3 b3Var = (b3) view;
                            int i122 = i112 - 2;
                            if (!f3Var.c0) {
                                if (f3Var.d0) {
                                    if (i122 >= 0 && i122 < arrayList2.size()) {
                                        e7 e7Var = (e7) arrayList2.get(i122);
                                        f3Var.W.a(e7Var, e7Var.K ? f3.d(b3Var) : null);
                                        break;
                                    } else {
                                        i122 -= arrayList2.size();
                                    }
                                }
                            } else if (i122 == 0) {
                                f3Var.e(f3.j0, true);
                                break;
                            } else {
                                i122 = i112 - 3;
                            }
                            if (i122 >= 0 && i122 < f3Var.f0.size()) {
                                gf gfVar = (gf) f3Var.f0.get(i122);
                                if (arrayList3.isEmpty() && !f3Var.Q) {
                                    v10 v10Var2 = f3Var.W;
                                    if (gfVar.b && !gfVar.d()) {
                                        r6 = f3.d(b3Var);
                                    }
                                    v10Var2.a(gfVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(gfVar)) {
                                        arrayList3.remove(gfVar);
                                    } else if (arrayList3.size() + 1 > f3Var.R) {
                                        int i13 = -f3Var.N;
                                        f3Var.N = i13;
                                        org.telegram.messenger.g0.G3(i13, b3Var, null);
                                        org.telegram.messenger.p2.D.a();
                                        break;
                                    } else {
                                        arrayList3.add(gfVar);
                                    }
                                    org.telegram.messenger.g0.b4(f3Var.d);
                                    f3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        f3 f3Var2 = this.b;
                        x2 x2Var2 = f3Var2.r;
                        org.telegram.ui.ActionBar.r0 r0Var = f3Var2.G;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i112 >= 0 && i112 < x2Var2.c.size() && (v10Var = f3Var2.W) != null) {
                            v10Var.a(x2Var2.c.get(i112), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z9) {
            ArrayList arrayList2 = qp.s1(i7).P1().w.b;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                e7 e7Var = (e7) obj;
                if (!e7Var.g && !e7Var.w) {
                    this.b0.add(e7Var);
                }
            }
        }
        if (z10) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, linearLayout, f6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : f11) + org.telegram.messenger.g0.n);
            addView(linearLayout, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            final int i14 = 1;
            d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
            this.J = h;
            h.i(id.H(',', "StoriesCreate", 1), false, true);
            if (!z11) {
                linearLayout.addView(h, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                h.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r2
                    public final /* synthetic */ f3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.F.U(null, null);
                                break;
                            case 1:
                                f3 f3Var = this.b;
                                if (f3Var.I.getAlpha() >= 0.25f) {
                                    f3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                f3 f3Var2 = this.b;
                                if (f3Var2.I.getAlpha() >= 0.25f) {
                                    f3Var2.f(true);
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
            d h7 = org.telegram.messenger.k5.h(24, context, f6Var, z11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            wp wpVar = new wp(R.drawable.mini_collage, 0);
            float f12 = -org.telegram.messenger.g0.L(1.33f);
            float L = org.telegram.messenger.g0.L(0.66f);
            wpVar.r = f12;
            wpVar.s = L;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131744782, null));
            h7.i(spannableStringBuilder, false, true);
            linearLayout.addView(h7, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i15 = 2;
            h7.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r2
                public final /* synthetic */ f3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            f3 f3Var = this.b;
                            if (f3Var.I.getAlpha() >= 0.25f) {
                                f3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            f3 f3Var2 = this.b;
                            if (f3Var2.I.getAlpha() >= 0.25f) {
                                f3Var2.f(true);
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
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            int L2 = org.telegram.messenger.g0.L(56.0f);
            int i16 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i16, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
            imageView.setBackground(L3);
            org.telegram.ui.ActionBar.r6.k(imageView, L3, N, null, f6Var);
            c8.ka.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r2
                public final /* synthetic */ f3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            f3 f3Var = this.b;
                            if (f3Var.I.getAlpha() >= 0.25f) {
                                f3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            f3 f3Var2 = this.b;
                            if (f3Var2.I.getAlpha() >= 0.25f) {
                                f3Var2.f(true);
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
        we weVar2 = j0;
        if (weVar == null || (weVar == weVar2 && this.b0.size() <= 0)) {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.Z1;
            } else {
                this.e0 = (we) this.g0.get(0);
            }
        } else {
            this.e0 = weVar;
        }
        this.f0 = b(this.e0);
        i();
        we weVar3 = this.e0;
        if (weVar3 == MediaController.Z1) {
            this.D.setText(id.M0(2131752238, null));
        } else if (weVar3 == weVar2) {
            this.D.setText(id.M0(2131744682, null));
        } else {
            this.D.setText(weVar3.c);
        }
    }

    public static Bitmap d(b3 b3Var) {
        Bitmap bitmap;
        if (b3Var == null || (bitmap = b3Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.E(6.0f, bitmap);
    }

    public final ArrayList b(we weVar) {
        if (weVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = weVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            gf gfVar = (gf) arrayList.get(i7);
            if (!this.L || !gfVar.b) {
                arrayList2.add(gfVar);
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.r2;
        z2 z2Var = this.f;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == qs.y5) {
                ArrayList arrayList = this.b0;
                arrayList.clear();
                if (!this.L) {
                    ArrayList arrayList2 = qp.s1(this.a).P1().w.b;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        e7 e7Var = (e7) obj;
                        if (!e7Var.g && !e7Var.w) {
                            arrayList.add(e7Var);
                        }
                    }
                }
                h();
                i();
                if (z2Var != null) {
                    z2Var.f();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.e0 != null) {
            while (true) {
                if (i12 >= MediaController.b2.size()) {
                    break;
                }
                we weVar = (we) MediaController.b2.get(i12);
                int i13 = weVar.a;
                we weVar2 = this.e0;
                if (i13 == weVar2.a && weVar.b == weVar2.b) {
                    this.e0 = weVar;
                    break;
                }
                i12++;
            }
        } else {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.Z1;
            } else {
                this.e0 = (we) this.g0.get(0);
            }
        }
        this.f0 = b(this.e0);
        this.h0.clear();
        i();
        if (z2Var != null) {
            z2Var.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z9 = g10 <= ((float) jg.g.e(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, 0));
        float d = this.S.d(z9);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z9 != this.x) {
            this.x = z9;
            c(z9);
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
        di.a4 a4Var = this.i0;
        if (a4Var != null) {
            a4Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(we weVar, boolean z9) {
        this.e0 = weVar;
        this.f0 = b(weVar);
        this.h0.clear();
        i();
        we weVar2 = this.e0;
        we weVar3 = MediaController.Z1;
        TextView textView = this.D;
        if (weVar2 == weVar3) {
            textView.setText(id.M0(2131752238, null));
        } else if (weVar2 == j0) {
            textView.setText(id.M0(2131744682, null));
        } else {
            textView.setText(weVar2.c);
        }
        this.f.f();
        ei.h hVar = this.e;
        if (!z9) {
            hVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        mi.m mVar = new mi.m(getContext(), 2);
        mVar.a = 1;
        mVar.p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        hVar.w0(mVar);
    }

    public final void f(boolean z9) {
        Bitmap bitmap;
        b3 b3Var;
        if (this.a0 == null) {
            return;
        }
        ArrayList arrayList = this.h0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.W.a((gf) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            bi.q1 q1Var = this.d;
            if (i7 >= size) {
                this.a0.a(Boolean.valueOf(z9), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                org.telegram.messenger.g0.b4(q1Var);
                j();
                return;
            }
            Object obj = arrayList.get(i7);
            i7++;
            gf gfVar = (gf) obj;
            if (!gfVar.b || gfVar.d()) {
                bitmap = null;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= q1Var.getChildCount()) {
                        b3Var = null;
                        break;
                    }
                    View childAt = q1Var.getChildAt(i10);
                    if (childAt instanceof b3) {
                        b3Var = (b3) childAt;
                        if (b3Var.S == gfVar) {
                            break;
                        }
                    }
                    i10++;
                }
                bitmap = d(b3Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        bi.q1 q1Var = this.d;
        if (q1Var == null || q1Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i10 = 0; i10 < q1Var.getChildCount(); i10++) {
                View childAt = q1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        }
        return q1Var == null ? padding : org.telegram.messenger.g0.W1(q1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.q.y * 0.35f);
    }

    public we getSelectedAlbum() {
        return this.e0;
    }

    public String getTitle() {
        return id.M0(this.L ? 2131754428 : 2131752121, null);
    }

    public final void h() {
        a aVar;
        w2 w2Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.b2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.g0 = arrayList2;
        Collections.sort(arrayList2, new bi.s5(arrayList, 2));
        ArrayList arrayList3 = this.b0;
        boolean isEmpty = arrayList3.isEmpty();
        we weVar = j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.g0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, weVar);
        }
        boolean isEmpty2 = this.g0.isEmpty();
        TextView textView = this.D;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            we weVar2 = (we) this.g0.get(i7);
            if (weVar2 == weVar) {
                aVar = new a(getContext(), weVar2.d, id.N0("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(weVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), weVar2.d, weVar2.c, b10.size(), this.b);
                }
            }
            w2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.r(13, this, weVar2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.g0;
        boolean z9 = true;
        boolean z10 = arrayList2 != null && !arrayList2.isEmpty() && this.g0.get(0) == this.e0 && this.b0.size() > 2;
        this.c0 = z10;
        if (z10 || (this.e0 != j0 && ((arrayList = this.g0) == null || arrayList.isEmpty() || this.g0.get(0) != this.e0))) {
            z9 = false;
        }
        this.d0 = z9;
    }

    public final void j() {
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z9 = !isEmpty;
        ImageView imageView = this.H;
        if (imageView != null) {
            org.telegram.messenger.camera.q.l(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -org.telegram.messenger.g0.n : org.telegram.messenger.g0.L(8.0f)), xq.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(id.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.g0.n);
            if (this.T != z9) {
                this.T = z9;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(32.0f) : 0.0f).setInterpolator(xq.h).setDuration(320L).setListener(new ch.y(9, this, z9)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        qs.e().c(this, qs.r2);
        qs.f(this.a).c(this, qs.y5);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.r2);
        qs.f(this.a).n(this, qs.y5);
        b3.e0.clear();
        b3.f0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = b3.c0;
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
        bi.q1 q1Var = this.d;
        q1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L((org.telegram.messenger.g0.n > 0 ? 0 : 10) + qs.z1);
        }
        q1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.n);
        ImageView imageView = this.H;
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
        TextView textView = this.D;
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
        this.R = i7;
    }

    public void setMultipleOnClick(boolean z9) {
        if (this.Q != z9) {
            this.Q = z9;
            org.telegram.messenger.g0.b4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(v10 v10Var) {
        this.W = v10Var;
    }

    public void setOnSelectMultipleListener(x10 x10Var) {
        this.a0 = x10Var;
    }

    public void c(boolean z9) {
    }

    public void a() {
    }
}
