package oa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class s0 extends la.u {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        if (r1.equals("month") == false) goto L11;
     */
    @Override // la.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        aVar.b();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            char c10 = 4;
            if (aVar.x() == 4) {
                aVar.f();
                return new GregorianCalendar(i9, i10, i11, i12, i13, i14);
            }
            String r10 = aVar.r();
            int p6 = aVar.p();
            r10.getClass();
            switch (r10.hashCode()) {
                case -1181204563:
                    if (r10.equals("dayOfMonth")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1074026988:
                    if (r10.equals("minute")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -906279820:
                    if (r10.equals("second")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3704893:
                    if (r10.equals("year")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 104080000:
                    break;
                case 985252545:
                    if (r10.equals("hourOfDay")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = p6;
                    break;
                case 1:
                    i13 = p6;
                    break;
                case 2:
                    i14 = p6;
                    break;
                case 3:
                    i9 = p6;
                    break;
                case 4:
                    i10 = p6;
                    break;
                case 5:
                    i12 = p6;
                    break;
            }
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (((Calendar) obj) == null) {
            cVar.i();
            return;
        }
        cVar.c();
        cVar.g("year");
        cVar.o(r4.get(1));
        cVar.g("month");
        cVar.o(r4.get(2));
        cVar.g("dayOfMonth");
        cVar.o(r4.get(5));
        cVar.g("hourOfDay");
        cVar.o(r4.get(11));
        cVar.g("minute");
        cVar.o(r4.get(12));
        cVar.g("second");
        cVar.o(r4.get(13));
        cVar.f();
    }
}
