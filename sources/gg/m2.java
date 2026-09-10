package gg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.ld;
import bi.t2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fl;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.bd0;
import org.telegram.ui.bu;
import org.telegram.ui.eg1;
import org.telegram.ui.gr0;
import org.telegram.ui.id0;
import org.telegram.ui.ig1;
import org.telegram.ui.k41;
import org.telegram.ui.k91;
import org.telegram.ui.pv;
import org.telegram.ui.r70;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.vh1;
import org.telegram.ui.wb;
import org.telegram.ui.wr;
import org.telegram.ui.xp;
import org.telegram.ui.yp;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m2 extends i5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public boolean b() {
        switch (this.f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public Animator h() {
        switch (this.f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                    w0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.W1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void m() {
        switch (this.f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.d = false;
                n2Var.e = null;
                n2Var.a.Y2.N(true);
                n2Var.a.u0(0);
                break;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.z0 = "";
                wbVar.M.setVisibility(0);
                if (wbVar.Y) {
                    wbVar.Y = false;
                    wbVar.V0(true);
                    break;
                }
                break;
            case 2:
                yp ypVar = (yp) this.h;
                ypVar.e.F(null);
                ypVar.N = false;
                ypVar.getClass();
                ypVar.b.setAdapter(ypVar.a);
                ypVar.a.l();
                ypVar.b.setFastScrollVisible(true);
                ypVar.b.setVerticalScrollBarEnabled(false);
                ypVar.d.setShowAtCenter(false);
                View view = ypVar.fragmentView;
                int i10 = j6.a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                ypVar.fragmentView.setTag(Integer.valueOf(i10));
                ypVar.d.b();
                break;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.e.F(null);
                wrVar.o1 = false;
                bi.y1 y1Var = wrVar.c;
                y1Var.Y1 = false;
                y1Var.Z1 = 0;
                y1Var.setAdapter(wrVar.a);
                wrVar.a.l();
                wrVar.c.setFastScrollVisible(true);
                wrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = wrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
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
                    org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.k0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                tk tkVar = (tk) this.h;
                tkVar.b0 = false;
                tkVar.G.setVisibility(0);
                ik ikVar = tkVar.r;
                s4.h0 adapter = ikVar.getAdapter();
                mk mkVar = tkVar.v;
                if (adapter != mkVar) {
                    ikVar.setAdapter(mkVar);
                }
                mkVar.l();
                tkVar.y.Y(null, true);
                break;
            case 6:
                ll llVar = (ll) this.h;
                llVar.l0 = false;
                llVar.m0 = false;
                llVar.R.G(null, null);
                llVar.f0();
                llVar.P.setVisibility(0);
                llVar.N.setVisibility(0);
                llVar.Q.setVisibility(8);
                llVar.v.setVisibility(8);
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
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().h(false);
                pvVar.b.getActionBar().h(false);
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
                id0 id0Var = (id0) this.h;
                id0Var.r0 = false;
                id0Var.s0 = false;
                id0Var.W.G(null, null);
                id0Var.B0();
                if (id0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = id0Var.Z;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    id0Var.U.setVisibility(0);
                    id0Var.S.setVisibility(0);
                    id0Var.V.setAdapter(null);
                    id0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                ma0 ma0Var = ((ai0) this.h).a;
                ma0Var.y = false;
                ma0Var.j(null);
                break;
            case 16:
                k41 k41Var = (k41) this.h;
                k41Var.f = null;
                if (k41Var.b != null) {
                    k41Var.d.setVisibility(8);
                    k41Var.b.setAdapter(k41Var.a);
                    break;
                }
                break;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.a.a(false, true);
                k91Var.o0(false, true);
                k91Var.c.Y2.N(false);
                break;
            case 18:
                ig1.b0((ig1) this.h, false);
                break;
            case 19:
                vh1 vh1Var = (vh1) this.h;
                vh1Var.h = null;
                l61 l61Var = vh1Var.a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void n() {
        switch (this.f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.d = true;
                n2Var.a.Y2.N(true);
                n2Var.a.u0(0);
                break;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.M.setVisibility(8);
                wbVar.getClass();
                break;
            case 2:
                yp ypVar = (yp) this.h;
                ypVar.N = true;
                ypVar.d.setShowAtCenter(true);
                break;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.o1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = wrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.k0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                tk tkVar = (tk) this.h;
                tkVar.b0 = true;
                tkVar.G.setVisibility(8);
                tkVar.b.t1(tkVar.F.getSearchField(), true);
                break;
            case 6:
                ll llVar = (ll) this.h;
                llVar.l0 = true;
                llVar.b.t1(llVar.E.getSearchField(), true);
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
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().x("");
                pvVar.b.getActionBar().x("");
                pvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 12:
                ((id0) this.h).r0 = true;
                break;
            case 13:
                ((ai0) this.h).a.y = true;
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().x("");
                gr0Var.b.getActionBar().x("");
                gr0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.a.a(true, true);
                k91Var.h.I("");
                k91Var.o0(false, true);
                k91Var.c.Y2.N(false);
                break;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1.b0(ig1Var, true);
                eg1 eg1Var = ig1Var.r0;
                if (!eg1Var.b0.equals("")) {
                    eg1Var.K(eg1Var.e[0], eg1Var.getCurrentPosition(), "", false);
                }
                ig1Var.r0.setAlpha(0.0f);
                ig1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void o(fg.q0 q0Var) {
        switch (this.f) {
            case 5:
                tk tkVar = (tk) this.h;
                sk skVar = tkVar.y;
                skVar.R.remove(q0Var);
                skVar.Y(tkVar.F.getSearchField().getText().toString(), false);
                skVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void p(t2 t2Var) {
        switch (this.f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.Y = true;
                wbVar.z0 = t2Var.getText().toString();
                wbVar.V0(true);
                break;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.a.getActionBar().w();
                gr0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public void q(EditText editText) {
        vl0 vl0Var;
        bi.y1 y1Var;
        switch (this.f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.e = editText.getText().toString();
                n2Var.a.Y2.N(true);
                n2Var.a.u0(0);
                break;
            case 2:
                yp ypVar = (yp) this.h;
                if (ypVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (vl0Var = ypVar.b) != null) {
                        s4.h0 adapter = vl0Var.getAdapter();
                        xp xpVar = ypVar.e;
                        if (adapter != xpVar) {
                            ypVar.b.setAdapter(xpVar);
                            View view = ypVar.fragmentView;
                            int i10 = j6.d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            ypVar.fragmentView.setTag(Integer.valueOf(i10));
                            ypVar.e.l();
                            ypVar.b.setFastScrollVisible(false);
                            ypVar.b.setVerticalScrollBarEnabled(true);
                            ypVar.d.b();
                        }
                    }
                    ypVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                wr wrVar = (wr) this.h;
                if (wrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = wrVar.c.getAdapter() == null ? 0 : wrVar.c.getAdapter().h();
                    wrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (y1Var = wrVar.c) != null) {
                        s4.h0 adapter2 = y1Var.getAdapter();
                        sr srVar = wrVar.a;
                        if (adapter2 != srVar) {
                            bi.y1 y1Var2 = wrVar.c;
                            y1Var2.Y1 = false;
                            y1Var2.Z1 = 0;
                            y1Var2.setAdapter(srVar);
                            if (h == 0) {
                                wrVar.y0(0);
                            }
                        }
                    }
                    wrVar.D1.setVisibility(8);
                    wrVar.C1.setVisibility(0);
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
                ((tk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                ll llVar = (ll) this.h;
                ld ldVar = llVar.N;
                bi.y1 y1Var3 = llVar.P;
                vl0 vl0Var2 = llVar.Q;
                fl flVar = llVar.R;
                if (flVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        llVar.m0 = true;
                        llVar.E.setShowSearchProgress(true);
                        y1Var3.setVisibility(8);
                        ldVar.setVisibility(8);
                        if (vl0Var2.getAdapter() != flVar) {
                            vl0Var2.setAdapter(flVar);
                        }
                        vl0Var2.setVisibility(0);
                        if (flVar.s.size() == 0 && flVar.r.size() == 0) {
                            z10 = true;
                        }
                        llVar.n0 = z10;
                        llVar.f0();
                    } else {
                        y1Var3.setVisibility(0);
                        ldVar.setVisibility(0);
                        vl0Var2.setAdapter(null);
                        vl0Var2.setVisibility(8);
                        llVar.v.setVisibility(8);
                    }
                    flVar.G(obj3, llVar.r0);
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
                        vl0 vl0Var3 = contactsActivity.f;
                        if (vl0Var3 != null) {
                            vl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        vl0 vl0Var4 = contactsActivity.f;
                        if (vl0Var4 != null) {
                            vl0Var4.setAdapter(contactsActivity.r);
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        ztVar2.d = timer2;
                        timer2.schedule(new fg.u1(ztVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        buVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                pvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    vl0 vl0Var5 = s70Var.d;
                    if (vl0Var5 != null) {
                        vl0Var5.setAdapter(!isEmpty ? s70Var.f : s70Var.e);
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
                    vl0 vl0Var6 = languageSelectActivity.b;
                    if (vl0Var6 != null) {
                        vl0Var6.setAdapter(languageSelectActivity.c);
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
                        org.telegram.ui.ActionBar.w0 w0Var = id0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
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
                        org.telegram.ui.ActionBar.w0 w0Var2 = id0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
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
                k41 k41Var = (k41) this.h;
                if (obj9 == null) {
                    k41Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = k41Var.f;
                    if (arrayList == null) {
                        k41Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < k41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) k41Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            k41Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            k41Var.f.add(language);
                        }
                    }
                    k41Var.c.l();
                }
                if (obj9.length() != 0) {
                    vl0 vl0Var7 = k41Var.b;
                    if (vl0Var7 != null) {
                        vl0Var7.setAdapter(k41Var.c);
                        break;
                    }
                } else if (k41Var.b != null) {
                    k41Var.d.setVisibility(8);
                    k41Var.b.setAdapter(k41Var.a);
                    break;
                }
                break;
            case 17:
                ((k91) this.h).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                eg1 eg1Var = ((ig1) this.h).r0;
                if (!eg1Var.b0.equals(obj10)) {
                    eg1Var.K(eg1Var.e[0], eg1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                vh1 vh1Var = (vh1) this.h;
                vh1Var.h = editText.getText().toString();
                l61 l61Var = vh1Var.a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
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

    private final void w(fg.q0 q0Var) {
    }
}
