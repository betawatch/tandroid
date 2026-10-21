package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ku0(lu0 lu0Var, String str, int i10) {
        this.a = i10;
        this.b = lu0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lu0 lu0Var = this.b;
                String str = this.c;
                lu0Var.getClass();
                AndroidUtilities.runOnUIThread(new ku0(lu0Var, str, 1));
                break;
            default:
                lu0 lu0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                lu0Var2.f = null;
                if (!ChatObject.isChannel(lu0Var2.n) && lu0Var2.s.d1 != null) {
                    arrayList = new ArrayList(lu0Var2.s.d1.participants.participants);
                }
                lu0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) lu0Var2, (Object) str2, arrayList, 24));
                } else {
                    lu0Var2.r = 1;
                }
                lu0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(lu0Var2.n) ? lu0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
