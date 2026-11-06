package bi;

import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ r9(t9 t9Var, int i7) {
        this.a = i7;
        this.b = t9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final t9 t9Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.s9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var2 = t9Var;
                        switch (i10) {
                            case 0:
                                long j3 = t9Var2.b;
                                int i11 = t9Var2.a;
                                ArrayList arrayList = t9Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        t9Var2.j();
                                        t9Var2.d = true;
                                        t9Var2.c = false;
                                        qs.f(i11).k(qs.H3, Long.valueOf(j3), t9Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v9Var.c = true;
                                            v9Var.d = i13;
                                            t9Var2.h.put(Integer.valueOf(i13), v9Var);
                                        }
                                    }
                                    t9Var2.d = true;
                                    t9Var2.c = false;
                                    qs.f(i11).k(qs.H3, Long.valueOf(j3), t9Var2);
                                    break;
                                }
                                break;
                            case 1:
                                t9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var2.e.set(f11, tL_starGiftCollection3);
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
                final t9 t9Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.s9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var22 = t9Var2;
                        switch (i102) {
                            case 0:
                                long j3 = t9Var22.b;
                                int i11 = t9Var22.a;
                                ArrayList arrayList = t9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        t9Var22.j();
                                        t9Var22.d = true;
                                        t9Var22.c = false;
                                        qs.f(i11).k(qs.H3, Long.valueOf(j3), t9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v9Var.c = true;
                                            v9Var.d = i13;
                                            t9Var22.h.put(Integer.valueOf(i13), v9Var);
                                        }
                                    }
                                    t9Var22.d = true;
                                    t9Var22.c = false;
                                    qs.f(i11).k(qs.H3, Long.valueOf(j3), t9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final t9 t9Var3 = this.b;
                t9Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.s9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var22 = t9Var3;
                        switch (i102) {
                            case 0:
                                long j3 = t9Var22.b;
                                int i112 = t9Var22.a;
                                ArrayList arrayList = t9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        t9Var22.j();
                                        t9Var22.d = true;
                                        t9Var22.c = false;
                                        qs.f(i112).k(qs.H3, Long.valueOf(j3), t9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i112, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v9Var.c = true;
                                            v9Var.d = i13;
                                            t9Var22.h.put(Integer.valueOf(i13), v9Var);
                                        }
                                    }
                                    t9Var22.d = true;
                                    t9Var22.c = false;
                                    qs.f(i112).k(qs.H3, Long.valueOf(j3), t9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var22.e.set(f11, tL_starGiftCollection3);
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
