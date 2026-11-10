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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.f2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public org.telegram.messenger.qv c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public dz0 n;
    public org.telegram.ui.Components.pj0 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.r8 r8Var, int i7) {
        for (int i10 = 0; i10 < r8Var.getChildCount(); i10++) {
            View childAt = r8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.ch0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                org.telegram.ui.ActionBar.h6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.rv c0() {
        org.telegram.messenger.qv qvVar = this.c;
        return qvVar != null ? qvVar : org.telegram.messenger.b6.f(this.a);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 8));
        int i7 = 2;
        if (this.c == null) {
            int i10 = this.a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745919, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745926, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745928, null));
            }
        } else if (this.d) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747895, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745927, null));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.r = pj0Var;
        pj0Var.r1();
        this.r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.m = false;
        this.r.setItemAnimator(kVar);
        this.r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.r;
        dz0 dz0Var = new dz0(this);
        this.n = dz0Var;
        pj0Var2.setAdapter(dz0Var);
        this.r.setOnItemClickListener(new cz0(this));
        this.r.setOnItemLongClickListener(new cz0(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(org.telegram.messenger.id.M0(this.d ? 2131754432 : 2131745943, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
            frameLayout2.addView(textView, c8.ha.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new qy0(this, i7));
            frameLayout.addView(frameLayout2, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
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
        org.telegram.messenger.qv qvVar = this.c;
        m10.put(qvVar.d, qvVar);
        getUserConfig().A(this.a, m10);
    }

    public final void e0() {
        ArrayList arrayList;
        String M0;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z9 = this.isPaused;
        ArrayList arrayList2 = this.s;
        if (z9 || this.n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new ez0(9));
            arrayList2.add(new ez0(3));
        }
        arrayList2.add(new ez0(5, org.telegram.messenger.id.M0(2131745929, null)));
        this.e = arrayList2.size();
        arrayList2.add(new ez0(6));
        this.f = arrayList2.size();
        arrayList2.add(new ez0(6));
        if (this.c != null) {
            M0 = org.telegram.messenger.id.M0(2131745924, null);
        } else {
            int i7 = this.a;
            M0 = i7 == 1 ? org.telegram.messenger.id.M0(2131745922, null) : i7 == 4 ? org.telegram.messenger.id.M0(2131745925, null) : i7 == 2 ? org.telegram.messenger.id.M0(2131745923, null) : null;
        }
        arrayList2.add(new ez0(7, M0));
        if (c0().b) {
            arrayList2.add(new ez0(5, org.telegram.messenger.id.M0(2131748668, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new ez0(8));
            this.h = arrayList2.size();
            arrayList2.add(new ez0(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().m(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new ez0(1));
            int i10 = 0;
            boolean z10 = false;
            while (i10 < this.w.size()) {
                arrayList2.add(new ez0((org.telegram.messenger.qv) this.w.valueAt(i10)));
                i10++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new ez0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new ez0(4));
            }
            arrayList2.add(new ez0(10));
        }
        dz0 dz0Var = this.n;
        if (dz0Var != null) {
            if (arrayList != null) {
                dz0Var.E(arrayList, arrayList2);
            } else {
                dz0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().m(this.a);
        long j3 = getArguments().getLong("dialog_id");
        this.b = j3;
        if (j3 != 0) {
            org.telegram.messenger.qv qvVar = (org.telegram.messenger.qv) org.telegram.messenger.p10.i(this.currentAccount).m(this.a).get(this.b);
            this.c = qvVar;
            if (qvVar == null) {
                this.d = true;
                this.c = new org.telegram.messenger.qv();
                org.telegram.messenger.sv f10 = org.telegram.messenger.b6.f(this.a);
                org.telegram.messenger.qv qvVar2 = this.c;
                qvVar2.a = f10.a;
                qvVar2.b = f10.b;
                qvVar2.c = f10.c;
                qvVar2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
