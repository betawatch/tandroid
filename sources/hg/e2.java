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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ar0;
import org.telegram.ui.dd0;
import org.telegram.ui.ih1;
import org.telegram.ui.kv;
import org.telegram.ui.mr;
import org.telegram.ui.p70;
import org.telegram.ui.q70;
import org.telegram.ui.qr;
import org.telegram.ui.rp;
import org.telegram.ui.sf1;
import org.telegram.ui.sp;
import org.telegram.ui.ub;
import org.telegram.ui.uh0;
import org.telegram.ui.vt;
import org.telegram.ui.wc0;
import org.telegram.ui.wf1;
import org.telegram.ui.x31;
import org.telegram.ui.x81;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e2 extends f5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public boolean b() {
        switch (this.f) {
            case 14:
                ((ar0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
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

    @Override // org.telegram.ui.ActionBar.f5
    public void m() {
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.a.Y2.N(true);
                f2Var.a.u0(0);
                break;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.v0 = "";
                ubVar.I.setVisibility(0);
                if (ubVar.U) {
                    ubVar.U = false;
                    ubVar.U0(true);
                    break;
                }
                break;
            case 2:
                sp spVar = (sp) this.h;
                spVar.e.F(null);
                spVar.N = false;
                spVar.getClass();
                spVar.b.setAdapter(spVar.a);
                spVar.a.l();
                spVar.b.setFastScrollVisible(true);
                spVar.b.setVerticalScrollBarEnabled(false);
                spVar.d.setShowAtCenter(false);
                View view = spVar.fragmentView;
                int i10 = h6.a7;
                view.setBackgroundColor(h6.w0(null, i10, false));
                spVar.fragmentView.setTag(Integer.valueOf(i10));
                spVar.d.b();
                break;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.e.F(null);
                qrVar.o1 = false;
                ai.w0 w0Var = qrVar.c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(qrVar.a);
                qrVar.a.l();
                qrVar.c.setFastScrollVisible(true);
                qrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = qrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
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
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.b0 = false;
                pkVar.G.setVisibility(0);
                ek ekVar = pkVar.r;
                s4.h0 adapter = ekVar.getAdapter();
                ik ikVar = pkVar.v;
                if (adapter != ikVar) {
                    ekVar.setAdapter(ikVar);
                }
                ikVar.l();
                pkVar.y.Y(null, true);
                break;
            case 6:
                hl hlVar = (hl) this.h;
                hlVar.l0 = false;
                hlVar.m0 = false;
                hlVar.R.G(null, null);
                hlVar.f0();
                hlVar.P.setVisibility(0);
                hlVar.N.setVisibility(0);
                hlVar.Q.setVisibility(8);
                hlVar.v.setVisibility(8);
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
                xt xtVar = (xt) this.h;
                vt vtVar = xtVar.d;
                vtVar.getClass();
                vtVar.e = null;
                xtVar.f = false;
                xtVar.e = false;
                xtVar.a.setAdapter(xtVar.c);
                xtVar.a.setFastScrollVisible(true);
                break;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().h(false);
                kvVar.b.getActionBar().h(false);
                break;
            case 10:
                q70 q70Var = (q70) this.h;
                if (q70Var.M) {
                    p70.E(q70Var.f, null);
                    q70Var.M = false;
                    q70Var.d.setAdapter(q70Var.e);
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
                dd0 dd0Var = (dd0) this.h;
                dd0Var.r0 = false;
                dd0Var.s0 = false;
                dd0Var.W.G(null, null);
                dd0Var.B0();
                if (dd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = dd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    dd0Var.U.setVisibility(0);
                    dd0Var.S.setVisibility(0);
                    dd0Var.V.setAdapter(null);
                    dd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                da0 da0Var = ((uh0) this.h).a;
                da0Var.y = false;
                da0Var.j(null);
                break;
            case 16:
                x31 x31Var = (x31) this.h;
                x31Var.f = null;
                if (x31Var.b != null) {
                    x31Var.d.setVisibility(8);
                    x31Var.b.setAdapter(x31Var.a);
                    break;
                }
                break;
            case 17:
                x81 x81Var = (x81) this.h;
                x81Var.a.a(false, true);
                x81Var.o0(false, true);
                x81Var.c.Y2.N(false);
                break;
            case 18:
                wf1.b0((wf1) this.h, false);
                break;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = null;
                x51 x51Var = ih1Var.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void n() {
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.a.Y2.N(true);
                f2Var.a.u0(0);
                break;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.I.setVisibility(8);
                ubVar.getClass();
                break;
            case 2:
                sp spVar = (sp) this.h;
                spVar.N = true;
                spVar.d.setShowAtCenter(true);
                break;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = qrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
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
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.b0 = true;
                pkVar.G.setVisibility(8);
                pkVar.b.t1(pkVar.F.getSearchField(), true);
                break;
            case 6:
                hl hlVar = (hl) this.h;
                hlVar.l0 = true;
                hlVar.b.t1(hlVar.E.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                ((xt) this.h).f = true;
                break;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().x("");
                kvVar.b.getActionBar().x("");
                kvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 12:
                ((dd0) this.h).r0 = true;
                break;
            case 13:
                ((uh0) this.h).a.y = true;
                break;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.a.getActionBar().x("");
                ar0Var.b.getActionBar().x("");
                ar0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                x81 x81Var = (x81) this.h;
                x81Var.a.a(true, true);
                x81Var.h.I("");
                x81Var.o0(false, true);
                x81Var.c.Y2.N(false);
                break;
            case 18:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.r0;
                if (!sf1Var.b0.equals("")) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.r0.setAlpha(0.0f);
                wf1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void o(gg.q0 q0Var) {
        switch (this.f) {
            case 5:
                pk pkVar = (pk) this.h;
                ok okVar = pkVar.y;
                okVar.R.remove(q0Var);
                okVar.Y(pkVar.F.getSearchField().getText().toString(), false);
                okVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void p(h2 h2Var) {
        switch (this.f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.U = true;
                ubVar.v0 = h2Var.getText().toString();
                ubVar.U0(true);
                break;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.a.getActionBar().w();
                ar0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void q(EditText editText) {
        ml0 ml0Var;
        ai.w0 w0Var;
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.e = editText.getText().toString();
                f2Var.a.Y2.N(true);
                f2Var.a.u0(0);
                break;
            case 2:
                sp spVar = (sp) this.h;
                if (spVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ml0Var = spVar.b) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        rp rpVar = spVar.e;
                        if (adapter != rpVar) {
                            spVar.b.setAdapter(rpVar);
                            View view = spVar.fragmentView;
                            int i10 = h6.d6;
                            view.setBackgroundColor(h6.w0(null, i10, false));
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
            case 3:
                qr qrVar = (qr) this.h;
                if (qrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = qrVar.c.getAdapter() == null ? 0 : qrVar.c.getAdapter().h();
                    qrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = qrVar.c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        mr mrVar = qrVar.a;
                        if (adapter2 != mrVar) {
                            ai.w0 w0Var2 = qrVar.c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(mrVar);
                            if (h == 0) {
                                qrVar.y0(0);
                            }
                        }
                    }
                    qrVar.D1.setVisibility(8);
                    qrVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    j8Var.f = false;
                    j8Var.s.E(null);
                    break;
                }
            case 5:
                ((pk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                hl hlVar = (hl) this.h;
                ai.f0 f0Var = hlVar.N;
                ai.w0 w0Var3 = hlVar.P;
                ml0 ml0Var2 = hlVar.Q;
                bl blVar = hlVar.R;
                if (blVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        hlVar.m0 = true;
                        hlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (ml0Var2.getAdapter() != blVar) {
                            ml0Var2.setAdapter(blVar);
                        }
                        ml0Var2.setVisibility(0);
                        if (blVar.s.size() == 0 && blVar.r.size() == 0) {
                            z10 = true;
                        }
                        hlVar.n0 = z10;
                        hlVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        ml0Var2.setAdapter(null);
                        ml0Var2.setVisibility(8);
                        hlVar.v.setVisibility(8);
                    }
                    blVar.G(obj3, hlVar.r0);
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
                        ml0 ml0Var3 = contactsActivity.f;
                        if (ml0Var3 != null) {
                            ml0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        ml0 ml0Var4 = contactsActivity.f;
                        if (ml0Var4 != null) {
                            ml0Var4.setAdapter(contactsActivity.r);
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
                xt xtVar = (xt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    vt vtVar = xtVar.d;
                    vtVar.getClass();
                    vtVar.e = null;
                    xtVar.e = false;
                    xtVar.a.setAdapter(xtVar.c);
                    xtVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    vt vtVar2 = xtVar.d;
                    vtVar2.getClass();
                    if (obj5 == null) {
                        vtVar2.e = null;
                    } else {
                        try {
                            Timer timer = vtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        vtVar2.d = timer2;
                        timer2.schedule(new gg.s1(vtVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        xtVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                kvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                q70 q70Var = (q70) this.h;
                p70.E(q70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != q70Var.M) {
                    q70Var.M = z11;
                    ml0 ml0Var5 = q70Var.d;
                    if (ml0Var5 != null) {
                        ml0Var5.setAdapter(!isEmpty ? q70Var.f : q70Var.e);
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
                    ml0 ml0Var6 = languageSelectActivity.b;
                    if (ml0Var6 != null) {
                        ml0Var6.setAdapter(languageSelectActivity.c);
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
                dd0 dd0Var = (dd0) this.h;
                if (dd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        dd0Var.s0 = true;
                        dd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = dd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        dd0Var.U.setVisibility(8);
                        dd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = dd0Var.V.getAdapter();
                        wc0 wc0Var = dd0Var.W;
                        if (adapter3 != wc0Var) {
                            dd0Var.V.setAdapter(wc0Var);
                        }
                        dd0Var.V.setVisibility(0);
                        dd0Var.t0 = dd0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = dd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        dd0Var.U.setVisibility(0);
                        dd0Var.S.setVisibility(0);
                        dd0Var.V.setAdapter(null);
                        dd0Var.V.setVisibility(8);
                    }
                    dd0Var.B0();
                    dd0Var.W.G(obj8, dd0Var.x0);
                    break;
                }
                break;
            case 13:
                ((uh0) this.h).a.j(editText.getText().toString());
                break;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                ar0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                x31 x31Var = (x31) this.h;
                if (obj9 == null) {
                    x31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = x31Var.f;
                    if (arrayList == null) {
                        x31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < x31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) x31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            x31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            x31Var.f.add(language);
                        }
                    }
                    x31Var.c.l();
                }
                if (obj9.length() != 0) {
                    ml0 ml0Var7 = x31Var.b;
                    if (ml0Var7 != null) {
                        ml0Var7.setAdapter(x31Var.c);
                        break;
                    }
                } else if (x31Var.b != null) {
                    x31Var.d.setVisibility(8);
                    x31Var.b.setAdapter(x31Var.a);
                    break;
                }
                break;
            case 17:
                ((x81) this.h).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).r0;
                if (!sf1Var.b0.equals(obj10)) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = editText.getText().toString();
                x51 x51Var = ih1Var.a;
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

    private final void w(gg.q0 q0Var) {
    }
}
