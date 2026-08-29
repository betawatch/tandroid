package eg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import lh.b5;
import lh.b7;
import lh.c5;
import lh.i9;
import lh.j4;
import lh.n6;
import lh.t4;
import lh.y4;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a4;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.dq;
import org.telegram.ui.eb0;
import org.telegram.ui.gk0;
import org.telegram.ui.hc;
import org.telegram.ui.hh0;
import org.telegram.ui.m60;
import org.telegram.ui.mc;
import org.telegram.ui.mc0;
import org.telegram.ui.oh0;
import org.telegram.ui.oy;
import org.telegram.ui.rc0;
import org.telegram.ui.tg0;
import org.telegram.ui.tn;
import org.telegram.ui.uu;
import org.telegram.ui.v5;
import org.telegram.ui.vc;
import org.telegram.ui.wa1;
import org.webrtc.MediaStreamTrack;
import ph.d3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x025f, code lost:
    
        if (r13.equals("🎨") != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x050e  */
    @Override // org.telegram.ui.Components.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        w41 G;
        Object O;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        ka0 ka0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        fq0 fq0Var;
        String str6;
        mc0 mc0Var;
        float maxZoomLevel;
        float f9;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                c1.Q((c1) this.b, (org.telegram.ui.ActionBar.o2) this.c, view);
                break;
            case 1:
                x1.P((x1) this.b, (TLRPC.Chat) this.c, view);
                break;
            case 2:
                c5 c5Var = (c5) this.b;
                i9 i9Var = (i9) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = i9Var.f;
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
                        o2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) t4Var.b).story, b7.a(j4Var));
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
                            o2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, b7.a(j4Var));
                            break;
                        } else {
                            c5Var.C = new n6(c5Var.v, arrayList2);
                            c5Var.D = i12;
                            b5 b5Var2 = c5Var.A;
                            i9 createOverlayStoryViewer = o2Var.createOverlayStoryViewer();
                            Context context = c5Var.getContext();
                            n6 n6Var = c5Var.C;
                            b7 a2 = b7.a(j4Var);
                            a2.e = new l4.s0(b5Var2, 5);
                            createOverlayStoryViewer.C(context, i11, n6Var, a2);
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
                            i9Var.H(new tn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 3:
                mh.u uVar = (mh.u) this.b;
                ag.i0 i0Var = (ag.i0) this.c;
                k51 k51Var = uVar.V;
                if (k51Var != null && (G = k51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        i0Var.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                v5.x0((v5) this.b, (Context) this.c, view, i10);
                break;
            case 5:
                vc.V((vc) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 6:
                hc hcVar = (hc) this.b;
                mc mcVar = (mc) this.c;
                vc vcVar = hcVar.c;
                int i13 = mcVar.d;
                wa1 wa1Var = mcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                vcVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                vcVar.X0(true);
                vcVar.a1(true);
                vcVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + wa1Var.getPaddingLeft()) {
                    wa1Var.v0(-((AndroidUtilities.dp(48.0f) + wa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    wa1Var.v0(x3.z(48.0f, wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 7:
                tn tnVar = (tn) this.b;
                oh0 oh0Var = (oh0) this.c;
                tnVar.getClass();
                TLObject tLObject = (TLObject) oh0Var.c.get(i10);
                if (tLObject != null) {
                    tnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    tnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 8:
                dq.X((dq) this.b, (Context) this.c, view, i10);
                break;
            case 9:
                org.telegram.ui.Components.a0 a0Var = (org.telegram.ui.Components.a0) this.b;
                c6 c6Var = (c6) this.c;
                w41 G2 = a0Var.i0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a0Var.getContext(), 0, c6Var);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.u(a0Var, i12));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 10:
                ni.v((ni) this.b, (c6) this.c, view);
                break;
            case 11:
                sj sjVar = (sj) this.b;
                c6 c6Var2 = (c6) this.c;
                lj ljVar = sjVar.A;
                f2.p0 adapter = sjVar.s.getAdapter();
                oj ojVar = sjVar.B;
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
                        ke0 ke0Var = new ke0(sjVar.b.b0, contact, null, null, null, null, str, str2, c6Var2);
                        ke0Var.G = new cj(sjVar);
                        ke0Var.show();
                        break;
                    } else {
                        sjVar.K((rj) view, O);
                        break;
                    }
                }
                break;
            case 12:
                t70 t70Var = (t70) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                p70 p70Var = t70Var.d;
                ArrayList arrayList3 = t70Var.h;
                if (!t70Var.A && arrayList3.get(i10) != t70Var.v) {
                    t70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof e4;
                    if (z12) {
                        z10 = true;
                        ((e4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof c7) {
                            ((c7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = p70Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = p70Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((e4) childAt).c(false, z10);
                            } else if (view instanceof c7) {
                                ((c7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (t70Var.s != 0) {
                        t70Var.w(chat, z10);
                        break;
                    }
                }
                break;
            case 13:
                ka0 ka0Var2 = (ka0) this.b;
                ha0 ha0Var = (ha0) this.c;
                if (i10 == 0) {
                    ka0Var2.getClass();
                    break;
                } else {
                    rf.v0 adapter2 = ka0Var2.getAdapter();
                    if (adapter2.s0 == null || adapter2.d0) {
                        int i15 = i10 - 1;
                        Object J = ka0Var2.getAdapter().J(i15);
                        int i16 = ka0Var2.getAdapter().T;
                        int i17 = ka0Var2.getAdapter().U;
                        if (ka0Var2.getAdapter().B != null && i15 == 1) {
                            TLRPC.Chat chat2 = ka0Var2.getAdapter().h0;
                            if (chat2 == null && ka0Var2.getAdapter().C0 != null) {
                                chat2 = ka0Var2.getAdapter().C0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(ka0Var2.getAdapter().B);
                            ha0Var.r(i16, i17, a4.w.q(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (ka0Var2.getAdapter().B != null && i15 == 0) {
                            ha0Var.r(i16, i17, a4.w.q(new StringBuilder(), ka0Var2.getAdapter().B, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof z7) {
                                    ((z7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                ha0Var.p(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), ka0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        ha0Var.r(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(u3.c.k(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        ka0Var = ka0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new d51(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        ha0Var.r(i16, i17, spannableString, false);
                                    }
                                } else {
                                    ka0Var = ka0Var2;
                                    if (J instanceof String) {
                                        ha0Var.r(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        ha0Var.s(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                ha0Var.r(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = ha0Var.n();
                                                } catch (Exception e10) {
                                                    FileLog.e((Throwable) e10, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = p5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new y5(f10, fontMetricsInt) : new y5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                ha0Var.r(i16, i17, spannableString2, false);
                                                ka0Var.o(false);
                                            }
                                        }
                                        ha0Var.r(i16, i17, str9, true);
                                        ka0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        ha0Var.b(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(ka0Var.getAdapter().N);
                                        ka0Var.L = arrayList4;
                                        PhotoViewer.t1().K2(null, ka0Var.h, ka0Var.a);
                                        PhotoViewer.t1().f2(arrayList4, ka0Var.getAdapter().M(i15), 3, false, ka0Var.M, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    ha0Var.r(i16, i17, a4.w.n("@", publicUsername, " "), false);
                                }
                            }
                            ka0Var = ka0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 14:
                lg0.o((lg0) this.b, (Context) this.c, view, i10);
                break;
            case 15:
                v31.S((v31) this.b, (c6) this.c, i10);
                break;
            case 16:
                uu uuVar = (uu) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                fp fpVar = (fp) uuVar.c.d.get(i10);
                f6 j10 = fpVar.a.j(uuVar.v);
                qf.b bVar = fpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    qf.b bVar2 = fpVar.a.c;
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
                i11 = ((a4) fpVar.a.f.get(uuVar.v)).e;
                if (j10 == null) {
                    TLRPC.TL_theme tL_theme = ((a4) fpVar.a.f.get(uuVar.v)).b;
                    f6 N0 = g6.N0(g6.q0(tL_theme.settings.get(((a4) fpVar.a.f.get(uuVar.v)).d)));
                    if (N0 != null) {
                        e6 e6Var = (e6) N0.Y.get(tL_theme.id);
                        if (e6Var == null) {
                            e6Var = N0.f(tL_theme, o2Var2.getCurrentAccount(), 0);
                        }
                        i11 = e6Var.a;
                        N0.u(i11);
                    }
                    j10 = N0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j10, Boolean.FALSE, null, Integer.valueOf(i11));
                uuVar.r = i10;
                int i18 = 0;
                while (i18 < uuVar.c.d.size()) {
                    ((fp) uuVar.c.d.get(i18)).d = i18 == uuVar.r;
                    i18++;
                }
                uuVar.c.E(uuVar.r);
                for (int i19 = 0; i19 < uuVar.a.getChildCount(); i19++) {
                    l11 l11Var = (l11) uuVar.a.getChildAt(i19);
                    if (l11Var != view && (fq0Var = l11Var.F) != null) {
                        AndroidUtilities.cancelRunOnUIThread(fq0Var);
                        l11Var.F.run();
                    }
                }
                ((l11) view).d();
                if (j10 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((uuVar.s == 1 || j10.q()) ? "lastDarkTheme" : "lastDayTheme", j10.m());
                    edit.commit();
                }
                g6.F1(o2Var2);
                break;
            case 17:
                oy.U((oy) this.b, (Context) this.c, i10);
                break;
            case 18:
                m60.U((m60) this.b, (Context) this.c, view, i10);
                break;
            case 19:
                rc0 rc0Var = (rc0) this.b;
                org.telegram.ui.ActionBar.a0 a0Var2 = (org.telegram.ui.ActionBar.a0) this.c;
                TLRPC.TL_messageMediaVenue I = rc0Var.S.I(i10);
                if (I != null && I.icon != null && rc0Var.C0 == 8 && rc0Var.E != null) {
                    rc0Var.y0 = true;
                    a0Var2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = rc0Var.E.getMaxZoomLevel();
                        f9 = 4.0f;
                    } else {
                        maxZoomLevel = rc0Var.E.getMaxZoomLevel();
                        f9 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f9;
                    IMapsProvider.IMap iMap = rc0Var.E;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = rc0Var.t0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        rc0Var.t0.setLongitude(I.geo._long);
                    }
                    rc0Var.P.L(rc0Var.t0);
                    break;
                } else if (I != null && (mc0Var = rc0Var.B0) != null) {
                    mc0Var.d(I, rc0Var.C0, true, 0, 0L);
                    rc0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                hh0 hh0Var = (hh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = hh0Var.g0;
                if (i10 == hh0Var.M) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(hh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        hh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == hh0Var.x) {
                    eb0 eb0Var = new eb0(0, hh0Var.n);
                    eb0Var.P = hh0Var.o0;
                    hh0Var.presentFragment(eb0Var);
                    break;
                } else {
                    int i20 = hh0Var.y;
                    if (i10 >= i20 && i10 < hh0Var.A) {
                        n60 n60Var = new n60(context2, (TLRPC.TL_chatInviteExported) hh0Var.e0.get(i10 - i20), hh0Var.d, hashMap, hh0Var, hh0Var.n, false, hh0Var.h);
                        hh0Var.h0 = n60Var;
                        n60Var.g0 = hh0Var.l0;
                        n60Var.show();
                        break;
                    } else {
                        int i21 = hh0Var.D;
                        if (i10 >= i21 && i10 < hh0Var.E) {
                            n60 n60Var2 = new n60(context2, (TLRPC.TL_chatInviteExported) hh0Var.f0.get(i10 - i21), hh0Var.d, hashMap, hh0Var, hh0Var.n, false, hh0Var.h);
                            hh0Var.h0 = n60Var2;
                            n60Var2.show();
                            break;
                        } else if (i10 != hh0Var.J) {
                            int i22 = hh0Var.Q;
                            if (i10 >= i22 && i10 < hh0Var.R) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) hh0Var.i0.get(i10 - i22);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    hh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                hh0 hh0Var2 = new hh0(hh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                hh0Var2.g0(hh0Var.d, null);
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
            case 21:
                gk0.U((gk0) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                d3.z0((d3) this.b, (Context) this.c, i10);
                break;
        }
    }
}
