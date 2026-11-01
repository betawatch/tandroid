package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zo implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.g4 a;
    public final /* synthetic */ dp b;

    public zo(dp dpVar, org.telegram.messenger.g4 g4Var) {
        this.b = dpVar;
        this.a = g4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ArrayList e = this.a.e(7);
        dp dpVar = this.b;
        org.telegram.messenger.at.f(dpVar.a).d(new cd(22, this, e));
        dpVar.R1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
