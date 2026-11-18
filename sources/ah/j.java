package ah;

import ai.n0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.b5;
import di.b1;
import di.e0;
import di.p6;
import di.r0;
import di.t;
import di.u0;
import hi.d2;
import hi.e2;
import hi.n8;
import hi.q6;
import hi.v6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.d0;
import kg.d1;
import kg.t0;
import kg.v1;
import kg.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.q5;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yw0;
import v4.i0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        x10 x10Var;
        int i7;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        x10 x10Var2;
        int currentTop;
        int currentTop2;
        b1 b1Var;
        r5 = false;
        r5 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                if (!oVar.h && (x10Var = oVar.n) != null && editable != null) {
                    x10Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                n0 n0Var = (n0) this.b;
                if (!n0Var.L) {
                    int i10 = n0Var.r;
                    if (i10 == 1) {
                        n0Var.N = n0Var.M.length();
                        n0Var.I = editable.length();
                        n0Var.O = editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1));
                        break;
                    } else if (i10 == 3 && TextUtils.isEmpty(editable)) {
                        n0Var.j();
                        break;
                    }
                }
                break;
            case 2:
                b5 b5Var = (b5) this.b;
                String obj3 = editable != null ? editable.toString() : "";
                int indexOf3 = obj3.indexOf(46);
                if (b5Var.x1 || indexOf3 < 0 || (obj3.length() - indexOf3) - 1 <= 2) {
                    r5 = (obj3.isEmpty() || ".".equals(obj3)) ? 1 : 0;
                    cg.a i11 = r5 == 0 ? cg.a.i(obj3, cg.b.b) : null;
                    if (r5 != 0 || i11 != null) {
                        b5Var.J0(r5 == 0 ? i11.b : 0L);
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
                i7 = ((h2) tVar).currentAccount;
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
                e2 e2Var = (e2) this.b;
                ImageView imageView = e2Var.r;
                i iVar = e2Var.e;
                if (!e2Var.s) {
                    e2Var.d(false);
                    String obj4 = iVar.getText().toString();
                    String str = TextUtils.isEmpty(obj4) ? null : obj4;
                    q10 q10Var = e2Var.x;
                    if (q10Var != null) {
                        q10Var.a(str, -1);
                    }
                    d2 d2Var = e2Var.h;
                    if (d2Var != null) {
                        d2Var.I1(null);
                        e2Var.h.J1(TextUtils.isEmpty(obj4), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        lr lrVar = lr.h;
                        translationX.setInterpolator(lrVar).start();
                        if (imageView != null && e2Var.n != (!TextUtils.isEmpty(iVar.getText()))) {
                            e2Var.n = !e2Var.n;
                            imageView.animate().cancel();
                            if (e2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(e2Var.n ? 1.0f : 0.7f).scaleY(e2Var.n ? 1.0f : 0.7f).alpha(e2Var.n ? 1.0f : 0.0f).withEndAction(new hi.k(this, 7)).setInterpolator(lrVar).setDuration(320L).setStartDelay(e2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 7:
                v6 v6Var = (v6) this.b;
                String obj5 = editable.toString();
                v6Var.n2 = obj5;
                if (!v6Var.V1) {
                    String str2 = v6Var.s2;
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    if (!TextUtils.equals(str2, obj5)) {
                        v6Var.g1();
                        String str3 = v6Var.n2;
                        v6Var.r2 = str3 != null && str3.length() > 0;
                    }
                    String str4 = v6Var.D2;
                    String str5 = v6Var.n2;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        v6Var.f1();
                        String str6 = v6Var.n2;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.n0) mp.u1(v6Var.a).A7.K.b).c)) {
                            z10 = true;
                        }
                        v6Var.y2 = z10;
                    }
                    q6 q6Var = v6Var.u2;
                    g0.r(q6Var);
                    g0.h3(q6Var, 400L);
                    q6 q6Var2 = v6Var.F2;
                    g0.r(q6Var2);
                    g0.h3(q6Var2, 400L);
                }
                v6Var.l2.O(true);
                break;
            case 8:
                n8 n8Var = (n8) this.b;
                if (!n8Var.n && (x10Var2 = n8Var.r) != null && editable != null) {
                    x10Var2.a(editable.toString());
                    break;
                }
                break;
            case 9:
                ji.m mVar = (ji.m) this.b;
                mVar.n = editable.toString();
                ji.e eVar = mVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    break;
                }
                break;
            case 10:
                kg.g0 g0Var = (kg.g0) this.b;
                b1 b1Var2 = g0Var.s;
                ty tyVar = g0Var.F;
                d0 d0Var = g0Var.y;
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    if (b1Var2.getAdapter() != d0Var) {
                        currentTop = g0Var.getCurrentTop();
                        tyVar.c();
                        b1Var2.setAdapter(d0Var);
                        d0Var.f();
                        if (currentTop > 0) {
                            g0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (tyVar != null) {
                    tyVar.setText(gd.M0(2131747975, null));
                }
                kg.e0 e0Var = g0Var.E;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f;
                    b1 b1Var3 = g0Var2.s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.e = obj6;
                    String M3 = g0.M3(obj6);
                    if (M3.startsWith("/")) {
                        M3 = M3.substring(1);
                    }
                    ArrayList arrayList2 = w1.f(j10.t0).b;
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
                    kg.e0 e0Var2 = g0Var2.E;
                    if (adapter != e0Var2) {
                        b1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    break;
                }
                break;
            case 11:
                t0 t0Var = (t0) this.b;
                t0Var.y = false;
                kg.n0 n0Var2 = t0Var.G;
                g0.r(n0Var2);
                if (TextUtils.isEmpty(t0Var.f.getText())) {
                    t0Var.E = null;
                    t0Var.d.b();
                } else {
                    t0Var.y = true;
                    g0.h3(n0Var2, 800L);
                }
                t0Var.c.g3.O(true);
                t0Var.g0();
                break;
            case 12:
                d1 d1Var = (d1) this.b;
                if (!d1Var.c) {
                    d1Var.E = false;
                    d1Var.y = editable.toString();
                    d1Var.Z(true);
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
                cj cjVar = (cj) this.b;
                ti tiVar = cjVar.g0;
                TextUtils.isEmpty(cjVar.E);
                cjVar.E = editable.toString().trim();
                ti tiVar2 = cjVar.b0;
                g0.r(tiVar2);
                if (!TextUtils.isEmpty(cjVar.E)) {
                    String str7 = cjVar.E;
                    cjVar.a0 = str7 != null && str7.length() >= 0;
                    if (!TextUtils.equals(cjVar.W, cjVar.E)) {
                        cjVar.M.clear();
                        cjVar.c0 = 0;
                        cjVar.d0 = false;
                    }
                    g0.h3(tiVar2, 1500L);
                }
                g0.r(tiVar);
                if (!TextUtils.isEmpty(cjVar.E)) {
                    String str8 = cjVar.E;
                    cjVar.n0 = (str8 == null || str8.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.n0) mp.u1(cjVar.b.H3).A7.K.b).c)) ? false : true;
                    if (!TextUtils.equals(cjVar.f0, cjVar.E)) {
                        cjVar.N.clear();
                        cjVar.h0 = false;
                    }
                    g0.h3(tiVar, 1500L);
                }
                cjVar.U();
                break;
            case 19:
                String obj7 = editable.toString();
                if (obj7.isEmpty()) {
                    i0 adapter2 = ((tj) this.b).s.getAdapter();
                    tj tjVar = (tj) this.b;
                    if (adapter2 != tjVar.F) {
                        currentTop2 = tjVar.getCurrentTop();
                        ((tj) this.b).H.setText(gd.M0(2131748031, null));
                        ((tj) this.b).H.c();
                        tj tjVar2 = (tj) this.b;
                        tjVar2.s.setAdapter(tjVar2.F);
                        ((tj) this.b).F.f();
                        if (currentTop2 > 0) {
                            ((tj) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    ty tyVar2 = ((tj) this.b).H;
                    if (tyVar2 != null) {
                        tyVar2.setText(gd.M0(2131747975, null));
                    }
                }
                pj pjVar = ((tj) this.b).G;
                if (pjVar != null) {
                    if (pjVar.f != null) {
                        Utilities.g.a(pjVar.f);
                        pjVar.f = null;
                    }
                    int i13 = pjVar.h + 1;
                    pjVar.h = i13;
                    q5 q5Var = Utilities.g;
                    oj ojVar = new oj(pjVar, obj7, i13, r5);
                    pjVar.f = ojVar;
                    q5Var.d(ojVar, 300L);
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
                ((ai.n) this.b).run();
                break;
            case 22:
                ey eyVar = (ey) this.b;
                eyVar.g(false);
                gq gqVar = eyVar.d;
                String obj8 = gqVar.getText().toString();
                eyVar.c(obj8, true);
                dy dyVar = eyVar.r;
                if (dyVar != null) {
                    dyVar.I1(null);
                    dyVar.J1(TextUtils.isEmpty(obj8), true);
                }
                eyVar.f(!TextUtils.isEmpty(obj8));
                if (gqVar != null) {
                    gqVar.clearAnimation();
                    gqVar.animate().translationX(0.0f).setInterpolator(lr.h).start();
                }
                eyVar.d(false);
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
                pc0 pc0Var = (pc0) this.b;
                if (pc0Var.r.length() == 4 && bz.r == 0) {
                    pc0Var.n(false);
                    break;
                }
                break;
            case 25:
                rl0 rl0Var = (rl0) this.b;
                ImageView imageView2 = rl0Var.b;
                i iVar2 = rl0Var.d;
                boolean z11 = iVar2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                rl0Var.a(iVar2.getText().toString());
                break;
            case 26:
                yw0 yw0Var = (yw0) this.b;
                ww0 ww0Var = yw0Var.c;
                if (ww0Var != null && ww0Var.getVisibility() == 0) {
                    yw0Var.e();
                    break;
                }
                break;
            case 27:
                ny0 ny0Var = (ny0) this.b;
                n6 n6Var = ny0Var.n;
                if (!ny0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        n6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        n6Var.setText("");
                    }
                    x10 x10Var3 = ny0Var.x;
                    if (x10Var3 != null) {
                        x10Var3.a(trim);
                    }
                    fj fjVar = ny0Var.r;
                    if (fjVar != null) {
                        fjVar.M1 = true;
                        ny0Var.d.y3(fjVar, null, false, false, false, false);
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
                n51 n51Var = (n51) this.b;
                String obj9 = n51Var.K.getText().toString();
                o51 o51Var = n51Var.L;
                int b10 = o51Var.o1.getAdapter() == null ? 0 : o51Var.o1.getAdapter().b();
                o51Var.M0(obj9);
                if (TextUtils.isEmpty(obj9) && (b1Var = o51Var.o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    bk0 bk0Var = o51Var.q1;
                    if (adapter3 != bk0Var) {
                        b1 b1Var4 = o51Var.o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(bk0Var);
                        b1 b1Var5 = o51Var.o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            o51Var.P0(0);
                        }
                    }
                }
                o51Var.v1.setVisibility(0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 24:
                pc0 pc0Var = (pc0) this.b;
                LinkedList linkedList = pc0Var.W;
                LinkedList linkedList2 = pc0Var.V;
                Drawable drawable = pc0Var.a;
                if (drawable instanceof bb0) {
                    bb0 bb0Var = (bb0) drawable;
                    bb0Var.D = null;
                    bb0Var.y();
                    float f10 = bb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        bb0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        bb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            pc0Var.b(bb0Var);
                            break;
                        } else {
                            linkedList2.offer(new p6(this, z10, bb0Var, 23));
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
        org.telegram.ui.ActionBar.n0 searchListener;
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
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                org.telegram.ui.ActionBar.n0 n0Var = r0Var.I;
                if (n0Var != null) {
                    n0Var.l(r0Var.e);
                }
                r0Var.k();
                if (!r0Var.h0.isEmpty() && !TextUtils.isEmpty(r0Var.e.getText()) && r0Var.i0 >= 0) {
                    r0Var.i0 = -1;
                    r0Var.E();
                    break;
                }
                break;
            case 16:
                a5 a5Var = (a5) this.b;
                a5Var.m();
                searchListener = a5Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(a5Var.s);
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
