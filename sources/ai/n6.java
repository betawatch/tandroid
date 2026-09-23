package ai;

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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.zj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ad;
import org.telegram.ui.ai0;
import org.telegram.ui.az;
import org.telegram.ui.b70;
import org.telegram.ui.cv;
import org.telegram.ui.dd0;
import org.telegram.ui.fh0;
import org.telegram.ui.lq;
import org.telegram.ui.sb0;
import org.telegram.ui.sk0;
import org.telegram.ui.th0;
import org.telegram.ui.wb1;
import org.telegram.ui.xn;
import org.telegram.ui.yc0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r13.equals("🎨") != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    @Override // org.telegram.ui.Components.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
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
        yc0 yc0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                jc jcVar = (jc) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = jcVar.f;
                e7 e7Var = k7Var.w;
                o6 o6Var = k7Var.r;
                if (i10 >= 0 && i10 < e7Var.c.size()) {
                    z6 z6Var = (z6) e7Var.c.get(i10);
                    TL_stories.StoryView storyView = z6Var.b;
                    TL_stories.StoryReaction storyReaction = z6Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        jcVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().F(k7Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) z6Var.b).story, u9.a(o6Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        jcVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        j7 j7Var = k7Var.E;
                        if (j7Var != null && (arrayList = j7Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < k7Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) k7Var.E.i.get(i12);
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
                            k7Var.G = null;
                            n2Var.createOverlayStoryViewer().F(k7Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, u9.a(o6Var));
                            break;
                        } else {
                            k7Var.G = new g9(k7Var.v, arrayList2);
                            k7Var.H = i12;
                            j7 j7Var2 = k7Var.E;
                            jc createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = k7Var.getContext();
                            g9 g9Var = k7Var.G;
                            u9 a2 = u9.a(o6Var);
                            a2.e = new a1.c(j7Var2, 6);
                            createOverlayStoryViewer.C(context, i11, g9Var, a2);
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
                            jcVar.H(new xn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                v51 v51Var = yVar.Z;
                if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        y1Var.run(((TranslateController.Language) obj).code);
                        yVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ei.e4.z0((ei.e4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.w5.x0((org.telegram.ui.w5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                ad.W((ad) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                org.telegram.ui.mc mcVar = (org.telegram.ui.mc) this.b;
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.c;
                ad adVar = mcVar.c;
                int i13 = rcVar.d;
                wb1 wb1Var = rcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                adVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                adVar.X0(true);
                adVar.a1(true);
                adVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + wb1Var.getPaddingLeft()) {
                    wb1Var.v0(-((AndroidUtilities.dp(48.0f) + wb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    wb1Var.v0(org.telegram.messenger.z0.z(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                xn xnVar = (xn) this.b;
                ai0 ai0Var = (ai0) this.c;
                xnVar.getClass();
                TLObject tLObject = (TLObject) ai0Var.c.get(i10);
                if (tLObject != null) {
                    xnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    xnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                lq.X((lq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                h51 G2 = yVar2.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar2.getContext(), 0, d6Var);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar2, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 9:
                wi.v((wi) this.b, (org.telegram.ui.ActionBar.d6) this.c, view);
                break;
            case 10:
                zj zjVar = (zj) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                tj tjVar = zjVar.E;
                s4.h0 adapter = zjVar.s.getAdapter();
                vj vjVar = zjVar.F;
                if (adapter == vjVar) {
                    O = vjVar.E(i10);
                } else {
                    int S = tjVar.S(i10);
                    int Q = tjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = tjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (zjVar.w.isEmpty()) {
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
                        pe0 pe0Var = new pe0(zjVar.b.f0, contact, null, null, null, null, str, str2, d6Var2);
                        pe0Var.K = new lj(zjVar);
                        pe0Var.show();
                        break;
                    } else {
                        zjVar.L((yj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                x70 x70Var = (x70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                t70 t70Var = x70Var.d;
                ArrayList arrayList3 = x70Var.h;
                if (!x70Var.E && arrayList3.get(i10) != x70Var.v) {
                    x70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.g4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = t70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = t70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.f7) {
                                ((org.telegram.ui.Cells.f7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (x70Var.s != 0) {
                        x70Var.w(chat, z10);
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
                    gg.k1 adapter2 = oa0Var2.getAdapter();
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
                            la0Var.L(i16, i17, a4.a.t(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (oa0Var2.getAdapter().F != null && i15 == 0) {
                            la0Var.L(i16, i17, a4.a.t(new StringBuilder(), oa0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.e8) {
                                    ((org.telegram.ui.Cells.e8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                la0Var.A(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), oa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        la0Var.L(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(w.c.g(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        oa0Var = oa0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new o51(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        la0Var.L(i16, i17, spannableString, false);
                                    }
                                } else {
                                    oa0Var = oa0Var2;
                                    if (J instanceof String) {
                                        la0Var.L(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        la0Var.O(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                la0Var.L(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = la0Var.w();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.z5(f10, fontMetricsInt) : new org.telegram.ui.Components.z5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                la0Var.L(i16, i17, spannableString2, false);
                                                oa0Var.o(false);
                                            }
                                        }
                                        la0Var.L(i16, i17, str9, true);
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
                                        PhotoViewer.t1().J2(null, oa0Var.h, oa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, oa0Var.getAdapter().M(i15), 3, false, oa0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    la0Var.L(i16, i17, a4.a.q("@", publicUsername, " "), false);
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
                qg0.o((qg0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                f41.S((f41) this.b, (org.telegram.ui.ActionBar.d6) this.c, i10);
                break;
            case 15:
                cv cvVar = (cv) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                mp mpVar = (mp) cvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.g6 j3 = mpVar.a.j(cvVar.v);
                fg.b bVar = mpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    fg.b bVar2 = mpVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.b4) mpVar.a.f.get(cvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) mpVar.a.f.get(cvVar.v)).b;
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0(org.telegram.ui.ActionBar.h6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) mpVar.a.f.get(cvVar.v)).d)));
                    if (N0 != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) N0.c0.get(tL_theme.id);
                        if (f6Var == null) {
                            f6Var = N0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = f6Var.a;
                        N0.u(i11);
                    }
                    j3 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                cvVar.r = i10;
                int i18 = 0;
                while (i18 < cvVar.c.d.size()) {
                    ((mp) cvVar.c.d.get(i18)).d = i18 == cvVar.r;
                    i18++;
                }
                cvVar.c.E(cvVar.r);
                for (int i19 = 0; i19 < cvVar.a.getChildCount(); i19++) {
                    t11 t11Var = (t11) cvVar.a.getChildAt(i19);
                    if (t11Var != view && (jq0Var = t11Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(jq0Var);
                        t11Var.J.run();
                    }
                }
                ((t11) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((cvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.h6.F1(n2Var2);
                break;
            case 16:
                az.U((az) this.b, (Context) this.c, i10);
                break;
            case 17:
                b70.U((b70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                dd0 dd0Var = (dd0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = dd0Var.W.I(i10);
                if (I != null && I.icon != null && dd0Var.G0 == 8 && dd0Var.I != null) {
                    dd0Var.C0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = dd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = dd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = dd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = dd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        dd0Var.x0.setLongitude(I.geo._long);
                    }
                    dd0Var.T.L(dd0Var.x0);
                    break;
                } else if (I != null && (yc0Var = dd0Var.F0) != null) {
                    yc0Var.b(I, dd0Var.G0, true, 0, 0L);
                    dd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                th0 th0Var = (th0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = th0Var.k0;
                if (i10 == th0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(th0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        th0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == th0Var.x) {
                    sb0 sb0Var = new sb0(0, th0Var.n);
                    sb0Var.T = th0Var.s0;
                    th0Var.presentFragment(sb0Var);
                    break;
                } else {
                    int i20 = th0Var.y;
                    if (i10 >= i20 && i10 < th0Var.E) {
                        s60 s60Var = new s60(context2, (TLRPC.TL_chatInviteExported) th0Var.i0.get(i10 - i20), th0Var.d, hashMap, th0Var, th0Var.n, false, th0Var.h);
                        th0Var.l0 = s60Var;
                        s60Var.k0 = th0Var.p0;
                        s60Var.show();
                        break;
                    } else {
                        int i21 = th0Var.H;
                        if (i10 >= i21 && i10 < th0Var.I) {
                            s60 s60Var2 = new s60(context2, (TLRPC.TL_chatInviteExported) th0Var.j0.get(i10 - i21), th0Var.d, hashMap, th0Var, th0Var.n, false, th0Var.h);
                            th0Var.l0 = s60Var2;
                            s60Var2.show();
                            break;
                        } else if (i10 != th0Var.N) {
                            int i22 = th0Var.U;
                            if (i10 >= i22 && i10 < th0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) th0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    th0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                th0 th0Var2 = new th0(th0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                th0Var2.g0(th0Var.d, null);
                                th0Var.presentFragment(th0Var2);
                                break;
                            }
                        } else if (!th0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(th0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new fh0(th0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            th0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                sk0.U((sk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                tg.b0.Q((tg.b0) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                tg.t0.P((tg.t0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
