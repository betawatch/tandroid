package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k31 implements p31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.xc c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = xcVar;
    }

    @Override // org.telegram.ui.p31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vz0(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void c() {
    }
}
