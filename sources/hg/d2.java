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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.z51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au;
import org.telegram.ui.bg1;
import org.telegram.ui.bi0;
import org.telegram.ui.cu;
import org.telegram.ui.dd0;
import org.telegram.ui.fg1;
import org.telegram.ui.g41;
import org.telegram.ui.g91;
import org.telegram.ui.ir0;
import org.telegram.ui.kd0;
import org.telegram.ui.pv;
import org.telegram.ui.qr;
import org.telegram.ui.u70;
import org.telegram.ui.ur;
import org.telegram.ui.v70;
import org.telegram.ui.vp;
import org.telegram.ui.wb;
import org.telegram.ui.wp;
import org.telegram.ui.wr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d2 extends h5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public boolean b() {
        switch (this.f) {
            case 15:
                ((ir0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public Animator h() {
        switch (this.f) {
            case 16:
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

    @Override // org.telegram.ui.ActionBar.h5
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
                wb wbVar = (wb) this.h;
                wbVar.v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    break;
                }
                break;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.e.F(null);
                wpVar.N = false;
                wpVar.getClass();
                wpVar.b.setAdapter(wpVar.a);
                wpVar.a.l();
                wpVar.b.setFastScrollVisible(true);
                wpVar.b.setVerticalScrollBarEnabled(false);
                wpVar.d.setShowAtCenter(false);
                View view = wpVar.fragmentView;
                int i10 = j6.a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                wpVar.fragmentView.setTag(Integer.valueOf(i10));
                wpVar.d.b();
                break;
            case 3:
                ur urVar = (ur) this.h;
                urVar.e.F(null);
                urVar.o1 = false;
                ai.w0 w0Var = urVar.c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(urVar.a);
                urVar.a.l();
                urVar.c.setFastScrollVisible(true);
                urVar.c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var2 = urVar.h;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    break;
                }
                break;
            case 4:
                wr wrVar = (wr) this.h;
                wrVar.n = null;
                z51 z51Var = wrVar.a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    break;
                }
                break;
            case 5:
                h8 h8Var = (h8) this.h;
                if (h8Var.h) {
                    h8Var.f = false;
                    h8Var.h = false;
                    h8Var.setAllowNestedScroll(true);
                    h8Var.s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var3 = h8Var.k0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
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
                cu cuVar = (cu) this.h;
                au auVar = cuVar.d;
                auVar.getClass();
                auVar.e = null;
                cuVar.f = false;
                cuVar.e = false;
                cuVar.a.setAdapter(cuVar.c);
                cuVar.a.setFastScrollVisible(true);
                break;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().h(false);
                pvVar.b.getActionBar().h(false);
                break;
            case 11:
                v70 v70Var = (v70) this.h;
                if (v70Var.M) {
                    u70.E(v70Var.f, null);
                    v70Var.M = false;
                    v70Var.d.setAdapter(v70Var.e);
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
                    org.telegram.ui.ActionBar.w0 w0Var4 = kd0Var.Z;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                    }
                    kd0Var.U.setVisibility(0);
                    kd0Var.S.setVisibility(0);
                    kd0Var.V.setAdapter(null);
                    kd0Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                ca0 ca0Var = ((bi0) this.h).a;
                ca0Var.y = false;
                ca0Var.j(null);
                break;
            case 17:
                g41 g41Var = (g41) this.h;
                g41Var.f = null;
                if (g41Var.b != null) {
                    g41Var.d.setVisibility(8);
                    g41Var.b.setAdapter(g41Var.a);
                    break;
                }
                break;
            case 18:
                g91 g91Var = (g91) this.h;
                g91Var.a.a(false, true);
                g91Var.o0(false, true);
                g91Var.c.Y2.N(false);
                break;
            case 19:
                fg1.b0((fg1) this.h, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void n() {
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.a.Y2.N(true);
                e2Var.a.v0(0);
                break;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                break;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.N = true;
                wpVar.d.setShowAtCenter(true);
                break;
            case 3:
                ur urVar = (ur) this.h;
                urVar.o1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = urVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            case 5:
                h8 h8Var = (h8) this.h;
                h8Var.s0 = h8Var.r.N0();
                View m10 = h8Var.r.m(h8Var.s0);
                h8Var.t0 = m10 == null ? 0 : m10.getTop();
                h8Var.h = true;
                h8Var.setAllowNestedScroll(false);
                h8Var.s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = h8Var.k0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
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
                ((cu) this.h).f = true;
                break;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().x("");
                pvVar.b.getActionBar().x("");
                pvVar.c.getSearchField().requestFocus();
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
                ir0 ir0Var = (ir0) this.h;
                ir0Var.a.getActionBar().x("");
                ir0Var.b.getActionBar().x("");
                ir0Var.c.getSearchField().requestFocus();
                break;
            case 18:
                g91 g91Var = (g91) this.h;
                g91Var.a.a(true, true);
                g91Var.h.I("");
                g91Var.o0(false, true);
                g91Var.c.Y2.N(false);
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

    @Override // org.telegram.ui.ActionBar.h5
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

    @Override // org.telegram.ui.ActionBar.h5
    public void p(h2 h2Var) {
        switch (this.f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.v0 = h2Var.getText().toString();
                wbVar.U0(true);
                break;
            case 15:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.a.getActionBar().w();
                ir0Var.b.getActionBar().w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void q(EditText editText) {
        ml0 ml0Var;
        ai.w0 w0Var;
        switch (this.f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.a.Y2.N(true);
                e2Var.a.v0(0);
                break;
            case 2:
                wp wpVar = (wp) this.h;
                if (wpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ml0Var = wpVar.b) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        vp vpVar = wpVar.e;
                        if (adapter != vpVar) {
                            wpVar.b.setAdapter(vpVar);
                            View view = wpVar.fragmentView;
                            int i10 = j6.d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            wpVar.fragmentView.setTag(Integer.valueOf(i10));
                            wpVar.e.l();
                            wpVar.b.setFastScrollVisible(false);
                            wpVar.b.setVerticalScrollBarEnabled(true);
                            wpVar.d.b();
                        }
                    }
                    wpVar.e.F(obj);
                    break;
                }
                break;
            case 3:
                ur urVar = (ur) this.h;
                if (urVar.e != null) {
                    String obj2 = editText.getText().toString();
                    int h = urVar.c.getAdapter() == null ? 0 : urVar.c.getAdapter().h();
                    urVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = urVar.c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        qr qrVar = urVar.a;
                        if (adapter2 != qrVar) {
                            ai.w0 w0Var2 = urVar.c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(qrVar);
                            if (h == 0) {
                                urVar.y0(0);
                            }
                        }
                    }
                    urVar.D1.setVisibility(8);
                    urVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                wr wrVar = (wr) this.h;
                wrVar.n = editText.getText().toString();
                z51 z51Var = wrVar.a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    break;
                }
                break;
            case 5:
                h8 h8Var = (h8) this.h;
                if (editText.length() > 0) {
                    h8Var.s.E(editText.getText().toString());
                    break;
                } else {
                    h8Var.f = false;
                    h8Var.s.E(null);
                    break;
                }
            case 6:
                ((ok) this.h).y.Y(editText.getText().toString(), false);
                break;
            case 7:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                ml0 ml0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (ml0Var2.getAdapter() != alVar) {
                            ml0Var2.setAdapter(alVar);
                        }
                        ml0Var2.setVisibility(0);
                        if (alVar.s.size() == 0 && alVar.r.size() == 0) {
                            z10 = true;
                        }
                        glVar.n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        ml0Var2.setAdapter(null);
                        ml0Var2.setVisibility(8);
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
                        ml0 ml0Var3 = contactsActivity.f;
                        if (ml0Var3 != null) {
                            ml0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f.setSectionsType(1);
                            break;
                        }
                    } else {
                        contactsActivity.E = true;
                        ml0 ml0Var4 = contactsActivity.f;
                        if (ml0Var4 != null) {
                            ml0Var4.setAdapter(contactsActivity.r);
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
                cu cuVar = (cu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    au auVar = cuVar.d;
                    auVar.getClass();
                    auVar.e = null;
                    cuVar.e = false;
                    cuVar.a.setAdapter(cuVar.c);
                    cuVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    au auVar2 = cuVar.d;
                    auVar2.getClass();
                    if (obj5 == null) {
                        auVar2.e = null;
                    } else {
                        try {
                            Timer timer = auVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Timer timer2 = new Timer();
                        auVar2.d = timer2;
                        timer2.schedule(new gg.s1(auVar2, obj5, 1), 100L, 300L);
                    }
                    if (obj5.length() != 0) {
                        cuVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                pvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                String obj6 = editText.getText().toString();
                v70 v70Var = (v70) this.h;
                u70.E(v70Var.f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != v70Var.M) {
                    v70Var.M = z11;
                    ml0 ml0Var5 = v70Var.d;
                    if (ml0Var5 != null) {
                        ml0Var5.setAdapter(!isEmpty ? v70Var.f : v70Var.e);
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
                    ml0 ml0Var6 = languageSelectActivity.b;
                    if (ml0Var6 != null) {
                        ml0Var6.setAdapter(languageSelectActivity.c);
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
                        org.telegram.ui.ActionBar.w0 w0Var4 = kd0Var.Z;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
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
                        org.telegram.ui.ActionBar.w0 w0Var5 = kd0Var.Z;
                        if (w0Var5 != null) {
                            w0Var5.setVisibility(0);
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
                ir0 ir0Var = (ir0) this.h;
                ir0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                ir0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                break;
            case 17:
                String obj9 = editText.getText().toString();
                g41 g41Var = (g41) this.h;
                if (obj9 == null) {
                    g41Var.f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = g41Var.f;
                    if (arrayList == null) {
                        g41Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < g41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) g41Var.h.get(i11);
                        if (language.q.startsWith(lowerCase)) {
                            g41Var.f.add(0, language);
                        } else if (language.q.contains(lowerCase)) {
                            g41Var.f.add(language);
                        }
                    }
                    g41Var.c.l();
                }
                if (obj9.length() != 0) {
                    ml0 ml0Var7 = g41Var.b;
                    if (ml0Var7 != null) {
                        ml0Var7.setAdapter(g41Var.c);
                        break;
                    }
                } else if (g41Var.b != null) {
                    g41Var.d.setVisibility(8);
                    g41Var.b.setAdapter(g41Var.a);
                    break;
                }
                break;
            case 18:
                ((g91) this.h).h.I(editText.getText().toString());
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
