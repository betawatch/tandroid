// default package

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
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kh implements qac {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kh(int i, int i2, yi yiVar, aj ajVar, int i3, zi ziVar) {
        this.b = i;
        this.c = i2;
        this.e = yiVar;
        this.f = ajVar;
        this.d = i3;
        this.g = ziVar;
    }

    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [ee, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // qac
    public final void a(Object obj) {
        int i;
        int i2;
        ?? r5;
        AlertDialog$Builder alertDialog$Builder;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                yi yiVar = (yi) callback;
                aj ajVar = (aj) obj3;
                zi ziVar = (zi) obj2;
                Boolean bool = (Boolean) obj;
                int i6 = i5 % 60;
                int i7 = (i5 - i6) / 60;
                int i8 = i4 % 60;
                int i9 = (i4 - i8) / 60;
                if (i8 == 0 && i9 > 0) {
                    i9--;
                    i8 = 59;
                }
                if (bool.booleanValue()) {
                    i2 = yiVar.getValue();
                    i = ajVar.getValue();
                } else {
                    i = i3 % 60;
                    i2 = (i3 - i) / 60;
                    if (i2 == 24) {
                        i2--;
                        i = 59;
                    }
                }
                yiVar.setMinValue(i7);
                yiVar.setMaxValue(i9);
                if (i2 > i9) {
                    yiVar.setValue(i9);
                    i2 = i9;
                } else if (i2 < i7) {
                    yiVar.setValue(i7);
                    i2 = i7;
                }
                if (i2 <= i7) {
                    ajVar.setMinValue(i6);
                    ajVar.setMaxValue(i7 == i9 ? i8 : 59);
                } else if (i2 >= i9) {
                    if (i7 != i9) {
                        i6 = 0;
                    }
                    ajVar.setMinValue(i6);
                    ajVar.setMaxValue(i8);
                } else if (i7 == i9) {
                    ajVar.setMinValue(i6);
                    ajVar.setMaxValue(i8);
                } else {
                    ajVar.setMinValue(0);
                    ajVar.setMaxValue(59);
                }
                if (i > ajVar.getMaxValue()) {
                    i = ajVar.getMaxValue();
                    ajVar.setValue(i);
                } else if (i < ajVar.getMinValue()) {
                    i = ajVar.getMinValue();
                    ajVar.setValue(i);
                }
                if (!bool.booleanValue()) {
                    yiVar.setValue(i2);
                    ajVar.setValue(i);
                }
                ziVar.invalidate();
                break;
            default:
                final wsa wsaVar = (wsa) callback;
                final yw4[] yw4VarArr = (yw4[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -99 && l.longValue() != -98) {
                    hw9 hw9Var = new hw9(wsaVar, l, yw4VarArr, (byte) 14);
                    if (l.longValue() < 0) {
                        TLRPC.ChatFull M0 = oc7.r1(wsaVar.a).M0(-l.longValue());
                        if (M0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = oc7.r1(wsaVar.a).g1(-l.longValue());
                            ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_channels_getFullChannel, new jl7(wsaVar, hw9Var, (byte) 28));
                            break;
                        } else if (!M0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                            String M02 = jb6.M0(2131750195, null);
                            he heVar = alertDialog$Builder2.a;
                            heVar.S = M02;
                            heVar.U = jb6.M0(2131750196, null);
                        }
                    } else if (l.longValue() >= 0) {
                        TLRPC.User W1 = oc7.r1(wsaVar.a).W1(l);
                        TLRPC.UserFull X1 = oc7.r1(wsaVar.a).X1(l.longValue());
                        if (X1 != null && (disallowedGiftsSettings = X1.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            b10.u(jb6.a0(null, null, 2131743429, pg3.s(l.longValue())), new c41(yw4VarArr[0].c, wsaVar.J0), R.raw.error, 36);
                            break;
                        } else if (X1 == null && W1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = oc7.r1(wsaVar.a).p1(W1);
                            ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_users_getFullUser, new av0((Object) wsaVar, (Object) yw4VarArr, (Object) l, (Object) hw9Var, (byte) 19));
                            break;
                        }
                    }
                    hw9Var.run();
                    break;
                } else if (i5 >= i4) {
                    if (l.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                        String M03 = jb6.M0(2131750037, null);
                        he heVar2 = alertDialog$Builder3.a;
                        heVar2.S = M03;
                        heVar2.U = jb6.M0(2131750036, null);
                        String x = c.C(wsaVar.a).x();
                        LinearLayout linearLayout = new LinearLayout(wsaVar.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(x)) {
                            TextView textView = new TextView(wsaVar.getContext());
                            textView.setTypeface(gm.n1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(gm.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, gm.L(14.0f), 0, gm.L(14.0f));
                            int i10 = cmb.i5;
                            int v0 = cmb.v0(i10, wsaVar.J0);
                            ShapeDrawable b0 = cmb.b0(gm.L(20.0f), cmb.p1(0.045f, v0));
                            wmb K = anb.K(0.045f, i10);
                            ylb ylbVar = wsaVar.J0;
                            textView.setBackground(b0);
                            anb.j(textView, b0, K, null, ylbVar);
                            int v02 = cmb.v0(cmb.q5, wsaVar.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (x.length() + 3) / 4;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    spannableStringBuilder.append((CharSequence) (i11 % 4 == 0 ? "\n" : " "));
                                }
                                int length2 = spannableStringBuilder.length();
                                int i12 = i11 << 2;
                                spannableStringBuilder.append((CharSequence) x, i12, Math.min(x.length(), i12 + 4));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i11 / 4) + (i11 % 4)) % 2 == 0 ? v0 : v02), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, qoe.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(wsaVar.getContext());
                        textView2.setTextSize(1, 15.0f);
                        anb.X(textView2, cmb.i5, wsaVar.J0);
                        hg9.p(textView2, 17, null, 2131750041);
                        linearLayout.addView(textView2, qoe.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(wsaVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i13 = cmb.q5;
                        wsaVar.b1(linearLayout2, R.drawable.msg_settings, 14, i13, jb6.M0(2131745229, null), true);
                        wsaVar.b1(linearLayout2, R.drawable.mini_gram_14, 15, cmb.Ei, jb6.M0(2131742877, null), true);
                        wsaVar.b1(linearLayout2, R.drawable.menu_gift, 14, i13, jb6.M0(2131742853, null), false);
                        linearLayout.addView(linearLayout2, qoe.t(-2, -2, 1, 0, 7, 0, 3));
                        wsaVar.v3 = true;
                        oh2 oh2Var = new oh2(1, wsaVar.J0, wsaVar.getContext());
                        int i14 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.v0(i14, wsaVar.J0), 7, gm.L(12.0f));
                        wmb M = anb.M(i14);
                        ylb ylbVar2 = wsaVar.J0;
                        oh2Var.setBackground(f0);
                        anb.j(oh2Var, f0, null, M, ylbVar2);
                        oh2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (jb6.a0 ? 5 : 3) | 16;
                        oh2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        oh2Var.e(jb6.M0(2131750071, null), "", true, false, false);
                        oh2Var.setPadding(jb6.a0 ? gm.L(4.0f) : 0, gm.L(12.0f), jb6.a0 ? 0 : gm.L(4.0f), gm.L(12.0f));
                        oh2Var.setOnClickListener(new r39(wsaVar, oh2Var, (byte) 14));
                        linearLayout.addView(oh2Var, qoe.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.n(linearLayout);
                        heVar2.H = (byte) 20;
                        r5 = 0;
                        final byte b2 = 0;
                        alertDialog$Builder3.j(jb6.M0(2131750042, null), new ee() { // from class: vpa
                            @Override // ee
                            public final void r(he heVar3, int i15) {
                                byte b3 = b2;
                                yw4[] yw4VarArr2 = yw4VarArr;
                                wsa wsaVar2 = wsaVar;
                                switch (b3) {
                                    case 0:
                                        k11 g = heVar3.g(i15, true, true);
                                        yw4 yw4Var = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var);
                                        wsaVar2.y2(true, heVar3, g, new ow4(yw4Var, (byte) 1));
                                        break;
                                    default:
                                        k11 g2 = heVar3.g(i15, true, true);
                                        yw4 yw4Var2 = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var2);
                                        wsaVar2.y2(false, heVar3, g2, new ow4(yw4Var2, (byte) 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(wsaVar.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new wra(wsaVar.getContext(), tL_starGiftUnique), qoe.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(wsaVar.getContext());
                        int i15 = cmb.i5;
                        td4.x(textView3, i15, wsaVar.J0, 1, 20.0f);
                        textView3.setText(jb6.M0(2131750145, null));
                        linearLayout3.addView(textView3, qoe.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(wsaVar.getContext());
                        anb.X(textView4, i15, wsaVar.J0);
                        textView4.setTextSize(1, 16.0f);
                        hg9.q(null, null, 2131750146, new Object[]{wsaVar.s1()}, textView4);
                        linearLayout3.addView(textView4, qoe.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                        alertDialog$Builder4.n(linearLayout3);
                        r5 = 0;
                        final byte b3 = 1;
                        alertDialog$Builder4.j(jb6.M0(2131750147, null), new ee() { // from class: vpa
                            @Override // ee
                            public final void r(he heVar3, int i152) {
                                byte b32 = b3;
                                yw4[] yw4VarArr2 = yw4VarArr;
                                wsa wsaVar2 = wsaVar;
                                switch (b32) {
                                    case 0:
                                        k11 g = heVar3.g(i152, true, true);
                                        yw4 yw4Var = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var);
                                        wsaVar2.y2(true, heVar3, g, new ow4(yw4Var, (byte) 1));
                                        break;
                                    default:
                                        k11 g2 = heVar3.g(i152, true, true);
                                        yw4 yw4Var2 = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var2);
                                        wsaVar2.y2(false, heVar3, g2, new ow4(yw4Var2, (byte) 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    wi8.y(r5, 2131752542, alertDialog$Builder, r5);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                    String M04 = jb6.M0(2131750140, null);
                    he heVar3 = alertDialog$Builder2.a;
                    heVar3.S = M04;
                    heVar3.U = jb6.G(Math.max(1, i3), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                b10.t(null, 2131747564, alertDialog$Builder2, null);
                break;
        }
    }

    public /* synthetic */ kh(wsa wsaVar, int i, int i2, int i3, yw4[] yw4VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = wsaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = yw4VarArr;
        this.g = tL_starGiftUnique;
    }
}
