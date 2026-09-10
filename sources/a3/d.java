package a3;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.fragment.app.u0;
import bi.b3;
import bi.be;
import bi.c3;
import bi.f3;
import bi.h2;
import bi.j4;
import bi.k1;
import bi.m8;
import bi.nb;
import bi.o1;
import bi.o2;
import bi.o4;
import bi.ob;
import bi.oc;
import bi.q0;
import bi.q2;
import bi.sc;
import bi.u2;
import bi.w1;
import bi.x2;
import bi.y6;
import bi.z0;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import qg.a1;
import v7.k8;
import v7.l8;
import w7.a8;
import yg.p0;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 8;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((f) this.b).g.C();
                return;
            case 1:
                ((w) this.b).k--;
                return;
            case 2:
                ((yi) this.b).hide();
                return;
            case 3:
                ai.a0 a0Var = (ai.a0) this.b;
                vr0 vr0Var = a0Var.W;
                s4 s4Var = a0Var.a;
                vr0Var.a(s4Var == null ? "" : s4Var.E);
                return;
            case 4:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
                return;
            case 5:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 6:
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            case 7:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.i d = qVar.d();
                            int i15 = d.e;
                            if (i15 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i15 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i15 + ")");
                            }
                            try {
                                int i16 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                t7.u uVar = qVar.c;
                                Context context = qVar.a;
                                uVar.getClass();
                                o0.i[] iVarArr = {d};
                                k8 k8Var = i0.f.a;
                                a8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.f.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = l8.e(qVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, v7.x.a(e));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                v7.w wVar = qVar.h;
                                                if (wVar != null) {
                                                    wVar.b(sVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i17 = n0.g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (qVar.d) {
                                try {
                                    v7.w wVar2 = qVar.h;
                                    if (wVar2 != null) {
                                        wVar2.a(th3);
                                    }
                                    qVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 9:
                Iterator it = ((androidx.fragment.app.j0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 10:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 11:
                ((bi.j) this.b).c.W = false;
                return;
            case 12:
                ((bi.n) this.b).invalidateSelf();
                return;
            case 13:
                ((bi.i0) this.b).g = -1L;
                return;
            case 14:
                q0 q0Var = (q0) this.b;
                pg.i iVar = q0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                q0Var.b.k();
                return;
            case 15:
                ((z0) this.b).a(false);
                return;
            case 16:
                y6 y6Var = (y6) this.b;
                pc.e();
                a1 a1Var = new a1((p2) new o1(y6Var), 14, false);
                a1Var.setOnDismissListener(new k1(i14));
                a1Var.show();
                return;
            case 17:
                ((h2) this.b).G();
                return;
            case 18:
                bi.p2 p2Var = (bi.p2) this.b;
                ArrayList arrayList = p2Var.v;
                ArrayList arrayList2 = p2Var.s;
                q2 q2Var = p2Var.N;
                f3 f3Var = q2Var.s;
                i10 = ((h3) f3Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = p2Var.H;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    p2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    p2Var.y.clear();
                    p2Var.n.clear();
                    p2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    p2Var.x = recentStickers.size() + p2Var.x;
                    p2Var.I = p2Var.H;
                    p2Var.l();
                    w1.v1(q2Var.b, 0, 0);
                    q2Var.f.c(false);
                    q2Var.e.n(false);
                    return;
                }
                if (q2Var.a == 1 && Emoji.fullyConsistsOfEmojis(p2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = p2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((h3) f3Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new o2(i14, p2Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = p2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((h3) f3Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                p2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, p2Var.H, false, new androidx.car.app.utils.a((Object) p2Var, str, (Object) mediaDataController, i13), null, false, false, false, true, 50, false);
                return;
            case 19:
                x2 x2Var = (x2) ((u2) this.b).b;
                if (x2Var.h) {
                    return;
                }
                x2Var.n.setVisibility(8);
                return;
            case 20:
                c3 c3Var = (c3) ((b3) this.b).b;
                ArrayList arrayList3 = c3Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                c3Var.l.d(0.0f, true);
                int i18 = c3Var.k + 1;
                c3Var.k = i18;
                if (i18 > arrayList3.size() - 1) {
                    c3Var.k = 0;
                }
                yg.g0 g0Var = c3Var.j;
                g0Var.e((p0) arrayList3.get(c3Var.k));
                c3Var.j = c3Var.i;
                c3Var.i = g0Var;
                c3Var.p.invalidate();
                return;
            case 21:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 22:
                ((j4) this.b).b(null);
                return;
            case 23:
                ((o4) this.b).E();
                return;
            case 24:
                oc ocVar = (oc) this.b;
                if (ocVar.I) {
                    ocVar.I = false;
                    ocVar.invalidate();
                    return;
                }
                return;
            case 25:
                m8 m8Var = ((bi.l8) this.b).p;
                m8Var.Q = System.currentTimeMillis();
                m8Var.R = 0L;
                m8Var.r0 = true;
                ((sc) m8Var.a).a.J0.a(0L, true);
                m8Var.invalidate();
                return;
            case 26:
                bi.t tVar = (bi.t) this.b;
                if (tVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tVar.getParent()).removeView(tVar);
                    return;
                }
                return;
            case 27:
                bi.d dVar = (bi.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((ob) ((nb) this.b).n).fullScroll(130);
                return;
            default:
                be beVar = (be) this.b;
                beVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                beVar.w0.B(AndroidUtilities.emptyMotionEvent());
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
