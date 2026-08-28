package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wm implements wj {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ sm b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    public wm(Utilities.Callback callback, org.telegram.ui.ActionBar.o2 o2Var, sm smVar) {
        this.a = callback;
        this.b = smVar;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.wj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.run(new zg.c((String) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.wj
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
        if (!arrayList.isEmpty()) {
            this.a.run(new zg.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.wj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.wj
    public final /* synthetic */ void N() {
    }
}
