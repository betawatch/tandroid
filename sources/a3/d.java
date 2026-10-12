package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.t0;
import bi.b2;
import bi.b9;
import bi.j4;
import bi.j5;
import bi.j7;
import bi.jb;
import bi.l7;
import bi.o4;
import bi.q5;
import bi.q6;
import bi.r1;
import bi.rb;
import bi.s1;
import bi.sb;
import bi.t1;
import bi.w6;
import bi.w9;
import bi.x8;
import di.a1;
import di.l9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fo;
import org.telegram.ui.px;
import org.telegram.ui.yy;
import sg.y0;
import v7.y7;
import v7.z7;
import w7.d8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.k kVar, t0 t0Var) {
        this.a = 10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ((f) this.b).h.e();
                return;
            case 1:
                ((w) this.b).m--;
                return;
            case 2:
                r0.a.postVsyncCallback((e0) this.b);
                return;
            case 3:
                ah.f0 f0Var = (ah.f0) ((qb.c) this.b).b;
                ah.e0 e0Var = f0Var.b;
                if (e0Var != null) {
                    e0Var.d();
                }
                f0Var.a.C7(true);
                return;
            case 4:
                ((ValueAnimator) this.b).start();
                return;
            case 5:
                m2 m2Var = ((ah.n0) this.b).f2.r;
                if (m2Var instanceof fo) {
                    m2Var.showDialog(new y0(m2Var, 11, false));
                    return;
                }
                m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new y0(m2Var, 11, false));
                    return;
                }
                return;
            case 6:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
                return;
            case 7:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 8:
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            case 9:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.h d = qVar.d();
                            int i10 = d.e;
                            if (i10 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                sb.a aVar = qVar.c;
                                Context context = qVar.a;
                                aVar.getClass();
                                o0.h[] hVarArr = {d};
                                y7 y7Var = i0.e.a;
                                d8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = z7.e(qVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        qi.e eVar = new qi.e(b10, v7.u.a(e));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                v7.t tVar = qVar.h;
                                                if (tVar != null) {
                                                    tVar.b(eVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i12 = n0.g.a;
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
                                    v7.t tVar2 = qVar.h;
                                    if (tVar2 != null) {
                                        tVar2.a(th3);
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
            case 10:
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 11:
                Iterator it = ((androidx.fragment.app.i0) this.b).n.iterator();
                if (it.hasNext()) {
                    throw a1.g.j(it);
                }
                return;
            case 12:
                androidx.lifecycle.e0 e0Var2 = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var2.f;
                if (e0Var2.b == 0) {
                    e0Var2.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var2.a == 0 && e0Var2.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var2.d = true;
                    return;
                }
                return;
            case 13:
                yy yyVar = ((px) this.b).O0;
                if (yyVar.L && yyVar.U3().G()) {
                    yyVar.E0.h();
                    return;
                } else {
                    yyVar.u4(true, true);
                    return;
                }
            case 14:
                ((r1) this.b).a.t(false);
                return;
            case 15:
                t1 t1Var = ((s1) this.b).a;
                NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.g()));
                return;
            case 16:
                b2 b2Var = (b2) this.b;
                b2Var.H = false;
                b2Var.o(false);
                b2Var.T = false;
                return;
            case 17:
                ((j4) this.b).a.Q0();
                return;
            case 18:
                q5 q5Var = ((o4) this.b).x;
                j5 j5Var = q5Var.Q1;
                if (j5Var != null) {
                    if (q5Var.T1 || q5Var.U1 || q5Var.V1) {
                        if (q5Var.O1.e) {
                            ((rb) q5Var.M2.c).loopBack();
                            return;
                        } else {
                            q5Var.W0 = 0L;
                            return;
                        }
                    }
                    sb sbVar = ((jb) j5Var).d;
                    if (sbVar.n0.getCurrentPeerView().d1(true) || sbVar.n0.E(true)) {
                        return;
                    }
                    sbVar.q(true);
                    return;
                }
                return;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i13 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 21:
                w6.a(((q6) this.b).d);
                return;
            case 22:
                j7 j7Var = (j7) this.b;
                if (j7Var.isShowing()) {
                    j7Var.s(true);
                    return;
                }
                return;
            case 23:
                ((l9) this.b).run();
                return;
            case 24:
                a1 a1Var = (a1) this.b;
                a1Var.c(a1Var.b);
                a1Var.c = false;
                return;
            case 25:
                b9 b9Var = (b9) this.b;
                b9Var.c();
                b9Var.a(true);
                return;
            case 26:
                ((l7) this.b).run(null);
                return;
            case 27:
                ((bi.l9) this.b).onDetachedFromWindow();
                return;
            case 28:
                w9 w9Var = (w9) this.b;
                ArrayList arrayList = w9Var.c;
                if (arrayList != null) {
                    w9Var.a.z1 = arrayList;
                }
                q5 q5Var2 = w9Var.a;
                long j10 = w9Var.b;
                if (q5Var2.B1 == j10 && q5Var2.z1 == null) {
                    return;
                }
                q5Var2.B1 = j10;
                q5Var2.j1();
                q5Var2.i1();
                q5Var2.f1(true);
                TL_stories.PeerStories peerStories = q5Var2.J0.Q0;
                if (peerStories != null) {
                    q5Var2.S1.S(peerStories, true);
                    return;
                }
                x8 x8Var = q5Var2.S1;
                TL_stories.PeerStories y3 = x8Var.y(j10);
                if (y3 == null) {
                    y3 = x8Var.z(j10);
                    z10 = true;
                }
                x8Var.S(y3, z10);
                return;
            default:
                ((aa0) this.b).d(true);
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
