package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m31 implements p31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.yc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ycVar;
        this.c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.p31
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ix0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void c() {
        this.e.run();
    }
}
