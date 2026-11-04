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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ je(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
        int i10 = this.a;
        int i11 = 2;
        org.telegram.messenger.zi ziVar = null;
        final int i12 = 0;
        final int i13 = 1;
        wm wmVar = this.b;
        switch (i10) {
            case 0:
                wm wmVar2 = this.b;
                vg.i0.w1(wmVar2, wmVar2.S1, wmVar2.T1, wmVar2.k6, false);
                break;
            case 1:
                wmVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wmVar.r);
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (wmVar.Z3 != null) {
                    wmVar.oc(!wmVar.dd.f);
                    break;
                }
                break;
            case 3:
                wmVar.Mb(!wmVar.D0.O);
                break;
            case 4:
                fj fjVar = wmVar.X1;
                if (fjVar != null) {
                    fjVar.setReversed(true);
                    wmVar.X1.getAdapter().l0 = true;
                    wmVar.A7();
                }
                wmVar.h3.setVisibility(8);
                wmVar.i3.setVisibility(8);
                wmVar.C3 = true;
                wmVar.D3 = null;
                wmVar.E3 = null;
                wmVar.k0.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745767, null));
                wmVar.k0.setSearchFieldCaption(org.telegram.messenger.bd.M0(2131745776, null));
                org.telegram.messenger.g0.K3(wmVar.k0.getSearchField());
                wmVar.k0.n();
                break;
            case 5:
                if (wmVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = wmVar.k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    wmVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(wmVar.getParentActivity(), new fk(wmVar), wmVar.ya).b);
                    break;
                }
                break;
            case 6:
                wmVar.O7(true);
                break;
            case 7:
                org.telegram.messenger.zi ziVar2 = wmVar.u5;
                if (ziVar2 != null) {
                    wmVar.ja(ziVar2, false, false);
                    sf.c.s(wmVar.getParentActivity(), Uri.parse(wmVar.u5.R0), true, false, false, null, null, false, wmVar.getMessagesController().d6, false, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.g0.g(wmVar.u5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.ya));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.g0.g(wmVar.u5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.ya));
                    break;
                }
                break;
            case 10:
                if (wmVar.m1 != null && wmVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, wmVar.m1.getContext(), null, false);
                    Activity parentActivity = wmVar.getParentActivity();
                    um umVar = wmVar.ya;
                    final yg0 yg0Var = new yg0(parentActivity, 9);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.bd.M0(2131745264, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i14 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView, i14, umVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(parentActivity, umVar);
                    s70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description1"), umVar, null));
                    org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, umVar);
                    org.telegram.ui.ActionBar.r6.V(s70Var, i14, umVar);
                    s70Var.setTextSize(1, 14.0f);
                    s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    s70Var.setOnLinkPressListener(new org.telegram.ui.Components.r70() { // from class: org.telegram.ui.e31
                        @Override // org.telegram.ui.Components.r70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.s70 s70Var2 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description2"), umVar, null));
                    org.telegram.ui.ActionBar.r6.V(s70Var2, i14, umVar);
                    s70Var2.setTextSize(1, 14.0f);
                    s70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    s70Var2.setOnLinkPressListener(new org.telegram.ui.Components.r70() { // from class: org.telegram.ui.e31
                        @Override // org.telegram.ui.Components.r70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.s70 s70Var3 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description3"), umVar, null));
                    org.telegram.ui.ActionBar.r6.V(s70Var3, i14, umVar);
                    s70Var3.setTextSize(1, 14.0f);
                    s70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    final int i15 = 2;
                    s70Var3.setOnLinkPressListener(new org.telegram.ui.Components.r70() { // from class: org.telegram.ui.e31
                        @Override // org.telegram.ui.Components.r70
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.k6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i16, umVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(parentActivity, paint);
                    k2Var.setOnClickListener(new a8(parentActivity, 3));
                    k2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    k2Var.setText(org.telegram.messenger.bd.M0(2131745265, null));
                    org.telegram.ui.ActionBar.r6.V(k2Var, i16, umVar);
                    int i17 = org.telegram.ui.ActionBar.k6.h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i17, umVar), 4.0f);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i17);
                    k2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.r6.k(k2Var, e11, N, f10, umVar);
                    k2Var.setTextSize(1, 14.0f);
                    k2Var.setGravity(16);
                    org.telegram.ui.Components.s70 s70Var4 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description4"), umVar, null));
                    s70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.V(s70Var4, i14, umVar);
                    s70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    s70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var, b8.mf.t(-1, -2, 0, 0, 18, 0, 0));
                    s70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var2, b8.mf.t(-1, -2, 0, 0, 24, 0, 0));
                    s70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var3, b8.mf.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(k2Var, b8.mf.t(-2, 34, 1, 22, 14, 22, 0));
                    s70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var4, b8.mf.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(yg0Var.getContext());
                    scrollView.addView(e10);
                    yg0Var.addView(scrollView, b8.mf.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.O = yg0Var;
                    l10.show();
                    break;
                }
                break;
            case 11:
                wmVar.finishPreviewFragment();
                break;
            case 12:
                wmVar.getClass();
                wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 28, true));
                break;
            case 13:
                wm wmVar3 = this.b;
                org.telegram.ui.Components.t4.i0(wmVar3, wmVar3.k6, wmVar3.f, wmVar3.e, wmVar3.h, wmVar3.c2.getTag(R.id.object_tag) != null, wmVar3.q8, new bg(wmVar3, i11), wmVar3.ya);
                break;
            case 14:
                wm.m0(wmVar);
                break;
            case 15:
                if (wmVar.r4 != null) {
                    org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().q7;
                    long j10 = wmVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = wmVar.r4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    c00Var.z(i18, j10, false);
                }
                wmVar.wd();
                wmVar.Lc(false);
                wmVar.vd(true);
                break;
            case 16:
                long j11 = wmVar.k6;
                if (wmVar.h != null) {
                    j11 = wmVar.f.id;
                }
                wmVar.zc = false;
                wmVar.getMessagesController().i2(j11, wmVar.f, wmVar.e);
                wmVar.vd(true);
                wmVar.Sc(true);
                break;
            case 17:
                wm wmVar4 = this.b;
                wmVar4.Q4 = true;
                if (!wmVar4.da() || wmVar4.w4) {
                    int i19 = wmVar4.Y4;
                    if (i19 != 0) {
                        if (!wmVar4.U4.isEmpty()) {
                            if (i19 == ((Integer) k2.p1.h(1, wmVar4.U4)).intValue()) {
                                i12 = ((Integer) wmVar4.U4.get(0)).intValue() + 1;
                                wmVar4.b5 = true;
                            } else {
                                wmVar4.b5 = false;
                                i12 = i19 - 1;
                            }
                        }
                        wmVar4.a5 = i12;
                        if (!wmVar4.b5) {
                            i12 = -i12;
                        }
                        wmVar4.l(i19, 0, true, 0, true, i12);
                        wmVar4.Yc();
                        break;
                    }
                } else {
                    wmVar4.l((int) wmVar4.s4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                wmVar.Ia(false);
                break;
            case 19:
                wm.q0(wmVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wmVar.a());
                wmVar.presentFragment(new yj(bundle2));
                break;
            case 21:
                wm.I0(wmVar);
                break;
            case 22:
                wm.o1(wmVar);
                break;
            case 23:
                wm.V0(wmVar);
                break;
            case 24:
                wmVar.Ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = wmVar.n6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (ziVar == null && sparseArrayArr[i20].size() != 0) {
                        ziVar = (org.telegram.messenger.zi) wmVar.F6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    wmVar.o6[i20].clear();
                    wmVar.p6[i20].clear();
                }
                wmVar.z9();
                if (ziVar != null && ((i3 = ziVar.k.id) > 0 || (i3 < 0 && wmVar.h != null))) {
                    wmVar.ec(ziVar);
                }
                wmVar.cd(0, true);
                wmVar.Cd(false);
                wmVar.pd();
                break;
            case 26:
                wm.K0(wmVar);
                break;
            case 27:
                wm wmVar5 = this.b;
                org.telegram.messenger.zi ziVar3 = wmVar5.G5;
                if (ziVar3 != null) {
                    wmVar5.l(ziVar3.f1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                wmVar.La(wmVar.ca() ? "" : null);
                break;
            default:
                wmVar.f8();
                wmVar.N3.m(wmVar.k6, org.telegram.messenger.bd.M0(2131752880, null), 18);
                break;
        }
    }
}
