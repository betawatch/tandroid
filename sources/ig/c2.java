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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b70;
import org.telegram.ui.c70;
import org.telegram.ui.cv;
import org.telegram.ui.fg1;
import org.telegram.ui.fr;
import org.telegram.ui.ic0;
import org.telegram.ui.jp;
import org.telegram.ui.jr;
import org.telegram.ui.kh0;
import org.telegram.ui.kp;
import org.telegram.ui.ot;
import org.telegram.ui.pc0;
import org.telegram.ui.pe1;
import org.telegram.ui.qq0;
import org.telegram.ui.qt;
import org.telegram.ui.t21;
import org.telegram.ui.te1;
import org.telegram.ui.xb;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ((qq0) this.s).finishFragment();
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
                return ProfileActivity.H0(profileActivity, profileActivity.X1);
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
                xb xbVar = (xb) this.s;
                xbVar.v0 = "";
                xbVar.I.setVisibility(0);
                if (xbVar.U) {
                    xbVar.U = false;
                    xbVar.U0(true);
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
                int i10 = h6.a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
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
                qt qtVar = (qt) this.s;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f = false;
                qtVar.e = false;
                qtVar.a.setAdapter(qtVar.c);
                qtVar.a.setFastScrollVisible(true);
                break;
            case 9:
                cv cvVar = (cv) this.s;
                cvVar.a.getActionBar().h(false);
                cvVar.b.getActionBar().h(false);
                break;
            case 10:
                c70 c70Var = (c70) this.s;
                if (c70Var.M) {
                    b70.E(c70Var.f, null);
                    c70Var.M = false;
                    c70Var.d.setAdapter(c70Var.e);
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
                pc0 pc0Var = (pc0) this.s;
                pc0Var.r0 = false;
                pc0Var.s0 = false;
                pc0Var.W.G(null, null);
                pc0Var.A0();
                if (pc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = pc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    pc0Var.U.setVisibility(0);
                    pc0Var.S.setVisibility(0);
                    pc0Var.V.setAdapter(null);
                    pc0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 13:
                xa0 xa0Var = ((kh0) this.s).a;
                xa0Var.y = false;
                xa0Var.j(null);
                break;
            case 16:
                t21 t21Var = (t21) this.s;
                t21Var.f = null;
                if (t21Var.b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.b.setAdapter(t21Var.a);
                    break;
                }
                break;
            case 17:
                z71 z71Var = (z71) this.s;
                z71Var.a.a(false, true);
                z71Var.o0(false, true);
                z71Var.c.W2.N(false);
                break;
            case 18:
                te1.b0((te1) this.s, false);
                break;
            case 19:
                fg1 fg1Var = (fg1) this.s;
                fg1Var.h = null;
                u61 u61Var = fg1Var.a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
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
                xb xbVar = (xb) this.s;
                xbVar.I.setVisibility(8);
                xbVar.getClass();
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
                ((qt) this.s).f = true;
                break;
            case 9:
                cv cvVar = (cv) this.s;
                cvVar.a.getActionBar().y("");
                cvVar.b.getActionBar().y("");
                cvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                ((LanguageSelectActivity) this.s).getClass();
                break;
            case 12:
                ((pc0) this.s).r0 = true;
                break;
            case 13:
                ((kh0) this.s).a.y = true;
                break;
            case 14:
                qq0 qq0Var = (qq0) this.s;
                qq0Var.a.getActionBar().y("");
                qq0Var.b.getActionBar().y("");
                qq0Var.c.getSearchField().requestFocus();
                break;
            case 17:
                z71 z71Var = (z71) this.s;
                z71Var.a.a(true, true);
                z71Var.h.I("");
                z71Var.o0(false, true);
                z71Var.c.W2.N(false);
                break;
            case 18:
                te1 te1Var = (te1) this.s;
                te1.b0(te1Var, true);
                pe1 pe1Var = te1Var.r0;
                if (!pe1Var.b0.equals("")) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), "", false);
                }
                te1Var.r0.setAlpha(0.0f);
                te1Var.r0.n0.e(true, false);
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
                xb xbVar = (xb) this.s;
                xbVar.U = true;
                xbVar.v0 = e2Var.getText().toString();
                xbVar.U0(true);
                break;
            case 14:
                qq0 qq0Var = (qq0) this.s;
                qq0Var.a.getActionBar().x();
                qq0Var.b.getActionBar().x();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void q(EditText editText) {
        im0 im0Var;
        ai.u1 u1Var;
        switch (this.r) {
            case 0:
                d2 d2Var = (d2) this.s;
                d2Var.e = editText.getText().toString();
                d2Var.a.W2.N(true);
                d2Var.a.u0(0);
                break;
            case 2:
                kp kpVar = (kp) this.s;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (im0Var = kpVar.b) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = h6.d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
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
                ah.x xVar = rlVar.N;
                ai.u1 u1Var3 = rlVar.P;
                im0 im0Var2 = rlVar.Q;
                ll llVar = rlVar.R;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        rlVar.m0 = true;
                        rlVar.E.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (im0Var2.getAdapter() != llVar) {
                            im0Var2.setAdapter(llVar);
                        }
                        im0Var2.setVisibility(0);
                        if (llVar.s.size() == 0 && llVar.r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.n0 = z10;
                        rlVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        im0Var2.setAdapter(null);
                        im0Var2.setVisibility(8);
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
                        im0 im0Var3 = contactsActivity.f;
                        if (im0Var3 != null) {
                            im0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        im0 im0Var4 = contactsActivity.f;
                        if (im0Var4 != null) {
                            im0Var4.setAdapter(contactsActivity.r);
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
                qt qtVar = (qt) this.s;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        otVar2.d = timer2;
                        timer2.schedule(new hg.r1(otVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        qtVar.e = true;
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
                c70 c70Var = (c70) this.s;
                b70.E(c70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.M) {
                    c70Var.M = z11;
                    im0 im0Var5 = c70Var.d;
                    if (im0Var5 != null) {
                        im0Var5.setAdapter(!isEmpty ? c70Var.f : c70Var.e);
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
                    im0 im0Var6 = languageSelectActivity.b;
                    if (im0Var6 != null) {
                        im0Var6.setAdapter(languageSelectActivity.c);
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
                pc0 pc0Var = (pc0) this.s;
                if (pc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        pc0Var.s0 = true;
                        pc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = pc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        pc0Var.U.setVisibility(8);
                        pc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = pc0Var.V.getAdapter();
                        ic0 ic0Var = pc0Var.W;
                        if (adapter3 != ic0Var) {
                            pc0Var.V.setAdapter(ic0Var);
                        }
                        pc0Var.V.setVisibility(0);
                        pc0Var.t0 = pc0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = pc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        pc0Var.U.setVisibility(0);
                        pc0Var.S.setVisibility(0);
                        pc0Var.V.setAdapter(null);
                        pc0Var.V.setVisibility(8);
                    }
                    pc0Var.A0();
                    pc0Var.W.G(obj8, pc0Var.x0);
                    break;
                }
                break;
            case 13:
                ((kh0) this.s).a.j(editText.getText().toString());
                break;
            case 14:
                qq0 qq0Var = (qq0) this.s;
                qq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                qq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 15:
                ((ProfileActivity) this.s).e.I(editText.getText().toString().toLowerCase());
                break;
            case 16:
                String obj9 = editText.getText().toString();
                t21 t21Var = (t21) this.s;
                if (obj9 == null) {
                    t21Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t21Var.f;
                    if (arrayList == null) {
                        t21Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t21Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            t21Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            t21Var.f.add(language);
                        }
                    }
                    t21Var.c.l();
                }
                if (obj9.length() != 0) {
                    im0 im0Var7 = t21Var.b;
                    if (im0Var7 != null) {
                        im0Var7.setAdapter(t21Var.c);
                        break;
                    }
                } else if (t21Var.b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.b.setAdapter(t21Var.a);
                    break;
                }
                break;
            case 17:
                ((z71) this.s).h.I(editText.getText().toString());
                break;
            case 18:
                String obj10 = editText.getText().toString();
                pe1 pe1Var = ((te1) this.s).r0;
                if (!pe1Var.b0.equals(obj10)) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 19:
                fg1 fg1Var = (fg1) this.s;
                fg1Var.h = editText.getText().toString();
                u61 u61Var = fg1Var.a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
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
