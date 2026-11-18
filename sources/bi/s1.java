package bi;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.s00;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.yj;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a60;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.eu;
import org.telegram.ui.fn0;
import org.telegram.ui.hv;
import org.telegram.ui.kw;
import org.telegram.ui.lb;
import org.telegram.ui.m50;
import org.telegram.ui.n50;
import org.telegram.ui.nq;
import org.telegram.ui.o31;
import org.telegram.ui.pa0;
import org.telegram.ui.qw;
import org.telegram.ui.rq;
import org.telegram.ui.sy0;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.tv;
import org.telegram.ui.u91;
import org.telegram.ui.uc1;
import org.telegram.ui.uo;
import org.telegram.ui.vo;
import org.telegram.ui.x50;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s1 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean b() {
        switch (this.a) {
            case 12:
                cx cxVar = (cx) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = cxVar.F1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (cxVar.p2 == null) {
                    return true;
                }
                cxVar.finishFragment();
                return false;
            case 19:
                ((fn0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 12:
                cx cxVar = (cx) this.b;
                kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                return !kVar.y() && cxVar.V3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public Animator e() {
        switch (this.a) {
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    h5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(h5Var.e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void f() {
        switch (this.a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                uc1 uc1Var = wallpapersListActivity.I;
                uc1Var.n = null;
                uc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(gd.M0(2131745621, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void h() {
        ri.q qVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                a2.e1((a2) obj, null);
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = false;
                y1Var.e = null;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    break;
                }
                break;
            case 3:
                vo voVar = (vo) obj;
                voVar.e.F(null);
                voVar.O = false;
                voVar.getClass();
                voVar.b.setAdapter(voVar.a);
                voVar.a.f();
                voVar.b.setFastScrollVisible(true);
                voVar.b.setVerticalScrollBarEnabled(false);
                voVar.d.setShowAtCenter(false);
                voVar.d.b();
                break;
            case 4:
                rq rqVar = (rq) obj;
                rqVar.e.F(null);
                rqVar.o1 = false;
                di.b1 b1Var = rqVar.c;
                b1Var.X1 = false;
                b1Var.Y1 = 0;
                b1Var.setAdapter(rqVar.a);
                rqVar.a.f();
                rqVar.c.setFastScrollVisible(true);
                rqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.n = null;
                d6 d6Var = tqVar.a;
                if (d6Var != null) {
                    d6Var.g3.O(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                if (g8Var.r1) {
                    g8Var.q1 = false;
                    g8Var.r1 = false;
                    g8Var.r0 = true;
                    g8Var.u1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = g8Var.e2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.c0 = false;
                kkVar.H.setVisibility(0);
                yj yjVar = kkVar.r;
                v4.i0 adapter = yjVar.getAdapter();
                ck ckVar = kkVar.w;
                if (adapter != ckVar) {
                    yjVar.setAdapter(ckVar);
                }
                ckVar.f();
                kkVar.E.Y(null, true);
                break;
            case 8:
                kl klVar = (kl) obj;
                klVar.d0 = false;
                klVar.e0 = false;
                klVar.O.G(null);
                klVar.j0();
                klVar.M.setVisibility(0);
                klVar.K.setVisibility(0);
                klVar.N.setVisibility(8);
                klVar.s.setVisibility(8);
                break;
            case 9:
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
            case 10:
                ts tsVar = (ts) obj;
                ck ckVar2 = tsVar.d;
                ckVar2.getClass();
                ckVar2.e = null;
                tsVar.f = false;
                tsVar.e = false;
                tsVar.a.setAdapter(tsVar.c);
                tsVar.a.setFastScrollVisible(true);
                break;
            case 11:
                eu euVar = (eu) obj;
                euVar.a.getActionBar().o(false);
                euVar.b.getActionBar().o(false);
                break;
            case 12:
                cx cxVar = (cx) obj;
                qw qwVar = cxVar.Y;
                if (qwVar != null) {
                    ArrayList arrayList = qwVar.G;
                    if (!arrayList.isEmpty() && qwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((hv) qwVar.I).e((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                cxVar.l2 = false;
                cxVar.m2 = false;
                bx bxVar = cxVar.f0[0];
                if (bxVar != null) {
                    bxVar.a.setEmptyView(cxVar.Y2 == 0 ? bxVar.x : null);
                    cxVar.i5(false, false, true, false);
                }
                cxVar.u5(false, false);
                ks.e().k(ks.t4, Boolean.TRUE);
                cxVar.Y.setCloseButtonVisible(false);
                cxVar.t5(true);
                cxVar.N3();
                qVar = ((org.telegram.ui.ActionBar.h2) cxVar).glassEngine;
                qVar.g();
                break;
            case 13:
                n50 n50Var = (n50) obj;
                if (n50Var.N) {
                    m50.E(n50Var.f, null);
                    n50Var.N = false;
                    n50Var.d.setAdapter(n50Var.e);
                    break;
                }
                break;
            case 14:
                a60.d0((a60) obj);
                break;
            case 15:
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
            case 16:
                pa0 pa0Var = (pa0) obj;
                pa0Var.u0 = false;
                pa0Var.v0 = false;
                pa0Var.T.G(null);
                pa0Var.O0();
                org.telegram.ui.ActionBar.h5 h5Var = pa0Var.W;
                if (h5Var != null) {
                    h5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.N0(false);
                break;
            case 17:
                j90 j90Var = (j90) ((z8) obj).b;
                j90Var.y = false;
                j90Var.j(null);
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(gd.M0(2131748019, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 21:
                sy0 sy0Var = (sy0) obj;
                sy0Var.f = null;
                if (sy0Var.b != null) {
                    sy0Var.d.setVisibility(8);
                    sy0Var.b.setAdapter(sy0Var.a);
                    break;
                }
                break;
            case 22:
                o31 o31Var = (o31) obj;
                o31Var.a.a(false, true);
                o31Var.o0(false, true);
                o31Var.c.g3.O(false);
                break;
            case 23:
                y91.f0((y91) obj, false);
                break;
            case 24:
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
    @Override // org.telegram.ui.ActionBar.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.k kVar;
        ri.q qVar;
        km0 km0Var;
        km0 km0Var2;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                a2 a2Var = (a2) obj;
                ck0 ck0Var = a2Var.o1;
                float i12 = a2Var.i1();
                if (i12 != -3.4028235E38f) {
                    float f10 = org.telegram.messenger.g0.m;
                    if (i12 > f10 && i12 != Float.MAX_VALUE) {
                        a2Var.n2 = true;
                        ck0Var.w0(0, ((int) (i12 - f10)) + 1, lr.h);
                        break;
                    }
                } else {
                    a2Var.n1.h1(1, (org.telegram.messenger.g0.m - 1) - ((int) ck0Var.getY()));
                    break;
                }
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = true;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.J.setVisibility(8);
                lbVar.getClass();
                break;
            case 3:
                vo voVar = (vo) obj;
                voVar.O = true;
                voVar.d.setShowAtCenter(true);
                break;
            case 4:
                ((rq) obj).o1 = true;
                break;
            case 6:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                v4.c0 c0Var = g8Var.t1;
                int N0 = c0Var.N0();
                g8Var.m2 = N0;
                View m10 = c0Var.m(N0);
                g8Var.n2 = m10 == null ? 0 : m10.getTop();
                g8Var.r1 = true;
                g8Var.u0(false);
                g8Var.u1.f();
                org.telegram.ui.ActionBar.r0 r0Var = g8Var.e2;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.c0 = true;
                kkVar.H.setVisibility(8);
                kkVar.b.i1(kkVar.G.getSearchField(), true);
                break;
            case 8:
                kl klVar = (kl) obj;
                klVar.d0 = true;
                klVar.b.i1(klVar.x.getSearchField(), true);
                break;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.E = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 10:
                ((ts) obj).f = true;
                break;
            case 11:
                eu euVar = (eu) obj;
                euVar.a.getActionBar().E();
                euVar.b.getActionBar().E();
                euVar.c.getSearchField().requestFocus();
                break;
            case 12:
                cx cxVar = (cx) obj;
                cxVar.l2 = true;
                org.telegram.ui.ActionBar.r0 r0Var2 = cxVar.F1;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(8);
                }
                cxVar.Y3();
                bx bxVar = cxVar.f0[0];
                if (bxVar != null) {
                    if (cxVar.p2 != null) {
                        bxVar.a.c1();
                        kw kwVar = cxVar.D0;
                        if (kwVar != null) {
                            di.b1 b1Var = kwVar.b0;
                            if (b1Var.h1) {
                                b1Var.h1 = false;
                                b1Var.K0(false);
                            }
                        }
                    }
                    if (!cxVar.n2) {
                        hi.m3 m3Var = cxVar.q0;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        hi.m3 m3Var2 = cxVar.r0;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                    }
                }
                tv tvVar = cxVar.F0;
                if (tvVar != null && tvVar.getPremiumHint() != null) {
                    cxVar.F0.getPremiumHint().f(true);
                }
                if (!cxVar.L) {
                    cxVar.W4(0.0f);
                }
                cxVar.u5(false, false);
                kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                kVar.setBackButtonContentDescription(gd.M0(2131754878, null));
                ks.e().k(ks.t4, new Object[0]);
                qVar = ((org.telegram.ui.ActionBar.h2) cxVar).glassEngine;
                qVar.g();
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null && (km0Var2 = kwVar2.e0) != null) {
                    km0Var2.c = jg.e0.d;
                }
                if (kwVar2 == null || (km0Var = kwVar2.e0) == null || !km0Var.M()) {
                    ArrayList arrayList = (ArrayList) cxVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!cxVar.v3) {
                            break;
                        }
                    }
                }
                cxVar.m2 = true;
                if (!cxVar.s3) {
                    cxVar.i5(true, false, true, false);
                }
                cxVar.Y.setCloseButtonVisible(true);
                cxVar.t5(true);
                cxVar.N3();
                break;
            case 15:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 16:
                ((pa0) obj).u0 = true;
                break;
            case 17:
                ((j90) ((z8) obj).b).y = true;
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 19:
                fn0 fn0Var = (fn0) obj;
                fn0Var.a.getActionBar().E();
                fn0Var.b.getActionBar().E();
                fn0Var.c.getSearchField().requestFocus();
                break;
            case 22:
                o31 o31Var = (o31) obj;
                o31Var.a.a(true, true);
                o31Var.f.I("");
                o31Var.o0(false, true);
                o31Var.c.g3.O(false);
                break;
            case 23:
                y91 y91Var = (y91) obj;
                y91.f0(y91Var, true);
                u91 u91Var = y91Var.s0;
                if (!u91Var.e0.equals("")) {
                    u91Var.I(u91Var.e[0], u91Var.getCurrentPosition(), "", false);
                }
                y91Var.s0.setAlpha(0.0f);
                y91Var.s0.q0.e(true, false);
                break;
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.I);
                wallpapersListActivity.G.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void j(jg.o0 o0Var) {
        switch (this.a) {
            case 7:
                kk kkVar = (kk) this.b;
                jk jkVar = kkVar.E;
                jkVar.S.remove(o0Var);
                jkVar.Y(kkVar.G.getSearchField().getText().toString(), false);
                jkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 2:
                lb lbVar = (lb) this.b;
                lbVar.V = true;
                lbVar.w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                break;
            case 19:
                fn0 fn0Var = (fn0) this.b;
                fn0Var.a.getActionBar().C();
                fn0Var.b.getActionBar().C();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void l(EditText editText) {
        ck0 ck0Var;
        di.b1 b1Var;
        kw kwVar;
        km0 km0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                a2.e1((a2) obj, editText.getText().toString());
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.e = editText.getText().toString();
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 3:
                vo voVar = (vo) obj;
                if (voVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (ck0Var = voVar.b) != null) {
                        v4.i0 adapter = ck0Var.getAdapter();
                        uo uoVar = voVar.e;
                        if (adapter != uoVar) {
                            voVar.b.setAdapter(uoVar);
                            voVar.e.f();
                            voVar.b.setFastScrollVisible(false);
                            voVar.b.setVerticalScrollBarEnabled(true);
                            voVar.d.b();
                        }
                    }
                    voVar.e.F(obj2);
                    break;
                }
                break;
            case 4:
                rq rqVar = (rq) obj;
                if (rqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = rqVar.c.getAdapter() == null ? 0 : rqVar.c.getAdapter().b();
                    rqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = rqVar.c) != null) {
                        v4.i0 adapter2 = b1Var.getAdapter();
                        nq nqVar = rqVar.a;
                        if (adapter2 != nqVar) {
                            di.b1 b1Var2 = rqVar.c;
                            b1Var2.X1 = false;
                            b1Var2.Y1 = 0;
                            b1Var2.setAdapter(nqVar);
                            if (b10 == 0) {
                                rqVar.D0(0);
                            }
                        }
                    }
                    rqVar.D1.setVisibility(8);
                    rqVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.n = editText.getText().toString();
                d6 d6Var = tqVar.a;
                if (d6Var != null) {
                    d6Var.g3.O(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                if (editText.length() > 0) {
                    g8Var.u1.E(editText.getText().toString());
                    break;
                } else {
                    g8Var.q1 = false;
                    g8Var.u1.E(null);
                    break;
                }
            case 7:
                ((kk) obj).E.Y(editText.getText().toString(), false);
                break;
            case 8:
                kl klVar = (kl) obj;
                a3 a3Var = klVar.K;
                di.b1 b1Var3 = klVar.M;
                ck0 ck0Var2 = klVar.N;
                il ilVar = klVar.O;
                if (ilVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        klVar.e0 = true;
                        klVar.x.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        a3Var.setVisibility(8);
                        if (ck0Var2.getAdapter() != ilVar) {
                            ck0Var2.setAdapter(ilVar);
                        }
                        ck0Var2.setVisibility(0);
                        klVar.f0 = ilVar.f.isEmpty();
                        klVar.j0();
                    } else {
                        b1Var3.setVisibility(0);
                        a3Var.setVisibility(0);
                        ck0Var2.setAdapter(null);
                        ck0Var2.setVisibility(8);
                        klVar.s.setVisibility(8);
                    }
                    ilVar.G(obj4);
                    break;
                }
                break;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.c0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        ck0 ck0Var3 = contactsActivity.d;
                        if (ck0Var3 != null) {
                            ck0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        ck0 ck0Var4 = contactsActivity.d;
                        if (ck0Var4 != null) {
                            ck0Var4.setAdapter(contactsActivity.h);
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
            case 10:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    ck ckVar = tsVar.d;
                    ckVar.getClass();
                    ckVar.e = null;
                    tsVar.e = false;
                    tsVar.a.setAdapter(tsVar.c);
                    tsVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    ck ckVar2 = tsVar.d;
                    ckVar2.getClass();
                    if (obj6 == null) {
                        ckVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) ckVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        ckVar2.h = timer2;
                        timer2.schedule(new jg.q1(2, ckVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        tsVar.e = true;
                        break;
                    }
                }
                break;
            case 11:
                eu euVar = (eu) obj;
                euVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                euVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 12:
                cx cxVar = (cx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((kwVar = cxVar.D0) != null && (km0Var = kwVar.e0) != null && km0Var.M()) || cxVar.v3 || cxVar.L)) {
                    cxVar.m2 = true;
                    if (!cxVar.s3) {
                        cxVar.i5(true, false, true, false);
                    }
                }
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null) {
                    View currentView = kwVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(kwVar2.N0) ? true : !kwVar2.h0;
                    kwVar2.N0 = obj7;
                    kwVar2.L(currentView, kwVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 13:
                String obj8 = editText.getText().toString();
                n50 n50Var = (n50) obj;
                m50.E(n50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != n50Var.N) {
                    n50Var.N = z11;
                    ck0 ck0Var5 = n50Var.d;
                    if (ck0Var5 != null) {
                        ck0Var5.setAdapter(!isEmpty ? n50Var.f : n50Var.e);
                        break;
                    }
                }
                break;
            case 14:
                a60 a60Var = (a60) obj;
                if (editText.length() != 0) {
                    a60Var.y = true;
                    x50 x50Var = a60Var.s;
                    if (!x50Var.h) {
                        x50Var.h = true;
                        x50Var.f();
                    }
                    a60Var.s.E(editText.getText().toString());
                    a60Var.h.setFastScrollVisible(false);
                    a60Var.h.setVerticalScrollBarEnabled(true);
                    a60Var.r.e(true, true);
                    a60Var.r.setStickerType(1);
                    a60Var.r.d.setText(gd.M0(2131747975, null));
                    a60Var.r.e.setText(gd.M0(2131745612, null));
                    break;
                } else {
                    a60.d0(a60Var);
                    break;
                }
            case 15:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    ck0 ck0Var6 = languageSelectActivity.b;
                    if (ck0Var6 != null) {
                        ck0Var6.setAdapter(languageSelectActivity.c);
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
            case 16:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.v0 = true;
                        pa0Var.r.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.h5 h5Var = pa0Var.W;
                        if (h5Var != null) {
                            h5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.i0 adapter3 = pa0Var.S.getAdapter();
                        il ilVar2 = pa0Var.T;
                        if (adapter3 != ilVar2) {
                            pa0Var.S.setAdapter(ilVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        pa0Var.w0 = pa0Var.T.b() == 0;
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var2 = pa0Var.W;
                        if (h5Var2 != null) {
                            h5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.O0();
                    pa0Var.P0();
                    pa0Var.T.G(obj10);
                    break;
                }
                break;
            case 17:
                ((j90) ((z8) obj).b).j(editText.getText().toString());
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(gd.M0(2131747975, "NoResult"));
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
            case 19:
                fn0 fn0Var = (fn0) obj;
                fn0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                fn0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 20:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 21:
                String obj12 = editText.getText().toString();
                sy0 sy0Var = (sy0) obj;
                if (obj12 == null) {
                    sy0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = sy0Var.f;
                    if (arrayList == null) {
                        sy0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < sy0Var.h.size(); i10++) {
                        s00 s00Var = (s00) sy0Var.h.get(i10);
                        if (s00Var.d.startsWith(lowerCase)) {
                            sy0Var.f.add(0, s00Var);
                        } else if (s00Var.d.contains(lowerCase)) {
                            sy0Var.f.add(s00Var);
                        }
                    }
                    sy0Var.c.f();
                }
                if (obj12.length() != 0) {
                    ck0 ck0Var7 = sy0Var.b;
                    if (ck0Var7 != null) {
                        ck0Var7.setAdapter(sy0Var.c);
                        break;
                    }
                } else if (sy0Var.b != null) {
                    sy0Var.d.setVisibility(8);
                    sy0Var.b.setAdapter(sy0Var.a);
                    break;
                }
                break;
            case 22:
                ((o31) obj).f.I(editText.getText().toString());
                break;
            case 23:
                String obj13 = editText.getText().toString();
                u91 u91Var = ((y91) obj).s0;
                if (!u91Var.e0.equals(obj13)) {
                    u91Var.I(u91Var.e[0], u91Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 24:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
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
