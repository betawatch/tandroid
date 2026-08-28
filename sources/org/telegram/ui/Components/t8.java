package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t8 extends wk0 {
    public final ArrayList T2;
    public final int U2;
    public int V2;
    public final org.telegram.ui.v7 W2;
    public s8 X2;
    public final /* synthetic */ w8 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(w8 w8Var, Activity activity) {
        super(activity, null);
        this.Y2 = w8Var;
        this.T2 = new ArrayList();
        this.U2 = 200;
        this.V2 = -1;
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        setLayoutManager(m0Var);
        for (int i9 = 0; i9 < 7; i9++) {
            s8 s8Var = new s8();
            int i10 = this.U2;
            this.U2 = i10 + 1;
            s8Var.a = i10;
            int[] iArr = w8.Y[i9];
            s8Var.c = iArr[0];
            s8Var.d = iArr[1];
            s8Var.e = iArr[2];
            s8Var.f = iArr[3];
            this.T2.add(s8Var);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            s8 s8Var2 = new s8();
            int i12 = this.U2;
            this.U2 = i12 + 1;
            s8Var2.a = i12;
            int[] iArr2 = w8.Z[i11];
            s8Var2.c = iArr2[0];
            s8Var2.d = iArr2[1];
            s8Var2.e = 0;
            s8Var2.f = 0;
            s8Var2.b = true;
            this.T2.add(s8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.d1 = true;
        int i13 = 2;
        setOnItemClickListener(new j(this, i13));
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, i13);
        this.W2 = v7Var;
        setAdapter(v7Var);
        setOverScrollMode(1);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9) / this.W2.h();
        w8 w8Var = this.Y2;
        w8Var.L = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            w8Var.L = AndroidUtilities.dp(39.0f);
        } else if (w8Var.L > AndroidUtilities.dp(150.0f)) {
            w8Var.L = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i9, i10);
    }

    public final void w1(s8 s8Var) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.T2;
            if (i9 >= arrayList.size()) {
                this.X2 = s8Var;
                this.V2 = 1;
                break;
            } else {
                if (((s8) arrayList.get(i9)).equals(s8Var)) {
                    this.V2 = ((s8) arrayList.get(i9)).a;
                    break;
                }
                i9++;
            }
        }
        this.W2.l();
    }
}
