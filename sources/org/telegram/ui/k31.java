package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k31 implements p31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.yc c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.a = zArr;
        this.b = callback;
        this.c = ycVar;
    }

    @Override // org.telegram.ui.p31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new hz0(this.c, 8), 200L);
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void c() {
    }
}
