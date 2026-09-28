package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ int c;

    public /* synthetic */ tm(wn wnVar, int i10, int i11) {
        this.a = i11;
        this.b = wnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (qh.e) obj);
                break;
            default:
                wn wnVar = this.b;
                wnVar.getClass();
                wnVar.e0(this.c, new rh.e((String) obj));
                break;
        }
    }
}
