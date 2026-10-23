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
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c81;
import org.telegram.ui.cv;
import org.telegram.ui.d70;
import org.telegram.ui.e70;
import org.telegram.ui.fr;
import org.telegram.ui.jg1;
import org.telegram.ui.jp;
import org.telegram.ui.jr;
import org.telegram.ui.kp;
import org.telegram.ui.lc0;
import org.telegram.ui.nh0;
import org.telegram.ui.pt;
import org.telegram.ui.rq0;
import org.telegram.ui.rt;
import org.telegram.ui.sc0;
import org.telegram.ui.te1;
import org.telegram.ui.v21;
import org.telegram.ui.vb;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b2 extends k5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ b2(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean b() {
        switch (this.r) {
            case 14:
                ((rq0) this.s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public Animator h() {
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
                return ProfileActivity.H0(profileActivity, profileActivity.X1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public void m() {
        switch (this.r) {
            case 0:
                c2 c2Var = (c2) this.s;
                c2Var.d = false;
                c2Var.e = null;
                c2Var.a.Z2.N(true);
                c2Var.a.u0(0);
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
                kp kpVar = (kp) this.s;
                kpVar.e.F(null);
                kpVar.N = false;
                kpVar.getClass();
                kpVar.b.setAdapter(kpVar.a);
                kpVar.a.l();
                kpVar.b.setFastScrollVisible(true);
                kpVar.b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = k6.a7;
                r6.i(i10, view, null);
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                break;
            case 3:
                jr jrVar = (jr) this.s;
                jrVar.e.F(null);
                jrVar.o1 = false;
                ai.u1 u1Var = jrVar.c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(jrVar.a);
                jrVar.a.l();
                jrVar.c.setFastScrollVisible(true);
                jrVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
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
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.j0;
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
                rlVar.j0 = false;
                rlVar.k0 = false;
                rlVar.P.G(null, null);
                rlVar.j0();
                rlVar.N.setVisibility(0);
                rlVar.L.setVisibility(0);
                rlVar.O.setVisibility(8);
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
                ContactsActivity.d0(contactsActivity);
                break;
            case 8:
                rt rtVar = (rt) this.s;
                pt ptVar = rtVar.d;
                ptVar.getClass();
                ptVar.e = null;
                rtVar.f = false;
                rtVar.e = false;
                rtVar.a.setAdapter(rtVar.c);
                rtVar.a.setFastScrollVisible(true);
                break;
            case 9:
                cv cvVar = (cv) this.s;
                cvVar.a.getActionBar().g(false);
                cvVar.b.getActionBar().g(false);
                break;
            case 10:
                e70 e70Var = (e70) this.s;
                if (e70Var.M) {
                    d70.E(e70Var.f, null);
                    e70Var.M = false;
                    e70Var.d.setAdapter(e70Var.e);
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
                sc0 sc0Var = (sc0) this.s;
                sc0Var.r0 = false;
                sc0Var.s0 = false;
                sc0Var.W.G(null, null);
                sc0Var.B0();
                if (sc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = sc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    sc0Var.U.setVisibility(0);
                    sc0Var.S.setVisibility(0);
                    sc0Var.V.setAdapter(null);
                    sc0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                ya0 ya0Var = ((nh0) this.s).a;
                ya0Var.y = false;
                ya0Var.j(null);
                break;
            case 16:
                v21 v21Var = (v21) this.s;
                v21Var.f = null;
                if (v21Var.b != null) {
                    v21Var.d.setVisibility(8);
                    v21Var.b.setAdapter(v21Var.a);
                    break;
                }
                break;
            case 17:
                c81 c81Var = (c81) this.s;
                c81Var.a.a(false, true);
                c81Var.q0(false, true);
                c81Var.c.Z2.N(false);
                break;
            case 18:
                ye1.a0((ye1) this.s, false);
                break;
            case 19:
                jg1 jg1Var = (jg1) this.s;
                jg1Var.h = null;
                d71 d71Var = jg1Var.a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public void n() {
        switch (this.r) {
            case 0:
                c2 c2Var = (c2) this.s;
                c2Var.d = true;
                c2Var.a.Z2.N(true);
                c2Var.a.u0(0);
                break;
            case 1:
                vb vbVar = (vb) this.s;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                break;
            case 2:
                kp kpVar = (kp) this.s;
                kpVar.N = true;
                kpVar.d.setShowAtCenter(true);
                break;
            case 3:
                jr jrVar = (jr) this.s;
                jrVar.o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.s;
                k8Var.r0 = k8Var.r.N0();
                View m10 = k8Var.r.m(k8Var.r0);
                k8Var.s0 = m10 == null ? 0 : m10.getTop();
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.j0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    break;
                }
                break;
            case 5:
                nk nkVar = (nk) this.s;
                nkVar.b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.b.z1(nkVar.F.getSearchField(), true);
                break;
            case 6:
                rl rlVar = (rl) this.s;
                rlVar.j0 = true;
                rlVar.b.z1(rlVar.x.getSearchField(), true);
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.s;
                contactsActivity.F = true;
                ContactsActivity.d0(contactsActivity);
                break;
            case 8:
                ((rt) this.s).f = true;
                break;
            case 9:
                cv cvVar = (cv) this.s;
                cvVar.a.getActionBar().x("");
                cvVar.b.getActionBar().x("");
                cvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.s).getClass();
                break;
            case 12:
                ((sc0) this.s).r0 = true;
                break;
            case 13:
                ((nh0) this.s).a.y = true;
                break;
            case 14:
                rq0 rq0Var = (rq0) this.s;
                rq0Var.a.getActionBar().x("");
                rq0Var.b.getActionBar().x("");
                rq0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                c81 c81Var = (c81) this.s;
                c81Var.a.a(true, true);
                c81Var.h.I("");
                c81Var.q0(false, true);
                c81Var.c.Z2.N(false);
                break;
            case 18:
                ye1 ye1Var = (ye1) this.s;
                ye1.a0(ye1Var, true);
                te1 te1Var = ye1Var.r0;
                if (!te1Var.b0.equals("")) {
                    te1Var.K(te1Var.e[0], te1Var.getCurrentPosition(), "", false);
                }
                ye1Var.r0.setAlpha(0.0f);
                ye1Var.r0.n0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
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

    @Override // org.telegram.ui.ActionBar.k5
    public void p(ei.e2 e2Var) {
        switch (this.r) {
            case 1:
                vb vbVar = (vb) this.s;
                vbVar.U = true;
                vbVar.v0 = e2Var.getText().toString();
                vbVar.U0(true);
                break;
            case 14:
                rq0 rq0Var = (rq0) this.s;
                rq0Var.a.getActionBar().w();
                rq0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public void q(EditText editText) {
        mm0 mm0Var;
        ai.u1 u1Var;
        switch (this.r) {
            case 0:
                c2 c2Var = (c2) this.s;
                c2Var.e = editText.getText().toString();
                c2Var.a.Z2.N(true);
                c2Var.a.u0(0);
                break;
            case 2:
                kp kpVar = (kp) this.s;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = kpVar.b) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = k6.d6;
                            r6.i(i10, view, null);
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.e.l();
                            kpVar.b.setFastScrollVisible(false);
                            kpVar.b.setVerticalScrollBarEnabled(true);
                            kpVar.d.b();
                        }
                    }
                    kpVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                jr jrVar = (jr) this.s;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = jrVar.c.getAdapter() == null ? 0 : jrVar.c.getAdapter().h();
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = jrVar.c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        fr frVar = jrVar.a;
                        if (adapter2 != frVar) {
                            ai.u1 u1Var2 = jrVar.c;
                            u1Var2.W1 = false;
                            u1Var2.X1 = 0;
                            u1Var2.setAdapter(frVar);
                            if (h == 0) {
                                jrVar.y0(0);
                            }
                        }
                    }
                    jrVar.D1.setVisibility(8);
                    jrVar.C1.setVisibility(0);
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
                ah.x xVar = rlVar.L;
                ai.u1 u1Var3 = rlVar.N;
                mm0 mm0Var2 = rlVar.O;
                ll llVar = rlVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        rlVar.k0 = true;
                        rlVar.x.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != llVar) {
                            mm0Var2.setAdapter(llVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (llVar.s.size() == 0 && llVar.r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.l0 = z10;
                        rlVar.j0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.p0);
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
                rt rtVar = (rt) this.s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    pt ptVar = rtVar.d;
                    ptVar.getClass();
                    ptVar.e = null;
                    rtVar.e = false;
                    rtVar.a.setAdapter(rtVar.c);
                    rtVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    pt ptVar2 = rtVar.d;
                    ptVar2.getClass();
                    if (obj5 == null) {
                        ptVar2.e = null;
                    } else {
                        try {
                            Timer timer = ptVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        ptVar2.d = timer2;
                        timer2.schedule(new hg.r1(ptVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        rtVar.e = true;
                        break;
                    }
                }
                break;
            case 9:
                cv cvVar = (cv) this.s;
                cvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 10:
                String obj6 = editText.getText().toString();
                e70 e70Var = (e70) this.s;
                d70.E(e70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != e70Var.M) {
                    e70Var.M = z11;
                    mm0 mm0Var5 = e70Var.d;
                    if (mm0Var5 != null) {
                        mm0Var5.setAdapter(!isEmpty ? e70Var.f : e70Var.e);
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
                sc0 sc0Var = (sc0) this.s;
                if (sc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        sc0Var.s0 = true;
                        sc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = sc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        sc0Var.U.setVisibility(8);
                        sc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = sc0Var.V.getAdapter();
                        lc0 lc0Var = sc0Var.W;
                        if (adapter3 != lc0Var) {
                            sc0Var.V.setAdapter(lc0Var);
                        }
                        sc0Var.V.setVisibility(0);
                        sc0Var.t0 = sc0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = sc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        sc0Var.U.setVisibility(0);
                        sc0Var.S.setVisibility(0);
                        sc0Var.V.setAdapter(null);
                        sc0Var.V.setVisibility(8);
                    }
                    sc0Var.B0();
                    sc0Var.W.G(obj8, sc0Var.x0);
                    break;
                }
                break;
            case 13:
                ((nh0) this.s).a.j(editText.getText().toString());
                break;
            case 14:
                rq0 rq0Var = (rq0) this.s;
                rq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                rq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.s).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                v21 v21Var = (v21) this.s;
                if (obj9 == null) {
                    v21Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = v21Var.f;
                    if (arrayList == null) {
                        v21Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < v21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) v21Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            v21Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            v21Var.f.add(language);
                        }
                    }
                    v21Var.c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = v21Var.b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(v21Var.c);
                        break;
                    }
                } else if (v21Var.b != null) {
                    v21Var.d.setVisibility(8);
                    v21Var.b.setAdapter(v21Var.a);
                    break;
                }
                break;
            case 17:
                ((c81) this.s).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                te1 te1Var = ((ye1) this.s).r0;
                if (!te1Var.b0.equals(obj10)) {
                    te1Var.K(te1Var.e[0], te1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                jg1 jg1Var = (jg1) this.s;
                jg1Var.h = editText.getText().toString();
                d71 d71Var = jg1Var.a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
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
