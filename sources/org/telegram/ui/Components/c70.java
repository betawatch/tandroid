package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c70 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ i70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(i70 i70Var, Context context) {
        super(context);
        this.b = i70Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        i70 i70Var = this.b;
        ArrayList arrayList = i70Var.t1;
        if (i70Var.w1 == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i70Var.q1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = i70Var.x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, i70Var.x1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (i70Var.x1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(i70Var.x1);
                        arrayList.add(max, i70Var.x1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
