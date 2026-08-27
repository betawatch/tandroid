package cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import jh.b5;
import jh.b7;
import jh.c5;
import jh.i9;
import jh.j4;
import jh.m6;
import jh.t4;
import jh.y4;
import nh.s3;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d4;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.zo;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.dq;
import org.telegram.ui.fb0;
import org.telegram.ui.jc;
import org.telegram.ui.kh0;
import org.telegram.ui.kk0;
import org.telegram.ui.o60;
import org.telegram.ui.oc;
import org.telegram.ui.oc0;
import org.telegram.ui.py;
import org.telegram.ui.rh0;
import org.telegram.ui.rn;
import org.telegram.ui.ta1;
import org.telegram.ui.tc0;
import org.telegram.ui.v5;
import org.telegram.ui.wg0;
import org.telegram.ui.wu;
import org.telegram.ui.xc;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0253, code lost:
    
        if (r13.equals("🎨") != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0502  */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        n41 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        aa0 aa0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        up0 up0Var;
        String str6;
        oc0 oc0Var;
        float maxZoomLevel;
        float f10;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                d1.Q((d1) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            case 1:
                z1.P((z1) this.b, (TLRPC.Chat) this.c, view);
                break;
            case 2:
                c5 c5Var = (c5) this.b;
                i9 i9Var = (i9) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = i9Var.f;
                y4 y4Var = c5Var.w;
                j4 j4Var = c5Var.r;
                if (i10 >= 0 && i10 < y4Var.c.size()) {
                    t4 t4Var = (t4) y4Var.c.get(i10);
                    TL_stories.StoryView storyView = t4Var.b;
                    TL_stories.StoryReaction storyReaction = t4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        i9Var.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) t4Var.b).story, b7.a(j4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        i9Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        b5 b5Var = c5Var.A;
                        if (b5Var != null && (arrayList = b5Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < c5Var.A.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) c5Var.A.i.get(i12);
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
                            c5Var.C = null;
                            n2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, b7.a(j4Var));
                            break;
                        } else {
                            c5Var.C = new m6(c5Var.v, arrayList2);
                            c5Var.D = i12;
                            b5 b5Var2 = c5Var.A;
                            i9 createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = c5Var.getContext();
                            m6 m6Var = c5Var.C;
                            b7 a2 = b7.a(j4Var);
                            a2.e = new h3.x(b5Var2, 23);
                            createOverlayStoryViewer.C(context, i11, m6Var, a2);
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
                            i9Var.H(new rn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 3:
                kh.u uVar = (kh.u) this.b;
                ag.n0 n0Var = (ag.n0) this.c;
                b51 b51Var = uVar.V;
                if (b51Var != null && (G = b51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        n0Var.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                s3.z0((s3) this.b, (Context) this.c, i10);
                break;
            case 5:
                v5.x0((v5) this.b, (Context) this.c, view, i10);
                break;
            case 6:
                xc.V((xc) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 7:
                jc jcVar = (jc) this.b;
                oc ocVar = (oc) this.c;
                xc xcVar = jcVar.c;
                int i13 = ocVar.d;
                ta1 ta1Var = ocVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                xcVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                xcVar.X0(true);
                xcVar.a1(true);
                xcVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + ta1Var.getPaddingLeft()) {
                    ta1Var.v0(-((AndroidUtilities.dp(48.0f) + ta1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    ta1Var.v0(org.telegram.messenger.y1.A(48.0f, ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 8:
                rn rnVar = (rn) this.b;
                rh0 rh0Var = (rh0) this.c;
                rnVar.getClass();
                TLObject tLObject = (TLObject) rh0Var.c.get(i10);
                if (tLObject != null) {
                    rnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    rnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 9:
                dq.X((dq) this.b, (Context) this.c, view, i10);
                break;
            case 10:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                c6 c6Var = (c6) this.c;
                n41 G2 = yVar.i0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, c6Var);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 11:
                gi.w((gi) this.b, (c6) this.c, view);
                break;
            case 12:
                lj ljVar = (lj) this.b;
                c6 c6Var2 = (c6) this.c;
                ej ejVar = ljVar.A;
                f2.q0 adapter = ljVar.s.getAdapter();
                hj hjVar = ljVar.B;
                if (adapter == hjVar) {
                    O = hjVar.E(i10);
                } else {
                    int S = ejVar.S(i10);
                    int Q = ejVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = ejVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (ljVar.w.isEmpty()) {
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
                        be0 be0Var = new be0(ljVar.b.b0, contact, null, null, null, null, str, str2, c6Var2);
                        be0Var.G = new vi(ljVar);
                        be0Var.show();
                        break;
                    } else {
                        ljVar.L((kj) view, O);
                        break;
                    }
                }
                break;
            case 13:
                k70 k70Var = (k70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                g70 g70Var = k70Var.d;
                ArrayList arrayList3 = k70Var.h;
                if (!k70Var.A && arrayList3.get(i10) != k70Var.v) {
                    k70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof d4;
                    if (z12) {
                        z10 = true;
                        ((d4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.b7) {
                            ((org.telegram.ui.Cells.b7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = g70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = g70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((d4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.b7) {
                                ((org.telegram.ui.Cells.b7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (k70Var.s != 0) {
                        k70Var.x(chat, z10);
                        break;
                    }
                }
                break;
            case 14:
                aa0 aa0Var2 = (aa0) this.b;
                x90 x90Var = (x90) this.c;
                if (i10 == 0) {
                    aa0Var2.getClass();
                    break;
                } else {
                    pf.u0 adapter2 = aa0Var2.getAdapter();
                    if (adapter2.s0 == null || adapter2.d0) {
                        int i15 = i10 - 1;
                        Object J = aa0Var2.getAdapter().J(i15);
                        int i16 = aa0Var2.getAdapter().T;
                        int i17 = aa0Var2.getAdapter().U;
                        if (aa0Var2.getAdapter().B != null && i15 == 1) {
                            TLRPC.Chat chat2 = aa0Var2.getAdapter().h0;
                            if (chat2 == null && aa0Var2.getAdapter().C0 != null) {
                                chat2 = aa0Var2.getAdapter().C0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(aa0Var2.getAdapter().B);
                            x90Var.H(i16, i17, a9.p.p(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (aa0Var2.getAdapter().B != null && i15 == 0) {
                            x90Var.H(i16, i17, a9.p.p(new StringBuilder(), aa0Var2.getAdapter().B, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof y7) {
                                    ((y7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                x90Var.x(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), aa0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        x90Var.H(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(s3.c.l(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        aa0Var = aa0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new u41(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        x90Var.H(i16, i17, spannableString, false);
                                    }
                                } else {
                                    aa0Var = aa0Var2;
                                    if (J instanceof String) {
                                        x90Var.H(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        x90Var.K(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                x90Var.H(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = x90Var.u();
                                                } catch (Exception e9) {
                                                    FileLog.e((Throwable) e9, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f11 = k5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f11));
                                                spannableString2.setSpan(f11 != null ? new t5(f11, fontMetricsInt) : new t5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                x90Var.H(i16, i17, spannableString2, false);
                                                aa0Var.o(false);
                                            }
                                        }
                                        x90Var.H(i16, i17, str9, true);
                                        aa0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        x90Var.c(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(aa0Var.getAdapter().N);
                                        aa0Var.L = arrayList4;
                                        PhotoViewer.t1().K2(null, aa0Var.h, aa0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, aa0Var.getAdapter().M(i15), 3, false, aa0Var.M, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    x90Var.H(i16, i17, a9.p.m("@", publicUsername, " "), false);
                                }
                            }
                            aa0Var = aa0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 15:
                cg0.p((cg0) this.b, (Context) this.c, view, i10);
                break;
            case 16:
                m31.S((m31) this.b, (c6) this.c, i10);
                break;
            case 17:
                wu wuVar = (wu) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                zo zoVar = (zo) wuVar.c.d.get(i10);
                f6 j10 = zoVar.a.j(wuVar.v);
                of.b bVar = zoVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    of.b bVar2 = zoVar.a.c;
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
                i11 = ((a4) zoVar.a.f.get(wuVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((a4) zoVar.a.f.get(wuVar.v)).b;
                    f6 N0 = g6.N0(g6.q0(tL_theme.settings.get(((a4) zoVar.a.f.get(wuVar.v)).d)));
                    if (N0 != null) {
                        e6 e6Var = (e6) N0.Y.get(tL_theme.id);
                        if (e6Var == null) {
                            e6Var = N0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = e6Var.a;
                        N0.u(i11);
                    }
                    j10 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i11));
                wuVar.r = i10;
                int i18 = 0;
                while (i18 < wuVar.c.d.size()) {
                    ((zo) wuVar.c.d.get(i18)).d = i18 == wuVar.r;
                    i18++;
                }
                wuVar.c.E(wuVar.r);
                for (int i19 = 0; i19 < wuVar.a.getChildCount(); i19++) {
                    b11 b11Var = (b11) wuVar.a.getChildAt(i19);
                    if (b11Var != view && (up0Var = b11Var.F) != null) {
                        AndroidUtilities.cancelRunOnUIThread(up0Var);
                        b11Var.F.run();
                    }
                }
                ((b11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((wuVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                g6.F1(n2Var2);
                break;
            case 18:
                py.U((py) this.b, (Context) this.c, i10);
                break;
            case 19:
                o60.U((o60) this.b, (Context) this.c, view, i10);
                break;
            case 20:
                tc0 tc0Var = (tc0) this.b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = tc0Var.S.I(i10);
                if (I != null && I.icon != null && tc0Var.C0 == 8 && tc0Var.E != null) {
                    tc0Var.y0 = true;
                    zVar.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = tc0Var.E.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = tc0Var.E.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f12 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = tc0Var.E;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f12));
                    Location location = tc0Var.t0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        tc0Var.t0.setLongitude(I.geo._long);
                    }
                    tc0Var.P.L(tc0Var.t0);
                    break;
                } else if (I != null && (oc0Var = tc0Var.B0) != null) {
                    oc0Var.d(I, tc0Var.C0, true, 0, 0L);
                    tc0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                kh0 kh0Var = (kh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = kh0Var.g0;
                if (i10 == kh0Var.M) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(kh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        kh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == kh0Var.x) {
                    fb0 fb0Var = new fb0(0, kh0Var.n);
                    fb0Var.P = kh0Var.o0;
                    kh0Var.presentFragment(fb0Var);
                    break;
                } else {
                    int i20 = kh0Var.y;
                    if (i10 >= i20 && i10 < kh0Var.A) {
                        f60 f60Var = new f60(context2, (TLRPC.TL_chatInviteExported) kh0Var.e0.get(i10 - i20), kh0Var.d, hashMap, kh0Var, kh0Var.n, false, kh0Var.h);
                        kh0Var.h0 = f60Var;
                        f60Var.g0 = kh0Var.l0;
                        f60Var.show();
                        break;
                    } else {
                        int i21 = kh0Var.D;
                        if (i10 >= i21 && i10 < kh0Var.E) {
                            f60 f60Var2 = new f60(context2, (TLRPC.TL_chatInviteExported) kh0Var.f0.get(i10 - i21), kh0Var.d, hashMap, kh0Var, kh0Var.n, false, kh0Var.h);
                            kh0Var.h0 = f60Var2;
                            f60Var2.show();
                            break;
                        } else if (i10 != kh0Var.J) {
                            int i22 = kh0Var.Q;
                            if (i10 >= i22 && i10 < kh0Var.R) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kh0Var.i0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    kh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                kh0 kh0Var2 = new kh0(kh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                kh0Var2.g0(kh0Var.d, null);
                                kh0Var.presentFragment(kh0Var2);
                                break;
                            }
                        } else if (!kh0Var.Y) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh0Var.getParentActivity());
                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new wg0(kh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            kh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 22:
                kk0.U((kk0) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
        }
    }
}
