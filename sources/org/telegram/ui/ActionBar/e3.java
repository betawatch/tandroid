package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ e3(r20 r20Var, boolean[] zArr) {
        this.b = r20Var;
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
                r20 r20Var = this.b;
                if (r20Var != null && !this.c[0]) {
                    r20Var.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e3(boolean[] zArr, r20 r20Var) {
        this.c = zArr;
        this.b = r20Var;
    }
}
