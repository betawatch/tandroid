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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.g2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.lv c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public bz0 n;
    public org.telegram.ui.Components.ek0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.s8 s8Var, int i7) {
        for (int i10 = 0; i10 < s8Var.getChildCount(); i10++) {
            View childAt = s8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.rh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                org.telegram.ui.ActionBar.h6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.mv c0() {
        org.telegram.messenger.lv lvVar = this.c;
        return lvVar != null ? lvVar : org.telegram.messenger.c6.f(this.a);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 11));
        int i7 = 2;
        if (this.c == null) {
            int i10 = this.a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745723, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745730, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745732, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131747701, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745731, null));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.r = ek0Var;
        ek0Var.r1();
        this.r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.m = false;
        this.r.setItemAnimator(kVar);
        this.r.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.r;
        bz0 bz0Var = new bz0(this);
        this.n = bz0Var;
        ek0Var2.setAdapter(bz0Var);
        this.r.setOnItemClickListener(new az0(this));
        this.r.setOnItemLongClickListener(new az0(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.hd.N0(this.d ? 2131754429 : 2131745747, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
            frameLayout2.addView(textView, c8.ma.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new oy0(this, i7));
            frameLayout.addView(frameLayout2, c8.ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            org.telegram.messenger.c6.o(this.a);
            return;
        }
        LongSparseArray m10 = getUserConfig().m(this.a);
        org.telegram.messenger.lv lvVar = this.c;
        m10.put(lvVar.d, lvVar);
        getUserConfig().A(this.a, m10);
    }

    public final void e0() {
        ArrayList arrayList;
        String N0;
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
            arrayList2.add(new cz0(9));
            arrayList2.add(new cz0(3));
        }
        arrayList2.add(new cz0(5, org.telegram.messenger.hd.N0(2131745733, null)));
        this.e = arrayList2.size();
        arrayList2.add(new cz0(6));
        this.f = arrayList2.size();
        arrayList2.add(new cz0(6));
        if (this.c != null) {
            N0 = org.telegram.messenger.hd.N0(2131745728, null);
        } else {
            int i7 = this.a;
            N0 = i7 == 1 ? org.telegram.messenger.hd.N0(2131745726, null) : i7 == 4 ? org.telegram.messenger.hd.N0(2131745729, null) : i7 == 2 ? org.telegram.messenger.hd.N0(2131745727, null) : null;
        }
        arrayList2.add(new cz0(7, N0));
        if (c0().b) {
            arrayList2.add(new cz0(5, org.telegram.messenger.hd.N0(2131748475, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new cz0(8));
            this.h = arrayList2.size();
            arrayList2.add(new cz0(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().m(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new cz0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.w.size()) {
                arrayList2.add(new cz0((org.telegram.messenger.lv) this.w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new cz0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new cz0(4));
            }
            arrayList2.add(new cz0(10));
        }
        bz0 bz0Var = this.n;
        if (bz0Var != null) {
            if (arrayList != null) {
                bz0Var.E(arrayList, arrayList2);
            } else {
                bz0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().m(this.a);
        long j3 = getArguments().getLong("dialog_id");
        this.b = j3;
        if (j3 != 0) {
            org.telegram.messenger.lv lvVar = (org.telegram.messenger.lv) org.telegram.messenger.k10.i(this.currentAccount).m(this.a).get(this.b);
            this.c = lvVar;
            if (lvVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.lv();
                org.telegram.messenger.nv f10 = org.telegram.messenger.c6.f(this.a);
                org.telegram.messenger.lv lvVar2 = this.c;
                lvVar2.a = f10.a;
                lvVar2.b = f10.b;
                lvVar2.c = f10.c;
                lvVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
