package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = mk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mk0 mk0Var = this.b;
                NotificationCenter.getInstance(mk0Var.b).doOnIdle(new dk0(mk0Var, this.c, 1));
                break;
            default:
                mk0.a(this.b, this.c);
                break;
        }
    }
}
