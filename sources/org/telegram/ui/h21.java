package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class h21 implements k21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ci.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public h21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.k21
    public final void a() {
        AndroidUtilities.runOnUIThread(new d21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void c() {
        this.e.run();
    }
}
