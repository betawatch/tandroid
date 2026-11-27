// default package

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku9 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ku9(ky9 ky9Var, View view) {
        this.a = (byte) 1;
        this.c = ky9Var;
        this.b = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        int i2;
        f89 L;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj3;
                yt4 yt4Var = (yt4) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f = iArr[0];
                    Point point = hl.q;
                    int j = Utilities.j((int) ((f / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j2 = Utilities.j((int) ((iArr[1] / ((point.y + hl.m) + hl.n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j3 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j, 0);
                    int j4 = Utilities.j((int) ((view.getHeight() / ((point.y + hl.m) + hl.n)) * bitmap.getHeight()), bitmap.getHeight() - j2, 0);
                    if ((j != 0 || j2 != 0 || j3 != bitmap.getWidth() || j4 != bitmap.getHeight()) && j3 > 0 && j4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j, j2, j3, j4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, aob.I.o() ? 0.04f : 0.25f);
                hl.h(colorMatrix, aob.I.o() ? -0.04f : -0.07f);
                Bitmap l = hl.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(aob.I.o() ? 2.0f : 3.0f);
                hl.h(colorMatrix2, aob.I.o() ? -0.2f : -0.07f);
                Bitmap l2 = hl.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                yt4Var.a(l, l2);
                break;
            case 1:
                ky9 ky9Var = (ky9) obj2;
                View view2 = (View) obj3;
                Bitmap bitmap2 = (Bitmap) obj;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ky9Var.f = bitmap2;
                Paint paint = new Paint(1);
                ky9Var.n = paint;
                Bitmap bitmap3 = ky9Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                ky9Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                hl.i(colorMatrix3, aob.I.o() ? 0.05f : 0.25f);
                hl.h(colorMatrix3, aob.I.o() ? -0.02f : -0.04f);
                ky9Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                ky9Var.r = new Matrix();
                break;
            case 2:
                a5a a5aVar = (a5a) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j5 = a5aVar.U1;
                Runnable runnable = a5aVar.b2;
                if (runnable != null) {
                    runnable.run();
                }
                a5aVar.dismiss();
                jn7.f(yac.t0).k(jn7.U2, new Object[0]);
                hl.d3(new xp8(user, (byte) 1), 250L);
                uc7.s1(a5aVar.T1).Y3.edit().putBoolean("show_gift_for_" + j5, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j5, true).apply();
                break;
            case 3:
                p7a p7aVar = (p7a) obj2;
                p7aVar.Q = ((Long) obj).longValue();
                ((r7a) obj3).q0(p7aVar);
                break;
            case 4:
                ((uba) obj3).g0((TLRPC.TL_attachMenuBot) obj2);
                break;
            case 5:
                uc7 uc7Var = (uc7) obj3;
                au5 au5Var = (au5) obj2;
                e S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    uc7Var.S4(true);
                    if (S != null) {
                        d31.b0(S).P(R.raw.chats_infotip, hl.D2(hl.N2(ob6.M0(2131745302, null), -1, 2, new ds8(S, (byte) 26), null), true)).k(true);
                    }
                    au5Var.a(Boolean.TRUE);
                    break;
                } else if (S != null) {
                    d31.b0(S).I(R.raw.error, ob6.M0(2131754304, null), ob6.M0(2131754305, null)).j();
                    break;
                }
                break;
            case 6:
                ((eja) obj3).x0((TL_stories.StoryItem) obj2, (w5b) obj);
                break;
            case 7:
                ((wua) obj3).M1((id) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 8:
                wua wuaVar = (wua) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                sua suaVar = wuaVar.a2;
                bc[] bcVarArr = wuaVar.o2;
                c51 c51Var = wuaVar.f2;
                if (stargiftupgradepreview != null) {
                    suaVar.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    wuaVar.A2(1, false, null);
                    suaVar.i(1, ob6.M0(2131750095, null), ob6.a0(null, null, 2131750096, str), null);
                    bcVarArr[0].setText(ob6.M0(2131749812, null));
                    bcVarArr[1].setText(ob6.M0(2131749809, null));
                    bcVarArr[2].setText(ob6.M0(2131749806, null));
                    wuaVar.q2.setVisibility(8);
                    wuaVar.p2.setVisibility(8);
                    c51Var.setFilled(true);
                    c51Var.i(ob6.M0(2131747558, null), false, true);
                    c51Var.g(null, false);
                    c51Var.setOnClickListener(new hra(wuaVar, (byte) 17));
                    wuaVar.show();
                    break;
                }
                break;
            case 9:
                wua wuaVar2 = (wua) obj3;
                bx4[] bx4VarArr = (bx4[]) obj2;
                Long l3 = (Long) obj;
                if (l3.longValue() == -97) {
                    bx4 bx4Var = bx4VarArr[0];
                    TL_stars.TL_starGiftUnique B1 = wuaVar2.B1();
                    if (wuaVar2.F2() != null && B1 != null && !TextUtils.isEmpty(B1.slug)) {
                        long e = yac.h(wuaVar2.a).e();
                        TextView textView = new TextView(wuaVar2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i3 = aob.r5;
                        yob.X(textView, i3, wuaVar2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new ya6(hl.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        long[] jArr = new long[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = uc7.s1(wuaVar2.a).j1(e);
                        depositstargift.slug = B1.slug;
                        ConnectionsManager.getInstance(wuaVar2.a).sendRequestTyped(depositstargift, new ic(b4), new a45((Object) wuaVar2, (Object) zArr, (Object) textView, (Object) stargiftdepositpayloadArr, (Object) runnableArr, (Object) jArr, (byte) 5));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar2.J0, wuaVar2.getContext());
                        String M0 = ob6.M0(2131750066, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131750064, null);
                        TLRPC.User f2 = yac.h(wuaVar2.a).f();
                        LinearLayout linearLayout = new LinearLayout(wuaVar2.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(wuaVar2.getContext());
                        int L2 = hl.L(20.0f);
                        int i4 = aob.j5;
                        ShapeDrawable b0 = aob.b0(L2, aob.p1(0.045f, aob.v0(i4, wuaVar2.J0)));
                        uob K = yob.K(0.045f, i4);
                        vnb vnbVar = wuaVar2.J0;
                        frameLayout.setBackground(b0);
                        yob.j(frameLayout, b0, K, null, vnbVar);
                        de0 de0Var = new de0(wuaVar2.getContext());
                        de0Var.setRoundRadius(hl.L(21.0f));
                        rb0 rb0Var = new rb0((vnb) null);
                        rb0Var.q(f2);
                        de0Var.f(f2, rb0Var);
                        frameLayout.addView(de0Var, tre.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(wuaVar2.getContext());
                        bs2.t(textView2, 1, 16.0f);
                        yob.X(textView2, i4, wuaVar2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(pv3.m(lbc.r(f2), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, tre.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(wuaVar2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        yob.X(textView3, i3, wuaVar2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f2 != null) {
                            if (!TextUtils.isEmpty(f2.phone)) {
                                textView3.setText(f78.f().e("+" + f2.phone));
                            } else if (lbc.p(f2) != null) {
                                textView3.setText("@" + lbc.p(f2));
                            }
                        }
                        frameLayout.addView(textView3, tre.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, tre.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(wuaVar2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        yob.X(textView4, i4, wuaVar2.J0);
                        uh9.q(textView4, 17, null, 2131750067);
                        linearLayout.addView(textView4, tre.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(wuaVar2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        wuaVar2.c1(linearLayout2, R.drawable.msg_openprofile, 14, i3, ob6.M0(2131748056, null), true);
                        wuaVar2.c1(linearLayout2, R.drawable.menu_gift, 14, i3, ob6.M0(2131746403, null), false);
                        linearLayout.addView(linearLayout2, tre.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, tre.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.n(linearLayout);
                        idVar.H = (byte) 20;
                        alertDialog$Builder.j(ob6.M0(2131750068, null), new oo1(wuaVar2, e, stargiftdepositpayloadArr, jArr, bx4Var));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        idVar.setOnDismissListener(new gf(zArr, runnableArr, (byte) 15));
                        idVar.show();
                        break;
                    }
                } else if (l3.longValue() != -99 && l3.longValue() != -98) {
                    long longValue = l3.longValue();
                    bx4 bx4Var2 = bx4VarArr[0];
                    TL_stars.TL_starGiftUnique B12 = wuaVar2.B1();
                    if (wuaVar2.F2() != null && B12 != null && !TextUtils.isEmpty(B12.slug)) {
                        id idVar2 = new id(3, wuaVar2.J0, wuaVar2.getContext());
                        idVar2.q(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = uc7.s1(wuaVar2.a).j1(longValue);
                        depositstargift2.slug = B12.slug;
                        ConnectionsManager.getInstance(wuaVar2.a).sendRequestTyped(depositstargift2, new ic((byte) 0), new am3(wuaVar2, idVar2, bx4Var2, longValue));
                        break;
                    }
                }
                break;
            case 10:
                ((tta) obj2).a((TL_stars.StarGift) obj, true);
                ((vta) obj3).d(true);
                break;
            case 11:
                bua buaVar = (bua) obj3;
                pj pjVar = (pj) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                l01 l01Var = buaVar.o;
                if (l01Var != null && pjVar == buaVar.t) {
                    l01Var.c(false);
                }
                buaVar.s.remove(pjVar);
                if (tL_payments_paymentFormStarGift != null) {
                    buaVar.r.put(pjVar, new zta(pjVar, tL_payments_paymentFormStarGift));
                    buaVar.a(true);
                    break;
                }
                break;
            case 12:
                ((icc) obj3).a((oj) obj, new uoa(obj2, (byte) 12));
                break;
            case 13:
                r9b r9bVar = (r9b) obj3;
                ((fu5) obj2).u();
                r9bVar.h(true);
                w9b w9bVar = r9bVar.a0;
                dab dabVar = w9bVar.R1;
                if (dabVar != null) {
                    dabVar.a(new HashSet(w9bVar.u1));
                    break;
                }
                break;
            case 14:
                r9b r9bVar2 = (r9b) obj3;
                r9bVar2.a0.A1 = true;
                ((y13[]) obj2)[0].dismiss();
                r9bVar2.h(true);
                break;
            case 15:
                sab sabVar = (sab) obj3;
                pcc pccVar = (pcc) obj2;
                Integer num = (Integer) obj;
                sbb sbbVar = sabVar.a;
                boolean p0 = sbbVar.p0();
                int i5 = sbbVar.c;
                if (p0) {
                    try {
                        sbbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                sbbVar.Q1 = false;
                oy8 oy8Var = sbbVar.D0;
                if (oy8Var != null) {
                    oy8Var.f(false);
                }
                if (sbbVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(sbbVar.H1.getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused2) {
                            i2 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            c8b m = c8b.m(sbbVar.H1, r8);
                            m.J0 = sbbVar.w0;
                            m.K0 = sbbVar.x0;
                            if (sbbVar.B0.i()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i = -1;
                    }
                    int i6 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i > i2) {
                            i6 = jn7.s4;
                        }
                    } else if (i2 > i && i6 != 0) {
                        i6 = 0;
                    }
                    c8b m2 = c8b.m(sbbVar.H1, i6);
                    m2.J0 = sbbVar.w0;
                    m2.K0 = sbbVar.x0;
                    if (sbbVar.B0.i()) {
                        sbbVar.L1 = m2;
                        y9b.a(i5, m2);
                        sbbVar.M1 = false;
                        if (pccVar != null) {
                            pccVar.a(new qab(sabVar, b2));
                            break;
                        } else {
                            sbbVar.I(1, true);
                            break;
                        }
                    } else {
                        sbbVar.H1 = null;
                        if (sbbVar.B0.l(m2)) {
                            c8b a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
                            sbbVar.L1 = a;
                            y9b.a(i5, a);
                            sbbVar.M1 = false;
                            if (pccVar != null) {
                                pccVar.a(null);
                            }
                        } else if (pccVar != null) {
                            pccVar.a(null);
                        }
                        sbbVar.l0(true);
                        break;
                    }
                }
                break;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                themeActivity.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    xea.r0 = false;
                    xea.x();
                    themeActivity.P0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    d79 d79Var = themeActivity.b;
                    if (d79Var != null && d79Var.H && (L = d79Var.L(themeActivity.N)) != null) {
                        themeActivity.a.t(L, themeActivity.N);
                        break;
                    }
                }
                break;
            case 17:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                hab habVar = (hab) obj2;
                themeActivity2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    habVar.run();
                    break;
                } else {
                    d31.b0(themeActivity2).I(R.raw.error, ob6.M0(2131754304, null), ob6.M0(2131754305, null)).j();
                    break;
                }
            case 18:
                ksb ksbVar = (ksb) obj3;
                fsb fsbVar = (fsb) obj2;
                Float f3 = (Float) obj;
                ksbVar.getClass();
                fsbVar.i = f3.floatValue();
                esb esbVar = ksbVar.a;
                if (esbVar != null) {
                    esbVar.B0(f3.floatValue(), fsbVar.a);
                    break;
                }
                break;
            case 19:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 20:
                uqc uqcVar = (uqc) obj3;
                c cVar = (c) obj2;
                String str2 = (String) obj;
                uqcVar.F0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    atc atcVar = new atc();
                    atcVar.s = cVar.D();
                    uqcVar.presentFragment(atcVar);
                    break;
                } else if (str2 != null) {
                    d31.b0(uqcVar).f0(str2, false);
                    break;
                } else {
                    uqcVar.presentFragment(new muc());
                    break;
                }
            case 21:
                atc atcVar2 = (atc) obj3;
                c cVar2 = (c) obj2;
                String str3 = (String) obj;
                atcVar2.d.setLoading(false);
                if (str3 != null) {
                    d31.b0(atcVar2).f0(str3, false);
                    break;
                } else {
                    atcVar2.finishFragment();
                    cVar2.T();
                    break;
                }
            case 22:
                gtc gtcVar = (gtc) obj3;
                e eVar = (e) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    d31.b0(gtcVar).f0(str4, false);
                    break;
                } else {
                    gtcVar.finishFragment();
                    if (eVar instanceof uqc) {
                        hl.d3(new ds8(eVar, (byte) 29), 300L);
                        break;
                    }
                }
                break;
            case 23:
                muc mucVar = (muc) obj3;
                String str5 = (String) obj;
                mucVar.getClass();
                ((pcc) obj2).a(str5);
                if (str5 == null && !mucVar.r) {
                    if (mucVar.getParentLayout() != null) {
                        for (e eVar2 : mucVar.getParentLayout().getFragmentStack()) {
                            if (eVar2 instanceof uqc) {
                                ((uqc) eVar2).S0();
                            }
                        }
                    }
                    mucVar.finishFragment();
                    break;
                }
                break;
            case 24:
                ((wuc) obj3).c0((TL_wallet.tonConnectSession) obj2, (pcc) obj);
                break;
            case 25:
                ixc ixcVar = (ixc) obj3;
                n01 n01Var = (n01) obj;
                ((ng5[]) obj2)[0].finishFragment();
                vs vsVar = ixcVar.f;
                if (vsVar != null) {
                    ixcVar.finishFragment();
                    vsVar.a(n01Var);
                    break;
                } else {
                    m01.u(ixcVar.getParentActivity(), n01Var.c);
                    break;
                }
            default:
                rxc rxcVar = (rxc) obj3;
                rxcVar.getClass();
                hl.c3(new jwc(rxcVar, (qxc) obj2, (Bitmap) obj, b3));
                break;
        }
    }

    public /* synthetic */ ku9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
