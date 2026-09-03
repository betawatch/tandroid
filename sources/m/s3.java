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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.q31;
import org.telegram.ui.LaunchActivity;
import ph.ga;
import vh.w5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s3 implements a3.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public s3(Set set, a0.f fVar, String str, String str2, b8.a aVar) {
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

    public void a(bf.f fVar) {
        if (((bf.f) this.e) == fVar) {
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
        ((bf.a) this.c).invalidate();
    }

    public bf.a b() {
        if (((bf.a) this.c) == null) {
            this.c = new bf.a((LaunchActivity) this.d);
        }
        return (bf.a) this.c;
    }

    public void c() {
        e(null);
        p70 p70Var = (p70) this.c;
        if (p70Var != null) {
            p70Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void d(w5 w5Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.b;
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
            vh.l0 l0Var = (vh.l0) obj;
            vh.k0 k0Var = new vh.k0(w5Var.getContext(), l0Var, f6Var);
            k0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            k0Var.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 0, 0));
            k0Var.setOnClickListener(new q31(this, w5Var, l0Var, 8));
            ((LinearLayout) this.d).addView(k0Var, b6.n(-1, 48));
        }
    }

    public void e(w5 w5Var) {
        w5 w5Var2 = (w5) this.h;
        if (w5Var2 == w5Var) {
            return;
        }
        if (w5Var2 != null) {
            w5Var2.setShowCommandBackground(false);
        }
        this.h = w5Var;
        if (w5Var != null) {
            w5Var.setShowCommandBackground(true);
        }
    }

    public void f(w5 w5Var, String str) {
        p70 p70Var;
        p70 p70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = vh.l0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(w5Var);
        if (((w5) this.f) == w5Var && a2.equals((ArrayList) this.e) && (p70Var2 = (p70) this.c) != null && p70Var2.D()) {
            return;
        }
        if (((w5) this.f) == w5Var && (p70Var = (p70) this.c) != null && p70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(w5Var, a2);
            ((p70) this.c).O();
            return;
        }
        c();
        e(w5Var);
        this.f = w5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(w5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(w5Var, a2);
        p70 a10 = ((vh.m0) this.a).a(w5Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, b6.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new ga(this, 28);
        a10.d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.c = a10;
    }

    public void g() {
        bf.f fVar = (bf.f) this.e;
        bf.f fVar2 = null;
        for (bf.f fVar3 : ((HashMap) this.a).values()) {
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
                df.e eVar = fVar.b;
                eVar.n = false;
                eVar.h();
                bf.f fVar4 = eVar.j;
                s3 s3Var = fVar4.a;
                bf.c cVar2 = (bf.c) s3Var.b;
                bf.c cVar3 = (bf.c) s3Var.b;
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
                ((bf.a) this.c).bringToFront();
                df.e eVar2 = fVar2.b;
                bf.f fVar5 = eVar2.j;
                s3 s3Var2 = fVar5.a;
                bf.c cVar5 = (bf.c) s3Var2.b;
                bf.c cVar6 = (bf.c) s3Var2.b;
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
            ((bf.a) this.c).invalidate();
        }
    }

    @Override // rc.a
    public Object get() {
        Context context = (Context) ((rc.a) this.a).get();
        z2.d dVar = (z2.d) ((rc.a) this.b).get();
        f3.d dVar2 = (f3.d) ((rc.a) this.c).get();
        af.d dVar3 = (af.d) ((af.d) this.d).get();
        Executor executor = (Executor) ((rc.a) this.e).get();
        g3.c cVar = (g3.c) ((rc.a) this.f).get();
        h7.u uVar = new h7.u(7);
        db.a aVar = new db.a(7);
        f3.c cVar2 = (f3.c) ((rc.a) this.h).get();
        e3.g gVar = new e3.g();
        gVar.a = context;
        gVar.b = dVar;
        gVar.c = dVar2;
        gVar.d = dVar3;
        gVar.e = executor;
        gVar.f = cVar;
        gVar.g = uVar;
        gVar.h = aVar;
        gVar.i = cVar2;
        return gVar;
    }

    public s3(vh.m0 m0Var, f6 f6Var) {
        this.a = m0Var;
        this.b = f6Var;
    }

    public s3(String str, n9.b bVar, rf.f fVar) {
        this.d = new cb.m(this, false);
        this.e = new cb.m(this, true);
        this.f = new p2.w(7, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new j9.g(bVar);
        this.b = fVar;
    }
}
