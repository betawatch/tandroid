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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int w1 = 0;
    public final hi.i1 m1;
    public final Paint n1;
    public int o1;
    public final boolean p1;
    public final boolean q1;
    public final boolean r1;
    public final ArrayList s1;
    public final byte[] t1;
    public final long u1;
    public hy0 v1;

    public my0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, byte[] bArr) {
        this(true, context, e6Var, j3, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void I0(my0 my0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = my0Var.u1;
        ArrayList arrayList = my0Var.s1;
        if (my0Var.p1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = my0Var.t1;
            r02.option = bArr;
        } else {
            if (my0Var.q1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.s1(my0Var.a).j1(j3);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (my0Var.r1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.np.s1(my0Var.a).j1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.np.s1(my0Var.a).j1(j3);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(my0Var.a).sendRequest(r02, new bi.l1(my0Var, charSequence, bArr, str, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(int i7, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.cc ccVar, final org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, String str, final org.telegram.messenger.z10 z10Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            int i10 = 1;
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.s10() { // from class: org.telegram.ui.ey0
                        @Override // org.telegram.messenger.s10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                            boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                            boolean[] zArr2 = zArr;
                            org.telegram.messenger.z10 z10Var2 = z10Var;
                            if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                                org.telegram.messenger.g0.i3(new di.d8(1, z10Var2, zArr2), 200L);
                                return;
                            }
                            my0 my0Var = new my0(false, context, e6Var, j3, z10, z11, arrayList, null);
                            if (z12) {
                                my0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                            } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                                TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                                View[] viewPages = my0Var.m1.getViewPages();
                                View view = viewPages[0];
                                if (view instanceof ly0) {
                                    ((ly0) view).a(0);
                                    my0Var.b.post(new mp0(28, viewPages, tL_reportResultAddComment));
                                }
                                View view2 = viewPages[1];
                                if (view2 instanceof ly0) {
                                    ((ly0) view2).a(1);
                                }
                            }
                            my0Var.v1 = new ld0(zArr2, z10Var2, ccVar, 1);
                            my0Var.n(new di.d8(2, z10Var2, zArr2));
                            my0Var.show();
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.s10() { // from class: org.telegram.ui.ey0
                @Override // org.telegram.messenger.s10
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.z10 z10Var2 = z10Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.i3(new di.d8(1, z10Var2, zArr2), 200L);
                        return;
                    }
                    my0 my0Var = new my0(false, context, e6Var, j3, z10, z11, arrayList, null);
                    if (z12) {
                        my0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = my0Var.m1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof ly0) {
                            ((ly0) view).a(0);
                            my0Var.b.post(new mp0(28, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof ly0) {
                            ((ly0) view2).a(1);
                        }
                    }
                    my0Var.v1 = new ld0(zArr2, z10Var2, ccVar, 1);
                    my0Var.n(new di.d8(2, z10Var2, zArr2));
                    my0Var.show();
                }
            });
        }
    }

    public static void K0(long j3, org.telegram.ui.ActionBar.e2 e2Var) {
        int currentAccount = e2Var.getCurrentAccount();
        Context context = e2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(an anVar, org.telegram.messenger.gj gjVar) {
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.gj.B0(gjVar.k), false, org.telegram.messenger.gj.c3(gjVar.k), new ArrayList(Collections.singleton(Integer.valueOf(org.telegram.messenger.gj.c3(gjVar.k) ? gjVar.P0() : gjVar.e1()))), org.telegram.ui.Components.cc.a0(anVar), anVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(an anVar, org.telegram.messenger.gj gjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        long a10 = anVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = gjVar.R0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ki.x0(parentActivity, e6Var, a10, bArr, anVar, gjVar, currentAccount));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        if (this.m1.getCurrentView() instanceof ly0) {
            return !((ly0) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ly0) {
            ((ly0) view).a(0);
            this.b.post(new mp0(27, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ly0) {
            ((ly0) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ly0) {
            ((ly0) view).a(0);
            this.b.post(new mp0(29, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ly0) {
            ((ly0) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        jy0 jy0Var;
        hi.i1 i1Var = this.m1;
        if ((i1Var.getCurrentView() instanceof ly0) && (jy0Var = ((ly0) i1Var.getCurrentView()).n) != null) {
            org.telegram.messenger.g0.v1(jy0Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.C(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int i7;
        Paint paint = this.n1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 >= 0 || (i7 = this.H0) != this.o1 || w02 == i7) {
                return;
            }
            this.H0 = w02;
            this.o1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public my0(boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, e6Var, true);
        Paint paint = new Paint(1);
        this.n1 = paint;
        this.p1 = z10;
        this.s1 = arrayList;
        this.q1 = z11;
        this.r1 = z12;
        this.t1 = bArr;
        this.u1 = j3;
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        Q(i7);
        this.o1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new w50(this, context);
        hi.i1 i1Var = new hi.i1(6, context, this);
        this.m1 = i1Var;
        int i10 = this.u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(i1Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        i1Var.setAdapter(new di.f4(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z10) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}
