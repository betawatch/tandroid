package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ us0(vs0 vs0Var, String str, int i9) {
        this.a = i9;
        this.b = vs0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vs0 vs0Var = this.b;
                String str = this.c;
                vs0Var.getClass();
                AndroidUtilities.runOnUIThread(new us0(vs0Var, str, 1));
                break;
            default:
                vs0 vs0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                vs0Var2.f = null;
                if (!ChatObject.isChannel(vs0Var2.n) && vs0Var2.s.Z0 != null) {
                    arrayList = new ArrayList(vs0Var2.s.Z0.participants.participants);
                }
                vs0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ue0(vs0Var2, str2, arrayList, 8));
                } else {
                    vs0Var2.r = 1;
                }
                vs0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(vs0Var2.n) ? vs0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
