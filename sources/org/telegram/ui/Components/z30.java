package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ z30(b40 b40Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = b40Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b40 b40Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (b40Var.e != null) {
                    b40Var.e = null;
                    AndroidUtilities.runOnUIThread(new z30(b40Var, str, i10, 1));
                    break;
                }
                break;
            default:
                b40 b40Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                b40Var2.e = null;
                if (!ChatObject.isChannel(b40Var2.w.V) && b40Var2.w.W != null) {
                    arrayList = new ArrayList(b40Var2.w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ai.h1(b40Var2, str2, i11, arrayList2, 24));
                } else {
                    b40Var2.h = false;
                }
                b40Var2.d.g(str2, ChatObject.canAddUsers(b40Var2.w.V), false, true, false, ChatObject.isChannel(b40Var2.w.V) ? b40Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
