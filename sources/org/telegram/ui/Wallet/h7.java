package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                m7.b((m7) this.b, z10, f10);
                break;
            default:
                da daVar = (da) this.b;
                daVar.b0 = null;
                daVar.c0 = 1.0f;
                daVar.G0();
                break;
        }
    }
}
