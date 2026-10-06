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
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.cd;
import org.telegram.ui.d70;
import org.telegram.ui.di0;
import org.telegram.ui.dz;
import org.telegram.ui.fv;
import org.telegram.ui.gd0;
import org.telegram.ui.ih0;
import org.telegram.ui.mq;
import org.telegram.ui.tc;
import org.telegram.ui.vb0;
import org.telegram.ui.wh0;
import org.telegram.ui.wk0;
import org.telegram.ui.xb1;
import org.telegram.ui.yn;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements ml0 {
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
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        h61 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        bb0 bb0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        gq0 gq0Var;
        String str6;
        bd0 bd0Var;
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
                            jcVar.H(new yn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                w61 w61Var = yVar.Z;
                if (w61Var != null && (G = w61Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        y1Var.run(((TranslateController.Language) obj).code);
                        yVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ei.f4.E0((ei.f4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.w5.C0((org.telegram.ui.w5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                cd.U((cd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                org.telegram.ui.oc ocVar = (org.telegram.ui.oc) this.b;
                tc tcVar = (tc) this.c;
                cd cdVar = ocVar.c;
                int i13 = tcVar.d;
                xb1 xb1Var = tcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                cdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                cdVar.X0(true);
                cdVar.a1(true);
                cdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + xb1Var.getPaddingLeft()) {
                    xb1Var.w0(-((AndroidUtilities.dp(48.0f) + xb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (xb1Var.getMeasuredWidth() - xb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    xb1Var.w0(org.telegram.messenger.q.A(48.0f, xb1Var.getMeasuredWidth() - xb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                yn ynVar = (yn) this.b;
                di0 di0Var = (di0) this.c;
                ynVar.getClass();
                TLObject tLObject = (TLObject) di0Var.c.get(i10);
                if (tLObject != null) {
                    ynVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    ynVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                mq.W((mq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                h61 G2 = yVar2.m0.G(i10 - 1);
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
                xi.s((xi) this.b, (org.telegram.ui.ActionBar.d6) this.c, view);
                break;
            case 10:
                bk bkVar = (bk) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                vj vjVar = bkVar.E;
                s4.h0 adapter = bkVar.s.getAdapter();
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
                        bf0 bf0Var = new bf0(bkVar.b.f0, contact, null, null, null, null, str, str2, d6Var2);
                        bf0Var.K = new nj(bkVar);
                        bf0Var.show();
                        break;
                    } else {
                        bkVar.J((ak) view, O);
                        break;
                    }
                }
                break;
            case 11:
                k80 k80Var = (k80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                g80 g80Var = k80Var.d;
                ArrayList arrayList3 = k80Var.h;
                if (!k80Var.E && arrayList3.get(i10) != k80Var.v) {
                    k80Var.v = (TLRPC.Peer) arrayList3.get(i10);
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
                    int childCount = g80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = g80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.g7) {
                                ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (k80Var.s != 0) {
                        k80Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                bb0 bb0Var2 = (bb0) this.b;
                ya0 ya0Var = (ya0) this.c;
                if (i10 == 0) {
                    bb0Var2.getClass();
                    break;
                } else {
                    gg.k1 adapter2 = bb0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = bb0Var2.getAdapter().J(i15);
                        int i16 = bb0Var2.getAdapter().X;
                        int i17 = bb0Var2.getAdapter().Y;
                        if (bb0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = bb0Var2.getAdapter().l0;
                            if (chat2 == null && bb0Var2.getAdapter().G0 != null) {
                                chat2 = bb0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(bb0Var2.getAdapter().F);
                            ya0Var.C(i16, i17, a4.a.t(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (bb0Var2.getAdapter().F != null && i15 == 0) {
                            ya0Var.C(i16, i17, a4.a.t(new StringBuilder(), bb0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ya0Var.y(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), bb0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ya0Var.C(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(sa.e.v(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        bb0Var = bb0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new o61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        ya0Var.C(i16, i17, spannableString, false);
                                    }
                                } else {
                                    bb0Var = bb0Var2;
                                    if (J instanceof String) {
                                        ya0Var.C(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ya0Var.G(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                ya0Var.C(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = ya0Var.r();
                                                } catch (Exception e7) {
                                                    FileLog.e((Throwable) e7, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.z5(f10, fontMetricsInt) : new org.telegram.ui.Components.z5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ya0Var.C(i16, i17, spannableString2, false);
                                                bb0Var.o(false);
                                            }
                                        }
                                        ya0Var.C(i16, i17, str9, true);
                                        bb0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ya0Var.g(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(bb0Var.getAdapter().R);
                                        bb0Var.P = arrayList4;
                                        PhotoViewer.t1().K2(null, bb0Var.h, bb0Var.a);
                                        PhotoViewer.t1().g2(arrayList4, bb0Var.getAdapter().M(i15), 3, false, bb0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ya0Var.C(i16, i17, a4.a.q("@", publicUsername, " "), false);
                                }
                            }
                            bb0Var = bb0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                ch0.o((ch0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                f51.Q((f51) this.b, (org.telegram.ui.ActionBar.d6) this.c, i10);
                break;
            case 15:
                fv fvVar = (fv) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                op opVar = (op) fvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.h6 j3 = opVar.a.j(fvVar.v);
                fg.b bVar = opVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    fg.b bVar2 = opVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.b4) opVar.a.f.get(fvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) opVar.a.f.get(fvVar.v)).b;
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0(org.telegram.ui.ActionBar.i6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) opVar.a.f.get(fvVar.v)).d)));
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
                fvVar.r = i10;
                int i18 = 0;
                while (i18 < fvVar.c.d.size()) {
                    ((op) fvVar.c.d.get(i18)).d = i18 == fvVar.r;
                    i18++;
                }
                fvVar.c.E(fvVar.r);
                for (int i19 = 0; i19 < fvVar.a.getChildCount(); i19++) {
                    t21 t21Var = (t21) fvVar.a.getChildAt(i19);
                    if (t21Var != view && (gq0Var = t21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(gq0Var);
                        t21Var.J.run();
                    }
                }
                ((t21) view).d();
                if (j3 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((fvVar.s == 1 || j3.q()) ? "lastDarkTheme" : "lastDayTheme", j3.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.i6.F1(n2Var2);
                break;
            case 16:
                dz.S((dz) this.b, (Context) this.c, i10);
                break;
            case 17:
                d70.S((d70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                gd0 gd0Var = (gd0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = gd0Var.W.I(i10);
                if (I != null && I.icon != null && gd0Var.G0 == 8 && gd0Var.I != null) {
                    gd0Var.C0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = gd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = gd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = gd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = gd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        gd0Var.x0.setLongitude(I.geo._long);
                    }
                    gd0Var.T.L(gd0Var.x0);
                    break;
                } else if (I != null && (bd0Var = gd0Var.F0) != null) {
                    bd0Var.b(I, gd0Var.G0, true, 0, 0L);
                    gd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                wh0 wh0Var = (wh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = wh0Var.k0;
                if (i10 == wh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(wh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        wh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == wh0Var.x) {
                    vb0 vb0Var = new vb0(0, wh0Var.n);
                    vb0Var.T = wh0Var.s0;
                    wh0Var.presentFragment(vb0Var);
                    break;
                } else {
                    int i20 = wh0Var.y;
                    if (i10 >= i20 && i10 < wh0Var.E) {
                        f70 f70Var = new f70(context2, (TLRPC.TL_chatInviteExported) wh0Var.i0.get(i10 - i20), wh0Var.d, hashMap, wh0Var, wh0Var.n, false, wh0Var.h);
                        wh0Var.l0 = f70Var;
                        f70Var.k0 = wh0Var.p0;
                        f70Var.show();
                        break;
                    } else {
                        int i21 = wh0Var.H;
                        if (i10 >= i21 && i10 < wh0Var.I) {
                            f70 f70Var2 = new f70(context2, (TLRPC.TL_chatInviteExported) wh0Var.j0.get(i10 - i21), wh0Var.d, hashMap, wh0Var, wh0Var.n, false, wh0Var.h);
                            wh0Var.l0 = f70Var2;
                            f70Var2.show();
                            break;
                        } else if (i10 != wh0Var.N) {
                            int i22 = wh0Var.U;
                            if (i10 >= i22 && i10 < wh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) wh0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    wh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                wh0 wh0Var2 = new wh0(wh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                wh0Var2.g0(wh0Var.d, null);
                                wh0Var.presentFragment(wh0Var2);
                                break;
                            }
                        } else if (!wh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ih0(wh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            wh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                wk0.S((wk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.T((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.S((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                tg.a0.O((tg.a0) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                tg.s0.N((tg.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
