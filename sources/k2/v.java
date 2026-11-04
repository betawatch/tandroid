package k2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ya0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements g2.p, f9.k, g2.k, cj0, ya0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ v(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((o4.l1) obj).e0(this.b);
                break;
            case 4:
                ((o4.l1) obj).L(this.b);
                break;
            case 5:
                ((o4.l1) obj).k(this.b);
                break;
            default:
                ((o4.l1) obj).H0(this.b);
                break;
        }
    }

    @Override // f9.k
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 8:
                if (i3 == 0) {
                    return bd.M0(2131748539, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i3);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i11) {
                    return bd.E0().y0().format(epochMilli);
                }
                return bd.E0().A0().format(epochMilli) + ", " + bd.E0().w0().format(epochMilli);
            default:
                return i3 == i11 ? "—" : String.format("%02d", Integer.valueOf(i3));
        }
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d2.c1) obj).c(this.b);
                break;
            default:
                ((d2.c1) obj).a(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public int run() {
        return this.b;
    }
}
