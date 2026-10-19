package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class f21 implements k21 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.xc c;

    public f21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = xcVar;
    }

    @Override // org.telegram.ui.k21
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new qy0(this.c, 8), 200L);
    }

    @Override // org.telegram.ui.k21
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.k21
    public final /* synthetic */ void c() {
    }
}
