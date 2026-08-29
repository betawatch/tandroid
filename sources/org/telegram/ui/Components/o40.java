package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o40 implements org.telegram.ui.gp0 {
    public final /* synthetic */ s40 a;

    public o40(s40 s40Var) {
        this.a = s40Var;
    }

    @Override // org.telegram.ui.gp0
    public final void a(ArrayList arrayList) {
        s40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.gp0
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
