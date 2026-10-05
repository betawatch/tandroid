package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jn implements ik {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;

    public jn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, fn fnVar) {
        this.a = callback;
        this.b = fnVar;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.ik
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new rh.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ik
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.a.run(new rh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ik
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.ik
    public final /* synthetic */ void M() {
    }
}
