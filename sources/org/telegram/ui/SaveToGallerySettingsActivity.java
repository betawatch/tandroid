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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.k2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.bw c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public n01 n;
    public org.telegram.ui.Components.tk0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void a0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.t8 t8Var, int i10) {
        for (int i11 = 0; i11 < t8Var.getChildCount(); i11++) {
            View childAt = t8Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.ei0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                org.telegram.ui.ActionBar.p6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.cw b0() {
        org.telegram.messenger.bw bwVar = this.c;
        return bwVar != null ? bwVar : org.telegram.messenger.js.f(this.a);
    }

    public final void c0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            org.telegram.messenger.js.n(this.a);
            return;
        }
        LongSparseArray m10 = getUserConfig().m(this.a);
        org.telegram.messenger.bw bwVar = this.c;
        m10.put(bwVar.d, bwVar);
        getUserConfig().A(this.a, m10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 29));
        int i10 = 2;
        if (this.c == null) {
            int i11 = this.a;
            if (i11 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745936, null));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745943, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745945, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747911, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745944, null));
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.r = tk0Var;
        tk0Var.r1();
        this.r.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.r.setItemAnimator(jVar);
        this.r.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.r;
        n01 n01Var = new n01(this);
        this.n = n01Var;
        tk0Var2.setAdapter(n01Var);
        this.r.setOnItemClickListener(new m01(this));
        this.r.setOnItemLongClickListener(new m01(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.cd.L0(this.d ? 2131754432 : 2131745960, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
            frameLayout2.addView(textView, w7.b6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new a01(this, i10));
            frameLayout.addView(frameLayout2, w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
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
        arrayList2.add(new o01(5, org.telegram.messenger.cd.L0(2131745946, null)));
        this.e = arrayList2.size();
        arrayList2.add(new o01(6));
        this.f = arrayList2.size();
        arrayList2.add(new o01(6));
        if (this.c != null) {
            L0 = org.telegram.messenger.cd.L0(2131745941, null);
        } else {
            int i10 = this.a;
            L0 = i10 == 1 ? org.telegram.messenger.cd.L0(2131745939, null) : i10 == 4 ? org.telegram.messenger.cd.L0(2131745942, null) : i10 == 2 ? org.telegram.messenger.cd.L0(2131745940, null) : null;
        }
        arrayList2.add(new o01(7, L0));
        if (b0().b) {
            arrayList2.add(new o01(5, org.telegram.messenger.cd.L0(2131748683, null)));
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
                arrayList2.add(new o01((org.telegram.messenger.bw) this.w.valueAt(i11)));
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
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
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
            org.telegram.messenger.bw bwVar = (org.telegram.messenger.bw) org.telegram.messenger.d20.i(this.currentAccount).m(this.a).get(this.b);
            this.c = bwVar;
            if (bwVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.bw();
                org.telegram.messenger.dw f7 = org.telegram.messenger.js.f(this.a);
                org.telegram.messenger.bw bwVar2 = this.c;
                bwVar2.a = f7.a;
                bwVar2.b = f7.b;
                bwVar2.c = f7.c;
                bwVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        d0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
