package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;
    public final /* synthetic */ TL_ephemeral.TL_sendMessage c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ l8(r8 r8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i7) {
        this.a = i7;
        this.b = r8Var;
        this.c = tL_sendMessage;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz sendMessagesHelper = this.b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (sy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                gz sendMessagesHelper2 = this.b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (sy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                break;
        }
    }
}
