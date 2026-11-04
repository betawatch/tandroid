package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class nb {
    public final /* synthetic */ zb A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public wv h;
    public ac i;
    public Object j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public mb s;
    public ub t;
    public ob u;
    public int a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public nb(zb zbVar) {
        this.A = zbVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i3, int i10) {
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
        this.z.add(Integer.valueOf(i3));
        this.A.k.put(imageReceiver.G(i3), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i3 = this.m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.w.remove(i10);
                this.x.remove(i10);
                this.y.remove(i10);
                i3 = ((Integer) this.z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.k.remove(imageReceiver2.G(i3));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.i != null && !this.A.w.containsKey(this.d)) {
                ac acVar = this.i;
                if (acVar.f != null) {
                    w7.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (acVar.i != null) {
                    w7.G(this.o).f(this.i.i);
                } else if (acVar.h != null) {
                    w7.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (acVar.v != null) {
                    w7.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            ob obVar = this.u;
            if (obVar != null) {
                if (i3 == 1) {
                    this.A.q.a(obVar);
                } else {
                    ((lf.a) this.A.p.b).remove(obVar);
                    com.google.android.gms.internal.cast.c0 c0Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        c0Var.getClass();
                    } else {
                        ((lf.a) c0Var.b).remove(runnable);
                    }
                }
                ob obVar2 = this.u;
                synchronized (obVar2.b) {
                    try {
                        obVar2.d = true;
                        Thread thread = obVar2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            ub ubVar = this.t;
            if (ubVar != null) {
                this.A.n.remove(ubVar);
                this.t.cancel(true);
                this.t = null;
            }
            mb mbVar = this.s;
            if (mbVar != null) {
                this.A.o.remove(mbVar);
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
                this.A.j.remove(zb.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        nb nbVar;
        zb zbVar;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            nbVar = this;
            g0.h3(new cn(nbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            nbVar = this;
        }
        int i3 = 0;
        while (true) {
            int size = arrayList2.size();
            zbVar = nbVar.A;
            if (i3 >= size) {
                break;
            }
            zbVar.k.remove(((ImageReceiver) arrayList2.get(i3)).G(nbVar.m));
            i3++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = nbVar.e;
        if (str2 != null) {
            zbVar.g.remove(str2);
        }
        String str3 = nbVar.e;
        if (str3 != null) {
            zbVar.h.remove(str3);
        }
        String str4 = nbVar.d;
        if (str4 != null) {
            zbVar.i.remove(str4);
            zbVar.j.remove(zb.n(nbVar.d));
        }
    }
}
