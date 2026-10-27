package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileRefController b;
    public final /* synthetic */ TL_ephemeral.TL_sendMessage c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ t3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.a = i10;
        this.b = fileRefController;
        this.c = tL_sendMessage;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onUpdateObjectReference$32(this.c, this.d);
                break;
            default:
                this.b.lambda$sendErrorToObject$43(this.c, this.d);
                break;
        }
    }
}
