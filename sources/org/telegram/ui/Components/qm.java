package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ int c;

    public /* synthetic */ qm(rn rnVar, int i10, int i11) {
        this.a = i11;
        this.b = rnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (eh.h) obj);
                break;
            default:
                rn rnVar = this.b;
                rnVar.getClass();
                rnVar.e0(this.c, new fh.e((String) obj));
                break;
        }
    }
}
