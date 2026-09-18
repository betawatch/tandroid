package m;

import android.content.Context;
import android.widget.LinearLayout;
import ii.d6;
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
import org.telegram.ui.Components.n70;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    public void b(d6 d6Var, ArrayList arrayList) {
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
            ii.o0 o0Var = (ii.o0) obj;
            ii.n0 n0Var = new ii.n0(d6Var.getContext(), o0Var, f6Var);
            n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            n0Var.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 0, 0));
            n0Var.setOnClickListener(new ai.d0(this, d6Var, o0Var, 10));
            ((LinearLayout) this.d).addView(n0Var, x5.n(-1, 48));
        }
    }

    public void c(d6 d6Var) {
        d6 d6Var2 = (d6) this.h;
        if (d6Var2 == d6Var) {
            return;
        }
        if (d6Var2 != null) {
            d6Var2.setShowCommandBackground(false);
        }
        this.h = d6Var;
        if (d6Var != null) {
            d6Var.setShowCommandBackground(true);
        }
    }

    public void d(d6 d6Var, String str) {
        n70 n70Var;
        n70 n70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(d6Var);
        if (((d6) this.f) == d6Var && a2.equals((ArrayList) this.e) && (n70Var2 = (n70) this.c) != null && n70Var2.D()) {
            return;
        }
        if (((d6) this.f) == d6Var && (n70Var = (n70) this.c) != null && n70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((n70) this.c).O();
            return;
        }
        a();
        c(d6Var);
        this.f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        n70 a10 = ((ii.p0) this.a).a(d6Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, x5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new i2.g0(this, 4);
        a10.d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.c = a10;
    }

    @Override // fd.a
    public Object get() {
        Context context = (Context) ((fd.a) this.a).get();
        m5.d dVar = (m5.d) ((fd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((fd.a) this.c).get();
        lf.i iVar = (lf.i) ((lf.i) this.d).get();
        Executor executor = (Executor) ((fd.a) this.e).get();
        t5.c cVar = (t5.c) ((fd.a) this.f).get();
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        s5.c cVar2 = (s5.c) ((fd.a) this.h).get();
        da.b bVar2 = new da.b();
        bVar2.a = context;
        bVar2.b = dVar;
        bVar2.c = dVar2;
        bVar2.d = iVar;
        bVar2.e = executor;
        bVar2.f = cVar;
        bVar2.g = aVar;
        bVar2.h = bVar;
        bVar2.i = cVar2;
        return bVar2;
    }

    public p3(ii.p0 p0Var, f6 f6Var) {
        this.a = p0Var;
        this.b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new x9.f(cVar);
        this.b = tVar;
    }
}
