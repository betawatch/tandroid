package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i60 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ o60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(o60 o60Var, Context context) {
        super(context);
        this.b = o60Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        o60 o60Var = this.b;
        ArrayList arrayList = o60Var.q1;
        if (o60Var.t1 == 0) {
            int size = View.MeasureSpec.getSize(i3);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o60Var.n1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = o60Var.u1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, o60Var.u1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (o60Var.u1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(o60Var.u1);
                        arrayList.add(max, o60Var.u1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i3, i10);
    }
}
