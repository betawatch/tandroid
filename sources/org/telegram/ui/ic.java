package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ic extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final e61 b;
    public final v4.b0 c;
    public final int d;
    public int e;

    public ic(int i7, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = i7;
        this.a = f6Var;
        e61 e61Var = new e61(3, activity, f6Var);
        this.b = e61Var;
        e61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        e61Var.setClipToPadding(false);
        e61Var.setAdapter(new gc(this, activity, f6Var, i7));
        v4.b0 b0Var = new v4.b0();
        this.c = b0Var;
        b0Var.j1(0);
        e61Var.setLayoutManager(b0Var);
        addView(e61Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z9) {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.d).q4;
        int i10 = 0;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((org.telegram.messenger.fp) arrayList.get(i11)).c == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 != this.e) {
            this.e = i10;
            if (!z9) {
                this.c.h1(i10, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.b, new bi.b9(4, this, z9));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z9 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z9 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z9);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.messenger.g0.d0(this.b, new org.telegram.messenger.voip.k(7, this, org.telegram.messenger.qp.s1(this.d).q4));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
