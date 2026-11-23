package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u8 extends ek0 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.z7 i3;
    public t8 j3;
    public final /* synthetic */ x8 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(x8 x8Var, Activity activity) {
        super(activity, null);
        this.k3 = x8Var;
        this.f3 = new ArrayList();
        this.g3 = org.telegram.messenger.ks.e3;
        this.h3 = -1;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            t8 t8Var = new t8();
            int i10 = this.g3;
            this.g3 = i10 + 1;
            t8Var.a = i10;
            int[] iArr = x8.d0[i7];
            t8Var.c = iArr[0];
            t8Var.d = iArr[1];
            t8Var.e = iArr[2];
            t8Var.f = iArr[3];
            this.f3.add(t8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            t8 t8Var2 = new t8();
            int i12 = this.g3;
            this.g3 = i12 + 1;
            t8Var2.a = i12;
            int[] iArr2 = x8.e0[i11];
            t8Var2.c = iArr2[0];
            t8Var2.d = iArr2[1];
            t8Var2.e = 0;
            t8Var2.f = 0;
            t8Var2.b = true;
            this.f3.add(t8Var2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        int i13 = 2;
        setOnItemClickListener(new n(this, i13));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, i13);
        this.i3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.i3.b();
        x8 x8Var = this.k3;
        x8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            x8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (x8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            x8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(t8 t8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i7 >= arrayList.size()) {
                this.j3 = t8Var;
                this.h3 = 1;
                break;
            } else {
                if (((t8) arrayList.get(i7)).equals(t8Var)) {
                    this.h3 = ((t8) arrayList.get(i7)).a;
                    break;
                }
                i7++;
            }
        }
        this.i3.f();
    }
}
