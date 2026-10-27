package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d9 extends nm0 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.c8 i3;
    public c9 j3;
    public final /* synthetic */ g9 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(g9 g9Var, Activity activity) {
        super(activity, null);
        this.k3 = g9Var;
        this.f3 = new ArrayList();
        this.g3 = 200;
        this.h3 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            c9 c9Var = new c9();
            int i11 = this.g3;
            this.g3 = i11 + 1;
            c9Var.a = i11;
            int[] iArr = g9.c0[i10];
            c9Var.c = iArr[0];
            c9Var.d = iArr[1];
            c9Var.e = iArr[2];
            c9Var.f = iArr[3];
            this.f3.add(c9Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            c9 c9Var2 = new c9();
            int i13 = this.g3;
            this.g3 = i13 + 1;
            c9Var2.a = i13;
            int[] iArr2 = g9.d0[i12];
            c9Var2.c = iArr2[0];
            c9Var2.d = iArr2[1];
            c9Var2.e = 0;
            c9Var2.f = 0;
            c9Var2.b = true;
            this.f3.add(c9Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.c8 c8Var = new org.telegram.ui.c8(this, i14);
        this.i3 = c8Var;
        setAdapter(c8Var);
        setOverScrollMode(1);
    }

    public final void C1(c9 c9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i10 >= arrayList.size()) {
                this.j3 = c9Var;
                this.h3 = 1;
                break;
            } else {
                if (((c9) arrayList.get(i10)).equals(c9Var)) {
                    this.h3 = ((c9) arrayList.get(i10)).a;
                    break;
                }
                i10++;
            }
        }
        this.i3.l();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.i3.h();
        g9 g9Var = this.k3;
        g9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            g9Var.P = AndroidUtilities.dp(39.0f);
        } else if (g9Var.P > AndroidUtilities.dp(150.0f)) {
            g9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }
}
