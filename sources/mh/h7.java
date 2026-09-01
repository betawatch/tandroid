package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ h7(j7 j7Var, int i10) {
        this.a = i10;
        this.b = j7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final j7 j7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.i7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var2 = j7Var;
                        switch (i11) {
                            case 0:
                                long j10 = j7Var2.b;
                                int i12 = j7Var2.a;
                                ArrayList arrayList = j7Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j7Var2.j();
                                        j7Var2.d = true;
                                        j7Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l7Var.c = true;
                                            l7Var.d = i14;
                                            j7Var2.h.put(Integer.valueOf(i14), l7Var);
                                        }
                                    }
                                    j7Var2.d = true;
                                    j7Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var2);
                                    break;
                                }
                                break;
                            case 1:
                                j7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var2.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var2.e.set(f11, tL_starGiftCollection3);
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
                final j7 j7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.i7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var22 = j7Var2;
                        switch (i112) {
                            case 0:
                                long j10 = j7Var22.b;
                                int i12 = j7Var22.a;
                                ArrayList arrayList = j7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j7Var22.j();
                                        j7Var22.d = true;
                                        j7Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l7Var.c = true;
                                            l7Var.d = i14;
                                            j7Var22.h.put(Integer.valueOf(i14), l7Var);
                                        }
                                    }
                                    j7Var22.d = true;
                                    j7Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var22.e.set(f11, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final j7 j7Var3 = this.b;
                j7Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.i7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var22 = j7Var3;
                        switch (i112) {
                            case 0:
                                long j10 = j7Var22.b;
                                int i122 = j7Var22.a;
                                ArrayList arrayList = j7Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j7Var22.j();
                                        j7Var22.d = true;
                                        j7Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l7Var.c = true;
                                            l7Var.d = i14;
                                            j7Var22.h.put(Integer.valueOf(i14), l7Var);
                                        }
                                    }
                                    j7Var22.d = true;
                                    j7Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var22.e.set(f10, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var22.e.set(f11, tL_starGiftCollection3);
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
