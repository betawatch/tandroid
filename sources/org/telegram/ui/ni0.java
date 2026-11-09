package org.telegram.ui;

import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements org.telegram.messenger.a20, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.w10, org.telegram.ui.Cells.z4, org.telegram.messenger.oc, RequestTimeDelegate, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.ej0, lg.e, jg.y1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ni0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.o0 = I0;
                premiumPreviewFragment.a.setPadding(0, I0.b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.qj0 qj0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                org.telegram.messenger.g0.B3(qj0Var, bVar.a, 0, bVar.c, 0);
                ws0 ws0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                ws0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i7 = premiumPreviewFragment.o0.a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i7, L, bVar3.c, bVar3.d);
                }
                break;
            default:
                le0 le0Var = (le0) ((qb1) this.b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i10 = I02.a;
                le0Var.M = i10;
                int i11 = I02.c;
                le0Var.N = i11;
                le0Var.L = I02.d;
                boolean a10 = le0Var.D.a();
                int L2 = a10 ? org.telegram.messenger.g0.L(44.0f) : 0;
                le0Var.D.setPadding(0, 0, 0, le0Var.L);
                int L3 = org.telegram.messenger.g0.L(72.0f) + le0Var.L + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) le0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    le0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i12 = a10 ? le0Var.L + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) le0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != i11) {
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    marginLayoutParams2.bottomMargin = i12;
                    le0Var.c.setLayoutParams(marginLayoutParams2);
                }
                le0Var.E.setPadding(i10, 0, i11, le0Var.L);
                if (a10) {
                    k1Var = k1Var.a.m(0, 0, 0, le0Var.L);
                }
                le0Var.o0();
                le0Var.n0();
                SparseArray sparseArray = le0Var.a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i13);
                    if (ob1Var != null && (fragmentView = ob1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void a() {
        switch (this.a) {
            case 5:
                ((bs0) this.b).e();
                break;
            default:
                ((h81) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        tt0 tt0Var = (tt0) this.b;
        if (!z9) {
            return true;
        }
        tt0Var.d.Z((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        switch (this.a) {
            case 16:
                return ((e21) this.b).e1(i7, view);
            default:
                ((o81) this.b).J.c(i7, view);
                return true;
        }
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((lt0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.id.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.id.H(',', "Stars", num.intValue());
        }
        if (privacyControlActivity.A0 == null) {
            SpannableString spannableString = new SpannableString("l");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3, 0);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            wpVar.r = L;
            wpVar.s = L2;
            spannableString.setSpan(wpVar, 0, 1, 33);
            privacyControlActivity.A0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.A0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.b).c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.S4, photoViewer.D, photoViewer.v2, true);
                    photoViewer.z0(false, false);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((rr0) this.b).finishFragment();
                break;
            case 4:
                ((lr0) this.b).a.R.r();
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i13 = PopupNotificationActivity.b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                wt0 wt0Var = (wt0) this.b;
                RectF rectF = ProfileActivity.V6;
                wt0Var.a(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ji0) this.b).c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.iz.i((org.telegram.messenger.hz) obj);
                }
                if (org.telegram.messenger.iz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.qs.e().n(proxyListActivity, org.telegram.messenger.qs.A4);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.A4, new Object[0]);
                org.telegram.messenger.qs.e().c(proxyListActivity, org.telegram.messenger.qs.A4);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.a;
                if (l4Var != null) {
                    if (org.telegram.messenger.iz.B1 == null) {
                        i10 = proxyListActivity.useProxyRow;
                        l4Var.h(i10, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 18:
                ThemeActivity themeActivity = ((w51) this.b).a;
                boolean p02 = ThemeActivity.p0(themeActivity, org.telegram.messenger.g0.Q1() ? 18 : 16);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    g61 g61Var = themeActivity.a;
                    i11 = themeActivity.textSizeRow;
                    g61Var.h(i11, new Object());
                    g61 g61Var2 = themeActivity.a;
                    i12 = themeActivity.bubbleRadiusRow;
                    g61Var2.h(i12, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0("Blue");
                    org.telegram.ui.ActionBar.k6 D0 = org.telegram.ui.ActionBar.l6.D0();
                    SparseArray sparseArray = Q0.a0;
                    int i15 = org.telegram.ui.ActionBar.l6.n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i15);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.c = "d";
                        d6Var.a = "Blue_99_wp.jpg";
                        d6Var.b = "Blue_99_wp.jpg";
                        i6Var.y = d6Var;
                        Q0.v(d6Var);
                    }
                    if (Q0 == D0) {
                        if (Q0.Y == i15) {
                            org.telegram.ui.ActionBar.l6.u1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.l6.K1(D0, themeActivity.f == 1, i15, null);
                            themeActivity.a.g(themeActivity.q0);
                            break;
                        }
                    } else {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.l6.z1(Q0, true, false, true, false, false);
                        themeActivity.c.B1(Q0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 19:
                w71 w71Var = ((a71) this.b).a;
                org.telegram.ui.ActionBar.k6 k6Var = w71Var.f0;
                org.telegram.ui.ActionBar.l6.l0(k6Var, w71Var.w, true);
                org.telegram.ui.ActionBar.l6.p();
                org.telegram.ui.ActionBar.l6.t1(false, false);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, k6Var, Boolean.valueOf(w71Var.g0), null, -1);
                w71Var.finishFragment();
                break;
            default:
                ((za1) this.b).a.J0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                PasskeysActivity.b0((PasskeysActivity) this.b, (org.telegram.ui.Components.y31) obj, (View) obj2);
                break;
            default:
                qy0 qy0Var = (qy0) this.b;
                org.telegram.ui.Components.y31 y31Var = (org.telegram.ui.Components.y31) obj;
                ry0 ry0Var = qy0Var.w;
                if (y31Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = qy0Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = qy0Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = qy0Var.d;
                            if (tL_reportResultAddComment == null) {
                                ry0.I0(ry0Var, y31Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    ry0.I0(ry0Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(y31Var.d);
                            if (tL_messageReportOption != null) {
                                ry0.I0(ry0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(y31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            ry0.I0(ry0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public void q(int i7) {
        mb1 mb1Var = (mb1) this.b;
        if (mb1Var.h == null && !mb1Var.f.e()) {
            mb1Var.w.f.e(false, true);
        }
        mb1Var.f();
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        jg.c1 c1Var = (jg.c1) this.b;
        RectF rectF = ProfileActivity.V6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        c1Var.run();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new bi.r3((org.telegram.messenger.hz) this.b, j3, 29));
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }
}
