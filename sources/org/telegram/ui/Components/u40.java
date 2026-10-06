package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class u40 implements org.telegram.ui.eq0 {
    public final /* synthetic */ y40 a;

    public u40(y40 y40Var) {
        this.a = y40Var;
    }

    @Override // org.telegram.ui.eq0
    public final void a(ArrayList arrayList) {
        y40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.eq0
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
