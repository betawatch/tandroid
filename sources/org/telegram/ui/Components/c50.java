package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c50 implements org.telegram.ui.bq0 {
    public final /* synthetic */ g50 a;

    public c50(g50 g50Var) {
        this.a = g50Var;
    }

    @Override // org.telegram.ui.bq0
    public final void a(ArrayList arrayList) {
        g50.a(this.a, false, arrayList);
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
