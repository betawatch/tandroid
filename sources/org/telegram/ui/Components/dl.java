package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;
    public final /* synthetic */ org.telegram.messenger.xa c;

    public /* synthetic */ dl(ml mlVar, org.telegram.messenger.xa xaVar, int i7) {
        this.a = i7;
        this.b = mlVar;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.xa xaVar = this.c;
                try {
                    ((a8.r7) xaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new dl(this.b, xaVar, 1));
                break;
            default:
                ml.S(this.b, this.c);
                break;
        }
    }
}
