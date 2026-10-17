package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class j21 implements m21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ci.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public j21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.m21
    public final void a() {
        AndroidUtilities.runOnUIThread(new f21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m21
    public final void b() {
        AndroidUtilities.runOnUIThread(new lv0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.m21
    public final void c() {
        this.e.run();
    }
}
