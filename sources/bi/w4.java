package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ w4(z4 z4Var, int i7) {
        this.a = i7;
        this.b = z4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        z4 z4Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = z4Var.s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            case 1:
                di.k1 k1Var = z4Var.o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                z4Var.dismiss();
                break;
            default:
                int i10 = z4Var.a;
                String str = z4Var.m1.slug;
                HashMap hashMap = e4.a;
                tr a02 = tr.a0(i10);
                a02.a.c(new rq(6, a02, str));
                break;
        }
    }
}
