package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o21 implements s21 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.wc c;

    public o21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = wcVar;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new oy0(this.c, 10), 200L);
    }

    @Override // org.telegram.ui.s21
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.s21
    public final /* synthetic */ void c() {
    }
}
