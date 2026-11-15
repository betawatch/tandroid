package kg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.g2;
import bi.t6;
import bi.v3;
import hi.l3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.v00;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.cu;
import org.telegram.ui.ev;
import org.telegram.ui.hw;
import org.telegram.ui.k31;
import org.telegram.ui.k50;
import org.telegram.ui.l50;
import org.telegram.ui.lb;
import org.telegram.ui.mq;
import org.telegram.ui.nw;
import org.telegram.ui.oy0;
import org.telegram.ui.pa0;
import org.telegram.ui.q91;
import org.telegram.ui.qq;
import org.telegram.ui.qv;
import org.telegram.ui.rc1;
import org.telegram.ui.so;
import org.telegram.ui.sq;
import org.telegram.ui.to;
import org.telegram.ui.ts;
import org.telegram.ui.u91;
import org.telegram.ui.v50;
import org.telegram.ui.xw;
import org.telegram.ui.y50;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
            case 11:
                yw ywVar = (yw) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = ywVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (ywVar.p2 == null) {
                    return true;
                }
                ywVar.finishFragment();
                return false;
            case 18:
                ((bn0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 11:
                yw ywVar = (yw) this.b;
                kVar = ((e2) ywVar).actionBar;
                return !kVar.x() && ywVar.S3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    d5 d5Var = profileActivity.U0;
                    d5Var.e.clearFocus();
                    org.telegram.messenger.g0.v1(d5Var.e);
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
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                rc1 rc1Var = wallpapersListActivity.I;
                rc1Var.n = null;
                rc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(hd.M0(2131745816, null));
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
                y1 y1Var = (y1) obj;
                y1Var.d = false;
                y1Var.e = null;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 1:
                lb lbVar = (lb) obj;
                lbVar.w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    break;
                }
                break;
            case 2:
                to toVar = (to) obj;
                toVar.e.F(null);
                toVar.O = false;
                toVar.getClass();
                toVar.b.setAdapter(toVar.a);
                toVar.a.f();
                toVar.b.setFastScrollVisible(true);
                toVar.b.setVerticalScrollBarEnabled(false);
                toVar.d.setShowAtCenter(false);
                toVar.d.b();
                break;
            case 3:
                qq qqVar = (qq) obj;
                qqVar.e.F(null);
                qqVar.o1 = false;
                di.c1 c1Var = qqVar.c;
                c1Var.X1 = false;
                c1Var.Y1 = 0;
                c1Var.setAdapter(qqVar.a);
                qqVar.a.f();
                qqVar.c.setFastScrollVisible(true);
                qqVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.n = null;
                v3 v3Var = sqVar.a;
                if (v3Var != null) {
                    v3Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                y7 y7Var = (y7) obj;
                if (y7Var.r1) {
                    y7Var.q1 = false;
                    y7Var.r1 = false;
                    y7Var.r0 = true;
                    y7Var.u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = y7Var.e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                dk dkVar = (dk) obj;
                dkVar.c0 = false;
                dkVar.H.setVisibility(0);
                rj rjVar = dkVar.r;
                v4.h0 adapter = rjVar.getAdapter();
                vj vjVar = dkVar.w;
                if (adapter != vjVar) {
                    rjVar.setAdapter(vjVar);
                }
                vjVar.f();
                dkVar.E.Y(null, true);
                break;
            case 7:
                dl dlVar = (dl) obj;
                dlVar.d0 = false;
                dlVar.e0 = false;
                dlVar.O.G(null);
                dlVar.j0();
                dlVar.M.setVisibility(0);
                dlVar.K.setVisibility(0);
                dlVar.N.setVisibility(8);
                dlVar.s.setVisibility(8);
                break;
            case 8:
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
            case 9:
                ts tsVar = (ts) obj;
                vj vjVar2 = tsVar.d;
                vjVar2.getClass();
                vjVar2.e = null;
                tsVar.f = false;
                tsVar.e = false;
                tsVar.a.setAdapter(tsVar.c);
                tsVar.a.setFastScrollVisible(true);
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().n(false);
                cuVar.b.getActionBar().n(false);
                break;
            case 11:
                yw ywVar = (yw) obj;
                nw nwVar = ywVar.Y;
                if (nwVar != null) {
                    ArrayList arrayList = nwVar.G;
                    if (!arrayList.isEmpty() && nwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((ev) nwVar.I).g((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                ywVar.l2 = false;
                ywVar.m2 = false;
                xw xwVar = ywVar.f0[0];
                if (xwVar != null) {
                    xwVar.a.setEmptyView(ywVar.Y2 == 0 ? xwVar.x : null);
                    ywVar.a5(false, false, true, false);
                }
                ywVar.m5(false, false);
                ns.e().k(ns.r4, Boolean.TRUE);
                ywVar.Y.setCloseButtonVisible(false);
                ywVar.l5(true);
                ywVar.N3();
                qVar = ((e2) ywVar).glassEngine;
                qVar.g();
                break;
            case 12:
                l50 l50Var = (l50) obj;
                if (l50Var.N) {
                    k50.E(l50Var.f, null);
                    l50Var.N = false;
                    l50Var.d.setAdapter(l50Var.e);
                    break;
                }
                break;
            case 13:
                y50.d0((y50) obj);
                break;
            case 14:
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
            case 15:
                pa0 pa0Var = (pa0) obj;
                pa0Var.u0 = false;
                pa0Var.v0 = false;
                pa0Var.T.G(null);
                pa0Var.L0();
                d5 d5Var = pa0Var.W;
                if (d5Var != null) {
                    d5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.K0(false);
                break;
            case 16:
                y80 y80Var = (y80) ((t6) obj).b;
                y80Var.y = false;
                y80Var.j(null);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(hd.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                oy0 oy0Var = (oy0) obj;
                oy0Var.f = null;
                if (oy0Var.b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.b.setAdapter(oy0Var.a);
                    break;
                }
                break;
            case 21:
                k31 k31Var = (k31) obj;
                k31Var.a.a(false, true);
                k31Var.o0(false, true);
                k31Var.c.g3.O(false);
                break;
            case 22:
                u91.f0((u91) obj, false);
                break;
            case 23:
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
        cm0 cm0Var;
        cm0 cm0Var2;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.d = true;
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 1:
                lb lbVar = (lb) obj;
                lbVar.J.setVisibility(8);
                lbVar.getClass();
                break;
            case 2:
                to toVar = (to) obj;
                toVar.O = true;
                toVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((qq) obj).o1 = true;
                break;
            case 5:
                y7 y7Var = (y7) obj;
                v4.b0 b0Var = y7Var.t1;
                int N0 = b0Var.N0();
                y7Var.m2 = N0;
                View m10 = b0Var.m(N0);
                y7Var.n2 = m10 == null ? 0 : m10.getTop();
                y7Var.r1 = true;
                y7Var.u0(false);
                y7Var.u1.f();
                org.telegram.ui.ActionBar.q0 q0Var = y7Var.e2;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                dk dkVar = (dk) obj;
                dkVar.c0 = true;
                dkVar.H.setVisibility(8);
                dkVar.b.h1(dkVar.G.getSearchField(), true);
                break;
            case 7:
                dl dlVar = (dl) obj;
                dlVar.d0 = true;
                dlVar.b.h1(dlVar.x.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.E = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ((ts) obj).f = true;
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().C();
                cuVar.b.getActionBar().C();
                cuVar.c.getSearchField().requestFocus();
                break;
            case 11:
                yw ywVar = (yw) obj;
                ywVar.l2 = true;
                org.telegram.ui.ActionBar.q0 q0Var2 = ywVar.F1;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(8);
                }
                ywVar.Y3();
                xw xwVar = ywVar.f0[0];
                if (xwVar != null) {
                    if (ywVar.p2 != null) {
                        xwVar.a.c1();
                        hw hwVar = ywVar.D0;
                        if (hwVar != null) {
                            di.c1 c1Var = hwVar.b0;
                            if (c1Var.h1) {
                                c1Var.h1 = false;
                                c1Var.K0(false);
                            }
                        }
                    }
                    if (!ywVar.n2) {
                        l3 l3Var = ywVar.q0;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = ywVar.r0;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                    }
                }
                qv qvVar = ywVar.F0;
                if (qvVar != null && qvVar.getPremiumHint() != null) {
                    ywVar.F0.getPremiumHint().f(true);
                }
                if (!ywVar.L) {
                    ywVar.O4(0.0f);
                }
                ywVar.m5(false, false);
                kVar = ((e2) ywVar).actionBar;
                kVar.setBackButtonContentDescription(hd.M0(2131754878, null));
                ns.e().k(ns.r4, new Object[0]);
                qVar = ((e2) ywVar).glassEngine;
                qVar.g();
                hw hwVar2 = ywVar.D0;
                if (hwVar2 != null && (cm0Var2 = hwVar2.e0) != null) {
                    cm0Var2.c = jg.e0.d;
                }
                if (hwVar2 == null || (cm0Var = hwVar2.e0) == null || !cm0Var.M()) {
                    ArrayList arrayList = (ArrayList) ywVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!ywVar.v3) {
                            break;
                        }
                    }
                }
                ywVar.m2 = true;
                if (!ywVar.s3) {
                    ywVar.a5(true, false, true, false);
                }
                ywVar.Y.setCloseButtonVisible(true);
                ywVar.l5(true);
                ywVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((pa0) obj).u0 = true;
                break;
            case 16:
                ((y80) ((t6) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                bn0 bn0Var = (bn0) obj;
                bn0Var.a.getActionBar().C();
                bn0Var.b.getActionBar().C();
                bn0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                k31 k31Var = (k31) obj;
                k31Var.a.a(true, true);
                k31Var.f.I("");
                k31Var.o0(false, true);
                k31Var.c.g3.O(false);
                break;
            case 22:
                u91 u91Var = (u91) obj;
                u91.f0(u91Var, true);
                q91 q91Var = u91Var.s0;
                if (!q91Var.e0.equals("")) {
                    q91Var.K(q91Var.e[0], q91Var.getCurrentPosition(), "", false);
                }
                u91Var.s0.setAlpha(0.0f);
                u91Var.s0.q0.e(true, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.I);
                wallpapersListActivity.G.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void j(jg.o0 o0Var) {
        switch (this.a) {
            case 6:
                dk dkVar = (dk) this.b;
                ck ckVar = dkVar.E;
                ckVar.S.remove(o0Var);
                ckVar.Y(dkVar.G.getSearchField().getText().toString(), false);
                ckVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                lb lbVar = (lb) this.b;
                lbVar.V = true;
                lbVar.w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                break;
            case 18:
                bn0 bn0Var = (bn0) this.b;
                bn0Var.a.getActionBar().B();
                bn0Var.b.getActionBar().B();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void l(EditText editText) {
        uj0 uj0Var;
        di.c1 c1Var;
        hw hwVar;
        cm0 cm0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.e = editText.getText().toString();
                y1Var.a.g3.O(true);
                y1Var.a.v0(0);
                break;
            case 2:
                to toVar = (to) obj;
                if (toVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (uj0Var = toVar.b) != null) {
                        v4.h0 adapter = uj0Var.getAdapter();
                        so soVar = toVar.e;
                        if (adapter != soVar) {
                            toVar.b.setAdapter(soVar);
                            toVar.e.f();
                            toVar.b.setFastScrollVisible(false);
                            toVar.b.setVerticalScrollBarEnabled(true);
                            toVar.d.b();
                        }
                    }
                    toVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                qq qqVar = (qq) obj;
                if (qqVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = qqVar.c.getAdapter() == null ? 0 : qqVar.c.getAdapter().b();
                    qqVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (c1Var = qqVar.c) != null) {
                        v4.h0 adapter2 = c1Var.getAdapter();
                        mq mqVar = qqVar.a;
                        if (adapter2 != mqVar) {
                            di.c1 c1Var2 = qqVar.c;
                            c1Var2.X1 = false;
                            c1Var2.Y1 = 0;
                            c1Var2.setAdapter(mqVar);
                            if (b10 == 0) {
                                qqVar.D0(0);
                            }
                        }
                    }
                    qqVar.D1.setVisibility(8);
                    qqVar.C1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.n = editText.getText().toString();
                v3 v3Var = sqVar.a;
                if (v3Var != null) {
                    v3Var.g3.O(true);
                    break;
                }
                break;
            case 5:
                y7 y7Var = (y7) obj;
                if (editText.length() > 0) {
                    y7Var.u1.E(editText.getText().toString());
                    break;
                } else {
                    y7Var.q1 = false;
                    y7Var.u1.E(null);
                    break;
                }
            case 6:
                ((dk) obj).E.Y(editText.getText().toString(), false);
                break;
            case 7:
                dl dlVar = (dl) obj;
                g2 g2Var = dlVar.K;
                di.c1 c1Var3 = dlVar.M;
                uj0 uj0Var2 = dlVar.N;
                bl blVar = dlVar.O;
                if (blVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        dlVar.e0 = true;
                        dlVar.x.setShowSearchProgress(true);
                        c1Var3.setVisibility(8);
                        g2Var.setVisibility(8);
                        if (uj0Var2.getAdapter() != blVar) {
                            uj0Var2.setAdapter(blVar);
                        }
                        uj0Var2.setVisibility(0);
                        dlVar.f0 = blVar.f.isEmpty();
                        dlVar.j0();
                    } else {
                        c1Var3.setVisibility(0);
                        g2Var.setVisibility(0);
                        uj0Var2.setAdapter(null);
                        uj0Var2.setVisibility(8);
                        dlVar.s.setVisibility(8);
                    }
                    blVar.G(obj4);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.c0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        uj0 uj0Var3 = contactsActivity.d;
                        if (uj0Var3 != null) {
                            uj0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        uj0 uj0Var4 = contactsActivity.d;
                        if (uj0Var4 != null) {
                            uj0Var4.setAdapter(contactsActivity.h);
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
            case 9:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    vj vjVar = tsVar.d;
                    vjVar.getClass();
                    vjVar.e = null;
                    tsVar.e = false;
                    tsVar.a.setAdapter(tsVar.c);
                    tsVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    vj vjVar2 = tsVar.d;
                    vjVar2.getClass();
                    if (obj6 == null) {
                        vjVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) vjVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        Timer timer2 = new Timer();
                        vjVar2.h = timer2;
                        timer2.schedule(new jg.q1(2, vjVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        tsVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cuVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                yw ywVar = (yw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((hwVar = ywVar.D0) != null && (cm0Var = hwVar.e0) != null && cm0Var.M()) || ywVar.v3 || ywVar.L)) {
                    ywVar.m2 = true;
                    if (!ywVar.s3) {
                        ywVar.a5(true, false, true, false);
                    }
                }
                hw hwVar2 = ywVar.D0;
                if (hwVar2 != null) {
                    View currentView = hwVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(hwVar2.N0) ? true : !hwVar2.h0;
                    hwVar2.N0 = obj7;
                    hwVar2.O(currentView, hwVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                l50 l50Var = (l50) obj;
                k50.E(l50Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != l50Var.N) {
                    l50Var.N = z11;
                    uj0 uj0Var5 = l50Var.d;
                    if (uj0Var5 != null) {
                        uj0Var5.setAdapter(!isEmpty ? l50Var.f : l50Var.e);
                        break;
                    }
                }
                break;
            case 13:
                y50 y50Var = (y50) obj;
                if (editText.length() != 0) {
                    y50Var.y = true;
                    v50 v50Var = y50Var.s;
                    if (!v50Var.h) {
                        v50Var.h = true;
                        v50Var.f();
                    }
                    y50Var.s.E(editText.getText().toString());
                    y50Var.h.setFastScrollVisible(false);
                    y50Var.h.setVerticalScrollBarEnabled(true);
                    y50Var.r.e(true, true);
                    y50Var.r.setStickerType(1);
                    y50Var.r.d.setText(hd.M0(2131748167, null));
                    y50Var.r.e.setText(hd.M0(2131745807, null));
                    break;
                } else {
                    y50.d0(y50Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    uj0 uj0Var6 = languageSelectActivity.b;
                    if (uj0Var6 != null) {
                        uj0Var6.setAdapter(languageSelectActivity.c);
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
            case 15:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.v0 = true;
                        pa0Var.r.setShowSearchProgress(true);
                        d5 d5Var = pa0Var.W;
                        if (d5Var != null) {
                            d5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.h0 adapter3 = pa0Var.S.getAdapter();
                        bl blVar2 = pa0Var.T;
                        if (adapter3 != blVar2) {
                            pa0Var.S.setAdapter(blVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        pa0Var.w0 = pa0Var.T.b() == 0;
                    } else {
                        d5 d5Var2 = pa0Var.W;
                        if (d5Var2 != null) {
                            d5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.L0();
                    pa0Var.M0();
                    pa0Var.T.G(obj10);
                    break;
                }
                break;
            case 16:
                ((y80) ((t6) obj).b).j(editText.getText().toString());
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(hd.M0(2131748167, "NoResult"));
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
            case 18:
                bn0 bn0Var = (bn0) obj;
                bn0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                bn0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                oy0 oy0Var = (oy0) obj;
                if (obj12 == null) {
                    oy0Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = oy0Var.f;
                    if (arrayList == null) {
                        oy0Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < oy0Var.h.size(); i10++) {
                        v00 v00Var = (v00) oy0Var.h.get(i10);
                        if (v00Var.d.startsWith(lowerCase)) {
                            oy0Var.f.add(0, v00Var);
                        } else if (v00Var.d.contains(lowerCase)) {
                            oy0Var.f.add(v00Var);
                        }
                    }
                    oy0Var.c.f();
                }
                if (obj12.length() != 0) {
                    uj0 uj0Var7 = oy0Var.b;
                    if (uj0Var7 != null) {
                        uj0Var7.setAdapter(oy0Var.c);
                        break;
                    }
                } else if (oy0Var.b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.b.setAdapter(oy0Var.a);
                    break;
                }
                break;
            case 21:
                ((k31) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                q91 q91Var = ((u91) obj).s0;
                if (!q91Var.e0.equals(obj13)) {
                    q91Var.K(q91Var.e[0], q91Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 23:
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
