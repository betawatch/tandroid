package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu b;

    public /* synthetic */ yu(zu zuVar, int i10) {
        this.a = i10;
        this.b = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                cv cvVar = this.b.f;
                cvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = cvVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.y1.r(R.string.AddEmojiNotFound, mc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
