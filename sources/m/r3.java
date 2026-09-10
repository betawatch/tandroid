package m;

import android.content.Context;
import android.widget.LinearLayout;
import hi.g6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w70;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r3 implements n5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public r3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
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
        w70 w70Var = (w70) this.c;
        if (w70Var != null) {
            w70Var.u();
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
            hi.p0 p0Var = (hi.p0) obj;
            hi.o0 o0Var = new hi.o0(g6Var.getContext(), p0Var, f6Var);
            o0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            o0Var.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 0, 0));
            o0Var.setOnClickListener(new bi.q(this, g6Var, p0Var, 6));
            ((LinearLayout) this.d).addView(o0Var, a6.n(-1, 48));
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
        w70 w70Var;
        w70 w70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = hi.p0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(g6Var);
        if (((g6) this.f) == g6Var && a2.equals((ArrayList) this.e) && (w70Var2 = (w70) this.c) != null && w70Var2.D()) {
            return;
        }
        if (((g6) this.f) == g6Var && (w70Var = (w70) this.c) != null && w70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(g6Var, a2);
            ((w70) this.c).O();
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
        w70 g10 = ((hi.q0) this.a).g(g6Var.getEditText());
        g10.Q = true;
        g10.s = 0;
        g10.t = false;
        g10.r((LinearLayout) this.d, a6.n(220, -2));
        g10.X = AndroidUtilities.dp(240.0f);
        g10.i = 3;
        g10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        g10.p = new gg.v1(this, 6);
        g10.d0 = true;
        if (g10.D()) {
            g10.C();
        }
        g10.Z();
        this.c = g10;
    }

    @Override // fd.a
    public Object get() {
        Context context = (Context) ((fd.a) this.a).get();
        m5.d dVar = (m5.d) ((fd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((fd.a) this.c).get();
        e3 e3Var = (e3) ((e3) this.d).get();
        Executor executor = (Executor) ((fd.a) this.e).get();
        t5.c cVar = (t5.c) ((fd.a) this.f).get();
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        s5.c cVar2 = (s5.c) ((fd.a) this.h).get();
        da.b bVar2 = new da.b();
        bVar2.a = context;
        bVar2.b = dVar;
        bVar2.c = dVar2;
        bVar2.d = e3Var;
        bVar2.e = executor;
        bVar2.f = cVar;
        bVar2.g = aVar;
        bVar2.h = bVar;
        bVar2.i = cVar2;
        return bVar2;
    }

    public r3(hi.q0 q0Var, f6 f6Var) {
        this.a = q0Var;
        this.b = f6Var;
    }

    public r3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new x9.f(cVar);
        this.b = sVar;
    }
}
