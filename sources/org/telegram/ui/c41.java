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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int v = 0;
    public final ci.h1 b;
    public final Paint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList h;
    public final byte[] n;
    public final long r;
    public y31 s;

    public c41(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, byte[] bArr) {
        this(true, context, e6Var, j3, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void I(c41 c41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = c41Var.r;
        ArrayList arrayList = c41Var.h;
        if (c41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = c41Var.n;
            r02.option = bArr;
        } else {
            if (c41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (c41Var.f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(c41Var.currentAccount).sendRequest(r02, new ai.q3(c41Var, charSequence, bArr, str, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.ad adVar, final org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.s31
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            c41.o(context, e6Var, z10, z11, j3, arrayList, zArr, callback, adVar, (TLRPC.ReportResult) obj);
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.s31
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    c41.o(context, e6Var, z10, z11, j3, arrayList, zArr, callback, adVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void M(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        L(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void N(zn znVar, MessageObject messageObject) {
        int currentAccount = znVar.getCurrentAccount();
        Activity parentActivity = znVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), org.telegram.ui.Components.ad.a0(znVar), znVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(zn znVar, MessageObject messageObject, org.telegram.ui.ActionBar.e6 e6Var) {
        int currentAccount = znVar.getCurrentAccount();
        Activity parentActivity = znVar.getParentActivity();
        long a2 = znVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, e6Var, a2, bArr, znVar, messageObject, currentAccount));
    }

    public static void o(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new m31(0, callback, zArr), 200L);
            return;
        }
        c41 c41Var = new c41(false, context, e6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            c41Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = c41Var.b.getViewPages();
            View view = viewPages[0];
            if (view instanceof b41) {
                ((b41) view).a(0);
                c41Var.containerView.post(new n31(1, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof b41) {
                ((b41) view2).a(1);
            }
        }
        c41Var.s = new t31(zArr, callback, adVar);
        c41Var.setOnDismissListener(new m31(1, callback, zArr));
        c41Var.show();
    }

    public static void p(c41 c41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        y31 y31Var;
        y31 y31Var2;
        ci.d dVar;
        ci.h1 h1Var = c41Var.b;
        if ((h1Var.getCurrentView() instanceof b41) && (dVar = ((b41) h1Var.getCurrentView()).s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!c41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    long j3 = c41Var.r;
                    String charSequence2 = charSequence.toString();
                    int i10 = zn.Hc;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j3)) {
                            bundle.putLong("user_id", j3);
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        bundle.putString("reportTitle", charSequence2);
                        bundle.putByteArray("reportOption", bArr);
                        bundle.putString("reportMessage", str);
                        U.presentFragment(new zn(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    y31 y31Var3 = c41Var.s;
                    if (y31Var3 != null) {
                        y31Var3.c();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (y31Var = c41Var.s) != null) {
                    y31Var.a();
                }
                c41Var.dismiss();
                return;
            }
            return;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(c41Var.currentAccount).disableAds(false);
                y31 y31Var4 = c41Var.s;
                if (y31Var4 != null) {
                    y31Var4.b();
                    c41Var.dismiss();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (y31Var2 = c41Var.s) != null) {
                y31Var2.a();
                c41Var.dismiss();
                return;
            }
            return;
        }
        h1Var.D(h1Var.b + 1);
        b41 b41Var = (b41) h1Var.getViewPages()[1];
        if (b41Var != null) {
            org.telegram.ui.Components.k71 k71Var = b41Var.f;
            if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                b41Var.b = null;
                b41Var.c = (TLRPC.TL_reportResultChooseOption) tLObject;
                b41Var.d = null;
                k71Var.W2.N(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                b41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z10) {
                b41Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                b41Var.c = null;
                b41Var.d = null;
                k71Var.W2.N(false);
            }
            if (charSequence != null) {
                t5 t5Var = b41Var.h;
                ((TextView) t5Var.d).setText(charSequence);
                ((TextView) t5Var.d).getText();
                t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                if (k71Var != null) {
                    k71Var.W2.N(true);
                }
            }
        }
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof b41) {
            ((b41) view).a(0);
            this.containerView.post(new n31(0, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b41) {
            ((b41) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof b41) {
            ((b41) view).a(0);
            this.containerView.post(new n31(2, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b41) {
            ((b41) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.b.getCurrentView() instanceof b41) {
            return !((b41) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        a41 a41Var;
        ci.h1 h1Var = this.b;
        if ((h1Var.getCurrentView() instanceof b41) && (a41Var = ((b41) h1Var.getCurrentView()).n) != null) {
            AndroidUtilities.hideKeyboard(a41Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public c41(boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, e6Var, true);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f = z12;
        this.n = bArr;
        this.r = j3;
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new x31(this, context);
        ci.h1 h1Var = new ci.h1(this, context, 6);
        this.b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.x5.e(-1, -1, 119));
        h1Var.setAdapter(new iw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}
