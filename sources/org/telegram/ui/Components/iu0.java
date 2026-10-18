package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ iu0(ju0 ju0Var, String str, int i10) {
        this.a = i10;
        this.b = ju0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ju0 ju0Var = this.b;
                String str = this.c;
                ju0Var.getClass();
                AndroidUtilities.runOnUIThread(new iu0(ju0Var, str, 1));
                break;
            default:
                ju0 ju0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ju0Var2.f = null;
                if (!ChatObject.isChannel(ju0Var2.n) && ju0Var2.s.d1 != null) {
                    arrayList = new ArrayList(ju0Var2.s.d1.participants.participants);
                }
                ju0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ju0Var2, (Object) str2, arrayList, 24));
                } else {
                    ju0Var2.r = 1;
                }
                ju0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(ju0Var2.n) ? ju0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
