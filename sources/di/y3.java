package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements y10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y3(int i7, int i10, org.telegram.ui.Components.v3 v3Var, org.telegram.ui.Components.x3 x3Var, int i11, org.telegram.ui.Components.w3 w3Var) {
        this.b = i7;
        this.c = i10;
        this.e = v3Var;
        this.f = x3Var;
        this.d = i11;
        this.g = w3Var;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i10;
        int i11;
        int i12 = this.a;
        Object obj2 = this.g;
        int i13 = this.d;
        Object obj3 = this.f;
        KeyEvent.Callback callback = this.e;
        int i14 = this.c;
        int i15 = this.b;
        switch (i12) {
            case 0:
                final f6 f6Var = (f6) callback;
                final bi.e2[] e2VarArr = (bi.e2[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.r rVar = new aa.r(f6Var, l10, e2VarArr, 19);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull P0 = np.u1(f6Var.a).P0(-l10.longValue());
                        if (P0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = np.u1(f6Var.a).j1(-l10.longValue());
                            ConnectionsManager.getInstance(f6Var.a).sendRequest(tL_channels_getFullChannel, new bi.o1(6, f6Var, rVar));
                            break;
                        } else if (!P0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                            String N0 = hd.N0(2131750245, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.a;
                            t1Var.S = N0;
                            t1Var.U = hd.N0(2131750246, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User c22 = np.u1(f6Var.a).c2(l10);
                        TLRPC.UserFull d2 = np.u1(f6Var.a).d2(l10.longValue());
                        if (d2 != null && (disallowedGiftsSettings = d2.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            o10.u(hd.a0(null, null, 2131743497, org.telegram.messenger.n5.t(l10.longValue())), new org.telegram.ui.Components.lc(e2VarArr[0].c, f6Var.J0), R.raw.error, 36);
                            break;
                        } else if (d2 == null && c22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = np.u1(f6Var.a).s1(c22);
                            ConnectionsManager.getInstance(f6Var.a).sendRequest(tL_users_getFullUser, new bi.k2(f6Var, e2VarArr, l10, rVar, 1));
                            break;
                        }
                    }
                    rVar.run();
                    break;
                } else if (i15 >= i14) {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                        String N02 = hd.N0(2131750087, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                        t1Var2.S = N02;
                        t1Var2.U = hd.N0(2131750086, null);
                        String y10 = org.telegram.ui.Wallet.u0.D(f6Var.a).y();
                        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (TextUtils.isEmpty(y10)) {
                            i7 = 3;
                        } else {
                            TextView textView = new TextView(f6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            i7 = 3;
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i16 = org.telegram.ui.ActionBar.m6.j5;
                            int w02 = org.telegram.ui.ActionBar.m6.w0(i16, f6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.045f, i16);
                            org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.t6.j(textView, d02, K, null, h6Var);
                            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r5, f6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (y10.length() + 3) / 4;
                            for (int i17 = 0; i17 < length; i17++) {
                                if (i17 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i17 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i18 = i17 * 4;
                                spannableStringBuilder.append((CharSequence) y10, i18, Math.min(y10.length(), i18 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i17 / 4) + (i17 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ma.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(f6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, f6Var.J0);
                        org.telegram.messenger.f3.k(textView2, 17, null, 2131750091);
                        linearLayout.addView(textView2, c8.ma.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(f6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i19 = org.telegram.ui.ActionBar.m6.r5;
                        r32 = 0;
                        f6Var.n1(linearLayout2, R.drawable.msg_settings, 14, i19, hd.N0(2131745299, null), true);
                        f6Var.n1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.m6.Fi, hd.N0(2131742948, null), true);
                        f6Var.n1(linearLayout2, R.drawable.menu_gift, 14, i19, hd.N0(2131742924, null), false);
                        linearLayout.addView(linearLayout2, c8.ma.t(-2, -2, 1, 0, 7, 0, 3));
                        f6Var.w3 = true;
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, f6Var.getContext(), f6Var.J0);
                        int i20 = org.telegram.ui.ActionBar.m6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i20, f6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i20);
                        org.telegram.ui.ActionBar.h6 h6Var2 = f6Var.J0;
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h6Var2);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = 16 | (hd.a0 ? 5 : i7);
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        d2Var.e(hd.N0(2131750121, null), "", true, false, false);
                        d2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        d2Var.setOnClickListener(new ai.y2(13, f6Var, d2Var));
                        linearLayout.addView(d2Var, c8.ma.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        t1Var2.H = 20;
                        final int i21 = 0;
                        alertDialog$Builder3.k(hd.N0(2131750092, null), new org.telegram.ui.ActionBar.q1() { // from class: di.x1
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i22) {
                                switch (i21) {
                                    case 0:
                                        vf.b h = t1Var3.h(i22, true, true);
                                        bi.e2 e2Var = e2VarArr[0];
                                        Objects.requireNonNull(e2Var);
                                        f6Var.G2(true, t1Var3, h, new bi.n1(e2Var, 1));
                                        break;
                                    default:
                                        vf.b h7 = t1Var3.h(i22, true, true);
                                        bi.e2 e2Var2 = e2VarArr[0];
                                        Objects.requireNonNull(e2Var2);
                                        f6Var.G2(false, t1Var3, h7, new bi.n1(e2Var2, 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        r32 = 0;
                        LinearLayout linearLayout3 = new LinearLayout(f6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new d5(f6Var.getContext(), tL_starGiftUnique), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(f6Var.getContext());
                        int i22 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.messenger.f3.l(textView3, i22, f6Var.J0, 1, 20.0f);
                        textView3.setText(hd.N0(2131750195, null));
                        linearLayout3.addView(textView3, c8.ma.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(f6Var.getContext());
                        org.telegram.ui.ActionBar.t6.U(textView4, i22, f6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.f3.q(null, null, 2131750196, new Object[]{f6Var.E1()}, textView4);
                        linearLayout3.addView(textView4, c8.ma.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        final int i23 = 1;
                        alertDialog$Builder4.k(hd.N0(2131750197, null), new org.telegram.ui.ActionBar.q1() { // from class: di.x1
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i222) {
                                switch (i23) {
                                    case 0:
                                        vf.b h = t1Var3.h(i222, true, true);
                                        bi.e2 e2Var = e2VarArr[0];
                                        Objects.requireNonNull(e2Var);
                                        f6Var.G2(true, t1Var3, h, new bi.n1(e2Var, 1));
                                        break;
                                    default:
                                        vf.b h7 = t1Var3.h(i222, true, true);
                                        bi.e2 e2Var2 = e2VarArr[0];
                                        Objects.requireNonNull(e2Var2);
                                        f6Var.G2(false, t1Var3, h7, new bi.n1(e2Var2, 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i5.c.y(r32, 2131752577, alertDialog$Builder, r32);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                    String N03 = hd.N0(2131750190, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                    t1Var3.S = N03;
                    t1Var3.U = hd.G(Math.max(1, i13), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder2, null);
                break;
            default:
                org.telegram.ui.Components.v3 v3Var = (org.telegram.ui.Components.v3) callback;
                org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) obj3;
                org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) obj2;
                Boolean bool = (Boolean) obj;
                int i24 = i15 % 60;
                int i25 = (i15 - i24) / 60;
                int i26 = i14 % 60;
                int i27 = (i14 - i26) / 60;
                if (i26 == 0 && i27 > 0) {
                    i27--;
                    i26 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = v3Var.getValue();
                    i10 = x3Var.getValue();
                } else {
                    i10 = i13 % 60;
                    i11 = (i13 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                v3Var.setMinValue(i25);
                v3Var.setMaxValue(i27);
                if (i11 > i27) {
                    v3Var.setValue(i27);
                    i11 = i27;
                } else if (i11 < i25) {
                    v3Var.setValue(i25);
                    i11 = i25;
                }
                if (i11 <= i25) {
                    x3Var.setMinValue(i24);
                    x3Var.setMaxValue(i25 == i27 ? i26 : 59);
                } else if (i11 >= i27) {
                    x3Var.setMinValue(i25 == i27 ? i24 : 0);
                    x3Var.setMaxValue(i26);
                } else if (i25 == i27) {
                    x3Var.setMinValue(i24);
                    x3Var.setMaxValue(i26);
                } else {
                    x3Var.setMinValue(0);
                    x3Var.setMaxValue(59);
                }
                if (i10 > x3Var.getMaxValue()) {
                    i10 = x3Var.getMaxValue();
                    x3Var.setValue(i10);
                } else if (i10 < x3Var.getMinValue()) {
                    i10 = x3Var.getMinValue();
                    x3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    v3Var.setValue(i11);
                    x3Var.setValue(i10);
                }
                w3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ y3(f6 f6Var, int i7, int i10, int i11, bi.e2[] e2VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = f6Var;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.f = e2VarArr;
        this.g = tL_starGiftUnique;
    }
}
