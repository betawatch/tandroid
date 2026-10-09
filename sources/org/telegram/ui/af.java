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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ af(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        zn znVar = this.b;
        switch (i11) {
            case 0:
                zn znVar2 = this.b;
                rg.j0.D1(znVar2, znVar2.D1, znVar2.E1, znVar2.T5, false);
                break;
            case 1:
                znVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", znVar.r);
                znVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (znVar.K3 != null) {
                    znVar.Pb(!znVar.yc.f);
                    break;
                }
                break;
            case 3:
                znVar.ob(!znVar.A0.N);
                break;
            case 4:
                gk gkVar = znVar.I1;
                if (gkVar != null) {
                    gkVar.setReversed(true);
                    znVar.I1.getAdapter().k0 = true;
                    znVar.p7();
                }
                znVar.S2.setVisibility(8);
                znVar.T2.setVisibility(8);
                znVar.n3 = true;
                znVar.o3 = null;
                znVar.p3 = null;
                znVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                znVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(znVar.j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = znVar.j0;
                v0Var.r = null;
                ci.g2 g2Var = v0Var.e;
                if (g2Var != null) {
                    g2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = znVar.j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    znVar.showDialog(org.telegram.ui.Components.g5.o(znVar.getParentActivity(), new hl(znVar), znVar.ea).a);
                    break;
                }
                break;
            case 6:
                znVar.D7(true);
                break;
            case 7:
                MessageObject messageObject2 = znVar.d5;
                if (messageObject2 != null) {
                    znVar.O9(messageObject2, false, false);
                    of.f.r(znVar.getParentActivity(), Uri.parse(znVar.d5.sponsoredUrl), true, false, false, null, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(znVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.bi.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(znVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.bi.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.ea));
                    break;
                }
                break;
            case 10:
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i15 = org.telegram.messenger.bi.i(1, znVar.X0.getContext(), null, false);
                    Activity parentActivity = znVar.getParentActivity();
                    xn xnVar = znVar.ea;
                    final n91 n91Var = new n91(parentActivity);
                    LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, xnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(parentActivity, xnVar);
                    ea0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), xnVar));
                    ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, xnVar));
                    ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, xnVar));
                    ea0Var.setTextSize(1, 14.0f);
                    ea0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var.setOnLinkPressListener(new org.telegram.ui.Components.da0() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.da0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.ea0 ea0Var2 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), xnVar));
                    ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, xnVar));
                    ea0Var2.setTextSize(1, 14.0f);
                    ea0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var2.setOnLinkPressListener(new org.telegram.ui.Components.da0() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.da0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.ea0 ea0Var3 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), xnVar));
                    ea0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, xnVar));
                    ea0Var3.setTextSize(1, 14.0f);
                    ea0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var3.setOnLinkPressListener(new org.telegram.ui.Components.da0() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.da0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.w0(i17, xnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    tk tkVar = new tk(parentActivity, paint);
                    tkVar.setOnClickListener(new m91(parentActivity));
                    tkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    tkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    tkVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i17, xnVar));
                    tkVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, xnVar)));
                    tkVar.setTextSize(1, 14.0f);
                    tkVar.setGravity(16);
                    org.telegram.ui.Components.ea0 ea0Var4 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), xnVar));
                    ea0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, xnVar));
                    ea0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(textView);
                    ea0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    ea0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    ea0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    e7.addView(tkVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    ea0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(n91Var.getContext());
                    scrollView.addView(e7);
                    n91Var.addView(scrollView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 22.0f, -1, 0));
                    i15.customView = n91Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                znVar.finishPreviewFragment();
                break;
            case 12:
                znVar.getClass();
                znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 28, true));
                break;
            case 13:
                zn znVar3 = this.b;
                org.telegram.ui.Components.g5.i0(znVar3, znVar3.T5, znVar3.f, znVar3.e, znVar3.h, znVar3.N1.getTag(R.id.object_tag) != null, znVar3.Z7, new bh(znVar3, i12), znVar3.ea);
                break;
            case 14:
                zn.k0(znVar);
                break;
            case 15:
                if (znVar.c4 != null) {
                    TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                    long j3 = znVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j3, i18, false);
                }
                znVar.Vc();
                znVar.lc(false);
                znVar.Uc(true);
                break;
            case 16:
                long j10 = znVar.T5;
                if (znVar.h != null) {
                    j10 = znVar.f.id;
                }
                znVar.Yb = false;
                znVar.getMessagesController().hidePeerSettingsBar(j10, znVar.f, znVar.e);
                znVar.Uc(true);
                znVar.sc(true);
                break;
            case 17:
                zn znVar4 = this.b;
                znVar4.D4 = true;
                if (!znVar4.K9() || znVar4.h4) {
                    int i19 = znVar4.L4;
                    if (i19 != 0) {
                        if (!znVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) hg.c.g(1, znVar4.H4)).intValue()) {
                                i13 = ((Integer) znVar4.H4.get(0)).intValue() + 1;
                                znVar4.O4 = true;
                            } else {
                                znVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        znVar4.N4 = i13;
                        if (!znVar4.O4) {
                            i13 = -i13;
                        }
                        znVar4.F(i19, 0, 0, i13, true, true);
                        znVar4.yc();
                        break;
                    }
                } else {
                    znVar4.F((int) znVar4.d4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                znVar.na(false);
                break;
            case 19:
                zn.b1(znVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", znVar.a());
                znVar.presentFragment(new bl(bundle2));
                break;
            case 21:
                zn.m0(znVar);
                break;
            case 22:
                zn.Y0(znVar);
                break;
            case 23:
                zn.i0(znVar);
                break;
            case 24:
                znVar.ga(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = znVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) znVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    znVar.X5[i20].clear();
                    znVar.Y5[i20].clear();
                }
                znVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && znVar.h != null))) {
                    znVar.Fb(messageObject);
                }
                znVar.Cc(0, true);
                znVar.ad(false);
                znVar.Pc();
                break;
            case 26:
                zn.c1(znVar);
                break;
            case 27:
                zn znVar5 = this.b;
                MessageObject messageObject3 = znVar5.p5;
                if (messageObject3 != null) {
                    znVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                znVar.qa(znVar.J9() ? "" : null);
                break;
            default:
                znVar.T7();
                znVar.y3.m(znVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
