package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class ub {
    public final /* synthetic */ gc A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ew h;
    public hc i;
    public Object j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public tb s;
    public bc t;
    public vb u;
    public int a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public ub(gc gcVar) {
        this.A = gcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.x.add(str);
        this.y.add(str2);
        this.z.add(Integer.valueOf(i7));
        this.A.k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.w.remove(i10);
                this.x.remove(i10);
                this.y.remove(i10);
                i7 = ((Integer) this.z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.i != null && !this.A.w.containsKey(this.d)) {
                hc hcVar = this.i;
                if (hcVar.f != null) {
                    w7.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (hcVar.i != null) {
                    w7.G(this.o).f(this.i.i);
                } else if (hcVar.h != null) {
                    w7.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (hcVar.v != null) {
                    w7.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            vb vbVar = this.u;
            if (vbVar != null) {
                if (i7 == 1) {
                    this.A.q.a(vbVar);
                } else {
                    ((of.a) this.A.p.b).remove(vbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.b).remove(runnable);
                    }
                }
                vb vbVar2 = this.u;
                synchronized (vbVar2.b) {
                    try {
                        vbVar2.d = true;
                        Thread thread = vbVar2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            bc bcVar = this.t;
            if (bcVar != null) {
                this.A.n.remove(bcVar);
                this.t.cancel(true);
                this.t = null;
            }
            tb tbVar = this.s;
            if (tbVar != null) {
                this.A.o.remove(tbVar);
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
                this.A.j.remove(gc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        ub ubVar;
        gc gcVar;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            ubVar = this;
            g0.h3(new mn(ubVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            ubVar = this;
        }
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            gcVar = ubVar.A;
            if (i7 >= size) {
                break;
            }
            gcVar.k.remove(((ImageReceiver) arrayList2.get(i7)).G(ubVar.m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = ubVar.e;
        if (str2 != null) {
            gcVar.g.remove(str2);
        }
        String str3 = ubVar.e;
        if (str3 != null) {
            gcVar.h.remove(str3);
        }
        String str4 = ubVar.d;
        if (str4 != null) {
            gcVar.i.remove(str4);
            gcVar.j.remove(gc.n(ubVar.d));
        }
    }
}
