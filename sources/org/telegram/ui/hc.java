package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final f61 b;
    public final v4.c0 c;
    public final int d;
    public int e;

    public hc(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.d = i7;
        this.a = i6Var;
        f61 f61Var = new f61(3, activity, i6Var);
        this.b = f61Var;
        f61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setAdapter(new fc(this, activity, i6Var, i7));
        v4.c0 c0Var = new v4.c0();
        this.c = c0Var;
        c0Var.j1(0);
        f61Var.setLayoutManager(c0Var);
        addView(f61Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z10) {
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.d).t4;
        int i10 = 0;
        if (cpVar != null) {
            ArrayList arrayList = cpVar.c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((org.telegram.messenger.bp) arrayList.get(i11)).c == i7) {
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
            org.telegram.messenger.g0.d0(this.b, new ai.u2(5, this, z10));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.messenger.g0.d0(this.b, new li.d(11, this, org.telegram.messenger.mp.u1(this.d).t4));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
