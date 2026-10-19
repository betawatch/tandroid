package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;
    public final /* synthetic */ r11 c;

    public /* synthetic */ q11(s11 s11Var, r11 r11Var, int i10) {
        this.a = i10;
        this.b = s11Var;
        this.c = r11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
