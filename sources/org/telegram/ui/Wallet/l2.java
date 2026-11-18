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
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.bd0;
import org.telegram.ui.k90;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l2 {
    public final int a;
    public final u0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public h2 g;
    public boolean h;

    public l2(u0 u0Var) {
        this.e = -1;
        int i7 = u0Var.a;
        this.a = i7;
        this.b = u0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new e(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return gd.M0(2131742714, null);
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
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.fs, org.telegram.ui.Wallet.x1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e3 D(Context context, final int i7, final g2 g2Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.i6 i6Var, final t60 t60Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z10;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String K0;
        String M0;
        x6 x6Var;
        boolean isAttachedToWindow;
        int i10;
        TextView textView;
        u0 u0Var;
        final u0 D = u0.D(i7);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : g2Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView e10 = n10.e(context, R.drawable.ic_ab_close);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        e10.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(e10, h02, null, M, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(e10, i12, i6Var, PorterDuff.Mode.SRC_IN);
        c8.ra.a(e10);
        frameLayout.addView(e10, c8.ma.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        if (z11) {
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var.r(tL_urlAuthResultRequest.bot);
            q9Var.f(tL_urlAuthResultRequest.bot, b9Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z10 = z11;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                q9Var.p(fc.p(h20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(q9Var, c8.ma.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                g10.addView(frameLayout, c8.ma.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z10) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(gd.V(null, null, 2131742922, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(gd.M0(2131742921, null));
                    }
                } else {
                    textView2.setText(gd.V(null, null, 2131742922, o10.q(tL_urlAuthResultRequest.bot)));
                }
                org.telegram.ui.ActionBar.u6.U(textView2, i12, i6Var);
                g10.addView(textView2, c8.ma.t(-2, -2, 49, 36, 16, 36, 0));
                K0 = !z10 ? tL_urlAuthResultRequest.domain : org.telegram.messenger.g0.K0(g2Var.b, false);
                if (!TextUtils.isEmpty(K0)) {
                    g10.addView(h(context, K0, i6Var), c8.ma.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z10) {
                    D.g.getClass();
                    if (!w(g2Var)) {
                        M0 = gd.M0(2131742925, null);
                        textView3.setText(M0);
                        org.telegram.ui.ActionBar.u6.U(textView3, i12, i6Var);
                        g10.addView(textView3, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        g10.addView(frameLayout2, c8.ma.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        x6Var = new x6(context, R.drawable.wallet_card_qr, 46);
                        x6Var.l(D);
                        isAttachedToWindow = x6Var.isAttachedToWindow();
                        i10 = ks.c4;
                        if (isAttachedToWindow || (u0Var = x6Var.a0) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i13 = x6Var.W;
                            if (i13 != i7 || u0Var != D) {
                                ks.f(i13).n(x6Var, i10);
                            }
                        }
                        x6Var.W = i7;
                        x6Var.a0 = D;
                        if (x6Var.isAttachedToWindow() && x6Var.a0 != null) {
                            ks.f(i7).c(x6Var, i10);
                        }
                        frameLayout2.addView(x6Var);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.messenger.f3.k(textView4, 17, null, 2131742924);
                        org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.z6, i6Var);
                        g10.addView(textView4, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                        g10.addView(linearLayout, c8.ma.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final hi.d dVar = new hi.d(context, i6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(gd.M0(2131742941, null));
                        linearLayout.addView(dVar, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
                        final hi.d g11 = n10.g(24, context, i6Var, true);
                        g11.setText(gd.M0(2131742926, null));
                        linearLayout.addView(g11, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
                        final e3 e3Var = new e3(context, g10, i6Var);
                        e3Var.z0 = new e2(g11);
                        final boolean z12 = z10;
                        final jg.w0 w0Var = new jg.w0(z12, g11, D, tonconnectsession, g2Var, textView2, q9Var, textView);
                        final ?? r22 = new fs() { // from class: org.telegram.ui.Wallet.x1
                            @Override // org.telegram.messenger.fs
                            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            g2Var.e = tonconnectsession2;
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
                        e3Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.y1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                ks.f(i7).n(r22, ks.c4);
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
                        e3Var.show();
                        e10.setOnClickListener(new z1(e3Var, 0));
                        dVar.setOnClickListener(new bd0(21, g11, e3Var));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.a2
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v1 */
                            /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
                            /* JADX WARN: Type inference failed for: r5v3 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                u0 u0Var2 = D;
                                l2 l2Var = u0Var2.g;
                                hi.d dVar2 = hi.d.this;
                                if (dVar2.R) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                hi.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView = e10;
                                imageView.setEnabled(false);
                                t60 t60Var2 = new t60(dVar2, dVar3, imageView, e3Var, i6Var, w0Var, 4);
                                if (!z12) {
                                    l2Var.getClass();
                                    org.telegram.messenger.g0.g3(new p(l2Var, g2Var, t60Var2, 7));
                                    return;
                                }
                                String y10 = u0Var2.y();
                                byte[] E = u0Var2.E();
                                ?? r52 = E == null ? 0 : (byte[]) E.clone();
                                e0 e0Var = new e0(3, inputtonconnectoauthsessionArr4, t60Var2);
                                l2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                                    e0Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    l2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(l2Var, e0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                                } catch (JSONException e11) {
                                    e0Var.a(null, l2.i("prepare OAuth request", e11));
                                }
                            }
                        });
                        return e3Var;
                    }
                }
                M0 = gd.M0(2131742923, null);
                textView3.setText(M0);
                org.telegram.ui.ActionBar.u6.U(textView3, i12, i6Var);
                g10.addView(textView3, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                g10.addView(frameLayout22, c8.ma.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                x6Var = new x6(context, R.drawable.wallet_card_qr, 46);
                x6Var.l(D);
                isAttachedToWindow = x6Var.isAttachedToWindow();
                i10 = ks.c4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                x6Var.W = i7;
                x6Var.a0 = D;
                if (x6Var.isAttachedToWindow()) {
                    ks.f(i7).c(x6Var, i10);
                }
                frameLayout22.addView(x6Var);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                org.telegram.messenger.f3.k(textView42, 17, null, 2131742924);
                org.telegram.ui.ActionBar.u6.U(textView42, org.telegram.ui.ActionBar.n6.z6, i6Var);
                g10.addView(textView42, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                g10.addView(linearLayout2, c8.ma.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final hi.d dVar2 = new hi.d(context, i6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.e();
                dVar2.setText(gd.M0(2131742941, null));
                linearLayout2.addView(dVar2, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
                final hi.d g112 = n10.g(24, context, i6Var, true);
                g112.setText(gd.M0(2131742926, null));
                linearLayout2.addView(g112, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
                final e3 e3Var2 = new e3(context, g10, i6Var);
                e3Var2.z0 = new e2(g112);
                final boolean z122 = z10;
                final jg.w0 w0Var2 = new jg.w0(z122, g112, D, tonconnectsession, g2Var, textView2, q9Var, textView);
                final x1 r222 = new fs() { // from class: org.telegram.ui.Wallet.x1
                    @Override // org.telegram.messenger.fs
                    public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    g2Var.e = tonconnectsession2;
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
                e3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.y1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        ks.f(i7).n(r222, ks.c4);
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
                e3Var2.show();
                e10.setOnClickListener(new z1(e3Var2, 0));
                dVar2.setOnClickListener(new bd0(21, g112, e3Var2));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                g112.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.a2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v1 */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r5v3 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        u0 u0Var2 = D;
                        l2 l2Var = u0Var2.g;
                        hi.d dVar22 = hi.d.this;
                        if (dVar22.R) {
                            return;
                        }
                        dVar22.setLoading(true);
                        hi.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView = e10;
                        imageView.setEnabled(false);
                        t60 t60Var2 = new t60(dVar22, dVar3, imageView, e3Var2, i6Var, w0Var2, 4);
                        if (!z122) {
                            l2Var.getClass();
                            org.telegram.messenger.g0.g3(new p(l2Var, g2Var, t60Var2, 7));
                            return;
                        }
                        String y10 = u0Var2.y();
                        byte[] E = u0Var2.E();
                        ?? r52 = E == null ? 0 : (byte[]) E.clone();
                        e0 e0Var = new e0(3, inputtonconnectoauthsessionArr42, t60Var2);
                        l2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                            e0Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            l2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(l2Var, e0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                        } catch (JSONException e11) {
                            e0Var.a(null, l2.i("prepare OAuth request", e11));
                        }
                    }
                });
                return e3Var2;
            }
        }
        z10 = z11;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(q9Var, c8.ma.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        g10.addView(frameLayout, c8.ma.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z10) {
        }
        org.telegram.ui.ActionBar.u6.U(textView22, i12, i6Var);
        g10.addView(textView22, c8.ma.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z10) {
        }
        if (!TextUtils.isEmpty(K0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z10) {
        }
        M0 = gd.M0(2131742923, null);
        textView32.setText(M0);
        org.telegram.ui.ActionBar.u6.U(textView32, i12, i6Var);
        g10.addView(textView32, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        g10.addView(frameLayout222, c8.ma.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        x6Var = new x6(context, R.drawable.wallet_card_qr, 46);
        x6Var.l(D);
        isAttachedToWindow = x6Var.isAttachedToWindow();
        i10 = ks.c4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        x6Var.W = i7;
        x6Var.a0 = D;
        if (x6Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(x6Var);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView422, 17, null, 2131742924);
        org.telegram.ui.ActionBar.u6.U(textView422, org.telegram.ui.ActionBar.n6.z6, i6Var);
        g10.addView(textView422, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        g10.addView(linearLayout22, c8.ma.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final hi.d dVar22 = new hi.d(context, i6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.e();
        dVar22.setText(gd.M0(2131742941, null));
        linearLayout22.addView(dVar22, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
        final hi.d g1122 = n10.g(24, context, i6Var, true);
        g1122.setText(gd.M0(2131742926, null));
        linearLayout22.addView(g1122, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
        final e3 e3Var22 = new e3(context, g10, i6Var);
        e3Var22.z0 = new e2(g1122);
        final boolean z1222 = z10;
        final jg.w0 w0Var22 = new jg.w0(z1222, g1122, D, tonconnectsession, g2Var, textView22, q9Var, textView);
        final x1 r2222 = new fs() { // from class: org.telegram.ui.Wallet.x1
            @Override // org.telegram.messenger.fs
            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            g2Var.e = tonconnectsession2;
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
        e3Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.y1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                ks.f(i7).n(r2222, ks.c4);
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
        e3Var22.show();
        e10.setOnClickListener(new z1(e3Var22, 0));
        dVar22.setOnClickListener(new bd0(21, g1122, e3Var22));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        g1122.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.a2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r5v3 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0 u0Var2 = D;
                l2 l2Var = u0Var2.g;
                hi.d dVar222 = hi.d.this;
                if (dVar222.R) {
                    return;
                }
                dVar222.setLoading(true);
                hi.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView = e10;
                imageView.setEnabled(false);
                t60 t60Var2 = new t60(dVar222, dVar3, imageView, e3Var22, i6Var, w0Var22, 4);
                if (!z1222) {
                    l2Var.getClass();
                    org.telegram.messenger.g0.g3(new p(l2Var, g2Var, t60Var2, 7));
                    return;
                }
                String y10 = u0Var2.y();
                byte[] E = u0Var2.E();
                ?? r52 = E == null ? 0 : (byte[]) E.clone();
                e0 e0Var = new e0(3, inputtonconnectoauthsessionArr422, t60Var2);
                l2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || y10 == null || r52 == 0) {
                    e0Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    l2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new di.s1(l2Var, e0Var, tL_urlAuthResultRequest2, y10, r52, put, 3));
                } catch (JSONException e11) {
                    e0Var.a(null, l2.i("prepare OAuth request", e11));
                }
            }
        });
        return e3Var22;
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, i6Var);
        n4Var.setText(str);
        g10.addView(n4Var, c8.ma.o(-1, -2));
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
            j2 j2Var = new j2(jSONArray.getJSONObject(i10));
            long j10 = j2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(j2Var);
            i10++;
            j3 = j11;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(l2 l2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (l2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(l2Var.d, new m1(tonconnectsession, 1));
                l2Var.b.T();
            }
            kVar.a(str);
        }
    }

    public static SpannableStringBuilder b(long j3) {
        String t6 = u0.t(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t6);
        int indexOf = t6.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        lq lqVar = new lq(R.drawable.wallet_gram_small, 2);
        lqVar.d = false;
        lqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
        linearLayout.addView(imageView, c8.ma.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        n10.p(textView, 1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams r10 = charSequence2 == null ? c8.ma.r(-1, org.telegram.messenger.g0.L(24.0f), 16) : c8.ma.o(-1, -2);
        r10.weight = 0.0f;
        linearLayout2.addView(textView, r10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, c8.ma.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(0, false, false, null);
            v4Var.x = false;
            v4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var));
            textView3.setBackground(v4Var);
            textView3.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, i7, i6Var);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, c8.ma.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.ma.p(0, -2, 1.0f, 16));
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
            linearLayout.addView(textView4, c8.ma.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
        n10.p(textView, 1, 14.0f);
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
        spannableString.setSpan(new lq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) u0.t(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.M0(2131749341, null));
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
        u0 D = u0.D(i7);
        l2 l2Var = D.g;
        bi.t3 t3Var = new bi.t3(context, i7, D, i6Var, k90Var);
        if (l2Var.h || l2Var.g != null) {
            t3Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = mp.u1(l2Var.a).h7.getString(l(j3, i10), null);
        if (string == null) {
            l2Var.h = true;
            l2Var.b.x0(new bi.q3(l2Var, j3, t3Var, i10));
            return;
        }
        l2Var.h = true;
        p51 p51Var = new p51(8, l2Var, t3Var);
        try {
            l2Var.E(j3, i10, new JSONObject(string), p51Var);
        } catch (Exception e10) {
            p51Var.a(i("restore response", e10));
        }
    }

    public static i2 r(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String n10 = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !n10.equals(n(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return s(r0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
    }

    public static i2 s(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        r0 r0Var2 = r0Var;
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
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(r0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new i2(jSONObject2);
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
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(r0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
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
                    r0Var2 = r0Var;
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
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                i2 i2Var = new i2(jSONObject6);
                i2Var.d = walletownershipproof;
                return i2Var;
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

    public static i2 t(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new i2(WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(g2 g2Var) {
        if (g2Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(g2Var.a).getJSONArray("items");
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

    public final boolean A(h2 h2Var) {
        if (h2Var.q) {
            return false;
        }
        String str = h2Var.h;
        u0 u0Var = this.b;
        return Objects.equals(str, u0Var.y()) && Arrays.equals(h2Var.g, u0Var.E());
    }

    public final void B(h2 h2Var, r0 r0Var, x10 x10Var) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(h2Var);
            int i7 = h2Var.b;
            TL_wallet.tonConnectSession tonconnectsession = h2Var.a;
            if (A && !j(h2Var)) {
                String string = mp.u1(this.a).h7.getString(l(tonconnectsession.id, i7) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(r0Var, h2Var.f, "ton-connect:" + tonconnectsession.id + ":" + i7, new s(this, h2Var, r0Var, x10Var, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(this, x10Var, h2Var, r0Var, sendtransfer, 6));
                    return;
                } catch (Exception e10) {
                    x10Var.a(i("restore transfer", e10));
                    return;
                }
            }
        }
        y(h2Var, r0Var, null, 0, "Wallet unavailable or request expired", x10Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, x10 x10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new bi.z(this, x10Var, jSONObject, j3, i7));
    }

    public final boolean d(g2 g2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = g2Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(g2Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = g2Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(g2Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        u0 u0Var = this.b;
        return str.equals(u0Var.y()) && Arrays.equals(bArr, u0Var.E());
    }

    public final void e(int i7, long j3, x10 x10Var) {
        long j10 = i7;
        mp.u1(this.a).h7.edit().remove(l(j3, j10)).remove(l(j3, j10) + ".transfer").apply();
        h2 h2Var = this.g;
        if (h2Var != null && h2Var.a.id == j3 && h2Var.b == i7) {
            h2Var.n = true;
        }
        x10Var.a(null);
    }

    public final void f(h2 h2Var, boolean z10, x10 x10Var) {
        boolean z11 = h2Var.m;
        TL_wallet.tonConnectSession tonconnectsession = h2Var.a;
        if (z11) {
            return;
        }
        if (h2Var.n || j(h2Var) || !A(h2Var) || !(z10 || h2Var.l >= 0 || "disconnect".equals(h2Var.e) || h2Var.p)) {
            x10Var.a("Request expired, was processed, or the wallet changed");
            return;
        }
        h2Var.m = true;
        o oVar = new o(this, h2Var, x10Var, 3);
        String string = mp.u1(this.a).h7.getString(l(tonconnectsession.id, h2Var.b), null);
        if (string == null) {
            this.b.F(true, false, false, new c0(this, oVar, h2Var, z10, 1));
            return;
        }
        try {
            try {
                E(tonconnectsession.id, h2Var.b, new JSONObject(string), oVar);
            } catch (Exception e10) {
                e = e10;
                oVar = oVar;
                oVar.a(i("restore response", e));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean j(h2 h2Var) {
        long currentTime = this.f.getCurrentTime();
        if (h2Var.c <= currentTime) {
            return true;
        }
        k2 k2Var = h2Var.f;
        if (k2Var == null) {
            return false;
        }
        long j3 = k2Var.a;
        return j3 != 0 && j3 <= currentTime;
    }

    public final void o(int i7, long j3) {
        h2 h2Var = this.g;
        if (h2Var == null || h2Var.a.id != j3 || h2Var.b != i7 || h2Var.m) {
            return;
        }
        h2Var.n = true;
        Runnable runnable = h2Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        m1 m1Var = new m1(tonconnectsession, 0);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, m1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        h2 h2Var = this.g;
        if (h2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = h2Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                h2Var.q = true;
                o(h2Var.b, tonconnectsession.id);
            }
        }
        ks.f(this.a).k(ks.c4, this.b, tonconnectsession);
    }

    public final void u(h2 h2Var) {
        h2Var.r = null;
        if (h2Var.m || this.g != h2Var) {
            return;
        }
        this.g = null;
    }

    public final void y(h2 h2Var, r0 r0Var, Object obj, int i7, String str, x10 x10Var) {
        Utilities.e.c(new bi.d5(this, h2Var, i7, obj, str, r0Var, x10Var));
    }
}
