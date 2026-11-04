package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final u51 b;
    public final u4.b0 c;
    public final int d;
    public int e;

    public gc(int i3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = i3;
        this.a = e6Var;
        u51 u51Var = new u51(3, activity, e6Var);
        this.b = u51Var;
        u51Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        u51Var.setClipToPadding(false);
        u51Var.setAdapter(new ec(this, activity, e6Var, i3));
        u4.b0 b0Var = new u4.b0();
        this.c = b0Var;
        b0Var.j1(0);
        u51Var.setLayoutManager(b0Var);
        addView(u51Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, boolean z10) {
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.d).q4;
        int i10 = 0;
        if (xoVar != null) {
            ArrayList arrayList = xoVar.c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((org.telegram.messenger.wo) arrayList.get(i11)).c == i3) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 != this.e) {
            this.e = i10;
            if (!z10) {
                this.c.h1(i10, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.b, new ci.b8(4, this, z10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.messenger.g0.d0(this.b, new mi.f(11, this, org.telegram.messenger.hp.s1(this.d).q4));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
