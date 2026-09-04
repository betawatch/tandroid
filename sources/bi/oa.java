package bi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.view.ViewGroup;
import di.oc;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa(com.google.firebase.messaging.k kVar, Intent intent) {
        this.a = 8;
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
                ta taVar = (ta) this.b;
                di.f4 f4Var = taVar.c;
                if (f4Var != null) {
                    f4Var.e(true);
                    taVar.c = null;
                }
                taVar.b(false);
                return;
            case 1:
                ra raVar = (ra) this.b;
                if (raVar.v) {
                    raVar.E = true;
                    raVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    raVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.invalidate();
                    return;
                }
                return;
            case 2:
                pb pbVar = ((ya) this.b).b;
                try {
                    db dbVar = pbVar.s;
                    if (dbVar == null) {
                        return;
                    }
                    if (pbVar.b) {
                        AndroidUtilities.removeFromParent(dbVar);
                    } else {
                        pbVar.n.removeView(dbVar);
                    }
                    pbVar.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                ((db) this.b).I0.K(true);
                return;
            case 4:
                ((yb) this.b).c();
                return;
            case 5:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 6:
                ((vi) this.b).hide();
                return;
            case 7:
                ci.t tVar = (ci.t) this.b;
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.a;
                lr0Var.a(b8Var == null ? "" : b8Var.E);
                return;
            case 8:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 9:
                cf.c cVar = (cf.c) this.b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.a).edit();
                    String str = (String) cVar.b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 10:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.a.getAction() + " finishing.");
                d0Var.b.trySetResult(null);
                return;
            case 11:
                ((di.h) this.b).c.W = false;
                return;
            case 12:
                ((di.l) this.b).invalidateSelf();
                return;
            case 13:
                ((di.d0) this.b).g = -1L;
                return;
            case 14:
                di.m0 m0Var = (di.m0) this.b;
                rg.j jVar = m0Var.b.H;
                if (jVar != null) {
                    jVar.b();
                }
                m0Var.b.k();
                return;
            case 15:
                ((di.v0) this.b).a(false);
                return;
            case 16:
                di.z5 z5Var = (di.z5) this.b;
                qc.e();
                sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) new l3(z5Var), 14, false);
                a1Var.setOnDismissListener(new di.f1(i13));
                a1Var.show();
                return;
            case 17:
                ((di.w1) this.b).G();
                return;
            case 18:
                di.d2 d2Var = (di.d2) this.b;
                ArrayList arrayList = d2Var.v;
                ArrayList arrayList2 = d2Var.s;
                di.e2 e2Var = d2Var.N;
                di.t2 t2Var = e2Var.s;
                i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str2 = d2Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    d2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    d2Var.y.clear();
                    d2Var.n.clear();
                    d2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    d2Var.x = recentStickers.size() + d2Var.x;
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    di.p1.v1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                int i14 = 5;
                if (e2Var.a == 1 && Emoji.fullyConsistsOfEmojis(d2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = d2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new m1(i14, d2Var, str2));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = d2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                d2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, d2Var.H, false, new androidx.car.app.utils.a((Object) d2Var, str2, (Object) mediaDataController, i14), null, false, false, false, true, 50, false);
                return;
            case 19:
                di.l2 l2Var = (di.l2) ((di.i2) this.b).b;
                if (l2Var.h) {
                    return;
                }
                l2Var.n.setVisibility(8);
                return;
            case 20:
                di.q2 q2Var = (di.q2) ((di.p2) this.b).b;
                ArrayList arrayList3 = q2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                q2Var.l.d(0.0f, true);
                int i15 = q2Var.k + 1;
                q2Var.k = i15;
                if (i15 > arrayList3.size() - 1) {
                    q2Var.k = 0;
                }
                ah.z0 z0Var = q2Var.j;
                z0Var.e((ah.j1) arrayList3.get(q2Var.k));
                q2Var.j = q2Var.i;
                q2Var.i = z0Var;
                q2Var.p.invalidate();
                return;
            case 21:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 22:
                ((di.s3) this.b).b(null);
                return;
            case 23:
                ((di.w3) this.b).E();
                return;
            case 24:
                di.fb fbVar = (di.fb) this.b;
                if (fbVar.I) {
                    fbVar.I = false;
                    fbVar.invalidate();
                    return;
                }
                return;
            case 25:
                di.l7 l7Var = ((di.k7) this.b).p;
                l7Var.Q = System.currentTimeMillis();
                l7Var.R = 0L;
                l7Var.r0 = true;
                ((di.jb) l7Var.a).a.J0.a(0L, true);
                l7Var.invalidate();
                return;
            case 26:
                di.p pVar = (di.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 27:
                di.d dVar = (di.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((di.fa) ((di.ea) this.b).n).fullScroll(130);
                return;
            default:
                oc ocVar = (oc) this.b;
                ocVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ocVar.w0.h(AndroidUtilities.emptyMotionEvent());
                return;
        }
    }

    public /* synthetic */ oa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
