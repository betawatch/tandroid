package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ k(int i7, ArrayList arrayList) {
        this.a = i7;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        int i7 = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                while (i7 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i7)).get();
                    ((WeakReference) arrayList.get(i7)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    i7++;
                }
                break;
            case 1:
                Utilities.e.c(new k(i7, this.b));
                break;
            case 2:
                ArrayList arrayList2 = this.b;
                r5 r5Var = r5.k;
                r5Var.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Runnable runnable = (Runnable) arrayList2.get(i10);
                    if (runnable != null) {
                        if (!r5Var.c.isEmpty() && (r5Var.g / 2 <= r5Var.c.size() || (r5Var.a.isEmpty() && r5Var.e >= r5Var.d))) {
                            q5Var = (q5) r5Var.c.remove(0);
                        } else if (r5Var.a.isEmpty()) {
                            q5Var = new q5("DispatchQueuePoolThreadSafety_" + r5Var.f + "_" + Utilities.b.nextInt(), true);
                            q5Var.setPriority(10);
                            r5Var.e = r5Var.e + 1;
                        } else {
                            q5Var = (q5) r5Var.a.remove(0);
                        }
                        if (!r5Var.h) {
                            Utilities.e.d(r5Var.i, 30000L);
                            r5Var.h = true;
                        }
                        r5Var.g++;
                        r5Var.c.add(q5Var);
                        r5Var.b.put(q5Var.index, r5Var.b.get(q5Var.index, 0) + 1);
                        if (ch.e0.b) {
                            q5Var.setPriority(1);
                        } else if (q5Var.getPriority() != 10) {
                            q5Var.setPriority(10);
                        }
                        q5Var.postRunnable(new ng(r5Var, runnable, q5Var, 17));
                    }
                }
                arrayList2.clear();
                g0.h3(new k(3, arrayList2));
                break;
            case 3:
                r5.l.add(this.b);
                break;
            case 4:
                ArrayList arrayList3 = this.b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(t0.b);
                while (i7 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i7)).intValue(), R.id.list_view);
                    i7++;
                }
                break;
            default:
                qs.e().k(qs.e4, this.b);
                break;
        }
    }
}
