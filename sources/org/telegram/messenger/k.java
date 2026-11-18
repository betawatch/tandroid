package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        r5 r5Var;
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
                s5 s5Var = s5.k;
                s5Var.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Runnable runnable = (Runnable) arrayList2.get(i10);
                    if (runnable != null) {
                        if (!s5Var.c.isEmpty() && (s5Var.g / 2 <= s5Var.c.size() || (s5Var.a.isEmpty() && s5Var.e >= s5Var.d))) {
                            r5Var = (r5) s5Var.c.remove(0);
                        } else if (s5Var.a.isEmpty()) {
                            r5Var = new r5("DispatchQueuePoolThreadSafety_" + s5Var.f + "_" + Utilities.b.nextInt(), true);
                            r5Var.setPriority(10);
                            s5Var.e = s5Var.e + 1;
                        } else {
                            r5Var = (r5) s5Var.a.remove(0);
                        }
                        if (!s5Var.h) {
                            Utilities.e.d(s5Var.i, 30000L);
                            s5Var.h = true;
                        }
                        s5Var.g++;
                        s5Var.c.add(r5Var);
                        s5Var.b.put(r5Var.index, s5Var.b.get(r5Var.index, 0) + 1);
                        if (ch.f0.b) {
                            r5Var.setPriority(1);
                        } else if (r5Var.getPriority() != 10) {
                            r5Var.setPriority(10);
                        }
                        r5Var.postRunnable(new yf(s5Var, runnable, r5Var, 17));
                    }
                }
                arrayList2.clear();
                g0.g3(new k(3, arrayList2));
                break;
            case 3:
                s5.l.add(this.b);
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
                ks.e().k(ks.h4, this.b);
                break;
        }
    }
}
