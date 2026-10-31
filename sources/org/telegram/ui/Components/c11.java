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
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.da1;
import org.telegram.ui.ea1;
import org.telegram.ui.x91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c11(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        int i10;
        th.x4 x4Var = (th.x4) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) this.e;
        AbstractSet abstractSet = x4Var.k;
        int i11 = x4Var.f;
        AbstractSet abstractSet2 = x4Var.l;
        x4Var.A = -1;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i12 = x4Var.e;
        sb2.append(i12);
        sb2.append("{");
        long j10 = x4Var.d;
        sb2.append(j10);
        sb2.append("} loaded {");
        sb2.append(th.e5.a(arrayList));
        a1.g.z("}", sb2);
        ArrayList arrayList2 = x4Var.g;
        arrayList2.clear();
        arrayList2.addAll(tL_stories_stories.pinned_to_top);
        int i13 = x4Var.c;
        org.telegram.messenger.vp.r1(i13).V3(tL_stories_stories.users, false);
        org.telegram.messenger.vp.r1(i13).P3(tL_stories_stories.chats, false);
        org.telegram.messenger.hs.a0(i13).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
        x4Var.u = false;
        x4Var.s = tL_stories_stories.count;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            x4Var.t((org.telegram.messenger.jj) arrayList.get(i14), false);
        }
        boolean z10 = abstractSet2.size() >= x4Var.s;
        x4Var.r = z10;
        if (z10) {
            Iterator it = abstractSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (!abstractSet2.contains(num)) {
                    it.remove();
                    x4Var.u(intValue, false);
                }
            }
        } else if (i11 <= 0) {
            int i15 = this.b;
            if (i15 == -1) {
                if (!abstractSet2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(abstractSet2);
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        Integer num2 = (Integer) arrayList3.get(i16);
                        int intValue2 = num2.intValue();
                        if (!arrayList2.contains(num2)) {
                            i10 = intValue2;
                            break;
                        }
                    }
                }
                i10 = -1;
                i15 = i10;
            }
            int n10 = x4Var.n();
            Iterator it2 = abstractSet.iterator();
            while (it2.hasNext()) {
                Integer num3 = (Integer) it2.next();
                int intValue3 = num3.intValue();
                if (!abstractSet2.contains(num3) && intValue3 >= i15 && intValue3 <= n10) {
                    it2.remove();
                    x4Var.u(intValue3, false);
                }
            }
        }
        x4Var.d(true);
        if (x4Var.r) {
            if (th.x4.B == null) {
                th.x4.B = new HashMap();
            }
            th.x4.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(j10), Integer.valueOf(i11))), Long.valueOf(System.currentTimeMillis()));
        } else {
            x4Var.w();
        }
        x4Var.x();
    }

    private final void b() {
        zf.z zVar = (zf.z) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.e;
        ArrayList arrayList2 = zVar.K;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - zVar.n0 < 300) {
            return;
        }
        zVar.n0 = elapsedRealtime;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        int i10 = (arrayList.isEmpty() && arrayList2.isEmpty()) ? 0 : size2 + size;
        int i11 = 3;
        int min = Math.min(3, size2) + size;
        int b10 = zVar.b();
        boolean z10 = zVar.G0;
        int i12 = z10 ? min : i10;
        int i13 = this.b;
        boolean z11 = b10 > (i12 + i13) + 1;
        s4.j jVar = zVar.i0;
        if (jVar != null) {
            jVar.c = z11 ? 45L : 200L;
            jVar.d = z11 ? 80L : 200L;
            jVar.l = z11 ? 270L : 0L;
        }
        zVar.G0 = !z10;
        z3Var.setRightTextMargin(16);
        String L0 = org.telegram.messenger.cd.L0(zVar.G0 ? 2131745357 : 2131745358, null);
        boolean z12 = zVar.G0;
        org.telegram.ui.Cells.y3 y3Var = z3Var.b;
        y3Var.c(L0, true, z12);
        y3Var.setVisibility(0);
        zVar.o0 = null;
        View view = (View) z3Var.getParent();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int i14 = (!zVar.G0 ? i13 + min : i10 + i13) + 1;
            int i15 = 0;
            while (true) {
                if (i15 >= recyclerView.getChildCount()) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i15);
                if (RecyclerView.R(childAt) == i14) {
                    zVar.o0 = childAt;
                    break;
                }
                i15++;
            }
        }
        int i16 = i13 + min;
        int i17 = i16 + 1;
        int max = Math.max(0, size2 - 3);
        if (zVar.G0) {
            zVar.p(i17, max);
            if (z11) {
                org.telegram.messenger.i0.h3(new org.telegram.utils.twidget.v(zVar, i16, 10), 350L);
            } else {
                zVar.g(i16);
            }
        } else {
            zVar.g(i16);
            zVar.o(i17, max);
        }
        yh.o oVar = zVar.p0;
        if (oVar != null) {
            org.telegram.messenger.i0.r(oVar);
        }
        if (!z11) {
            zVar.m0 = false;
            return;
        }
        zVar.m0 = true;
        yh.o oVar2 = new yh.o(i11, zVar, view);
        zVar.p0 = oVar2;
        org.telegram.messenger.i0.h3(oVar2, 400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.lt] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        int i10 = 4;
        t8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                e11 e11Var = (e11) this.c;
                cp cpVar = (cp) this.d;
                int i11 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = cpVar.b;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.s(e11.e(bitmap), i11);
                    jb0Var.t(e11Var.L);
                    e11Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r72 = (org.telegram.ui.lt) this.c;
                tk0 tk0Var = (tk0) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.e;
                if (r72.j == null) {
                    return;
                }
                tk0Var.setOnItemClickListener((gk0) null);
                tk0Var.requestDisallowInterceptTouchEvent(true);
                r72.j = null;
                r72.v(org.telegram.messenger.i0.W(tk0Var.getContext()));
                r72.i = false;
                View view = r72.h;
                if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker = d8Var.getSticker();
                    org.telegram.messenger.jz stickerPath = d8Var.getStickerPath();
                    String V = org.telegram.messenger.jj.V(d8Var.getSticker(), null, Integer.valueOf(r72.r));
                    org.telegram.ui.jt jtVar = r72.l;
                    r72.s(sticker, stickerPath, V, jtVar != null ? jtVar.F(false) : null, null, i12, d8Var.D, d8Var.getParentObject(), r72.c0, 0);
                    d8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                    TLRPC.Document sticker2 = b8Var.getSticker();
                    org.telegram.ui.jt jtVar2 = r72.l;
                    r72.s(sticker2, null, null, jtVar2 != null ? jtVar2.F(false) : null, null, i12, false, b8Var.getParentObject(), p6Var, 0);
                    b8Var.setScaled(true);
                    r72.i = b8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    TLRPC.Document document2 = h2Var.getDocument();
                    org.telegram.ui.jt jtVar3 = r72.l;
                    r72.s(document2, null, null, jtVar3 != null ? jtVar3.F(true) : null, h2Var.getBotInlineResult(), i12, false, h2Var.getBotInlineResult() != null ? h2Var.getInlineBot() : h2Var.getParentObject(), p6Var, 0);
                    if (i12 != 1 || r72.m) {
                        h2Var.setScaled(true);
                    }
                } else if (view instanceof vu) {
                    TLRPC.Document document3 = ((vu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r72.s(document3, null, org.telegram.messenger.jj.V(document3, null, Integer.valueOf(r72.r)), null, null, i12, false, null, p6Var, 0);
                    }
                } else if (view instanceof ey) {
                    o5 span = ((ey) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = f5.e(r72.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r72.s(document, null, org.telegram.messenger.jj.V(document, null, Integer.valueOf(r72.r)), null, null, i12, false, null, p6Var, 0);
                    }
                } else {
                    if (!(view instanceof rx0)) {
                        return;
                    }
                    Drawable drawable2 = ((rx0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof f5 ? ((f5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r72.s(document5, null, org.telegram.messenger.jj.V(document5, null, Integer.valueOf(r72.r)), null, null, i12, false, null, p6Var, 0);
                    }
                }
                try {
                    r72.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.jt jtVar4 = r72.l;
                if (jtVar4 != null) {
                    jtVar4.s();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i13 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = ((org.telegram.ui.ActionBar.z2) this.d).c;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.e;
                org.telegram.messenger.i0.g(str);
                if (i13 == 1) {
                    org.telegram.messenger.z20.r(null, 2131747311, new cc(p2Var, p6Var2));
                    return;
                } else {
                    new cc(p2Var, p6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i14 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this.e;
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.zs.f(i14).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (org.telegram.messenger.vp.r1(launchActivity.O).E(bundle, ayVar, null, null)) {
                    launchActivity.u0(new org.telegram.ui.un(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i15 = this.b;
                String str2 = (String) this.e;
                ua0Var.c();
                if (i15 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i15 != 0) {
                        if (i15 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i15 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i15, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.p0(false);
                        ua0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            ua0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            ua0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            ua0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            ua0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            ua0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            ua0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            ua0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            ua0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            ua0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            ua0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            ua0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            ua0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            ua0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        ua0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i15, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.p0(false);
                ua0Var.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str2)) {
                }
                if ("new".equalsIgnoreCase(str2)) {
                }
                if ("important".equalsIgnoreCase(str2)) {
                }
                if ("messages".equalsIgnoreCase(str2)) {
                }
                if ("stories".equalsIgnoreCase(str2)) {
                }
                if ("preview".equalsIgnoreCase(str2)) {
                }
                if ("show-sender".equalsIgnoreCase(str2)) {
                }
                if ("sound".equalsIgnoreCase(str2)) {
                }
                if ("add-exception".equalsIgnoreCase(str2)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str2)) {
                }
                if ("light-color".equalsIgnoreCase(str2)) {
                }
                if ("vibrate".equalsIgnoreCase(str2)) {
                }
                if ("popup".equalsIgnoreCase(str2)) {
                }
                if ("priority".equalsIgnoreCase(str2)) {
                }
            case 5:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.c;
                View view2 = (View) this.d;
                String str3 = (String) this.e;
                int i16 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.D;
                if (!(view2 instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity3.p0(true);
                    return;
                }
                String L0 = org.telegram.messenger.cd.L0(iArr[Utilities.j(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)], null);
                if (i16 >= 0 && i16 < arrayList4.size()) {
                    ((org.telegram.ui.qi0) arrayList4.get(i16)).f = L0;
                }
                ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.cd.L0(2131743640, "Vibrate"), L0, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i17 = this.b;
                org.telegram.ui.jj0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (z0Var != null) {
                    boolean z10 = org.telegram.ui.web.z0.Q0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    z0Var.x("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i17).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i18 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131747661, null);
                alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747662, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new mg.i0(passkeysActivity, passkey, str4, i18, 7));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.messenger.kc kcVar = (org.telegram.messenger.kc) this.d;
                int i19 = this.b;
                String str5 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    try {
                        nh.n nVar = new nh.n(org.telegram.messenger.w0.b);
                        nVar.c(0);
                        nVar.b(0);
                        nVar.c = false;
                        bVar = nVar.a();
                        if (bVar.c.k()) {
                            q5.d dVar = new q5.d(1);
                            Bitmap bitmap2 = kcVar.c;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            dVar.d = bitmap2;
                            a3.l lVar = (a3.l) dVar.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i19;
                            org.telegram.messenger.i0.g3(new org.telegram.ui.bk0(photoViewer, str5, bVar.e1(dVar).size() != 0, i10));
                        } else {
                            if (org.telegram.messenger.v2.a) {
                                org.telegram.messenger.f8.d("face detection is not operational");
                            }
                            org.telegram.messenger.i0.g3(new org.telegram.ui.qd0(photoViewer, kcVar, str5, 20));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r4.X0();
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    if (0 == 0) {
                        return;
                    }
                }
                bVar.X0();
                return;
            case 9:
                org.telegram.ui.oq0 oq0Var = (org.telegram.ui.oq0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                cc.v(oq0Var.T2.D, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                s4.e0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.k2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                x91 x91Var = (x91) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i20 = this.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                x91Var.getClass();
                int i21 = 0;
                while (i21 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i21).id == i20) {
                        tL_messageMediaToDo.todo.list.remove(i21);
                        i21--;
                    }
                    i21++;
                }
                int i22 = 0;
                while (i22 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i22).id == i20) {
                        tL_messageMediaToDo.completions.remove(i22);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i22--;
                    }
                    i22++;
                }
                x91Var.G.k.media = tL_messageMediaToDo;
                unVar.getSendMessagesHelper().t(x91Var.G, null, null, null, null, null, null, null, false, false, null);
                unVar.sd(false);
                x91Var.c(false);
                return;
            case 12:
                da1 da1Var = (da1) this.c;
                int i23 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ea1 ea1Var = da1Var.h;
                ArrayList arrayList7 = da1Var.d;
                ArrayList arrayList8 = da1Var.c;
                if (i23 != da1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                da1Var.f();
                if (arrayList8.isEmpty()) {
                    ea1Var.r.setVisibility(0);
                    return;
                } else {
                    ea1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.z0 z0Var2 = (org.telegram.ui.Wallet.z0) this.c;
                lc.v vVar = (lc.v) this.d;
                int i24 = this.b;
                String str6 = (String) this.e;
                if (z0Var2.c(vVar, i24)) {
                    z0Var2.f(str6);
                    return;
                }
                z0Var2.d("ignoring stale socket callback; attempt=" + i24 + ", " + str6);
                return;
            case 14:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.c;
                lc.v vVar2 = (lc.v) this.d;
                int i25 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.z0 z0Var3 = y0Var.c;
                if (z0Var3.c(vVar2, i25)) {
                    org.telegram.ui.Wallet.k0 k0Var = z0Var3.c;
                    String str7 = z0Var3.b;
                    ew ewVar = z0Var3.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        z0Var3.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        z0Var3.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        z0Var3.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(z0Var3.f, jSONObject2.optString("id"))) {
                            z0Var3.e = true;
                            z0Var3.j = 0;
                            z0Var3.l = SystemClock.elapsedRealtime();
                            org.telegram.messenger.i0.r(z0Var3.o);
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.h3(ewVar, 15000L);
                            z0Var3.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        z0Var3.d("received pong");
                        z0Var3.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!z0Var3.e) {
                        z0Var3.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.k0.b(str7, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            z0Var3.d("ignoring message; type=" + optString2 + ", status=" + optString);
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
                        z0Var3.d(u10.toString());
                        if (!"transactions".equals(optString2)) {
                            k0Var.M(jSONObject2);
                            return;
                        }
                        if (str7 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i26 = 0; i26 < optJSONArray.length(); i26++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i26);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.k0.b(str7, optJSONObject2.optString("account"))) {
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
                            z0Var3.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.z0 z0Var4 = (org.telegram.ui.web.z0) this.c;
                int i27 = this.b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                org.telegram.messenger.qz.C(z0Var4.M).r0(org.telegram.messenger.oz.g(org.telegram.messenger.d20.i(z0Var4.M).f(), z0Var4.U.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.z0.w(i27, v0Var, x0Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 16:
                ((qh.x0) this.c).d1(this.b, (String) this.d, (String) this.e);
                return;
            case 17:
                qh.x0 x0Var2 = (qh.x0) this.c;
                Bitmap bitmap3 = (Bitmap) this.e;
                int[] iArr2 = (int[]) this.d;
                int i28 = this.b;
                x0Var2.V4 = false;
                if (x0Var2.W4 == null) {
                    x0Var2.W4 = bitmap3;
                    x0Var2.X4 = iArr2;
                    x0Var2.Y4 = i28;
                    return;
                }
                return;
            case 18:
                ea.d dVar2 = (ea.d) this.c;
                l5.i iVar = (l5.i) this.d;
                int i29 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar = (t5.c) dVar2.f;
                try {
                    try {
                        s5.d dVar3 = (s5.d) dVar2.c;
                        Objects.requireNonNull(dVar3);
                        ((s5.g) cVar).f(new mg.l(dVar3, 24));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) dVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar).f(new ag.b0(dVar2, iVar, i29, 17));
                        } else {
                            dVar2.e(iVar, i29);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused4) {
                    ((q5.d) dVar2.d).x(iVar, i29 + 1, false);
                }
                runnable.run();
                return;
            case 19:
                int i30 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.p6 p6Var3 = (org.telegram.ui.ActionBar.p6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                rh.e4 e4Var = new rh.e4(context, i30, org.telegram.messenger.d20.i(i30).e(), p6Var3, null);
                e4Var.j2(savedStarGift, null);
                e4Var.show();
                return;
            case 20:
                a();
                return;
            case 21:
                org.telegram.messenger.i0.g3(new rh.l5(org.telegram.messenger.hs.a0(this.b).l0((ArrayList) this.c), (HashMap) this.d, (org.telegram.messenger.q20) this.e, 22));
                return;
            case 22:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                int i31 = this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                if (userFull == null) {
                    oVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    xh.q3.b(i31, user, userFull, oVar);
                    return;
                }
            case 23:
                b();
                return;
            default:
                zf.z zVar = (zf.z) this.c;
                int i32 = this.b;
                TLObject tLObject = (TLObject) this.d;
                String str8 = (String) this.e;
                int i33 = zVar.s0;
                if (i32 == zVar.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zVar.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    zVar.x = messages_messages.next_rate;
                    zVar.D = str8;
                    org.telegram.messenger.vp.r1(i33).V3(messages_messages.users, false);
                    org.telegram.messenger.vp.r1(i33).P3(messages_messages.chats, false);
                    for (int i34 = 0; i34 < messages_messages.messages.size(); i34++) {
                        zVar.y.add(new org.telegram.messenger.jj(i33, messages_messages.messages.get(i34), false, true));
                    }
                    org.telegram.ui.mx mxVar = zVar.U;
                    if (mxVar != null) {
                        mxVar.d(zVar.D0 > 0, true);
                    }
                    zVar.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ c11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ c11(qh.x0 x0Var, Bitmap bitmap, int[] iArr, int i10) {
        this.a = 17;
        this.c = x0Var;
        this.e = bitmap;
        this.d = iArr;
        this.b = i10;
    }
}
