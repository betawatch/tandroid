package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements h2.o, g9.k, yi0, db0, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ u(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                ((p4.g1) obj).i0(this.b);
                break;
            case 7:
                ((p4.g1) obj).N(this.b);
                break;
            case 8:
                ((p4.g1) obj).k(this.b);
                break;
            default:
                ((p4.g1) obj).G0(this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return hd.M0(2131748530, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i7);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i11) {
                    return hd.E0().y0().format(epochMilli);
                }
                return hd.E0().A0().format(epochMilli) + ", " + hd.E0().w0().format(epochMilli);
            default:
                return i7 == i11 ? "—" : String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((e2.a1) obj).e(this.b);
                break;
            default:
                ((e2.a1) obj).c(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        return this.b;
    }
}
