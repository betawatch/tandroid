package bi;

import java.util.HashMap;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ z4(c5 c5Var, int i7) {
        this.a = i7;
        this.b = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        c5 c5Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = c5Var.s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            case 1:
                di.k1 k1Var = c5Var.o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                c5Var.dismiss();
                break;
            default:
                int i10 = c5Var.a;
                String str = c5Var.m1.slug;
                HashMap hashMap = i4.a;
                ur a02 = ur.a0(i10);
                a02.a.c(new sq(6, a02, str));
                break;
        }
    }
}
