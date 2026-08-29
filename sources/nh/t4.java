package nh;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.fy;
import org.telegram.ui.gg;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        sh.a aVar = (sh.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(w41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(w41.j(1, aVar.V));
        arrayList.add(w41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(w41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        w41 x4 = w41.x(151, string, LocaleController.getString(z10 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
        x4.K(true ^ aVar.U);
        arrayList.add(x4);
        w41 x10 = w41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z10 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
        x10.K(aVar.U);
        arrayList.add(x10);
        arrayList.add(w41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String upperCase;
        boolean z10;
        k51 k51Var;
        int i10;
        int i11 = 24;
        String str = "";
        int i12 = 3;
        boolean z11 = false;
        z11 = false;
        switch (this.a) {
            case 0:
                ((fb) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 1:
                y7 y7Var = (y7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (y7Var.d0 || y7Var.c0 != null) {
                    TLRPC.WebPage webPage = y7Var.c0;
                    p7 p7Var = new p7(y7Var, 0);
                    int i13 = w7.a;
                    w41 J = w41.J(w7.class);
                    J.G = webPage;
                    J.D = p7Var;
                    arrayList.add(J);
                }
                arrayList.add(w41.k(y7Var.U));
                arrayList.add(w41.A(1, null));
                w41 i14 = w41.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i14.K(y7Var.i0);
                arrayList.add(i14);
                if (y7Var.i0) {
                    arrayList.add(w41.k(y7Var.V));
                }
                arrayList.add(w41.A(3, null));
                arrayList.add(w41.k(y7Var.W));
                break;
            case 2:
                gb gbVar = (gb) this.b;
                Float f9 = (Float) obj2;
                long duration = gbVar.T0.getDuration() < 100 ? gbVar.G1.h0 : gbVar.T0.getDuration();
                float floatValue = ((f9.floatValue() / 0.96f) * 0.04f) + f9.floatValue();
                o7 o7Var = gbVar.G1;
                float f10 = o7Var.a0;
                float f11 = o7Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j10 = (long) (f12 * f13);
                va vaVar = gbVar.T0;
                long j11 = (long) ((f11 * f13) + j10);
                gbVar.I1 = j11;
                vaVar.m(j11);
                ja jaVar = gbVar.r1;
                if (jaVar != null) {
                    jaVar.setCoverTime(gbVar.I1);
                }
                o7 o7Var2 = gbVar.G1;
                if (o7Var2 != null && o7Var2.g) {
                    o7Var2.j = true;
                    break;
                }
                break;
            case 3:
                ((jb) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 4:
                ((oh.g) this.b).C0((ArrayList) obj, (k51) obj2);
                break;
            case 5:
                oh.f fVar = (oh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(w41.k(fVar.U));
                arrayList2.add(w41.k(fVar.V));
                break;
            case 6:
                final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.web.j jVar = lVar.y;
                ArrayList arrayList4 = lVar.x;
                if (!lVar.b && arrayList4.isEmpty()) {
                    arrayList3.add(w41.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList5 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i15);
                            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList6.add(kVar);
                        }
                        Collections.sort(arrayList6, new wp0(17));
                        int size = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj3 = arrayList6.get(i16);
                            i16++;
                            org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj3;
                            if (arrayList5.size() < 20) {
                                arrayList5.add(kVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList4.size();
                arrayList5.size();
                if (!arrayList4.isEmpty()) {
                    arrayList3.add(w41.k(lVar.v));
                }
                int i17 = 0;
                while (i17 < arrayList4.size()) {
                    final String str2 = (String) arrayList4.get(i17);
                    boolean z12 = i17 == 0;
                    boolean z13 = i17 == arrayList4.size() - 1;
                    final int i18 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.t tVar = lVar.I;
                                    if (tVar != null) {
                                        tVar.run(str2);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.t tVar2 = lVar.I;
                                    if (tVar2 != null) {
                                        tVar2.run(str2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i19 = org.telegram.ui.web.e.a;
                    w41 J2 = w41.J(org.telegram.ui.web.e.class);
                    J2.z = 1;
                    J2.l = str2;
                    J2.D = onClickListener;
                    J2.q = z12;
                    J2.r = z13;
                    J2.G = Boolean.TRUE;
                    J2.H = lVar;
                    arrayList3.add(J2);
                    i17++;
                }
                if (!arrayList5.isEmpty()) {
                    arrayList3.add(w41.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new mh.n(lVar, 11)));
                    int i20 = 0;
                    while (i20 < arrayList5.size()) {
                        final String str3 = (String) arrayList5.get(i20);
                        boolean z14 = i20 == 0;
                        final int i21 = 1;
                        boolean z15 = i20 == arrayList5.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i21) {
                                    case 0:
                                        org.telegram.ui.t tVar = lVar.I;
                                        if (tVar != null) {
                                            tVar.run(str3);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.t tVar2 = lVar.I;
                                        if (tVar2 != null) {
                                            tVar2.run(str3);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i22 = org.telegram.ui.web.e.a;
                        w41 J3 = w41.J(org.telegram.ui.web.e.class);
                        J3.z = 0;
                        J3.l = str3;
                        J3.D = onClickListener2;
                        J3.q = z14;
                        J3.r = z15;
                        J3.G = Boolean.TRUE;
                        J3.H = lVar;
                        arrayList3.add(J3);
                        i20++;
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList7 = jVar.a;
                    if (!arrayList7.isEmpty()) {
                        arrayList3.add(w41.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                            MessageObject messageObject = (MessageObject) arrayList7.get(i23);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                                int i24 = org.telegram.ui.web.h.a;
                                w41 J4 = w41.J(org.telegram.ui.web.h.class);
                                J4.z = 3;
                                J4.q = true;
                                J4.H = messageObject;
                                arrayList3.add(J4);
                            }
                        }
                        if (!jVar.f) {
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 7:
                ((ph.j) this.b).E0((ArrayList) obj, (k51) obj2);
                break;
            case 8:
                ph.r.U((ph.r) this.b, (ArrayList) obj);
                break;
            case 9:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.b;
                String str4 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str4 == null) {
                    upperCase = null;
                } else {
                    if (!str4.isEmpty()) {
                        switch (str4) {
                            case "application/epub+zip":
                                str = "epub";
                                break;
                            case "application/vnd.oasis.opendocument.text":
                                str = "odt";
                                break;
                            case "video/3gpp":
                            case "audio/3gpp":
                                str = "3gp";
                                break;
                            case "application/vnd.ms-fontobject":
                                str = "eot";
                                break;
                            case "application/x-cdf":
                                str = "cda";
                                break;
                            case "application/x-csh":
                                str = "csh";
                                break;
                            case "video/x-msvideo":
                                str = "avi";
                                break;
                            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                                str = "pptx";
                                break;
                            case "application/vnd.ms-powerpoint":
                                str = "ppt";
                                break;
                            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                                str = "docx";
                                break;
                            case "audio/x-midi":
                                str = "midi";
                                break;
                            case "text/calendar":
                                str = "ics";
                                break;
                            case "application/x-httpd-php":
                                str = "php";
                                break;
                            case "audio/3gpp2":
                            case "video/3gpp2":
                                str = "3g2";
                                break;
                            case "application/vnd.apple.installer+xml":
                                str = "mpkg";
                                break;
                            case "application/vnd.ms-excel":
                                str = "xls";
                                break;
                            case "application/gzip":
                            case "application/x-gzip":
                                str = "gz";
                                break;
                            case "application/x-sh":
                                str = "sh";
                                break;
                            case "audio/ogg":
                                str = "opus";
                                break;
                            case "text/plain":
                                str = "txt";
                                break;
                            case "application/x-abiword":
                                str = "abw";
                                break;
                            case "application/ld+json":
                                str = "jsonld";
                                break;
                            case "application/msword":
                                str = "doc";
                                break;
                            case "application/x-bzip":
                                str = "bz";
                                break;
                            case "application/octet-stream":
                                str = "bin";
                                break;
                            case "application/x-bzip2":
                                str = "bz2";
                                break;
                            case "application/vnd.oasis.opendocument.presentation":
                                str = "odp";
                                break;
                            case "application/x-7z-compressed":
                                str = "7z";
                                break;
                            case "application/x-freearc":
                                str = "arc";
                                break;
                            case "audio/mpeg":
                                str = "mp3";
                                break;
                            case "application/vnd.rar":
                                str = "rar";
                                break;
                            case "image/vnd.microsoft.icon":
                                str = "ico";
                                break;
                            case "application/vnd.oasis.opendocument.spreadsheet":
                                str = "ods";
                                break;
                            case "application/vnd.amazon.ebook":
                                str = "azw";
                                break;
                            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                                str = "xlsx";
                                break;
                            case "application/java-archive":
                                str = "jar";
                                break;
                            case "text/javascript":
                                str = "js";
                                break;
                            default:
                                if (str4.contains("/")) {
                                    str4 = str4.substring(str4.indexOf("/") + 1);
                                }
                                if (str4.contains("-")) {
                                    str4 = str4.substring(str4.indexOf("-") + 1);
                                }
                                if (str4.contains("+")) {
                                    str4 = str4.substring(0, str4.indexOf("+"));
                                }
                                str = str4.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(upperCase.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(LocaleController.getString(R.string.AttachDocument));
                }
                o6Var.setText(sb2);
                break;
            case 10:
                ph.e1 e1Var = (ph.e1) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(w41.j(-1, e1Var.W));
                arrayList8.add(w41.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.U))));
                break;
            case 11:
                ph.p2 p2Var = (ph.p2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    break;
                } else {
                    ph.y3 y3Var = p2Var.r0;
                    if (y3Var != null) {
                        y3Var.a(tL_webViewResultUrl);
                        p2Var.n();
                        break;
                    }
                }
                break;
            case 12:
                ((ph.d3) this.b).F0((ArrayList) obj, (k51) obj2);
                break;
            case 13:
                ((ph.x3) this.b).U((ArrayList) obj, (k51) obj2);
                break;
            case 14:
                ((qh.q) this.b).v.c((ArrayList) obj);
                break;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                mn0 mn0Var = (mn0) ((rf.a0) this.b);
                fy fyVar = mn0Var.E0;
                AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
                j70 I = j70.I(fyVar, (org.telegram.ui.Cells.f6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    j70 J5 = I.J();
                    J5.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new xb0(I, i11), false);
                    J5.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J5.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J5.k();
                        }
                        J5.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new ih.z2(I, J5, 6), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new gg(mn0Var, fyVar, mn0Var.F0, I, 22), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new gg(mn0Var, fyVar, tL_sponsoredPeer, I, 23), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.Components.g(mn0Var, fyVar, I, 22), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 16:
                sf.d.U((sf.d) this.b, (ArrayList) obj, (k51) obj2);
                break;
            case 17:
                sf.l lVar2 = (sf.l) this.b;
                lVar2.H.dismiss();
                lVar2.y = (String) obj;
                lVar2.A = (TLRPC.InputDocument) obj2;
                lVar2.w = false;
                AndroidUtilities.cancelRunOnUIThread(lVar2.d);
                lVar2.n.setSticker(lVar2.y);
                lVar2.e0(true);
                o51 o51Var = lVar2.a;
                if (o51Var != null && (k51Var = o51Var.U2) != null) {
                    k51Var.N(true);
                    break;
                }
                break;
            case 18:
                sf.f0 f0Var = (sf.f0) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                k51Var2.A = 1;
                LinearLayout linearLayout = f0Var.W;
                w41 w41Var = new w41(-4);
                w41Var.d = -5;
                w41Var.c = linearLayout;
                w41Var.z = -1;
                arrayList9.add(w41Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.T;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        th.p(R.string.SessionBotConnectedFrom, arrayList9);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList9.add(w41.B(null));
                    }
                    k51Var2.U();
                    th.p(R.string.BusinessBotChats2, arrayList9);
                    int i25 = sf.f0.c0;
                    w41 w10 = w41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.a0);
                    arrayList9.add(w10);
                    int i26 = sf.f0.d0;
                    w41 w11 = w41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.a0);
                    arrayList9.add(w11);
                    k51Var2.T();
                    arrayList9.add(w41.B(null));
                    sf.w wVar = f0Var.V;
                    if (wVar != null) {
                        wVar.a(arrayList9, k51Var2, true);
                    }
                    th.A(R.string.BusinessBotChatsInfo2, arrayList9);
                    break;
                }
                break;
            case 19:
                final sf.l0 l0Var = (sf.l0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                k51 k51Var3 = (k51) obj2;
                LongSparseArray longSparseArray = l0Var.J;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                w41 w41Var2 = new w41(2);
                w41Var2.l = string2;
                w41Var2.o = string3;
                w41Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                w41Var2.n = "🤖🏝️";
                w41Var2.z = 120;
                arrayList10.add(w41Var2);
                if (l0Var.I != null) {
                    k51Var3.U();
                    long j12 = l0Var.I.id;
                    w41 w41Var3 = new w41(13);
                    w41Var3.x = j12;
                    w41Var3.K(true);
                    final int i27 = z11 ? 1 : 0;
                    w41Var3.D = new View.OnClickListener() { // from class: sf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.c.U2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var3.F;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    l0Var3.c.U2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var4.F;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        l0Var4.c.U2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var5.F;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        l0Var5.c.U2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.F.manage_stories = !r0.manage_stories;
                                    l0Var6.c.U2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(w41Var3);
                    k51Var3.T();
                } else {
                    k51Var3.U();
                    arrayList10.add(w41.k(l0Var.e));
                    longSparseArray.clear();
                    boolean z16 = false;
                    for (int i28 = 0; i28 < l0Var.d.d.size(); i28++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i28);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.id;
                                String str5 = l0Var.y;
                                w41 w41Var4 = new w41(13);
                                w41Var4.x = j13;
                                w41Var4.n = str5;
                                arrayList10.add(w41Var4);
                                longSparseArray.put(user.id, user);
                                z16 = true;
                            }
                        }
                    }
                    for (int i29 = 0; i29 < l0Var.d.e.size(); i29++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.e.get(i29);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str6 = l0Var.y;
                                w41 w41Var5 = new w41(13);
                                w41Var5.x = j14;
                                w41Var5.n = str6;
                                arrayList10.add(w41Var5);
                                longSparseArray.put(user2.id, user2);
                                z16 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f.getText().toString()) || l0Var.d.e() || l0Var.x)) {
                        arrayList10.add(w41.k(l0Var.n));
                        z16 = true;
                    }
                    l0Var.h.setVisibility(z16 ? 0 : 8);
                    k51Var3.T();
                }
                arrayList10.add(w41.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                k51Var3.U();
                w41 t10 = w41.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = l0Var.I != null;
                arrayList10.add(t10);
                w41 w12 = w41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.E);
                w12.g = l0Var.I != null;
                arrayList10.add(w12);
                w41 w13 = w41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.E);
                w13.g = l0Var.I != null;
                arrayList10.add(w13);
                k51Var3.T();
                arrayList10.add(w41.B(null));
                l0Var.v.a(arrayList10, k51Var3, l0Var.I != null);
                th.A(R.string.BusinessBotChatsInfo2, arrayList10);
                if (l0Var.I != null) {
                    k51Var3.U();
                    th.p(R.string.BusinessBotPermissions, arrayList10);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.F;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    w41 m10 = w41.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.F;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !l0Var.L;
                    final int i30 = 1;
                    m10.D = new View.OnClickListener() { // from class: sf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.c.U2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.F;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    l0Var3.c.U2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.U2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var5.F;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        l0Var5.c.U2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.F.manage_stories = !r0.manage_stories;
                                    l0Var6.c.U2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m10);
                    if (l0Var.L) {
                        w41 y8 = w41.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y8.K(true);
                        y8.g = false;
                        y8.i = 1;
                        arrayList10.add(y8);
                        w41 y10 = w41.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(l0Var.F.reply);
                        y10.i = 1;
                        arrayList10.add(y10);
                        w41 y11 = w41.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(l0Var.F.read_messages);
                        y11.i = 1;
                        arrayList10.add(y11);
                        w41 y12 = w41.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(l0Var.F.delete_sent_messages);
                        y12.i = 1;
                        arrayList10.add(y12);
                        w41 y13 = w41.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(l0Var.F.delete_received_messages);
                        y13.i = 1;
                        arrayList10.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.F;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    w41 m11 = w41.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.F;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !l0Var.M;
                    final int i31 = 2;
                    m11.D = new View.OnClickListener() { // from class: sf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.c.U2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.U2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.U2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.U2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.F.manage_stories = !r0.manage_stories;
                                    l0Var6.c.U2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m11);
                    if (l0Var.M) {
                        w41 y14 = w41.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(l0Var.F.edit_name);
                        y14.i = 1;
                        arrayList10.add(y14);
                        w41 y15 = w41.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(l0Var.F.edit_bio);
                        y15.i = 1;
                        arrayList10.add(y15);
                        w41 y16 = w41.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(l0Var.F.edit_profile_photo);
                        y16.i = 1;
                        arrayList10.add(y16);
                        w41 y17 = w41.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(l0Var.F.edit_username);
                        y17.i = 1;
                        arrayList10.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.F;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    w41 m12 = w41.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.F;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !l0Var.N;
                    final int i32 = 3;
                    m12.D = new View.OnClickListener() { // from class: sf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.c.U2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.U2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.U2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.U2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.F.manage_stories = !r0.manage_stories;
                                    l0Var6.c.U2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m12);
                    if (l0Var.N) {
                        w41 y18 = w41.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(l0Var.F.view_gifts);
                        y18.i = 1;
                        arrayList10.add(y18);
                        w41 y19 = w41.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(l0Var.F.sell_gifts);
                        y19.i = 1;
                        arrayList10.add(y19);
                        w41 y20 = w41.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(l0Var.F.change_gift_settings);
                        y20.i = 1;
                        arrayList10.add(y20);
                        w41 y21 = w41.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(l0Var.F.transfer_and_upgrade_gifts);
                        y21.i = 1;
                        arrayList10.add(y21);
                        w41 y22 = w41.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(l0Var.F.transfer_stars);
                        y22.i = 1;
                        arrayList10.add(y22);
                    }
                    w41 m13 = w41.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m13.K(l0Var.F.manage_stories);
                    final int i33 = 4;
                    m13.D = new View.OnClickListener() { // from class: sf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.c.U2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.U2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.U2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.U2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.F.manage_stories = !r0.manage_stories;
                                    l0Var6.c.U2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m13);
                    k51Var3.T();
                    arrayList10.add(w41.A(-4, null));
                    arrayList10.add(w41.A(-5, null));
                    arrayList10.add(w41.A(-6, null));
                    arrayList10.add(w41.A(-7, null));
                    break;
                }
                break;
            case 20:
                sf.n0.U((sf.n0) this.b, (ArrayList) obj, (k51) obj2);
                break;
            case 21:
                sf.v0 v0Var = (sf.v0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i34 = R.raw.biz_map;
                w41 w41Var6 = new w41(2);
                w41Var6.l = string7;
                w41Var6.o = string8;
                w41Var6.k = i34;
                arrayList11.add(w41Var6);
                arrayList11.add(w41.k(v0Var.e));
                arrayList11.add(w41.B(null));
                w41 i35 = w41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i35.K(v0Var.x != null);
                arrayList11.add(i35);
                if (v0Var.x != null) {
                    arrayList11.add(w41.k(v0Var.h));
                }
                arrayList11.add(w41.B(null));
                if (v0Var.w != null && (v0Var.x != null || !TextUtils.isEmpty(v0Var.y))) {
                    z11 = true;
                }
                v0Var.C = z11;
                if (z11) {
                    w41 e10 = w41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e10.r = true;
                    arrayList11.add(e10);
                    arrayList11.add(w41.B(null));
                }
                v0Var.U(true);
                break;
            case 22:
                sf.x0.V((sf.x0) this.b, (ArrayList) obj);
                break;
            case 23:
                sf.z0 z0Var = (sf.z0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = z0Var.b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                w41 w41Var7 = new w41(9);
                w41Var7.d = -1;
                w41Var7.l = string9;
                w41Var7.K(z0Var.r);
                arrayList12.add(w41Var7);
                arrayList12.add(w41.B(null));
                if (z0Var.r) {
                    for (int i36 = 0; i36 < arrayList13.size(); i36++) {
                        if (i36 > 0) {
                            arrayList12.add(w41.B(null));
                        }
                        sf.w0 w0Var = (sf.w0) arrayList13.get(i36);
                        if (!z0Var.U()) {
                            int i37 = i36 * 3;
                            arrayList12.add(w41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), sf.w0.a(w0Var.a), i37));
                            arrayList12.add(w41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), sf.w0.a(w0Var.b), i37 + 1));
                            w41 e11 = w41.e(i37 + 2, LocaleController.getString(R.string.Remove));
                            e11.r = true;
                            arrayList12.add(e11);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList12.add(w41.B(null));
                        w41 c3 = w41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c3.q = true;
                        arrayList12.add(c3);
                    }
                    th.A(R.string.BusinessHoursDayInfo, arrayList12);
                    break;
                }
                break;
            case 24:
                sf.u1.V((sf.u1) this.b, (ArrayList) obj, (k51) obj2);
                break;
            case 25:
                a(obj, obj2);
                break;
            case 26:
                ((ArrayList) obj).add(w41.j(0, ((sh.b) this.b).T));
                break;
            case 27:
                Utilities.themeQueue.postRunnable(new sf.o1(i12, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 28:
                th.v vVar = (th.v) this.b;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(w41.j(1, vVar.W));
                arrayList14.add(w41.j(3, vVar.Z));
                if (vVar.e0 != null) {
                    arrayList14.add(w41.j(2, vVar.X));
                    break;
                }
                break;
            default:
                th.p3.I1((th.p3[]) this.b, (ArrayList) obj, (k51) obj2);
                break;
        }
    }
}
