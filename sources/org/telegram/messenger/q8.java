package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;
    public final /* synthetic */ TL_ephemeral.TL_sendMessage c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ q8(w8 w8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.a = i10;
        this.b = w8Var;
        this.c = tL_sendMessage;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz sendMessagesHelper = this.b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (cz) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                qz sendMessagesHelper2 = this.b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (cz) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                break;
        }
    }
}
