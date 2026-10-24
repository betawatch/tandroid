package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
