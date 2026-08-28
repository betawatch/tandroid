package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.r7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ oq0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.a = r7Var;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
