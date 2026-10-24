package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nu0(ou0 ou0Var, String str, int i10) {
        this.a = i10;
        this.b = ou0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ou0 ou0Var = this.b;
                String str = this.c;
                ou0Var.getClass();
                AndroidUtilities.runOnUIThread(new nu0(ou0Var, str, 1));
                break;
            default:
                ou0 ou0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ou0Var2.f = null;
                if (!ChatObject.isChannel(ou0Var2.n) && ou0Var2.s.d1 != null) {
                    arrayList = new ArrayList(ou0Var2.s.d1.participants.participants);
                }
                ou0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ou0Var2, (Object) str2, arrayList, 24));
                } else {
                    ou0Var2.r = 1;
                }
                ou0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(ou0Var2.n) ? ou0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
