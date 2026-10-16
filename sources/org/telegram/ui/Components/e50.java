package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e50 implements org.telegram.ui.nq0 {
    public final /* synthetic */ i50 a;

    public e50(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // org.telegram.ui.nq0
    public final void a(ArrayList arrayList) {
        i50.a(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.nq0
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
