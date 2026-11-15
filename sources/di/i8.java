package di;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ i8(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final k8 k8Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.j8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var2 = k8Var;
                        switch (i10) {
                            case 0:
                                long j3 = k8Var2.b;
                                int i11 = k8Var2.a;
                                ArrayList arrayList = k8Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k8Var2.j();
                                        k8Var2.d = true;
                                        k8Var2.c = false;
                                        ns.f(i11).k(ns.H3, Long.valueOf(j3), k8Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            m8Var.c = true;
                                            m8Var.d = i13;
                                            k8Var2.h.put(Integer.valueOf(i13), m8Var);
                                        }
                                    }
                                    k8Var2.d = true;
                                    k8Var2.c = false;
                                    ns.f(i11).k(ns.H3, Long.valueOf(j3), k8Var2);
                                    break;
                                }
                                break;
                            case 1:
                                k8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var2.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final k8 k8Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.j8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var22 = k8Var2;
                        switch (i102) {
                            case 0:
                                long j3 = k8Var22.b;
                                int i11 = k8Var22.a;
                                ArrayList arrayList = k8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k8Var22.j();
                                        k8Var22.d = true;
                                        k8Var22.c = false;
                                        ns.f(i11).k(ns.H3, Long.valueOf(j3), k8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            m8Var.c = true;
                                            m8Var.d = i13;
                                            k8Var22.h.put(Integer.valueOf(i13), m8Var);
                                        }
                                    }
                                    k8Var22.d = true;
                                    k8Var22.c = false;
                                    ns.f(i11).k(ns.H3, Long.valueOf(j3), k8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final k8 k8Var3 = this.b;
                k8Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.j8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var22 = k8Var3;
                        switch (i102) {
                            case 0:
                                long j3 = k8Var22.b;
                                int i112 = k8Var22.a;
                                ArrayList arrayList = k8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k8Var22.j();
                                        k8Var22.d = true;
                                        k8Var22.c = false;
                                        ns.f(i112).k(ns.H3, Long.valueOf(j3), k8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i112, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            m8Var.c = true;
                                            m8Var.d = i13;
                                            k8Var22.h.put(Integer.valueOf(i13), m8Var);
                                        }
                                    }
                                    k8Var22.d = true;
                                    k8Var22.c = false;
                                    ns.f(i112).k(ns.H3, Long.valueOf(j3), k8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
