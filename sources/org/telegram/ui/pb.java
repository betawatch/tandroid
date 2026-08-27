package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pb extends h7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ qb f;

    public pb(qb qbVar) {
        this.f = qbVar;
    }

    @Override // h7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        qb qbVar = this.f;
        if (messageObject != null) {
            int indexOf = qbVar.o0.indexOf(messageObject) + qbVar.E.f;
            if (indexOf >= 0) {
                qbVar.C.i1(indexOf, this.e, false);
            }
        } else {
            qbVar.C.i1(this.b, this.d, this.c);
        }
        this.a = null;
        qbVar.V = true;
        qbVar.e1();
        AndroidUtilities.runOnUIThread(new lt0(this, 21));
    }

    @Override // h7.a6
    public final void c() {
        qb qbVar = this.f;
        qbVar.K0 = qbVar.getNotificationCenter().setAnimationInProgress(qbVar.K0, qb.U0);
    }

    @Override // h7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
