package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a40 implements org.telegram.ui.hp0 {
    public final /* synthetic */ e40 a;

    public a40(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // org.telegram.ui.hp0
    public final void a(ArrayList arrayList) {
        e40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.hp0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
