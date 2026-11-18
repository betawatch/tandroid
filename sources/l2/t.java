package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.ob0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements h2.o, g9.k, lj0, ob0, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ t(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                ((p4.i1) obj).i0(this.b);
                break;
            case 7:
                ((p4.i1) obj).N(this.b);
                break;
            case 8:
                ((p4.i1) obj).k(this.b);
                break;
            default:
                ((p4.i1) obj).G0(this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return gd.M0(2131748339, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i7);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i11) {
                    return gd.E0().y0().format(epochMilli);
                }
                return gd.E0().A0().format(epochMilli) + ", " + gd.E0().w0().format(epochMilli);
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
                ((e2.a1) obj).d(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public int run() {
        return this.b;
    }
}
