package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ a5(d5 d5Var, int i7) {
        this.a = i7;
        this.b = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d5 d5Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = d5Var.s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            case 1:
                di.k1 k1Var = d5Var.o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                d5Var.dismiss();
                break;
            default:
                int i10 = d5Var.a;
                String str = d5Var.m1.slug;
                HashMap hashMap = i4.a;
                tr a02 = tr.a0(i10);
                a02.a.c(new rq(6, a02, str));
                break;
        }
    }
}
