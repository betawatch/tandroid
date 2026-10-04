package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class o31 implements r31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.yc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public o31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ycVar;
        this.c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.r31
    public final void a() {
        AndroidUtilities.runOnUIThread(new k31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.r31
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(22, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.r31
    public final void c() {
        this.e.run();
    }
}
