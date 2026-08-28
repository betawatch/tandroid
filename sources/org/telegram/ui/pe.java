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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ pe(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9;
        int i10 = this.a;
        final int i11 = 2;
        MessageObject messageObject = null;
        final int i12 = 0;
        final int i13 = 1;
        qn qnVar = this.b;
        switch (i10) {
            case 0:
                qn qnVar2 = this.b;
                zf.j0.C1(qnVar2, qnVar2.z1, qnVar2.A1, qnVar2.P5, false);
                break;
            case 1:
                qnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", qnVar.r);
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (qnVar.G3 != null) {
                    qnVar.Lb(!qnVar.uc.f);
                    break;
                }
                break;
            case 3:
                qnVar.kb(!qnVar.w0.J);
                break;
            case 4:
                tj tjVar = qnVar.E1;
                if (tjVar != null) {
                    tjVar.setReversed(true);
                    qnVar.E1.getAdapter().g0 = true;
                    qnVar.m7();
                }
                qnVar.O2.setVisibility(8);
                qnVar.P2.setVisibility(8);
                qnVar.j3 = true;
                qnVar.k3 = null;
                qnVar.l3 = null;
                qnVar.f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                qnVar.f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(qnVar.f0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = qnVar.f0;
                w0Var.r = null;
                fg.g gVar = w0Var.e;
                if (gVar != null) {
                    gVar.setText("");
                    break;
                }
                break;
            case 5:
                if (qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.f0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    qnVar.showDialog(org.telegram.ui.Components.y4.p(qnVar.getParentActivity(), new tk(qnVar), qnVar.aa).a);
                    break;
                }
                break;
            case 6:
                qnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = qnVar.Z4;
                if (messageObject2 != null) {
                    qnVar.J9(messageObject2, false, false);
                    ve.e.r(qnVar.getParentActivity(), Uri.parse(qnVar.Z4.sponsoredUrl), true, false, false, null, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(qnVar.Z4.sponsoredInfo)) {
                    org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.aa));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(qnVar.Z4.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.aa));
                    break;
                }
                break;
            case 10:
                if (qnVar.T0 != null && qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(qnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = qnVar.getParentActivity();
                    on onVar = qnVar.aa;
                    final f81 f81Var = new f81(parentActivity);
                    LinearLayout f10 = org.telegram.messenger.l0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.f6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, onVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(parentActivity, onVar);
                    l80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), onVar));
                    l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, onVar));
                    l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, onVar));
                    l80Var.setTextSize(1, 14.0f);
                    l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var.setOnLinkPressListener(new org.telegram.ui.Components.k80() { // from class: org.telegram.ui.d81
                        @Override // org.telegram.ui.Components.k80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.l80 l80Var2 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), onVar));
                    l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, onVar));
                    l80Var2.setTextSize(1, 14.0f);
                    l80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var2.setOnLinkPressListener(new org.telegram.ui.Components.k80() { // from class: org.telegram.ui.d81
                        @Override // org.telegram.ui.Components.k80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.l80 l80Var3 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), onVar));
                    l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, onVar));
                    l80Var3.setTextSize(1, 14.0f);
                    l80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var3.setOnLinkPressListener(new org.telegram.ui.Components.k80() { // from class: org.telegram.ui.d81
                        @Override // org.telegram.ui.Components.k80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i11) {
                                case 0:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i15 = org.telegram.ui.ActionBar.f6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(i15, onVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    gk gkVar = new gk(parentActivity, paint);
                    gkVar.setOnClickListener(new e81(parentActivity));
                    gkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    gkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    gkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, onVar));
                    gkVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, onVar)));
                    gkVar.setTextSize(1, 14.0f);
                    gkVar.setGravity(16);
                    org.telegram.ui.Components.l80 l80Var4 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), onVar));
                    l80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, onVar));
                    l80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(textView);
                    l80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var, g7.e6.t(-1, -2, 0, 0, 18, 0, 0));
                    l80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var2, g7.e6.t(-1, -2, 0, 0, 24, 0, 0));
                    l80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var3, g7.e6.t(-1, -2, 0, 0, 24, 0, 0));
                    f10.addView(gkVar, g7.e6.t(-2, 34, 1, 22, 14, 22, 0));
                    l80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var4, g7.e6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(f81Var.getContext());
                    scrollView.addView(f10);
                    f81Var.addView(scrollView, g7.e6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j10.customView = f81Var;
                    j10.show();
                    break;
                }
                break;
            case 11:
                qnVar.finishPreviewFragment();
                break;
            case 12:
                qnVar.getClass();
                qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 28, true));
                break;
            case 13:
                qn qnVar3 = this.b;
                org.telegram.ui.Components.y4.j0(qnVar3, qnVar3.P5, qnVar3.f, qnVar3.e, qnVar3.h, qnVar3.J1.getTag(R.id.object_tag) != null, qnVar3.V7, new rg(qnVar3, i11), qnVar3.aa);
                break;
            case 14:
                qn.i0(qnVar);
                break;
            case 15:
                if (qnVar.Y3 != null) {
                    TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                    long j11 = qnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
                    int i16 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i16, false);
                }
                qnVar.Rc();
                qnVar.hc(false);
                qnVar.Qc(true);
                break;
            case 16:
                long j12 = qnVar.P5;
                if (qnVar.h != null) {
                    j12 = qnVar.f.id;
                }
                qnVar.Ub = false;
                qnVar.getMessagesController().hidePeerSettingsBar(j12, qnVar.f, qnVar.e);
                qnVar.Qc(true);
                qnVar.oc(true);
                break;
            case 17:
                qn qnVar4 = this.b;
                qnVar4.z4 = true;
                if (!qnVar4.F9() || qnVar4.d4) {
                    int i17 = qnVar4.H4;
                    if (i17 != 0) {
                        if (!qnVar4.D4.isEmpty()) {
                            if (i17 == ((Integer) j3.r0.j(1, qnVar4.D4)).intValue()) {
                                i12 = ((Integer) qnVar4.D4.get(0)).intValue() + 1;
                                qnVar4.K4 = true;
                            } else {
                                qnVar4.K4 = false;
                                i12 = i17 - 1;
                            }
                        }
                        qnVar4.J4 = i12;
                        if (!qnVar4.K4) {
                            i12 = -i12;
                        }
                        qnVar4.j(i17, 0, true, 0, true, i12);
                        qnVar4.uc();
                        break;
                    }
                } else {
                    qnVar4.j((int) qnVar4.Z3, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                qnVar.ia(false);
                break;
            case 19:
                qn.Y(qnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", qnVar.a());
                qnVar.presentFragment(new ok(bundle2));
                break;
            case 21:
                qn.B0(qnVar);
                break;
            case 22:
                qn.L0(qnVar);
                break;
            case 23:
                qn.b1(qnVar);
                break;
            case 24:
                qnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = qnVar.S5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) qnVar.k6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    qnVar.T5[i18].clear();
                    qnVar.U5[i18].clear();
                }
                qnVar.c9();
                if (messageObject != null && ((i9 = messageObject.messageOwner.id) > 0 || (i9 < 0 && qnVar.h != null))) {
                    qnVar.Bb(messageObject);
                }
                qnVar.yc(0, true);
                qnVar.Wc(false);
                qnVar.Lc();
                break;
            case 26:
                qn.f1(qnVar);
                break;
            case 27:
                qn qnVar5 = this.b;
                MessageObject messageObject3 = qnVar5.l5;
                if (messageObject3 != null) {
                    qnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                qnVar.la(qnVar.E9() ? "" : null);
                break;
            default:
                qnVar.Q7();
                qnVar.u3.m(qnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
