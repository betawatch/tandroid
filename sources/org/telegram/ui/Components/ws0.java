package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ws0(xs0 xs0Var, String str, int i10) {
        this.a = i10;
        this.b = xs0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs0 xs0Var = this.b;
                String str = this.c;
                xs0Var.getClass();
                AndroidUtilities.runOnUIThread(new ws0(xs0Var, str, 1));
                break;
            default:
                xs0 xs0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                xs0Var2.f = null;
                if (!ChatObject.isChannel(xs0Var2.n) && xs0Var2.s.Z0 != null) {
                    arrayList = new ArrayList(xs0Var2.s.Z0.participants.participants);
                }
                xs0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gs0(xs0Var2, str2, arrayList, 2));
                } else {
                    xs0Var2.r = 1;
                }
                xs0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(xs0Var2.n) ? xs0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
