package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o80 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ u80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(u80 u80Var, Context context) {
        super(context);
        this.b = u80Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        u80 u80Var = this.b;
        ArrayList arrayList = u80Var.r;
        if (u80Var.w == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u80Var.f.getLayoutParams();
            if (dp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = u80Var.x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, u80Var.x);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (u80Var.x != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(u80Var.x);
                        arrayList.add(max, u80Var.x);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
