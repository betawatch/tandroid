package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class en extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ sn h;

    public en(sn snVar) {
        this.h = snVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.G6.indexOf(this.a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.z0.i1(indexOf, (int) ((this.e + this.g) - snVar.E9), this.f);
            }
        } else {
            snVar.A0.T();
            snVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        snVar.y3 = true;
        snVar.dd(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override // w7.a6
    public final void c() {
        sn snVar = this.h;
        snVar.U9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.U9, sn.bd);
        pk pkVar = snVar.Ia;
        if (pkVar.n) {
            pkVar.d();
        }
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
