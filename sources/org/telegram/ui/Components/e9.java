package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e9 extends mm0 {
    public final ArrayList V2;
    public final int W2;
    public int X2;
    public final org.telegram.ui.a8 Y2;
    public d9 Z2;
    public final /* synthetic */ h9 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(h9 h9Var, Activity activity) {
        super(activity, null);
        this.a3 = h9Var;
        this.V2 = new ArrayList();
        this.W2 = 200;
        this.X2 = -1;
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            d9 d9Var = new d9();
            int i11 = this.W2;
            this.W2 = i11 + 1;
            d9Var.a = i11;
            int[] iArr = h9.c0[i10];
            d9Var.c = iArr[0];
            d9Var.d = iArr[1];
            d9Var.e = iArr[2];
            d9Var.f = iArr[3];
            this.V2.add(d9Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            d9 d9Var2 = new d9();
            int i13 = this.W2;
            this.W2 = i13 + 1;
            d9Var2.a = i13;
            int[] iArr2 = h9.d0[i12];
            d9Var2.c = iArr2[0];
            d9Var2.d = iArr2[1];
            d9Var2.e = 0;
            d9Var2.f = 0;
            d9Var2.b = true;
            this.V2.add(d9Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, i14);
        this.Y2 = a8Var;
        setAdapter(a8Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.Y2.h();
        h9 h9Var = this.a3;
        h9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            h9Var.P = AndroidUtilities.dp(39.0f);
        } else if (h9Var.P > AndroidUtilities.dp(150.0f)) {
            h9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void x1(d9 d9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V2;
            if (i10 >= arrayList.size()) {
                this.Z2 = d9Var;
                this.X2 = 1;
                break;
            } else {
                if (((d9) arrayList.get(i10)).equals(d9Var)) {
                    this.X2 = ((d9) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.Y2.l();
    }
}
