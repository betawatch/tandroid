package mh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import g7.e6;
import ih.h6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AnimationNotificationsLocker) this.b).unlock();
                break;
            case 1:
                f4 f4Var = (f4) this.b;
                f4Var.M = f4Var.r;
                break;
            case 2:
                ((n5.a0) this.b).g();
                break;
            case 3:
                h6 h6Var = ((of.j1) this.b).y;
                if (h6Var != null) {
                    h6Var.p(3, true);
                    break;
                }
                break;
            case 4:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 5:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                k0Var.L0 = null;
                k0Var.setVisibleParticipant(true);
                break;
            case 6:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.G = false;
                g1Var.o(false);
                g1Var.S = false;
                break;
            case 7:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((mf0) this.b).b;
                g1Var2.e.invalidate();
                if (!g1Var2.e.isInLayout()) {
                    g1Var2.e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f.requestLayout();
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.Components.voip.f1) this.b).a.i(false);
                break;
            case 9:
                org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) this.b;
                g2Var.e = false;
                HashMap hashMap = g2Var.a;
                ArrayList arrayList = g2Var.c;
                ArrayList arrayList2 = g2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (g2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                    }
                    int i9 = 0;
                    while (i9 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) arrayList2.get(i9);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (f2Var.a.equals(((org.telegram.ui.Components.voip.f2) arrayList.get(i10)).a)) {
                                arrayList2.remove(i9);
                                arrayList.remove(i10);
                                i9--;
                            } else {
                                i10++;
                            }
                        }
                        i9++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        g2Var.addView((View) arrayList2.get(i11), e6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        g2Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < g2Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.f2 f2Var2 = (org.telegram.ui.Components.voip.f2) g2Var.getChildAt(i13);
                        hashMap.put(f2Var2.a, f2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    g2Var.e = true;
                    AndroidUtilities.runOnUIThread(new m2(g2Var, 9), 700L);
                    Runnable runnable = g2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 10:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.o2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 11:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.o2) ((of.h0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 12:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.b;
                w2Var.e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.a.ascent() + w2Var.a.descent()) / 2.0f)), w2Var.a);
                w2Var.postInvalidate();
                break;
            case 14:
                ((org.telegram.ui.web.k) this.b).w.U2.N(true);
                break;
            case 15:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.b).h.e;
                if (iVar != null) {
                    iVar.d();
                    break;
                }
                break;
            case 16:
                ((mt) this.b).requestFocus();
                break;
            case 17:
                ve.e.s(((org.telegram.ui.web.r0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 18:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                Utilities.searchQueue.postRunnable(new ue0(b1Var, new ArrayList(b1Var.h.e), b1Var.h.n));
                break;
            case 19:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 20:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            case 21:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.u1.Y(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.u1.Y(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new eo(u1Var, length, file3.exists() ? org.telegram.ui.web.u1.Y(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 22:
                ((boolean[]) this.b)[0] = true;
                break;
            case 23:
                pf.d dVar = (pf.d) this.b;
                dVar.c.U2.N(true);
                dVar.U(true);
                break;
            case 24:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                oc.a0(LaunchActivity.R()).k(false).j();
                break;
            case 25:
                pf.g0 g0Var = (pf.g0) this.b;
                z41 z41Var = g0Var.Z;
                if (z41Var != null) {
                    z41Var.N(true);
                }
                g0Var.S(true);
                break;
            case 26:
                pf.m0 m0Var = (pf.m0) ((n2.p) this.b).b;
                m0Var.c.U2.N(true);
                m0Var.a0();
                break;
            case 27:
                pf.o0 o0Var = (pf.o0) this.b;
                o0Var.c.U2.N(true);
                o0Var.U(true);
                break;
            case 28:
                pf.y0 y0Var = (pf.y0) this.b;
                y0Var.a.U2.N(true);
                y0Var.X(true);
                break;
            default:
                ((bg.j1) this.b).run(Boolean.FALSE);
                break;
        }
    }
}
