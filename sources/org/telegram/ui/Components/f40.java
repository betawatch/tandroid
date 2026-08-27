package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f40 implements org.telegram.ui.ip0 {
    public final /* synthetic */ j40 a;

    public f40(j40 j40Var) {
        this.a = j40Var;
    }

    @Override // org.telegram.ui.ip0
    public final void a(ArrayList arrayList) {
        j40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.ip0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
