package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.kq0 {
    public final /* synthetic */ u40 a;

    public q40(u40 u40Var) {
        this.a = u40Var;
    }

    @Override // org.telegram.ui.kq0
    public final void a(ArrayList arrayList) {
        u40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.kq0
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
