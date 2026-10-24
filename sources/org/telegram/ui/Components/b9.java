package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b9 extends mm0 {
    public final ArrayList Y2;
    public final int Z2;
    public int a3;
    public final org.telegram.ui.z7 b3;
    public a9 c3;
    public final /* synthetic */ e9 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.d3 = e9Var;
        this.Y2 = new ArrayList();
        this.Z2 = 200;
        this.a3 = -1;
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            a9 a9Var = new a9();
            int i11 = this.Z2;
            this.Z2 = i11 + 1;
            a9Var.a = i11;
            int[] iArr = e9.c0[i10];
            a9Var.c = iArr[0];
            a9Var.d = iArr[1];
            a9Var.e = iArr[2];
            a9Var.f = iArr[3];
            this.Y2.add(a9Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            a9 a9Var2 = new a9();
            int i13 = this.Z2;
            this.Z2 = i13 + 1;
            a9Var2.a = i13;
            int[] iArr2 = e9.d0[i12];
            a9Var2.c = iArr2[0];
            a9Var2.d = iArr2[1];
            a9Var2.e = 0;
            a9Var2.f = 0;
            a9Var2.b = true;
            this.Y2.add(a9Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, i14);
        this.b3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    public final void C1(a9 a9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y2;
            if (i10 >= arrayList.size()) {
                this.c3 = a9Var;
                this.a3 = 1;
                break;
            } else {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.a3 = ((a9) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.b3.l();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.b3.h();
        e9 e9Var = this.d3;
        e9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            e9Var.P = AndroidUtilities.dp(39.0f);
        } else if (e9Var.P > AndroidUtilities.dp(150.0f)) {
            e9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }
}
