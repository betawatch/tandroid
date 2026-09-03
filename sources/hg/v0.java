package hg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import mh.m5;
import oh.a5;
import oh.c7;
import oh.d5;
import oh.e5;
import oh.i9;
import oh.l4;
import oh.o6;
import oh.v4;
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
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.e7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd;
import org.telegram.ui.bd0;
import org.telegram.ui.ch0;
import org.telegram.ui.dv;
import org.telegram.ui.kq;
import org.telegram.ui.mc;
import org.telegram.ui.ob0;
import org.telegram.ui.qb1;
import org.telegram.ui.qh0;
import org.telegram.ui.qk0;
import org.telegram.ui.rc;
import org.telegram.ui.wc0;
import org.telegram.ui.xh0;
import org.telegram.ui.xn;
import org.telegram.ui.y5;
import org.telegram.ui.yy;
import org.telegram.ui.z60;
import org.webrtc.MediaStreamTrack;
import sh.d3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0284, code lost:
    
        if (r13.equals("🎨") != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0533  */
    @Override // org.telegram.ui.Components.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z4;
        ra0 ra0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        nq0 nq0Var;
        String str6;
        wc0 wc0Var;
        float maxZoomLevel;
        float f10;
        h51 G;
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
                e5 e5Var = (e5) this.b;
                i9 i9Var = (i9) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = i9Var.f;
                a5 a5Var = e5Var.w;
                l4 l4Var = e5Var.r;
                if (i10 >= 0 && i10 < a5Var.c.size()) {
                    v4 v4Var = (v4) a5Var.c.get(i10);
                    TL_stories.StoryView storyView = v4Var.b;
                    TL_stories.StoryReaction storyReaction = v4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        i9Var.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        p2Var.createOverlayStoryViewer().G(e5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) v4Var.b).story, c7.a(l4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        i9Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        d5 d5Var = e5Var.B;
                        if (d5Var != null && (arrayList = d5Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < e5Var.B.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) e5Var.B.i.get(i12);
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
                            e5Var.D = null;
                            p2Var.createOverlayStoryViewer().G(e5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, c7.a(l4Var));
                            break;
                        } else {
                            e5Var.D = new o6(e5Var.v, arrayList2);
                            e5Var.E = i12;
                            d5 d5Var2 = e5Var.B;
                            i9 createOverlayStoryViewer = p2Var.createOverlayStoryViewer();
                            Context context = e5Var.getContext();
                            o6 o6Var = e5Var.D;
                            c7 a2 = c7.a(l4Var);
                            a2.e = new m5(d5Var2, 10);
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
                y5.x0((y5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.V((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                mc mcVar = (mc) this.b;
                rc rcVar = (rc) this.c;
                bd bdVar = mcVar.c;
                int i13 = rcVar.d;
                qb1 qb1Var = rcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + qb1Var.getPaddingLeft()) {
                    qb1Var.v0(-((AndroidUtilities.dp(48.0f) + qb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (qb1Var.getMeasuredWidth() - qb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    qb1Var.v0(y3.z(48.0f, qb1Var.getMeasuredWidth() - qb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                xn xnVar = (xn) this.b;
                xh0 xh0Var = (xh0) this.c;
                xnVar.getClass();
                TLObject tLObject = (TLObject) xh0Var.c.get(i10);
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
            case 7:
                kq.X((kq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) this.b;
                g6 g6Var = (g6) this.c;
                h51 G2 = zVar.j0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zVar.getContext(), 0, g6Var);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.t(zVar, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 9:
                mi.v((mi) this.b, (g6) this.c, view);
                break;
            case 10:
                sj sjVar = (sj) this.b;
                g6 g6Var2 = (g6) this.c;
                lj ljVar = sjVar.B;
                f2.p0 adapter = sjVar.s.getAdapter();
                oj ojVar = sjVar.C;
                if (adapter == ojVar) {
                    O = ojVar.E(i10);
                } else {
                    int S = ljVar.S(i10);
                    int Q = ljVar.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = ljVar.O(S, Q);
                    }
                }
                if (O != null) {
                    if (sjVar.w.isEmpty()) {
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
                        ue0 ue0Var = new ue0(sjVar.b.c0, contact, null, null, null, null, str, str2, g6Var2);
                        ue0Var.H = new cj(sjVar);
                        ue0Var.show();
                        break;
                    } else {
                        sjVar.K((rj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                a80 a80Var = (a80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                w70 w70Var = a80Var.d;
                ArrayList arrayList3 = a80Var.h;
                if (!a80Var.B && arrayList3.get(i10) != a80Var.v) {
                    a80Var.v = (TLRPC.Peer) arrayList3.get(i10);
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
                    int childCount = w70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = w70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z11) {
                                ((g4) childAt).c(false, z4);
                            } else if (view instanceof e7) {
                                ((e7) childAt).b(false, z4);
                            }
                        }
                    }
                    if (a80Var.s != 0) {
                        a80Var.w(chat, z4);
                        break;
                    }
                }
                break;
            case 12:
                ra0 ra0Var2 = (ra0) this.b;
                oa0 oa0Var = (oa0) this.c;
                if (i10 == 0) {
                    ra0Var2.getClass();
                    break;
                } else {
                    uf.u0 adapter2 = ra0Var2.getAdapter();
                    if (adapter2.t0 == null || adapter2.e0) {
                        int i15 = i10 - 1;
                        Object J = ra0Var2.getAdapter().J(i15);
                        int i16 = ra0Var2.getAdapter().U;
                        int i17 = ra0Var2.getAdapter().V;
                        if (ra0Var2.getAdapter().C != null && i15 == 1) {
                            TLRPC.Chat chat2 = ra0Var2.getAdapter().i0;
                            if (chat2 == null && ra0Var2.getAdapter().D0 != null) {
                                chat2 = ra0Var2.getAdapter().D0.e;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(ra0Var2.getAdapter().C);
                            oa0Var.U(i16, i17, android.support.v4.media.a.r(sb, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (ra0Var2.getAdapter().C != null && i15 == 0) {
                            oa0Var.U(i16, i17, android.support.v4.media.a.r(new StringBuilder(), ra0Var2.getAdapter().C, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof b8) {
                                    ((b8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                oa0Var.N(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), ra0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        oa0Var.U(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(w.c.e(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb2 = new StringBuilder("");
                                        ra0Var = ra0Var2;
                                        sb2.append(user3.id);
                                        spannableString.setSpan(new o51(sb2.toString(), 3, null), 0, spannableString.length(), 33);
                                        oa0Var.U(i16, i17, spannableString, false);
                                    }
                                } else {
                                    ra0Var = ra0Var2;
                                    if (J instanceof String) {
                                        oa0Var.U(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        oa0Var.X(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                oa0Var.U(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = oa0Var.w();
                                                } catch (Exception e6) {
                                                    FileLog.e((Throwable) e6, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f11 = l5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f11));
                                                spannableString2.setSpan(f11 != null ? new u5(f11, fontMetricsInt) : new u5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                oa0Var.U(i16, i17, spannableString2, false);
                                                ra0Var.o(false);
                                            }
                                        }
                                        oa0Var.U(i16, i17, str9, true);
                                        ra0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        oa0Var.l(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(ra0Var.getAdapter().O);
                                        ra0Var.M = arrayList4;
                                        PhotoViewer.t1().K2(null, ra0Var.h, ra0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, ra0Var.getAdapter().M(i15), 3, false, ra0Var.N, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    oa0Var.U(i16, i17, android.support.v4.media.a.o("@", publicUsername, " "), false);
                                }
                            }
                            ra0Var = ra0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                xg0.o((xg0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                g41.S((g41) this.b, (g6) this.c, i10);
                break;
            case 15:
                dv dvVar = (dv) this.b;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                lp lpVar = (lp) dvVar.c.d.get(i10);
                j6 j10 = lpVar.a.j(dvVar.v);
                tf.b bVar = lpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    tf.b bVar2 = lpVar.a.c;
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
                i11 = ((e4) lpVar.a.f.get(dvVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((e4) lpVar.a.f.get(dvVar.v)).b;
                    j6 N0 = k6.N0(k6.q0(tL_theme.settings.get(((e4) lpVar.a.f.get(dvVar.v)).d)));
                    if (N0 != null) {
                        i6 i6Var = (i6) N0.Z.get(tL_theme.id);
                        if (i6Var == null) {
                            i6Var = N0.f(tL_theme, p2Var2.getCurrentAccount(), 0);
                        }
                        i11 = i6Var.a;
                        N0.u(i11);
                    }
                    j10 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i11));
                dvVar.r = i10;
                int i18 = 0;
                while (i18 < dvVar.c.d.size()) {
                    ((lp) dvVar.c.d.get(i18)).d = i18 == dvVar.r;
                    i18++;
                }
                dvVar.c.E(dvVar.r);
                for (int i19 = 0; i19 < dvVar.a.getChildCount(); i19++) {
                    w11 w11Var = (w11) dvVar.a.getChildAt(i19);
                    if (w11Var != view && (nq0Var = w11Var.G) != null) {
                        AndroidUtilities.cancelRunOnUIThread(nq0Var);
                        w11Var.G.run();
                    }
                }
                ((w11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((dvVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                k6.F1(p2Var2);
                break;
            case 16:
                yy.U((yy) this.b, (Context) this.c, i10);
                break;
            case 17:
                z60.U((z60) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                bd0 bd0Var = (bd0) this.b;
                org.telegram.ui.ActionBar.z zVar2 = (org.telegram.ui.ActionBar.z) this.c;
                TLRPC.TL_messageMediaVenue I = bd0Var.T.I(i10);
                if (I != null && I.icon != null && bd0Var.D0 == 8 && bd0Var.F != null) {
                    bd0Var.z0 = true;
                    zVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = bd0Var.F.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = bd0Var.F.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f12 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = bd0Var.F;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f12));
                    Location location = bd0Var.u0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        bd0Var.u0.setLongitude(I.geo._long);
                    }
                    bd0Var.Q.L(bd0Var.u0);
                    break;
                } else if (I != null && (wc0Var = bd0Var.C0) != null) {
                    wc0Var.d(I, bd0Var.D0, true, 0, 0L);
                    bd0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                qh0 qh0Var = (qh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = qh0Var.h0;
                if (i10 == qh0Var.N) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(qh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        qh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == qh0Var.x) {
                    ob0 ob0Var = new ob0(0, qh0Var.n);
                    ob0Var.Q = qh0Var.p0;
                    qh0Var.presentFragment(ob0Var);
                    break;
                } else {
                    int i20 = qh0Var.y;
                    if (i10 >= i20 && i10 < qh0Var.B) {
                        u60 u60Var = new u60(context2, (TLRPC.TL_chatInviteExported) qh0Var.f0.get(i10 - i20), qh0Var.d, hashMap, qh0Var, qh0Var.n, false, qh0Var.h);
                        qh0Var.i0 = u60Var;
                        u60Var.h0 = qh0Var.m0;
                        u60Var.show();
                        break;
                    } else {
                        int i21 = qh0Var.E;
                        if (i10 >= i21 && i10 < qh0Var.F) {
                            u60 u60Var2 = new u60(context2, (TLRPC.TL_chatInviteExported) qh0Var.g0.get(i10 - i21), qh0Var.d, hashMap, qh0Var, qh0Var.n, false, qh0Var.h);
                            qh0Var.i0 = u60Var2;
                            u60Var2.show();
                            break;
                        } else if (i10 != qh0Var.K) {
                            int i22 = qh0Var.R;
                            if (i10 >= i22 && i10 < qh0Var.S) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) qh0Var.j0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    qh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                qh0 qh0Var2 = new qh0(qh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                qh0Var2.g0(qh0Var.d, null);
                                qh0Var.presentFragment(qh0Var2);
                                break;
                            }
                        } else if (!qh0Var.Z) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qh0Var.getParentActivity());
                            alertDialog$Builder2.a.O = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ch0(qh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            qh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                qk0.U((qk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                ph.o oVar = (ph.o) this.b;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.c;
                w51 w51Var = oVar.W;
                if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        d1Var.run(((TranslateController.Language) obj).code);
                        oVar.dismiss();
                        break;
                    }
                }
                break;
            default:
                d3.z0((d3) this.b, (Context) this.c, i10);
                break;
        }
    }
}
