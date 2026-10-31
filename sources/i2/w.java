package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.wb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.o, d9.k, e2.j, dk0, wb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ w(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((m4.n1) obj).f0(this.b);
                break;
            case 4:
                ((m4.n1) obj).M(this.b);
                break;
            case 5:
                ((m4.n1) obj).k(this.b);
                break;
            default:
                ((m4.n1) obj).G0(this.b);
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 8:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i12) {
                    return cd.D0().x0().format(epochMilli);
                }
                return cd.D0().z0().format(epochMilli) + ", " + cd.D0().v0().format(epochMilli);
            default:
                return i10 == i12 ? "—" : String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).c(this.b);
                break;
            default:
                ((b2.d1) obj).a(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public int run() {
        return this.b;
    }
}
