package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q21 implements s21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.wc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ di.k0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = wcVar;
        this.c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new m21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(16, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        this.e.run();
    }
}
