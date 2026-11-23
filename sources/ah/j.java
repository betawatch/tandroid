package ah;

import ai.p0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.d5;
import di.b1;
import di.e0;
import di.r0;
import di.t;
import di.u0;
import hi.c2;
import hi.d2;
import hi.m8;
import hi.p6;
import hi.u6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.c1;
import kg.f0;
import kg.h0;
import kg.m0;
import kg.s0;
import kg.u1;
import kg.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n0;
import org.telegram.messenger.np;
import org.telegram.messenger.q5;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yw0;
import v4.i0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        y10 y10Var;
        int i7;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        y10 y10Var2;
        int currentTop;
        int currentTop2;
        b1 b1Var;
        r5 = false;
        r5 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                if (!oVar.h && (y10Var = oVar.n) != null && editable != null) {
                    y10Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                p0 p0Var = (p0) this.b;
                if (!p0Var.L) {
                    int i10 = p0Var.r;
                    if (i10 == 1) {
                        p0Var.N = p0Var.M.length();
                        p0Var.I = editable.length();
                        p0Var.O = editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1));
                        break;
                    } else if (i10 == 3 && TextUtils.isEmpty(editable)) {
                        p0Var.k();
                        break;
                    }
                }
                break;
            case 2:
                d5 d5Var = (d5) this.b;
                String obj3 = editable != null ? editable.toString() : "";
                int indexOf3 = obj3.indexOf(46);
                if (d5Var.x1 || indexOf3 < 0 || (obj3.length() - indexOf3) - 1 <= 2) {
                    r5 = (obj3.isEmpty() || ".".equals(obj3)) ? 1 : 0;
                    cg.a i11 = r5 == 0 ? cg.a.i(obj3, cg.b.b) : null;
                    if (r5 != 0 || i11 != null) {
                        d5Var.J0(r5 == 0 ? i11.b : 0L);
                        break;
                    } else {
                        editable.delete(obj3.length() - 1, obj3.length());
                        break;
                    }
                } else {
                    editable.delete(indexOf3 + 3, obj3.length());
                    break;
                }
                break;
            case 3:
                t tVar = (t) this.b;
                di.c cVar = tVar.t0;
                i7 = ((g2) tVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = e0.g(i7).h(tVar.b, false);
                long j3 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                tVar.Z = parseLong;
                if (parseLong > j3) {
                    tVar.Z = j3;
                    tVar.X = true;
                    tVar.a0.setText(Long.toString(j3));
                    di.q qVar = tVar.a0;
                    qVar.setSelection(qVar.getText().length());
                    tVar.X = false;
                }
                tVar.Y = tVar.Z == j3;
                g0.r(cVar);
                cVar.run();
                if (!tVar.X) {
                    tVar.Y = false;
                    break;
                }
                break;
            case 4:
                r0 r0Var = (r0) this.b;
                Object[] objArr = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (objArr == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                r0Var.N0(objArr == false ? cg.a.i(editable.toString(), r0Var.C1.a) : cg.a.j(0L, r0Var.C1.a), false, false, true);
                r0Var.q1.c(r0Var.r1.isFocused(), !TextUtils.isEmpty(r0Var.r1.getText()));
                break;
            case 5:
                u0 u0Var = (u0) this.b;
                Object[] objArr2 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (objArr2 == false && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                u0Var.K0(objArr2 == false ? cg.a.i(editable.toString(), u0Var.z1.a) : cg.a.j(0L, u0Var.z1.a), false, false, true);
                u0Var.m1.c(u0Var.n1.isFocused(), !TextUtils.isEmpty(u0Var.n1.getText()));
                break;
            case 6:
                d2 d2Var = (d2) this.b;
                ImageView imageView = d2Var.r;
                i iVar = d2Var.e;
                if (!d2Var.s) {
                    d2Var.d(false);
                    String obj4 = iVar.getText().toString();
                    String str = TextUtils.isEmpty(obj4) ? null : obj4;
                    r10 r10Var = d2Var.x;
                    if (r10Var != null) {
                        r10Var.a(str, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj4), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        nr nrVar = nr.h;
                        translationX.setInterpolator(nrVar).start();
                        if (imageView != null && d2Var.n != (!TextUtils.isEmpty(iVar.getText()))) {
                            d2Var.n = !d2Var.n;
                            imageView.animate().cancel();
                            if (d2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(d2Var.n ? 1.0f : 0.7f).scaleY(d2Var.n ? 1.0f : 0.7f).alpha(d2Var.n ? 1.0f : 0.0f).withEndAction(new hi.l(this, 7)).setInterpolator(nrVar).setDuration(320L).setStartDelay(d2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 7:
                u6 u6Var = (u6) this.b;
                String obj5 = editable.toString();
                u6Var.n2 = obj5;
                if (!u6Var.V1) {
                    String str2 = u6Var.s2;
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    if (!TextUtils.equals(str2, obj5)) {
                        u6Var.g1();
                        String str3 = u6Var.n2;
                        u6Var.r2 = str3 != null && str3.length() > 0;
                    }
                    String str4 = u6Var.D2;
                    String str5 = u6Var.n2;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        u6Var.f1();
                        String str6 = u6Var.n2;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(((n0) np.u1(u6Var.a).A7.K.b).c)) {
                            z10 = true;
                        }
                        u6Var.y2 = z10;
                    }
                    p6 p6Var = u6Var.u2;
                    g0.r(p6Var);
                    g0.h3(p6Var, 400L);
                    p6 p6Var2 = u6Var.F2;
                    g0.r(p6Var2);
                    g0.h3(p6Var2, 400L);
                }
                u6Var.l2.O(true);
                break;
            case 8:
                m8 m8Var = (m8) this.b;
                if (!m8Var.n && (y10Var2 = m8Var.r) != null && editable != null) {
                    y10Var2.a(editable.toString());
                    break;
                }
                break;
            case 9:
                ji.o oVar2 = (ji.o) this.b;
                oVar2.n = editable.toString();
                ji.e eVar = oVar2.K;
                if (eVar != null) {
                    eVar.invalidate();
                    break;
                }
                break;
            case 10:
                h0 h0Var = (h0) this.b;
                b1 b1Var2 = h0Var.s;
                vy vyVar = h0Var.F;
                kg.e0 e0Var = h0Var.y;
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    if (b1Var2.getAdapter() != e0Var) {
                        currentTop = h0Var.getCurrentTop();
                        vyVar.c();
                        b1Var2.setAdapter(e0Var);
                        e0Var.f();
                        if (currentTop > 0) {
                            h0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (vyVar != null) {
                    vyVar.setText(hd.N0(2131747974, null));
                }
                f0 f0Var = h0Var.E;
                if (f0Var != null) {
                    h0 h0Var2 = f0Var.f;
                    b1 b1Var3 = h0Var2.s;
                    ArrayList arrayList = f0Var.d;
                    arrayList.clear();
                    f0Var.e = obj6;
                    String M3 = g0.M3(obj6);
                    if (M3.startsWith("/")) {
                        M3 = M3.substring(1);
                    }
                    ArrayList arrayList2 = v1.f(k10.t0).b;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        u1 u1Var = (u1) arrayList2.get(i12);
                        if (!v1.g(u1Var.b)) {
                            String M32 = g0.M3(u1Var.b);
                            if (M32.startsWith(M3) || i5.c.B(" ", M3, M32)) {
                                arrayList.add(u1Var);
                            }
                        }
                    }
                    i0 adapter = b1Var3.getAdapter();
                    f0 f0Var2 = h0Var2.E;
                    if (adapter != f0Var2) {
                        b1Var3.setAdapter(f0Var2);
                    }
                    f0Var.f();
                    break;
                }
                break;
            case 11:
                s0 s0Var = (s0) this.b;
                s0Var.y = false;
                m0 m0Var = s0Var.G;
                g0.r(m0Var);
                if (TextUtils.isEmpty(s0Var.f.getText())) {
                    s0Var.E = null;
                    s0Var.d.b();
                } else {
                    s0Var.y = true;
                    g0.h3(m0Var, 800L);
                }
                s0Var.c.g3.O(true);
                s0Var.g0();
                break;
            case 12:
                c1 c1Var = (c1) this.b;
                if (!c1Var.c) {
                    c1Var.E = false;
                    c1Var.y = editable.toString();
                    c1Var.Z(true);
                    break;
                }
                break;
            case 13:
                ((li.p) this.b).d0();
                break;
            case 14:
            case 15:
            case 16:
                break;
            case 17:
                yc ycVar = (yc) this.b;
                ycVar.F((ycVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 18:
                ej ejVar = (ej) this.b;
                vi viVar = ejVar.g0;
                TextUtils.isEmpty(ejVar.E);
                ejVar.E = editable.toString().trim();
                vi viVar2 = ejVar.b0;
                g0.r(viVar2);
                if (!TextUtils.isEmpty(ejVar.E)) {
                    String str7 = ejVar.E;
                    ejVar.a0 = str7 != null && str7.length() >= 0;
                    if (!TextUtils.equals(ejVar.W, ejVar.E)) {
                        ejVar.M.clear();
                        ejVar.c0 = 0;
                        ejVar.d0 = false;
                    }
                    g0.h3(viVar2, 1500L);
                }
                g0.r(viVar);
                if (!TextUtils.isEmpty(ejVar.E)) {
                    String str8 = ejVar.E;
                    ejVar.n0 = (str8 == null || str8.length() < 3 || TextUtils.isEmpty(((n0) np.u1(ejVar.b.H3).A7.K.b).c)) ? false : true;
                    if (!TextUtils.equals(ejVar.f0, ejVar.E)) {
                        ejVar.N.clear();
                        ejVar.h0 = false;
                    }
                    g0.h3(viVar, 1500L);
                }
                ejVar.U();
                break;
            case 19:
                String obj7 = editable.toString();
                if (obj7.isEmpty()) {
                    i0 adapter2 = ((vj) this.b).s.getAdapter();
                    vj vjVar = (vj) this.b;
                    if (adapter2 != vjVar.F) {
                        currentTop2 = vjVar.getCurrentTop();
                        ((vj) this.b).H.setText(hd.N0(2131748030, null));
                        ((vj) this.b).H.c();
                        vj vjVar2 = (vj) this.b;
                        vjVar2.s.setAdapter(vjVar2.F);
                        ((vj) this.b).F.f();
                        if (currentTop2 > 0) {
                            ((vj) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    vy vyVar2 = ((vj) this.b).H;
                    if (vyVar2 != null) {
                        vyVar2.setText(hd.N0(2131747974, null));
                    }
                }
                rj rjVar = ((vj) this.b).G;
                if (rjVar != null) {
                    if (rjVar.f != null) {
                        Utilities.g.a(rjVar.f);
                        rjVar.f = null;
                    }
                    int i13 = rjVar.h + 1;
                    rjVar.h = i13;
                    q5 q5Var = Utilities.g;
                    qj qjVar = new qj(rjVar, obj7, i13, r5);
                    rjVar.f = qjVar;
                    q5Var.d(qjVar, 300L);
                    break;
                }
                break;
            case 20:
                ot otVar = (ot) this.b;
                if (otVar.X1 != otVar.getLineCount()) {
                    if (!otVar.Y1 && otVar.getMeasuredWidth() > 0) {
                        otVar.G(otVar.X1, otVar.getLineCount());
                    }
                    otVar.X1 = otVar.getLineCount();
                    break;
                }
                break;
            case 21:
                ((ai.i) this.b).run();
                break;
            case 22:
                gy gyVar = (gy) this.b;
                gyVar.g(false);
                iq iqVar = gyVar.d;
                String obj8 = iqVar.getText().toString();
                gyVar.c(obj8, true);
                fy fyVar = gyVar.r;
                if (fyVar != null) {
                    fyVar.I1(null);
                    fyVar.J1(TextUtils.isEmpty(obj8), true);
                }
                gyVar.f(!TextUtils.isEmpty(obj8));
                if (iqVar != null) {
                    iqVar.clearAnimation();
                    iqVar.animate().translationX(0.0f).setInterpolator(nr.h).start();
                }
                gyVar.d(false);
                break;
            case 23:
                e10 e10Var = (e10) this.b;
                if (!e10Var.G.isEmpty() && editable.length() > 0 && e10Var.J >= 0) {
                    e10Var.J = -1;
                    e10Var.e();
                }
                e10Var.a.a(e10Var.n || e10Var.r.length() > 0, true);
                break;
            case 24:
                qc0 qc0Var = (qc0) this.b;
                if (qc0Var.r.length() == 4 && cz.r == 0) {
                    qc0Var.n(false);
                    break;
                }
                break;
            case 25:
                tl0 tl0Var = (tl0) this.b;
                ImageView imageView2 = tl0Var.b;
                i iVar2 = tl0Var.d;
                boolean z11 = iVar2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                tl0Var.a(iVar2.getText().toString());
                break;
            case 26:
                ax0 ax0Var = (ax0) this.b;
                yw0 yw0Var = ax0Var.c;
                if (yw0Var != null && yw0Var.getVisibility() == 0) {
                    ax0Var.e();
                    break;
                }
                break;
            case 27:
                py0 py0Var = (py0) this.b;
                o6 o6Var = py0Var.n;
                if (!py0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        o6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        o6Var.setText("");
                    }
                    y10 y10Var3 = py0Var.x;
                    if (y10Var3 != null) {
                        y10Var3.a(trim);
                    }
                    gj gjVar = py0Var.r;
                    if (gjVar != null) {
                        gjVar.M1 = true;
                        py0Var.d.y3(gjVar, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 28:
                g11 g11Var = (g11) this.b;
                g11Var.M = editable.toString().trim().toLowerCase();
                if (g11Var.M.startsWith("@")) {
                    g11Var.M = g11Var.M.substring(1);
                }
                g11Var.l(true);
                g11Var.n();
                break;
            default:
                q51 q51Var = (q51) this.b;
                String obj9 = q51Var.K.getText().toString();
                r51 r51Var = q51Var.L;
                int b10 = r51Var.o1.getAdapter() == null ? 0 : r51Var.o1.getAdapter().b();
                r51Var.M0(obj9);
                if (TextUtils.isEmpty(obj9) && (b1Var = r51Var.o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    dk0 dk0Var = r51Var.q1;
                    if (adapter3 != dk0Var) {
                        b1 b1Var4 = r51Var.o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(dk0Var);
                        b1 b1Var5 = r51Var.o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            r51Var.P0(0);
                        }
                    }
                }
                r51Var.v1.setVisibility(0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 24:
                qc0 qc0Var = (qc0) this.b;
                LinkedList linkedList = qc0Var.W;
                LinkedList linkedList2 = qc0Var.V;
                Drawable drawable = qc0Var.a;
                if (drawable instanceof cb0) {
                    cb0 cb0Var = (cb0) drawable;
                    cb0Var.D = null;
                    cb0Var.y();
                    float f10 = cb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        cb0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        cb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            qc0Var.b(cb0Var);
                            break;
                        } else {
                            linkedList2.offer(new di.p6(this, z10, cb0Var, 23));
                            linkedList.offer(Boolean.valueOf(z10));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i13 = 0; i13 < linkedList2.size(); i13++) {
                                Runnable runnable = (Runnable) linkedList2.get(i13);
                                if (((Boolean) linkedList.get(i13)).booleanValue() != z10) {
                                    arrayList.add(runnable);
                                    arrayList2.add(Integer.valueOf(i13));
                                }
                            }
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                linkedList2.remove((Runnable) obj);
                            }
                            int size2 = arrayList2.size();
                            while (i12 < size2) {
                                Object obj2 = arrayList2.get(i12);
                                i12++;
                                int intValue = ((Integer) obj2).intValue();
                                if (intValue < linkedList.size()) {
                                    linkedList.remove(intValue);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.m0 searchListener;
        switch (this.a) {
            case 14:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.G.getText();
                searchView.p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.o0 && !searchView.h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
            case 15:
                q0 q0Var = (q0) this.b;
                org.telegram.ui.ActionBar.m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.l(q0Var.e);
                }
                q0Var.k();
                if (!q0Var.h0.isEmpty() && !TextUtils.isEmpty(q0Var.e.getText()) && q0Var.i0 >= 0) {
                    q0Var.i0 = -1;
                    q0Var.E();
                    break;
                }
                break;
            case 16:
                z4 z4Var = (z4) this.b;
                z4Var.m();
                searchListener = z4Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(z4Var.s);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void M(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void N(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void O(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void P(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void Q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void R(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void S(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void T(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void U(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void V(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void W(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void X(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Z(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void a0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void g0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
