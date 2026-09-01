package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u40 implements org.telegram.ui.qp0 {
    public final /* synthetic */ y40 a;

    public u40(y40 y40Var) {
        this.a = y40Var;
    }

    @Override // org.telegram.ui.qp0
    public final void a(ArrayList arrayList) {
        y40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.qp0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
