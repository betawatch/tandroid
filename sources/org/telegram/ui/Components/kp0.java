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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.i81;
import org.telegram.ui.o81;
import org.telegram.ui.p81;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 16;
        this.c = i7;
        this.b = tL_error;
        this.d = h2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        tg.e2 e2Var = (tg.e2) this.b;
        Bitmap bitmap = (Bitmap) this.d;
        org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.e;
        e2Var.m(bitmap, this.c, e2Var.U, e2Var.V, on0Var);
    }

    private final void b() {
        ia.c cVar = (ia.c) this.b;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.c;
        Runnable runnable = (Runnable) this.e;
        w5.c cVar2 = (w5.c) cVar.f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.z1(dVar, 4));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((v5.g) cVar2).f(new ai.r1(cVar, iVar, i7, 20));
                } else {
                    cVar.c(iVar, i7);
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.md0) cVar.d).H(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0736  */
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
                gt0.d((gt0) this.b, this.c, (TL_stories.StoryItem) this.d, (String) this.e);
                return;
            case 1:
                b5.c0(this.c, (TLRPC.TL_error) this.d, ((gt0) this.b).y1, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
                return;
            case 2:
                ds0 ds0Var = (ds0) this.b;
                int i12 = this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                String str = (String) this.e;
                gt0 gt0Var = ds0Var.w;
                if (ds0Var.h != 0) {
                    if (i12 == ds0Var.n) {
                        int b10 = ds0Var.b();
                        ds0Var.f = arrayList4;
                        ds0Var.s--;
                        int b11 = ds0Var.b();
                        if (ds0Var.s == 0 || b11 != 0) {
                            gt0Var.B1(false);
                        }
                        int i13 = 0;
                        while (true) {
                            bs0[] bs0VarArr = gt0Var.n0;
                            if (i13 < bs0VarArr.length) {
                                bs0 bs0Var = bs0VarArr[i13];
                                if (bs0Var.F == ds0Var.r) {
                                    if (ds0Var.s == 0 && b11 == 0) {
                                        bs0Var.w.d.setText(org.telegram.messenger.gd.a0("NoResultFoundFor", null, 2131747974, str));
                                        bs0VarArr[i13].w.f.setVisibility(8);
                                        bs0VarArr[i13].w.e(false, true);
                                    } else if (b10 == 0) {
                                        gt0Var.D(bs0Var.h, 0, null);
                                    }
                                }
                                i13++;
                            } else {
                                ds0Var.f();
                            }
                        }
                    }
                    ds0Var.h = 0;
                    return;
                }
                return;
            case 3:
                yw0 yw0Var = (yw0) this.b;
                String[] strArr = (String[]) this.d;
                String str2 = (String) this.e;
                int i14 = this.c;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i15 = yw0Var.a;
                org.telegram.messenger.ri.d0(i15).W(strArr, str2, true, new bi.j5(yw0Var, i14, str2, hashSet, arrayList5, 3), org.telegram.messenger.bz.F && org.telegram.messenger.j10.i(i15).q());
                return;
            case 4:
                yw0 yw0Var2 = (yw0) this.b;
                int i16 = this.c;
                String str3 = (String) this.e;
                ArrayList arrayList6 = (ArrayList) this.d;
                if (i16 == yw0Var2.L) {
                    yw0Var2.K = str3;
                    yw0Var2.J = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        yw0Var2.y = true;
                        yw0Var2.f();
                        return;
                    }
                    yw0Var2.y = false;
                    yw0Var2.w = false;
                    yw0Var2.c();
                    bi.a3 a3Var = yw0Var2.d;
                    if (a3Var != null) {
                        a3Var.setVisibility(0);
                        yw0Var2.d.invalidate();
                    }
                    yw0Var2.x = arrayList6;
                    org.telegram.ui.l4 l4Var = yw0Var2.f;
                    if (l4Var != null) {
                        l4Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a01 a01Var = (a01) this.b;
                int i17 = this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = a01Var.r;
                sz0 sz0Var = editorAlert.n1;
                if (i17 != a01Var.d) {
                    return;
                }
                a01 a01Var2 = editorAlert.t1;
                if (sz0Var.getAdapter() != a01Var2) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.K0(editorAlert);
                    sz0Var.setAdapter(a01Var2);
                    a01Var2.f();
                }
                boolean z10 = !a01Var.e.isEmpty() && arrayList7.isEmpty();
                boolean z11 = a01Var.e.isEmpty() && arrayList7.isEmpty();
                if (z10) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.K0(editorAlert);
                }
                a01Var.e = arrayList7;
                a01Var.f = arrayList8;
                a01Var.f();
                if (!z11 && !z10 && (i7 = editorAlert.A1) > 0) {
                    editorAlert.r1.h1(0, -i7);
                    editorAlert.A1 = -1000;
                }
                editorAlert.p1.c();
                return;
            case 6:
                j01 j01Var = (j01) this.b;
                kp kpVar = (kp) this.d;
                int i18 = this.c;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = kpVar.b;
                if (drawable instanceof bb0) {
                    bb0 bb0Var = (bb0) drawable;
                    bb0Var.s(i18, j01.e(bitmap));
                    bb0Var.t(j01Var.M);
                    j01Var.invalidate();
                    return;
                }
                return;
            case 7:
                ?? r11 = (org.telegram.ui.ns) this.b;
                ck0 ck0Var = (ck0) this.d;
                int i19 = this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                if (r11.j == null) {
                    return;
                }
                ck0Var.setOnItemClickListener((oj0) null);
                ck0Var.requestDisallowInterceptTouchEvent(true);
                r11.j = null;
                r11.v(org.telegram.messenger.g0.W(ck0Var.getContext()));
                r11.i = false;
                View view = r11.h;
                if (view instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    TLRPC.Document sticker = z7Var.getSticker();
                    org.telegram.messenger.sy stickerPath = z7Var.getStickerPath();
                    String V = org.telegram.messenger.fj.V(z7Var.getSticker(), null, Integer.valueOf(r11.r));
                    org.telegram.ui.ls lsVar = r11.l;
                    r11.s(sticker, stickerPath, V, lsVar != null ? lsVar.G(false) : null, null, i19, z7Var.E, z7Var.getParentObject(), r11.c0, 0);
                    z7Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                    TLRPC.Document sticker2 = x7Var.getSticker();
                    org.telegram.ui.ls lsVar2 = r11.l;
                    r11.s(sticker2, null, null, lsVar2 != null ? lsVar2.G(false) : null, null, i19, false, x7Var.getParentObject(), i6Var, 0);
                    x7Var.setScaled(true);
                    r11.i = x7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    TLRPC.Document document2 = h2Var.getDocument();
                    org.telegram.ui.ls lsVar3 = r11.l;
                    r11.s(document2, null, null, lsVar3 != null ? lsVar3.G(true) : null, h2Var.getBotInlineResult(), i19, false, h2Var.getBotInlineResult() != null ? h2Var.getInlineBot() : h2Var.getParentObject(), i6Var, 0);
                    if (i19 != 1 || r11.m) {
                        h2Var.setScaled(true);
                    }
                } else if (view instanceof uu) {
                    TLRPC.Document document3 = ((uu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r11.s(document3, null, org.telegram.messenger.fj.V(document3, null, Integer.valueOf(r11.r)), null, null, i19, false, null, i6Var, 0);
                    }
                } else if (view instanceof zx) {
                    x5 span = ((zx) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = o5.e(r11.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r11.s(document, null, org.telegram.messenger.fj.V(document, null, Integer.valueOf(r11.r)), null, null, i19, false, null, i6Var, 0);
                    }
                } else {
                    if (!(view instanceof xw0)) {
                        return;
                    }
                    Drawable drawable2 = ((xw0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof o5 ? ((o5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r11.s(document5, null, org.telegram.messenger.fj.V(document5, null, Integer.valueOf(r11.r)), null, null, i19, false, null, i6Var, 0);
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
            case 8:
                String str4 = (String) this.e;
                int i20 = this.c;
                org.telegram.ui.ActionBar.n2 n2Var = ((org.telegram.ui.ActionBar.x2) this.b).c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                org.telegram.messenger.g0.g(str4);
                if (i20 == 1) {
                    org.telegram.messenger.n10.t(null, 2131747102, new lc(n2Var, i6Var2));
                    return;
                } else {
                    new lc(n2Var, i6Var2).k(false).j();
                    return;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                int i21 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.e;
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.ks.f(i21).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.mp.u1(launchActivity.P).E(bundle, cxVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.bn(bundle), true, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) this.b;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i22 = this.c;
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
                        notificationsCustomSettingsActivity.H = true;
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
                notificationsCustomSettingsActivity2.H = true;
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
            case 11:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.b;
                View view2 = (View) this.d;
                String str7 = (String) this.e;
                int i23 = this.c;
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.J;
                int[] iArr = notificationsCustomSettingsActivity3.E;
                if (!(view2 instanceof org.telegram.ui.Cells.w9)) {
                    notificationsCustomSettingsActivity3.q0(true);
                    return;
                }
                String M0 = org.telegram.messenger.gd.M0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str7, 0), iArr.length - 1, 0)], null);
                if (i23 >= 0 && i23 < arrayList9.size()) {
                    ((org.telegram.ui.ph0) arrayList9.get(i23)).f = M0;
                }
                ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), M0, true, true);
                return;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i24 = this.c;
                org.telegram.ui.gi0.a = null;
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
            case 13:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str8 = (String) this.e;
                int i25 = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131747452, null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131747453, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new bg.g0(passkeysActivity, passkey, str8, i25, 7));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.d;
                int i26 = this.c;
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
                            org.telegram.ui.md0 md0Var = new org.telegram.ui.md0(18);
                            Bitmap bitmap2 = hcVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            md0Var.d = bitmap2;
                            b7.d dVar = (b7.d) md0Var.b;
                            dVar.a = width;
                            dVar.b = height;
                            dVar.c = i26;
                            org.telegram.messenger.g0.g3(new org.telegram.ui.a80(photoViewer, str9, bVar.e1(md0Var).size() != 0, 6));
                        } else {
                            if (org.telegram.messenger.s2.a) {
                                org.telegram.messenger.a8.d("face detection is not operational");
                            }
                            org.telegram.messenger.g0.g3(new org.telegram.ui.lc0(photoViewer, hcVar, str9, i11));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r8.X0();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    if (0 == 0) {
                        return;
                    }
                }
                bVar.X0();
                return;
            case 15:
                org.telegram.ui.fp0 fp0Var = (org.telegram.ui.fp0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                lc.v(fp0Var.X2.E, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.c, -115203550, -1, 1500, false, null).j();
                return;
            case 16:
                b5.c0(this.c, (TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.h2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 17:
                i81 i81Var = (i81) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i27 = this.c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.e;
                i81Var.getClass();
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
                i81Var.H.k.media = tL_messageMediaToDo;
                bnVar.getSendMessagesHelper().t(i81Var.H, null, null, null, null, null, null, null, false, false, null);
                bnVar.Gd(false);
                i81Var.c(false);
                return;
            case 18:
                o81 o81Var = (o81) this.b;
                int i30 = this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                p81 p81Var = o81Var.h;
                ArrayList arrayList12 = o81Var.d;
                ArrayList arrayList13 = o81Var.c;
                if (i30 != o81Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                o81Var.f();
                if (arrayList13.isEmpty()) {
                    p81Var.r.setVisibility(0);
                    return;
                } else {
                    p81Var.r.setVisibility(8);
                    return;
                }
            case 19:
                org.telegram.ui.Wallet.i1 i1Var = (org.telegram.ui.Wallet.i1) this.b;
                rc.u uVar = (rc.u) this.d;
                int i31 = this.c;
                String str10 = (String) this.e;
                if (i1Var.c(uVar, i31)) {
                    i1Var.f(str10);
                    return;
                }
                i1Var.d("ignoring stale socket callback; attempt=" + i31 + ", " + str10);
                return;
            case 20:
                org.telegram.ui.Wallet.h1 h1Var = (org.telegram.ui.Wallet.h1) this.b;
                rc.u uVar2 = (rc.u) this.d;
                int i32 = this.c;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.i1 i1Var2 = h1Var.c;
                if (i1Var2.c(uVar2, i32)) {
                    org.telegram.ui.Wallet.u0 u0Var = i1Var2.c;
                    String str11 = i1Var2.b;
                    gk gkVar = i1Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        i1Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        i1Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        i1Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(i1Var2.f, jSONObject2.optString("id"))) {
                            i1Var2.e = true;
                            i1Var2.j = 0;
                            i1Var2.l = SystemClock.elapsedRealtime();
                            org.telegram.messenger.g0.r(i1Var2.o);
                            org.telegram.messenger.g0.r(gkVar);
                            org.telegram.messenger.g0.h3(gkVar, 15000L);
                            i1Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        i1Var2.d("received pong");
                        i1Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!i1Var2.e) {
                        i1Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.u0.c(str11, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            i1Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
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
                        i1Var2.d(u10.toString());
                        if (!"transactions".equals(optString2)) {
                            u0Var.U(jSONObject2);
                            return;
                        }
                        if (str11 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i33 = 0; i33 < optJSONArray.length(); i33++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i33);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.u0.c(str11, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            u0Var.U(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            i1Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) this.b;
                int i34 = this.c;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.d;
                fi.f7 f7Var = (fi.f7) this.e;
                org.telegram.messenger.zy.C(v0Var2.N).r0(org.telegram.messenger.xy.g(org.telegram.messenger.j10.i(v0Var2.N).f(), v0Var2.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.v0.w(i34, s0Var, f7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 22:
                a8.xa xaVar = (a8.xa) this.b;
                int i35 = this.c;
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
            case 23:
                sg.b1 b1Var = (sg.b1) this.b;
                sg.x0 x0Var = (sg.x0) this.d;
                int i36 = this.c;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = b1Var.c;
                boolean z13 = x0Var != null;
                b1Var.d = z13;
                if (!z13 || i36 < 0 || i36 >= arrayList15.size()) {
                    b1Var.i = arrayList14;
                } else {
                    b1Var.a++;
                    ((sg.a1) arrayList15.get(i36)).c++;
                    b1Var.g.edit().putInt(i5.c.i(i36, "score"), ((sg.a1) arrayList15.get(i36)).c).putInt("scoreall", b1Var.a).apply();
                    b1Var.i = null;
                }
                b1Var.e.a(x0Var);
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            default:
                ug.l0 l0Var = (ug.l0) this.b;
                ArrayList arrayList16 = (ArrayList) this.d;
                int i37 = this.c;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                ck0 ck0Var2 = l0Var.o1;
                ArrayList arrayList17 = l0Var.w2;
                arrayList17.clear();
                ArrayList arrayList18 = l0Var.v2;
                arrayList18.clear();
                arrayList17.addAll(arrayList16);
                for (int i38 = 0; i38 < i37; i38++) {
                    arrayList18.add(tL_messages_inactiveChats.chats.get(i38));
                }
                l0Var.E2 = false;
                l0Var.F2.b(l0Var.j2 + 4);
                int i39 = 0;
                while (true) {
                    if (i39 >= ck0Var2.getChildCount()) {
                        i10 = 0;
                    } else if (ck0Var2.getChildAt(i39) instanceof ug.k0) {
                        i10 = ck0Var2.getChildAt(i39).getTop();
                    } else {
                        i39++;
                    }
                }
                l0Var.H1();
                if (l0Var.h2 >= 0 && i10 != 0) {
                    ((v4.c0) ck0Var2.getLayoutManager()).h1(l0Var.h2 + 1, i10);
                }
                if (l0Var.I2 == null) {
                    l0Var.I2 = ug.l0.p1(l0Var.d2, l0Var.a);
                }
                int max = Math.max(arrayList18.size(), l0Var.I2.b);
                ug.j0 j0Var = l0Var.t2;
                if (j0Var != null) {
                    j0Var.i(max, false);
                    l0Var.t2.setBagePosition(max / l0Var.I2.c);
                    ug.j0 j0Var2 = l0Var.t2;
                    j0Var2.I = true;
                    j0Var2.requestLayout();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ kp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i7;
        this.e = obj3;
    }

    public /* synthetic */ kp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i7;
    }

    public /* synthetic */ kp0(String str, int i7, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = 8;
        this.e = str;
        this.c = i7;
        this.b = x2Var;
        this.d = i6Var;
    }

    public /* synthetic */ kp0(yw0 yw0Var, int i7, String str, ArrayList arrayList) {
        this.a = 4;
        this.b = yw0Var;
        this.c = i7;
        this.e = str;
        this.d = arrayList;
    }
}
