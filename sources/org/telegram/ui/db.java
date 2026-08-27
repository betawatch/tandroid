package org.telegram.ui;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class db extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ db(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public boolean b() {
        switch (this.f) {
            case 13:
                ((fq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public Animator h() {
        switch (this.f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.S1;
                profileActivity.S1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                    v0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.e);
                }
                if (profileActivity.S1) {
                    profileActivity.Q0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.S1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void m() {
        switch (this.f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.v0 = "";
                qbVar.I.setVisibility(0);
                if (qbVar.U) {
                    qbVar.U = false;
                    qbVar.V0(true);
                    break;
                }
                break;
            case 1:
                jp jpVar = (jp) this.h;
                jpVar.e.F(null);
                jpVar.J = false;
                jpVar.getClass();
                jpVar.b.setAdapter(jpVar.a);
                jpVar.a.l();
                jpVar.b.setFastScrollVisible(true);
                jpVar.b.setVerticalScrollBarEnabled(false);
                jpVar.d.setShowAtCenter(false);
                View view = jpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.g6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                jpVar.fragmentView.setTag(Integer.valueOf(i10));
                jpVar.d.b();
                break;
            case 2:
                lr lrVar = (lr) this.h;
                lrVar.e.F(null);
                lrVar.k1 = false;
                hh.f1 f1Var = lrVar.c;
                f1Var.U1 = false;
                f1Var.V1 = 0;
                f1Var.setAdapter(lrVar.a);
                lrVar.a.l();
                lrVar.c.setFastScrollVisible(true);
                lrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = lrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                if (b8Var.h) {
                    b8Var.f = false;
                    b8Var.h = false;
                    b8Var.setAllowNestedScroll(true);
                    b8Var.s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.g0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                bkVar.U = false;
                bkVar.C.setVisibility(0);
                org.telegram.ui.Components.qj qjVar = bkVar.r;
                f2.q0 adapter = qjVar.getAdapter();
                org.telegram.ui.Components.uj ujVar = bkVar.v;
                if (adapter != ujVar) {
                    qjVar.setAdapter(ujVar);
                }
                ujVar.l();
                bkVar.y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                tkVar.h0 = false;
                tkVar.i0 = false;
                tkVar.N.G(null, null);
                tkVar.f0();
                tkVar.L.setVisibility(0);
                tkVar.J.setVisibility(0);
                tkVar.M.setVisibility(8);
                tkVar.v.setVisibility(8);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.r.F(null);
                contactsActivity.B = false;
                contactsActivity.A = false;
                contactsActivity.f.setAdapter(contactsActivity.d);
                contactsActivity.f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f.setFastScrollVisible(true);
                contactsActivity.f.setVerticalScrollBarEnabled(false);
                contactsActivity.f.getFastScroll().d0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                tt ttVar = (tt) this.h;
                rt rtVar = ttVar.d;
                rtVar.getClass();
                rtVar.e = null;
                ttVar.f = false;
                ttVar.e = false;
                ttVar.a.setAdapter(ttVar.c);
                ttVar.a.setFastScrollVisible(true);
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.a.getActionBar().h(false);
                evVar.b.getActionBar().h(false);
                break;
            case 9:
                c70 c70Var = (c70) this.h;
                if (c70Var.I) {
                    b70.E(c70Var.f, null);
                    c70Var.I = false;
                    c70Var.d.setAdapter(c70Var.e);
                    break;
                }
                break;
            case 10:
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
            case 11:
                tc0 tc0Var = (tc0) this.h;
                tc0Var.n0 = false;
                tc0Var.o0 = false;
                tc0Var.S.G(null, null);
                tc0Var.B0();
                if (tc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = tc0Var.V;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    tc0Var.Q.setVisibility(0);
                    tc0Var.O.setVisibility(0);
                    tc0Var.R.setAdapter(null);
                    tc0Var.R.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.p90 p90Var = ((lh0) this.h).a;
                p90Var.y = false;
                p90Var.j(null);
                break;
            case 15:
                a31 a31Var = (a31) this.h;
                a31Var.f = null;
                if (a31Var.b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.b.setAdapter(a31Var.a);
                    break;
                }
                break;
            case 16:
                x71 x71Var = (x71) this.h;
                x71Var.a.a(false, true);
                x71Var.o0(false, true);
                x71Var.c.U2.N(false);
                break;
            case 17:
                we1.b0((we1) this.h, false);
                break;
            case 18:
                hg1 hg1Var = (hg1) this.h;
                hg1Var.h = null;
                org.telegram.ui.Components.e51 e51Var = hg1Var.a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.d = false;
                s1Var.e = null;
                s1Var.a.U2.N(true);
                s1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void n() {
        switch (this.f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.I.setVisibility(8);
                qbVar.getClass();
                break;
            case 1:
                jp jpVar = (jp) this.h;
                jpVar.J = true;
                jpVar.d.setShowAtCenter(true);
                break;
            case 2:
                lr lrVar = (lr) this.h;
                lrVar.k1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = lrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                b8Var.o0 = b8Var.r.N0();
                View m10 = b8Var.r.m(b8Var.o0);
                b8Var.p0 = m10 == null ? 0 : m10.getTop();
                b8Var.h = true;
                b8Var.setAllowNestedScroll(false);
                b8Var.s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.g0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                bkVar.U = true;
                bkVar.C.setVisibility(8);
                bkVar.b.t1(bkVar.B.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                tkVar.h0 = true;
                tkVar.b.t1(tkVar.A.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                ((tt) this.h).f = true;
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.a.getActionBar().y("");
                evVar.b.getActionBar().y("");
                evVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((tc0) this.h).n0 = true;
                break;
            case 12:
                ((lh0) this.h).a.y = true;
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.a.getActionBar().y("");
                fq0Var.b.getActionBar().y("");
                fq0Var.c.getSearchField().requestFocus();
                break;
            case 16:
                x71 x71Var = (x71) this.h;
                x71Var.a.a(true, true);
                x71Var.h.I("");
                x71Var.o0(false, true);
                x71Var.c.U2.N(false);
                break;
            case 17:
                we1 we1Var = (we1) this.h;
                we1.b0(we1Var, true);
                se1 se1Var = we1Var.n0;
                if (!se1Var.U.equals("")) {
                    se1Var.K(se1Var.e[0], se1Var.getCurrentPosition(), "", false);
                }
                we1Var.n0.setAlpha(0.0f);
                we1Var.n0.j0.e(true, false);
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.d = true;
                s1Var.a.U2.N(true);
                s1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void o(pf.e0 e0Var) {
        switch (this.f) {
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                org.telegram.ui.Components.ak akVar = bkVar.y;
                akVar.N.remove(e0Var);
                akVar.Y(bkVar.B.getSearchField().getText().toString(), false);
                akVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void p(gg.g gVar) {
        switch (this.f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.U = true;
                qbVar.v0 = gVar.getText().toString();
                qbVar.V0(true);
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.a.getActionBar().x();
                fq0Var.b.getActionBar().x();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void q(EditText editText) {
        org.telegram.ui.Components.zk0 zk0Var;
        hh.f1 f1Var;
        switch (this.f) {
            case 1:
                jp jpVar = (jp) this.h;
                if (jpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (zk0Var = jpVar.b) != null) {
                        f2.q0 adapter = zk0Var.getAdapter();
                        ip ipVar = jpVar.e;
                        if (adapter != ipVar) {
                            jpVar.b.setAdapter(ipVar);
                            View view = jpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.g6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                            jpVar.fragmentView.setTag(Integer.valueOf(i10));
                            jpVar.e.l();
                            jpVar.b.setFastScrollVisible(false);
                            jpVar.b.setVerticalScrollBarEnabled(true);
                            jpVar.d.b();
                        }
                    }
                    jpVar.e.F(obj);
                    break;
                }
                break;
            case 2:
                lr lrVar = (lr) this.h;
                if (lrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = lrVar.c.getAdapter() == null ? 0 : lrVar.c.getAdapter().h();
                    lrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (f1Var = lrVar.c) != null) {
                        f2.q0 adapter2 = f1Var.getAdapter();
                        hr hrVar = lrVar.a;
                        if (adapter2 != hrVar) {
                            hh.f1 f1Var2 = lrVar.c;
                            f1Var2.U1 = false;
                            f1Var2.V1 = 0;
                            f1Var2.setAdapter(hrVar);
                            if (h == 0) {
                                lrVar.y0(0);
                            }
                        }
                    }
                    lrVar.z1.setVisibility(8);
                    lrVar.y1.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                if (editText.length() > 0) {
                    b8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    b8Var.f = false;
                    b8Var.s.E(null);
                    break;
                }
            case 4:
                ((org.telegram.ui.Components.bk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                ag.p1 p1Var = tkVar.J;
                hh.f1 f1Var3 = tkVar.L;
                org.telegram.ui.Components.zk0 zk0Var2 = tkVar.M;
                org.telegram.ui.Components.nk nkVar = tkVar.N;
                if (nkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        tkVar.i0 = true;
                        tkVar.A.setShowSearchProgress(true);
                        f1Var3.setVisibility(8);
                        p1Var.setVisibility(8);
                        if (zk0Var2.getAdapter() != nkVar) {
                            zk0Var2.setAdapter(nkVar);
                        }
                        zk0Var2.setVisibility(0);
                        if (nkVar.s.size() == 0 && nkVar.r.size() == 0) {
                            z10 = true;
                        }
                        tkVar.j0 = z10;
                        tkVar.f0();
                    } else {
                        f1Var3.setVisibility(0);
                        p1Var.setVisibility(0);
                        zk0Var2.setAdapter(null);
                        zk0Var2.setVisibility(8);
                        tkVar.v.setVisibility(8);
                    }
                    nkVar.G(obj3, tkVar.n0);
                    break;
                }
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.e0 = obj4;
                    if (obj4.isEmpty()) {
                        org.telegram.ui.Components.zk0 zk0Var3 = contactsActivity.f;
                        if (zk0Var3 != null) {
                            zk0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.zk0 zk0Var4 = contactsActivity.f;
                        if (zk0Var4 != null) {
                            zk0Var4.setAdapter(contactsActivity.r);
                            contactsActivity.f.setSectionsType(0);
                            contactsActivity.r.l();
                            contactsActivity.f.setFastScrollVisible(false);
                            contactsActivity.f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.r.F(obj4);
                        break;
                    }
                }
                break;
            case 7:
                tt ttVar = (tt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    rt rtVar = ttVar.d;
                    rtVar.getClass();
                    rtVar.e = null;
                    ttVar.e = false;
                    ttVar.a.setAdapter(ttVar.c);
                    ttVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    rt rtVar2 = ttVar.d;
                    rtVar2.getClass();
                    if (obj5 == null) {
                        rtVar2.e = null;
                    } else {
                        try {
                            Timer timer = rtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Timer timer2 = new Timer();
                        rtVar2.d = timer2;
                        timer2.schedule(new qt(rtVar2, obj5, 0), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        ttVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                evVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                c70 c70Var = (c70) this.h;
                b70.E(c70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.I) {
                    c70Var.I = z11;
                    org.telegram.ui.Components.zk0 zk0Var5 = c70Var.d;
                    if (zk0Var5 != null) {
                        zk0Var5.setAdapter(!isEmpty ? c70Var.f : c70Var.e);
                        break;
                    }
                }
                break;
            case 10:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    org.telegram.ui.Components.zk0 zk0Var6 = languageSelectActivity.b;
                    if (zk0Var6 != null) {
                        zk0Var6.setAdapter(languageSelectActivity.c);
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
            case 11:
                tc0 tc0Var = (tc0) this.h;
                if (tc0Var.S != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        tc0Var.o0 = true;
                        tc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = tc0Var.V;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        tc0Var.Q.setVisibility(8);
                        tc0Var.O.setVisibility(8);
                        f2.q0 adapter3 = tc0Var.R.getAdapter();
                        mc0 mc0Var = tc0Var.S;
                        if (adapter3 != mc0Var) {
                            tc0Var.R.setAdapter(mc0Var);
                        }
                        tc0Var.R.setVisibility(0);
                        tc0Var.p0 = tc0Var.S.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = tc0Var.V;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        tc0Var.Q.setVisibility(0);
                        tc0Var.O.setVisibility(0);
                        tc0Var.R.setAdapter(null);
                        tc0Var.R.setVisibility(8);
                    }
                    tc0Var.B0();
                    tc0Var.S.G(obj8, tc0Var.t0);
                    break;
                }
                break;
            case 12:
                ((lh0) this.h).a.j(editText.getText().toString());
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                fq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String obj9 = editText.getText().toString();
                a31 a31Var = (a31) this.h;
                if (obj9 == null) {
                    a31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = a31Var.f;
                    if (arrayList == null) {
                        a31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < a31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) a31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            a31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            a31Var.f.add(language);
                        }
                    }
                    a31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.zk0 zk0Var7 = a31Var.b;
                    if (zk0Var7 != null) {
                        zk0Var7.setAdapter(a31Var.c);
                        break;
                    }
                } else if (a31Var.b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.b.setAdapter(a31Var.a);
                    break;
                }
                break;
            case 16:
                ((x71) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                se1 se1Var = ((we1) this.h).n0;
                if (!se1Var.U.equals(obj10)) {
                    se1Var.K(se1Var.e[0], se1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                hg1 hg1Var = (hg1) this.h;
                hg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.e51 e51Var = hg1Var.a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.e = editText.getText().toString();
                s1Var.a.U2.N(true);
                s1Var.a.u0(0);
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(pf.e0 e0Var) {
    }
}
