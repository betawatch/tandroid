package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d2(k7 k7Var, long j10, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o2(this.c);
                break;
            case 1:
                this.b.o2(this.c);
                break;
            case 2:
                k7 k7Var = this.b;
                b2 b2Var = k7Var.u1;
                k7Var.O2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b2Var);
                    AndroidUtilities.runOnUIThread(b2Var);
                    break;
                }
                break;
            case 3:
                this.b.o2(this.c);
                break;
            case 4:
                this.b.o2(this.c);
                break;
            case 5:
                k7.r0(this.b, this.c);
                break;
            case 6:
                k7.p0(this.b, this.c);
                break;
            case 7:
                this.b.o2(this.c);
                break;
            case 8:
                k7.U(this.b, this.c);
                break;
            case 9:
                this.b.o2(this.c);
                break;
            case 10:
                k7.p1(this.b, this.c);
                break;
            case 11:
                this.b.o2(this.c);
                break;
            default:
                k7.F0(this.b, this.c);
                break;
        }
    }
}
