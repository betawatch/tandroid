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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.di0;
import org.telegram.ui.el0;
import org.telegram.ui.fo;
import org.telegram.ui.gd;
import org.telegram.ui.gd0;
import org.telegram.ui.hz;
import org.telegram.ui.j70;
import org.telegram.ui.kc1;
import org.telegram.ui.ki0;
import org.telegram.ui.kv;
import org.telegram.ui.ld0;
import org.telegram.ui.ph0;
import org.telegram.ui.sc;
import org.telegram.ui.tq;
import org.telegram.ui.xc;
import org.telegram.ui.zb0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r13.equals("🎨") != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        m61 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        ob0 ob0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        kr0 kr0Var;
        String str6;
        gd0 gd0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                w6 w6Var = (w6) this.b;
                sb sbVar = (sb) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = sbVar.f;
                q6 q6Var = w6Var.w;
                a6 a6Var = w6Var.r;
                if (i10 >= 0 && i10 < q6Var.c.size()) {
                    l6 l6Var = (l6) q6Var.c.get(i10);
                    TL_stories.StoryView storyView = l6Var.b;
                    TL_stories.StoryReaction storyReaction = l6Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        sbVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        m2Var.createOverlayStoryViewer().F(w6Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) l6Var.b).story, g9.a(a6Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        sbVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        v6 v6Var = w6Var.E;
                        if (v6Var != null && (arrayList = v6Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < w6Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) w6Var.E.i.get(i12);
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
                            w6Var.G = null;
                            m2Var.createOverlayStoryViewer().F(w6Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, g9.a(a6Var));
                            break;
                        } else {
                            w6Var.G = new r8(w6Var.v, arrayList2);
                            w6Var.H = i12;
                            v6 v6Var2 = w6Var.E;
                            sb createOverlayStoryViewer = m2Var.createOverlayStoryViewer();
                            Context context = w6Var.getContext();
                            r8 r8Var = w6Var.G;
                            g9 a2 = g9.a(a6Var);
                            a2.e = new a1.c(v6Var2, 7);
                            createOverlayStoryViewer.C(context, i11, r8Var, a2);
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
                            sbVar.H(new fo(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ci.x xVar = (ci.x) this.b;
                o1 o1Var = (o1) this.c;
                a71 a71Var = xVar.Z;
                if (a71Var != null && (G = a71Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        o1Var.run(((TranslateController.Language) obj).code);
                        xVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                fi.f4.A0((fi.f4) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.z5.y0((org.telegram.ui.z5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                gd.W((gd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                sc scVar = (sc) this.b;
                xc xcVar = (xc) this.c;
                gd gdVar = scVar.c;
                int i13 = xcVar.d;
                kc1 kc1Var = xcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                gdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                gdVar.X0(true);
                gdVar.a1(true);
                gdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + kc1Var.getPaddingLeft()) {
                    kc1Var.v0(-((AndroidUtilities.dp(48.0f) + kc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    kc1Var.v0(org.telegram.messenger.g0.A(48.0f, kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                fo foVar = (fo) this.b;
                ki0 ki0Var = (ki0) this.c;
                foVar.getClass();
                TLObject tLObject = (TLObject) ki0Var.c.get(i10);
                if (tLObject != null) {
                    foVar.D7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    foVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                tq.X((tq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                m61 G2 = yVar.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, c6Var);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 9:
                vi.y((vi) this.b, (org.telegram.ui.ActionBar.c6) this.c, view);
                break;
            case 10:
                zj zjVar = (zj) this.b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                tj tjVar = zjVar.E;
                s4.g0 adapter = zjVar.s.getAdapter();
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
                        pf0 pf0Var = new pf0(zjVar.b.f0, contact, null, null, null, null, str, str2, c6Var2);
                        pf0Var.K = new lj(zjVar);
                        pf0Var.show();
                        break;
                    } else {
                        zjVar.O((yj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                v80 v80Var = (v80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                r80 r80Var = v80Var.d;
                ArrayList arrayList3 = v80Var.h;
                if (!v80Var.E && arrayList3.get(i10) != v80Var.v) {
                    v80Var.v = (TLRPC.Peer) arrayList3.get(i10);
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
                    int childCount = r80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = r80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.f7) {
                                ((org.telegram.ui.Cells.f7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (v80Var.s != 0) {
                        v80Var.y(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                ob0 ob0Var2 = (ob0) this.b;
                lb0 lb0Var = (lb0) this.c;
                if (i10 == 0) {
                    ob0Var2.getClass();
                    break;
                } else {
                    hg.j1 adapter2 = ob0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = ob0Var2.getAdapter().J(i15);
                        int i16 = ob0Var2.getAdapter().X;
                        int i17 = ob0Var2.getAdapter().Y;
                        if (ob0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = ob0Var2.getAdapter().l0;
                            if (chat2 == null && ob0Var2.getAdapter().G0 != null) {
                                chat2 = ob0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(ob0Var2.getAdapter().F);
                            lb0Var.r(i16, i17, a1.g.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (ob0Var2.getAdapter().F != null && i15 == 0) {
                            lb0Var.r(i16, i17, a1.g.s(new StringBuilder(), ob0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.d8) {
                                    ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                lb0Var.m(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), ob0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        lb0Var.r(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(t8.b.u(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        ob0Var = ob0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new t61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        lb0Var.r(i16, i17, spannableString, false);
                                    }
                                } else {
                                    ob0Var = ob0Var2;
                                    if (J instanceof String) {
                                        lb0Var.r(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        lb0Var.y(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                lb0Var.r(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = lb0Var.i();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.b6(f10, fontMetricsInt) : new org.telegram.ui.Components.b6(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                lb0Var.r(i16, i17, spannableString2, false);
                                                ob0Var.o(false);
                                            }
                                        }
                                        lb0Var.r(i16, i17, str9, true);
                                        ob0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        lb0Var.g(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(ob0Var.getAdapter().R);
                                        ob0Var.P = arrayList4;
                                        PhotoViewer.t1().K2(null, ob0Var.h, ob0Var.a);
                                        PhotoViewer.t1().g2(arrayList4, ob0Var.getAdapter().M(i15), 3, false, ob0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    lb0Var.r(i16, i17, a1.g.p("@", publicUsername, " "), false);
                                }
                            }
                            ob0Var = ob0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                qh0.q((qh0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                i51.T((i51) this.b, (org.telegram.ui.ActionBar.c6) this.c, i10);
                break;
            case 15:
                kv kvVar = (kv) this.b;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.c;
                yp ypVar = (yp) kvVar.c.d.get(i10);
                org.telegram.ui.ActionBar.f6 j10 = ypVar.a.j(kvVar.v);
                gg.b bVar = ypVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    gg.b bVar2 = ypVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.a4) ypVar.a.f.get(kvVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) ypVar.a.f.get(kvVar.v)).b;
                    org.telegram.ui.ActionBar.f6 O0 = org.telegram.ui.ActionBar.g6.O0(org.telegram.ui.ActionBar.g6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) ypVar.a.f.get(kvVar.v)).d)));
                    if (O0 != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) O0.c0.get(tL_theme.id);
                        if (e6Var == null) {
                            e6Var = O0.f(tL_theme, m2Var2.getCurrentAccount(), 0);
                        }
                        i11 = e6Var.a;
                        O0.u(i11);
                    }
                    j10 = O0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i11));
                kvVar.r = i10;
                int i18 = 0;
                while (i18 < kvVar.c.d.size()) {
                    ((yp) kvVar.c.d.get(i18)).d = i18 == kvVar.r;
                    i18++;
                }
                kvVar.c.E(kvVar.r);
                for (int i19 = 0; i19 < kvVar.a.getChildCount(); i19++) {
                    w21 w21Var = (w21) kvVar.a.getChildAt(i19);
                    if (w21Var != view && (kr0Var = w21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(kr0Var);
                        w21Var.J.run();
                    }
                }
                ((w21) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((kvVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.g6.G1(m2Var2);
                break;
            case 16:
                hz.U((hz) this.b, (Context) this.c, i10);
                break;
            case 17:
                j70.U((j70) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                ld0 ld0Var = (ld0) this.b;
                org.telegram.ui.ActionBar.y yVar2 = (org.telegram.ui.ActionBar.y) this.c;
                TLRPC.TL_messageMediaVenue I = ld0Var.W.I(i10);
                if (I != null && I.icon != null && ld0Var.G0 == 8 && ld0Var.I != null) {
                    ld0Var.C0 = true;
                    yVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = ld0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = ld0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = ld0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = ld0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        ld0Var.x0.setLongitude(I.geo._long);
                    }
                    ld0Var.T.L(ld0Var.x0);
                    break;
                } else if (I != null && (gd0Var = ld0Var.F0) != null) {
                    gd0Var.b(I, ld0Var.G0, true, 0, 0L);
                    ld0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                di0 di0Var = (di0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = di0Var.k0;
                if (i10 == di0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(di0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        di0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == di0Var.x) {
                    zb0 zb0Var = new zb0(0, di0Var.n);
                    zb0Var.T = di0Var.s0;
                    di0Var.presentFragment(zb0Var);
                    break;
                } else {
                    int i20 = di0Var.y;
                    if (i10 >= i20 && i10 < di0Var.E) {
                        p70 p70Var = new p70(context2, (TLRPC.TL_chatInviteExported) di0Var.i0.get(i10 - i20), di0Var.d, hashMap, di0Var, di0Var.n, false, di0Var.h);
                        di0Var.l0 = p70Var;
                        p70Var.k0 = di0Var.p0;
                        p70Var.show();
                        break;
                    } else {
                        int i21 = di0Var.H;
                        if (i10 >= i21 && i10 < di0Var.I) {
                            p70 p70Var2 = new p70(context2, (TLRPC.TL_chatInviteExported) di0Var.j0.get(i10 - i21), di0Var.d, hashMap, di0Var, di0Var.n, false, di0Var.h);
                            di0Var.l0 = p70Var2;
                            p70Var2.show();
                            break;
                        } else if (i10 != di0Var.N) {
                            int i22 = di0Var.U;
                            if (i10 >= i22 && i10 < di0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) di0Var.m0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    di0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                di0 di0Var2 = new di0(di0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                di0Var2.g0(di0Var.d, null);
                                di0Var.presentFragment(di0Var2);
                                break;
                            }
                        } else if (!di0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(di0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ph0(di0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            di0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                el0.U((el0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                ug.a0.R((ug.a0) this.b, (org.telegram.ui.ActionBar.m2) this.c, view);
                break;
            default:
                ug.s0.Q((ug.s0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
