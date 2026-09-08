package m;

import android.content.Context;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ji.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n70;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p3 implements n5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? n8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a() {
        c(null);
        n70 n70Var = (n70) this.c;
        if (n70Var != null) {
            n70Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(g6 g6Var, ArrayList arrayList) {
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
            ji.n0 n0Var = (ji.n0) obj;
            ji.m0 m0Var = new ji.m0(g6Var.getContext(), n0Var, f6Var);
            m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            m0Var.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 0, 0));
            m0Var.setOnClickListener(new bi.x(this, g6Var, n0Var, 10));
            ((LinearLayout) this.d).addView(m0Var, x5.n(-1, 48));
        }
    }

    public void c(g6 g6Var) {
        g6 g6Var2 = (g6) this.h;
        if (g6Var2 == g6Var) {
            return;
        }
        if (g6Var2 != null) {
            g6Var2.setShowCommandBackground(false);
        }
        this.h = g6Var;
        if (g6Var != null) {
            g6Var.setShowCommandBackground(true);
        }
    }

    public void d(g6 g6Var, String str) {
        n70 n70Var;
        n70 n70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ji.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(g6Var);
        if (((g6) this.f) == g6Var && a2.equals((ArrayList) this.e) && (n70Var2 = (n70) this.c) != null && n70Var2.D()) {
            return;
        }
        if (((g6) this.f) == g6Var && (n70Var = (n70) this.c) != null && n70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(g6Var, a2);
            ((n70) this.c).O();
            return;
        }
        a();
        c(g6Var);
        this.f = g6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(g6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(g6Var, a2);
        n70 i10 = ((ji.o0) this.a).i(g6Var.getEditText());
        i10.Q = true;
        i10.s = 0;
        i10.t = false;
        i10.r((LinearLayout) this.d, x5.n(220, -2));
        i10.X = AndroidUtilities.dp(240.0f);
        i10.i = 3;
        i10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        i10.p = new ig.t0(this, 9);
        i10.d0 = true;
        if (i10.D()) {
            i10.C();
        }
        i10.Z();
        this.c = i10;
    }

    @Override // fd.a
    public Object get() {
        Context context = (Context) ((fd.a) this.a).get();
        m5.d dVar = (m5.d) ((fd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((fd.a) this.c).get();
        m2.t tVar = (m2.t) ((m2.t) this.d).get();
        Executor executor = (Executor) ((fd.a) this.e).get();
        t5.c cVar = (t5.c) ((fd.a) this.f).get();
        t7.u uVar = new t7.u(23);
        rb.a aVar = new rb.a(23);
        s5.c cVar2 = (s5.c) ((fd.a) this.h).get();
        da.b bVar = new da.b();
        bVar.a = context;
        bVar.b = dVar;
        bVar.c = dVar2;
        bVar.d = tVar;
        bVar.e = executor;
        bVar.f = cVar;
        bVar.g = uVar;
        bVar.h = aVar;
        bVar.i = cVar2;
        return bVar;
    }

    public p3(ji.o0 o0Var, f6 f6Var) {
        this.a = o0Var;
        this.b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new x9.f(cVar);
        this.b = sVar;
    }
}
