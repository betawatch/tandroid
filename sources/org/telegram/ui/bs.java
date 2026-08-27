package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;

    public /* synthetic */ bs(js jsVar, int i10) {
        this.a = i10;
        this.b = jsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                js jsVar = this.b;
                if (jsVar.F) {
                    jsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.b);
                    break;
                }
                break;
            case 1:
                js.Z(this.b);
                break;
            default:
                js jsVar2 = this.b;
                jsVar2.presentFragment(rn.R9(jsVar2.D), true);
                break;
        }
    }
}
