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
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.fe;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.af;
import org.telegram.ui.f11;
import org.telegram.ui.j70;
import org.telegram.ui.qa0;
import org.telegram.ui.r70;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e2 {
    public final int a;
    public final k0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public a2 g;
    public boolean h;

    public e2(k0 k0Var) {
        this.e = -1;
        int i10 = k0Var.a;
        this.a = i10;
        this.b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new a3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return cd.L0(2131742998, null);
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
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.us, org.telegram.ui.Wallet.p1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z2 D(Context context, final int i10, final z1 z1Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.p6 p6Var, final r70 r70Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z10;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String K0;
        String L0;
        l6 l6Var;
        boolean isAttachedToWindow;
        int i11;
        TextView textView;
        k0 k0Var;
        final k0 x10 = k0.x(i10);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : z1Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView e = z20.e(context, R.drawable.ic_ab_close);
        e.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        e.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(e, h02, null, N, p6Var);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(e, i13, p6Var, PorterDuff.Mode.SRC_IN);
        w7.e6.a(e);
        frameLayout.addView(e, w7.b6.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
        if (z11) {
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.r(tL_urlAuthResultRequest.bot);
            g9Var.e(tL_urlAuthResultRequest.bot, r8Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z10 = z11;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                g9Var.p(ic.p(b30.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(g9Var, w7.b6.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                f7.addView(frameLayout, w7.b6.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(org.telegram.messenger.i0.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z10) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(cd.V(null, null, 2131743186, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(cd.L0(2131743185, null));
                    }
                } else {
                    textView2.setText(cd.V(null, null, 2131743186, h20.p(tL_urlAuthResultRequest.bot)));
                }
                org.telegram.ui.ActionBar.a7.V(textView2, i13, p6Var);
                f7.addView(textView2, w7.b6.t(-2, -2, 49, 36, 16, 36, 0));
                K0 = !z10 ? tL_urlAuthResultRequest.domain : org.telegram.messenger.i0.K0(z1Var.b, false);
                if (!TextUtils.isEmpty(K0)) {
                    f7.addView(h(context, K0, p6Var), w7.b6.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z10) {
                    x10.g.getClass();
                    if (!w(z1Var)) {
                        L0 = cd.L0(2131743189, null);
                        textView3.setText(L0);
                        org.telegram.ui.ActionBar.a7.V(textView3, i13, p6Var);
                        f7.addView(textView3, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        f7.addView(frameLayout2, w7.b6.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        l6Var = new l6(context, R.drawable.wallet_card_qr, 46);
                        l6Var.l(x10);
                        isAttachedToWindow = l6Var.isAttachedToWindow();
                        i11 = zs.a4;
                        if (isAttachedToWindow || (k0Var = l6Var.W) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i14 = l6Var.V;
                            if (i14 != i10 || k0Var != x10) {
                                zs.f(i14).n(l6Var, i11);
                            }
                        }
                        l6Var.V = i10;
                        l6Var.W = x10;
                        if (l6Var.isAttachedToWindow() && l6Var.W != null) {
                            zs.f(i10).c(l6Var, i11);
                        }
                        frameLayout2.addView(l6Var);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.messenger.m5.l(textView4, 17, null, 2131743188);
                        org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.z6, p6Var);
                        f7.addView(textView4, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                        f7.addView(linearLayout, w7.b6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final vh.d dVar = new vh.d(context, p6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(cd.L0(2131743205, null));
                        linearLayout.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                        final vh.d i15 = z20.i(24, context, p6Var, true);
                        i15.setText(cd.L0(2131743190, null));
                        linearLayout.addView(i15, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                        final z2 z2Var = new z2(context, f7, p6Var);
                        z2Var.y0 = new x1(i15);
                        final boolean z12 = z10;
                        final org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(z12, i15, x10, tonconnectsession, z1Var, textView2, g9Var, textView);
                        final ?? r22 = new us() { // from class: org.telegram.ui.Wallet.p1
                            @Override // org.telegram.messenger.us
                            public final void didReceivedNotification(int i16, int i17, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            z1Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                iVar.run();
                            }
                        };
                        zs.f(i10).b(r22, i11);
                        iVar.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        z2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.q1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                zs.f(i10).n(r22, zs.a4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z12 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    r70Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        z2Var.show();
                        e.setOnClickListener(new r1(z2Var, 0));
                        dVar.setOnClickListener(new rv0(11, i15, z2Var));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        i15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                k0 k0Var2 = x10;
                                e2 e2Var = k0Var2.g;
                                vh.d dVar2 = vh.d.this;
                                if (dVar2.Q) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                vh.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView = e;
                                imageView.setEnabled(false);
                                r70 r70Var2 = new r70(dVar2, dVar3, imageView, z2Var, p6Var, iVar, 4);
                                if (!z12) {
                                    e2Var.getClass();
                                    org.telegram.messenger.i0.g3(new g(e2Var, z1Var, r70Var2, 6));
                                    return;
                                }
                                String t10 = k0Var2.t();
                                byte[] y3 = k0Var2.y();
                                byte[] bArr = y3 == null ? null : (byte[]) y3.clone();
                                ih.s sVar = new ih.s(23, inputtonconnectoauthsessionArr4, r70Var2);
                                e2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                                    sVar.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a1.g.r(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    e2Var.f.sendRequestTyped(tonconnectcreatesession, new a3.b(1), new e1(e2Var, (Object) sVar, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                                } catch (JSONException e7) {
                                    sVar.a(null, e2.i("prepare OAuth request", e7));
                                }
                            }
                        });
                        return z2Var;
                    }
                }
                L0 = cd.L0(2131743187, null);
                textView3.setText(L0);
                org.telegram.ui.ActionBar.a7.V(textView3, i13, p6Var);
                f7.addView(textView3, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                f7.addView(frameLayout22, w7.b6.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                l6Var = new l6(context, R.drawable.wallet_card_qr, 46);
                l6Var.l(x10);
                isAttachedToWindow = l6Var.isAttachedToWindow();
                i11 = zs.a4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                l6Var.V = i10;
                l6Var.W = x10;
                if (l6Var.isAttachedToWindow()) {
                    zs.f(i10).c(l6Var, i11);
                }
                frameLayout22.addView(l6Var);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                org.telegram.messenger.m5.l(textView42, 17, null, 2131743188);
                org.telegram.ui.ActionBar.a7.V(textView42, org.telegram.ui.ActionBar.t6.z6, p6Var);
                f7.addView(textView42, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                f7.addView(linearLayout2, w7.b6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final vh.d dVar2 = new vh.d(context, p6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.e();
                dVar2.setText(cd.L0(2131743205, null));
                linearLayout2.addView(dVar2, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                final vh.d i152 = z20.i(24, context, p6Var, true);
                i152.setText(cd.L0(2131743190, null));
                linearLayout2.addView(i152, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                final z2 z2Var2 = new z2(context, f7, p6Var);
                z2Var2.y0 = new x1(i152);
                final boolean z122 = z10;
                final org.telegram.messenger.camera.i iVar2 = new org.telegram.messenger.camera.i(z122, i152, x10, tonconnectsession, z1Var, textView2, g9Var, textView);
                final p1 r222 = new us() { // from class: org.telegram.ui.Wallet.p1
                    @Override // org.telegram.messenger.us
                    public final void didReceivedNotification(int i16, int i17, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    z1Var.e = tonconnectsession2;
                                }
                            }
                        }
                        iVar2.run();
                    }
                };
                zs.f(i10).b(r222, i11);
                iVar2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                z2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.q1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        zs.f(i10).n(r222, zs.a4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z122 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            r70Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                z2Var2.show();
                e.setOnClickListener(new r1(z2Var2, 0));
                dVar2.setOnClickListener(new rv0(11, i152, z2Var2));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                i152.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k0 k0Var2 = x10;
                        e2 e2Var = k0Var2.g;
                        vh.d dVar22 = vh.d.this;
                        if (dVar22.Q) {
                            return;
                        }
                        dVar22.setLoading(true);
                        vh.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView = e;
                        imageView.setEnabled(false);
                        r70 r70Var2 = new r70(dVar22, dVar3, imageView, z2Var2, p6Var, iVar2, 4);
                        if (!z122) {
                            e2Var.getClass();
                            org.telegram.messenger.i0.g3(new g(e2Var, z1Var, r70Var2, 6));
                            return;
                        }
                        String t10 = k0Var2.t();
                        byte[] y3 = k0Var2.y();
                        byte[] bArr = y3 == null ? null : (byte[]) y3.clone();
                        ih.s sVar = new ih.s(23, inputtonconnectoauthsessionArr42, r70Var2);
                        e2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                            sVar.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a1.g.r(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            e2Var.f.sendRequestTyped(tonconnectcreatesession, new a3.b(1), new e1(e2Var, (Object) sVar, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                        } catch (JSONException e7) {
                            sVar.a(null, e2.i("prepare OAuth request", e7));
                        }
                    }
                });
                return z2Var2;
            }
        }
        z10 = z11;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(g9Var, w7.b6.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        f7.addView(frameLayout, w7.b6.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(org.telegram.messenger.i0.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z10) {
        }
        org.telegram.ui.ActionBar.a7.V(textView22, i13, p6Var);
        f7.addView(textView22, w7.b6.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z10) {
        }
        if (!TextUtils.isEmpty(K0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z10) {
        }
        L0 = cd.L0(2131743187, null);
        textView32.setText(L0);
        org.telegram.ui.ActionBar.a7.V(textView32, i13, p6Var);
        f7.addView(textView32, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        f7.addView(frameLayout222, w7.b6.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        l6Var = new l6(context, R.drawable.wallet_card_qr, 46);
        l6Var.l(x10);
        isAttachedToWindow = l6Var.isAttachedToWindow();
        i11 = zs.a4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        l6Var.V = i10;
        l6Var.W = x10;
        if (l6Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(l6Var);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        org.telegram.messenger.m5.l(textView422, 17, null, 2131743188);
        org.telegram.ui.ActionBar.a7.V(textView422, org.telegram.ui.ActionBar.t6.z6, p6Var);
        f7.addView(textView422, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        f7.addView(linearLayout22, w7.b6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final vh.d dVar22 = new vh.d(context, p6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.e();
        dVar22.setText(cd.L0(2131743205, null));
        linearLayout22.addView(dVar22, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
        final vh.d i1522 = z20.i(24, context, p6Var, true);
        i1522.setText(cd.L0(2131743190, null));
        linearLayout22.addView(i1522, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
        final z2 z2Var22 = new z2(context, f7, p6Var);
        z2Var22.y0 = new x1(i1522);
        final boolean z1222 = z10;
        final org.telegram.messenger.camera.i iVar22 = new org.telegram.messenger.camera.i(z1222, i1522, x10, tonconnectsession, z1Var, textView22, g9Var, textView);
        final p1 r2222 = new us() { // from class: org.telegram.ui.Wallet.p1
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i16, int i17, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            z1Var.e = tonconnectsession2;
                        }
                    }
                }
                iVar22.run();
            }
        };
        zs.f(i10).b(r2222, i11);
        iVar22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        z2Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.q1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                zs.f(i10).n(r2222, zs.a4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z1222 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    r70Var.a(inputtonconnectoauthsession);
                }
            }
        });
        z2Var22.show();
        e.setOnClickListener(new r1(z2Var22, 0));
        dVar22.setOnClickListener(new rv0(11, i1522, z2Var22));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        i1522.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0 k0Var2 = x10;
                e2 e2Var = k0Var2.g;
                vh.d dVar222 = vh.d.this;
                if (dVar222.Q) {
                    return;
                }
                dVar222.setLoading(true);
                vh.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView = e;
                imageView.setEnabled(false);
                r70 r70Var2 = new r70(dVar222, dVar3, imageView, z2Var22, p6Var, iVar22, 4);
                if (!z1222) {
                    e2Var.getClass();
                    org.telegram.messenger.i0.g3(new g(e2Var, z1Var, r70Var2, 6));
                    return;
                }
                String t10 = k0Var2.t();
                byte[] y3 = k0Var2.y();
                byte[] bArr = y3 == null ? null : (byte[]) y3.clone();
                ih.s sVar = new ih.s(23, inputtonconnectoauthsessionArr422, r70Var2);
                e2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                    sVar.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a1.g.r(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    e2Var.f.sendRequestTyped(tonconnectcreatesession, new a3.b(1), new e1(e2Var, (Object) sVar, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                } catch (JSONException e7) {
                    sVar.a(null, e2.i("prepare OAuth request", e7));
                }
            }
        });
        return z2Var22;
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        f7.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f7, d02, N, null, p6Var);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
        p4Var.setText(str);
        f7.addView(p4Var, w7.b6.o(-1, -2));
        return f7;
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
    public static void I(JSONObject jSONObject, String str, int i10) {
        H(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i10) {
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
        int i11 = 0;
        long j10 = 0;
        while (i11 < jSONArray.length()) {
            c2 c2Var = new c2(jSONArray.getJSONObject(i11));
            long j11 = c2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(c2Var);
            i11++;
            j10 = j12;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(e2 e2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (e2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(e2Var.d, new a1(tonconnectsession, 0));
                e2Var.b.L();
            }
            kVar.a(str);
        }
    }

    public static SpannableStringBuilder b(long j10) {
        String o10 = k0.o(j10, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o10);
        int indexOf = o10.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        dq dqVar = new dq(R.drawable.wallet_gram_small, 2);
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(16.0f));
        spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.mini_gram_24);
        imageView.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        linearLayout.addView(imageView, w7.b6.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        z20.n(textView, 1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams r10 = charSequence2 == null ? w7.b6.r(-1, org.telegram.messenger.i0.L(24.0f), 16) : w7.b6.o(-1, -2);
        r10.weight = 0.0f;
        linearLayout2.addView(textView, r10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g10 = org.telegram.messenger.m5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.z6, p6Var);
            g10.setSingleLine(true);
            g10.setEllipsize(TextUtils.TruncateAt.END);
            g10.setText(charSequence2);
            linearLayout2.addView(g10, w7.b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, false, false, null);
            c5Var.x = false;
            c5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Xl, p6Var));
            textView2.setBackground(c5Var);
            textView2.setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, w7.b6.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, w7.b6.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i10 = org.telegram.ui.ActionBar.t6.ik;
            }
            org.telegram.ui.ActionBar.a7.V(textView3, i10, p6Var);
            linearLayout.addView(textView3, w7.b6.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
                I(jSONObject3, str, i10);
                jSONObject.put("transaction", jSONObject3);
            } else if (jSONArray.length() != 0) {
                throw new IllegalArgumentException("Disconnect takes no parameters");
            }
        } catch (Exception e) {
            jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        TextView textView = new TextView(context);
        z20.n(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Ci, p6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String i(String str, Exception exc) {
        org.telegram.messenger.f8.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static SpannableStringBuilder k(long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new dq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k0.o(-j10, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cd.L0(2131749525, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j10, long j11) {
        StringBuilder s10 = a1.g.s(j10, "tonconnect_reply.", ".");
        s10.append(j11);
        return s10.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            org.telegram.messenger.f8.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if (!"https".equalsIgnoreCase(create.getScheme()) || create.getHost() == null) {
            throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
        }
        return create.getHost().toLowerCase(Locale.ROOT);
    }

    public static void q(Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, qa0 qa0Var) {
        k0 x10 = k0.x(i10);
        e2 e2Var = x10.g;
        j70 j70Var = new j70(context, i10, x10, p6Var, qa0Var);
        if (e2Var.h || e2Var.g != null) {
            j70Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = vp.r1(e2Var.a).f7.getString(l(j10, i11), null);
        if (string == null) {
            e2Var.h = true;
            e2Var.b.m0(new org.telegram.ui.z(e2Var, j10, j70Var, i11));
            return;
        }
        e2Var.h = true;
        f11 f11Var = new f11(11, e2Var, j70Var);
        try {
            e2Var.E(j10, i11, new JSONObject(string), f11Var);
        } catch (Exception e) {
            f11Var.a(i("restore response", e));
        }
    }

    public static b2 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String n10 = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !n10.equals(n(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return s(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i10);
    }

    public static b2 s(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject;
        String str4;
        int i11;
        String str5;
        String str6;
        h0 h0Var2 = h0Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() == 0) {
            throw new IllegalArgumentException("Empty connect request");
        }
        String str7 = "account";
        JSONObject put = new JSONObject().put("account", tonconnectchallenge != null);
        HashSet hashSet = new HashSet();
        int i12 = 0;
        while (true) {
            String str8 = "ton_proof";
            String str9 = "ton_addr";
            if (i12 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    throw new IllegalArgumentException("Missing ton_addr item");
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new b2(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    throw new IllegalArgumentException("Invalid connect event ID");
                }
                JSONArray jSONArray3 = new JSONArray();
                TL_wallet.walletOwnershipProof walletownershipproof = null;
                int i13 = 0;
                while (i13 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i11 = i13;
                        str5 = str8;
                        str6 = str9;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str7;
                        i11 = i13;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i10));
                        str5 = str8;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i10;
                        str6 = str9;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i10).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i11 = i13;
                        str5 = str8;
                        str6 = str9;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i13 = i11 + 1;
                    h0Var2 = h0Var;
                    jSONArray2 = jSONArray;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.v2.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", zs.e4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", zs.e4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                b2 b2Var = new b2(jSONObject6);
                b2Var.d = walletownershipproof;
                return b2Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i12);
            int i14 = i12;
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
            i12 = i14 + 1;
        }
    }

    public static b2 t(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new b2(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
    }

    public static TextView v(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(z1 z1Var) {
        if (z1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(z1Var.a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                i("read proof request", e);
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
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder u10 = a1.g.u("[gram-wallet] TON Connect ", str, ": ");
        u10.append(tL_error == null ? "" : a1.g.p(new StringBuilder("code="), tL_error.code, " "));
        u10.append(str2);
        org.telegram.messenger.f8.d(u10.toString());
        return str2;
    }

    public final boolean A(a2 a2Var) {
        if (a2Var.q) {
            return false;
        }
        String str = a2Var.h;
        k0 k0Var = this.b;
        return Objects.equals(str, k0Var.t()) && Arrays.equals(a2Var.g, k0Var.y());
    }

    public final void B(a2 a2Var, h0 h0Var, q20 q20Var) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(a2Var);
            int i10 = a2Var.b;
            TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
            if (A && !j(a2Var)) {
                String string = vp.r1(this.a).f7.getString(l(tonconnectsession.id, i10) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(h0Var, a2Var.f, "ton-connect:" + tonconnectsession.id + ":" + i10, new q(this, a2Var, h0Var, q20Var, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new a3.b(1), new af(this, q20Var, a2Var, h0Var, sendtransfer, 5));
                    return;
                } catch (Exception e) {
                    q20Var.a(i("restore transfer", e));
                    return;
                }
            }
        }
        y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", q20Var);
    }

    public final void E(long j10, int i10, JSONObject jSONObject, q20 q20Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new a3.b(1), new org.telegram.ui.Components.s2(this, q20Var, jSONObject, j10, i10));
    }

    public final boolean d(z1 z1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(z1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = z1Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(z1Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        k0 k0Var = this.b;
        return str.equals(k0Var.t()) && Arrays.equals(bArr, k0Var.y());
    }

    public final void e(int i10, long j10, q20 q20Var) {
        long j11 = i10;
        vp.r1(this.a).f7.edit().remove(l(j10, j11)).remove(l(j10, j11) + ".transfer").apply();
        a2 a2Var = this.g;
        if (a2Var != null && a2Var.a.id == j10 && a2Var.b == i10) {
            a2Var.n = true;
        }
        q20Var.a(null);
    }

    public final void f(a2 a2Var, boolean z10, q20 q20Var) {
        boolean z11 = a2Var.m;
        TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
        if (z11) {
            return;
        }
        if (a2Var.n || j(a2Var) || !A(a2Var) || !(z10 || a2Var.l >= 0 || "disconnect".equals(a2Var.e) || a2Var.p)) {
            q20Var.a("Request expired, was processed, or the wallet changed");
            return;
        }
        a2Var.m = true;
        m mVar = new m(this, a2Var, q20Var, 2);
        String string = vp.r1(this.a).f7.getString(l(tonconnectsession.id, a2Var.b), null);
        if (string == null) {
            this.b.z(new v(this, mVar, a2Var, z10, 1), true, false);
            return;
        }
        try {
            try {
                E(tonconnectsession.id, a2Var.b, new JSONObject(string), mVar);
            } catch (Exception e) {
                e = e;
                mVar = mVar;
                mVar.a(i("restore response", e));
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final boolean j(a2 a2Var) {
        long currentTime = this.f.getCurrentTime();
        if (a2Var.c <= currentTime) {
            return true;
        }
        d2 d2Var = a2Var.f;
        if (d2Var == null) {
            return false;
        }
        long j10 = d2Var.a;
        return j10 != 0 && j10 <= currentTime;
    }

    public final void o(int i10, long j10) {
        a2 a2Var = this.g;
        if (a2Var == null || a2Var.a.id != j10 || a2Var.b != i10 || a2Var.m) {
            return;
        }
        a2Var.n = true;
        Runnable runnable = a2Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        a1 a1Var = new a1(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, a1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        a2 a2Var = this.g;
        if (a2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = a2Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                a2Var.q = true;
                o(a2Var.b, tonconnectsession.id);
            }
        }
        zs.f(this.a).k(zs.a4, this.b, tonconnectsession);
    }

    public final void u(a2 a2Var) {
        a2Var.r = null;
        if (a2Var.m || this.g != a2Var) {
            return;
        }
        this.g = null;
    }

    public final void y(a2 a2Var, h0 h0Var, Object obj, int i10, String str, q20 q20Var) {
        Utilities.e.c(new fe(this, a2Var, i10, obj, str, h0Var, q20Var, 14));
    }
}
