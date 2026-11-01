package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class wb {
    public final /* synthetic */ ic A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public qw h;
    public jc i;
    public Object j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public vb s;
    public dc t;
    public xb u;
    public int a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public wb(ic icVar) {
        this.A = icVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i11));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i11));
        this.x.add(str);
        this.y.add(str2);
        this.z.add(Integer.valueOf(i10));
        this.A.k.put(imageReceiver.G(i10), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i10 = this.m;
        int i11 = 0;
        while (i11 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i11);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i11);
                this.w.remove(i11);
                this.x.remove(i11);
                this.y.remove(i11);
                i10 = ((Integer) this.z.remove(i11)).intValue();
                if (imageReceiver2 != null) {
                    this.A.k.remove(imageReceiver2.G(i10));
                }
                i11--;
            }
            i11++;
        }
        if (this.v.isEmpty()) {
            if (this.i != null && !this.A.w.containsKey(this.d)) {
                jc jcVar = this.i;
                if (jcVar.f != null) {
                    b8.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (jcVar.i != null) {
                    b8.G(this.o).f(this.i.i);
                } else if (jcVar.h != null) {
                    b8.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (jcVar.v != null) {
                    b8.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            xb xbVar = this.u;
            if (xbVar != null) {
                if (i10 == 1) {
                    this.A.q.a(xbVar);
                } else {
                    ((ze.a) this.A.p.b).remove(xbVar);
                    com.google.android.gms.internal.cast.c0 c0Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        c0Var.getClass();
                    } else {
                        ((ze.a) c0Var.b).remove(runnable);
                    }
                }
                xb xbVar2 = this.u;
                synchronized (xbVar2.b) {
                    try {
                        xbVar2.d = true;
                        Thread thread = xbVar2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            dc dcVar = this.t;
            if (dcVar != null) {
                this.A.n.remove(dcVar);
                this.t.cancel(true);
                this.t = null;
            }
            vb vbVar = this.s;
            if (vbVar != null) {
                this.A.o.remove(vbVar);
                this.s.cancel(true);
                this.s = null;
            }
            String str = this.e;
            if (str != null) {
                this.A.g.remove(str);
            }
            String str2 = this.e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.i.remove(str3);
                this.A.j.remove(ic.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        wb wbVar;
        ic icVar;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            wbVar = this;
            i0.g3(new dn(wbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            wbVar = this;
        }
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            icVar = wbVar.A;
            if (i10 >= size) {
                break;
            }
            icVar.k.remove(((ImageReceiver) arrayList2.get(i10)).G(wbVar.m));
            i10++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = wbVar.e;
        if (str2 != null) {
            icVar.g.remove(str2);
        }
        String str3 = wbVar.e;
        if (str3 != null) {
            icVar.h.remove(str3);
        }
        String str4 = wbVar.d;
        if (str4 != null) {
            icVar.i.remove(str4);
            icVar.j.remove(ic.n(wbVar.d));
        }
    }
}
