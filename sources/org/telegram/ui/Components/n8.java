package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n8 extends uj0 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.y7 i3;
    public m8 j3;
    public final /* synthetic */ q8 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(q8 q8Var, Activity activity) {
        super(activity, null);
        this.k3 = q8Var;
        this.f3 = new ArrayList();
        this.g3 = org.telegram.messenger.ns.e3;
        this.h3 = -1;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            m8 m8Var = new m8();
            int i10 = this.g3;
            this.g3 = i10 + 1;
            m8Var.a = i10;
            int[] iArr = q8.d0[i7];
            m8Var.c = iArr[0];
            m8Var.d = iArr[1];
            m8Var.e = iArr[2];
            m8Var.f = iArr[3];
            this.f3.add(m8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            m8 m8Var2 = new m8();
            int i12 = this.g3;
            this.g3 = i12 + 1;
            m8Var2.a = i12;
            int[] iArr2 = q8.e0[i11];
            m8Var2.c = iArr2[0];
            m8Var2.d = iArr2[1];
            m8Var2.e = 0;
            m8Var2.f = 0;
            m8Var2.b = true;
            this.f3.add(m8Var2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        int i13 = 2;
        setOnItemClickListener(new j(this, i13));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.i3.b();
        q8 q8Var = this.k3;
        q8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            q8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (q8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            q8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(m8 m8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i7 >= arrayList.size()) {
                this.j3 = m8Var;
                this.h3 = 1;
                break;
            } else {
                if (((m8) arrayList.get(i7)).equals(m8Var)) {
                    this.h3 = ((m8) arrayList.get(i7)).a;
                    break;
                }
                i7++;
            }
        }
        this.i3.f();
    }
}
