package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;

    public /* synthetic */ ym(zn znVar, int i10, int i11) {
        this.a = i11;
        this.b = znVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (ph.e) obj);
                break;
            default:
                zn znVar = this.b;
                znVar.getClass();
                znVar.e0(this.c, new qh.e((String) obj));
                break;
        }
    }
}
