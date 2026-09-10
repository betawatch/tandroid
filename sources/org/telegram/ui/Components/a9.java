package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a9 extends vl0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 a3;
    public z8 b3;
    public final /* synthetic */ d9 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(d9 d9Var, Activity activity) {
        super(activity, null);
        this.c3 = d9Var;
        this.X2 = new ArrayList();
        this.Y2 = 200;
        this.Z2 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            z8 z8Var = new z8();
            int i11 = this.Y2;
            this.Y2 = i11 + 1;
            z8Var.a = i11;
            int[] iArr = d9.c0[i10];
            z8Var.c = iArr[0];
            z8Var.d = iArr[1];
            z8Var.e = iArr[2];
            z8Var.f = iArr[3];
            this.X2.add(z8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            z8 z8Var2 = new z8();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            z8Var2.a = i13;
            int[] iArr2 = d9.d0[i12];
            z8Var2.c = iArr2[0];
            z8Var2.d = iArr2[1];
            z8Var2.e = 0;
            z8Var2.f = 0;
            z8Var2.b = true;
            this.X2.add(z8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.h1 = true;
        int i14 = 2;
        setOnItemClickListener(new k(this, i14));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, i14);
        this.a3 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.a3.h();
        d9 d9Var = this.c3;
        d9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            d9Var.P = AndroidUtilities.dp(39.0f);
        } else if (d9Var.P > AndroidUtilities.dp(150.0f)) {
            d9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void v1(z8 z8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 >= arrayList.size()) {
                this.b3 = z8Var;
                this.Z2 = 1;
                break;
            } else {
                if (((z8) arrayList.get(i10)).equals(z8Var)) {
                    this.Z2 = ((z8) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.a3.l();
    }
}
