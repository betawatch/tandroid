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
import org.telegram.messenger.c20;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.ik0;
import org.telegram.ui.o60;
import org.telegram.ui.o90;
import org.telegram.ui.w60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class d2 {
    public final int a;
    public final l0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public z1 g;
    public boolean h;

    public d2(l0 l0Var) {
        this.e = -1;
        int i7 = l0Var.a;
        this.a = i7;
        this.b = l0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return id.M0(2131742972, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.messenger.ls, org.telegram.ui.Wallet.o1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y2 D(Context context, final int i7, final y1 y1Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.h6 h6Var, final w60 w60Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z9;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        TL_wallet.tonConnectSession tonconnectsession;
        String K0;
        String M0;
        i6 i6Var;
        boolean isAttachedToWindow;
        int i10;
        l0 l0Var;
        int i11;
        final l0 x10 = l0.x(i7);
        boolean z10 = tL_urlAuthResultRequest != null;
        TL_wallet.tonConnectSession tonconnectsession2 = z10 ? null : y1Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_ab_close);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        e10.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(e10, h02, null, M, h6Var);
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(e10, i13, h6Var, PorterDuff.Mode.SRC_IN);
        c8.ka.a(e10);
        frameLayout.addView(e10, c8.ha.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        if (z10) {
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            v8Var.r(tL_urlAuthResultRequest.bot);
            k9Var.e(tL_urlAuthResultRequest.bot, v8Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession2.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z9 = z10;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                k9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                frameLayout.addView(k9Var, c8.ha.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                f10.addView(frameLayout, c8.ha.o(-1, -2));
                TextView textView = new TextView(context);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                if (z9) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession2.manifest;
                    if (tonconnectmanifest2 != null) {
                        tonconnectsession = tonconnectsession2;
                        textView.setText(id.V(null, null, 2131743160, tonconnectmanifest2.name));
                    } else {
                        tonconnectsession = tonconnectsession2;
                        textView.setText(id.M0(2131743159, null));
                    }
                } else {
                    textView.setText(id.V(null, null, 2131743160, t10.p(tL_urlAuthResultRequest.bot)));
                    tonconnectsession = tonconnectsession2;
                }
                org.telegram.ui.ActionBar.t6.U(textView, i13, h6Var);
                f10.addView(textView, c8.ha.t(-2, -2, 49, 36, 16, 36, 0));
                K0 = !z9 ? tL_urlAuthResultRequest.domain : org.telegram.messenger.g0.K0(y1Var.b, false);
                if (!TextUtils.isEmpty(K0)) {
                    f10.addView(h(context, K0, h6Var), c8.ha.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                if (!z9) {
                    x10.g.getClass();
                    if (!w(y1Var)) {
                        M0 = id.M0(2131743163, null);
                        textView2.setText(M0);
                        org.telegram.ui.ActionBar.t6.U(textView2, i13, h6Var);
                        f10.addView(textView2, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        f10.addView(frameLayout2, c8.ha.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        i6Var = new i6(context, R.drawable.wallet_card_qr, 46);
                        i6Var.l(x10);
                        isAttachedToWindow = i6Var.isAttachedToWindow();
                        i10 = qs.a4;
                        if (isAttachedToWindow && (l0Var = i6Var.W) != null && ((i11 = i6Var.V) != i7 || l0Var != x10)) {
                            qs.f(i11).n(i6Var, i10);
                        }
                        i6Var.V = i7;
                        i6Var.W = x10;
                        if (i6Var.isAttachedToWindow() && i6Var.W != null) {
                            qs.f(i7).c(i6Var, i10);
                        }
                        frameLayout2.addView(i6Var);
                        TextView textView3 = new TextView(context);
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.messenger.k5.m(textView3, 17, null, 2131743162);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.z6, h6Var);
                        f10.addView(textView3, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                        f10.addView(linearLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final fi.d dVar = new fi.d(context, h6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(id.M0(2131743179, null));
                        linearLayout.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                        final fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
                        h.setText(id.M0(2131743164, null));
                        linearLayout.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                        final y2 y2Var = new y2(context, f10, h6Var);
                        y2Var.y0 = new w1(h);
                        final boolean z11 = z9;
                        final TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession;
                        final jg.w0 w0Var = new jg.w0(z11, h, x10, tonconnectsession3, y1Var, textView, k9Var, textView2);
                        final ?? r22 = new ls() { // from class: org.telegram.ui.Wallet.o1
                            @Override // org.telegram.messenger.ls
                            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                                if (!z11 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession4.id == tonconnectsession3.id) {
                                            y1Var.e = tonconnectsession4;
                                        }
                                    }
                                }
                                w0Var.run();
                            }
                        };
                        qs.f(i7).b(r22, i10);
                        w0Var.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        y2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.p1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                qs.f(i7).n(r22, qs.a4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z11 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    w60Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        y2Var.show();
                        e10.setOnClickListener(new q1(y2Var, 0));
                        dVar.setOnClickListener(new ik0(17, h, y2Var));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.r1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                l0 l0Var2 = x10;
                                d2 d2Var = l0Var2.g;
                                fi.d dVar2 = fi.d.this;
                                if (dVar2.Q) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                fi.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView = e10;
                                imageView.setEnabled(false);
                                w60 w60Var2 = new w60(dVar2, dVar3, imageView, y2Var, h6Var, w0Var, 4);
                                if (!z11) {
                                    d2Var.getClass();
                                    org.telegram.messenger.g0.h3(new g(d2Var, y1Var, w60Var2, 6));
                                    return;
                                }
                                String t6 = l0Var2.t();
                                byte[] y10 = l0Var2.y();
                                byte[] bArr = y10 == null ? null : (byte[]) y10.clone();
                                bi.p5 p5Var = new bi.p5(29, inputtonconnectoauthsessionArr4, w60Var2);
                                d2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t6 == null || bArr == null) {
                                    p5Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    d2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new d1(d2Var, (Object) p5Var, (TLObject) tL_urlAuthResultRequest2, t6, bArr, (Object) put, 3));
                                } catch (JSONException e11) {
                                    p5Var.a(null, d2.i("prepare OAuth request", e11));
                                }
                            }
                        });
                        return y2Var;
                    }
                }
                M0 = id.M0(2131743161, null);
                textView2.setText(M0);
                org.telegram.ui.ActionBar.t6.U(textView2, i13, h6Var);
                f10.addView(textView2, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                f10.addView(frameLayout22, c8.ha.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                i6Var = new i6(context, R.drawable.wallet_card_qr, 46);
                i6Var.l(x10);
                isAttachedToWindow = i6Var.isAttachedToWindow();
                i10 = qs.a4;
                if (isAttachedToWindow) {
                    qs.f(i11).n(i6Var, i10);
                }
                i6Var.V = i7;
                i6Var.W = x10;
                if (i6Var.isAttachedToWindow()) {
                    qs.f(i7).c(i6Var, i10);
                }
                frameLayout22.addView(i6Var);
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 14.0f);
                org.telegram.messenger.k5.m(textView32, 17, null, 2131743162);
                org.telegram.ui.ActionBar.t6.U(textView32, org.telegram.ui.ActionBar.m6.z6, h6Var);
                f10.addView(textView32, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                f10.addView(linearLayout2, c8.ha.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final fi.d dVar2 = new fi.d(context, h6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.e();
                dVar2.setText(id.M0(2131743179, null));
                linearLayout2.addView(dVar2, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                final fi.d h7 = org.telegram.messenger.k5.h(24, context, h6Var, true);
                h7.setText(id.M0(2131743164, null));
                linearLayout2.addView(h7, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                final y2 y2Var2 = new y2(context, f10, h6Var);
                y2Var2.y0 = new w1(h7);
                final boolean z112 = z9;
                final TL_wallet.tonConnectSession tonconnectsession32 = tonconnectsession;
                final jg.w0 w0Var2 = new jg.w0(z112, h7, x10, tonconnectsession32, y1Var, textView, k9Var, textView2);
                final o1 r222 = new ls() { // from class: org.telegram.ui.Wallet.o1
                    @Override // org.telegram.messenger.ls
                    public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                        if (!z112 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession4.id == tonconnectsession32.id) {
                                    y1Var.e = tonconnectsession4;
                                }
                            }
                        }
                        w0Var2.run();
                    }
                };
                qs.f(i7).b(r222, i10);
                w0Var2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                y2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.p1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        qs.f(i7).n(r222, qs.a4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z112 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            w60Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                y2Var2.show();
                e10.setOnClickListener(new q1(y2Var2, 0));
                dVar2.setOnClickListener(new ik0(17, h7, y2Var2));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                h7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.r1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0 l0Var2 = x10;
                        d2 d2Var = l0Var2.g;
                        fi.d dVar22 = fi.d.this;
                        if (dVar22.Q) {
                            return;
                        }
                        dVar22.setLoading(true);
                        fi.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView = e10;
                        imageView.setEnabled(false);
                        w60 w60Var2 = new w60(dVar22, dVar3, imageView, y2Var2, h6Var, w0Var2, 4);
                        if (!z112) {
                            d2Var.getClass();
                            org.telegram.messenger.g0.h3(new g(d2Var, y1Var, w60Var2, 6));
                            return;
                        }
                        String t6 = l0Var2.t();
                        byte[] y10 = l0Var2.y();
                        byte[] bArr = y10 == null ? null : (byte[]) y10.clone();
                        bi.p5 p5Var = new bi.p5(29, inputtonconnectoauthsessionArr42, w60Var2);
                        d2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t6 == null || bArr == null) {
                            p5Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            d2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new d1(d2Var, (Object) p5Var, (TLObject) tL_urlAuthResultRequest2, t6, bArr, (Object) put, 3));
                        } catch (JSONException e11) {
                            p5Var.a(null, d2.i("prepare OAuth request", e11));
                        }
                    }
                });
                return y2Var2;
            }
        }
        z9 = z10;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(k9Var, c8.ha.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        f10.addView(frameLayout, c8.ha.o(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        if (z9) {
        }
        org.telegram.ui.ActionBar.t6.U(textView4, i13, h6Var);
        f10.addView(textView4, c8.ha.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z9) {
        }
        if (!TextUtils.isEmpty(K0)) {
        }
        TextView textView22 = new TextView(context);
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        if (!z9) {
        }
        M0 = id.M0(2131743161, null);
        textView22.setText(M0);
        org.telegram.ui.ActionBar.t6.U(textView22, i13, h6Var);
        f10.addView(textView22, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        f10.addView(frameLayout222, c8.ha.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        i6Var = new i6(context, R.drawable.wallet_card_qr, 46);
        i6Var.l(x10);
        isAttachedToWindow = i6Var.isAttachedToWindow();
        i10 = qs.a4;
        if (isAttachedToWindow) {
        }
        i6Var.V = i7;
        i6Var.W = x10;
        if (i6Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(i6Var);
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView322, 17, null, 2131743162);
        org.telegram.ui.ActionBar.t6.U(textView322, org.telegram.ui.ActionBar.m6.z6, h6Var);
        f10.addView(textView322, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        f10.addView(linearLayout22, c8.ha.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final fi.d dVar22 = new fi.d(context, h6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.e();
        dVar22.setText(id.M0(2131743179, null));
        linearLayout22.addView(dVar22, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        final fi.d h72 = org.telegram.messenger.k5.h(24, context, h6Var, true);
        h72.setText(id.M0(2131743164, null));
        linearLayout22.addView(h72, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        final y2 y2Var22 = new y2(context, f10, h6Var);
        y2Var22.y0 = new w1(h72);
        final boolean z1122 = z9;
        final TL_wallet.tonConnectSession tonconnectsession322 = tonconnectsession;
        final jg.w0 w0Var22 = new jg.w0(z1122, h72, x10, tonconnectsession322, y1Var, textView4, k9Var, textView22);
        final o1 r2222 = new ls() { // from class: org.telegram.ui.Wallet.o1
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                if (!z1122 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession4.id == tonconnectsession322.id) {
                            y1Var.e = tonconnectsession4;
                        }
                    }
                }
                w0Var22.run();
            }
        };
        qs.f(i7).b(r2222, i10);
        w0Var22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        y2Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.p1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                qs.f(i7).n(r2222, qs.a4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z1122 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    w60Var.a(inputtonconnectoauthsession);
                }
            }
        });
        y2Var22.show();
        e10.setOnClickListener(new q1(y2Var22, 0));
        dVar22.setOnClickListener(new ik0(17, h72, y2Var22));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        h72.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0 l0Var2 = x10;
                d2 d2Var = l0Var2.g;
                fi.d dVar222 = fi.d.this;
                if (dVar222.Q) {
                    return;
                }
                dVar222.setLoading(true);
                fi.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView = e10;
                imageView.setEnabled(false);
                w60 w60Var2 = new w60(dVar222, dVar3, imageView, y2Var22, h6Var, w0Var22, 4);
                if (!z1122) {
                    d2Var.getClass();
                    org.telegram.messenger.g0.h3(new g(d2Var, y1Var, w60Var2, 6));
                    return;
                }
                String t6 = l0Var2.t();
                byte[] y10 = l0Var2.y();
                byte[] bArr = y10 == null ? null : (byte[]) y10.clone();
                bi.p5 p5Var = new bi.p5(29, inputtonconnectoauthsessionArr422, w60Var2);
                d2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t6 == null || bArr == null) {
                    p5Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a8.p0.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    d2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new d1(d2Var, (Object) p5Var, (TLObject) tL_urlAuthResultRequest2, t6, bArr, (Object) put, 3));
                } catch (JSONException e11) {
                    p5Var.a(null, d2.i("prepare OAuth request", e11));
                }
            }
        });
        return y2Var22;
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(f10, d02, M, null, h6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, h6Var);
        n4Var.setText(str);
        f10.addView(n4Var, c8.ha.o(-1, -2));
        return f10;
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
            b2 b2Var = new b2(jSONArray.getJSONObject(i10));
            long j10 = b2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(b2Var);
            i10++;
            j3 = j11;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(d2 d2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (d2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(d2Var.d, new z0(tonconnectsession, 0));
                d2Var.b.L();
            }
            kVar.a(str);
        }
    }

    public static SpannableStringBuilder b(long j3) {
        String o4 = l0.o(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o4);
        int indexOf = o4.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.h6 h6Var) {
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
        linearLayout.addView(imageView, c8.ha.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams r10 = charSequence2 == null ? c8.ha.r(-1, org.telegram.messenger.g0.L(24.0f), 16) : c8.ha.o(-1, -2);
        r10.weight = 0.0f;
        linearLayout2.addView(textView, r10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g10 = org.telegram.messenger.k5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(g10, org.telegram.ui.ActionBar.m6.z6, h6Var);
            g10.setSingleLine(true);
            g10.setEllipsize(TextUtils.TruncateAt.END);
            g10.setText(charSequence2);
            linearLayout2.addView(g10, c8.ha.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, null);
            u4Var.x = false;
            u4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xl, h6Var));
            textView2.setBackground(u4Var);
            textView2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, c8.ha.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i7 = org.telegram.ui.ActionBar.m6.ik;
            }
            org.telegram.ui.ActionBar.t6.U(textView3, i7, h6Var);
            linearLayout.addView(textView3, c8.ha.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ci, h6Var);
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
        spannableString.setSpan(new wp(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) l0.o(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749516, null));
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

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var, o90 o90Var) {
        l0 x10 = l0.x(i7);
        d2 d2Var = x10.g;
        o60 o60Var = new o60(context, i7, x10, h6Var, o90Var);
        if (d2Var.h || d2Var.g != null) {
            o60Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = qp.s1(d2Var.a).e7.getString(l(j3, i10), null);
        if (string == null) {
            d2Var.h = true;
            d2Var.b.m0(new bi.f9(d2Var, j3, o60Var, i10));
            return;
        }
        d2Var.h = true;
        s sVar = new s(5, d2Var, o60Var);
        try {
            d2Var.E(j3, i10, new JSONObject(string), sVar);
        } catch (Exception e10) {
            sVar.a(i("restore response", e10));
        }
    }

    public static a2 r(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String n10 = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !n10.equals(n(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return s(i0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
    }

    public static a2 s(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        i0 i0Var2 = i0Var;
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
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new a2(jSONObject2);
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
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
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
                    i0Var2 = i0Var;
                    jSONArray2 = jSONArray;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.r2.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", qs.e4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", qs.e4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                a2 a2Var = new a2(jSONObject6);
                a2Var.d = walletownershipproof;
                return a2Var;
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

    public static a2 t(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new a2(WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(y1 y1Var) {
        if (y1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(y1Var.a).getJSONArray("items");
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

    public final boolean A(z1 z1Var) {
        if (z1Var.q) {
            return false;
        }
        String str = z1Var.h;
        l0 l0Var = this.b;
        return Objects.equals(str, l0Var.t()) && Arrays.equals(z1Var.g, l0Var.y());
    }

    public final void B(z1 z1Var, i0 i0Var, c20 c20Var) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(z1Var);
            int i7 = z1Var.b;
            TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
            if (A && !j(z1Var)) {
                String string = qp.s1(this.a).e7.getString(l(tonconnectsession.id, i7) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(i0Var, z1Var.f, "ton-connect:" + tonconnectsession.id + ":" + i7, new q(this, z1Var, i0Var, c20Var, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(this, c20Var, z1Var, i0Var, sendtransfer, 6));
                    return;
                } catch (Exception e10) {
                    c20Var.a(i("restore transfer", e10));
                    return;
                }
            }
        }
        y(z1Var, i0Var, null, 0, "Wallet unavailable or request expired", c20Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, c20 c20Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new ai.v0(this, c20Var, jSONObject, j3, i7));
    }

    public final boolean d(y1 y1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = y1Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(y1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = y1Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(y1Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        l0 l0Var = this.b;
        return str.equals(l0Var.t()) && Arrays.equals(bArr, l0Var.y());
    }

    public final void e(int i7, long j3, c20 c20Var) {
        long j10 = i7;
        qp.s1(this.a).e7.edit().remove(l(j3, j10)).remove(l(j3, j10) + ".transfer").apply();
        z1 z1Var = this.g;
        if (z1Var != null && z1Var.a.id == j3 && z1Var.b == i7) {
            z1Var.n = true;
        }
        c20Var.a(null);
    }

    public final void f(z1 z1Var, boolean z9, c20 c20Var) {
        boolean z10 = z1Var.m;
        TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
        if (z10) {
            return;
        }
        if (z1Var.n || j(z1Var) || !A(z1Var) || !(z9 || z1Var.l >= 0 || "disconnect".equals(z1Var.e) || z1Var.p)) {
            c20Var.a("Request expired, was processed, or the wallet changed");
            return;
        }
        z1Var.m = true;
        m mVar = new m(this, z1Var, c20Var, 2);
        String string = qp.s1(this.a).e7.getString(l(tonconnectsession.id, z1Var.b), null);
        if (string == null) {
            this.b.z(new w(this, mVar, z1Var, z9, 1), true, false);
            return;
        }
        try {
            try {
                E(tonconnectsession.id, z1Var.b, new JSONObject(string), mVar);
            } catch (Exception e10) {
                e = e10;
                mVar = mVar;
                mVar.a(i("restore response", e));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean j(z1 z1Var) {
        long currentTime = this.f.getCurrentTime();
        if (z1Var.c <= currentTime) {
            return true;
        }
        c2 c2Var = z1Var.f;
        if (c2Var == null) {
            return false;
        }
        long j3 = c2Var.a;
        return j3 != 0 && j3 <= currentTime;
    }

    public final void o(int i7, long j3) {
        z1 z1Var = this.g;
        if (z1Var == null || z1Var.a.id != j3 || z1Var.b != i7 || z1Var.m) {
            return;
        }
        z1Var.n = true;
        Runnable runnable = z1Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        z0 z0Var = new z0(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, z0Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        z1 z1Var = this.g;
        if (z1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = z1Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                z1Var.q = true;
                o(z1Var.b, tonconnectsession.id);
            }
        }
        qs.f(this.a).k(qs.a4, this.b, tonconnectsession);
    }

    public final void u(z1 z1Var) {
        z1Var.r = null;
        if (z1Var.m || this.g != z1Var) {
            return;
        }
        this.g = null;
    }

    public final void y(z1 z1Var, i0 i0Var, Object obj, int i7, String str, c20 c20Var) {
        Utilities.e.c(new jg.c1(this, z1Var, i7, obj, str, i0Var, c20Var, 15));
    }
}
