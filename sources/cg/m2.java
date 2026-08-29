package cg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ih.x3;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import jh.va;
import jh.z9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tm;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        c6 c6Var;
        switch (this.a) {
            case 0:
                ((n2) this.b).invalidate();
                return;
            case 1:
                ((w2) this.b).a();
                return;
            case 2:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 3:
                a5.j jVar = (a5.j) this.b;
                synchronized (((ArrayDeque) jVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) jVar.a).edit();
                    String str = (String) jVar.b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) jVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) jVar.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 4:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.a.getAction() + " finishing.");
                e0Var.b.trySetResult(null);
                return;
            case 5:
                ((cf.b) ((c2.p) this.b).c).a(false);
                return;
            case 6:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                ((f3.h) ((g3.c) sVar.e)).f(new a1.c(sVar, 26));
                return;
            case 7:
                CharSequence charSequence = (CharSequence) this.b;
                tc X = tc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 8:
                ((eg.y0) this.b).run(null);
                return;
            case 9:
                ((tm) this.b).run(Collections.EMPTY_LIST);
                return;
            case 10:
                ((eg.u0) this.b).run(null);
                return;
            case 11:
                eg.f1 f1Var = ((eg.e1) this.b).r;
                org.telegram.ui.ActionBar.o2 o2Var = f1Var.n;
                i10 = ((f3) f1Var).currentAccount;
                c6Var = ((f3) f1Var).resourcesProvider;
                f2 f2Var = new f2(o2Var, i10, null, null, null, c6Var);
                f2Var.F0 = true;
                f2Var.Y = true;
                f1Var.n.showDialog(f2Var);
                return;
            case 12:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new ag.o0(6), 220L);
                return;
            case 13:
                ((eh.f) this.b).Z.N(true);
                return;
            case 14:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 15:
                ((f5.b0) this.b).getClass();
                return;
            case 16:
                hh.u uVar = (hh.u) this.b;
                uVar.f();
                uVar.e(true);
                return;
            case 17:
                ((ig.c) this.b).f();
                return;
            case 18:
                ih.t tVar = (ih.t) this.b;
                tVar.d0.setTranslationX(tVar.c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 19:
                ((ih.n0) this.b).onBackPressed();
                return;
            case 20:
                k51 k51Var = ((ih.h2) this.b).U;
                if (k51Var != null) {
                    k51Var.N(false);
                    return;
                }
                return;
            case 21:
                ((ih.v1) this.b).c();
                return;
            case 22:
                ih.d2 d2Var = (ih.d2) this.b;
                va vaVar = d2Var.e;
                if (vaVar != null) {
                    vaVar.d();
                    d2Var.invalidateSelf();
                    return;
                }
                return;
            case 23:
                ((x3) this.b).o();
                return;
            case 24:
                j3.k0 k0Var = ((j3.h0) this.b).a;
                k0Var.g0(null);
                k0Var.a0(0, 0);
                return;
            case 25:
                try {
                    j3.q0.d((j3.e2) this.b);
                    return;
                } catch (j3.n e10) {
                    f5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 26:
                ((j3.m2) this.b).d();
                return;
            case 27:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                jf.p pVar = (jf.p) this.b;
                long j10 = pVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.b = j11;
                    pVar.a.e(j11);
                }
                if (pVar.b <= 0) {
                    pVar.c = false;
                }
                if (pVar.c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
            default:
                jh.b bVar = (jh.b) this.b;
                bVar.getClass();
                new z9(bVar.getContext(), bVar.b).show();
                return;
        }
    }

    public /* synthetic */ m2(j3.h0 h0Var, SurfaceTexture surfaceTexture) {
        this.a = 24;
        this.b = h0Var;
    }

    public /* synthetic */ m2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
