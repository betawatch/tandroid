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
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bg1;
import org.telegram.ui.bi0;
import org.telegram.ui.bu;
import org.telegram.ui.dd0;
import org.telegram.ui.f41;
import org.telegram.ui.fg1;
import org.telegram.ui.hr0;
import org.telegram.ui.i91;
import org.telegram.ui.kd0;
import org.telegram.ui.or;
import org.telegram.ui.ov;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.t70;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.ur;
import org.telegram.ui.vb;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d2 extends g5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public boolean b() {
        switch (this.f) {
            case 15:
                ((hr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public Animator h() {
        switch (this.f) {
            case 16:
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

    @Override // org.telegram.ui.ActionBar.g5
    public void m() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.a.Y2.N(true);
                e2Var.a.v0(0);
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
                int i10 = j6.a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                break;
            case 3:
                sr srVar = (sr) this.h;
                srVar.e.F(null);
                srVar.o1 = false;
                ai.w0 w0Var = srVar.c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(srVar.a);
                srVar.a.l();
                srVar.c.setFastScrollVisible(true);
                srVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    break;
                }
                break;
            case 4:
                ur urVar = (ur) this.h;
                urVar.n = null;
                o61 o61Var = urVar.a;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                    break;
                }
                break;
            case 5:
                i8 i8Var = (i8) this.h;
                if (i8Var.h) {
                    i8Var.f = false;
                    i8Var.h = false;
                    i8Var.setAllowNestedScroll(true);
                    i8Var.s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = i8Var.k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                ok okVar = (ok) this.h;
                okVar.b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.y.Y(null, true);
                break;
            case 7:
                gl glVar = (gl) this.h;
                glVar.l0 = false;
                glVar.m0 = false;
                glVar.R.G(null, null);
                glVar.f0();
                glVar.P.setVisibility(0);
                glVar.N.setVisibility(0);
                glVar.Q.setVisibility(8);
                glVar.v.setVisibility(8);
                break;
            case 8:
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
            case 9:
                bu buVar = (bu) this.h;
                zt ztVar = buVar.d;
                ztVar.getClass();
                ztVar.e = null;
                buVar.f = false;
                buVar.e = false;
                buVar.a.setAdapter(buVar.c);
                buVar.a.setFastScrollVisible(true);
                break;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().h(false);
                ovVar.b.getActionBar().h(false);
                break;
            case 11:
                t70 t70Var = (t70) this.h;
                if (t70Var.M) {
                    s70.E(t70Var.f, null);
                    t70Var.M = false;
                    t70Var.d.setAdapter(t70Var.e);
                    break;
                }
                break;
            case 12:
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
            case 13:
                kd0 kd0Var = (kd0) this.h;
                kd0Var.r0 = false;
                kd0Var.s0 = false;
                kd0Var.W.G(null, null);
                kd0Var.B0();
                if (kd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = kd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    kd0Var.U.setVisibility(0);
                    kd0Var.S.setVisibility(0);
                    kd0Var.V.setAdapter(null);
                    kd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                na0 na0Var = ((bi0) this.h).a;
                na0Var.y = false;
                na0Var.j(null);
                break;
            case 17:
                f41 f41Var = (f41) this.h;
                f41Var.f = null;
                if (f41Var.b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.b.setAdapter(f41Var.a);
                    break;
                }
                break;
            case 18:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(false, true);
                i91Var.o0(false, true);
                i91Var.c.Y2.N(false);
                break;
            case 19:
                fg1.b0((fg1) this.h, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void n() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.a.Y2.N(true);
                e2Var.a.v0(0);
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
                sr srVar = (sr) this.h;
                srVar.o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            case 5:
                i8 i8Var = (i8) this.h;
                i8Var.s0 = i8Var.r.N0();
                View m10 = i8Var.r.m(i8Var.s0);
                i8Var.t0 = m10 == null ? 0 : m10.getTop();
                i8Var.h = true;
                i8Var.setAllowNestedScroll(false);
                i8Var.s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = i8Var.k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ok okVar = (ok) this.h;
                okVar.b0 = true;
                okVar.G.setVisibility(8);
                okVar.b.t1(okVar.F.getSearchField(), true);
                break;
            case 7:
                gl glVar = (gl) this.h;
                glVar.l0 = true;
                glVar.b.t1(glVar.E.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 9:
                ((bu) this.h).f = true;
                break;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().x("");
                ovVar.b.getActionBar().x("");
                ovVar.c.getSearchField().requestFocus();
                break;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 13:
                ((kd0) this.h).r0 = true;
                break;
            case 14:
                ((bi0) this.h).a.y = true;
                break;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.a.getActionBar().x("");
                hr0Var.b.getActionBar().x("");
                hr0Var.c.getSearchField().requestFocus();
                break;
            case 18:
                i91 i91Var = (i91) this.h;
                i91Var.a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.c.Y2.N(false);
                break;
            case 19:
                fg1 fg1Var = (fg1) this.h;
                fg1.b0(fg1Var, true);
                bg1 bg1Var = fg1Var.r0;
                if (!bg1Var.c0.equals("")) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), "", false);
                }
                fg1Var.r0.setAlpha(0.0f);
                fg1Var.r0.o0.e(true, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void o(gg.q0 q0Var) {
        switch (this.f) {
            case 6:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.y;
                nkVar.R.remove(q0Var);
                nkVar.Y(okVar.F.getSearchField().getText().toString(), false);
                nkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void p(h2 h2Var) {
        switch (this.f) {
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.U = true;
                vbVar.v0 = h2Var.getText().toString();
                vbVar.U0(true);
                break;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.a.getActionBar().w();
                hr0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public void q(EditText editText) {
        yl0 yl0Var;
        ai.w0 w0Var;
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.a.Y2.N(true);
                e2Var.a.v0(0);
                break;
            case 2:
                up upVar = (up) this.h;
                if (upVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (yl0Var = upVar.b) != null) {
                        s4.h0 adapter = yl0Var.getAdapter();
                        tp tpVar = upVar.e;
                        if (adapter != tpVar) {
                            upVar.b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = j6.d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
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
                sr srVar = (sr) this.h;
                if (srVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = srVar.c.getAdapter() == null ? 0 : srVar.c.getAdapter().h();
                    srVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = srVar.c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        or orVar = srVar.a;
                        if (adapter2 != orVar) {
                            ai.w0 w0Var2 = srVar.c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(orVar);
                            if (h == 0) {
                                srVar.y0(0);
                            }
                        }
                    }
                    srVar.D1.setVisibility(8);
                    srVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                ur urVar = (ur) this.h;
                urVar.n = editText.getText().toString();
                o61 o61Var = urVar.a;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                    break;
                }
                break;
            case 5:
                i8 i8Var = (i8) this.h;
                if (editText.length() > 0) {
                    i8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    i8Var.f = false;
                    i8Var.s.E(null);
                    break;
                }
            case 6:
                ((ok) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 7:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                yl0 yl0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (yl0Var2.getAdapter() != alVar) {
                            yl0Var2.setAdapter(alVar);
                        }
                        yl0Var2.setVisibility(0);
                        if (alVar.s.size() == 0 && alVar.r.size() == 0) {
                            z10 = true;
                        }
                        glVar.n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        yl0Var2.setAdapter(null);
                        yl0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.r0);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.c.a(!obj4.isEmpty(), true);
                    contactsActivity.i0 = obj4;
                    if (obj4.isEmpty()) {
                        yl0 yl0Var3 = contactsActivity.f;
                        if (yl0Var3 != null) {
                            yl0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        yl0 yl0Var4 = contactsActivity.f;
                        if (yl0Var4 != null) {
                            yl0Var4.setAdapter(contactsActivity.r);
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
            case 9:
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
                        timer2.schedule(new gg.s1(ztVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        buVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                ovVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                String obj6 = editText.getText().toString();
                t70 t70Var = (t70) this.h;
                s70.E(t70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != t70Var.M) {
                    t70Var.M = z11;
                    yl0 yl0Var5 = t70Var.d;
                    if (yl0Var5 != null) {
                        yl0Var5.setAdapter(!isEmpty ? t70Var.f : t70Var.e);
                        break;
                    }
                }
                break;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    yl0 yl0Var6 = languageSelectActivity.b;
                    if (yl0Var6 != null) {
                        yl0Var6.setAdapter(languageSelectActivity.c);
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
                kd0 kd0Var = (kd0) this.h;
                if (kd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    if (obj8.length() != 0) {
                        kd0Var.s0 = true;
                        kd0Var.w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = kd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        kd0Var.U.setVisibility(8);
                        kd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = kd0Var.V.getAdapter();
                        dd0 dd0Var = kd0Var.W;
                        if (adapter3 != dd0Var) {
                            kd0Var.V.setAdapter(dd0Var);
                        }
                        kd0Var.V.setVisibility(0);
                        kd0Var.t0 = kd0Var.W.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = kd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        kd0Var.U.setVisibility(0);
                        kd0Var.S.setVisibility(0);
                        kd0Var.V.setAdapter(null);
                        kd0Var.V.setVisibility(8);
                    }
                    kd0Var.B0();
                    kd0Var.W.G(obj8, kd0Var.x0);
                    break;
                }
                break;
            case 14:
                ((bi0) this.h).a.j(editText.getText().toString());
                break;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                hr0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 17:
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
                    yl0 yl0Var7 = f41Var.b;
                    if (yl0Var7 != null) {
                        yl0Var7.setAdapter(f41Var.c);
                        break;
                    }
                } else if (f41Var.b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.b.setAdapter(f41Var.a);
                    break;
                }
                break;
            case 18:
                ((i91) this.h).h.I(editText.getText().toString());
                break;
            case 19:
                String obj10 = editText.getText().toString();
                bg1 bg1Var = ((fg1) this.h).r0;
                if (!bg1Var.c0.equals(obj10)) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), obj10, false);
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
