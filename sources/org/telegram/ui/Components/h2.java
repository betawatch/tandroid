package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h2(int i10, int i11, m3 m3Var, o3 o3Var, int i12, n3 n3Var) {
        this.b = i10;
        this.c = i11;
        this.e = m3Var;
        this.f = o3Var;
        this.d = i12;
        this.g = n3Var;
    }

    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String, org.telegram.ui.ActionBar.u1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10;
        int i11;
        ?? r52;
        AlertDialog$Builder alertDialog$Builder;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i12 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        int i13 = this.d;
        int i14 = this.c;
        int i15 = this.b;
        KeyEvent.Callback callback = this.e;
        switch (i12) {
            case 0:
                m3 m3Var = (m3) callback;
                o3 o3Var = (o3) obj3;
                n3 n3Var = (n3) obj2;
                Boolean bool = (Boolean) obj;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = i14 % 60;
                int i19 = (i14 - i18) / 60;
                if (i18 == 0 && i19 > 0) {
                    i19--;
                    i18 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = m3Var.getValue();
                    i10 = o3Var.getValue();
                } else {
                    i10 = i13 % 60;
                    i11 = (i13 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                m3Var.setMinValue(i17);
                m3Var.setMaxValue(i19);
                if (i11 > i19) {
                    m3Var.setValue(i19);
                    i11 = i19;
                } else if (i11 < i17) {
                    m3Var.setValue(i17);
                    i11 = i17;
                }
                if (i11 <= i17) {
                    o3Var.setMinValue(i16);
                    o3Var.setMaxValue(i17 == i19 ? i18 : 59);
                } else if (i11 >= i19) {
                    if (i17 != i19) {
                        i16 = 0;
                    }
                    o3Var.setMinValue(i16);
                    o3Var.setMaxValue(i18);
                } else if (i17 == i19) {
                    o3Var.setMinValue(i16);
                    o3Var.setMaxValue(i18);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i10 > o3Var.getMaxValue()) {
                    i10 = o3Var.getMaxValue();
                    o3Var.setValue(i10);
                } else if (i10 < o3Var.getMinValue()) {
                    i10 = o3Var.getMinValue();
                    o3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i11);
                    o3Var.setValue(i10);
                }
                n3Var.invalidate();
                break;
            default:
                final rh.e4 e4Var = (rh.e4) callback;
                final mg.i2[] i2VarArr = (mg.i2[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l4 = (Long) obj;
                int i20 = 20;
                if (l4.longValue() != -99 && l4.longValue() != -98) {
                    u41 u41Var = new u41(e4Var, l4, i2VarArr, i20);
                    if (l4.longValue() < 0) {
                        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(e4Var.a).M0(-l4.longValue());
                        if (M0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = org.telegram.messenger.vp.r1(e4Var.a).g1(-l4.longValue());
                            ConnectionsManager.getInstance(e4Var.a).sendRequest(tL_channels_getFullChannel, new org.telegram.ui.ul0(26, e4Var, u41Var));
                            break;
                        } else if (!M0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                            String L0 = org.telegram.messenger.cd.L0(2131750271, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.cd.L0(2131750272, null);
                        }
                    } else if (l4.longValue() >= 0) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(e4Var.a).Z1(l4);
                        TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(e4Var.a).a2(l4.longValue());
                        if (a2 != null && (disallowedGiftsSettings = a2.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(l4.longValue())), new cc(i2VarArr[0].c, e4Var.I0), R.raw.error, 36);
                            break;
                        } else if (a2 == null && Z1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = org.telegram.messenger.vp.r1(e4Var.a).p1(Z1);
                            ConnectionsManager.getInstance(e4Var.a).sendRequest(tL_users_getFullUser, new org.telegram.ui.mb(e4Var, i2VarArr, l4, u41Var, 12));
                            break;
                        }
                    }
                    u41Var.run();
                    break;
                } else if (i15 >= i14) {
                    if (l4.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                        String L02 = org.telegram.messenger.cd.L0(2131750113, null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder3.a;
                        x1Var2.R = L02;
                        x1Var2.T = org.telegram.messenger.cd.L0(2131750112, null);
                        String t10 = org.telegram.ui.Wallet.k0.x(e4Var.a).t();
                        LinearLayout linearLayout = new LinearLayout(e4Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t10)) {
                            TextView textView = new TextView(e4Var.getContext());
                            textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.i0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
                            int i21 = org.telegram.ui.ActionBar.t6.j5;
                            int w02 = org.telegram.ui.ActionBar.t6.w0(i21, e4Var.I0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.045f, i21);
                            org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
                            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r5, e4Var.I0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t10.length() + 3) / 4;
                            for (int i22 = 0; i22 < length; i22++) {
                                if (i22 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i22 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i23 = i22 * 4;
                                spannableStringBuilder.append((CharSequence) t10, i23, Math.min(t10.length(), i23 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i22 / 4) + (i22 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, w7.b6.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(e4Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, e4Var.I0);
                        org.telegram.messenger.m5.l(textView2, 17, null, 2131750117);
                        linearLayout.addView(textView2, w7.b6.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(e4Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i24 = org.telegram.ui.ActionBar.t6.r5;
                        r52 = 0;
                        e4Var.l1(linearLayout2, R.drawable.msg_settings, 14, i24, org.telegram.messenger.cd.L0(2131745512, null), true);
                        e4Var.l1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.t6.Ci, org.telegram.messenger.cd.L0(2131743220, null), true);
                        e4Var.l1(linearLayout2, R.drawable.menu_gift, 14, i24, org.telegram.messenger.cd.L0(2131743196, null), false);
                        linearLayout.addView(linearLayout2, w7.b6.t(-2, -2, 1, 0, 7, 0, 3));
                        e4Var.p3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, e4Var.getContext(), e4Var.I0);
                        int i25 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, e4Var.I0), 7, org.telegram.messenger.i0.L(12.0f));
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i25);
                        org.telegram.ui.ActionBar.p6 p6Var2 = e4Var.I0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (org.telegram.messenger.cd.X ? 5 : 3) | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(org.telegram.messenger.cd.L0(2131750147, null), "", true, false, false);
                        c2Var.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
                        c2Var.setOnClickListener(new org.telegram.ui.rv0(29, e4Var, c2Var));
                        linearLayout.addView(c2Var, w7.b6.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        x1Var2.G = 20;
                        final int i26 = 0;
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131750118, null), new org.telegram.ui.ActionBar.u1() { // from class: rh.a1
                            @Override // org.telegram.ui.ActionBar.u1
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var3, int i27) {
                                switch (i26) {
                                    case 0:
                                        gf.e h = x1Var3.h(i27, true, true);
                                        mg.i2 i2Var = i2VarArr[0];
                                        Objects.requireNonNull(i2Var);
                                        e4Var.r2(true, x1Var3, h, new mg.w1(i2Var, 11));
                                        break;
                                    default:
                                        gf.e h10 = x1Var3.h(i27, true, true);
                                        mg.i2 i2Var2 = i2VarArr[0];
                                        Objects.requireNonNull(i2Var2);
                                        e4Var.r2(false, x1Var3, h10, new mg.w1(i2Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        r52 = 0;
                        LinearLayout linearLayout3 = new LinearLayout(e4Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new rh.c3(e4Var.getContext(), tL_starGiftUnique), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(e4Var.getContext());
                        int i27 = org.telegram.ui.ActionBar.t6.j5;
                        org.telegram.messenger.m5.m(textView3, i27, e4Var.I0, 1, 20.0f);
                        textView3.setText(org.telegram.messenger.cd.L0(2131750221, null));
                        linearLayout3.addView(textView3, w7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(e4Var.getContext());
                        org.telegram.ui.ActionBar.a7.V(textView4, i27, e4Var.I0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.m5.q(null, null, 2131750222, new Object[]{e4Var.z1()}, textView4);
                        linearLayout3.addView(textView4, w7.b6.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                        alertDialog$Builder4.o(linearLayout3);
                        final int i28 = 1;
                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131750223, null), new org.telegram.ui.ActionBar.u1() { // from class: rh.a1
                            @Override // org.telegram.ui.ActionBar.u1
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var3, int i272) {
                                switch (i28) {
                                    case 0:
                                        gf.e h = x1Var3.h(i272, true, true);
                                        mg.i2 i2Var = i2VarArr[0];
                                        Objects.requireNonNull(i2Var);
                                        e4Var.r2(true, x1Var3, h, new mg.w1(i2Var, 11));
                                        break;
                                    default:
                                        gf.e h10 = x1Var3.h(i272, true, true);
                                        mg.i2 i2Var2 = i2VarArr[0];
                                        Objects.requireNonNull(i2Var2);
                                        e4Var.r2(false, x1Var3, h10, new mg.w1(i2Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i0.a.s(r52, 2131752589, alertDialog$Builder, r52);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                    String L03 = org.telegram.messenger.cd.L0(2131750216, null);
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
                    x1Var3.R = L03;
                    x1Var3.T = org.telegram.messenger.cd.G(Math.max(1, i13), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                break;
        }
    }

    public /* synthetic */ h2(rh.e4 e4Var, int i10, int i11, int i12, mg.i2[] i2VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = e4Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = i2VarArr;
        this.g = tL_starGiftUnique;
    }
}
