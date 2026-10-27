package jg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.va0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bv;
import org.telegram.ui.cf1;
import org.telegram.ui.f81;
import org.telegram.ui.g70;
import org.telegram.ui.h70;
import org.telegram.ui.ir;
import org.telegram.ui.kc0;
import org.telegram.ui.mh0;
import org.telegram.ui.mr;
import org.telegram.ui.op;
import org.telegram.ui.or;
import org.telegram.ui.ot;
import org.telegram.ui.pp;
import org.telegram.ui.qt;
import org.telegram.ui.rc0;
import org.telegram.ui.wb;
import org.telegram.ui.xq0;
import org.telegram.ui.ye1;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e2 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public boolean b() {
        switch (this.a) {
            case 16:
                ((xq0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public Animator e() {
        switch (this.a) {
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
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
                return ProfileActivity.I0(profileActivity, profileActivity.W1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h() {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.a.g3.O(true);
                f2Var.a.v0(0);
                break;
            case 1:
                wb wbVar = (wb) this.b;
                wbVar.v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.V0(true);
                    break;
                }
                break;
            case 2:
                pp ppVar = (pp) this.b;
                ppVar.e.F(null);
                ppVar.N = false;
                ppVar.getClass();
                ppVar.b.setAdapter(ppVar.a);
                ppVar.a.l();
                ppVar.b.setFastScrollVisible(true);
                ppVar.b.setVerticalScrollBarEnabled(false);
                ppVar.d.setShowAtCenter(false);
                ppVar.d.b();
                break;
            case 3:
                mr mrVar = (mr) this.b;
                mrVar.e.F(null);
                mrVar.n1 = false;
                bi.r1 r1Var = mrVar.c;
                r1Var.W1 = false;
                r1Var.X1 = 0;
                r1Var.setAdapter(mrVar.a);
                mrVar.a.l();
                mrVar.c.setFastScrollVisible(true);
                mrVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                or orVar = (or) this.b;
                orVar.n = null;
                m71 m71Var = orVar.a;
                if (m71Var != null) {
                    m71Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                m8 m8Var = (m8) this.b;
                if (m8Var.h) {
                    m8Var.f = false;
                    m8Var.h = false;
                    m8Var.setAllowNestedScroll(true);
                    m8Var.s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var = m8Var.j0;
                    if (w0Var != null) {
                        w0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                nk nkVar = (nk) this.b;
                nkVar.b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.r;
                s4.h0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.y.Y(null, true);
                break;
            case 7:
                sl slVar = (sl) this.b;
                slVar.i0 = false;
                slVar.j0 = false;
                slVar.P.G(null, null);
                slVar.i0();
                slVar.N.setVisibility(0);
                slVar.L.setVisibility(0);
                slVar.O.setVisibility(8);
                slVar.v.setVisibility(8);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.h.G(null);
                contactsActivity.b0 = null;
                contactsActivity.y = false;
                contactsActivity.x = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.l();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.c0(contactsActivity);
                break;
            case 9:
                qt qtVar = (qt) this.b;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f = false;
                qtVar.e = false;
                qtVar.a.setAdapter(qtVar.c);
                qtVar.a.setFastScrollVisible(true);
                break;
            case 10:
                bv bvVar = (bv) this.b;
                bvVar.a.getActionBar().g(false);
                bvVar.b.getActionBar().g(false);
                break;
            case 11:
                h70 h70Var = (h70) this.b;
                if (h70Var.M) {
                    g70.E(h70Var.f, null);
                    h70Var.M = false;
                    h70Var.d.setAdapter(h70Var.e);
                    break;
                }
                break;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.j0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 13:
                rc0 rc0Var = (rc0) this.b;
                rc0Var.q0 = false;
                rc0Var.r0 = false;
                rc0Var.W.G(null, null);
                rc0Var.C0();
                if (rc0Var.F0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.Z;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                    }
                    rc0Var.U.setVisibility(0);
                    rc0Var.S.setVisibility(0);
                    rc0Var.V.setAdapter(null);
                    rc0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                va0 va0Var = ((mh0) this.b).a;
                va0Var.y = false;
                va0Var.j(null);
                break;
            case 15:
                zj0.Y((zj0) this.b, false);
                break;
            case 18:
                a31 a31Var = (a31) this.b;
                a31Var.f = null;
                if (a31Var.b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.b.setAdapter(a31Var.a);
                    break;
                }
                break;
            case 19:
                f81 f81Var = (f81) this.b;
                f81Var.a.a(false, true);
                f81Var.n0(false, true);
                f81Var.c.g3.O(false);
                break;
            case 20:
                cf1.b0((cf1) this.b, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i() {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                f2Var.d = true;
                f2Var.a.g3.O(true);
                f2Var.a.v0(0);
                break;
            case 1:
                wb wbVar = (wb) this.b;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                break;
            case 2:
                pp ppVar = (pp) this.b;
                ppVar.N = true;
                ppVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((mr) this.b).n1 = true;
                break;
            case 5:
                m8 m8Var = (m8) this.b;
                m8Var.r0 = m8Var.r.N0();
                View m10 = m8Var.r.m(m8Var.r0);
                m8Var.s0 = m10 == null ? 0 : m10.getTop();
                m8Var.h = true;
                m8Var.setAllowNestedScroll(false);
                m8Var.s.l();
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.j0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                nk nkVar = (nk) this.b;
                nkVar.b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.b.z1(nkVar.F.getSearchField(), true);
                break;
            case 7:
                sl slVar = (sl) this.b;
                slVar.i0 = true;
                slVar.b.z1(slVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.y = true;
                ContactsActivity.c0(contactsActivity);
                break;
            case 9:
                ((qt) this.b).f = true;
                break;
            case 10:
                bv bvVar = (bv) this.b;
                bvVar.a.getActionBar().v();
                bvVar.b.getActionBar().v();
                bvVar.c.getSearchField().requestFocus();
                break;
            case 12:
                ((LanguageSelectActivity) this.b).getClass();
                break;
            case 13:
                ((rc0) this.b).q0 = true;
                break;
            case 14:
                ((mh0) this.b).a.y = true;
                break;
            case 15:
                zj0.Y((zj0) this.b, true);
                break;
            case 16:
                xq0 xq0Var = (xq0) this.b;
                xq0Var.a.getActionBar().v();
                xq0Var.b.getActionBar().v();
                xq0Var.c.getSearchField().requestFocus();
                break;
            case 19:
                f81 f81Var = (f81) this.b;
                f81Var.a.a(true, true);
                f81Var.f.I("");
                f81Var.n0(false, true);
                f81Var.c.g3.O(false);
                break;
            case 20:
                cf1 cf1Var = (cf1) this.b;
                cf1.b0(cf1Var, true);
                ye1 ye1Var = cf1Var.r0;
                if (!ye1Var.d0.equals("")) {
                    ye1Var.M(ye1Var.e[0], ye1Var.getCurrentPosition(), "", false);
                }
                cf1Var.r0.setAlpha(0.0f);
                cf1Var.r0.p0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void j(ig.p0 p0Var) {
        switch (this.a) {
            case 6:
                nk nkVar = (nk) this.b;
                mk mkVar = nkVar.y;
                mkVar.R.remove(p0Var);
                mkVar.Y(nkVar.F.getSearchField().getText().toString(), false);
                mkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                wb wbVar = (wb) this.b;
                wbVar.U = true;
                wbVar.v0 = editTextBoldCursor.getText().toString();
                wbVar.V0(true);
                break;
            case 16:
                xq0 xq0Var = (xq0) this.b;
                xq0Var.a.getActionBar().u();
                xq0Var.b.getActionBar().u();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(EditText editText) {
        nm0 nm0Var;
        bi.r1 r1Var;
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                f2Var.e = editText.getText().toString();
                f2Var.a.g3.O(true);
                f2Var.a.v0(0);
                break;
            case 2:
                pp ppVar = (pp) this.b;
                if (ppVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (nm0Var = ppVar.b) != null) {
                        s4.h0 adapter = nm0Var.getAdapter();
                        op opVar = ppVar.e;
                        if (adapter != opVar) {
                            ppVar.b.setAdapter(opVar);
                            ppVar.e.l();
                            ppVar.b.setFastScrollVisible(false);
                            ppVar.b.setVerticalScrollBarEnabled(true);
                            ppVar.d.b();
                        }
                    }
                    ppVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                mr mrVar = (mr) this.b;
                if (mrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = mrVar.c.getAdapter() == null ? 0 : mrVar.c.getAdapter().h();
                    mrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (r1Var = mrVar.c) != null) {
                        s4.h0 adapter2 = r1Var.getAdapter();
                        ir irVar = mrVar.a;
                        if (adapter2 != irVar) {
                            bi.r1 r1Var2 = mrVar.c;
                            r1Var2.W1 = false;
                            r1Var2.X1 = 0;
                            r1Var2.setAdapter(irVar);
                            if (h == 0) {
                                mrVar.z0(0);
                            }
                        }
                    }
                    mrVar.C1.setVisibility(8);
                    mrVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                or orVar = (or) this.b;
                orVar.n = editText.getText().toString();
                m71 m71Var = orVar.a;
                if (m71Var != null) {
                    m71Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                m8 m8Var = (m8) this.b;
                if (editText.length() > 0) {
                    m8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    m8Var.f = false;
                    m8Var.s.E(null);
                    break;
                }
            case 6:
                ((nk) this.b).y.Y(editText.getText().toString(), false);
                break;
            case 7:
                sl slVar = (sl) this.b;
                bh.r rVar = slVar.L;
                bi.r1 r1Var3 = slVar.N;
                nm0 nm0Var2 = slVar.O;
                ll llVar = slVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        slVar.j0 = true;
                        slVar.x.setShowSearchProgress(true);
                        r1Var3.setVisibility(8);
                        rVar.setVisibility(8);
                        if (nm0Var2.getAdapter() != llVar) {
                            nm0Var2.setAdapter(llVar);
                        }
                        nm0Var2.setVisibility(0);
                        if (llVar.s.size() == 0 && llVar.r.size() == 0) {
                            z10 = true;
                        }
                        slVar.k0 = z10;
                        slVar.i0();
                    } else {
                        r1Var3.setVisibility(0);
                        rVar.setVisibility(0);
                        nm0Var2.setAdapter(null);
                        nm0Var2.setVisibility(8);
                        slVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, slVar.o0);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                if (contactsActivity.h != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.b0 = obj4;
                    if (obj4.isEmpty()) {
                        contactsActivity.x = false;
                        contactsActivity.h.G(null);
                        nm0 nm0Var3 = contactsActivity.d;
                        if (nm0Var3 != null) {
                            nm0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.x = true;
                        nm0 nm0Var4 = contactsActivity.d;
                        if (nm0Var4 != null) {
                            nm0Var4.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.l();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.c.e(true, true);
                        contactsActivity.h.G(obj4);
                        break;
                    }
                }
                break;
            case 9:
                qt qtVar = (qt) this.b;
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
                        timer2.schedule(new ig.r1(otVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        qtVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                bv bvVar = (bv) this.b;
                bvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                bvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                String obj6 = editText.getText().toString();
                h70 h70Var = (h70) this.b;
                g70.E(h70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != h70Var.M) {
                    h70Var.M = z11;
                    nm0 nm0Var5 = h70Var.d;
                    if (nm0Var5 != null) {
                        nm0Var5.setAdapter(!isEmpty ? h70Var.f : h70Var.e);
                        break;
                    }
                }
                break;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.j0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    nm0 nm0Var6 = languageSelectActivity.b;
                    if (nm0Var6 != null) {
                        nm0Var6.setAdapter(languageSelectActivity.c);
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
                rc0 rc0Var = (rc0) this.b;
                if (rc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        rc0Var.r0 = true;
                        rc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        rc0Var.U.setVisibility(8);
                        rc0Var.S.setVisibility(8);
                        s4.h0 adapter3 = rc0Var.V.getAdapter();
                        kc0 kc0Var = rc0Var.W;
                        if (adapter3 != kc0Var) {
                            rc0Var.V.setAdapter(kc0Var);
                        }
                        rc0Var.V.setVisibility(0);
                        rc0Var.s0 = rc0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        rc0Var.U.setVisibility(0);
                        rc0Var.S.setVisibility(0);
                        rc0Var.V.setAdapter(null);
                        rc0Var.V.setVisibility(8);
                    }
                    rc0Var.C0();
                    rc0Var.W.G(obj8, rc0Var.w0);
                    break;
                }
                break;
            case 14:
                ((mh0) this.b).a.j(editText.getText().toString());
                break;
            case 15:
                ((zj0) this.b).n0(editText.getText().toString().trim());
                break;
            case 16:
                xq0 xq0Var = (xq0) this.b;
                xq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                xq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 17:
                ((ProfileActivity) this.b).e.I(editText.getText().toString().toLowerCase());
                break;
            case 18:
                String obj9 = editText.getText().toString();
                a31 a31Var = (a31) this.b;
                if (obj9 == null) {
                    a31Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = a31Var.f;
                    if (arrayList == null) {
                        a31Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < a31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) a31Var.h.get(i10);
                        if (language.q.startsWith(lowerCase)) {
                            a31Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            a31Var.f.add(language);
                        }
                    }
                    a31Var.c.l();
                }
                if (obj9.length() != 0) {
                    nm0 nm0Var7 = a31Var.b;
                    if (nm0Var7 != null) {
                        nm0Var7.setAdapter(a31Var.c);
                        break;
                    }
                } else if (a31Var.b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.b.setAdapter(a31Var.a);
                    break;
                }
                break;
            case 19:
                ((f81) this.b).f.I(editText.getText().toString());
                break;
            case 20:
                String obj10 = editText.getText().toString();
                ye1 ye1Var = ((cf1) this.b).r0;
                if (!ye1Var.d0.equals(obj10)) {
                    ye1Var.M(ye1Var.e[0], ye1Var.getCurrentPosition(), obj10, false);
                    break;
                }
                break;
        }
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q(ig.p0 p0Var) {
    }
}
