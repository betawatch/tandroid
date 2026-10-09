package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ f40(h40 h40Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = h40Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h40 h40Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (h40Var.e != null) {
                    h40Var.e = null;
                    AndroidUtilities.runOnUIThread(new f40(h40Var, str, i10, 1));
                    break;
                }
                break;
            default:
                h40 h40Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                h40Var2.e = null;
                if (!ChatObject.isChannel(h40Var2.w.V) && h40Var2.w.W != null) {
                    arrayList = new ArrayList(h40Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(h40Var2, str2, i11, arrayList));
                } else {
                    h40Var2.h = false;
                }
                h40Var2.d.g(str2, ChatObject.canAddUsers(h40Var2.w.V), false, true, false, ChatObject.isChannel(h40Var2.w.V) ? h40Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
