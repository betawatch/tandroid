package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ int c;

    public /* synthetic */ cn(fo foVar, int i10, int i11) {
        this.a = i11;
        this.b = foVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, (rh.e) obj);
                break;
            default:
                fo foVar = this.b;
                foVar.getClass();
                foVar.h0(this.c, new sh.e((String) obj));
                break;
        }
    }
}
