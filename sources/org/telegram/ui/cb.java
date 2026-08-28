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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cb extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ cb(Object obj, int i9) {
        this.f = i9;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public boolean b() {
        switch (this.f) {
            case 13:
                ((eq0) this.h).finishFragment();
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
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    w0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.e);
                }
                if (profileActivity.S1) {
                    profileActivity.Q0.getSearchField().setText("");
                }
                return ProfileActivity.G0(profileActivity, profileActivity.S1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void m() {
        switch (this.f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.v0 = "";
                pbVar.I.setVisibility(0);
                if (pbVar.U) {
                    pbVar.U = false;
                    pbVar.V0(true);
                    break;
                }
                break;
            case 1:
                hp hpVar = (hp) this.h;
                hpVar.e.F(null);
                hpVar.J = false;
                hpVar.getClass();
                hpVar.b.setAdapter(hpVar.a);
                hpVar.a.l();
                hpVar.b.setFastScrollVisible(true);
                hpVar.b.setVerticalScrollBarEnabled(false);
                hpVar.d.setShowAtCenter(false);
                View view = hpVar.fragmentView;
                int i9 = org.telegram.ui.ActionBar.f6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                hpVar.fragmentView.setTag(Integer.valueOf(i9));
                hpVar.d.b();
                break;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.e.F(null);
                jrVar.k1 = false;
                gh.f1 f1Var = jrVar.c;
                f1Var.U1 = false;
                f1Var.V1 = 0;
                f1Var.setAdapter(jrVar.a);
                jrVar.a.l();
                jrVar.c.setFastScrollVisible(true);
                jrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
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
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.g0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                fkVar.U = false;
                fkVar.C.setVisibility(0);
                org.telegram.ui.Components.uj ujVar = fkVar.r;
                f2.r0 adapter = ujVar.getAdapter();
                org.telegram.ui.Components.yj yjVar = fkVar.v;
                if (adapter != yjVar) {
                    ujVar.setAdapter(yjVar);
                }
                yjVar.l();
                fkVar.y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                xkVar.h0 = false;
                xkVar.i0 = false;
                xkVar.N.G(null, null);
                xkVar.e0();
                xkVar.L.setVisibility(0);
                xkVar.J.setVisibility(0);
                xkVar.M.setVisibility(8);
                xkVar.v.setVisibility(8);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.r.G(null);
                contactsActivity.B = false;
                contactsActivity.A = false;
                contactsActivity.f.setAdapter(contactsActivity.d);
                contactsActivity.f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f.setFastScrollVisible(true);
                contactsActivity.f.setVerticalScrollBarEnabled(false);
                contactsActivity.f.getFastScroll().d0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.d0(contactsActivity);
                break;
            case 7:
                qt qtVar = (qt) this.h;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f = false;
                qtVar.e = false;
                qtVar.a.setAdapter(qtVar.c);
                qtVar.a.setFastScrollVisible(true);
                break;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.a.getActionBar().h(false);
                bvVar.b.getActionBar().h(false);
                break;
            case 9:
                z60 z60Var = (z60) this.h;
                if (z60Var.I) {
                    y60.E(z60Var.f, null);
                    z60Var.I = false;
                    z60Var.d.setAdapter(z60Var.e);
                    break;
                }
                break;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.h0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 11:
                pc0 pc0Var = (pc0) this.h;
                pc0Var.n0 = false;
                pc0Var.o0 = false;
                pc0Var.S.G(null, null);
                pc0Var.A0();
                if (pc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = pc0Var.V;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    pc0Var.Q.setVisibility(0);
                    pc0Var.O.setVisibility(0);
                    pc0Var.R.setAdapter(null);
                    pc0Var.R.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.l90 l90Var = ((ih0) this.h).a;
                l90Var.y = false;
                l90Var.j(null);
                break;
            case 15:
                b31 b31Var = (b31) this.h;
                b31Var.f = null;
                if (b31Var.b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.b.setAdapter(b31Var.a);
                    break;
                }
                break;
            case 16:
                z71 z71Var = (z71) this.h;
                z71Var.a.a(false, true);
                z71Var.n0(false, true);
                z71Var.c.U2.N(false);
                break;
            case 17:
                we1.a0((we1) this.h, false);
                break;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1Var.h = null;
                org.telegram.ui.Components.c51 c51Var = ig1Var.a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.d = false;
                t1Var.e = null;
                t1Var.a.U2.N(true);
                t1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void n() {
        switch (this.f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.I.setVisibility(8);
                pbVar.getClass();
                break;
            case 1:
                hp hpVar = (hp) this.h;
                hpVar.J = true;
                hpVar.d.setShowAtCenter(true);
                break;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.k1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.o0 = c8Var.r.N0();
                View m10 = c8Var.r.m(c8Var.o0);
                c8Var.p0 = m10 == null ? 0 : m10.getTop();
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.g0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                fkVar.U = true;
                fkVar.C.setVisibility(8);
                fkVar.b.t1(fkVar.B.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                xkVar.h0 = true;
                xkVar.b.t1(xkVar.A.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.d0(contactsActivity);
                break;
            case 7:
                ((qt) this.h).f = true;
                break;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.a.getActionBar().x("");
                bvVar.b.getActionBar().x("");
                bvVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((pc0) this.h).n0 = true;
                break;
            case 12:
                ((ih0) this.h).a.y = true;
                break;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.a.getActionBar().x("");
                eq0Var.b.getActionBar().x("");
                eq0Var.c.getSearchField().requestFocus();
                break;
            case 16:
                z71 z71Var = (z71) this.h;
                z71Var.a.a(true, true);
                z71Var.h.I("");
                z71Var.n0(false, true);
                z71Var.c.U2.N(false);
                break;
            case 17:
                we1 we1Var = (we1) this.h;
                we1.a0(we1Var, true);
                re1 re1Var = we1Var.n0;
                if (!re1Var.U.equals("")) {
                    re1Var.K(re1Var.e[0], re1Var.getCurrentPosition(), "", false);
                }
                we1Var.n0.setAlpha(0.0f);
                we1Var.n0.j0.e(true, false);
                break;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.d = true;
                t1Var.a.U2.N(true);
                t1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void o(of.m0 m0Var) {
        switch (this.f) {
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                org.telegram.ui.Components.ek ekVar = fkVar.y;
                ekVar.N.remove(m0Var);
                ekVar.Y(fkVar.B.getSearchField().getText().toString(), false);
                ekVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void p(fg.g gVar) {
        switch (this.f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.U = true;
                pbVar.v0 = gVar.getText().toString();
                pbVar.V0(true);
                break;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.a.getActionBar().w();
                eq0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void q(EditText editText) {
        org.telegram.ui.Components.wk0 wk0Var;
        gh.f1 f1Var;
        switch (this.f) {
            case 1:
                hp hpVar = (hp) this.h;
                if (hpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (wk0Var = hpVar.b) != null) {
                        f2.r0 adapter = wk0Var.getAdapter();
                        gp gpVar = hpVar.e;
                        if (adapter != gpVar) {
                            hpVar.b.setAdapter(gpVar);
                            View view = hpVar.fragmentView;
                            int i9 = org.telegram.ui.ActionBar.f6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                            hpVar.fragmentView.setTag(Integer.valueOf(i9));
                            hpVar.e.l();
                            hpVar.b.setFastScrollVisible(false);
                            hpVar.b.setVerticalScrollBarEnabled(true);
                            hpVar.d.b();
                        }
                    }
                    hpVar.e.F(obj);
                    break;
                }
                break;
            case 2:
                jr jrVar = (jr) this.h;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = jrVar.c.getAdapter() == null ? 0 : jrVar.c.getAdapter().h();
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (f1Var = jrVar.c) != null) {
                        f2.r0 adapter2 = f1Var.getAdapter();
                        er erVar = jrVar.a;
                        if (adapter2 != erVar) {
                            gh.f1 f1Var2 = jrVar.c;
                            f1Var2.U1 = false;
                            f1Var2.V1 = 0;
                            f1Var2.setAdapter(erVar);
                            if (h == 0) {
                                jrVar.x0(0);
                            }
                        }
                    }
                    jrVar.z1.setVisibility(8);
                    jrVar.y1.setVisibility(0);
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
                ((org.telegram.ui.Components.fk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                fh.d2 d2Var = xkVar.J;
                gh.f1 f1Var3 = xkVar.L;
                org.telegram.ui.Components.wk0 wk0Var2 = xkVar.M;
                org.telegram.ui.Components.rk rkVar = xkVar.N;
                if (rkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        xkVar.i0 = true;
                        xkVar.A.setShowSearchProgress(true);
                        f1Var3.setVisibility(8);
                        d2Var.setVisibility(8);
                        if (wk0Var2.getAdapter() != rkVar) {
                            wk0Var2.setAdapter(rkVar);
                        }
                        wk0Var2.setVisibility(0);
                        if (rkVar.s.size() == 0 && rkVar.r.size() == 0) {
                            z10 = true;
                        }
                        xkVar.j0 = z10;
                        xkVar.e0();
                    } else {
                        f1Var3.setVisibility(0);
                        d2Var.setVisibility(0);
                        wk0Var2.setAdapter(null);
                        wk0Var2.setVisibility(8);
                        xkVar.v.setVisibility(8);
                    }
                    rkVar.G(obj3, xkVar.n0);
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
                        org.telegram.ui.Components.wk0 wk0Var3 = contactsActivity.f;
                        if (wk0Var3 != null) {
                            wk0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.wk0 wk0Var4 = contactsActivity.f;
                        if (wk0Var4 != null) {
                            wk0Var4.setAdapter(contactsActivity.r);
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
                qt qtVar = (qt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ot otVar = qtVar.d;
                    otVar.getClass();
                    otVar.e = null;
                    qtVar.e = false;
                    qtVar.a.setAdapter(qtVar.c);
                    qtVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    ot otVar2 = qtVar.d;
                    otVar2.getClass();
                    if (obj5 == null) {
                        otVar2.e = null;
                    } else {
                        try {
                            Timer timer = otVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Timer timer2 = new Timer();
                        otVar2.d = timer2;
                        timer2.schedule(new of.m1(otVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        qtVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                bvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                z60 z60Var = (z60) this.h;
                y60.E(z60Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != z60Var.I) {
                    z60Var.I = z11;
                    org.telegram.ui.Components.wk0 wk0Var5 = z60Var.d;
                    if (wk0Var5 != null) {
                        wk0Var5.setAdapter(!isEmpty ? z60Var.f : z60Var.e);
                        break;
                    }
                }
                break;
            case 10:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.h0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    org.telegram.ui.Components.wk0 wk0Var6 = languageSelectActivity.b;
                    if (wk0Var6 != null) {
                        wk0Var6.setAdapter(languageSelectActivity.c);
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
                pc0 pc0Var = (pc0) this.h;
                if (pc0Var.S != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        pc0Var.o0 = true;
                        pc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.V;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        pc0Var.Q.setVisibility(8);
                        pc0Var.O.setVisibility(8);
                        f2.r0 adapter3 = pc0Var.R.getAdapter();
                        ic0 ic0Var = pc0Var.S;
                        if (adapter3 != ic0Var) {
                            pc0Var.R.setAdapter(ic0Var);
                        }
                        pc0Var.R.setVisibility(0);
                        pc0Var.p0 = pc0Var.S.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.V;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        pc0Var.Q.setVisibility(0);
                        pc0Var.O.setVisibility(0);
                        pc0Var.R.setAdapter(null);
                        pc0Var.R.setVisibility(8);
                    }
                    pc0Var.A0();
                    pc0Var.S.G(obj8, pc0Var.t0);
                    break;
                }
                break;
            case 12:
                ((ih0) this.h).a.j(editText.getText().toString());
                break;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                eq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String obj9 = editText.getText().toString();
                b31 b31Var = (b31) this.h;
                if (obj9 == null) {
                    b31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = b31Var.f;
                    if (arrayList == null) {
                        b31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < b31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) b31Var.h.get(i10);
                        if (language.q.startsWith(lowerCase)) {
                            b31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            b31Var.f.add(language);
                        }
                    }
                    b31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.wk0 wk0Var7 = b31Var.b;
                    if (wk0Var7 != null) {
                        wk0Var7.setAdapter(b31Var.c);
                        break;
                    }
                } else if (b31Var.b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.b.setAdapter(b31Var.a);
                    break;
                }
                break;
            case 16:
                ((z71) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                re1 re1Var = ((we1) this.h).n0;
                if (!re1Var.U.equals(obj10)) {
                    re1Var.K(re1Var.e[0], re1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1Var.h = editText.getText().toString();
                org.telegram.ui.Components.c51 c51Var = ig1Var.a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.e = editText.getText().toString();
                t1Var.a.U2.N(true);
                t1Var.a.u0(0);
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(of.m0 m0Var) {
    }
}
