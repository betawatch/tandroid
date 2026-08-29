package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y8 extends jl0 {
    public final ArrayList T2;
    public final int U2;
    public int V2;
    public final org.telegram.ui.u7 W2;
    public x8 X2;
    public final /* synthetic */ b9 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b9 b9Var, Activity activity) {
        super(activity, null);
        this.Y2 = b9Var;
        this.T2 = new ArrayList();
        this.U2 = 200;
        this.V2 = -1;
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        setLayoutManager(j0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            x8 x8Var = new x8();
            int i11 = this.U2;
            this.U2 = i11 + 1;
            x8Var.a = i11;
            int[] iArr = b9.Y[i10];
            x8Var.c = iArr[0];
            x8Var.d = iArr[1];
            x8Var.e = iArr[2];
            x8Var.f = iArr[3];
            this.T2.add(x8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            x8 x8Var2 = new x8();
            int i13 = this.U2;
            this.U2 = i13 + 1;
            x8Var2.a = i13;
            int[] iArr2 = b9.Z[i12];
            x8Var2.c = iArr2[0];
            x8Var2.d = iArr2[1];
            x8Var2.e = 0;
            x8Var2.f = 0;
            x8Var2.b = true;
            this.T2.add(x8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.d1 = true;
        int i14 = 2;
        setOnItemClickListener(new k(this, i14));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, i14);
        this.W2 = u7Var;
        setAdapter(u7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.W2.h();
        b9 b9Var = this.Y2;
        b9Var.L = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            b9Var.L = AndroidUtilities.dp(39.0f);
        } else if (b9Var.L > AndroidUtilities.dp(150.0f)) {
            b9Var.L = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(x8 x8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.T2;
            if (i10 >= arrayList.size()) {
                this.X2 = x8Var;
                this.V2 = 1;
                break;
            } else {
                if (((x8) arrayList.get(i10)).equals(x8Var)) {
                    this.V2 = ((x8) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.W2.l();
    }
}
