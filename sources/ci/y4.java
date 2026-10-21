package ci;

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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ab0;
import org.telegram.ui.bd;
import org.telegram.ui.bq;
import org.telegram.ui.ic0;
import org.telegram.ui.ih0;
import org.telegram.ui.kk0;
import org.telegram.ui.l60;
import org.telegram.ui.ly;
import org.telegram.ui.nc;
import org.telegram.ui.nc0;
import org.telegram.ui.qh0;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.ru;
import org.telegram.ui.sa1;
import org.telegram.ui.tg0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r13.equals("🎨") != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    @Override // org.telegram.ui.Components.xl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
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
        ib0 ib0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        hr0 hr0Var;
        String str6;
        ic0 ic0Var;
        float maxZoomLevel;
        float f7;
        int i11 = -1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                u5 u5Var = (u5) this.b;
                aa aaVar = (aa) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = aaVar.f;
                p5 p5Var = u5Var.w;
                z4 z4Var = u5Var.r;
                if (i10 >= 0 && i10 < p5Var.c.size()) {
                    k5 k5Var = (k5) p5Var.c.get(i10);
                    TL_stories.StoryView storyView = k5Var.b;
                    TL_stories.StoryReaction storyReaction = k5Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        aaVar.H(ProfileActivity.m4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().F(u5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) k5Var.b).story, r7.a(z4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        aaVar.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        t5 t5Var = u5Var.E;
                        if (t5Var != null && (arrayList = t5Var.i) != null) {
                            int size = arrayList.size();
                            while (i12 < u5Var.E.i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) u5Var.E.i.get(i12);
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
                            u5Var.G = null;
                            n2Var.createOverlayStoryViewer().F(u5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, r7.a(z4Var));
                            break;
                        } else {
                            u5Var.G = new d7(u5Var.v, arrayList2);
                            u5Var.H = i12;
                            t5 t5Var2 = u5Var.E;
                            aa createOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = u5Var.getContext();
                            d7 d7Var = u5Var.G;
                            r7 a2 = r7.a(z4Var);
                            a2.e = new a1.c(t5Var2, 17);
                            createOverlayStoryViewer.C(context, i11, d7Var, a2);
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
                            aaVar.H(new qn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                di.u uVar = (di.u) this.b;
                ai.r0 r0Var = (ai.r0) this.c;
                u61 u61Var = uVar.Z;
                if (u61Var != null && (G = u61Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TranslateController.Language) {
                        r0Var.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                gi.u3.A0((gi.u3) this.b, (Context) this.c, i10);
                break;
            case 3:
                org.telegram.ui.z5.y0((org.telegram.ui.z5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.W((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                nc ncVar = (nc) this.b;
                rc rcVar = (rc) this.c;
                bd bdVar = ncVar.c;
                int i13 = rcVar.d;
                sa1 sa1Var = rcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i13).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.X0(true);
                bdVar.a1(true);
                bdVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + sa1Var.getPaddingLeft()) {
                    sa1Var.v0(-((AndroidUtilities.dp(48.0f) + sa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (sa1Var.getMeasuredWidth() - sa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    sa1Var.v0(org.telegram.messenger.g0.A(48.0f, sa1Var.getMeasuredWidth() - sa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                qn qnVar = (qn) this.b;
                qh0 qh0Var = (qh0) this.c;
                qnVar.getClass();
                TLObject tLObject = (TLObject) qh0Var.c.get(i10);
                if (tLObject != null) {
                    qnVar.D7(true);
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
            case 7:
                bq.X((bq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                h61 G2 = yVar.m0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, d6Var);
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
                ti.y((ti) this.b, (org.telegram.ui.ActionBar.d6) this.c, view);
                break;
            case 10:
                xj xjVar = (xj) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                rj rjVar = xjVar.E;
                s4.g0 adapter = xjVar.s.getAdapter();
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
                        jf0 jf0Var = new jf0(xjVar.b.f0, contact, null, null, null, null, str, str2, d6Var2);
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
                r80 r80Var = (r80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                n80 n80Var = r80Var.d;
                ArrayList arrayList3 = r80Var.h;
                if (!r80Var.E && arrayList3.get(i10) != r80Var.v) {
                    r80Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.f4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = n80Var.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = n80Var.getChildAt(i14);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.f4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.e7) {
                                ((org.telegram.ui.Cells.e7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (r80Var.s != 0) {
                        r80Var.y(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                ib0 ib0Var2 = (ib0) this.b;
                fb0 fb0Var = (fb0) this.c;
                if (i10 == 0) {
                    ib0Var2.getClass();
                    break;
                } else {
                    hg.j1 adapter2 = ib0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i15 = i10 - 1;
                        Object J = ib0Var2.getAdapter().J(i15);
                        int i16 = ib0Var2.getAdapter().X;
                        int i17 = ib0Var2.getAdapter().Y;
                        if (ib0Var2.getAdapter().F != null && i15 == 1) {
                            TLRPC.Chat chat2 = ib0Var2.getAdapter().l0;
                            if (chat2 == null && ib0Var2.getAdapter().G0 != null) {
                                chat2 = ib0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(ib0Var2.getAdapter().F);
                            fb0Var.I(i16, i17, a1.g.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (ib0Var2.getAdapter().F != null && i15 == 0) {
                            fb0Var.I(i16, i17, a1.g.s(new StringBuilder(), ib0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.c8) {
                                    ((org.telegram.ui.Cells.c8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                fb0Var.A(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), ib0Var2.getAdapter().L(i15));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        fb0Var.I(i16, i17, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(r4.c.u(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        ib0Var = ib0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new o61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        fb0Var.I(i16, i17, spannableString, false);
                                    }
                                } else {
                                    ib0Var = ib0Var2;
                                    if (J instanceof String) {
                                        fb0Var.I(i16, i17, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) J).emoji;
                                        fb0Var.L(str9);
                                        if (str9 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                fb0Var.I(i16, i17, str9, true);
                                            }
                                            if (str9.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = fb0Var.t();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str9.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.r5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.a6(f10, fontMetricsInt) : new org.telegram.ui.Components.a6(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                fb0Var.I(i16, i17, spannableString2, false);
                                                ib0Var.o(false);
                                            }
                                        }
                                        fb0Var.I(i16, i17, str9, true);
                                        ib0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        fb0Var.i(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(ib0Var.getAdapter().R);
                                        ib0Var.P = arrayList4;
                                        PhotoViewer.u1().M2(null, ib0Var.h, ib0Var.a);
                                        PhotoViewer.u1().i2(arrayList4, ib0Var.getAdapter().M(i15), 3, false, ib0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    fb0Var.I(i16, i17, a1.g.p("@", publicUsername, " "), false);
                                }
                            }
                            ib0Var = ib0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                lh0.p((lh0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                e51.T((e51) this.b, (org.telegram.ui.ActionBar.d6) this.c, i10);
                break;
            case 15:
                ru ruVar = (ru) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                vp vpVar = (vp) ruVar.c.d.get(i10);
                org.telegram.ui.ActionBar.g6 i18 = vpVar.a.i(ruVar.v);
                gg.b bVar = vpVar.a.c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.b;
                    if (str5 == null) {
                        str5 = bVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    gg.b bVar2 = vpVar.a.c;
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
                i11 = ((org.telegram.ui.ActionBar.b4) vpVar.a.f.get(ruVar.v)).e;
                if (i18 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) vpVar.a.f.get(ruVar.v)).b;
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0(org.telegram.ui.ActionBar.h6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) vpVar.a.f.get(ruVar.v)).d)));
                    if (O0 != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) O0.c0.get(tL_theme.id);
                        if (f6Var == null) {
                            f6Var = O0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        i11 = f6Var.a;
                        O0.u(i11);
                    }
                    i18 = O0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i18, Boolean.FALSE, null, Integer.valueOf(i11));
                ruVar.r = i10;
                int i19 = 0;
                while (i19 < ruVar.c.d.size()) {
                    ((vp) ruVar.c.d.get(i19)).d = i19 == ruVar.r;
                    i19++;
                }
                ruVar.c.E(ruVar.r);
                for (int i20 = 0; i20 < ruVar.a.getChildCount(); i20++) {
                    r21 r21Var = (r21) ruVar.a.getChildAt(i20);
                    if (r21Var != view && (hr0Var = r21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(hr0Var);
                        r21Var.J.run();
                    }
                }
                ((r21) view).d();
                if (i18 != null) {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((ruVar.s == 1 || i18.q()) ? "lastDarkTheme" : "lastDayTheme", i18.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.h6.G1(n2Var2);
                break;
            case 16:
                ly.U((ly) this.b, (Context) this.c, i10);
                break;
            case 17:
                l60.U((l60) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                nc0 nc0Var = (nc0) this.b;
                org.telegram.ui.ActionBar.y yVar2 = (org.telegram.ui.ActionBar.y) this.c;
                TLRPC.TL_messageMediaVenue I = nc0Var.W.I(i10);
                if (I != null && I.icon != null && nc0Var.G0 == 8 && nc0Var.I != null) {
                    nc0Var.C0 = true;
                    yVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = nc0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = nc0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = nc0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = nc0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        nc0Var.x0.setLongitude(I.geo._long);
                    }
                    nc0Var.T.L(nc0Var.x0);
                    break;
                } else if (I != null && (ic0Var = nc0Var.F0) != null) {
                    ic0Var.b(I, nc0Var.G0, true, 0, 0L);
                    nc0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                ih0 ih0Var = (ih0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = ih0Var.k0;
                if (i10 == ih0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(ih0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        ih0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == ih0Var.x) {
                    ab0 ab0Var = new ab0(0, ih0Var.n);
                    ab0Var.T = ih0Var.s0;
                    ih0Var.presentFragment(ab0Var);
                    break;
                } else {
                    int i21 = ih0Var.y;
                    if (i10 >= i21 && i10 < ih0Var.E) {
                        l70 l70Var = new l70(context2, (TLRPC.TL_chatInviteExported) ih0Var.i0.get(i10 - i21), ih0Var.d, hashMap, ih0Var, ih0Var.n, false, ih0Var.h);
                        ih0Var.l0 = l70Var;
                        l70Var.k0 = ih0Var.p0;
                        l70Var.show();
                        break;
                    } else {
                        int i22 = ih0Var.H;
                        if (i10 >= i22 && i10 < ih0Var.I) {
                            l70 l70Var2 = new l70(context2, (TLRPC.TL_chatInviteExported) ih0Var.j0.get(i10 - i22), ih0Var.d, hashMap, ih0Var, ih0Var.n, false, ih0Var.h);
                            ih0Var.l0 = l70Var2;
                            l70Var2.show();
                            break;
                        } else if (i10 != ih0Var.N) {
                            int i23 = ih0Var.U;
                            if (i10 >= i23 && i10 < ih0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ih0Var.m0.get(i10 - i23);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    ih0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                ih0 ih0Var2 = new ih0(ih0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                ih0Var2.g0(ih0Var.d, null);
                                ih0Var.presentFragment(ih0Var2);
                                break;
                            }
                        } else if (!ih0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ih0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new tg0(ih0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            ih0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                kk0.U((kk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                ug.z.R((ug.z) this.b, (org.telegram.ui.ActionBar.n2) this.c, view);
                break;
            default:
                ug.r0.Q((ug.r0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
