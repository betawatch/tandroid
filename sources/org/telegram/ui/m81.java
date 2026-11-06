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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class m81 extends org.telegram.ui.ActionBar.f2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final vx0 J;
    public final li0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.pj0 a;
    public org.telegram.ui.Components.pj0 b;
    public TextView c;
    public j81 d;
    public l81 e;
    public final ArrayList f;
    public final ArrayList h;
    public sq0 n;
    public org.telegram.ui.Components.iy r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public org.telegram.ui.Cells.ha y;

    public m81(int i7) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new vx0(this, 8);
        this.K = new li0(this, 21);
        this.arguments = rf.b.f(i7, TeXSymbolParser.TYPE_ATTR);
    }

    public final void Z() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.k6.I.q())) {
            this.O = org.telegram.ui.ActionBar.k6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.k6.H1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(this.c.getBackground(), org.telegram.ui.ActionBar.z5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:7:0x0005, B:9:0x0011, B:13:0x0024, B:15:0x002c, B:17:0x0036, B:19:0x003e, B:21:0x0055, B:22:0x005a, B:30:0x0018), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        int i7;
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.b7, false);
            if (this.L != null) {
                if (this.M != x02) {
                }
                for (i7 = 0; i7 < this.a.getChildCount(); i7++) {
                    View childAt = this.a.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.y6) && (childAt.getBackground() instanceof org.telegram.ui.Components.xp)) {
                        org.telegram.ui.ActionBar.k6.B1(childAt.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false), false);
                        Drawable drawable = ((org.telegram.ui.Components.xp) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.L);
                        }
                        childAt.invalidate();
                    }
                }
            }
            this.M = x02;
            this.L = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
            while (i7 < this.a.getChildCount()) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.G = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748977, null));
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 15));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new h81(this);
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.a;
        j81 j81Var = new j81(this);
        this.d = j81Var;
        pj0Var2.setAdapter(j81Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.a;
        vx0 vx0Var = this.J;
        pj0Var3.setOnItemClickListener(vx0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.a;
        li0 li0Var = this.K;
        pj0Var4.setOnItemLongClickListener(li0Var);
        org.telegram.ui.Components.pj0 pj0Var5 = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var5;
        pj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var6 = this.b;
        l81 l81Var = new l81(this);
        this.e = l81Var;
        pj0Var6.setAdapter(l81Var);
        this.b.setOnItemClickListener(vx0Var);
        this.b.setOnItemLongClickListener(li0Var);
        this.b.setOnScrollListener(new b21(this, 4));
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.r = iyVar;
        iyVar.setShowAtCenter(true);
        this.r.setText(org.telegram.messenger.hd.M0(2131748166, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ha.c(-2.0f, -2));
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
        org.telegram.messenger.g0.i3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i7, view, null);
        sq0 sq0Var = new sq0(context, 11);
        this.n = sq0Var;
        sq0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.g0.o());
        this.c.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        frameLayout.addView(this.n, c8.ha.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i7, this.n, null);
        this.n.addView(this.c, c8.ha.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new my0(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i7 = org.telegram.ui.ActionBar.k6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Z();
            a0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
