package ag;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.n10;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.c51;
import org.telegram.ui.cv;
import org.telegram.ui.e01;
import org.telegram.ui.hw;
import org.telegram.ui.i60;
import org.telegram.ui.j60;
import org.telegram.ui.jb1;
import org.telegram.ui.jx;
import org.telegram.ui.lr;
import org.telegram.ui.mo0;
import org.telegram.ui.nb1;
import org.telegram.ui.ne1;
import org.telegram.ui.ox;
import org.telegram.ui.pp;
import org.telegram.ui.pr;
import org.telegram.ui.qp;
import org.telegram.ui.qt;
import org.telegram.ui.rr;
import org.telegram.ui.sb;
import org.telegram.ui.tw;
import org.telegram.ui.u60;
import org.telegram.ui.x60;
import org.telegram.ui.xb0;
import org.telegram.ui.yx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l3 extends org.telegram.ui.ActionBar.p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public boolean b() {
        switch (this.a) {
            case 11:
                zx zxVar = (zx) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = zxVar.D1;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                if (zxVar.n2 == null) {
                    return true;
                }
                zxVar.finishFragment();
                return false;
            case 18:
                ((mo0) this.b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 11:
                zx zxVar = (zx) this.b;
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                return !lVar.u() && zxVar.Q3 == null;
            default:
                return super.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z10 = profileActivity.V1;
                profileActivity.V1 = !z10;
                if (z10) {
                    p5 p5Var = profileActivity.T0;
                    p5Var.e.clearFocus();
                    org.telegram.messenger.i0.v1(p5Var.e);
                }
                if (profileActivity.V1) {
                    profileActivity.T0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.V1);
            default:
                return super.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void f() {
        switch (this.a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                ne1 ne1Var = wallpapersListActivity.H;
                ne1Var.n = null;
                ne1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(dd.L0(2131745833, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void h() {
        ei.r rVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.d = false;
                m3Var.e = null;
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.v0 = "";
                sbVar.I.setVisibility(0);
                if (sbVar.U) {
                    sbVar.U = false;
                    sbVar.Z0(true);
                    break;
                }
                break;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.e.F(null);
                qpVar.N = false;
                qpVar.getClass();
                qpVar.b.setAdapter(qpVar.a);
                qpVar.a.f();
                qpVar.b.setFastScrollVisible(true);
                qpVar.b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                qpVar.d.b();
                break;
            case 3:
                pr prVar = (pr) obj;
                prVar.e.F(null);
                prVar.n1 = false;
                b1 b1Var = prVar.c;
                b1Var.W1 = false;
                b1Var.X1 = 0;
                b1Var.setAdapter(prVar.a);
                prVar.a.f();
                prVar.c.setFastScrollVisible(true);
                prVar.c.setVerticalScrollBarEnabled(false);
                break;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.n = null;
                ii iiVar = rrVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            case 5:
                w7 w7Var = (w7) obj;
                if (w7Var.n1) {
                    w7Var.m1 = false;
                    w7Var.n1 = false;
                    w7Var.q0 = true;
                    w7Var.q1.E(null);
                    org.telegram.ui.ActionBar.t0 t0Var = w7Var.a2;
                    if (t0Var != null) {
                        t0Var.setVisibility(0);
                        break;
                    }
                }
                break;
            case 6:
                xj xjVar = (xj) obj;
                xjVar.b0 = false;
                xjVar.G.setVisibility(0);
                lj ljVar = xjVar.r;
                s4.g0 adapter = ljVar.getAdapter();
                pj pjVar = xjVar.w;
                if (adapter != pjVar) {
                    ljVar.setAdapter(pjVar);
                }
                pjVar.f();
                xjVar.D.Y(null, true);
                break;
            case 7:
                bl blVar = (bl) obj;
                blVar.i0 = false;
                blVar.j0 = false;
                blVar.P.G(null, null);
                blVar.i0();
                blVar.N.setVisibility(0);
                blVar.L.setVisibility(0);
                blVar.O.setVisibility(8);
                blVar.w.setVisibility(8);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.b0 = null;
                contactsActivity.D = false;
                contactsActivity.y = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                qt qtVar = (qt) obj;
                pj pjVar2 = qtVar.d;
                pjVar2.getClass();
                pjVar2.e = null;
                qtVar.f = false;
                qtVar.e = false;
                qtVar.a.setAdapter(qtVar.c);
                qtVar.a.setFastScrollVisible(true);
                break;
            case 10:
                cv cvVar = (cv) obj;
                cvVar.a.getActionBar().k(false);
                cvVar.b.getActionBar().k(false);
                break;
            case 11:
                zx zxVar = (zx) obj;
                ox oxVar = zxVar.X;
                if (oxVar != null) {
                    ArrayList arrayList = oxVar.F;
                    if (!arrayList.isEmpty() && oxVar.H != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((zf.e0) arrayList.get(i11)).h) {
                                ((hw) oxVar.H).h((zf.e0) arrayList.get(i11));
                            }
                        }
                    }
                }
                zxVar.j2 = false;
                zxVar.k2 = false;
                yx yxVar = zxVar.e0[0];
                if (yxVar != null) {
                    yxVar.a.setEmptyView(zxVar.W2 == 0 ? yxVar.x : null);
                    zxVar.a5(false, false, true, false);
                }
                zxVar.m5(false, false);
                at.e().k(at.r4, Boolean.TRUE);
                zxVar.X.setCloseButtonVisible(false);
                zxVar.l5(true);
                zxVar.N3();
                rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
                rVar.g();
                break;
            case 12:
                j60 j60Var = (j60) obj;
                if (j60Var.M) {
                    i60.E(j60Var.f, null);
                    j60Var.M = false;
                    j60Var.d.setAdapter(j60Var.e);
                    break;
                }
                break;
            case 13:
                x60.d0((x60) obj);
                break;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.n0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    break;
                }
                break;
            case 15:
                xb0 xb0Var = (xb0) obj;
                xb0Var.z0 = false;
                xb0Var.A0 = false;
                xb0Var.U.G(null, null);
                xb0Var.Q0();
                p5 p5Var = xb0Var.X;
                if (p5Var != null) {
                    p5Var.setVisibility(0);
                }
                xb0Var.S.setVisibility(0);
                xb0Var.Q.setVisibility(0);
                xb0Var.T.setAdapter(null);
                xb0Var.T.setVisibility(8);
                xb0Var.P0(false);
                break;
            case 16:
                o90 o90Var = (o90) ((kg.q1) obj).b;
                o90Var.y = false;
                o90Var.j(null);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.c.setText(dd.L0(2131748228, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                break;
            case 20:
                e01 e01Var = (e01) obj;
                e01Var.f = null;
                if (e01Var.b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.b.setAdapter(e01Var.a);
                    break;
                }
                break;
            case 21:
                c51 c51Var = (c51) obj;
                c51Var.a.a(false, true);
                c51Var.o0(false, true);
                c51Var.c.f3.O(false);
                break;
            case 22:
                nb1.f0((nb1) obj, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
                wallpapersListActivity.F.invalidate();
                wallpapersListActivity.H.E(null, true);
                wallpapersListActivity.J.setSearchFieldCaption(null);
                f();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r6.K == false) goto L77;
     */
    @Override // org.telegram.ui.ActionBar.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        org.telegram.ui.ActionBar.l lVar;
        ei.r rVar;
        an0 an0Var;
        an0 an0Var2;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.d = true;
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.I.setVisibility(8);
                sbVar.getClass();
                break;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.N = true;
                qpVar.d.setShowAtCenter(true);
                break;
            case 3:
                ((pr) obj).n1 = true;
                break;
            case 5:
                w7 w7Var = (w7) obj;
                s4.a0 a0Var = w7Var.p1;
                int N0 = a0Var.N0();
                w7Var.i2 = N0;
                View m10 = a0Var.m(N0);
                w7Var.j2 = m10 == null ? 0 : m10.getTop();
                w7Var.n1 = true;
                w7Var.u0(false);
                w7Var.q1.f();
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.a2;
                if (t0Var != null) {
                    t0Var.setVisibility(8);
                    break;
                }
                break;
            case 6:
                xj xjVar = (xj) obj;
                xjVar.b0 = true;
                xjVar.G.setVisibility(8);
                xjVar.b.g1(xjVar.F.getSearchField(), true);
                break;
            case 7:
                bl blVar = (bl) obj;
                blVar.i0 = true;
                blVar.b.g1(blVar.y.getSearchField(), true);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.D = true;
                ContactsActivity.g0(contactsActivity);
                break;
            case 9:
                ((qt) obj).f = true;
                break;
            case 10:
                cv cvVar = (cv) obj;
                cvVar.a.getActionBar().A();
                cvVar.b.getActionBar().A();
                cvVar.c.getSearchField().requestFocus();
                break;
            case 11:
                zx zxVar = (zx) obj;
                zxVar.j2 = true;
                org.telegram.ui.ActionBar.t0 t0Var2 = zxVar.D1;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(8);
                }
                zxVar.Y3();
                yx yxVar = zxVar.e0[0];
                if (yxVar != null) {
                    if (zxVar.n2 != null) {
                        yxVar.a.c1();
                        jx jxVar = zxVar.C0;
                        if (jxVar != null) {
                            b1 b1Var = jxVar.a0;
                            if (b1Var.g1) {
                                b1Var.g1 = false;
                                b1Var.K0(false);
                            }
                        }
                    }
                    if (!zxVar.l2) {
                        vh.p2 p2Var = zxVar.p0;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        vh.p2 p2Var2 = zxVar.q0;
                        if (p2Var2 != null) {
                            p2Var2.e(true);
                        }
                    }
                }
                tw twVar = zxVar.E0;
                if (twVar != null && twVar.getPremiumHint() != null) {
                    zxVar.E0.getPremiumHint().e(true);
                }
                if (!zxVar.K) {
                    zxVar.O4(0.0f);
                }
                zxVar.m5(false, false);
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                lVar.setBackButtonContentDescription(dd.L0(2131754878, null));
                at.e().k(at.r4, new Object[0]);
                rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
                rVar.g();
                jx jxVar2 = zxVar.C0;
                if (jxVar2 != null && (an0Var2 = jxVar2.d0) != null) {
                    an0Var2.c = zf.w.d;
                }
                if (jxVar2 == null || (an0Var = jxVar2.d0) == null || !an0Var.M()) {
                    ArrayList arrayList = (ArrayList) zxVar.getMessagesController().w.get(0);
                    if ((arrayList != null ? arrayList.size() : 0) <= 10) {
                        if (!zxVar.t3) {
                            break;
                        }
                    }
                }
                zxVar.k2 = true;
                if (!zxVar.q3) {
                    zxVar.a5(true, false, true, false);
                }
                zxVar.X.setCloseButtonVisible(true);
                zxVar.l5(true);
                zxVar.N3();
                break;
            case 14:
                ((LanguageSelectActivity) obj).getClass();
                break;
            case 15:
                ((xb0) obj).z0 = true;
                break;
            case 16:
                ((o90) ((kg.q1) obj).b).y = true;
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.f = true;
                notificationsCustomSettingsActivity.c.setShowAtCenter(true);
                break;
            case 18:
                mo0 mo0Var = (mo0) obj;
                mo0Var.a.getActionBar().A();
                mo0Var.b.getActionBar().A();
                mo0Var.c.getSearchField().requestFocus();
                break;
            case 21:
                c51 c51Var = (c51) obj;
                c51Var.a.a(true, true);
                c51Var.f.I("");
                c51Var.o0(false, true);
                c51Var.c.f3.O(false);
                break;
            case 22:
                nb1 nb1Var = (nb1) obj;
                nb1.f0(nb1Var, true);
                jb1 jb1Var = nb1Var.r0;
                if (!jb1Var.d0.equals("")) {
                    jb1Var.M(jb1Var.e[0], jb1Var.getCurrentPosition(), "", false);
                }
                nb1Var.r0.setAlpha(0.0f);
                nb1Var.r0.p0.e(true, false);
                break;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.F.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void j(zf.e0 e0Var) {
        switch (this.a) {
            case 6:
                xj xjVar = (xj) this.b;
                wj wjVar = xjVar.D;
                wjVar.R.remove(e0Var);
                wjVar.Y(xjVar.F.getSearchField().getText().toString(), false);
                wjVar.a0(null, null, true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                sb sbVar = (sb) this.b;
                sbVar.U = true;
                sbVar.v0 = editTextBoldCursor.getText().toString();
                sbVar.Z0(true);
                break;
            case 18:
                mo0 mo0Var = (mo0) this.b;
                mo0Var.a.getActionBar().z();
                mo0Var.b.getActionBar().z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void l(EditText editText) {
        uk0 uk0Var;
        b1 b1Var;
        jx jxVar;
        an0 an0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.e = editText.getText().toString();
                m3Var.a.f3.O(true);
                m3Var.a.v0(0);
                break;
            case 2:
                qp qpVar = (qp) obj;
                if (qpVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (uk0Var = qpVar.b) != null) {
                        s4.g0 adapter = uk0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.b.setAdapter(ppVar);
                            qpVar.e.f();
                            qpVar.b.setFastScrollVisible(false);
                            qpVar.b.setVerticalScrollBarEnabled(true);
                            qpVar.d.b();
                        }
                    }
                    qpVar.e.F(obj2);
                    break;
                }
                break;
            case 3:
                pr prVar = (pr) obj;
                if (prVar.e != null) {
                    String obj3 = editText.getText().toString();
                    int b10 = prVar.c.getAdapter() == null ? 0 : prVar.c.getAdapter().b();
                    prVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = prVar.c) != null) {
                        s4.g0 adapter2 = b1Var.getAdapter();
                        lr lrVar = prVar.a;
                        if (adapter2 != lrVar) {
                            b1 b1Var2 = prVar.c;
                            b1Var2.W1 = false;
                            b1Var2.X1 = 0;
                            b1Var2.setAdapter(lrVar);
                            if (b10 == 0) {
                                prVar.D0(0);
                            }
                        }
                    }
                    prVar.C1.setVisibility(8);
                    prVar.B1.setVisibility(0);
                    break;
                }
                break;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.n = editText.getText().toString();
                ii iiVar = rrVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            case 5:
                w7 w7Var = (w7) obj;
                if (editText.length() > 0) {
                    w7Var.q1.E(editText.getText().toString());
                    break;
                } else {
                    w7Var.m1 = false;
                    w7Var.q1.E(null);
                    break;
                }
            case 6:
                ((xj) obj).D.Y(editText.getText().toString(), false);
                break;
            case 7:
                bl blVar = (bl) obj;
                jg.l0 l0Var = blVar.L;
                b1 b1Var3 = blVar.N;
                uk0 uk0Var2 = blVar.O;
                vk vkVar = blVar.P;
                if (vkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        blVar.j0 = true;
                        blVar.y.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        l0Var.setVisibility(8);
                        if (uk0Var2.getAdapter() != vkVar) {
                            uk0Var2.setAdapter(vkVar);
                        }
                        uk0Var2.setVisibility(0);
                        blVar.k0 = vkVar.s.size() == 0 && vkVar.r.size() == 0;
                        blVar.i0();
                    } else {
                        b1Var3.setVisibility(0);
                        l0Var.setVisibility(0);
                        uk0Var2.setAdapter(null);
                        uk0Var2.setVisibility(8);
                        blVar.w.setVisibility(8);
                    }
                    vkVar.G(obj4, blVar.o0);
                    break;
                }
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.b0 = obj5;
                    if (obj5.isEmpty()) {
                        contactsActivity.y = false;
                        contactsActivity.h.G(null);
                        uk0 uk0Var3 = contactsActivity.d;
                        if (uk0Var3 != null) {
                            uk0Var3.setAdapter(contactsActivity.b);
                            contactsActivity.d.setSectionsType(1);
                            contactsActivity.d.setFastScrollVisible(true);
                            contactsActivity.d.setVerticalScrollBarEnabled(false);
                            break;
                        }
                    } else {
                        contactsActivity.y = true;
                        uk0 uk0Var4 = contactsActivity.d;
                        if (uk0Var4 != null) {
                            uk0Var4.setAdapter(contactsActivity.h);
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
                qt qtVar = (qt) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    pj pjVar = qtVar.d;
                    pjVar.getClass();
                    pjVar.e = null;
                    qtVar.e = false;
                    qtVar.a.setAdapter(qtVar.c);
                    qtVar.a.setFastScrollVisible(true);
                    break;
                } else {
                    pj pjVar2 = qtVar.d;
                    pjVar2.getClass();
                    if (obj6 == null) {
                        pjVar2.e = null;
                    } else {
                        try {
                            Timer timer = (Timer) pjVar2.h;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                        Timer timer2 = new Timer();
                        pjVar2.h = timer2;
                        timer2.schedule(new we(r4 ? 1 : 0, pjVar2, obj6), 100L, 300L);
                    }
                    if (obj6.length() != 0) {
                        qtVar.e = true;
                        break;
                    }
                }
                break;
            case 10:
                cv cvVar = (cv) obj;
                cvVar.a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 11:
                zx zxVar = (zx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((jxVar = zxVar.C0) != null && (an0Var = jxVar.d0) != null && an0Var.M()) || zxVar.t3 || zxVar.K)) {
                    zxVar.k2 = true;
                    if (!zxVar.q3) {
                        zxVar.a5(true, false, true, false);
                    }
                }
                jx jxVar2 = zxVar.C0;
                if (jxVar2 != null) {
                    View currentView = jxVar2.getCurrentView();
                    boolean z10 = TextUtils.isEmpty(jxVar2.M0) ? true : !jxVar2.g0;
                    jxVar2.M0 = obj7;
                    jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj7, z10);
                    break;
                }
                break;
            case 12:
                String obj8 = editText.getText().toString();
                j60 j60Var = (j60) obj;
                i60.E(j60Var.f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != j60Var.M) {
                    j60Var.M = z11;
                    uk0 uk0Var5 = j60Var.d;
                    if (uk0Var5 != null) {
                        uk0Var5.setAdapter(!isEmpty ? j60Var.f : j60Var.e);
                        break;
                    }
                }
                break;
            case 13:
                x60 x60Var = (x60) obj;
                if (editText.length() != 0) {
                    x60Var.y = true;
                    u60 u60Var = x60Var.s;
                    if (!u60Var.h) {
                        u60Var.h = true;
                        u60Var.f();
                    }
                    x60Var.s.E(editText.getText().toString());
                    x60Var.h.setFastScrollVisible(false);
                    x60Var.h.setVerticalScrollBarEnabled(true);
                    x60Var.r.e(true, true);
                    x60Var.r.setStickerType(1);
                    x60Var.r.d.setText(dd.L0(2131748183, null));
                    x60Var.r.e.setText(dd.L0(2131745824, null));
                    break;
                } else {
                    x60.d0(x60Var);
                    break;
                }
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.n0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    uk0 uk0Var6 = languageSelectActivity.b;
                    if (uk0Var6 != null) {
                        uk0Var6.setAdapter(languageSelectActivity.c);
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
                xb0 xb0Var = (xb0) obj;
                if (xb0Var.U != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        xb0Var.A0 = true;
                        xb0Var.s.setShowSearchProgress(true);
                        p5 p5Var = xb0Var.X;
                        if (p5Var != null) {
                            p5Var.setVisibility(8);
                        }
                        xb0Var.S.setVisibility(8);
                        xb0Var.Q.setVisibility(8);
                        s4.g0 adapter3 = xb0Var.T.getAdapter();
                        vk vkVar2 = xb0Var.U;
                        if (adapter3 != vkVar2) {
                            xb0Var.T.setAdapter(vkVar2);
                        }
                        xb0Var.T.setVisibility(0);
                        xb0Var.B0 = xb0Var.U.b() == 0;
                    } else {
                        p5 p5Var2 = xb0Var.X;
                        if (p5Var2 != null) {
                            p5Var2.setVisibility(0);
                        }
                        xb0Var.S.setVisibility(0);
                        xb0Var.Q.setVisibility(0);
                        xb0Var.T.setAdapter(null);
                        xb0Var.T.setVisibility(8);
                    }
                    xb0Var.Q0();
                    xb0Var.R0();
                    xb0Var.U.G(obj10, xb0Var.F0);
                    break;
                }
                break;
            case 16:
                ((o90) ((kg.q1) obj).b).j(editText.getText().toString());
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.a != null) {
                            notificationsCustomSettingsActivity.c.setText(dd.L0(2131748183, "NoResult"));
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
                mo0 mo0Var = (mo0) obj;
                mo0Var.a.getActionBar().setSearchFieldText(editText.getText().toString());
                mo0Var.b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                break;
            case 20:
                String obj12 = editText.getText().toString();
                e01 e01Var = (e01) obj;
                if (obj12 == null) {
                    e01Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = e01Var.f;
                    if (arrayList == null) {
                        e01Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e01Var.h.size(); i11++) {
                        n10 n10Var = (n10) e01Var.h.get(i11);
                        if (n10Var.d.startsWith(lowerCase)) {
                            e01Var.f.add(0, n10Var);
                        } else if (n10Var.d.contains(lowerCase)) {
                            e01Var.f.add(n10Var);
                        }
                    }
                    e01Var.c.f();
                }
                if (obj12.length() != 0) {
                    uk0 uk0Var7 = e01Var.b;
                    if (uk0Var7 != null) {
                        uk0Var7.setAdapter(e01Var.c);
                        break;
                    }
                } else if (e01Var.b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.b.setAdapter(e01Var.a);
                    break;
                }
                break;
            case 21:
                ((c51) obj).f.I(editText.getText().toString());
                break;
            case 22:
                String obj13 = editText.getText().toString();
                jb1 jb1Var = ((nb1) obj).r0;
                if (!jb1Var.d0.equals(obj13)) {
                    jb1Var.M(jb1Var.e[0], jb1Var.getCurrentPosition(), obj13, false);
                    break;
                }
                break;
            case 23:
                ((WallpapersListActivity) obj).H.E(editText.getText().toString(), false);
                break;
        }
    }

    private final void q(zf.e0 e0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
