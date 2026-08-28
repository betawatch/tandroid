package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import g7.e6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import qh.s5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t3 implements y2.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public t3(Set set, a0.f fVar, String str, String str2, x7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? x7.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(xe.d dVar) {
        if (((xe.d) this.e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(dVar.l);
            }
        }
        ((xe.a) this.c).invalidate();
    }

    public xe.a b() {
        if (((xe.a) this.c) == null) {
            this.c = new xe.a((LaunchActivity) this.d);
        }
        return (xe.a) this.c;
    }

    public void c() {
        e(null);
        x60 x60Var = (x60) this.c;
        if (x60Var != null) {
            x60Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void d(s5 s5Var, ArrayList arrayList) {
        b6 b6Var = (b6) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            qh.k0 k0Var = (qh.k0) obj;
            qh.j0 j0Var = new qh.j0(s5Var.getContext(), k0Var, b6Var);
            j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            j0Var.setBackground(f6.Y(f6.v0(f6.i6, b6Var), 0, 0));
            j0Var.setOnClickListener(new gd0(this, s5Var, k0Var, 7));
            ((LinearLayout) this.d).addView(j0Var, e6.n(-1, 48));
        }
    }

    public void e(s5 s5Var) {
        s5 s5Var2 = (s5) this.h;
        if (s5Var2 == s5Var) {
            return;
        }
        if (s5Var2 != null) {
            s5Var2.setShowCommandBackground(false);
        }
        this.h = s5Var;
        if (s5Var != null) {
            s5Var.setShowCommandBackground(true);
        }
    }

    public void f(s5 s5Var, String str) {
        x60 x60Var;
        x60 x60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = qh.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(s5Var);
        if (((s5) this.f) == s5Var && a2.equals((ArrayList) this.e) && (x60Var2 = (x60) this.c) != null && x60Var2.D()) {
            return;
        }
        if (((s5) this.f) == s5Var && (x60Var = (x60) this.c) != null && x60Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(s5Var, a2);
            ((x60) this.c).O();
            return;
        }
        c();
        e(s5Var);
        this.f = s5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(s5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(s5Var, a2);
        x60 g10 = ((qh.l0) this.a).g(s5Var.getEditText());
        g10.Q = true;
        g10.s = 0;
        g10.t = false;
        g10.r((LinearLayout) this.d, e6.n(220, -2));
        g10.X = AndroidUtilities.dp(240.0f);
        g10.i = 3;
        g10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        g10.p = new pf.o1(this, 4);
        g10.d0 = true;
        if (g10.D()) {
            g10.C();
        }
        g10.Z();
        this.c = g10;
    }

    public void g() {
        xe.d dVar = (xe.d) this.e;
        xe.d dVar2 = null;
        for (xe.d dVar3 : ((HashMap) this.a).values()) {
            if (dVar3.m || dVar3.b.a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.e = dVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(dVar2 != null ? dVar2.c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if ((dVar != null && dVar.f) != (dVar2 != null && dVar2.f)) {
                MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
                if (mediaSessionConnector != null) {
                    mediaSessionConnector.setPlayer(null);
                    this.h = null;
                }
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) this.f;
                if (d0Var != null) {
                    d0Var.c(false);
                    ((android.support.v4.media.session.d0) this.f).b();
                    this.f = null;
                }
                if (dVar2 != null) {
                    android.support.v4.media.session.d0 d0Var2 = new android.support.v4.media.session.d0(launchActivity, "pip-media-session", null, null);
                    this.f = d0Var2;
                    d0Var2.g(null);
                    ((android.support.v4.media.session.d0) this.f).c(true);
                    this.h = new MediaSessionConnector((android.support.v4.media.session.d0) this.f);
                }
            }
            if (dVar != null) {
                ze.e eVar = dVar.b;
                eVar.n = false;
                eVar.h();
                xe.d dVar4 = eVar.j;
                t3 t3Var = dVar4.a;
                xe.b bVar = (xe.b) t3Var.b;
                xe.b bVar2 = (xe.b) t3Var.b;
                bVar.a.remove(eVar);
                bVar2.b.remove(eVar);
                String str = dVar4.c;
                HashMap hashMap = bVar2.c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (dVar2 != null) {
                MediaSessionConnector mediaSessionConnector2 = (MediaSessionConnector) this.h;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(dVar2.l);
                }
                ((xe.a) this.c).bringToFront();
                ze.e eVar2 = dVar2.b;
                xe.d dVar5 = eVar2.j;
                t3 t3Var2 = dVar5.a;
                xe.b bVar3 = (xe.b) t3Var2.b;
                xe.b bVar4 = (xe.b) t3Var2.b;
                bVar3.a.add(eVar2);
                bVar4.b.add(eVar2);
                String str2 = dVar5.c;
                HashMap hashMap2 = bVar4.c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((xe.a) this.c).invalidate();
        }
    }

    @Override // nc.a
    public Object get() {
        Context context = (Context) ((nc.a) this.a).get();
        x2.d dVar = (x2.d) ((nc.a) this.b).get();
        d3.d dVar2 = (d3.d) ((nc.a) this.c).get();
        a5.m mVar = (a5.m) ((a5.m) this.d).get();
        Executor executor = (Executor) ((nc.a) this.e).get();
        e3.c cVar = (e3.c) ((nc.a) this.f).get();
        ya.b bVar = new ya.b(7);
        wa.a aVar = new wa.a(7);
        d3.c cVar2 = (d3.c) ((nc.a) this.h).get();
        c3.h hVar = new c3.h();
        hVar.a = context;
        hVar.b = dVar;
        hVar.c = dVar2;
        hVar.d = mVar;
        hVar.e = executor;
        hVar.f = cVar;
        hVar.g = bVar;
        hVar.h = aVar;
        hVar.i = cVar2;
        return hVar;
    }

    public t3(qh.l0 l0Var, b6 b6Var) {
        this.a = l0Var;
        this.b = b6Var;
    }

    public t3(String str, j9.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.l(this, false);
        this.e = new com.google.firebase.messaging.l(this, true);
        this.f = new n2.w(5, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new f9.g(cVar);
        this.b = tVar;
    }
}
