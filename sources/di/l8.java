package di;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ l8(n8 n8Var, int i7) {
        this.a = i7;
        this.b = n8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final n8 n8Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.m8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var2 = n8Var;
                        switch (i10) {
                            case 0:
                                long j3 = n8Var2.b;
                                int i11 = n8Var2.a;
                                ArrayList arrayList = n8Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        n8Var2.j();
                                        n8Var2.d = true;
                                        n8Var2.c = false;
                                        ks.f(i11).k(ks.J3, Long.valueOf(j3), n8Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            p8Var.c = true;
                                            p8Var.d = i13;
                                            n8Var2.h.put(Integer.valueOf(i13), p8Var);
                                        }
                                    }
                                    n8Var2.d = true;
                                    n8Var2.c = false;
                                    ks.f(i11).k(ks.J3, Long.valueOf(j3), n8Var2);
                                    break;
                                }
                                break;
                            case 1:
                                n8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                n8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var2.e.set(f11, tL_starGiftCollection3);
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
                final n8 n8Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.m8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var22 = n8Var2;
                        switch (i102) {
                            case 0:
                                long j3 = n8Var22.b;
                                int i11 = n8Var22.a;
                                ArrayList arrayList = n8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        n8Var22.j();
                                        n8Var22.d = true;
                                        n8Var22.c = false;
                                        ks.f(i11).k(ks.J3, Long.valueOf(j3), n8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            p8Var.c = true;
                                            p8Var.d = i13;
                                            n8Var22.h.put(Integer.valueOf(i13), p8Var);
                                        }
                                    }
                                    n8Var22.d = true;
                                    n8Var22.c = false;
                                    ks.f(i11).k(ks.J3, Long.valueOf(j3), n8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final n8 n8Var3 = this.b;
                n8Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.m8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var22 = n8Var3;
                        switch (i102) {
                            case 0:
                                long j3 = n8Var22.b;
                                int i112 = n8Var22.a;
                                ArrayList arrayList = n8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        n8Var22.j();
                                        n8Var22.d = true;
                                        n8Var22.c = false;
                                        ks.f(i112).k(ks.J3, Long.valueOf(j3), n8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i112, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            p8Var.c = true;
                                            p8Var.d = i13;
                                            n8Var22.h.put(Integer.valueOf(i13), p8Var);
                                        }
                                    }
                                    n8Var22.d = true;
                                    n8Var22.c = false;
                                    ks.f(i112).k(ks.J3, Long.valueOf(j3), n8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var22.e.set(f11, tL_starGiftCollection3);
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
