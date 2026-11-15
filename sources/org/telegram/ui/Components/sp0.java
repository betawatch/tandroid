package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.e81;
import org.telegram.ui.k81;
import org.telegram.ui.l81;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 15;
        this.b = i7;
        this.d = tL_error;
        this.c = e2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ia.c cVar = (ia.c) this.c;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.b;
        Runnable runnable = (Runnable) this.e;
        w5.c cVar2 = (w5.c) cVar.f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.z1(dVar, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((v5.g) cVar2).f(new ai.r1(cVar, iVar, i7, 19));
                } else {
                    cVar.c(iVar, i7);
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.ld0) cVar.d).H(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6, types: [org.telegram.ui.ns] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        int i10;
        int i11 = 20;
        w8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                t4.c0(this.b, (TLRPC.TL_error) this.d, ((ys0) this.c).y1, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
                return;
            case 1:
                vr0 vr0Var = (vr0) this.c;
                int i12 = this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                String str = (String) this.e;
                ys0 ys0Var = vr0Var.w;
                if (vr0Var.h != 0) {
                    if (i12 == vr0Var.n) {
                        int b10 = vr0Var.b();
                        vr0Var.f = arrayList4;
                        vr0Var.s--;
                        int b11 = vr0Var.b();
                        if (vr0Var.s == 0 || b11 != 0) {
                            ys0Var.B1(false);
                        }
                        int i13 = 0;
                        while (true) {
                            tr0[] tr0VarArr = ys0Var.n0;
                            if (i13 < tr0VarArr.length) {
                                tr0 tr0Var = tr0VarArr[i13];
                                if (tr0Var.F == vr0Var.r) {
                                    if (vr0Var.s == 0 && b11 == 0) {
                                        tr0Var.w.d.setText(org.telegram.messenger.hd.a0("NoResultFoundFor", null, 2131748166, str));
                                        tr0VarArr[i13].w.f.setVisibility(8);
                                        tr0VarArr[i13].w.e(false, true);
                                    } else if (b10 == 0) {
                                        ys0Var.D(tr0Var.h, 0, null);
                                    }
                                }
                                i13++;
                            } else {
                                vr0Var.f();
                            }
                        }
                    }
                    vr0Var.h = 0;
                    return;
                }
                return;
            case 2:
                rw0 rw0Var = (rw0) this.c;
                String[] strArr = (String[]) this.d;
                String str2 = (String) this.e;
                int i14 = this.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i15 = rw0Var.a;
                org.telegram.messenger.si.b0(i15).U(strArr, str2, true, new bi.b3(rw0Var, i14, str2, hashSet, arrayList5, 3), org.telegram.messenger.gz.F && org.telegram.messenger.m10.i(i15).q());
                return;
            case 3:
                rw0 rw0Var2 = (rw0) this.c;
                int i16 = this.b;
                String str3 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                if (i16 == rw0Var2.L) {
                    rw0Var2.K = str3;
                    rw0Var2.J = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        rw0Var2.y = true;
                        rw0Var2.f();
                        return;
                    }
                    rw0Var2.y = false;
                    rw0Var2.w = false;
                    rw0Var2.c();
                    bi.g2 g2Var = rw0Var2.d;
                    if (g2Var != null) {
                        g2Var.setVisibility(0);
                        rw0Var2.d.invalidate();
                    }
                    rw0Var2.x = arrayList6;
                    org.telegram.ui.l4 l4Var = rw0Var2.f;
                    if (l4Var != null) {
                        l4Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                tz0 tz0Var = (tz0) this.c;
                int i17 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = tz0Var.r;
                lz0 lz0Var = editorAlert.n1;
                if (i17 != tz0Var.d) {
                    return;
                }
                tz0 tz0Var2 = editorAlert.t1;
                if (lz0Var.getAdapter() != tz0Var2) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                    lz0Var.setAdapter(tz0Var2);
                    tz0Var2.f();
                }
                boolean z10 = !tz0Var.e.isEmpty() && arrayList7.isEmpty();
                boolean z11 = tz0Var.e.isEmpty() && arrayList7.isEmpty();
                if (z10) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                }
                tz0Var.e = arrayList7;
                tz0Var.f = arrayList8;
                tz0Var.f();
                if (!z11 && !z10 && (i7 = editorAlert.A1) > 0) {
                    editorAlert.r1.h1(0, -i7);
                    editorAlert.A1 = -1000;
                }
                editorAlert.p1.c();
                return;
            case 5:
                b01 b01Var = (b01) this.c;
                dp dpVar = (dp) this.d;
                int i18 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = dpVar.b;
                if (drawable instanceof ra0) {
                    ra0 ra0Var = (ra0) drawable;
                    ra0Var.s(i18, b01.e(bitmap));
                    ra0Var.t(b01Var.M);
                    b01Var.invalidate();
                    return;
                }
                return;
            case 6:
                ?? r11 = (org.telegram.ui.ns) this.c;
                uj0 uj0Var = (uj0) this.d;
                int i19 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                if (r11.j == null) {
                    return;
                }
                uj0Var.setOnItemClickListener((gj0) null);
                uj0Var.requestDisallowInterceptTouchEvent(true);
                r11.j = null;
                r11.v(org.telegram.messenger.g0.W(uj0Var.getContext()));
                r11.i = false;
                View view = r11.h;
                if (view instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    TLRPC.Document sticker = y7Var.getSticker();
                    org.telegram.messenger.xy stickerPath = y7Var.getStickerPath();
                    String V = org.telegram.messenger.gj.V(y7Var.getSticker(), null, Integer.valueOf(r11.r));
                    org.telegram.ui.ls lsVar = r11.l;
                    r11.s(sticker, stickerPath, V, lsVar != null ? lsVar.G(false) : null, null, i19, y7Var.E, y7Var.getParentObject(), r11.c0, 0);
                    y7Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                    TLRPC.Document sticker2 = w7Var.getSticker();
                    org.telegram.ui.ls lsVar2 = r11.l;
                    r11.s(sticker2, null, null, lsVar2 != null ? lsVar2.G(false) : null, null, i19, false, w7Var.getParentObject(), e6Var, 0);
                    w7Var.setScaled(true);
                    r11.i = w7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    TLRPC.Document document2 = h2Var.getDocument();
                    org.telegram.ui.ls lsVar3 = r11.l;
                    r11.s(document2, null, null, lsVar3 != null ? lsVar3.G(true) : null, h2Var.getBotInlineResult(), i19, false, h2Var.getBotInlineResult() != null ? h2Var.getInlineBot() : h2Var.getParentObject(), e6Var, 0);
                    if (i19 != 1 || r11.m) {
                        h2Var.setScaled(true);
                    }
                } else if (view instanceof pu) {
                    TLRPC.Document document3 = ((pu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r11.s(document3, null, org.telegram.messenger.gj.V(document3, null, Integer.valueOf(r11.r)), null, null, i19, false, null, e6Var, 0);
                    }
                } else if (view instanceof ux) {
                    p5 span = ((ux) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = g5.e(r11.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r11.s(document, null, org.telegram.messenger.gj.V(document, null, Integer.valueOf(r11.r)), null, null, i19, false, null, e6Var, 0);
                    }
                } else {
                    if (!(view instanceof qw0)) {
                        return;
                    }
                    Drawable drawable2 = ((qw0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof g5 ? ((g5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r11.s(document5, null, org.telegram.messenger.gj.V(document5, null, Integer.valueOf(r11.r)), null, null, i19, false, null, e6Var, 0);
                    }
                }
                try {
                    r11.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.ls lsVar4 = r11.l;
                if (lsVar4 != null) {
                    lsVar4.s();
                    return;
                }
                return;
            case 7:
                String str4 = (String) this.c;
                int i20 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var = ((org.telegram.ui.ActionBar.u2) this.d).c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.messenger.g0.g(str4);
                if (i20 == 1) {
                    org.telegram.messenger.i20.s(null, 2131747295, new cc(k2Var, e6Var2));
                    return;
                } else {
                    new cc(k2Var, e6Var2).k(false).j();
                    return;
                }
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i21 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.e;
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.ns.f(i21).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.np.s1(launchActivity.P).E(bundle, ywVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.an(bundle), true, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.q90 q90Var = (org.telegram.ui.q90) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i22 = this.b;
                String str6 = (String) this.e;
                q90Var.c();
                if (i22 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i22 != 0) {
                        if (i22 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i22 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i22, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.H = true;
                        notificationsCustomSettingsActivity.q0(false);
                        q90Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str6)) {
                            q90Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str6)) {
                            q90Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str6)) {
                            q90Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str6)) {
                            q90Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str6)) {
                            q90Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str6)) {
                            q90Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str6)) {
                            q90Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str6)) {
                            q90Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str6)) {
                            q90Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str6)) {
                            q90Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str6)) {
                            q90Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str6)) {
                            q90Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str6)) {
                            q90Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str6)) {
                            return;
                        }
                        q90Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i22, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.H = true;
                notificationsCustomSettingsActivity2.q0(false);
                q90Var.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str6)) {
                }
                if ("new".equalsIgnoreCase(str6)) {
                }
                if ("important".equalsIgnoreCase(str6)) {
                }
                if ("messages".equalsIgnoreCase(str6)) {
                }
                if ("stories".equalsIgnoreCase(str6)) {
                }
                if ("preview".equalsIgnoreCase(str6)) {
                }
                if ("show-sender".equalsIgnoreCase(str6)) {
                }
                if ("sound".equalsIgnoreCase(str6)) {
                }
                if ("add-exception".equalsIgnoreCase(str6)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str6)) {
                }
                if ("light-color".equalsIgnoreCase(str6)) {
                }
                if ("vibrate".equalsIgnoreCase(str6)) {
                }
                if ("popup".equalsIgnoreCase(str6)) {
                }
                if ("priority".equalsIgnoreCase(str6)) {
                }
            case 10:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.c;
                View view2 = (View) this.d;
                String str7 = (String) this.e;
                int i23 = this.b;
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.J;
                int[] iArr = notificationsCustomSettingsActivity3.E;
                if (!(view2 instanceof org.telegram.ui.Cells.v9)) {
                    notificationsCustomSettingsActivity3.q0(true);
                    return;
                }
                String M0 = org.telegram.messenger.hd.M0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str7, 0), iArr.length - 1, 0)], null);
                if (i23 >= 0 && i23 < arrayList9.size()) {
                    ((org.telegram.ui.mh0) arrayList9.get(i23)).f = M0;
                }
                ((org.telegram.ui.Cells.v9) view2).c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), M0, true, true);
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i24 = this.b;
                org.telegram.ui.di0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (v0Var != null) {
                    boolean z12 = org.telegram.ui.web.v0.R0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    v0Var.y("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i24).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 12:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str8 = (String) this.e;
                int i25 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131747645, null);
                alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131747646, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new bg.f0(passkeysActivity, passkey, str8, i25, 7));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.d;
                int i26 = this.b;
                String str9 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.Z8;
                try {
                    try {
                        gf.c cVar = new gf.c(org.telegram.messenger.t0.b);
                        cVar.c(0);
                        cVar.b(0);
                        cVar.b = false;
                        bVar = cVar.a();
                        if (bVar.c.k()) {
                            org.telegram.ui.ld0 ld0Var = new org.telegram.ui.ld0(18);
                            Bitmap bitmap2 = icVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            ld0Var.d = bitmap2;
                            b7.d dVar = (b7.d) ld0Var.b;
                            dVar.a = width;
                            dVar.b = height;
                            dVar.c = i26;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.f60(photoViewer, str9, bVar.e1(ld0Var).size() != 0, 7));
                        } else {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.d("face detection is not operational");
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.ui.lc0(photoViewer, icVar, str9, i11));
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        if (0 == 0) {
                            return;
                        }
                    }
                    bVar.X0();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r8.X0();
                    }
                    throw th2;
                }
            case 14:
                org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                cc.v(cp0Var.X2.E, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 15:
                t4.c0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.e2) this.c, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 16:
                e81 e81Var = (e81) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i27 = this.b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.e;
                e81Var.getClass();
                int i28 = 0;
                while (i28 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i28).id == i27) {
                        tL_messageMediaToDo.todo.list.remove(i28);
                        i28--;
                    }
                    i28++;
                }
                int i29 = 0;
                while (i29 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i29).id == i27) {
                        tL_messageMediaToDo.completions.remove(i29);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i29--;
                    }
                    i29++;
                }
                e81Var.H.k.media = tL_messageMediaToDo;
                anVar.getSendMessagesHelper().t(e81Var.H, null, null, null, null, null, null, null, false, false, null);
                anVar.Gd(false);
                e81Var.c(false);
                return;
            case 17:
                k81 k81Var = (k81) this.c;
                int i30 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                l81 l81Var = k81Var.h;
                ArrayList arrayList12 = k81Var.d;
                ArrayList arrayList13 = k81Var.c;
                if (i30 != k81Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                k81Var.f();
                if (arrayList13.isEmpty()) {
                    l81Var.r.setVisibility(0);
                    return;
                } else {
                    l81Var.r.setVisibility(8);
                    return;
                }
            case 18:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.c;
                rc.u uVar = (rc.u) this.d;
                int i31 = this.b;
                String str10 = (String) this.e;
                if (y0Var.c(uVar, i31)) {
                    y0Var.f(str10);
                    return;
                }
                y0Var.d("ignoring stale socket callback; attempt=" + i31 + ", " + str10);
                return;
            case 19:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.c;
                rc.u uVar2 = (rc.u) this.d;
                int i32 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.y0 y0Var2 = x0Var.c;
                if (y0Var2.c(uVar2, i32)) {
                    org.telegram.ui.Wallet.l0 l0Var = y0Var2.c;
                    String str11 = y0Var2.b;
                    zj zjVar = y0Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        y0Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        y0Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        y0Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(y0Var2.f, jSONObject2.optString("id"))) {
                            y0Var2.e = true;
                            y0Var2.j = 0;
                            y0Var2.l = SystemClock.elapsedRealtime();
                            org.telegram.messenger.g0.r(y0Var2.o);
                            org.telegram.messenger.g0.r(zjVar);
                            org.telegram.messenger.g0.i3(zjVar, 15000L);
                            y0Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        y0Var2.d("received pong");
                        y0Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!y0Var2.e) {
                        y0Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.l0.b(str11, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            y0Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
                            return;
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("transactions");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("state");
                        StringBuilder u10 = a8.p0.u("event type=", optString2, ", finality=");
                        u10.append(jSONObject2.optString("finality"));
                        u10.append(", trace=");
                        u10.append(jSONObject2.optString("trace_external_hash_norm"));
                        u10.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                        u10.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                        y0Var2.d(u10.toString());
                        if (!"transactions".equals(optString2)) {
                            l0Var.M(jSONObject2);
                            return;
                        }
                        if (str11 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i33 = 0; i33 < optJSONArray.length(); i33++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i33);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.l0.b(str11, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            l0Var.M(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            y0Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) this.c;
                int i34 = this.b;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.d;
                fi.i7 i7Var = (fi.i7) this.e;
                org.telegram.messenger.ez.C(v0Var2.N).r0(org.telegram.messenger.cz.g(org.telegram.messenger.m10.i(v0Var2.N).f(), v0Var2.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.v0.w(i34, s0Var, i7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 21:
                a8.xa xaVar = (a8.xa) this.c;
                int i35 = this.b;
                List list = (List) this.d;
                p4.v vVar = (p4.v) this.e;
                p4.d0 d0Var = ((p4.m0) xaVar.d).h;
                if (i35 == -1) {
                    d0Var.t.x0(list);
                } else {
                    d0Var.t.b0(i35, list);
                }
                new SparseBooleanArray().append(20, true);
                d0Var.p(vVar);
                return;
            case 22:
                sg.b1 b1Var = (sg.b1) this.c;
                sg.x0 x0Var2 = (sg.x0) this.d;
                int i36 = this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = b1Var.c;
                boolean z13 = x0Var2 != null;
                b1Var.d = z13;
                if (!z13 || i36 < 0 || i36 >= arrayList15.size()) {
                    b1Var.i = arrayList14;
                } else {
                    b1Var.a++;
                    ((sg.a1) arrayList15.get(i36)).c++;
                    b1Var.g.edit().putInt(i5.c.i(i36, "score"), ((sg.a1) arrayList15.get(i36)).c).putInt("scoreall", b1Var.a).apply();
                    b1Var.i = null;
                }
                b1Var.e.a(x0Var2);
                return;
            case 23:
                tg.e2 e2Var = (tg.e2) this.c;
                e2Var.m((Bitmap) this.d, this.b, e2Var.U, e2Var.V, (org.telegram.ui.ln0) this.e);
                return;
            case 24:
                a();
                return;
            default:
                ug.j0 j0Var = (ug.j0) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                int i37 = this.b;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                uj0 uj0Var2 = j0Var.o1;
                ArrayList arrayList17 = j0Var.w2;
                arrayList17.clear();
                ArrayList arrayList18 = j0Var.v2;
                arrayList18.clear();
                arrayList17.addAll(arrayList16);
                for (int i38 = 0; i38 < i37; i38++) {
                    arrayList18.add(tL_messages_inactiveChats.chats.get(i38));
                }
                j0Var.E2 = false;
                j0Var.F2.b(j0Var.j2 + 4);
                int i39 = 0;
                while (true) {
                    if (i39 >= uj0Var2.getChildCount()) {
                        i10 = 0;
                    } else if (uj0Var2.getChildAt(i39) instanceof ug.i0) {
                        i10 = uj0Var2.getChildAt(i39).getTop();
                    } else {
                        i39++;
                    }
                }
                j0Var.G1();
                if (j0Var.h2 >= 0 && i10 != 0) {
                    ((v4.b0) uj0Var2.getLayoutManager()).h1(j0Var.h2 + 1, i10);
                }
                if (j0Var.I2 == null) {
                    j0Var.I2 = ug.j0.o1(j0Var.d2, j0Var.a);
                }
                int max = Math.max(arrayList18.size(), j0Var.I2.b);
                ug.h0 h0Var = j0Var.t2;
                if (h0Var != null) {
                    h0Var.i(max, false);
                    j0Var.t2.setBagePosition(max / j0Var.I2.c);
                    ug.h0 h0Var2 = j0Var.t2;
                    h0Var2.I = true;
                    h0Var2.requestLayout();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ sp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ sp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ sp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }
}
