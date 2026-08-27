package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import jh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.fo;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((g0) this.b).invalidateSelf();
                break;
            case 1:
                ((i0) this.b).d();
                break;
            case 2:
                ((u0) this.b).c();
                break;
            case 3:
                ((u0) this.b).c();
                break;
            case 4:
                ((v0) this.b).a();
                break;
            case 5:
                ((w0) this.b).a();
                break;
            case 6:
                ((a3) this.b).invalidate();
                break;
            case 7:
                ((AnimationNotificationsLocker) this.b).unlock();
                break;
            case 8:
                d4 d4Var = (d4) this.b;
                d4Var.M = d4Var.r;
                break;
            case 9:
                ((o0.b) this.b).j();
                break;
            case 10:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 11:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                k0Var.L0 = null;
                k0Var.setVisibleParticipant(true);
                break;
            case 12:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.G = false;
                g1Var.o(false);
                g1Var.S = false;
                break;
            case 13:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((pf0) this.b).b;
                g1Var2.e.invalidate();
                if (!g1Var2.e.isInLayout()) {
                    g1Var2.e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f.requestLayout();
                    break;
                }
                break;
            case 14:
                ((org.telegram.ui.Components.voip.f1) this.b).a.i(false);
                break;
            case 15:
                org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) this.b;
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
                        org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            if (f2Var.a.equals(((org.telegram.ui.Components.voip.f2) arrayList.get(i11)).a)) {
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
                        g2Var.addView((View) arrayList2.get(i12), z5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        g2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < g2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.f2 f2Var2 = (org.telegram.ui.Components.voip.f2) g2Var.getChildAt(i14);
                        hashMap.put(f2Var2.a, f2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    g2Var.e = true;
                    AndroidUtilities.runOnUIThread(new f0(g2Var, 15), 700L);
                    Runnable runnable = g2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 16:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.o2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 17:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.o2) ((ls) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 18:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.b;
                w2Var.e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.a.ascent() + w2Var.a.descent()) / 2.0f)), w2Var.a);
                w2Var.postInvalidate();
                break;
            case 20:
                ((org.telegram.ui.web.l) this.b).w.U2.N(true);
                break;
            case 21:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.b).h.e;
                if (jVar != null) {
                    jVar.d();
                    break;
                }
                break;
            case 22:
                ((lt) this.b).requestFocus();
                break;
            case 23:
                we.e.s(((org.telegram.ui.web.s0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 24:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                Utilities.searchQueue.postRunnable(new gs0(c1Var, new ArrayList(c1Var.h.e), c1Var.h.n, 19));
                break;
            case 25:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 26:
                ((org.telegram.ui.Cells.m1) this.b).invalidateSelf();
                break;
            case 27:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.v1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.v1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new fo(v1Var, length, file3.exists() ? org.telegram.ui.web.v1.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 28:
                ((boolean[]) this.b)[0] = true;
                break;
            default:
                d6 d6Var = ((pf.y0) this.b).y;
                if (d6Var != null) {
                    d6Var.p(3, true);
                    break;
                }
                break;
        }
    }
}
