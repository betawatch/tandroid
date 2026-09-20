package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ zt0(au0 au0Var, String str, int i10) {
        this.a = i10;
        this.b = au0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                au0 au0Var = this.b;
                String str = this.c;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new zt0(au0Var, str, 1));
                break;
            default:
                au0 au0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                au0Var2.f = null;
                if (!ChatObject.isChannel(au0Var2.n) && au0Var2.s.d1 != null) {
                    arrayList = new ArrayList(au0Var2.s.d1.participants.participants);
                }
                au0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cn0((Object) au0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    au0Var2.r = 1;
                }
                au0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(au0Var2.n) ? au0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
