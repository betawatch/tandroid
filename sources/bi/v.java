package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import ci.b4;
import ci.cc;
import ci.e2;
import ci.nc;
import ci.o8;
import ci.oc;
import ci.p8;
import ci.qb;
import ci.r6;
import ci.rc;
import ci.t2;
import ci.v8;
import ci.x8;
import ci.z1;
import ei.e4;
import ei.e5;
import ei.f5;
import ei.k3;
import ei.m2;
import ei.p1;
import gg.i0;
import hg.a0;
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
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        String str;
        String upperCase;
        boolean z10;
        l61 l61Var;
        int i10;
        String str2;
        String str3;
        int i11 = this.a;
        String str4 = "";
        boolean z11 = false;
        z11 = false;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ((y) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                int i12 = 0;
                while (i12 < size) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i13 = w.a;
                    x51 J = x51.J(w.class);
                    J.G = language;
                    arrayList.add(J);
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
                        bu editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
                        canvas.restore();
                        break;
                    }
                }
            case 2:
                z1 z1Var = (z1) obj3;
                String str5 = (String) obj;
                t2 t2Var = z1Var.r;
                t2Var.b = str5;
                t2Var.c = ((Integer) obj2).intValue();
                z1Var.c.H(str5);
                break;
            case 3:
                e2 e2Var = (e2) obj3;
                String str6 = (String) obj;
                t2 t2Var2 = e2Var.s;
                t2Var2.b = str6;
                t2Var2.c = ((Integer) obj2).intValue();
                e2Var.c.D(str6);
                break;
            case 4:
                b4 b4Var = (b4) obj3;
                if (obj != null) {
                    if (b4Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = b4Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    b4Var.getClass();
                    break;
                }
                break;
            case 5:
                r6 r6Var = (r6) obj3;
                r6Var.d0(r6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 6:
                ((nc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 7:
                x8 x8Var = (x8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (x8Var.h0 || x8Var.g0 != null) {
                    TLRPC.WebPage webPage = x8Var.g0;
                    p8 p8Var = new p8(x8Var, 0);
                    int i14 = v8.a;
                    x51 J2 = x51.J(v8.class);
                    J2.G = webPage;
                    J2.D = p8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(x51.k(x8Var.Y));
                arrayList2.add(x51.A(1, null));
                x51 i15 = x51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i15.K(x8Var.m0);
                arrayList2.add(i15);
                if (x8Var.m0) {
                    arrayList2.add(x51.k(x8Var.Z));
                }
                arrayList2.add(x51.A(3, null));
                arrayList2.add(x51.k(x8Var.a0));
                break;
            case 8:
                oc ocVar = (oc) obj3;
                Float f7 = (Float) obj2;
                long duration = ocVar.X0.getDuration() < 100 ? ocVar.K1.h0 : ocVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                o8 o8Var = ocVar.K1;
                float f10 = o8Var.a0;
                float f11 = o8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j3 = (long) (f12 * f13);
                cc ccVar = ocVar.X0;
                long j10 = (long) ((f11 * f13) + j3);
                ocVar.M1 = j10;
                ccVar.m(j10);
                qb qbVar = ocVar.v1;
                if (qbVar != null) {
                    qbVar.setCoverTime(ocVar.M1);
                }
                o8 o8Var2 = ocVar.K1;
                if (o8Var2 != null && o8Var2.g) {
                    o8Var2.j = true;
                    break;
                }
                break;
            case 9:
                ((rc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 10:
                ((di.i) obj3).C0((ArrayList) obj, (l61) obj2);
                break;
            case 11:
                di.h hVar = (di.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(x51.k(hVar.Y));
                arrayList3.add(x51.k(hVar.Z));
                break;
            case 12:
                ((ei.l) obj3).E0((ArrayList) obj, (l61) obj2);
                break;
            case 13:
                ei.u.U((ei.u) obj3, (ArrayList) obj);
                break;
            case 14:
                p6 p6Var = (p6) obj3;
                String str7 = (String) obj;
                Long l4 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l4.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l4.longValue()));
                }
                if (str7 == null) {
                    upperCase = null;
                } else {
                    if (!str7.isEmpty()) {
                        switch (str7) {
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
                                if (str7.contains("/")) {
                                    str7 = str7.substring(str7.indexOf("/") + 1);
                                }
                                if (str7.contains("-")) {
                                    str7 = str7.substring(str7.indexOf("-") + 1);
                                }
                                if (str7.contains("+")) {
                                    str7 = str7.substring(0, str7.indexOf("+"));
                                }
                                str = str7.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
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
                p1 p1Var = (p1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(x51.j(-1, p1Var.a0));
                arrayList4.add(x51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, p1Var.Y))));
                break;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    break;
                } else {
                    f5 f5Var = k3Var.v0;
                    if (f5Var != null) {
                        f5Var.a(tL_webViewResultUrl);
                        k3Var.n();
                        break;
                    }
                }
                break;
            case 17:
                ((e4) obj3).F0((ArrayList) obj, (l61) obj2);
                break;
            case 18:
                ((e5) obj3).U((ArrayList) obj, (l61) obj2);
                break;
            case 19:
                ((fi.s) obj3).v.c((ArrayList) obj);
                break;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                eo0 eo0Var = (eo0) ((i0) obj3);
                uy uyVar = eo0Var.I0;
                AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                w70 I = w70.I(uyVar, (i6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    w70 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kc0(I, 24), false);
                    J3.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J3.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J3.k();
                        }
                        J3.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new m2(I, J3, 8), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new n5(eo0Var, uyVar, eo0Var.J0, I, 29), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new wn0(eo0Var, uyVar, tL_sponsoredPeer, I, 0), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new dn0(eo0Var, uyVar, I, 1), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 21:
                hg.c.U((hg.c) obj3, (ArrayList) obj, (l61) obj2);
                break;
            case 22:
                hg.m mVar2 = (hg.m) obj3;
                mVar2.M.dismiss();
                mVar2.E = (String) obj;
                mVar2.F = (TLRPC.InputDocument) obj2;
                mVar2.x = false;
                AndroidUtilities.cancelRunOnUIThread(mVar2.e);
                mVar2.r.setSticker(mVar2.E);
                mVar2.e0(true);
                n61 n61Var = mVar2.a;
                if (n61Var != null && (l61Var = n61Var.Y2) != null) {
                    l61Var.N(true);
                    break;
                }
                break;
            case 23:
                l0 l0Var = (l0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                l61 l61Var2 = (l61) obj2;
                l61Var2.E = 1;
                LinearLayout linearLayout = l0Var.a0;
                x51 x51Var = new x51(-4);
                x51Var.d = -5;
                x51Var.c = linearLayout;
                x51Var.z = -1;
                arrayList5.add(x51Var);
                TL_account.TL_connectedBot tL_connectedBot = l0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        com.google.android.gms.internal.vision.e2.n(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(x51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList5.add(x51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList5.add(x51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(x51.B(null));
                    }
                    l61Var2.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotChats2, arrayList5);
                    int i16 = l0.g0;
                    x51 w10 = x51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(l0Var.e0);
                    arrayList5.add(w10);
                    int i17 = l0.h0;
                    x51 w11 = x51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!l0Var.e0);
                    arrayList5.add(w11);
                    l61Var2.T();
                    arrayList5.add(x51.B(null));
                    a0 a0Var = l0Var.Z;
                    if (a0Var != null) {
                        a0Var.a(arrayList5, l61Var2, true);
                    }
                    com.google.android.gms.internal.vision.e2.w(R.string.BusinessBotChatsInfo2, arrayList5);
                    break;
                }
                break;
            case 24:
                final u0 u0Var = (u0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                l61 l61Var3 = (l61) obj2;
                LongSparseArray longSparseArray = u0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                x51 x51Var2 = new x51(2);
                x51Var2.l = string;
                x51Var2.o = string2;
                x51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                x51Var2.n = "🤖🏝️";
                x51Var2.z = 120;
                arrayList6.add(x51Var2);
                if (u0Var.M != null) {
                    l61Var3.U();
                    long j11 = u0Var.M.id;
                    x51 x51Var3 = new x51(13);
                    x51Var3.x = j11;
                    x51Var3.K(true);
                    final int i18 = z11 ? 1 : 0;
                    x51Var3.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.Y2.N(true);
                                    u0Var2.Y(true);
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
                                    u0Var3.c.Y2.N(true);
                                    u0Var3.Y(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        u0Var4.X(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        u0Var4.c.Y2.N(true);
                                        u0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        u0Var5.X(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        u0Var5.c.Y2.N(true);
                                        u0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.Y2.N(true);
                                    u0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(x51Var3);
                    l61Var3.T();
                    str2 = "";
                } else {
                    l61Var3.U();
                    arrayList6.add(x51.k(u0Var.e));
                    longSparseArray.clear();
                    int i19 = 0;
                    boolean z12 = false;
                    while (i19 < u0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) u0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j12 = user.id;
                                String str8 = u0Var.y;
                                x51 x51Var4 = new x51(13);
                                x51Var4.x = j12;
                                x51Var4.n = str8;
                                arrayList6.add(x51Var4);
                                longSparseArray.put(user.id, user);
                                z12 = true;
                                i19++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i19++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i20 = 0; i20 < u0Var.d.e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) u0Var.d.e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.id;
                                String str9 = u0Var.y;
                                x51 x51Var5 = new x51(13);
                                x51Var5.x = j13;
                                x51Var5.n = str9;
                                arrayList6.add(x51Var5);
                                longSparseArray.put(user2.id, user2);
                                z12 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(u0Var.f.getText().toString()) || u0Var.d.e() || u0Var.x)) {
                        arrayList6.add(x51.k(u0Var.n));
                        z12 = true;
                    }
                    u0Var.h.setVisibility(z12 ? 0 : 8);
                    l61Var3.T();
                }
                arrayList6.add(x51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                l61Var3.U();
                x51 t10 = x51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = u0Var.M != null;
                arrayList6.add(t10);
                x51 w12 = x51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(u0Var.I);
                w12.g = u0Var.M != null;
                arrayList6.add(w12);
                x51 w13 = x51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!u0Var.I);
                w13.g = u0Var.M != null;
                arrayList6.add(w13);
                l61Var3.T();
                arrayList6.add(x51.B(null));
                u0Var.v.a(arrayList6, l61Var3, u0Var.M != null);
                com.google.android.gms.internal.vision.e2.w(R.string.BusinessBotChatsInfo2, arrayList6);
                if (u0Var.M != null) {
                    l61Var3.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotPermissions, arrayList6);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    x51 m10 = x51.m(-4, string3, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !u0Var.P;
                    final int i21 = 1;
                    m10.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.Y2.N(true);
                                    u0Var2.Y(true);
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
                                    u0Var3.c.Y2.N(true);
                                    u0Var3.Y(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.X(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.Y2.N(true);
                                        u0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        u0Var5.X(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        u0Var5.c.Y2.N(true);
                                        u0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.Y2.N(true);
                                    u0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (u0Var.P) {
                        x51 y3 = x51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.g = false;
                        y3.i = 1;
                        arrayList6.add(y3);
                        x51 y10 = x51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(u0Var.J.reply);
                        y10.i = 1;
                        arrayList6.add(y10);
                        x51 y11 = x51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(u0Var.J.read_messages);
                        y11.i = 1;
                        arrayList6.add(y11);
                        x51 y12 = x51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(u0Var.J.delete_sent_messages);
                        y12.i = 1;
                        arrayList6.add(y12);
                        x51 y13 = x51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(u0Var.J.delete_received_messages);
                        y13.i = 1;
                        arrayList6.add(y13);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    x51 m11 = x51.m(-10, string4, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !u0Var.Q;
                    final int i22 = 2;
                    m11.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.Y2.N(true);
                                    u0Var2.Y(true);
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
                                    u0Var3.c.Y2.N(true);
                                    u0Var3.Y(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.X(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.Y2.N(true);
                                        u0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.X(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.Y2.N(true);
                                        u0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.Y2.N(true);
                                    u0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (u0Var.Q) {
                        x51 y14 = x51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(u0Var.J.edit_name);
                        y14.i = 1;
                        arrayList6.add(y14);
                        x51 y15 = x51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(u0Var.J.edit_bio);
                        y15.i = 1;
                        arrayList6.add(y15);
                        x51 y16 = x51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(u0Var.J.edit_profile_photo);
                        y16.i = 1;
                        arrayList6.add(y16);
                        x51 y17 = x51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(u0Var.J.edit_username);
                        y17.i = 1;
                        arrayList6.add(y17);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    x51 m12 = x51.m(-15, string5, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !u0Var.R;
                    final int i23 = 3;
                    m12.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.Y2.N(true);
                                    u0Var2.Y(true);
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
                                    u0Var3.c.Y2.N(true);
                                    u0Var3.Y(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.X(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.Y2.N(true);
                                        u0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.X(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.Y2.N(true);
                                        u0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.Y2.N(true);
                                    u0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (u0Var.R) {
                        x51 y18 = x51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(u0Var.J.view_gifts);
                        y18.i = 1;
                        arrayList6.add(y18);
                        x51 y19 = x51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(u0Var.J.sell_gifts);
                        y19.i = 1;
                        arrayList6.add(y19);
                        x51 y20 = x51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(u0Var.J.change_gift_settings);
                        y20.i = 1;
                        arrayList6.add(y20);
                        x51 y21 = x51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(u0Var.J.transfer_and_upgrade_gifts);
                        y21.i = 1;
                        arrayList6.add(y21);
                        x51 y22 = x51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(u0Var.J.transfer_stars);
                        y22.i = 1;
                        arrayList6.add(y22);
                    }
                    x51 m13 = x51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(u0Var.J.manage_stories);
                    final int i24 = 4;
                    m13.D = new View.OnClickListener() { // from class: hg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.c.Y2.N(true);
                                    u0Var2.Y(true);
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
                                    u0Var3.c.Y2.N(true);
                                    u0Var3.Y(true);
                                    break;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        u0Var4.X(-14, true, new n0(u0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.c.Y2.N(true);
                                        u0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        u0Var5.X(-17, true, new n0(u0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.c.Y2.N(true);
                                        u0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var6 = u0Var;
                                    u0Var6.J.manage_stories = !r0.manage_stories;
                                    u0Var6.c.Y2.N(true);
                                    u0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    l61Var3.T();
                    arrayList6.add(x51.A(-4, null));
                    arrayList6.add(x51.A(-5, null));
                    arrayList6.add(x51.A(-6, null));
                    arrayList6.add(x51.A(-7, null));
                    break;
                }
                break;
            case 25:
                w0.U((w0) obj3, (ArrayList) obj, (l61) obj2);
                break;
            case 26:
                e1 e1Var = (e1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i25 = R.raw.biz_map;
                x51 x51Var6 = new x51(2);
                x51Var6.l = string6;
                x51Var6.o = string7;
                x51Var6.k = i25;
                arrayList7.add(x51Var6);
                arrayList7.add(x51.k(e1Var.e));
                arrayList7.add(x51.B(null));
                x51 i26 = x51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i26.K(e1Var.x != null);
                arrayList7.add(i26);
                if (e1Var.x != null) {
                    arrayList7.add(x51.k(e1Var.h));
                }
                arrayList7.add(x51.B(null));
                if (e1Var.w != null && (e1Var.x != null || !TextUtils.isEmpty(e1Var.y))) {
                    z11 = true;
                }
                e1Var.G = z11;
                if (z11) {
                    x51 e = x51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.r = true;
                    arrayList7.add(e);
                    arrayList7.add(x51.B(null));
                }
                e1Var.U(true);
                break;
            case 27:
                g1.V((g1) obj3, (ArrayList) obj);
                break;
            default:
                i1 i1Var = (i1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = i1Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                x51 x51Var7 = new x51(9);
                x51Var7.d = -1;
                x51Var7.l = string8;
                x51Var7.K(i1Var.r);
                arrayList8.add(x51Var7);
                arrayList8.add(x51.B(null));
                if (i1Var.r) {
                    for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                        if (i27 > 0) {
                            arrayList8.add(x51.B(null));
                        }
                        f1 f1Var = (f1) arrayList9.get(i27);
                        if (!i1Var.U()) {
                            int i28 = i27 * 3;
                            arrayList8.add(x51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), f1.a(f1Var.a), i28));
                            arrayList8.add(x51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), f1.a(f1Var.b), i28 + 1));
                            x51 e7 = x51.e(i28 + 2, LocaleController.getString(R.string.Remove));
                            e7.r = true;
                            arrayList8.add(e7);
                        }
                    }
                    if (i1Var.V()) {
                        arrayList8.add(x51.B(null));
                        x51 c11 = x51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c11.q = true;
                        arrayList8.add(c11);
                    }
                    com.google.android.gms.internal.vision.e2.w(R.string.BusinessHoursDayInfo, arrayList8);
                    break;
                }
                break;
        }
    }
}
