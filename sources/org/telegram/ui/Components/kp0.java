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
import org.telegram.ui.m81;
import org.telegram.ui.n81;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 17;
        this.c = i7;
        this.b = tL_error;
        this.d = g2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        int i7;
        sg.a1 a1Var = (sg.a1) this.b;
        sg.w0 w0Var = (sg.w0) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = a1Var.c;
        boolean z10 = w0Var != null;
        a1Var.d = z10;
        if (!z10 || (i7 = this.c) < 0 || i7 >= arrayList2.size()) {
            a1Var.i = arrayList;
        } else {
            a1Var.a++;
            ((sg.z0) arrayList2.get(i7)).c++;
            a1Var.g.edit().putInt(i5.c.i(i7, "score"), ((sg.z0) arrayList2.get(i7)).c).putInt("scoreall", a1Var.a).apply();
            a1Var.i = null;
        }
        a1Var.e.a(w0Var);
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
                ((v5.g) cVar2).f(new tg.s(dVar, 7));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((v5.g) cVar2).f(new ai.o1(cVar, iVar, i7, 20));
                } else {
                    cVar.c(iVar, i7);
                }
                runnable.run();
            } catch (w5.a unused) {
                ((i61) cVar.d).N(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
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
                ((it0) this.b).T0((org.telegram.messenger.fj) this.d, (View) this.e, this.c, false);
                return;
            case 1:
                it0.d((it0) this.b, this.c, (TL_stories.StoryItem) this.d, (String) this.e);
                return;
            case 2:
                b5.c0(this.c, (TLRPC.TL_error) this.d, ((it0) this.b).y1, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
                return;
            case 3:
                fs0 fs0Var = (fs0) this.b;
                int i12 = this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                String str = (String) this.e;
                it0 it0Var = fs0Var.w;
                if (fs0Var.h != 0) {
                    if (i12 == fs0Var.n) {
                        int b10 = fs0Var.b();
                        fs0Var.f = arrayList4;
                        fs0Var.s--;
                        int b11 = fs0Var.b();
                        if (fs0Var.s == 0 || b11 != 0) {
                            it0Var.B1(false);
                        }
                        int i13 = 0;
                        while (true) {
                            ds0[] ds0VarArr = it0Var.n0;
                            if (i13 < ds0VarArr.length) {
                                ds0 ds0Var = ds0VarArr[i13];
                                if (ds0Var.F == fs0Var.r) {
                                    if (fs0Var.s == 0 && b11 == 0) {
                                        ds0Var.w.d.setText(org.telegram.messenger.gd.a0("NoResultFoundFor", null, 2131747973, str));
                                        ds0VarArr[i13].w.f.setVisibility(8);
                                        ds0VarArr[i13].w.e(false, true);
                                    } else if (b10 == 0) {
                                        it0Var.D(ds0Var.h, 0, null);
                                    }
                                }
                                i13++;
                            } else {
                                fs0Var.f();
                            }
                        }
                    }
                    fs0Var.h = 0;
                    return;
                }
                return;
            case 4:
                zw0 zw0Var = (zw0) this.b;
                String[] strArr = (String[]) this.d;
                String str2 = (String) this.e;
                int i14 = this.c;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i15 = zw0Var.a;
                org.telegram.messenger.ri.d0(i15).W(strArr, str2, true, new bi.o5(zw0Var, i14, str2, hashSet, arrayList5, 3), org.telegram.messenger.bz.F && org.telegram.messenger.i10.i(i15).q());
                return;
            case 5:
                zw0 zw0Var2 = (zw0) this.b;
                int i16 = this.c;
                String str3 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                if (i16 == zw0Var2.L) {
                    zw0Var2.K = str3;
                    zw0Var2.J = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        zw0Var2.y = true;
                        zw0Var2.f();
                        return;
                    }
                    zw0Var2.y = false;
                    zw0Var2.w = false;
                    zw0Var2.c();
                    bi.g3 g3Var = zw0Var2.d;
                    if (g3Var != null) {
                        g3Var.setVisibility(0);
                        zw0Var2.d.invalidate();
                    }
                    zw0Var2.x = arrayList6;
                    org.telegram.ui.l4 l4Var = zw0Var2.f;
                    if (l4Var != null) {
                        l4Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                b01 b01Var = (b01) this.b;
                int i17 = this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = b01Var.r;
                tz0 tz0Var = editorAlert.n1;
                if (i17 != b01Var.d) {
                    return;
                }
                b01 b01Var2 = editorAlert.t1;
                if (tz0Var.getAdapter() != b01Var2) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.K0(editorAlert);
                    tz0Var.setAdapter(b01Var2);
                    b01Var2.f();
                }
                boolean z10 = !b01Var.e.isEmpty() && arrayList7.isEmpty();
                boolean z11 = b01Var.e.isEmpty() && arrayList7.isEmpty();
                if (z10) {
                    editorAlert.A1 = ThemeEditorView.EditorAlert.K0(editorAlert);
                }
                b01Var.e = arrayList7;
                b01Var.f = arrayList8;
                b01Var.f();
                if (!z11 && !z10 && (i7 = editorAlert.A1) > 0) {
                    editorAlert.r1.h1(0, -i7);
                    editorAlert.A1 = -1000;
                }
                editorAlert.p1.c();
                return;
            case 7:
                j01 j01Var = (j01) this.b;
                jp jpVar = (jp) this.d;
                int i18 = this.c;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = jpVar.b;
                if (drawable instanceof za0) {
                    za0 za0Var = (za0) drawable;
                    za0Var.s(i18, j01.e(bitmap));
                    za0Var.t(j01Var.M);
                    j01Var.invalidate();
                    return;
                }
                return;
            case 8:
                ?? r11 = (org.telegram.ui.ns) this.b;
                ek0 ek0Var = (ek0) this.d;
                int i19 = this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                if (r11.j == null) {
                    return;
                }
                ek0Var.setOnItemClickListener((qj0) null);
                ek0Var.requestDisallowInterceptTouchEvent(true);
                r11.j = null;
                r11.v(org.telegram.messenger.g0.W(ek0Var.getContext()));
                r11.i = false;
                View view = r11.h;
                if (view instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    TLRPC.Document sticker = z7Var.getSticker();
                    org.telegram.messenger.sy stickerPath = z7Var.getStickerPath();
                    String V = org.telegram.messenger.fj.V(z7Var.getSticker(), null, Integer.valueOf(r11.r));
                    org.telegram.ui.ls lsVar = r11.l;
                    r11.s(sticker, stickerPath, V, lsVar != null ? lsVar.F(false) : null, null, i19, z7Var.E, z7Var.getParentObject(), r11.c0, 0);
                    z7Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                    TLRPC.Document sticker2 = x7Var.getSticker();
                    org.telegram.ui.ls lsVar2 = r11.l;
                    r11.s(sticker2, null, null, lsVar2 != null ? lsVar2.F(false) : null, null, i19, false, x7Var.getParentObject(), i6Var, 0);
                    x7Var.setScaled(true);
                    r11.i = x7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                    TLRPC.Document document2 = i2Var.getDocument();
                    org.telegram.ui.ls lsVar3 = r11.l;
                    r11.s(document2, null, null, lsVar3 != null ? lsVar3.F(true) : null, i2Var.getBotInlineResult(), i19, false, i2Var.getBotInlineResult() != null ? i2Var.getInlineBot() : i2Var.getParentObject(), i6Var, 0);
                    if (i19 != 1 || r11.m) {
                        i2Var.setScaled(true);
                    }
                } else if (view instanceof uu) {
                    TLRPC.Document document3 = ((uu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r11.s(document3, null, org.telegram.messenger.fj.V(document3, null, Integer.valueOf(r11.r)), null, null, i19, false, null, i6Var, 0);
                    }
                } else if (view instanceof yx) {
                    x5 span = ((yx) view).getSpan();
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
                    if (!(view instanceof yw0)) {
                        return;
                    }
                    Drawable drawable2 = ((yw0) view).b;
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
            case 9:
                String str4 = (String) this.b;
                int i20 = this.c;
                org.telegram.ui.ActionBar.m2 m2Var = ((org.telegram.ui.ActionBar.w2) this.d).c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.e;
                org.telegram.messenger.g0.g(str4);
                if (i20 == 1) {
                    org.telegram.messenger.m10.t(null, 2131747101, new kc(m2Var, i6Var2));
                    return;
                } else {
                    new kc(m2Var, i6Var2).k(false).j();
                    return;
                }
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                int i21 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.e;
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.ks.f(i21).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.mp.u1(launchActivity.P).E(bundle, bxVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.bn(bundle), true, false);
                    return;
                }
                return;
            case 11:
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
            case 12:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.b;
                View view2 = (View) this.e;
                String str7 = (String) this.d;
                int i23 = this.c;
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.J;
                int[] iArr = notificationsCustomSettingsActivity3.E;
                if (!(view2 instanceof org.telegram.ui.Cells.w9)) {
                    notificationsCustomSettingsActivity3.q0(true);
                    return;
                }
                String N0 = org.telegram.messenger.gd.N0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str7, 0), iArr.length - 1, 0)], null);
                if (i23 >= 0 && i23 < arrayList9.size()) {
                    ((org.telegram.ui.oh0) arrayList9.get(i23)).f = N0;
                }
                ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.gd.N0(2131743367, "Vibrate"), N0, true, true);
                return;
            case 13:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i24 = this.c;
                org.telegram.ui.ei0.a = null;
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
            case 14:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str8 = (String) this.e;
                int i25 = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131747451, null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131747452, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new bg.g0(passkeysActivity, passkey, str8, i25, 7));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.d;
                int i26 = this.c;
                String str9 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.f9;
                try {
                    try {
                        gf.c cVar = new gf.c(org.telegram.messenger.t0.b);
                        cVar.c(0);
                        cVar.b(0);
                        cVar.b = false;
                        bVar = cVar.a();
                        if (bVar.c.k()) {
                            i61 i61Var = new i61(20);
                            Bitmap bitmap2 = hcVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            i61Var.d = bitmap2;
                            b7.d dVar = (b7.d) i61Var.b;
                            dVar.a = width;
                            dVar.b = height;
                            dVar.c = i26;
                            org.telegram.messenger.g0.g3(new org.telegram.ui.a80(photoViewer, str9, bVar.e1(i61Var).size() != 0, 6));
                        } else {
                            if (org.telegram.messenger.s2.a) {
                                org.telegram.messenger.a8.d("face detection is not operational");
                            }
                            org.telegram.messenger.g0.g3(new org.telegram.ui.lc0(photoViewer, hcVar, str9, i11));
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
            case 16:
                org.telegram.ui.ep0 ep0Var = (org.telegram.ui.ep0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                kc.v(ep0Var.X2.E, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.c, -115203550, -1, 1500, false, null).j();
                return;
            case 17:
                b5.c0(this.c, (TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 18:
                org.telegram.ui.g81 g81Var = (org.telegram.ui.g81) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i27 = this.c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.e;
                g81Var.getClass();
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
                g81Var.H.k.media = tL_messageMediaToDo;
                bnVar.getSendMessagesHelper().t(g81Var.H, null, null, null, null, null, null, null, false, false, null);
                bnVar.Gd(false);
                g81Var.c(false);
                return;
            case 19:
                m81 m81Var = (m81) this.b;
                int i30 = this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                n81 n81Var = m81Var.h;
                ArrayList arrayList12 = m81Var.d;
                ArrayList arrayList13 = m81Var.c;
                if (i30 != m81Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                m81Var.f();
                if (arrayList13.isEmpty()) {
                    n81Var.r.setVisibility(0);
                    return;
                } else {
                    n81Var.r.setVisibility(8);
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.j1 j1Var = (org.telegram.ui.Wallet.j1) this.b;
                rc.u uVar = (rc.u) this.d;
                int i31 = this.c;
                String str10 = (String) this.e;
                if (j1Var.c(uVar, i31)) {
                    j1Var.f(str10);
                    return;
                }
                j1Var.d("ignoring stale socket callback; attempt=" + i31 + ", " + str10);
                return;
            case 21:
                org.telegram.ui.Wallet.i1 i1Var = (org.telegram.ui.Wallet.i1) this.b;
                rc.u uVar2 = (rc.u) this.d;
                int i32 = this.c;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.j1 j1Var2 = i1Var.c;
                if (j1Var2.c(uVar2, i32)) {
                    org.telegram.ui.Wallet.v0 v0Var2 = j1Var2.c;
                    String str11 = j1Var2.b;
                    rc rcVar = j1Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        j1Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        j1Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        j1Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(j1Var2.f, jSONObject2.optString("id"))) {
                            j1Var2.e = true;
                            j1Var2.j = 0;
                            j1Var2.l = SystemClock.elapsedRealtime();
                            org.telegram.messenger.g0.r(j1Var2.o);
                            org.telegram.messenger.g0.r(rcVar);
                            org.telegram.messenger.g0.h3(rcVar, 15000L);
                            j1Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        j1Var2.d("received pong");
                        j1Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!j1Var2.e) {
                        j1Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.v0.c(str11, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            j1Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
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
                        j1Var2.d(u10.toString());
                        if (!"transactions".equals(optString2)) {
                            v0Var2.U(jSONObject2);
                            return;
                        }
                        if (str11 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i33 = 0; i33 < optJSONArray.length(); i33++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i33);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.v0.c(str11, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            v0Var2.U(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            j1Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.v0 v0Var3 = (org.telegram.ui.web.v0) this.b;
                int i34 = this.c;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.d;
                fi.f7 f7Var = (fi.f7) this.e;
                org.telegram.messenger.zy.C(v0Var3.N).r0(org.telegram.messenger.xy.g(org.telegram.messenger.i10.i(v0Var3.N).f(), v0Var3.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.v0.w(i34, s0Var, f7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 23:
                a8.xa xaVar = (a8.xa) this.b;
                int i35 = this.c;
                List list = (List) this.d;
                p4.v vVar = (p4.v) this.e;
                p4.d0 d0Var = ((p4.n0) xaVar.d).h;
                if (i35 == -1) {
                    d0Var.t.y0(list);
                } else {
                    d0Var.t.c0(i35, list);
                }
                new SparseBooleanArray().append(20, true);
                d0Var.p(vVar);
                return;
            case 24:
                a();
                return;
            case 25:
                tg.i2 i2Var2 = (tg.i2) this.b;
                i2Var2.m((Bitmap) this.d, this.c, i2Var2.U, i2Var2.V, (org.telegram.ui.pn0) this.e);
                return;
            case 26:
                b();
                return;
            default:
                ug.k0 k0Var = (ug.k0) this.b;
                ArrayList arrayList14 = (ArrayList) this.d;
                int i36 = this.c;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                ek0 ek0Var2 = k0Var.o1;
                ArrayList arrayList15 = k0Var.w2;
                arrayList15.clear();
                ArrayList arrayList16 = k0Var.v2;
                arrayList16.clear();
                arrayList15.addAll(arrayList14);
                for (int i37 = 0; i37 < i36; i37++) {
                    arrayList16.add(tL_messages_inactiveChats.chats.get(i37));
                }
                k0Var.E2 = false;
                k0Var.F2.b(k0Var.j2 + 4);
                int i38 = 0;
                while (true) {
                    if (i38 >= ek0Var2.getChildCount()) {
                        i10 = 0;
                    } else if (ek0Var2.getChildAt(i38) instanceof ug.j0) {
                        i10 = ek0Var2.getChildAt(i38).getTop();
                    } else {
                        i38++;
                    }
                }
                k0Var.H1();
                if (k0Var.h2 >= 0 && i10 != 0) {
                    ((v4.c0) ek0Var2.getLayoutManager()).h1(k0Var.h2 + 1, i10);
                }
                if (k0Var.I2 == null) {
                    k0Var.I2 = ug.k0.p1(k0Var.d2, k0Var.a);
                }
                int max = Math.max(arrayList16.size(), k0Var.I2.b);
                ug.i0 i0Var = k0Var.t2;
                if (i0Var != null) {
                    i0Var.i(max, false);
                    k0Var.t2.setBagePosition(max / k0Var.I2.c);
                    ug.i0 i0Var2 = k0Var.t2;
                    i0Var2.I = true;
                    i0Var2.requestLayout();
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

    public /* synthetic */ kp0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, String str, int i7) {
        this.a = 12;
        this.b = notificationsCustomSettingsActivity;
        this.e = view;
        this.d = str;
        this.c = i7;
    }
}
