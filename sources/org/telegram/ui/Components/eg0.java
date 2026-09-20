package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class eg0 extends aw0 implements r0.m {
    public org.telegram.ui.y0 A0;
    public vl0 B0;
    public RecyclerView C0;
    public int D0;
    public int E0;
    public final b2.q0 w0;
    public final sb0 x0;
    public RecyclerView y0;
    public org.telegram.ui.w6 z0;

    public eg0(Context context) {
        super(context, null);
        this.x0 = new sb0(this, 1);
        this.w0 = new b2.q0();
    }

    private int getDistanceToPin() {
        return Math.max(0, this.z0.getTop() - this.E0);
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        vl0 b02;
        int distanceToPin;
        if (!Z() || i11 == 0 || (b02 = b0()) == null) {
            return;
        }
        if (viewGroup != this.y0) {
            if (viewGroup != b02 || i11 <= 0 || (distanceToPin = getDistanceToPin()) <= 0) {
                return;
            }
            iArr[1] = a0(this.y0, Math.min(i11, distanceToPin)) + iArr[1];
            return;
        }
        if (i11 <= 0) {
            if (this.z0.getTop() > this.E0 || !b02.canScrollVertically(-1)) {
                return;
            }
            iArr[1] = a0(b02, i11) + iArr[1];
            return;
        }
        int distanceToPin2 = i11 - getDistanceToPin();
        if (distanceToPin2 > 0) {
            a0(b02, distanceToPin2);
            iArr[1] = iArr[1] + distanceToPin2;
        }
    }

    public final boolean Z() {
        org.telegram.ui.w6 w6Var;
        return (this.y0 == null || (w6Var = this.z0) == null || !w6Var.isAttachedToWindow() || this.A0 == null) ? false : true;
    }

    public final int a0(RecyclerView recyclerView, int i10) {
        if (i10 == 0 || !recyclerView.canScrollVertically(i10)) {
            return 0;
        }
        this.C0 = recyclerView;
        this.D0 = 0;
        recyclerView.scrollBy(0, i10);
        int i11 = this.D0;
        this.C0 = null;
        return i11;
    }

    public final vl0 b0() {
        ArrayList arrayList;
        org.telegram.ui.y0 y0Var = this.A0;
        vl0 listView = y0Var == null ? null : ((org.telegram.ui.t7) y0Var.b).getListView();
        vl0 vl0Var = this.B0;
        if (vl0Var != listView) {
            sb0 sb0Var = this.x0;
            if (vl0Var != null && (arrayList = vl0Var.v0) != null) {
                arrayList.remove(sb0Var);
            }
            this.B0 = listView;
            if (listView != null) {
                listView.j(sb0Var);
            }
        }
        return listView;
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        vl0 b02;
        if (!Z() || i13 == 0 || (b02 = b0()) == null) {
            return;
        }
        RecyclerView recyclerView = this.y0;
        if (viewGroup == recyclerView) {
            if (i13 <= 0 || this.z0.getTop() > this.E0) {
                return;
            }
            a0(b02, i13);
            iArr[1] = iArr[1] + i13;
            return;
        }
        if (viewGroup == b02) {
            if (i13 < 0) {
                iArr[1] = a0(recyclerView, i13) + iArr[1];
            } else {
                iArr[1] = iArr[1] + i13;
            }
        }
    }

    @Override // r0.l
    public final void o(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return Z() && (i10 & 2) != 0;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    public void setOuterListView(RecyclerView recyclerView) {
        ArrayList arrayList;
        RecyclerView recyclerView2 = this.y0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        sb0 sb0Var = this.x0;
        if (recyclerView2 != null && (arrayList = recyclerView2.v0) != null) {
            arrayList.remove(sb0Var);
        }
        this.y0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.j(sb0Var);
        }
    }

    public void setPinnedTop(int i10) {
        this.E0 = i10;
    }

    @Override // r0.l
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
