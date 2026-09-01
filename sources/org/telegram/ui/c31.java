package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c31 implements h31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.qc c;

    public c31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = qcVar;
    }

    @Override // org.telegram.ui.h31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new xy0(this.c, 8), 200L);
    }

    @Override // org.telegram.ui.h31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.h31
    public final /* synthetic */ void c() {
    }
}
