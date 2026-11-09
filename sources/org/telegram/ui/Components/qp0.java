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
import org.telegram.ui.h81;
import org.telegram.ui.n81;
import org.telegram.ui.o81;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 15;
        this.b = i7;
        this.d = tL_error;
        this.c = f2Var;
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
                ((v5.g) cVar2).f(new org.telegram.ui.ActionBar.m3(dVar, 28));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((v5.g) cVar2).f(new jg.a2(cVar, iVar, i7, 18));
                } else {
                    cVar.c(iVar, i7);
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.ky0) cVar.d).J(iVar, i7 + 1, false);
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
    /* JADX WARN: Type inference failed for: r11v6, types: [org.telegram.ui.ms] */
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
                v4.c0(this.b, (TLRPC.TL_error) this.d, ((zs0) this.c).x1, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
                return;
            case 1:
                wr0 wr0Var = (wr0) this.c;
                int i12 = this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                String str = (String) this.e;
                zs0 zs0Var = wr0Var.w;
                if (wr0Var.h != 0) {
                    if (i12 == wr0Var.n) {
                        int b10 = wr0Var.b();
                        wr0Var.f = arrayList4;
                        wr0Var.s--;
                        int b11 = wr0Var.b();
                        if (wr0Var.s == 0 || b11 != 0) {
                            zs0Var.B1(false);
                        }
                        int i13 = 0;
                        while (true) {
                            ur0[] ur0VarArr = zs0Var.m0;
                            if (i13 < ur0VarArr.length) {
                                ur0 ur0Var = ur0VarArr[i13];
                                if (ur0Var.E == wr0Var.r) {
                                    if (wr0Var.s == 0 && b11 == 0) {
                                        ur0Var.w.d.setText(org.telegram.messenger.id.a0("NoResultFoundFor", null, 2131748166, str));
                                        ur0VarArr[i13].w.f.setVisibility(8);
                                        ur0VarArr[i13].w.e(false, true);
                                    } else if (b10 == 0) {
                                        zs0Var.D(ur0Var.h, 0, null);
                                    }
                                }
                                i13++;
                            } else {
                                wr0Var.f();
                            }
                        }
                    }
                    wr0Var.h = 0;
                    return;
                }
                return;
            case 2:
                pw0 pw0Var = (pw0) this.c;
                String[] strArr = (String[]) this.d;
                String str2 = (String) this.e;
                int i14 = this.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i15 = pw0Var.a;
                org.telegram.messenger.ui.b0(i15).U(strArr, str2, true, new bi.i6(pw0Var, i14, str2, hashSet, arrayList5, 2), org.telegram.messenger.iz.F && org.telegram.messenger.p10.i(i15).q());
                return;
            case 3:
                pw0 pw0Var2 = (pw0) this.c;
                int i16 = this.b;
                String str3 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                if (i16 == pw0Var2.K) {
                    pw0Var2.J = str3;
                    pw0Var2.I = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        pw0Var2.y = true;
                        pw0Var2.f();
                        return;
                    }
                    pw0Var2.y = false;
                    pw0Var2.w = false;
                    pw0Var2.c();
                    bi.e5 e5Var = pw0Var2.d;
                    if (e5Var != null) {
                        e5Var.setVisibility(0);
                        pw0Var2.d.invalidate();
                    }
                    pw0Var2.x = arrayList6;
                    org.telegram.ui.l4 l4Var = pw0Var2.f;
                    if (l4Var != null) {
                        l4Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sz0 sz0Var = (sz0) this.c;
                int i17 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = sz0Var.r;
                kz0 kz0Var = editorAlert.j1;
                if (i17 != sz0Var.d) {
                    return;
                }
                sz0 sz0Var2 = editorAlert.p1;
                if (kz0Var.getAdapter() != sz0Var2) {
                    editorAlert.w1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                    kz0Var.setAdapter(sz0Var2);
                    sz0Var2.f();
                }
                boolean z9 = !sz0Var.e.isEmpty() && arrayList7.isEmpty();
                boolean z10 = sz0Var.e.isEmpty() && arrayList7.isEmpty();
                if (z9) {
                    editorAlert.w1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                }
                sz0Var.e = arrayList7;
                sz0Var.f = arrayList8;
                sz0Var.f();
                if (!z10 && !z9 && (i7 = editorAlert.w1) > 0) {
                    editorAlert.n1.h1(0, -i7);
                    editorAlert.w1 = -1000;
                }
                editorAlert.l1.c();
                return;
            case 5:
                a01 a01Var = (a01) this.c;
                uo uoVar = (uo) this.d;
                int i18 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = uoVar.b;
                if (drawable instanceof ra0) {
                    ra0 ra0Var = (ra0) drawable;
                    ra0Var.s(i18, a01.e(bitmap));
                    ra0Var.t(a01Var.L);
                    a01Var.invalidate();
                    return;
                }
                return;
            case 6:
                ?? r11 = (org.telegram.ui.ms) this.c;
                qj0 qj0Var = (qj0) this.d;
                int i19 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                if (r11.j == null) {
                    return;
                }
                qj0Var.setOnItemClickListener((cj0) null);
                qj0Var.requestDisallowInterceptTouchEvent(true);
                r11.j = null;
                r11.v(org.telegram.messenger.g0.W(qj0Var.getContext()));
                r11.i = false;
                View view = r11.h;
                if (view instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    TLRPC.Document sticker = z7Var.getSticker();
                    org.telegram.messenger.zy stickerPath = z7Var.getStickerPath();
                    String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(r11.r));
                    org.telegram.ui.ks ksVar = r11.l;
                    r11.s(sticker, stickerPath, V, ksVar != null ? ksVar.G(false) : null, null, i19, z7Var.D, z7Var.getParentObject(), r11.c0, 0);
                    z7Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                    TLRPC.Document sticker2 = x7Var.getSticker();
                    org.telegram.ui.ks ksVar2 = r11.l;
                    r11.s(sticker2, null, null, ksVar2 != null ? ksVar2.G(false) : null, null, i19, false, x7Var.getParentObject(), g6Var, 0);
                    x7Var.setScaled(true);
                    r11.i = x7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    TLRPC.Document document2 = h2Var.getDocument();
                    org.telegram.ui.ks ksVar3 = r11.l;
                    r11.s(document2, null, null, ksVar3 != null ? ksVar3.G(true) : null, h2Var.getBotInlineResult(), i19, false, h2Var.getBotInlineResult() != null ? h2Var.getInlineBot() : h2Var.getParentObject(), g6Var, 0);
                    if (i19 != 1 || r11.m) {
                        h2Var.setScaled(true);
                    }
                } else if (view instanceof ku) {
                    TLRPC.Document document3 = ((ku) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r11.s(document3, null, org.telegram.messenger.ij.V(document3, null, Integer.valueOf(r11.r)), null, null, i19, false, null, g6Var, 0);
                    }
                } else if (view instanceof qx) {
                    r5 span = ((qx) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = i5.e(r11.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r11.s(document, null, org.telegram.messenger.ij.V(document, null, Integer.valueOf(r11.r)), null, null, i19, false, null, g6Var, 0);
                    }
                } else {
                    if (!(view instanceof ow0)) {
                        return;
                    }
                    Drawable drawable2 = ((ow0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof i5 ? ((i5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r11.s(document5, null, org.telegram.messenger.ij.V(document5, null, Integer.valueOf(r11.r)), null, null, i19, false, null, g6Var, 0);
                    }
                }
                try {
                    r11.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.ks ksVar4 = r11.l;
                if (ksVar4 != null) {
                    ksVar4.t();
                    return;
                }
                return;
            case 7:
                String str4 = (String) this.c;
                int i20 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = ((org.telegram.ui.ActionBar.v2) this.d).c;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.e;
                org.telegram.messenger.g0.g(str4);
                if (i20 == 1) {
                    org.telegram.messenger.camera.q.r(null, 2131747295, new hc(l2Var, g6Var2));
                    return;
                } else {
                    new hc(l2Var, g6Var2).k(false).j();
                    return;
                }
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i21 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.e;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qs.f(i21).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.qp.s1(launchActivity.O).E(bundle, ywVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.cn(bundle), true, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i22 = this.b;
                String str6 = (String) this.e;
                r90Var.c();
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
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.q0(false);
                        r90Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str6)) {
                            r90Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str6)) {
                            r90Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str6)) {
                            r90Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str6)) {
                            r90Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str6)) {
                            r90Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str6)) {
                            r90Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str6)) {
                            r90Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str6)) {
                            r90Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str6)) {
                            r90Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str6)) {
                            r90Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str6)) {
                            r90Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str6)) {
                            r90Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str6)) {
                            r90Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str6)) {
                            return;
                        }
                        r90Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i22, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.q0(false);
                r90Var.u(notificationsCustomSettingsActivity2, false);
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
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.D;
                if (!(view2 instanceof org.telegram.ui.Cells.w9)) {
                    notificationsCustomSettingsActivity3.q0(true);
                    return;
                }
                String M0 = org.telegram.messenger.id.M0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str7, 0), iArr.length - 1, 0)], null);
                if (i23 >= 0 && i23 < arrayList9.size()) {
                    ((org.telegram.ui.mh0) arrayList9.get(i23)).f = M0;
                }
                ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131743614, "Vibrate"), M0, true, true);
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i24 = this.b;
                org.telegram.ui.di0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (x0Var != null) {
                    boolean z11 = org.telegram.ui.web.x0.Q0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    x0Var.y("oauth_result_failed", jSONObject);
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
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131747645, null);
                alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747646, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new bg.f0(passkeysActivity, passkey, str8, i25, 7));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.messenger.jc jcVar = (org.telegram.messenger.jc) this.d;
                int i26 = this.b;
                String str9 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.Y8;
                try {
                    try {
                        gf.c cVar = new gf.c(org.telegram.messenger.t0.b);
                        cVar.c(0);
                        cVar.b(0);
                        cVar.b = false;
                        bVar = cVar.a();
                        if (bVar.c.k()) {
                            org.telegram.ui.ky0 ky0Var = new org.telegram.ui.ky0(17);
                            Bitmap bitmap2 = jcVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            ky0Var.d = bitmap2;
                            b7.d dVar = (b7.d) ky0Var.b;
                            dVar.a = width;
                            dVar.b = height;
                            dVar.c = i26;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.i60(photoViewer, str9, bVar.e1(ky0Var).size() != 0, 7));
                        } else {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.d("face detection is not operational");
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.ui.oc0(photoViewer, jcVar, str9, i11));
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
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                hc.v(gp0Var.T2.D, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 15:
                v4.c0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.f2) this.c, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 16:
                h81 h81Var = (h81) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i27 = this.b;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.e;
                h81Var.getClass();
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
                h81Var.G.k.media = tL_messageMediaToDo;
                cnVar.getSendMessagesHelper().t(h81Var.G, null, null, null, null, null, null, null, false, false, null);
                cnVar.Fd(false);
                h81Var.c(false);
                return;
            case 17:
                n81 n81Var = (n81) this.c;
                int i30 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                o81 o81Var = n81Var.h;
                ArrayList arrayList12 = n81Var.d;
                ArrayList arrayList13 = n81Var.c;
                if (i30 != n81Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                n81Var.f();
                if (arrayList13.isEmpty()) {
                    o81Var.r.setVisibility(0);
                    return;
                } else {
                    o81Var.r.setVisibility(8);
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
                org.telegram.ui.Wallet.x0 x0Var2 = (org.telegram.ui.Wallet.x0) this.c;
                rc.u uVar2 = (rc.u) this.d;
                int i32 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.y0 y0Var2 = x0Var2.c;
                if (y0Var2.c(uVar2, i32)) {
                    org.telegram.ui.Wallet.l0 l0Var = y0Var2.c;
                    String str11 = y0Var2.b;
                    et etVar = y0Var2.p;
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
                            org.telegram.messenger.g0.r(etVar);
                            org.telegram.messenger.g0.i3(etVar, 15000L);
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
                org.telegram.ui.web.x0 x0Var3 = (org.telegram.ui.web.x0) this.c;
                int i34 = this.b;
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.d;
                di.p7 p7Var = (di.p7) this.e;
                org.telegram.messenger.gz.C(x0Var3.M).r0(org.telegram.messenger.ez.g(org.telegram.messenger.p10.i(x0Var3.M).f(), x0Var3.U.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.x0.w(i34, u0Var, p7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 21:
                a8.wa waVar = (a8.wa) this.c;
                int i35 = this.b;
                List list = (List) this.d;
                p4.v vVar = (p4.v) this.e;
                p4.d0 d0Var = ((p4.m0) waVar.d).h;
                if (i35 == -1) {
                    d0Var.t.x0(list);
                } else {
                    d0Var.t.b0(i35, list);
                }
                new SparseBooleanArray().append(20, true);
                d0Var.p(vVar);
                return;
            case 22:
                sg.c1 c1Var = (sg.c1) this.c;
                sg.y0 y0Var3 = (sg.y0) this.d;
                int i36 = this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = c1Var.c;
                boolean z12 = y0Var3 != null;
                c1Var.d = z12;
                if (!z12 || i36 < 0 || i36 >= arrayList15.size()) {
                    c1Var.i = arrayList14;
                } else {
                    c1Var.a++;
                    ((sg.b1) arrayList15.get(i36)).c++;
                    c1Var.g.edit().putInt(jg.g.j(i36, "score"), ((sg.b1) arrayList15.get(i36)).c).putInt("scoreall", c1Var.a).apply();
                    c1Var.i = null;
                }
                c1Var.e.a(y0Var3);
                return;
            case 23:
                tg.c2 c2Var = (tg.c2) this.c;
                c2Var.m((Bitmap) this.d, this.b, c2Var.T, c2Var.U, (org.telegram.ui.ln0) this.e);
                return;
            case 24:
                a();
                return;
            default:
                ug.i0 i0Var = (ug.i0) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                int i37 = this.b;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                qj0 qj0Var2 = i0Var.k1;
                ArrayList arrayList17 = i0Var.s2;
                arrayList17.clear();
                ArrayList arrayList18 = i0Var.r2;
                arrayList18.clear();
                arrayList17.addAll(arrayList16);
                for (int i38 = 0; i38 < i37; i38++) {
                    arrayList18.add(tL_messages_inactiveChats.chats.get(i38));
                }
                i0Var.A2 = false;
                i0Var.B2.b(i0Var.f2 + 4);
                int i39 = 0;
                while (true) {
                    if (i39 >= qj0Var2.getChildCount()) {
                        i10 = 0;
                    } else if (qj0Var2.getChildAt(i39) instanceof ug.h0) {
                        i10 = qj0Var2.getChildAt(i39).getTop();
                    } else {
                        i39++;
                    }
                }
                i0Var.G1();
                if (i0Var.d2 >= 0 && i10 != 0) {
                    ((v4.b0) qj0Var2.getLayoutManager()).h1(i0Var.d2 + 1, i10);
                }
                if (i0Var.E2 == null) {
                    i0Var.E2 = ug.i0.o1(i0Var.Z1, i0Var.a);
                }
                int max = Math.max(arrayList18.size(), i0Var.E2.b);
                ug.g0 g0Var = i0Var.p2;
                if (g0Var != null) {
                    g0Var.i(max, false);
                    i0Var.p2.setBagePosition(max / i0Var.E2.c);
                    ug.g0 g0Var2 = i0Var.p2;
                    g0Var2.H = true;
                    g0Var2.requestLayout();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ qp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ qp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }
}
