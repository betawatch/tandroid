package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d9 extends qm0 {
    public final ArrayList V2;
    public final int W2;
    public int X2;
    public final org.telegram.ui.v7 Y2;
    public c9 Z2;
    public final /* synthetic */ g9 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(g9 g9Var, Activity activity) {
        super(activity, null);
        this.a3 = g9Var;
        this.V2 = new ArrayList();
        this.W2 = 200;
        this.X2 = -1;
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        setLayoutManager(d0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            c9 c9Var = new c9();
            int i11 = this.W2;
            this.W2 = i11 + 1;
            c9Var.a = i11;
            int[] iArr = g9.c0[i10];
            c9Var.c = iArr[0];
            c9Var.d = iArr[1];
            c9Var.e = iArr[2];
            c9Var.f = iArr[3];
            this.V2.add(c9Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            c9 c9Var2 = new c9();
            int i13 = this.W2;
            this.W2 = i13 + 1;
            c9Var2.a = i13;
            int[] iArr2 = g9.d0[i12];
            c9Var2.c = iArr2[0];
            c9Var2.d = iArr2[1];
            c9Var2.e = 0;
            c9Var2.f = 0;
            c9Var2.b = true;
            this.V2.add(c9Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, i14);
        this.Y2 = v7Var;
        setAdapter(v7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.Y2.h();
        g9 g9Var = this.a3;
        g9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            g9Var.P = AndroidUtilities.dp(39.0f);
        } else if (g9Var.P > AndroidUtilities.dp(150.0f)) {
            g9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void x1(c9 c9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V2;
            if (i10 >= arrayList.size()) {
                this.Z2 = c9Var;
                this.X2 = 1;
                break;
            } else {
                if (((c9) arrayList.get(i10)).equals(c9Var)) {
                    this.X2 = ((c9) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.Y2.l();
    }
}
