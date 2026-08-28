package bg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import gh.i3;
import ih.c5;
import ih.e7;
import ih.f5;
import ih.g5;
import ih.m9;
import ih.n4;
import ih.q6;
import ih.x4;
import java.util.ArrayList;
import java.util.HashMap;
import mh.u3;
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
import org.telegram.ui.ActionBar.a4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.bq;
import org.telegram.ui.hh0;
import org.telegram.ui.ic;
import org.telegram.ui.k60;
import org.telegram.ui.kc0;
import org.telegram.ui.kk0;
import org.telegram.ui.my;
import org.telegram.ui.nc;
import org.telegram.ui.pc0;
import org.telegram.ui.ph0;
import org.telegram.ui.qn;
import org.telegram.ui.tg0;
import org.telegram.ui.tu;
import org.telegram.ui.u5;
import org.telegram.ui.va1;
import org.telegram.ui.xc;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0253, code lost:
    
        if (r13.equals("🎨") != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0502  */
    @Override // org.telegram.ui.Components.mk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i9, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        l41 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        w90 w90Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        tp0 tp0Var;
        String str6;
        kc0 kc0Var;
        float maxZoomLevel;
        float f10;
        int i10 = -1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                h1.P((h1) this.b, (org.telegram.ui.ActionBar.o2) this.c, view);
                break;
            case 1:
                g2.O((g2) this.b, (TLRPC.Chat) this.c, view);
                break;
            case 2:
                g5 g5Var = (g5) this.b;
                m9 m9Var = (m9) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = m9Var.f;
                c5 c5Var = g5Var.w;
                n4 n4Var = g5Var.r;
                if (i9 >= 0 && i9 < c5Var.c.size()) {
                    x4 x4Var = (x4) c5Var.c.get(i9);
                    TL_stories.StoryView storyView = x4Var.b;
                    TL_stories.StoryReaction storyReaction = x4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        m9Var.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        o2Var.createOverlayStoryViewer().F(g5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) x4Var.b).story, e7.a(n4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        m9Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        f5 f5Var = g5Var.A;
                        if (f5Var != null && (arrayList = f5Var.i) != null) {
                            int size = arrayList.size();
                            while (i11 < g5Var.A.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) g5Var.A.i.get(i11);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i10 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                                i11++;
                            }
                            i11 = size;
                        }
                        if (i10 < 0 || arrayList2.size() <= 1) {
                            g5Var.C = null;
                            o2Var.createOverlayStoryViewer().F(g5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, e7.a(n4Var));
                            break;
                        } else {
                            g5Var.C = new q6(g5Var.v, arrayList2);
                            g5Var.D = i11;
                            f5 f5Var2 = g5Var.A;
                            m9 createOverlayStoryViewer = o2Var.createOverlayStoryViewer();
                            Context context = g5Var.getContext();
                            q6 q6Var = g5Var.C;
                            e7 a2 = e7.a(n4Var);
                            a2.e = new i3(f5Var2, 22);
                            createOverlayStoryViewer.C(context, i10, q6Var, a2);
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
                            m9Var.H(new qn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 3:
                jh.t tVar = (jh.t) this.b;
                i iVar = (i) this.c;
                z41 z41Var = tVar.V;
                if (z41Var != null && (G = z41Var.G(i9 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        iVar.run(((TranslateController.Language) obj).code);
                        tVar.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                u3.y0((u3) this.b, (Context) this.c, i9);
                break;
            case 5:
                u5.w0((u5) this.b, (Context) this.c, view, i9);
                break;
            case 6:
                xc.U((xc) this.b, (TLRPC.ChatFull) this.c, view, i9);
                break;
            case 7:
                ic icVar = (ic) this.b;
                nc ncVar = (nc) this.c;
                xc xcVar = icVar.c;
                int i12 = ncVar.d;
                va1 va1Var = ncVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i12).peerColors;
                xcVar.f = (peerColors == null || i9 < 0 || i9 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i9).id;
                xcVar.X0(true);
                xcVar.a1(true);
                xcVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + va1Var.getPaddingLeft()) {
                    va1Var.v0(-((AndroidUtilities.dp(48.0f) + va1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (va1Var.getMeasuredWidth() - va1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    va1Var.v0(org.telegram.messenger.l0.A(48.0f, va1Var.getMeasuredWidth() - va1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 8:
                qn qnVar = (qn) this.b;
                ph0 ph0Var = (ph0) this.c;
                qnVar.getClass();
                TLObject tLObject = (TLObject) ph0Var.c.get(i9);
                if (tLObject != null) {
                    qnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    qnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 9:
                bq.W((bq) this.b, (Context) this.c, view, i9);
                break;
            case 10:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                b6 b6Var = (b6) this.c;
                l41 G2 = yVar.i0.G(i9 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, b6Var);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar, i11));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 11:
                ki.v((ki) this.b, (b6) this.c, view);
                break;
            case 12:
                pj pjVar = (pj) this.b;
                b6 b6Var2 = (b6) this.c;
                ij ijVar = pjVar.A;
                f2.r0 adapter = pjVar.s.getAdapter();
                lj ljVar = pjVar.B;
                if (adapter == ljVar) {
                    O = ljVar.E(i9);
                } else {
                    int S = ijVar.S(i9);
                    int Q = ijVar.Q(i9);
                    if (Q >= 0 && S >= 0) {
                        O = ijVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (pjVar.w.isEmpty()) {
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
                        wd0 wd0Var = new wd0(pjVar.b.b0, contact, null, null, null, null, str, str2, b6Var2);
                        wd0Var.G = new zi(pjVar);
                        wd0Var.show();
                        break;
                    } else {
                        pjVar.K((oj) view, O);
                        break;
                    }
                }
                break;
            case 13:
                g70 g70Var = (g70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                c70 c70Var = g70Var.d;
                ArrayList arrayList3 = g70Var.h;
                if (!g70Var.A && arrayList3.get(i9) != g70Var.v) {
                    g70Var.v = (TLRPC.Peer) arrayList3.get(i9);
                    boolean z12 = view instanceof g4;
                    if (z12) {
                        z10 = true;
                        ((g4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = c70Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = c70Var.getChildAt(i13);
                        if (childAt != view) {
                            if (z12) {
                                ((g4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.e7) {
                                ((org.telegram.ui.Cells.e7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (g70Var.s != 0) {
                        g70Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 14:
                w90 w90Var2 = (w90) this.b;
                t90 t90Var = (t90) this.c;
                if (i9 == 0) {
                    w90Var2.getClass();
                    break;
                } else {
                    of.f1 adapter2 = w90Var2.getAdapter();
                    if (adapter2.s0 == null || adapter2.d0) {
                        int i14 = i9 - 1;
                        Object J = w90Var2.getAdapter().J(i14);
                        int i15 = w90Var2.getAdapter().T;
                        int i16 = w90Var2.getAdapter().U;
                        if (w90Var2.getAdapter().B != null && i14 == 1) {
                            TLRPC.Chat chat2 = w90Var2.getAdapter().h0;
                            if (chat2 == null && w90Var2.getAdapter().C0 != null) {
                                chat2 = w90Var2.getAdapter().C0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(w90Var2.getAdapter().B);
                            t90Var.y(i15, i16, aa.d.r(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (w90Var2.getAdapter().B != null && i14 == 0) {
                            t90Var.y(i15, i16, aa.d.r(new StringBuilder(), w90Var2.getAdapter().B, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof b8) {
                                    ((b8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                t90Var.p(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), w90Var2.getAdapter().L(i14));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        t90Var.y(i15, i16, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(ta.b.j(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        w90Var = w90Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new s41(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        t90Var.y(i15, i16, spannableString, false);
                                    }
                                } else {
                                    w90Var = w90Var2;
                                    if (J instanceof String) {
                                        t90Var.y(i15, i16, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        t90Var.A(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                t90Var.y(i15, i16, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = t90Var.h();
                                                } catch (Exception e10) {
                                                    FileLog.e((Throwable) e10, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f11 = k5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f11));
                                                spannableString2.setSpan(f11 != null ? new t5(f11, fontMetricsInt) : new t5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                t90Var.y(i15, i16, spannableString2, false);
                                                w90Var.o(false);
                                            }
                                        }
                                        t90Var.y(i15, i16, str9, true);
                                        w90Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        t90Var.a(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(w90Var.getAdapter().N);
                                        w90Var.L = arrayList4;
                                        PhotoViewer.t1().K2(null, w90Var.h, w90Var.a);
                                        PhotoViewer.t1().f2(arrayList4, w90Var.getAdapter().M(i14), 3, false, w90Var.M, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    t90Var.y(i15, i16, aa.d.o("@", publicUsername, " "), false);
                                }
                            }
                            w90Var = w90Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 15:
                ag0.o((ag0) this.b, (Context) this.c, view, i9);
                break;
            case 16:
                k31.R((k31) this.b, (b6) this.c, i9);
                break;
            case 17:
                tu tuVar = (tu) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                bp bpVar = (bp) tuVar.c.d.get(i9);
                e6 j10 = bpVar.a.j(tuVar.v);
                nf.b bVar = bpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    nf.b bVar2 = bpVar.a.c;
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
                i10 = ((a4) bpVar.a.f.get(tuVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((a4) bpVar.a.f.get(tuVar.v)).b;
                    e6 N0 = f6.N0(f6.q0(tL_theme.settings.get(((a4) bpVar.a.f.get(tuVar.v)).d)));
                    if (N0 != null) {
                        d6 d6Var = (d6) N0.Y.get(tL_theme.id);
                        if (d6Var == null) {
                            d6Var = N0.f(tL_theme, o2Var2.getCurrentAccount(), 0);
                        }
                        i10 = d6Var.a;
                        N0.u(i10);
                    }
                    j10 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i10));
                tuVar.r = i9;
                int i17 = 0;
                while (i17 < tuVar.c.d.size()) {
                    ((bp) tuVar.c.d.get(i17)).d = i17 == tuVar.r;
                    i17++;
                }
                tuVar.c.E(tuVar.r);
                for (int i18 = 0; i18 < tuVar.a.getChildCount(); i18++) {
                    a11 a11Var = (a11) tuVar.a.getChildAt(i18);
                    if (a11Var != view && (tp0Var = a11Var.F) != null) {
                        AndroidUtilities.cancelRunOnUIThread(tp0Var);
                        a11Var.F.run();
                    }
                }
                ((a11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((tuVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                f6.F1(o2Var2);
                break;
            case 18:
                my.T((my) this.b, (Context) this.c, i9);
                break;
            case 19:
                k60.T((k60) this.b, (Context) this.c, view, i9);
                break;
            case 20:
                pc0 pc0Var = (pc0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = pc0Var.S.I(i9);
                if (I != null && I.icon != null && pc0Var.C0 == 8 && pc0Var.E != null) {
                    pc0Var.y0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = pc0Var.E.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = pc0Var.E.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f12 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = pc0Var.E;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f12));
                    Location location = pc0Var.t0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        pc0Var.t0.setLongitude(I.geo._long);
                    }
                    pc0Var.P.L(pc0Var.t0);
                    break;
                } else if (I != null && (kc0Var = pc0Var.B0) != null) {
                    kc0Var.d(I, pc0Var.C0, true, 0, 0L);
                    pc0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                hh0 hh0Var = (hh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = hh0Var.g0;
                if (i9 == hh0Var.M) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(hh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        hh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i9 == hh0Var.x) {
                    bb0 bb0Var = new bb0(0, hh0Var.n);
                    bb0Var.P = hh0Var.o0;
                    hh0Var.presentFragment(bb0Var);
                    break;
                } else {
                    int i19 = hh0Var.y;
                    if (i9 >= i19 && i9 < hh0Var.A) {
                        a60 a60Var = new a60(context2, (TLRPC.TL_chatInviteExported) hh0Var.e0.get(i9 - i19), hh0Var.d, hashMap, hh0Var, hh0Var.n, false, hh0Var.h);
                        hh0Var.h0 = a60Var;
                        a60Var.g0 = hh0Var.l0;
                        a60Var.show();
                        break;
                    } else {
                        int i20 = hh0Var.D;
                        if (i9 >= i20 && i9 < hh0Var.E) {
                            a60 a60Var2 = new a60(context2, (TLRPC.TL_chatInviteExported) hh0Var.f0.get(i9 - i20), hh0Var.d, hashMap, hh0Var, hh0Var.n, false, hh0Var.h);
                            hh0Var.h0 = a60Var2;
                            a60Var2.show();
                            break;
                        } else if (i9 != hh0Var.J) {
                            int i21 = hh0Var.Q;
                            if (i9 >= i21 && i9 < hh0Var.R) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) hh0Var.i0.get(i9 - i21);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    hh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                hh0 hh0Var2 = new hh0(hh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                hh0Var2.f0(hh0Var.d, null);
                                hh0Var.presentFragment(hh0Var2);
                                break;
                            }
                        } else if (!hh0Var.Y) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh0Var.getParentActivity());
                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new tg0(hh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            hh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 22:
                kk0.T((kk0) this.b, (Context) this.c, view, i9);
                break;
            case 23:
                PrivacySettingsActivity.U((PrivacySettingsActivity) this.b, (Context) this.c, view, i9);
                break;
            default:
                UsersSelectActivity.T((UsersSelectActivity) this.b, (Context) this.c, view, i9);
                break;
        }
    }
}
