package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import di.g2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.ul;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ac;
import org.telegram.ui.aq;
import org.telegram.ui.du;
import org.telegram.ui.fi0;
import org.telegram.ui.fu;
import org.telegram.ui.gd0;
import org.telegram.ui.hg1;
import org.telegram.ui.l41;
import org.telegram.ui.lg1;
import org.telegram.ui.mr0;
import org.telegram.ui.nd0;
import org.telegram.ui.o91;
import org.telegram.ui.sv;
import org.telegram.ui.ur;
import org.telegram.ui.x70;
import org.telegram.ui.xh1;
import org.telegram.ui.y70;
import org.telegram.ui.yr;
import org.telegram.ui.zp;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d2 extends e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public boolean b() {
        switch (this.f) {
            case 14:
                ((mr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public Animator g() {
        switch (this.f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    u0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.W1);
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void m() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.a.W2.N(true);
                e2Var.a.u0(0);
                break;
            case 1:
                ac acVar = (ac) this.h;
                acVar.v0 = "";
                acVar.I.setVisibility(0);
                if (acVar.U) {
                    acVar.U = false;
                    acVar.U0(true);
                    break;
                }
                break;
            case 2:
                aq aqVar = (aq) this.h;
                aqVar.e.F(null);
                aqVar.N = false;
                aqVar.getClass();
                aqVar.b.setAdapter(aqVar.a);
                aqVar.a.l();
                aqVar.b.setFastScrollVisible(true);
                aqVar.b.setVerticalScrollBarEnabled(false);
                aqVar.d.setShowAtCenter(false);
                View view = aqVar.fragmentView;
                int i10 = g6.a7;
                view.setBackgroundColor(g6.x0(null, i10, false));
                aqVar.fragmentView.setTag(Integer.valueOf(i10));
                aqVar.d.b();
                break;
            case 3:
                yr yrVar = (yr) this.h;
                yrVar.e.F(null);
                yrVar.o1 = false;
                bi.o0 o0Var = yrVar.c;
                o0Var.W1 = false;
                o0Var.X1 = 0;
                o0Var.setAdapter(yrVar.a);
                yrVar.a.l();
                yrVar.c.setFastScrollVisible(true);
                yrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = yrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                m8 m8Var = (m8) this.h;
                if (m8Var.h) {
                    m8Var.f = false;
                    m8Var.h = false;
                    m8Var.setAllowNestedScroll(true);
                    m8Var.s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.b0 = false;
                pkVar.G.setVisibility(0);
                ek ekVar = pkVar.r;
                s4.g0 adapter = ekVar.getAdapter();
                ik ikVar = pkVar.v;
                if (adapter != ikVar) {
                    ekVar.setAdapter(ikVar);
                }
                ikVar.l();
                pkVar.y.Y(null, true);
                break;
            case 6:
                ul ulVar = (ul) this.h;
                ulVar.l0 = false;
                ulVar.m0 = false;
                ulVar.R.G(null, null);
                ulVar.i0();
                ulVar.P.setVisibility(0);
                ulVar.N.setVisibility(0);
                ulVar.Q.setVisibility(8);
                ulVar.v.setVisibility(8);
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
                fu fuVar = (fu) this.h;
                du duVar = fuVar.d;
                duVar.getClass();
                duVar.e = null;
                fuVar.f = false;
                fuVar.e = false;
                fuVar.a.setAdapter(fuVar.c);
                fuVar.a.setFastScrollVisible(true);
                break;
            case 9:
                sv svVar = (sv) this.h;
                svVar.a.getActionBar().h(false);
                svVar.b.getActionBar().h(false);
                break;
            case 10:
                y70 y70Var = (y70) this.h;
                if (y70Var.M) {
                    x70.E(y70Var.f, null);
                    y70Var.M = false;
                    y70Var.d.setAdapter(y70Var.e);
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
                nd0 nd0Var = (nd0) this.h;
                nd0Var.r0 = false;
                nd0Var.s0 = false;
                nd0Var.W.G(null, null);
                nd0Var.A0();
                if (nd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = nd0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    nd0Var.U.setVisibility(0);
                    nd0Var.S.setVisibility(0);
                    nd0Var.V.setAdapter(null);
                    nd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                db0 db0Var = ((fi0) this.h).a;
                db0Var.y = false;
                db0Var.j(null);
                break;
            case 16:
                l41 l41Var = (l41) this.h;
                l41Var.f = null;
                if (l41Var.b != null) {
                    l41Var.d.setVisibility(8);
                    l41Var.b.setAdapter(l41Var.a);
                    break;
                }
                break;
            case 17:
                o91 o91Var = (o91) this.h;
                o91Var.a.a(false, true);
                o91Var.o0(false, true);
                o91Var.c.W2.N(false);
                break;
            case 18:
                lg1.b0((lg1) this.h, false);
                break;
            case 19:
                xh1 xh1Var = (xh1) this.h;
                xh1Var.h = null;
                b71 b71Var = xh1Var.a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void n() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.a.W2.N(true);
                e2Var.a.u0(0);
                break;
            case 1:
                ac acVar = (ac) this.h;
                acVar.I.setVisibility(8);
                acVar.getClass();
                break;
            case 2:
                aq aqVar = (aq) this.h;
                aqVar.N = true;
                aqVar.d.setShowAtCenter(true);
                break;
            case 3:
                yr yrVar = (yr) this.h;
                yrVar.o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = yrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                m8 m8Var = (m8) this.h;
                m8Var.s0 = m8Var.r.N0();
                View m10 = m8Var.r.m(m8Var.s0);
                m8Var.t0 = m10 == null ? 0 : m10.getTop();
                m8Var.h = true;
                m8Var.setAllowNestedScroll(false);
                m8Var.s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.b0 = true;
                pkVar.G.setVisibility(8);
                pkVar.b.w1(pkVar.F.getSearchField(), true);
                break;
            case 6:
                ul ulVar = (ul) this.h;
                ulVar.l0 = true;
                ulVar.b.w1(ulVar.E.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                ((fu) this.h).f = true;
                break;
            case 9:
                sv svVar = (sv) this.h;
                svVar.a.getActionBar().y("");
                svVar.b.getActionBar().y("");
                svVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 12:
                ((nd0) this.h).r0 = true;
                break;
            case 13:
                ((fi0) this.h).a.y = true;
                break;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.a.getActionBar().y("");
                mr0Var.b.getActionBar().y("");
                mr0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                o91 o91Var = (o91) this.h;
                o91Var.a.a(true, true);
                o91Var.h.I("");
                o91Var.o0(false, true);
                o91Var.c.W2.N(false);
                break;
            case 18:
                lg1 lg1Var = (lg1) this.h;
                lg1.b0(lg1Var, true);
                hg1 hg1Var = lg1Var.r0;
                if (!hg1Var.b0.equals("")) {
                    hg1Var.K(hg1Var.e[0], hg1Var.getCurrentPosition(), "", false);
                }
                lg1Var.r0.setAlpha(0.0f);
                lg1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void o(hg.p0 p0Var) {
        switch (this.f) {
            case 5:
                pk pkVar = (pk) this.h;
                ok okVar = pkVar.y;
                okVar.R.remove(p0Var);
                okVar.Y(pkVar.F.getSearchField().getText().toString(), false);
                okVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void p(g2 g2Var) {
        switch (this.f) {
            case 1:
                ac acVar = (ac) this.h;
                acVar.U = true;
                acVar.v0 = g2Var.getText().toString();
                acVar.U0(true);
                break;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.a.getActionBar().x();
                mr0Var.b.getActionBar().x();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void q(EditText editText) {
        mm0 mm0Var;
        bi.o0 o0Var;
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.a.W2.N(true);
                e2Var.a.u0(0);
                break;
            case 2:
                aq aqVar = (aq) this.h;
                if (aqVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = aqVar.b) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        zp zpVar = aqVar.e;
                        if (adapter != zpVar) {
                            aqVar.b.setAdapter(zpVar);
                            View view = aqVar.fragmentView;
                            int i10 = g6.d6;
                            view.setBackgroundColor(g6.x0(null, i10, false));
                            aqVar.fragmentView.setTag(Integer.valueOf(i10));
                            aqVar.e.l();
                            aqVar.b.setFastScrollVisible(false);
                            aqVar.b.setVerticalScrollBarEnabled(true);
                            aqVar.d.b();
                        }
                    }
                    aqVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                yr yrVar = (yr) this.h;
                if (yrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = yrVar.c.getAdapter() == null ? 0 : yrVar.c.getAdapter().h();
                    yrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (o0Var = yrVar.c) != null) {
                        s4.g0 adapter2 = o0Var.getAdapter();
                        ur urVar = yrVar.a;
                        if (adapter2 != urVar) {
                            bi.o0 o0Var2 = yrVar.c;
                            o0Var2.W1 = false;
                            o0Var2.X1 = 0;
                            o0Var2.setAdapter(urVar);
                            if (h == 0) {
                                yrVar.y0(0);
                            }
                        }
                    }
                    yrVar.D1.setVisibility(8);
                    yrVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                m8 m8Var = (m8) this.h;
                if (editText.length() > 0) {
                    m8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    m8Var.f = false;
                    m8Var.s.E(null);
                    break;
                }
            case 5:
                ((pk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                ul ulVar = (ul) this.h;
                ah.x xVar = ulVar.N;
                bi.o0 o0Var3 = ulVar.P;
                mm0 mm0Var2 = ulVar.Q;
                ol olVar = ulVar.R;
                if (olVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        ulVar.m0 = true;
                        ulVar.E.setShowSearchProgress(true);
                        o0Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != olVar) {
                            mm0Var2.setAdapter(olVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (olVar.s.size() == 0 && olVar.r.size() == 0) {
                            z10 = true;
                        }
                        ulVar.n0 = z10;
                        ulVar.i0();
                    } else {
                        o0Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
                        ulVar.v.setVisibility(8);
                    }
                    olVar.G(obj3, ulVar.r0);
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
                        mm0 mm0Var3 = contactsActivity.f;
                        if (mm0Var3 != null) {
                            mm0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        mm0 mm0Var4 = contactsActivity.f;
                        if (mm0Var4 != null) {
                            mm0Var4.setAdapter(contactsActivity.r);
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
                fu fuVar = (fu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    du duVar = fuVar.d;
                    duVar.getClass();
                    duVar.e = null;
                    fuVar.e = false;
                    fuVar.a.setAdapter(fuVar.c);
                    fuVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    du duVar2 = fuVar.d;
                    duVar2.getClass();
                    if (obj5 == null) {
                        duVar2.e = null;
                    } else {
                        try {
                            Timer timer = duVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        duVar2.d = timer2;
                        timer2.schedule(new hg.r1(duVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        fuVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                sv svVar = (sv) this.h;
                svVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                svVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                y70 y70Var = (y70) this.h;
                x70.E(y70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != y70Var.M) {
                    y70Var.M = z11;
                    mm0 mm0Var5 = y70Var.d;
                    if (mm0Var5 != null) {
                        mm0Var5.setAdapter(!isEmpty ? y70Var.f : y70Var.e);
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
                    mm0 mm0Var6 = languageSelectActivity.b;
                    if (mm0Var6 != null) {
                        mm0Var6.setAdapter(languageSelectActivity.c);
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
                nd0 nd0Var = (nd0) this.h;
                if (nd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        nd0Var.s0 = true;
                        nd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = nd0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        nd0Var.U.setVisibility(8);
                        nd0Var.S.setVisibility(8);
                        s4.g0 adapter3 = nd0Var.V.getAdapter();
                        gd0 gd0Var = nd0Var.W;
                        if (adapter3 != gd0Var) {
                            nd0Var.V.setAdapter(gd0Var);
                        }
                        nd0Var.V.setVisibility(0);
                        nd0Var.t0 = nd0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = nd0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        nd0Var.U.setVisibility(0);
                        nd0Var.S.setVisibility(0);
                        nd0Var.V.setAdapter(null);
                        nd0Var.V.setVisibility(8);
                    }
                    nd0Var.A0();
                    nd0Var.W.G(obj8, nd0Var.x0);
                    break;
                }
                break;
            case 13:
                ((fi0) this.h).a.j(editText.getText().toString());
                break;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                mr0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                l41 l41Var = (l41) this.h;
                if (obj9 == null) {
                    l41Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = l41Var.f;
                    if (arrayList == null) {
                        l41Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < l41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) l41Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            l41Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            l41Var.f.add(language);
                        }
                    }
                    l41Var.c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = l41Var.b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(l41Var.c);
                        break;
                    }
                } else if (l41Var.b != null) {
                    l41Var.d.setVisibility(8);
                    l41Var.b.setAdapter(l41Var.a);
                    break;
                }
                break;
            case 17:
                ((o91) this.h).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                hg1 hg1Var = ((lg1) this.h).r0;
                if (!hg1Var.b0.equals(obj10)) {
                    hg1Var.K(hg1Var.e[0], hg1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                xh1 xh1Var = (xh1) this.h;
                xh1Var.h = editText.getText().toString();
                b71 b71Var = xh1Var.a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
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

    private final void w(hg.p0 p0Var) {
    }
}
