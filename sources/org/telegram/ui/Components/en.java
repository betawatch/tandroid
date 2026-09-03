package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class en implements zj {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;

    public en(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, an anVar) {
        this.a = callback;
        this.b = anVar;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.zj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.run(new fh.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.zj
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new fh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.zj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final /* synthetic */ void O() {
    }
}
