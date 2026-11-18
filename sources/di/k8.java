package di;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ k8(m8 m8Var, int i7) {
        this.a = i7;
        this.b = m8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final m8 m8Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.l8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var2 = m8Var;
                        switch (i10) {
                            case 0:
                                long j3 = m8Var2.b;
                                int i11 = m8Var2.a;
                                ArrayList arrayList = m8Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        m8Var2.j();
                                        m8Var2.d = true;
                                        m8Var2.c = false;
                                        ks.f(i11).k(ks.J3, Long.valueOf(j3), m8Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            o8Var.c = true;
                                            o8Var.d = i13;
                                            m8Var2.h.put(Integer.valueOf(i13), o8Var);
                                        }
                                    }
                                    m8Var2.d = true;
                                    m8Var2.c = false;
                                    ks.f(i11).k(ks.J3, Long.valueOf(j3), m8Var2);
                                    break;
                                }
                                break;
                            case 1:
                                m8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                m8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var2.e.set(f11, tL_starGiftCollection3);
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
                final m8 m8Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.l8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var22 = m8Var2;
                        switch (i102) {
                            case 0:
                                long j3 = m8Var22.b;
                                int i11 = m8Var22.a;
                                ArrayList arrayList = m8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        m8Var22.j();
                                        m8Var22.d = true;
                                        m8Var22.c = false;
                                        ks.f(i11).k(ks.J3, Long.valueOf(j3), m8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            o8Var.c = true;
                                            o8Var.d = i13;
                                            m8Var22.h.put(Integer.valueOf(i13), o8Var);
                                        }
                                    }
                                    m8Var22.d = true;
                                    m8Var22.c = false;
                                    ks.f(i11).k(ks.J3, Long.valueOf(j3), m8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final m8 m8Var3 = this.b;
                m8Var3.getClass();
                final int i11 = 2;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.l8
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var22 = m8Var3;
                        switch (i102) {
                            case 0:
                                long j3 = m8Var22.b;
                                int i112 = m8Var22.a;
                                ArrayList arrayList = m8Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        m8Var22.j();
                                        m8Var22.d = true;
                                        m8Var22.c = false;
                                        ks.f(i112).k(ks.J3, Long.valueOf(j3), m8Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i112, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            o8Var.c = true;
                                            o8Var.d = i13;
                                            m8Var22.h.put(Integer.valueOf(i13), o8Var);
                                        }
                                    }
                                    m8Var22.d = true;
                                    m8Var22.c = false;
                                    ks.f(i112).k(ks.J3, Long.valueOf(j3), m8Var22);
                                    break;
                                }
                                break;
                            case 1:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var22.e.set(f11, tL_starGiftCollection3);
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
