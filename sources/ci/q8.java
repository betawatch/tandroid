package ci;

import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ q8(s8 s8Var, int i3) {
        this.a = i3;
        this.b = s8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final s8 s8Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var2 = s8Var;
                        switch (i10) {
                            case 0:
                                long j10 = s8Var2.b;
                                int i11 = s8Var2.a;
                                ArrayList arrayList = s8Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        s8Var2.j();
                                        s8Var2.d = true;
                                        s8Var2.c = false;
                                        hs.f(i11).k(hs.H3, Long.valueOf(j10), s8Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v8Var.c = true;
                                            v8Var.d = i13;
                                            s8Var2.h.put(Integer.valueOf(i13), v8Var);
                                        }
                                    }
                                    s8Var2.d = true;
                                    s8Var2.c = false;
                                    hs.f(i11).k(hs.H3, Long.valueOf(j10), s8Var2);
                                    break;
                                }
                                break;
                            case 1:
                                s8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var2.e.set(f11, tL_starGiftCollection3);
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
                final s8 s8Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var22 = s8Var2;
                        switch (i102) {
                            case 0:
                                long j10 = s8Var22.b;
                                int i11 = s8Var22.a;
                                ArrayList arrayList = s8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        s8Var22.j();
                                        s8Var22.d = true;
                                        s8Var22.c = false;
                                        hs.f(i11).k(hs.H3, Long.valueOf(j10), s8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v8Var.c = true;
                                            v8Var.d = i13;
                                            s8Var22.h.put(Integer.valueOf(i13), v8Var);
                                        }
                                    }
                                    s8Var22.d = true;
                                    s8Var22.c = false;
                                    hs.f(i11).k(hs.H3, Long.valueOf(j10), s8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final s8 s8Var3 = this.b;
                s8Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var22 = s8Var3;
                        switch (i102) {
                            case 0:
                                long j10 = s8Var22.b;
                                int i112 = s8Var22.a;
                                ArrayList arrayList = s8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        s8Var22.j();
                                        s8Var22.d = true;
                                        s8Var22.c = false;
                                        hs.f(i112).k(hs.H3, Long.valueOf(j10), s8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i112, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v8Var.c = true;
                                            v8Var.d = i13;
                                            s8Var22.h.put(Integer.valueOf(i13), v8Var);
                                        }
                                    }
                                    s8Var22.d = true;
                                    s8Var22.c = false;
                                    hs.f(i112).k(hs.H3, Long.valueOf(j10), s8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var22.e.set(f11, tL_starGiftCollection3);
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
