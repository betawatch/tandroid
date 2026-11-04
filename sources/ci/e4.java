package ci;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import j$.util.Objects;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e4(int i3, int i10, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i11, org.telegram.ui.Components.n3 n3Var) {
        this.b = i3;
        this.c = i10;
        this.e = m3Var;
        this.f = o3Var;
        this.d = i11;
        this.g = n3Var;
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i3;
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
                final l6 l6Var = (l6) callback;
                final xg.e1[] e1VarArr = (xg.e1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    ai.k3 k3Var = new ai.k3(l6Var, l10, e1VarArr, 11);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = hp.s1(l6Var.a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = hp.s1(l6Var.a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(l6Var.a).sendRequest(tL_channels_getFullChannel, new ai.f3(5, l6Var, k3Var));
                            break;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                            String M0 = bd.M0(2131750270, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131750271, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = hp.s1(l6Var.a).a2(l10);
                        TLRPC.UserFull b22 = hp.s1(l6Var.a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.fc(e1VarArr[0].c, l6Var.J0), R.raw.error, 36);
                            break;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = hp.s1(l6Var.a).q1(a22);
                            ConnectionsManager.getInstance(l6Var.a).sendRequest(tL_users_getFullUser, new ai.q1(l6Var, e1VarArr, l10, k3Var, 1));
                            break;
                        }
                    }
                    k3Var.run();
                    break;
                } else if (i14 >= i13) {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                        String M02 = bd.M0(2131750112, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder3.a;
                        s1Var2.S = M02;
                        s1Var2.U = bd.M0(2131750111, null);
                        String t10 = org.telegram.ui.Wallet.k0.x(l6Var.a).t();
                        LinearLayout linearLayout = new LinearLayout(l6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t10)) {
                            TextView textView = new TextView(l6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i15 = org.telegram.ui.ActionBar.k6.j5;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i15, l6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.045f, i15);
                            org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
                            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r5, l6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t10.length() + 3) / 4;
                            for (int i16 = 0; i16 < length; i16++) {
                                if (i16 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i16 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i17 = i16 * 4;
                                spannableStringBuilder.append((CharSequence) t10, i17, Math.min(t10.length(), i17 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i16 / 4) + (i16 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, mf.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(l6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, l6Var.J0);
                        org.telegram.messenger.k5.m(textView2, 17, null, 2131750116);
                        linearLayout.addView(textView2, mf.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(l6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i18 = org.telegram.ui.ActionBar.k6.r5;
                        l6Var.l1(linearLayout2, R.drawable.msg_settings, 14, i18, bd.M0(2131745505, null), true);
                        l6Var.l1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.k6.Ci, bd.M0(2131743204, null), true);
                        l6Var.l1(linearLayout2, R.drawable.menu_gift, 14, i18, bd.M0(2131743180, null), false);
                        linearLayout.addView(linearLayout2, mf.t(-2, -2, 1, 0, 7, 0, 3));
                        l6Var.q3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, l6Var.getContext(), l6Var.J0);
                        int i19 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i19, l6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
                        org.telegram.ui.ActionBar.e6 e6Var2 = l6Var.J0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = 16 | (bd.a0 ? 5 : 3);
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(bd.M0(2131750146, null), "", true, false, false);
                        c2Var.setPadding(bd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new ai.d(10, l6Var, c2Var));
                        linearLayout.addView(c2Var, mf.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        s1Var2.H = 20;
                        r32 = 0;
                        final int i20 = 0;
                        alertDialog$Builder3.k(bd.M0(2131750117, null), new org.telegram.ui.ActionBar.p1() { // from class: ci.x1
                            @Override // org.telegram.ui.ActionBar.p1
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i21) {
                                switch (i20) {
                                    case 0:
                                        sf.b h = s1Var3.h(i21, true, true);
                                        xg.e1 e1Var = e1VarArr[0];
                                        Objects.requireNonNull(e1Var);
                                        l6Var.r2(true, s1Var3, h, new xg.x0(e1Var, 11));
                                        break;
                                    default:
                                        sf.b h7 = s1Var3.h(i21, true, true);
                                        xg.e1 e1Var2 = e1VarArr[0];
                                        Objects.requireNonNull(e1Var2);
                                        l6Var.r2(false, s1Var3, h7, new xg.x0(e1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(l6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new j5(l6Var.getContext(), tL_starGiftUnique), mf.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(l6Var.getContext());
                        int i21 = org.telegram.ui.ActionBar.k6.j5;
                        org.telegram.messenger.k5.n(textView3, i21, l6Var.J0, 1, 20.0f);
                        textView3.setText(bd.M0(2131750220, null));
                        linearLayout3.addView(textView3, mf.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(l6Var.getContext());
                        org.telegram.ui.ActionBar.r6.V(textView4, i21, l6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.r(null, null, 2131750221, new Object[]{l6Var.z1()}, textView4);
                        linearLayout3.addView(textView4, mf.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        final int i22 = 1;
                        alertDialog$Builder4.k(bd.M0(2131750222, null), new org.telegram.ui.ActionBar.p1() { // from class: ci.x1
                            @Override // org.telegram.ui.ActionBar.p1
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i212) {
                                switch (i22) {
                                    case 0:
                                        sf.b h = s1Var3.h(i212, true, true);
                                        xg.e1 e1Var = e1VarArr[0];
                                        Objects.requireNonNull(e1Var);
                                        l6Var.r2(true, s1Var3, h, new xg.x0(e1Var, 11));
                                        break;
                                    default:
                                        sf.b h7 = s1Var3.h(i212, true, true);
                                        xg.e1 e1Var2 = e1VarArr[0];
                                        Objects.requireNonNull(e1Var2);
                                        l6Var.r2(false, s1Var3, h7, new xg.x0(e1Var2, 11));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    k2.p1.v(r32, 2131752589, alertDialog$Builder, r32);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                    String M03 = bd.M0(2131750215, null);
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
                    s1Var3.S = M03;
                    s1Var3.U = bd.G(Math.max(1, i12), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
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
                    i3 = o3Var.getValue();
                } else {
                    i3 = i12 % 60;
                    i10 = (i12 - i3) / 60;
                    if (i10 == 24) {
                        i10--;
                        i3 = 59;
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
                if (i3 > o3Var.getMaxValue()) {
                    i3 = o3Var.getMaxValue();
                    o3Var.setValue(i3);
                } else if (i3 < o3Var.getMinValue()) {
                    i3 = o3Var.getMinValue();
                    o3Var.setValue(i3);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i10);
                    o3Var.setValue(i3);
                }
                n3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ e4(l6 l6Var, int i3, int i10, int i11, xg.e1[] e1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = l6Var;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.f = e1VarArr;
        this.g = tL_starGiftUnique;
    }
}
