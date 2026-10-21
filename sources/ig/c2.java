package ig;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a70;
import org.telegram.ui.av;
import org.telegram.ui.dg1;
import org.telegram.ui.dr;
import org.telegram.ui.gc0;
import org.telegram.ui.hp;
import org.telegram.ui.hr;
import org.telegram.ui.ip;
import org.telegram.ui.jh0;
import org.telegram.ui.mt;
import org.telegram.ui.nc0;
import org.telegram.ui.ne1;
import org.telegram.ui.oq0;
import org.telegram.ui.ot;
import org.telegram.ui.r21;
import org.telegram.ui.re1;
import org.telegram.ui.vb;
import org.telegram.ui.x71;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class c2 extends g5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ c2(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public boolean b() {
        switch (this.r) {
            case 14:
                ((oq0) this.s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public Animator g() {
        switch (this.r) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.s;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                    u0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.e);
                }
                if (profileActivity.X1) {
                    profileActivity.V0.getSearchField().setText("");
                }
                return ProfileActivity.I0(profileActivity, profileActivity.X1);
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void m() {
        switch (this.r) {
            case 0:
                d2 d2Var = (d2) this.s;
                d2Var.d = false;
                d2Var.e = null;
                d2Var.a.W2.N(true);
                d2Var.a.u0(0);
                break;
            case 1:
                vb vbVar = (vb) this.s;
                vbVar.v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    break;
                }
                break;
            case 2:
                ip ipVar = (ip) this.s;
                ipVar.e.F(null);
                ipVar.N = false;
                ipVar.getClass();
                ipVar.b.setAdapter(ipVar.a);
                ipVar.a.l();
                ipVar.b.setFastScrollVisible(true);
                ipVar.b.setVerticalScrollBarEnabled(false);
                ipVar.d.setShowAtCenter(false);
                View view = ipVar.fragmentView;
                int i10 = h6.a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                ipVar.fragmentView.setTag(Integer.valueOf(i10));
                ipVar.d.b();
                break;
            case 3:
                hr hrVar = (hr) this.s;
                hrVar.e.F(null);
                hrVar.o1 = false;
                ai.u1 u1Var = hrVar.c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(hrVar.a);
                hrVar.a.l();
                hrVar.c.setFastScrollVisible(true);
                hrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = hrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.s;
                if (k8Var.h) {
                    k8Var.f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                nk nkVar = (nk) this.s;
                nkVar.b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.r;
                s4.g0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.y.Y(null, true);
                break;
            case 6:
                rl rlVar = (rl) this.s;
                rlVar.l0 = false;
                rlVar.m0 = false;
                rlVar.R.G(null, null);
                rlVar.i0();
                rlVar.P.setVisibility(0);
                rlVar.N.setVisibility(0);
                rlVar.Q.setVisibility(8);
                rlVar.v.setVisibility(8);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.s;
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
                ot otVar = (ot) this.s;
                mt mtVar = otVar.d;
                mtVar.getClass();
                mtVar.e = null;
                otVar.f = false;
                otVar.e = false;
                otVar.a.setAdapter(otVar.c);
                otVar.a.setFastScrollVisible(true);
                break;
            case 9:
                av avVar = (av) this.s;
                avVar.a.getActionBar().h(false);
                avVar.b.getActionBar().h(false);
                break;
            case 10:
                a70 a70Var = (a70) this.s;
                if (a70Var.M) {
                    z60.E(a70Var.f, null);
                    a70Var.M = false;
                    a70Var.d.setAdapter(a70Var.e);
                    break;
                }
                break;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.s;
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
                nc0 nc0Var = (nc0) this.s;
                nc0Var.r0 = false;
                nc0Var.s0 = false;
                nc0Var.W.G(null, null);
                nc0Var.A0();
                if (nc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = nc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    nc0Var.U.setVisibility(0);
                    nc0Var.S.setVisibility(0);
                    nc0Var.V.setAdapter(null);
                    nc0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                xa0 xa0Var = ((jh0) this.s).a;
                xa0Var.y = false;
                xa0Var.j(null);
                break;
            case 16:
                r21 r21Var = (r21) this.s;
                r21Var.f = null;
                if (r21Var.b != null) {
                    r21Var.d.setVisibility(8);
                    r21Var.b.setAdapter(r21Var.a);
                    break;
                }
                break;
            case 17:
                x71 x71Var = (x71) this.s;
                x71Var.a.a(false, true);
                x71Var.o0(false, true);
                x71Var.c.W2.N(false);
                break;
            case 18:
                re1.b0((re1) this.s, false);
                break;
            case 19:
                dg1 dg1Var = (dg1) this.s;
                dg1Var.h = null;
                w61 w61Var = dg1Var.a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void n() {
        switch (this.r) {
            case 0:
                d2 d2Var = (d2) this.s;
                d2Var.d = true;
                d2Var.a.W2.N(true);
                d2Var.a.u0(0);
                break;
            case 1:
                vb vbVar = (vb) this.s;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                break;
            case 2:
                ip ipVar = (ip) this.s;
                ipVar.N = true;
                ipVar.d.setShowAtCenter(true);
                break;
            case 3:
                hr hrVar = (hr) this.s;
                hrVar.o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = hrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.s;
                k8Var.s0 = k8Var.r.N0();
                View m10 = k8Var.r.m(k8Var.s0);
                k8Var.t0 = m10 == null ? 0 : m10.getTop();
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                nk nkVar = (nk) this.s;
                nkVar.b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.b.w1(nkVar.F.getSearchField(), true);
                break;
            case 6:
                rl rlVar = (rl) this.s;
                rlVar.l0 = true;
                rlVar.b.w1(rlVar.E.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.s;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 8:
                ((ot) this.s).f = true;
                break;
            case 9:
                av avVar = (av) this.s;
                avVar.a.getActionBar().y("");
                avVar.b.getActionBar().y("");
                avVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.s).getClass();
                break;
            case 12:
                ((nc0) this.s).r0 = true;
                break;
            case 13:
                ((jh0) this.s).a.y = true;
                break;
            case 14:
                oq0 oq0Var = (oq0) this.s;
                oq0Var.a.getActionBar().y("");
                oq0Var.b.getActionBar().y("");
                oq0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                x71 x71Var = (x71) this.s;
                x71Var.a.a(true, true);
                x71Var.h.I("");
                x71Var.o0(false, true);
                x71Var.c.W2.N(false);
                break;
            case 18:
                re1 re1Var = (re1) this.s;
                re1.b0(re1Var, true);
                ne1 ne1Var = re1Var.r0;
                if (!ne1Var.b0.equals("")) {
                    ne1Var.K(ne1Var.e[0], ne1Var.getCurrentPosition(), "", false);
                }
                re1Var.r0.setAlpha(0.0f);
                re1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void o(hg.o0 o0Var) {
        switch (this.r) {
            case 5:
                nk nkVar = (nk) this.s;
                mk mkVar = nkVar.y;
                mkVar.R.remove(o0Var);
                mkVar.Y(nkVar.F.getSearchField().getText().toString(), false);
                mkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void p(ei.e2 e2Var) {
        switch (this.r) {
            case 1:
                vb vbVar = (vb) this.s;
                vbVar.U = true;
                vbVar.v0 = e2Var.getText().toString();
                vbVar.U0(true);
                break;
            case 14:
                oq0 oq0Var = (oq0) this.s;
                oq0Var.a.getActionBar().x();
                oq0Var.b.getActionBar().x();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void q(EditText editText) {
        jm0 jm0Var;
        ai.u1 u1Var;
        switch (this.r) {
            case 0:
                d2 d2Var = (d2) this.s;
                d2Var.e = editText.getText().toString();
                d2Var.a.W2.N(true);
                d2Var.a.u0(0);
                break;
            case 2:
                ip ipVar = (ip) this.s;
                if (ipVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (jm0Var = ipVar.b) != null) {
                        s4.g0 adapter = jm0Var.getAdapter();
                        hp hpVar = ipVar.e;
                        if (adapter != hpVar) {
                            ipVar.b.setAdapter(hpVar);
                            View view = ipVar.fragmentView;
                            int i10 = h6.d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            ipVar.fragmentView.setTag(Integer.valueOf(i10));
                            ipVar.e.l();
                            ipVar.b.setFastScrollVisible(false);
                            ipVar.b.setVerticalScrollBarEnabled(true);
                            ipVar.d.b();
                        }
                    }
                    ipVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                hr hrVar = (hr) this.s;
                if (hrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = hrVar.c.getAdapter() == null ? 0 : hrVar.c.getAdapter().h();
                    hrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = hrVar.c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        dr drVar = hrVar.a;
                        if (adapter2 != drVar) {
                            ai.u1 u1Var2 = hrVar.c;
                            u1Var2.W1 = false;
                            u1Var2.X1 = 0;
                            u1Var2.setAdapter(drVar);
                            if (h == 0) {
                                hrVar.y0(0);
                            }
                        }
                    }
                    hrVar.D1.setVisibility(8);
                    hrVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.s;
                if (editText.length() > 0) {
                    k8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    k8Var.f = false;
                    k8Var.s.E(null);
                    break;
                }
            case 5:
                ((nk) this.s).y.Y(editText.getText().toString(), false);
                break;
            case 6:
                rl rlVar = (rl) this.s;
                ah.x xVar = rlVar.N;
                ai.u1 u1Var3 = rlVar.P;
                jm0 jm0Var2 = rlVar.Q;
                ll llVar = rlVar.R;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        rlVar.m0 = true;
                        rlVar.E.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (jm0Var2.getAdapter() != llVar) {
                            jm0Var2.setAdapter(llVar);
                        }
                        jm0Var2.setVisibility(0);
                        if (llVar.s.size() == 0 && llVar.r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.n0 = z10;
                        rlVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        jm0Var2.setAdapter(null);
                        jm0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.r0);
                    break;
                }
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.s;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.i0 = obj4;
                    if (obj4.isEmpty()) {
                        jm0 jm0Var3 = contactsActivity.f;
                        if (jm0Var3 != null) {
                            jm0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        jm0 jm0Var4 = contactsActivity.f;
                        if (jm0Var4 != null) {
                            jm0Var4.setAdapter(contactsActivity.r);
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
                ot otVar = (ot) this.s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    mt mtVar = otVar.d;
                    mtVar.getClass();
                    mtVar.e = null;
                    otVar.e = false;
                    otVar.a.setAdapter(otVar.c);
                    otVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    mt mtVar2 = otVar.d;
                    mtVar2.getClass();
                    if (obj5 == null) {
                        mtVar2.e = null;
                    } else {
                        try {
                            Timer timer = mtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        mtVar2.d = timer2;
                        timer2.schedule(new hg.r1(mtVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        otVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                av avVar = (av) this.s;
                avVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                avVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                a70 a70Var = (a70) this.s;
                z60.E(a70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != a70Var.M) {
                    a70Var.M = z11;
                    jm0 jm0Var5 = a70Var.d;
                    if (jm0Var5 != null) {
                        jm0Var5.setAdapter(!isEmpty ? a70Var.f : a70Var.e);
                        break;
                    }
                }
                break;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.s;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    jm0 jm0Var6 = languageSelectActivity.b;
                    if (jm0Var6 != null) {
                        jm0Var6.setAdapter(languageSelectActivity.c);
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
                nc0 nc0Var = (nc0) this.s;
                if (nc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        nc0Var.s0 = true;
                        nc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = nc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        nc0Var.U.setVisibility(8);
                        nc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = nc0Var.V.getAdapter();
                        gc0 gc0Var = nc0Var.W;
                        if (adapter3 != gc0Var) {
                            nc0Var.V.setAdapter(gc0Var);
                        }
                        nc0Var.V.setVisibility(0);
                        nc0Var.t0 = nc0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = nc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        nc0Var.U.setVisibility(0);
                        nc0Var.S.setVisibility(0);
                        nc0Var.V.setAdapter(null);
                        nc0Var.V.setVisibility(8);
                    }
                    nc0Var.A0();
                    nc0Var.W.G(obj8, nc0Var.x0);
                    break;
                }
                break;
            case 13:
                ((jh0) this.s).a.j(editText.getText().toString());
                break;
            case 14:
                oq0 oq0Var = (oq0) this.s;
                oq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                oq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.s).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                r21 r21Var = (r21) this.s;
                if (obj9 == null) {
                    r21Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = r21Var.f;
                    if (arrayList == null) {
                        r21Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < r21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) r21Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            r21Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            r21Var.f.add(language);
                        }
                    }
                    r21Var.c.l();
                }
                if (obj9.length() != 0) {
                    jm0 jm0Var7 = r21Var.b;
                    if (jm0Var7 != null) {
                        jm0Var7.setAdapter(r21Var.c);
                        break;
                    }
                } else if (r21Var.b != null) {
                    r21Var.d.setVisibility(8);
                    r21Var.b.setAdapter(r21Var.a);
                    break;
                }
                break;
            case 17:
                ((x71) this.s).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                ne1 ne1Var = ((re1) this.s).r0;
                if (!ne1Var.b0.equals(obj10)) {
                    ne1Var.K(ne1Var.e[0], ne1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                dg1 dg1Var = (dg1) this.s;
                dg1Var.h = editText.getText().toString();
                w61 w61Var = dg1Var.a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    break;
                }
                break;
        }
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z(hg.o0 o0Var) {
    }
}
