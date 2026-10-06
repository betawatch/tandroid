package hg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import ci.h2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br0;
import org.telegram.ui.gd0;
import org.telegram.ui.nr;
import org.telegram.ui.nv;
import org.telegram.ui.r70;
import org.telegram.ui.rr;
import org.telegram.ui.s70;
import org.telegram.ui.sf1;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.tr;
import org.telegram.ui.w31;
import org.telegram.ui.wb;
import org.telegram.ui.wf1;
import org.telegram.ui.xh0;
import org.telegram.ui.xt;
import org.telegram.ui.y81;
import org.telegram.ui.zc0;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d2 extends f5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public boolean b() {
        switch (this.f) {
            case 15:
                ((br0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public Animator h() {
        switch (this.f) {
            case 16:
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

    @Override // org.telegram.ui.ActionBar.f5
    public void m() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.a.f3.N(true);
                e2Var.a.v0(0);
                break;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    break;
                }
                break;
            case 2:
                tp tpVar = (tp) this.h;
                tpVar.e.F(null);
                tpVar.N = false;
                tpVar.getClass();
                tpVar.b.setAdapter(tpVar.a);
                tpVar.a.l();
                tpVar.b.setFastScrollVisible(true);
                tpVar.b.setVerticalScrollBarEnabled(false);
                tpVar.d.setShowAtCenter(false);
                tpVar.d.b();
                break;
            case 3:
                rr rrVar = (rr) this.h;
                rrVar.e.F(null);
                rrVar.o1 = false;
                ai.w0 w0Var = rrVar.c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(rrVar.a);
                rrVar.a.l();
                rrVar.c.setFastScrollVisible(true);
                rrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = rrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                tr trVar = (tr) this.h;
                trVar.n = null;
                y61 y61Var = trVar.a;
                if (y61Var != null) {
                    y61Var.f3.N(true);
                    break;
                }
                break;
            case 5:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.b0 = false;
                rkVar.G.setVisibility(0);
                gk gkVar = rkVar.r;
                s4.h0 adapter = gkVar.getAdapter();
                kk kkVar = rkVar.v;
                if (adapter != kkVar) {
                    gkVar.setAdapter(kkVar);
                }
                kkVar.l();
                rkVar.y.Y(null, true);
                break;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.l0 = false;
                jlVar.m0 = false;
                jlVar.R.G(null, null);
                jlVar.f0();
                jlVar.P.setVisibility(0);
                jlVar.N.setVisibility(0);
                jlVar.Q.setVisibility(8);
                jlVar.v.setVisibility(8);
                break;
            case 8:
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
            case 9:
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.e = null;
                ztVar.f = false;
                ztVar.e = false;
                ztVar.a.setAdapter(ztVar.c);
                ztVar.a.setFastScrollVisible(true);
                break;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.a.getActionBar().h(false);
                nvVar.b.getActionBar().h(false);
                break;
            case 11:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.e);
                    break;
                }
                break;
            case 12:
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
            case 13:
                gd0 gd0Var = (gd0) this.h;
                gd0Var.r0 = false;
                gd0Var.s0 = false;
                gd0Var.W.G(null, null);
                gd0Var.B0();
                if (gd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = gd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    gd0Var.U.setVisibility(0);
                    gd0Var.S.setVisibility(0);
                    gd0Var.V.setAdapter(null);
                    gd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                qa0 qa0Var = ((xh0) this.h).a;
                qa0Var.y = false;
                qa0Var.j(null);
                break;
            case 17:
                w31 w31Var = (w31) this.h;
                w31Var.f = null;
                if (w31Var.b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.b.setAdapter(w31Var.a);
                    break;
                }
                break;
            case 18:
                y81 y81Var = (y81) this.h;
                y81Var.a.a(false, true);
                y81Var.m0(false, true);
                y81Var.c.f3.N(false);
                break;
            case 19:
                wf1.b0((wf1) this.h, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void n() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.a.f3.N(true);
                e2Var.a.v0(0);
                break;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                break;
            case 2:
                tp tpVar = (tp) this.h;
                tpVar.N = true;
                tpVar.d.setShowAtCenter(true);
                break;
            case 3:
                rr rrVar = (rr) this.h;
                rrVar.o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = rrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 5:
                j8 j8Var = (j8) this.h;
                j8Var.s0 = j8Var.r.N0();
                View m10 = j8Var.r.m(j8Var.s0);
                j8Var.t0 = m10 == null ? 0 : m10.getTop();
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    break;
                }
                break;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.b0 = true;
                rkVar.G.setVisibility(8);
                rkVar.b.s1(rkVar.F.getSearchField(), true);
                break;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.l0 = true;
                jlVar.b.s1(jlVar.E.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 9:
                ((zt) this.h).f = true;
                break;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.a.getActionBar().x("");
                nvVar.b.getActionBar().x("");
                nvVar.c.getSearchField().requestFocus();
                break;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 13:
                ((gd0) this.h).r0 = true;
                break;
            case 14:
                ((xh0) this.h).a.y = true;
                break;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.a.getActionBar().x("");
                br0Var.b.getActionBar().x("");
                br0Var.c.getSearchField().requestFocus();
                break;
            case 18:
                y81 y81Var = (y81) this.h;
                y81Var.a.a(true, true);
                y81Var.f.I("");
                y81Var.m0(false, true);
                y81Var.c.f3.N(false);
                break;
            case 19:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.r0;
                if (!sf1Var.d0.equals("")) {
                    sf1Var.M(sf1Var.e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.r0.setAlpha(0.0f);
                wf1Var.r0.p0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void o(gg.q0 q0Var) {
        switch (this.f) {
            case 6:
                rk rkVar = (rk) this.h;
                qk qkVar = rkVar.y;
                qkVar.R.remove(q0Var);
                qkVar.Y(rkVar.F.getSearchField().getText().toString(), false);
                qkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void p(h2 h2Var) {
        switch (this.f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.v0 = h2Var.getText().toString();
                wbVar.U0(true);
                break;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.a.getActionBar().w();
                br0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void q(EditText editText) {
        zl0 zl0Var;
        ai.w0 w0Var;
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.a.f3.N(true);
                e2Var.a.v0(0);
                break;
            case 2:
                tp tpVar = (tp) this.h;
                if (tpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (zl0Var = tpVar.b) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
                        sp spVar = tpVar.e;
                        if (adapter != spVar) {
                            tpVar.b.setAdapter(spVar);
                            tpVar.e.l();
                            tpVar.b.setFastScrollVisible(false);
                            tpVar.b.setVerticalScrollBarEnabled(true);
                            tpVar.d.b();
                        }
                    }
                    tpVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                rr rrVar = (rr) this.h;
                if (rrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = rrVar.c.getAdapter() == null ? 0 : rrVar.c.getAdapter().h();
                    rrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = rrVar.c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        nr nrVar = rrVar.a;
                        if (adapter2 != nrVar) {
                            ai.w0 w0Var2 = rrVar.c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(nrVar);
                            if (h == 0) {
                                rrVar.y0(0);
                            }
                        }
                    }
                    rrVar.D1.setVisibility(8);
                    rrVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                tr trVar = (tr) this.h;
                trVar.n = editText.getText().toString();
                y61 y61Var = trVar.a;
                if (y61Var != null) {
                    y61Var.f3.N(true);
                    break;
                }
                break;
            case 5:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    j8Var.f = false;
                    j8Var.s.E(null);
                    break;
                }
            case 6:
                ((rk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 7:
                jl jlVar = (jl) this.h;
                ai.f0 f0Var = jlVar.N;
                ai.w0 w0Var3 = jlVar.P;
                zl0 zl0Var2 = jlVar.Q;
                dl dlVar = jlVar.R;
                if (dlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        jlVar.m0 = true;
                        jlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (zl0Var2.getAdapter() != dlVar) {
                            zl0Var2.setAdapter(dlVar);
                        }
                        zl0Var2.setVisibility(0);
                        if (dlVar.s.size() == 0 && dlVar.r.size() == 0) {
                            z10 = true;
                        }
                        jlVar.n0 = z10;
                        jlVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        zl0Var2.setAdapter(null);
                        zl0Var2.setVisibility(8);
                        jlVar.v.setVisibility(8);
                    }
                    dlVar.G(obj3, jlVar.r0);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.i0 = obj4;
                    if (obj4.isEmpty()) {
                        zl0 zl0Var3 = contactsActivity.f;
                        if (zl0Var3 != null) {
                            zl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        zl0 zl0Var4 = contactsActivity.f;
                        if (zl0Var4 != null) {
                            zl0Var4.setAdapter(contactsActivity.r);
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
            case 9:
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Timer timer2 = new Timer();
                        xtVar2.d = timer2;
                        timer2.schedule(new gg.s1(xtVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        ztVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                nvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    zl0 zl0Var5 = s70Var.d;
                    if (zl0Var5 != null) {
                        zl0Var5.setAdapter(!isEmpty ? s70Var.f : s70Var.e);
                        break;
                    }
                }
                break;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    zl0 zl0Var6 = languageSelectActivity.b;
                    if (zl0Var6 != null) {
                        zl0Var6.setAdapter(languageSelectActivity.c);
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
            case 13:
                gd0 gd0Var = (gd0) this.h;
                if (gd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        gd0Var.s0 = true;
                        gd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = gd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        gd0Var.U.setVisibility(8);
                        gd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = gd0Var.V.getAdapter();
                        zc0 zc0Var = gd0Var.W;
                        if (adapter3 != zc0Var) {
                            gd0Var.V.setAdapter(zc0Var);
                        }
                        gd0Var.V.setVisibility(0);
                        gd0Var.t0 = gd0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = gd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        gd0Var.U.setVisibility(0);
                        gd0Var.S.setVisibility(0);
                        gd0Var.V.setAdapter(null);
                        gd0Var.V.setVisibility(8);
                    }
                    gd0Var.B0();
                    gd0Var.W.G(obj8, gd0Var.x0);
                    break;
                }
                break;
            case 14:
                ((xh0) this.h).a.j(editText.getText().toString());
                break;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                br0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 17:
                String obj9 = editText.getText().toString();
                w31 w31Var = (w31) this.h;
                if (obj9 == null) {
                    w31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = w31Var.f;
                    if (arrayList == null) {
                        w31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < w31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) w31Var.h.get(i10);
                        if (language.q.startsWith(lowerCase)) {
                            w31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            w31Var.f.add(language);
                        }
                    }
                    w31Var.c.l();
                }
                if (obj9.length() != 0) {
                    zl0 zl0Var7 = w31Var.b;
                    if (zl0Var7 != null) {
                        zl0Var7.setAdapter(w31Var.c);
                        break;
                    }
                } else if (w31Var.b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.b.setAdapter(w31Var.a);
                    break;
                }
                break;
            case 18:
                ((y81) this.h).f.I(editText.getText().toString());
                break;
            case 19:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).r0;
                if (!sf1Var.d0.equals(obj10)) {
                    sf1Var.M(sf1Var.e[0], sf1Var.getCurrentPosition(), obj10, false);
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

    private final void w(gg.q0 q0Var) {
    }
}
