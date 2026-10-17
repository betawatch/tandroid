package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ t9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final v9 v9Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.u9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var2 = v9Var;
                        switch (i11) {
                            case 0:
                                long j10 = v9Var2.b;
                                int i12 = v9Var2.a;
                                ArrayList arrayList = v9Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        v9Var2.j();
                                        v9Var2.d = true;
                                        v9Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            x9 x9Var = new x9(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            x9Var.c = true;
                                            x9Var.d = i14;
                                            v9Var2.h.put(Integer.valueOf(i14), x9Var);
                                        }
                                    }
                                    v9Var2.d = true;
                                    v9Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var2);
                                    break;
                                }
                                break;
                            case 1:
                                v9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                v9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var2.e.set(f10, tL_starGiftCollection3);
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
                final v9 v9Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.u9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var22 = v9Var2;
                        switch (i112) {
                            case 0:
                                long j10 = v9Var22.b;
                                int i12 = v9Var22.a;
                                ArrayList arrayList = v9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        v9Var22.j();
                                        v9Var22.d = true;
                                        v9Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            x9 x9Var = new x9(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            x9Var.c = true;
                                            x9Var.d = i14;
                                            v9Var22.h.put(Integer.valueOf(i14), x9Var);
                                        }
                                    }
                                    v9Var22.d = true;
                                    v9Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final v9 v9Var3 = this.b;
                v9Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.u9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var22 = v9Var3;
                        switch (i112) {
                            case 0:
                                long j10 = v9Var22.b;
                                int i122 = v9Var22.a;
                                ArrayList arrayList = v9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        v9Var22.j();
                                        v9Var22.d = true;
                                        v9Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            x9 x9Var = new x9(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            x9Var.c = true;
                                            x9Var.d = i14;
                                            v9Var22.h.put(Integer.valueOf(i14), x9Var);
                                        }
                                    }
                                    v9Var22.d = true;
                                    v9Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var22.e.set(f10, tL_starGiftCollection3);
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
