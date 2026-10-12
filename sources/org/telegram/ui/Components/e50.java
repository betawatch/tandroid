package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e50 implements org.telegram.ui.pq0 {
    public final /* synthetic */ i50 a;

    public e50(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // org.telegram.ui.pq0
    public final void a(ArrayList arrayList) {
        i50.a(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.pq0
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
