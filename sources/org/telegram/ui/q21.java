package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q21 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int v = 0;
    public final ei.h1 b;
    public final Paint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList h;
    public final byte[] n;
    public final long r;
    public m21 s;

    public q21(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, byte[] bArr) {
        this(true, context, d6Var, j10, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void I(q21 q21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = q21Var.r;
        ArrayList arrayList = q21Var.h;
        if (q21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = q21Var.n;
            r02.option = bArr;
        } else {
            if (q21Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (q21Var.f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(q21Var.currentAccount).sendRequest(r02, new ai.y2(q21Var, charSequence, bArr, str, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.g21
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            q21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.g21
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    q21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void M(long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        L(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void N(sn snVar, MessageObject messageObject) {
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), org.telegram.ui.Components.xc.a0(snVar), snVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(sn snVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        long a2 = snVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new gi.z0(parentActivity, d6Var, a2, bArr, snVar, messageObject, currentAccount));
    }

    public static void n(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new ai.w8(1, callback, zArr), 200L);
            return;
        }
        q21 q21Var = new q21(false, context, d6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            q21Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = q21Var.b.getViewPages();
            View view = viewPages[0];
            if (view instanceof p21) {
                ((p21) view).a(0);
                q21Var.containerView.post(new lv0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof p21) {
                ((p21) view2).a(1);
            }
        }
        q21Var.s = new h21(zArr, callback, xcVar);
        q21Var.setOnDismissListener(new ai.w8(2, callback, zArr));
        q21Var.show();
    }

    public static void o(q21 q21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        m21 m21Var;
        m21 m21Var2;
        ei.d dVar;
        ei.h1 h1Var = q21Var.b;
        if ((h1Var.getCurrentView() instanceof p21) && (dVar = ((p21) h1Var.getCurrentView()).s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!q21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    long j10 = q21Var.r;
                    String charSequence2 = charSequence.toString();
                    int i10 = sn.Hc;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j10)) {
                            bundle.putLong("user_id", j10);
                        } else {
                            bundle.putLong("chat_id", -j10);
                        }
                        bundle.putString("reportTitle", charSequence2);
                        bundle.putByteArray("reportOption", bArr);
                        bundle.putString("reportMessage", str);
                        U.presentFragment(new sn(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    m21 m21Var3 = q21Var.s;
                    if (m21Var3 != null) {
                        m21Var3.c();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (m21Var = q21Var.s) != null) {
                    m21Var.a();
                }
                q21Var.dismiss();
                return;
            }
            return;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(q21Var.currentAccount).disableAds(false);
                m21 m21Var4 = q21Var.s;
                if (m21Var4 != null) {
                    m21Var4.b();
                    q21Var.dismiss();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (m21Var2 = q21Var.s) != null) {
                m21Var2.a();
                q21Var.dismiss();
                return;
            }
            return;
        }
        h1Var.D(h1Var.b + 1);
        p21 p21Var = (p21) h1Var.getViewPages()[1];
        if (p21Var != null) {
            org.telegram.ui.Components.a71 a71Var = p21Var.f;
            if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                p21Var.b = null;
                p21Var.c = (TLRPC.TL_reportResultChooseOption) tLObject;
                p21Var.d = null;
                a71Var.W2.N(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                p21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z10) {
                p21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                p21Var.c = null;
                p21Var.d = null;
                a71Var.W2.N(false);
            }
            if (charSequence != null) {
                ai.n5 n5Var = p21Var.h;
                ((TextView) n5Var.c).setText(charSequence);
                ((TextView) n5Var.c).getText();
                n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                if (a71Var != null) {
                    a71Var.W2.N(true);
                }
            }
        }
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p21) {
            ((p21) view).a(0);
            this.containerView.post(new lv0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p21) {
            ((p21) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p21) {
            ((p21) view).a(0);
            this.containerView.post(new lv0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p21) {
            ((p21) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.b.getCurrentView() instanceof p21) {
            return !((p21) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        o21 o21Var;
        ei.h1 h1Var = this.b;
        if ((h1Var.getCurrentView() instanceof p21) && (o21Var = ((p21) h1Var.getCurrentView()).n) != null) {
            AndroidUtilities.hideKeyboard(o21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public q21(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f = z12;
        this.n = bArr;
        this.r = j10;
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new l21(this, context);
        ei.h1 h1Var = new ei.h1(this, context, 6);
        this.b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.z5.e(-1, -1, 119));
        h1Var.setAdapter(new ai.i5(this, context, 2));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}
