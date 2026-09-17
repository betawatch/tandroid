package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.jq0 {
    public final /* synthetic */ u40 a;

    public q40(u40 u40Var) {
        this.a = u40Var;
    }

    @Override // org.telegram.ui.jq0
    public final void a(ArrayList arrayList) {
        u40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.jq0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
