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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ fb(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public boolean b() {
        switch (this.f) {
            case 13:
                ((mq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
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

    @Override // org.telegram.ui.ActionBar.i5
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
                rp rpVar = (rp) this.h;
                rpVar.e.F(null);
                rpVar.K = false;
                rpVar.getClass();
                rpVar.b.setAdapter(rpVar.a);
                rpVar.a.l();
                rpVar.b.setFastScrollVisible(true);
                rpVar.b.setVerticalScrollBarEnabled(false);
                rpVar.d.setShowAtCenter(false);
                View view = rpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                rpVar.fragmentView.setTag(Integer.valueOf(i10));
                rpVar.d.b();
                break;
            case 2:
                qr qrVar = (qr) this.h;
                qrVar.e.F(null);
                qrVar.l1 = false;
                mh.d1 d1Var = qrVar.c;
                d1Var.V1 = false;
                d1Var.W1 = 0;
                d1Var.setAdapter(qrVar.a);
                qrVar.a.l();
                qrVar.c.setFastScrollVisible(true);
                qrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = qrVar.h;
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
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.V = false;
                jkVar.D.setVisibility(0);
                org.telegram.ui.Components.xj xjVar = jkVar.r;
                f2.p0 adapter = xjVar.getAdapter();
                org.telegram.ui.Components.bk bkVar = jkVar.v;
                if (adapter != bkVar) {
                    xjVar.setAdapter(bkVar);
                }
                bkVar.l();
                jkVar.y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                clVar.i0 = false;
                clVar.j0 = false;
                clVar.O.G(null, null);
                clVar.f0();
                clVar.M.setVisibility(0);
                clVar.K.setVisibility(0);
                clVar.N.setVisibility(8);
                clVar.v.setVisibility(8);
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
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.e = null;
                ztVar.f = false;
                ztVar.e = false;
                ztVar.a.setAdapter(ztVar.c);
                ztVar.a.setFastScrollVisible(true);
                break;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.a.getActionBar().h(false);
                lvVar.b.getActionBar().h(false);
                break;
            case 9:
                n70 n70Var = (n70) this.h;
                if (n70Var.J) {
                    m70.E(n70Var.f, null);
                    n70Var.J = false;
                    n70Var.d.setAdapter(n70Var.e);
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
                bd0 bd0Var = (bd0) this.h;
                bd0Var.o0 = false;
                bd0Var.p0 = false;
                bd0Var.T.G(null, null);
                bd0Var.B0();
                if (bd0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = bd0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    bd0Var.R.setVisibility(0);
                    bd0Var.P.setVisibility(0);
                    bd0Var.S.setAdapter(null);
                    bd0Var.S.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.ga0 ga0Var = ((rh0) this.h).a;
                ga0Var.y = false;
                ga0Var.j(null);
                break;
            case 15:
                p31 p31Var = (p31) this.h;
                p31Var.f = null;
                if (p31Var.b != null) {
                    p31Var.d.setVisibility(8);
                    p31Var.b.setAdapter(p31Var.a);
                    break;
                }
                break;
            case 16:
                p81 p81Var = (p81) this.h;
                p81Var.a.a(false, true);
                p81Var.o0(false, true);
                p81Var.c.V2.N(false);
                break;
            case 17:
                mf1.b0((mf1) this.h, false);
                break;
            case 18:
                yg1 yg1Var = (yg1) this.h;
                yg1Var.h = null;
                org.telegram.ui.Components.b61 b61Var = yg1Var.a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    break;
                }
                break;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
                r1Var.d = false;
                r1Var.e = null;
                r1Var.a.V2.N(true);
                r1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void n() {
        switch (this.f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.J.setVisibility(8);
                sbVar.getClass();
                break;
            case 1:
                rp rpVar = (rp) this.h;
                rpVar.K = true;
                rpVar.d.setShowAtCenter(true);
                break;
            case 2:
                qr qrVar = (qr) this.h;
                qrVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = qrVar.h;
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
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.V = true;
                jkVar.D.setVisibility(8);
                jkVar.b.t1(jkVar.C.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                clVar.i0 = true;
                clVar.b.t1(clVar.B.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.C = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                ((zt) this.h).f = true;
                break;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.a.getActionBar().x("");
                lvVar.b.getActionBar().x("");
                lvVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((bd0) this.h).o0 = true;
                break;
            case 12:
                ((rh0) this.h).a.y = true;
                break;
            case 13:
                mq0 mq0Var = (mq0) this.h;
                mq0Var.a.getActionBar().x("");
                mq0Var.b.getActionBar().x("");
                mq0Var.c.getSearchField().requestFocus();
                break;
            case 16:
                p81 p81Var = (p81) this.h;
                p81Var.a.a(true, true);
                p81Var.h.I("");
                p81Var.o0(false, true);
                p81Var.c.V2.N(false);
                break;
            case 17:
                mf1 mf1Var = (mf1) this.h;
                mf1.b0(mf1Var, true);
                if1 if1Var = mf1Var.o0;
                if (!if1Var.V.equals("")) {
                    if1Var.K(if1Var.e[0], if1Var.getCurrentPosition(), "", false);
                }
                mf1Var.o0.setAlpha(0.0f);
                mf1Var.o0.k0.e(true, false);
                break;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
                r1Var.d = true;
                r1Var.a.V2.N(true);
                r1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void o(uf.e0 e0Var) {
        switch (this.f) {
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                org.telegram.ui.Components.ik ikVar = jkVar.y;
                ikVar.O.remove(e0Var);
                ikVar.Y(jkVar.C.getSearchField().getText().toString(), false);
                ikVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void p(lg.f fVar) {
        switch (this.f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.V = true;
                sbVar.w0 = fVar.getText().toString();
                sbVar.V0(true);
                break;
            case 13:
                mq0 mq0Var = (mq0) this.h;
                mq0Var.a.getActionBar().w();
                mq0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void q(EditText editText) {
        org.telegram.ui.Components.tl0 tl0Var;
        mh.d1 d1Var;
        switch (this.f) {
            case 1:
                rp rpVar = (rp) this.h;
                if (rpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (tl0Var = rpVar.b) != null) {
                        f2.p0 adapter = tl0Var.getAdapter();
                        qp qpVar = rpVar.e;
                        if (adapter != qpVar) {
                            rpVar.b.setAdapter(qpVar);
                            View view = rpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.k6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                            rpVar.fragmentView.setTag(Integer.valueOf(i10));
                            rpVar.e.l();
                            rpVar.b.setFastScrollVisible(false);
                            rpVar.b.setVerticalScrollBarEnabled(true);
                            rpVar.d.b();
                        }
                    }
                    rpVar.e.F(obj);
                    break;
                }
                break;
            case 2:
                qr qrVar = (qr) this.h;
                if (qrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = qrVar.c.getAdapter() == null ? 0 : qrVar.c.getAdapter().h();
                    qrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (d1Var = qrVar.c) != null) {
                        f2.p0 adapter2 = d1Var.getAdapter();
                        mr mrVar = qrVar.a;
                        if (adapter2 != mrVar) {
                            mh.d1 d1Var2 = qrVar.c;
                            d1Var2.V1 = false;
                            d1Var2.W1 = 0;
                            d1Var2.setAdapter(mrVar);
                            if (h == 0) {
                                qrVar.y0(0);
                            }
                        }
                    }
                    qrVar.A1.setVisibility(8);
                    qrVar.z1.setVisibility(0);
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
                ((org.telegram.ui.Components.jk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                eg.s2 s2Var = clVar.K;
                mh.d1 d1Var3 = clVar.M;
                org.telegram.ui.Components.tl0 tl0Var2 = clVar.N;
                org.telegram.ui.Components.vk vkVar = clVar.O;
                if (vkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        clVar.j0 = true;
                        clVar.B.setShowSearchProgress(true);
                        d1Var3.setVisibility(8);
                        s2Var.setVisibility(8);
                        if (tl0Var2.getAdapter() != vkVar) {
                            tl0Var2.setAdapter(vkVar);
                        }
                        tl0Var2.setVisibility(0);
                        if (vkVar.s.size() == 0 && vkVar.r.size() == 0) {
                            z4 = true;
                        }
                        clVar.k0 = z4;
                        clVar.f0();
                    } else {
                        d1Var3.setVisibility(0);
                        s2Var.setVisibility(0);
                        tl0Var2.setAdapter(null);
                        tl0Var2.setVisibility(8);
                        clVar.v.setVisibility(8);
                    }
                    vkVar.G(obj3, clVar.o0);
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
                        org.telegram.ui.Components.tl0 tl0Var3 = contactsActivity.f;
                        if (tl0Var3 != null) {
                            tl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.tl0 tl0Var4 = contactsActivity.f;
                        if (tl0Var4 != null) {
                            tl0Var4.setAdapter(contactsActivity.r);
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
                zt ztVar = (zt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    xt xtVar = ztVar.d;
                    xtVar.getClass();
                    xtVar.e = null;
                    ztVar.e = false;
                    ztVar.a.setAdapter(ztVar.c);
                    ztVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    xt xtVar2 = ztVar.d;
                    xtVar2.getClass();
                    if (obj5 == null) {
                        xtVar2.e = null;
                    } else {
                        try {
                            Timer timer = xtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        Timer timer2 = new Timer();
                        xtVar2.d = timer2;
                        timer2.schedule(new wt(xtVar2, obj5, 0), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        ztVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                lvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                n70 n70Var = (n70) this.h;
                m70.E(n70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != n70Var.J) {
                    n70Var.J = z10;
                    org.telegram.ui.Components.tl0 tl0Var5 = n70Var.d;
                    if (tl0Var5 != null) {
                        tl0Var5.setAdapter(!isEmpty ? n70Var.f : n70Var.e);
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
                    org.telegram.ui.Components.tl0 tl0Var6 = languageSelectActivity.b;
                    if (tl0Var6 != null) {
                        tl0Var6.setAdapter(languageSelectActivity.c);
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
                bd0 bd0Var = (bd0) this.h;
                if (bd0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        bd0Var.p0 = true;
                        bd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = bd0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        bd0Var.R.setVisibility(8);
                        bd0Var.P.setVisibility(8);
                        f2.p0 adapter3 = bd0Var.S.getAdapter();
                        uc0 uc0Var = bd0Var.T;
                        if (adapter3 != uc0Var) {
                            bd0Var.S.setAdapter(uc0Var);
                        }
                        bd0Var.S.setVisibility(0);
                        bd0Var.q0 = bd0Var.T.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = bd0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        bd0Var.R.setVisibility(0);
                        bd0Var.P.setVisibility(0);
                        bd0Var.S.setAdapter(null);
                        bd0Var.S.setVisibility(8);
                    }
                    bd0Var.B0();
                    bd0Var.T.G(obj8, bd0Var.u0);
                    break;
                }
                break;
            case 12:
                ((rh0) this.h).a.j(editText.getText().toString());
                break;
            case 13:
                mq0 mq0Var = (mq0) this.h;
                mq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                mq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String obj9 = editText.getText().toString();
                p31 p31Var = (p31) this.h;
                if (obj9 == null) {
                    p31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = p31Var.f;
                    if (arrayList == null) {
                        p31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < p31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) p31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            p31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            p31Var.f.add(language);
                        }
                    }
                    p31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.tl0 tl0Var7 = p31Var.b;
                    if (tl0Var7 != null) {
                        tl0Var7.setAdapter(p31Var.c);
                        break;
                    }
                } else if (p31Var.b != null) {
                    p31Var.d.setVisibility(8);
                    p31Var.b.setAdapter(p31Var.a);
                    break;
                }
                break;
            case 16:
                ((p81) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                if1 if1Var = ((mf1) this.h).o0;
                if (!if1Var.V.equals(obj10)) {
                    if1Var.K(if1Var.e[0], if1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                yg1 yg1Var = (yg1) this.h;
                yg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.b61 b61Var = yg1Var.a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    break;
                }
                break;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
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

    private final void w(uf.e0 e0Var) {
    }
}
