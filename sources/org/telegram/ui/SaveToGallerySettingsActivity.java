package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.k2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.cw c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public n01 n;
    public org.telegram.ui.Components.uk0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.t8 t8Var, int i10) {
        for (int i11 = 0; i11 < t8Var.getChildCount(); i11++) {
            View childAt = t8Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.fi0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                org.telegram.ui.ActionBar.p6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.dw c0() {
        org.telegram.messenger.cw cwVar = this.c;
        return cwVar != null ? cwVar : org.telegram.messenger.ks.f(this.a);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 29));
        int i10 = 2;
        if (this.c == null) {
            int i11 = this.a;
            if (i11 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745936, null));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745943, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745945, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747911, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745944, null));
        }
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.r = uk0Var;
        uk0Var.r1();
        this.r.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.r.setItemAnimator(jVar);
        this.r.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.r;
        n01 n01Var = new n01(this);
        this.n = n01Var;
        uk0Var2.setAdapter(n01Var);
        this.r.setOnItemClickListener(new m01(this));
        this.r.setOnItemLongClickListener(new m01(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.dd.L0(this.d ? 2131754432 : 2131745960, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
            frameLayout2.addView(textView, w7.b6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new zz0(this, i10));
            frameLayout.addView(frameLayout2, w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            org.telegram.messenger.ks.n(this.a);
            return;
        }
        LongSparseArray m10 = getUserConfig().m(this.a);
        org.telegram.messenger.cw cwVar = this.c;
        m10.put(cwVar.d, cwVar);
        getUserConfig().A(this.a, m10);
    }

    public final void e0() {
        ArrayList arrayList;
        String L0;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.s;
        if (z10 || this.n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new o01(9));
            arrayList2.add(new o01(3));
        }
        arrayList2.add(new o01(5, org.telegram.messenger.dd.L0(2131745946, null)));
        this.e = arrayList2.size();
        arrayList2.add(new o01(6));
        this.f = arrayList2.size();
        arrayList2.add(new o01(6));
        if (this.c != null) {
            L0 = org.telegram.messenger.dd.L0(2131745941, null);
        } else {
            int i10 = this.a;
            L0 = i10 == 1 ? org.telegram.messenger.dd.L0(2131745939, null) : i10 == 4 ? org.telegram.messenger.dd.L0(2131745942, null) : i10 == 2 ? org.telegram.messenger.dd.L0(2131745940, null) : null;
        }
        arrayList2.add(new o01(7, L0));
        if (c0().b) {
            arrayList2.add(new o01(5, org.telegram.messenger.dd.L0(2131748683, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new o01(8));
            this.h = arrayList2.size();
            arrayList2.add(new o01(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().m(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new o01(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.w.size()) {
                arrayList2.add(new o01((org.telegram.messenger.cw) this.w.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new o01(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new o01(4));
            }
            arrayList2.add(new o01(10));
        }
        n01 n01Var = this.n;
        if (n01Var != null) {
            if (arrayList != null) {
                n01Var.E(arrayList, arrayList2);
            } else {
                n01Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().m(this.a);
        long j10 = getArguments().getLong("dialog_id");
        this.b = j10;
        if (j10 != 0) {
            org.telegram.messenger.cw cwVar = (org.telegram.messenger.cw) org.telegram.messenger.e20.i(this.currentAccount).m(this.a).get(this.b);
            this.c = cwVar;
            if (cwVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.cw();
                org.telegram.messenger.ew f7 = org.telegram.messenger.ks.f(this.a);
                org.telegram.messenger.cw cwVar2 = this.c;
                cwVar2.a = f7.a;
                cwVar2.b = f7.b;
                cwVar2.c = f7.c;
                cwVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
