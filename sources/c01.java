// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class c01 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w01 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c01(w01 w01Var, int i, byte b) {
        this.a = b;
        this.b = w01Var;
        this.c = i;
    }

    public final void a(final long j) {
        switch (this.a) {
            case 0:
                final w01 w01Var = this.b;
                l01 l01Var = w01Var.a;
                final byte b = 1;
                final int i = this.c;
                l01Var.j(new Runnable() { // from class: e01
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        long j2 = j;
                        int i2 = i;
                        w01 w01Var2 = w01Var;
                        byte b3 = 0;
                        switch (b2) {
                            case 0:
                                ArrayList arrayList = w01Var2.P;
                                l01 l01Var2 = w01Var2.a;
                                if (i2 == w01Var2.b && w01Var2.c == 1) {
                                    if (j2 > 0) {
                                        w01Var2.j = j2;
                                        w01Var2.k = l01Var2.h();
                                        long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(w01Var2.i * 1000, 1000L) + 3000)), j2 - 1000);
                                        if (min > 0) {
                                            w01Var2.c = (byte) 2;
                                            long j3 = w01Var2.f;
                                            if (j3 < 0) {
                                                StringBuilder o = wi8.o(j2, "edge ", ", starting at ");
                                                o.append(min);
                                                l01Var2.d(o.toString());
                                                w01Var2.g = min;
                                                w01Var2.e = w01.m(min);
                                            } else if (!w01Var2.F && j2 < j3 - 30000) {
                                                StringBuilder o2 = wi8.o(j2, "edge ", " behind the buffer at ");
                                                o2.append(w01Var2.f);
                                                o2.append(": a new timeline, starting at ");
                                                o2.append(min);
                                                l01Var2.d(o2.toString());
                                                w01Var2.e(true);
                                                int size = arrayList.size();
                                                int i3 = 0;
                                                while (i3 < size) {
                                                    Object obj = arrayList.get(i3);
                                                    i3++;
                                                    w01Var2.f((r01) obj);
                                                }
                                                arrayList.clear();
                                                w01Var2.h = false;
                                                w01Var2.g = min;
                                                w01Var2.e = w01.m(min);
                                            } else if (min <= j3) {
                                                w01Var2.e = Math.max(w01Var2.e, w01Var2.b());
                                                StringBuilder o3 = wi8.o(j2, "edge ", ", anchor ");
                                                o3.append(min);
                                                o3.append(" inside the buffer, continuing at ");
                                                o3.append(w01Var2.e);
                                                l01Var2.d(o3.toString());
                                            } else {
                                                StringBuilder o4 = wi8.o(j2, "edge ", ", jumping to ");
                                                o4.append(min);
                                                l01Var2.d(o4.toString());
                                                w01Var2.e(true);
                                                int size2 = arrayList.size();
                                                int i4 = 0;
                                                while (i4 < size2) {
                                                    Object obj2 = arrayList.get(i4);
                                                    i4++;
                                                    w01Var2.f((r01) obj2);
                                                }
                                                arrayList.clear();
                                                w01Var2.h = false;
                                                w01Var2.g = min;
                                                w01Var2.e = w01.m(min);
                                            }
                                            w01Var2.w();
                                            break;
                                        } else {
                                            w01.d(w01Var2.m);
                                            w01Var2.m = l01Var2.j(new f01(w01Var2, b3), 1000L);
                                            break;
                                        }
                                    } else {
                                        w01.d(w01Var2.m);
                                        w01Var2.m = l01Var2.j(new f01(w01Var2, b3), 1000L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (i2 == w01Var2.b) {
                                    w01Var2.s = false;
                                    if (w01Var2.c == 2 && j2 > 0) {
                                        w01Var2.j = j2;
                                        w01Var2.k = w01Var2.a.h();
                                        w01Var2.E();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, 0L);
                break;
            default:
                final w01 w01Var2 = this.b;
                l01 l01Var2 = w01Var2.a;
                final byte b2 = 0;
                final int i2 = this.c;
                l01Var2.j(new Runnable() { // from class: e01
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        long j2 = j;
                        int i22 = i2;
                        w01 w01Var22 = w01Var2;
                        byte b3 = 0;
                        switch (b22) {
                            case 0:
                                ArrayList arrayList = w01Var22.P;
                                l01 l01Var22 = w01Var22.a;
                                if (i22 == w01Var22.b && w01Var22.c == 1) {
                                    if (j2 > 0) {
                                        w01Var22.j = j2;
                                        w01Var22.k = l01Var22.h();
                                        long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(w01Var22.i * 1000, 1000L) + 3000)), j2 - 1000);
                                        if (min > 0) {
                                            w01Var22.c = (byte) 2;
                                            long j3 = w01Var22.f;
                                            if (j3 < 0) {
                                                StringBuilder o = wi8.o(j2, "edge ", ", starting at ");
                                                o.append(min);
                                                l01Var22.d(o.toString());
                                                w01Var22.g = min;
                                                w01Var22.e = w01.m(min);
                                            } else if (!w01Var22.F && j2 < j3 - 30000) {
                                                StringBuilder o2 = wi8.o(j2, "edge ", " behind the buffer at ");
                                                o2.append(w01Var22.f);
                                                o2.append(": a new timeline, starting at ");
                                                o2.append(min);
                                                l01Var22.d(o2.toString());
                                                w01Var22.e(true);
                                                int size = arrayList.size();
                                                int i3 = 0;
                                                while (i3 < size) {
                                                    Object obj = arrayList.get(i3);
                                                    i3++;
                                                    w01Var22.f((r01) obj);
                                                }
                                                arrayList.clear();
                                                w01Var22.h = false;
                                                w01Var22.g = min;
                                                w01Var22.e = w01.m(min);
                                            } else if (min <= j3) {
                                                w01Var22.e = Math.max(w01Var22.e, w01Var22.b());
                                                StringBuilder o3 = wi8.o(j2, "edge ", ", anchor ");
                                                o3.append(min);
                                                o3.append(" inside the buffer, continuing at ");
                                                o3.append(w01Var22.e);
                                                l01Var22.d(o3.toString());
                                            } else {
                                                StringBuilder o4 = wi8.o(j2, "edge ", ", jumping to ");
                                                o4.append(min);
                                                l01Var22.d(o4.toString());
                                                w01Var22.e(true);
                                                int size2 = arrayList.size();
                                                int i4 = 0;
                                                while (i4 < size2) {
                                                    Object obj2 = arrayList.get(i4);
                                                    i4++;
                                                    w01Var22.f((r01) obj2);
                                                }
                                                arrayList.clear();
                                                w01Var22.h = false;
                                                w01Var22.g = min;
                                                w01Var22.e = w01.m(min);
                                            }
                                            w01Var22.w();
                                            break;
                                        } else {
                                            w01.d(w01Var22.m);
                                            w01Var22.m = l01Var22.j(new f01(w01Var22, b3), 1000L);
                                            break;
                                        }
                                    } else {
                                        w01.d(w01Var22.m);
                                        w01Var22.m = l01Var22.j(new f01(w01Var22, b3), 1000L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (i22 == w01Var22.b) {
                                    w01Var22.s = false;
                                    if (w01Var22.c == 2 && j2 > 0) {
                                        w01Var22.j = j2;
                                        w01Var22.k = w01Var22.a.h();
                                        w01Var22.E();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, 0L);
                break;
        }
    }
}
