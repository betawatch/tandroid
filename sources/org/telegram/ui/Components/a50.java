package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a50 implements org.telegram.ui.tp0 {
    public final /* synthetic */ e50 a;

    public a50(e50 e50Var) {
        this.a = e50Var;
    }

    @Override // org.telegram.ui.tp0
    public final void a(ArrayList arrayList) {
        e50.a(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.tp0
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
