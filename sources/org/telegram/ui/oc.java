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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final ArrayList c;
    public final b61 d;
    public final org.telegram.ui.Components.pz e;
    public boolean f;
    public final mc h;
    public boolean n;
    public org.telegram.messenger.z10 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i7;
        this.b = e6Var;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(getContext(), e6Var);
        this.e = pzVar;
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        b61 b61Var = new b61(4, activity, e6Var);
        this.d = b61Var;
        b61Var.setClipToPadding(false);
        b61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        b61Var.setLayoutManager(b0Var);
        b61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, e6Var);
        this.h = mcVar;
        b61Var.setAdapter(mcVar);
        addView(b61Var, c8.ja.c(130.0f, -1));
        b61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (this.n) {
            org.telegram.messenger.g0.Y3(pzVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Y3(pzVar, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(i10);
            if (!TextUtils.equals(this.s, dpVar.a()) && (!TextUtils.isEmpty(str) || !dpVar.a.a)) {
                z11 = false;
            }
            dpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        b61 b61Var = this.d;
        if (i7 >= 0 && !z10 && (b61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) b61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < b61Var.getChildCount(); i11++) {
            View childAt = b61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.b01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.b01) childAt).g(((org.telegram.ui.Components.dp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new kc(this, 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.dp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.dp(org.telegram.ui.ActionBar.p3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.z10 z10Var) {
        this.r = z10Var;
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
        mc mcVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        ?? a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(i7);
            if (dpVar.c != a10) {
                dpVar.c = a10;
                z10 = true;
            }
            i7++;
        }
        b61 b61Var = this.d;
        if (b61Var == null) {
            return;
        }
        org.telegram.messenger.g0.d0(b61Var, new kc(this, 0));
        if (!z10 || (mcVar = this.h) == null) {
            return;
        }
        mcVar.f();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
