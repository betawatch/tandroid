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
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.b60;
import org.telegram.ui.cn0;
import org.telegram.ui.cu;
import org.telegram.ui.fv;
import org.telegram.ui.hw;
import org.telegram.ui.mb;
import org.telegram.ui.mq;
import org.telegram.ui.n31;
import org.telegram.ui.n50;
import org.telegram.ui.nw;
import org.telegram.ui.o50;
import org.telegram.ui.qq;
import org.telegram.ui.ra0;
import org.telegram.ui.rv;
import org.telegram.ui.sq;
import org.telegram.ui.ss;
import org.telegram.ui.to;
import org.telegram.ui.ty0;
import org.telegram.ui.u91;
import org.telegram.ui.uo;
import org.telegram.ui.vc1;
import org.telegram.ui.xw;
import org.telegram.ui.y50;
import org.telegram.ui.y91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                yw ywVar = (yw) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = ywVar.E1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (ywVar.o2 == null) {
                    return true;
                }
                ywVar.finishFragment();
                return false;
            case 18:
                ((cn0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 11:
                yw ywVar = (yw) this.b;
                kVar = ((f2) ywVar).actionBar;
                return !kVar.w() && ywVar.R3 == null;
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
                    f5 f5Var = profileActivity.T0;
                    f5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(f5Var.e);
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
                vc1 vc1Var = wallpapersListActivity.H;
                vc1Var.n = null;
                vc1Var.E(null, true);
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
                qq qqVar = (qq) obj;
                qqVar.e.F(null);
                qqVar.n1 = false;
                bi.q1 q1Var = qqVar.c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(qqVar.a);
                qqVar.a.f();
                qqVar.c.setFastScrollVisible(true);
                qqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.n = null;
                w3 w3Var = sqVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            case 5:
                b8 b8Var = (b8) obj;
                if (b8Var.n1) {
                    b8Var.m1 = false;
                    b8Var.n1 = false;
                    b8Var.q0 = true;
                    b8Var.q1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = b8Var.a2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                vj vjVar = (vj) obj;
                vjVar.b0 = false;
                vjVar.G.setVisibility(0);
                kj kjVar = vjVar.r;
                v4.g0 adapter = kjVar.getAdapter();
                oj ojVar = vjVar.w;
                if (adapter != ojVar) {
                    kjVar.setAdapter(ojVar);
                }
                ojVar.f();
                vjVar.D.Y(null, true);
                break;
            case 7:
                wk wkVar = (wk) obj;
                wkVar.c0 = false;
                wkVar.d0 = false;
                wkVar.N.G(null);
                wkVar.j0();
                wkVar.L.setVisibility(0);
                wkVar.J.setVisibility(0);
                wkVar.M.setVisibility(8);
                wkVar.s.setVisibility(8);
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
                ss ssVar = (ss) obj;
                oj ojVar2 = ssVar.d;
                ojVar2.getClass();
                ojVar2.e = null;
                ssVar.f = false;
                ssVar.e = false;
                ssVar.a.setAdapter(ssVar.c);
                ssVar.a.setFastScrollVisible(true);
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().m(false);
                cuVar.b.getActionBar().m(false);
                break;
            case 11:
                yw ywVar = (yw) obj;
                nw nwVar = ywVar.X;
                if (nwVar != null) {
                    ArrayList arrayList = nwVar.F;
                    if (!arrayList.isEmpty() && nwVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((fv) nwVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                ywVar.k2 = false;
                ywVar.l2 = false;
                xw xwVar = ywVar.e0[0];
                if (xwVar != null) {
                    xwVar.a.setEmptyView(ywVar.X2 == 0 ? xwVar.x : null);
                    ywVar.a5(false, false, true, false);
                }
                ywVar.m5(false, false);
                qs.e().k(qs.r4, Boolean.TRUE);
                ywVar.X.setCloseButtonVisible(false);
                ywVar.l5(true);
                ywVar.N3();
                qVar = ((f2) ywVar).glassEngine;
                qVar.g();
                break;
            case 12:
                o50 o50Var = (o50) obj;
                if (o50Var.M) {
                    n50.E(o50Var.f, null);
                    o50Var.M = false;
                    o50Var.d.setAdapter(o50Var.e);
                    break;
                }
                break;
            case 13:
                b60.d0((b60) obj);
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
                ra0 ra0Var = (ra0) obj;
                ra0Var.t0 = false;
                ra0Var.u0 = false;
                ra0Var.S.G(null);
                ra0Var.L0();
                f5 f5Var = ra0Var.V;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                ra0Var.Q.setVisibility(0);
                ra0Var.O.setVisibility(0);
                ra0Var.R.setAdapter(null);
                ra0Var.R.setVisibility(8);
                ra0Var.K0(false);
                break;
            case 16:
                x80 x80Var = (x80) ((w4) obj).b;
                x80Var.y = false;
                x80Var.j(null);
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
                ty0 ty0Var = (ty0) obj;
                ty0Var.f = null;
                if (ty0Var.b != null) {
                    ty0Var.d.setVisibility(8);
                    ty0Var.b.setAdapter(ty0Var.a);
                    break;
                }
                break;
            case 21:
                n31 n31Var = (n31) obj;
                n31Var.a.a(false, true);
                n31Var.o0(false, true);
                n31Var.c.f3.O(false);
                break;
            case 22:
                y91.f0((y91) obj, false);
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
        org.telegram.ui.ActionBar.k kVar;
        oi.q qVar;
        zl0 zl0Var;
        zl0 zl0Var2;
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
                ((qq) obj).n1 = true;
                break;
            case 5:
                b8 b8Var = (b8) obj;
                v4.b0 b0Var = b8Var.p1;
                int N0 = b0Var.N0();
                b8Var.i2 = N0;
                View m10 = b0Var.m(N0);
                b8Var.j2 = m10 == null ? 0 : m10.getTop();
                b8Var.n1 = true;
                b8Var.u0(false);
                b8Var.q1.f();
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.a2;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                vj vjVar = (vj) obj;
                vjVar.b0 = true;
                vjVar.G.setVisibility(8);
                vjVar.b.h1(vjVar.F.getSearchField(), true);
                break;
            case 7:
                wk wkVar = (wk) obj;
                wkVar.c0 = true;
                wkVar.b.h1(wkVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.D = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ((ss) obj).f = true;
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().B();
                cuVar.b.getActionBar().B();
                cuVar.c.getSearchField().requestFocus();
                break;
            case 11:
                yw ywVar = (yw) obj;
                ywVar.k2 = true;
                org.telegram.ui.ActionBar.r0 r0Var2 = ywVar.E1;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(8);
                }
                ywVar.Y3();
                xw xwVar = ywVar.e0[0];
                if (xwVar != null) {
                    if (ywVar.o2 != null) {
                        xwVar.a.c1();
                        hw hwVar = ywVar.C0;
                        if (hwVar != null) {
                            bi.q1 q1Var = hwVar.a0;
                            if (q1Var.g1) {
                                q1Var.g1 = false;
                                q1Var.K0(false);
                            }
                        }
                    }
                    if (!ywVar.m2) {
                        m3 m3Var = ywVar.p0;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = ywVar.q0;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                    }
                }
                rv rvVar = ywVar.E0;
                if (rvVar != null && rvVar.getPremiumHint() != null) {
                    ywVar.E0.getPremiumHint().f(true);
                }
                if (!ywVar.K) {
                    ywVar.O4(0.0f);
                }
                ywVar.m5(false, false);
                kVar = ((f2) ywVar).actionBar;
                kVar.setBackButtonContentDescription(id.M0(2131754878, null));
                qs.e().k(qs.r4, new Object[0]);
                qVar = ((f2) ywVar).glassEngine;
                qVar.g();
                hw hwVar2 = ywVar.C0;
                if (hwVar2 != null && (zl0Var2 = hwVar2.d0) != null) {
                    zl0Var2.c = jg.e0.d;
                }
                if (hwVar2 == null || (zl0Var = hwVar2.d0) == null || !zl0Var.M()) {
                    ArrayList arrayList = (ArrayList) ywVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!ywVar.u3) {
                            break;
                        }
                    }
                }
                ywVar.l2 = true;
                if (!ywVar.r3) {
                    ywVar.a5(true, false, true, false);
                }
                ywVar.X.setCloseButtonVisible(true);
                ywVar.l5(true);
                ywVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((ra0) obj).t0 = true;
                break;
            case 16:
                ((x80) ((w4) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                cn0 cn0Var = (cn0) obj;
                cn0Var.a.getActionBar().B();
                cn0Var.b.getActionBar().B();
                cn0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                n31 n31Var = (n31) obj;
                n31Var.a.a(true, true);
                n31Var.f.I("");
                n31Var.o0(false, true);
                n31Var.c.f3.O(false);
                break;
            case 22:
                y91 y91Var = (y91) obj;
                y91.f0(y91Var, true);
                u91 u91Var = y91Var.r0;
                if (!u91Var.d0.equals("")) {
                    u91Var.M(u91Var.e[0], u91Var.getCurrentPosition(), "", false);
                }
                y91Var.r0.setAlpha(0.0f);
                y91Var.r0.p0.e(true, false);
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
                vj vjVar = (vj) this.b;
                uj ujVar = vjVar.D;
                ujVar.R.remove(o0Var);
                ujVar.Y(vjVar.F.getSearchField().getText().toString(), false);
                ujVar.a0(null, null, true);
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
                cn0 cn0Var = (cn0) this.b;
                cn0Var.a.getActionBar().A();
                cn0Var.b.getActionBar().A();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void l(EditText editText) {
        qj0 qj0Var;
        bi.q1 q1Var;
        hw hwVar;
        zl0 zl0Var;
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
                    if (obj2.length() != 0 && (qj0Var = uoVar.b) != null) {
                        v4.g0 adapter = qj0Var.getAdapter();
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
                qq qqVar = (qq) obj;
                if (qqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = qqVar.c.getAdapter() == null ? 0 : qqVar.c.getAdapter().b();
                    qqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = qqVar.c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        mq mqVar = qqVar.a;
                        if (adapter2 != mqVar) {
                            bi.q1 q1Var2 = qqVar.c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(mqVar);
                            if (b10 == 0) {
                                qqVar.D0(0);
                            }
                        }
                    }
                    qqVar.C1.setVisibility(8);
                    qqVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.n = editText.getText().toString();
                w3 w3Var = sqVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            case 5:
                b8 b8Var = (b8) obj;
                if (editText.length() > 0) {
                    b8Var.q1.E(editText.getText().toString());
                    break;
                } else {
                    b8Var.m1 = false;
                    b8Var.q1.E(null);
                    break;
                }
            case 6:
                ((vj) obj).D.Y(editText.getText().toString(), false);
                break;
            case 7:
                wk wkVar = (wk) obj;
                e5 e5Var = wkVar.J;
                bi.q1 q1Var3 = wkVar.L;
                qj0 qj0Var2 = wkVar.M;
                uk ukVar = wkVar.N;
                if (ukVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        wkVar.d0 = true;
                        wkVar.x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (qj0Var2.getAdapter() != ukVar) {
                            qj0Var2.setAdapter(ukVar);
                        }
                        qj0Var2.setVisibility(0);
                        wkVar.e0 = ukVar.f.isEmpty();
                        wkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        qj0Var2.setAdapter(null);
                        qj0Var2.setVisibility(8);
                        wkVar.s.setVisibility(8);
                    }
                    ukVar.G(obj4);
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
                        qj0 qj0Var3 = contactsActivity.d;
                        if (qj0Var3 != null) {
                            qj0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        qj0 qj0Var4 = contactsActivity.d;
                        if (qj0Var4 != null) {
                            qj0Var4.setAdapter(contactsActivity.h);
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
                ss ssVar = (ss) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    oj ojVar = ssVar.d;
                    ojVar.getClass();
                    ojVar.e = null;
                    ssVar.e = false;
                    ssVar.a.setAdapter(ssVar.c);
                    ssVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    oj ojVar2 = ssVar.d;
                    ojVar2.getClass();
                    if (obj6 == null) {
                        ojVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) ojVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        ojVar2.h = timer2;
                        timer2.schedule(new jg.q1(2, ojVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        ssVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cuVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                yw ywVar = (yw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((hwVar = ywVar.C0) != null && (zl0Var = hwVar.d0) != null && zl0Var.M()) || ywVar.u3 || ywVar.K)) {
                    ywVar.l2 = true;
                    if (!ywVar.r3) {
                        ywVar.a5(true, false, true, false);
                    }
                }
                hw hwVar2 = ywVar.C0;
                if (hwVar2 != null) {
                    View currentView = hwVar2.getCurrentView();
                    boolean z9 = TextUtils.isEmpty(hwVar2.M0) ? true : !hwVar2.g0;
                    hwVar2.M0 = obj7;
                    hwVar2.P(currentView, hwVar2.getCurrentPosition(), obj7, z9);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                o50 o50Var = (o50) obj;
                n50.E(o50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z10 = !isEmpty;
                if (z10 != o50Var.M) {
                    o50Var.M = z10;
                    qj0 qj0Var5 = o50Var.d;
                    if (qj0Var5 != null) {
                        qj0Var5.setAdapter(!isEmpty ? o50Var.f : o50Var.e);
                        break;
                    }
                }
                break;
            case 13:
                b60 b60Var = (b60) obj;
                if (editText.length() != 0) {
                    b60Var.y = true;
                    y50 y50Var = b60Var.s;
                    if (!y50Var.h) {
                        y50Var.h = true;
                        y50Var.f();
                    }
                    b60Var.s.E(editText.getText().toString());
                    b60Var.h.setFastScrollVisible(false);
                    b60Var.h.setVerticalScrollBarEnabled(true);
                    b60Var.r.e(true, true);
                    b60Var.r.setStickerType(1);
                    b60Var.r.d.setText(id.M0(2131748167, null));
                    b60Var.r.e.setText(id.M0(2131745807, null));
                    break;
                } else {
                    b60.d0(b60Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    qj0 qj0Var6 = languageSelectActivity.b;
                    if (qj0Var6 != null) {
                        qj0Var6.setAdapter(languageSelectActivity.c);
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
                ra0 ra0Var = (ra0) obj;
                if (ra0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        ra0Var.u0 = true;
                        ra0Var.r.setShowSearchProgress(true);
                        f5 f5Var = ra0Var.V;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        ra0Var.Q.setVisibility(8);
                        ra0Var.O.setVisibility(8);
                        v4.g0 adapter3 = ra0Var.R.getAdapter();
                        uk ukVar2 = ra0Var.S;
                        if (adapter3 != ukVar2) {
                            ra0Var.R.setAdapter(ukVar2);
                        }
                        ra0Var.R.setVisibility(0);
                        ra0Var.v0 = ra0Var.S.b() == 0;
                    } else {
                        f5 f5Var2 = ra0Var.V;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        ra0Var.Q.setVisibility(0);
                        ra0Var.O.setVisibility(0);
                        ra0Var.R.setAdapter(null);
                        ra0Var.R.setVisibility(8);
                    }
                    ra0Var.L0();
                    ra0Var.M0();
                    ra0Var.S.G(obj10);
                    break;
                }
                break;
            case 16:
                ((x80) ((w4) obj).b).j(editText.getText().toString());
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
                cn0 cn0Var = (cn0) obj;
                cn0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cn0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                ty0 ty0Var = (ty0) obj;
                if (obj12 == null) {
                    ty0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = ty0Var.f;
                    if (arrayList == null) {
                        ty0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < ty0Var.h.size(); i10++) {
                        y00 y00Var = (y00) ty0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            ty0Var.f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            ty0Var.f.add(y00Var);
                        }
                    }
                    ty0Var.c.f();
                }
                if (obj12.length() != 0) {
                    qj0 qj0Var7 = ty0Var.b;
                    if (qj0Var7 != null) {
                        qj0Var7.setAdapter(ty0Var.c);
                        break;
                    }
                } else if (ty0Var.b != null) {
                    ty0Var.d.setVisibility(8);
                    ty0Var.b.setAdapter(ty0Var.a);
                    break;
                }
                break;
            case 21:
                ((n31) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                u91 u91Var = ((y91) obj).r0;
                if (!u91Var.d0.equals(obj13)) {
                    u91Var.M(u91Var.e[0], u91Var.getCurrentPosition(), obj13, false);
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
