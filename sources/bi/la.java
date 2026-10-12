package bi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ la(com.google.firebase.messaging.k kVar, Intent intent) {
        this.a = 11;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((na) this.b).requestLayout();
                return;
            case 1:
                wa waVar = (wa) this.b;
                di.d4 d4Var = waVar.c;
                if (d4Var != null) {
                    d4Var.e(true);
                    waVar.c = null;
                }
                waVar.b(false);
                return;
            case 2:
                ua uaVar = (ua) this.b;
                if (uaVar.v) {
                    uaVar.E = true;
                    uaVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    uaVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    uaVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    uaVar.invalidate();
                    return;
                }
                return;
            case 3:
                sb sbVar = ((bb) this.b).b;
                try {
                    gb gbVar = sbVar.s;
                    if (gbVar == null) {
                        return;
                    }
                    if (sbVar.b) {
                        AndroidUtilities.removeFromParent(gbVar);
                    } else {
                        sbVar.n.removeView(gbVar);
                    }
                    sbVar.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((gb) this.b).I0.K(true);
                return;
            case 5:
                ((bc) this.b).c();
                return;
            case 6:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 7:
                c2.b bVar = (c2.b) this.b;
                ((Context) bVar.b).unregisterReceiver((c2.a) bVar.c);
                return;
            case 8:
                c2.a aVar = (c2.a) this.b;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    return;
                }
                return;
            case 9:
                ((vi) this.b).hide();
                return;
            case 10:
                ci.t tVar = (ci.t) this.b;
                ms0 ms0Var = tVar.W;
                f8 f8Var = tVar.a;
                ms0Var.a(f8Var == null ? "" : f8Var.E);
                return;
            case 11:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 12:
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.b;
                synchronized (((ArrayDeque) z5Var.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) z5Var.b).edit();
                    String str = (String) z5Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) z5Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) z5Var.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 13:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.a.getAction() + " finishing.");
                d0Var.b.trySetResult(null);
                return;
            case 14:
                ((di.h) this.b).c.W = false;
                return;
            case 15:
                ((di.l) this.b).invalidateSelf();
                return;
            case 16:
                ((di.d0) this.b).g = -1L;
                return;
            case 17:
                di.l0 l0Var = (di.l0) this.b;
                rg.i iVar = l0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                l0Var.b.k();
                return;
            case 18:
                ((di.u0) this.b).a(false);
                return;
            case 19:
                di.x5 x5Var = (di.x5) this.b;
                sc.e();
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.m2) new o3(x5Var), 14, false);
                y0Var.setOnDismissListener(new di.e1(i13));
                y0Var.show();
                return;
            case 20:
                ((di.v1) this.b).G();
                return;
            case 21:
                di.c2 c2Var = (di.c2) this.b;
                ArrayList arrayList = c2Var.v;
                ArrayList arrayList2 = c2Var.s;
                di.d2 d2Var = c2Var.N;
                di.r2 r2Var = d2Var.s;
                i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str2 = c2Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    c2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    c2Var.y.clear();
                    c2Var.n.clear();
                    c2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    c2Var.x = recentStickers.size() + c2Var.x;
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    di.o1.x1(d2Var.b, 0, 0);
                    d2Var.f.c(false);
                    d2Var.e.n(false);
                    return;
                }
                int i14 = 5;
                if (d2Var.a == 1 && Emoji.fullyConsistsOfEmojis(c2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = c2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new m1(i14, c2Var, str2));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = c2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                c2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, c2Var.H, false, new androidx.car.app.utils.a(i14, c2Var, mediaDataController, str2), null, false, false, false, true, 50, false);
                return;
            case 22:
                di.k2 k2Var = (di.k2) ((di.h2) this.b).b;
                if (k2Var.h) {
                    return;
                }
                k2Var.n.setVisibility(8);
                return;
            case 23:
                di.o2 o2Var = (di.o2) ((di.n2) this.b).b;
                ArrayList arrayList3 = o2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                o2Var.l.d(0.0f, true);
                int i15 = o2Var.k + 1;
                o2Var.k = i15;
                if (i15 > arrayList3.size() - 1) {
                    o2Var.k = 0;
                }
                ah.y0 y0Var2 = o2Var.j;
                y0Var2.e((ah.i1) arrayList3.get(o2Var.k));
                o2Var.j = o2Var.i;
                o2Var.i = y0Var2;
                o2Var.p.invalidate();
                return;
            case 24:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 25:
                ((di.q3) this.b).b(null);
                return;
            case 26:
                ((di.u3) this.b).E();
                return;
            case 27:
                di.bb bbVar = (di.bb) this.b;
                if (bbVar.I) {
                    bbVar.I = false;
                    bbVar.invalidate();
                    return;
                }
                return;
            case 28:
                di.i7 i7Var = ((di.h7) this.b).p;
                i7Var.Q = System.currentTimeMillis();
                i7Var.R = 0L;
                i7Var.r0 = true;
                ((di.fb) i7Var.a).a.J0.a(0L, true);
                i7Var.invalidate();
                return;
            default:
                di.p pVar = (di.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ la(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
