package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t40 implements org.telegram.ui.vp0 {
    public final /* synthetic */ x40 a;

    public t40(x40 x40Var) {
        this.a = x40Var;
    }

    @Override // org.telegram.ui.vp0
    public final void a(ArrayList arrayList) {
        x40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.vp0
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
