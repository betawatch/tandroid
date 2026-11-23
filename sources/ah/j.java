package ah;

import ai.l0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.g5;
import di.b1;
import di.e0;
import di.p6;
import di.r0;
import di.t;
import di.u0;
import hi.e7;
import hi.h9;
import hi.k2;
import hi.l2;
import hi.w;
import hi.z6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.c1;
import kg.f0;
import kg.h0;
import kg.m0;
import kg.s0;
import kg.v1;
import kg.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n0;
import org.telegram.messenger.p10;
import org.telegram.messenger.q5;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.za0;
import org.telegram.ui.Components.zw0;
import v4.i0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        w10 w10Var;
        int i7;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        w10 w10Var2;
        int currentTop;
        int currentTop2;
        b1 b1Var;
        r5 = false;
        r5 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                if (!oVar.h && (w10Var = oVar.n) != null && editable != null) {
                    w10Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                if (!l0Var.L) {
                    int i10 = l0Var.r;
                    if (i10 == 1) {
                        l0Var.N = l0Var.M.length();
                        l0Var.I = editable.length();
                        l0Var.O = editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1));
                        break;
                    } else if (i10 == 3 && TextUtils.isEmpty(editable)) {
                        l0Var.j();
                        break;
                    }
                }
                break;
            case 2:
                g5 g5Var = (g5) this.b;
                String obj3 = editable != null ? editable.toString() : "";
                int indexOf3 = obj3.indexOf(46);
                if (g5Var.x1 || indexOf3 < 0 || (obj3.length() - indexOf3) - 1 <= 2) {
                    r5 = (obj3.isEmpty() || ".".equals(obj3)) ? 1 : 0;
                    cg.a i11 = r5 == 0 ? cg.a.i(obj3, cg.b.b) : null;
                    if (r5 != 0 || i11 != null) {
                        g5Var.J0(r5 == 0 ? i11.b : 0L);
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
                l2 l2Var = (l2) this.b;
                ImageView imageView = l2Var.r;
                i iVar = l2Var.e;
                if (!l2Var.s) {
                    l2Var.d(false);
                    String obj4 = iVar.getText().toString();
                    String str = TextUtils.isEmpty(obj4) ? null : obj4;
                    p10 p10Var = l2Var.x;
                    if (p10Var != null) {
                        p10Var.a(str, -1);
                    }
                    k2 k2Var = l2Var.h;
                    if (k2Var != null) {
                        k2Var.I1(null);
                        l2Var.h.J1(TextUtils.isEmpty(obj4), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        kr krVar = kr.h;
                        translationX.setInterpolator(krVar).start();
                        if (imageView != null && l2Var.n != (!TextUtils.isEmpty(iVar.getText()))) {
                            l2Var.n = !l2Var.n;
                            imageView.animate().cancel();
                            if (l2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(l2Var.n ? 1.0f : 0.7f).scaleY(l2Var.n ? 1.0f : 0.7f).alpha(l2Var.n ? 1.0f : 0.0f).withEndAction(new w(this, 8)).setInterpolator(krVar).setDuration(320L).setStartDelay(l2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 7:
                e7 e7Var = (e7) this.b;
                String obj5 = editable.toString();
                e7Var.n2 = obj5;
                if (!e7Var.V1) {
                    String str2 = e7Var.s2;
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    if (!TextUtils.equals(str2, obj5)) {
                        e7Var.g1();
                        String str3 = e7Var.n2;
                        e7Var.r2 = str3 != null && str3.length() > 0;
                    }
                    String str4 = e7Var.D2;
                    String str5 = e7Var.n2;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        e7Var.f1();
                        String str6 = e7Var.n2;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(((n0) mp.u1(e7Var.a).A7.K.b).c)) {
                            z10 = true;
                        }
                        e7Var.y2 = z10;
                    }
                    z6 z6Var = e7Var.u2;
                    g0.r(z6Var);
                    g0.h3(z6Var, 400L);
                    z6 z6Var2 = e7Var.F2;
                    g0.r(z6Var2);
                    g0.h3(z6Var2, 400L);
                }
                e7Var.l2.O(true);
                break;
            case 8:
                h9 h9Var = (h9) this.b;
                if (!h9Var.n && (w10Var2 = h9Var.r) != null && editable != null) {
                    w10Var2.a(editable.toString());
                    break;
                }
                break;
            case 9:
                ji.n nVar = (ji.n) this.b;
                nVar.n = editable.toString();
                ji.e eVar = nVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    break;
                }
                break;
            case 10:
                h0 h0Var = (h0) this.b;
                b1 b1Var2 = h0Var.s;
                sy syVar = h0Var.F;
                kg.e0 e0Var = h0Var.y;
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    if (b1Var2.getAdapter() != e0Var) {
                        currentTop = h0Var.getCurrentTop();
                        syVar.c();
                        b1Var2.setAdapter(e0Var);
                        e0Var.f();
                        if (currentTop > 0) {
                            h0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (syVar != null) {
                    syVar.setText(gd.N0(2131747974, null));
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
                    ArrayList arrayList2 = w1.f(i10.t0).b;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        v1 v1Var = (v1) arrayList2.get(i12);
                        if (!w1.g(v1Var.b)) {
                            String M32 = g0.M3(v1Var.b);
                            if (M32.startsWith(M3) || i5.c.B(" ", M3, M32)) {
                                arrayList.add(v1Var);
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
                ((li.o) this.b).d0();
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
                dj djVar = (dj) this.b;
                ui uiVar = djVar.g0;
                TextUtils.isEmpty(djVar.E);
                djVar.E = editable.toString().trim();
                ui uiVar2 = djVar.b0;
                g0.r(uiVar2);
                if (!TextUtils.isEmpty(djVar.E)) {
                    String str7 = djVar.E;
                    djVar.a0 = str7 != null && str7.length() >= 0;
                    if (!TextUtils.equals(djVar.W, djVar.E)) {
                        djVar.M.clear();
                        djVar.c0 = 0;
                        djVar.d0 = false;
                    }
                    g0.h3(uiVar2, 1500L);
                }
                g0.r(uiVar);
                if (!TextUtils.isEmpty(djVar.E)) {
                    String str8 = djVar.E;
                    djVar.n0 = (str8 == null || str8.length() < 3 || TextUtils.isEmpty(((n0) mp.u1(djVar.b.H3).A7.K.b).c)) ? false : true;
                    if (!TextUtils.equals(djVar.f0, djVar.E)) {
                        djVar.N.clear();
                        djVar.h0 = false;
                    }
                    g0.h3(uiVar, 1500L);
                }
                djVar.U();
                break;
            case 19:
                String obj7 = editable.toString();
                if (obj7.isEmpty()) {
                    i0 adapter2 = ((uj) this.b).s.getAdapter();
                    uj ujVar = (uj) this.b;
                    if (adapter2 != ujVar.F) {
                        currentTop2 = ujVar.getCurrentTop();
                        ((uj) this.b).H.setText(gd.N0(2131748030, null));
                        ((uj) this.b).H.c();
                        uj ujVar2 = (uj) this.b;
                        ujVar2.s.setAdapter(ujVar2.F);
                        ((uj) this.b).F.f();
                        if (currentTop2 > 0) {
                            ((uj) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    sy syVar2 = ((uj) this.b).H;
                    if (syVar2 != null) {
                        syVar2.setText(gd.N0(2131747974, null));
                    }
                }
                qj qjVar = ((uj) this.b).G;
                if (qjVar != null) {
                    if (qjVar.f != null) {
                        Utilities.g.a(qjVar.f);
                        qjVar.f = null;
                    }
                    int i13 = qjVar.h + 1;
                    qjVar.h = i13;
                    q5 q5Var = Utilities.g;
                    pj pjVar = new pj(qjVar, obj7, i13, r5);
                    qjVar.f = pjVar;
                    q5Var.d(pjVar, 300L);
                    break;
                }
                break;
            case 20:
                mt mtVar = (mt) this.b;
                if (mtVar.X1 != mtVar.getLineCount()) {
                    if (!mtVar.Y1 && mtVar.getMeasuredWidth() > 0) {
                        mtVar.G(mtVar.X1, mtVar.getLineCount());
                    }
                    mtVar.X1 = mtVar.getLineCount();
                    break;
                }
                break;
            case 21:
                ((ai.e) this.b).run();
                break;
            case 22:
                dy dyVar = (dy) this.b;
                dyVar.g(false);
                fq fqVar = dyVar.d;
                String obj8 = fqVar.getText().toString();
                dyVar.c(obj8, true);
                cy cyVar = dyVar.r;
                if (cyVar != null) {
                    cyVar.I1(null);
                    cyVar.J1(TextUtils.isEmpty(obj8), true);
                }
                dyVar.f(!TextUtils.isEmpty(obj8));
                if (fqVar != null) {
                    fqVar.clearAnimation();
                    fqVar.animate().translationX(0.0f).setInterpolator(kr.h).start();
                }
                dyVar.d(false);
                break;
            case 23:
                c10 c10Var = (c10) this.b;
                if (!c10Var.G.isEmpty() && editable.length() > 0 && c10Var.J >= 0) {
                    c10Var.J = -1;
                    c10Var.e();
                }
                c10Var.a.a(c10Var.n || c10Var.r.length() > 0, true);
                break;
            case 24:
                oc0 oc0Var = (oc0) this.b;
                if (oc0Var.r.length() == 4 && bz.r == 0) {
                    oc0Var.n(false);
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
                zw0 zw0Var = (zw0) this.b;
                xw0 xw0Var = zw0Var.c;
                if (xw0Var != null && xw0Var.getVisibility() == 0) {
                    zw0Var.e();
                    break;
                }
                break;
            case 27:
                oy0 oy0Var = (oy0) this.b;
                n6 n6Var = oy0Var.n;
                if (!oy0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        n6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        n6Var.setText("");
                    }
                    w10 w10Var3 = oy0Var.x;
                    if (w10Var3 != null) {
                        w10Var3.a(trim);
                    }
                    fj fjVar = oy0Var.r;
                    if (fjVar != null) {
                        fjVar.M1 = true;
                        oy0Var.d.y3(fjVar, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 28:
                f11 f11Var = (f11) this.b;
                f11Var.M = editable.toString().trim().toLowerCase();
                if (f11Var.M.startsWith("@")) {
                    f11Var.M = f11Var.M.substring(1);
                }
                f11Var.l(true);
                f11Var.n();
                break;
            default:
                p51 p51Var = (p51) this.b;
                String obj9 = p51Var.K.getText().toString();
                q51 q51Var = p51Var.L;
                int b10 = q51Var.o1.getAdapter() == null ? 0 : q51Var.o1.getAdapter().b();
                q51Var.M0(obj9);
                if (TextUtils.isEmpty(obj9) && (b1Var = q51Var.o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    dk0 dk0Var = q51Var.q1;
                    if (adapter3 != dk0Var) {
                        b1 b1Var4 = q51Var.o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(dk0Var);
                        b1 b1Var5 = q51Var.o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            q51Var.P0(0);
                        }
                    }
                }
                q51Var.v1.setVisibility(0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 24:
                oc0 oc0Var = (oc0) this.b;
                LinkedList linkedList = oc0Var.W;
                LinkedList linkedList2 = oc0Var.V;
                Drawable drawable = oc0Var.a;
                if (drawable instanceof za0) {
                    za0 za0Var = (za0) drawable;
                    za0Var.D = null;
                    za0Var.y();
                    float f10 = za0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        za0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        za0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            oc0Var.b(za0Var);
                            break;
                        } else {
                            linkedList2.offer(new p6(this, z10, za0Var, 23));
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
