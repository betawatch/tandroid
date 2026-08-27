package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ w6(b8 b8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8.m(this.b, this.c);
                break;
            default:
                b8.q(this.b, this.c);
                break;
        }
    }
}
