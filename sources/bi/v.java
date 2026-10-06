package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import ci.a4;
import ci.e2;
import ci.jc;
import ci.k8;
import ci.kc;
import ci.l8;
import ci.mb;
import ci.nc;
import ci.q6;
import ci.r8;
import ci.s2;
import ci.t8;
import ci.yb;
import ci.z1;
import ei.e5;
import ei.f4;
import ei.f5;
import ei.l3;
import ei.n2;
import ei.q1;
import gg.i0;
import hg.b0;
import hg.e1;
import hg.f1;
import hg.g1;
import hg.i1;
import hg.l0;
import hg.u0;
import hg.w0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y61;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Utilities.Callback callback;
        String upperCase;
        w61 w61Var;
        int i10;
        int i11 = this.a;
        String str = "";
        final int i12 = 0;
        r3 = false;
        boolean z10 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        boolean z11 = false;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ((y) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                while (i12 < size) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i13 = w.a;
                    h61 K = h61.K(w.class);
                    K.G = language;
                    arrayList.add(K);
                }
                break;
            case 1:
                ci.m mVar = (ci.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.z0;
                ci.g gVar = mVar.f;
                if (mVar.g()) {
                    if (mVar.G == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.G.getWidth(), mVar.G.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, mVar.G.getWidth(), mVar.G.getHeight() - 1);
                        mVar.h(mVar.P, canvas, rectF, 0.0f, true, (-gVar.getX()) - r1.getPaddingLeft(), ((-gVar.getY()) - r1.getPaddingTop()) - r1.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(165);
                        canvas.drawBitmap(mVar.G, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c10 = mVar.P.c(1.0f);
                    gVar.getEditText().setHintColor(c10 == null ? -2130706433 : -1);
                    if (c10 == null) {
                        runnable.run();
                        break;
                    } else {
                        eu editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
                        canvas.restore();
                        break;
                    }
                }
            case 2:
                z1 z1Var = (z1) obj3;
                String str2 = (String) obj;
                s2 s2Var = z1Var.r;
                s2Var.b = str2;
                s2Var.c = ((Integer) obj2).intValue();
                z1Var.c.H(str2);
                break;
            case 3:
                e2 e2Var = (e2) obj3;
                String str3 = (String) obj;
                s2 s2Var2 = e2Var.s;
                s2Var2.b = str3;
                s2Var2.c = ((Integer) obj2).intValue();
                e2Var.c.D(str3);
                break;
            case 4:
                a4 a4Var = (a4) obj3;
                if (obj != null) {
                    if (a4Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = a4Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    a4Var.getClass();
                    break;
                }
                break;
            case 5:
                q6 q6Var = (q6) obj3;
                q6Var.d0(q6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 6:
                ((jc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 7:
                t8 t8Var = (t8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (t8Var.h0 || t8Var.g0 != null) {
                    TLRPC.WebPage webPage = t8Var.g0;
                    l8 l8Var = new l8(t8Var, 0);
                    int i14 = r8.a;
                    h61 K2 = h61.K(r8.class);
                    K2.G = webPage;
                    K2.D = l8Var;
                    arrayList2.add(K2);
                }
                arrayList2.add(h61.k(t8Var.Y));
                arrayList2.add(h61.B(1, null));
                h61 i15 = h61.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i15.L(t8Var.m0);
                arrayList2.add(i15);
                if (t8Var.m0) {
                    arrayList2.add(h61.k(t8Var.Z));
                }
                arrayList2.add(h61.B(3, null));
                arrayList2.add(h61.k(t8Var.a0));
                break;
            case 8:
                kc kcVar = (kc) obj3;
                Float f7 = (Float) obj2;
                long duration = kcVar.X0.getDuration() < 100 ? kcVar.K1.h0 : kcVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                k8 k8Var = kcVar.K1;
                float f10 = k8Var.a0;
                float f11 = k8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j3 = (long) (f12 * f13);
                yb ybVar = kcVar.X0;
                long j10 = (long) ((f11 * f13) + j3);
                kcVar.M1 = j10;
                ybVar.m(j10);
                mb mbVar = kcVar.v1;
                if (mbVar != null) {
                    mbVar.setCoverTime(kcVar.M1);
                }
                k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.g) {
                    k8Var2.j = true;
                    break;
                }
                break;
            case 9:
                ((nc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 10:
                ((di.k) obj3).I0((ArrayList) obj, (w61) obj2);
                break;
            case 11:
                di.j jVar = (di.j) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(h61.k(jVar.Y));
                arrayList3.add(h61.k(jVar.Z));
                break;
            case 12:
                ((ei.m) obj3).J0((ArrayList) obj, (w61) obj2);
                break;
            case 13:
                ei.v.S((ei.v) obj3, (ArrayList) obj);
                break;
            case 14:
                p6 p6Var = (p6) obj3;
                String str4 = (String) obj;
                Long l4 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l4.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l4.longValue()));
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
                p6Var.setText(sb2);
                break;
            case 15:
                q1 q1Var = (q1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(h61.j(-1, q1Var.a0));
                arrayList4.add(h61.C(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, q1Var.Y))));
                break;
            case 16:
                l3 l3Var = (l3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    l3Var.getClass();
                    break;
                } else {
                    f5 f5Var = l3Var.v0;
                    if (f5Var != null) {
                        f5Var.a(tL_webViewResultUrl);
                        l3Var.n();
                        break;
                    }
                }
                break;
            case 17:
                ((f4) obj3).K0((ArrayList) obj, (w61) obj2);
                break;
            case 18:
                ((e5) obj3).S((ArrayList) obj, (w61) obj2);
                break;
            case 19:
                ((fi.s) obj3).v.c((ArrayList) obj);
                break;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                jo0 jo0Var = (jo0) ((i0) obj3);
                uy uyVar = jo0Var.I0;
                AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                b80 I = b80.I(uyVar, (i6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    b80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lc0(I, 25), false);
                    J.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J.k();
                        }
                        J.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new n2(I, J, 8), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new m5(jo0Var, uyVar, jo0Var.J0, I, 29), false);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new bo0(jo0Var, uyVar, tL_sponsoredPeer, I, 0), false);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new in0(jo0Var, uyVar, I, 1), false);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = false;
                I.Z();
                break;
            case 21:
                hg.d.S((hg.d) obj3, (ArrayList) obj, (w61) obj2);
                break;
            case 22:
                hg.n nVar = (hg.n) obj3;
                nVar.M.dismiss();
                nVar.E = (String) obj;
                nVar.F = (TLRPC.InputDocument) obj2;
                nVar.x = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.e);
                nVar.r.setSticker(nVar.E);
                nVar.e0(true);
                y61 y61Var = nVar.a;
                if (y61Var != null && (w61Var = y61Var.f3) != null) {
                    w61Var.N(true);
                    break;
                }
                break;
            case 23:
                l0 l0Var = (l0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                w61 w61Var2 = (w61) obj2;
                w61Var2.E = 1;
                arrayList5.add(h61.l(-5, l0Var.a0));
                TL_account.TL_connectedBot tL_connectedBot = l0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        com.google.android.gms.internal.vision.e2.n(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(h61.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList5.add(h61.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList5.add(h61.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(h61.C(null));
                    }
                    w61Var2.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotChats2, arrayList5);
                    int i16 = l0.g0;
                    h61 x10 = h61.x(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    x10.L(l0Var.e0);
                    arrayList5.add(x10);
                    int i17 = l0.h0;
                    h61 x11 = h61.x(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    x11.L(!l0Var.e0);
                    arrayList5.add(x11);
                    w61Var2.T();
                    arrayList5.add(h61.C(null));
                    b0 b0Var = l0Var.Z;
                    if (b0Var != null) {
                        b0Var.a(arrayList5, w61Var2, true);
                    }
                    hg.c.n(R.string.BusinessBotChatsInfo2, arrayList5);
                    break;
                }
                break;
            case 24:
                final u0 u0Var = (u0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                w61 w61Var3 = (w61) obj2;
                LongSparseArray longSparseArray = u0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                h61 h61Var = new h61(2);
                h61Var.l = string;
                h61Var.o = string2;
                h61Var.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                h61Var.n = "🤖🏝️";
                h61Var.z = 120;
                arrayList6.add(h61Var);
                if (u0Var.M != null) {
                    w61Var3.U();
                    long j11 = u0Var.M.id;
                    h61 h61Var2 = new h61(13);
                    h61Var2.x = j11;
                    h61Var2.L(true);
                    h61Var2.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.f3.N(true);
                                    u0Var2.X(true);
                                    break;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var3.J;
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
                                    u0Var3.c.f3.N(true);
                                    u0Var3.X(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        u0Var4.W(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        u0Var4.c.f3.N(true);
                                        u0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        u0Var5.W(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        u0Var5.c.f3.N(true);
                                        u0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.f3.N(true);
                                    u0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(h61Var2);
                    w61Var3.T();
                } else {
                    w61Var3.U();
                    arrayList6.add(h61.k(u0Var.e));
                    longSparseArray.clear();
                    boolean z12 = false;
                    for (int i18 = 0; i18 < u0Var.d.d.size(); i18++) {
                        TLObject tLObject = (TLObject) u0Var.d.d.get(i18);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j12 = user.id;
                                String str5 = u0Var.y;
                                h61 h61Var3 = new h61(13);
                                h61Var3.x = j12;
                                h61Var3.n = str5;
                                arrayList6.add(h61Var3);
                                longSparseArray.put(user.id, user);
                                z12 = true;
                            }
                        }
                    }
                    for (int i19 = 0; i19 < u0Var.d.e.size(); i19++) {
                        TLObject tLObject2 = (TLObject) u0Var.d.e.get(i19);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.id;
                                String str6 = u0Var.y;
                                h61 h61Var4 = new h61(13);
                                h61Var4.x = j13;
                                h61Var4.n = str6;
                                arrayList6.add(h61Var4);
                                longSparseArray.put(user2.id, user2);
                                z12 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(u0Var.f.getText().toString()) || u0Var.d.e() || u0Var.x)) {
                        arrayList6.add(h61.k(u0Var.n));
                        z12 = true;
                    }
                    u0Var.h.setVisibility(z12 ? 0 : 8);
                    w61Var3.T();
                }
                arrayList6.add(h61.C(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                w61Var3.U();
                h61 u10 = h61.u(LocaleController.getString(R.string.BusinessBotChats2));
                u10.g = u0Var.M != null;
                arrayList6.add(u10);
                h61 x12 = h61.x(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                x12.L(u0Var.I);
                x12.g = u0Var.M != null;
                arrayList6.add(x12);
                h61 x13 = h61.x(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                x13.L(!u0Var.I);
                x13.g = u0Var.M != null;
                arrayList6.add(x13);
                w61Var3.T();
                arrayList6.add(h61.C(null));
                u0Var.v.a(arrayList6, w61Var3, u0Var.M != null);
                hg.c.n(R.string.BusinessBotChatsInfo2, arrayList6);
                if (u0Var.M != null) {
                    w61Var3.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotPermissions, arrayList6);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    h61 o9 = h61.o(-4, string3, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                    o9.L(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    o9.f = !u0Var.P;
                    final int i20 = 1;
                    o9.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.f3.N(true);
                                    u0Var2.X(true);
                                    break;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var3.J;
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
                                    u0Var3.c.f3.N(true);
                                    u0Var3.X(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.W(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.f3.N(true);
                                        u0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        u0Var5.W(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        u0Var5.c.f3.N(true);
                                        u0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.f3.N(true);
                                    u0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(o9);
                    if (u0Var.P) {
                        h61 z13 = h61.z(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        z13.L(true);
                        z13.g = false;
                        z13.i = 1;
                        arrayList6.add(z13);
                        h61 z14 = h61.z(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        z14.L(u0Var.J.reply);
                        z14.i = 1;
                        arrayList6.add(z14);
                        h61 z15 = h61.z(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        z15.L(u0Var.J.read_messages);
                        z15.i = 1;
                        arrayList6.add(z15);
                        h61 z16 = h61.z(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        z16.L(u0Var.J.delete_sent_messages);
                        z16.i = 1;
                        arrayList6.add(z16);
                        h61 z17 = h61.z(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        z17.L(u0Var.J.delete_received_messages);
                        z17.i = 1;
                        arrayList6.add(z17);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    h61 o10 = h61.o(-10, string4, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !u0Var.Q;
                    final int i21 = 2;
                    o10.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.f3.N(true);
                                    u0Var2.X(true);
                                    break;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.c.f3.N(true);
                                    u0Var3.X(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.W(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.f3.N(true);
                                        u0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.W(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.f3.N(true);
                                        u0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.f3.N(true);
                                    u0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(o10);
                    if (u0Var.Q) {
                        h61 z18 = h61.z(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        z18.L(u0Var.J.edit_name);
                        z18.i = 1;
                        arrayList6.add(z18);
                        h61 z19 = h61.z(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        z19.L(u0Var.J.edit_bio);
                        z19.i = 1;
                        arrayList6.add(z19);
                        h61 z20 = h61.z(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        z20.L(u0Var.J.edit_profile_photo);
                        z20.i = 1;
                        arrayList6.add(z20);
                        h61 z21 = h61.z(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        z21.L(u0Var.J.edit_username);
                        z21.i = 1;
                        arrayList6.add(z21);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    h61 o11 = h61.o(-15, string5, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z11 = true;
                    }
                    o11.L(z11);
                    o11.f = !u0Var.R;
                    final int i22 = 3;
                    o11.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.f3.N(true);
                                    u0Var2.X(true);
                                    break;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.c.f3.N(true);
                                    u0Var3.X(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.W(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.f3.N(true);
                                        u0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.W(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.f3.N(true);
                                        u0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.f3.N(true);
                                    u0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(o11);
                    if (u0Var.R) {
                        h61 z22 = h61.z(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        z22.L(u0Var.J.view_gifts);
                        z22.i = 1;
                        arrayList6.add(z22);
                        h61 z23 = h61.z(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        z23.L(u0Var.J.sell_gifts);
                        z23.i = 1;
                        arrayList6.add(z23);
                        h61 z24 = h61.z(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        z24.L(u0Var.J.change_gift_settings);
                        z24.i = 1;
                        arrayList6.add(z24);
                        h61 z25 = h61.z(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        z25.L(u0Var.J.transfer_and_upgrade_gifts);
                        z25.i = 1;
                        arrayList6.add(z25);
                        h61 z26 = h61.z(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        z26.L(u0Var.J.transfer_stars);
                        z26.i = 1;
                        arrayList6.add(z26);
                    }
                    h61 o12 = h61.o(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    o12.L(u0Var.J.manage_stories);
                    final int i23 = 4;
                    o12.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.f3.N(true);
                                    u0Var2.X(true);
                                    break;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.c.f3.N(true);
                                    u0Var3.X(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.W(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.f3.N(true);
                                        u0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.W(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.f3.N(true);
                                        u0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.f3.N(true);
                                    u0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(o12);
                    w61Var3.T();
                    arrayList6.add(h61.B(-4, null));
                    arrayList6.add(h61.B(-5, null));
                    arrayList6.add(h61.B(-6, null));
                    arrayList6.add(h61.B(-7, null));
                    break;
                }
                break;
            case 25:
                w0.S((w0) obj3, (ArrayList) obj, (w61) obj2);
                break;
            case 26:
                e1 e1Var = (e1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i24 = R.raw.biz_map;
                h61 h61Var5 = new h61(2);
                h61Var5.l = string6;
                h61Var5.o = string7;
                h61Var5.k = i24;
                arrayList7.add(h61Var5);
                arrayList7.add(h61.k(e1Var.e));
                arrayList7.add(h61.C(null));
                h61 i25 = h61.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i25.L(e1Var.x != null);
                arrayList7.add(i25);
                if (e1Var.x != null) {
                    arrayList7.add(h61.k(e1Var.h));
                }
                arrayList7.add(h61.C(null));
                if (e1Var.w != null && (e1Var.x != null || !TextUtils.isEmpty(e1Var.y))) {
                    z10 = true;
                }
                e1Var.G = z10;
                if (z10) {
                    h61 e7 = h61.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e7.r = true;
                    arrayList7.add(e7);
                    arrayList7.add(h61.C(null));
                }
                e1Var.S(true);
                break;
            case 27:
                g1.T((g1) obj3, (ArrayList) obj);
                break;
            case 28:
                i1 i1Var = (i1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = i1Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                h61 h61Var6 = new h61(9);
                h61Var6.d = -1;
                h61Var6.l = string8;
                h61Var6.L(i1Var.r);
                arrayList8.add(h61Var6);
                arrayList8.add(h61.C(null));
                if (i1Var.r) {
                    for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                        if (i26 > 0) {
                            arrayList8.add(h61.C(null));
                        }
                        f1 f1Var = (f1) arrayList9.get(i26);
                        if (!i1Var.S()) {
                            int i27 = i26 * 3;
                            arrayList8.add(h61.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), f1.a(f1Var.a), i27));
                            arrayList8.add(h61.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), f1.a(f1Var.b), i27 + 1));
                            h61 e10 = h61.e(i27 + 2, LocaleController.getString(R.string.Remove));
                            e10.r = true;
                            arrayList8.add(e10);
                        }
                    }
                    if (i1Var.T()) {
                        arrayList8.add(h61.C(null));
                        h61 c11 = h61.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c11.q = true;
                        arrayList8.add(c11);
                    }
                    hg.c.n(R.string.BusinessHoursDayInfo, arrayList8);
                    break;
                }
                break;
            default:
                hg.e2.T((hg.e2) obj3, (ArrayList) obj, (w61) obj2);
                break;
        }
    }
}
