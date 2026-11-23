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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final ArrayList c;
    public final d61 d;
    public final org.telegram.ui.Components.vz e;
    public boolean f;
    public final mc h;
    public boolean n;
    public org.telegram.messenger.w10 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i7;
        this.b = i6Var;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(getContext(), i6Var);
        this.e = vzVar;
        vzVar.setViewType(14);
        vzVar.setVisibility(0);
        addView(vzVar, c8.na.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        d61 d61Var = new d61(4, activity, i6Var);
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        d61Var.setLayoutManager(c0Var);
        d61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, i6Var);
        this.h = mcVar;
        d61Var.setAdapter(mcVar);
        addView(d61Var, c8.na.c(130.0f, -1));
        d61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (this.n) {
            org.telegram.messenger.g0.X3(vzVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.X3(vzVar, true, 1.0f, true, false);
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
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(i10);
            if (!TextUtils.equals(this.s, jpVar.a()) && (!TextUtils.isEmpty(str) || !jpVar.a.a)) {
                z11 = false;
            }
            jpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        d61 d61Var = this.d;
        if (i7 >= 0 && !z10 && (d61Var.getLayoutManager() instanceof v4.c0)) {
            ((v4.c0) d61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
            View childAt = d61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.j01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.j01) childAt).g(((org.telegram.ui.Components.jp) arrayList.get(R)).d, true);
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
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.jp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.s3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.w10 w10Var) {
        this.r = w10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        mc mcVar;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        ?? b10 = i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(i7);
            if (jpVar.c != b10) {
                jpVar.c = b10;
                z10 = true;
            }
            i7++;
        }
        d61 d61Var = this.d;
        if (d61Var == null) {
            return;
        }
        org.telegram.messenger.g0.d0(d61Var, new kc(this, 0));
        if (!z10 || (mcVar = this.h) == null) {
            return;
        }
        mcVar.f();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
