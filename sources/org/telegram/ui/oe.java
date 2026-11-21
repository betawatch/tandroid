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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ oe(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = 2;
        org.telegram.messenger.fj fjVar = null;
        final int i12 = 0;
        final int i13 = 1;
        bn bnVar = this.b;
        switch (i10) {
            case 0:
                bn bnVar2 = this.b;
                ug.k0.x1(bnVar2, bnVar2.S1, bnVar2.T1, bnVar2.l6, false);
                break;
            case 1:
                bnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", bnVar.r);
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (bnVar.Z3 != null) {
                    bnVar.sc(!bnVar.gd.f);
                    break;
                }
                break;
            case 3:
                bnVar.Qb(!bnVar.D0.O);
                break;
            case 4:
                kj kjVar = bnVar.X1;
                if (kjVar != null) {
                    kjVar.setReversed(true);
                    bnVar.X1.getAdapter().l0 = true;
                    bnVar.B7();
                }
                bnVar.h3.setVisibility(8);
                bnVar.i3.setVisibility(8);
                bnVar.C3 = true;
                bnVar.D3 = null;
                bnVar.E3 = null;
                bnVar.k0.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745561, null));
                bnVar.k0.setSearchFieldCaption(org.telegram.messenger.gd.N0(2131745570, null));
                org.telegram.messenger.g0.I3(bnVar.k0.getSearchField());
                bnVar.k0.o();
                break;
            case 5:
                if (bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = bnVar.k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    bnVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.o(bnVar.getParentActivity(), new kk(bnVar), bnVar.Ba).b);
                    break;
                }
                break;
            case 6:
                bnVar.P7(true);
                break;
            case 7:
                org.telegram.messenger.fj fjVar2 = bnVar.v5;
                if (fjVar2 != null) {
                    bnVar.ma(fjVar2, false, false);
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(bnVar.v5.T0), true, false, false, null, null, false, bnVar.getMessagesController().g6, false, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.g0.g(bnVar.v5.W0)) {
                    org.telegram.messenger.n10.t(null, 2131743953, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.g0.g(bnVar.v5.X0)) {
                    org.telegram.messenger.n10.t(null, 2131743953, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba));
                    break;
                }
                break;
            case 10:
                if (bnVar.m1 != null && bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, bnVar.m1.getContext(), null, false);
                    Activity parentActivity = bnVar.getParentActivity();
                    zm zmVar = bnVar.Ba;
                    final ih0 ih0Var = new ih0(parentActivity, 9);
                    LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.gd.N0(2131745013, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i14 = org.telegram.ui.ActionBar.m6.G6;
                    org.telegram.ui.ActionBar.t6.U(textView, i14, zmVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(parentActivity, zmVar);
                    m80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.O0("SponsoredMessageInfo2Description1"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, zmVar);
                    org.telegram.ui.ActionBar.t6.U(m80Var, i14, zmVar);
                    m80Var.setTextSize(1, 14.0f);
                    m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    m80Var.setOnLinkPressListener(new org.telegram.ui.Components.l80() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.l80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.m80 m80Var2 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.O0("SponsoredMessageInfo2Description2"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.U(m80Var2, i14, zmVar);
                    m80Var2.setTextSize(1, 14.0f);
                    m80Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    m80Var2.setOnLinkPressListener(new org.telegram.ui.Components.l80() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.l80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.m80 m80Var3 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.O0("SponsoredMessageInfo2Description3"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.U(m80Var3, i14, zmVar);
                    m80Var3.setTextSize(1, 14.0f);
                    m80Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    final int i15 = 2;
                    m80Var3.setOnLinkPressListener(new org.telegram.ui.Components.l80() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.l80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.m6.Fi;
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(i16, zmVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(parentActivity, paint);
                    n2Var.setOnClickListener(new a8(parentActivity, 3));
                    n2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    n2Var.setText(org.telegram.messenger.gd.N0(2131745014, null));
                    org.telegram.ui.ActionBar.t6.U(n2Var, i16, zmVar);
                    int i17 = org.telegram.ui.ActionBar.m6.h5;
                    org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i17, zmVar), 4.0f);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
                    org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i17);
                    n2Var.setBackground(e10);
                    org.telegram.ui.ActionBar.t6.j(n2Var, e10, M, e11, zmVar);
                    n2Var.setTextSize(1, 14.0f);
                    n2Var.setGravity(16);
                    org.telegram.ui.Components.m80 m80Var4 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.O0("SponsoredMessageInfo2Description4"), zmVar, null));
                    m80Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.t6.U(m80Var4, i14, zmVar);
                    m80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(textView);
                    m80Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var, c8.ma.t(-1, -2, 0, 0, 18, 0, 0));
                    m80Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var2, c8.ma.t(-1, -2, 0, 0, 24, 0, 0));
                    m80Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var3, c8.ma.t(-1, -2, 0, 0, 24, 0, 0));
                    f10.addView(n2Var, c8.ma.t(-2, 34, 1, 22, 14, 22, 0));
                    m80Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var4, c8.ma.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(ih0Var.getContext());
                    scrollView.addView(f10);
                    ih0Var.addView(scrollView, c8.ma.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.O = ih0Var;
                    j3.show();
                    break;
                }
                break;
            case 11:
                bnVar.getClass();
                bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 28, true));
                break;
            case 12:
                bnVar.finishPreviewFragment();
                break;
            case 13:
                bn bnVar3 = this.b;
                org.telegram.ui.Components.c5.g0(bnVar3, bnVar3.l6, bnVar3.f, bnVar3.e, bnVar3.h, bnVar3.c2.getTag(R.id.object_tag) != null, bnVar3.r8, new cg(bnVar3, i11), bnVar3.Ba);
                break;
            case 14:
                bn.n0(bnVar);
                break;
            case 15:
                if (bnVar.r4 != null) {
                    org.telegram.messenger.e00 e00Var = bnVar.getMessagesController().t7;
                    long j10 = bnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = bnVar.r4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    e00Var.z(i18, j10, false);
                }
                bnVar.Ad();
                bnVar.Pc(false);
                bnVar.zd(true);
                break;
            case 16:
                long j11 = bnVar.l6;
                if (bnVar.h != null) {
                    j11 = bnVar.f.id;
                }
                bnVar.Cc = false;
                bnVar.getMessagesController().k2(j11, bnVar.f, bnVar.e);
                bnVar.zd(true);
                bnVar.Wc(true);
                break;
            case 17:
                bn bnVar4 = this.b;
                bnVar4.R4 = true;
                if (!bnVar4.fa() || bnVar4.x4) {
                    int i19 = bnVar4.Z4;
                    if (i19 != 0) {
                        if (!bnVar4.V4.isEmpty()) {
                            if (i19 == ((Integer) i5.c.h(1, bnVar4.V4)).intValue()) {
                                i12 = ((Integer) bnVar4.V4.get(0)).intValue() + 1;
                                bnVar4.c5 = true;
                            } else {
                                bnVar4.c5 = false;
                                i12 = i19 - 1;
                            }
                        }
                        bnVar4.b5 = i12;
                        if (!bnVar4.c5) {
                            i12 = -i12;
                        }
                        bnVar4.l(i19, 0, true, 0, true, i12);
                        bnVar4.cd();
                        break;
                    }
                } else {
                    bnVar4.l((int) bnVar4.s4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                bnVar.La(false);
                break;
            case 19:
                bn.t0(bnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", bnVar.a());
                bnVar.presentFragment(new dk(bundle2));
                break;
            case 21:
                bn.r1(bnVar);
                break;
            case 22:
                bn.Z0(bnVar);
                break;
            case 23:
                bn.L0(bnVar);
                break;
            case 24:
                bnVar.Ea(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = bnVar.o6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (fjVar == null && sparseArrayArr[i20].size() != 0) {
                        fjVar = (org.telegram.messenger.fj) bnVar.G6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    bnVar.p6[i20].clear();
                    bnVar.q6[i20].clear();
                }
                bnVar.B9();
                if (fjVar != null && ((i7 = fjVar.k.id) > 0 || (i7 < 0 && bnVar.h != null))) {
                    bnVar.ic(fjVar);
                }
                bnVar.gd(0, true);
                bnVar.Gd(false);
                bnVar.td();
                break;
            case 26:
                bn.N0(bnVar);
                break;
            case 27:
                bn bnVar5 = this.b;
                org.telegram.messenger.fj fjVar3 = bnVar5.H5;
                if (fjVar3 != null) {
                    bnVar5.l(fjVar3.e1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                bnVar.Oa(bnVar.ea() ? "" : null);
                break;
            default:
                bnVar.h8();
                bnVar.N3.m(bnVar.l6, org.telegram.messenger.gd.N0(2131752868, null), 18);
                break;
        }
    }
}
