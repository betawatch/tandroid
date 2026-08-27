package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w70(x70 x70Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = x70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w70(this.b, this.c, this.d, 1));
                break;
            default:
                x70 x70Var = this.b;
                x70Var.setJoinRequest(this.c);
                x70Var.setJoinToSend(this.d);
                break;
        }
    }
}
