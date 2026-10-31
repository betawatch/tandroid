package ag;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ve;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ay;
import org.telegram.ui.dv;
import org.telegram.ui.e01;
import org.telegram.ui.e51;
import org.telegram.ui.iw;
import org.telegram.ui.j60;
import org.telegram.ui.k60;
import org.telegram.ui.kx;
import org.telegram.ui.lb1;
import org.telegram.ui.lr;
import org.telegram.ui.oo0;
import org.telegram.ui.pb1;
import org.telegram.ui.pe1;
import org.telegram.ui.pp;
import org.telegram.ui.pr;
import org.telegram.ui.px;
import org.telegram.ui.qp;
import org.telegram.ui.rr;
import org.telegram.ui.rt;
import org.telegram.ui.sb;
import org.telegram.ui.uw;
import org.telegram.ui.v60;
import org.telegram.ui.y60;
import org.telegram.ui.yb0;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l3 extends org.telegram.ui.ActionBar.p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public boolean b() {
        switch (this.a) {
            case 11:
                ay ayVar = (ay) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = ayVar.D1;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                if (ayVar.n2 == null) {
                    return true;
                }
                ayVar.finishFragment();
                return false;
            case 18:
                ((oo0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 11:
                ay ayVar = (ay) this.b;
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                return !lVar.u() && ayVar.Q3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.V1;
                profileActivity.V1 = !z10;
                if (z10) {
                    p5 p5Var = profileActivity.T0;
                    p5Var.e.clearFocus();
                    org.telegram.messenger.i0.v1(p5Var.e);
                }
                if (profileActivity.V1) {
                    profileActivity.T0.getSearchField().setText("");
                }
                return ProfileActivity.O0(profileActivity, profileActivity.V1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void f() {
        switch (this.a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                pe1 pe1Var = wallpapersListActivity.H;
                pe1Var.n = null;
                pe1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(cd.L0(2131745833, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void h() {
        ei.r rVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.d = false;
                m3Var.e = null;
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.v0 = "";
                sbVar.I.setVisibility(0);
                if (sbVar.U) {
                    sbVar.U = false;
                    sbVar.Y0(true);
                    break;
                }
                break;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.e.F(null);
                qpVar.N = false;
                qpVar.getClass();
                qpVar.b.setAdapter(qpVar.a);
                qpVar.a.f();
                qpVar.b.setFastScrollVisible(true);
                qpVar.b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                qpVar.d.b();
                break;
            case 3:
                pr prVar = (pr) obj;
                prVar.e.F(null);
                prVar.n1 = false;
                b1 b1Var = prVar.c;
                b1Var.W1 = false;
                b1Var.X1 = 0;
                b1Var.setAdapter(prVar.a);
                prVar.a.f();
                prVar.c.setFastScrollVisible(true);
                prVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.n = null;
                ii iiVar = rrVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            case 5:
                w7 w7Var = (w7) obj;
                if (w7Var.n1) {
                    w7Var.m1 = false;
                    w7Var.n1 = false;
                    w7Var.q0 = true;
                    w7Var.q1.E(null);
                    org.telegram.ui.ActionBar.t0 t0Var = w7Var.a2;
                    if (t0Var != null) {
                        t0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                xj xjVar = (xj) obj;
                xjVar.b0 = false;
                xjVar.G.setVisibility(0);
                lj ljVar = xjVar.r;
                s4.g0 adapter = ljVar.getAdapter();
                pj pjVar = xjVar.w;
                if (adapter != pjVar) {
                    ljVar.setAdapter(pjVar);
                }
                pjVar.f();
                xjVar.D.Y(null, true);
                break;
            case 7:
                bl blVar = (bl) obj;
                blVar.i0 = false;
                blVar.j0 = false;
                blVar.P.G(null, null);
                blVar.i0();
                blVar.N.setVisibility(0);
                blVar.L.setVisibility(0);
                blVar.O.setVisibility(8);
                blVar.w.setVisibility(8);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.b0 = null;
                contactsActivity.D = false;
                contactsActivity.y = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.f0(contactsActivity);
                break;
            case 9:
                rt rtVar = (rt) obj;
                pj pjVar2 = rtVar.d;
                pjVar2.getClass();
                pjVar2.e = null;
                rtVar.f = false;
                rtVar.e = false;
                rtVar.a.setAdapter(rtVar.c);
                rtVar.a.setFastScrollVisible(true);
                break;
            case 10:
                dv dvVar = (dv) obj;
                dvVar.a.getActionBar().k(false);
                dvVar.b.getActionBar().k(false);
                break;
            case 11:
                ay ayVar = (ay) obj;
                px pxVar = ayVar.X;
                if (pxVar != null) {
                    ArrayList arrayList = pxVar.F;
                    if (!arrayList.isEmpty() && pxVar.H != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((zf.e0) arrayList.get(i11)).h) {
                                ((iw) pxVar.H).h((zf.e0) arrayList.get(i11));
                            }
                        }
                    }
                }
                ayVar.j2 = false;
                ayVar.k2 = false;
                zx zxVar = ayVar.e0[0];
                if (zxVar != null) {
                    zxVar.a.setEmptyView(ayVar.W2 == 0 ? zxVar.x : null);
                    ayVar.Z4(false, false, true, false);
                }
                ayVar.l5(false, false);
                zs.e().k(zs.r4, Boolean.TRUE);
                ayVar.X.setCloseButtonVisible(false);
                ayVar.k5(true);
                ayVar.M3();
                rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
                rVar.g();
                break;
            case 12:
                k60 k60Var = (k60) obj;
                if (k60Var.M) {
                    j60.E(k60Var.f, null);
                    k60Var.M = false;
                    k60Var.d.setAdapter(k60Var.e);
                    break;
                }
                break;
            case 13:
                y60.c0((y60) obj);
                break;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 15:
                yb0 yb0Var = (yb0) obj;
                yb0Var.z0 = false;
                yb0Var.A0 = false;
                yb0Var.U.G(null, null);
                yb0Var.P0();
                p5 p5Var = yb0Var.X;
                if (p5Var != null) {
                    p5Var.setVisibility(0);
                }
                yb0Var.S.setVisibility(0);
                yb0Var.Q.setVisibility(0);
                yb0Var.T.setAdapter(null);
                yb0Var.T.setVisibility(8);
                yb0Var.O0(false);
                break;
            case 16:
                o90 o90Var = (o90) ((kg.q1) obj).b;
                o90Var.y = false;
                o90Var.j(null);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(cd.L0(2131748228, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                e01 e01Var = (e01) obj;
                e01Var.f = null;
                if (e01Var.b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.b.setAdapter(e01Var.a);
                    break;
                }
                break;
            case 21:
                e51 e51Var = (e51) obj;
                e51Var.a.a(false, true);
                e51Var.n0(false, true);
                e51Var.c.f3.O(false);
                break;
            case 22:
                pb1.e0((pb1) obj, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
                wallpapersListActivity.F.invalidate();
                wallpapersListActivity.H.E(null, true);
                wallpapersListActivity.J.setSearchFieldCaption(null);
                f();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r6.K == false) goto L77;
     */
    @Override // org.telegram.ui.ActionBar.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.l lVar;
        ei.r rVar;
        zm0 zm0Var;
        zm0 zm0Var2;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.d = true;
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.I.setVisibility(8);
                sbVar.getClass();
                break;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.N = true;
                qpVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((pr) obj).n1 = true;
                break;
            case 5:
                w7 w7Var = (w7) obj;
                s4.a0 a0Var = w7Var.p1;
                int N0 = a0Var.N0();
                w7Var.i2 = N0;
                View m10 = a0Var.m(N0);
                w7Var.j2 = m10 == null ? 0 : m10.getTop();
                w7Var.n1 = true;
                w7Var.u0(false);
                w7Var.q1.f();
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.a2;
                if (t0Var != null) {
                    t0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                xj xjVar = (xj) obj;
                xjVar.b0 = true;
                xjVar.G.setVisibility(8);
                xjVar.b.g1(xjVar.F.getSearchField(), true);
                break;
            case 7:
                bl blVar = (bl) obj;
                blVar.i0 = true;
                blVar.b.g1(blVar.y.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.D = true;
                ContactsActivity.f0(contactsActivity);
                break;
            case 9:
                ((rt) obj).f = true;
                break;
            case 10:
                dv dvVar = (dv) obj;
                dvVar.a.getActionBar().A();
                dvVar.b.getActionBar().A();
                dvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ay ayVar = (ay) obj;
                ayVar.j2 = true;
                org.telegram.ui.ActionBar.t0 t0Var2 = ayVar.D1;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(8);
                }
                ayVar.X3();
                zx zxVar = ayVar.e0[0];
                if (zxVar != null) {
                    if (ayVar.n2 != null) {
                        zxVar.a.c1();
                        kx kxVar = ayVar.C0;
                        if (kxVar != null) {
                            b1 b1Var = kxVar.a0;
                            if (b1Var.g1) {
                                b1Var.g1 = false;
                                b1Var.K0(false);
                            }
                        }
                    }
                    if (!ayVar.l2) {
                        vh.p2 p2Var = ayVar.p0;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        vh.p2 p2Var2 = ayVar.q0;
                        if (p2Var2 != null) {
                            p2Var2.e(true);
                        }
                    }
                }
                uw uwVar = ayVar.E0;
                if (uwVar != null && uwVar.getPremiumHint() != null) {
                    ayVar.E0.getPremiumHint().e(true);
                }
                if (!ayVar.K) {
                    ayVar.N4(0.0f);
                }
                ayVar.l5(false, false);
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                lVar.setBackButtonContentDescription(cd.L0(2131754878, null));
                zs.e().k(zs.r4, new Object[0]);
                rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
                rVar.g();
                kx kxVar2 = ayVar.C0;
                if (kxVar2 != null && (zm0Var2 = kxVar2.d0) != null) {
                    zm0Var2.c = zf.w.d;
                }
                if (kxVar2 == null || (zm0Var = kxVar2.d0) == null || !zm0Var.M()) {
                    ArrayList arrayList = (ArrayList) ayVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!ayVar.t3) {
                            break;
                        }
                    }
                }
                ayVar.k2 = true;
                if (!ayVar.q3) {
                    ayVar.Z4(true, false, true, false);
                }
                ayVar.X.setCloseButtonVisible(true);
                ayVar.k5(true);
                ayVar.M3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((yb0) obj).z0 = true;
                break;
            case 16:
                ((o90) ((kg.q1) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                oo0 oo0Var = (oo0) obj;
                oo0Var.a.getActionBar().A();
                oo0Var.b.getActionBar().A();
                oo0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                e51 e51Var = (e51) obj;
                e51Var.a.a(true, true);
                e51Var.f.I("");
                e51Var.n0(false, true);
                e51Var.c.f3.O(false);
                break;
            case 22:
                pb1 pb1Var = (pb1) obj;
                pb1.e0(pb1Var, true);
                lb1 lb1Var = pb1Var.r0;
                if (!lb1Var.d0.equals("")) {
                    lb1Var.M(lb1Var.e[0], lb1Var.getCurrentPosition(), "", false);
                }
                pb1Var.r0.setAlpha(0.0f);
                pb1Var.r0.p0.e(true, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.F.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void j(zf.e0 e0Var) {
        switch (this.a) {
            case 6:
                xj xjVar = (xj) this.b;
                wj wjVar = xjVar.D;
                wjVar.R.remove(e0Var);
                wjVar.Y(xjVar.F.getSearchField().getText().toString(), false);
                wjVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                sb sbVar = (sb) this.b;
                sbVar.U = true;
                sbVar.v0 = editTextBoldCursor.getText().toString();
                sbVar.Y0(true);
                break;
            case 18:
                oo0 oo0Var = (oo0) this.b;
                oo0Var.a.getActionBar().z();
                oo0Var.b.getActionBar().z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void l(EditText editText) {
        tk0 tk0Var;
        b1 b1Var;
        kx kxVar;
        zm0 zm0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.e = editText.getText().toString();
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 2:
                qp qpVar = (qp) obj;
                if (qpVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (tk0Var = qpVar.b) != null) {
                        s4.g0 adapter = tk0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.b.setAdapter(ppVar);
                            qpVar.e.f();
                            qpVar.b.setFastScrollVisible(false);
                            qpVar.b.setVerticalScrollBarEnabled(true);
                            qpVar.d.b();
                        }
                    }
                    qpVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                pr prVar = (pr) obj;
                if (prVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = prVar.c.getAdapter() == null ? 0 : prVar.c.getAdapter().b();
                    prVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = prVar.c) != null) {
                        s4.g0 adapter2 = b1Var.getAdapter();
                        lr lrVar = prVar.a;
                        if (adapter2 != lrVar) {
                            b1 b1Var2 = prVar.c;
                            b1Var2.W1 = false;
                            b1Var2.X1 = 0;
                            b1Var2.setAdapter(lrVar);
                            if (b10 == 0) {
                                prVar.C0(0);
                            }
                        }
                    }
                    prVar.C1.setVisibility(8);
                    prVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.n = editText.getText().toString();
                ii iiVar = rrVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            case 5:
                w7 w7Var = (w7) obj;
                if (editText.length() > 0) {
                    w7Var.q1.E(editText.getText().toString());
                    break;
                } else {
                    w7Var.m1 = false;
                    w7Var.q1.E(null);
                    break;
                }
            case 6:
                ((xj) obj).D.Y(editText.getText().toString(), false);
                break;
            case 7:
                bl blVar = (bl) obj;
                jg.l0 l0Var = blVar.L;
                b1 b1Var3 = blVar.N;
                tk0 tk0Var2 = blVar.O;
                vk vkVar = blVar.P;
                if (vkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        blVar.j0 = true;
                        blVar.y.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        l0Var.setVisibility(8);
                        if (tk0Var2.getAdapter() != vkVar) {
                            tk0Var2.setAdapter(vkVar);
                        }
                        tk0Var2.setVisibility(0);
                        blVar.k0 = vkVar.s.size() == 0 && vkVar.r.size() == 0;
                        blVar.i0();
                    } else {
                        b1Var3.setVisibility(0);
                        l0Var.setVisibility(0);
                        tk0Var2.setAdapter(null);
                        tk0Var2.setVisibility(8);
                        blVar.w.setVisibility(8);
                    }
                    vkVar.G(obj4, blVar.o0);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.b0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        tk0 tk0Var3 = contactsActivity.d;
                        if (tk0Var3 != null) {
                            tk0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        tk0 tk0Var4 = contactsActivity.d;
                        if (tk0Var4 != null) {
                            tk0Var4.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.c.e(true, true);
                        contactsActivity.h.G(obj5);
                        break;
                    }
                }
                break;
            case 9:
                rt rtVar = (rt) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    pj pjVar = rtVar.d;
                    pjVar.getClass();
                    pjVar.e = null;
                    rtVar.e = false;
                    rtVar.a.setAdapter(rtVar.c);
                    rtVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    pj pjVar2 = rtVar.d;
                    pjVar2.getClass();
                    if (obj6 == null) {
                        pjVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) pjVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                        Timer timer2 = new Timer();
                        pjVar2.h = timer2;
                        timer2.schedule(new ve(r4 ? 1 : 0, pjVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        rtVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                dv dvVar = (dv) obj;
                dvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                dvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                ay ayVar = (ay) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((kxVar = ayVar.C0) != null && (zm0Var = kxVar.d0) != null && zm0Var.M()) || ayVar.t3 || ayVar.K)) {
                    ayVar.k2 = true;
                    if (!ayVar.q3) {
                        ayVar.Z4(true, false, true, false);
                    }
                }
                kx kxVar2 = ayVar.C0;
                if (kxVar2 != null) {
                    View currentView = kxVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(kxVar2.M0) ? true : !kxVar2.g0;
                    kxVar2.M0 = obj7;
                    kxVar2.P(currentView, kxVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                k60 k60Var = (k60) obj;
                j60.E(k60Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != k60Var.M) {
                    k60Var.M = z11;
                    tk0 tk0Var5 = k60Var.d;
                    if (tk0Var5 != null) {
                        tk0Var5.setAdapter(!isEmpty ? k60Var.f : k60Var.e);
                        break;
                    }
                }
                break;
            case 13:
                y60 y60Var = (y60) obj;
                if (editText.length() != 0) {
                    y60Var.y = true;
                    v60 v60Var = y60Var.s;
                    if (!v60Var.h) {
                        v60Var.h = true;
                        v60Var.f();
                    }
                    y60Var.s.E(editText.getText().toString());
                    y60Var.h.setFastScrollVisible(false);
                    y60Var.h.setVerticalScrollBarEnabled(true);
                    y60Var.r.e(true, true);
                    y60Var.r.setStickerType(1);
                    y60Var.r.d.setText(cd.L0(2131748183, null));
                    y60Var.r.e.setText(cd.L0(2131745824, null));
                    break;
                } else {
                    y60.c0(y60Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    tk0 tk0Var6 = languageSelectActivity.b;
                    if (tk0Var6 != null) {
                        tk0Var6.setAdapter(languageSelectActivity.c);
                        break;
                    }
                } else {
                    languageSelectActivity.getClass();
                    languageSelectActivity.getClass();
                    if (languageSelectActivity.b != null) {
                        languageSelectActivity.d.setVisibility(8);
                        languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                        break;
                    }
                }
                break;
            case 15:
                yb0 yb0Var = (yb0) obj;
                if (yb0Var.U != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        yb0Var.A0 = true;
                        yb0Var.s.setShowSearchProgress(true);
                        p5 p5Var = yb0Var.X;
                        if (p5Var != null) {
                            p5Var.setVisibility(8);
                        }
                        yb0Var.S.setVisibility(8);
                        yb0Var.Q.setVisibility(8);
                        s4.g0 adapter3 = yb0Var.T.getAdapter();
                        vk vkVar2 = yb0Var.U;
                        if (adapter3 != vkVar2) {
                            yb0Var.T.setAdapter(vkVar2);
                        }
                        yb0Var.T.setVisibility(0);
                        yb0Var.B0 = yb0Var.U.b() == 0;
                    } else {
                        p5 p5Var2 = yb0Var.X;
                        if (p5Var2 != null) {
                            p5Var2.setVisibility(0);
                        }
                        yb0Var.S.setVisibility(0);
                        yb0Var.Q.setVisibility(0);
                        yb0Var.T.setAdapter(null);
                        yb0Var.T.setVisibility(8);
                    }
                    yb0Var.P0();
                    yb0Var.Q0();
                    yb0Var.U.G(obj10, yb0Var.F0);
                    break;
                }
                break;
            case 16:
                ((o90) ((kg.q1) obj).b).j(editText.getText().toString());
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(cd.L0(2131748183, "NoResult"));
                            notificationsCustomSettingsActivity.c.b();
                            notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    break;
                }
                break;
            case 18:
                oo0 oo0Var = (oo0) obj;
                oo0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                oo0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                e01 e01Var = (e01) obj;
                if (obj12 == null) {
                    e01Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = e01Var.f;
                    if (arrayList == null) {
                        e01Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e01Var.h.size(); i11++) {
                        m10 m10Var = (m10) e01Var.h.get(i11);
                        if (m10Var.d.startsWith(lowerCase)) {
                            e01Var.f.add(0, m10Var);
                        } else if (m10Var.d.contains(lowerCase)) {
                            e01Var.f.add(m10Var);
                        }
                    }
                    e01Var.c.f();
                }
                if (obj12.length() != 0) {
                    tk0 tk0Var7 = e01Var.b;
                    if (tk0Var7 != null) {
                        tk0Var7.setAdapter(e01Var.c);
                        break;
                    }
                } else if (e01Var.b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.b.setAdapter(e01Var.a);
                    break;
                }
                break;
            case 21:
                ((e51) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                lb1 lb1Var = ((pb1) obj).r0;
                if (!lb1Var.d0.equals(obj13)) {
                    lb1Var.M(lb1Var.e[0], lb1Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 23:
                ((WallpapersListActivity) obj).H.E(editText.getText().toString(), false);
                break;
        }
    }

    private final void q(zf.e0 e0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
