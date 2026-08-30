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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k31 extends org.telegram.ui.ActionBar.g3 {
    public static final /* synthetic */ int v = 0;
    public final ek b;
    public final Paint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList h;
    public final byte[] n;
    public final long r;
    public f31 s;

    public k31(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, byte[] bArr) {
        this(true, context, f6Var, j10, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void G(k31 k31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = k31Var.r;
        ArrayList arrayList = k31Var.h;
        if (k31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = k31Var.n;
            r02.option = bArr;
        } else {
            if (k31Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(k31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (k31Var.f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(k31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(k31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(k31Var.currentAccount).sendRequest(r02, new kh.b1(k31Var, charSequence, bArr, str, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(int i10, final Context context, final long j10, final boolean z4, final boolean z10, final ArrayList arrayList, final org.telegram.ui.Components.qc qcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (z4) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z10) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.z21
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            k31.m(context, f6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
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
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.z21
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    k31.m(context, f6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void K(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        int currentAccount = p2Var.getCurrentAccount();
        Context context = p2Var.getContext();
        if (context == null) {
            return;
        }
        J(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(xn xnVar, MessageObject messageObject) {
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        J(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), org.telegram.ui.Components.qc.a0(xnVar), xnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(xn xnVar, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        long a2 = xnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new x20(parentActivity, f6Var, a2, bArr, xnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar, TLRPC.ReportResult reportResult) {
        boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new lh.l6(zArr, callback, 1), 200L);
            return;
        }
        k31 k31Var = new k31(false, context, f6Var, j10, z4, z10, arrayList, null);
        if (z11) {
            k31Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = k31Var.b.getViewPages();
            View view = viewPages[0];
            if (view instanceof j31) {
                ((j31) view).a(0);
                k31Var.containerView.post(new l01(5, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof j31) {
                ((j31) view2).a(1);
            }
        }
        k31Var.s = new a31(zArr, callback, qcVar);
        k31Var.setOnDismissListener(new lh.l6(zArr, callback, 2));
        k31Var.show();
    }

    public static void n(k31 k31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        f31 f31Var;
        f31 f31Var2;
        ph.d dVar;
        ek ekVar = k31Var.b;
        if ((ekVar.getCurrentView() instanceof j31) && (dVar = ((j31) ekVar.getCurrentView()).s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!k31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    long j10 = k31Var.r;
                    String charSequence2 = charSequence.toString();
                    int i10 = xn.Ec;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
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
                        U.presentFragment(new xn(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    f31 f31Var3 = k31Var.s;
                    if (f31Var3 != null) {
                        f31Var3.c();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (f31Var = k31Var.s) != null) {
                    f31Var.a();
                }
                k31Var.dismiss();
                return;
            }
            return;
        }
        boolean z4 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z4 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(k31Var.currentAccount).disableAds(false);
                f31 f31Var4 = k31Var.s;
                if (f31Var4 != null) {
                    f31Var4.b();
                    k31Var.dismiss();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (f31Var2 = k31Var.s) != null) {
                f31Var2.a();
                k31Var.dismiss();
                return;
            }
            return;
        }
        ekVar.D(ekVar.b + 1);
        j31 j31Var = (j31) ekVar.getViewPages()[1];
        if (j31Var != null) {
            org.telegram.ui.Components.g61 g61Var = j31Var.f;
            if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                j31Var.b = null;
                j31Var.c = (TLRPC.TL_reportResultChooseOption) tLObject;
                j31Var.d = null;
                g61Var.V2.N(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                j31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z4) {
                j31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                j31Var.c = null;
                j31Var.d = null;
                g61Var.V2.N(false);
            }
            if (charSequence != null) {
                dg.s1 s1Var = j31Var.h;
                ((TextView) s1Var.c).setText(charSequence);
                ((TextView) s1Var.c).getText();
                s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                if (g61Var != null) {
                    g61Var.V2.N(true);
                }
            }
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof j31) {
            ((j31) view).a(0);
            this.containerView.post(new l01(4, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof j31) {
            ((j31) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof j31) {
            ((j31) view).a(0);
            this.containerView.post(new l01(6, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof j31) {
            ((j31) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        if (this.b.getCurrentView() instanceof j31) {
            return !((j31) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        h31 h31Var;
        ek ekVar = this.b;
        if ((ekVar.getCurrentView() instanceof j31) && (h31Var = ((j31) ekVar.getCurrentView()).n) != null) {
            AndroidUtilities.hideKeyboard(h31Var);
        }
        if (ekVar.getCurrentPosition() > 0) {
            ekVar.D(ekVar.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public k31(boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, boolean z10, boolean z11, ArrayList arrayList, byte[] bArr) {
        super(context, f6Var, true, false);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = z4;
        this.h = arrayList;
        this.e = z10;
        this.f = z11;
        this.n = bArr;
        this.r = j10;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new e31(this, context);
        ek ekVar = new ek(this, context, 3);
        this.b = ekVar;
        int i11 = this.backgroundPaddingLeft;
        ekVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(ekVar, k7.b6.e(-1, -1, 119));
        ekVar.setAdapter(new gg.u(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z4) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}
