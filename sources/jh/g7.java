package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ g7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final i7 i7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.h7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var2 = i7Var;
                        switch (i11) {
                            case 0:
                                long j10 = i7Var2.b;
                                int i12 = i7Var2.a;
                                ArrayList arrayList = i7Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i7Var2.j();
                                        i7Var2.d = true;
                                        i7Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k7Var.c = true;
                                            k7Var.d = i14;
                                            i7Var2.h.put(Integer.valueOf(i14), k7Var);
                                        }
                                    }
                                    i7Var2.d = true;
                                    i7Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var2);
                                    break;
                                }
                                break;
                            case 1:
                                i7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var2.e.set(f9, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var2.e.set(f10, tL_starGiftCollection3);
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
                final i7 i7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.h7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var22 = i7Var2;
                        switch (i112) {
                            case 0:
                                long j10 = i7Var22.b;
                                int i12 = i7Var22.a;
                                ArrayList arrayList = i7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i7Var22.j();
                                        i7Var22.d = true;
                                        i7Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k7Var.c = true;
                                            k7Var.d = i14;
                                            i7Var22.h.put(Integer.valueOf(i14), k7Var);
                                        }
                                    }
                                    i7Var22.d = true;
                                    i7Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var22.e.set(f9, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final i7 i7Var3 = this.b;
                i7Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.h7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var22 = i7Var3;
                        switch (i112) {
                            case 0:
                                long j10 = i7Var22.b;
                                int i122 = i7Var22.a;
                                ArrayList arrayList = i7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i7Var22.j();
                                        i7Var22.d = true;
                                        i7Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k7Var.c = true;
                                            k7Var.d = i14;
                                            i7Var22.h.put(Integer.valueOf(i14), k7Var);
                                        }
                                    }
                                    i7Var22.d = true;
                                    i7Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var22.e.set(f9, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var22.e.set(f10, tL_starGiftCollection3);
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
