package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ i7(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final k7 k7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.j7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var2 = k7Var;
                        switch (i11) {
                            case 0:
                                long j10 = k7Var2.b;
                                int i12 = k7Var2.a;
                                ArrayList arrayList = k7Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k7Var2.j();
                                        k7Var2.d = true;
                                        k7Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            m7Var.c = true;
                                            m7Var.d = i14;
                                            k7Var2.h.put(Integer.valueOf(i14), m7Var);
                                        }
                                    }
                                    k7Var2.d = true;
                                    k7Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var2);
                                    break;
                                }
                                break;
                            case 1:
                                k7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k7Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k7Var2.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final k7 k7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.j7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var22 = k7Var2;
                        switch (i112) {
                            case 0:
                                long j10 = k7Var22.b;
                                int i12 = k7Var22.a;
                                ArrayList arrayList = k7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k7Var22.j();
                                        k7Var22.d = true;
                                        k7Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            m7Var.c = true;
                                            m7Var.d = i14;
                                            k7Var22.h.put(Integer.valueOf(i14), m7Var);
                                        }
                                    }
                                    k7Var22.d = true;
                                    k7Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k7Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final k7 k7Var3 = this.b;
                k7Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.j7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var22 = k7Var3;
                        switch (i112) {
                            case 0:
                                long j10 = k7Var22.b;
                                int i122 = k7Var22.a;
                                ArrayList arrayList = k7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k7Var22.j();
                                        k7Var22.d = true;
                                        k7Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            m7Var.c = true;
                                            m7Var.d = i14;
                                            k7Var22.h.put(Integer.valueOf(i14), m7Var);
                                        }
                                    }
                                    k7Var22.d = true;
                                    k7Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k7Var22.e.set(f11, tL_starGiftCollection3);
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
