package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import di.h2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.bd0;
import org.telegram.ui.bu;
import org.telegram.ui.eg1;
import org.telegram.ui.gr0;
import org.telegram.ui.h41;
import org.telegram.ui.i91;
import org.telegram.ui.id0;
import org.telegram.ui.ov;
import org.telegram.ui.qh1;
import org.telegram.ui.rr;
import org.telegram.ui.t70;
import org.telegram.ui.u70;
import org.telegram.ui.ub;
import org.telegram.ui.vr;
import org.telegram.ui.wp;
import org.telegram.ui.xp;
import org.telegram.ui.zh0;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d2 extends g5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public boolean b() {
        switch (this.f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public Animator h() {
        switch (this.f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    v0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.W1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void m() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.a.Y2.N(true);
                e2Var.a.u0(0);
                break;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.z0 = "";
                ubVar.M.setVisibility(0);
                if (ubVar.Y) {
                    ubVar.Y = false;
                    ubVar.V0(true);
                    break;
                }
                break;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.e.F(null);
                xpVar.N = false;
                xpVar.getClass();
                xpVar.b.setAdapter(xpVar.a);
                xpVar.a.l();
                xpVar.b.setFastScrollVisible(true);
                xpVar.b.setVerticalScrollBarEnabled(false);
                xpVar.d.setShowAtCenter(false);
                View view = xpVar.fragmentView;
                int i10 = j6.a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                xpVar.fragmentView.setTag(Integer.valueOf(i10));
                xpVar.d.b();
                break;
            case 3:
                vr vrVar = (vr) this.h;
                vrVar.e.F(null);
                vrVar.o1 = false;
                bi.o0 o0Var = vrVar.c;
                o0Var.Y1 = false;
                o0Var.Z1 = 0;
                o0Var.setAdapter(vrVar.a);
                vrVar.a.l();
                vrVar.c.setFastScrollVisible(true);
                vrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = vrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.h;
                if (k8Var.h) {
                    k8Var.f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = k8Var.k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                ok okVar = (ok) this.h;
                okVar.b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.y.Y(null, true);
                break;
            case 6:
                gl glVar = (gl) this.h;
                glVar.l0 = false;
                glVar.m0 = false;
                glVar.R.G(null, null);
                glVar.f0();
                glVar.P.setVisibility(0);
                glVar.N.setVisibility(0);
                glVar.Q.setVisibility(8);
                glVar.v.setVisibility(8);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f.setAdapter(contactsActivity.d);
                contactsActivity.f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f.setFastScrollVisible(true);
                contactsActivity.f.setVerticalScrollBarEnabled(false);
                contactsActivity.f.getFastScroll().h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                bu buVar = (bu) this.h;
                zt ztVar = buVar.d;
                ztVar.getClass();
                ztVar.e = null;
                buVar.f = false;
                buVar.e = false;
                buVar.a.setAdapter(buVar.c);
                buVar.a.setFastScrollVisible(true);
                break;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().h(false);
                ovVar.b.getActionBar().h(false);
                break;
            case 10:
                u70 u70Var = (u70) this.h;
                if (u70Var.M) {
                    t70.E(u70Var.f, null);
                    u70Var.M = false;
                    u70Var.d.setAdapter(u70Var.e);
                    break;
                }
                break;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 12:
                id0 id0Var = (id0) this.h;
                id0Var.r0 = false;
                id0Var.s0 = false;
                id0Var.W.G(null, null);
                id0Var.B0();
                if (id0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = id0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    id0Var.U.setVisibility(0);
                    id0Var.S.setVisibility(0);
                    id0Var.V.setAdapter(null);
                    id0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                da0 da0Var = ((zh0) this.h).a;
                da0Var.y = false;
                da0Var.j(null);
                break;
            case 16:
                h41 h41Var = (h41) this.h;
                h41Var.f = null;
                if (h41Var.b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.b.setAdapter(h41Var.a);
                    break;
                }
                break;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(false, true);
                i91Var.o0(false, true);
                i91Var.c.Y2.N(false);
                break;
            case 18:
                eg1.b0((eg1) this.h, false);
                break;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = null;
                x51 x51Var = qh1Var.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void n() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.a.Y2.N(true);
                e2Var.a.u0(0);
                break;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.M.setVisibility(8);
                ubVar.getClass();
                break;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.N = true;
                xpVar.d.setShowAtCenter(true);
                break;
            case 3:
                vr vrVar = (vr) this.h;
                vrVar.o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = vrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.h;
                k8Var.s0 = k8Var.r.N0();
                View m10 = k8Var.r.m(k8Var.s0);
                k8Var.t0 = m10 == null ? 0 : m10.getTop();
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = k8Var.k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                ok okVar = (ok) this.h;
                okVar.b0 = true;
                okVar.G.setVisibility(8);
                okVar.b.t1(okVar.F.getSearchField(), true);
                break;
            case 6:
                gl glVar = (gl) this.h;
                glVar.l0 = true;
                glVar.b.t1(glVar.E.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                ((bu) this.h).f = true;
                break;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().x("");
                ovVar.b.getActionBar().x("");
                ovVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 12:
                ((id0) this.h).r0 = true;
                break;
            case 13:
                ((zh0) this.h).a.y = true;
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().x("");
                gr0Var.b.getActionBar().x("");
                gr0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.c.Y2.N(false);
                break;
            case 18:
                eg1 eg1Var = (eg1) this.h;
                eg1.b0(eg1Var, true);
                ag1 ag1Var = eg1Var.r0;
                if (!ag1Var.b0.equals("")) {
                    ag1Var.K(ag1Var.e[0], ag1Var.getCurrentPosition(), "", false);
                }
                eg1Var.r0.setAlpha(0.0f);
                eg1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void o(hg.q0 q0Var) {
        switch (this.f) {
            case 5:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.y;
                nkVar.R.remove(q0Var);
                nkVar.Y(okVar.F.getSearchField().getText().toString(), false);
                nkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void p(h2 h2Var) {
        switch (this.f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.Y = true;
                ubVar.z0 = h2Var.getText().toString();
                ubVar.V0(true);
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().w();
                gr0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void q(EditText editText) {
        ll0 ll0Var;
        bi.o0 o0Var;
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.a.Y2.N(true);
                e2Var.a.u0(0);
                break;
            case 2:
                xp xpVar = (xp) this.h;
                if (xpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ll0Var = xpVar.b) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        wp wpVar = xpVar.e;
                        if (adapter != wpVar) {
                            xpVar.b.setAdapter(wpVar);
                            View view = xpVar.fragmentView;
                            int i10 = j6.d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            xpVar.fragmentView.setTag(Integer.valueOf(i10));
                            xpVar.e.l();
                            xpVar.b.setFastScrollVisible(false);
                            xpVar.b.setVerticalScrollBarEnabled(true);
                            xpVar.d.b();
                        }
                    }
                    xpVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                vr vrVar = (vr) this.h;
                if (vrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = vrVar.c.getAdapter() == null ? 0 : vrVar.c.getAdapter().h();
                    vrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (o0Var = vrVar.c) != null) {
                        s4.h0 adapter2 = o0Var.getAdapter();
                        rr rrVar = vrVar.a;
                        if (adapter2 != rrVar) {
                            bi.o0 o0Var2 = vrVar.c;
                            o0Var2.Y1 = false;
                            o0Var2.Z1 = 0;
                            o0Var2.setAdapter(rrVar);
                            if (h == 0) {
                                vrVar.y0(0);
                            }
                        }
                    }
                    vrVar.D1.setVisibility(8);
                    vrVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.h;
                if (editText.length() > 0) {
                    k8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    k8Var.f = false;
                    k8Var.s.E(null);
                    break;
                }
            case 5:
                ((ok) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                gl glVar = (gl) this.h;
                ah.y yVar = glVar.N;
                bi.o0 o0Var3 = glVar.P;
                ll0 ll0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        o0Var3.setVisibility(8);
                        yVar.setVisibility(8);
                        if (ll0Var2.getAdapter() != alVar) {
                            ll0Var2.setAdapter(alVar);
                        }
                        ll0Var2.setVisibility(0);
                        if (alVar.s.size() == 0 && alVar.r.size() == 0) {
                            z10 = true;
                        }
                        glVar.n0 = z10;
                        glVar.f0();
                    } else {
                        o0Var3.setVisibility(0);
                        yVar.setVisibility(0);
                        ll0Var2.setAdapter(null);
                        ll0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.r0);
                    break;
                }
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.i0 = obj4;
                    if (obj4.isEmpty()) {
                        ll0 ll0Var3 = contactsActivity.f;
                        if (ll0Var3 != null) {
                            ll0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        ll0 ll0Var4 = contactsActivity.f;
                        if (ll0Var4 != null) {
                            ll0Var4.setAdapter(contactsActivity.r);
                            contactsActivity.f.setSectionsType(0);
                            contactsActivity.r.l();
                            contactsActivity.f.setFastScrollVisible(false);
                            contactsActivity.f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.r.G(obj4);
                        break;
                    }
                }
                break;
            case 8:
                bu buVar = (bu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    zt ztVar = buVar.d;
                    ztVar.getClass();
                    ztVar.e = null;
                    buVar.e = false;
                    buVar.a.setAdapter(buVar.c);
                    buVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    zt ztVar2 = buVar.d;
                    ztVar2.getClass();
                    if (obj5 == null) {
                        ztVar2.e = null;
                    } else {
                        try {
                            Timer timer = ztVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Timer timer2 = new Timer();
                        ztVar2.d = timer2;
                        timer2.schedule(new hg.s1(ztVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        buVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                ovVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                u70 u70Var = (u70) this.h;
                t70.E(u70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != u70Var.M) {
                    u70Var.M = z11;
                    ll0 ll0Var5 = u70Var.d;
                    if (ll0Var5 != null) {
                        ll0Var5.setAdapter(!isEmpty ? u70Var.f : u70Var.e);
                        break;
                    }
                }
                break;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    ll0 ll0Var6 = languageSelectActivity.b;
                    if (ll0Var6 != null) {
                        ll0Var6.setAdapter(languageSelectActivity.c);
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
            case 12:
                id0 id0Var = (id0) this.h;
                if (id0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        id0Var.s0 = true;
                        id0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = id0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        id0Var.U.setVisibility(8);
                        id0Var.S.setVisibility(8);
                        s4.h0 adapter3 = id0Var.V.getAdapter();
                        bd0 bd0Var = id0Var.W;
                        if (adapter3 != bd0Var) {
                            id0Var.V.setAdapter(bd0Var);
                        }
                        id0Var.V.setVisibility(0);
                        id0Var.t0 = id0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = id0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        id0Var.U.setVisibility(0);
                        id0Var.S.setVisibility(0);
                        id0Var.V.setAdapter(null);
                        id0Var.V.setVisibility(8);
                    }
                    id0Var.B0();
                    id0Var.W.G(obj8, id0Var.x0);
                    break;
                }
                break;
            case 13:
                ((zh0) this.h).a.j(editText.getText().toString());
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                gr0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                h41 h41Var = (h41) this.h;
                if (obj9 == null) {
                    h41Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = h41Var.f;
                    if (arrayList == null) {
                        h41Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < h41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) h41Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            h41Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            h41Var.f.add(language);
                        }
                    }
                    h41Var.c.l();
                }
                if (obj9.length() != 0) {
                    ll0 ll0Var7 = h41Var.b;
                    if (ll0Var7 != null) {
                        ll0Var7.setAdapter(h41Var.c);
                        break;
                    }
                } else if (h41Var.b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.b.setAdapter(h41Var.a);
                    break;
                }
                break;
            case 17:
                ((i91) this.h).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                ag1 ag1Var = ((eg1) this.h).r0;
                if (!ag1Var.b0.equals(obj10)) {
                    ag1Var.K(ag1Var.e[0], ag1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = editText.getText().toString();
                x51 x51Var = qh1Var.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    break;
                }
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(hg.q0 q0Var) {
    }
}
