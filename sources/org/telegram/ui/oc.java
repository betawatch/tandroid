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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final ArrayList c;
    public final f61 d;
    public final org.telegram.ui.Components.yz e;
    public boolean f;
    public final mc h;
    public boolean n;
    public org.telegram.messenger.x10 r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i7;
        this.b = h6Var;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(getContext(), h6Var);
        this.e = yzVar;
        yzVar.setViewType(14);
        yzVar.setVisibility(0);
        addView(yzVar, c8.ma.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        f61 f61Var = new f61(4, activity, h6Var);
        this.d = f61Var;
        f61Var.setClipToPadding(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        f61Var.setLayoutManager(c0Var);
        f61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, h6Var);
        this.h = mcVar;
        f61Var.setAdapter(mcVar);
        addView(f61Var, c8.ma.c(130.0f, -1));
        f61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (this.n) {
            org.telegram.messenger.g0.X3(yzVar, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.X3(yzVar, true, 1.0f, true, false);
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
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(i10);
            if (!TextUtils.equals(this.s, mpVar.a()) && (!TextUtils.isEmpty(str) || !mpVar.a.a)) {
                z11 = false;
            }
            mpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        f61 f61Var = this.d;
        if (i7 >= 0 && !z10 && (f61Var.getLayoutManager() instanceof v4.c0)) {
            ((v4.c0) f61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < f61Var.getChildCount(); i11++) {
            View childAt = f61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.l01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.l01) childAt).g(((org.telegram.ui.Components.mp) arrayList.get(R)).d, true);
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
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.mp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.mp(org.telegram.ui.ActionBar.s3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.x10 x10Var) {
        this.r = x10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        mc mcVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        ?? d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(i7);
            if (mpVar.c != d) {
                mpVar.c = d;
                z10 = true;
            }
            i7++;
        }
        f61 f61Var = this.d;
        if (f61Var == null) {
            return;
        }
        org.telegram.messenger.g0.d0(f61Var, new kc(this, 0));
        if (!z10 || (mcVar = this.h) == null) {
            return;
        }
        mcVar.f();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
