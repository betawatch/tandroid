package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ob extends g7.f6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ pb f;

    public ob(pb pbVar) {
        this.f = pbVar;
    }

    @Override // g7.f6
    public final void a() {
        MessageObject messageObject = this.a;
        pb pbVar = this.f;
        if (messageObject != null) {
            int indexOf = pbVar.o0.indexOf(messageObject) + pbVar.E.f;
            if (indexOf >= 0) {
                pbVar.C.i1(indexOf, this.e, false);
            }
        } else {
            pbVar.C.i1(this.b, this.d, this.c);
        }
        this.a = null;
        pbVar.V = true;
        pbVar.e1();
        AndroidUtilities.runOnUIThread(new kt0(this, 21));
    }

    @Override // g7.f6
    public final void c() {
        pb pbVar = this.f;
        pbVar.K0 = pbVar.getNotificationCenter().setAnimationInProgress(pbVar.K0, pb.U0);
    }

    @Override // g7.f6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
