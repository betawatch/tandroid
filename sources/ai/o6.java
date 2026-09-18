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
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.bo;
import org.telegram.ui.cd;
import org.telegram.ui.fc1;
import org.telegram.ui.fd0;
import org.telegram.ui.fz;
import org.telegram.ui.g70;
import org.telegram.ui.hi0;
import org.telegram.ui.hv;
import org.telegram.ui.kd0;
import org.telegram.ui.mh0;
import org.telegram.ui.pq;
import org.telegram.ui.tc;
import org.telegram.ui.zb0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements al0 {
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
    @Override // org.telegram.ui.Components.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        j51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        na0 na0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        kq0 kq0Var;
        String str6;
        fd0 fd0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                j7 j7Var = (j7) this.b;
                jc jcVar = (jc) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = jcVar.f;
                e7 e7Var = j7Var.w;
                p6 p6Var = j7Var.r;
                if (i10 >= 0 && i10 < e7Var.c.size()) {
                    z6 z6Var = (z6) e7Var.c.get(i10);
                    TL_stories.StoryView storyView = z6Var.b;
                    TL_stories.StoryReaction storyReaction = z6Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        jcVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        o2Var.createOverlayStoryViewer().F(j7Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) z6Var.b).story, u9.a(p6Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        jcVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        i7 i7Var = j7Var.E;
                        if (i7Var != null && (arrayList = i7Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < j7Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) j7Var.E.i.get(i12);
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
                            j7Var.G = null;
                            o2Var.createOverlayStoryViewer().F(j7Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, u9.a(p6Var));
                            break;
                        } else {
                            j7Var.G = new g9(j7Var.v, arrayList2);
                            j7Var.H = i12;
                            i7 i7Var2 = j7Var.E;
                            jc createOverlayStoryViewer = o2Var.createOverlayStoryViewer();
                            Context context = j7Var.getContext();
                            g9 g9Var = j7Var.G;
                            u9 a2 = u9.a(p6Var);
                            a2.e = new a1.c(i7Var2, 6);
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
                            jcVar.H(new bo(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                x51 x51Var = yVar.Z;
                if (x51Var != null && (G = x51Var.G(i10 - 1)) != null) {
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
                org.telegram.ui.v5.x0((org.telegram.ui.v5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                cd.W((cd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                org.telegram.ui.pc pcVar = (org.telegram.ui.pc) this.b;
                tc tcVar = (tc) this.c;
                cd cdVar = pcVar.c;
                int i13 = tcVar.d;
                fc1 fc1Var = tcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                cdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                cdVar.X0(true);
                cdVar.a1(true);
                cdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                    fc1Var.w0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    fc1Var.w0(org.telegram.messenger.w1.z(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                bo boVar = (bo) this.b;
                hi0 hi0Var = (hi0) this.c;
                boVar.getClass();
                TLObject tLObject = (TLObject) hi0Var.c.get(i10);
                if (tLObject != null) {
                    boVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    boVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                pq.X((pq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                j51 G2 = yVar2.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar2.getContext(), 0, f6Var);
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
                na0 na0Var2 = (na0) this.b;
                ka0 ka0Var = (ka0) this.c;
                if (i10 == 0) {
                    na0Var2.getClass();
                    break;
                } else {
                    gg.k1 adapter2 = na0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = na0Var2.getAdapter().J(i15);
                        int i16 = na0Var2.getAdapter().X;
                        int i17 = na0Var2.getAdapter().Y;
                        if (na0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = na0Var2.getAdapter().l0;
                            if (chat2 == null && na0Var2.getAdapter().G0 != null) {
                                chat2 = na0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(na0Var2.getAdapter().F);
                            ka0Var.L(i16, i17, a4.a.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (na0Var2.getAdapter().F != null && i15 == 0) {
                            ka0Var.L(i16, i17, a4.a.s(new StringBuilder(), na0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ka0Var.A(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), na0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ka0Var.L(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        na0Var = na0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new q51(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        ka0Var.L(i16, i17, spannableString, false);
                                    }
                                } else {
                                    na0Var = na0Var2;
                                    if (J instanceof String) {
                                        ka0Var.L(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ka0Var.O(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                ka0Var.L(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = ka0Var.w();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.o5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.x5(f10, fontMetricsInt) : new org.telegram.ui.Components.x5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ka0Var.L(i16, i17, spannableString2, false);
                                                na0Var.o(false);
                                            }
                                        }
                                        ka0Var.L(i16, i17, str9, true);
                                        na0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ka0Var.f(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(na0Var.getAdapter().R);
                                        na0Var.P = arrayList4;
                                        PhotoViewer.t1().J2(null, na0Var.h, na0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, na0Var.getAdapter().M(i15), 3, false, na0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ka0Var.L(i16, i17, a4.a.p("@", publicUsername, " "), false);
                                }
                            }
                            na0Var = na0Var2;
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
                h41.S((h41) this.b, (org.telegram.ui.ActionBar.f6) this.c, i10);
                break;
            case 15:
                hv hvVar = (hv) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                lp lpVar = (lp) hvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.i6 j3 = lpVar.a.j(hvVar.v);
                fg.b bVar = lpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    fg.b bVar2 = lpVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.d4) lpVar.a.f.get(hvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.d4) lpVar.a.f.get(hvVar.v)).b;
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.d4) lpVar.a.f.get(hvVar.v)).d)));
                    if (N0 != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) N0.c0.get(tL_theme.id);
                        if (h6Var == null) {
                            h6Var = N0.f(tL_theme, o2Var2.getCurrentAccount(), 0);
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
                    ((lp) hvVar.c.d.get(i18)).d = i18 == hvVar.r;
                    i18++;
                }
                hvVar.c.E(hvVar.r);
                for (int i19 = 0; i19 < hvVar.a.getChildCount(); i19++) {
                    v11 v11Var = (v11) hvVar.a.getChildAt(i19);
                    if (v11Var != view && (kq0Var = v11Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(kq0Var);
                        v11Var.J.run();
                    }
                }
                ((v11) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((hvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.j6.F1(o2Var2);
                break;
            case 16:
                fz.U((fz) this.b, (Context) this.c, i10);
                break;
            case 17:
                g70.U((g70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                kd0 kd0Var = (kd0) this.b;
                org.telegram.ui.ActionBar.a0 a0Var = (org.telegram.ui.ActionBar.a0) this.c;
                TLRPC.TL_messageMediaVenue I = kd0Var.W.I(i10);
                if (I != null && I.icon != null && kd0Var.G0 == 8 && kd0Var.I != null) {
                    kd0Var.C0 = true;
                    a0Var.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = kd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = kd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = kd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = kd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        kd0Var.x0.setLongitude(I.geo._long);
                    }
                    kd0Var.T.L(kd0Var.x0);
                    break;
                } else if (I != null && (fd0Var = kd0Var.F0) != null) {
                    fd0Var.b(I, kd0Var.G0, true, 0, 0L);
                    kd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                ai0 ai0Var = (ai0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = ai0Var.k0;
                if (i10 == ai0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(ai0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        ai0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == ai0Var.x) {
                    zb0 zb0Var = new zb0(0, ai0Var.n);
                    zb0Var.T = ai0Var.s0;
                    ai0Var.presentFragment(zb0Var);
                    break;
                } else {
                    int i20 = ai0Var.y;
                    if (i10 >= i20 && i10 < ai0Var.E) {
                        r60 r60Var = new r60(context2, (TLRPC.TL_chatInviteExported) ai0Var.i0.get(i10 - i20), ai0Var.d, hashMap, ai0Var, ai0Var.n, false, ai0Var.h);
                        ai0Var.l0 = r60Var;
                        r60Var.k0 = ai0Var.p0;
                        r60Var.show();
                        break;
                    } else {
                        int i21 = ai0Var.H;
                        if (i10 >= i21 && i10 < ai0Var.I) {
                            r60 r60Var2 = new r60(context2, (TLRPC.TL_chatInviteExported) ai0Var.j0.get(i10 - i21), ai0Var.d, hashMap, ai0Var, ai0Var.n, false, ai0Var.h);
                            ai0Var.l0 = r60Var2;
                            r60Var2.show();
                            break;
                        } else if (i10 != ai0Var.N) {
                            int i22 = ai0Var.U;
                            if (i10 >= i22 && i10 < ai0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ai0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    ai0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                ai0 ai0Var2 = new ai0(ai0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                ai0Var2.g0(ai0Var.d, null);
                                ai0Var.presentFragment(ai0Var2);
                                break;
                            }
                        } else if (!ai0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ai0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new mh0(ai0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            ai0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                org.telegram.ui.al0.U((org.telegram.ui.al0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                tg.b0.Q((tg.b0) this.b, (org.telegram.ui.ActionBar.o2) this.c, view);
                break;
            default:
                tg.t0.P((tg.t0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
