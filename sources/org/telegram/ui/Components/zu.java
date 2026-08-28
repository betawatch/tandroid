package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ av b;

    public /* synthetic */ zu(av avVar, int i9) {
        this.a = i9;
        this.b = avVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                dv dvVar = this.b.f;
                dvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.ll.p(R.string.AddEmojiNotFound, oc.a0(o2Var), null);
                    break;
                }
                break;
        }
    }
}
