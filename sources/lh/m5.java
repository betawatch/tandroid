package lh;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Arrays;
import nh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        int i13 = 1;
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.b;
                if (q5Var.isShowing()) {
                    q5Var.q(true);
                    break;
                }
                break;
            case 1:
                ((nh.o8) this.b).run();
                break;
            case 2:
                nh.a1 a1Var = (nh.a1) this.b;
                a1Var.b(a1Var.b);
                a1Var.c = false;
                break;
            case 3:
                w6 w6Var = (w6) this.b;
                w6Var.c();
                w6Var.a(true);
                break;
            case 4:
                ((v5) this.b).accept(null);
                break;
            case 5:
                ((g7) this.b).onDetachedFromWindow();
                break;
            case 6:
                q7 q7Var = (q7) this.b;
                ArrayList arrayList = q7Var.c;
                if (arrayList != null) {
                    q7Var.a.v1 = arrayList;
                }
                d4 d4Var = q7Var.a;
                long j10 = q7Var.b;
                if (d4Var.x1 != j10 || d4Var.v1 != null) {
                    d4Var.x1 = j10;
                    d4Var.j1();
                    d4Var.i1();
                    d4Var.f1(true);
                    TL_stories.PeerStories peerStories = d4Var.F0.M0;
                    if (peerStories == null) {
                        s6 s6Var = d4Var.O1;
                        TL_stories.PeerStories y8 = s6Var.y(j10);
                        if (y8 == null) {
                            y8 = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(y8, z10);
                        break;
                    } else {
                        d4Var.O1.S(peerStories, true);
                        break;
                    }
                }
                break;
            case 7:
                ((v80) this.b).d(true);
                break;
            case 8:
                ((d8) this.b).requestLayout();
                break;
            case 9:
                m8 m8Var = (m8) this.b;
                nh.t3 t3Var = m8Var.c;
                if (t3Var != null) {
                    t3Var.e(true);
                    m8Var.c = null;
                }
                m8Var.b(false);
                break;
            case 10:
                k8 k8Var = (k8) this.b;
                if (k8Var.v) {
                    k8Var.A = true;
                    k8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    break;
                }
                break;
            case 11:
                i9 i9Var = ((r8) this.b).b;
                try {
                    w8 w8Var = i9Var.s;
                    if (w8Var != null) {
                        if (i9Var.b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.n.removeView(w8Var);
                        }
                        i9Var.s = null;
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((w8) this.b).E0.K(true);
                break;
            case 13:
                ((r9) this.b).c();
                break;
            case 14:
                ((ni) this.b).hide();
                break;
            case 15:
                mh.r rVar = (mh.r) this.b;
                fr0 fr0Var = rVar.S;
                c6 c6Var = rVar.a;
                fr0Var.a(c6Var == null ? "" : c6Var.E);
                break;
            case 16:
                ((nh.h) this.b).c.S = false;
                break;
            case 17:
                ((nh.l) this.b).invalidateSelf();
                break;
            case 18:
                ((nh.d0) this.b).g = -1L;
                break;
            case 19:
                nh.m0 m0Var = (nh.m0) this.b;
                bg.j jVar = m0Var.b.D;
                if (jVar != null) {
                    jVar.b();
                }
                m0Var.b.k();
                break;
            case 20:
                ((nh.v0) this.b).a(false);
                break;
            case 21:
                nh.c5 c5Var = (nh.c5) this.b;
                mc.e();
                cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(c5Var), 14, false);
                p1Var.setOnDismissListener(new bg.f0(i13));
                p1Var.show();
                break;
            case 22:
                ((nh.r1) this.b).G();
                break;
            case 23:
                nh.x1 x1Var = (nh.x1) this.b;
                ArrayList arrayList2 = x1Var.v;
                ArrayList arrayList3 = x1Var.s;
                nh.y1 y1Var = x1Var.J;
                nh.k2 k2Var = y1Var.s;
                i10 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = x1Var.D;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (y1Var.a != 1 || !Emoji.fullyConsistsOfEmojis(x1Var.D)) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        String[] strArr = x1Var.F;
                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                            i11 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                            MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        x1Var.F = currentKeyboardLanguage;
                        mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, x1Var.D, false, new androidx.car.app.utils.a(11, x1Var, mediaDataController, str), null, false, false, false, true, 50, false);
                        break;
                    } else {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = x1Var.D;
                        tL_messages_getStickers.hash = 0L;
                        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new bg.h3(16, x1Var, str));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    x1Var.x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    x1Var.y.clear();
                    x1Var.n.clear();
                    x1Var.x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(recentStickers);
                    x1Var.x = recentStickers.size() + x1Var.x;
                    x1Var.E = x1Var.D;
                    x1Var.l();
                    nh.n1.w1(y1Var.b, 0, 0);
                    y1Var.f.c(false);
                    y1Var.e.n(false);
                    break;
                }
                break;
            case 24:
                nh.d2 d2Var = (nh.d2) ((bh.c) this.b).b;
                if (!d2Var.h) {
                    d2Var.n.setVisibility(8);
                    break;
                }
                break;
            case 25:
                nh.h2 h2Var = (nh.h2) ((nh.g2) this.b).b;
                ArrayList arrayList4 = h2Var.o;
                if (!arrayList4.isEmpty()) {
                    h2Var.l.d(0.0f, true);
                    int i14 = h2Var.k + 1;
                    h2Var.k = i14;
                    if (i14 > arrayList4.size() - 1) {
                        h2Var.k = 0;
                    }
                    kg.h0 h0Var = h2Var.j;
                    h0Var.e((kg.q0) arrayList4.get(h2Var.k));
                    h2Var.j = h2Var.i;
                    h2Var.i = h0Var;
                    h2Var.p.invalidate();
                    break;
                }
                break;
            case 26:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 27:
                ((nh.j3) this.b).b(null);
                break;
            case 28:
                ((nh.m3) this.b).E();
                break;
            default:
                y9 y9Var = (y9) this.b;
                if (y9Var.E) {
                    y9Var.E = false;
                    y9Var.invalidate();
                    break;
                }
                break;
        }
    }
}
