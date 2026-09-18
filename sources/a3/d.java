package a3;

import ai.a5;
import ai.aa;
import ai.ac;
import ai.b2;
import ai.c2;
import ai.d2;
import ai.db;
import ai.e7;
import ai.f6;
import ai.h8;
import ai.ic;
import ai.j7;
import ai.jc;
import ai.kb;
import ai.l9;
import ai.m2;
import ai.ma;
import ai.mb;
import ai.sb;
import ai.sc;
import ai.u4;
import ai.w7;
import ai.xb;
import ai.y5;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.v0;
import ci.b1;
import ci.f4;
import ci.p9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
import v7.i8;
import w7.a8;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.l lVar, v0 v0Var) {
        this.a = 29;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ((f) this.b).g.D();
                return;
            case 1:
                ((w) this.b).k--;
                return;
            case 2:
                uy uyVar = ((lx) this.b).O0;
                if (uyVar.L && uyVar.X3().G()) {
                    uyVar.E0.h();
                    return;
                } else {
                    uyVar.x4(true, true);
                    return;
                }
            case 3:
                ((b2) this.b).a.t(false);
                return;
            case 4:
                d2 d2Var = ((c2) this.b).a;
                NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.g()));
                return;
            case 5:
                m2 m2Var = (m2) this.b;
                m2Var.H = false;
                m2Var.p(false);
                m2Var.T = false;
                return;
            case 6:
                ((u4) this.b).a.Q0();
                return;
            case 7:
                f6 f6Var = ((a5) this.b).x;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    if (f6Var.T1 || f6Var.U1 || f6Var.V1) {
                        if (f6Var.O1.e) {
                            ((ic) f6Var.M2.c).loopBack();
                            return;
                        } else {
                            f6Var.W0 = 0L;
                            return;
                        }
                    }
                    jc jcVar = ((ac) y5Var).d;
                    if (jcVar.n0.getCurrentPeerView().d1(true) || jcVar.n0.E(true)) {
                        return;
                    }
                    jcVar.q(true);
                    return;
                }
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i10 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 10:
                j7.a(((e7) this.b).d);
                return;
            case 11:
                w7 w7Var = (w7) this.b;
                if (w7Var.isShowing()) {
                    w7Var.q(true);
                    return;
                }
                return;
            case 12:
                ((p9) this.b).run();
                return;
            case 13:
                b1 b1Var = (b1) this.b;
                b1Var.c(b1Var.b);
                b1Var.c = false;
                return;
            case 14:
                ai.p9 p9Var = (ai.p9) this.b;
                p9Var.c();
                p9Var.a(true);
                return;
            case 15:
                ((h8) this.b).accept(null);
                return;
            case 16:
                ((aa) this.b).onDetachedFromWindow();
                return;
            case 17:
                ma maVar = (ma) this.b;
                ArrayList arrayList = maVar.c;
                if (arrayList != null) {
                    maVar.a.z1 = arrayList;
                }
                f6 f6Var2 = maVar.a;
                long j3 = maVar.b;
                if (f6Var2.B1 == j3 && f6Var2.z1 == null) {
                    return;
                }
                f6Var2.B1 = j3;
                f6Var2.j1();
                f6Var2.i1();
                f6Var2.f1(true);
                TL_stories.PeerStories peerStories = f6Var2.J0.Q0;
                if (peerStories != null) {
                    f6Var2.S1.S(peerStories, true);
                    return;
                }
                l9 l9Var = f6Var2.S1;
                TL_stories.PeerStories y3 = l9Var.y(j3);
                if (y3 == null) {
                    y3 = l9Var.z(j3);
                    z10 = true;
                }
                l9Var.S(y3, z10);
                return;
            case 18:
                ((i90) this.b).d(true);
                return;
            case 19:
                ((db) this.b).requestLayout();
                return;
            case 20:
                mb mbVar = (mb) this.b;
                f4 f4Var = mbVar.c;
                if (f4Var != null) {
                    f4Var.e(true);
                    mbVar.c = null;
                }
                mbVar.b(false);
                return;
            case 21:
                kb kbVar = (kb) this.b;
                if (kbVar.v) {
                    kbVar.E = true;
                    kbVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    kbVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    kbVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    kbVar.invalidate();
                    return;
                }
                return;
            case 22:
                jc jcVar2 = ((sb) this.b).b;
                try {
                    xb xbVar = jcVar2.s;
                    if (xbVar == null) {
                        return;
                    }
                    if (jcVar2.b) {
                        AndroidUtilities.removeFromParent(xbVar);
                    } else {
                        jcVar2.n.removeView(xbVar);
                    }
                    jcVar2.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((xb) this.b).I0.K(true);
                return;
            case 24:
                ((sc) this.b).c();
                return;
            case 25:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 26:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 27:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 28:
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h == null) {
                            return;
                        }
                        try {
                            o0.i d = pVar.d();
                            int i11 = d.e;
                            if (i11 == 2) {
                                synchronized (pVar.d) {
                                }
                            }
                            if (i11 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            }
                            try {
                                int i12 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                t7.u uVar = pVar.c;
                                Context context = pVar.a;
                                uVar.getClass();
                                o0.i[] iVarArr = {d};
                                v7.h8 h8Var = i0.e.a;
                                a8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = i8.e(pVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(b10, v7.x.a(e));
                                        Trace.endSection();
                                        synchronized (pVar.d) {
                                            try {
                                                v7.w wVar = pVar.h;
                                                if (wVar != null) {
                                                    wVar.b(tVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        pVar.b();
                                        return;
                                    } finally {
                                        int i13 = n0.g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (pVar.d) {
                                try {
                                    v7.w wVar2 = pVar.h;
                                    if (wVar2 != null) {
                                        wVar2.a(th3);
                                    }
                                    pVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            default:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
