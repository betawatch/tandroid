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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements org.telegram.messenger.x10, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.t10, org.telegram.ui.Cells.z4, org.telegram.messenger.nc, RequestTimeDelegate, org.telegram.ui.ActionBar.d2, org.telegram.ui.Components.ij0, lg.e, jg.y1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ni0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.p0 = I0;
                premiumPreviewFragment.a.setPadding(0, I0.b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.p0.d);
                org.telegram.ui.Components.uj0 uj0Var = premiumPreviewFragment.a;
                i0.c cVar = premiumPreviewFragment.p0;
                org.telegram.messenger.g0.A3(uj0Var, cVar.a, 0, cVar.c, 0);
                rs0 rs0Var = premiumPreviewFragment.V;
                i0.c cVar2 = premiumPreviewFragment.p0;
                rs0Var.setPadding(cVar2.a, 0, cVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i7 = premiumPreviewFragment.p0.a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i7, L, cVar3.c, cVar3.d);
                }
                break;
            default:
                je0 je0Var = (je0) ((mb1) this.b);
                i0.c I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i10 = I02.a;
                je0Var.N = i10;
                int i11 = I02.c;
                je0Var.O = i11;
                je0Var.M = I02.d;
                boolean a10 = je0Var.E.a();
                int L2 = a10 ? org.telegram.messenger.g0.L(44.0f) : 0;
                je0Var.E.setPadding(0, 0, 0, je0Var.M);
                int L3 = org.telegram.messenger.g0.L(72.0f) + je0Var.M + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) je0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    je0Var.I.setLayoutParams(marginLayoutParams);
                }
                int i12 = a10 ? je0Var.M + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) je0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != i11) {
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    marginLayoutParams2.bottomMargin = i12;
                    je0Var.c.setLayoutParams(marginLayoutParams2);
                }
                je0Var.F.setPadding(i10, 0, i11, je0Var.M);
                if (a10) {
                    k1Var = k1Var.a.m(0, 0, 0, je0Var.M);
                }
                je0Var.o0();
                je0Var.n0();
                SparseArray sparseArray = je0Var.a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    kb1 kb1Var = (kb1) sparseArray.valueAt(i13);
                    if (kb1Var != null && (fragmentView = kb1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void a() {
        switch (this.a) {
            case 5:
                ((xr0) this.b).e();
                break;
            default:
                ((e81) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        switch (this.a) {
            case 16:
                return ((z11) this.b).e1(i7, view);
            default:
                ((l81) this.b).K.b(i7, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ot0 ot0Var = (ot0) this.b;
        if (!z10) {
            return true;
        }
        ot0Var.d.Z((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((ht0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.hd.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.hd.H(',', "Stars", num.intValue());
        }
        if (privacyControlActivity.B0 == null) {
            SpannableString spannableString = new SpannableString("l");
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            eqVar.r = L;
            eqVar.s = L2;
            spannableString.setSpan(eqVar, 0, 1, 33);
            privacyControlActivity.B0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.b).c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.T4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.z0(false, false);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((nr0) this.b).finishFragment();
                break;
            case 4:
                ((hr0) this.b).a.S.r();
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i13 = PopupNotificationActivity.c0;
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
                rt0 rt0Var = (rt0) this.b;
                RectF rectF = ProfileActivity.X6;
                rt0Var.a(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ji0) this.b).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.gz.i((org.telegram.messenger.fz) obj);
                }
                if (org.telegram.messenger.gz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.ns.e().n(proxyListActivity, org.telegram.messenger.ns.A4);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.A4, new Object[0]);
                org.telegram.messenger.ns.e().c(proxyListActivity, org.telegram.messenger.ns.A4);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.a;
                if (l4Var != null) {
                    if (org.telegram.messenger.gz.B1 == null) {
                        i10 = proxyListActivity.useProxyRow;
                        l4Var.h(i10, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 18:
                ThemeActivity themeActivity = ((s51) this.b).a;
                boolean p02 = ThemeActivity.p0(themeActivity, org.telegram.messenger.g0.Q1() ? 18 : 16);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    c61 c61Var = themeActivity.a;
                    i11 = themeActivity.textSizeRow;
                    c61Var.h(i11, new Object());
                    c61 c61Var2 = themeActivity.a;
                    i12 = themeActivity.bubbleRadiusRow;
                    c61Var2.h(i12, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0("Blue");
                    org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
                    SparseArray sparseArray = Q0.b0;
                    int i15 = org.telegram.ui.ActionBar.j6.n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i15);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.c = "d";
                        b6Var.a = "Blue_99_wp.jpg";
                        b6Var.b = "Blue_99_wp.jpg";
                        g6Var.y = b6Var;
                        Q0.v(b6Var);
                    }
                    if (Q0 == D0) {
                        if (Q0.Z == i15) {
                            org.telegram.ui.ActionBar.j6.u1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.j6.K1(D0, themeActivity.f == 1, i15, null);
                            themeActivity.a.g(themeActivity.r0);
                            break;
                        }
                    } else {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.j6.z1(Q0, true, false, true, false, false);
                        themeActivity.c.B1(Q0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 19:
                t71 t71Var = ((v61) this.b).a;
                org.telegram.ui.ActionBar.i6 i6Var = t71Var.g0;
                org.telegram.ui.ActionBar.j6.l0(i6Var, t71Var.w, true);
                org.telegram.ui.ActionBar.j6.p();
                org.telegram.ui.ActionBar.j6.t1(false, false);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, i6Var, Boolean.valueOf(t71Var.h0), null, -1);
                t71Var.finishFragment();
                break;
            default:
                ((va1) this.b).a.J0(true);
                break;
        }
    }

    @Override // jg.y1
    public void i(int i7) {
        ib1 ib1Var = (ib1) this.b;
        if (ib1Var.h == null && !ib1Var.f.e()) {
            ib1Var.w.f.e(false, true);
        }
        ib1Var.f();
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                PasskeysActivity.b0((PasskeysActivity) this.b, (org.telegram.ui.Components.b41) obj, (View) obj2);
                break;
            default:
                ly0 ly0Var = (ly0) this.b;
                org.telegram.ui.Components.b41 b41Var = (org.telegram.ui.Components.b41) obj;
                my0 my0Var = ly0Var.w;
                if (b41Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ly0Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ly0Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = ly0Var.d;
                            if (tL_reportResultAddComment == null) {
                                my0.I0(my0Var, b41Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    my0.I0(my0Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(b41Var.d);
                            if (tL_messageReportOption != null) {
                                my0.I0(my0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(b41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            my0.I0(my0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        bi.u2 u2Var = (bi.u2) this.b;
        RectF rectF = ProfileActivity.X6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        u2Var.run();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new di.x2((org.telegram.messenger.fz) this.b, j3, 29));
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
    }
}
