package kg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.e5;
import bi.w4;
import fi.m3;
import fi.w3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.c60;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.gv;
import org.telegram.ui.iw;
import org.telegram.ui.mb;
import org.telegram.ui.nq;
import org.telegram.ui.o31;
import org.telegram.ui.o50;
import org.telegram.ui.ow;
import org.telegram.ui.p50;
import org.telegram.ui.rq;
import org.telegram.ui.sa0;
import org.telegram.ui.sv;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.uy0;
import org.telegram.ui.v91;
import org.telegram.ui.wc1;
import org.telegram.ui.yw;
import org.telegram.ui.z50;
import org.telegram.ui.z91;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v1 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean b() {
        switch (this.a) {
            case 11:
                zw zwVar = (zw) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = zwVar.E1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (zwVar.o2 == null) {
                    return true;
                }
                zwVar.finishFragment();
                return false;
            case 18:
                ((dn0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 11:
                zw zwVar = (zw) this.b;
                lVar = ((f2) zwVar).actionBar;
                return !lVar.x() && zwVar.R3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z9 = profileActivity.V1;
                profileActivity.V1 = !z9;
                if (z9) {
                    g5 g5Var = profileActivity.T0;
                    g5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(g5Var.e);
                }
                if (profileActivity.V1) {
                    profileActivity.T0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.V1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void f() {
        switch (this.a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                wc1 wc1Var = wallpapersListActivity.H;
                wc1Var.n = null;
                wc1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(id.M0(2131745816, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void h() {
        oi.q qVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.d = false;
                w1Var.e = null;
                w1Var.a.f3.O(true);
                w1Var.a.v0(0);
                break;
            case 1:
                mb mbVar = (mb) obj;
                mbVar.v0 = "";
                mbVar.I.setVisibility(0);
                if (mbVar.U) {
                    mbVar.U = false;
                    mbVar.Z0(true);
                    break;
                }
                break;
            case 2:
                uo uoVar = (uo) obj;
                uoVar.e.F(null);
                uoVar.N = false;
                uoVar.getClass();
                uoVar.b.setAdapter(uoVar.a);
                uoVar.a.f();
                uoVar.b.setFastScrollVisible(true);
                uoVar.b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                break;
            case 3:
                rq rqVar = (rq) obj;
                rqVar.e.F(null);
                rqVar.n1 = false;
                bi.q1 q1Var = rqVar.c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(rqVar.a);
                rqVar.a.f();
                rqVar.c.setFastScrollVisible(true);
                rqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                tq tqVar = (tq) obj;
                tqVar.n = null;
                w3 w3Var = tqVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            case 5:
                a8 a8Var = (a8) obj;
                if (a8Var.q1) {
                    a8Var.p1 = false;
                    a8Var.q1 = false;
                    a8Var.q0 = true;
                    a8Var.t1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = a8Var.d2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.b0 = false;
                ujVar.G.setVisibility(0);
                jj jjVar = ujVar.r;
                v4.g0 adapter = jjVar.getAdapter();
                nj njVar = ujVar.w;
                if (adapter != njVar) {
                    jjVar.setAdapter(njVar);
                }
                njVar.f();
                ujVar.D.Y(null, true);
                break;
            case 7:
                vk vkVar = (vk) obj;
                vkVar.c0 = false;
                vkVar.d0 = false;
                vkVar.N.G(null);
                vkVar.j0();
                vkVar.L.setVisibility(0);
                vkVar.J.setVisibility(0);
                vkVar.M.setVisibility(8);
                vkVar.s.setVisibility(8);
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
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ts tsVar = (ts) obj;
                nj njVar2 = tsVar.d;
                njVar2.getClass();
                njVar2.e = null;
                tsVar.f = false;
                tsVar.e = false;
                tsVar.a.setAdapter(tsVar.c);
                tsVar.a.setFastScrollVisible(true);
                break;
            case 10:
                du duVar = (du) obj;
                duVar.a.getActionBar().n(false);
                duVar.b.getActionBar().n(false);
                break;
            case 11:
                zw zwVar = (zw) obj;
                ow owVar = zwVar.X;
                if (owVar != null) {
                    ArrayList arrayList = owVar.F;
                    if (!arrayList.isEmpty() && owVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((gv) owVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                zwVar.k2 = false;
                zwVar.l2 = false;
                yw ywVar = zwVar.e0[0];
                if (ywVar != null) {
                    ywVar.a.setEmptyView(zwVar.X2 == 0 ? ywVar.x : null);
                    zwVar.a5(false, false, true, false);
                }
                zwVar.m5(false, false);
                qs.e().k(qs.r4, Boolean.TRUE);
                zwVar.X.setCloseButtonVisible(false);
                zwVar.l5(true);
                zwVar.N3();
                qVar = ((f2) zwVar).glassEngine;
                qVar.g();
                break;
            case 12:
                p50 p50Var = (p50) obj;
                if (p50Var.M) {
                    o50.E(p50Var.f, null);
                    p50Var.M = false;
                    p50Var.d.setAdapter(p50Var.e);
                    break;
                }
                break;
            case 13:
                c60.d0((c60) obj);
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
                sa0 sa0Var = (sa0) obj;
                sa0Var.t0 = false;
                sa0Var.u0 = false;
                sa0Var.S.G(null);
                sa0Var.L0();
                g5 g5Var = sa0Var.V;
                if (g5Var != null) {
                    g5Var.setVisibility(0);
                }
                sa0Var.Q.setVisibility(0);
                sa0Var.O.setVisibility(0);
                sa0Var.R.setAdapter(null);
                sa0Var.R.setVisibility(8);
                sa0Var.K0(false);
                break;
            case 16:
                w80 w80Var = (w80) ((w4) obj).b;
                w80Var.y = false;
                w80Var.j(null);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(id.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                uy0 uy0Var = (uy0) obj;
                uy0Var.f = null;
                if (uy0Var.b != null) {
                    uy0Var.d.setVisibility(8);
                    uy0Var.b.setAdapter(uy0Var.a);
                    break;
                }
                break;
            case 21:
                o31 o31Var = (o31) obj;
                o31Var.a.a(false, true);
                o31Var.o0(false, true);
                o31Var.c.f3.O(false);
                break;
            case 22:
                z91.f0((z91) obj, false);
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
    @Override // org.telegram.ui.ActionBar.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.l lVar;
        oi.q qVar;
        yl0 yl0Var;
        yl0 yl0Var2;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.d = true;
                w1Var.a.f3.O(true);
                w1Var.a.v0(0);
                break;
            case 1:
                mb mbVar = (mb) obj;
                mbVar.I.setVisibility(8);
                mbVar.getClass();
                break;
            case 2:
                uo uoVar = (uo) obj;
                uoVar.N = true;
                uoVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((rq) obj).n1 = true;
                break;
            case 5:
                a8 a8Var = (a8) obj;
                v4.b0 b0Var = a8Var.s1;
                int N0 = b0Var.N0();
                a8Var.l2 = N0;
                View m10 = b0Var.m(N0);
                a8Var.m2 = m10 == null ? 0 : m10.getTop();
                a8Var.q1 = true;
                a8Var.u0(false);
                a8Var.t1.f();
                org.telegram.ui.ActionBar.r0 r0Var = a8Var.d2;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.b0 = true;
                ujVar.G.setVisibility(8);
                ujVar.b.h1(ujVar.F.getSearchField(), true);
                break;
            case 7:
                vk vkVar = (vk) obj;
                vkVar.c0 = true;
                vkVar.b.h1(vkVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.D = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ((ts) obj).f = true;
                break;
            case 10:
                du duVar = (du) obj;
                duVar.a.getActionBar().C();
                duVar.b.getActionBar().C();
                duVar.c.getSearchField().requestFocus();
                break;
            case 11:
                zw zwVar = (zw) obj;
                zwVar.k2 = true;
                org.telegram.ui.ActionBar.r0 r0Var2 = zwVar.E1;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(8);
                }
                zwVar.Y3();
                yw ywVar = zwVar.e0[0];
                if (ywVar != null) {
                    if (zwVar.o2 != null) {
                        ywVar.a.c1();
                        iw iwVar = zwVar.C0;
                        if (iwVar != null) {
                            bi.q1 q1Var = iwVar.a0;
                            if (q1Var.g1) {
                                q1Var.g1 = false;
                                q1Var.K0(false);
                            }
                        }
                    }
                    if (!zwVar.m2) {
                        m3 m3Var = zwVar.p0;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = zwVar.q0;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                    }
                }
                sv svVar = zwVar.E0;
                if (svVar != null && svVar.getPremiumHint() != null) {
                    zwVar.E0.getPremiumHint().f(true);
                }
                if (!zwVar.K) {
                    zwVar.O4(0.0f);
                }
                zwVar.m5(false, false);
                lVar = ((f2) zwVar).actionBar;
                lVar.setBackButtonContentDescription(id.M0(2131754878, null));
                qs.e().k(qs.r4, new Object[0]);
                qVar = ((f2) zwVar).glassEngine;
                qVar.g();
                iw iwVar2 = zwVar.C0;
                if (iwVar2 != null && (yl0Var2 = iwVar2.d0) != null) {
                    yl0Var2.c = jg.e0.d;
                }
                if (iwVar2 == null || (yl0Var = iwVar2.d0) == null || !yl0Var.M()) {
                    ArrayList arrayList = (ArrayList) zwVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!zwVar.u3) {
                            break;
                        }
                    }
                }
                zwVar.l2 = true;
                if (!zwVar.r3) {
                    zwVar.a5(true, false, true, false);
                }
                zwVar.X.setCloseButtonVisible(true);
                zwVar.l5(true);
                zwVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((sa0) obj).t0 = true;
                break;
            case 16:
                ((w80) ((w4) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                dn0 dn0Var = (dn0) obj;
                dn0Var.a.getActionBar().C();
                dn0Var.b.getActionBar().C();
                dn0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                o31 o31Var = (o31) obj;
                o31Var.a.a(true, true);
                o31Var.f.I("");
                o31Var.o0(false, true);
                o31Var.c.f3.O(false);
                break;
            case 22:
                z91 z91Var = (z91) obj;
                z91.f0(z91Var, true);
                v91 v91Var = z91Var.r0;
                if (!v91Var.d0.equals("")) {
                    v91Var.M(v91Var.e[0], v91Var.getCurrentPosition(), "", false);
                }
                z91Var.r0.setAlpha(0.0f);
                z91Var.r0.p0.e(true, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.F.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void j(jg.o0 o0Var) {
        switch (this.a) {
            case 6:
                uj ujVar = (uj) this.b;
                tj tjVar = ujVar.D;
                tjVar.R.remove(o0Var);
                tjVar.Y(ujVar.F.getSearchField().getText().toString(), false);
                tjVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                mbVar.U = true;
                mbVar.v0 = editTextBoldCursor.getText().toString();
                mbVar.Z0(true);
                break;
            case 18:
                dn0 dn0Var = (dn0) this.b;
                dn0Var.a.getActionBar().B();
                dn0Var.b.getActionBar().B();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void l(EditText editText) {
        pj0 pj0Var;
        bi.q1 q1Var;
        iw iwVar;
        yl0 yl0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.e = editText.getText().toString();
                w1Var.a.f3.O(true);
                w1Var.a.v0(0);
                break;
            case 2:
                uo uoVar = (uo) obj;
                if (uoVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (pj0Var = uoVar.b) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        to toVar = uoVar.e;
                        if (adapter != toVar) {
                            uoVar.b.setAdapter(toVar);
                            uoVar.e.f();
                            uoVar.b.setFastScrollVisible(false);
                            uoVar.b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                rq rqVar = (rq) obj;
                if (rqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = rqVar.c.getAdapter() == null ? 0 : rqVar.c.getAdapter().b();
                    rqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = rqVar.c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        nq nqVar = rqVar.a;
                        if (adapter2 != nqVar) {
                            bi.q1 q1Var2 = rqVar.c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(nqVar);
                            if (b10 == 0) {
                                rqVar.D0(0);
                            }
                        }
                    }
                    rqVar.C1.setVisibility(8);
                    rqVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                tq tqVar = (tq) obj;
                tqVar.n = editText.getText().toString();
                w3 w3Var = tqVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            case 5:
                a8 a8Var = (a8) obj;
                if (editText.length() > 0) {
                    a8Var.t1.E(editText.getText().toString());
                    break;
                } else {
                    a8Var.p1 = false;
                    a8Var.t1.E(null);
                    break;
                }
            case 6:
                ((uj) obj).D.Y(editText.getText().toString(), false);
                break;
            case 7:
                vk vkVar = (vk) obj;
                e5 e5Var = vkVar.J;
                bi.q1 q1Var3 = vkVar.L;
                pj0 pj0Var2 = vkVar.M;
                tk tkVar = vkVar.N;
                if (tkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        vkVar.d0 = true;
                        vkVar.x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (pj0Var2.getAdapter() != tkVar) {
                            pj0Var2.setAdapter(tkVar);
                        }
                        pj0Var2.setVisibility(0);
                        vkVar.e0 = tkVar.f.isEmpty();
                        vkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        pj0Var2.setAdapter(null);
                        pj0Var2.setVisibility(8);
                        vkVar.s.setVisibility(8);
                    }
                    tkVar.G(obj4);
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
                        pj0 pj0Var3 = contactsActivity.d;
                        if (pj0Var3 != null) {
                            pj0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        pj0 pj0Var4 = contactsActivity.d;
                        if (pj0Var4 != null) {
                            pj0Var4.setAdapter(contactsActivity.h);
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
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    nj njVar = tsVar.d;
                    njVar.getClass();
                    njVar.e = null;
                    tsVar.e = false;
                    tsVar.a.setAdapter(tsVar.c);
                    tsVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    nj njVar2 = tsVar.d;
                    njVar2.getClass();
                    if (obj6 == null) {
                        njVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) njVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        njVar2.h = timer2;
                        timer2.schedule(new jg.q1(2, njVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        tsVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                du duVar = (du) obj;
                duVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                duVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                zw zwVar = (zw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((iwVar = zwVar.C0) != null && (yl0Var = iwVar.d0) != null && yl0Var.M()) || zwVar.u3 || zwVar.K)) {
                    zwVar.l2 = true;
                    if (!zwVar.r3) {
                        zwVar.a5(true, false, true, false);
                    }
                }
                iw iwVar2 = zwVar.C0;
                if (iwVar2 != null) {
                    View currentView = iwVar2.getCurrentView();
                    boolean z9 = TextUtils.isEmpty(iwVar2.M0) ? true : !iwVar2.g0;
                    iwVar2.M0 = obj7;
                    iwVar2.P(currentView, iwVar2.getCurrentPosition(), obj7, z9);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                p50 p50Var = (p50) obj;
                o50.E(p50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z10 = !isEmpty;
                if (z10 != p50Var.M) {
                    p50Var.M = z10;
                    pj0 pj0Var5 = p50Var.d;
                    if (pj0Var5 != null) {
                        pj0Var5.setAdapter(!isEmpty ? p50Var.f : p50Var.e);
                        break;
                    }
                }
                break;
            case 13:
                c60 c60Var = (c60) obj;
                if (editText.length() != 0) {
                    c60Var.y = true;
                    z50 z50Var = c60Var.s;
                    if (!z50Var.h) {
                        z50Var.h = true;
                        z50Var.f();
                    }
                    c60Var.s.E(editText.getText().toString());
                    c60Var.h.setFastScrollVisible(false);
                    c60Var.h.setVerticalScrollBarEnabled(true);
                    c60Var.r.e(true, true);
                    c60Var.r.setStickerType(1);
                    c60Var.r.d.setText(id.M0(2131748167, null));
                    c60Var.r.e.setText(id.M0(2131745807, null));
                    break;
                } else {
                    c60.d0(c60Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    pj0 pj0Var6 = languageSelectActivity.b;
                    if (pj0Var6 != null) {
                        pj0Var6.setAdapter(languageSelectActivity.c);
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
                sa0 sa0Var = (sa0) obj;
                if (sa0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        sa0Var.u0 = true;
                        sa0Var.r.setShowSearchProgress(true);
                        g5 g5Var = sa0Var.V;
                        if (g5Var != null) {
                            g5Var.setVisibility(8);
                        }
                        sa0Var.Q.setVisibility(8);
                        sa0Var.O.setVisibility(8);
                        v4.g0 adapter3 = sa0Var.R.getAdapter();
                        tk tkVar2 = sa0Var.S;
                        if (adapter3 != tkVar2) {
                            sa0Var.R.setAdapter(tkVar2);
                        }
                        sa0Var.R.setVisibility(0);
                        sa0Var.v0 = sa0Var.S.b() == 0;
                    } else {
                        g5 g5Var2 = sa0Var.V;
                        if (g5Var2 != null) {
                            g5Var2.setVisibility(0);
                        }
                        sa0Var.Q.setVisibility(0);
                        sa0Var.O.setVisibility(0);
                        sa0Var.R.setAdapter(null);
                        sa0Var.R.setVisibility(8);
                    }
                    sa0Var.L0();
                    sa0Var.M0();
                    sa0Var.S.G(obj10);
                    break;
                }
                break;
            case 16:
                ((w80) ((w4) obj).b).j(editText.getText().toString());
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(id.M0(2131748167, "NoResult"));
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
                dn0 dn0Var = (dn0) obj;
                dn0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                dn0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                uy0 uy0Var = (uy0) obj;
                if (obj12 == null) {
                    uy0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = uy0Var.f;
                    if (arrayList == null) {
                        uy0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < uy0Var.h.size(); i10++) {
                        y00 y00Var = (y00) uy0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            uy0Var.f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            uy0Var.f.add(y00Var);
                        }
                    }
                    uy0Var.c.f();
                }
                if (obj12.length() != 0) {
                    pj0 pj0Var7 = uy0Var.b;
                    if (pj0Var7 != null) {
                        pj0Var7.setAdapter(uy0Var.c);
                        break;
                    }
                } else if (uy0Var.b != null) {
                    uy0Var.d.setVisibility(8);
                    uy0Var.b.setAdapter(uy0Var.a);
                    break;
                }
                break;
            case 21:
                ((o31) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                v91 v91Var = ((z91) obj).r0;
                if (!v91Var.d0.equals(obj13)) {
                    v91Var.M(v91Var.e[0], v91Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 23:
                ((WallpapersListActivity) obj).H.E(editText.getText().toString(), false);
                break;
        }
    }

    private final void q(jg.o0 o0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
