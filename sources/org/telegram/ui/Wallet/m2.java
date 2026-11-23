package org.telegram.ui.Wallet;

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
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kq;
import org.telegram.ui.a31;
import org.telegram.ui.ig0;
import org.telegram.ui.k90;
import org.telegram.ui.m60;
import org.telegram.ui.ne;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m2 {
    public final int a;
    public final v0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public i2 g;
    public boolean h;

    public m2(v0 v0Var) {
        this.e = -1;
        int i7 = v0Var.a;
        this.a = i7;
        this.b = v0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new e(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return gd.N0(2131742701, null);
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
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.fs, org.telegram.ui.Wallet.y1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f3 D(Context context, final int i7, final h2 h2Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.i6 i6Var, final t60 t60Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z10;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String K0;
        String N0;
        y6 y6Var;
        boolean isAttachedToWindow;
        int i10;
        TextView textView;
        v0 v0Var;
        final v0 D = v0.D(i7);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : h2Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView e10 = m10.e(context, R.drawable.ic_ab_close);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        e10.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(e10, h02, null, M, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(e10, i12, i6Var, PorterDuff.Mode.SRC_IN);
        c8.sa.a(e10);
        frameLayout.addView(e10, c8.na.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        if (z11) {
            org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            a9Var.r(tL_urlAuthResultRequest.bot);
            p9Var.f(tL_urlAuthResultRequest.bot, a9Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z10 = z11;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                p9Var.p(fc.p(g20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(p9Var, c8.na.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                g10.addView(frameLayout, c8.na.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z10) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(gd.V(null, null, 2131742909, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(gd.N0(2131742908, null));
                    }
                } else {
                    textView2.setText(gd.V(null, null, 2131742909, n10.q(tL_urlAuthResultRequest.bot)));
                }
                org.telegram.ui.ActionBar.u6.U(textView2, i12, i6Var);
                g10.addView(textView2, c8.na.t(-2, -2, 49, 36, 16, 36, 0));
                K0 = !z10 ? tL_urlAuthResultRequest.domain : org.telegram.messenger.g0.K0(h2Var.b, false);
                if (!TextUtils.isEmpty(K0)) {
                    g10.addView(h(context, K0, i6Var), c8.na.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z10) {
                    D.g.getClass();
                    if (!w(h2Var)) {
                        N0 = gd.N0(2131742912, null);
                        textView3.setText(N0);
                        org.telegram.ui.ActionBar.u6.U(textView3, i12, i6Var);
                        g10.addView(textView3, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        g10.addView(frameLayout2, c8.na.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        y6Var = new y6(context, R.drawable.wallet_card_qr, 46);
                        y6Var.l(D);
                        isAttachedToWindow = y6Var.isAttachedToWindow();
                        i10 = ks.d4;
                        if (isAttachedToWindow || (v0Var = y6Var.a0) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i13 = y6Var.W;
                            if (i13 != i7 || v0Var != D) {
                                ks.f(i13).n(y6Var, i10);
                            }
                        }
                        y6Var.W = i7;
                        y6Var.a0 = D;
                        if (y6Var.isAttachedToWindow() && y6Var.a0 != null) {
                            ks.f(i7).c(y6Var, i10);
                        }
                        frameLayout2.addView(y6Var);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.messenger.f3.k(textView4, 17, null, 2131742911);
                        org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.z6, i6Var);
                        g10.addView(textView4, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                        g10.addView(linearLayout, c8.na.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final hi.e eVar = new hi.e(context, i6Var, true);
                        eVar.setRoundRadius(24);
                        eVar.e();
                        eVar.setText(gd.N0(2131742928, null));
                        linearLayout.addView(eVar, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                        final hi.e g11 = m10.g(24, context, i6Var, true);
                        g11.setText(gd.N0(2131742913, null));
                        linearLayout.addView(g11, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                        final f3 f3Var = new f3(context, g10, i6Var);
                        f3Var.z0 = new f2(g11);
                        final boolean z12 = z10;
                        final jg.w0 w0Var = new jg.w0(z12, g11, D, tonconnectsession, h2Var, textView2, p9Var, textView);
                        final ?? r22 = new fs() { // from class: org.telegram.ui.Wallet.y1
                            @Override // org.telegram.messenger.fs
                            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            h2Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                w0Var.run();
                            }
                        };
                        ks.f(i7).b(r22, i10);
                        w0Var.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        f3Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.z1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                ks.f(i7).n(r22, ks.d4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z12 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    t60Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        f3Var.show();
                        e10.setOnClickListener(new a2(f3Var, 0));
                        eVar.setOnClickListener(new ig0(19, g11, f3Var));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b2
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v1 */
                            /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
                            /* JADX WARN: Type inference failed for: r5v3 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                v0 v0Var2 = D;
                                m2 m2Var = v0Var2.g;
                                hi.e eVar2 = hi.e.this;
                                if (eVar2.R) {
                                    return;
                                }
                                eVar2.setLoading(true);
                                hi.e eVar3 = eVar;
                                eVar3.setEnabled(false);
                                ImageView imageView = e10;
                                imageView.setEnabled(false);
                                t60 t60Var2 = new t60(eVar2, eVar3, imageView, f3Var, i6Var, w0Var, 4);
                                if (!z12) {
                                    m2Var.getClass();
                                    org.telegram.messenger.g0.g3(new p(m2Var, h2Var, t60Var2, 7));
                                    return;
                                }
                                String y10 = v0Var2.y();
                                byte[] E = v0Var2.E();
                                ?? r52 = E == null ? 0 : (byte[]) E.clone();
                                f0 f0Var = new f0(3, inputtonconnectoauthsessionArr4, t60Var2);
                                m2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                                    f0Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    m2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(m2Var, f0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                                } catch (JSONException e11) {
                                    f0Var.a(null, m2.i("prepare OAuth request", e11));
                                }
                            }
                        });
                        return f3Var;
                    }
                }
                N0 = gd.N0(2131742910, null);
                textView3.setText(N0);
                org.telegram.ui.ActionBar.u6.U(textView3, i12, i6Var);
                g10.addView(textView3, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                g10.addView(frameLayout22, c8.na.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                y6Var = new y6(context, R.drawable.wallet_card_qr, 46);
                y6Var.l(D);
                isAttachedToWindow = y6Var.isAttachedToWindow();
                i10 = ks.d4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                y6Var.W = i7;
                y6Var.a0 = D;
                if (y6Var.isAttachedToWindow()) {
                    ks.f(i7).c(y6Var, i10);
                }
                frameLayout22.addView(y6Var);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                org.telegram.messenger.f3.k(textView42, 17, null, 2131742911);
                org.telegram.ui.ActionBar.u6.U(textView42, org.telegram.ui.ActionBar.n6.z6, i6Var);
                g10.addView(textView42, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                g10.addView(linearLayout2, c8.na.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final hi.e eVar2 = new hi.e(context, i6Var, true);
                eVar2.setRoundRadius(24);
                eVar2.e();
                eVar2.setText(gd.N0(2131742928, null));
                linearLayout2.addView(eVar2, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                final hi.e g112 = m10.g(24, context, i6Var, true);
                g112.setText(gd.N0(2131742913, null));
                linearLayout2.addView(g112, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                final f3 f3Var2 = new f3(context, g10, i6Var);
                f3Var2.z0 = new f2(g112);
                final boolean z122 = z10;
                final jg.w0 w0Var2 = new jg.w0(z122, g112, D, tonconnectsession, h2Var, textView2, p9Var, textView);
                final y1 r222 = new fs() { // from class: org.telegram.ui.Wallet.y1
                    @Override // org.telegram.messenger.fs
                    public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    h2Var.e = tonconnectsession2;
                                }
                            }
                        }
                        w0Var2.run();
                    }
                };
                ks.f(i7).b(r222, i10);
                w0Var2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                f3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.z1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        ks.f(i7).n(r222, ks.d4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z122 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            t60Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                f3Var2.show();
                e10.setOnClickListener(new a2(f3Var2, 0));
                eVar2.setOnClickListener(new ig0(19, g112, f3Var2));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                g112.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v1 */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r5v3 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        v0 v0Var2 = D;
                        m2 m2Var = v0Var2.g;
                        hi.e eVar22 = hi.e.this;
                        if (eVar22.R) {
                            return;
                        }
                        eVar22.setLoading(true);
                        hi.e eVar3 = eVar2;
                        eVar3.setEnabled(false);
                        ImageView imageView = e10;
                        imageView.setEnabled(false);
                        t60 t60Var2 = new t60(eVar22, eVar3, imageView, f3Var2, i6Var, w0Var2, 4);
                        if (!z122) {
                            m2Var.getClass();
                            org.telegram.messenger.g0.g3(new p(m2Var, h2Var, t60Var2, 7));
                            return;
                        }
                        String y10 = v0Var2.y();
                        byte[] E = v0Var2.E();
                        ?? r52 = E == null ? 0 : (byte[]) E.clone();
                        f0 f0Var = new f0(3, inputtonconnectoauthsessionArr42, t60Var2);
                        m2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                            f0Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            m2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(m2Var, f0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                        } catch (JSONException e11) {
                            f0Var.a(null, m2.i("prepare OAuth request", e11));
                        }
                    }
                });
                return f3Var2;
            }
        }
        z10 = z11;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(p9Var, c8.na.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        g10.addView(frameLayout, c8.na.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z10) {
        }
        org.telegram.ui.ActionBar.u6.U(textView22, i12, i6Var);
        g10.addView(textView22, c8.na.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z10) {
        }
        if (!TextUtils.isEmpty(K0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z10) {
        }
        N0 = gd.N0(2131742910, null);
        textView32.setText(N0);
        org.telegram.ui.ActionBar.u6.U(textView32, i12, i6Var);
        g10.addView(textView32, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        g10.addView(frameLayout222, c8.na.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        y6Var = new y6(context, R.drawable.wallet_card_qr, 46);
        y6Var.l(D);
        isAttachedToWindow = y6Var.isAttachedToWindow();
        i10 = ks.d4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        y6Var.W = i7;
        y6Var.a0 = D;
        if (y6Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(y6Var);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView422, 17, null, 2131742911);
        org.telegram.ui.ActionBar.u6.U(textView422, org.telegram.ui.ActionBar.n6.z6, i6Var);
        g10.addView(textView422, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        g10.addView(linearLayout22, c8.na.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final hi.e eVar22 = new hi.e(context, i6Var, true);
        eVar22.setRoundRadius(24);
        eVar22.e();
        eVar22.setText(gd.N0(2131742928, null));
        linearLayout22.addView(eVar22, c8.na.m(1.0f, 0, 44, 0, 6, 0));
        final hi.e g1122 = m10.g(24, context, i6Var, true);
        g1122.setText(gd.N0(2131742913, null));
        linearLayout22.addView(g1122, c8.na.m(1.0f, 0, 44, 6, 0, 0));
        final f3 f3Var22 = new f3(context, g10, i6Var);
        f3Var22.z0 = new f2(g1122);
        final boolean z1222 = z10;
        final jg.w0 w0Var22 = new jg.w0(z1222, g1122, D, tonconnectsession, h2Var, textView22, p9Var, textView);
        final y1 r2222 = new fs() { // from class: org.telegram.ui.Wallet.y1
            @Override // org.telegram.messenger.fs
            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            h2Var.e = tonconnectsession2;
                        }
                    }
                }
                w0Var22.run();
            }
        };
        ks.f(i7).b(r2222, i10);
        w0Var22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        f3Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.z1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                ks.f(i7).n(r2222, ks.d4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z1222 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    t60Var.a(inputtonconnectoauthsession);
                }
            }
        });
        f3Var22.show();
        e10.setOnClickListener(new a2(f3Var22, 0));
        eVar22.setOnClickListener(new ig0(19, g1122, f3Var22));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        g1122.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r5v3 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0 v0Var2 = D;
                m2 m2Var = v0Var2.g;
                hi.e eVar222 = hi.e.this;
                if (eVar222.R) {
                    return;
                }
                eVar222.setLoading(true);
                hi.e eVar3 = eVar22;
                eVar3.setEnabled(false);
                ImageView imageView = e10;
                imageView.setEnabled(false);
                t60 t60Var2 = new t60(eVar222, eVar3, imageView, f3Var22, i6Var, w0Var22, 4);
                if (!z1222) {
                    m2Var.getClass();
                    org.telegram.messenger.g0.g3(new p(m2Var, h2Var, t60Var2, 7));
                    return;
                }
                String y10 = v0Var2.y();
                byte[] E = v0Var2.E();
                ?? r52 = E == null ? 0 : (byte[]) E.clone();
                f0 f0Var = new f0(3, inputtonconnectoauthsessionArr422, t60Var2);
                m2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                    f0Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    m2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(m2Var, f0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                } catch (JSONException e11) {
                    f0Var.a(null, m2.i("prepare OAuth request", e11));
                }
            }
        });
        return f3Var22;
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
        o4Var.setText(str);
        g10.addView(o4Var, c8.na.o(-1, -2));
        return g10;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        switch (x(TeXSymbolParser.TYPE_ATTR, jSONObject)) {
            case "binary":
                String x10 = x("bytes", jSONObject);
                if (!x10.matches("[A-Za-z0-9+/]*={0,2}") || !Base64.encodeToString(Base64.decode(x10, 2), 2).replace("=", "").equals(x10.replace("=", ""))) {
                    throw new IllegalArgumentException("Invalid base64 data");
                }
                return;
            case "cell":
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    throw new IllegalArgumentException("Invalid data cell");
                }
                return;
            case "text":
                x("text", jSONObject);
                return;
            default:
                throw new IllegalArgumentException("Unknown signing data type");
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            throw new IllegalArgumentException("Wrong network");
        }
        if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
            throw new IllegalArgumentException("Wrong signer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() <= 4294967295L) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(JSONObject jSONObject, String str, int i7) {
        H(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i7) {
                    }
                }
            }
            throw new IllegalArgumentException("Invalid or expired transaction");
        }
        if (jSONObject.has("items")) {
            throw new IllegalArgumentException("Structured transactions are not supported");
        }
        long optLong = jSONObject.optLong("valid_until", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        long j3 = 0;
        while (i10 < jSONArray.length()) {
            k2 k2Var = new k2(jSONArray.getJSONObject(i10));
            long j10 = k2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(k2Var);
            i10++;
            j3 = j11;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(m2 m2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (m2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(m2Var.d, new n1(tonconnectsession, 1));
                m2Var.b.T();
            }
            kVar.a(str);
        }
    }

    public static SpannableStringBuilder b(long j3) {
        String t6 = v0.t(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t6);
        int indexOf = t6.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        kq kqVar = new kq(R.drawable.wallet_gram_small, 2);
        kqVar.d = false;
        kqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.mini_gram_24);
        imageView.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(imageView, c8.na.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        m10.p(textView, 1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams r10 = charSequence2 == null ? c8.na.r(-1, org.telegram.messenger.g0.L(24.0f), 16) : c8.na.o(-1, -2);
        r10.weight = 0.0f;
        linearLayout2.addView(textView, r10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, c8.na.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, null);
            u4Var.x = false;
            u4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var));
            textView3.setBackground(u4Var);
            textView3.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, i7, i6Var);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, c8.na.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.na.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i7 = org.telegram.ui.ActionBar.n6.lk;
            }
            org.telegram.ui.ActionBar.u6.U(textView4, i7, i6Var);
            linearLayout.addView(textView4, c8.na.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
        Object obj = jSONObject.get("id");
        if (!(obj instanceof String) || !((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
            throw new IllegalArgumentException("Request ID must contain 1–100 printable ASCII characters");
        }
        try {
            String string = jSONObject.getString("method");
            JSONArray jSONArray = jSONObject.getJSONArray("params");
            if (!"disconnect".equals(string)) {
                if (!"sendTransaction".equals(string) && !"signMessage".equals(string)) {
                    if (!"signData".equals(string)) {
                        jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
                    } else {
                        if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                            throw new IllegalArgumentException("Expected one JSON data parameter");
                        }
                        JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                        G(str, jSONObject2);
                        jSONObject.put("data", jSONObject2);
                    }
                }
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON transaction parameter");
                }
                JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                I(jSONObject3, str, i7);
                jSONObject.put("transaction", jSONObject3);
            } else if (jSONArray.length() != 0) {
                throw new IllegalArgumentException("Disconnect takes no parameters");
            }
        } catch (Exception e10) {
            jSONObject.put("errorCode", 1).put("errorMessage", e10.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        m10.p(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Fi, i6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String i(String str, Exception exc) {
        org.telegram.messenger.a8.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static SpannableStringBuilder k(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new kq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) v0.t(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.N0(2131749340, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j3, long j10) {
        StringBuilder t6 = a8.p0.t(j3, "tonconnect_reply.", ".");
        t6.append(j10);
        return t6.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            org.telegram.messenger.a8.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if (!"https".equalsIgnoreCase(create.getScheme()) || create.getHost() == null) {
            throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
        }
        return create.getHost().toLowerCase(Locale.ROOT);
    }

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, k90 k90Var) {
        v0 D = v0.D(i7);
        m2 m2Var = D.g;
        m60 m60Var = new m60(context, i7, D, i6Var, k90Var);
        if (m2Var.h || m2Var.g != null) {
            m60Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = mp.u1(m2Var.a).h7.getString(l(j3, i10), null);
        if (string == null) {
            m2Var.h = true;
            m2Var.b.x0(new bi.w3(m2Var, j3, m60Var, i10));
            return;
        }
        m2Var.h = true;
        a31 a31Var = new a31(9, m2Var, m60Var);
        try {
            m2Var.E(j3, i10, new JSONObject(string), a31Var);
        } catch (Exception e10) {
            a31Var.a(i("restore response", e10));
        }
    }

    public static j2 r(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String n10 = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !n10.equals(n(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return s(s0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
    }

    public static j2 s(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        s0 s0Var2 = s0Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() == 0) {
            throw new IllegalArgumentException("Empty connect request");
        }
        String str7 = "account";
        JSONObject put = new JSONObject().put("account", tonconnectchallenge != null);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            String str8 = "ton_proof";
            String str9 = "ton_addr";
            if (i11 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    throw new IllegalArgumentException("Missing ton_addr item");
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(s0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new j2(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    throw new IllegalArgumentException("Invalid connect event ID");
                }
                JSONArray jSONArray3 = new JSONArray();
                TL_wallet.walletOwnershipProof walletownershipproof = null;
                int i12 = 0;
                while (i12 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i10 = i12;
                        str5 = str8;
                        str6 = str9;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str7;
                        i10 = i12;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(s0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
                        str5 = str8;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i7;
                        str6 = str9;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i7).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i10 = i12;
                        str5 = str8;
                        str6 = str9;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i12 = i10 + 1;
                    s0Var2 = s0Var;
                    jSONArray2 = jSONArray;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", org.telegram.messenger.s2.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", ks.e4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", ks.e4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                j2 j2Var = new j2(jSONObject6);
                j2Var.d = walletownershipproof;
                return j2Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i11);
            int i13 = i11;
            if (!hashSet.add(jSONObject7.getString("name"))) {
                throw new IllegalArgumentException("Duplicate connect item");
            }
            if ("ton_addr".equals(jSONObject7.getString("name")) && jSONObject7.has("network") && !"-239".equals(jSONObject7.getString("network"))) {
                throw new IllegalArgumentException("Requested network does not match the wallet network");
            }
            if ("ton_proof".equals(jSONObject7.getString("name"))) {
                if (str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                    throw new IllegalArgumentException("The telegram.org proof domain is reserved for wallet import");
                }
                jSONObject7.getString("payload");
            }
            i11 = i13 + 1;
        }
    }

    public static j2 t(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new j2(WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(h2 h2Var) {
        if (h2Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(h2Var.a).getJSONArray("items");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i7).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                i("read proof request", e10);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str.concat(" must be a string"));
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        String n10;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder u10 = a8.p0.u("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            n10 = "";
        } else {
            n10 = a8.p0.n(tL_error.code, " ", new StringBuilder("code="));
        }
        u10.append(n10);
        u10.append(str2);
        org.telegram.messenger.a8.d(u10.toString());
        return str2;
    }

    public final boolean A(i2 i2Var) {
        if (i2Var.q) {
            return false;
        }
        String str = i2Var.h;
        v0 v0Var = this.b;
        return Objects.equals(str, v0Var.y()) && Arrays.equals(i2Var.g, v0Var.E());
    }

    public final void B(i2 i2Var, s0 s0Var, w10 w10Var) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(i2Var);
            int i7 = i2Var.b;
            TL_wallet.tonConnectSession tonconnectsession = i2Var.a;
            if (A && !j(i2Var)) {
                String string = mp.u1(this.a).h7.getString(l(tonconnectsession.id, i7) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(s0Var, i2Var.f, "ton-connect:" + tonconnectsession.id + ":" + i7, new t(this, i2Var, s0Var, w10Var, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(this, w10Var, i2Var, s0Var, sendtransfer, 6));
                    return;
                } catch (Exception e10) {
                    w10Var.a(i("restore transfer", e10));
                    return;
                }
            }
        }
        y(i2Var, s0Var, null, 0, "Wallet unavailable or request expired", w10Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, w10 w10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new bi.z(this, w10Var, jSONObject, j3, i7));
    }

    public final boolean d(h2 h2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = h2Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(h2Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = h2Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(h2Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        v0 v0Var = this.b;
        return str.equals(v0Var.y()) && Arrays.equals(bArr, v0Var.E());
    }

    public final void e(int i7, long j3, w10 w10Var) {
        long j10 = i7;
        mp.u1(this.a).h7.edit().remove(l(j3, j10)).remove(l(j3, j10) + ".transfer").apply();
        i2 i2Var = this.g;
        if (i2Var != null && i2Var.a.id == j3 && i2Var.b == i7) {
            i2Var.n = true;
        }
        w10Var.a(null);
    }

    public final void f(i2 i2Var, boolean z10, w10 w10Var) {
        boolean z11 = i2Var.m;
        TL_wallet.tonConnectSession tonconnectsession = i2Var.a;
        if (z11) {
            return;
        }
        if (i2Var.n || j(i2Var) || !A(i2Var) || !(z10 || i2Var.l >= 0 || "disconnect".equals(i2Var.e) || i2Var.p)) {
            w10Var.a("Request expired, was processed, or the wallet changed");
            return;
        }
        i2Var.m = true;
        o oVar = new o(this, i2Var, w10Var, 3);
        String string = mp.u1(this.a).h7.getString(l(tonconnectsession.id, i2Var.b), null);
        if (string == null) {
            this.b.F(true, false, false, new d0(this, oVar, i2Var, z10, 1));
            return;
        }
        try {
            try {
                E(tonconnectsession.id, i2Var.b, new JSONObject(string), oVar);
            } catch (Exception e10) {
                e = e10;
                oVar = oVar;
                oVar.a(i("restore response", e));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean j(i2 i2Var) {
        long currentTime = this.f.getCurrentTime();
        if (i2Var.c <= currentTime) {
            return true;
        }
        l2 l2Var = i2Var.f;
        if (l2Var == null) {
            return false;
        }
        long j3 = l2Var.a;
        return j3 != 0 && j3 <= currentTime;
    }

    public final void o(int i7, long j3) {
        i2 i2Var = this.g;
        if (i2Var == null || i2Var.a.id != j3 || i2Var.b != i7 || i2Var.m) {
            return;
        }
        i2Var.n = true;
        Runnable runnable = i2Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        n1 n1Var = new n1(tonconnectsession, 0);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, n1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        i2 i2Var = this.g;
        if (i2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = i2Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                i2Var.q = true;
                o(i2Var.b, tonconnectsession.id);
            }
        }
        ks.f(this.a).k(ks.d4, this.b, tonconnectsession);
    }

    public final void u(i2 i2Var) {
        i2Var.r = null;
        if (i2Var.m || this.g != i2Var) {
            return;
        }
        this.g = null;
    }

    public final void y(i2 i2Var, s0 s0Var, Object obj, int i7, String str, w10 w10Var) {
        Utilities.e.c(new bi.i5(this, i2Var, i7, obj, str, s0Var, w10Var));
    }
}
