package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bu0(cu0 cu0Var, String str, int i10) {
        this.a = i10;
        this.b = cu0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cu0 cu0Var = this.b;
                String str = this.c;
                cu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bu0(cu0Var, str, 1));
                break;
            default:
                cu0 cu0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                cu0Var2.f = null;
                if (!ChatObject.isChannel(cu0Var2.n) && cu0Var2.s.d1 != null) {
                    arrayList = new ArrayList(cu0Var2.s.d1.participants.participants);
                }
                cu0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new en0((Object) cu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    cu0Var2.r = 1;
                }
                cu0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(cu0Var2.n) ? cu0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
