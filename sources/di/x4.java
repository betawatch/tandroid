package di;

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
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd;
import org.telegram.ui.gq;
import org.telegram.ui.jh0;
import org.telegram.ui.kc0;
import org.telegram.ui.ly;
import org.telegram.ui.oc;
import org.telegram.ui.pc0;
import org.telegram.ui.r60;
import org.telegram.ui.rh0;
import org.telegram.ui.ru;
import org.telegram.ui.sc;
import org.telegram.ui.tk0;
import org.telegram.ui.un;
import org.telegram.ui.vg0;
import org.telegram.ui.za1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026e  */
    @Override // org.telegram.ui.Components.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        t61 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        gb0 gb0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        int i11;
        int i12;
        boolean z10;
        mp0 mp0Var;
        kc0 kc0Var;
        float maxZoomLevel;
        float f7;
        switch (this.a) {
            case 0:
                t5 t5Var = (t5) this.b;
                y9 y9Var = (y9) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = y9Var.f;
                o5 o5Var = t5Var.w;
                y4 y4Var = t5Var.r;
                if (i10 >= 0 && i10 < o5Var.c.size()) {
                    j5 j5Var = (j5) o5Var.c.get(i10);
                    TL_stories.StoryView storyView = j5Var.b;
                    TL_stories.StoryReaction storyReaction = j5Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        y9Var.H(ProfileActivity.t4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        r2Var.createOverlayStoryViewer().F(t5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) j5Var.b).story, q7.a(y4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        y9Var.H(ProfileActivity.t4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        s5 s5Var = t5Var.E;
                        int i13 = 0;
                        int i14 = -1;
                        if (s5Var != null && (arrayList = s5Var.i) != null) {
                            int size = arrayList.size();
                            while (i13 < t5Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) t5Var.E.i.get(i13);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i14 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                                i13++;
                            }
                            i13 = size;
                        }
                        if (i14 < 0 || arrayList2.size() <= 1) {
                            t5Var.G = null;
                            r2Var.createOverlayStoryViewer().F(t5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, q7.a(y4Var));
                            break;
                        } else {
                            t5Var.G = new c7(t5Var.v, arrayList2);
                            t5Var.H = i13;
                            s5 s5Var2 = t5Var.E;
                            y9 createOverlayStoryViewer = r2Var.createOverlayStoryViewer();
                            Context context = t5Var.getContext();
                            c7 c7Var = t5Var.G;
                            q7 a2 = q7.a(y4Var);
                            a2.e = new a1.c(s5Var2, 25);
                            createOverlayStoryViewer.C(context, i14, c7Var, a2);
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
                            y9Var.H(new un(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ei.u uVar = (ei.u) this.b;
                ai.i iVar = (ai.i) this.c;
                j71 j71Var = uVar.Z;
                if (j71Var != null && (G = j71Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        iVar.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                hi.d4.y0((hi.d4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.x5.w0((org.telegram.ui.x5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.X((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                oc ocVar = (oc) this.b;
                sc scVar = (sc) this.c;
                bd bdVar = ocVar.c;
                int i15 = scVar.d;
                za1 za1Var = scVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i15).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.a1(true);
                bdVar.d1(true);
                bdVar.e1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + za1Var.getPaddingLeft()) {
                    za1Var.w0(-((AndroidUtilities.dp(48.0f) + za1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (za1Var.getMeasuredWidth() - za1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    za1Var.w0(org.telegram.messenger.t.B(48.0f, za1Var.getMeasuredWidth() - za1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                un unVar = (un) this.b;
                rh0 rh0Var = (rh0) this.c;
                unVar.getClass();
                TLObject tLObject = (TLObject) rh0Var.c.get(i10);
                if (tLObject != null) {
                    unVar.H7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                gq.Y((gq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
                t61 G2 = yVar.n0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, u6Var);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                ti.t((ti) this.b, (org.telegram.ui.ActionBar.u6) this.c, view);
                break;
            case 10:
                xj xjVar = (xj) this.b;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.c;
                rj rjVar = xjVar.E;
                s4.h0 adapter = xjVar.s.getAdapter();
                tj tjVar = xjVar.F;
                if (adapter == tjVar) {
                    O = tjVar.E(i10);
                } else {
                    int S = rjVar.S(i10);
                    int Q = rjVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = rjVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (xjVar.w.isEmpty()) {
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
                            String str6 = user2.first_name;
                            contact3.first_name = str6;
                            String str7 = user2.last_name;
                            contact3.last_name = str7;
                            contact3.phones.add(user2.phone);
                            contact3.user = user2;
                            contact = contact3;
                            str = str6;
                            str2 = str7;
                        }
                        jf0 jf0Var = new jf0(xjVar.b.f0, contact, null, null, null, null, str, str2, u6Var2);
                        jf0Var.K = new jj(xjVar);
                        jf0Var.show();
                        break;
                    } else {
                        xjVar.O((wj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                t80 t80Var = (t80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                p80 p80Var = t80Var.f;
                ArrayList arrayList3 = t80Var.r;
                if (!t80Var.G && arrayList3.get(i10) != t80Var.x) {
                    t80Var.x = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.k4;
                    if (z12) {
                        ((org.telegram.ui.Cells.k4) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = p80Var.getChildCount();
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = p80Var.getChildAt(i16);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.k4) childAt).c(false, true);
                            } else if (view instanceof org.telegram.ui.Cells.k7) {
                                ((org.telegram.ui.Cells.k7) childAt).b(false, true);
                            }
                        }
                    }
                    if (t80Var.w != 0) {
                        t80Var.w(chat, true);
                        break;
                    }
                }
                break;
            case 12:
                gb0 gb0Var2 = (gb0) this.b;
                db0 db0Var = (db0) this.c;
                if (i10 == 0) {
                    gb0Var2.getClass();
                    break;
                } else {
                    ig.j1 adapter2 = gb0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i17 = i10 - 1;
                        Object J = gb0Var2.getAdapter().J(i17);
                        int i18 = gb0Var2.getAdapter().X;
                        int i19 = gb0Var2.getAdapter().Y;
                        if (gb0Var2.getAdapter().F != null && i17 == 1) {
                            TLRPC.Chat chat2 = gb0Var2.getAdapter().l0;
                            if (chat2 == null && gb0Var2.getAdapter().G0 != null) {
                                chat2 = gb0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(gb0Var2.getAdapter().F);
                            db0Var.X(i18, i19, a1.g.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (gb0Var2.getAdapter().F != null && i17 == 0) {
                            db0Var.X(i18, i19, a1.g.s(new StringBuilder(), gb0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.g8) {
                                    ((org.telegram.ui.Cells.g8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                db0Var.J(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), gb0Var2.getAdapter().L(i17));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        db0Var.X(i18, i19, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(b10.u(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        gb0Var = gb0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new a71(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        db0Var.X(i18, i19, spannableString, false);
                                    }
                                } else {
                                    gb0Var = gb0Var2;
                                    if (J instanceof String) {
                                        db0Var.X(i18, i19, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str8 = ((MediaDataController.KeywordResult) J).emoji;
                                        db0Var.b0(str8);
                                        if (str8 == null || !str8.startsWith("animated_")) {
                                            db0Var.X(i18, i19, str8, true);
                                        } else {
                                            try {
                                                try {
                                                    fontMetricsInt = db0Var.D();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str8.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.t5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.c6(f10, fontMetricsInt) : new org.telegram.ui.Components.c6(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                db0Var.X(i18, i19, spannableString2, false);
                                            } catch (Exception unused) {
                                                db0Var.X(i18, i19, str8, true);
                                            }
                                        }
                                        gb0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        db0Var.j(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(gb0Var.getAdapter().R);
                                        gb0Var.P = arrayList4;
                                        PhotoViewer.u1().M2(null, gb0Var.h, gb0Var.a);
                                        PhotoViewer.u1().i2(arrayList4, gb0Var.getAdapter().M(i17), 3, false, gb0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    db0Var.X(i18, i19, a1.g.p("@", publicUsername, " "), false);
                                }
                            }
                            gb0Var = gb0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                nh0.o((nh0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                r51.S((r51) this.b, (org.telegram.ui.ActionBar.u6) this.c, i10);
                break;
            case 15:
                ru ruVar = (ru) this.b;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.c;
                xp xpVar = (xp) ruVar.c.d.get(i10);
                org.telegram.ui.ActionBar.x6 i20 = xpVar.a.i(ruVar.v);
                hg.b bVar = xpVar.a.c;
                String str9 = null;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    hg.b bVar2 = xpVar.a.c;
                    if (bVar2 != null && (str9 = bVar2.b) == null) {
                        str9 = bVar2.a;
                    }
                    if (!str9.equals("🎨")) {
                        i11 = -1;
                        if (i20 == null) {
                            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.g4) xpVar.a.f.get(ruVar.v)).b;
                            org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(org.telegram.ui.ActionBar.y6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.g4) xpVar.a.f.get(ruVar.v)).d)));
                            if (P0 != null) {
                                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) P0.c0.get(tL_theme.id);
                                if (w6Var == null) {
                                    w6Var = P0.f(tL_theme, r2Var2.getCurrentAccount(), 0);
                                }
                                i11 = w6Var.a;
                                P0.u(i11);
                            }
                            i20 = P0;
                        }
                        org.telegram.ui.ActionBar.y6.H1(i20, false, i11, view);
                        ruVar.r = i10;
                        i12 = 0;
                        while (true) {
                            z10 = true;
                            if (i12 < ruVar.c.d.size()) {
                                ruVar.c.E(ruVar.r);
                                for (int i21 = 0; i21 < ruVar.a.getChildCount(); i21++) {
                                    d31 d31Var = (d31) ruVar.a.getChildAt(i21);
                                    if (d31Var != view && (mp0Var = d31Var.J) != null) {
                                        AndroidUtilities.cancelRunOnUIThread(mp0Var);
                                        d31Var.J.run();
                                    }
                                }
                                ((d31) view).d();
                                if (i20 != null) {
                                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                                    edit.putString((ruVar.s == 1 || i20.q()) ? "lastDarkTheme" : "lastDayTheme", i20.m());
                                    edit.commit();
                                }
                                org.telegram.ui.ActionBar.y6.J1(r2Var2);
                                break;
                            } else {
                                xp xpVar2 = (xp) ruVar.c.d.get(i12);
                                if (i12 != ruVar.r) {
                                    z10 = false;
                                }
                                xpVar2.d = z10;
                                i12++;
                            }
                        }
                    }
                }
                i11 = ((org.telegram.ui.ActionBar.g4) xpVar.a.f.get(ruVar.v)).e;
                if (i20 == null) {
                }
                org.telegram.ui.ActionBar.y6.H1(i20, false, i11, view);
                ruVar.r = i10;
                i12 = 0;
                while (true) {
                    z10 = true;
                    if (i12 < ruVar.c.d.size()) {
                    }
                    xpVar2.d = z10;
                    i12++;
                }
                break;
            case 16:
                ly.V((ly) this.b, (Context) this.c, i10);
                break;
            case 17:
                r60.V((r60) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                pc0 pc0Var = (pc0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = pc0Var.W.I(i10);
                if (I != null && I.icon != null && pc0Var.F0 == 8 && pc0Var.I != null) {
                    pc0Var.B0 = true;
                    zVar.i(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = pc0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = pc0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = pc0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = pc0Var.w0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        pc0Var.w0.setLongitude(I.geo._long);
                    }
                    pc0Var.T.L(pc0Var.w0);
                    break;
                } else if (I != null && (kc0Var = pc0Var.E0) != null) {
                    kc0Var.d(I, pc0Var.F0, true, 0, 0L);
                    pc0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                jh0 jh0Var = (jh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = jh0Var.k0;
                if (i10 == jh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(jh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        jh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == jh0Var.x) {
                    org.telegram.ui.db0 db0Var2 = new org.telegram.ui.db0(0, jh0Var.n);
                    db0Var2.S = jh0Var.s0;
                    jh0Var.presentFragment(db0Var2);
                    break;
                } else {
                    int i22 = jh0Var.y;
                    if (i10 >= i22 && i10 < jh0Var.E) {
                        n70 n70Var = new n70(context2, (TLRPC.TL_chatInviteExported) jh0Var.i0.get(i10 - i22), jh0Var.d, hashMap, jh0Var, jh0Var.n, false, jh0Var.h);
                        jh0Var.l0 = n70Var;
                        n70Var.k0 = jh0Var.p0;
                        n70Var.show();
                        break;
                    } else {
                        int i23 = jh0Var.H;
                        if (i10 >= i23 && i10 < jh0Var.I) {
                            n70 n70Var2 = new n70(context2, (TLRPC.TL_chatInviteExported) jh0Var.j0.get(i10 - i23), jh0Var.d, hashMap, jh0Var, jh0Var.n, false, jh0Var.h);
                            jh0Var.l0 = n70Var2;
                            n70Var2.show();
                            break;
                        } else if (i10 != jh0Var.N) {
                            int i24 = jh0Var.U;
                            if (i10 >= i24 && i10 < jh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) jh0Var.m0.get(i10 - i24);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    jh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                jh0 jh0Var2 = new jh0(jh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                jh0Var2.i0(jh0Var.d, null);
                                jh0Var.presentFragment(jh0Var2);
                                break;
                            }
                        } else if (!jh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(jh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new vg0(jh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            jh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                tk0.V((tk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.W((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.V((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                vg.a0.Q((vg.a0) this.b, (org.telegram.ui.ActionBar.r2) this.c, view);
                break;
            default:
                vg.s0.P((vg.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
