package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ea1 extends org.telegram.ui.ActionBar.k2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final kz0 J;
    public final tj0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.tk0 a;
    public org.telegram.ui.Components.tk0 b;
    public TextView c;
    public ba1 d;
    public da1 e;
    public final ArrayList f;
    public final ArrayList h;
    public dg0 n;
    public org.telegram.ui.Components.xy r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public org.telegram.ui.Cells.ha y;

    public ea1(int i10) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.H = org.telegram.messenger.i0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new kz0(this, 8);
        this.K = new tj0(this, 22);
        this.arguments = org.telegram.ui.Cells.f1.i(i10, TeXSymbolParser.TYPE_ATTR);
    }

    public final void Y() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.t6.I.q())) {
            this.O = org.telegram.ui.ActionBar.t6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.t6.H1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.t6.H1(this.c.getBackground(), org.telegram.ui.ActionBar.j6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:7:0x0005, B:9:0x0011, B:13:0x0024, B:15:0x002c, B:17:0x0036, B:19:0x003e, B:21:0x0055, B:22:0x005a, B:30:0x0018), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        int i10;
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.b7, false);
            if (this.L != null) {
                if (this.M != x02) {
                }
                for (i10 = 0; i10 < this.a.getChildCount(); i10++) {
                    View childAt = this.a.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.c7) && (childAt.getBackground() instanceof org.telegram.ui.Components.eq)) {
                        org.telegram.ui.ActionBar.t6.B1(childAt.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false), false);
                        Drawable drawable = ((org.telegram.ui.Components.eq) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.L);
                        }
                        childAt.invalidate();
                    }
                }
            }
            this.M = x02;
            this.L = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
            while (i10 < this.a.getChildCount()) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.G = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748988, null));
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 6));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new z91(this);
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        ba1 ba1Var = new ba1(this);
        this.d = ba1Var;
        tk0Var2.setAdapter(ba1Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.tk0 tk0Var3 = this.a;
        kz0 kz0Var = this.J;
        tk0Var3.setOnItemClickListener(kz0Var);
        org.telegram.ui.Components.tk0 tk0Var4 = this.a;
        tj0 tj0Var = this.K;
        tk0Var4.setOnItemLongClickListener(tj0Var);
        org.telegram.ui.Components.tk0 tk0Var5 = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var5;
        tk0Var5.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var6 = this.b;
        da1 da1Var = new da1(this);
        this.e = da1Var;
        tk0Var6.setAdapter(da1Var);
        this.b.setOnItemClickListener(kz0Var);
        this.b.setOnItemLongClickListener(tj0Var);
        this.b.setOnScrollListener(new w41(this, 3));
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.r = xyVar;
        xyVar.setShowAtCenter(true);
        this.r.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, w7.b6.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.addView(this.b);
        this.s.addView(this.r);
        this.s.setVisibility(8);
        frameLayout.addView(this.s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.i0.h3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new k(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i10, view, null);
        dg0 dg0Var = new dg0(context, 14);
        this.n = dg0Var;
        dg0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.i0.o());
        this.c.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        frameLayout.addView(this.n, w7.b6.e(-1, 64, 80));
        org.telegram.ui.ActionBar.a7.i(i10, this.n, null);
        this.n.addView(this.c, w7.b6.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new a01(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        int i10 = org.telegram.ui.ActionBar.t6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ei));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Y();
            Z();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
