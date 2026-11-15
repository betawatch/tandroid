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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.e2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.ov c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public xy0 n;
    public org.telegram.ui.Components.uj0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.q8 q8Var, int i7) {
        for (int i10 = 0; i10 < q8Var.getChildCount(); i10++) {
            View childAt = q8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.fh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
                org.telegram.ui.ActionBar.e6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.pv c0() {
        org.telegram.messenger.ov ovVar = this.c;
        return ovVar != null ? ovVar : org.telegram.messenger.b6.f(this.a);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 9));
        int i7 = 2;
        if (this.c == null) {
            int i10 = this.a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745919, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745926, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745928, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747895, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745927, null));
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.r = uj0Var;
        uj0Var.r1();
        this.r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        this.r.setItemAnimator(kVar);
        this.r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.r;
        xy0 xy0Var = new xy0(this);
        this.n = xy0Var;
        uj0Var2.setAdapter(xy0Var);
        this.r.setOnItemClickListener(new wy0(this));
        this.r.setOnItemLongClickListener(new wy0(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.hd.M0(this.d ? 2131754432 : 2131745943, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
            frameLayout2.addView(textView, c8.ja.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new ky0(this, i7));
            frameLayout.addView(frameLayout2, c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            org.telegram.messenger.b6.o(this.a);
            return;
        }
        LongSparseArray m10 = getUserConfig().m(this.a);
        org.telegram.messenger.ov ovVar = this.c;
        m10.put(ovVar.d, ovVar);
        getUserConfig().A(this.a, m10);
    }

    public final void e0() {
        ArrayList arrayList;
        String M0;
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
            arrayList2.add(new yy0(9));
            arrayList2.add(new yy0(3));
        }
        arrayList2.add(new yy0(5, org.telegram.messenger.hd.M0(2131745929, null)));
        this.e = arrayList2.size();
        arrayList2.add(new yy0(6));
        this.f = arrayList2.size();
        arrayList2.add(new yy0(6));
        if (this.c != null) {
            M0 = org.telegram.messenger.hd.M0(2131745924, null);
        } else {
            int i7 = this.a;
            M0 = i7 == 1 ? org.telegram.messenger.hd.M0(2131745922, null) : i7 == 4 ? org.telegram.messenger.hd.M0(2131745925, null) : i7 == 2 ? org.telegram.messenger.hd.M0(2131745923, null) : null;
        }
        arrayList2.add(new yy0(7, M0));
        if (c0().b) {
            arrayList2.add(new yy0(5, org.telegram.messenger.hd.M0(2131748668, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new yy0(8));
            this.h = arrayList2.size();
            arrayList2.add(new yy0(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().m(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new yy0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.w.size()) {
                arrayList2.add(new yy0((org.telegram.messenger.ov) this.w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new yy0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new yy0(4));
            }
            arrayList2.add(new yy0(10));
        }
        xy0 xy0Var = this.n;
        if (xy0Var != null) {
            if (arrayList != null) {
                xy0Var.E(arrayList, arrayList2);
            } else {
                xy0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().m(this.a);
        long j3 = getArguments().getLong("dialog_id");
        this.b = j3;
        if (j3 != 0) {
            org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) org.telegram.messenger.m10.i(this.currentAccount).m(this.a).get(this.b);
            this.c = ovVar;
            if (ovVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.ov();
                org.telegram.messenger.qv f10 = org.telegram.messenger.b6.f(this.a);
                org.telegram.messenger.ov ovVar2 = this.c;
                ovVar2.a = f10.a;
                ovVar2.b = f10.b;
                ovVar2.c = f10.c;
                ovVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
