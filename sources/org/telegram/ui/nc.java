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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final ArrayList c;
    public final u51 d;
    public final org.telegram.ui.Components.iz e;
    public boolean f;
    public final lc h;
    public boolean n;
    public org.telegram.messenger.u10 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public nc(int i3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i3;
        this.b = e6Var;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(getContext(), e6Var);
        this.e = izVar;
        izVar.setViewType(14);
        izVar.setVisibility(0);
        addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        u51 u51Var = new u51(4, activity, e6Var);
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        u51Var.setLayoutManager(b0Var);
        u51Var.setAlpha(0.0f);
        lc lcVar = new lc(this, i3, e6Var);
        this.h = lcVar;
        u51Var.setAdapter(lcVar);
        addView(u51Var, b8.mf.c(130.0f, -1));
        u51Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i3);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new mc(this, i3), true);
        if (this.n) {
            org.telegram.messenger.g0.Z3(izVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(izVar, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i3 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.a.a)) {
                z11 = false;
            }
            uoVar.d = z11;
            if (z11) {
                i3 = i10;
            }
            i10++;
        }
        u51 u51Var = this.d;
        if (i3 >= 0 && !z10 && (u51Var.getLayoutManager() instanceof u4.b0)) {
            ((u4.b0) u51Var.getLayoutManager()).h1(i3, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
            View childAt = u51Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.yz0) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.yz0) childAt).g(((org.telegram.ui.Components.uo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new jc(this, 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.p3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.u10 u10Var) {
        this.r = u10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        lc lcVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        ?? a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i3);
            if (uoVar.c != a10) {
                uoVar.c = a10;
                z10 = true;
            }
            i3++;
        }
        u51 u51Var = this.d;
        if (u51Var == null) {
            return;
        }
        org.telegram.messenger.g0.d0(u51Var, new jc(this, 0));
        if (!z10 || (lcVar = this.h) == null) {
            return;
        }
        lcVar.f();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
