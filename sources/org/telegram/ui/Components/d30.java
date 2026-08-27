package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ d30(f30 f30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = f30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f30 f30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (f30Var.e != null) {
                    f30Var.e = null;
                    AndroidUtilities.runOnUIThread(new d30(f30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                f30 f30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                f30Var2.e = null;
                if (!ChatObject.isChannel(f30Var2.w.R) && f30Var2.w.S != null) {
                    arrayList = new ArrayList(f30Var2.w.S.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ag.k0(f30Var2, str2, i11, arrayList));
                } else {
                    f30Var2.h = false;
                }
                f30Var2.d.g(str2, ChatObject.canAddUsers(f30Var2.w.R), false, true, false, ChatObject.isChannel(f30Var2.w.R) ? f30Var2.w.R.id : 0L, false, 2, i11);
                break;
        }
    }
}
