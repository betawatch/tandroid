package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nb extends i7.g6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ ob f;

    public nb(ob obVar) {
        this.f = obVar;
    }

    @Override // i7.g6
    public final void a() {
        MessageObject messageObject = this.a;
        ob obVar = this.f;
        if (messageObject != null) {
            int indexOf = obVar.o0.indexOf(messageObject) + obVar.E.f;
            if (indexOf >= 0) {
                obVar.C.i1(indexOf, this.e, false);
            }
        } else {
            obVar.C.i1(this.b, this.d, this.c);
        }
        this.a = null;
        obVar.V = true;
        obVar.e1();
        AndroidUtilities.runOnUIThread(new it0(this, 21));
    }

    @Override // i7.g6
    public final void c() {
        ob obVar = this.f;
        obVar.K0 = obVar.getNotificationCenter().setAnimationInProgress(obVar.K0, ob.U0);
    }

    @Override // i7.g6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
