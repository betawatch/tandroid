package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
