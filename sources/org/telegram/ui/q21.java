package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q21 implements t21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.oc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ih.j0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.oc ocVar, Context context, ih.j0 j0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ocVar;
        this.c = context;
        this.d = j0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new n21(1, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        this.e.run();
    }
}
