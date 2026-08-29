package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ft0(gt0 gt0Var, String str, int i10) {
        this.a = i10;
        this.b = gt0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gt0 gt0Var = this.b;
                String str = this.c;
                gt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ft0(gt0Var, str, 1));
                break;
            default:
                gt0 gt0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                gt0Var2.f = null;
                if (!ChatObject.isChannel(gt0Var2.n) && gt0Var2.s.Z0 != null) {
                    arrayList = new ArrayList(gt0Var2.s.Z0.participants.participants);
                }
                gt0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new g(gt0Var2, str2, arrayList, 27));
                } else {
                    gt0Var2.r = 1;
                }
                gt0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(gt0Var2.n) ? gt0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
