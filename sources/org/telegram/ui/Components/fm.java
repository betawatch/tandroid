package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;
    public final /* synthetic */ int c;

    public /* synthetic */ fm(in inVar, int i10, int i11) {
        this.a = i11;
        this.b = inVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (zg.e) obj);
                break;
            default:
                in inVar = this.b;
                inVar.getClass();
                inVar.e0(this.c, new ah.e((String) obj));
                break;
        }
    }
}
