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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hb extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ hb(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public boolean b() {
        switch (this.f) {
            case 13:
                ((rq0) this.h).finishFragment();
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
                ub ubVar = (ub) this.h;
                ubVar.w0 = "";
                ubVar.J.setVisibility(0);
                if (ubVar.V) {
                    ubVar.V = false;
                    ubVar.V0(true);
                    break;
                }
                break;
            case 1:
                sp spVar = (sp) this.h;
                spVar.e.F(null);
                spVar.K = false;
                spVar.getClass();
                spVar.b.setAdapter(spVar.a);
                spVar.a.l();
                spVar.b.setFastScrollVisible(true);
                spVar.b.setVerticalScrollBarEnabled(false);
                spVar.d.setShowAtCenter(false);
                View view = spVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                spVar.fragmentView.setTag(Integer.valueOf(i10));
                spVar.d.b();
                break;
            case 2:
                rr rrVar = (rr) this.h;
                rrVar.e.F(null);
                rrVar.l1 = false;
                lh.e1 e1Var = rrVar.c;
                e1Var.V1 = false;
                e1Var.W1 = 0;
                e1Var.setAdapter(rrVar.a);
                rrVar.a.l();
                rrVar.c.setFastScrollVisible(true);
                rrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = rrVar.h;
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
                au auVar = (au) this.h;
                yt ytVar = auVar.d;
                ytVar.getClass();
                ytVar.e = null;
                auVar.f = false;
                auVar.e = false;
                auVar.a.setAdapter(auVar.c);
                auVar.a.setFastScrollVisible(true);
                break;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().h(false);
                mvVar.b.getActionBar().h(false);
                break;
            case 9:
                o70 o70Var = (o70) this.h;
                if (o70Var.J) {
                    n70.E(o70Var.f, null);
                    o70Var.J = false;
                    o70Var.d.setAdapter(o70Var.e);
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
                cd0 cd0Var = (cd0) this.h;
                cd0Var.o0 = false;
                cd0Var.p0 = false;
                cd0Var.T.G(null, null);
                cd0Var.B0();
                if (cd0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = cd0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    cd0Var.R.setVisibility(0);
                    cd0Var.P.setVisibility(0);
                    cd0Var.S.setAdapter(null);
                    cd0Var.S.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.fa0 fa0Var = ((sh0) this.h).a;
                fa0Var.y = false;
                fa0Var.j(null);
                break;
            case 15:
                t31 t31Var = (t31) this.h;
                t31Var.f = null;
                if (t31Var.b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.b.setAdapter(t31Var.a);
                    break;
                }
                break;
            case 16:
                w81 w81Var = (w81) this.h;
                w81Var.a.a(false, true);
                w81Var.o0(false, true);
                w81Var.c.V2.N(false);
                break;
            case 17:
                sf1.b0((sf1) this.h, false);
                break;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = null;
                org.telegram.ui.Components.a61 a61Var = eh1Var.a;
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
                ub ubVar = (ub) this.h;
                ubVar.J.setVisibility(8);
                ubVar.getClass();
                break;
            case 1:
                sp spVar = (sp) this.h;
                spVar.K = true;
                spVar.d.setShowAtCenter(true);
                break;
            case 2:
                rr rrVar = (rr) this.h;
                rrVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = rrVar.h;
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
                ((au) this.h).f = true;
                break;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().x("");
                mvVar.b.getActionBar().x("");
                mvVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((cd0) this.h).o0 = true;
                break;
            case 12:
                ((sh0) this.h).a.y = true;
                break;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.a.getActionBar().x("");
                rq0Var.b.getActionBar().x("");
                rq0Var.c.getSearchField().requestFocus();
                break;
            case 16:
                w81 w81Var = (w81) this.h;
                w81Var.a.a(true, true);
                w81Var.h.I("");
                w81Var.o0(false, true);
                w81Var.c.V2.N(false);
                break;
            case 17:
                sf1 sf1Var = (sf1) this.h;
                sf1.b0(sf1Var, true);
                of1 of1Var = sf1Var.o0;
                if (!of1Var.V.equals("")) {
                    of1Var.K(of1Var.e[0], of1Var.getCurrentPosition(), "", false);
                }
                sf1Var.o0.setAlpha(0.0f);
                sf1Var.o0.k0.e(true, false);
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
                ub ubVar = (ub) this.h;
                ubVar.V = true;
                ubVar.w0 = fVar.getText().toString();
                ubVar.V0(true);
                break;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.a.getActionBar().w();
                rq0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void q(EditText editText) {
        org.telegram.ui.Components.rl0 rl0Var;
        lh.e1 e1Var;
        switch (this.f) {
            case 1:
                sp spVar = (sp) this.h;
                if (spVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (rl0Var = spVar.b) != null) {
                        f2.o0 adapter = rl0Var.getAdapter();
                        rp rpVar = spVar.e;
                        if (adapter != rpVar) {
                            spVar.b.setAdapter(rpVar);
                            View view = spVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                            spVar.fragmentView.setTag(Integer.valueOf(i10));
                            spVar.e.l();
                            spVar.b.setFastScrollVisible(false);
                            spVar.b.setVerticalScrollBarEnabled(true);
                            spVar.d.b();
                        }
                    }
                    spVar.e.F(obj);
                    break;
                }
                break;
            case 2:
                rr rrVar = (rr) this.h;
                if (rrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = rrVar.c.getAdapter() == null ? 0 : rrVar.c.getAdapter().h();
                    rrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = rrVar.c) != null) {
                        f2.o0 adapter2 = e1Var.getAdapter();
                        nr nrVar = rrVar.a;
                        if (adapter2 != nrVar) {
                            lh.e1 e1Var2 = rrVar.c;
                            e1Var2.V1 = false;
                            e1Var2.W1 = 0;
                            e1Var2.setAdapter(nrVar);
                            if (h == 0) {
                                rrVar.y0(0);
                            }
                        }
                    }
                    rrVar.A1.setVisibility(8);
                    rrVar.z1.setVisibility(0);
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
                org.telegram.ui.Components.rl0 rl0Var2 = alVar.N;
                org.telegram.ui.Components.tk tkVar = alVar.O;
                if (tkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        alVar.j0 = true;
                        alVar.B.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        u2Var.setVisibility(8);
                        if (rl0Var2.getAdapter() != tkVar) {
                            rl0Var2.setAdapter(tkVar);
                        }
                        rl0Var2.setVisibility(0);
                        if (tkVar.s.size() == 0 && tkVar.r.size() == 0) {
                            z4 = true;
                        }
                        alVar.k0 = z4;
                        alVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        u2Var.setVisibility(0);
                        rl0Var2.setAdapter(null);
                        rl0Var2.setVisibility(8);
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
                        org.telegram.ui.Components.rl0 rl0Var3 = contactsActivity.f;
                        if (rl0Var3 != null) {
                            rl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.rl0 rl0Var4 = contactsActivity.f;
                        if (rl0Var4 != null) {
                            rl0Var4.setAdapter(contactsActivity.r);
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
                au auVar = (au) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    yt ytVar = auVar.d;
                    ytVar.getClass();
                    ytVar.e = null;
                    auVar.e = false;
                    auVar.a.setAdapter(auVar.c);
                    auVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    yt ytVar2 = auVar.d;
                    ytVar2.getClass();
                    if (obj5 == null) {
                        ytVar2.e = null;
                    } else {
                        try {
                            Timer timer = ytVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        ytVar2.d = timer2;
                        timer2.schedule(new xt(ytVar2, obj5, 0), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        auVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                mvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                o70 o70Var = (o70) this.h;
                n70.E(o70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != o70Var.J) {
                    o70Var.J = z10;
                    org.telegram.ui.Components.rl0 rl0Var5 = o70Var.d;
                    if (rl0Var5 != null) {
                        rl0Var5.setAdapter(!isEmpty ? o70Var.f : o70Var.e);
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
                    org.telegram.ui.Components.rl0 rl0Var6 = languageSelectActivity.b;
                    if (rl0Var6 != null) {
                        rl0Var6.setAdapter(languageSelectActivity.c);
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
                cd0 cd0Var = (cd0) this.h;
                if (cd0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        cd0Var.p0 = true;
                        cd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = cd0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        cd0Var.R.setVisibility(8);
                        cd0Var.P.setVisibility(8);
                        f2.o0 adapter3 = cd0Var.S.getAdapter();
                        vc0 vc0Var = cd0Var.T;
                        if (adapter3 != vc0Var) {
                            cd0Var.S.setAdapter(vc0Var);
                        }
                        cd0Var.S.setVisibility(0);
                        cd0Var.q0 = cd0Var.T.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = cd0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        cd0Var.R.setVisibility(0);
                        cd0Var.P.setVisibility(0);
                        cd0Var.S.setAdapter(null);
                        cd0Var.S.setVisibility(8);
                    }
                    cd0Var.B0();
                    cd0Var.T.G(obj8, cd0Var.u0);
                    break;
                }
                break;
            case 12:
                ((sh0) this.h).a.j(editText.getText().toString());
                break;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                rq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String obj9 = editText.getText().toString();
                t31 t31Var = (t31) this.h;
                if (obj9 == null) {
                    t31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t31Var.f;
                    if (arrayList == null) {
                        t31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            t31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            t31Var.f.add(language);
                        }
                    }
                    t31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.rl0 rl0Var7 = t31Var.b;
                    if (rl0Var7 != null) {
                        rl0Var7.setAdapter(t31Var.c);
                        break;
                    }
                } else if (t31Var.b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.b.setAdapter(t31Var.a);
                    break;
                }
                break;
            case 16:
                ((w81) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                of1 of1Var = ((sf1) this.h).o0;
                if (!of1Var.V.equals(obj10)) {
                    of1Var.K(of1Var.e[0], of1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = editText.getText().toString();
                org.telegram.ui.Components.a61 a61Var = eh1Var.a;
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
