package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.m(this.b, this.c);
                break;
            default:
                m8.F(this.b, this.c);
                break;
        }
    }
}
