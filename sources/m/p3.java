package m;

import android.content.Context;
import android.widget.LinearLayout;
import ii.f6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
            throw a4.a.k(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a() {
        c(null);
        b80 b80Var = (b80) this.c;
        if (b80Var != null) {
            b80Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(f6 f6Var, ArrayList arrayList) {
        d6 d6Var = (d6) this.b;
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
            ii.n0 n0Var = new ii.n0(f6Var.getContext(), o0Var, d6Var);
            n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            n0Var.setBackground(i6.Y(i6.v0(i6.i6, d6Var), 0, 0));
            n0Var.setOnClickListener(new ai.d0(this, f6Var, o0Var, 10));
            ((LinearLayout) this.d).addView(n0Var, z5.n(-1, 48));
        }
    }

    public void c(f6 f6Var) {
        f6 f6Var2 = (f6) this.h;
        if (f6Var2 == f6Var) {
            return;
        }
        if (f6Var2 != null) {
            f6Var2.setShowCommandBackground(false);
        }
        this.h = f6Var;
        if (f6Var != null) {
            f6Var.setShowCommandBackground(true);
        }
    }

    public void d(f6 f6Var, String str) {
        b80 b80Var;
        b80 b80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(f6Var);
        if (((f6) this.f) == f6Var && a2.equals((ArrayList) this.e) && (b80Var2 = (b80) this.c) != null && b80Var2.D()) {
            return;
        }
        if (((f6) this.f) == f6Var && (b80Var = (b80) this.c) != null && b80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(f6Var, a2);
            ((b80) this.c).O();
            return;
        }
        a();
        c(f6Var);
        this.f = f6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(f6Var, a2);
        b80 a10 = ((ii.p0) this.a).a(f6Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, z5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new i2.h0(this, 4);
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
        la.h hVar = (la.h) ((la.h) this.d).get();
        Executor executor = (Executor) ((fd.a) this.e).get();
        t5.c cVar = (t5.c) ((fd.a) this.f).get();
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        s5.c cVar2 = (s5.c) ((fd.a) this.h).get();
        da.b bVar2 = new da.b();
        bVar2.a = context;
        bVar2.b = dVar;
        bVar2.c = dVar2;
        bVar2.d = hVar;
        bVar2.e = executor;
        bVar2.f = cVar;
        bVar2.g = aVar;
        bVar2.h = bVar;
        bVar2.i = cVar2;
        return bVar2;
    }

    public p3(ii.p0 p0Var, d6 d6Var) {
        this.a = p0Var;
        this.b = d6Var;
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
