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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.d2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.iv c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public py0 n;
    public org.telegram.ui.Components.tj0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.q8 q8Var, int i3) {
        for (int i10 = 0; i10 < q8Var.getChildCount(); i10++) {
            View childAt = q8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.fh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
                org.telegram.ui.ActionBar.e6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.jv c0() {
        org.telegram.messenger.iv ivVar = this.c;
        return ivVar != null ? ivVar : org.telegram.messenger.b6.f(this.a);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 9));
        int i3 = 2;
        if (this.c == null) {
            int i10 = this.a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745929, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745936, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745938, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747903, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745937, null));
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.r = tj0Var;
        tj0Var.r1();
        this.r.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.r.setItemAnimator(kVar);
        this.r.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.r;
        py0 py0Var = new py0(this);
        this.n = py0Var;
        tj0Var2.setAdapter(py0Var);
        this.r.setOnItemClickListener(new oy0(this));
        this.r.setOnItemLongClickListener(new oy0(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.bd.M0(this.d ? 2131754432 : 2131745953, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
            frameLayout2.addView(textView, b8.mf.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new cy0(this, i3));
            frameLayout.addView(frameLayout2, b8.mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            org.telegram.messenger.b6.m(this.a);
            return;
        }
        LongSparseArray m10 = getUserConfig().m(this.a);
        org.telegram.messenger.iv ivVar = this.c;
        m10.put(ivVar.d, ivVar);
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
            arrayList2.add(new qy0(9));
            arrayList2.add(new qy0(3));
        }
        arrayList2.add(new qy0(5, org.telegram.messenger.bd.M0(2131745939, null)));
        this.e = arrayList2.size();
        arrayList2.add(new qy0(6));
        this.f = arrayList2.size();
        arrayList2.add(new qy0(6));
        if (this.c != null) {
            M0 = org.telegram.messenger.bd.M0(2131745934, null);
        } else {
            int i3 = this.a;
            M0 = i3 == 1 ? org.telegram.messenger.bd.M0(2131745932, null) : i3 == 4 ? org.telegram.messenger.bd.M0(2131745935, null) : i3 == 2 ? org.telegram.messenger.bd.M0(2131745933, null) : null;
        }
        arrayList2.add(new qy0(7, M0));
        if (c0().b) {
            arrayList2.add(new qy0(5, org.telegram.messenger.bd.M0(2131748676, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new qy0(8));
            this.h = arrayList2.size();
            arrayList2.add(new qy0(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().m(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new qy0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.w.size()) {
                arrayList2.add(new qy0((org.telegram.messenger.iv) this.w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new qy0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new qy0(4));
            }
            arrayList2.add(new qy0(10));
        }
        py0 py0Var = this.n;
        if (py0Var != null) {
            if (arrayList != null) {
                py0Var.E(arrayList, arrayList2);
            } else {
                py0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().m(this.a);
        long j10 = getArguments().getLong("dialog_id");
        this.b = j10;
        if (j10 != 0) {
            org.telegram.messenger.iv ivVar = (org.telegram.messenger.iv) org.telegram.messenger.h10.i(this.currentAccount).m(this.a).get(this.b);
            this.c = ivVar;
            if (ivVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.iv();
                org.telegram.messenger.kv f10 = org.telegram.messenger.b6.f(this.a);
                org.telegram.messenger.iv ivVar2 = this.c;
                ivVar2.a = f10.a;
                ivVar2.b = f10.b;
                ivVar2.c = f10.c;
                ivVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
