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
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.an0;
import org.telegram.ui.au;
import org.telegram.ui.dv;
import org.telegram.ui.fw;
import org.telegram.ui.kq;
import org.telegram.ui.l50;
import org.telegram.ui.lw;
import org.telegram.ui.m31;
import org.telegram.ui.m50;
import org.telegram.ui.mb;
import org.telegram.ui.oq;
import org.telegram.ui.pa0;
import org.telegram.ui.pv;
import org.telegram.ui.qq;
import org.telegram.ui.qs;
import org.telegram.ui.qy0;
import org.telegram.ui.ro;
import org.telegram.ui.s91;
import org.telegram.ui.sc1;
import org.telegram.ui.so;
import org.telegram.ui.vw;
import org.telegram.ui.w50;
import org.telegram.ui.w91;
import org.telegram.ui.ww;
import org.telegram.ui.z50;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                ww wwVar = (ww) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = wwVar.D1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (wwVar.n2 == null) {
                    return true;
                }
                wwVar.finishFragment();
                return false;
            case 18:
                ((an0) this.b).finishFragment();
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
                ww wwVar = (ww) this.b;
                kVar = ((f2) wwVar).actionBar;
                return !kVar.v() && wwVar.Q3 == null;
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
                sc1 sc1Var = wallpapersListActivity.H;
                sc1Var.n = null;
                sc1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(id.M0(2131745819, null));
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
                so soVar = (so) obj;
                soVar.e.F(null);
                soVar.N = false;
                soVar.getClass();
                soVar.b.setAdapter(soVar.a);
                soVar.a.f();
                soVar.b.setFastScrollVisible(true);
                soVar.b.setVerticalScrollBarEnabled(false);
                soVar.d.setShowAtCenter(false);
                soVar.d.b();
                break;
            case 3:
                oq oqVar = (oq) obj;
                oqVar.e.F(null);
                oqVar.n1 = false;
                bi.q1 q1Var = oqVar.c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(oqVar.a);
                oqVar.a.f();
                oqVar.c.setFastScrollVisible(true);
                oqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                qq qqVar = (qq) obj;
                qqVar.n = null;
                w3 w3Var = qqVar.a;
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
                qs qsVar = (qs) obj;
                oj ojVar2 = qsVar.d;
                ojVar2.getClass();
                ojVar2.e = null;
                qsVar.f = false;
                qsVar.e = false;
                qsVar.a.setAdapter(qsVar.c);
                qsVar.a.setFastScrollVisible(true);
                break;
            case 10:
                au auVar = (au) obj;
                auVar.a.getActionBar().l(false);
                auVar.b.getActionBar().l(false);
                break;
            case 11:
                ww wwVar = (ww) obj;
                lw lwVar = wwVar.X;
                if (lwVar != null) {
                    ArrayList arrayList = lwVar.F;
                    if (!arrayList.isEmpty() && lwVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((dv) lwVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                wwVar.j2 = false;
                wwVar.k2 = false;
                vw vwVar = wwVar.e0[0];
                if (vwVar != null) {
                    vwVar.a.setEmptyView(wwVar.W2 == 0 ? vwVar.x : null);
                    wwVar.a5(false, false, true, false);
                }
                wwVar.m5(false, false);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, Boolean.TRUE);
                wwVar.X.setCloseButtonVisible(false);
                wwVar.l5(true);
                wwVar.N3();
                qVar = ((f2) wwVar).glassEngine;
                qVar.g();
                break;
            case 12:
                m50 m50Var = (m50) obj;
                if (m50Var.M) {
                    l50.E(m50Var.f, null);
                    m50Var.M = false;
                    m50Var.d.setAdapter(m50Var.e);
                    break;
                }
                break;
            case 13:
                z50.d0((z50) obj);
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
                pa0 pa0Var = (pa0) obj;
                pa0Var.t0 = false;
                pa0Var.u0 = false;
                pa0Var.S.G(null);
                pa0Var.L0();
                f5 f5Var = pa0Var.V;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                pa0Var.Q.setVisibility(0);
                pa0Var.O.setVisibility(0);
                pa0Var.R.setAdapter(null);
                pa0Var.R.setVisibility(8);
                pa0Var.K0(false);
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
                notificationsCustomSettingsActivity.c.setText(id.M0(2131748212, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                qy0 qy0Var = (qy0) obj;
                qy0Var.f = null;
                if (qy0Var.b != null) {
                    qy0Var.d.setVisibility(8);
                    qy0Var.b.setAdapter(qy0Var.a);
                    break;
                }
                break;
            case 21:
                m31 m31Var = (m31) obj;
                m31Var.a.a(false, true);
                m31Var.o0(false, true);
                m31Var.c.f3.O(false);
                break;
            case 22:
                w91.f0((w91) obj, false);
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
                so soVar = (so) obj;
                soVar.N = true;
                soVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((oq) obj).n1 = true;
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
                ((qs) obj).f = true;
                break;
            case 10:
                au auVar = (au) obj;
                auVar.a.getActionBar().A();
                auVar.b.getActionBar().A();
                auVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ww wwVar = (ww) obj;
                wwVar.j2 = true;
                org.telegram.ui.ActionBar.r0 r0Var2 = wwVar.D1;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(8);
                }
                wwVar.Y3();
                vw vwVar = wwVar.e0[0];
                if (vwVar != null) {
                    if (wwVar.n2 != null) {
                        vwVar.a.c1();
                        fw fwVar = wwVar.C0;
                        if (fwVar != null) {
                            bi.q1 q1Var = fwVar.a0;
                            if (q1Var.g1) {
                                q1Var.g1 = false;
                                q1Var.K0(false);
                            }
                        }
                    }
                    if (!wwVar.l2) {
                        m3 m3Var = wwVar.p0;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = wwVar.q0;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                    }
                }
                pv pvVar = wwVar.E0;
                if (pvVar != null && pvVar.getPremiumHint() != null) {
                    wwVar.E0.getPremiumHint().f(true);
                }
                if (!wwVar.K) {
                    wwVar.O4(0.0f);
                }
                wwVar.m5(false, false);
                kVar = ((f2) wwVar).actionBar;
                kVar.setBackButtonContentDescription(id.M0(2131754878, null));
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
                qVar = ((f2) wwVar).glassEngine;
                qVar.g();
                fw fwVar2 = wwVar.C0;
                if (fwVar2 != null && (yl0Var2 = fwVar2.d0) != null) {
                    yl0Var2.c = jg.e0.d;
                }
                if (fwVar2 == null || (yl0Var = fwVar2.d0) == null || !yl0Var.M()) {
                    ArrayList arrayList = (ArrayList) wwVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!wwVar.t3) {
                            break;
                        }
                    }
                }
                wwVar.k2 = true;
                if (!wwVar.q3) {
                    wwVar.a5(true, false, true, false);
                }
                wwVar.X.setCloseButtonVisible(true);
                wwVar.l5(true);
                wwVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((pa0) obj).t0 = true;
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
                an0 an0Var = (an0) obj;
                an0Var.a.getActionBar().A();
                an0Var.b.getActionBar().A();
                an0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                m31 m31Var = (m31) obj;
                m31Var.a.a(true, true);
                m31Var.f.I("");
                m31Var.o0(false, true);
                m31Var.c.f3.O(false);
                break;
            case 22:
                w91 w91Var = (w91) obj;
                w91.f0(w91Var, true);
                s91 s91Var = w91Var.r0;
                if (!s91Var.d0.equals("")) {
                    s91Var.M(s91Var.e[0], s91Var.getCurrentPosition(), "", false);
                }
                w91Var.r0.setAlpha(0.0f);
                w91Var.r0.p0.e(true, false);
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
                an0 an0Var = (an0) this.b;
                an0Var.a.getActionBar().z();
                an0Var.b.getActionBar().z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void l(EditText editText) {
        pj0 pj0Var;
        bi.q1 q1Var;
        fw fwVar;
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
                so soVar = (so) obj;
                if (soVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (pj0Var = soVar.b) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        ro roVar = soVar.e;
                        if (adapter != roVar) {
                            soVar.b.setAdapter(roVar);
                            soVar.e.f();
                            soVar.b.setFastScrollVisible(false);
                            soVar.b.setVerticalScrollBarEnabled(true);
                            soVar.d.b();
                        }
                    }
                    soVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                oq oqVar = (oq) obj;
                if (oqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = oqVar.c.getAdapter() == null ? 0 : oqVar.c.getAdapter().b();
                    oqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = oqVar.c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        kq kqVar = oqVar.a;
                        if (adapter2 != kqVar) {
                            bi.q1 q1Var2 = oqVar.c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(kqVar);
                            if (b10 == 0) {
                                oqVar.D0(0);
                            }
                        }
                    }
                    oqVar.C1.setVisibility(8);
                    oqVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                qq qqVar = (qq) obj;
                qqVar.n = editText.getText().toString();
                w3 w3Var = qqVar.a;
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
                pj0 pj0Var2 = wkVar.M;
                uk ukVar = wkVar.N;
                if (ukVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        wkVar.d0 = true;
                        wkVar.x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (pj0Var2.getAdapter() != ukVar) {
                            pj0Var2.setAdapter(ukVar);
                        }
                        pj0Var2.setVisibility(0);
                        wkVar.e0 = ukVar.f.isEmpty();
                        wkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        pj0Var2.setAdapter(null);
                        pj0Var2.setVisibility(8);
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
                qs qsVar = (qs) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    oj ojVar = qsVar.d;
                    ojVar.getClass();
                    ojVar.e = null;
                    qsVar.e = false;
                    qsVar.a.setAdapter(qsVar.c);
                    qsVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    oj ojVar2 = qsVar.d;
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
                        qsVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                au auVar = (au) obj;
                auVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                auVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                ww wwVar = (ww) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((fwVar = wwVar.C0) != null && (yl0Var = fwVar.d0) != null && yl0Var.M()) || wwVar.t3 || wwVar.K)) {
                    wwVar.k2 = true;
                    if (!wwVar.q3) {
                        wwVar.a5(true, false, true, false);
                    }
                }
                fw fwVar2 = wwVar.C0;
                if (fwVar2 != null) {
                    View currentView = fwVar2.getCurrentView();
                    boolean z9 = TextUtils.isEmpty(fwVar2.M0) ? true : !fwVar2.g0;
                    fwVar2.M0 = obj7;
                    fwVar2.P(currentView, fwVar2.getCurrentPosition(), obj7, z9);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                m50 m50Var = (m50) obj;
                l50.E(m50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z10 = !isEmpty;
                if (z10 != m50Var.M) {
                    m50Var.M = z10;
                    pj0 pj0Var5 = m50Var.d;
                    if (pj0Var5 != null) {
                        pj0Var5.setAdapter(!isEmpty ? m50Var.f : m50Var.e);
                        break;
                    }
                }
                break;
            case 13:
                z50 z50Var = (z50) obj;
                if (editText.length() != 0) {
                    z50Var.y = true;
                    w50 w50Var = z50Var.s;
                    if (!w50Var.h) {
                        w50Var.h = true;
                        w50Var.f();
                    }
                    z50Var.s.E(editText.getText().toString());
                    z50Var.h.setFastScrollVisible(false);
                    z50Var.h.setVerticalScrollBarEnabled(true);
                    z50Var.r.e(true, true);
                    z50Var.r.setStickerType(1);
                    z50Var.r.d.setText(id.M0(2131748168, null));
                    z50Var.r.e.setText(id.M0(2131745810, null));
                    break;
                } else {
                    z50.d0(z50Var);
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
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.u0 = true;
                        pa0Var.r.setShowSearchProgress(true);
                        f5 f5Var = pa0Var.V;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        pa0Var.Q.setVisibility(8);
                        pa0Var.O.setVisibility(8);
                        v4.g0 adapter3 = pa0Var.R.getAdapter();
                        uk ukVar2 = pa0Var.S;
                        if (adapter3 != ukVar2) {
                            pa0Var.R.setAdapter(ukVar2);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.v0 = pa0Var.S.b() == 0;
                    } else {
                        f5 f5Var2 = pa0Var.V;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        pa0Var.Q.setVisibility(0);
                        pa0Var.O.setVisibility(0);
                        pa0Var.R.setAdapter(null);
                        pa0Var.R.setVisibility(8);
                    }
                    pa0Var.L0();
                    pa0Var.M0();
                    pa0Var.S.G(obj10);
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
                            notificationsCustomSettingsActivity.c.setText(id.M0(2131748168, "NoResult"));
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
                an0 an0Var = (an0) obj;
                an0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                an0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                qy0 qy0Var = (qy0) obj;
                if (obj12 == null) {
                    qy0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = qy0Var.f;
                    if (arrayList == null) {
                        qy0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < qy0Var.h.size(); i10++) {
                        y00 y00Var = (y00) qy0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            qy0Var.f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            qy0Var.f.add(y00Var);
                        }
                    }
                    qy0Var.c.f();
                }
                if (obj12.length() != 0) {
                    pj0 pj0Var7 = qy0Var.b;
                    if (pj0Var7 != null) {
                        pj0Var7.setAdapter(qy0Var.c);
                        break;
                    }
                } else if (qy0Var.b != null) {
                    qy0Var.d.setVisibility(8);
                    qy0Var.b.setAdapter(qy0Var.a);
                    break;
                }
                break;
            case 21:
                ((m31) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                s91 s91Var = ((w91) obj).r0;
                if (!s91Var.d0.equals(obj13)) {
                    s91Var.M(s91Var.e[0], s91Var.getCurrentPosition(), obj13, false);
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
