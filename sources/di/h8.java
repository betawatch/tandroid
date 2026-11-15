package di;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ h8(j8 j8Var, int i7) {
        this.a = i7;
        this.b = j8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final j8 j8Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.i8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var2 = j8Var;
                        switch (i10) {
                            case 0:
                                long j3 = j8Var2.b;
                                int i11 = j8Var2.a;
                                ArrayList arrayList = j8Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j8Var2.j();
                                        j8Var2.d = true;
                                        j8Var2.c = false;
                                        ns.f(i11).k(ns.H3, Long.valueOf(j3), j8Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l8Var.c = true;
                                            l8Var.d = i13;
                                            j8Var2.h.put(Integer.valueOf(i13), l8Var);
                                        }
                                    }
                                    j8Var2.d = true;
                                    j8Var2.c = false;
                                    ns.f(i11).k(ns.H3, Long.valueOf(j3), j8Var2);
                                    break;
                                }
                                break;
                            case 1:
                                j8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var2.e.set(f11, tL_starGiftCollection3);
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
                final j8 j8Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.i8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var22 = j8Var2;
                        switch (i102) {
                            case 0:
                                long j3 = j8Var22.b;
                                int i11 = j8Var22.a;
                                ArrayList arrayList = j8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j8Var22.j();
                                        j8Var22.d = true;
                                        j8Var22.c = false;
                                        ns.f(i11).k(ns.H3, Long.valueOf(j3), j8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l8Var.c = true;
                                            l8Var.d = i13;
                                            j8Var22.h.put(Integer.valueOf(i13), l8Var);
                                        }
                                    }
                                    j8Var22.d = true;
                                    j8Var22.c = false;
                                    ns.f(i11).k(ns.H3, Long.valueOf(j3), j8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final j8 j8Var3 = this.b;
                j8Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.i8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var22 = j8Var3;
                        switch (i102) {
                            case 0:
                                long j3 = j8Var22.b;
                                int i112 = j8Var22.a;
                                ArrayList arrayList = j8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j8Var22.j();
                                        j8Var22.d = true;
                                        j8Var22.c = false;
                                        ns.f(i112).k(ns.H3, Long.valueOf(j3), j8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i112, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l8Var.c = true;
                                            l8Var.d = i13;
                                            j8Var22.h.put(Integer.valueOf(i13), l8Var);
                                        }
                                    }
                                    j8Var22.d = true;
                                    j8Var22.c = false;
                                    ns.f(i112).k(ns.H3, Long.valueOf(j3), j8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var22.e.set(f11, tL_starGiftCollection3);
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
