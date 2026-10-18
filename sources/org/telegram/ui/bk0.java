package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ck0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bk0(ck0 ck0Var, String str, int i10) {
        this.a = i10;
        this.b = ck0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ck0 ck0Var = this.b;
                String str = this.c;
                ck0Var.getClass();
                AndroidUtilities.runOnUIThread(new bk0(ck0Var, str, 1));
                break;
            default:
                ck0 ck0Var2 = this.b;
                String str2 = this.c;
                hg.a2 a2Var = ck0Var2.h;
                int i10 = ck0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new xe0(ck0Var2, str2, new ArrayList(ck0Var2.n.w), 9));
                break;
        }
    }
}
