package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gn implements fk {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    public gn(Utilities.Callback callback, org.telegram.ui.ActionBar.o2 o2Var, cn cnVar) {
        this.a = callback;
        this.b = cnVar;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new rh.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new rh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void O() {
    }
}
