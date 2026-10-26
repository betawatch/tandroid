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
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.af1;
import org.telegram.ui.d81;
import org.telegram.ui.e70;
import org.telegram.ui.f70;
import org.telegram.ui.gr;
import org.telegram.ui.ic0;
import org.telegram.ui.kh0;
import org.telegram.ui.kr;
import org.telegram.ui.mp;
import org.telegram.ui.mr;
import org.telegram.ui.mt;
import org.telegram.ui.np;
import org.telegram.ui.ot;
import org.telegram.ui.pc0;
import org.telegram.ui.vq0;
import org.telegram.ui.wb;
import org.telegram.ui.we1;
import org.telegram.ui.xj0;
import org.telegram.ui.y21;
import org.telegram.ui.zu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((vq0) this.b).finishFragment();
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
                np npVar = (np) this.b;
                npVar.e.F(null);
                npVar.N = false;
                npVar.getClass();
                npVar.b.setAdapter(npVar.a);
                npVar.a.l();
                npVar.b.setFastScrollVisible(true);
                npVar.b.setVerticalScrollBarEnabled(false);
                npVar.d.setShowAtCenter(false);
                npVar.d.b();
                break;
            case 3:
                kr krVar = (kr) this.b;
                krVar.e.F(null);
                krVar.n1 = false;
                bi.r1 r1Var = krVar.c;
                r1Var.W1 = false;
                r1Var.X1 = 0;
                r1Var.setAdapter(krVar.a);
                krVar.a.l();
                krVar.c.setFastScrollVisible(true);
                krVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                mr mrVar = (mr) this.b;
                mrVar.n = null;
                l71 l71Var = mrVar.a;
                if (l71Var != null) {
                    l71Var.g3.O(true);
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
                ot otVar = (ot) this.b;
                mt mtVar = otVar.d;
                mtVar.getClass();
                mtVar.e = null;
                otVar.f = false;
                otVar.e = false;
                otVar.a.setAdapter(otVar.c);
                otVar.a.setFastScrollVisible(true);
                break;
            case 10:
                zu zuVar = (zu) this.b;
                zuVar.a.getActionBar().g(false);
                zuVar.b.getActionBar().g(false);
                break;
            case 11:
                f70 f70Var = (f70) this.b;
                if (f70Var.M) {
                    e70.E(f70Var.f, null);
                    f70Var.M = false;
                    f70Var.d.setAdapter(f70Var.e);
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
                pc0 pc0Var = (pc0) this.b;
                pc0Var.q0 = false;
                pc0Var.r0 = false;
                pc0Var.W.G(null, null);
                pc0Var.C0();
                if (pc0Var.F0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.Z;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                    }
                    pc0Var.U.setVisibility(0);
                    pc0Var.S.setVisibility(0);
                    pc0Var.V.setAdapter(null);
                    pc0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                ua0 ua0Var = ((kh0) this.b).a;
                ua0Var.y = false;
                ua0Var.j(null);
                break;
            case 15:
                xj0.Y((xj0) this.b, false);
                break;
            case 18:
                y21 y21Var = (y21) this.b;
                y21Var.f = null;
                if (y21Var.b != null) {
                    y21Var.d.setVisibility(8);
                    y21Var.b.setAdapter(y21Var.a);
                    break;
                }
                break;
            case 19:
                d81 d81Var = (d81) this.b;
                d81Var.a.a(false, true);
                d81Var.n0(false, true);
                d81Var.c.g3.O(false);
                break;
            case 20:
                af1.b0((af1) this.b, false);
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
                np npVar = (np) this.b;
                npVar.N = true;
                npVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((kr) this.b).n1 = true;
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
                nkVar.b.y1(nkVar.F.getSearchField(), true);
                break;
            case 7:
                sl slVar = (sl) this.b;
                slVar.i0 = true;
                slVar.b.y1(slVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.y = true;
                ContactsActivity.c0(contactsActivity);
                break;
            case 9:
                ((ot) this.b).f = true;
                break;
            case 10:
                zu zuVar = (zu) this.b;
                zuVar.a.getActionBar().v();
                zuVar.b.getActionBar().v();
                zuVar.c.getSearchField().requestFocus();
                break;
            case 12:
                ((LanguageSelectActivity) this.b).getClass();
                break;
            case 13:
                ((pc0) this.b).q0 = true;
                break;
            case 14:
                ((kh0) this.b).a.y = true;
                break;
            case 15:
                xj0.Y((xj0) this.b, true);
                break;
            case 16:
                vq0 vq0Var = (vq0) this.b;
                vq0Var.a.getActionBar().v();
                vq0Var.b.getActionBar().v();
                vq0Var.c.getSearchField().requestFocus();
                break;
            case 19:
                d81 d81Var = (d81) this.b;
                d81Var.a.a(true, true);
                d81Var.f.I("");
                d81Var.n0(false, true);
                d81Var.c.g3.O(false);
                break;
            case 20:
                af1 af1Var = (af1) this.b;
                af1.b0(af1Var, true);
                we1 we1Var = af1Var.r0;
                if (!we1Var.d0.equals("")) {
                    we1Var.M(we1Var.e[0], we1Var.getCurrentPosition(), "", false);
                }
                af1Var.r0.setAlpha(0.0f);
                af1Var.r0.p0.e(true, false);
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
                vq0 vq0Var = (vq0) this.b;
                vq0Var.a.getActionBar().u();
                vq0Var.b.getActionBar().u();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(EditText editText) {
        mm0 mm0Var;
        bi.r1 r1Var;
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                f2Var.e = editText.getText().toString();
                f2Var.a.g3.O(true);
                f2Var.a.v0(0);
                break;
            case 2:
                np npVar = (np) this.b;
                if (npVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = npVar.b) != null) {
                        s4.h0 adapter = mm0Var.getAdapter();
                        mp mpVar = npVar.e;
                        if (adapter != mpVar) {
                            npVar.b.setAdapter(mpVar);
                            npVar.e.l();
                            npVar.b.setFastScrollVisible(false);
                            npVar.b.setVerticalScrollBarEnabled(true);
                            npVar.d.b();
                        }
                    }
                    npVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                kr krVar = (kr) this.b;
                if (krVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = krVar.c.getAdapter() == null ? 0 : krVar.c.getAdapter().h();
                    krVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (r1Var = krVar.c) != null) {
                        s4.h0 adapter2 = r1Var.getAdapter();
                        gr grVar = krVar.a;
                        if (adapter2 != grVar) {
                            bi.r1 r1Var2 = krVar.c;
                            r1Var2.W1 = false;
                            r1Var2.X1 = 0;
                            r1Var2.setAdapter(grVar);
                            if (h == 0) {
                                krVar.z0(0);
                            }
                        }
                    }
                    krVar.C1.setVisibility(8);
                    krVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                mr mrVar = (mr) this.b;
                mrVar.n = editText.getText().toString();
                l71 l71Var = mrVar.a;
                if (l71Var != null) {
                    l71Var.g3.O(true);
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
                mm0 mm0Var2 = slVar.O;
                ll llVar = slVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        slVar.j0 = true;
                        slVar.x.setShowSearchProgress(true);
                        r1Var3.setVisibility(8);
                        rVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != llVar) {
                            mm0Var2.setAdapter(llVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (llVar.s.size() == 0 && llVar.r.size() == 0) {
                            z10 = true;
                        }
                        slVar.k0 = z10;
                        slVar.i0();
                    } else {
                        r1Var3.setVisibility(0);
                        rVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
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
                        mm0 mm0Var3 = contactsActivity.d;
                        if (mm0Var3 != null) {
                            mm0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.x = true;
                        mm0 mm0Var4 = contactsActivity.d;
                        if (mm0Var4 != null) {
                            mm0Var4.setAdapter(contactsActivity.h);
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
                ot otVar = (ot) this.b;
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
                        timer2.schedule(new ig.r1(mtVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        otVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                zu zuVar = (zu) this.b;
                zuVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                zuVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                String obj6 = editText.getText().toString();
                f70 f70Var = (f70) this.b;
                e70.E(f70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != f70Var.M) {
                    f70Var.M = z11;
                    mm0 mm0Var5 = f70Var.d;
                    if (mm0Var5 != null) {
                        mm0Var5.setAdapter(!isEmpty ? f70Var.f : f70Var.e);
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
            case 13:
                pc0 pc0Var = (pc0) this.b;
                if (pc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        pc0Var.r0 = true;
                        pc0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        pc0Var.U.setVisibility(8);
                        pc0Var.S.setVisibility(8);
                        s4.h0 adapter3 = pc0Var.V.getAdapter();
                        ic0 ic0Var = pc0Var.W;
                        if (adapter3 != ic0Var) {
                            pc0Var.V.setAdapter(ic0Var);
                        }
                        pc0Var.V.setVisibility(0);
                        pc0Var.s0 = pc0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        pc0Var.U.setVisibility(0);
                        pc0Var.S.setVisibility(0);
                        pc0Var.V.setAdapter(null);
                        pc0Var.V.setVisibility(8);
                    }
                    pc0Var.C0();
                    pc0Var.W.G(obj8, pc0Var.w0);
                    break;
                }
                break;
            case 14:
                ((kh0) this.b).a.j(editText.getText().toString());
                break;
            case 15:
                ((xj0) this.b).n0(editText.getText().toString().trim());
                break;
            case 16:
                vq0 vq0Var = (vq0) this.b;
                vq0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                vq0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 17:
                ((ProfileActivity) this.b).e.I(editText.getText().toString().toLowerCase());
                break;
            case 18:
                String obj9 = editText.getText().toString();
                y21 y21Var = (y21) this.b;
                if (obj9 == null) {
                    y21Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = y21Var.f;
                    if (arrayList == null) {
                        y21Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < y21Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) y21Var.h.get(i10);
                        if (language.q.startsWith(lowerCase)) {
                            y21Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            y21Var.f.add(language);
                        }
                    }
                    y21Var.c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = y21Var.b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(y21Var.c);
                        break;
                    }
                } else if (y21Var.b != null) {
                    y21Var.d.setVisibility(8);
                    y21Var.b.setAdapter(y21Var.a);
                    break;
                }
                break;
            case 19:
                ((d81) this.b).f.I(editText.getText().toString());
                break;
            case 20:
                String obj10 = editText.getText().toString();
                we1 we1Var = ((af1) this.b).r0;
                if (!we1Var.d0.equals(obj10)) {
                    we1Var.M(we1Var.e[0], we1Var.getCurrentPosition(), obj10, false);
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
