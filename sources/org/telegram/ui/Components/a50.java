package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
