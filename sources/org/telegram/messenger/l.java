package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ l(int i10, ArrayList arrayList) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s5 s5Var;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                while (i10 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i10)).get();
                    ((WeakReference) arrayList.get(i10)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    i10++;
                }
                break;
            case 1:
                Utilities.e.c(new l(i10, this.b));
                break;
            case 2:
                ArrayList arrayList2 = this.b;
                t5 t5Var = t5.k;
                t5Var.getClass();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Runnable runnable = (Runnable) arrayList2.get(i11);
                    if (runnable != null) {
                        if (!t5Var.c.isEmpty() && (t5Var.g / 2 <= t5Var.c.size() || (t5Var.a.isEmpty() && t5Var.e >= t5Var.d))) {
                            s5Var = (s5) t5Var.c.remove(0);
                        } else if (t5Var.a.isEmpty()) {
                            s5Var = new s5("DispatchQueuePoolThreadSafety_" + t5Var.f + "_" + Utilities.b.nextInt(), true);
                            s5Var.setPriority(10);
                            t5Var.e = t5Var.e + 1;
                        } else {
                            s5Var = (s5) t5Var.a.remove(0);
                        }
                        if (!t5Var.h) {
                            Utilities.e.d(t5Var.i, 30000L);
                            t5Var.h = true;
                        }
                        t5Var.g++;
                        t5Var.c.add(s5Var);
                        t5Var.b.put(s5Var.index, t5Var.b.get(s5Var.index, 0) + 1);
                        if (sg.e0.b) {
                            s5Var.setPriority(1);
                        } else if (s5Var.getPriority() != 10) {
                            s5Var.setPriority(10);
                        }
                        s5Var.postRunnable(new mg(t5Var, runnable, s5Var, 17));
                    }
                }
                arrayList2.clear();
                i0.g3(new l(3, arrayList2));
                break;
            case 3:
                t5.l.add(this.b);
                break;
            case 4:
                ArrayList arrayList3 = this.b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(w0.b);
                while (i10 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i10)).intValue(), R.id.list_view);
                    i10++;
                }
                break;
            default:
                zs.e().k(zs.e4, this.b);
                break;
        }
    }
}
