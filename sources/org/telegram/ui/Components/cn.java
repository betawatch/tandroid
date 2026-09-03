package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cn implements xj {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ ym b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;

    public cn(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, ym ymVar) {
        this.a = callback;
        this.b = ymVar;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.xj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.run(new eh.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.xj
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new eh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.xj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.xj
    public final /* synthetic */ void O() {
    }
}
