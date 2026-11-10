package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u4(int i7, int i10, org.telegram.ui.Components.n3 n3Var, org.telegram.ui.Components.p3 p3Var, int i11, org.telegram.ui.Components.o3 o3Var) {
        this.b = i7;
        this.c = i10;
        this.e = n3Var;
        this.f = p3Var;
        this.d = i11;
        this.g = o3Var;
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String, org.telegram.ui.ActionBar.r1] */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // org.telegram.messenger.c20
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
                final k7 k7Var = (k7) callback;
                final wg.f1[] f1VarArr = (wg.f1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                int i16 = 3;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.s sVar = new aa.s(k7Var, l10, f1VarArr, 8);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = qp.s1(k7Var.a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = qp.s1(k7Var.a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(k7Var.a).sendRequest(tL_channels_getFullChannel, new j(i16, k7Var, sVar));
                            break;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                            String M0 = org.telegram.messenger.id.M0(2131750262, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131750263, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = qp.s1(k7Var.a).a2(l10);
                        TLRPC.UserFull b22 = qp.s1(k7Var.a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.gc(f1VarArr[0].c, k7Var.I0), R.raw.error, 36);
                            break;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = qp.s1(k7Var.a).q1(a22);
                            ConnectionsManager.getInstance(k7Var.a).sendRequest(tL_users_getFullUser, new g2(k7Var, f1VarArr, l10, sVar, 0));
                            break;
                        }
                    }
                    sVar.run();
                    break;
                } else if (i15 >= i14) {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                        String M02 = org.telegram.messenger.id.M0(2131750104, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131750103, null);
                        String t6 = org.telegram.ui.Wallet.l0.x(k7Var.a).t();
                        LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
                        linearLayout.setOrientation(1);
                        if (TextUtils.isEmpty(t6)) {
                            i7 = 3;
                        } else {
                            TextView textView = new TextView(k7Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            i7 = 3;
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i17 = org.telegram.ui.ActionBar.m6.j5;
                            int w02 = org.telegram.ui.ActionBar.m6.w0(i17, k7Var.I0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.045f, i17);
                            org.telegram.ui.ActionBar.h6 h6Var = k7Var.I0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.t6.j(textView, d02, K, null, h6Var);
                            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r5, k7Var.I0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t6.length() + 3) / 4;
                            for (int i18 = 0; i18 < length; i18++) {
                                if (i18 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i18 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i19 = i18 * 4;
                                spannableStringBuilder.append((CharSequence) t6, i19, Math.min(t6.length(), i19 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i18 / 4) + (i18 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ha.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(k7Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, k7Var.I0);
                        org.telegram.messenger.k5.m(textView2, 17, null, 2131750108);
                        linearLayout.addView(textView2, c8.ha.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i20 = org.telegram.ui.ActionBar.m6.r5;
                        k7Var.k1(linearLayout2, R.drawable.msg_settings, 14, i20, org.telegram.messenger.id.M0(2131745495, null), true);
                        k7Var.k1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.m6.Ci, org.telegram.messenger.id.M0(2131743194, null), true);
                        k7Var.k1(linearLayout2, R.drawable.menu_gift, 14, i20, org.telegram.messenger.id.M0(2131743170, null), false);
                        linearLayout.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 7, 0, 3));
                        k7Var.s3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, k7Var.getContext(), k7Var.I0);
                        int i21 = org.telegram.ui.ActionBar.m6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i21, k7Var.I0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i21);
                        org.telegram.ui.ActionBar.h6 h6Var2 = k7Var.I0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.t6.j(c2Var, h02, null, M, h6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        int i22 = 5;
                        layoutParams.gravity = 16 | (org.telegram.messenger.id.a0 ? 5 : i7);
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(org.telegram.messenger.id.M0(2131750138, null), "", true, false, false);
                        c2Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new r(i22, k7Var, c2Var));
                        linearLayout.addView(c2Var, c8.ha.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        u1Var2.G = 20;
                        r32 = 0;
                        final int i23 = 0;
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131750109, null), new org.telegram.ui.ActionBar.r1() { // from class: bi.e2
                            @Override // org.telegram.ui.ActionBar.r1
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var3, int i24) {
                                switch (i23) {
                                    case 0:
                                        vf.b h = u1Var3.h(i24, true, true);
                                        wg.f1 f1Var = f1VarArr[0];
                                        Objects.requireNonNull(f1Var);
                                        k7Var.r2(true, u1Var3, h, new wg.x0(f1Var, 11));
                                        break;
                                    default:
                                        vf.b h7 = u1Var3.h(i24, true, true);
                                        wg.f1 f1Var2 = f1VarArr[0];
                                        Objects.requireNonNull(f1Var2);
                                        k7Var.r2(false, u1Var3, h7, new wg.x0(f1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(k7Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new f6(k7Var.getContext(), tL_starGiftUnique), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(k7Var.getContext());
                        int i24 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.messenger.k5.n(textView3, i24, k7Var.I0, 1, 20.0f);
                        textView3.setText(org.telegram.messenger.id.M0(2131750212, null));
                        linearLayout3.addView(textView3, c8.ha.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(k7Var.getContext());
                        org.telegram.ui.ActionBar.t6.U(textView4, i24, k7Var.I0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.r(null, null, 2131750213, new Object[]{k7Var.y1()}, textView4);
                        linearLayout3.addView(textView4, c8.ha.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        final int i25 = 1;
                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131750214, null), new org.telegram.ui.ActionBar.r1() { // from class: bi.e2
                            @Override // org.telegram.ui.ActionBar.r1
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var3, int i242) {
                                switch (i25) {
                                    case 0:
                                        vf.b h = u1Var3.h(i242, true, true);
                                        wg.f1 f1Var = f1VarArr[0];
                                        Objects.requireNonNull(f1Var);
                                        k7Var.r2(true, u1Var3, h, new wg.x0(f1Var, 11));
                                        break;
                                    default:
                                        vf.b h7 = u1Var3.h(i242, true, true);
                                        wg.f1 f1Var2 = f1VarArr[0];
                                        Objects.requireNonNull(f1Var2);
                                        k7Var.r2(false, u1Var3, h7, new wg.x0(f1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    jg.g.w(r32, 2131752589, alertDialog$Builder, r32);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                    String M03 = org.telegram.messenger.id.M0(2131750207, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                    u1Var3.R = M03;
                    u1Var3.T = org.telegram.messenger.id.G(Math.max(1, i13), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                jg.g.C(null, 2131747831, alertDialog$Builder2, null);
                break;
            default:
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) callback;
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) obj3;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) obj2;
                Boolean bool = (Boolean) obj;
                int i26 = i15 % 60;
                int i27 = (i15 - i26) / 60;
                int i28 = i14 % 60;
                int i29 = (i14 - i28) / 60;
                if (i28 == 0 && i29 > 0) {
                    i29--;
                    i28 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = n3Var.getValue();
                    i10 = p3Var.getValue();
                } else {
                    i10 = i13 % 60;
                    i11 = (i13 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                n3Var.setMinValue(i27);
                n3Var.setMaxValue(i29);
                if (i11 > i29) {
                    n3Var.setValue(i29);
                    i11 = i29;
                } else if (i11 < i27) {
                    n3Var.setValue(i27);
                    i11 = i27;
                }
                if (i11 <= i27) {
                    p3Var.setMinValue(i26);
                    p3Var.setMaxValue(i27 == i29 ? i28 : 59);
                } else if (i11 >= i29) {
                    p3Var.setMinValue(i27 == i29 ? i26 : 0);
                    p3Var.setMaxValue(i28);
                } else if (i27 == i29) {
                    p3Var.setMinValue(i26);
                    p3Var.setMaxValue(i28);
                } else {
                    p3Var.setMinValue(0);
                    p3Var.setMaxValue(59);
                }
                if (i10 > p3Var.getMaxValue()) {
                    i10 = p3Var.getMaxValue();
                    p3Var.setValue(i10);
                } else if (i10 < p3Var.getMinValue()) {
                    i10 = p3Var.getMinValue();
                    p3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    n3Var.setValue(i11);
                    p3Var.setValue(i10);
                }
                o3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ u4(k7 k7Var, int i7, int i10, int i11, wg.f1[] f1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = k7Var;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.f = f1VarArr;
        this.g = tL_starGiftUnique;
    }
}
