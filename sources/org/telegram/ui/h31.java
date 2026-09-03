package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h31 implements m31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.qc c;

    public h31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = qcVar;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new sz0(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.m31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.m31
    public final /* synthetic */ void c() {
    }
}
