package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
