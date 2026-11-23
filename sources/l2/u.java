package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements h2.o, g9.k, nj0, mb0, h2.j {
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
                ((p4.h1) obj).j0(this.b);
                break;
            case 7:
                ((p4.h1) obj).O(this.b);
                break;
            case 8:
                ((p4.h1) obj).k(this.b);
                break;
            default:
                ((p4.h1) obj).H0(this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return gd.N0(2131748338, null);
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
                ((e2.a1) obj).a(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nj0
    public int run() {
        return this.b;
    }
}
