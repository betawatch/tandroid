package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t70 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ z70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(z70 z70Var, Context context) {
        super(context);
        this.b = z70Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        z70 z70Var = this.b;
        ArrayList arrayList = z70Var.h;
        if (z70Var.s == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z70Var.d.getLayoutParams();
            if (dp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = z70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, z70Var.v);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (z70Var.v != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(z70Var.v);
                        arrayList.add(max, z70Var.v);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
