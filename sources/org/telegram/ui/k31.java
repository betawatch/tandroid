package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        AndroidUtilities.runOnUIThread(new vz0(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.p31
    public final /* synthetic */ void c() {
    }
}
