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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.za0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bv;
import org.telegram.ui.cd0;
import org.telegram.ui.eh0;
import org.telegram.ui.kq;
import org.telegram.ui.rb0;
import org.telegram.ui.sh0;
import org.telegram.ui.sk0;
import org.telegram.ui.wb1;
import org.telegram.ui.wn;
import org.telegram.ui.xc0;
import org.telegram.ui.z60;
import org.telegram.ui.zh0;
import org.telegram.ui.zy;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements kl0 {
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
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        v51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        za0 za0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        wq0 wq0Var;
        String str6;
        xc0 xc0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                jc jcVar = (jc) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = jcVar.f;
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
                        m2Var.createOverlayStoryViewer().F(k7Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) z6Var.b).story, u9.a(o6Var));
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
                            m2Var.createOverlayStoryViewer().F(k7Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, u9.a(o6Var));
                            break;
                        } else {
                            k7Var.G = new g9(k7Var.v, arrayList2);
                            k7Var.H = i12;
                            j7 j7Var2 = k7Var.E;
                            jc createOverlayStoryViewer = m2Var.createOverlayStoryViewer();
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
                            jcVar.H(new wn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                j61 j61Var = yVar.Z;
                if (j61Var != null && (G = j61Var.G(i10 - 1)) != null) {
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
                    wb1Var.v0(org.telegram.messenger.f0.A(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                wn wnVar = (wn) this.b;
                zh0 zh0Var = (zh0) this.c;
                wnVar.getClass();
                TLObject tLObject = (TLObject) zh0Var.c.get(i10);
                if (tLObject != null) {
                    wnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    wnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                kq.X((kq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                v51 G2 = yVar2.m0.G(i10 - 1);
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
                        ze0 ze0Var = new ze0(zjVar.b.f0, contact, null, null, null, null, str, str2, d6Var2);
                        ze0Var.K = new lj(zjVar);
                        ze0Var.show();
                        break;
                    } else {
                        zjVar.L((yj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                h80 h80Var = (h80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                d80 d80Var = h80Var.d;
                ArrayList arrayList3 = h80Var.h;
                if (!h80Var.E && arrayList3.get(i10) != h80Var.v) {
                    h80Var.v = (TLRPC.Peer) arrayList3.get(i10);
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
                    int childCount = d80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = d80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.g7) {
                                ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (h80Var.s != 0) {
                        h80Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                za0 za0Var2 = (za0) this.b;
                wa0 wa0Var = (wa0) this.c;
                if (i10 == 0) {
                    za0Var2.getClass();
                    break;
                } else {
                    gg.k1 adapter2 = za0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = za0Var2.getAdapter().J(i15);
                        int i16 = za0Var2.getAdapter().X;
                        int i17 = za0Var2.getAdapter().Y;
                        if (za0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = za0Var2.getAdapter().l0;
                            if (chat2 == null && za0Var2.getAdapter().G0 != null) {
                                chat2 = za0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(za0Var2.getAdapter().F);
                            wa0Var.O(i16, i17, a4.a.t(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (za0Var2.getAdapter().F != null && i15 == 0) {
                            wa0Var.O(i16, i17, a4.a.t(new StringBuilder(), za0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                wa0Var.A(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), za0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        wa0Var.O(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(v7.j.t(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        za0Var = za0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new c61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        wa0Var.O(i16, i17, spannableString, false);
                                    }
                                } else {
                                    za0Var = za0Var2;
                                    if (J instanceof String) {
                                        wa0Var.O(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        wa0Var.P(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                wa0Var.O(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = wa0Var.w();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.z5(f10, fontMetricsInt) : new org.telegram.ui.Components.z5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                wa0Var.O(i16, i17, spannableString2, false);
                                                za0Var.o(false);
                                            }
                                        }
                                        wa0Var.O(i16, i17, str9, true);
                                        za0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        wa0Var.f(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(za0Var.getAdapter().R);
                                        za0Var.P = arrayList4;
                                        PhotoViewer.t1().J2(null, za0Var.h, za0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, za0Var.getAdapter().M(i15), 3, false, za0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    wa0Var.O(i16, i17, a4.a.q("@", publicUsername, " "), false);
                                }
                            }
                            za0Var = za0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                ah0.o((ah0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                t41.S((t41) this.b, (org.telegram.ui.ActionBar.d6) this.c, i10);
                break;
            case 15:
                bv bvVar = (bv) this.b;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.c;
                mp mpVar = (mp) bvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.g6 j3 = mpVar.a.j(bvVar.v);
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
                i11 = ((org.telegram.ui.ActionBar.a4) mpVar.a.f.get(bvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) mpVar.a.f.get(bvVar.v)).b;
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0(org.telegram.ui.ActionBar.h6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) mpVar.a.f.get(bvVar.v)).d)));
                    if (N0 != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) N0.c0.get(tL_theme.id);
                        if (f6Var == null) {
                            f6Var = N0.f(tL_theme, m2Var2.getCurrentAccount(), 0);
                        }
                        i11 = f6Var.a;
                        N0.u(i11);
                    }
                    j3 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                bvVar.r = i10;
                int i18 = 0;
                while (i18 < bvVar.c.d.size()) {
                    ((mp) bvVar.c.d.get(i18)).d = i18 == bvVar.r;
                    i18++;
                }
                bvVar.c.E(bvVar.r);
                for (int i19 = 0; i19 < bvVar.a.getChildCount(); i19++) {
                    h21 h21Var = (h21) bvVar.a.getChildAt(i19);
                    if (h21Var != view && (wq0Var = h21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(wq0Var);
                        h21Var.J.run();
                    }
                }
                ((h21) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((bvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.h6.F1(m2Var2);
                break;
            case 16:
                zy.U((zy) this.b, (Context) this.c, i10);
                break;
            case 17:
                z60.U((z60) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                cd0 cd0Var = (cd0) this.b;
                org.telegram.ui.ActionBar.y yVar3 = (org.telegram.ui.ActionBar.y) this.c;
                TLRPC.TL_messageMediaVenue I = cd0Var.W.I(i10);
                if (I != null && I.icon != null && cd0Var.G0 == 8 && cd0Var.I != null) {
                    cd0Var.C0 = true;
                    yVar3.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = cd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = cd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = cd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = cd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        cd0Var.x0.setLongitude(I.geo._long);
                    }
                    cd0Var.T.L(cd0Var.x0);
                    break;
                } else if (I != null && (xc0Var = cd0Var.F0) != null) {
                    xc0Var.b(I, cd0Var.G0, true, 0, 0L);
                    cd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                sh0 sh0Var = (sh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = sh0Var.k0;
                if (i10 == sh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(sh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        sh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == sh0Var.x) {
                    rb0 rb0Var = new rb0(0, sh0Var.n);
                    rb0Var.T = sh0Var.s0;
                    sh0Var.presentFragment(rb0Var);
                    break;
                } else {
                    int i20 = sh0Var.y;
                    if (i10 >= i20 && i10 < sh0Var.E) {
                        c70 c70Var = new c70(context2, (TLRPC.TL_chatInviteExported) sh0Var.i0.get(i10 - i20), sh0Var.d, hashMap, sh0Var, sh0Var.n, false, sh0Var.h);
                        sh0Var.l0 = c70Var;
                        c70Var.k0 = sh0Var.p0;
                        c70Var.show();
                        break;
                    } else {
                        int i21 = sh0Var.H;
                        if (i10 >= i21 && i10 < sh0Var.I) {
                            c70 c70Var2 = new c70(context2, (TLRPC.TL_chatInviteExported) sh0Var.j0.get(i10 - i21), sh0Var.d, hashMap, sh0Var, sh0Var.n, false, sh0Var.h);
                            sh0Var.l0 = c70Var2;
                            c70Var2.show();
                            break;
                        } else if (i10 != sh0Var.N) {
                            int i22 = sh0Var.U;
                            if (i10 >= i22 && i10 < sh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) sh0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    sh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                sh0 sh0Var2 = new sh0(sh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                sh0Var2.g0(sh0Var.d, null);
                                sh0Var.presentFragment(sh0Var2);
                                break;
                            }
                        } else if (!sh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new eh0(sh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            sh0Var.showDialog(alertDialog$Builder2.a);
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
                tg.a0.Q((tg.a0) this.b, (org.telegram.ui.ActionBar.m2) this.c, view);
                break;
            default:
                tg.s0.P((tg.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
