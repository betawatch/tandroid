package di;

import a8.wb;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import fi.ia;
import fi.ma;
import fi.qa;
import fi.rb;
import fi.sb;
import fi.ta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String d;
        TelephonyManager telephonyManager;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((t8) this.b).requestLayout();
                return;
            case 1:
                c9 c9Var = (c9) this.b;
                fi.v3 v3Var = c9Var.c;
                if (v3Var != null) {
                    v3Var.e(true);
                    c9Var.c = null;
                }
                c9Var.b(false);
                return;
            case 2:
                a9 a9Var = (a9) this.b;
                if (a9Var.v) {
                    a9Var.E = true;
                    a9Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    a9Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    a9Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    a9Var.invalidate();
                    return;
                }
                return;
            case 3:
                y9 y9Var = ((h9) this.b).b;
                try {
                    m9 m9Var = y9Var.s;
                    if (m9Var == null) {
                        return;
                    }
                    if (y9Var.b) {
                        AndroidUtilities.removeFromParent(m9Var);
                    } else {
                        y9Var.n.removeView(m9Var);
                    }
                    y9Var.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((m9) this.b).x0.K(true);
                return;
            case 5:
                ((ha) this.b).c();
                return;
            case 6:
                e2.v vVar = (e2.v) this.b;
                y2.e eVar = (y2.e) vVar.a.get();
                if (eVar != null) {
                    int b10 = vVar.c.b();
                    y2.f fVar = eVar.a;
                    synchronized (fVar) {
                        synchronized (fVar) {
                            int i14 = fVar.n;
                            if (i14 == 0 || fVar.e) {
                                if (i14 != b10 || fVar.o == null) {
                                    fVar.n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (fVar.o == null) {
                                            Context context = fVar.a;
                                            String str = e2.n0.a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = wb.d(networkCountryIso);
                                                    fVar.o = d;
                                                }
                                            }
                                            d = wb.d(Locale.getDefault().getCountry());
                                            fVar.o = d;
                                        }
                                        fVar.l = fVar.a(b10);
                                        fVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        fVar.c(fVar.g > 0 ? (int) (elapsedRealtime - fVar.h) : 0, fVar.i, fVar.l);
                                        fVar.h = elapsedRealtime;
                                        fVar.i = 0L;
                                        fVar.k = 0L;
                                        fVar.j = 0L;
                                        y2.r rVar = fVar.f;
                                        rVar.a.clear();
                                        rVar.c = -1;
                                        rVar.d = 0;
                                        rVar.e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 7:
                ((ti) this.b).hide();
                return;
            case 8:
                ei.r rVar2 = (ei.r) this.b;
                us0 us0Var = rVar2.W;
                s6 s6Var = rVar2.a;
                us0Var.a(s6Var == null ? "" : s6Var.E);
                return;
            case 9:
                ((fi.h) this.b).c.W = false;
                return;
            case 10:
                ((fi.l) this.b).invalidateSelf();
                return;
            case 11:
                ((fi.d0) this.b).g = -1L;
                return;
            case 12:
                fi.m0 m0Var = (fi.m0) this.b;
                sg.i iVar = m0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                return;
            case 13:
                ((fi.v0) this.b).a(false);
                return;
            case 14:
                fi.n5 n5Var = (fi.n5) this.b;
                qc.e();
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(n5Var), 14, false);
                y0Var.setOnDismissListener(new fi.e1(i13));
                y0Var.show();
                return;
            case 15:
                ((fi.s1) this.b).G();
                return;
            case 16:
                fi.y1 y1Var = (fi.y1) this.b;
                ArrayList arrayList = y1Var.v;
                ArrayList arrayList2 = y1Var.s;
                fi.z1 z1Var = y1Var.N;
                fi.l2 l2Var = z1Var.s;
                i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str2 = y1Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    y1Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    y1Var.y.clear();
                    y1Var.n.clear();
                    y1Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    y1Var.x = recentStickers.size() + y1Var.x;
                    y1Var.I = y1Var.H;
                    y1Var.l();
                    fi.n1.C1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    return;
                }
                if (z1Var.a == 1 && Emoji.fullyConsistsOfEmojis(y1Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = y1Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new bi.j(13, y1Var, str2));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = y1Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                y1Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, y1Var.H, false, new androidx.car.app.utils.a((Object) y1Var, str2, (Object) mediaDataController, 6), null, false, false, false, true, 50, false);
                return;
            case 17:
                fi.f2 f2Var = (fi.f2) ((bi.u) this.b).b;
                if (f2Var.n) {
                    return;
                }
                f2Var.r.setVisibility(8);
                return;
            case 18:
                fi.i2 i2Var = (fi.i2) ((f6.r) this.b).b;
                ArrayList arrayList3 = i2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                i2Var.l.d(0.0f, true);
                int i15 = i2Var.k + 1;
                i2Var.k = i15;
                if (i15 > arrayList3.size() - 1) {
                    i2Var.k = 0;
                }
                bh.n0 n0Var = i2Var.j;
                n0Var.e((bh.x0) arrayList3.get(i2Var.k));
                i2Var.j = i2Var.i;
                i2Var.i = n0Var;
                i2Var.p.invalidate();
                return;
            case 19:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 20:
                ((fi.k3) this.b).b(null);
                return;
            case 21:
                ((fi.n3) this.b).E();
                return;
            case 22:
                ia iaVar = (ia) this.b;
                if (iaVar.I) {
                    iaVar.I = false;
                    iaVar.invalidate();
                    return;
                }
                return;
            case 23:
                fi.w6 w6Var = ((fi.v6) this.b).p;
                w6Var.Q = System.currentTimeMillis();
                w6Var.R = 0L;
                w6Var.r0 = true;
                ((ma) w6Var.a).a.J0.a(0L, true);
                w6Var.invalidate();
                return;
            case 24:
                fi.p pVar = (fi.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 25:
                fi.d dVar = (fi.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 26:
                ((fi.k9) ((fi.j9) this.b).n).fullScroll(130);
                return;
            case 27:
                rb rbVar = (rb) this.b;
                rbVar.m0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                rbVar.l0.g0(AndroidUtilities.emptyMotionEvent());
                return;
            case 28:
                sb sbVar = ((qa) this.b).k0;
                sbVar.u(true);
                sbVar.A0.setCameraThumb(sbVar.z());
                return;
            default:
                ((ta) this.b).p2.p1.setVisibility(8);
                return;
        }
    }
}
