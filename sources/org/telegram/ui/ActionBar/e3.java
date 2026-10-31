package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ e3(q20 q20Var, boolean[] zArr) {
        this.b = q20Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.c;
                if (!zArr[0]) {
                    this.b.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                q20 q20Var = this.b;
                if (q20Var != null && !this.c[0]) {
                    q20Var.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e3(boolean[] zArr, q20 q20Var) {
        this.c = zArr;
        this.b = q20Var;
    }
}
