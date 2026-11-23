package bi;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.r00;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a60;
import org.telegram.ui.ax;
import org.telegram.ui.bx;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.gv;
import org.telegram.ui.jw;
import org.telegram.ui.lb;
import org.telegram.ui.m50;
import org.telegram.ui.n31;
import org.telegram.ui.n50;
import org.telegram.ui.nq;
import org.telegram.ui.pa0;
import org.telegram.ui.pw;
import org.telegram.ui.rq;
import org.telegram.ui.ry0;
import org.telegram.ui.s91;
import org.telegram.ui.sc1;
import org.telegram.ui.sv;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.w91;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x1 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean b() {
        switch (this.a) {
            case 12:
                bx bxVar = (bx) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = bxVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (bxVar.p2 == null) {
                    return true;
                }
                bxVar.finishFragment();
                return false;
            case 19:
                ((dn0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 12:
                bx bxVar = (bx) this.b;
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                return !kVar.x() && bxVar.V3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public Animator e() {
        switch (this.a) {
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    g5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(g5Var.e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void f() {
        switch (this.a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                sc1 sc1Var = wallpapersListActivity.I;
                sc1Var.n = null;
                sc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(gd.N0(2131745620, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void h() {
        ri.q qVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, null);
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = false;
                y1Var.e = null;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    break;
                }
                break;
            case 3:
                uo uoVar = (uo) obj;
                uoVar.e.F(null);
                uoVar.O = false;
                uoVar.getClass();
                uoVar.b.setAdapter(uoVar.a);
                uoVar.a.f();
                uoVar.b.setFastScrollVisible(true);
                uoVar.b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                break;
            case 4:
                rq rqVar = (rq) obj;
                rqVar.e.F(null);
                rqVar.o1 = false;
                di.b1 b1Var = rqVar.c;
                b1Var.X1 = false;
                b1Var.Y1 = 0;
                b1Var.setAdapter(rqVar.a);
                rqVar.a.f();
                rqVar.c.setFastScrollVisible(true);
                rqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.n = null;
                i6 i6Var = tqVar.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                if (e8Var.r1) {
                    e8Var.q1 = false;
                    e8Var.r1 = false;
                    e8Var.r0 = true;
                    e8Var.u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = e8Var.e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.c0 = false;
                kkVar.H.setVisibility(0);
                zj zjVar = kkVar.r;
                v4.i0 adapter = zjVar.getAdapter();
                dk dkVar = kkVar.w;
                if (adapter != dkVar) {
                    zjVar.setAdapter(dkVar);
                }
                dkVar.f();
                kkVar.E.Y(null, true);
                break;
            case 8:
                kl klVar = (kl) obj;
                klVar.d0 = false;
                klVar.e0 = false;
                klVar.O.G(null);
                klVar.j0();
                klVar.M.setVisibility(0);
                klVar.K.setVisibility(0);
                klVar.N.setVisibility(8);
                klVar.s.setVisibility(8);
                break;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.c0 = null;
                contactsActivity.E = false;
                contactsActivity.y = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                break;
            case 10:
                ts tsVar = (ts) obj;
                dk dkVar2 = tsVar.d;
                dkVar2.getClass();
                dkVar2.e = null;
                tsVar.f = false;
                tsVar.e = false;
                tsVar.a.setAdapter(tsVar.c);
                tsVar.a.setFastScrollVisible(true);
                break;
            case 11:
                du duVar = (du) obj;
                duVar.a.getActionBar().n(false);
                duVar.b.getActionBar().n(false);
                break;
            case 12:
                bx bxVar = (bx) obj;
                pw pwVar = bxVar.Y;
                if (pwVar != null) {
                    ArrayList arrayList = pwVar.G;
                    if (!arrayList.isEmpty() && pwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((gv) pwVar.I).e((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                bxVar.l2 = false;
                bxVar.m2 = false;
                ax axVar = bxVar.f0[0];
                if (axVar != null) {
                    axVar.a.setEmptyView(bxVar.Y2 == 0 ? axVar.x : null);
                    bxVar.i5(false, false, true, false);
                }
                bxVar.u5(false, false);
                ks.e().k(ks.u4, Boolean.TRUE);
                bxVar.Y.setCloseButtonVisible(false);
                bxVar.t5(true);
                bxVar.N3();
                qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
                qVar.g();
                break;
            case 13:
                n50 n50Var = (n50) obj;
                if (n50Var.N) {
                    m50.E(n50Var.f, null);
                    n50Var.N = false;
                    n50Var.d.setAdapter(n50Var.e);
                    break;
                }
                break;
            case 14:
                a60.d0((a60) obj);
                break;
            case 15:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 16:
                pa0 pa0Var = (pa0) obj;
                pa0Var.u0 = false;
                pa0Var.v0 = false;
                pa0Var.T.G(null);
                pa0Var.O0();
                org.telegram.ui.ActionBar.g5 g5Var = pa0Var.W;
                if (g5Var != null) {
                    g5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.N0(false);
                break;
            case 17:
                i90 i90Var = (i90) ((e9) obj).b;
                i90Var.y = false;
                i90Var.j(null);
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(gd.N0(2131748018, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 21:
                ry0 ry0Var = (ry0) obj;
                ry0Var.f = null;
                if (ry0Var.b != null) {
                    ry0Var.d.setVisibility(8);
                    ry0Var.b.setAdapter(ry0Var.a);
                    break;
                }
                break;
            case 22:
                n31 n31Var = (n31) obj;
                n31Var.a.a(false, true);
                n31Var.o0(false, true);
                n31Var.c.g3.O(false);
                break;
            case 23:
                w91.f0((w91) obj, false);
                break;
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.G.invalidate();
                wallpapersListActivity.I.E(null, true);
                wallpapersListActivity.K.setSearchFieldCaption(null);
                f();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r6.L == false) goto L77;
     */
    @Override // org.telegram.ui.ActionBar.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.k kVar;
        ri.q qVar;
        mm0 mm0Var;
        mm0 mm0Var2;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                f2 f2Var = (f2) obj;
                ek0 ek0Var = f2Var.o1;
                float i12 = f2Var.i1();
                if (i12 != -3.4028235E38f) {
                    float f10 = org.telegram.messenger.g0.m;
                    if (i12 > f10 && i12 != Float.MAX_VALUE) {
                        f2Var.n2 = true;
                        ek0Var.w0(0, ((int) (i12 - f10)) + 1, kr.h);
                        break;
                    }
                } else {
                    f2Var.n1.h1(1, (org.telegram.messenger.g0.m - 1) - ((int) ek0Var.getY()));
                    break;
                }
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = true;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.J.setVisibility(8);
                lbVar.getClass();
                break;
            case 3:
                uo uoVar = (uo) obj;
                uoVar.O = true;
                uoVar.d.setShowAtCenter(true);
                break;
            case 4:
                ((rq) obj).o1 = true;
                break;
            case 6:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                v4.c0 c0Var = e8Var.t1;
                int N0 = c0Var.N0();
                e8Var.m2 = N0;
                View m10 = c0Var.m(N0);
                e8Var.n2 = m10 == null ? 0 : m10.getTop();
                e8Var.r1 = true;
                e8Var.u0(false);
                e8Var.u1.f();
                org.telegram.ui.ActionBar.q0 q0Var = e8Var.e2;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.c0 = true;
                kkVar.H.setVisibility(8);
                kkVar.b.i1(kkVar.G.getSearchField(), true);
                break;
            case 8:
                kl klVar = (kl) obj;
                klVar.d0 = true;
                klVar.b.i1(klVar.x.getSearchField(), true);
                break;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.E = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 10:
                ((ts) obj).f = true;
                break;
            case 11:
                du duVar = (du) obj;
                duVar.a.getActionBar().C();
                duVar.b.getActionBar().C();
                duVar.c.getSearchField().requestFocus();
                break;
            case 12:
                bx bxVar = (bx) obj;
                bxVar.l2 = true;
                org.telegram.ui.ActionBar.q0 q0Var2 = bxVar.F1;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(8);
                }
                bxVar.Y3();
                ax axVar = bxVar.f0[0];
                if (axVar != null) {
                    if (bxVar.p2 != null) {
                        axVar.a.c1();
                        jw jwVar = bxVar.D0;
                        if (jwVar != null) {
                            di.b1 b1Var = jwVar.b0;
                            if (b1Var.h1) {
                                b1Var.h1 = false;
                                b1Var.K0(false);
                            }
                        }
                    }
                    if (!bxVar.n2) {
                        hi.u3 u3Var = bxVar.q0;
                        if (u3Var != null) {
                            u3Var.f(true);
                        }
                        hi.u3 u3Var2 = bxVar.r0;
                        if (u3Var2 != null) {
                            u3Var2.f(true);
                        }
                    }
                }
                sv svVar = bxVar.F0;
                if (svVar != null && svVar.getPremiumHint() != null) {
                    bxVar.F0.getPremiumHint().f(true);
                }
                if (!bxVar.L) {
                    bxVar.W4(0.0f);
                }
                bxVar.u5(false, false);
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                kVar.setBackButtonContentDescription(gd.N0(2131754878, null));
                ks.e().k(ks.u4, new Object[0]);
                qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
                qVar.g();
                jw jwVar2 = bxVar.D0;
                if (jwVar2 != null && (mm0Var2 = jwVar2.e0) != null) {
                    mm0Var2.c = jg.e0.d;
                }
                if (jwVar2 == null || (mm0Var = jwVar2.e0) == null || !mm0Var.M()) {
                    ArrayList arrayList = (ArrayList) bxVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!bxVar.v3) {
                            break;
                        }
                    }
                }
                bxVar.m2 = true;
                if (!bxVar.s3) {
                    bxVar.i5(true, false, true, false);
                }
                bxVar.Y.setCloseButtonVisible(true);
                bxVar.t5(true);
                bxVar.N3();
                break;
            case 15:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 16:
                ((pa0) obj).u0 = true;
                break;
            case 17:
                ((i90) ((e9) obj).b).y = true;
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 19:
                dn0 dn0Var = (dn0) obj;
                dn0Var.a.getActionBar().C();
                dn0Var.b.getActionBar().C();
                dn0Var.c.getSearchField().requestFocus();
                break;
            case 22:
                n31 n31Var = (n31) obj;
                n31Var.a.a(true, true);
                n31Var.f.I("");
                n31Var.o0(false, true);
                n31Var.c.g3.O(false);
                break;
            case 23:
                w91 w91Var = (w91) obj;
                w91.f0(w91Var, true);
                s91 s91Var = w91Var.s0;
                if (!s91Var.e0.equals("")) {
                    s91Var.K(s91Var.e[0], s91Var.getCurrentPosition(), "", false);
                }
                w91Var.s0.setAlpha(0.0f);
                w91Var.s0.q0.e(true, false);
                break;
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.I);
                wallpapersListActivity.G.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void j(jg.o0 o0Var) {
        switch (this.a) {
            case 7:
                kk kkVar = (kk) this.b;
                jk jkVar = kkVar.E;
                jkVar.S.remove(o0Var);
                jkVar.Y(kkVar.G.getSearchField().getText().toString(), false);
                jkVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 2:
                lb lbVar = (lb) this.b;
                lbVar.V = true;
                lbVar.w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                break;
            case 19:
                dn0 dn0Var = (dn0) this.b;
                dn0Var.a.getActionBar().B();
                dn0Var.b.getActionBar().B();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void l(EditText editText) {
        ek0 ek0Var;
        di.b1 b1Var;
        jw jwVar;
        mm0 mm0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, editText.getText().toString());
                break;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.e = editText.getText().toString();
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 3:
                uo uoVar = (uo) obj;
                if (uoVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (ek0Var = uoVar.b) != null) {
                        v4.i0 adapter = ek0Var.getAdapter();
                        to toVar = uoVar.e;
                        if (adapter != toVar) {
                            uoVar.b.setAdapter(toVar);
                            uoVar.e.f();
                            uoVar.b.setFastScrollVisible(false);
                            uoVar.b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.e.F(obj2);
                    break;
                }
                break;
            case 4:
                rq rqVar = (rq) obj;
                if (rqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = rqVar.c.getAdapter() == null ? 0 : rqVar.c.getAdapter().b();
                    rqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = rqVar.c) != null) {
                        v4.i0 adapter2 = b1Var.getAdapter();
                        nq nqVar = rqVar.a;
                        if (adapter2 != nqVar) {
                            di.b1 b1Var2 = rqVar.c;
                            b1Var2.X1 = false;
                            b1Var2.Y1 = 0;
                            b1Var2.setAdapter(nqVar);
                            if (b10 == 0) {
                                rqVar.D0(0);
                            }
                        }
                    }
                    rqVar.D1.setVisibility(8);
                    rqVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.n = editText.getText().toString();
                i6 i6Var = tqVar.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                if (editText.length() > 0) {
                    e8Var.u1.E(editText.getText().toString());
                    break;
                } else {
                    e8Var.q1 = false;
                    e8Var.u1.E(null);
                    break;
                }
            case 7:
                ((kk) obj).E.Y(editText.getText().toString(), false);
                break;
            case 8:
                kl klVar = (kl) obj;
                g3 g3Var = klVar.K;
                di.b1 b1Var3 = klVar.M;
                ek0 ek0Var2 = klVar.N;
                il ilVar = klVar.O;
                if (ilVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        klVar.e0 = true;
                        klVar.x.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        g3Var.setVisibility(8);
                        if (ek0Var2.getAdapter() != ilVar) {
                            ek0Var2.setAdapter(ilVar);
                        }
                        ek0Var2.setVisibility(0);
                        klVar.f0 = ilVar.f.isEmpty();
                        klVar.j0();
                    } else {
                        b1Var3.setVisibility(0);
                        g3Var.setVisibility(0);
                        ek0Var2.setAdapter(null);
                        ek0Var2.setVisibility(8);
                        klVar.s.setVisibility(8);
                    }
                    ilVar.G(obj4);
                    break;
                }
                break;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.c0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        ek0 ek0Var3 = contactsActivity.d;
                        if (ek0Var3 != null) {
                            ek0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        ek0 ek0Var4 = contactsActivity.d;
                        if (ek0Var4 != null) {
                            ek0Var4.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.c.e(true, true);
                        contactsActivity.h.G(obj5);
                        break;
                    }
                }
                break;
            case 10:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    dk dkVar = tsVar.d;
                    dkVar.getClass();
                    dkVar.e = null;
                    tsVar.e = false;
                    tsVar.a.setAdapter(tsVar.c);
                    tsVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    dk dkVar2 = tsVar.d;
                    dkVar2.getClass();
                    if (obj6 == null) {
                        dkVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) dkVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        dkVar2.h = timer2;
                        timer2.schedule(new jg.q1(2, dkVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        tsVar.e = true;
                        break;
                    }
                }
                break;
            case 11:
                du duVar = (du) obj;
                duVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                duVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 12:
                bx bxVar = (bx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((jwVar = bxVar.D0) != null && (mm0Var = jwVar.e0) != null && mm0Var.M()) || bxVar.v3 || bxVar.L)) {
                    bxVar.m2 = true;
                    if (!bxVar.s3) {
                        bxVar.i5(true, false, true, false);
                    }
                }
                jw jwVar2 = bxVar.D0;
                if (jwVar2 != null) {
                    View currentView = jwVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(jwVar2.N0) ? true : !jwVar2.h0;
                    jwVar2.N0 = obj7;
                    jwVar2.N(currentView, jwVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 13:
                String obj8 = editText.getText().toString();
                n50 n50Var = (n50) obj;
                m50.E(n50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != n50Var.N) {
                    n50Var.N = z11;
                    ek0 ek0Var5 = n50Var.d;
                    if (ek0Var5 != null) {
                        ek0Var5.setAdapter(!isEmpty ? n50Var.f : n50Var.e);
                        break;
                    }
                }
                break;
            case 14:
                a60 a60Var = (a60) obj;
                if (editText.length() != 0) {
                    a60Var.y = true;
                    x50 x50Var = a60Var.s;
                    if (!x50Var.h) {
                        x50Var.h = true;
                        x50Var.f();
                    }
                    a60Var.s.E(editText.getText().toString());
                    a60Var.h.setFastScrollVisible(false);
                    a60Var.h.setVerticalScrollBarEnabled(true);
                    a60Var.r.e(true, true);
                    a60Var.r.setStickerType(1);
                    a60Var.r.d.setText(gd.N0(2131747974, null));
                    a60Var.r.e.setText(gd.N0(2131745611, null));
                    break;
                } else {
                    a60.d0(a60Var);
                    break;
                }
            case 15:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    ek0 ek0Var6 = languageSelectActivity.b;
                    if (ek0Var6 != null) {
                        ek0Var6.setAdapter(languageSelectActivity.c);
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
            case 16:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.v0 = true;
                        pa0Var.r.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.g5 g5Var = pa0Var.W;
                        if (g5Var != null) {
                            g5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.i0 adapter3 = pa0Var.S.getAdapter();
                        il ilVar2 = pa0Var.T;
                        if (adapter3 != ilVar2) {
                            pa0Var.S.setAdapter(ilVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        pa0Var.w0 = pa0Var.T.b() == 0;
                    } else {
                        org.telegram.ui.ActionBar.g5 g5Var2 = pa0Var.W;
                        if (g5Var2 != null) {
                            g5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.O0();
                    pa0Var.P0();
                    pa0Var.T.G(obj10);
                    break;
                }
                break;
            case 17:
                ((i90) ((e9) obj).b).j(editText.getText().toString());
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(gd.N0(2131747974, "NoResult"));
                            notificationsCustomSettingsActivity.c.b();
                            notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    break;
                }
                break;
            case 19:
                dn0 dn0Var = (dn0) obj;
                dn0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                dn0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 20:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 21:
                String obj12 = editText.getText().toString();
                ry0 ry0Var = (ry0) obj;
                if (obj12 == null) {
                    ry0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = ry0Var.f;
                    if (arrayList == null) {
                        ry0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < ry0Var.h.size(); i10++) {
                        r00 r00Var = (r00) ry0Var.h.get(i10);
                        if (r00Var.d.startsWith(lowerCase)) {
                            ry0Var.f.add(0, r00Var);
                        } else if (r00Var.d.contains(lowerCase)) {
                            ry0Var.f.add(r00Var);
                        }
                    }
                    ry0Var.c.f();
                }
                if (obj12.length() != 0) {
                    ek0 ek0Var7 = ry0Var.b;
                    if (ek0Var7 != null) {
                        ek0Var7.setAdapter(ry0Var.c);
                        break;
                    }
                } else if (ry0Var.b != null) {
                    ry0Var.d.setVisibility(8);
                    ry0Var.b.setAdapter(ry0Var.a);
                    break;
                }
                break;
            case 22:
                ((n31) obj).f.I(editText.getText().toString());
                break;
            case 23:
                String obj13 = editText.getText().toString();
                s91 s91Var = ((w91) obj).s0;
                if (!s91Var.e0.equals(obj13)) {
                    s91Var.K(s91Var.e[0], s91Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 24:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
                break;
        }
    }

    private final void q(jg.o0 o0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
