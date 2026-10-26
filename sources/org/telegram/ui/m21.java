package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m21 implements q21 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.wc c;

    public m21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = wcVar;
    }

    @Override // org.telegram.ui.q21
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new my0(this.c, 10), 200L);
    }

    @Override // org.telegram.ui.q21
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.q21
    public final /* synthetic */ void c() {
    }
}
