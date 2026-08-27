package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p21 implements s21 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.mc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jh.h0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public p21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.mc mcVar, Context context, jh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = mcVar;
        this.c = context;
        this.d = h0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new m21(1, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        this.e.run();
    }
}
