package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import h7.z5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.LaunchActivity;
import rh.t5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public t3(Set set, a0.f fVar, String str, String str2, y7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? y7.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(ye.d dVar) {
        if (((ye.d) this.e) == dVar) {
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
        ((ye.a) this.c).invalidate();
    }

    public ye.a b() {
        if (((ye.a) this.c) == null) {
            this.c = new ye.a((LaunchActivity) this.d);
        }
        return (ye.a) this.c;
    }

    public void c() {
        e(null);
        b70 b70Var = (b70) this.c;
        if (b70Var != null) {
            b70Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void d(t5 t5Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.b;
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
            rh.k0 k0Var = (rh.k0) obj;
            rh.j0 j0Var = new rh.j0(t5Var.getContext(), k0Var, c6Var);
            j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            j0Var.setBackground(g6.Y(g6.v0(g6.i6, c6Var), 0, 0));
            j0Var.setOnClickListener(new ld0(this, t5Var, k0Var, 7));
            ((LinearLayout) this.d).addView(j0Var, z5.n(-1, 48));
        }
    }

    public void e(t5 t5Var) {
        t5 t5Var2 = (t5) this.h;
        if (t5Var2 == t5Var) {
            return;
        }
        if (t5Var2 != null) {
            t5Var2.setShowCommandBackground(false);
        }
        this.h = t5Var;
        if (t5Var != null) {
            t5Var.setShowCommandBackground(true);
        }
    }

    public void f(t5 t5Var, String str) {
        b70 b70Var;
        b70 b70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = rh.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(t5Var);
        if (((t5) this.f) == t5Var && a2.equals((ArrayList) this.e) && (b70Var2 = (b70) this.c) != null && b70Var2.D()) {
            return;
        }
        if (((t5) this.f) == t5Var && (b70Var = (b70) this.c) != null && b70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(t5Var, a2);
            ((b70) this.c).O();
            return;
        }
        c();
        e(t5Var);
        this.f = t5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(t5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(t5Var, a2);
        b70 e9 = ((rh.l0) this.a).e(t5Var.getEditText());
        e9.Q = true;
        e9.s = 0;
        e9.t = false;
        e9.r((LinearLayout) this.d, z5.n(220, -2));
        e9.X = AndroidUtilities.dp(240.0f);
        e9.i = 3;
        e9.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        e9.p = new qf.b(this, 11);
        e9.d0 = true;
        if (e9.D()) {
            e9.C();
        }
        e9.Z();
        this.c = e9;
    }

    public void g() {
        ye.d dVar = (ye.d) this.e;
        ye.d dVar2 = null;
        for (ye.d dVar3 : ((HashMap) this.a).values()) {
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
                af.f fVar = dVar.b;
                fVar.n = false;
                fVar.h();
                ye.d dVar4 = fVar.j;
                t3 t3Var = dVar4.a;
                ye.b bVar = (ye.b) t3Var.b;
                ye.b bVar2 = (ye.b) t3Var.b;
                bVar.a.remove(fVar);
                bVar2.b.remove(fVar);
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
                ((ye.a) this.c).bringToFront();
                af.f fVar2 = dVar2.b;
                ye.d dVar5 = fVar2.j;
                t3 t3Var2 = dVar5.a;
                ye.b bVar3 = (ye.b) t3Var2.b;
                ye.b bVar4 = (ye.b) t3Var2.b;
                bVar3.a.add(fVar2);
                bVar4.b.add(fVar2);
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
            ((ye.a) this.c).invalidate();
        }
    }

    @Override // oc.a
    public Object get() {
        Context context = (Context) ((oc.a) this.a).get();
        x2.d dVar = (x2.d) ((oc.a) this.b).get();
        d3.d dVar2 = (d3.d) ((oc.a) this.c).get();
        a5.n nVar = (a5.n) ((a5.n) this.d).get();
        Executor executor = (Executor) ((oc.a) this.e).get();
        e3.c cVar = (e3.c) ((oc.a) this.f).get();
        w9.d dVar3 = new w9.d(6);
        e7.v vVar = new e7.v(6);
        d3.c cVar2 = (d3.c) ((oc.a) this.h).get();
        c3.g gVar = new c3.g();
        gVar.a = context;
        gVar.b = dVar;
        gVar.c = dVar2;
        gVar.d = nVar;
        gVar.e = executor;
        gVar.f = cVar;
        gVar.g = dVar3;
        gVar.h = vVar;
        gVar.i = cVar2;
        return gVar;
    }

    public t3(rh.l0 l0Var, c6 c6Var) {
        this.a = l0Var;
        this.b = c6Var;
    }

    public t3(String str, k9.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.l(this, false);
        this.e = new com.google.firebase.messaging.l(this, true);
        this.f = new n2.v(6, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new g9.g(cVar);
        this.b = tVar;
    }
}
