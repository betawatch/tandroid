package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c31 implements f31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.qc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ nh.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public c31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = qcVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.f31
    public final void a() {
        AndroidUtilities.runOnUIThread(new y21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void b() {
        AndroidUtilities.runOnUIThread(new l01(7, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void c() {
        this.e.run();
    }
}
