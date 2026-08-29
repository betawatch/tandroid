package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o21 implements t21 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.tc c;

    public o21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.tc tcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = tcVar;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ky0(this.c, 9), 200L);
    }

    @Override // org.telegram.ui.t21
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.t21
    public final /* synthetic */ void c() {
    }
}
