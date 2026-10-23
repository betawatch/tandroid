package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l21 implements o21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ci.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public l21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.o21
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void b() {
        AndroidUtilities.runOnUIThread(new mv0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void c() {
        this.e.run();
    }
}
