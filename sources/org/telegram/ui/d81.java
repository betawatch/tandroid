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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d81 extends org.telegram.ui.ActionBar.d2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final o4 J;
    public final nx0 K;
    public final ci0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.tj0 a;
    public org.telegram.ui.Components.tj0 b;
    public TextView c;
    public a81 d;
    public c81 e;
    public final ArrayList f;
    public final ArrayList h;
    public yg0 n;
    public org.telegram.ui.Components.gy r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public org.telegram.ui.Cells.ha y;

    public d81(int i3) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new o4(this, 16);
        this.K = new nx0(this, 8);
        this.L = new ci0(this, 22);
        this.arguments = org.telegram.ui.Cells.f1.k(i3, TeXSymbolParser.TYPE_ATTR);
    }

    public final void Z() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false)) != this.O || this.P != org.telegram.ui.ActionBar.k6.I.q())) {
            this.P = org.telegram.ui.ActionBar.k6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.k6.H1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(this.c.getBackground(), org.telegram.ui.ActionBar.y5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:7:0x0005, B:9:0x0011, B:13:0x0024, B:15:0x002c, B:17:0x0036, B:19:0x003e, B:21:0x0055, B:22:0x005a, B:30:0x0018), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        int i3;
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.b7, false);
            if (this.M != null) {
                if (this.N != x02) {
                }
                for (i3 = 0; i3 < this.a.getChildCount(); i3++) {
                    View childAt = this.a.getChildAt(i3);
                    if ((childAt instanceof org.telegram.ui.Cells.x6) && (childAt.getBackground() instanceof org.telegram.ui.Components.xp)) {
                        org.telegram.ui.ActionBar.k6.B1(childAt.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false), false);
                        Drawable drawable = ((org.telegram.ui.Components.xp) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M);
                        }
                        childAt.invalidate();
                    }
                }
            }
            this.N = x02;
            this.M = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
            while (i3 < this.a.getChildCount()) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.H = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748986, null));
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 16));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new y71(this);
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.a = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.a;
        a81 a81Var = new a81(this);
        this.d = a81Var;
        tj0Var2.setAdapter(a81Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.tj0 tj0Var3 = this.a;
        nx0 nx0Var = this.K;
        tj0Var3.setOnItemClickListener(nx0Var);
        org.telegram.ui.Components.tj0 tj0Var4 = this.a;
        ci0 ci0Var = this.L;
        tj0Var4.setOnItemLongClickListener(ci0Var);
        org.telegram.ui.Components.tj0 tj0Var5 = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var5;
        tj0Var5.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var6 = this.b;
        c81 c81Var = new c81(this);
        this.e = c81Var;
        tj0Var6.setAdapter(c81Var);
        this.b.setOnItemClickListener(nx0Var);
        this.b.setOnItemLongClickListener(ci0Var);
        this.b.setOnScrollListener(new r11(this, 4));
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.r = gyVar;
        gyVar.setShowAtCenter(true);
        this.r.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, b8.mf.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.addView(this.b);
        this.s.addView(this.r);
        this.s.setVisibility(8);
        frameLayout.addView(this.s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.i3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i3, view, null);
        yg0 yg0Var = new yg0(context, 13);
        this.n = yg0Var;
        yg0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.g0.o());
        this.c.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        frameLayout.addView(this.n, b8.mf.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i3, this.n, null);
        this.n.addView(this.c, b8.mf.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new cy0(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i3 = org.telegram.ui.ActionBar.k6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
