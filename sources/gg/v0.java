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
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.e7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.bd;
import org.telegram.ui.bh0;
import org.telegram.ui.cv;
import org.telegram.ui.jb1;
import org.telegram.ui.jq;
import org.telegram.ui.nb0;
import org.telegram.ui.nc;
import org.telegram.ui.ok0;
import org.telegram.ui.ph0;
import org.telegram.ui.sc;
import org.telegram.ui.vc0;
import org.telegram.ui.wh0;
import org.telegram.ui.xn;
import org.telegram.ui.xy;
import org.telegram.ui.y5;
import org.telegram.ui.y60;
import org.webrtc.MediaStreamTrack;
import rh.e3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements il0 {
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
    @Override // org.telegram.ui.Components.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
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
        pa0 pa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        nq0 nq0Var;
        String str6;
        vc0 vc0Var;
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
                            i9Var.H(new xn(bundle));
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
                y5.x0((y5) this.b, (Context) this.c, view, i10);
                break;
            case 5:
                bd.V((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 6:
                nc ncVar = (nc) this.b;
                sc scVar = (sc) this.c;
                bd bdVar = ncVar.c;
                int i13 = scVar.d;
                jb1 jb1Var = scVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + jb1Var.getPaddingLeft()) {
                    jb1Var.v0(-((AndroidUtilities.dp(48.0f) + jb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (jb1Var.getMeasuredWidth() - jb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    jb1Var.v0(y3.z(48.0f, jb1Var.getMeasuredWidth() - jb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 7:
                xn xnVar = (xn) this.b;
                wh0 wh0Var = (wh0) this.c;
                xnVar.getClass();
                TLObject tLObject = (TLObject) wh0Var.c.get(i10);
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
            case 8:
                jq.X((jq) this.b, (Context) this.c, view, i10);
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
                        se0 se0Var = new se0(qjVar.b.c0, contact, null, null, null, null, str, str2, f6Var2);
                        se0Var.H = new aj(qjVar);
                        se0Var.show();
                        break;
                    } else {
                        qjVar.K((pj) view, O);
                        break;
                    }
                }
                break;
            case 12:
                y70 y70Var = (y70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                u70 u70Var = y70Var.d;
                ArrayList arrayList3 = y70Var.h;
                if (!y70Var.B && arrayList3.get(i10) != y70Var.v) {
                    y70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z11 = view instanceof g4;
                    if (z11) {
                        z4 = true;
                        ((g4) view).c(true, true);
                    } else {
                        z4 = true;
                        if (view instanceof e7) {
                            ((e7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = u70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = u70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z11) {
                                ((g4) childAt).c(false, z4);
                            } else if (view instanceof e7) {
                                ((e7) childAt).b(false, z4);
                            }
                        }
                    }
                    if (y70Var.s != 0) {
                        y70Var.w(chat, z4);
                        break;
                    }
                }
                break;
            case 13:
                pa0 pa0Var2 = (pa0) this.b;
                ma0 ma0Var = (ma0) this.c;
                if (i10 == 0) {
                    pa0Var2.getClass();
                    break;
                } else {
                    tf.u0 adapter2 = pa0Var2.getAdapter();
                    if (adapter2.t0 == null || adapter2.e0) {
                        int i15 = i10 - 1;
                        Object J = pa0Var2.getAdapter().J(i15);
                        int i16 = pa0Var2.getAdapter().U;
                        int i17 = pa0Var2.getAdapter().V;
                        if (pa0Var2.getAdapter().C != null && i15 == 1) {
                            TLRPC.Chat chat2 = pa0Var2.getAdapter().i0;
                            if (chat2 == null && pa0Var2.getAdapter().D0 != null) {
                                chat2 = pa0Var2.getAdapter().D0.e;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(pa0Var2.getAdapter().C);
                            ma0Var.j(i16, i17, android.support.v4.media.a.r(sb, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (pa0Var2.getAdapter().C != null && i15 == 0) {
                            ma0Var.j(i16, i17, android.support.v4.media.a.r(new StringBuilder(), pa0Var2.getAdapter().C, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof b8) {
                                    ((b8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ma0Var.i(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), pa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ma0Var.j(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(vh.v2.k(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb2 = new StringBuilder("");
                                        pa0Var = pa0Var2;
                                        sb2.append(user3.id);
                                        spannableString.setSpan(new p51(sb2.toString(), 3, null), 0, spannableString.length(), 33);
                                        ma0Var.j(i16, i17, spannableString, false);
                                    }
                                } else {
                                    pa0Var = pa0Var2;
                                    if (J instanceof String) {
                                        ma0Var.j(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ma0Var.k(str9);
                                        if (str9 == null || !str9.startsWith("animated_")) {
                                            ma0Var.j(i16, i17, str9, true);
                                        } else {
                                            try {
                                                try {
                                                    fontMetricsInt = ma0Var.d();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f11 = l5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f11));
                                                spannableString2.setSpan(f11 != null ? new u5(f11, fontMetricsInt) : new u5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ma0Var.j(i16, i17, spannableString2, false);
                                            } catch (Exception unused) {
                                                ma0Var.j(i16, i17, str9, true);
                                            }
                                        }
                                        pa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ma0Var.a(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(pa0Var.getAdapter().O);
                                        pa0Var.M = arrayList4;
                                        PhotoViewer.t1().K2(null, pa0Var.h, pa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, pa0Var.getAdapter().M(i15), 3, false, pa0Var.N, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ma0Var.j(i16, i17, android.support.v4.media.a.o("@", publicUsername, " "), false);
                                }
                            }
                            pa0Var = pa0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 14:
                vg0.o((vg0) this.b, (Context) this.c, view, i10);
                break;
            case 15:
                g41.S((g41) this.b, (f6) this.c, i10);
                break;
            case 16:
                cv cvVar = (cv) this.b;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                jp jpVar = (jp) cvVar.c.d.get(i10);
                i6 j10 = jpVar.a.j(cvVar.v);
                sf.b bVar = jpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    sf.b bVar2 = jpVar.a.c;
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
                i11 = ((d4) jpVar.a.f.get(cvVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((d4) jpVar.a.f.get(cvVar.v)).b;
                    i6 N0 = j6.N0(j6.q0(tL_theme.settings.get(((d4) jpVar.a.f.get(cvVar.v)).d)));
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
                cvVar.r = i10;
                int i18 = 0;
                while (i18 < cvVar.c.d.size()) {
                    ((jp) cvVar.c.d.get(i18)).d = i18 == cvVar.r;
                    i18++;
                }
                cvVar.c.E(cvVar.r);
                for (int i19 = 0; i19 < cvVar.a.getChildCount(); i19++) {
                    w11 w11Var = (w11) cvVar.a.getChildAt(i19);
                    if (w11Var != view && (nq0Var = w11Var.G) != null) {
                        AndroidUtilities.cancelRunOnUIThread(nq0Var);
                        w11Var.G.run();
                    }
                }
                ((w11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((cvVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                j6.F1(p2Var2);
                break;
            case 17:
                xy.U((xy) this.b, (Context) this.c, i10);
                break;
            case 18:
                y60.U((y60) this.b, (Context) this.c, view, i10);
                break;
            case 19:
                ad0 ad0Var = (ad0) this.b;
                org.telegram.ui.ActionBar.z zVar2 = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = ad0Var.T.I(i10);
                if (I != null && I.icon != null && ad0Var.D0 == 8 && ad0Var.F != null) {
                    ad0Var.z0 = true;
                    zVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = ad0Var.F.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = ad0Var.F.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f12 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = ad0Var.F;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f12));
                    Location location = ad0Var.u0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        ad0Var.u0.setLongitude(I.geo._long);
                    }
                    ad0Var.Q.L(ad0Var.u0);
                    break;
                } else if (I != null && (vc0Var = ad0Var.C0) != null) {
                    vc0Var.d(I, ad0Var.D0, true, 0, 0L);
                    ad0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                ph0 ph0Var = (ph0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = ph0Var.h0;
                if (i10 == ph0Var.N) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(ph0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        ph0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == ph0Var.x) {
                    nb0 nb0Var = new nb0(0, ph0Var.n);
                    nb0Var.Q = ph0Var.p0;
                    ph0Var.presentFragment(nb0Var);
                    break;
                } else {
                    int i20 = ph0Var.y;
                    if (i10 >= i20 && i10 < ph0Var.B) {
                        s60 s60Var = new s60(context2, (TLRPC.TL_chatInviteExported) ph0Var.f0.get(i10 - i20), ph0Var.d, hashMap, ph0Var, ph0Var.n, false, ph0Var.h);
                        ph0Var.i0 = s60Var;
                        s60Var.h0 = ph0Var.m0;
                        s60Var.show();
                        break;
                    } else {
                        int i21 = ph0Var.E;
                        if (i10 >= i21 && i10 < ph0Var.F) {
                            s60 s60Var2 = new s60(context2, (TLRPC.TL_chatInviteExported) ph0Var.g0.get(i10 - i21), ph0Var.d, hashMap, ph0Var, ph0Var.n, false, ph0Var.h);
                            ph0Var.i0 = s60Var2;
                            s60Var2.show();
                            break;
                        } else if (i10 != ph0Var.K) {
                            int i22 = ph0Var.R;
                            if (i10 >= i22 && i10 < ph0Var.S) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ph0Var.j0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    ph0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                ph0 ph0Var2 = new ph0(ph0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                ph0Var2.g0(ph0Var.d, null);
                                ph0Var.presentFragment(ph0Var2);
                                break;
                            }
                        } else if (!ph0Var.Z) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ph0Var.getParentActivity());
                            alertDialog$Builder2.a.O = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new bh0(ph0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            ph0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 21:
                ok0.U((ok0) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                e3.z0((e3) this.b, (Context) this.c, i10);
                break;
        }
    }
}
