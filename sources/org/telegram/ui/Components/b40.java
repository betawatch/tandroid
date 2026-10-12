package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ b40(d40 d40Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = d40Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d40 d40Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (d40Var.e != null) {
                    d40Var.e = null;
                    AndroidUtilities.runOnUIThread(new b40(d40Var, str, i10, 1));
                    break;
                }
                break;
            default:
                d40 d40Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                d40Var2.e = null;
                if (!ChatObject.isChannel(d40Var2.w.V) && d40Var2.w.W != null) {
                    arrayList = new ArrayList(d40Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bi.n8(d40Var2, str2, i11, arrayList));
                } else {
                    d40Var2.h = false;
                }
                d40Var2.d.g(str2, ChatObject.canAddUsers(d40Var2.w.V), false, true, false, ChatObject.isChannel(d40Var2.w.V) ? d40Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
