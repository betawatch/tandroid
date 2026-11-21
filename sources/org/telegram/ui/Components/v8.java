package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v8 extends ek0 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.y7 i3;
    public u8 j3;
    public final /* synthetic */ y8 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(y8 y8Var, Activity activity) {
        super(activity, null);
        this.k3 = y8Var;
        this.f3 = new ArrayList();
        this.g3 = org.telegram.messenger.ks.e3;
        this.h3 = -1;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            u8 u8Var = new u8();
            int i10 = this.g3;
            this.g3 = i10 + 1;
            u8Var.a = i10;
            int[] iArr = y8.d0[i7];
            u8Var.c = iArr[0];
            u8Var.d = iArr[1];
            u8Var.e = iArr[2];
            u8Var.f = iArr[3];
            this.f3.add(u8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            u8 u8Var2 = new u8();
            int i12 = this.g3;
            this.g3 = i12 + 1;
            u8Var2.a = i12;
            int[] iArr2 = y8.e0[i11];
            u8Var2.c = iArr2[0];
            u8Var2.d = iArr2[1];
            u8Var2.e = 0;
            u8Var2.f = 0;
            u8Var2.b = true;
            this.f3.add(u8Var2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        int i13 = 2;
        setOnItemClickListener(new o(this, i13));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.i3.b();
        y8 y8Var = this.k3;
        y8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            y8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (y8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            y8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(u8 u8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i7 >= arrayList.size()) {
                this.j3 = u8Var;
                this.h3 = 1;
                break;
            } else {
                if (((u8) arrayList.get(i7)).equals(u8Var)) {
                    this.h3 = ((u8) arrayList.get(i7)).a;
                    break;
                }
                i7++;
            }
        }
        this.i3.f();
    }
}
