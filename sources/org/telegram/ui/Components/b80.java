package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b80 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ h80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(h80 h80Var, Context context) {
        super(context);
        this.b = h80Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        h80 h80Var = this.b;
        ArrayList arrayList = h80Var.h;
        if (h80Var.s == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h80Var.d.getLayoutParams();
            if (dp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = h80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, h80Var.v);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (h80Var.v != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(h80Var.v);
                        arrayList.add(max, h80Var.v);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
