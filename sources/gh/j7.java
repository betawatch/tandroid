package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ j7(l7 l7Var, int i9) {
        this.a = i9;
        this.b = l7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final l7 l7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.k7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i9;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var2 = l7Var;
                        switch (i10) {
                            case 0:
                                long j10 = l7Var2.b;
                                int i11 = l7Var2.a;
                                ArrayList arrayList = l7Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l7Var2.j();
                                        l7Var2.d = true;
                                        l7Var2.c = false;
                                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n7Var.c = true;
                                            n7Var.d = i13;
                                            l7Var2.h.put(Integer.valueOf(i13), n7Var);
                                        }
                                    }
                                    l7Var2.d = true;
                                    l7Var2.c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var2);
                                    break;
                                }
                                break;
                            case 1:
                                l7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var2.e.set(f11, tL_starGiftCollection3);
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
                final l7 l7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.k7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var22 = l7Var2;
                        switch (i102) {
                            case 0:
                                long j10 = l7Var22.b;
                                int i11 = l7Var22.a;
                                ArrayList arrayList = l7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l7Var22.j();
                                        l7Var22.d = true;
                                        l7Var22.c = false;
                                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n7Var.c = true;
                                            n7Var.d = i13;
                                            l7Var22.h.put(Integer.valueOf(i13), n7Var);
                                        }
                                    }
                                    l7Var22.d = true;
                                    l7Var22.c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final l7 l7Var3 = this.b;
                l7Var3.getClass();
                final int i11 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.k7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var22 = l7Var3;
                        switch (i102) {
                            case 0:
                                long j10 = l7Var22.b;
                                int i112 = l7Var22.a;
                                ArrayList arrayList = l7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l7Var22.j();
                                        l7Var22.d = true;
                                        l7Var22.c = false;
                                        NotificationCenter.getInstance(i112).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i112, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n7Var.c = true;
                                            n7Var.d = i13;
                                            l7Var22.h.put(Integer.valueOf(i13), n7Var);
                                        }
                                    }
                                    l7Var22.d = true;
                                    l7Var22.c = false;
                                    NotificationCenter.getInstance(i112).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var22.e.set(f11, tL_starGiftCollection3);
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
