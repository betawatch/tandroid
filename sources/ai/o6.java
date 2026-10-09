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
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.z21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.al0;
import org.telegram.ui.bd;
import org.telegram.ui.c70;
import org.telegram.ui.cd0;
import org.telegram.ui.cz;
import org.telegram.ui.ev;
import org.telegram.ui.fc1;
import org.telegram.ui.hd0;
import org.telegram.ui.hi0;
import org.telegram.ui.lh0;
import org.telegram.ui.nq;
import org.telegram.ui.vb0;
import org.telegram.ui.zh0;
import org.telegram.ui.zn;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r13.equals("🎨") != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    @Override // org.telegram.ui.Components.em0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        p61 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        pb0 pb0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        or0 or0Var;
        String str6;
        cd0 cd0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.b;
                kc kcVar = (kc) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = kcVar.f;
                f7 f7Var = l7Var.w;
                p6 p6Var = l7Var.r;
                if (i10 >= 0 && i10 < f7Var.c.size()) {
                    a7 a7Var = (a7) f7Var.c.get(i10);
                    TL_stories.StoryView storyView = a7Var.b;
                    TL_stories.StoryReaction storyReaction = a7Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        kcVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().F(l7Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) a7Var.b).story, v9.a(p6Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        kcVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        k7 k7Var = l7Var.E;
                        if (k7Var != null && (arrayList = k7Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < l7Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) l7Var.E.i.get(i12);
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
                            l7Var.G = null;
                            n2Var.createOverlayStoryViewer().F(l7Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, v9.a(p6Var));
                            break;
                        } else {
                            l7Var.G = new h9(l7Var.v, arrayList2);
                            l7Var.H = i12;
                            k7 k7Var2 = l7Var.E;
                            kc createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = l7Var.getContext();
                            h9 h9Var = l7Var.G;
                            v9 a2 = v9.a(p6Var);
                            a2.e = new a1.c(k7Var2, 6);
                            createOverlayStoryViewer.C(context, i11, h9Var, a2);
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
                            kcVar.H(new zn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                c71 c71Var = yVar.Z;
                if (c71Var != null && (G = c71Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        y1Var.run(((TranslateController.Language) obj).code);
                        yVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ei.e4.A0((ei.e4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.v5.y0((org.telegram.ui.v5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.W((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                org.telegram.ui.nc ncVar = (org.telegram.ui.nc) this.b;
                org.telegram.ui.sc scVar = (org.telegram.ui.sc) this.c;
                bd bdVar = ncVar.c;
                int i13 = scVar.d;
                fc1 fc1Var = scVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                    fc1Var.v0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    fc1Var.v0(org.telegram.messenger.q.A(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                zn znVar = (zn) this.b;
                hi0 hi0Var = (hi0) this.c;
                znVar.getClass();
                TLObject tLObject = (TLObject) hi0Var.c.get(i10);
                if (tLObject != null) {
                    znVar.D7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    znVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                nq.X((nq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                p61 G2 = yVar2.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar2.getContext(), 0, e6Var);
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
                yi.y((yi) this.b, (org.telegram.ui.ActionBar.e6) this.c, view);
                break;
            case 10:
                ck ckVar = (ck) this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
                wj wjVar = ckVar.E;
                s4.i0 adapter = ckVar.s.getAdapter();
                yj yjVar = ckVar.F;
                if (adapter == yjVar) {
                    O = yjVar.E(i10);
                } else {
                    int S = wjVar.S(i10);
                    int Q = wjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = wjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (ckVar.w.isEmpty()) {
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
                        qf0 qf0Var = new qf0(ckVar.b.f0, contact, null, null, null, null, str, str2, e6Var2);
                        qf0Var.K = new oj(ckVar);
                        qf0Var.show();
                        break;
                    } else {
                        ckVar.O((bk) view, O);
                        break;
                    }
                }
                break;
            case 11:
                y80 y80Var = (y80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                u80 u80Var = y80Var.d;
                ArrayList arrayList3 = y80Var.h;
                if (!y80Var.E && arrayList3.get(i10) != y80Var.v) {
                    y80Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.g4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = u80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = u80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.g7) {
                                ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (y80Var.s != 0) {
                        y80Var.y(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                pb0 pb0Var2 = (pb0) this.b;
                mb0 mb0Var = (mb0) this.c;
                if (i10 == 0) {
                    pb0Var2.getClass();
                    break;
                } else {
                    gg.j1 adapter2 = pb0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = pb0Var2.getAdapter().J(i15);
                        int i16 = pb0Var2.getAdapter().X;
                        int i17 = pb0Var2.getAdapter().Y;
                        if (pb0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = pb0Var2.getAdapter().l0;
                            if (chat2 == null && pb0Var2.getAdapter().G0 != null) {
                                chat2 = pb0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(pb0Var2.getAdapter().F);
                            mb0Var.k(i16, i17, a1.g.t(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (pb0Var2.getAdapter().F != null && i15 == 0) {
                            mb0Var.k(i16, i17, a1.g.t(new StringBuilder(), pb0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                mb0Var.i(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), pb0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        mb0Var.k(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(sc.v.v(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        pb0Var = pb0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new w61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        mb0Var.k(i16, i17, spannableString, false);
                                    }
                                } else {
                                    pb0Var = pb0Var2;
                                    if (J instanceof String) {
                                        mb0Var.k(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        mb0Var.m(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                mb0Var.k(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = mb0Var.f();
                                                } catch (Exception e7) {
                                                    FileLog.e((Throwable) e7, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.b6(f10, fontMetricsInt) : new org.telegram.ui.Components.b6(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                mb0Var.k(i16, i17, spannableString2, false);
                                                pb0Var.o(false);
                                            }
                                        }
                                        mb0Var.k(i16, i17, str9, true);
                                        pb0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        mb0Var.e(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(pb0Var.getAdapter().R);
                                        pb0Var.P = arrayList4;
                                        PhotoViewer.t1().K2(null, pb0Var.h, pb0Var.a);
                                        PhotoViewer.t1().g2(arrayList4, pb0Var.getAdapter().M(i15), 3, false, pb0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    mb0Var.k(i16, i17, a1.g.q("@", publicUsername, " "), false);
                                }
                            }
                            pb0Var = pb0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                sh0.q((sh0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                m51.T((m51) this.b, (org.telegram.ui.ActionBar.e6) this.c, i10);
                break;
            case 15:
                ev evVar = (ev) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                bq bqVar = (bq) evVar.c.d.get(i10);
                org.telegram.ui.ActionBar.h6 j3 = bqVar.a.j(evVar.v);
                fg.b bVar = bqVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    fg.b bVar2 = bqVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.b4) bqVar.a.f.get(evVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) bqVar.a.f.get(evVar.v)).b;
                    org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0(org.telegram.ui.ActionBar.i6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) bqVar.a.f.get(evVar.v)).d)));
                    if (O0 != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) O0.c0.get(tL_theme.id);
                        if (g6Var == null) {
                            g6Var = O0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = g6Var.a;
                        O0.u(i11);
                    }
                    j3 = O0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                evVar.r = i10;
                int i18 = 0;
                while (i18 < evVar.c.d.size()) {
                    ((bq) evVar.c.d.get(i18)).d = i18 == evVar.r;
                    i18++;
                }
                evVar.c.E(evVar.r);
                for (int i19 = 0; i19 < evVar.a.getChildCount(); i19++) {
                    z21 z21Var = (z21) evVar.a.getChildAt(i19);
                    if (z21Var != view && (or0Var = z21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(or0Var);
                        z21Var.J.run();
                    }
                }
                ((z21) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((evVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.i6.G1(n2Var2);
                break;
            case 16:
                cz.U((cz) this.b, (Context) this.c, i10);
                break;
            case 17:
                c70.U((c70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                hd0 hd0Var = (hd0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = hd0Var.W.I(i10);
                if (I != null && I.icon != null && hd0Var.G0 == 8 && hd0Var.I != null) {
                    hd0Var.C0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = hd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = hd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = hd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = hd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        hd0Var.x0.setLongitude(I.geo._long);
                    }
                    hd0Var.T.L(hd0Var.x0);
                    break;
                } else if (I != null && (cd0Var = hd0Var.F0) != null) {
                    cd0Var.b(I, hd0Var.G0, true, 0, 0L);
                    hd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                zh0 zh0Var = (zh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = zh0Var.k0;
                if (i10 == zh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(zh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        zh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == zh0Var.x) {
                    vb0 vb0Var = new vb0(0, zh0Var.n);
                    vb0Var.T = zh0Var.s0;
                    zh0Var.presentFragment(vb0Var);
                    break;
                } else {
                    int i20 = zh0Var.y;
                    if (i10 >= i20 && i10 < zh0Var.E) {
                        t70 t70Var = new t70(context2, (TLRPC.TL_chatInviteExported) zh0Var.i0.get(i10 - i20), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
                        zh0Var.l0 = t70Var;
                        t70Var.k0 = zh0Var.p0;
                        t70Var.show();
                        break;
                    } else {
                        int i21 = zh0Var.H;
                        if (i10 >= i21 && i10 < zh0Var.I) {
                            t70 t70Var2 = new t70(context2, (TLRPC.TL_chatInviteExported) zh0Var.j0.get(i10 - i21), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
                            zh0Var.l0 = t70Var2;
                            t70Var2.show();
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
            case 20:
                al0.U((al0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                tg.a0.R((tg.a0) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                tg.s0.Q((tg.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
