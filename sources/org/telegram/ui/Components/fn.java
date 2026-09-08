package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fn implements fk {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;

    public fn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, bn bnVar) {
        this.a = callback;
        this.b = bnVar;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new sh.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new sh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void O() {
    }
}
