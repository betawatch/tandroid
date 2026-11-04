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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.e1, r0.m, org.telegram.messenger.o10, org.telegram.ui.Cells.z4, org.telegram.messenger.ic, RequestTimeDelegate, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.hj0, mg.e, kg.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.p0 = I0;
                premiumPreviewFragment.a.setPadding(0, I0.b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.p0.d);
                org.telegram.ui.Components.tj0 tj0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.p0;
                org.telegram.messenger.g0.B3(tj0Var, bVar.a, 0, bVar.c, 0);
                ks0 ks0Var = premiumPreviewFragment.V;
                i0.b bVar2 = premiumPreviewFragment.p0;
                ks0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i3 = premiumPreviewFragment.p0.a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i3, L, bVar3.c, bVar3.d);
                }
                break;
            default:
                ee0 ee0Var = (ee0) ((gb1) this.b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i10 = I02.a;
                ee0Var.N = i10;
                int i11 = I02.c;
                ee0Var.O = i11;
                ee0Var.M = I02.d;
                boolean a10 = ee0Var.E.a();
                int L2 = a10 ? org.telegram.messenger.g0.L(44.0f) : 0;
                ee0Var.E.setPadding(0, 0, 0, ee0Var.M);
                int L3 = org.telegram.messenger.g0.L(72.0f) + ee0Var.M + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ee0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    ee0Var.I.setLayoutParams(marginLayoutParams);
                }
                int i12 = a10 ? ee0Var.M + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ee0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != i11) {
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    marginLayoutParams2.bottomMargin = i12;
                    ee0Var.c.setLayoutParams(marginLayoutParams2);
                }
                ee0Var.F.setPadding(i10, 0, i11, ee0Var.M);
                if (a10) {
                    k1Var = k1Var.a.m(0, 0, 0, ee0Var.M);
                }
                ee0Var.o0();
                ee0Var.n0();
                SparseArray sparseArray = ee0Var.a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    eb1 eb1Var = (eb1) sparseArray.valueAt(i13);
                    if (eb1Var != null && (fragmentView = eb1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void a() {
        switch (this.a) {
            case 6:
                ((pr0) this.b).e();
                break;
            default:
                ((w71) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ht0 ht0Var = (ht0) this.b;
        if (!z10) {
            return true;
        }
        ht0Var.d.Z((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((at0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.bd.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.bd.H(',', "Stars", num.intValue());
        }
        if (privacyControlActivity.B0 == null) {
            SpannableString spannableString = new SpannableString("l");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3, 0);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            wpVar.r = L;
            wpVar.s = L2;
            spannableString.setSpan(wpVar, 0, 1, 33);
            privacyControlActivity.B0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        switch (this.a) {
            case 17:
                return ((s11) this.b).e1(i3, view);
            default:
                ((d81) this.b).K.f(i3, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                org.telegram.messenger.az.s = "";
                org.telegram.messenger.az.x = false;
                org.telegram.messenger.az.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.c.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.v9) {
                            org.telegram.ui.ActionBar.r6.V(((org.telegram.ui.Cells.v9) childAt).getTextView(), org.telegram.ui.ActionBar.k6.E6, null);
                        } else {
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.hs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((ba.i) this.b).c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.U4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                ((fr0) this.b).finishFragment();
                break;
            case 5:
                ((zq0) this.b).a.S.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i14 = PopupNotificationActivity.c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 11:
                kt0 kt0Var = (kt0) this.b;
                RectF rectF = ProfileActivity.T6;
                kt0Var.a(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((fi0) this.b).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.az.i((org.telegram.messenger.zy) obj);
                }
                if (org.telegram.messenger.az.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.hs.e().n(proxyListActivity, org.telegram.messenger.hs.A4);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.A4, new Object[0]);
                org.telegram.messenger.hs.e().c(proxyListActivity, org.telegram.messenger.hs.A4);
                proxyListActivity.h0(true);
                n4 n4Var = proxyListActivity.a;
                if (n4Var != null) {
                    if (org.telegram.messenger.az.B1 == null) {
                        i10 = proxyListActivity.useProxyRow;
                        n4Var.h(i10, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((l51) this.b).a;
                boolean p02 = ThemeActivity.p0(themeActivity, org.telegram.messenger.g0.Q1() ? 18 : 16);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    v51 v51Var = themeActivity.a;
                    i11 = themeActivity.textSizeRow;
                    v51Var.h(i11, new Object());
                    v51 v51Var2 = themeActivity.a;
                    i12 = themeActivity.bubbleRadiusRow;
                    v51Var2.h(i12, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0("Blue");
                    org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
                    SparseArray sparseArray = Q0.b0;
                    int i16 = org.telegram.ui.ActionBar.k6.n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i16);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.c = "d";
                        b6Var.a = "Blue_99_wp.jpg";
                        b6Var.b = "Blue_99_wp.jpg";
                        g6Var.y = b6Var;
                        Q0.v(b6Var);
                    }
                    if (Q0 == D0) {
                        if (Q0.Z == i16) {
                            org.telegram.ui.ActionBar.k6.u1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.k6.K1(D0, themeActivity.f == 1, i16, null);
                            themeActivity.a.g(themeActivity.r0);
                            break;
                        }
                    } else {
                        Q0.u(i16);
                        org.telegram.ui.ActionBar.k6.z1(Q0, true, false, true, false, false);
                        themeActivity.c.B1(Q0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 20:
                l71 l71Var = ((p61) this.b).a;
                org.telegram.ui.ActionBar.j6 j6Var = l71Var.g0;
                org.telegram.ui.ActionBar.k6.l0(j6Var, l71Var.w, true);
                org.telegram.ui.ActionBar.k6.p();
                org.telegram.ui.ActionBar.k6.t1(false, false);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, j6Var, Boolean.valueOf(l71Var.h0), null, -1);
                l71Var.finishFragment();
                break;
            default:
                ((pa1) this.b).a.J0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 1:
                PasskeysActivity.b0((PasskeysActivity) this.b, (org.telegram.ui.Components.r31) obj, (View) obj2);
                break;
            default:
                dy0 dy0Var = (dy0) this.b;
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) obj;
                ey0 ey0Var = dy0Var.w;
                if (r31Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = dy0Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = dy0Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = dy0Var.d;
                            if (tL_reportResultAddComment == null) {
                                ey0.I0(ey0Var, r31Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    ey0.I0(ey0Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(r31Var.d);
                            if (tL_messageReportOption != null) {
                                ey0.I0(ey0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(r31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            ey0.I0(ey0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // kg.u1
    public void r(int i3) {
        cb1 cb1Var = (cb1) this.b;
        if (cb1Var.h == null && !cb1Var.f.e()) {
            cb1Var.w.f.e(false, true);
        }
        cb1Var.f();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        org.telegram.messenger.g0.h3(new ci.e3((org.telegram.messenger.zy) this.b, j10, 29));
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        ai.d3 d3Var = (ai.d3) this.b;
        RectF rectF = ProfileActivity.T6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        d3Var.run();
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }
}
