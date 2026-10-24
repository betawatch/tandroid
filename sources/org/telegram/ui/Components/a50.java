package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a50 implements org.telegram.ui.up0 {
    public final /* synthetic */ e50 a;

    public a50(e50 e50Var) {
        this.a = e50Var;
    }

    @Override // org.telegram.ui.up0
    public final void a(ArrayList arrayList) {
        e50.a(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.up0
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
