// default package

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean booleanValue;
        int i;
        int i2;
        s49 K;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qu9 qu9Var = (qu9) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    view.setVisibility(0);
                }
                qu9Var.f = bitmap;
                Paint paint = new Paint(1);
                qu9Var.n = paint;
                Bitmap bitmap2 = qu9Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                qu9Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gl.i(colorMatrix, bkb.I.o() ? 0.05f : 0.25f);
                gl.h(colorMatrix, bkb.I.o() ? -0.02f : -0.04f);
                qu9Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                qu9Var.r = new Matrix();
                break;
            case 1:
                h1a h1aVar = (h1a) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j = h1aVar.U1;
                Runnable runnable = h1aVar.b2;
                if (runnable != null) {
                    runnable.run();
                }
                h1aVar.dismiss();
                kk7.f(y6c.t0).k(kk7.T2, new Object[0]);
                gl.e3(new mm8(user, (byte) 1), 250L);
                na7.q1(h1aVar.T1).X3.edit().putBoolean("show_gift_for_" + j, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j, true).apply();
                break;
            case 2:
                x3a x3aVar = (x3a) obj2;
                x3aVar.Q = ((Long) obj).longValue();
                ((z3a) obj3).q0(x3aVar);
                break;
            case 3:
                ((d8a) obj3).g0((TLRPC.TL_attachMenuBot) obj2);
                break;
            case 4:
                na7 na7Var = (na7) obj3;
                yr5 yr5Var = (yr5) obj2;
                d S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    na7Var.J4(true);
                    if (S != null) {
                        u21.b0(S).P(R.raw.chats_infotip, gl.E2(gl.O2(k96.M0(2131745382, null), -1, 2, new ro8(S, (byte) 26), null), true)).k(true);
                    }
                    yr5Var.a(Boolean.TRUE);
                    break;
                } else if (S != null) {
                    u21.b0(S).I(R.raw.error, k96.M0(2131754308, null), k96.M0(2131754309, null)).j();
                    break;
                }
                break;
            case 5:
                ((nfa) obj3).x0((TL_stories.StoryItem) obj2, (z1b) obj);
                break;
            case 6:
                ((vqa) obj3).L1((hd) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 7:
                du4 du4Var = (du4) obj2;
                Boolean bool = (Boolean) obj;
                ((vqa) obj3).f2.setLoading(bool.booleanValue());
                if (du4Var != null && du4Var.F1 != (booleanValue = bool.booleanValue())) {
                    du4Var.F1 = booleanValue;
                    du4Var.B1.h(booleanValue);
                    break;
                }
                break;
            case 8:
                vqa vqaVar = (vqa) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                rqa rqaVar = vqaVar.a2;
                ac[] acVarArr = vqaVar.o2;
                u41 u41Var = vqaVar.f2;
                if (stargiftupgradepreview != null) {
                    rqaVar.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    vqaVar.z2(1, false, null);
                    rqaVar.i(1, k96.M0(2131750120, null), k96.a0(null, null, 2131750121, str), null);
                    acVarArr[0].setText(k96.M0(2131749850, null));
                    acVarArr[1].setText(k96.M0(2131749847, null));
                    acVarArr[2].setText(k96.M0(2131749844, null));
                    vqaVar.q2.setVisibility(8);
                    vqaVar.p2.setVisibility(8);
                    u41Var.setFilled(true);
                    u41Var.i(k96.M0(2131747638, null), false, true);
                    u41Var.g(null, false);
                    u41Var.setOnClickListener(new lna(vqaVar, (byte) 16));
                    vqaVar.show();
                    break;
                }
                break;
            case 9:
                vqa vqaVar2 = (vqa) obj3;
                xu4[] xu4VarArr = (xu4[]) obj2;
                Long l = (Long) obj;
                if (l.longValue() == -97) {
                    xu4 xu4Var = xu4VarArr[0];
                    TL_stars.TL_starGiftUnique A1 = vqaVar2.A1();
                    if (vqaVar2.E2() != null && A1 != null && !TextUtils.isEmpty(A1.slug)) {
                        long e = y6c.h(vqaVar2.a).e();
                        TextView textView = new TextView(vqaVar2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i3 = bkb.q5;
                        zkb.X(textView, i3, vqaVar2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new u86(gl.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        long[] jArr = new long[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = na7.q1(vqaVar2.a).h1(e);
                        depositstargift.slug = A1.slug;
                        ConnectionsManager.getInstance(vqaVar2.a).sendRequestTyped(depositstargift, new hc(b3), new v15((Object) vqaVar2, (Object) zArr, (Object) textView, (Object) stargiftdepositpayloadArr, (Object) runnableArr, (Object) jArr, (byte) 5));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar2.J0, vqaVar2.getContext());
                        String M0 = k96.M0(2131750091, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131750089, null);
                        TLRPC.User f = y6c.h(vqaVar2.a).f();
                        LinearLayout linearLayout = new LinearLayout(vqaVar2.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(vqaVar2.getContext());
                        int L = gl.L(20.0f);
                        int i4 = bkb.i5;
                        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.045f, bkb.v0(i4, vqaVar2.J0)));
                        vkb K2 = zkb.K(0.045f, i4);
                        wjb wjbVar = vqaVar2.J0;
                        frameLayout.setBackground(b0);
                        zkb.j(frameLayout, b0, K2, null, wjbVar);
                        be0 be0Var = new be0(vqaVar2.getContext());
                        be0Var.setRoundRadius(gl.L(21.0f));
                        pb0 pb0Var = new pb0((wjb) null);
                        pb0Var.q(f);
                        be0Var.f(f, pb0Var);
                        frameLayout.addView(be0Var, nme.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(vqaVar2.getContext());
                        ir2.t(textView2, 1, 16.0f);
                        zkb.X(textView2, i4, vqaVar2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(vu3.m(l7c.q(f), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, nme.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(vqaVar2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        zkb.X(textView3, i3, vqaVar2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f != null) {
                            if (!TextUtils.isEmpty(f.phone)) {
                                textView3.setText(p38.f().e("+" + f.phone));
                            } else if (l7c.o(f) != null) {
                                textView3.setText("@" + l7c.o(f));
                            }
                        }
                        frameLayout.addView(textView3, nme.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, nme.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(vqaVar2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        zkb.X(textView4, i4, vqaVar2.J0);
                        de9.q(textView4, 17, null, 2131750092);
                        linearLayout.addView(textView4, nme.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(vqaVar2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        vqaVar2.b1(linearLayout2, R.drawable.msg_openprofile, 14, i3, k96.M0(2131748110, null), true);
                        vqaVar2.b1(linearLayout2, R.drawable.menu_gift, 14, i3, k96.M0(2131746483, null), false);
                        linearLayout.addView(linearLayout2, nme.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, nme.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.n(linearLayout);
                        hdVar.H = (byte) 20;
                        alertDialog$Builder.j(k96.M0(2131750093, null), new xn1(vqaVar2, e, stargiftdepositpayloadArr, jArr, xu4Var));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        hdVar.setOnDismissListener(new cf(zArr, runnableArr, (byte) 15));
                        hdVar.show();
                        break;
                    }
                } else if (l.longValue() != -99 && l.longValue() != -98) {
                    long longValue = l.longValue();
                    xu4 xu4Var2 = xu4VarArr[0];
                    TL_stars.TL_starGiftUnique A12 = vqaVar2.A1();
                    if (vqaVar2.E2() != null && A12 != null && !TextUtils.isEmpty(A12.slug)) {
                        hd hdVar2 = new hd(3, vqaVar2.J0, vqaVar2.getContext());
                        hdVar2.q(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = na7.q1(vqaVar2.a).h1(longValue);
                        depositstargift2.slug = A12.slug;
                        ConnectionsManager.getInstance(vqaVar2.a).sendRequestTyped(depositstargift2, new hc((byte) 0), new il3(vqaVar2, hdVar2, xu4Var2, longValue));
                        break;
                    }
                }
                break;
            case 10:
                ((spa) obj2).a((TL_stars.StarGift) obj, true);
                ((upa) obj3).d(true);
                break;
            case 11:
                aqa aqaVar = (aqa) obj3;
                oj ojVar = (oj) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                c01 c01Var = aqaVar.n;
                if (c01Var != null && ojVar == aqaVar.s) {
                    c01Var.c(false);
                }
                aqaVar.r.remove(ojVar);
                if (tL_payments_paymentFormStarGift != null) {
                    aqaVar.q.put(ojVar, new ypa(ojVar, tL_payments_paymentFormStarGift));
                    aqaVar.a(true);
                    break;
                }
                break;
            case 12:
                ((i8c) obj3).a((nj) obj, new z6a((o0a[]) obj2, (byte) 25));
                break;
            case 13:
                t5b t5bVar = (t5b) obj3;
                ((cs5) obj2).u();
                t5bVar.h(true);
                y5b y5bVar = t5bVar.a0;
                e6b e6bVar = y5bVar.R1;
                if (e6bVar != null) {
                    e6bVar.a(new HashSet(y5bVar.u1));
                    break;
                }
                break;
            case 14:
                t5b t5bVar2 = (t5b) obj3;
                t5bVar2.a0.A1 = true;
                ((f13[]) obj2)[0].dismiss();
                t5bVar2.h(true);
                break;
            case 15:
                t6b t6bVar = (t6b) obj3;
                p8c p8cVar = (p8c) obj2;
                Integer num = (Integer) obj;
                t7b t7bVar = t6bVar.a;
                boolean p0 = t7bVar.p0();
                int i5 = t7bVar.c;
                if (p0) {
                    try {
                        t7bVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                t7bVar.Q1 = false;
                dv8 dv8Var = t7bVar.D0;
                if (dv8Var != null) {
                    dv8Var.f(false);
                }
                if (t7bVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(t7bVar.H1.getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused2) {
                            i2 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            f4b m = f4b.m(t7bVar.H1, r7);
                            m.J0 = t7bVar.w0;
                            m.K0 = t7bVar.x0;
                            if (t7bVar.B0.i()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i = -1;
                    }
                    int i6 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i > i2) {
                            i6 = kk7.s4;
                        }
                    } else if (i2 > i && i6 != 0) {
                        i6 = 0;
                    }
                    f4b m2 = f4b.m(t7bVar.H1, i6);
                    m2.J0 = t7bVar.w0;
                    m2.K0 = t7bVar.x0;
                    if (t7bVar.B0.i()) {
                        t7bVar.L1 = m2;
                        a6b.a(i5, m2);
                        t7bVar.M1 = false;
                        if (p8cVar != null) {
                            p8cVar.a(new r6b(t6bVar, b2));
                            break;
                        } else {
                            t7bVar.I(1, true);
                            break;
                        }
                    } else {
                        t7bVar.H1 = null;
                        if (t7bVar.B0.l(m2)) {
                            f4b a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
                            t7bVar.L1 = a;
                            a6b.a(i5, a);
                            t7bVar.M1 = false;
                            if (p8cVar != null) {
                                p8cVar.a(null);
                            }
                        } else if (p8cVar != null) {
                            p8cVar.a(null);
                        }
                        t7bVar.l0(true);
                        break;
                    }
                }
                break;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                themeActivity.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    gba.r0 = false;
                    gba.x();
                    themeActivity.P0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    o39 o39Var = themeActivity.b;
                    if (o39Var != null && o39Var.H && (K = o39Var.K(themeActivity.N)) != null) {
                        themeActivity.a.t(K, themeActivity.N);
                        break;
                    }
                }
                break;
            case 17:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                a5b a5bVar = (a5b) obj2;
                themeActivity2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a5bVar.run();
                    break;
                } else {
                    u21.b0(themeActivity2).I(R.raw.error, k96.M0(2131754308, null), k96.M0(2131754309, null)).j();
                    break;
                }
            case 18:
                kob kobVar = (kob) obj3;
                fob fobVar = (fob) obj2;
                Float f2 = (Float) obj;
                kobVar.getClass();
                fobVar.i = f2.floatValue();
                eob eobVar = kobVar.a;
                if (eobVar != null) {
                    eobVar.p0(f2.floatValue(), fobVar.a);
                    break;
                }
                break;
            case 19:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 20:
                hmc hmcVar = (hmc) obj3;
                c cVar = (c) obj2;
                String str2 = (String) obj;
                hmcVar.F0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    noc nocVar = new noc();
                    nocVar.s = cVar.D();
                    hmcVar.presentFragment(nocVar);
                    break;
                } else if (str2 != null) {
                    u21.b0(hmcVar).f0(str2, false);
                    break;
                } else {
                    hmcVar.presentFragment(new ypc());
                    break;
                }
            case 21:
                noc nocVar2 = (noc) obj3;
                c cVar2 = (c) obj2;
                String str3 = (String) obj;
                nocVar2.d.setLoading(false);
                if (str3 != null) {
                    u21.b0(nocVar2).f0(str3, false);
                    break;
                } else {
                    nocVar2.finishFragment();
                    cVar2.S();
                    break;
                }
            case 22:
                toc tocVar = (toc) obj3;
                d dVar = (d) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    u21.b0(tocVar).f0(str4, false);
                    break;
                } else {
                    tocVar.finishFragment();
                    if (dVar instanceof hmc) {
                        gl.e3(new ro8(dVar, (byte) 29), 300L);
                        break;
                    }
                }
                break;
            case 23:
                ypc ypcVar = (ypc) obj3;
                String str5 = (String) obj;
                ypcVar.getClass();
                ((p8c) obj2).a(str5);
                if (str5 == null && !ypcVar.r) {
                    if (ypcVar.getParentLayout() != null) {
                        for (d dVar2 : ypcVar.getParentLayout().getFragmentStack()) {
                            if (dVar2 instanceof hmc) {
                                ((hmc) dVar2).S0();
                            }
                        }
                    }
                    ypcVar.finishFragment();
                    break;
                }
                break;
            case 24:
                ((iqc) obj3).c0((TL_wallet.tonConnectSession) obj2, (p8c) obj);
                break;
            case 25:
                tsc tscVar = (tsc) obj3;
                e01 e01Var = (e01) obj;
                ((me5[]) obj2)[0].finishFragment();
                ws wsVar = tscVar.f;
                if (wsVar != null) {
                    tscVar.finishFragment();
                    wsVar.a(e01Var);
                    break;
                } else {
                    d01.t(tscVar.getParentActivity(), e01Var.c);
                    break;
                }
            default:
                ctc ctcVar = (ctc) obj3;
                ctcVar.getClass();
                gl.d3(new wbc(ctcVar, (btc) obj2, (Bitmap) obj, (byte) 21));
                break;
        }
    }
}
