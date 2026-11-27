// default package

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g45 implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g45(id idVar, icc iccVar, vj0 vj0Var, Context context, int i) {
        this.d = idVar;
        this.e = iccVar;
        this.f = vj0Var;
        this.c = context;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // icc
    public final void a(Object obj, Object obj2) {
        w45 w45Var;
        int i;
        a55 a55Var;
        LinearLayout linearLayout;
        final int i2;
        CharSequence V;
        String str;
        int i3;
        String M0;
        int i4;
        int i5;
        int i6;
        TL_wallet.tonConnectSession tonconnectsession;
        e S;
        byte b = this.a;
        byte b2 = 3;
        int i7 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i8 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                c cVar = (c) obj5;
                vnb vnbVar = (vnb) obj4;
                final w56 w56Var = (w56) obj3;
                final w45 w45Var2 = (w45) obj;
                String str2 = (String) obj2;
                if (w45Var2 != null) {
                    int i9 = w45Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = w45Var2.a;
                    String str3 = w45Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || xea.w || xea.B || yac.t0 != i7) {
                            cVar.g.u(w45Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str3)) {
                        c C = c.C(i7);
                        a55 a55Var2 = C.g;
                        z45 z45Var = w45Var2.f;
                        boolean equals = "signMessage".equals(str3);
                        final sk7 sk7Var = new sk7(context, vnbVar, new View[0]);
                        sk7Var.F0(aob.v0(aob.a7, vnbVar));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        de0 de0Var = new de0(context);
                        de0Var.setRoundRadius(hl.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            w45Var = w45Var2;
                            i = i7;
                            a55Var = a55Var2;
                            de0Var.p(jn5.p(jxc.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            w45Var = w45Var2;
                            i = i7;
                            a55Var = a55Var2;
                        }
                        linearLayout2.addView(de0Var, tre.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = a55.v(context, ob6.V(null, null, equals ? 2131742847 : 2131742846, tonconnectsession2.manifest.name), 20, vnbVar);
                        v.setTypeface(hl.o());
                        linearLayout2.addView(v, tre.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String J0 = hl.J0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(J0)) {
                            linearLayout2.addView(a55.g(context, J0, vnbVar), tre.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        frc frcVar = new frc(context, R.drawable.wallet_card_info, 24);
                        frcVar.getCardHolderView().setMaxLines(2);
                        frcVar.getCardHolderView().setSingleLine(false);
                        List<y45> list = z45Var.b;
                        long j = z45Var.c;
                        frcVar.setCardHolder(atc.Z(((y45) list.get(0)).a));
                        frcVar.getBalanceView().setText(a55.j(j));
                        frcVar.getUsdBalanceView().setText(C.q(j, false));
                        linearLayout2.addView(frcVar, tre.o(-1, -2));
                        final byte b4 = 0;
                        frcVar.setCardOnClickListener(new View.OnClickListener() { // from class: h45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = b4;
                                sk7 sk7Var2 = sk7Var;
                                switch (b5) {
                                    case 0:
                                        ir1 ir1Var = sk7Var2.l1;
                                        if (1 < sk7Var2.m1.size() && 1 != ir1Var.getCurrentPosition()) {
                                            for (View view2 : ir1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    hl.t1(view2);
                                                }
                                            }
                                            ir1Var.F(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        ir1 ir1Var2 = sk7Var2.l1;
                                        if (sk7Var2.m1.size() > 0 && ir1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : ir1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    hl.t1(view3);
                                                }
                                            }
                                            ir1Var2.F(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        rk7 rk7Var = new rk7(context);
                        rk7Var.getContent().addView(linearLayout2, tre.c(-2.0f, -1));
                        sk7Var.E0(rk7Var);
                        LinearLayout j2 = uh9.j(context, 1);
                        LinearLayout j3 = uh9.j(context, 0);
                        j2.addView(j3, tre.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i10 = aob.i6;
                        hf0 f0 = aob.f0(aob.v0(i10, vnbVar), 1, -1);
                        uob M = yob.M(i10);
                        imageView.setBackground(f0);
                        yob.j(imageView, f0, null, M, vnbVar);
                        int i11 = aob.G6;
                        yob.s(imageView, i11, vnbVar, PorterDuff.Mode.SRC_IN);
                        iye.a(imageView);
                        j3.addView(imageView, tre.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        de0 de0Var2 = new de0(context);
                        de0Var2.setRoundRadius(hl.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            linearLayout = j2;
                            de0Var2.p(jn5.p(jxc.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            linearLayout = j2;
                        }
                        j3.addView(de0Var2, tre.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        j3.addView(linearLayout3, tre.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(hl.o());
                        yob.X(textView, i11, vnbVar);
                        textView.setTextSize(1, 18.0f);
                        linearLayout3.addView(textView, tre.o(-1, -2));
                        textView.setText(ob6.M0(2131742818, null));
                        if (TextUtils.isEmpty(J0)) {
                            i2 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            yob.X(textView2, aob.z6, vnbVar);
                            i2 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout3.addView(textView2, tre.o(-1, -2));
                            textView2.setText(J0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: h45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = i2;
                                sk7 sk7Var2 = sk7Var;
                                switch (b5) {
                                    case 0:
                                        ir1 ir1Var = sk7Var2.l1;
                                        if (1 < sk7Var2.m1.size() && 1 != ir1Var.getCurrentPosition()) {
                                            for (View view2 : ir1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    hl.t1(view2);
                                                }
                                            }
                                            ir1Var.F(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        ir1 ir1Var2 = sk7Var2.l1;
                                        if (sk7Var2.m1.size() > 0 && ir1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : ir1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    hl.t1(view3);
                                                }
                                            }
                                            ir1Var2.F(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(i2);
                        LinearLayout F = a55.F(context, ob6.M0(2131742682, null), vnbVar);
                        String C2 = a55.C(((y45) list.get(0)).a);
                        SpannableStringBuilder w = c.w(j, i2);
                        if (list.size() > i2) {
                            Integer valueOf = Integer.valueOf(list.size() - i2);
                            Object[] objArr = new Object[2];
                            objArr[0] = C2;
                            objArr[i2] = valueOf;
                            V = ob6.V(null, null, 2131742606, objArr);
                        } else {
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = C2;
                            V = ob6.V(null, null, 2131742607, objArr2);
                        }
                        F.addView(a55.b(context, w, V, null, null, vnbVar), tre.o(-1, -2));
                        linearLayout4.addView(F, tre.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = a55.F(context, ob6.M0(2131742858, null), vnbVar);
                        for (y45 y45Var : list) {
                            if (y45Var.b == null || y45Var.d != null) {
                                str = null;
                                i3 = 2131742612;
                            } else {
                                i3 = 2131742804;
                                str = null;
                            }
                            F2.addView(a55.b(context, ob6.M0(i3, str), ob6.V(str, str, 2131742607, a55.C(y45Var.a)), a55.a(-y45Var.e), y45Var.d, vnbVar), tre.o(-1, -2));
                        }
                        linearLayout4.addView(F2, tre.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        ti3 ti3Var = new ti3(context, (byte) 2);
                        ti3Var.setFillViewport(false);
                        ti3Var.addView(linearLayout4);
                        LinearLayout linearLayout5 = linearLayout;
                        linearLayout5.addView(ti3Var, tre.o(-1, -2));
                        rk7 rk7Var2 = new rk7(context);
                        rk7Var2.getContent().addView(linearLayout5, tre.c(-2.0f, -1));
                        sk7Var.E0(rk7Var2);
                        LinearLayout j4 = uh9.j(context, 1);
                        TextView v2 = a55.v(context, null, 14, vnbVar);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new ya6(hl.L(80.0f), v2), 0, spannableStringBuilder.length(), 33);
                        v2.setText(ob6.V(null, null, 2131742770, spannableStringBuilder));
                        v2.setVisibility(equals ? 8 : 0);
                        yob.X(v2, aob.z6, vnbVar);
                        j4.addView(v2, tre.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(16.0f));
                        c51 c51Var = new c51(vnbVar, context, true);
                        c51Var.setRoundRadius(24);
                        c51Var.e();
                        c51Var.setText(ob6.M0(2131742794, null));
                        linearLayout6.addView(c51Var, tre.m(1.0f, 0, 44, 0, 6, 0));
                        c51 i12 = xnb.i(24, vnbVar, context, true);
                        i12.setText(ob6.M0(equals ? 2131742643 : 2131742819, null));
                        i12.setEnabled(false);
                        linearLayout6.addView(i12, tre.m(1.0f, 0, 44, 6, 0, 0));
                        j4.addView(linearLayout6);
                        sk7Var.G0(j4);
                        final byte b5 = 1;
                        final byte b6 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final w45 w45Var3 = w45Var;
                        final a55 a55Var3 = a55Var;
                        final i45 i45Var = new i45(w45Var3, zArr2, i12, c51Var, a55Var3, sk7Var, zArr, vnbVar);
                        i12.setOnClickListener(new View.OnClickListener() { // from class: j45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b7 = b6;
                                i45 i45Var2 = i45Var;
                                switch (b7) {
                                    case 0:
                                        i45Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        i45Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        c51Var.setOnClickListener(new View.OnClickListener() { // from class: j45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b7 = b5;
                                i45 i45Var2 = i45Var;
                                switch (b7) {
                                    case 0:
                                        i45Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        i45Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final u45 u45Var = new u45(zArr, w45Var3, sk7Var, b5);
                        long j5 = i9;
                        long j6 = z45Var.a;
                        if (j6 == 0) {
                            j6 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j5, j6) - ConnectionsManager.getInstance(i).getCurrentTime()) * 1000;
                        w45Var3.r = new rj4(sk7Var, (byte) 24);
                        final byte b7 = 0;
                        sk7Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: k45
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                byte b8 = b7;
                                w56 w56Var2 = w56Var;
                                w45 w45Var4 = w45Var3;
                                a55 a55Var4 = a55Var3;
                                Runnable runnable = u45Var;
                                boolean[] zArr3 = zArr;
                                u45 u45Var2 = (u45) runnable;
                                switch (b8) {
                                    case 0:
                                        zArr3[0] = true;
                                        hl.r(u45Var2);
                                        a55Var4.u(w45Var4);
                                        if (w56Var2 != null) {
                                            w56Var2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        zArr3[0] = true;
                                        hl.r(u45Var2);
                                        a55Var4.u(w45Var4);
                                        if (w56Var2 != null) {
                                            w56Var2.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        sk7Var.show();
                        hl.d3(u45Var, max);
                        j72 j72Var = new j72(zArr, w45Var3, zArr2, i12, equals, C, v2, sk7Var, vnbVar);
                        WalletEngine2 walletEngine2 = a55Var3.b.b;
                        if (!w45Var3.n && !a55Var3.i(w45Var3) && a55Var3.A(w45Var3) && walletEngine2 != null) {
                            byte b8 = 21;
                            if ("signMessage".equals(str3)) {
                                walletEngine2.previewSignMessage(z45Var, new gt(a55Var3, w45Var3, j72Var, b8));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(z45Var, new p(a55Var3, w45Var3, j72Var, b8));
                                break;
                            }
                        } else {
                            j72Var.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final a55 a55Var4 = c.C(i7).g;
                        try {
                            JSONObject jSONObject = new JSONObject(w45Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            sk7 sk7Var2 = new sk7(context, vnbVar, new View[0]);
                            sk7Var2.F0(aob.v0(aob.a7, vnbVar));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setGravity(16);
                            ImageView k = qd4.k(context, R.drawable.ic_ab_close);
                            k.setScaleType(ImageView.ScaleType.CENTER);
                            yob.s(k, aob.G6, vnbVar, PorterDuff.Mode.SRC_IN);
                            int i13 = aob.i6;
                            hf0 f02 = aob.f0(aob.v0(i13, vnbVar), 1, -1);
                            uob M2 = yob.M(i13);
                            k.setBackground(f02);
                            yob.j(k, f02, null, M2, vnbVar);
                            k.setContentDescription(ob6.M0(2131752006, null));
                            k.setOnClickListener(new je3(w45Var2, sk7Var2, (byte) 22));
                            linearLayout8.addView(k, tre.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            de0 de0Var3 = new de0(context);
                            de0Var3.setRoundRadius(hl.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                de0Var3.p(jn5.p(jxc.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout8.addView(de0Var3, tre.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout9 = new LinearLayout(context);
                            linearLayout9.setOrientation(1);
                            TextView v3 = a55.v(context, ob6.M0(2131742642, null), 18, vnbVar);
                            v3.setTypeface(hl.o());
                            v3.setGravity(3);
                            linearLayout9.addView(v3, tre.o(-1, -2));
                            TextView v4 = a55.v(context, hl.J0(tonconnectsession2.manifest.url, false), 14, vnbVar);
                            int i14 = aob.z6;
                            yob.X(v4, i14, vnbVar);
                            v4.setGravity(3);
                            v4.setSingleLine(true);
                            v4.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout9.addView(v4, tre.o(-1, -2));
                            linearLayout8.addView(linearLayout9, tre.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout7.addView(linearLayout8, tre.o(-1, 56));
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setOrientation(1);
                            linearLayout10.setPadding(hl.L(20.0f), hl.L(16.0f), hl.L(20.0f), hl.L(16.0f));
                            int L = hl.L(16.0f);
                            int i15 = aob.d6;
                            ShapeDrawable b0 = aob.b0(L, aob.v0(i15, vnbVar));
                            uob M3 = yob.M(i15);
                            linearLayout10.setBackground(b0);
                            yob.j(linearLayout10, b0, M3, null, vnbVar);
                            if (equals2) {
                                M0 = jSONObject.optString("text");
                                i4 = 14;
                            } else {
                                M0 = ob6.M0(2131742834, null);
                                i4 = 16;
                            }
                            TextView v5 = a55.v(context, M0, i4, vnbVar);
                            v5.setGravity(3);
                            v5.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v6 = a55.v(context, ob6.M0(2131742641, null), 14, vnbVar);
                                v6.setGravity(3);
                                v6.setTypeface(hl.o());
                                yob.X(v6, aob.L6, vnbVar);
                                linearLayout10.addView(v6, tre.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v5.setTypeface(Typeface.MONOSPACE);
                                i5 = -1;
                                i6 = -2;
                            } else {
                                LinearLayout linearLayout11 = new LinearLayout(context);
                                linearLayout11.setGravity(16);
                                TextView v7 = a55.v(context, "!", 12, vnbVar);
                                v7.setTypeface(hl.o());
                                v7.setTextColor(-1);
                                int L2 = hl.L(8.0f);
                                int i16 = aob.q7;
                                ShapeDrawable b02 = aob.b0(L2, aob.v0(i16, vnbVar));
                                uob M4 = yob.M(i16);
                                v7.setBackground(b02);
                                yob.j(v7, b02, M4, null, vnbVar);
                                linearLayout11.addView(v7, tre.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v8 = a55.v(context, ob6.M0(2131742835, null), 14, vnbVar);
                                v8.setGravity(3);
                                v8.setTypeface(hl.o());
                                i5 = -1;
                                i6 = -2;
                                linearLayout11.addView(v8, tre.o(-1, -2));
                                linearLayout10.addView(linearLayout11, tre.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout10.addView(v5, tre.o(i5, i6));
                            if (equals2) {
                                v5.setOnClickListener(new lw4(jSONObject, sk7Var2, vnbVar, (byte) 3));
                            }
                            ti3 ti3Var2 = new ti3(context, (byte) 1);
                            ti3Var2.addView(linearLayout10);
                            linearLayout7.addView(ti3Var2, tre.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            rk7 rk7Var3 = new rk7(context);
                            rk7Var3.getContent().addView(linearLayout7, tre.c(-2.0f, -1));
                            sk7Var2.E0(rk7Var3);
                            LinearLayout j7 = uh9.j(context, 1);
                            if (equals2) {
                                TextView v9 = a55.v(context, ob6.M0(2131742660, null), 14, vnbVar);
                                v9.setGravity(3);
                                yob.X(v9, i14, vnbVar);
                                j7.addView(v9, tre.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout12 = new LinearLayout(context);
                            linearLayout12.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                            c51 c51Var2 = new c51(vnbVar, context, true);
                            c51Var2.setRoundRadius(24);
                            c51Var2.e();
                            c51Var2.setText(ob6.M0(2131752570, null));
                            c51 i17 = xnb.i(24, vnbVar, context, true);
                            i17.setText(ob6.M0(2131742643, null));
                            i17.setEnabled(false);
                            linearLayout12.addView(c51Var2, tre.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout12.addView(i17, tre.m(1.0f, 0, 44, 6, 0, 0));
                            j7.addView(linearLayout12);
                            sk7Var2.G0(j7);
                            byte b9 = 1;
                            sk7Var2.z0 = new ut(w45Var2, b9);
                            re4 re4Var = new re4((Object) ti3Var2, (Object) w45Var2, (Object) i17, (byte) 17);
                            ti3Var2.getViewTreeObserver().addOnScrollChangedListener(new cd(re4Var, b9));
                            final byte b10 = 0;
                            ti3Var2.getViewTreeObserver().addOnGlobalLayoutListener(new l45(re4Var, b10));
                            final m45 m45Var = new m45(i17, c51Var2, a55Var4, w45Var2, sk7Var2, vnbVar, re4Var);
                            i17.setOnClickListener(new View.OnClickListener() { // from class: n45
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b11 = b10;
                                    m45 m45Var2 = m45Var;
                                    switch (b11) {
                                        case 0:
                                            m45Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            m45Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final byte b11 = 1;
                            c51Var2.setOnClickListener(new View.OnClickListener() { // from class: n45
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b112 = b11;
                                    m45 m45Var2 = m45Var;
                                    switch (b112) {
                                        case 0:
                                            m45Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            m45Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final u45 u45Var2 = new u45(zArr3, w45Var2, sk7Var2, b10);
                            w45Var2.r = new rj4(sk7Var2, (byte) 24);
                            final byte b12 = 1;
                            sk7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: k45
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b82 = b12;
                                    w56 w56Var2 = w56Var;
                                    w45 w45Var4 = w45Var2;
                                    a55 a55Var42 = a55Var4;
                                    Runnable runnable = u45Var2;
                                    boolean[] zArr32 = zArr3;
                                    u45 u45Var22 = (u45) runnable;
                                    switch (b82) {
                                        case 0:
                                            zArr32[0] = true;
                                            hl.r(u45Var22);
                                            a55Var42.u(w45Var4);
                                            if (w56Var2 != null) {
                                                w56Var2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            zArr32[0] = true;
                                            hl.r(u45Var22);
                                            a55Var42.u(w45Var4);
                                            if (w56Var2 != null) {
                                                w56Var2.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            sk7Var2.show();
                            hl.d3(u45Var2, Math.max(0L, i9 - a55Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e) {
                            a55Var4.u(w45Var2);
                            d31.c0(a55.h("display signing data", e));
                            return;
                        }
                    }
                } else if (str2 != null) {
                    d31.c0(str2);
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                l01 l01Var = (l01) obj5;
                uc7 uc7Var = (uc7) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                if (l01Var != null) {
                    l01Var.b();
                }
                if (user2 != null) {
                    uc7Var.i4(user2, false, false);
                    uc7Var.f3(user2, 0, true, null);
                }
                launchActivity.m0(i7, user.id, tL_error);
                break;
            case 2:
                e66 e66Var = (e66) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = e66Var.a;
                e66Var.h = -1;
                if (!e66Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        e66Var.c();
                        if (e66Var.a()) {
                            e66.d().g0(tL_error2, false);
                            break;
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            while (true) {
                                if (i8 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i8);
                                    i8++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(e66Var.b).getCurrentTime()) {
                                        if (e66Var.a() && (S = LaunchActivity.S()) != null && S.getContext() != null) {
                                            e66Var.c();
                                            a55.q(e66Var.a, e66Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, S.getResourceProvider(), new w56(e66Var, str7, (byte) 3));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i18 = this.b;
                        if (i18 < 10) {
                            l77 l77Var = new l77((Object) e66Var, (Object) str5, (Object) str6, (Object) str7, i18, (byte) 19);
                            e66Var.i = l77Var;
                            hl.d3(l77Var, 500L);
                            break;
                        } else {
                            e66Var.c();
                            if (e66Var.a()) {
                                d31.c0(ob6.M0(2131742624, null));
                                break;
                            }
                        }
                    }
                } else {
                    e66Var.c();
                    break;
                }
                break;
            case 3:
                icc iccVar = (icc) obj4;
                vj0 vj0Var = (vj0) obj3;
                Context context2 = (Context) obj6;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((id) obj5).dismiss();
                if (tL_error3 != null) {
                    iccVar.a(null, tL_error3.text);
                    break;
                } else {
                    try {
                        try {
                            vj0Var.c(context2, new t13(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new pz7(new pn1(iccVar, context2, i7, b2)));
                            break;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            hl.c3(new h25(iccVar, e2, (byte) 2));
                            return;
                        }
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        iccVar.a(null, e3.getMessage());
                        return;
                    }
                }
            default:
                c51 c51Var3 = (c51) obj6;
                nx0 nx0Var = (nx0) obj5;
                View view = (View) obj4;
                am2 am2Var = (am2) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                c51Var3.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    FrameLayout frameLayout = nx0Var.F;
                    if (tL_error4 != null) {
                        ik8.u(frameLayout, nx0Var.J0, tL_error4, false);
                        break;
                    } else {
                        new d31(frameLayout, nx0Var.J0).f0("NO_TOKEN", false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new d31(nx0Var.F, nx0Var.J0).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i7).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
                        StringBuilder p = bs2.p("wear-auth: sending /token account=", i7, " dcId=", currentDatacenterId, " isTest=");
                        p.append(isTestBackend);
                        cc4.b(p.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] a = nwc.a(am2Var, queryParameter, currentDatacenterId, isTestBackend);
                            qa4 qa4Var = new qa4(applicationContext, g05.c);
                            String str8 = (String) am2Var.e;
                            o6d o6dVar = qa4Var.i;
                            g5e g5eVar = new g5e(o6dVar, str8, "/tg-wear-auth/token", a);
                            o6dVar.b.d(0, g5eVar);
                            pgd.a(g5eVar, qf5.f).addOnSuccessListener(new yw9(am2Var, c51Var3, (byte) 27)).addOnFailureListener(new lwc(c51Var3, b3));
                            nx0Var.dismiss();
                            break;
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                            new d31(nx0Var.F, nx0Var.J0).f0(e4.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ g45(c51 c51Var, nx0 nx0Var, int i, View view, am2 am2Var) {
        this.c = c51Var;
        this.d = nx0Var;
        this.b = i;
        this.e = view;
        this.f = am2Var;
    }

    public /* synthetic */ g45(e66 e66Var, String str, String str2, String str3, int i) {
        this.c = e66Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i;
    }

    public /* synthetic */ g45(Context context, int i, c cVar, vnb vnbVar, w56 w56Var) {
        this.c = context;
        this.b = i;
        this.d = cVar;
        this.e = vnbVar;
        this.f = w56Var;
    }

    public /* synthetic */ g45(LaunchActivity launchActivity, l01 l01Var, uc7 uc7Var, int i, TLRPC.User user) {
        this.c = launchActivity;
        this.d = l01Var;
        this.e = uc7Var;
        this.b = i;
        this.f = user;
    }
}
