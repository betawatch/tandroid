package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c50 implements org.telegram.ui.zp0 {
    public final /* synthetic */ g50 a;

    public c50(g50 g50Var) {
        this.a = g50Var;
    }

    @Override // org.telegram.ui.zp0
    public final void a(ArrayList arrayList) {
        g50.a(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.zp0
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
