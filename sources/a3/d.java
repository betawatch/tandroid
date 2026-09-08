package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.t0;
import bi.a2;
import bi.f7;
import bi.g4;
import bi.gb;
import bi.h5;
import bi.i9;
import bi.ja;
import bi.l4;
import bi.n6;
import bi.o5;
import bi.ob;
import bi.pb;
import bi.q7;
import bi.r1;
import bi.s1;
import bi.s6;
import bi.t1;
import bi.t9;
import bi.u8;
import bi.y8;
import di.b1;
import di.o9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.co;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
import sg.a1;
import v7.h8;
import v7.i8;
import w7.z7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.k kVar, t0 t0Var) {
        this.a = 9;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ((f) this.b).g.K();
                return;
            case 1:
                ((w) this.b).k--;
                return;
            case 2:
                ah.g0 g0Var = (ah.g0) ((a6.m) this.b).b;
                ah.f0 f0Var = g0Var.b;
                if (f0Var != null) {
                    f0Var.d();
                }
                g0Var.a.z7(true);
                return;
            case 3:
                ((ValueAnimator) this.b).start();
                return;
            case 4:
                n2 n2Var = ((ah.o0) this.b).f2.r;
                if (n2Var instanceof co) {
                    n2Var.showDialog(new a1(n2Var, 11, false));
                    return;
                }
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new a1(n2Var, 11, false));
                    return;
                }
                return;
            case 5:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
                return;
            case 6:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 7:
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            case 8:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.i d = qVar.d();
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
                                na.d dVar = qVar.c;
                                Context context = qVar.a;
                                dVar.getClass();
                                o0.i[] iVarArr = {d};
                                h8 h8Var = i0.f.a;
                                z7.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.f.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e7 = i8.e(qVar.a, d.a);
                                    if (e7 == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, v7.x.a(e7));
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
            case 9:
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 10:
                Iterator it = ((androidx.fragment.app.i0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 11:
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
            case 12:
                uy uyVar = ((lx) this.b).O0;
                if (uyVar.L && uyVar.X3().G()) {
                    uyVar.E0.h();
                    return;
                } else {
                    uyVar.x4(true, true);
                    return;
                }
            case 13:
                ((r1) this.b).a.t(false);
                return;
            case 14:
                t1 t1Var = ((s1) this.b).a;
                NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.g()));
                return;
            case 15:
                a2 a2Var = (a2) this.b;
                a2Var.H = false;
                a2Var.p(false);
                a2Var.T = false;
                return;
            case 16:
                ((g4) this.b).a.Q0();
                return;
            case 17:
                o5 o5Var = ((l4) this.b).x;
                h5 h5Var = o5Var.Q1;
                if (h5Var != null) {
                    if (o5Var.T1 || o5Var.U1 || o5Var.V1) {
                        if (o5Var.O1.e) {
                            ((ob) o5Var.M2.c).loopBack();
                            return;
                        } else {
                            o5Var.W0 = 0L;
                            return;
                        }
                    }
                    pb pbVar = ((gb) h5Var).d;
                    if (pbVar.n0.getCurrentPeerView().d1(true) || pbVar.n0.E(true)) {
                        return;
                    }
                    pbVar.q(true);
                    return;
                }
                return;
            case 18:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i13 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 20:
                s6.a(((n6) this.b).d);
                return;
            case 21:
                f7 f7Var = (f7) this.b;
                if (f7Var.isShowing()) {
                    f7Var.q(true);
                    return;
                }
                return;
            case 22:
                ((o9) this.b).run();
                return;
            case 23:
                b1 b1Var = (b1) this.b;
                b1Var.c(b1Var.b);
                b1Var.c = false;
                return;
            case 24:
                y8 y8Var = (y8) this.b;
                y8Var.c();
                y8Var.a(true);
                return;
            case 25:
                ((q7) this.b).accept(null);
                return;
            case 26:
                ((i9) this.b).onDetachedFromWindow();
                return;
            case 27:
                t9 t9Var = (t9) this.b;
                ArrayList arrayList = t9Var.c;
                if (arrayList != null) {
                    t9Var.a.z1 = arrayList;
                }
                o5 o5Var2 = t9Var.a;
                long j3 = t9Var.b;
                if (o5Var2.B1 == j3 && o5Var2.z1 == null) {
                    return;
                }
                o5Var2.B1 = j3;
                o5Var2.j1();
                o5Var2.i1();
                o5Var2.f1(true);
                TL_stories.PeerStories peerStories = o5Var2.J0.Q0;
                if (peerStories != null) {
                    o5Var2.S1.S(peerStories, true);
                    return;
                }
                u8 u8Var = o5Var2.S1;
                TL_stories.PeerStories y3 = u8Var.y(j3);
                if (y3 == null) {
                    y3 = u8Var.z(j3);
                    z10 = true;
                }
                u8Var.S(y3, z10);
                return;
            case 28:
                ((a90) this.b).d(true);
                return;
            default:
                ((ja) this.b).requestLayout();
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
