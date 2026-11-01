package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final u71 b;
    public final s4.a0 c;
    public final int d;
    public int e;

    public qc(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.d = i10;
        this.a = p6Var;
        u71 u71Var = new u71(1, activity, p6Var);
        this.b = u71Var;
        u71Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(6.0f), 0);
        u71Var.setClipToPadding(false);
        u71Var.setAdapter(new oc(this, activity, p6Var, i10));
        s4.a0 a0Var = new s4.a0();
        this.c = a0Var;
        a0Var.j1(0);
        u71Var.setLayoutManager(a0Var);
        addView(u71Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(this.d).r4;
        int i11 = 0;
        if (mpVar != null) {
            ArrayList arrayList = mpVar.c;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                if (((org.telegram.messenger.lp) arrayList.get(i12)).c == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 != this.e) {
            this.e = i11;
            if (!z10) {
                this.c.h1(i11, (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(56.0f)) / 2);
            }
            org.telegram.messenger.i0.d0(this.b, new nc(0, this, z10));
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.messenger.i0.d0(this.b, new ag.e0(14, this, org.telegram.messenger.wp.r1(this.d).r4));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
