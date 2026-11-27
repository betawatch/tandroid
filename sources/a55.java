// default package

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class a55 {
    public final int a;
    public final c b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public w45 g;
    public boolean h;

    public a55(c cVar) {
        this.e = -1;
        int i = cVar.a;
        this.a = i;
        this.b = cVar;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new ic((byte) 0), new yt4((Object) this, (byte) 7));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return ob6.M0(2131742603, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Type inference failed for: r2v27, types: [c45, fn7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jl7 D(Context context, final int i, final v45 v45Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final vnb vnbVar, final o45 o45Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String J0;
        String M0;
        frc frcVar;
        boolean isAttachedToWindow;
        int i2;
        TextView textView;
        c cVar;
        final c C = c.C(i);
        boolean z2 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z2 ? null : v45Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView k = qd4.k(context, R.drawable.ic_ab_close);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M = yob.M(i3);
        k.setBackground(f0);
        yob.j(k, f0, null, M, vnbVar);
        int i4 = aob.G6;
        yob.s(k, i4, vnbVar, PorterDuff.Mode.SRC_IN);
        iye.a(k);
        frameLayout.addView(k, tre.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(38.0f));
        if (z2) {
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.q(tL_urlAuthResultRequest.bot);
            de0Var.f(tL_urlAuthResultRequest.bot, rb0Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z = z2;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                de0Var.p(jn5.p(jxc.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(de0Var, tre.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                j.addView(frameLayout, tre.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(hl.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(ob6.V(null, null, 2131742811, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(ob6.M0(2131742810, null));
                    }
                } else {
                    textView2.setText(ob6.V(null, null, 2131742811, lbc.r(tL_urlAuthResultRequest.bot)));
                }
                yob.X(textView2, i4, vnbVar);
                j.addView(textView2, tre.t(-2, -2, 49, 36, 16, 36, 0));
                J0 = !z ? tL_urlAuthResultRequest.domain : hl.J0(v45Var.b, false);
                if (!TextUtils.isEmpty(J0)) {
                    j.addView(g(context, J0, vnbVar), tre.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z) {
                    C.g.getClass();
                    if (!w(v45Var)) {
                        M0 = ob6.M0(2131742814, null);
                        textView3.setText(M0);
                        yob.X(textView3, i4, vnbVar);
                        j.addView(textView3, tre.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        j.addView(frameLayout2, tre.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        frcVar = new frc(context, R.drawable.wallet_card_qr, 46);
                        frcVar.l(C);
                        isAttachedToWindow = frcVar.isAttachedToWindow();
                        i2 = jn7.d4;
                        if (isAttachedToWindow || (cVar = frcVar.a0) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i5 = frcVar.W;
                            if (i5 != i || cVar != C) {
                                jn7.f(i5).n(frcVar, i2);
                            }
                        }
                        frcVar.W = i;
                        frcVar.a0 = C;
                        if (frcVar.isAttachedToWindow() && frcVar.a0 != null) {
                            jn7.f(i).b(frcVar, i2);
                        }
                        frameLayout2.addView(frcVar);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        uh9.q(textView4, 17, null, 2131742813);
                        yob.X(textView4, aob.z6, vnbVar);
                        j.addView(textView4, tre.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                        j.addView(linearLayout, tre.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final c51 c51Var = new c51(vnbVar, context, true);
                        c51Var.setRoundRadius(24);
                        c51Var.e();
                        c51Var.setText(ob6.M0(2131742830, null));
                        linearLayout.addView(c51Var, tre.m(1.0f, 0, 44, 0, 6, 0));
                        final c51 i6 = xnb.i(24, vnbVar, context, true);
                        i6.setText(ob6.M0(2131742815, null));
                        linearLayout.addView(i6, tre.m(1.0f, 0, 44, 6, 0, 0));
                        final jl7 jl7Var = new jl7(context, j, vnbVar);
                        jl7Var.z0 = new t45(i6);
                        final boolean z3 = z;
                        final oq6 oq6Var = new oq6(z3, i6, C, tonconnectsession, v45Var, textView2, de0Var, textView);
                        final ?? r2 = new fn7() { // from class: c45
                            @Override // fn7
                            public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                                if (!z3 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            v45Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                oq6Var.run();
                            }
                        };
                        jn7.f(i).a(r2, i2);
                        oq6Var.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        jl7Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: d45
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                jn7.f(i).n(r2, jn7.d4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z3 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    o45Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        jl7Var.show();
                        k.setOnClickListener(new e45(jl7Var, (byte) 0));
                        c51Var.setOnClickListener(new je3(i6, jl7Var, (byte) 21));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        i6.setOnClickListener(new View.OnClickListener() { // from class: f45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                c cVar2 = C;
                                a55 a55Var = cVar2.g;
                                c51 c51Var2 = c51.this;
                                if (c51Var2.R) {
                                    return;
                                }
                                c51Var2.setLoading(true);
                                c51 c51Var3 = c51Var;
                                c51Var3.setEnabled(false);
                                ImageView imageView = k;
                                imageView.setEnabled(false);
                                o45 o45Var2 = new o45(c51Var2, c51Var3, imageView, jl7Var, vnbVar, oq6Var, (byte) 0);
                                if (!z3) {
                                    a55Var.getClass();
                                    hl.c3(new re4((Object) a55Var, (Object) v45Var, (Object) o45Var2, (byte) 19));
                                    return;
                                }
                                String x = cVar2.x();
                                byte[] D = cVar2.D();
                                byte[] bArr = D == null ? null : (byte[]) D.clone();
                                qe2 qe2Var = new qe2((Object) inputtonconnectoauthsessionArr4, (Object) o45Var2, (byte) 22);
                                a55Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                                    qe2Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = c00.k(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    a55Var.f.sendRequestTyped(tonconnectcreatesession, new ic((byte) 0), new a45(a55Var, (Object) qe2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                                } catch (JSONException e) {
                                    qe2Var.a(null, a55.h("prepare OAuth request", e));
                                }
                            }
                        });
                        return jl7Var;
                    }
                }
                M0 = ob6.M0(2131742812, null);
                textView3.setText(M0);
                yob.X(textView3, i4, vnbVar);
                j.addView(textView3, tre.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                j.addView(frameLayout22, tre.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                frcVar = new frc(context, R.drawable.wallet_card_qr, 46);
                frcVar.l(C);
                isAttachedToWindow = frcVar.isAttachedToWindow();
                i2 = jn7.d4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                frcVar.W = i;
                frcVar.a0 = C;
                if (frcVar.isAttachedToWindow()) {
                    jn7.f(i).b(frcVar, i2);
                }
                frameLayout22.addView(frcVar);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                uh9.q(textView42, 17, null, 2131742813);
                yob.X(textView42, aob.z6, vnbVar);
                j.addView(textView42, tre.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                j.addView(linearLayout2, tre.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final c51 c51Var2 = new c51(vnbVar, context, true);
                c51Var2.setRoundRadius(24);
                c51Var2.e();
                c51Var2.setText(ob6.M0(2131742830, null));
                linearLayout2.addView(c51Var2, tre.m(1.0f, 0, 44, 0, 6, 0));
                final c51 i62 = xnb.i(24, vnbVar, context, true);
                i62.setText(ob6.M0(2131742815, null));
                linearLayout2.addView(i62, tre.m(1.0f, 0, 44, 6, 0, 0));
                final jl7 jl7Var2 = new jl7(context, j, vnbVar);
                jl7Var2.z0 = new t45(i62);
                final boolean z32 = z;
                final oq6 oq6Var2 = new oq6(z32, i62, C, tonconnectsession, v45Var, textView2, de0Var, textView);
                final c45 r22 = new fn7() { // from class: c45
                    @Override // fn7
                    public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                        if (!z32 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    v45Var.e = tonconnectsession2;
                                }
                            }
                        }
                        oq6Var2.run();
                    }
                };
                jn7.f(i).a(r22, i2);
                oq6Var2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                jl7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: d45
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        jn7.f(i).n(r22, jn7.d4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z32 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            o45Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                jl7Var2.show();
                k.setOnClickListener(new e45(jl7Var2, (byte) 0));
                c51Var2.setOnClickListener(new je3(i62, jl7Var2, (byte) 21));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                i62.setOnClickListener(new View.OnClickListener() { // from class: f45
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c cVar2 = C;
                        a55 a55Var = cVar2.g;
                        c51 c51Var22 = c51.this;
                        if (c51Var22.R) {
                            return;
                        }
                        c51Var22.setLoading(true);
                        c51 c51Var3 = c51Var2;
                        c51Var3.setEnabled(false);
                        ImageView imageView = k;
                        imageView.setEnabled(false);
                        o45 o45Var2 = new o45(c51Var22, c51Var3, imageView, jl7Var2, vnbVar, oq6Var2, (byte) 0);
                        if (!z32) {
                            a55Var.getClass();
                            hl.c3(new re4((Object) a55Var, (Object) v45Var, (Object) o45Var2, (byte) 19));
                            return;
                        }
                        String x = cVar2.x();
                        byte[] D = cVar2.D();
                        byte[] bArr = D == null ? null : (byte[]) D.clone();
                        qe2 qe2Var = new qe2((Object) inputtonconnectoauthsessionArr42, (Object) o45Var2, (byte) 22);
                        a55Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                            qe2Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = c00.k(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            a55Var.f.sendRequestTyped(tonconnectcreatesession, new ic((byte) 0), new a45(a55Var, (Object) qe2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                        } catch (JSONException e) {
                            qe2Var.a(null, a55.h("prepare OAuth request", e));
                        }
                    }
                });
                return jl7Var2;
            }
        }
        z = z2;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(de0Var, tre.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        j.addView(frameLayout, tre.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(hl.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z) {
        }
        yob.X(textView22, i4, vnbVar);
        j.addView(textView22, tre.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z) {
        }
        if (!TextUtils.isEmpty(J0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z) {
        }
        M0 = ob6.M0(2131742812, null);
        textView32.setText(M0);
        yob.X(textView32, i4, vnbVar);
        j.addView(textView32, tre.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        j.addView(frameLayout222, tre.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        frcVar = new frc(context, R.drawable.wallet_card_qr, 46);
        frcVar.l(C);
        isAttachedToWindow = frcVar.isAttachedToWindow();
        i2 = jn7.d4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        frcVar.W = i;
        frcVar.a0 = C;
        if (frcVar.isAttachedToWindow()) {
        }
        frameLayout222.addView(frcVar);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        uh9.q(textView422, 17, null, 2131742813);
        yob.X(textView422, aob.z6, vnbVar);
        j.addView(textView422, tre.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        j.addView(linearLayout22, tre.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final c51 c51Var22 = new c51(vnbVar, context, true);
        c51Var22.setRoundRadius(24);
        c51Var22.e();
        c51Var22.setText(ob6.M0(2131742830, null));
        linearLayout22.addView(c51Var22, tre.m(1.0f, 0, 44, 0, 6, 0));
        final c51 i622 = xnb.i(24, vnbVar, context, true);
        i622.setText(ob6.M0(2131742815, null));
        linearLayout22.addView(i622, tre.m(1.0f, 0, 44, 6, 0, 0));
        final jl7 jl7Var22 = new jl7(context, j, vnbVar);
        jl7Var22.z0 = new t45(i622);
        final boolean z322 = z;
        final oq6 oq6Var22 = new oq6(z322, i622, C, tonconnectsession, v45Var, textView22, de0Var, textView);
        final c45 r222 = new fn7() { // from class: c45
            @Override // fn7
            public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                if (!z322 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            v45Var.e = tonconnectsession2;
                        }
                    }
                }
                oq6Var22.run();
            }
        };
        jn7.f(i).a(r222, i2);
        oq6Var22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        jl7Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: d45
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                jn7.f(i).n(r222, jn7.d4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z322 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    o45Var.a(inputtonconnectoauthsession);
                }
            }
        });
        jl7Var22.show();
        k.setOnClickListener(new e45(jl7Var22, (byte) 0));
        c51Var22.setOnClickListener(new je3(i622, jl7Var22, (byte) 21));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        i622.setOnClickListener(new View.OnClickListener() { // from class: f45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar2 = C;
                a55 a55Var = cVar2.g;
                c51 c51Var222 = c51.this;
                if (c51Var222.R) {
                    return;
                }
                c51Var222.setLoading(true);
                c51 c51Var3 = c51Var22;
                c51Var3.setEnabled(false);
                ImageView imageView = k;
                imageView.setEnabled(false);
                o45 o45Var2 = new o45(c51Var222, c51Var3, imageView, jl7Var22, vnbVar, oq6Var22, (byte) 0);
                if (!z322) {
                    a55Var.getClass();
                    hl.c3(new re4((Object) a55Var, (Object) v45Var, (Object) o45Var2, (byte) 19));
                    return;
                }
                String x = cVar2.x();
                byte[] D = cVar2.D();
                byte[] bArr = D == null ? null : (byte[]) D.clone();
                qe2 qe2Var = new qe2((Object) inputtonconnectoauthsessionArr422, (Object) o45Var2, (byte) 22);
                a55Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                    qe2Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = c00.k(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    a55Var.f.sendRequestTyped(tonconnectcreatesession, new ic((byte) 0), new a45(a55Var, (Object) qe2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                } catch (JSONException e) {
                    qe2Var.a(null, a55.h("prepare OAuth request", e));
                }
            }
        });
        return jl7Var22;
    }

    public static LinearLayout F(Context context, String str, vnb vnbVar) {
        LinearLayout j = uh9.j(context, 1);
        int L = hl.L(16.0f);
        int i = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        j.setBackground(b0);
        yob.j(j, b0, M, null, vnbVar);
        mf5 mf5Var = new mf5(context, vnbVar);
        mf5Var.setText(str);
        j.addView(mf5Var, tre.o(-1, -2));
        return j;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        switch (x(TeXSymbolParser.TYPE_ATTR, jSONObject)) {
            case "binary":
                String x = x("bytes", jSONObject);
                if (!x.matches("[A-Za-z0-9+/]*={0,2}") || !Base64.encodeToString(Base64.decode(x, 2), 2).replace("=", "").equals(x.replace("=", ""))) {
                    lq5.j("Invalid base64 data");
                    break;
                }
                break;
            case "cell":
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    lq5.j("Invalid data cell");
                    break;
                }
                break;
            case "text":
                x("text", jSONObject);
                break;
            default:
                lq5.j("Unknown signing data type");
                break;
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            lq5.j("Wrong network");
        } else {
            if (!jSONObject.has("from") || WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
                return;
            }
            lq5.j("Wrong signer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() <= 4294967295L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(JSONObject jSONObject, String str, int i) {
        H(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i) {
                    }
                }
            }
            lq5.j("Invalid or expired transaction");
            return;
        }
        if (jSONObject.has("items")) {
            lq5.j("Structured transactions are not supported");
            return;
        }
        long optLong = jSONObject.optLong("valid_until", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j = 0;
        while (i2 < jSONArray.length()) {
            y45 y45Var = new y45(jSONArray.getJSONObject(i2));
            long j2 = y45Var.e;
            long j3 = j + j2;
            if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(y45Var);
            i2++;
            j = j3;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static SpannableStringBuilder a(long j) {
        String s = c.s(j, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s);
        int indexOf = s.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        wm2 wm2Var = new wm2(R.drawable.wallet_gram_small, 2);
        wm2Var.d = false;
        wm2Var.c(hl.L(16.0f));
        spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout b(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, vnb vnbVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(hl.L(12.0f), hl.L(5.0f), hl.L(12.0f), hl.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.mini_gram_24);
        imageView.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        linearLayout.addView(imageView, tre.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(48);
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 16.0f);
        int i = aob.G6;
        yob.X(textView, i, vnbVar);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams o = tre.o(-1, -2);
        o.weight = 0.0f;
        linearLayout2.addView(textView, o);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            yob.X(textView2, aob.z6, vnbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, tre.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            t37 t37Var = new t37(0, false, false, null);
            t37Var.x = false;
            t37Var.w = Integer.valueOf(aob.v0(aob.am, vnbVar));
            textView3.setBackground(t37Var);
            textView3.setPadding(hl.L(19.0f), hl.L(9.0f), hl.L(15.0f), hl.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            yob.X(textView3, i, vnbVar);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, tre.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, tre.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(hl.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i = aob.lk;
            }
            yob.X(textView4, i, vnbVar);
            linearLayout.addView(textView4, tre.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i) {
        if (tonconnectsession.client_id == null) {
            lq5.j("Missing registered session key");
            return null;
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
        Object obj = jSONObject.get("id");
        if (!(obj instanceof String) || !((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
            lq5.j("Request ID must contain 1–100 printable ASCII characters");
            return null;
        }
        try {
            String string = jSONObject.getString("method");
            JSONArray jSONArray = jSONObject.getJSONArray("params");
            if ("disconnect".equals(string)) {
                if (jSONArray.length() != 0) {
                    throw new IllegalArgumentException("Disconnect takes no parameters");
                }
            } else if ("sendTransaction".equals(string) || "signMessage".equals(string)) {
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON transaction parameter");
                }
                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                I(jSONObject2, str, i);
                jSONObject.put("transaction", jSONObject2);
            } else if (!"signData".equals(string)) {
                jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
            } else {
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON data parameter");
                }
                JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                G(str, jSONObject3);
                jSONObject.put("data", jSONObject3);
            }
        } catch (Exception e) {
            jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView g(Context context, String str, vnb vnbVar) {
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 14.0f);
        yob.X(textView, aob.Fi, vnbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        cc4.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new wm2(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) c.s(-j, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j, long j2) {
        StringBuilder o = ik8.o(j, "tonconnect_reply.", ".");
        o.append(j2);
        return o.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            cc4.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        lq5.j("Manifest URL must use HTTPS and include a host");
        return null;
    }

    public static void q(Context context, int i, long j, int i2, vnb vnbVar, w56 w56Var) {
        c C = c.C(i);
        a55 a55Var = C.g;
        g45 g45Var = new g45(context, i, C, vnbVar, w56Var);
        if (a55Var.h || a55Var.g != null) {
            g45Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = uc7.s1(a55Var.a).X3.getString(k(j, i2), null);
        if (string == null) {
            a55Var.h = true;
            a55Var.b.A0(new r77((Object) a55Var, j, (Object) g45Var, i2, (byte) 6));
            return;
        }
        a55Var.h = true;
        v35 v35Var = new v35(a55Var, g45Var, (byte) 2);
        try {
            a55Var.E(j, i2, new JSONObject(string), v35Var);
        } catch (Exception e) {
            v35Var.a(h("restore response", e));
        }
    }

    public static x45 r(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            lq5.j("Manifest URL changed");
            return null;
        }
        String n = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null && n.equals(n(tonconnectmanifest.url))) {
            return s(c35Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n, str4, tonconnectchallenge, i);
        }
        lq5.j("Manifest domain does not match the connection request");
        return null;
    }

    public static x45 s(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject;
        String str4;
        int i2;
        String str5;
        String str6;
        c35 c35Var2 = c35Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() == 0) {
            lq5.j("Empty connect request");
            return null;
        }
        String str7 = "account";
        JSONObject put = new JSONObject().put("account", tonconnectchallenge != null);
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            String str8 = "ton_proof";
            TL_wallet.walletOwnershipProof walletownershipproof = null;
            String str9 = "ton_addr";
            if (i3 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    lq5.j("Missing ton_addr item");
                    return null;
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(c35Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new x45(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    lq5.j("Invalid connect event ID");
                    return null;
                }
                JSONArray jSONArray3 = new JSONArray();
                int i4 = 0;
                while (i4 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str9;
                        i2 = i4;
                        str5 = str7;
                        str6 = str8;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str9;
                        i2 = i4;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(c35Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i));
                        str5 = str7;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i;
                        str6 = str8;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str9;
                        i2 = i4;
                        str5 = str7;
                        str6 = str8;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i4 = i2 + 1;
                    c35Var2 = c35Var;
                    jSONArray2 = jSONArray;
                    str9 = str4;
                    str7 = str5;
                    str8 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", f11.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", jn7.d4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", jn7.d4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                x45 x45Var = new x45(jSONObject6);
                x45Var.d = walletownershipproof;
                return x45Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
            int i5 = i3;
            if (!hashSet.add(jSONObject7.getString("name"))) {
                lq5.j("Duplicate connect item");
                return null;
            }
            if ("ton_addr".equals(jSONObject7.getString("name")) && jSONObject7.has("network") && !"-239".equals(jSONObject7.getString("network"))) {
                lq5.j("Requested network does not match the wallet network");
                return null;
            }
            if ("ton_proof".equals(jSONObject7.getString("name"))) {
                if (str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                    lq5.j("The telegram.org proof domain is reserved for wallet import");
                    return null;
                }
                jSONObject7.getString("payload");
            }
            i3 = i5 + 1;
        }
    }

    public static x45 t(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j) {
        if (j < 0 || tonconnectsession.client_id == null) {
            lq5.j("Invalid disconnect session or event ID");
            return null;
        }
        return new x45(WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j).put("payload", new JSONObject()))));
    }

    public static TextView v(Context context, CharSequence charSequence, int i, vnb vnbVar) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i);
        yob.X(textView, aob.G6, vnbVar);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(v45 v45Var) {
        if (v45Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(v45Var.a).getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                h("read proof request", e);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        lq5.j(str.concat(" must be a string"));
        return null;
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder p = ik8.p("[gram-wallet] TON Connect ", str, ": ");
        p.append(tL_error == null ? "" : uh9.l(new StringBuilder("code="), tL_error.code, " "));
        p.append(str2);
        cc4.d(p.toString());
        return str2;
    }

    public final boolean A(w45 w45Var) {
        if (w45Var.q) {
            return false;
        }
        String str = w45Var.h;
        c cVar = this.b;
        return Objects.equals(str, cVar.x()) && Arrays.equals(w45Var.g, cVar.D());
    }

    public final void B(w45 w45Var, c35 c35Var, pcc pccVar) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(w45Var);
            int i = w45Var.b;
            TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
            if (A && !i(w45Var)) {
                String string = uc7.s1(this.a).X3.getString(k(tonconnectsession.id, i).concat(".transfer"), null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(c35Var, w45Var.f, "ton-connect:" + tonconnectsession.id + ":" + i, new nu0((Object) this, (Object) w45Var, (Object) c35Var, (Object) pccVar, (byte) 9));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new ic((byte) 0), new pm1(this, pccVar, w45Var, c35Var, sendtransfer, (byte) 6));
                    return;
                } catch (Exception e) {
                    pccVar.a(h("restore transfer", e));
                    return;
                }
            }
        }
        y(w45Var, c35Var, null, 0, "Wallet unavailable or request expired", pccVar);
    }

    public final void E(long j, int i, JSONObject jSONObject, pcc pccVar) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j;
        tonconnectsubmitresponse.msg_id = i;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new ic((byte) 0), new ng(this, pccVar, jSONObject, j, i));
    }

    public final boolean c(v45 v45Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = v45Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(v45Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = v45Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(v45Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        c cVar = this.b;
        return str.equals(cVar.x()) && Arrays.equals(bArr, cVar.D());
    }

    public final void d(int i, long j, pcc pccVar) {
        long j2 = i;
        uc7.s1(this.a).X3.edit().remove(k(j, j2)).remove(k(j, j2).concat(".transfer")).apply();
        w45 w45Var = this.g;
        if (w45Var != null && w45Var.a.id == j && w45Var.b == i) {
            w45Var.n = true;
        }
        pccVar.a(null);
    }

    public final void e(w45 w45Var, boolean z, pcc pccVar) {
        boolean z2 = w45Var.m;
        TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
        if (z2) {
            return;
        }
        if (w45Var.n || i(w45Var) || !A(w45Var) || !(z || w45Var.l >= 0 || "disconnect".equals(w45Var.e) || w45Var.p)) {
            pccVar.a("Request expired, was processed, or the wallet changed");
            return;
        }
        w45Var.m = true;
        gt gtVar = new gt(this, w45Var, pccVar, (byte) 22);
        String string = uc7.s1(this.a).X3.getString(k(tonconnectsession.id, w45Var.b), null);
        if (string == null) {
            this.b.E(true, false, false, new o25(this, gtVar, w45Var, z, (byte) 1));
            return;
        }
        try {
            try {
                E(tonconnectsession.id, w45Var.b, new JSONObject(string), gtVar);
            } catch (Exception e) {
                e = e;
                gtVar = gtVar;
                gtVar.a(h("restore response", e));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final boolean i(w45 w45Var) {
        long currentTime = this.f.getCurrentTime();
        if (w45Var.c <= currentTime) {
            return true;
        }
        z45 z45Var = w45Var.f;
        if (z45Var == null) {
            return false;
        }
        long j = z45Var.a;
        return j != 0 && j <= currentTime;
    }

    public final /* synthetic */ void l(TL_wallet.tonConnectSession tonconnectsession, String str, m62 m62Var) {
        if (this.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(this.d, new b45(tonconnectsession, (byte) 1));
                this.b.T();
            }
            m62Var.a(str);
        }
    }

    public final void o(int i, long j) {
        w45 w45Var = this.g;
        if (w45Var == null || w45Var.a.id != j || w45Var.b != i || w45Var.m) {
            return;
        }
        w45Var.n = true;
        Runnable runnable = w45Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        b45 b45Var = new b45(tonconnectsession, (byte) 0);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, b45Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        w45 w45Var = this.g;
        if (w45Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = w45Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                w45Var.q = true;
                o(w45Var.b, tonconnectsession.id);
            }
        }
        jn7.f(this.a).k(jn7.d4, this.b, tonconnectsession);
    }

    public final void u(w45 w45Var) {
        w45Var.r = null;
        if (w45Var.m || this.g != w45Var) {
            return;
        }
        this.g = null;
    }

    public final void y(w45 w45Var, c35 c35Var, Object obj, int i, String str, pcc pccVar) {
        Utilities.e.c(new st((Object) this, (Object) w45Var, i, obj, (Object) str, (Object) c35Var, (Object) pccVar, (byte) 6));
    }
}
