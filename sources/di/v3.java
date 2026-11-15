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
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements z10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v3(int i7, int i10, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i11, org.telegram.ui.Components.n3 n3Var) {
        this.b = i7;
        this.c = i10;
        this.e = m3Var;
        this.f = o3Var;
        this.d = i11;
        this.g = n3Var;
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i7;
        int i10;
        int i11 = this.a;
        Object obj2 = this.g;
        int i12 = this.d;
        Object obj3 = this.f;
        KeyEvent.Callback callback = this.e;
        int i13 = this.c;
        int i14 = this.b;
        switch (i11) {
            case 0:
                final c6 c6Var = (c6) callback;
                final wg.c1[] c1VarArr = (wg.c1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.r rVar = new aa.r(c6Var, l10, c1VarArr, 14);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = np.s1(c6Var.a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = np.s1(c6Var.a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(c6Var.a).sendRequest(tL_channels_getFullChannel, new bi.v2(5, c6Var, rVar));
                            break;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                            String M0 = hd.M0(2131750262, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131750263, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = np.s1(c6Var.a).a2(l10);
                        TLRPC.UserFull b22 = np.s1(c6Var.a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.cc(c1VarArr[0].c, c6Var.J0), R.raw.error, 36);
                            break;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = np.s1(c6Var.a).q1(a22);
                            ConnectionsManager.getInstance(c6Var.a).sendRequest(tL_users_getFullUser, new bi.l1(c6Var, c1VarArr, l10, rVar, 1));
                            break;
                        }
                    }
                    rVar.run();
                    break;
                } else if (i14 >= i13) {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                        String M02 = hd.M0(2131750104, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                        t1Var2.S = M02;
                        t1Var2.U = hd.M0(2131750103, null);
                        String t6 = org.telegram.ui.Wallet.l0.x(c6Var.a).t();
                        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t6)) {
                            TextView textView = new TextView(c6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i15 = org.telegram.ui.ActionBar.j6.j5;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(i15, c6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.045f, i15);
                            org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.r5, c6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t6.length() + 3) / 4;
                            for (int i16 = 0; i16 < length; i16++) {
                                if (i16 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i16 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i17 = i16 * 4;
                                spannableStringBuilder.append((CharSequence) t6, i17, Math.min(t6.length(), i17 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i16 / 4) + (i16 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ja.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(c6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, c6Var.J0);
                        org.telegram.messenger.k5.l(textView2, 17, null, 2131750108);
                        linearLayout.addView(textView2, c8.ja.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(c6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i18 = org.telegram.ui.ActionBar.j6.r5;
                        c6Var.l1(linearLayout2, R.drawable.msg_settings, 14, i18, hd.M0(2131745495, null), true);
                        c6Var.l1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.j6.Fi, hd.M0(2131743194, null), true);
                        c6Var.l1(linearLayout2, R.drawable.menu_gift, 14, i18, hd.M0(2131743170, null), false);
                        linearLayout.addView(linearLayout2, c8.ja.t(-2, -2, 1, 0, 7, 0, 3));
                        c6Var.t3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, c6Var.getContext(), c6Var.J0);
                        int i19 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i19, c6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i19);
                        org.telegram.ui.ActionBar.e6 e6Var2 = c6Var.J0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = 16 | (hd.a0 ? 5 : 3);
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(hd.M0(2131750138, null), "", true, false, false);
                        c2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new ai.t2(12, c6Var, c2Var));
                        linearLayout.addView(c2Var, c8.ja.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        t1Var2.H = 20;
                        r32 = 0;
                        final int i20 = 0;
                        alertDialog$Builder3.k(hd.M0(2131750109, null), new org.telegram.ui.ActionBar.q1() { // from class: di.r1
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i21) {
                                switch (i20) {
                                    case 0:
                                        vf.b h = t1Var3.h(i21, true, true);
                                        wg.c1 c1Var = c1VarArr[0];
                                        Objects.requireNonNull(c1Var);
                                        c6Var.s2(true, t1Var3, h, new wg.v0(c1Var, 11));
                                        break;
                                    default:
                                        vf.b h7 = t1Var3.h(i21, true, true);
                                        wg.c1 c1Var2 = c1VarArr[0];
                                        Objects.requireNonNull(c1Var2);
                                        c6Var.s2(false, t1Var3, h7, new wg.v0(c1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(c6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new a5(c6Var.getContext(), tL_starGiftUnique), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(c6Var.getContext());
                        int i21 = org.telegram.ui.ActionBar.j6.j5;
                        org.telegram.messenger.k5.m(textView3, i21, c6Var.J0, 1, 20.0f);
                        textView3.setText(hd.M0(2131750212, null));
                        linearLayout3.addView(textView3, c8.ja.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(c6Var.getContext());
                        org.telegram.ui.ActionBar.q6.U(textView4, i21, c6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.q(null, null, 2131750213, new Object[]{c6Var.z1()}, textView4);
                        linearLayout3.addView(textView4, c8.ja.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        final int i22 = 1;
                        alertDialog$Builder4.k(hd.M0(2131750214, null), new org.telegram.ui.ActionBar.q1() { // from class: di.r1
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i212) {
                                switch (i22) {
                                    case 0:
                                        vf.b h = t1Var3.h(i212, true, true);
                                        wg.c1 c1Var = c1VarArr[0];
                                        Objects.requireNonNull(c1Var);
                                        c6Var.s2(true, t1Var3, h, new wg.v0(c1Var, 11));
                                        break;
                                    default:
                                        vf.b h7 = t1Var3.h(i212, true, true);
                                        wg.c1 c1Var2 = c1VarArr[0];
                                        Objects.requireNonNull(c1Var2);
                                        c6Var.s2(false, t1Var3, h7, new wg.v0(c1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i5.c.x(r32, 2131752589, alertDialog$Builder, r32);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                    String M03 = hd.M0(2131750207, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                    t1Var3.S = M03;
                    t1Var3.U = hd.G(Math.max(1, i12), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                i5.c.C(null, 2131747831, alertDialog$Builder2, null);
                break;
            default:
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) callback;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) obj3;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) obj2;
                Boolean bool = (Boolean) obj;
                int i23 = i14 % 60;
                int i24 = (i14 - i23) / 60;
                int i25 = i13 % 60;
                int i26 = (i13 - i25) / 60;
                if (i25 == 0 && i26 > 0) {
                    i26--;
                    i25 = 59;
                }
                if (bool.booleanValue()) {
                    i10 = m3Var.getValue();
                    i7 = o3Var.getValue();
                } else {
                    i7 = i12 % 60;
                    i10 = (i12 - i7) / 60;
                    if (i10 == 24) {
                        i10--;
                        i7 = 59;
                    }
                }
                m3Var.setMinValue(i24);
                m3Var.setMaxValue(i26);
                if (i10 > i26) {
                    m3Var.setValue(i26);
                    i10 = i26;
                } else if (i10 < i24) {
                    m3Var.setValue(i24);
                    i10 = i24;
                }
                if (i10 <= i24) {
                    o3Var.setMinValue(i23);
                    o3Var.setMaxValue(i24 == i26 ? i25 : 59);
                } else if (i10 >= i26) {
                    o3Var.setMinValue(i24 == i26 ? i23 : 0);
                    o3Var.setMaxValue(i25);
                } else if (i24 == i26) {
                    o3Var.setMinValue(i23);
                    o3Var.setMaxValue(i25);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i7 > o3Var.getMaxValue()) {
                    i7 = o3Var.getMaxValue();
                    o3Var.setValue(i7);
                } else if (i7 < o3Var.getMinValue()) {
                    i7 = o3Var.getMinValue();
                    o3Var.setValue(i7);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i10);
                    o3Var.setValue(i7);
                }
                n3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ v3(c6 c6Var, int i7, int i10, int i11, wg.c1[] c1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = c6Var;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.f = c1VarArr;
        this.g = tL_starGiftUnique;
    }
}
