package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
