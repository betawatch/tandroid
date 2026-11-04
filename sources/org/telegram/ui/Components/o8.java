package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o8 extends tj0 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.y7 i3;
    public n8 j3;
    public final /* synthetic */ r8 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(r8 r8Var, Activity activity) {
        super(activity, null);
        this.k3 = r8Var;
        this.f3 = new ArrayList();
        this.g3 = org.telegram.messenger.hs.e3;
        this.h3 = -1;
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i3 = 0; i3 < 7; i3++) {
            n8 n8Var = new n8();
            int i10 = this.g3;
            this.g3 = i10 + 1;
            n8Var.a = i10;
            int[] iArr = r8.d0[i3];
            n8Var.c = iArr[0];
            n8Var.d = iArr[1];
            n8Var.e = iArr[2];
            n8Var.f = iArr[3];
            this.f3.add(n8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            n8 n8Var2 = new n8();
            int i12 = this.g3;
            this.g3 = i12 + 1;
            n8Var2.a = i12;
            int[] iArr2 = r8.e0[i11];
            n8Var2.c = iArr2[0];
            n8Var2.d = iArr2[1];
            n8Var2.e = 0;
            n8Var2.f = 0;
            n8Var2.b = true;
            this.f3.add(n8Var2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        int i13 = 2;
        setOnItemClickListener(new k(this, i13));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3) / this.i3.b();
        r8 r8Var = this.k3;
        r8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            r8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (r8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            r8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i3, i10);
    }

    public final void z1(n8 n8Var) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i3 >= arrayList.size()) {
                this.j3 = n8Var;
                this.h3 = 1;
                break;
            } else {
                if (((n8) arrayList.get(i3)).equals(n8Var)) {
                    this.h3 = ((n8) arrayList.get(i3)).a;
                    break;
                }
                i3++;
            }
        }
        this.i3.f();
    }
}
