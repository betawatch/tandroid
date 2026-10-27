package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;
    public final /* synthetic */ int c;

    public /* synthetic */ dn(go goVar, int i10, int i11) {
        this.a = i11;
        this.b = goVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, (sh.e) obj);
                break;
            default:
                go goVar = this.b;
                goVar.getClass();
                goVar.h0(this.c, new th.e((String) obj));
                break;
        }
    }
}
