package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a70 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ g70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(g70 g70Var, Context context) {
        super(context);
        this.b = g70Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        g70 g70Var = this.b;
        ArrayList arrayList = g70Var.t1;
        if (g70Var.w1 == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g70Var.q1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = g70Var.x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, g70Var.x1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (g70Var.x1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(g70Var.x1);
                        arrayList.add(max, g70Var.x1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
