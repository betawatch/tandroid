package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final ArrayList c;
    public final e61 d;
    public final org.telegram.ui.Components.mz e;
    public boolean f;
    public final nc h;
    public boolean n;
    public org.telegram.messenger.c20 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public pc(int i7, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i7;
        this.b = f6Var;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(getContext(), f6Var);
        this.e = mzVar;
        mzVar.setViewType(14);
        mzVar.setVisibility(0);
        addView(mzVar, c8.ha.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        e61 e61Var = new e61(4, activity, f6Var);
        this.d = e61Var;
        e61Var.setClipToPadding(false);
        e61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        e61Var.setLayoutManager(b0Var);
        e61Var.setAlpha(0.0f);
        nc ncVar = new nc(this, i7, f6Var);
        this.h = ncVar;
        e61Var.setAdapter(ncVar);
        addView(e61Var, c8.ha.c(130.0f, -1));
        e61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new oc(this, i7), true);
        if (this.n) {
            org.telegram.messenger.g0.Z3(mzVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(mzVar, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z9) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            boolean z10 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.a.a)) {
                z10 = false;
            }
            uoVar.d = z10;
            if (z10) {
                i7 = i10;
            }
            i10++;
        }
        e61 e61Var = this.d;
        if (i7 >= 0 && !z9 && (e61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) e61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < e61Var.getChildCount(); i11++) {
            View childAt = e61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.zz0) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.zz0) childAt).g(((org.telegram.ui.Components.uo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new lc(this, 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.r3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.c20 c20Var) {
        this.r = c20Var;
    }

    public void setWithRemovedStub(boolean z9) {
        this.f = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        nc ncVar;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        ?? a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i7);
            if (uoVar.c != a10) {
                uoVar.c = a10;
                z9 = true;
            }
            i7++;
        }
        e61 e61Var = this.d;
        if (e61Var == null) {
            return;
        }
        org.telegram.messenger.g0.d0(e61Var, new lc(this, 0));
        if (!z9 || (ncVar = this.h) == null) {
            return;
        }
        ncVar.f();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
