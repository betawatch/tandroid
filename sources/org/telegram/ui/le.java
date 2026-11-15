package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ le(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = 2;
        org.telegram.messenger.gj gjVar = null;
        final int i12 = 0;
        final int i13 = 1;
        an anVar = this.b;
        switch (i10) {
            case 0:
                an anVar2 = this.b;
                ug.j0.w1(anVar2, anVar2.S1, anVar2.T1, anVar2.k6, false);
                break;
            case 1:
                anVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", anVar.r);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (anVar.Z3 != null) {
                    anVar.sc(!anVar.fd.f);
                    break;
                }
                break;
            case 3:
                anVar.Qb(!anVar.D0.O);
                break;
            case 4:
                jj jjVar = anVar.X1;
                if (jjVar != null) {
                    jjVar.setReversed(true);
                    anVar.X1.getAdapter().l0 = true;
                    anVar.B7();
                }
                anVar.h3.setVisibility(8);
                anVar.i3.setVisibility(8);
                anVar.C3 = true;
                anVar.D3 = null;
                anVar.E3 = null;
                anVar.k0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745757, null));
                anVar.k0.setSearchFieldCaption(org.telegram.messenger.hd.M0(2131745766, null));
                org.telegram.messenger.g0.J3(anVar.k0.getSearchField());
                anVar.k0.o();
                break;
            case 5:
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = anVar.k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    anVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.o(anVar.getParentActivity(), new jk(anVar), anVar.Aa).b);
                    break;
                }
                break;
            case 6:
                anVar.P7(true);
                break;
            case 7:
                org.telegram.messenger.gj gjVar2 = anVar.u5;
                if (gjVar2 != null) {
                    anVar.ma(gjVar2, false, false);
                    vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.u5.T0), true, false, false, null, null, false, anVar.getMessagesController().e6, false, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.g0.g(anVar.u5.W0)) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.g0.g(anVar.u5.X0)) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa));
                    break;
                }
                break;
            case 10:
                if (anVar.m1 != null && anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, anVar.m1.getContext(), null, false);
                    Activity parentActivity = anVar.getParentActivity();
                    ym ymVar = anVar.Aa;
                    final eh0 eh0Var = new eh0(parentActivity, 9);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.hd.M0(2131745254, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i14 = org.telegram.ui.ActionBar.j6.G6;
                    org.telegram.ui.ActionBar.q6.U(textView, i14, ymVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(parentActivity, ymVar);
                    z70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description1"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, ymVar);
                    org.telegram.ui.ActionBar.q6.U(z70Var, i14, ymVar);
                    z70Var.setTextSize(1, 14.0f);
                    z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    z70Var.setOnLinkPressListener(new org.telegram.ui.Components.y70() { // from class: org.telegram.ui.m31
                        @Override // org.telegram.ui.Components.y70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.z70 z70Var2 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description2"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.U(z70Var2, i14, ymVar);
                    z70Var2.setTextSize(1, 14.0f);
                    z70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    z70Var2.setOnLinkPressListener(new org.telegram.ui.Components.y70() { // from class: org.telegram.ui.m31
                        @Override // org.telegram.ui.Components.y70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.z70 z70Var3 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description3"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.U(z70Var3, i14, ymVar);
                    z70Var3.setTextSize(1, 14.0f);
                    z70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    final int i15 = 2;
                    z70Var3.setOnLinkPressListener(new org.telegram.ui.Components.y70() { // from class: org.telegram.ui.m31
                        @Override // org.telegram.ui.Components.y70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.j6.Fi;
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(i16, ymVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(parentActivity, paint);
                    l2Var.setOnClickListener(new a8(parentActivity, 3));
                    l2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    l2Var.setText(org.telegram.messenger.hd.M0(2131745255, null));
                    org.telegram.ui.ActionBar.q6.U(l2Var, i16, ymVar);
                    int i17 = org.telegram.ui.ActionBar.j6.h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i17, ymVar), 4.0f);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                    org.telegram.ui.ActionBar.m6 e12 = org.telegram.ui.ActionBar.q6.e(i17);
                    l2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.q6.j(l2Var, e11, M, e12, ymVar);
                    l2Var.setTextSize(1, 14.0f);
                    l2Var.setGravity(16);
                    org.telegram.ui.Components.z70 z70Var4 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description4"), ymVar, null));
                    z70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.q6.U(z70Var4, i14, ymVar);
                    z70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    z70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var, c8.ja.t(-1, -2, 0, 0, 18, 0, 0));
                    z70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var2, c8.ja.t(-1, -2, 0, 0, 24, 0, 0));
                    z70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var3, c8.ja.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(l2Var, c8.ja.t(-2, 34, 1, 22, 14, 22, 0));
                    z70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var4, c8.ja.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(eh0Var.getContext());
                    scrollView.addView(e10);
                    eh0Var.addView(scrollView, c8.ja.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    k10.O = eh0Var;
                    k10.show();
                    break;
                }
                break;
            case 11:
                anVar.finishPreviewFragment();
                break;
            case 12:
                anVar.getClass();
                anVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 28, true));
                break;
            case 13:
                an anVar3 = this.b;
                org.telegram.ui.Components.t4.g0(anVar3, anVar3.k6, anVar3.f, anVar3.e, anVar3.h, anVar3.c2.getTag(R.id.object_tag) != null, anVar3.q8, new ag(anVar3, i11), anVar3.Aa);
                break;
            case 14:
                an.n0(anVar);
                break;
            case 15:
                if (anVar.r4 != null) {
                    org.telegram.messenger.h00 h00Var = anVar.getMessagesController().r7;
                    long j3 = anVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.r4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    h00Var.z(i18, j3, false);
                }
                anVar.Ad();
                anVar.Pc(false);
                anVar.zd(true);
                break;
            case 16:
                long j10 = anVar.k6;
                if (anVar.h != null) {
                    j10 = anVar.f.id;
                }
                anVar.Bc = false;
                anVar.getMessagesController().i2(j10, anVar.f, anVar.e);
                anVar.zd(true);
                anVar.Wc(true);
                break;
            case 17:
                an anVar4 = this.b;
                anVar4.Q4 = true;
                if (!anVar4.fa() || anVar4.w4) {
                    int i19 = anVar4.Y4;
                    if (i19 != 0) {
                        if (!anVar4.U4.isEmpty()) {
                            if (i19 == ((Integer) i5.c.h(1, anVar4.U4)).intValue()) {
                                i12 = ((Integer) anVar4.U4.get(0)).intValue() + 1;
                                anVar4.b5 = true;
                            } else {
                                anVar4.b5 = false;
                                i12 = i19 - 1;
                            }
                        }
                        anVar4.a5 = i12;
                        if (!anVar4.b5) {
                            i12 = -i12;
                        }
                        anVar4.l(i19, 0, true, 0, true, i12);
                        anVar4.cd();
                        break;
                    }
                } else {
                    anVar4.l((int) anVar4.s4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                anVar.La(false);
                break;
            case 19:
                an.t0(anVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", anVar.a());
                anVar.presentFragment(new ck(bundle2));
                break;
            case 21:
                an.L0(anVar);
                break;
            case 22:
                an.r1(anVar);
                break;
            case 23:
                an.Z0(anVar);
                break;
            case 24:
                anVar.Ea(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = anVar.n6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (gjVar == null && sparseArrayArr[i20].size() != 0) {
                        gjVar = (org.telegram.messenger.gj) anVar.F6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    anVar.o6[i20].clear();
                    anVar.p6[i20].clear();
                }
                anVar.B9();
                if (gjVar != null && ((i7 = gjVar.k.id) > 0 || (i7 < 0 && anVar.h != null))) {
                    anVar.ic(gjVar);
                }
                anVar.gd(0, true);
                anVar.Gd(false);
                anVar.td();
                break;
            case 26:
                an.N0(anVar);
                break;
            case 27:
                an anVar5 = this.b;
                org.telegram.messenger.gj gjVar3 = anVar5.G5;
                if (gjVar3 != null) {
                    anVar5.l(gjVar3.e1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                anVar.Oa(anVar.ea() ? "" : null);
                break;
            default:
                anVar.h8();
                anVar.N3.m(anVar.k6, org.telegram.messenger.hd.M0(2131752880, null), 18);
                break;
        }
    }
}
