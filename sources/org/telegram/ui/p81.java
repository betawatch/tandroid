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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.ActionBar.f2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final ay0 J;
    public final oi0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.pj0 a;
    public org.telegram.ui.Components.pj0 b;
    public TextView c;
    public m81 d;
    public o81 e;
    public final ArrayList f;
    public final ArrayList h;
    public vq0 n;
    public org.telegram.ui.Components.iy r;
    public FrameLayout s;
    public int w;
    public final HashSet x;
    public org.telegram.ui.Cells.ha y;

    public p81(int i7) {
        super(null);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.x = new HashSet();
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new ay0(this, 8);
        this.K = new oi0(this, 21);
        this.arguments = rf.b.f(i7, TeXSymbolParser.TYPE_ATTR);
    }

    public final void Z() {
        int x02;
        if (this.c != null && ((x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.m6.I.q())) {
            this.O = org.telegram.ui.ActionBar.m6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.m6.H1(this.c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.m6.H1(this.c.getBackground(), org.telegram.ui.ActionBar.b6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h6, false));
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
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.b7, false);
            if (this.L != null) {
                if (this.M != x02) {
                }
                for (i7 = 0; i7 < this.a.getChildCount(); i7++) {
                    View childAt = this.a.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.y6) && (childAt.getBackground() instanceof org.telegram.ui.Components.xp)) {
                        org.telegram.ui.ActionBar.m6.B1(childAt.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a7, false), false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.G = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748978, null));
        this.actionBar.setActionBarMenuOnItemClick(new qt0(this, 15));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new k81(this);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.a;
        m81 m81Var = new m81(this);
        this.d = m81Var;
        pj0Var2.setAdapter(m81Var);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.a;
        ay0 ay0Var = this.J;
        pj0Var3.setOnItemClickListener(ay0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.a;
        oi0 oi0Var = this.K;
        pj0Var4.setOnItemLongClickListener(oi0Var);
        org.telegram.ui.Components.pj0 pj0Var5 = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var5;
        pj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var6 = this.b;
        o81 o81Var = new o81(this);
        this.e = o81Var;
        pj0Var6.setAdapter(o81Var);
        this.b.setOnItemClickListener(ay0Var);
        this.b.setOnItemLongClickListener(oi0Var);
        this.b.setOnScrollListener(new e21(this, 4));
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.r = iyVar;
        iyVar.setShowAtCenter(true);
        this.r.setText(org.telegram.messenger.id.M0(2131748167, null));
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
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.t6.h(i7, view, null);
        vq0 vq0Var = new vq0(context, 11);
        this.n = vq0Var;
        vq0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.g0.o());
        this.c.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
        frameLayout.addView(this.n, c8.ha.e(-1, 64, 80));
        org.telegram.ui.ActionBar.t6.h(i7, this.n, null);
        this.n.addView(this.c, c8.ha.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.n.setVisibility(8);
        this.c.setOnClickListener(new qy0(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        int i7 = org.telegram.ui.ActionBar.m6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.j7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ei));
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
