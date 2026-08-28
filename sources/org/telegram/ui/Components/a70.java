package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void onMeasure(int i9, int i10) {
        g70 g70Var = this.b;
        ArrayList arrayList = g70Var.h;
        if (g70Var.s == 0) {
            int size = View.MeasureSpec.getSize(i9);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g70Var.d.getLayoutParams();
            if (dp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = g70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, g70Var.v);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (g70Var.v != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(g70Var.v);
                        arrayList.add(max, g70Var.v);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i9, i10);
    }
}
