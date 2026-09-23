package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class l31 implements q31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.xc c;

    public l31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = xcVar;
    }

    @Override // org.telegram.ui.q31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new xz0(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.q31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.q31
    public final /* synthetic */ void c() {
    }
}
