package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class d80 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ j80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(j80 j80Var, Context context) {
        super(context);
        this.b = j80Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        j80 j80Var = this.b;
        ArrayList arrayList = j80Var.h;
        if (j80Var.s == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j80Var.d.getLayoutParams();
            if (dp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = j80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, j80Var.v);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (j80Var.v != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(j80Var.v);
                        arrayList.add(max, j80Var.v);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
