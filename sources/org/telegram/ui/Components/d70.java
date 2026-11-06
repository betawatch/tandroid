package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d70(f70 f70Var, boolean z9, int i7) {
        this.a = i7;
        this.b = f70Var;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
