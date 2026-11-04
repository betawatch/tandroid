package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.ui.c81;
import org.telegram.ui.d81;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zo0(int i3, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 16;
        this.c = i3;
        this.b = tL_error;
        this.d = d2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ha.c cVar = (ha.c) this.b;
        n5.i iVar = (n5.i) this.d;
        int i3 = this.c;
        Runnable runnable = (Runnable) this.e;
        v5.c cVar2 = (v5.c) cVar.f;
        try {
            try {
                u5.d dVar = (u5.d) cVar.c;
                Objects.requireNonNull(dVar);
                ((u5.g) cVar2).f(new org.telegram.ui.ActionBar.e3(dVar, 12));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((u5.g) cVar2).f(new k2.y(cVar, iVar, i3, 18));
                } else {
                    cVar.c(iVar, i3);
                }
                runnable.run();
            } catch (v5.a unused) {
                ((p7.d) cVar.d).E(iVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [org.telegram.ui.is] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        int i10;
        v8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                ws0.d((ws0) this.b, this.c, (TL_stories.StoryItem) this.d, (String) this.e);
                return;
            case 1:
                t4.e0(this.c, (TLRPC.TL_error) this.d, ((ws0) this.b).y1, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
                return;
            case 2:
                tr0 tr0Var = (tr0) this.b;
                int i11 = this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                String str = (String) this.e;
                ws0 ws0Var = tr0Var.w;
                if (tr0Var.h != 0) {
                    if (i11 == tr0Var.n) {
                        int b10 = tr0Var.b();
                        tr0Var.f = arrayList4;
                        tr0Var.s--;
                        int b11 = tr0Var.b();
                        if (tr0Var.s == 0 || b11 != 0) {
                            ws0Var.z1(false);
                        }
                        int i12 = 0;
                        while (true) {
                            rr0[] rr0VarArr = ws0Var.n0;
                            if (i12 < rr0VarArr.length) {
                                rr0 rr0Var = rr0VarArr[i12];
                                if (rr0Var.F == tr0Var.r) {
                                    if (tr0Var.s == 0 && b11 == 0) {
                                        rr0Var.w.d.setText(org.telegram.messenger.bd.a0("NoResultFoundFor", null, 2131748174, str));
                                        rr0VarArr[i12].w.f.setVisibility(8);
                                        rr0VarArr[i12].w.e(false, true);
                                    } else if (b10 == 0) {
                                        ws0Var.D(rr0Var.h, 0, null);
                                    }
                                }
                                i12++;
                            } else {
                                tr0Var.f();
                            }
                        }
                    }
                    tr0Var.h = 0;
                    return;
                }
                return;
            case 3:
                ow0 ow0Var = (ow0) this.b;
                String[] strArr = (String[]) this.d;
                String str2 = (String) this.e;
                int i13 = this.c;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i14 = ow0Var.a;
                org.telegram.messenger.li.b0(i14).U(strArr, str2, true, new ai.m3(ow0Var, i13, str2, hashSet, arrayList5, 3), org.telegram.messenger.az.F && org.telegram.messenger.h10.i(i14).q());
                return;
            case 4:
                ow0 ow0Var2 = (ow0) this.b;
                int i15 = this.c;
                String str3 = (String) this.e;
                ArrayList arrayList6 = (ArrayList) this.d;
                if (i15 == ow0Var2.L) {
                    ow0Var2.K = str3;
                    ow0Var2.J = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        ow0Var2.y = true;
                        ow0Var2.f();
                        return;
                    }
                    ow0Var2.y = false;
                    ow0Var2.w = false;
                    ow0Var2.c();
                    kw0 kw0Var = ow0Var2.d;
                    if (kw0Var != null) {
                        kw0Var.setVisibility(0);
                        ow0Var2.d.invalidate();
                    }
                    ow0Var2.x = arrayList6;
                    org.telegram.ui.n4 n4Var = ow0Var2.f;
                    if (n4Var != null) {
                        n4Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                qz0 qz0Var = (qz0) this.b;
                int i16 = this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = qz0Var.r;
                iz0 iz0Var = editorAlert.k1;
                if (i16 != qz0Var.d) {
                    return;
                }
                qz0 qz0Var2 = editorAlert.q1;
                if (iz0Var.getAdapter() != qz0Var2) {
                    editorAlert.x1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                    iz0Var.setAdapter(qz0Var2);
                    qz0Var2.f();
                }
                boolean z10 = !qz0Var.e.isEmpty() && arrayList7.isEmpty();
                boolean z11 = qz0Var.e.isEmpty() && arrayList7.isEmpty();
                if (z10) {
                    editorAlert.x1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                }
                qz0Var.e = arrayList7;
                qz0Var.f = arrayList8;
                qz0Var.f();
                if (!z11 && !z10 && (i3 = editorAlert.x1) > 0) {
                    editorAlert.o1.h1(0, -i3);
                    editorAlert.x1 = -1000;
                }
                editorAlert.m1.c();
                return;
            case 6:
                yz0 yz0Var = (yz0) this.b;
                uo uoVar = (uo) this.d;
                int i17 = this.c;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = uoVar.b;
                if (drawable instanceof la0) {
                    la0 la0Var = (la0) drawable;
                    la0Var.s(yz0.e(bitmap), i17);
                    la0Var.t(yz0Var.M);
                    yz0Var.invalidate();
                    return;
                }
                return;
            case 7:
                ?? r9 = (org.telegram.ui.is) this.b;
                tj0 tj0Var = (tj0) this.d;
                int i18 = this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                if (r9.j == null) {
                    return;
                }
                tj0Var.setOnItemClickListener((fj0) null);
                tj0Var.requestDisallowInterceptTouchEvent(true);
                r9.j = null;
                r9.v(org.telegram.messenger.g0.W(tj0Var.getContext()));
                r9.i = false;
                View view = r9.h;
                if (view instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    TLRPC.Document sticker = y7Var.getSticker();
                    org.telegram.messenger.ry stickerPath = y7Var.getStickerPath();
                    String V = org.telegram.messenger.zi.V(y7Var.getSticker(), null, Integer.valueOf(r9.r));
                    org.telegram.ui.gs gsVar = r9.l;
                    r9.s(sticker, stickerPath, V, gsVar != null ? gsVar.F(false) : null, null, i18, y7Var.E, y7Var.getParentObject(), r9.c0, 0);
                    y7Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                    TLRPC.Document sticker2 = w7Var.getSticker();
                    org.telegram.ui.gs gsVar2 = r9.l;
                    r9.s(sticker2, null, null, gsVar2 != null ? gsVar2.F(false) : null, null, i18, false, w7Var.getParentObject(), e6Var, 0);
                    w7Var.setScaled(true);
                    r9.i = w7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    TLRPC.Document document2 = h2Var.getDocument();
                    org.telegram.ui.gs gsVar3 = r9.l;
                    r9.s(document2, null, null, gsVar3 != null ? gsVar3.F(true) : null, h2Var.getBotInlineResult(), i18, false, h2Var.getBotInlineResult() != null ? h2Var.getInlineBot() : h2Var.getParentObject(), e6Var, 0);
                    if (i18 != 1 || r9.m) {
                        h2Var.setScaled(true);
                    }
                } else if (view instanceof iu) {
                    TLRPC.Document document3 = ((iu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r9.s(document3, null, org.telegram.messenger.zi.V(document3, null, Integer.valueOf(r9.r)), null, null, i18, false, null, e6Var, 0);
                    }
                } else if (view instanceof nx) {
                    p5 span = ((nx) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = g5.e(r9.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r9.s(document, null, org.telegram.messenger.zi.V(document, null, Integer.valueOf(r9.r)), null, null, i18, false, null, e6Var, 0);
                    }
                } else {
                    if (!(view instanceof nw0)) {
                        return;
                    }
                    Drawable drawable2 = ((nw0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof g5 ? ((g5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r9.s(document5, null, org.telegram.messenger.zi.V(document5, null, Integer.valueOf(r9.r)), null, null, i18, false, null, e6Var, 0);
                    }
                }
                try {
                    r9.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.gs gsVar4 = r9.l;
                if (gsVar4 != null) {
                    gsVar4.t();
                    return;
                }
                return;
            case 8:
                String str4 = (String) this.e;
                int i19 = this.c;
                org.telegram.ui.ActionBar.j2 j2Var = ((org.telegram.ui.ActionBar.t2) this.b).c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.messenger.g0.g(str4);
                if (i19 == 1) {
                    org.telegram.messenger.camera.q.r(null, 2131747303, new fc(j2Var, e6Var2));
                    return;
                } else {
                    new fc(j2Var, e6Var2).k(false).j();
                    return;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                int i20 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.e;
                String str5 = LaunchActivity.E1;
                org.telegram.messenger.hs.f(i20).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.hp.s1(launchActivity.P).E(bundle, uwVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.wm(bundle), true, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.m90 m90Var = (org.telegram.ui.m90) this.b;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i21 = this.c;
                String str6 = (String) this.e;
                m90Var.c();
                if (i21 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i21 != 0) {
                        if (i21 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i21 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i21, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.H = true;
                        notificationsCustomSettingsActivity.q0(false);
                        m90Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str6)) {
                            m90Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str6)) {
                            m90Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str6)) {
                            m90Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str6)) {
                            m90Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str6)) {
                            m90Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str6)) {
                            m90Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str6)) {
                            m90Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str6)) {
                            m90Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str6)) {
                            m90Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str6)) {
                            m90Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str6)) {
                            m90Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str6)) {
                            m90Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str6)) {
                            m90Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str6)) {
                            return;
                        }
                        m90Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i21, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.H = true;
                notificationsCustomSettingsActivity2.q0(false);
                m90Var.u(notificationsCustomSettingsActivity2, false);
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
                int i22 = this.c;
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.J;
                int[] iArr = notificationsCustomSettingsActivity3.E;
                if (!(view2 instanceof org.telegram.ui.Cells.v9)) {
                    notificationsCustomSettingsActivity3.q0(true);
                    return;
                }
                String M0 = org.telegram.messenger.bd.M0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str7, 0), iArr.length - 1, 0)], null);
                if (i22 >= 0 && i22 < arrayList9.size()) {
                    ((org.telegram.ui.gh0) arrayList9.get(i22)).f = M0;
                }
                ((org.telegram.ui.Cells.v9) view2).c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), M0, true, true);
                return;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i23 = this.c;
                org.telegram.ui.yh0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (w0Var != null) {
                    boolean z12 = org.telegram.ui.web.w0.R0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    w0Var.y("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i23).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 13:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str8 = (String) this.e;
                int i24 = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131747653, null);
                alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131747654, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new cg.e0(passkeysActivity, passkey, str8, i24, 7));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.cc ccVar = (org.telegram.messenger.cc) this.d;
                int i25 = this.c;
                String str9 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.V8;
                try {
                    try {
                        df.c cVar = new df.c(org.telegram.messenger.t0.b);
                        cVar.c(0);
                        cVar.b(0);
                        cVar.b = false;
                        bVar = cVar.a();
                        if (bVar.c.k()) {
                            p7.d dVar = new p7.d(11);
                            Bitmap bitmap2 = ccVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            dVar.c = bitmap2;
                            a7.d dVar2 = (a7.d) dVar.b;
                            dVar2.a = width;
                            dVar2.b = height;
                            dVar2.c = i25;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.a60(photoViewer, str9, bVar.e1(dVar).size() != 0, 7));
                        } else {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.d("face detection is not operational");
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.ui.hc0(photoViewer, ccVar, str9, 21));
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
                        r6.X0();
                    }
                    throw th2;
                }
            case 15:
                org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                fc.v(vo0Var.U2.E, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.c, -115203550, -1, 1500, false, null).j();
                return;
            case 16:
                t4.e0(this.c, (TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 17:
                w71 w71Var = (w71) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i26 = this.c;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.e;
                w71Var.getClass();
                int i27 = 0;
                while (i27 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i27).id == i26) {
                        tL_messageMediaToDo.todo.list.remove(i27);
                        i27--;
                    }
                    i27++;
                }
                int i28 = 0;
                while (i28 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i28).id == i26) {
                        tL_messageMediaToDo.completions.remove(i28);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i28--;
                    }
                    i28++;
                }
                w71Var.H.k.media = tL_messageMediaToDo;
                wmVar.getSendMessagesHelper().t(w71Var.H, null, null, null, null, null, null, null, false, false, null);
                wmVar.Cd(false);
                w71Var.c(false);
                return;
            case 18:
                c81 c81Var = (c81) this.b;
                int i29 = this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                d81 d81Var = c81Var.h;
                ArrayList arrayList12 = c81Var.d;
                ArrayList arrayList13 = c81Var.c;
                if (i29 != c81Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                c81Var.f();
                if (arrayList13.isEmpty()) {
                    d81Var.r.setVisibility(0);
                    return;
                } else {
                    d81Var.r.setVisibility(8);
                    return;
                }
            case 19:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.b;
                oc.u uVar = (oc.u) this.d;
                int i30 = this.c;
                String str10 = (String) this.e;
                if (x0Var.c(uVar, i30)) {
                    x0Var.f(str10);
                    return;
                }
                x0Var.d("ignoring stale socket callback; attempt=" + i30 + ", " + str10);
                return;
            case 20:
                org.telegram.ui.Wallet.w0 w0Var2 = (org.telegram.ui.Wallet.w0) this.b;
                oc.u uVar2 = (oc.u) this.d;
                int i31 = this.c;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.x0 x0Var2 = w0Var2.c;
                if (x0Var2.c(uVar2, i31)) {
                    org.telegram.ui.Wallet.k0 k0Var = x0Var2.c;
                    String str11 = x0Var2.b;
                    lt ltVar = x0Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        x0Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        x0Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        x0Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(x0Var2.f, jSONObject2.optString("id"))) {
                            x0Var2.e = true;
                            x0Var2.j = 0;
                            x0Var2.l = SystemClock.elapsedRealtime();
                            org.telegram.messenger.g0.r(x0Var2.o);
                            org.telegram.messenger.g0.r(ltVar);
                            org.telegram.messenger.g0.i3(ltVar, 15000L);
                            x0Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        x0Var2.d("received pong");
                        x0Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!x0Var2.e) {
                        x0Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.k0.b(str11, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            x0Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
                            return;
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("transactions");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("state");
                        StringBuilder u10 = a1.g.u("event type=", optString2, ", finality=");
                        u10.append(jSONObject2.optString("finality"));
                        u10.append(", trace=");
                        u10.append(jSONObject2.optString("trace_external_hash_norm"));
                        u10.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                        u10.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                        x0Var2.d(u10.toString());
                        if (!"transactions".equals(optString2)) {
                            k0Var.M(jSONObject2);
                            return;
                        }
                        if (str11 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i32 = 0; i32 < optJSONArray.length(); i32++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i32);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.k0.b(str11, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            k0Var.M(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            x0Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.w0 w0Var3 = (org.telegram.ui.web.w0) this.b;
                int i33 = this.c;
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) this.d;
                ei.p7 p7Var = (ei.p7) this.e;
                org.telegram.messenger.yy.C(w0Var3.N).r0(org.telegram.messenger.wy.g(org.telegram.messenger.h10.i(w0Var3.N).f(), w0Var3.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.w0.w(i33, t0Var, p7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                tg.b1 b1Var = (tg.b1) this.b;
                tg.x0 x0Var3 = (tg.x0) this.d;
                int i34 = this.c;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = b1Var.c;
                boolean z13 = x0Var3 != null;
                b1Var.d = z13;
                if (!z13 || i34 < 0 || i34 >= arrayList15.size()) {
                    b1Var.i = arrayList14;
                } else {
                    b1Var.a++;
                    ((tg.a1) arrayList15.get(i34)).c++;
                    b1Var.g.edit().putInt(k2.p1.i(i34, "score"), ((tg.a1) arrayList15.get(i34)).c).putInt("scoreall", b1Var.a).apply();
                    b1Var.i = null;
                }
                b1Var.e.a(x0Var3);
                return;
            case 24:
                ug.c2 c2Var = (ug.c2) this.b;
                c2Var.m((Bitmap) this.d, this.c, c2Var.U, c2Var.V, (org.telegram.ui.en0) this.e);
                return;
            default:
                vg.i0 i0Var = (vg.i0) this.b;
                ArrayList arrayList16 = (ArrayList) this.d;
                int i35 = this.c;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                tj0 tj0Var2 = i0Var.l1;
                ArrayList arrayList17 = i0Var.t2;
                arrayList17.clear();
                ArrayList arrayList18 = i0Var.s2;
                arrayList18.clear();
                arrayList17.addAll(arrayList16);
                for (int i36 = 0; i36 < i35; i36++) {
                    arrayList18.add(tL_messages_inactiveChats.chats.get(i36));
                }
                i0Var.B2 = false;
                i0Var.C2.b(i0Var.g2 + 4);
                int i37 = 0;
                while (true) {
                    if (i37 >= tj0Var2.getChildCount()) {
                        i10 = 0;
                    } else if (tj0Var2.getChildAt(i37) instanceof vg.h0) {
                        i10 = tj0Var2.getChildAt(i37).getTop();
                    } else {
                        i37++;
                    }
                }
                i0Var.G1();
                if (i0Var.e2 >= 0 && i10 != 0) {
                    ((u4.b0) tj0Var2.getLayoutManager()).h1(i0Var.e2 + 1, i10);
                }
                if (i0Var.F2 == null) {
                    i0Var.F2 = vg.i0.o1(i0Var.a2, i0Var.a);
                }
                int max = Math.max(arrayList18.size(), i0Var.F2.b);
                vg.g0 g0Var = i0Var.q2;
                if (g0Var != null) {
                    g0Var.i(max, false);
                    i0Var.q2.setBagePosition(max / i0Var.F2.c);
                    vg.g0 g0Var2 = i0Var.q2;
                    g0Var2.I = true;
                    g0Var2.requestLayout();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zo0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zo0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i3;
        this.e = obj3;
    }

    public /* synthetic */ zo0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i3;
    }

    public /* synthetic */ zo0(String str, int i3, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 8;
        this.e = str;
        this.c = i3;
        this.b = t2Var;
        this.d = e6Var;
    }

    public /* synthetic */ zo0(ow0 ow0Var, int i3, String str, ArrayList arrayList) {
        this.a = 4;
        this.b = ow0Var;
        this.c = i3;
        this.e = str;
        this.d = arrayList;
    }
}
