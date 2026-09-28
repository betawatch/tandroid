package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ r30(t30 t30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = t30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t30 t30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (t30Var.e != null) {
                    t30Var.e = null;
                    AndroidUtilities.runOnUIThread(new r30(t30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                t30 t30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                t30Var2.e = null;
                if (!ChatObject.isChannel(t30Var2.w.V) && t30Var2.w.W != null) {
                    arrayList = new ArrayList(t30Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(t30Var2, str2, i11, arrayList));
                } else {
                    t30Var2.h = false;
                }
                t30Var2.d.g(str2, ChatObject.canAddUsers(t30Var2.w.V), false, true, false, ChatObject.isChannel(t30Var2.w.V) ? t30Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
