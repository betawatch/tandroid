package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ ns(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                oe.e eVar = contactsActivity.a;
                eVar.c(contactsActivity.r ? 0.0f : 1.0f);
                qs qsVar = contactsActivity.b;
                float f7 = eVar.f;
                ArrayList arrayList = qsVar.N;
                qsVar.L = f7;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.v4) arrayList.get(i10)).setLetterProgress(f7);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new ns(contactsActivity, 1));
                contactsActivity.e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    eVar.e = 80L;
                    eVar.a(1.0f);
                    break;
                }
                break;
            default:
                this.b.e0 = null;
                break;
        }
    }
}
