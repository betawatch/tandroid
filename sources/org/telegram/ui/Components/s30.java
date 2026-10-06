package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class s30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ s30(u30 u30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = u30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u30 u30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (u30Var.e != null) {
                    u30Var.e = null;
                    AndroidUtilities.runOnUIThread(new s30(u30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                u30 u30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                u30Var2.e = null;
                if (!ChatObject.isChannel(u30Var2.w.V) && u30Var2.w.W != null) {
                    arrayList = new ArrayList(u30Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(u30Var2, str2, i11, arrayList));
                } else {
                    u30Var2.h = false;
                }
                u30Var2.d.g(str2, ChatObject.canAddUsers(u30Var2.w.V), false, true, false, ChatObject.isChannel(u30Var2.w.V) ? u30Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
