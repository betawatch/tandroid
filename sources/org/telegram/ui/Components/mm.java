package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ int c;

    public /* synthetic */ mm(on onVar, int i10, int i11) {
        this.a = i11;
        this.b = onVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (bh.h) obj);
                break;
            default:
                on onVar = this.b;
                onVar.getClass();
                onVar.e0(this.c, new ch.e((String) obj));
                break;
        }
    }
}
