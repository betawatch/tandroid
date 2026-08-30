package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s40 implements org.telegram.ui.op0 {
    public final /* synthetic */ w40 a;

    public s40(w40 w40Var) {
        this.a = w40Var;
    }

    @Override // org.telegram.ui.op0
    public final void a(ArrayList arrayList) {
        w40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.op0
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
