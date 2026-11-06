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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        org.telegram.messenger.ij ijVar = null;
        final int i12 = 0;
        final int i13 = 1;
        an anVar = this.b;
        switch (i10) {
            case 0:
                an anVar2 = this.b;
                ug.i0.w1(anVar2, anVar2.R1, anVar2.S1, anVar2.j6, false);
                break;
            case 1:
                anVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", anVar.r);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (anVar.Y3 != null) {
                    anVar.oc(!anVar.cd.f);
                    break;
                }
                break;
            case 3:
                anVar.Mb(!anVar.C0.N);
                break;
            case 4:
                jj jjVar = anVar.W1;
                if (jjVar != null) {
                    jjVar.setReversed(true);
                    anVar.W1.getAdapter().k0 = true;
                    anVar.A7();
                }
                anVar.g3.setVisibility(8);
                anVar.h3.setVisibility(8);
                anVar.B3 = true;
                anVar.C3 = null;
                anVar.D3 = null;
                anVar.j0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745758, null));
                anVar.j0.setSearchFieldCaption(org.telegram.messenger.hd.M0(2131745767, null));
                org.telegram.messenger.g0.K3(anVar.j0.getSearchField());
                anVar.j0.n();
                break;
            case 5:
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.r0 r0Var = anVar.j0;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    anVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(anVar.getParentActivity(), new jk(anVar), anVar.xa).b);
                    break;
                }
                break;
            case 6:
                anVar.O7(true);
                break;
            case 7:
                org.telegram.messenger.ij ijVar2 = anVar.t5;
                if (ijVar2 != null) {
                    anVar.ja(ijVar2, false, false);
                    vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.t5.R0), true, false, false, null, null, false, anVar.getMessagesController().d6, false, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.g0.g(anVar.t5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.xa));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.g0.g(anVar.t5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.xa));
                    break;
                }
                break;
            case 10:
                if (anVar.l1 != null && anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, anVar.l1.getContext(), null, false);
                    Activity parentActivity = anVar.getParentActivity();
                    ym ymVar = anVar.xa;
                    final sq0 sq0Var = new sq0(parentActivity, 7);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.hd.M0(2131745255, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i14 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView, i14, ymVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(parentActivity, ymVar);
                    w70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description1"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, ymVar);
                    org.telegram.ui.ActionBar.r6.V(w70Var, i14, ymVar);
                    w70Var.setTextSize(1, 14.0f);
                    w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.o31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var2 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description2"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.V(w70Var2, i14, ymVar);
                    w70Var2.setTextSize(1, 14.0f);
                    w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var2.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.o31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var3 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description3"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.V(w70Var3, i14, ymVar);
                    w70Var3.setTextSize(1, 14.0f);
                    w70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    final int i15 = 2;
                    w70Var3.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.o31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.k6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i16, ymVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(parentActivity, paint);
                    m2Var.setOnClickListener(new z7(parentActivity, 3));
                    m2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    m2Var.setText(org.telegram.messenger.hd.M0(2131745256, null));
                    org.telegram.ui.ActionBar.r6.V(m2Var, i16, ymVar);
                    int i17 = org.telegram.ui.ActionBar.k6.h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i17, ymVar), 4.0f);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i17);
                    m2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.r6.k(m2Var, e11, N, f10, ymVar);
                    m2Var.setTextSize(1, 14.0f);
                    m2Var.setGravity(16);
                    org.telegram.ui.Components.w70 w70Var4 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description4"), ymVar, null));
                    w70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.V(w70Var4, i14, ymVar);
                    w70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    w70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var, c8.ha.t(-1, -2, 0, 0, 18, 0, 0));
                    w70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var2, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    w70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var3, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(m2Var, c8.ha.t(-2, 34, 1, 22, 14, 22, 0));
                    w70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var4, c8.ha.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(sq0Var.getContext());
                    scrollView.addView(e10);
                    sq0Var.addView(scrollView, c8.ha.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.N = sq0Var;
                    l10.show();
                    break;
                }
                break;
            case 11:
                anVar.finishPreviewFragment();
                break;
            case 12:
                anVar.getClass();
                anVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 28, true));
                break;
            case 13:
                an anVar3 = this.b;
                org.telegram.ui.Components.v4.g0(anVar3, anVar3.j6, anVar3.f, anVar3.e, anVar3.h, anVar3.b2.getTag(R.id.object_tag) != null, anVar3.p8, new fg(anVar3, i11), anVar3.xa);
                break;
            case 14:
                an.m0(anVar);
                break;
            case 15:
                if (anVar.q4 != null) {
                    org.telegram.messenger.k00 k00Var = anVar.getMessagesController().q7;
                    long j3 = anVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.q4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    k00Var.z(i18, j3, false);
                }
                anVar.wd();
                anVar.Lc(false);
                anVar.vd(true);
                break;
            case 16:
                long j10 = anVar.j6;
                if (anVar.h != null) {
                    j10 = anVar.f.id;
                }
                anVar.yc = false;
                anVar.getMessagesController().i2(j10, anVar.f, anVar.e);
                anVar.vd(true);
                anVar.Sc(true);
                break;
            case 17:
                an anVar4 = this.b;
                anVar4.P4 = true;
                if (!anVar4.da() || anVar4.v4) {
                    int i19 = anVar4.X4;
                    if (i19 != 0) {
                        if (!anVar4.T4.isEmpty()) {
                            if (i19 == ((Integer) jg.g.i(1, anVar4.T4)).intValue()) {
                                i12 = ((Integer) anVar4.T4.get(0)).intValue() + 1;
                                anVar4.a5 = true;
                            } else {
                                anVar4.a5 = false;
                                i12 = i19 - 1;
                            }
                        }
                        anVar4.Z4 = i12;
                        if (!anVar4.a5) {
                            i12 = -i12;
                        }
                        anVar4.l(i19, 0, true, 0, true, i12);
                        anVar4.Yc();
                        break;
                    }
                } else {
                    anVar4.l((int) anVar4.r4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                anVar.Ia(false);
                break;
            case 19:
                an.q0(anVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", anVar.a());
                anVar.presentFragment(new ck(bundle2));
                break;
            case 21:
                an.I0(anVar);
                break;
            case 22:
                an.o1(anVar);
                break;
            case 23:
                an.V0(anVar);
                break;
            case 24:
                anVar.Ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = anVar.m6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (ijVar == null && sparseArrayArr[i20].size() != 0) {
                        ijVar = (org.telegram.messenger.ij) anVar.E6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    anVar.n6[i20].clear();
                    anVar.o6[i20].clear();
                }
                anVar.z9();
                if (ijVar != null && ((i7 = ijVar.k.id) > 0 || (i7 < 0 && anVar.h != null))) {
                    anVar.ec(ijVar);
                }
                anVar.cd(0, true);
                anVar.Cd(false);
                anVar.pd();
                break;
            case 26:
                an.K0(anVar);
                break;
            case 27:
                an anVar5 = this.b;
                org.telegram.messenger.ij ijVar3 = anVar5.F5;
                if (ijVar3 != null) {
                    anVar5.l(ijVar3.f1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                anVar.La(anVar.ca() ? "" : null);
                break;
            default:
                anVar.f8();
                anVar.M3.m(anVar.j6, org.telegram.messenger.hd.M0(2131752880, null), 18);
                break;
        }
    }
}
