package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n21 implements s21 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.mc c;

    public n21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.mc mcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = mcVar;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ky0(this.c, 9), 200L);
    }

    @Override // org.telegram.ui.s21
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.s21
    public final /* synthetic */ void c() {
    }
}
