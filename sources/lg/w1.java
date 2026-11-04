package lg;

import ai.c7;
import ai.h4;
import ai.o2;
import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import gi.l3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.q00;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.av;
import org.telegram.ui.c31;
import org.telegram.ui.cw;
import org.telegram.ui.f50;
import org.telegram.ui.g50;
import org.telegram.ui.gy0;
import org.telegram.ui.i91;
import org.telegram.ui.iq;
import org.telegram.ui.iw;
import org.telegram.ui.kb;
import org.telegram.ui.la0;
import org.telegram.ui.m91;
import org.telegram.ui.mv;
import org.telegram.ui.nc1;
import org.telegram.ui.nq;
import org.telegram.ui.os;
import org.telegram.ui.po;
import org.telegram.ui.pq;
import org.telegram.ui.q50;
import org.telegram.ui.qo;
import org.telegram.ui.t50;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.vm0;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean b() {
        switch (this.a) {
            case 11:
                uw uwVar = (uw) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = uwVar.E1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (uwVar.o2 == null) {
                    return true;
                }
                uwVar.finishFragment();
                return false;
            case 18:
                ((vm0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 11:
                uw uwVar = (uw) this.b;
                kVar = ((d2) uwVar).actionBar;
                return !kVar.v() && uwVar.R3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    f5 f5Var = profileActivity.U0;
                    f5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(f5Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.W1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void f() {
        switch (this.a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                nc1 nc1Var = wallpapersListActivity.I;
                nc1Var.n = null;
                nc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(bd.M0(2131745826, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void h() {
        pi.q qVar;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.d = false;
                x1Var.e = null;
                x1Var.a.g3.O(true);
                x1Var.a.v0(0);
                break;
            case 1:
                kb kbVar = (kb) obj;
                kbVar.w0 = "";
                kbVar.J.setVisibility(0);
                if (kbVar.V) {
                    kbVar.V = false;
                    kbVar.Z0(true);
                    break;
                }
                break;
            case 2:
                qo qoVar = (qo) obj;
                qoVar.e.F(null);
                qoVar.O = false;
                qoVar.getClass();
                qoVar.b.setAdapter(qoVar.a);
                qoVar.a.f();
                qoVar.b.setFastScrollVisible(true);
                qoVar.b.setVerticalScrollBarEnabled(false);
                qoVar.d.setShowAtCenter(false);
                qoVar.d.b();
                break;
            case 3:
                nq nqVar = (nq) obj;
                nqVar.e.F(null);
                nqVar.o1 = false;
                ci.j1 j1Var = nqVar.c;
                j1Var.X1 = false;
                j1Var.Y1 = 0;
                j1Var.setAdapter(nqVar.a);
                nqVar.a.f();
                nqVar.c.setFastScrollVisible(true);
                nqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                pq pqVar = (pq) obj;
                pqVar.n = null;
                h4 h4Var = pqVar.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                z7 z7Var = (z7) obj;
                if (z7Var.o1) {
                    z7Var.n1 = false;
                    z7Var.o1 = false;
                    z7Var.r0 = true;
                    z7Var.r1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = z7Var.b2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.c0 = false;
                ujVar.H.setVisibility(0);
                jj jjVar = ujVar.r;
                u4.h0 adapter = jjVar.getAdapter();
                nj njVar = ujVar.w;
                if (adapter != njVar) {
                    jjVar.setAdapter(njVar);
                }
                njVar.f();
                ujVar.E.Y(null, true);
                break;
            case 7:
                uk ukVar = (uk) obj;
                ukVar.d0 = false;
                ukVar.e0 = false;
                ukVar.O.G(null);
                ukVar.j0();
                ukVar.M.setVisibility(0);
                ukVar.K.setVisibility(0);
                ukVar.N.setVisibility(8);
                ukVar.s.setVisibility(8);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.c0 = null;
                contactsActivity.E = false;
                contactsActivity.y = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                os osVar = (os) obj;
                nj njVar2 = osVar.d;
                njVar2.getClass();
                njVar2.e = null;
                osVar.f = false;
                osVar.e = false;
                osVar.a.setAdapter(osVar.c);
                osVar.a.setFastScrollVisible(true);
                break;
            case 10:
                yt ytVar = (yt) obj;
                ytVar.a.getActionBar().l(false);
                ytVar.b.getActionBar().l(false);
                break;
            case 11:
                uw uwVar = (uw) obj;
                iw iwVar = uwVar.Y;
                if (iwVar != null) {
                    ArrayList arrayList = iwVar.G;
                    if (!arrayList.isEmpty() && iwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((kg.l0) arrayList.get(i10)).h) {
                                ((av) iwVar.I).g((kg.l0) arrayList.get(i10));
                            }
                        }
                    }
                }
                uwVar.k2 = false;
                uwVar.l2 = false;
                tw twVar = uwVar.f0[0];
                if (twVar != null) {
                    twVar.a.setEmptyView(uwVar.X2 == 0 ? twVar.x : null);
                    uwVar.a5(false, false, true, false);
                }
                uwVar.m5(false, false);
                hs.e().k(hs.r4, Boolean.TRUE);
                uwVar.Y.setCloseButtonVisible(false);
                uwVar.l5(true);
                uwVar.N3();
                qVar = ((d2) uwVar).glassEngine;
                qVar.g();
                break;
            case 12:
                g50 g50Var = (g50) obj;
                if (g50Var.N) {
                    f50.E(g50Var.f, null);
                    g50Var.N = false;
                    g50Var.d.setAdapter(g50Var.e);
                    break;
                }
                break;
            case 13:
                t50.d0((t50) obj);
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
                la0 la0Var = (la0) obj;
                la0Var.u0 = false;
                la0Var.v0 = false;
                la0Var.T.G(null);
                la0Var.L0();
                f5 f5Var = la0Var.W;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                la0Var.R.setVisibility(0);
                la0Var.P.setVisibility(0);
                la0Var.S.setAdapter(null);
                la0Var.S.setVisibility(8);
                la0Var.K0(false);
                break;
            case 16:
                s80 s80Var = (s80) ((c7) obj).b;
                s80Var.y = false;
                s80Var.j(null);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(bd.M0(2131748219, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                gy0 gy0Var = (gy0) obj;
                gy0Var.f = null;
                if (gy0Var.b != null) {
                    gy0Var.d.setVisibility(8);
                    gy0Var.b.setAdapter(gy0Var.a);
                    break;
                }
                break;
            case 21:
                c31 c31Var = (c31) obj;
                c31Var.a.a(false, true);
                c31Var.o0(false, true);
                c31Var.c.g3.O(false);
                break;
            case 22:
                m91.f0((m91) obj, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.G.invalidate();
                wallpapersListActivity.I.E(null, true);
                wallpapersListActivity.K.setSearchFieldCaption(null);
                f();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r6.L == false) goto L77;
     */
    @Override // org.telegram.ui.ActionBar.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.k kVar;
        pi.q qVar;
        bm0 bm0Var;
        bm0 bm0Var2;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.d = true;
                x1Var.a.g3.O(true);
                x1Var.a.v0(0);
                break;
            case 1:
                kb kbVar = (kb) obj;
                kbVar.J.setVisibility(8);
                kbVar.getClass();
                break;
            case 2:
                qo qoVar = (qo) obj;
                qoVar.O = true;
                qoVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((nq) obj).o1 = true;
                break;
            case 5:
                z7 z7Var = (z7) obj;
                u4.b0 b0Var = z7Var.q1;
                int N0 = b0Var.N0();
                z7Var.j2 = N0;
                View m10 = b0Var.m(N0);
                z7Var.k2 = m10 == null ? 0 : m10.getTop();
                z7Var.o1 = true;
                z7Var.u0(false);
                z7Var.r1.f();
                org.telegram.ui.ActionBar.q0 q0Var = z7Var.b2;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.c0 = true;
                ujVar.H.setVisibility(8);
                ujVar.b.h1(ujVar.G.getSearchField(), true);
                break;
            case 7:
                uk ukVar = (uk) obj;
                ukVar.d0 = true;
                ukVar.b.h1(ukVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.E = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ((os) obj).f = true;
                break;
            case 10:
                yt ytVar = (yt) obj;
                ytVar.a.getActionBar().A();
                ytVar.b.getActionBar().A();
                ytVar.c.getSearchField().requestFocus();
                break;
            case 11:
                uw uwVar = (uw) obj;
                uwVar.k2 = true;
                org.telegram.ui.ActionBar.q0 q0Var2 = uwVar.E1;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(8);
                }
                uwVar.Y3();
                tw twVar = uwVar.f0[0];
                if (twVar != null) {
                    if (uwVar.o2 != null) {
                        twVar.a.c1();
                        cw cwVar = uwVar.D0;
                        if (cwVar != null) {
                            ci.j1 j1Var = cwVar.b0;
                            if (j1Var.h1) {
                                j1Var.h1 = false;
                                j1Var.K0(false);
                            }
                        }
                    }
                    if (!uwVar.m2) {
                        l3 l3Var = uwVar.q0;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = uwVar.r0;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                    }
                }
                mv mvVar = uwVar.F0;
                if (mvVar != null && mvVar.getPremiumHint() != null) {
                    uwVar.F0.getPremiumHint().f(true);
                }
                if (!uwVar.L) {
                    uwVar.O4(0.0f);
                }
                uwVar.m5(false, false);
                kVar = ((d2) uwVar).actionBar;
                kVar.setBackButtonContentDescription(bd.M0(2131754878, null));
                hs.e().k(hs.r4, new Object[0]);
                qVar = ((d2) uwVar).glassEngine;
                qVar.g();
                cw cwVar2 = uwVar.D0;
                if (cwVar2 != null && (bm0Var2 = cwVar2.e0) != null) {
                    bm0Var2.c = kg.b0.d;
                }
                if (cwVar2 == null || (bm0Var = cwVar2.e0) == null || !bm0Var.M()) {
                    ArrayList arrayList = (ArrayList) uwVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!uwVar.u3) {
                            break;
                        }
                    }
                }
                uwVar.l2 = true;
                if (!uwVar.r3) {
                    uwVar.a5(true, false, true, false);
                }
                uwVar.Y.setCloseButtonVisible(true);
                uwVar.l5(true);
                uwVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((la0) obj).u0 = true;
                break;
            case 16:
                ((s80) ((c7) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                vm0 vm0Var = (vm0) obj;
                vm0Var.a.getActionBar().A();
                vm0Var.b.getActionBar().A();
                vm0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                c31 c31Var = (c31) obj;
                c31Var.a.a(true, true);
                c31Var.f.I("");
                c31Var.o0(false, true);
                c31Var.c.g3.O(false);
                break;
            case 22:
                m91 m91Var = (m91) obj;
                m91.f0(m91Var, true);
                i91 i91Var = m91Var.s0;
                if (!i91Var.e0.equals("")) {
                    i91Var.M(i91Var.e[0], i91Var.getCurrentPosition(), "", false);
                }
                m91Var.s0.setAlpha(0.0f);
                m91Var.s0.q0.e(true, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.I);
                wallpapersListActivity.G.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void j(kg.l0 l0Var) {
        switch (this.a) {
            case 6:
                uj ujVar = (uj) this.b;
                tj tjVar = ujVar.E;
                tjVar.S.remove(l0Var);
                tjVar.Y(ujVar.G.getSearchField().getText().toString(), false);
                tjVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                kb kbVar = (kb) this.b;
                kbVar.V = true;
                kbVar.w0 = editTextBoldCursor.getText().toString();
                kbVar.Z0(true);
                break;
            case 18:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.a.getActionBar().z();
                vm0Var.b.getActionBar().z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void l(EditText editText) {
        tj0 tj0Var;
        ci.j1 j1Var;
        cw cwVar;
        bm0 bm0Var;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.e = editText.getText().toString();
                x1Var.a.g3.O(true);
                x1Var.a.v0(0);
                break;
            case 2:
                qo qoVar = (qo) obj;
                if (qoVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (tj0Var = qoVar.b) != null) {
                        u4.h0 adapter = tj0Var.getAdapter();
                        po poVar = qoVar.e;
                        if (adapter != poVar) {
                            qoVar.b.setAdapter(poVar);
                            qoVar.e.f();
                            qoVar.b.setFastScrollVisible(false);
                            qoVar.b.setVerticalScrollBarEnabled(true);
                            qoVar.d.b();
                        }
                    }
                    qoVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                nq nqVar = (nq) obj;
                if (nqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = nqVar.c.getAdapter() == null ? 0 : nqVar.c.getAdapter().b();
                    nqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (j1Var = nqVar.c) != null) {
                        u4.h0 adapter2 = j1Var.getAdapter();
                        iq iqVar = nqVar.a;
                        if (adapter2 != iqVar) {
                            ci.j1 j1Var2 = nqVar.c;
                            j1Var2.X1 = false;
                            j1Var2.Y1 = 0;
                            j1Var2.setAdapter(iqVar);
                            if (b10 == 0) {
                                nqVar.D0(0);
                            }
                        }
                    }
                    nqVar.D1.setVisibility(8);
                    nqVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                pq pqVar = (pq) obj;
                pqVar.n = editText.getText().toString();
                h4 h4Var = pqVar.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                z7 z7Var = (z7) obj;
                if (editText.length() > 0) {
                    z7Var.r1.E(editText.getText().toString());
                    break;
                } else {
                    z7Var.n1 = false;
                    z7Var.r1.E(null);
                    break;
                }
            case 6:
                ((uj) obj).E.Y(editText.getText().toString(), false);
                break;
            case 7:
                uk ukVar = (uk) obj;
                o2 o2Var = ukVar.K;
                ci.j1 j1Var3 = ukVar.M;
                tj0 tj0Var2 = ukVar.N;
                sk skVar = ukVar.O;
                if (skVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        ukVar.e0 = true;
                        ukVar.x.setShowSearchProgress(true);
                        j1Var3.setVisibility(8);
                        o2Var.setVisibility(8);
                        if (tj0Var2.getAdapter() != skVar) {
                            tj0Var2.setAdapter(skVar);
                        }
                        tj0Var2.setVisibility(0);
                        ukVar.f0 = skVar.f.isEmpty();
                        ukVar.j0();
                    } else {
                        j1Var3.setVisibility(0);
                        o2Var.setVisibility(0);
                        tj0Var2.setAdapter(null);
                        tj0Var2.setVisibility(8);
                        ukVar.s.setVisibility(8);
                    }
                    skVar.G(obj4);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.c0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        tj0 tj0Var3 = contactsActivity.d;
                        if (tj0Var3 != null) {
                            tj0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        tj0 tj0Var4 = contactsActivity.d;
                        if (tj0Var4 != null) {
                            tj0Var4.setAdapter(contactsActivity.h);
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
                os osVar = (os) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    nj njVar = osVar.d;
                    njVar.getClass();
                    njVar.e = null;
                    osVar.e = false;
                    osVar.a.setAdapter(osVar.c);
                    osVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    nj njVar2 = osVar.d;
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
                            a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        njVar2.h = timer2;
                        timer2.schedule(new kg.m1(2, njVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        osVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                yt ytVar = (yt) obj;
                ytVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                ytVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                uw uwVar = (uw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((cwVar = uwVar.D0) != null && (bm0Var = cwVar.e0) != null && bm0Var.M()) || uwVar.u3 || uwVar.L)) {
                    uwVar.l2 = true;
                    if (!uwVar.r3) {
                        uwVar.a5(true, false, true, false);
                    }
                }
                cw cwVar2 = uwVar.D0;
                if (cwVar2 != null) {
                    View currentView = cwVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(cwVar2.N0) ? true : !cwVar2.h0;
                    cwVar2.N0 = obj7;
                    cwVar2.P(currentView, cwVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                g50 g50Var = (g50) obj;
                f50.E(g50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != g50Var.N) {
                    g50Var.N = z11;
                    tj0 tj0Var5 = g50Var.d;
                    if (tj0Var5 != null) {
                        tj0Var5.setAdapter(!isEmpty ? g50Var.f : g50Var.e);
                        break;
                    }
                }
                break;
            case 13:
                t50 t50Var = (t50) obj;
                if (editText.length() != 0) {
                    t50Var.y = true;
                    q50 q50Var = t50Var.s;
                    if (!q50Var.h) {
                        q50Var.h = true;
                        q50Var.f();
                    }
                    t50Var.s.E(editText.getText().toString());
                    t50Var.h.setFastScrollVisible(false);
                    t50Var.h.setVerticalScrollBarEnabled(true);
                    t50Var.r.e(true, true);
                    t50Var.r.setStickerType(1);
                    t50Var.r.d.setText(bd.M0(2131748175, null));
                    t50Var.r.e.setText(bd.M0(2131745817, null));
                    break;
                } else {
                    t50.d0(t50Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    tj0 tj0Var6 = languageSelectActivity.b;
                    if (tj0Var6 != null) {
                        tj0Var6.setAdapter(languageSelectActivity.c);
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
                la0 la0Var = (la0) obj;
                if (la0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        la0Var.v0 = true;
                        la0Var.r.setShowSearchProgress(true);
                        f5 f5Var = la0Var.W;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        la0Var.R.setVisibility(8);
                        la0Var.P.setVisibility(8);
                        u4.h0 adapter3 = la0Var.S.getAdapter();
                        sk skVar2 = la0Var.T;
                        if (adapter3 != skVar2) {
                            la0Var.S.setAdapter(skVar2);
                        }
                        la0Var.S.setVisibility(0);
                        la0Var.w0 = la0Var.T.b() == 0;
                    } else {
                        f5 f5Var2 = la0Var.W;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        la0Var.R.setVisibility(0);
                        la0Var.P.setVisibility(0);
                        la0Var.S.setAdapter(null);
                        la0Var.S.setVisibility(8);
                    }
                    la0Var.L0();
                    la0Var.M0();
                    la0Var.T.G(obj10);
                    break;
                }
                break;
            case 16:
                ((s80) ((c7) obj).b).j(editText.getText().toString());
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(bd.M0(2131748175, "NoResult"));
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
                vm0 vm0Var = (vm0) obj;
                vm0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                vm0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                gy0 gy0Var = (gy0) obj;
                if (obj12 == null) {
                    gy0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = gy0Var.f;
                    if (arrayList == null) {
                        gy0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < gy0Var.h.size(); i10++) {
                        q00 q00Var = (q00) gy0Var.h.get(i10);
                        if (q00Var.d.startsWith(lowerCase)) {
                            gy0Var.f.add(0, q00Var);
                        } else if (q00Var.d.contains(lowerCase)) {
                            gy0Var.f.add(q00Var);
                        }
                    }
                    gy0Var.c.f();
                }
                if (obj12.length() != 0) {
                    tj0 tj0Var7 = gy0Var.b;
                    if (tj0Var7 != null) {
                        tj0Var7.setAdapter(gy0Var.c);
                        break;
                    }
                } else if (gy0Var.b != null) {
                    gy0Var.d.setVisibility(8);
                    gy0Var.b.setAdapter(gy0Var.a);
                    break;
                }
                break;
            case 21:
                ((c31) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                i91 i91Var = ((m91) obj).s0;
                if (!i91Var.e0.equals(obj13)) {
                    i91Var.M(i91Var.e[0], i91Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 23:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
                break;
        }
    }

    private final void q(kg.l0 l0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
