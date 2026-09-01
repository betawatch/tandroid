package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e31 implements h31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.qc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ oh.h0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public e31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, oh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = qcVar;
        this.c = context;
        this.d = h0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.h31
    public final void a() {
        AndroidUtilities.runOnUIThread(new a31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void b() {
        AndroidUtilities.runOnUIThread(new w01(6, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void c() {
        this.e.run();
    }
}
