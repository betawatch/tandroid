package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z8 extends ll0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 a3;
    public y8 b3;
    public final /* synthetic */ c9 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(c9 c9Var, Activity activity) {
        super(activity, null);
        this.c3 = c9Var;
        this.X2 = new ArrayList();
        this.Y2 = 200;
        this.Z2 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            y8 y8Var = new y8();
            int i11 = this.Y2;
            this.Y2 = i11 + 1;
            y8Var.a = i11;
            int[] iArr = c9.c0[i10];
            y8Var.c = iArr[0];
            y8Var.d = iArr[1];
            y8Var.e = iArr[2];
            y8Var.f = iArr[3];
            this.X2.add(y8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            y8 y8Var2 = new y8();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            y8Var2.a = i13;
            int[] iArr2 = c9.d0[i12];
            y8Var2.c = iArr2[0];
            y8Var2.d = iArr2[1];
            y8Var2.e = 0;
            y8Var2.f = 0;
            y8Var2.b = true;
            this.X2.add(y8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.h1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, i14);
        this.a3 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.a3.h();
        c9 c9Var = this.c3;
        c9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            c9Var.P = AndroidUtilities.dp(39.0f);
        } else if (c9Var.P > AndroidUtilities.dp(150.0f)) {
            c9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(y8 y8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 >= arrayList.size()) {
                this.b3 = y8Var;
                this.Z2 = 1;
                break;
            } else {
                if (((y8) arrayList.get(i10)).equals(y8Var)) {
                    this.Z2 = ((y8) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.a3.l();
    }
}
