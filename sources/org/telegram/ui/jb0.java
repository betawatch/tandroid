package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jb0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                xb0 xb0Var = (xb0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new a3.i0(xb0Var, tLObject, this.b, 21));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new a3.i0((th.e5) this.c, this.b, tLObject, 28));
                break;
        }
    }
}
