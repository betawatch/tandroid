package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o21 implements q21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.wc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ di.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public o21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = wcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.q21
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void b() {
        AndroidUtilities.runOnUIThread(new fy0(15, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void c() {
        this.e.run();
    }
}
