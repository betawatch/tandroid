package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r40 implements org.telegram.ui.bq0 {
    public final /* synthetic */ v40 a;

    public r40(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // org.telegram.ui.bq0
    public final void a(ArrayList arrayList) {
        v40.b(this.a, false, arrayList);
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
