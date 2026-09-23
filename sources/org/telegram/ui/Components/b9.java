package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b9 extends ml0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 a3;
    public a9 b3;
    public final /* synthetic */ e9 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.c3 = e9Var;
        this.X2 = new ArrayList();
        this.Y2 = 200;
        this.Z2 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            a9 a9Var = new a9();
            int i11 = this.Y2;
            this.Y2 = i11 + 1;
            a9Var.a = i11;
            int[] iArr = e9.c0[i10];
            a9Var.c = iArr[0];
            a9Var.d = iArr[1];
            a9Var.e = iArr[2];
            a9Var.f = iArr[3];
            this.X2.add(a9Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            a9 a9Var2 = new a9();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            a9Var2.a = i13;
            int[] iArr2 = e9.d0[i12];
            a9Var2.c = iArr2[0];
            a9Var2.d = iArr2[1];
            a9Var2.e = 0;
            a9Var2.f = 0;
            a9Var2.b = true;
            this.X2.add(a9Var2);
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

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.a3.h();
        e9 e9Var = this.c3;
        e9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            e9Var.P = AndroidUtilities.dp(39.0f);
        } else if (e9Var.P > AndroidUtilities.dp(150.0f)) {
            e9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(a9 a9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 >= arrayList.size()) {
                this.b3 = a9Var;
                this.Z2 = 1;
                break;
            } else {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.Z2 = ((a9) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.a3.l();
    }
}
