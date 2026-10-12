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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ gf(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        fo foVar = this.b;
        switch (i11) {
            case 0:
                fo foVar2 = this.b;
                sg.j0.D1(foVar2, foVar2.D1, foVar2.E1, foVar2.T5, false);
                break;
            case 1:
                foVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", foVar.r);
                foVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (foVar.K3 != null) {
                    foVar.Pb(!foVar.yc.f);
                    break;
                }
                break;
            case 3:
                foVar.ob(!foVar.A0.N);
                break;
            case 4:
                kk kkVar = foVar.I1;
                if (kkVar != null) {
                    kkVar.setReversed(true);
                    foVar.I1.getAdapter().k0 = true;
                    foVar.p7();
                }
                foVar.S2.setVisibility(8);
                foVar.T2.setVisibility(8);
                foVar.n3 = true;
                foVar.o3 = null;
                foVar.p3 = null;
                foVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                foVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(foVar.j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = foVar.j0;
                u0Var.r = null;
                di.g2 g2Var = u0Var.e;
                if (g2Var != null) {
                    g2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = foVar.j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    foVar.showDialog(org.telegram.ui.Components.g5.o(foVar.getParentActivity(), new ll(foVar), foVar.ea).a);
                    break;
                }
                break;
            case 6:
                foVar.D7(true);
                break;
            case 7:
                MessageObject messageObject2 = foVar.d5;
                if (messageObject2 != null) {
                    foVar.O9(messageObject2, false, false);
                    pf.d.r(foVar.getParentActivity(), Uri.parse(foVar.d5.sponsoredUrl), true, false, false, null, null, false, foVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(foVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(foVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.ea));
                    break;
                }
                break;
            case 10:
                if (foVar.X0 != null && foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 i15 = org.telegram.messenger.yh.i(1, foVar.X0.getContext(), null, false);
                    Activity parentActivity = foVar.getParentActivity();
                    co coVar = foVar.ea;
                    final t91 t91Var = new t91(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.q.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, coVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(parentActivity, coVar);
                    da0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), coVar));
                    da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, coVar));
                    da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, coVar));
                    da0Var.setTextSize(1, 14.0f);
                    da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var.setOnLinkPressListener(new org.telegram.ui.Components.ca0() { // from class: org.telegram.ui.r91
                        @Override // org.telegram.ui.Components.ca0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(t91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.da0 da0Var2 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), coVar));
                    da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, coVar));
                    da0Var2.setTextSize(1, 14.0f);
                    da0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var2.setOnLinkPressListener(new org.telegram.ui.Components.ca0() { // from class: org.telegram.ui.r91
                        @Override // org.telegram.ui.Components.ca0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(t91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.da0 da0Var3 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), coVar));
                    da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, coVar));
                    da0Var3.setTextSize(1, 14.0f);
                    da0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var3.setOnLinkPressListener(new org.telegram.ui.Components.ca0() { // from class: org.telegram.ui.r91
                        @Override // org.telegram.ui.Components.ca0
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(t91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(t91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(i17, coVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    xk xkVar = new xk(parentActivity, paint);
                    xkVar.setOnClickListener(new s91(parentActivity));
                    xkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    xkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    xkVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i17, coVar));
                    xkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, coVar)));
                    xkVar.setTextSize(1, 14.0f);
                    xkVar.setGravity(16);
                    org.telegram.ui.Components.da0 da0Var4 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), coVar));
                    da0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, coVar));
                    da0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    da0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var, w7.a6.t(-1, -2, 0, 0, 18, 0, 0));
                    da0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var2, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    da0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var3, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(xkVar, w7.a6.t(-2, 34, 1, 22, 14, 22, 0));
                    da0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var4, w7.a6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(t91Var.getContext());
                    scrollView.addView(f7);
                    t91Var.addView(scrollView, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 22.0f, -1, 0));
                    i15.customView = t91Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                foVar.finishPreviewFragment();
                break;
            case 12:
                foVar.getClass();
                foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 28, true));
                break;
            case 13:
                fo foVar3 = this.b;
                org.telegram.ui.Components.g5.i0(foVar3, foVar3.T5, foVar3.f, foVar3.e, foVar3.h, foVar3.N1.getTag(R.id.object_tag) != null, foVar3.Z7, new fh(foVar3, i12), foVar3.ea);
                break;
            case 14:
                fo.k0(foVar);
                break;
            case 15:
                if (foVar.c4 != null) {
                    TopicsController topicsController = foVar.getMessagesController().getTopicsController();
                    long j10 = foVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = foVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i18, false);
                }
                foVar.Vc();
                foVar.lc(false);
                foVar.Uc(true);
                break;
            case 16:
                long j11 = foVar.T5;
                if (foVar.h != null) {
                    j11 = foVar.f.id;
                }
                foVar.Yb = false;
                foVar.getMessagesController().hidePeerSettingsBar(j11, foVar.f, foVar.e);
                foVar.Uc(true);
                foVar.sc(true);
                break;
            case 17:
                fo foVar4 = this.b;
                foVar4.D4 = true;
                if (!foVar4.K9() || foVar4.h4) {
                    int i19 = foVar4.L4;
                    if (i19 != 0) {
                        if (!foVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) i2.d.g(1, foVar4.H4)).intValue()) {
                                i13 = ((Integer) foVar4.H4.get(0)).intValue() + 1;
                                foVar4.O4 = true;
                            } else {
                                foVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        foVar4.N4 = i13;
                        if (!foVar4.O4) {
                            i13 = -i13;
                        }
                        foVar4.j(i19, 0, true, 0, true, i13);
                        foVar4.yc();
                        break;
                    }
                } else {
                    foVar4.j((int) foVar4.d4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                foVar.na(false);
                break;
            case 19:
                fo.b1(foVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", foVar.a());
                foVar.presentFragment(new fl(bundle2));
                break;
            case 21:
                fo.m0(foVar);
                break;
            case 22:
                fo.Y0(foVar);
                break;
            case 23:
                fo.i0(foVar);
                break;
            case 24:
                foVar.ga(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = foVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) foVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    foVar.X5[i20].clear();
                    foVar.Y5[i20].clear();
                }
                foVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && foVar.h != null))) {
                    foVar.Fb(messageObject);
                }
                foVar.Cc(0, true);
                foVar.ad(false);
                foVar.Pc();
                break;
            case 26:
                fo.c1(foVar);
                break;
            case 27:
                fo foVar5 = this.b;
                MessageObject messageObject3 = foVar5.p5;
                if (messageObject3 != null) {
                    foVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                foVar.qa(foVar.J9() ? "" : null);
                break;
            default:
                foVar.T7();
                foVar.y3.m(foVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
