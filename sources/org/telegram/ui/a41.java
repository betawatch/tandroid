package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a41 implements d41 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.wc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.Components.bq0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public a41(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, org.telegram.ui.Components.bq0 bq0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = wcVar;
        this.c = context;
        this.d = bq0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.d41
    public final void a() {
        AndroidUtilities.runOnUIThread(new w31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void b() {
        AndroidUtilities.runOnUIThread(new ey0(22, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void c() {
        this.e.run();
    }
}
