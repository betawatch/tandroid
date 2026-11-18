package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ x4(a5 a5Var, int i7) {
        this.a = i7;
        this.b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a5 a5Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = a5Var.s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            case 1:
                di.k1 k1Var = a5Var.o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                a5Var.dismiss();
                break;
            default:
                int i10 = a5Var.a;
                String str = a5Var.m1.slug;
                HashMap hashMap = f4.a;
                tr a02 = tr.a0(i10);
                a02.a.c(new rq(6, a02, str));
                break;
        }
    }
}
