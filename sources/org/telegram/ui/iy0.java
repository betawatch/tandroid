package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.lc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ fi.h0 e;

    public /* synthetic */ iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = lcVar;
        this.d = context;
        this.e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fi.h0 h0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.lc lcVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i10 = 2;
        switch (i7) {
            case 0:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, i10), h0Var)).j();
                break;
            case 1:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 5), h0Var)).j();
                break;
            default:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 6), h0Var)).j();
                break;
        }
    }
}
