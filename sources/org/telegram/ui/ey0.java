package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ey0 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int t1 = 0;
    public final gi.g1 j1;
    public final Paint k1;
    public int l1;
    public final boolean m1;
    public final boolean n1;
    public final boolean o1;
    public final ArrayList p1;
    public final byte[] q1;
    public final long r1;
    public zx0 s1;

    public ey0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, byte[] bArr) {
        this(true, context, e6Var, j10, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void I0(ey0 ey0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = ey0Var.r1;
        ArrayList arrayList = ey0Var.p1;
        if (ey0Var.m1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = ey0Var.q1;
            r02.option = bArr;
        } else {
            if (ey0Var.n1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.hp.s1(ey0Var.a).j1(j10);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (ey0Var.o1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.hp.s1(ey0Var.a).j1(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.hp.s1(ey0Var.a).j1(j10);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(ey0Var.a).sendRequest(r02, new ai.q1(ey0Var, charSequence, bArr, str, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(int i3, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.fc fcVar, final org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, String str, final org.telegram.messenger.u10 u10Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            int i10 = 1;
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_report, new c3.b(i10), new org.telegram.messenger.n10() { // from class: org.telegram.ui.xx0
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                            boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                            boolean[] zArr2 = zArr;
                            org.telegram.messenger.u10 u10Var2 = u10Var;
                            if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                                org.telegram.messenger.g0.i3(new ci.l8(1, u10Var2, zArr2), 200L);
                                return;
                            }
                            ey0 ey0Var = new ey0(false, context, e6Var, j10, z10, z11, arrayList, null);
                            if (z12) {
                                ey0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                            } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                                TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                                View[] viewPages = ey0Var.j1.getViewPages();
                                View view = viewPages[0];
                                if (view instanceof dy0) {
                                    ((dy0) view).a(0);
                                    ey0Var.b.post(new qv0(6, viewPages, tL_reportResultAddComment));
                                }
                                View view2 = viewPages[1];
                                if (view2 instanceof dy0) {
                                    ((dy0) view2).a(1);
                                }
                            }
                            ey0Var.s1 = new k4.j(zArr2, u10Var2, fcVar);
                            ey0Var.n(new ci.l8(2, u10Var2, zArr2));
                            ey0Var.show();
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_report, new c3.b(i10), new org.telegram.messenger.n10() { // from class: org.telegram.ui.xx0
                @Override // org.telegram.messenger.n10
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.u10 u10Var2 = u10Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.i3(new ci.l8(1, u10Var2, zArr2), 200L);
                        return;
                    }
                    ey0 ey0Var = new ey0(false, context, e6Var, j10, z10, z11, arrayList, null);
                    if (z12) {
                        ey0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = ey0Var.j1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof dy0) {
                            ((dy0) view).a(0);
                            ey0Var.b.post(new qv0(6, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof dy0) {
                            ((dy0) view2).a(1);
                        }
                    }
                    ey0Var.s1 = new k4.j(zArr2, u10Var2, fcVar);
                    ey0Var.n(new ci.l8(2, u10Var2, zArr2));
                    ey0Var.show();
                }
            });
        }
    }

    public static void K0(long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        int currentAccount = d2Var.getCurrentAccount();
        Context context = d2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(wm wmVar, org.telegram.messenger.zi ziVar) {
        int currentAccount = wmVar.getCurrentAccount();
        Activity parentActivity = wmVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.zi.B0(ziVar.k), false, org.telegram.messenger.zi.d3(ziVar.k), new ArrayList(Collections.singleton(Integer.valueOf(org.telegram.messenger.zi.d3(ziVar.k) ? ziVar.P0() : ziVar.f1()))), org.telegram.ui.Components.fc.a0(wmVar), wmVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(wm wmVar, org.telegram.messenger.zi ziVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int currentAccount = wmVar.getCurrentAccount();
        Activity parentActivity = wmVar.getParentActivity();
        long a10 = wmVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = ziVar.P0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ii.x0(parentActivity, e6Var, a10, bArr, wmVar, ziVar, currentAccount));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        if (this.j1.getCurrentView() instanceof dy0) {
            return !((dy0) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.j1.getViewPages();
        View view = viewPages[0];
        if (view instanceof dy0) {
            ((dy0) view).a(0);
            this.b.post(new qv0(5, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof dy0) {
            ((dy0) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.j1.getViewPages();
        View view = viewPages[0];
        if (view instanceof dy0) {
            ((dy0) view).a(0);
            this.b.post(new qv0(7, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof dy0) {
            ((dy0) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        by0 by0Var;
        gi.g1 g1Var = this.j1;
        if ((g1Var.getCurrentView() instanceof dy0) && (by0Var = ((dy0) g1Var.getCurrentView()).n) != null) {
            org.telegram.messenger.g0.v1(by0Var);
        }
        if (g1Var.getCurrentPosition() > 0) {
            g1Var.D(g1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int i3;
        Paint paint = this.k1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 >= 0 || (i3 = this.H0) != this.l1 || w02 == i3) {
                return;
            }
            this.H0 = w02;
            this.l1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ey0(boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, e6Var, true);
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.m1 = z10;
        this.p1 = arrayList;
        this.n1 = z11;
        this.o1 = z12;
        this.q1 = bArr;
        this.r1 = j10;
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        P(i3);
        this.l1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new r50(this, context);
        gi.g1 g1Var = new gi.g1(6, context, this);
        this.j1 = g1Var;
        int i10 = this.u0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(g1Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        g1Var.setAdapter(new ci.o4(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z10) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}
