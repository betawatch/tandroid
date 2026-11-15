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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l81 extends org.telegram.ui.ActionBar.e2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final m4 J;
    public final ux0 K;
    public final ni0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.uj0 a;
    public org.telegram.ui.Components.uj0 b;
    public TextView c;
    public i81 d;
    public k81 e;
    public final ArrayList f;
    public final ArrayList h;
    public eh0 n;
    public org.telegram.ui.Components.ny r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public org.telegram.ui.Cells.ha y;

    public l81(int i7) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new m4(this, 16);
        this.K = new ux0(this, 8);
        this.L = new ni0(this, 21);
        this.arguments = r.b.f(i7, TeXSymbolParser.TYPE_ATTR);
    }

    public final void Z() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false)) != this.O || this.P != org.telegram.ui.ActionBar.j6.I.q())) {
            this.P = org.telegram.ui.ActionBar.j6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.j6.H1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.j6.H1(this.c.getBackground(), org.telegram.ui.ActionBar.y5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h6, false));
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
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.b7, false);
            if (this.M != null) {
                if (this.N != x02) {
                }
                for (i7 = 0; i7 < this.a.getChildCount(); i7++) {
                    View childAt = this.a.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.x6) && (childAt.getBackground() instanceof org.telegram.ui.Components.fq)) {
                        org.telegram.ui.ActionBar.j6.B1(childAt.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false), false);
                        Drawable drawable = ((org.telegram.ui.Components.fq) childAt.getBackground()).b;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M);
                        }
                        childAt.invalidate();
                    }
                }
            }
            this.N = x02;
            this.M = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
            while (i7 < this.a.getChildCount()) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.H = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748978, null));
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 16));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new g81(this);
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.a = uj0Var;
        uj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.a;
        i81 i81Var = new i81(this);
        this.d = i81Var;
        uj0Var2.setAdapter(i81Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.a;
        ux0 ux0Var = this.K;
        uj0Var3.setOnItemClickListener(ux0Var);
        org.telegram.ui.Components.uj0 uj0Var4 = this.a;
        ni0 ni0Var = this.L;
        uj0Var4.setOnItemLongClickListener(ni0Var);
        org.telegram.ui.Components.uj0 uj0Var5 = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var5;
        uj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var6 = this.b;
        k81 k81Var = new k81(this);
        this.e = k81Var;
        uj0Var6.setAdapter(k81Var);
        this.b.setOnItemClickListener(ux0Var);
        this.b.setOnItemLongClickListener(ni0Var);
        this.b.setOnScrollListener(new y11(this, 4));
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.r = nyVar;
        nyVar.setShowAtCenter(true);
        this.r.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ja.c(-2.0f, -2));
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
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i7, view, null);
        eh0 eh0Var = new eh0(context, 13);
        this.n = eh0Var;
        eh0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.g0.o());
        this.c.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
        frameLayout.addView(this.n, c8.ja.e(-1, 64, 80));
        org.telegram.ui.ActionBar.q6.h(i7, this.n, null);
        this.n.addView(this.c, c8.ja.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new ky0(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        int i7 = org.telegram.ui.ActionBar.j6.Ri;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Hi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
