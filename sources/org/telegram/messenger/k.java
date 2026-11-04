package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ k(int i3, ArrayList arrayList) {
        this.a = i3;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        int i3 = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                while (i3 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i3)).get();
                    ((WeakReference) arrayList.get(i3)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    i3++;
                }
                break;
            case 1:
                Utilities.e.c(new k(i3, this.b));
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
                            Utilities.e.e(r5Var.i, 30000L);
                            r5Var.h = true;
                        }
                        r5Var.g++;
                        r5Var.c.add(q5Var);
                        r5Var.b.put(q5Var.index, r5Var.b.get(q5Var.index, 0) + 1);
                        if (dh.d0.b) {
                            q5Var.setPriority(1);
                        } else if (q5Var.getPriority() != 10) {
                            q5Var.setPriority(10);
                        }
                        q5Var.postRunnable(new fg(r5Var, runnable, q5Var, 17));
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
                while (i3 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i3)).intValue(), R.id.list_view);
                    i3++;
                }
                break;
            default:
                hs.e().k(hs.e4, this.b);
                break;
        }
    }
}
