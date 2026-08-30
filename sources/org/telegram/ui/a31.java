package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a31 implements f31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.qc c;

    public a31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = qcVar;
    }

    @Override // org.telegram.ui.f31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vy0(this.c, 9), 200L);
    }

    @Override // org.telegram.ui.f31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.f31
    public final /* synthetic */ void c() {
    }
}
