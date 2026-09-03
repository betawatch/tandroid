package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u40 implements org.telegram.ui.vp0 {
    public final /* synthetic */ y40 a;

    public u40(y40 y40Var) {
        this.a = y40Var;
    }

    @Override // org.telegram.ui.vp0
    public final void a(ArrayList arrayList) {
        y40.b(this.a, false, arrayList);
    }

    @Override // org.telegram.ui.vp0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.a.a.startActivityForResult(intent, 14);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
