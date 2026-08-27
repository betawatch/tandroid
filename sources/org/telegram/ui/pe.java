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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ pe(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        rn rnVar = this.b;
        switch (i11) {
            case 0:
                rn rnVar2 = this.b;
                ag.i1.C1(rnVar2, rnVar2.z1, rnVar2.A1, rnVar2.P5, false);
                break;
            case 1:
                rnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", rnVar.r);
                rnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (rnVar.G3 != null) {
                    rnVar.Lb(!rnVar.uc.f);
                    break;
                }
                break;
            case 3:
                rnVar.kb(!rnVar.w0.J);
                break;
            case 4:
                vj vjVar = rnVar.E1;
                if (vjVar != null) {
                    vjVar.setReversed(true);
                    rnVar.E1.getAdapter().g0 = true;
                    rnVar.m7();
                }
                rnVar.O2.setVisibility(8);
                rnVar.P2.setVisibility(8);
                rnVar.j3 = true;
                rnVar.k3 = null;
                rnVar.l3 = null;
                rnVar.f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                rnVar.f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(rnVar.f0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = rnVar.f0;
                v0Var.r = null;
                gg.g gVar = v0Var.e;
                if (gVar != null) {
                    gVar.setText("");
                    break;
                }
                break;
            case 5:
                if (rnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.f0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    rnVar.showDialog(org.telegram.ui.Components.y4.p(rnVar.getParentActivity(), new vk(rnVar), rnVar.aa).a);
                    break;
                }
                break;
            case 6:
                rnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = rnVar.Z4;
                if (messageObject2 != null) {
                    rnVar.J9(messageObject2, false, false);
                    we.e.r(rnVar.getParentActivity(), Uri.parse(rnVar.Z4.sponsoredUrl), true, false, false, null, null, false, rnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(rnVar.Z4.sponsoredInfo)) {
                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.aa));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(rnVar.Z4.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.aa));
                    break;
                }
                break;
            case 10:
                if (rnVar.T0 != null && rnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(rnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = rnVar.getParentActivity();
                    pn pnVar = rnVar.aa;
                    final d81 d81Var = new d81(parentActivity);
                    LinearLayout f10 = org.telegram.messenger.y1.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(parentActivity, pnVar);
                    p80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), pnVar));
                    p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, pnVar));
                    p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.b81
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), pnVar));
                    p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var2.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.b81
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var3 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), pnVar));
                    p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    p80Var3.setTextSize(1, 14.0f);
                    p80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var3.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.b81
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(i16, pnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    ik ikVar = new ik(parentActivity, paint);
                    ikVar.setOnClickListener(new c81(parentActivity));
                    ikVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    ikVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    ikVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, pnVar));
                    ikVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, pnVar)));
                    ikVar.setTextSize(1, 14.0f);
                    ikVar.setGravity(16);
                    org.telegram.ui.Components.p80 p80Var4 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), pnVar));
                    p80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    p80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(textView);
                    p80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(p80Var, h7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    p80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(p80Var2, h7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    p80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(p80Var3, h7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    f10.addView(ikVar, h7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    p80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(p80Var4, h7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(d81Var.getContext());
                    scrollView.addView(f10);
                    d81Var.addView(scrollView, h7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    o10.customView = d81Var;
                    o10.show();
                    break;
                }
                break;
            case 11:
                rnVar.finishPreviewFragment();
                break;
            case 12:
                rnVar.getClass();
                rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 28, true));
                break;
            case 13:
                rn rnVar3 = this.b;
                org.telegram.ui.Components.y4.j0(rnVar3, rnVar3.P5, rnVar3.f, rnVar3.e, rnVar3.h, rnVar3.J1.getTag(R.id.object_tag) != null, rnVar3.V7, new tg(rnVar3, i12), rnVar3.aa);
                break;
            case 14:
                rn.j0(rnVar);
                break;
            case 15:
                if (rnVar.Y3 != null) {
                    TopicsController topicsController = rnVar.getMessagesController().getTopicsController();
                    long j10 = rnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = rnVar.Y3;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                rnVar.Rc();
                rnVar.hc(false);
                rnVar.Qc(true);
                break;
            case 16:
                long j11 = rnVar.P5;
                if (rnVar.h != null) {
                    j11 = rnVar.f.id;
                }
                rnVar.Ub = false;
                rnVar.getMessagesController().hidePeerSettingsBar(j11, rnVar.f, rnVar.e);
                rnVar.Qc(true);
                rnVar.oc(true);
                break;
            case 17:
                rn rnVar4 = this.b;
                rnVar4.z4 = true;
                if (!rnVar4.F9() || rnVar4.d4) {
                    int i18 = rnVar4.H4;
                    if (i18 != 0) {
                        if (!rnVar4.D4.isEmpty()) {
                            if (i18 == ((Integer) i0.a.i(1, rnVar4.D4)).intValue()) {
                                i13 = ((Integer) rnVar4.D4.get(0)).intValue() + 1;
                                rnVar4.K4 = true;
                            } else {
                                rnVar4.K4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        rnVar4.J4 = i13;
                        if (!rnVar4.K4) {
                            i13 = -i13;
                        }
                        rnVar4.j(i18, 0, true, 0, true, i13);
                        rnVar4.uc();
                        break;
                    }
                } else {
                    rnVar4.j((int) rnVar4.Z3, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                rnVar.ia(false);
                break;
            case 19:
                rn.Z(rnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", rnVar.a());
                rnVar.presentFragment(new qk(bundle2));
                break;
            case 21:
                rn.C0(rnVar);
                break;
            case 22:
                rn.L0(rnVar);
                break;
            case 23:
                rn.b1(rnVar);
                break;
            case 24:
                rnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = rnVar.S5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) rnVar.k6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    rnVar.T5[i19].clear();
                    rnVar.U5[i19].clear();
                }
                rnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && rnVar.h != null))) {
                    rnVar.Bb(messageObject);
                }
                rnVar.yc(0, true);
                rnVar.Wc(false);
                rnVar.Lc();
                break;
            case 26:
                rn.f1(rnVar);
                break;
            case 27:
                rn rnVar5 = this.b;
                MessageObject messageObject3 = rnVar5.l5;
                if (messageObject3 != null) {
                    rnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                rnVar.la(rnVar.E9() ? "" : null);
                break;
            default:
                rnVar.Q7();
                rnVar.u3.m(rnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
