package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd;
import org.telegram.ui.bl0;
import org.telegram.ui.co;
import org.telegram.ui.dd0;
import org.telegram.ui.dz;
import org.telegram.ui.ec1;
import org.telegram.ui.f70;
import org.telegram.ui.gi0;
import org.telegram.ui.gv;
import org.telegram.ui.id0;
import org.telegram.ui.kh0;
import org.telegram.ui.oc;
import org.telegram.ui.qq;
import org.telegram.ui.sc;
import org.telegram.ui.xb0;
import org.telegram.ui.yh0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r13.equals("🎨") != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    @Override // org.telegram.ui.Components.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        h51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        oa0 oa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        jq0 jq0Var;
        String str6;
        dd0 dd0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                s6 s6Var = (s6) this.b;
                pb pbVar = (pb) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = pbVar.f;
                n6 n6Var = s6Var.w;
                y5 y5Var = s6Var.r;
                if (i10 >= 0 && i10 < n6Var.c.size()) {
                    i6 i6Var = (i6) n6Var.c.get(i10);
                    TL_stories.StoryView storyView = i6Var.b;
                    TL_stories.StoryReaction storyReaction = i6Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        pbVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().F(s6Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) i6Var.b).story, d9.a(y5Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        pbVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        r6 r6Var = s6Var.E;
                        if (r6Var != null && (arrayList = r6Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < s6Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) s6Var.E.i.get(i12);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i11 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                                i12++;
                            }
                            i12 = size;
                        }
                        if (i11 < 0 || arrayList2.size() <= 1) {
                            s6Var.G = null;
                            n2Var.createOverlayStoryViewer().F(s6Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, d9.a(y5Var));
                            break;
                        } else {
                            s6Var.G = new o8(s6Var.v, arrayList2);
                            s6Var.H = i12;
                            r6 r6Var2 = s6Var.E;
                            pb createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = s6Var.getContext();
                            o8 o8Var = s6Var.G;
                            d9 a2 = d9.a(y5Var);
                            a2.e = new a1.c(r6Var2, 6);
                            createOverlayStoryViewer.C(context, i11, o8Var, a2);
                            break;
                        }
                    } else {
                        boolean z11 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z11 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z11 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                            if (peerDialogId >= 0) {
                                bundle.putLong("user_id", peerDialogId);
                            } else {
                                bundle.putLong("chat_id", -peerDialogId);
                            }
                            bundle.putInt("message_id", message.id);
                            pbVar.H(new co(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ci.x xVar = (ci.x) this.b;
                o1 o1Var = (o1) this.c;
                v51 v51Var = xVar.Z;
                if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        o1Var.run(((TranslateController.Language) obj).code);
                        xVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                fi.e4.z0((fi.e4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.v5.x0((org.telegram.ui.v5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.W((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                oc ocVar = (oc) this.b;
                sc scVar = (sc) this.c;
                bd bdVar = ocVar.c;
                int i13 = scVar.d;
                ec1 ec1Var = scVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + ec1Var.getPaddingLeft()) {
                    ec1Var.v0(-((AndroidUtilities.dp(48.0f) + ec1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    ec1Var.v0(org.telegram.messenger.w1.z(48.0f, ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                co coVar = (co) this.b;
                gi0 gi0Var = (gi0) this.c;
                coVar.getClass();
                TLObject tLObject = (TLObject) gi0Var.c.get(i10);
                if (tLObject != null) {
                    coVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    coVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                qq.X((qq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                h51 G2 = zVar.m0.G(i10 - 1);
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
            case 9:
                vi.v((vi) this.b, (org.telegram.ui.ActionBar.f6) this.c, view);
                break;
            case 10:
                yj yjVar = (yj) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                sj sjVar = yjVar.E;
                s4.h0 adapter = yjVar.s.getAdapter();
                uj ujVar = yjVar.F;
                if (adapter == ujVar) {
                    O = ujVar.E(i10);
                } else {
                    int S = sjVar.S(i10);
                    int Q = sjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = sjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (yjVar.w.isEmpty()) {
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
                        pe0 pe0Var = new pe0(yjVar.b.f0, contact, null, null, null, null, str, str2, f6Var2);
                        pe0Var.K = new kj(yjVar);
                        pe0Var.show();
                        break;
                    } else {
                        yjVar.L((xj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                w70 w70Var = (w70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                s70 s70Var = w70Var.d;
                ArrayList arrayList3 = w70Var.h;
                if (!w70Var.E && arrayList3.get(i10) != w70Var.v) {
                    w70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.f4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = s70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = s70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.f4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.f7) {
                                ((org.telegram.ui.Cells.f7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (w70Var.s != 0) {
                        w70Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                oa0 oa0Var2 = (oa0) this.b;
                la0 la0Var = (la0) this.c;
                if (i10 == 0) {
                    oa0Var2.getClass();
                    break;
                } else {
                    hg.k1 adapter2 = oa0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = oa0Var2.getAdapter().J(i15);
                        int i16 = oa0Var2.getAdapter().X;
                        int i17 = oa0Var2.getAdapter().Y;
                        if (oa0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = oa0Var2.getAdapter().l0;
                            if (chat2 == null && oa0Var2.getAdapter().G0 != null) {
                                chat2 = oa0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(oa0Var2.getAdapter().F);
                            la0Var.v(i16, i17, a4.a.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (oa0Var2.getAdapter().F != null && i15 == 0) {
                            la0Var.v(i16, i17, a4.a.s(new StringBuilder(), oa0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                la0Var.n(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), oa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        la0Var.v(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        oa0Var = oa0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new o51(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        la0Var.v(i16, i17, spannableString, false);
                                    }
                                } else {
                                    oa0Var = oa0Var2;
                                    if (J instanceof String) {
                                        la0Var.v(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        la0Var.x(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                la0Var.v(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = la0Var.k();
                                                } catch (Exception e7) {
                                                    FileLog.e((Throwable) e7, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.z5(f10, fontMetricsInt) : new org.telegram.ui.Components.z5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                la0Var.v(i16, i17, spannableString2, false);
                                                oa0Var.o(false);
                                            }
                                        }
                                        la0Var.v(i16, i17, str9, true);
                                        oa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        la0Var.f(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(oa0Var.getAdapter().R);
                                        oa0Var.P = arrayList4;
                                        PhotoViewer.t1().K2(null, oa0Var.h, oa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, oa0Var.getAdapter().M(i15), 3, false, oa0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    la0Var.v(i16, i17, a4.a.p("@", publicUsername, " "), false);
                                }
                            }
                            oa0Var = oa0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                pg0.o((pg0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                f41.S((f41) this.b, (org.telegram.ui.ActionBar.f6) this.c, i10);
                break;
            case 15:
                gv gvVar = (gv) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                kp kpVar = (kp) gvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.i6 j3 = kpVar.a.j(gvVar.v);
                gg.b bVar = kpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    gg.b bVar2 = kpVar.a.c;
                    if (bVar2 == null) {
                        str6 = null;
                    } else {
                        str6 = bVar2.b;
                        if (str6 == null) {
                            str6 = bVar2.a;
                        }
                    }
                    break;
                }
                i11 = ((org.telegram.ui.ActionBar.c4) kpVar.a.f.get(gvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) kpVar.a.f.get(gvVar.v)).b;
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) kpVar.a.f.get(gvVar.v)).d)));
                    if (N0 != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) N0.c0.get(tL_theme.id);
                        if (h6Var == null) {
                            h6Var = N0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = h6Var.a;
                        N0.u(i11);
                    }
                    j3 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                gvVar.r = i10;
                int i18 = 0;
                while (i18 < gvVar.c.d.size()) {
                    ((kp) gvVar.c.d.get(i18)).d = i18 == gvVar.r;
                    i18++;
                }
                gvVar.c.E(gvVar.r);
                for (int i19 = 0; i19 < gvVar.a.getChildCount(); i19++) {
                    t11 t11Var = (t11) gvVar.a.getChildAt(i19);
                    if (t11Var != view && (jq0Var = t11Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(jq0Var);
                        t11Var.J.run();
                    }
                }
                ((t11) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((gvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.j6.F1(n2Var2);
                break;
            case 16:
                dz.U((dz) this.b, (Context) this.c, i10);
                break;
            case 17:
                f70.U((f70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
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
            case 19:
                yh0 yh0Var = (yh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = yh0Var.k0;
                if (i10 == yh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(yh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        yh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == yh0Var.x) {
                    xb0 xb0Var = new xb0(0, yh0Var.n);
                    xb0Var.T = yh0Var.s0;
                    yh0Var.presentFragment(xb0Var);
                    break;
                } else {
                    int i20 = yh0Var.y;
                    if (i10 >= i20 && i10 < yh0Var.E) {
                        r60 r60Var = new r60(context2, (TLRPC.TL_chatInviteExported) yh0Var.i0.get(i10 - i20), yh0Var.d, hashMap, yh0Var, yh0Var.n, false, yh0Var.h);
                        yh0Var.l0 = r60Var;
                        r60Var.k0 = yh0Var.p0;
                        r60Var.show();
                        break;
                    } else {
                        int i21 = yh0Var.H;
                        if (i10 >= i21 && i10 < yh0Var.I) {
                            r60 r60Var2 = new r60(context2, (TLRPC.TL_chatInviteExported) yh0Var.j0.get(i10 - i21), yh0Var.d, hashMap, yh0Var, yh0Var.n, false, yh0Var.h);
                            yh0Var.l0 = r60Var2;
                            r60Var2.show();
                            break;
                        } else if (i10 != yh0Var.N) {
                            int i22 = yh0Var.U;
                            if (i10 >= i22 && i10 < yh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) yh0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    yh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                yh0 yh0Var2 = new yh0(yh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                yh0Var2.g0(yh0Var.d, null);
                                yh0Var.presentFragment(yh0Var2);
                                break;
                            }
                        } else if (!yh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new kh0(yh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            yh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                bl0.U((bl0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                ug.b0.Q((ug.b0) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                ug.t0.P((ug.t0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
