package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n60 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ t60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(t60 t60Var, Context context) {
        super(context);
        this.b = t60Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        t60 t60Var = this.b;
        ArrayList arrayList = t60Var.p1;
        if (t60Var.s1 == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t60Var.m1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = t60Var.t1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, t60Var.t1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (t60Var.t1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(t60Var.t1);
                        arrayList.add(max, t60Var.t1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
