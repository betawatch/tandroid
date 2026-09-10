package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import di.h4;
import fg.l1;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.h7;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.al0;
import org.telegram.ui.cd;
import org.telegram.ui.dd0;
import org.telegram.ui.e70;
import org.telegram.ui.eo;
import org.telegram.ui.fz;
import org.telegram.ui.gi0;
import org.telegram.ui.hv;
import org.telegram.ui.ic1;
import org.telegram.ui.id0;
import org.telegram.ui.lh0;
import org.telegram.ui.pc;
import org.telegram.ui.rq;
import org.telegram.ui.tc;
import org.telegram.ui.w5;
import org.telegram.ui.xb0;
import org.telegram.ui.zh0;
import org.webrtc.MediaStreamTrack;
import s4.h0;
import sg.u0;
import zh.c5;
import zh.h3;
import zh.r3;
import zh.s5;
import zh.u7;
import zh.v3;
import zh.y3;
import zh.z3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0399, code lost:
    
        if (r13.equals("🎨") != false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0649  */
    @Override // org.telegram.ui.Components.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        v51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        xa0 xa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        uq0 uq0Var;
        String str6;
        dd0 dd0Var;
        float maxZoomLevel;
        float f7;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                b bVar = (b) this.c;
                j61 j61Var = f0Var.Z;
                if (j61Var != null && (G = j61Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        bVar.run(((TranslateController.Language) obj).code);
                        f0Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                h4.z0((h4) this.b, (Context) this.c, i10);
                break;
            case 2:
                w5.x0((w5) this.b, (Context) this.c, view, i10);
                break;
            case 3:
                cd.W((cd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 4:
                pc pcVar = (pc) this.b;
                tc tcVar = (tc) this.c;
                cd cdVar = pcVar.c;
                int i13 = tcVar.d;
                ic1 ic1Var = tcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                cdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                cdVar.X0(true);
                cdVar.a1(true);
                cdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + ic1Var.getPaddingLeft()) {
                    ic1Var.v0(-((AndroidUtilities.dp(48.0f) + ic1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    ic1Var.v0(a2.z(48.0f, ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 5:
                eo eoVar = (eo) this.b;
                gi0 gi0Var = (gi0) this.c;
                eoVar.getClass();
                TLObject tLObject = (TLObject) gi0Var.c.get(i10);
                if (tLObject != null) {
                    eoVar.A7(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    eoVar.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 6:
                rq.X((rq) this.b, (Context) this.c, view, i10);
                break;
            case 7:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) this.b;
                f6 f6Var = (f6) this.c;
                v51 G2 = zVar.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zVar.getContext(), 0, f6Var);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.t(zVar, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 8:
                yi.v((yi) this.b, (f6) this.c, view);
                break;
            case 9:
                bk bkVar = (bk) this.b;
                f6 f6Var2 = (f6) this.c;
                vj vjVar = bkVar.E;
                h0 adapter = bkVar.s.getAdapter();
                xj xjVar = bkVar.F;
                if (adapter == xjVar) {
                    O = xjVar.E(i10);
                } else {
                    int S = vjVar.S(i10);
                    int Q = vjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = vjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (bkVar.w.isEmpty()) {
                        if (O instanceof ContactsController.Contact) {
                            ContactsController.Contact contact2 = (ContactsController.Contact) O;
                            TLRPC.User user = contact2.user;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = contact2.first_name;
                                str4 = contact2.last_name;
                            }
                            contact = contact2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            ContactsController.Contact contact3 = new ContactsController.Contact();
                            String str7 = user2.first_name;
                            contact3.first_name = str7;
                            String str8 = user2.last_name;
                            contact3.last_name = str8;
                            contact3.phones.add(user2.phone);
                            contact3.user = user2;
                            contact = contact3;
                            str = str7;
                            str2 = str8;
                        }
                        ye0 ye0Var = new ye0(bkVar.b.f0, contact, null, null, null, null, str, str2, f6Var2);
                        ye0Var.K = new nj(bkVar);
                        ye0Var.show();
                        break;
                    } else {
                        bkVar.L((ak) view, O);
                        break;
                    }
                }
                break;
            case 10:
                f80 f80Var = (f80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                b80 b80Var = f80Var.d;
                ArrayList arrayList2 = f80Var.h;
                if (!f80Var.E && arrayList2.get(i10) != f80Var.v) {
                    f80Var.v = (TLRPC.Peer) arrayList2.get(i10);
                    boolean z11 = view instanceof g4;
                    if (z11) {
                        z10 = true;
                        ((g4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof h7) {
                            ((h7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = b80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = b80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z11) {
                                ((g4) childAt).c(false, z10);
                            } else if (view instanceof h7) {
                                ((h7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (f80Var.s != 0) {
                        f80Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 11:
                xa0 xa0Var2 = (xa0) this.b;
                ua0 ua0Var = (ua0) this.c;
                if (i10 == 0) {
                    xa0Var2.getClass();
                    break;
                } else {
                    l1 adapter2 = xa0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = xa0Var2.getAdapter().J(i15);
                        int i16 = xa0Var2.getAdapter().X;
                        int i17 = xa0Var2.getAdapter().Y;
                        if (xa0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = xa0Var2.getAdapter().l0;
                            if (chat2 == null && xa0Var2.getAdapter().G0 != null) {
                                chat2 = xa0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(xa0Var2.getAdapter().F);
                            ua0Var.z(i16, i17, a4.a.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (xa0Var2.getAdapter().F != null && i15 == 0) {
                            ua0Var.z(i16, i17, a4.a.s(new StringBuilder(), xa0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof e8) {
                                    ((e8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ua0Var.v(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), xa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ua0Var.z(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(r6.t(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        xa0Var = xa0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new c61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        ua0Var.z(i16, i17, spannableString, false);
                                    }
                                } else {
                                    xa0Var = xa0Var2;
                                    if (J instanceof String) {
                                        ua0Var.z(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ua0Var.K(str9);
                                        if (str9 == null || !str9.startsWith("animated_")) {
                                            ua0Var.z(i16, i17, str9, true);
                                        } else {
                                            try {
                                                try {
                                                    fontMetricsInt = ua0Var.o();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = p5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new y5(f10, fontMetricsInt) : new y5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ua0Var.z(i16, i17, spannableString2, false);
                                            } catch (Exception unused) {
                                                ua0Var.z(i16, i17, str9, true);
                                            }
                                        }
                                        xa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ua0Var.d(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList(xa0Var.getAdapter().R);
                                        xa0Var.P = arrayList3;
                                        PhotoViewer.t1().K2(null, xa0Var.h, xa0Var.a);
                                        PhotoViewer.t1().f2(arrayList3, xa0Var.getAdapter().M(i15), 3, false, xa0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ua0Var.z(i16, i17, a4.a.p("@", publicUsername, " "), false);
                                }
                            }
                            xa0Var = xa0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 12:
                zg0.o((zg0) this.b, (Context) this.c, view, i10);
                break;
            case 13:
                t41.S((t41) this.b, (f6) this.c, i10);
                break;
            case 14:
                hv hvVar = (hv) this.b;
                p2 p2Var = (p2) this.c;
                rp rpVar = (rp) hvVar.c.d.get(i10);
                i6 j3 = rpVar.a.j(hvVar.v);
                eg.b bVar2 = rpVar.a.c;
                if (bVar2 == null) {
                    str5 = null;
                } else {
                    str5 = bVar2.b;
                    if (str5 == null) {
                        str5 = bVar2.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    eg.b bVar3 = rpVar.a.c;
                    if (bVar3 == null) {
                        str6 = null;
                    } else {
                        str6 = bVar3.b;
                        if (str6 == null) {
                            str6 = bVar3.a;
                        }
                    }
                    break;
                }
                i11 = ((e4) rpVar.a.f.get(hvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((e4) rpVar.a.f.get(hvVar.v)).b;
                    i6 N0 = j6.N0(j6.q0(tL_theme.settings.get(((e4) rpVar.a.f.get(hvVar.v)).d)));
                    if (N0 != null) {
                        h6 h6Var = (h6) N0.c0.get(tL_theme.id);
                        if (h6Var == null) {
                            h6Var = N0.f(tL_theme, p2Var.getCurrentAccount(), 0);
                        }
                        i11 = h6Var.a;
                        N0.u(i11);
                    }
                    j3 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                hvVar.r = i10;
                int i18 = 0;
                while (i18 < hvVar.c.d.size()) {
                    ((rp) hvVar.c.d.get(i18)).d = i18 == hvVar.r;
                    i18++;
                }
                hvVar.c.E(hvVar.r);
                for (int i19 = 0; i19 < hvVar.a.getChildCount(); i19++) {
                    i21 i21Var = (i21) hvVar.a.getChildAt(i19);
                    if (i21Var != view && (uq0Var = i21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(uq0Var);
                        i21Var.J.run();
                    }
                }
                ((i21) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((hvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                j6.F1(p2Var);
                break;
            case 15:
                fz.U((fz) this.b, (Context) this.c, i10);
                break;
            case 16:
                e70.U((e70) this.b, (Context) this.c, view, i10);
                break;
            case 17:
                id0 id0Var = (id0) this.b;
                org.telegram.ui.ActionBar.z zVar2 = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = id0Var.W.I(i10);
                if (I != null && I.icon != null && id0Var.G0 == 8 && id0Var.I != null) {
                    id0Var.C0 = true;
                    zVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = id0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = id0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = id0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = id0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        id0Var.x0.setLongitude(I.geo._long);
                    }
                    id0Var.T.L(id0Var.x0);
                    break;
                } else if (I != null && (dd0Var = id0Var.F0) != null) {
                    dd0Var.b(I, id0Var.G0, true, 0, 0L);
                    id0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                zh0 zh0Var = (zh0) this.b;
                Context context = (Context) this.c;
                HashMap hashMap = zh0Var.k0;
                if (i10 == zh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(zh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        zh0Var.presentFragment(new ProfileActivity(bundle2, null));
                        break;
                    }
                } else if (i10 == zh0Var.x) {
                    xb0 xb0Var = new xb0(0, zh0Var.n);
                    xb0Var.T = zh0Var.s0;
                    zh0Var.presentFragment(xb0Var);
                    break;
                } else {
                    int i20 = zh0Var.y;
                    if (i10 >= i20 && i10 < zh0Var.E) {
                        a70 a70Var = new a70(context, (TLRPC.TL_chatInviteExported) zh0Var.i0.get(i10 - i20), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
                        zh0Var.l0 = a70Var;
                        a70Var.k0 = zh0Var.p0;
                        a70Var.show();
                        break;
                    } else {
                        int i21 = zh0Var.H;
                        if (i10 >= i21 && i10 < zh0Var.I) {
                            a70 a70Var2 = new a70(context, (TLRPC.TL_chatInviteExported) zh0Var.j0.get(i10 - i21), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
                            zh0Var.l0 = a70Var2;
                            a70Var2.show();
                            break;
                        } else if (i10 != zh0Var.N) {
                            int i22 = zh0Var.U;
                            if (i10 >= i22 && i10 < zh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) zh0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    zh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                zh0 zh0Var2 = new zh0(zh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                zh0Var2.g0(zh0Var.d, null);
                                zh0Var.presentFragment(zh0Var2);
                                break;
                            }
                        } else if (!zh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new lh0(zh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            zh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 19:
                al0.U((al0) this.b, (Context) this.c, view, i10);
                break;
            case 20:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                sg.a0.Q((sg.a0) this.b, (p2) this.c, view);
                break;
            case 23:
                u0.P((u0) this.b, (TLRPC.Chat) this.c, view);
                break;
            default:
                z3 z3Var = (z3) this.b;
                u7 u7Var = (u7) this.c;
                p2 p2Var2 = u7Var.f;
                v3 v3Var = z3Var.w;
                h3 h3Var = z3Var.r;
                if (i10 >= 0 && i10 < v3Var.c.size()) {
                    r3 r3Var = (r3) v3Var.c.get(i10);
                    TL_stories.StoryView storyView = r3Var.b;
                    TL_stories.StoryReaction storyReaction = r3Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        u7Var.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        p2Var2.createOverlayStoryViewer().G(z3Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) r3Var.b).story, s5.a(h3Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        u7Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList4 = new ArrayList();
                        y3 y3Var = z3Var.E;
                        if (y3Var != null && (arrayList = y3Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < z3Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) z3Var.E.i.get(i12);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i11 = arrayList4.size();
                                    }
                                    arrayList4.add(storyItem);
                                }
                                i12++;
                            }
                            i12 = size;
                        }
                        if (i11 < 0 || arrayList4.size() <= 1) {
                            z3Var.G = null;
                            p2Var2.createOverlayStoryViewer().G(z3Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, s5.a(h3Var));
                            break;
                        } else {
                            z3Var.G = new c5(z3Var.v, arrayList4);
                            z3Var.H = i12;
                            y3 y3Var2 = z3Var.E;
                            u7 createOverlayStoryViewer = p2Var2.createOverlayStoryViewer();
                            Context context2 = z3Var.getContext();
                            c5 c5Var = z3Var.G;
                            s5 a2 = s5.a(h3Var);
                            a2.e = new th.e(y3Var2, 23);
                            createOverlayStoryViewer.C(context2, i11, c5Var, a2);
                            break;
                        }
                    } else {
                        boolean z12 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z12 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z12 ? storyReaction.message : storyView.message;
                            Bundle bundle3 = new Bundle();
                            long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                            if (peerDialogId >= 0) {
                                bundle3.putLong("user_id", peerDialogId);
                            } else {
                                bundle3.putLong("chat_id", -peerDialogId);
                            }
                            bundle3.putInt("message_id", message.id);
                            u7Var.H(new eo(bundle3));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
