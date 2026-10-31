package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ ps(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                fe.f fVar = contactsActivity.a;
                fVar.c(contactsActivity.r ? 0.0f : 1.0f);
                ss ssVar = contactsActivity.b;
                float f7 = fVar.f;
                ArrayList arrayList = ssVar.N;
                ssVar.L = f7;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.u4) arrayList.get(i10)).setLetterProgress(f7);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new ps(contactsActivity, 1));
                contactsActivity.e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    fVar.e = 80L;
                    fVar.a(1.0f);
                    break;
                }
                break;
            default:
                this.b.e0 = null;
                break;
        }
    }
}
