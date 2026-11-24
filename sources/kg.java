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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kg implements p8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kg(int i, int i2, yh yhVar, ai aiVar, int i3, zh zhVar) {
        this.b = i;
        this.c = i2;
        this.e = yhVar;
        this.f = aiVar;
        this.d = i3;
        this.g = zhVar;
    }

    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [ed, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v40 */
    @Override // p8c
    public final void a(Object obj) {
        int i;
        int i2;
        ?? r4;
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
                yh yhVar = (yh) callback;
                ai aiVar = (ai) obj3;
                zh zhVar = (zh) obj2;
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
                    i2 = yhVar.getValue();
                    i = aiVar.getValue();
                } else {
                    i = i3 % 60;
                    i2 = (i3 - i) / 60;
                    if (i2 == 24) {
                        i2--;
                        i = 59;
                    }
                }
                yhVar.setMinValue(i7);
                yhVar.setMaxValue(i9);
                if (i2 > i9) {
                    yhVar.setValue(i9);
                    i2 = i9;
                } else if (i2 < i7) {
                    yhVar.setValue(i7);
                    i2 = i7;
                }
                if (i2 <= i7) {
                    aiVar.setMinValue(i6);
                    aiVar.setMaxValue(i7 == i9 ? i8 : 59);
                } else if (i2 >= i9) {
                    if (i7 != i9) {
                        i6 = 0;
                    }
                    aiVar.setMinValue(i6);
                    aiVar.setMaxValue(i8);
                } else if (i7 == i9) {
                    aiVar.setMinValue(i6);
                    aiVar.setMaxValue(i8);
                } else {
                    aiVar.setMinValue(0);
                    aiVar.setMaxValue(59);
                }
                if (i > aiVar.getMaxValue()) {
                    i = aiVar.getMaxValue();
                    aiVar.setValue(i);
                } else if (i < aiVar.getMinValue()) {
                    i = aiVar.getMinValue();
                    aiVar.setValue(i);
                }
                if (!bool.booleanValue()) {
                    yhVar.setValue(i2);
                    aiVar.setValue(i);
                }
                zhVar.invalidate();
                break;
            default:
                final vqa vqaVar = (vqa) callback;
                final xu4[] xu4VarArr = (xu4[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -99 && l.longValue() != -98) {
                    q3a q3aVar = new q3a(vqaVar, l, xu4VarArr, (byte) 11);
                    if (l.longValue() < 0) {
                        TLRPC.ChatFull L0 = na7.q1(vqaVar.a).L0(-l.longValue());
                        if (L0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = na7.q1(vqaVar.a).f1(-l.longValue());
                            ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_channels_getFullChannel, new hj7(vqaVar, q3aVar, (byte) 28));
                            break;
                        } else if (!L0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                            String M0 = k96.M0(2131750246, null);
                            hd hdVar = alertDialog$Builder2.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131750247, null);
                        }
                    } else if (l.longValue() >= 0) {
                        TLRPC.User V1 = na7.q1(vqaVar.a).V1(l);
                        TLRPC.UserFull W1 = na7.q1(vqaVar.a).W1(l.longValue());
                        if (W1 != null && (disallowedGiftsSettings = W1.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            b00.u(k96.a0(null, null, 2131743503, cf3.s(l.longValue())), new u21(xu4VarArr[0].c, vqaVar.J0), R.raw.error, 36);
                            break;
                        } else if (W1 == null && V1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = na7.q1(vqaVar.a).o1(V1);
                            ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_users_getFullUser, new rt0((Object) vqaVar, (Object) xu4VarArr, (Object) l, (Object) q3aVar, (byte) 19));
                            break;
                        }
                    }
                    q3aVar.run();
                    break;
                } else if (i5 >= i4) {
                    if (l.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                        String M02 = k96.M0(2131750088, null);
                        hd hdVar2 = alertDialog$Builder3.a;
                        hdVar2.S = M02;
                        hdVar2.U = k96.M0(2131750087, null);
                        String x = c.C(vqaVar.a).x();
                        LinearLayout linearLayout = new LinearLayout(vqaVar.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(x)) {
                            TextView textView = new TextView(vqaVar.getContext());
                            textView.setTypeface(gl.n1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(gl.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, gl.L(14.0f), 0, gl.L(14.0f));
                            int i10 = bkb.i5;
                            int v0 = bkb.v0(i10, vqaVar.J0);
                            ShapeDrawable b0 = bkb.b0(gl.L(20.0f), bkb.p1(0.045f, v0));
                            vkb K = zkb.K(0.045f, i10);
                            wjb wjbVar = vqaVar.J0;
                            textView.setBackground(b0);
                            zkb.j(textView, b0, K, null, wjbVar);
                            int v02 = bkb.v0(bkb.q5, vqaVar.J0);
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
                            linearLayout.addView(textView, nme.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(vqaVar.getContext());
                        textView2.setTextSize(1, 15.0f);
                        zkb.X(textView2, bkb.i5, vqaVar.J0);
                        de9.q(textView2, 17, null, 2131750092);
                        linearLayout.addView(textView2, nme.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(vqaVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i13 = bkb.q5;
                        vqaVar.b1(linearLayout2, R.drawable.msg_settings, 14, i13, k96.M0(2131745303, null), true);
                        vqaVar.b1(linearLayout2, R.drawable.mini_gram_14, 15, bkb.Ei, k96.M0(2131742951, null), true);
                        vqaVar.b1(linearLayout2, R.drawable.menu_gift, 14, i13, k96.M0(2131742927, null), false);
                        linearLayout.addView(linearLayout2, nme.t(-2, -2, 1, 0, 7, 0, 3));
                        vqaVar.v3 = true;
                        ag2 ag2Var = new ag2(1, vqaVar.J0, vqaVar.getContext());
                        int i14 = bkb.h6;
                        ff0 f0 = bkb.f0(bkb.v0(i14, vqaVar.J0), 7, gl.L(12.0f));
                        vkb M = zkb.M(i14);
                        wjb wjbVar2 = vqaVar.J0;
                        ag2Var.setBackground(f0);
                        zkb.j(ag2Var, f0, null, M, wjbVar2);
                        ag2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (k96.a0 ? 5 : 3) | 16;
                        ag2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        ag2Var.e(k96.M0(2131750122, null), "", true, false, false);
                        ag2Var.setPadding(k96.a0 ? gl.L(4.0f) : 0, gl.L(12.0f), k96.a0 ? 0 : gl.L(4.0f), gl.L(12.0f));
                        ag2Var.setOnClickListener(new b99(vqaVar, ag2Var, (byte) 13));
                        linearLayout.addView(ag2Var, nme.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.n(linearLayout);
                        hdVar2.H = (byte) 20;
                        r4 = 0;
                        final byte b2 = 0;
                        alertDialog$Builder3.j(k96.M0(2131750093, null), new ed() { // from class: vna
                            @Override // ed
                            public final void u(hd hdVar3, int i15) {
                                byte b3 = b2;
                                xu4[] xu4VarArr2 = xu4VarArr;
                                vqa vqaVar2 = vqaVar;
                                switch (b3) {
                                    case 0:
                                        c01 g = hdVar3.g(i15, true, true);
                                        xu4 xu4Var = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var);
                                        vqaVar2.y2(true, hdVar3, g, new nu4(xu4Var, (byte) 1));
                                        break;
                                    default:
                                        c01 g2 = hdVar3.g(i15, true, true);
                                        xu4 xu4Var2 = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var2);
                                        vqaVar2.y2(false, hdVar3, g2, new nu4(xu4Var2, (byte) 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(vqaVar.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new wpa(vqaVar.getContext(), tL_starGiftUnique), nme.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(vqaVar.getContext());
                        int i15 = bkb.i5;
                        tb4.w(textView3, i15, vqaVar.J0, 1, 20.0f);
                        textView3.setText(k96.M0(2131750196, null));
                        linearLayout3.addView(textView3, nme.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(vqaVar.getContext());
                        zkb.X(textView4, i15, vqaVar.J0);
                        textView4.setTextSize(1, 16.0f);
                        de9.r(null, null, 2131750197, new Object[]{vqaVar.s1()}, textView4);
                        linearLayout3.addView(textView4, nme.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                        alertDialog$Builder4.n(linearLayout3);
                        r4 = 0;
                        final byte b3 = 1;
                        alertDialog$Builder4.j(k96.M0(2131750198, null), new ed() { // from class: vna
                            @Override // ed
                            public final void u(hd hdVar3, int i152) {
                                byte b32 = b3;
                                xu4[] xu4VarArr2 = xu4VarArr;
                                vqa vqaVar2 = vqaVar;
                                switch (b32) {
                                    case 0:
                                        c01 g = hdVar3.g(i152, true, true);
                                        xu4 xu4Var = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var);
                                        vqaVar2.y2(true, hdVar3, g, new nu4(xu4Var, (byte) 1));
                                        break;
                                    default:
                                        c01 g2 = hdVar3.g(i152, true, true);
                                        xu4 xu4Var2 = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var2);
                                        vqaVar2.y2(false, hdVar3, g2, new nu4(xu4Var2, (byte) 1));
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    ug8.y(r4, 2131752577, alertDialog$Builder, r4);
                    break;
                } else {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                    String M03 = k96.M0(2131750191, null);
                    hd hdVar3 = alertDialog$Builder2.a;
                    hdVar3.S = M03;
                    hdVar3.U = k96.G(Math.max(1, i3), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                }
                b00.t(null, 2131747638, alertDialog$Builder2, null);
                break;
        }
    }

    public /* synthetic */ kg(vqa vqaVar, int i, int i2, int i3, xu4[] xu4VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = vqaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = xu4VarArr;
        this.g = tL_starGiftUnique;
    }
}
