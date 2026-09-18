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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd;
import org.telegram.ui.bl0;
import org.telegram.ui.dc1;
import org.telegram.ui.dz;
import org.telegram.ui.e70;
import org.telegram.ui.ed0;
import org.telegram.ui.gi0;
import org.telegram.ui.gv;
import org.telegram.ui.jd0;
import org.telegram.ui.lh0;
import org.telegram.ui.nq;
import org.telegram.ui.yb0;
import org.telegram.ui.zh0;
import org.telegram.ui.zn;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements kl0 {
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
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        x51 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        wa0 wa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        xq0 xq0Var;
        String str6;
        ed0 ed0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                j7 j7Var = (j7) this.b;
                jc jcVar = (jc) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = jcVar.f;
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
                        n2Var.createOverlayStoryViewer().F(j7Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) z6Var.b).story, u9.a(p6Var));
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
                            n2Var.createOverlayStoryViewer().F(j7Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, u9.a(p6Var));
                            break;
                        } else {
                            j7Var.G = new g9(j7Var.v, arrayList2);
                            j7Var.H = i12;
                            i7 i7Var2 = j7Var.E;
                            jc createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
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
                            jcVar.H(new zn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                bi.y yVar = (bi.y) this.b;
                y1 y1Var = (y1) this.c;
                l61 l61Var = yVar.Z;
                if (l61Var != null && (G = l61Var.G(i10 - 1)) != null) {
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
                bd.W((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                org.telegram.ui.oc ocVar = (org.telegram.ui.oc) this.b;
                org.telegram.ui.sc scVar = (org.telegram.ui.sc) this.c;
                bd bdVar = ocVar.c;
                int i13 = scVar.d;
                dc1 dc1Var = scVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + dc1Var.getPaddingLeft()) {
                    dc1Var.w0(-((AndroidUtilities.dp(48.0f) + dc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (dc1Var.getMeasuredWidth() - dc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    dc1Var.w0(org.telegram.messenger.q.B(48.0f, dc1Var.getMeasuredWidth() - dc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                zn znVar = (zn) this.b;
                gi0 gi0Var = (gi0) this.c;
                znVar.getClass();
                TLObject tLObject = (TLObject) gi0Var.c.get(i10);
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
            case 7:
                nq.X((nq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar2 = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                x51 G2 = yVar2.m0.G(i10 - 1);
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
                vi.v((vi) this.b, (org.telegram.ui.ActionBar.e6) this.c, view);
                break;
            case 10:
                yj yjVar = (yj) this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
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
                        ye0 ye0Var = new ye0(yjVar.b.f0, contact, null, null, null, null, str, str2, e6Var2);
                        ye0Var.K = new kj(yjVar);
                        ye0Var.show();
                        break;
                    } else {
                        yjVar.L((xj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                f80 f80Var = (f80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                b80 b80Var = f80Var.d;
                ArrayList arrayList3 = f80Var.h;
                if (!f80Var.E && arrayList3.get(i10) != f80Var.v) {
                    f80Var.v = (TLRPC.Peer) arrayList3.get(i10);
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
                    int childCount = b80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = b80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.g7) {
                                ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (f80Var.s != 0) {
                        f80Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                wa0 wa0Var2 = (wa0) this.b;
                ta0 ta0Var = (ta0) this.c;
                if (i10 == 0) {
                    wa0Var2.getClass();
                    break;
                } else {
                    gg.k1 adapter2 = wa0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = wa0Var2.getAdapter().J(i15);
                        int i16 = wa0Var2.getAdapter().X;
                        int i17 = wa0Var2.getAdapter().Y;
                        if (wa0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = wa0Var2.getAdapter().l0;
                            if (chat2 == null && wa0Var2.getAdapter().G0 != null) {
                                chat2 = wa0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(wa0Var2.getAdapter().F);
                            ta0Var.O(i16, i17, a4.a.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (wa0Var2.getAdapter().F != null && i15 == 0) {
                            ta0Var.O(i16, i17, a4.a.s(new StringBuilder(), wa0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ta0Var.A(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), wa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ta0Var.O(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(t8.b.v(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        wa0Var = wa0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new e61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        ta0Var.O(i16, i17, spannableString, false);
                                    }
                                } else {
                                    wa0Var = wa0Var2;
                                    if (J instanceof String) {
                                        ta0Var.O(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ta0Var.P(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                ta0Var.O(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = ta0Var.w();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.z5(f10, fontMetricsInt) : new org.telegram.ui.Components.z5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ta0Var.O(i16, i17, spannableString2, false);
                                                wa0Var.o(false);
                                            }
                                        }
                                        ta0Var.O(i16, i17, str9, true);
                                        wa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ta0Var.f(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(wa0Var.getAdapter().R);
                                        wa0Var.P = arrayList4;
                                        PhotoViewer.t1().J2(null, wa0Var.h, wa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, wa0Var.getAdapter().M(i15), 3, false, wa0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ta0Var.O(i16, i17, a4.a.p("@", publicUsername, " "), false);
                                }
                            }
                            wa0Var = wa0Var2;
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
                v41.S((v41) this.b, (org.telegram.ui.ActionBar.e6) this.c, i10);
                break;
            case 15:
                gv gvVar = (gv) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                lp lpVar = (lp) gvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.i6 j3 = lpVar.a.j(gvVar.v);
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
                i11 = ((org.telegram.ui.ActionBar.c4) lpVar.a.f.get(gvVar.v)).e;
                if (j3 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) lpVar.a.f.get(gvVar.v)).b;
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) lpVar.a.f.get(gvVar.v)).d)));
                    if (N0 != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) N0.c0.get(tL_theme.id);
                        if (g6Var == null) {
                            g6Var = N0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = g6Var.a;
                        N0.u(i11);
                    }
                    j3 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j3, Boolean.FALSE, null, Integer.valueOf(i11));
                gvVar.r = i10;
                int i18 = 0;
                while (i18 < gvVar.c.d.size()) {
                    ((lp) gvVar.c.d.get(i18)).d = i18 == gvVar.r;
                    i18++;
                }
                gvVar.c.E(gvVar.r);
                for (int i19 = 0; i19 < gvVar.a.getChildCount(); i19++) {
                    j21 j21Var = (j21) gvVar.a.getChildAt(i19);
                    if (j21Var != view && (xq0Var = j21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(xq0Var);
                        j21Var.J.run();
                    }
                }
                ((j21) view).d();
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
                e70.U((e70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                jd0 jd0Var = (jd0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = jd0Var.W.I(i10);
                if (I != null && I.icon != null && jd0Var.G0 == 8 && jd0Var.I != null) {
                    jd0Var.C0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = jd0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = jd0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = jd0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = jd0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        jd0Var.x0.setLongitude(I.geo._long);
                    }
                    jd0Var.T.L(jd0Var.x0);
                    break;
                } else if (I != null && (ed0Var = jd0Var.F0) != null) {
                    ed0Var.b(I, jd0Var.G0, true, 0, 0L);
                    jd0Var.finishFragment();
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
                    yb0 yb0Var = new yb0(0, zh0Var.n);
                    yb0Var.T = zh0Var.s0;
                    zh0Var.presentFragment(yb0Var);
                    break;
                } else {
                    int i20 = zh0Var.y;
                    if (i10 >= i20 && i10 < zh0Var.E) {
                        a70 a70Var = new a70(context2, (TLRPC.TL_chatInviteExported) zh0Var.i0.get(i10 - i20), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
                        zh0Var.l0 = a70Var;
                        a70Var.k0 = zh0Var.p0;
                        a70Var.show();
                        break;
                    } else {
                        int i21 = zh0Var.H;
                        if (i10 >= i21 && i10 < zh0Var.I) {
                            a70 a70Var2 = new a70(context2, (TLRPC.TL_chatInviteExported) zh0Var.j0.get(i10 - i21), zh0Var.d, hashMap, zh0Var, zh0Var.n, false, zh0Var.h);
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
                tg.a0.Q((tg.a0) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                tg.s0.P((tg.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
