package af;

import ag.c2;
import ag.d3;
import ag.f3;
import ag.i1;
import ag.l3;
import ag.p3;
import ag.s1;
import ag.y2;
import ag.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.activity.k;
import androidx.activity.m;
import androidx.emoji2.text.p;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import c2.x;
import cg.f1;
import cg.g1;
import cg.v0;
import com.google.firebase.messaging.t;
import f2.k0;
import g7.l8;
import g7.u;
import g7.v;
import g7.x7;
import g7.y7;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import o0.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.ib0;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(l lVar, u0 u0Var) {
        this.a = 11;
        this.b = lVar;
    }

    private final void a() {
        h hVar = (h) this.b;
        synchronized (((ArrayDeque) hVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) hVar.a).edit();
            String str = (String) hVar.b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) hVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) hVar.c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        c6 c6Var;
        int i11 = 2;
        switch (this.a) {
            case 0:
                ((h) this.b).B();
                return;
            case 1:
                i1 i1Var = ((z0) this.b).c;
                i1Var.n.presentFragment(q91.d0(i1Var.s1(), true));
                return;
            case 2:
                ri0 ri0Var = ((s1) this.b).y;
                ri0Var.getAnimatedDrawable().L(0, true, false);
                ri0Var.d();
                return;
            case 3:
                ((c2) this.b).b.z();
                return;
            case 4:
                d3 d3Var = (d3) this.b;
                int size = 1073741823 - (1073741823 % d3Var.T2.size());
                k0 k0Var = d3Var.U2;
                d3Var.h3 = size;
                k0Var.h1(size, (d3Var.getMeasuredHeight() - d3Var.getChildAt(0).getMeasuredHeight()) >> 1);
                d3Var.w1(null, false);
                return;
            case 5:
                ((f3) this.b).invalidate();
                return;
            case 6:
                ((p3) this.b).a();
                return;
            case 7:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 8:
                k kVar = (k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 9:
                m.a((m) this.b);
                return;
            case 10:
                p pVar = (p) this.b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h == null) {
                            return;
                        }
                        try {
                            j d = pVar.d();
                            int i12 = d.e;
                            if (i12 == 2) {
                                synchronized (pVar.d) {
                                }
                            }
                            if (i12 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                            }
                            try {
                                int i13 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                za.b bVar = pVar.c;
                                Context context = pVar.a;
                                bVar.getClass();
                                j[] jVarArr = {d};
                                x7 x7Var = i0.f.a;
                                l8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.f.a.b(context, jVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e9 = y7.e(pVar.a, d.a);
                                    if (e9 == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        t tVar = new t(b10, v.a(e9));
                                        Trace.endSection();
                                        synchronized (pVar.d) {
                                            try {
                                                u uVar = pVar.h;
                                                if (uVar != null) {
                                                    uVar.b(tVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        pVar.b();
                                        return;
                                    } finally {
                                        int i14 = n0.g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (pVar.d) {
                                try {
                                    u uVar2 = pVar.h;
                                    if (uVar2 != null) {
                                        uVar2.a(th2);
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
            case 11:
                l this$0 = (l) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 12:
                Iterator it = ((j0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 13:
                e0 e0Var = (e0) this.b;
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
            case 14:
                ((b) ((bf.e) this.b).c).a(false);
                return;
            case 15:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 16:
                ((c2.e) this.b).k();
                return;
            case 17:
                ((c2.h) this.b).n = -1;
                return;
            case 18:
                ((x) this.b).b();
                return;
            case 19:
                t tVar2 = (t) this.b;
                ((d3.h) ((e3.c) tVar2.e)).f(new a1.c(tVar2, 6));
                return;
            case 20:
                CharSequence charSequence = (CharSequence) this.b;
                mc X = mc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 21:
                ((cg.z0) this.b).run(null);
                return;
            case 22:
                ((ib0) this.b).run(Collections.EMPTY_LIST);
                return;
            case 23:
                ((v0) this.b).run(null);
                return;
            case 24:
                g1 g1Var = ((f1) this.b).r;
                n2 n2Var = g1Var.n;
                i10 = ((e3) g1Var).currentAccount;
                c6Var = ((e3) g1Var).resourcesProvider;
                y2 y2Var = new y2(n2Var, i10, null, null, null, c6Var);
                y2Var.F0 = true;
                y2Var.Y = true;
                g1Var.n.showDialog(y2Var);
                return;
            case 25:
                ((e3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new l3(i11), 220L);
                return;
            case 26:
                ((ch.h) this.b).Z.N(true);
                return;
            case 27:
                com.google.firebase.messaging.j.a((Intent) this.b);
                return;
            case 28:
                a();
                return;
            default:
                com.google.firebase.messaging.e0 e0Var2 = (com.google.firebase.messaging.e0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var2.a.getAction() + " finishing.");
                e0Var2.b.trySetResult(null);
                return;
        }
    }

    public /* synthetic */ e(com.google.firebase.messaging.j jVar, Intent intent) {
        this.a = 27;
        this.b = intent;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
