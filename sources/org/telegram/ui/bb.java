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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bb extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ bb(Object obj, int i10) {
        this.f = i10;
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
                return ProfileActivity.H0(profileActivity, profileActivity.S1);
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void m() {
        switch (this.f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.v0 = "";
                obVar.I.setVisibility(0);
                if (obVar.U) {
                    obVar.U = false;
                    obVar.V0(true);
                    break;
                }
                break;
            case 1:
                kp kpVar = (kp) this.h;
                kpVar.e.F(null);
                kpVar.J = false;
                kpVar.getClass();
                kpVar.b.setAdapter(kpVar.a);
                kpVar.a.l();
                kpVar.b.setFastScrollVisible(true);
                kpVar.b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.g6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                break;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.e.F(null);
                jrVar.k1 = false;
                jh.e1 e1Var = jrVar.c;
                e1Var.U1 = false;
                e1Var.V1 = 0;
                e1Var.setAdapter(jrVar.a);
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
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                if (g8Var.h) {
                    g8Var.f = false;
                    g8Var.h = false;
                    g8Var.setAllowNestedScroll(true);
                    g8Var.s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.g0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.U = false;
                jkVar.C.setVisibility(0);
                org.telegram.ui.Components.xj xjVar = jkVar.r;
                f2.p0 adapter = xjVar.getAdapter();
                org.telegram.ui.Components.bk bkVar = jkVar.v;
                if (adapter != bkVar) {
                    xjVar.setAdapter(bkVar);
                }
                bkVar.l();
                jkVar.y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                blVar.h0 = false;
                blVar.i0 = false;
                blVar.N.G(null, null);
                blVar.f0();
                blVar.L.setVisibility(0);
                blVar.J.setVisibility(0);
                blVar.M.setVisibility(8);
                blVar.v.setVisibility(8);
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
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                rt rtVar = (rt) this.h;
                pt ptVar = rtVar.d;
                ptVar.getClass();
                ptVar.e = null;
                rtVar.f = false;
                rtVar.e = false;
                rtVar.a.setAdapter(rtVar.c);
                rtVar.a.setFastScrollVisible(true);
                break;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.a.getActionBar().h(false);
                cvVar.b.getActionBar().h(false);
                break;
            case 9:
                c70 c70Var = (c70) this.h;
                if (c70Var.I) {
                    b70.E(c70Var.f, null);
                    c70Var.I = false;
                    c70Var.d.setAdapter(c70Var.e);
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
                rc0 rc0Var = (rc0) this.h;
                rc0Var.n0 = false;
                rc0Var.o0 = false;
                rc0Var.S.G(null, null);
                rc0Var.B0();
                if (rc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = rc0Var.V;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    rc0Var.Q.setVisibility(0);
                    rc0Var.O.setVisibility(0);
                    rc0Var.R.setAdapter(null);
                    rc0Var.R.setVisibility(8);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.z90 z90Var = ((ih0) this.h).a;
                z90Var.y = false;
                z90Var.j(null);
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
                b81 b81Var = (b81) this.h;
                b81Var.a.a(false, true);
                b81Var.o0(false, true);
                b81Var.c.U2.N(false);
                break;
            case 17:
                ze1.b0((ze1) this.h, false);
                break;
            case 18:
                kg1 kg1Var = (kg1) this.h;
                kg1Var.h = null;
                org.telegram.ui.Components.o51 o51Var = kg1Var.a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.d = false;
                u1Var.e = null;
                u1Var.a.U2.N(true);
                u1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void n() {
        switch (this.f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.I.setVisibility(8);
                obVar.getClass();
                break;
            case 1:
                kp kpVar = (kp) this.h;
                kpVar.J = true;
                kpVar.d.setShowAtCenter(true);
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
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                g8Var.o0 = g8Var.r.N0();
                View m10 = g8Var.r.m(g8Var.o0);
                g8Var.p0 = m10 == null ? 0 : m10.getTop();
                g8Var.h = true;
                g8Var.setAllowNestedScroll(false);
                g8Var.s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.g0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.U = true;
                jkVar.C.setVisibility(8);
                jkVar.b.t1(jkVar.B.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                blVar.h0 = true;
                blVar.b.t1(blVar.A.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                ((rt) this.h).f = true;
                break;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.a.getActionBar().x("");
                cvVar.b.getActionBar().x("");
                cvVar.c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((rc0) this.h).n0 = true;
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
                b81 b81Var = (b81) this.h;
                b81Var.a.a(true, true);
                b81Var.h.I("");
                b81Var.o0(false, true);
                b81Var.c.U2.N(false);
                break;
            case 17:
                ze1 ze1Var = (ze1) this.h;
                ze1.b0(ze1Var, true);
                ve1 ve1Var = ze1Var.n0;
                if (!ve1Var.U.equals("")) {
                    ve1Var.K(ve1Var.e[0], ve1Var.getCurrentPosition(), "", false);
                }
                ze1Var.n0.setAlpha(0.0f);
                ze1Var.n0.j0.e(true, false);
                break;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.d = true;
                u1Var.a.U2.N(true);
                u1Var.a.u0(0);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void o(rf.f0 f0Var) {
        switch (this.f) {
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                org.telegram.ui.Components.ik ikVar = jkVar.y;
                ikVar.N.remove(f0Var);
                ikVar.Y(jkVar.B.getSearchField().getText().toString(), false);
                ikVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void p(ig.f fVar) {
        switch (this.f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.U = true;
                obVar.v0 = fVar.getText().toString();
                obVar.V0(true);
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
        org.telegram.ui.Components.jl0 jl0Var;
        jh.e1 e1Var;
        switch (this.f) {
            case 1:
                kp kpVar = (kp) this.h;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (jl0Var = kpVar.b) != null) {
                        f2.p0 adapter = jl0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.g6.d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
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
            case 2:
                jr jrVar = (jr) this.h;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = jrVar.c.getAdapter() == null ? 0 : jrVar.c.getAdapter().h();
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = jrVar.c) != null) {
                        f2.p0 adapter2 = e1Var.getAdapter();
                        fr frVar = jrVar.a;
                        if (adapter2 != frVar) {
                            jh.e1 e1Var2 = jrVar.c;
                            e1Var2.U1 = false;
                            e1Var2.V1 = 0;
                            e1Var2.setAdapter(frVar);
                            if (h == 0) {
                                jrVar.y0(0);
                            }
                        }
                    }
                    jrVar.z1.setVisibility(8);
                    jrVar.y1.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                if (editText.length() > 0) {
                    g8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    g8Var.f = false;
                    g8Var.s.E(null);
                    break;
                }
            case 4:
                ((org.telegram.ui.Components.jk) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                bg.x2 x2Var = blVar.J;
                jh.e1 e1Var3 = blVar.L;
                org.telegram.ui.Components.jl0 jl0Var2 = blVar.M;
                org.telegram.ui.Components.vk vkVar = blVar.N;
                if (vkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        blVar.i0 = true;
                        blVar.A.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        x2Var.setVisibility(8);
                        if (jl0Var2.getAdapter() != vkVar) {
                            jl0Var2.setAdapter(vkVar);
                        }
                        jl0Var2.setVisibility(0);
                        if (vkVar.s.size() == 0 && vkVar.r.size() == 0) {
                            z10 = true;
                        }
                        blVar.j0 = z10;
                        blVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        x2Var.setVisibility(0);
                        jl0Var2.setAdapter(null);
                        jl0Var2.setVisibility(8);
                        blVar.v.setVisibility(8);
                    }
                    vkVar.G(obj3, blVar.n0);
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
                        org.telegram.ui.Components.jl0 jl0Var3 = contactsActivity.f;
                        if (jl0Var3 != null) {
                            jl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.jl0 jl0Var4 = contactsActivity.f;
                        if (jl0Var4 != null) {
                            jl0Var4.setAdapter(contactsActivity.r);
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
                rt rtVar = (rt) this.h;
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Timer timer2 = new Timer();
                        ptVar2.d = timer2;
                        timer2.schedule(new ot(ptVar2, obj5, 0), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        rtVar.e = true;
                        break;
                    }
                }
                break;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String obj6 = editText.getText().toString();
                c70 c70Var = (c70) this.h;
                b70.E(c70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.I) {
                    c70Var.I = z11;
                    org.telegram.ui.Components.jl0 jl0Var5 = c70Var.d;
                    if (jl0Var5 != null) {
                        jl0Var5.setAdapter(!isEmpty ? c70Var.f : c70Var.e);
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
                    org.telegram.ui.Components.jl0 jl0Var6 = languageSelectActivity.b;
                    if (jl0Var6 != null) {
                        jl0Var6.setAdapter(languageSelectActivity.c);
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
                rc0 rc0Var = (rc0) this.h;
                if (rc0Var.S != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        rc0Var.o0 = true;
                        rc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.V;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        rc0Var.Q.setVisibility(8);
                        rc0Var.O.setVisibility(8);
                        f2.p0 adapter3 = rc0Var.R.getAdapter();
                        kc0 kc0Var = rc0Var.S;
                        if (adapter3 != kc0Var) {
                            rc0Var.R.setAdapter(kc0Var);
                        }
                        rc0Var.R.setVisibility(0);
                        rc0Var.p0 = rc0Var.S.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.V;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        rc0Var.Q.setVisibility(0);
                        rc0Var.O.setVisibility(0);
                        rc0Var.R.setAdapter(null);
                        rc0Var.R.setVisibility(8);
                    }
                    rc0Var.B0();
                    rc0Var.S.G(obj8, rc0Var.t0);
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
                    for (int i11 = 0; i11 < b31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) b31Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            b31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            b31Var.f.add(language);
                        }
                    }
                    b31Var.c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.jl0 jl0Var7 = b31Var.b;
                    if (jl0Var7 != null) {
                        jl0Var7.setAdapter(b31Var.c);
                        break;
                    }
                } else if (b31Var.b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.b.setAdapter(b31Var.a);
                    break;
                }
                break;
            case 16:
                ((b81) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String obj10 = editText.getText().toString();
                ve1 ve1Var = ((ze1) this.h).n0;
                if (!ve1Var.U.equals(obj10)) {
                    ve1Var.K(ve1Var.e[0], ve1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
            case 18:
                kg1 kg1Var = (kg1) this.h;
                kg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.o51 o51Var = kg1Var.a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    break;
                }
                break;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.e = editText.getText().toString();
                u1Var.a.U2.N(true);
                u1Var.a.u0(0);
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(rf.f0 f0Var) {
    }
}
