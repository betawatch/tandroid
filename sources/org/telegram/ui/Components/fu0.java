package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fu0(gu0 gu0Var, String str, int i10) {
        this.a = i10;
        this.b = gu0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gu0 gu0Var = this.b;
                String str = this.c;
                gu0Var.getClass();
                AndroidUtilities.runOnUIThread(new fu0(gu0Var, str, 1));
                break;
            default:
                gu0 gu0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                gu0Var2.f = null;
                if (!ChatObject.isChannel(gu0Var2.n) && gu0Var2.s.d1 != null) {
                    arrayList = new ArrayList(gu0Var2.s.d1.participants.participants);
                }
                gu0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new in0((Object) gu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    gu0Var2.r = 1;
                }
                gu0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(gu0Var2.n) ? gu0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
