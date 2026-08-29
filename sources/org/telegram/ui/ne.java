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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ ne(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        tn tnVar = this.b;
        switch (i11) {
            case 0:
                tn tnVar2 = this.b;
                cg.v0.C1(tnVar2, tnVar2.z1, tnVar2.A1, tnVar2.P5, false);
                break;
            case 1:
                tnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tnVar.r);
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (tnVar.G3 != null) {
                    tnVar.Lb(!tnVar.uc.f);
                    break;
                }
                break;
            case 3:
                tnVar.kb(!tnVar.w0.J);
                break;
            case 4:
                wj wjVar = tnVar.E1;
                if (wjVar != null) {
                    wjVar.setReversed(true);
                    tnVar.E1.getAdapter().g0 = true;
                    tnVar.m7();
                }
                tnVar.O2.setVisibility(8);
                tnVar.P2.setVisibility(8);
                tnVar.j3 = true;
                tnVar.k3 = null;
                tnVar.l3 = null;
                tnVar.f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                tnVar.f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(tnVar.f0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f0;
                w0Var.r = null;
                ig.f fVar = w0Var.e;
                if (fVar != null) {
                    fVar.setText("");
                    break;
                }
                break;
            case 5:
                if (tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.f0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    tnVar.showDialog(org.telegram.ui.Components.c5.p(tnVar.getParentActivity(), new wk(tnVar), tnVar.aa).a);
                    break;
                }
                break;
            case 6:
                tnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = tnVar.Z4;
                if (messageObject2 != null) {
                    tnVar.J9(messageObject2, false, false);
                    ye.d.r(tnVar.getParentActivity(), Uri.parse(tnVar.Z4.sponsoredUrl), true, false, false, null, null, false, tnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(tnVar.Z4.sponsoredInfo)) {
                    b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.aa));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(tnVar.Z4.sponsoredAdditionalInfo)) {
                    b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.aa));
                    break;
                }
                break;
            case 10:
                if (tnVar.T0 != null && tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(tnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = tnVar.getParentActivity();
                    rn rnVar = tnVar.aa;
                    final g81 g81Var = new g81(parentActivity);
                    LinearLayout f9 = org.telegram.messenger.x3.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, rnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(parentActivity, rnVar);
                    y80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), rnVar));
                    y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, rnVar));
                    y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, rnVar));
                    y80Var.setTextSize(1, 14.0f);
                    y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var.setOnLinkPressListener(new org.telegram.ui.Components.x80() { // from class: org.telegram.ui.e81
                        @Override // org.telegram.ui.Components.x80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(g81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.y80 y80Var2 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), rnVar));
                    y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, rnVar));
                    y80Var2.setTextSize(1, 14.0f);
                    y80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var2.setOnLinkPressListener(new org.telegram.ui.Components.x80() { // from class: org.telegram.ui.e81
                        @Override // org.telegram.ui.Components.x80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(g81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.y80 y80Var3 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), rnVar));
                    y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, rnVar));
                    y80Var3.setTextSize(1, 14.0f);
                    y80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var3.setOnLinkPressListener(new org.telegram.ui.Components.x80() { // from class: org.telegram.ui.e81
                        @Override // org.telegram.ui.Components.x80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(g81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(g81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(i16, rnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    jk jkVar = new jk(parentActivity, paint);
                    jkVar.setOnClickListener(new f81(parentActivity));
                    jkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    jkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    jkVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, rnVar));
                    jkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, rnVar)));
                    jkVar.setTextSize(1, 14.0f);
                    jkVar.setGravity(16);
                    org.telegram.ui.Components.y80 y80Var4 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), rnVar));
                    y80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, rnVar));
                    y80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(textView);
                    y80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var, i7.f6.t(-1, -2, 0, 0, 18, 0, 0));
                    y80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var2, i7.f6.t(-1, -2, 0, 0, 24, 0, 0));
                    y80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var3, i7.f6.t(-1, -2, 0, 0, 24, 0, 0));
                    f9.addView(jkVar, i7.f6.t(-2, 34, 1, 22, 14, 22, 0));
                    y80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var4, i7.f6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(g81Var.getContext());
                    scrollView.addView(f9);
                    g81Var.addView(scrollView, i7.f6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    q6.customView = g81Var;
                    q6.show();
                    break;
                }
                break;
            case 11:
                tnVar.finishPreviewFragment();
                break;
            case 12:
                tnVar.getClass();
                tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 28, true));
                break;
            case 13:
                tn tnVar3 = this.b;
                org.telegram.ui.Components.c5.j0(tnVar3, tnVar3.P5, tnVar3.f, tnVar3.e, tnVar3.h, tnVar3.J1.getTag(R.id.object_tag) != null, tnVar3.V7, new qg(tnVar3, i12), tnVar3.aa);
                break;
            case 14:
                tn.j0(tnVar);
                break;
            case 15:
                if (tnVar.Y3 != null) {
                    TopicsController topicsController = tnVar.getMessagesController().getTopicsController();
                    long j10 = tnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                tnVar.Rc();
                tnVar.hc(false);
                tnVar.Qc(true);
                break;
            case 16:
                long j11 = tnVar.P5;
                if (tnVar.h != null) {
                    j11 = tnVar.f.id;
                }
                tnVar.Ub = false;
                tnVar.getMessagesController().hidePeerSettingsBar(j11, tnVar.f, tnVar.e);
                tnVar.Qc(true);
                tnVar.oc(true);
                break;
            case 17:
                tn tnVar4 = this.b;
                tnVar4.z4 = true;
                if (!tnVar4.F9() || tnVar4.d4) {
                    int i18 = tnVar4.H4;
                    if (i18 != 0) {
                        if (!tnVar4.D4.isEmpty()) {
                            if (i18 == ((Integer) j7.l1.i(1, tnVar4.D4)).intValue()) {
                                i13 = ((Integer) tnVar4.D4.get(0)).intValue() + 1;
                                tnVar4.K4 = true;
                            } else {
                                tnVar4.K4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        tnVar4.J4 = i13;
                        if (!tnVar4.K4) {
                            i13 = -i13;
                        }
                        tnVar4.j(i18, 0, true, 0, true, i13);
                        tnVar4.uc();
                        break;
                    }
                } else {
                    tnVar4.j((int) tnVar4.Z3, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                tnVar.ia(false);
                break;
            case 19:
                tn.Z(tnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", tnVar.a());
                tnVar.presentFragment(new rk(bundle2));
                break;
            case 21:
                tn.C0(tnVar);
                break;
            case 22:
                tn.L0(tnVar);
                break;
            case 23:
                tn.b1(tnVar);
                break;
            case 24:
                tnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = tnVar.S5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) tnVar.k6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    tnVar.T5[i19].clear();
                    tnVar.U5[i19].clear();
                }
                tnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && tnVar.h != null))) {
                    tnVar.Bb(messageObject);
                }
                tnVar.yc(0, true);
                tnVar.Wc(false);
                tnVar.Lc();
                break;
            case 26:
                tn.f1(tnVar);
                break;
            case 27:
                tn tnVar5 = this.b;
                MessageObject messageObject3 = tnVar5.l5;
                if (messageObject3 != null) {
                    tnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                tnVar.la(tnVar.E9() ? "" : null);
                break;
            default:
                tnVar.Q7();
                tnVar.u3.m(tnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
