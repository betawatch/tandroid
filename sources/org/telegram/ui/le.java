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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ le(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = 2;
        org.telegram.messenger.ij ijVar = null;
        final int i12 = 0;
        final int i13 = 1;
        cn cnVar = this.b;
        switch (i10) {
            case 0:
                cn cnVar2 = this.b;
                ug.i0.w1(cnVar2, cnVar2.R1, cnVar2.S1, cnVar2.j6, false);
                break;
            case 1:
                cnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", cnVar.r);
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (cnVar.Y3 != null) {
                    cnVar.rc(!cnVar.ed.f);
                    break;
                }
                break;
            case 3:
                cnVar.Pb(!cnVar.C0.N);
                break;
            case 4:
                lj ljVar = cnVar.W1;
                if (ljVar != null) {
                    ljVar.setReversed(true);
                    cnVar.W1.getAdapter().k0 = true;
                    cnVar.B7();
                }
                cnVar.g3.setVisibility(8);
                cnVar.h3.setVisibility(8);
                cnVar.B3 = true;
                cnVar.C3 = null;
                cnVar.D3 = null;
                cnVar.j0.setSearchFieldHint(org.telegram.messenger.id.M0(2131745757, null));
                cnVar.j0.setSearchFieldCaption(org.telegram.messenger.id.M0(2131745766, null));
                org.telegram.messenger.g0.K3(cnVar.j0.getSearchField());
                cnVar.j0.n();
                break;
            case 5:
                if (cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.r0 r0Var = cnVar.j0;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    cnVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.o(cnVar.getParentActivity(), new lk(cnVar), cnVar.za).b);
                    break;
                }
                break;
            case 6:
                cnVar.P7(true);
                break;
            case 7:
                org.telegram.messenger.ij ijVar2 = cnVar.t5;
                if (ijVar2 != null) {
                    cnVar.la(ijVar2, false, false);
                    vf.c.s(cnVar.getParentActivity(), Uri.parse(cnVar.t5.R0), true, false, false, null, null, false, cnVar.getMessagesController().d6, false, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.g0.g(cnVar.t5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.za));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.g0.g(cnVar.t5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.za));
                    break;
                }
                break;
            case 10:
                if (cnVar.l1 != null && cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, cnVar.l1.getContext(), null, false);
                    Activity parentActivity = cnVar.getParentActivity();
                    an anVar = cnVar.za;
                    final vq0 vq0Var = new vq0(parentActivity, 7);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.id.M0(2131745254, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i14 = org.telegram.ui.ActionBar.m6.G6;
                    org.telegram.ui.ActionBar.t6.U(textView, i14, anVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(parentActivity, anVar);
                    w70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description1"), anVar, null));
                    org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, anVar);
                    org.telegram.ui.ActionBar.t6.U(w70Var, i14, anVar);
                    w70Var.setTextSize(1, 14.0f);
                    w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var2 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description2"), anVar, null));
                    org.telegram.ui.ActionBar.t6.U(w70Var2, i14, anVar);
                    w70Var2.setTextSize(1, 14.0f);
                    w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var2.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var3 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description3"), anVar, null));
                    org.telegram.ui.ActionBar.t6.U(w70Var3, i14, anVar);
                    w70Var3.setTextSize(1, 14.0f);
                    w70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    final int i15 = 2;
                    w70Var3.setOnLinkPressListener(new org.telegram.ui.Components.v70() { // from class: org.telegram.ui.q31
                        @Override // org.telegram.ui.Components.v70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(vq0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.m6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(i16, anVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(parentActivity, paint);
                    n2Var.setOnClickListener(new z7(parentActivity, 3));
                    n2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    n2Var.setText(org.telegram.messenger.id.M0(2131745255, null));
                    org.telegram.ui.ActionBar.t6.U(n2Var, i16, anVar);
                    int i17 = org.telegram.ui.ActionBar.m6.h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(i17, anVar), 4.0f);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
                    org.telegram.ui.ActionBar.p6 e12 = org.telegram.ui.ActionBar.t6.e(i17);
                    n2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.t6.j(n2Var, e11, M, e12, anVar);
                    n2Var.setTextSize(1, 14.0f);
                    n2Var.setGravity(16);
                    org.telegram.ui.Components.w70 w70Var4 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description4"), anVar, null));
                    w70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.t6.U(w70Var4, i14, anVar);
                    w70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    w70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var, c8.ha.t(-1, -2, 0, 0, 18, 0, 0));
                    w70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var2, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    w70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var3, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(n2Var, c8.ha.t(-2, 34, 1, 22, 14, 22, 0));
                    w70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var4, c8.ha.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(vq0Var.getContext());
                    scrollView.addView(e10);
                    vq0Var.addView(scrollView, c8.ha.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.N = vq0Var;
                    l10.show();
                    break;
                }
                break;
            case 11:
                cnVar.finishPreviewFragment();
                break;
            case 12:
                cnVar.getClass();
                cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 28, true));
                break;
            case 13:
                cn cnVar3 = this.b;
                org.telegram.ui.Components.u4.g0(cnVar3, cnVar3.j6, cnVar3.f, cnVar3.e, cnVar3.h, cnVar3.b2.getTag(R.id.object_tag) != null, cnVar3.p8, new dg(cnVar3, i11), cnVar3.za);
                break;
            case 14:
                cn.n0(cnVar);
                break;
            case 15:
                if (cnVar.q4 != null) {
                    org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().q7;
                    long j3 = cnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = cnVar.q4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    k00Var.z(i18, j3, false);
                }
                cnVar.zd();
                cnVar.Oc(false);
                cnVar.yd(true);
                break;
            case 16:
                long j10 = cnVar.j6;
                if (cnVar.h != null) {
                    j10 = cnVar.f.id;
                }
                cnVar.Ac = false;
                cnVar.getMessagesController().i2(j10, cnVar.f, cnVar.e);
                cnVar.yd(true);
                cnVar.Vc(true);
                break;
            case 17:
                cn cnVar4 = this.b;
                cnVar4.P4 = true;
                if (!cnVar4.ea() || cnVar4.v4) {
                    int i19 = cnVar4.X4;
                    if (i19 != 0) {
                        if (!cnVar4.T4.isEmpty()) {
                            if (i19 == ((Integer) jg.g.i(1, cnVar4.T4)).intValue()) {
                                i12 = ((Integer) cnVar4.T4.get(0)).intValue() + 1;
                                cnVar4.a5 = true;
                            } else {
                                cnVar4.a5 = false;
                                i12 = i19 - 1;
                            }
                        }
                        cnVar4.Z4 = i12;
                        if (!cnVar4.a5) {
                            i12 = -i12;
                        }
                        cnVar4.l(i19, 0, true, 0, true, i12);
                        cnVar4.bd();
                        break;
                    }
                } else {
                    cnVar4.l((int) cnVar4.r4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                cnVar.Ka(false);
                break;
            case 19:
                cn.t0(cnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", cnVar.a());
                cnVar.presentFragment(new ek(bundle2));
                break;
            case 21:
                cn.L0(cnVar);
                break;
            case 22:
                cn.r1(cnVar);
                break;
            case 23:
                cn.Z0(cnVar);
                break;
            case 24:
                cnVar.Da(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = cnVar.m6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (ijVar == null && sparseArrayArr[i20].size() != 0) {
                        ijVar = (org.telegram.messenger.ij) cnVar.E6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    cnVar.n6[i20].clear();
                    cnVar.o6[i20].clear();
                }
                cnVar.A9();
                if (ijVar != null && ((i7 = ijVar.k.id) > 0 || (i7 < 0 && cnVar.h != null))) {
                    cnVar.hc(ijVar);
                }
                cnVar.fd(0, true);
                cnVar.Fd(false);
                cnVar.sd();
                break;
            case 26:
                cn.N0(cnVar);
                break;
            case 27:
                cn cnVar5 = this.b;
                org.telegram.messenger.ij ijVar3 = cnVar5.F5;
                if (ijVar3 != null) {
                    cnVar5.l(ijVar3.e1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                cnVar.Na(cnVar.da() ? "" : null);
                break;
            default:
                cnVar.g8();
                cnVar.M3.m(cnVar.j6, org.telegram.messenger.id.M0(2131752880, null), 18);
                break;
        }
    }
}
