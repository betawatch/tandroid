package hg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.xl;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.ai0;
import org.telegram.ui.bg1;
import org.telegram.ui.f41;
import org.telegram.ui.fg1;
import org.telegram.ui.gr0;
import org.telegram.ui.hd0;
import org.telegram.ui.i91;
import org.telegram.ui.mv;
import org.telegram.ui.pr;
import org.telegram.ui.r70;
import org.telegram.ui.rh1;
import org.telegram.ui.s70;
import org.telegram.ui.tp;
import org.telegram.ui.tr;
import org.telegram.ui.up;
import org.telegram.ui.vb;
import org.telegram.ui.xt;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e2 extends g5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e2(Object obj, int i10) {
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
    public Animator g() {
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
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void m() {
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.a.W2.N(true);
                f2Var.a.u0(0);
                break;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    break;
                }
                break;
            case 2:
                up upVar = (up) this.h;
                upVar.e.F(null);
                upVar.N = false;
                upVar.getClass();
                upVar.b.setAdapter(upVar.a);
                upVar.a.l();
                upVar.b.setFastScrollVisible(true);
                upVar.b.setVerticalScrollBarEnabled(false);
                upVar.d.setShowAtCenter(false);
                View view = upVar.fragmentView;
                int i10 = i6.a7;
                view.setBackgroundColor(i6.x0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                break;
            case 3:
                tr trVar = (tr) this.h;
                trVar.e.F(null);
                trVar.o1 = false;
                ai.w0 w0Var = trVar.c;
                w0Var.W1 = false;
                w0Var.X1 = 0;
                w0Var.setAdapter(trVar.a);
                trVar.a.l();
                trVar.c.setFastScrollVisible(true);
                trVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = trVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                l8 l8Var = (l8) this.h;
                if (l8Var.h) {
                    l8Var.f = false;
                    l8Var.h = false;
                    l8Var.setAllowNestedScroll(true);
                    l8Var.s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                sk skVar = (sk) this.h;
                skVar.b0 = false;
                skVar.G.setVisibility(0);
                hk hkVar = skVar.r;
                s4.i0 adapter = hkVar.getAdapter();
                lk lkVar = skVar.v;
                if (adapter != lkVar) {
                    hkVar.setAdapter(lkVar);
                }
                lkVar.l();
                skVar.y.Y(null, true);
                break;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.l0 = false;
                xlVar.m0 = false;
                xlVar.R.G(null, null);
                xlVar.i0();
                xlVar.P.setVisibility(0);
                xlVar.N.setVisibility(0);
                xlVar.Q.setVisibility(8);
                xlVar.v.setVisibility(8);
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
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.e = null;
                ztVar.f = false;
                ztVar.e = false;
                ztVar.a.setAdapter(ztVar.c);
                ztVar.a.setFastScrollVisible(true);
                break;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().h(false);
                mvVar.b.getActionBar().h(false);
                break;
            case 10:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.e);
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
                hd0 hd0Var = (hd0) this.h;
                hd0Var.r0 = false;
                hd0Var.s0 = false;
                hd0Var.W.G(null, null);
                hd0Var.A0();
                if (hd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = hd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    hd0Var.U.setVisibility(0);
                    hd0Var.S.setVisibility(0);
                    hd0Var.V.setAdapter(null);
                    hd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                eb0 eb0Var = ((ai0) this.h).a;
                eb0Var.y = false;
                eb0Var.j(null);
                break;
            case 16:
                f41 f41Var = (f41) this.h;
                f41Var.f = null;
                if (f41Var.b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.b.setAdapter(f41Var.a);
                    break;
                }
                break;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(false, true);
                i91Var.o0(false, true);
                i91Var.c.W2.N(false);
                break;
            case 18:
                fg1.b0((fg1) this.h, false);
                break;
            case 19:
                rh1 rh1Var = (rh1) this.h;
                rh1Var.h = null;
                e71 e71Var = rh1Var.a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void n() {
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.a.W2.N(true);
                f2Var.a.u0(0);
                break;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                break;
            case 2:
                up upVar = (up) this.h;
                upVar.N = true;
                upVar.d.setShowAtCenter(true);
                break;
            case 3:
                tr trVar = (tr) this.h;
                trVar.o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = trVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                l8 l8Var = (l8) this.h;
                l8Var.s0 = l8Var.r.N0();
                View m10 = l8Var.r.m(l8Var.s0);
                l8Var.t0 = m10 == null ? 0 : m10.getTop();
                l8Var.h = true;
                l8Var.setAllowNestedScroll(false);
                l8Var.s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                sk skVar = (sk) this.h;
                skVar.b0 = true;
                skVar.G.setVisibility(8);
                skVar.b.w1(skVar.F.getSearchField(), true);
                break;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.l0 = true;
                xlVar.b.w1(xlVar.E.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                ((zt) this.h).f = true;
                break;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().y("");
                mvVar.b.getActionBar().y("");
                mvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 12:
                ((hd0) this.h).r0 = true;
                break;
            case 13:
                ((ai0) this.h).a.y = true;
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().y("");
                gr0Var.b.getActionBar().y("");
                gr0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.c.W2.N(false);
                break;
            case 18:
                fg1 fg1Var = (fg1) this.h;
                fg1.b0(fg1Var, true);
                bg1 bg1Var = fg1Var.r0;
                if (!bg1Var.b0.equals("")) {
                    bg1Var.K(bg1Var.e[0], bg1Var.getCurrentPosition(), "", false);
                }
                fg1Var.r0.setAlpha(0.0f);
                fg1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void o(gg.p0 p0Var) {
        switch (this.f) {
            case 5:
                sk skVar = (sk) this.h;
                rk rkVar = skVar.y;
                rkVar.R.remove(p0Var);
                rkVar.Y(skVar.F.getSearchField().getText().toString(), false);
                rkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void p(ci.g2 g2Var) {
        switch (this.f) {
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.U = true;
                vbVar.v0 = g2Var.getText().toString();
                vbVar.U0(true);
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().x();
                gr0Var.b.getActionBar().x();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void q(EditText editText) {
        qm0 qm0Var;
        ai.w0 w0Var;
        switch (this.f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.e = editText.getText().toString();
                f2Var.a.W2.N(true);
                f2Var.a.u0(0);
                break;
            case 2:
                up upVar = (up) this.h;
                if (upVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (qm0Var = upVar.b) != null) {
                        s4.i0 adapter = qm0Var.getAdapter();
                        tp tpVar = upVar.e;
                        if (adapter != tpVar) {
                            upVar.b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = i6.d6;
                            view.setBackgroundColor(i6.x0(null, i10, false));
                            upVar.fragmentView.setTag(Integer.valueOf(i10));
                            upVar.e.l();
                            upVar.b.setFastScrollVisible(false);
                            upVar.b.setVerticalScrollBarEnabled(true);
                            upVar.d.b();
                        }
                    }
                    upVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                tr trVar = (tr) this.h;
                if (trVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = trVar.c.getAdapter() == null ? 0 : trVar.c.getAdapter().h();
                    trVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = trVar.c) != null) {
                        s4.i0 adapter2 = w0Var.getAdapter();
                        pr prVar = trVar.a;
                        if (adapter2 != prVar) {
                            ai.w0 w0Var2 = trVar.c;
                            w0Var2.W1 = false;
                            w0Var2.X1 = 0;
                            w0Var2.setAdapter(prVar);
                            if (h == 0) {
                                trVar.y0(0);
                            }
                        }
                    }
                    trVar.D1.setVisibility(8);
                    trVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                l8 l8Var = (l8) this.h;
                if (editText.length() > 0) {
                    l8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    l8Var.f = false;
                    l8Var.s.E(null);
                    break;
                }
            case 5:
                ((sk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                xl xlVar = (xl) this.h;
                ai.f0 f0Var = xlVar.N;
                ai.w0 w0Var3 = xlVar.P;
                qm0 qm0Var2 = xlVar.Q;
                rl rlVar = xlVar.R;
                if (rlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        xlVar.m0 = true;
                        xlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (qm0Var2.getAdapter() != rlVar) {
                            qm0Var2.setAdapter(rlVar);
                        }
                        qm0Var2.setVisibility(0);
                        if (rlVar.s.size() == 0 && rlVar.r.size() == 0) {
                            z10 = true;
                        }
                        xlVar.n0 = z10;
                        xlVar.i0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        qm0Var2.setAdapter(null);
                        qm0Var2.setVisibility(8);
                        xlVar.v.setVisibility(8);
                    }
                    rlVar.G(obj3, xlVar.r0);
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
                        qm0 qm0Var3 = contactsActivity.f;
                        if (qm0Var3 != null) {
                            qm0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        qm0 qm0Var4 = contactsActivity.f;
                        if (qm0Var4 != null) {
                            qm0Var4.setAdapter(contactsActivity.r);
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
                        timer2.schedule(new gg.r1(xtVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        ztVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                mvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    qm0 qm0Var5 = s70Var.d;
                    if (qm0Var5 != null) {
                        qm0Var5.setAdapter(!isEmpty ? s70Var.f : s70Var.e);
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
                    qm0 qm0Var6 = languageSelectActivity.b;
                    if (qm0Var6 != null) {
                        qm0Var6.setAdapter(languageSelectActivity.c);
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
                hd0 hd0Var = (hd0) this.h;
                if (hd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        hd0Var.s0 = true;
                        hd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = hd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        hd0Var.U.setVisibility(8);
                        hd0Var.S.setVisibility(8);
                        s4.i0 adapter3 = hd0Var.V.getAdapter();
                        ad0 ad0Var = hd0Var.W;
                        if (adapter3 != ad0Var) {
                            hd0Var.V.setAdapter(ad0Var);
                        }
                        hd0Var.V.setVisibility(0);
                        hd0Var.t0 = hd0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = hd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        hd0Var.U.setVisibility(0);
                        hd0Var.S.setVisibility(0);
                        hd0Var.V.setAdapter(null);
                        hd0Var.V.setVisibility(8);
                    }
                    hd0Var.A0();
                    hd0Var.W.G(obj8, hd0Var.x0);
                    break;
                }
                break;
            case 13:
                ((ai0) this.h).a.j(editText.getText().toString());
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
                f41 f41Var = (f41) this.h;
                if (obj9 == null) {
                    f41Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = f41Var.f;
                    if (arrayList == null) {
                        f41Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < f41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) f41Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            f41Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            f41Var.f.add(language);
                        }
                    }
                    f41Var.c.l();
                }
                if (obj9.length() != 0) {
                    qm0 qm0Var7 = f41Var.b;
                    if (qm0Var7 != null) {
                        qm0Var7.setAdapter(f41Var.c);
                        break;
                    }
                } else if (f41Var.b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.b.setAdapter(f41Var.a);
                    break;
                }
                break;
            case 17:
                ((i91) this.h).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                bg1 bg1Var = ((fg1) this.h).r0;
                if (!bg1Var.b0.equals(obj10)) {
                    bg1Var.K(bg1Var.e[0], bg1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                rh1 rh1Var = (rh1) this.h;
                rh1Var.h = editText.getText().toString();
                e71 e71Var = rh1Var.a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
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

    private final void w(gg.p0 p0Var) {
    }
}
