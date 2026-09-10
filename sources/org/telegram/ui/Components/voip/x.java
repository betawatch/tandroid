package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.b7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.fb1;
import org.telegram.ui.so;
import org.telegram.ui.web.HttpGetFileTask;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                break;
            case 1:
                i1 i1Var = (i1) this.b;
                i1Var.K = false;
                i1Var.o(false);
                i1Var.W = false;
                break;
            case 2:
                i1 i1Var2 = (i1) ((kg.b) this.b).b;
                i1Var2.e.invalidate();
                if (!i1Var2.e.isInLayout()) {
                    i1Var2.e.requestLayout();
                    i1Var2.d.requestLayout();
                    i1Var2.f.requestLayout();
                    break;
                }
                break;
            case 3:
                ((h1) this.b).a.i(false);
                break;
            case 4:
                g2 g2Var = (g2) this.b;
                g2Var.e = false;
                HashMap hashMap = g2Var.a;
                ArrayList arrayList = g2Var.c;
                ArrayList arrayList2 = g2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (g2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        f2 f2Var = (f2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            if (f2Var.a.equals(((f2) arrayList.get(i11)).a)) {
                                arrayList2.remove(i10);
                                arrayList.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        g2Var.addView((View) arrayList2.get(i12), a6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        g2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < g2Var.getChildCount(); i14++) {
                        f2 f2Var2 = (f2) g2Var.getChildAt(i14);
                        hashMap.put(f2Var2.a, f2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    g2Var.e = true;
                    AndroidUtilities.runOnUIThread(new x(g2Var, 4), 700L);
                    Runnable runnable = g2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 5:
                TextView[] textViewArr = ((o2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 6:
                TextView[] textViewArr2 = ((o2) ((fg.k0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 7:
                s2 s2Var = (s2) this.b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    break;
                }
                break;
            case 8:
                x2 x2Var = (x2) this.b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.a.ascent() + x2Var.a.descent()) / 2.0f)), x2Var.a);
                x2Var.postInvalidate();
                break;
            case 9:
                ((org.telegram.ui.web.l) this.b).w.Y2.N(true);
                break;
            case 10:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.b).h.e;
                if (jVar != null) {
                    jVar.d();
                    break;
                }
                break;
            case 11:
                ((fu) this.b).requestFocus();
                break;
            case 12:
                nf.f.s(((org.telegram.ui.web.u0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                Utilities.searchQueue.postRunnable(new sx0(g1Var, new ArrayList(g1Var.h.e), g1Var.h.n, 11));
                break;
            case 14:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 15:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            case 16:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.b2.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.b2.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new so(b2Var, length, file3.exists() ? org.telegram.ui.web.b2.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 17:
                ((boolean[]) this.b)[0] = true;
                break;
            case 18:
                ((p4.e) this.b).k();
                break;
            case 19:
                ((p4.g) this.b).n = -1;
                break;
            case 20:
                ((yk0) this.b).b();
                break;
            case 21:
                b7 b7Var = (b7) this.b;
                b7Var.x0 = true;
                b7Var.s();
                break;
            case 22:
                ((View) this.b).performClick();
                break;
            case 23:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((pg.l2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 24:
                AndroidUtilities.showKeyboard(((pg.v2) this.b).q0);
                break;
            case 25:
                AndroidUtilities.showKeyboard(((ph.c) this.b).a);
                break;
            case 26:
                ph.c cVar = (ph.c) ((d6) this.b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar.n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar.n.getDelegate().C1(cVar.n, false);
                    break;
                }
                break;
            case 27:
                ((ph.q) this.b).c.Y2.N(true);
                break;
            case 28:
                ((ph.p) this.b).a();
                break;
            default:
                qg.k0 k0Var = ((qg.d0) this.b).c;
                k0Var.n.presentFragment(fb1.d0(k0Var.s1(), true));
                break;
        }
    }
}
