package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i50 implements org.telegram.ui.jq0 {
    public final /* synthetic */ m50 a;

    public i50(m50 m50Var) {
        this.a = m50Var;
    }

    @Override // org.telegram.ui.jq0
    public final void a(ArrayList arrayList) {
        m50.a(this.a, false, arrayList);
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
