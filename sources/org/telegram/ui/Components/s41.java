package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ s41(String str, int i10, Utilities.Callback2 callback2) {
        this.a = i10;
        this.b = callback2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = this.b;
                if (callback2 != null) {
                    callback2.run(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.run(null, this.c);
                break;
            default:
                this.b.run(null, this.c);
                break;
        }
    }
}
