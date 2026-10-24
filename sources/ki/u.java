package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.go;
import org.telegram.ui.sn;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((x) this.b).e0.d);
                break;
            case 1:
                ((d0) this.b).invalidate();
                break;
            case 2:
                m.s3 s3Var = (m.s3) this.b;
                s3Var.c = null;
                s3Var.d = null;
                s3Var.e = null;
                s3Var.f = null;
                s3Var.e(null);
                break;
            case 3:
                ((a2) this.b).invalidateSelf();
                break;
            case 4:
                ((h2) this.b).c();
                break;
            case 5:
                ((lh.b) this.b).invalidate();
                break;
            case 6:
                mh.c cVar = (mh.c) this.b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    break;
                }
                break;
            case 7:
                n2.d dVar = (n2.d) this.b;
                if (!dVar.c) {
                    n2.h hVar = dVar.b;
                    if (hVar != null) {
                        hVar.a(dVar.a);
                    }
                    dVar.d.x.remove(dVar);
                    dVar.c = true;
                    break;
                }
                break;
            case 8:
                ((n2.b) this.b).a(null);
                break;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (j6) this.b, Boolean.TRUE, null, -1);
                break;
            case 10:
                ((le.b) this.b).d();
                break;
            case 11:
                ye1 ye1Var = (ye1) this.b;
                if (ye1Var.getParentLayout() != null) {
                    ye1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ye1Var.a);
                    sn snVar = new sn(bundle);
                    snVar.va = true;
                    ye1Var.presentFragment(snVar);
                    break;
                }
                break;
            case 12:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 13:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 14:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                break;
            case 15:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) this.b).b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f.requestLayout();
                    break;
                }
                break;
            case 16:
                ((org.telegram.ui.Components.voip.g1) this.b).a.i(false);
                break;
            case 17:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) this.b;
                f2Var.e = false;
                HashMap hashMap = f2Var.a;
                ArrayList arrayList = f2Var.c;
                ArrayList arrayList2 = f2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            if (e2Var.a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i11)).a)) {
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
                        f2Var.addView((View) arrayList2.get(i12), w7.z5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        f2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < f2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i14);
                        hashMap.put(e2Var2.a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new u(f2Var, 17), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 18:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.n2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 19:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.n2) ((hg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 20:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.b;
                if (r2Var.getVisibility() == 0) {
                    r2Var.a();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                v2Var.e = Bitmap.createBitmap(v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(v2Var.e).drawText(v2Var.d, v2Var.getMeasuredWidth() / 2, (int) ((v2Var.getMeasuredHeight() / 2) - ((v2Var.a.ascent() + v2Var.a.descent()) / 2.0f)), v2Var.a);
                v2Var.postInvalidate();
                break;
            case 22:
                ((org.telegram.ui.web.l) this.b).w.Z2.N(true);
                break;
            case 23:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.b).s.e;
                if (jVar != null) {
                    jVar.d();
                    break;
                }
                break;
            case 24:
                ((iu) this.b).requestFocus();
                break;
            case 25:
                pf.d.r(((org.telegram.ui.web.u0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 26:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                Utilities.searchQueue.postRunnable(new fy0(f1Var, new ArrayList(f1Var.s.e), f1Var.s.n));
                break;
            case 27:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 28:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                break;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new go(y1Var, length, file3.exists() ? org.telegram.ui.web.y1.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
        }
    }
}
