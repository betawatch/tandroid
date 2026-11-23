package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class sb {
    public final /* synthetic */ ec A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public yv h;
    public fc i;
    public Object j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public rb s;
    public zb t;
    public tb u;
    public int a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public sb(ec ecVar) {
        this.A = ecVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.x.add(str);
        this.y.add(str2);
        this.z.add(Integer.valueOf(i7));
        this.A.k.put(imageReceiver.H(i7), this);
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
                    this.A.k.remove(imageReceiver2.H(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.i != null && !this.A.w.containsKey(this.d)) {
                fc fcVar = this.i;
                if (fcVar.f != null) {
                    w7.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (fcVar.i != null) {
                    w7.G(this.o).f(this.i.i);
                } else if (fcVar.h != null) {
                    w7.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (fcVar.v != null) {
                    w7.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            tb tbVar = this.u;
            if (tbVar != null) {
                if (i7 == 1) {
                    this.A.q.a(tbVar);
                } else {
                    ((of.a) this.A.p.b).remove(tbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.b).remove(runnable);
                    }
                }
                tb tbVar2 = this.u;
                synchronized (tbVar2.b) {
                    try {
                        tbVar2.d = true;
                        Thread thread = tbVar2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            zb zbVar = this.t;
            if (zbVar != null) {
                this.A.n.remove(zbVar);
                this.t.cancel(true);
                this.t = null;
            }
            rb rbVar = this.s;
            if (rbVar != null) {
                this.A.o.remove(rbVar);
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
                this.A.j.remove(ec.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        sb sbVar;
        ec ecVar;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            sbVar = this;
            g0.g3(new fn(sbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            sbVar = this;
        }
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            ecVar = sbVar.A;
            if (i7 >= size) {
                break;
            }
            ecVar.k.remove(((ImageReceiver) arrayList2.get(i7)).H(sbVar.m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = sbVar.e;
        if (str2 != null) {
            ecVar.g.remove(str2);
        }
        String str3 = sbVar.e;
        if (str3 != null) {
            ecVar.h.remove(str3);
        }
        String str4 = sbVar.d;
        if (str4 != null) {
            ecVar.i.remove(str4);
            ecVar.j.remove(ec.n(sbVar.d));
        }
    }
}
