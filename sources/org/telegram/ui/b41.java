package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b41 implements e41 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.zc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bi.s0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public b41(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = zcVar;
        this.c = context;
        this.d = s0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.e41
    public final void a() {
        AndroidUtilities.runOnUIThread(new x31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void b() {
        AndroidUtilities.runOnUIThread(new i11(9, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void c() {
        this.e.run();
    }
}
