package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gn extends i7.g6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ tn h;

    public gn(tn tnVar) {
        this.h = tnVar;
    }

    @Override // i7.g6
    public final void a() {
        MessageObject messageObject = this.a;
        tn tnVar = this.h;
        if (messageObject != null) {
            tnVar.w0.T();
            int indexOf = tnVar.q6.indexOf(this.a) + tnVar.w0.F;
            if (indexOf >= 0) {
                tnVar.v0.i1(indexOf, (int) ((this.e + this.g) - tnVar.o9), this.f);
            }
        } else {
            tnVar.w0.T();
            tnVar.v0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        tnVar.i3 = true;
        tnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ui(this, 8));
    }

    @Override // i7.g6
    public final void c() {
        tn tnVar = this.h;
        tnVar.E9 = tnVar.getNotificationCenter().setAnimationInProgress(tnVar.E9, tn.Jc);
        mk mkVar = tnVar.sa;
        if (mkVar.n) {
            mkVar.d();
        }
    }

    @Override // i7.g6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
