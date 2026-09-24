package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ p30(r30 r30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = r30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r30 r30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (r30Var.e != null) {
                    r30Var.e = null;
                    AndroidUtilities.runOnUIThread(new p30(r30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                r30 r30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                r30Var2.e = null;
                if (!ChatObject.isChannel(r30Var2.w.V) && r30Var2.w.W != null) {
                    arrayList = new ArrayList(r30Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(r30Var2, str2, i11, arrayList));
                } else {
                    r30Var2.h = false;
                }
                r30Var2.d.g(str2, ChatObject.canAddUsers(r30Var2.w.V), false, true, false, ChatObject.isChannel(r30Var2.w.V) ? r30Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
