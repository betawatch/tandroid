package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import i7.f6;
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
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.LaunchActivity;
import th.t5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public s3(Set set, a0.f fVar, String str, String str2, z7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? z7.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(af.g gVar) {
        if (((af.g) this.e) == gVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (gVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, gVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(gVar.l);
            }
        }
        ((af.a) this.c).invalidate();
    }

    public af.a b() {
        if (((af.a) this.c) == null) {
            this.c = new af.a((LaunchActivity) this.d);
        }
        return (af.a) this.c;
    }

    public void c() {
        e(null);
        j70 j70Var = (j70) this.c;
        if (j70Var != null) {
            j70Var.u();
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
            th.k0 k0Var = (th.k0) obj;
            th.j0 j0Var = new th.j0(t5Var.getContext(), k0Var, c6Var);
            j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            j0Var.setBackground(g6.Y(g6.v0(g6.i6, c6Var), 0, 0));
            j0Var.setOnClickListener(new ya0(this, t5Var, k0Var, 8));
            ((LinearLayout) this.d).addView(j0Var, f6.n(-1, 48));
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
        j70 j70Var;
        j70 j70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = th.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(t5Var);
        if (((t5) this.f) == t5Var && a2.equals((ArrayList) this.e) && (j70Var2 = (j70) this.c) != null && j70Var2.D()) {
            return;
        }
        if (((t5) this.f) == t5Var && (j70Var = (j70) this.c) != null && j70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(t5Var, a2);
            ((j70) this.c).O();
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
        j70 b10 = ((th.l0) this.a).b(t5Var.getEditText());
        b10.Q = true;
        b10.s = 0;
        b10.t = false;
        b10.r((LinearLayout) this.d, f6.n(220, -2));
        b10.X = AndroidUtilities.dp(240.0f);
        b10.i = 3;
        b10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        b10.p = new org.telegram.ui.web.t1(this, 25);
        b10.d0 = true;
        if (b10.D()) {
            b10.C();
        }
        b10.Z();
        this.c = b10;
    }

    public void g() {
        af.g gVar = (af.g) this.e;
        af.g gVar2 = null;
        for (af.g gVar3 : ((HashMap) this.a).values()) {
            if (gVar3.m || gVar3.b.a != 0) {
                if (gVar2 == null || gVar3.d > gVar2.d) {
                    gVar2 = gVar3;
                }
            }
        }
        if (gVar != gVar2) {
            this.e = gVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(gVar2 != null ? gVar2.c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (gVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, gVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if ((gVar != null && gVar.f) != (gVar2 != null && gVar2.f)) {
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
                if (gVar2 != null) {
                    android.support.v4.media.session.d0 d0Var2 = new android.support.v4.media.session.d0(launchActivity, "pip-media-session", null, null);
                    this.f = d0Var2;
                    d0Var2.g(null);
                    ((android.support.v4.media.session.d0) this.f).c(true);
                    this.h = new MediaSessionConnector((android.support.v4.media.session.d0) this.f);
                }
            }
            if (gVar != null) {
                cf.e eVar = gVar.b;
                eVar.n = false;
                eVar.h();
                af.g gVar4 = eVar.j;
                s3 s3Var = gVar4.a;
                af.d dVar = (af.d) s3Var.b;
                af.d dVar2 = (af.d) s3Var.b;
                dVar.a.remove(eVar);
                dVar2.b.remove(eVar);
                String str = gVar4.c;
                HashMap hashMap = dVar2.c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (gVar2 != null) {
                MediaSessionConnector mediaSessionConnector2 = (MediaSessionConnector) this.h;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(gVar2.l);
                }
                ((af.a) this.c).bringToFront();
                cf.e eVar2 = gVar2.b;
                af.g gVar5 = eVar2.j;
                s3 s3Var2 = gVar5.a;
                af.d dVar3 = (af.d) s3Var2.b;
                af.d dVar4 = (af.d) s3Var2.b;
                dVar3.a.add(eVar2);
                dVar4.b.add(eVar2);
                String str2 = gVar5.c;
                HashMap hashMap2 = dVar4.c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (gVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((af.a) this.c).invalidate();
        }
    }

    @Override // pc.a
    public Object get() {
        Context context = (Context) ((pc.a) this.a).get();
        z2.d dVar = (z2.d) ((pc.a) this.b).get();
        f3.d dVar2 = (f3.d) ((pc.a) this.c).get();
        androidx.biometric.e eVar = (androidx.biometric.e) ((androidx.biometric.e) this.d).get();
        Executor executor = (Executor) ((pc.a) this.e).get();
        g3.c cVar = (g3.c) ((pc.a) this.f).get();
        f7.v vVar = new f7.v(8);
        bb.a aVar = new bb.a(8);
        f3.c cVar2 = (f3.c) ((pc.a) this.h).get();
        e3.f fVar = new e3.f();
        fVar.a = context;
        fVar.b = dVar;
        fVar.c = dVar2;
        fVar.d = eVar;
        fVar.e = executor;
        fVar.f = cVar;
        fVar.g = vVar;
        fVar.h = aVar;
        fVar.i = cVar2;
        return fVar;
    }

    public s3(th.l0 l0Var, c6 c6Var) {
        this.a = l0Var;
        this.b = c6Var;
    }

    public s3(String str, l9.b bVar, com.google.firebase.messaging.s sVar) {
        this.d = new ab.m(this, false);
        this.e = new ab.m(this, true);
        this.f = new p2.u(7, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new h9.g(bVar);
        this.b = sVar;
    }
}
