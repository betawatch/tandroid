package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jn extends w7.z5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ wn h;

    public jn(wn wnVar) {
        this.h = wnVar;
    }

    @Override // w7.z5
    public final void a() {
        MessageObject messageObject = this.a;
        wn wnVar = this.h;
        if (messageObject != null) {
            wnVar.A0.T();
            int indexOf = wnVar.u6.indexOf(this.a) + wnVar.A0.J;
            if (indexOf >= 0) {
                wnVar.z0.i1(indexOf, (int) ((this.e + this.g) - wnVar.s9), this.f);
            }
        } else {
            wnVar.A0.T();
            wnVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        wnVar.m3 = true;
        wnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new aj(this, 8));
    }

    @Override // w7.z5
    public final void c() {
        wn wnVar = this.h;
        wnVar.I9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.I9, wn.Mc);
        sk skVar = wnVar.wa;
        if (skVar.n) {
            skVar.d();
        }
    }

    @Override // w7.z5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
