package ah;

import ai.n0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import di.c1;
import di.e0;
import di.m6;
import di.s0;
import di.t;
import di.v0;
import hi.c2;
import hi.d2;
import hi.e1;
import hi.n8;
import hi.r6;
import hi.v6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.a1;
import kg.d0;
import kg.k0;
import kg.q0;
import kg.u1;
import kg.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.p5;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Wallet.l4;
import v4.h0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        z10 z10Var;
        int i7;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        z10 z10Var2;
        int currentTop;
        int currentTop2;
        c1 c1Var;
        int i10 = 3;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                if (!oVar.h && (z10Var = oVar.n) != null && editable != null) {
                    z10Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                n0 n0Var = (n0) this.b;
                if (!n0Var.L) {
                    int i11 = n0Var.r;
                    if (i11 == 1) {
                        n0Var.N = n0Var.M.length();
                        n0Var.I = editable.length();
                        n0Var.O = editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1));
                        break;
                    } else if (i11 == 3 && TextUtils.isEmpty(editable)) {
                        n0Var.i();
                        break;
                    }
                }
                break;
            case 2:
                t tVar = (t) this.b;
                di.c cVar = tVar.t0;
                i7 = ((e2) tVar).currentAccount;
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
            case 3:
                s0 s0Var = (s0) this.b;
                Object[] objArr = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (objArr == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                s0Var.M0(objArr == false ? cg.a.h(editable.toString(), s0Var.C1.a) : cg.a.i(0L, s0Var.C1.a), false, false, true);
                s0Var.q1.c(s0Var.r1.isFocused(), !TextUtils.isEmpty(s0Var.r1.getText()));
                break;
            case 4:
                v0 v0Var = (v0) this.b;
                Object[] objArr2 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (objArr2 == false && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                v0Var.J0(objArr2 == false ? cg.a.h(editable.toString(), v0Var.z1.a) : cg.a.i(0L, v0Var.z1.a), false, false, true);
                v0Var.m1.c(v0Var.n1.isFocused(), !TextUtils.isEmpty(v0Var.n1.getText()));
                break;
            case 5:
                d2 d2Var = (d2) this.b;
                ImageView imageView = d2Var.r;
                i iVar = d2Var.e;
                if (!d2Var.s) {
                    d2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    String str = TextUtils.isEmpty(obj3) ? null : obj3;
                    s10 s10Var = d2Var.x;
                    if (s10Var != null) {
                        s10Var.a(str, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        er erVar = er.h;
                        translationX.setInterpolator(erVar).start();
                        if (imageView != null && d2Var.n != (!TextUtils.isEmpty(iVar.getText()))) {
                            d2Var.n = !d2Var.n;
                            imageView.animate().cancel();
                            if (d2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(d2Var.n ? 1.0f : 0.7f).scaleY(d2Var.n ? 1.0f : 0.7f).alpha(d2Var.n ? 1.0f : 0.0f).withEndAction(new e1(this, i10)).setInterpolator(erVar).setDuration(320L).setStartDelay(d2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 6:
                v6 v6Var = (v6) this.b;
                String obj4 = editable.toString();
                v6Var.n2 = obj4;
                if (!v6Var.V1) {
                    String str2 = v6Var.s2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str2, obj4)) {
                        v6Var.f1();
                        String str3 = v6Var.n2;
                        v6Var.r2 = str3 != null && str3.length() > 0;
                    }
                    String str4 = v6Var.D2;
                    String str5 = v6Var.n2;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        v6Var.e1();
                        String str6 = v6Var.n2;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.n0) np.s1(v6Var.a).y7.F.b).c)) {
                            z10 = true;
                        }
                        v6Var.y2 = z10;
                    }
                    r6 r6Var = v6Var.u2;
                    g0.r(r6Var);
                    g0.i3(r6Var, 400L);
                    r6 r6Var2 = v6Var.F2;
                    g0.r(r6Var2);
                    g0.i3(r6Var2, 400L);
                }
                v6Var.l2.O(true);
                break;
            case 7:
                n8 n8Var = (n8) this.b;
                if (!n8Var.n && (z10Var2 = n8Var.r) != null && editable != null) {
                    z10Var2.a(editable.toString());
                    break;
                }
                break;
            case 8:
                ji.m mVar = (ji.m) this.b;
                mVar.n = editable.toString();
                ji.e eVar = mVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    break;
                }
                break;
            case 9:
                kg.g0 g0Var = (kg.g0) this.b;
                c1 c1Var2 = g0Var.s;
                ny nyVar = g0Var.F;
                d0 d0Var = g0Var.y;
                String obj5 = editable.toString();
                if (obj5.isEmpty()) {
                    if (c1Var2.getAdapter() != d0Var) {
                        currentTop = g0Var.getCurrentTop();
                        nyVar.c();
                        c1Var2.setAdapter(d0Var);
                        d0Var.f();
                        if (currentTop > 0) {
                            g0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (nyVar != null) {
                    nyVar.setText(hd.M0(2131748167, null));
                }
                kg.e0 e0Var = g0Var.E;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f;
                    c1 c1Var3 = g0Var2.s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.e = obj5;
                    String N3 = g0.N3(obj5);
                    if (N3.startsWith("/")) {
                        N3 = N3.substring(1);
                    }
                    ArrayList arrayList2 = v1.f(m10.t0).b;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        u1 u1Var = (u1) arrayList2.get(i12);
                        if (!v1.g(u1Var.b)) {
                            String N32 = g0.N3(u1Var.b);
                            if (N32.startsWith(N3) || i5.c.A(" ", N3, N32)) {
                                arrayList.add(u1Var);
                            }
                        }
                    }
                    h0 adapter = c1Var3.getAdapter();
                    kg.e0 e0Var2 = g0Var2.E;
                    if (adapter != e0Var2) {
                        c1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    break;
                }
                break;
            case 10:
                q0 q0Var = (q0) this.b;
                q0Var.y = false;
                k0 k0Var = q0Var.G;
                g0.r(k0Var);
                if (TextUtils.isEmpty(q0Var.f.getText())) {
                    q0Var.E = null;
                    q0Var.d.b();
                } else {
                    q0Var.y = true;
                    g0.i3(k0Var, 800L);
                }
                q0Var.c.g3.O(true);
                q0Var.g0();
                break;
            case 11:
                a1 a1Var = (a1) this.b;
                if (!a1Var.c) {
                    a1Var.E = false;
                    a1Var.y = editable.toString();
                    a1Var.Z(true);
                    break;
                }
                break;
            case 12:
                ((li.n) this.b).d0();
                break;
            case 16:
                pc pcVar = (pc) this.b;
                pcVar.F((pcVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 17:
                vi viVar = (vi) this.b;
                li liVar = viVar.g0;
                TextUtils.isEmpty(viVar.E);
                viVar.E = editable.toString().trim();
                li liVar2 = viVar.b0;
                g0.r(liVar2);
                if (!TextUtils.isEmpty(viVar.E)) {
                    String str7 = viVar.E;
                    viVar.a0 = str7 != null && str7.length() >= 0;
                    if (!TextUtils.equals(viVar.W, viVar.E)) {
                        viVar.M.clear();
                        viVar.c0 = 0;
                        viVar.d0 = false;
                    }
                    g0.i3(liVar2, 1500L);
                }
                g0.r(liVar);
                if (!TextUtils.isEmpty(viVar.E)) {
                    String str8 = viVar.E;
                    viVar.n0 = (str8 == null || str8.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.n0) np.s1(viVar.b.H3).y7.F.b).c)) ? false : true;
                    if (!TextUtils.equals(viVar.f0, viVar.E)) {
                        viVar.N.clear();
                        viVar.h0 = false;
                    }
                    g0.i3(liVar, 1500L);
                }
                viVar.U();
                break;
            case 18:
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    h0 adapter2 = ((mj) this.b).s.getAdapter();
                    mj mjVar = (mj) this.b;
                    if (adapter2 != mjVar.F) {
                        currentTop2 = mjVar.getCurrentTop();
                        ((mj) this.b).H.setText(hd.M0(2131748223, null));
                        ((mj) this.b).H.c();
                        mj mjVar2 = (mj) this.b;
                        mjVar2.s.setAdapter(mjVar2.F);
                        ((mj) this.b).F.f();
                        if (currentTop2 > 0) {
                            ((mj) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    ny nyVar2 = ((mj) this.b).H;
                    if (nyVar2 != null) {
                        nyVar2.setText(hd.M0(2131748167, null));
                    }
                }
                ij ijVar = ((mj) this.b).G;
                if (ijVar != null) {
                    if (ijVar.f != null) {
                        Utilities.g.a(ijVar.f);
                        ijVar.f = null;
                    }
                    int i13 = ijVar.h + 1;
                    ijVar.h = i13;
                    p5 p5Var = Utilities.g;
                    hj hjVar = new hj(ijVar, obj6, i13, false ? 1 : 0);
                    ijVar.f = hjVar;
                    p5Var.d(hjVar, 300L);
                    break;
                }
                break;
            case 19:
                ft ftVar = (ft) this.b;
                if (ftVar.X1 != ftVar.getLineCount()) {
                    if (!ftVar.Y1 && ftVar.getMeasuredWidth() > 0) {
                        ftVar.G(ftVar.X1, ftVar.getLineCount());
                    }
                    ftVar.X1 = ftVar.getLineCount();
                    break;
                }
                break;
            case 20:
                ((ai.j) this.b).run();
                break;
            case 21:
                yx yxVar = (yx) this.b;
                yxVar.g(false);
                zp zpVar = yxVar.d;
                String obj7 = zpVar.getText().toString();
                yxVar.c(obj7, true);
                xx xxVar = yxVar.r;
                if (xxVar != null) {
                    xxVar.I1(null);
                    xxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                yxVar.f(!TextUtils.isEmpty(obj7));
                if (zpVar != null) {
                    zpVar.clearAnimation();
                    zpVar.animate().translationX(0.0f).setInterpolator(er.h).start();
                }
                yxVar.d(false);
                break;
            case 22:
                v00 v00Var = (v00) this.b;
                if (!v00Var.G.isEmpty() && editable.length() > 0 && v00Var.J >= 0) {
                    v00Var.J = -1;
                    v00Var.e();
                }
                v00Var.a.a(v00Var.n || v00Var.r.length() > 0, true);
                break;
            case 23:
                fc0 fc0Var = (fc0) this.b;
                if (fc0Var.r.length() == 4 && gz.r == 0) {
                    fc0Var.n(false);
                    break;
                }
                break;
            case 24:
                jl0 jl0Var = (jl0) this.b;
                ImageView imageView2 = jl0Var.b;
                i iVar2 = jl0Var.d;
                boolean z11 = iVar2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                jl0Var.a(iVar2.getText().toString());
                break;
            case 25:
                rw0 rw0Var = (rw0) this.b;
                pw0 pw0Var = rw0Var.c;
                if (pw0Var != null && pw0Var.getVisibility() == 0) {
                    rw0Var.e();
                    break;
                }
                break;
            case 26:
                gy0 gy0Var = (gy0) this.b;
                h6 h6Var = gy0Var.n;
                if (!gy0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        h6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        h6Var.setText("");
                    }
                    z10 z10Var3 = gy0Var.x;
                    if (z10Var3 != null) {
                        z10Var3.a(trim);
                    }
                    gj gjVar = gy0Var.r;
                    if (gjVar != null) {
                        gjVar.M1 = true;
                        gy0Var.d.x3(gjVar, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 27:
                v01 v01Var = (v01) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                v01Var.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    v01Var.M = v01Var.M.substring(1);
                }
                v01Var.c();
                v01Var.N.clear();
                if (!v01Var.d && !v01Var.c && !TextUtils.isEmpty(v01Var.M)) {
                    hh0 hh0Var = new hh0(15, v01Var, v01Var.M);
                    v01Var.P = hh0Var;
                    g0.i3(hh0Var, 350L);
                }
                v01Var.h();
                break;
            case 28:
                d51 d51Var = (d51) this.b;
                String obj8 = d51Var.K.getText().toString();
                e51 e51Var = d51Var.L;
                int b10 = e51Var.o1.getAdapter() == null ? 0 : e51Var.o1.getAdapter().b();
                e51Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (c1Var = e51Var.o1) != null) {
                    h0 adapter3 = c1Var.getAdapter();
                    tj0 tj0Var = e51Var.q1;
                    if (adapter3 != tj0Var) {
                        c1 c1Var4 = e51Var.o1;
                        c1Var4.X1 = false;
                        c1Var4.Y1 = 0;
                        c1Var4.setAdapter(tj0Var);
                        c1 c1Var5 = e51Var.o1;
                        c1Var5.X1 = true;
                        c1Var5.Y1 = 0;
                        if (b10 == 0) {
                            e51Var.O0(0);
                        }
                    }
                }
                e51Var.v1.setVisibility(0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 23:
                fc0 fc0Var = (fc0) this.b;
                LinkedList linkedList = fc0Var.W;
                LinkedList linkedList2 = fc0Var.V;
                Drawable drawable = fc0Var.a;
                if (drawable instanceof ra0) {
                    ra0 ra0Var = (ra0) drawable;
                    ra0Var.D = null;
                    ra0Var.y();
                    float f10 = ra0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        ra0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        ra0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            fc0Var.b(ra0Var);
                            break;
                        } else {
                            linkedList2.offer(new m6(this, z10, ra0Var, 23));
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
        m0 searchListener;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 13:
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
            case 14:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                m0 m0Var = q0Var.I;
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
            case 15:
                w4 w4Var = (w4) this.b;
                w4Var.k();
                searchListener = w4Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(w4Var.s);
                    break;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                break;
            default:
                ((l4) this.b).a(charSequence.toString());
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
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
