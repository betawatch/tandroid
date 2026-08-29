package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv b;

    public /* synthetic */ fv(gv gvVar, int i10) {
        this.a = i10;
        this.b = gvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                jv jvVar = this.b.f;
                jvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = jvVar.c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.x3.s(R.string.AddEmojiNotFound, tc.a0(o2Var), null);
                    break;
                }
                break;
        }
    }
}
