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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oy0 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int s1 = 0;
    public final fi.g1 i1;
    public final Paint j1;
    public int k1;
    public final boolean l1;
    public final boolean m1;
    public final boolean n1;
    public final ArrayList o1;
    public final byte[] p1;
    public final long q1;
    public jy0 r1;

    public oy0(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, byte[] bArr) {
        this(true, context, f6Var, j3, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void I0(oy0 oy0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = oy0Var.q1;
        ArrayList arrayList = oy0Var.o1;
        if (oy0Var.l1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = oy0Var.p1;
            r02.option = bArr;
        } else {
            if (oy0Var.m1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.qp.s1(oy0Var.a).j1(j3);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (oy0Var.n1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.qp.s1(oy0Var.a).j1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.qp.s1(oy0Var.a).j1(j3);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(oy0Var.a).sendRequest(r02, new bi.g2(oy0Var, charSequence, bArr, str, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(int i7, final Context context, final long j3, final boolean z9, final boolean z10, final ArrayList arrayList, final org.telegram.ui.Components.hc hcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final org.telegram.messenger.c20 c20Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            int i10 = 1;
            final boolean[] zArr = {false};
            if (z9) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z10) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.v10() { // from class: org.telegram.ui.gy0
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                            boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                            boolean[] zArr2 = zArr;
                            org.telegram.messenger.c20 c20Var2 = c20Var;
                            if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                                org.telegram.messenger.g0.i3(new bi.l9(1, c20Var2, zArr2), 200L);
                                return;
                            }
                            oy0 oy0Var = new oy0(false, context, f6Var, j3, z9, z10, arrayList, null);
                            if (z11) {
                                oy0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                            } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                                TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                                View[] viewPages = oy0Var.i1.getViewPages();
                                View view = viewPages[0];
                                if (view instanceof ny0) {
                                    ((ny0) view).a(0);
                                    oy0Var.b.post(new by0(1, viewPages, tL_reportResultAddComment));
                                }
                                View view2 = viewPages[1];
                                if (view2 instanceof ny0) {
                                    ((ny0) view2).a(1);
                                }
                            }
                            oy0Var.r1 = new hy0(zArr2, c20Var2, hcVar, 0);
                            oy0Var.n(new bi.l9(2, c20Var2, zArr2));
                            oy0Var.show();
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.v10() { // from class: org.telegram.ui.gy0
                @Override // org.telegram.messenger.v10
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.c20 c20Var2 = c20Var;
                    if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.i3(new bi.l9(1, c20Var2, zArr2), 200L);
                        return;
                    }
                    oy0 oy0Var = new oy0(false, context, f6Var, j3, z9, z10, arrayList, null);
                    if (z11) {
                        oy0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = oy0Var.i1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof ny0) {
                            ((ny0) view).a(0);
                            oy0Var.b.post(new by0(1, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof ny0) {
                            ((ny0) view2).a(1);
                        }
                    }
                    oy0Var.r1 = new hy0(zArr2, c20Var2, hcVar, 0);
                    oy0Var.n(new bi.l9(2, c20Var2, zArr2));
                    oy0Var.show();
                }
            });
        }
    }

    public static void K0(long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        int currentAccount = f2Var.getCurrentAccount();
        Context context = f2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(an anVar, org.telegram.messenger.ij ijVar) {
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.ij.B0(ijVar.k), false, org.telegram.messenger.ij.d3(ijVar.k), new ArrayList(Collections.singleton(Integer.valueOf(org.telegram.messenger.ij.d3(ijVar.k) ? ijVar.P0() : ijVar.f1()))), org.telegram.ui.Components.hc.a0(anVar), anVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(an anVar, org.telegram.messenger.ij ijVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        long a10 = anVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = ijVar.P0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new hi.w0(parentActivity, f6Var, a10, bArr, anVar, ijVar, currentAccount));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        if (this.i1.getCurrentView() instanceof ny0) {
            return !((ny0) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ny0) {
            ((ny0) view).a(0);
            this.b.post(new by0(0, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ny0) {
            ((ny0) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ny0) {
            ((ny0) view).a(0);
            this.b.post(new by0(2, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ny0) {
            ((ny0) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        ly0 ly0Var;
        fi.g1 g1Var = this.i1;
        if ((g1Var.getCurrentView() instanceof ny0) && (ly0Var = ((ny0) g1Var.getCurrentView()).n) != null) {
            org.telegram.messenger.g0.v1(ly0Var);
        }
        if (g1Var.getCurrentPosition() > 0) {
            g1Var.E(g1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int i7;
        Paint paint = this.j1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.F0 >= 0 || (i7 = this.G0) != this.k1 || w02 == i7) {
                return;
            }
            this.G0 = w02;
            this.k1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public oy0(boolean z9, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z10, boolean z11, ArrayList arrayList, byte[] bArr) {
        super(1, context, f6Var, true);
        Paint paint = new Paint(1);
        this.j1 = paint;
        this.l1 = z9;
        this.o1 = arrayList;
        this.m1 = z10;
        this.n1 = z11;
        this.p1 = bArr;
        this.q1 = j3;
        int i7 = org.telegram.ui.ActionBar.k6.h5;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        P(i7);
        this.k1 = this.G0;
        this.P0 = true;
        this.Q0 = true;
        this.b = new x50(this, context);
        fi.g1 g1Var = new fi.g1(6, context, this);
        this.i1 = g1Var;
        int i10 = this.t0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(g1Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        g1Var.setAdapter(new bi.g5(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z9) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}
