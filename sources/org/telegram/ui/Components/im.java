package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ im(jn jnVar, int i9, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.d0(this.c, (yg.e) obj);
                break;
            default:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.d0(this.c, new zg.e((String) obj));
                break;
        }
    }
}
