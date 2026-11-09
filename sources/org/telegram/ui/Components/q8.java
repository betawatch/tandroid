package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q8 extends qj0 {
    public final ArrayList e3;
    public final int f3;
    public int g3;
    public final org.telegram.ui.x7 h3;
    public p8 i3;
    public final /* synthetic */ t8 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(t8 t8Var, Activity activity) {
        super(activity, null);
        this.j3 = t8Var;
        this.e3 = new ArrayList();
        this.f3 = org.telegram.messenger.qs.e3;
        this.g3 = -1;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            p8 p8Var = new p8();
            int i10 = this.f3;
            this.f3 = i10 + 1;
            p8Var.a = i10;
            int[] iArr = t8.c0[i7];
            p8Var.c = iArr[0];
            p8Var.d = iArr[1];
            p8Var.e = iArr[2];
            p8Var.f = iArr[3];
            this.e3.add(p8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            p8 p8Var2 = new p8();
            int i12 = this.f3;
            this.f3 = i12 + 1;
            p8Var2.a = i12;
            int[] iArr2 = t8.d0[i11];
            p8Var2.c = iArr2[0];
            p8Var2.d = iArr2[1];
            p8Var2.e = 0;
            p8Var2.f = 0;
            p8Var2.b = true;
            this.e3.add(p8Var2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i13 = 2;
        setOnItemClickListener(new k(this, i13));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i13);
        this.h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.h3.b();
        t8 t8Var = this.j3;
        t8Var.P = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            t8Var.P = org.telegram.messenger.g0.L(39.0f);
        } else if (t8Var.P > org.telegram.messenger.g0.L(150.0f)) {
            t8Var.P = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(p8 p8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.e3;
            if (i7 >= arrayList.size()) {
                this.i3 = p8Var;
                this.g3 = 1;
                break;
            } else {
                if (((p8) arrayList.get(i7)).equals(p8Var)) {
                    this.g3 = ((p8) arrayList.get(i7)).a;
                    break;
                }
                i7++;
            }
        }
        this.h3.f();
    }
}
