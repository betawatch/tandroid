// default package

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ kt2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                y74 y74Var = contactsActivity.a;
                y74Var.c(contactsActivity.r ? 0.0f : 1.0f);
                ot2 ot2Var = contactsActivity.b;
                float f = y74Var.f;
                ArrayList arrayList = ot2Var.O;
                ot2Var.M = f;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((p06) arrayList.get(i)).setLetterProgress(f);
                }
                byte b2 = 1;
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.w0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(s33.h).withEndAction(new kt2(contactsActivity, b2));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    y74Var.e = (byte) 80;
                    y74Var.a(1.0f);
                    break;
                }
                break;
            default:
                contactsActivity.f0 = null;
                break;
        }
    }
}
