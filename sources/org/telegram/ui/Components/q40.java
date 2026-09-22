package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.iq0 {
    public final /* synthetic */ u40 a;

    public q40(u40 u40Var) {
        this.a = u40Var;
    }

    @Override // org.telegram.ui.iq0
    public final void a(ArrayList arrayList) {
        u40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.iq0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
