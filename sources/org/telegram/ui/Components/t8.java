package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t8 extends tl0 {
    public final ArrayList U2;
    public final int V2;
    public int W2;
    public final org.telegram.ui.y7 X2;
    public s8 Y2;
    public final /* synthetic */ w8 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(w8 w8Var, Activity activity) {
        super(activity, null);
        this.Z2 = w8Var;
        this.U2 = new ArrayList();
        this.V2 = 200;
        this.W2 = -1;
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        setLayoutManager(j0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            s8 s8Var = new s8();
            int i11 = this.V2;
            this.V2 = i11 + 1;
            s8Var.a = i11;
            int[] iArr = w8.Z[i10];
            s8Var.c = iArr[0];
            s8Var.d = iArr[1];
            s8Var.e = iArr[2];
            s8Var.f = iArr[3];
            this.U2.add(s8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            s8 s8Var2 = new s8();
            int i13 = this.V2;
            this.V2 = i13 + 1;
            s8Var2.a = i13;
            int[] iArr2 = w8.a0[i12];
            s8Var2.c = iArr2[0];
            s8Var2.d = iArr2[1];
            s8Var2.e = 0;
            s8Var2.f = 0;
            s8Var2.b = true;
            this.U2.add(s8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.e1 = true;
        int i14 = 2;
        setOnItemClickListener(new k(this, i14));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i14);
        this.X2 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.X2.h();
        w8 w8Var = this.Z2;
        w8Var.M = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            w8Var.M = AndroidUtilities.dp(39.0f);
        } else if (w8Var.M > AndroidUtilities.dp(150.0f)) {
            w8Var.M = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(s8 s8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.U2;
            if (i10 >= arrayList.size()) {
                this.Y2 = s8Var;
                this.W2 = 1;
                break;
            } else {
                if (((s8) arrayList.get(i10)).equals(s8Var)) {
                    this.W2 = ((s8) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.X2.l();
    }
}
