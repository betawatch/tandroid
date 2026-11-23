package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ c5(f5 f5Var, int i7) {
        this.a = i7;
        this.b = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f5 f5Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = f5Var.s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            case 1:
                di.k1 k1Var = f5Var.o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                f5Var.dismiss();
                break;
            default:
                int i10 = f5Var.a;
                String str = f5Var.m1.slug;
                HashMap hashMap = l4.a;
                tr a02 = tr.a0(i10);
                a02.a.c(new rq(6, a02, str));
                break;
        }
    }
}
