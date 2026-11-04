package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ nr(ContactsActivity contactsActivity, int i3) {
        this.a = i3;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                qe.c cVar = contactsActivity.a;
                cVar.c(contactsActivity.r ? 0.0f : 1.0f);
                qr qrVar = contactsActivity.b;
                float f10 = cVar.f;
                ArrayList arrayList = qrVar.O;
                qrVar.M = f10;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i3)).setLetterProgress(f10);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new nr(contactsActivity, 1));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    cVar.e = 80L;
                    cVar.a(1.0f);
                    break;
                }
                break;
            default:
                this.b.f0 = null;
                break;
        }
    }
}
