package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l8 extends tk0 {
    public final ArrayList e3;
    public final int f3;
    public int g3;
    public final org.telegram.ui.x7 h3;
    public k8 i3;
    public final /* synthetic */ o8 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(o8 o8Var, Activity activity) {
        super(activity, null);
        this.j3 = o8Var;
        this.e3 = new ArrayList();
        this.f3 = org.telegram.messenger.zs.e3;
        this.g3 = -1;
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        setLayoutManager(a0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            k8 k8Var = new k8();
            int i11 = this.f3;
            this.f3 = i11 + 1;
            k8Var.a = i11;
            int[] iArr = o8.c0[i10];
            k8Var.c = iArr[0];
            k8Var.d = iArr[1];
            k8Var.e = iArr[2];
            k8Var.f = iArr[3];
            this.e3.add(k8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            k8 k8Var2 = new k8();
            int i13 = this.f3;
            this.f3 = i13 + 1;
            k8Var2.a = i13;
            int[] iArr2 = o8.d0[i12];
            k8Var2.c = iArr2[0];
            k8Var2.d = iArr2[1];
            k8Var2.e = 0;
            k8Var2.f = 0;
            k8Var2.b = true;
            this.e3.add(k8Var2);
        }
        setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i14 = 2;
        setOnItemClickListener(new k(this, i14));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i14);
        this.h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.h3.b();
        o8 o8Var = this.j3;
        o8Var.P = size;
        if (size < org.telegram.messenger.i0.L(39.0f)) {
            o8Var.P = org.telegram.messenger.i0.L(39.0f);
        } else if (o8Var.P > org.telegram.messenger.i0.L(150.0f)) {
            o8Var.P = org.telegram.messenger.i0.L(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void z1(k8 k8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e3;
            if (i10 >= arrayList.size()) {
                this.i3 = k8Var;
                this.g3 = 1;
                break;
            } else {
                if (((k8) arrayList.get(i10)).equals(k8Var)) {
                    this.g3 = ((k8) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.h3.f();
    }
}
