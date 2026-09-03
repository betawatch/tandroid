package gg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import lh.m5;
import nh.c5;
import nh.c7;
import nh.d5;
import nh.i9;
import nh.j4;
import nh.o6;
import nh.u4;
import nh.z4;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.a6;
import org.telegram.ui.a70;
import org.telegram.ui.cd0;
import org.telegram.ui.dd;
import org.telegram.ui.dh0;
import org.telegram.ui.ev;
import org.telegram.ui.lq;
import org.telegram.ui.pb0;
import org.telegram.ui.pc;
import org.telegram.ui.qk0;
import org.telegram.ui.rb1;
import org.telegram.ui.rh0;
import org.telegram.ui.uc;
import org.telegram.ui.xc0;
import org.telegram.ui.yh0;
import org.telegram.ui.zn;
import org.telegram.ui.zy;
import org.webrtc.MediaStreamTrack;
import rh.d3;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0266, code lost:
    
        if (r13.equals("🎨") != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0517  */
    @Override // org.telegram.ui.Components.hl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        i51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z4;
        qa0 qa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        nq0 nq0Var;
        String str6;
        xc0 xc0Var;
        float maxZoomLevel;
        float f10;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                b1.Q((b1) this.b, (org.telegram.ui.ActionBar.p2) this.c, view);
                break;
            case 1:
                w1.P((w1) this.b, (TLRPC.Chat) this.c, view);
                break;
            case 2:
                d5 d5Var = (d5) this.b;
                i9 i9Var = (i9) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = i9Var.f;
                z4 z4Var = d5Var.w;
                j4 j4Var = d5Var.r;
                if (i10 >= 0 && i10 < z4Var.c.size()) {
                    u4 u4Var = (u4) z4Var.c.get(i10);
                    TL_stories.StoryView storyView = u4Var.b;
                    TL_stories.StoryReaction storyReaction = u4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        i9Var.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        p2Var.createOverlayStoryViewer().G(d5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) u4Var.b).story, c7.a(j4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        i9Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        c5 c5Var = d5Var.B;
                        if (c5Var != null && (arrayList = c5Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < d5Var.B.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) d5Var.B.i.get(i12);
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
                            d5Var.D = null;
                            p2Var.createOverlayStoryViewer().G(d5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, c7.a(j4Var));
                            break;
                        } else {
                            d5Var.D = new o6(d5Var.v, arrayList2);
                            d5Var.E = i12;
                            c5 c5Var2 = d5Var.B;
                            i9 createOverlayStoryViewer = p2Var.createOverlayStoryViewer();
                            Context context = d5Var.getContext();
                            o6 o6Var = d5Var.D;
                            c7 a2 = c7.a(j4Var);
                            a2.e = new m5(c5Var2, 9);
                            createOverlayStoryViewer.C(context, i11, o6Var, a2);
                            break;
                        }
                    } else {
                        boolean z10 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z10 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z10 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                            if (peerDialogId >= 0) {
                                bundle.putLong("user_id", peerDialogId);
                            } else {
                                bundle.putLong("chat_id", -peerDialogId);
                            }
                            bundle.putInt("message_id", message.id);
                            i9Var.H(new zn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 3:
                oh.u uVar = (oh.u) this.b;
                cg.h0 h0Var = (cg.h0) this.c;
                w51 w51Var = uVar.W;
                if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        h0Var.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                a6.x0((a6) this.b, (Context) this.c, view, i10);
                break;
            case 5:
                dd.V((dd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 6:
                pc pcVar = (pc) this.b;
                uc ucVar = (uc) this.c;
                dd ddVar = pcVar.c;
                int i13 = ucVar.d;
                rb1 rb1Var = ucVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                ddVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                ddVar.X0(true);
                ddVar.a1(true);
                ddVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + rb1Var.getPaddingLeft()) {
                    rb1Var.v0(-((AndroidUtilities.dp(48.0f) + rb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (rb1Var.getMeasuredWidth() - rb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    rb1Var.v0(y3.z(48.0f, rb1Var.getMeasuredWidth() - rb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 7:
                zn znVar = (zn) this.b;
                yh0 yh0Var = (yh0) this.c;
                znVar.getClass();
                TLObject tLObject = (TLObject) yh0Var.c.get(i10);
                if (tLObject != null) {
                    znVar.A7(true);
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
            case 8:
                lq.X((lq) this.b, (Context) this.c, view, i10);
                break;
            case 9:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) this.b;
                f6 f6Var = (f6) this.c;
                i51 G2 = zVar.j0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zVar.getContext(), 0, f6Var);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.t(zVar, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 10:
                li.v((li) this.b, (f6) this.c, view);
                break;
            case 11:
                qj qjVar = (qj) this.b;
                f6 f6Var2 = (f6) this.c;
                jj jjVar = qjVar.B;
                f2.o0 adapter = qjVar.s.getAdapter();
                mj mjVar = qjVar.C;
                if (adapter == mjVar) {
                    O = mjVar.E(i10);
                } else {
                    int S = jjVar.S(i10);
                    int Q = jjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = jjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (qjVar.w.isEmpty()) {
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
                        te0 te0Var = new te0(qjVar.b.c0, contact, null, null, null, null, str, str2, f6Var2);
                        te0Var.H = new aj(qjVar);
                        te0Var.show();
                        break;
                    } else {
                        qjVar.K((pj) view, O);
                        break;
                    }
                }
                break;
            case 12:
                z70 z70Var = (z70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                v70 v70Var = z70Var.d;
                ArrayList arrayList3 = z70Var.h;
                if (!z70Var.B && arrayList3.get(i10) != z70Var.v) {
                    z70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z11 = view instanceof f4;
                    if (z11) {
                        z4 = true;
                        ((f4) view).c(true, true);
                    } else {
                        z4 = true;
                        if (view instanceof d7) {
                            ((d7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = v70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = v70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z11) {
                                ((f4) childAt).c(false, z4);
                            } else if (view instanceof d7) {
                                ((d7) childAt).b(false, z4);
                            }
                        }
                    }
                    if (z70Var.s != 0) {
                        z70Var.w(chat, z4);
                        break;
                    }
                }
                break;
            case 13:
                qa0 qa0Var2 = (qa0) this.b;
                na0 na0Var = (na0) this.c;
                if (i10 == 0) {
                    qa0Var2.getClass();
                    break;
                } else {
                    tf.u0 adapter2 = qa0Var2.getAdapter();
                    if (adapter2.t0 == null || adapter2.e0) {
                        int i15 = i10 - 1;
                        Object J = qa0Var2.getAdapter().J(i15);
                        int i16 = qa0Var2.getAdapter().U;
                        int i17 = qa0Var2.getAdapter().V;
                        if (qa0Var2.getAdapter().C != null && i15 == 1) {
                            TLRPC.Chat chat2 = qa0Var2.getAdapter().i0;
                            if (chat2 == null && qa0Var2.getAdapter().D0 != null) {
                                chat2 = qa0Var2.getAdapter().D0.e;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(qa0Var2.getAdapter().C);
                            na0Var.v(i16, i17, android.support.v4.media.a.r(sb, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (qa0Var2.getAdapter().C != null && i15 == 0) {
                            na0Var.v(i16, i17, android.support.v4.media.a.r(new StringBuilder(), qa0Var2.getAdapter().C, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof a8) {
                                    ((a8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                na0Var.j(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), qa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        na0Var.v(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(w2.k(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb2 = new StringBuilder("");
                                        qa0Var = qa0Var2;
                                        sb2.append(user3.id);
                                        spannableString.setSpan(new p51(sb2.toString(), 3, null), 0, spannableString.length(), 33);
                                        na0Var.v(i16, i17, spannableString, false);
                                    }
                                } else {
                                    qa0Var = qa0Var2;
                                    if (J instanceof String) {
                                        na0Var.v(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        na0Var.E(str9);
                                        if (str9 == null || !str9.startsWith("animated_")) {
                                            na0Var.v(i16, i17, str9, true);
                                        } else {
                                            try {
                                                try {
                                                    fontMetricsInt = na0Var.f();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f11 = l5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f11));
                                                spannableString2.setSpan(f11 != null ? new u5(f11, fontMetricsInt) : new u5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                na0Var.v(i16, i17, spannableString2, false);
                                            } catch (Exception unused) {
                                                na0Var.v(i16, i17, str9, true);
                                            }
                                        }
                                        qa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        na0Var.a(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(qa0Var.getAdapter().O);
                                        qa0Var.M = arrayList4;
                                        PhotoViewer.t1().K2(null, qa0Var.h, qa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, qa0Var.getAdapter().M(i15), 3, false, qa0Var.N, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    na0Var.v(i16, i17, android.support.v4.media.a.o("@", publicUsername, " "), false);
                                }
                            }
                            qa0Var = qa0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 14:
                wg0.o((wg0) this.b, (Context) this.c, view, i10);
                break;
            case 15:
                g41.S((g41) this.b, (f6) this.c, i10);
                break;
            case 16:
                ev evVar = (ev) this.b;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                ip ipVar = (ip) evVar.c.d.get(i10);
                i6 j10 = ipVar.a.j(evVar.v);
                sf.b bVar = ipVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    sf.b bVar2 = ipVar.a.c;
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
                i11 = ((d4) ipVar.a.f.get(evVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((d4) ipVar.a.f.get(evVar.v)).b;
                    i6 N0 = j6.N0(j6.q0(tL_theme.settings.get(((d4) ipVar.a.f.get(evVar.v)).d)));
                    if (N0 != null) {
                        h6 h6Var = (h6) N0.Z.get(tL_theme.id);
                        if (h6Var == null) {
                            h6Var = N0.f(tL_theme, p2Var2.getCurrentAccount(), 0);
                        }
                        i11 = h6Var.a;
                        N0.u(i11);
                    }
                    j10 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i11));
                evVar.r = i10;
                int i18 = 0;
                while (i18 < evVar.c.d.size()) {
                    ((ip) evVar.c.d.get(i18)).d = i18 == evVar.r;
                    i18++;
                }
                evVar.c.E(evVar.r);
                for (int i19 = 0; i19 < evVar.a.getChildCount(); i19++) {
                    w11 w11Var = (w11) evVar.a.getChildAt(i19);
                    if (w11Var != view && (nq0Var = w11Var.G) != null) {
                        AndroidUtilities.cancelRunOnUIThread(nq0Var);
                        w11Var.G.run();
                    }
                }
                ((w11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((evVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                j6.F1(p2Var2);
                break;
            case 17:
                zy.U((zy) this.b, (Context) this.c, i10);
                break;
            case 18:
                a70.U((a70) this.b, (Context) this.c, view, i10);
                break;
            case 19:
                cd0 cd0Var = (cd0) this.b;
                org.telegram.ui.ActionBar.z zVar2 = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = cd0Var.T.I(i10);
                if (I != null && I.icon != null && cd0Var.D0 == 8 && cd0Var.F != null) {
                    cd0Var.z0 = true;
                    zVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = cd0Var.F.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = cd0Var.F.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f12 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = cd0Var.F;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f12));
                    Location location = cd0Var.u0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        cd0Var.u0.setLongitude(I.geo._long);
                    }
                    cd0Var.Q.L(cd0Var.u0);
                    break;
                } else if (I != null && (xc0Var = cd0Var.C0) != null) {
                    xc0Var.b(I, cd0Var.D0, true, 0, 0L);
                    cd0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                rh0 rh0Var = (rh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = rh0Var.h0;
                if (i10 == rh0Var.N) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(rh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        rh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == rh0Var.x) {
                    pb0 pb0Var = new pb0(0, rh0Var.n);
                    pb0Var.Q = rh0Var.p0;
                    rh0Var.presentFragment(pb0Var);
                    break;
                } else {
                    int i20 = rh0Var.y;
                    if (i10 >= i20 && i10 < rh0Var.B) {
                        t60 t60Var = new t60(context2, (TLRPC.TL_chatInviteExported) rh0Var.f0.get(i10 - i20), rh0Var.d, hashMap, rh0Var, rh0Var.n, false, rh0Var.h);
                        rh0Var.i0 = t60Var;
                        t60Var.h0 = rh0Var.m0;
                        t60Var.show();
                        break;
                    } else {
                        int i21 = rh0Var.E;
                        if (i10 >= i21 && i10 < rh0Var.F) {
                            t60 t60Var2 = new t60(context2, (TLRPC.TL_chatInviteExported) rh0Var.g0.get(i10 - i21), rh0Var.d, hashMap, rh0Var, rh0Var.n, false, rh0Var.h);
                            rh0Var.i0 = t60Var2;
                            t60Var2.show();
                            break;
                        } else if (i10 != rh0Var.K) {
                            int i22 = rh0Var.R;
                            if (i10 >= i22 && i10 < rh0Var.S) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) rh0Var.j0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    rh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                rh0 rh0Var2 = new rh0(rh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                rh0Var2.g0(rh0Var.d, null);
                                rh0Var.presentFragment(rh0Var2);
                                break;
                            }
                        } else if (!rh0Var.Z) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rh0Var.getParentActivity());
                            alertDialog$Builder2.a.O = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new dh0(rh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            rh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 21:
                qk0.U((qk0) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                d3.z0((d3) this.b, (Context) this.c, i10);
                break;
        }
    }
}
