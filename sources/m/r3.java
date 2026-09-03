package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.q70;
import org.telegram.ui.LaunchActivity;
import qh.u9;
import wh.v5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r3 implements a3.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public r3(Set set, a0.f fVar, String str, String str2, b8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? b8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(cf.f fVar) {
        if (((cf.f) this.e) == fVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, fVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            q3.c cVar = (q3.c) this.h;
            if (cVar != null) {
                cVar.d(fVar.l);
            }
        }
        ((cf.a) this.c).invalidate();
    }

    public cf.a b() {
        if (((cf.a) this.c) == null) {
            this.c = new cf.a((LaunchActivity) this.d);
        }
        return (cf.a) this.c;
    }

    public void c() {
        e(null);
        q70 q70Var = (q70) this.c;
        if (q70Var != null) {
            q70Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void d(v5 v5Var, ArrayList arrayList) {
        g6 g6Var = (g6) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            wh.l0 l0Var = (wh.l0) obj;
            wh.k0 k0Var = new wh.k0(v5Var.getContext(), l0Var, g6Var);
            k0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            k0Var.setBackground(k6.Y(k6.v0(k6.i6, g6Var), 0, 0));
            k0Var.setOnClickListener(new q31(this, v5Var, l0Var, 8));
            ((LinearLayout) this.d).addView(k0Var, c6.n(-1, 48));
        }
    }

    public void e(v5 v5Var) {
        v5 v5Var2 = (v5) this.h;
        if (v5Var2 == v5Var) {
            return;
        }
        if (v5Var2 != null) {
            v5Var2.setShowCommandBackground(false);
        }
        this.h = v5Var;
        if (v5Var != null) {
            v5Var.setShowCommandBackground(true);
        }
    }

    public void f(v5 v5Var, String str) {
        q70 q70Var;
        q70 q70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = wh.l0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(v5Var);
        if (((v5) this.f) == v5Var && a2.equals((ArrayList) this.e) && (q70Var2 = (q70) this.c) != null && q70Var2.D()) {
            return;
        }
        if (((v5) this.f) == v5Var && (q70Var = (q70) this.c) != null && q70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(v5Var, a2);
            ((q70) this.c).O();
            return;
        }
        c();
        e(v5Var);
        this.f = v5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(v5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(v5Var, a2);
        q70 a10 = ((wh.m0) this.a).a(v5Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, c6.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new u9(this, 29);
        a10.d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.c = a10;
    }

    public void g() {
        cf.f fVar = (cf.f) this.e;
        cf.f fVar2 = null;
        for (cf.f fVar3 : ((HashMap) this.a).values()) {
            if (fVar3.m || fVar3.b.a != 0) {
                if (fVar2 == null || fVar3.d > fVar2.d) {
                    fVar2 = fVar3;
                }
            }
        }
        if (fVar != fVar2) {
            this.e = fVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb = new StringBuilder("onMaxPrioritySourceChanged ");
            sb.append(fVar2 != null ? fVar2.c : null);
            Log.i("PIP_DEBUG", sb.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, fVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if ((fVar != null && fVar.f) != (fVar2 != null && fVar2.f)) {
                q3.c cVar = (q3.c) this.h;
                if (cVar != null) {
                    cVar.d(null);
                    this.h = null;
                }
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f;
                if (c0Var != null) {
                    c0Var.c(false);
                    ((android.support.v4.media.session.c0) this.f).b();
                    this.f = null;
                }
                if (fVar2 != null) {
                    android.support.v4.media.session.c0 c0Var2 = new android.support.v4.media.session.c0(launchActivity, "pip-media-session", null, null);
                    this.f = c0Var2;
                    c0Var2.g(null);
                    ((android.support.v4.media.session.c0) this.f).c(true);
                    this.h = new q3.c((android.support.v4.media.session.c0) this.f);
                }
            }
            if (fVar != null) {
                ef.e eVar = fVar.b;
                eVar.n = false;
                eVar.h();
                cf.f fVar4 = eVar.j;
                r3 r3Var = fVar4.a;
                cf.c cVar2 = (cf.c) r3Var.b;
                cf.c cVar3 = (cf.c) r3Var.b;
                cVar2.a.remove(eVar);
                cVar3.b.remove(eVar);
                String str = fVar4.c;
                HashMap hashMap = cVar3.c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (fVar2 != null) {
                q3.c cVar4 = (q3.c) this.h;
                if (cVar4 != null) {
                    cVar4.d(fVar2.l);
                }
                ((cf.a) this.c).bringToFront();
                ef.e eVar2 = fVar2.b;
                cf.f fVar5 = eVar2.j;
                r3 r3Var2 = fVar5.a;
                cf.c cVar5 = (cf.c) r3Var2.b;
                cf.c cVar6 = (cf.c) r3Var2.b;
                cVar5.a.add(eVar2);
                cVar6.b.add(eVar2);
                String str2 = fVar5.c;
                HashMap hashMap2 = cVar6.c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((cf.a) this.c).invalidate();
        }
    }

    @Override // rc.a
    public Object get() {
        Context context = (Context) ((rc.a) this.a).get();
        z2.e eVar = (z2.e) ((rc.a) this.b).get();
        f3.d dVar = (f3.d) ((rc.a) this.c).get();
        androidx.biometric.e eVar2 = (androidx.biometric.e) ((androidx.biometric.e) this.d).get();
        Executor executor = (Executor) ((rc.a) this.e).get();
        g3.c cVar = (g3.c) ((rc.a) this.f).get();
        z9.d dVar2 = new z9.d(7);
        h7.u uVar = new h7.u(7);
        f3.c cVar2 = (f3.c) ((rc.a) this.h).get();
        e3.g gVar = new e3.g();
        gVar.a = context;
        gVar.b = eVar;
        gVar.c = dVar;
        gVar.d = eVar2;
        gVar.e = executor;
        gVar.f = cVar;
        gVar.g = dVar2;
        gVar.h = uVar;
        gVar.i = cVar2;
        return gVar;
    }

    public r3(wh.m0 m0Var, g6 g6Var) {
        this.a = m0Var;
        this.b = g6Var;
    }

    public r3(String str, n9.b bVar, sf.f fVar) {
        this.d = new cb.m(this, false);
        this.e = new cb.m(this, true);
        this.f = new p2.v(6, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new j9.g(bVar);
        this.b = fVar;
    }
}
