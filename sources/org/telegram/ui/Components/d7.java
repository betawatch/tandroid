package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.m(this.b, this.c);
                break;
            default:
                k8.E(this.b, this.c);
                break;
        }
    }
}
