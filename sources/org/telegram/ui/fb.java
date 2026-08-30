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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ fb(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public boolean b() {
        switch (this.f) {
            case 13:
                ((kq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public Animator h() {
        switch (this.f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z4 = profileActivity.T1;
                profileActivity.T1 = !z4;
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    w0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.e);
                }
                if (profileActivity.T1) {
                    profileActivity.R0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.T1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void m() {
        switch (this.f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.w0 = "";
                sbVar.J.setVisibility(0);
                if (sbVar.V) {
                    sbVar.V = false;
                    sbVar.V0(true);
                    break;
                }
                break;
            case 1:
                qp qpVar = (qp) this.h;
                qpVar.e.F(null);
                qpVar.K = false;
                qpVar.getClass();
                qpVar.b.setAdapter(qpVar.a);
                qpVar.a.l();
                qpVar.b.setFastScrollVisible(true);
                qpVar.b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                View view = qpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                qpVar.fragmentView.setTag(Integer.valueOf(i10));
                qpVar.d.b();
                break;
            case 2:
                pr prVar = (pr) this.h;
                prVar.e.F(null);
                prVar.l1 = false;
                lh.e1 e1Var = prVar.c;
                e1Var.V1 = false;
                e1Var.W1 = 0;
                e1Var.setAdapter(prVar.a);
                prVar.a.l();
                prVar.c.setFastScrollVisible(true);
                prVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = prVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (c8Var.h) {
                    c8Var.f = false;
                    c8Var.h = false;
                    c8Var.setAllowNestedScroll(true);
                    c8Var.s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                hkVar.V = false;
                hkVar.D.setVisibility(0);
                org.telegram.ui.Components.vj vjVar = hkVar.r;
                f2.o0 adapter = vjVar.getAdapter();
                org.telegram.ui.Components.zj zjVar = hkVar.v;
                if (adapter != zjVar) {
                    vjVar.setAdapter(zjVar);
                }
                zjVar.l();
                hkVar.y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.i0 = false;
                alVar.j0 = false;
                alVar.O.G(null, null);
                alVar.f0();
                alVar.M.setVisibility(0);
                alVar.K.setVisibility(0);
                alVar.N.setVisibility(8);
                alVar.v.setVisibility(8);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.r.G(null);
                contactsActivity.C = false;
                contactsActivity.B = false;
                contactsActivity.f.setAdapter(contactsActivity.d);
                contactsActivity.f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f.setFastScrollVisible(true);
                contactsActivity.f.setVerticalScrollBarEnabled(false);
                contactsActivity.f.getFastScroll().e0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                yt ytVar = (yt) this.h;
                wt wtVar = ytVar.d;
                wtVar.getClass();
                wtVar.e = null;
                ytVar.f = false;
                ytVar.e = false;
                ytVar.a.setAdapter(ytVar.c);
                ytVar.a.setFastScrollVisible(true);
                break;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().h(false);
                kvVar.b.getActionBar().h(false);
                break;
            case 9:
                m70 m70Var = (m70) this.h;
                if (m70Var.J) {
                    l70.E(m70Var.f, null);
                    m70Var.J = false;
                    m70Var.d.setAdapter(m70Var.e);
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
                ad0 ad0Var = (ad0) this.h;
                ad0Var.o0 = false;
                ad0Var.p0 = false;
                ad0Var.T.G(null, null);
                ad0Var.B0();
                if (ad0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = ad0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    ad0Var.R.setVisibility(0);
                    ad0Var.P.setVisibility(0);
                    ad0Var.S.setAdapter(null);
                    ad0Var.S.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.ea0 ea0Var = ((qh0) this.h).a;
                ea0Var.y = false;
                ea0Var.j(null);
                break;
            case 15:
                n31 n31Var = (n31) this.h;
                n31Var.f = null;
                if (n31Var.b != null) {
                    n31Var.d.setVisibility(8);
                    n31Var.b.setAdapter(n31Var.a);
                    break;
                }
                break;
            case 16:
                o81 o81Var = (o81) this.h;
                o81Var.a.a(false, true);
                o81Var.o0(false, true);
                o81Var.c.V2.N(false);
                break;
            case 17:
                kf1.b0((kf1) this.h, false);
                break;
            case 18:
                wg1 wg1Var = (wg1) this.h;
                wg1Var.h = null;
                org.telegram.ui.Components.a61 a61Var = wg1Var.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = false;
                r1Var.e = null;
                r1Var.a.V2.N(true);
                r1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void n() {
        switch (this.f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.J.setVisibility(8);
                sbVar.getClass();
                break;
            case 1:
                qp qpVar = (qp) this.h;
                qpVar.K = true;
                qpVar.d.setShowAtCenter(true);
                break;
            case 2:
                pr prVar = (pr) this.h;
                prVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = prVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.p0 = c8Var.r.N0();
                View m9 = c8Var.r.m(c8Var.p0);
                c8Var.q0 = m9 == null ? 0 : m9.getTop();
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.h0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                hkVar.V = true;
                hkVar.D.setVisibility(8);
                hkVar.b.t1(hkVar.C.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.i0 = true;
                alVar.b.t1(alVar.B.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.C = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                ((yt) this.h).f = true;
                break;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().x("");
                kvVar.b.getActionBar().x("");
                kvVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((ad0) this.h).o0 = true;
                break;
            case 12:
                ((qh0) this.h).a.y = true;
                break;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.a.getActionBar().x("");
                kq0Var.b.getActionBar().x("");
                kq0Var.c.getSearchField().requestFocus();
                break;
            case 16:
                o81 o81Var = (o81) this.h;
                o81Var.a.a(true, true);
                o81Var.h.I("");
                o81Var.o0(false, true);
                o81Var.c.V2.N(false);
                break;
            case 17:
                kf1 kf1Var = (kf1) this.h;
                kf1.b0(kf1Var, true);
                gf1 gf1Var = kf1Var.o0;
                if (!gf1Var.V.equals("")) {
                    gf1Var.K(gf1Var.e[0], gf1Var.getCurrentPosition(), "", false);
                }
                kf1Var.o0.setAlpha(0.0f);
                kf1Var.o0.k0.e(true, false);
                break;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = true;
                r1Var.a.V2.N(true);
                r1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void o(tf.e0 e0Var) {
        switch (this.f) {
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                org.telegram.ui.Components.gk gkVar = hkVar.y;
                gkVar.O.remove(e0Var);
                gkVar.Y(hkVar.C.getSearchField().getText().toString(), false);
                gkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void p(kg.f fVar) {
        switch (this.f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.V = true;
                sbVar.w0 = fVar.getText().toString();
                sbVar.V0(true);
                break;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.a.getActionBar().w();
                kq0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void q(EditText editText) {
        org.telegram.ui.Components.sl0 sl0Var;
        lh.e1 e1Var;
        switch (this.f) {
            case 1:
                qp qpVar = (qp) this.h;
                if (qpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (sl0Var = qpVar.b) != null) {
                        f2.o0 adapter = sl0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.b.setAdapter(ppVar);
                            View view = qpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                            qpVar.fragmentView.setTag(Integer.valueOf(i10));
                            qpVar.e.l();
                            qpVar.b.setFastScrollVisible(false);
                            qpVar.b.setVerticalScrollBarEnabled(true);
                            qpVar.d.b();
                        }
                    }
                    qpVar.e.F(obj);
                    break;
                }
                break;
            case 2:
                pr prVar = (pr) this.h;
                if (prVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = prVar.c.getAdapter() == null ? 0 : prVar.c.getAdapter().h();
                    prVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = prVar.c) != null) {
                        f2.o0 adapter2 = e1Var.getAdapter();
                        lr lrVar = prVar.a;
                        if (adapter2 != lrVar) {
                            lh.e1 e1Var2 = prVar.c;
                            e1Var2.V1 = false;
                            e1Var2.W1 = 0;
                            e1Var2.setAdapter(lrVar);
                            if (h == 0) {
                                prVar.y0(0);
                            }
                        }
                    }
                    prVar.A1.setVisibility(8);
                    prVar.z1.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (editText.length() > 0) {
                    c8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    c8Var.f = false;
                    c8Var.s.E(null);
                    break;
                }
            case 4:
                ((org.telegram.ui.Components.hk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                dg.u2 u2Var = alVar.K;
                lh.e1 e1Var3 = alVar.M;
                org.telegram.ui.Components.sl0 sl0Var2 = alVar.N;
                org.telegram.ui.Components.tk tkVar = alVar.O;
                if (tkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        alVar.j0 = true;
                        alVar.B.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        u2Var.setVisibility(8);
                        if (sl0Var2.getAdapter() != tkVar) {
                            sl0Var2.setAdapter(tkVar);
                        }
                        sl0Var2.setVisibility(0);
                        if (tkVar.s.size() == 0 && tkVar.r.size() == 0) {
                            z4 = true;
                        }
                        alVar.k0 = z4;
                        alVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        u2Var.setVisibility(0);
                        sl0Var2.setAdapter(null);
                        sl0Var2.setVisibility(8);
                        alVar.v.setVisibility(8);
                    }
                    tkVar.G(obj3, alVar.o0);
                    break;
                }
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.f0 = obj4;
                    if (obj4.isEmpty()) {
                        org.telegram.ui.Components.sl0 sl0Var3 = contactsActivity.f;
                        if (sl0Var3 != null) {
                            sl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.sl0 sl0Var4 = contactsActivity.f;
                        if (sl0Var4 != null) {
                            sl0Var4.setAdapter(contactsActivity.r);
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
            case 7:
                yt ytVar = (yt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    wt wtVar = ytVar.d;
                    wtVar.getClass();
                    wtVar.e = null;
                    ytVar.e = false;
                    ytVar.a.setAdapter(ytVar.c);
                    ytVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    wt wtVar2 = ytVar.d;
                    wtVar2.getClass();
                    if (obj5 == null) {
                        wtVar2.e = null;
                    } else {
                        try {
                            Timer timer = wtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        wtVar2.d = timer2;
                        timer2.schedule(new vt(wtVar2, obj5, 0), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        ytVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                kvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                m70 m70Var = (m70) this.h;
                l70.E(m70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != m70Var.J) {
                    m70Var.J = z10;
                    org.telegram.ui.Components.sl0 sl0Var5 = m70Var.d;
                    if (sl0Var5 != null) {
                        sl0Var5.setAdapter(!isEmpty ? m70Var.f : m70Var.e);
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
                    org.telegram.ui.Components.sl0 sl0Var6 = languageSelectActivity.b;
                    if (sl0Var6 != null) {
                        sl0Var6.setAdapter(languageSelectActivity.c);
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
                ad0 ad0Var = (ad0) this.h;
                if (ad0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        ad0Var.p0 = true;
                        ad0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = ad0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        ad0Var.R.setVisibility(8);
                        ad0Var.P.setVisibility(8);
                        f2.o0 adapter3 = ad0Var.S.getAdapter();
                        tc0 tc0Var = ad0Var.T;
                        if (adapter3 != tc0Var) {
                            ad0Var.S.setAdapter(tc0Var);
                        }
                        ad0Var.S.setVisibility(0);
                        ad0Var.q0 = ad0Var.T.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = ad0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        ad0Var.R.setVisibility(0);
                        ad0Var.P.setVisibility(0);
                        ad0Var.S.setAdapter(null);
                        ad0Var.S.setVisibility(8);
                    }
                    ad0Var.B0();
                    ad0Var.T.G(obj8, ad0Var.u0);
                    break;
                }
                break;
            case 12:
                ((qh0) this.h).a.j(editText.getText().toString());
                break;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                kq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String obj9 = editText.getText().toString();
                n31 n31Var = (n31) this.h;
                if (obj9 == null) {
                    n31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = n31Var.f;
                    if (arrayList == null) {
                        n31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < n31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) n31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            n31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            n31Var.f.add(language);
                        }
                    }
                    n31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.sl0 sl0Var7 = n31Var.b;
                    if (sl0Var7 != null) {
                        sl0Var7.setAdapter(n31Var.c);
                        break;
                    }
                } else if (n31Var.b != null) {
                    n31Var.d.setVisibility(8);
                    n31Var.b.setAdapter(n31Var.a);
                    break;
                }
                break;
            case 16:
                ((o81) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                gf1 gf1Var = ((kf1) this.h).o0;
                if (!gf1Var.V.equals(obj10)) {
                    gf1Var.K(gf1Var.e[0], gf1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                wg1 wg1Var = (wg1) this.h;
                wg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.a61 a61Var = wg1Var.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.e = editText.getText().toString();
                r1Var.a.V2.N(true);
                r1Var.a.u0(0);
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(tf.e0 e0Var) {
    }
}
