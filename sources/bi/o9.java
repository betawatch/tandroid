package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ o9(q9 q9Var, int i10) {
        this.a = i10;
        this.b = q9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final q9 q9Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.p9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var2 = q9Var;
                        switch (i11) {
                            case 0:
                                long j10 = q9Var2.b;
                                int i12 = q9Var2.a;
                                ArrayList arrayList = q9Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        q9Var2.j();
                                        q9Var2.d = true;
                                        q9Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            t9Var.c = true;
                                            t9Var.d = i14;
                                            q9Var2.h.put(Integer.valueOf(i14), t9Var);
                                        }
                                    }
                                    q9Var2.d = true;
                                    q9Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var2);
                                    break;
                                }
                                break;
                            case 1:
                                q9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var2.e.set(f10, tL_starGiftCollection3);
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
                final q9 q9Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.p9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var22 = q9Var2;
                        switch (i112) {
                            case 0:
                                long j10 = q9Var22.b;
                                int i12 = q9Var22.a;
                                ArrayList arrayList = q9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        q9Var22.j();
                                        q9Var22.d = true;
                                        q9Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            t9Var.c = true;
                                            t9Var.d = i14;
                                            q9Var22.h.put(Integer.valueOf(i14), t9Var);
                                        }
                                    }
                                    q9Var22.d = true;
                                    q9Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final q9 q9Var3 = this.b;
                q9Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.p9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var22 = q9Var3;
                        switch (i112) {
                            case 0:
                                long j10 = q9Var22.b;
                                int i122 = q9Var22.a;
                                ArrayList arrayList = q9Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        q9Var22.j();
                                        q9Var22.d = true;
                                        q9Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            t9Var.c = true;
                                            t9Var.d = i14;
                                            q9Var22.h.put(Integer.valueOf(i14), t9Var);
                                        }
                                    }
                                    q9Var22.d = true;
                                    q9Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    break;
                                }
                                break;
                            case 1:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var22.e.set(f10, tL_starGiftCollection3);
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
