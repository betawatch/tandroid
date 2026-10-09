package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ su0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ru0(su0 su0Var, String str, int i10) {
        this.a = i10;
        this.b = su0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                su0 su0Var = this.b;
                String str = this.c;
                su0Var.getClass();
                AndroidUtilities.runOnUIThread(new ru0(su0Var, str, 1));
                break;
            default:
                su0 su0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                su0Var2.f = null;
                if (!ChatObject.isChannel(su0Var2.n) && su0Var2.s.d1 != null) {
                    arrayList = new ArrayList(su0Var2.s.d1.participants.participants);
                }
                su0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new og0(su0Var2, str2, arrayList, 8));
                } else {
                    su0Var2.r = 1;
                }
                su0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(su0Var2.n) ? su0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
