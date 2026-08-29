package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q21 implements t21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.tc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ lh.h0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.tc tcVar, Context context, lh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = tcVar;
        this.c = context;
        this.d = h0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new m21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new av0(28, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        this.e.run();
    }
}
