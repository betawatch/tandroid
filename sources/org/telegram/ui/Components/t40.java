package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class t40 implements org.telegram.ui.bq0 {
    public final /* synthetic */ x40 a;

    public t40(x40 x40Var) {
        this.a = x40Var;
    }

    @Override // org.telegram.ui.bq0
    public final void a(ArrayList arrayList) {
        x40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.bq0
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
