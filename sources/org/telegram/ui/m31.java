package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m31 implements p31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
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
        AndroidUtilities.runOnUIThread(new jx0(24, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void c() {
        this.e.run();
    }
}
