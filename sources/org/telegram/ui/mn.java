package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mn extends k7.c6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override // k7.c6
    public final void a() {
        MessageObject messageObject = this.a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.x0.T();
            int indexOf = znVar.r6.indexOf(this.a) + znVar.x0.G;
            if (indexOf >= 0) {
                znVar.w0.i1(indexOf, (int) ((this.e + this.g) - znVar.p9), this.f);
            }
        } else {
            znVar.x0.T();
            znVar.w0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        znVar.j3 = true;
        znVar.Wc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override // k7.c6
    public final void c() {
        zn znVar = this.h;
        znVar.F9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.F9, zn.Kc);
        uk ukVar = znVar.ta;
        if (ukVar.n) {
            ukVar.d();
        }
    }

    @Override // k7.c6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
