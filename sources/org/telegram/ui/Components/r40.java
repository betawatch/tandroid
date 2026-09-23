package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r40 implements org.telegram.ui.cq0 {
    public final /* synthetic */ v40 a;

    public r40(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // org.telegram.ui.cq0
    public final void a(ArrayList arrayList) {
        v40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.cq0
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
