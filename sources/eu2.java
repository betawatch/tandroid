// default package

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ eu2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                contactsActivity.f0 = null;
                break;
            default:
                t84 t84Var = contactsActivity.a;
                t84Var.c(contactsActivity.r ? 0.0f : 1.0f);
                iu2 iu2Var = contactsActivity.b;
                float f = t84Var.f;
                ArrayList arrayList = iu2Var.O;
                iu2Var.M = f;
                byte b2 = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((t26) arrayList.get(i)).setLetterProgress(f);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.x0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(k43.h).withEndAction(new eu2(contactsActivity, b2));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    t84Var.e = (byte) 80;
                    t84Var.a(1.0f);
                    break;
                }
                break;
        }
    }
}
