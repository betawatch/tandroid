package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ru0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qu0(ru0 ru0Var, String str, int i10) {
        this.a = i10;
        this.b = ru0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ru0 ru0Var = this.b;
                String str = this.c;
                ru0Var.getClass();
                AndroidUtilities.runOnUIThread(new qu0(ru0Var, str, 1));
                break;
            default:
                ru0 ru0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ru0Var2.f = null;
                if (!ChatObject.isChannel(ru0Var2.n) && ru0Var2.s.f1 != null) {
                    arrayList = new ArrayList(ru0Var2.s.f1.participants.participants);
                }
                ru0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new kg(ru0Var2, str2, arrayList, 24));
                } else {
                    ru0Var2.r = 1;
                }
                ru0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(ru0Var2.n) ? ru0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
