package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e70 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ k70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(k70 k70Var, Context context) {
        super(context);
        this.b = k70Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        k70 k70Var = this.b;
        ArrayList arrayList = k70Var.p1;
        if (k70Var.s1 == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int L = org.telegram.messenger.i0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k70Var.m1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = k70Var.t1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, k70Var.t1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (k70Var.t1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(k70Var.t1);
                        arrayList.add(max, k70Var.t1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
