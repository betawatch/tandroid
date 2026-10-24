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
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bd;
import org.telegram.ui.dq;
import org.telegram.ui.mh0;
import org.telegram.ui.nc;
import org.telegram.ui.nc0;
import org.telegram.ui.nk0;
import org.telegram.ui.ny;
import org.telegram.ui.p60;
import org.telegram.ui.rc;
import org.telegram.ui.sc0;
import org.telegram.ui.sn;
import org.telegram.ui.uh0;
import org.telegram.ui.uu;
import org.telegram.ui.xa1;
import org.telegram.ui.xg0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements am0 {
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
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
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
        jb0 jb0Var;
        Paint.FontMetricsInt fontMetricsInt;
        String str5;
        int i11;
        int i12;
        boolean z10;
        kr0 kr0Var;
        nc0 nc0Var;
        float maxZoomLevel;
        float f7;
        switch (this.a) {
            case 0:
                t5 t5Var = (t5) this.b;
                z9 z9Var = (z9) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = z9Var.f;
                o5 o5Var = t5Var.w;
                y4 y4Var = t5Var.r;
                if (i10 >= 0 && i10 < o5Var.c.size()) {
                    j5 j5Var = (j5) o5Var.c.get(i10);
                    TL_stories.StoryView storyView = j5Var.b;
                    TL_stories.StoryReaction storyReaction = j5Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        z9Var.H(ProfileActivity.o4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        o2Var.createOverlayStoryViewer().F(t5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) j5Var.b).story, q7.a(y4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        z9Var.H(ProfileActivity.o4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
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
                            o2Var.createOverlayStoryViewer().F(t5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, q7.a(y4Var));
                            break;
                        } else {
                            t5Var.G = new c7(t5Var.v, arrayList2);
                            t5Var.H = i13;
                            s5 s5Var2 = t5Var.E;
                            z9 createOverlayStoryViewer = o2Var.createOverlayStoryViewer();
                            Context context = t5Var.getContext();
                            c7 c7Var = t5Var.G;
                            q7 a2 = q7.a(y4Var);
                            a2.e = new a1.c(s5Var2, 17);
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
                            z9Var.H(new sn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                di.u uVar = (di.u) this.b;
                ai.r0 r0Var = (ai.r0) this.c;
                b71 b71Var = uVar.Z;
                if (b71Var != null && (G = b71Var.G(i10 - 1)) != null) {
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
                org.telegram.ui.y5.y0((org.telegram.ui.y5) this.b, (Context) this.c, view, i10);
                break;
            case 4:
                bd.W((bd) this.b, (TLRPC.ChatFull) this.c, view, i10);
                break;
            case 5:
                nc ncVar = (nc) this.b;
                rc rcVar = (rc) this.c;
                bd bdVar = ncVar.c;
                int i15 = rcVar.d;
                xa1 xa1Var = rcVar.b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i15).peerColors;
                bdVar.f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).id;
                bdVar.Z0(true);
                bdVar.c1(true);
                bdVar.d1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + xa1Var.getPaddingLeft()) {
                    xa1Var.v0(-((AndroidUtilities.dp(48.0f) + xa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    break;
                } else if (view.getWidth() + view.getLeft() > (xa1Var.getMeasuredWidth() - xa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    xa1Var.v0(org.telegram.messenger.v0.z(48.0f, xa1Var.getMeasuredWidth() - xa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    break;
                }
                break;
            case 6:
                sn snVar = (sn) this.b;
                uh0 uh0Var = (uh0) this.c;
                snVar.getClass();
                TLObject tLObject = (TLObject) uh0Var.c.get(i10);
                if (tLObject != null) {
                    snVar.D7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    snVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                dq.X((dq) this.b, (Context) this.c, view, i10);
                break;
            case 8:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                m61 G2 = yVar.n0.G(i10 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, g6Var);
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
                ti.x((ti) this.b, (org.telegram.ui.ActionBar.g6) this.c, view);
                break;
            case 10:
                xj xjVar = (xj) this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.c;
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
                        mf0 mf0Var = new mf0(xjVar.b.f0, contact, null, null, null, null, str, str2, g6Var2);
                        mf0Var.K = new jj(xjVar);
                        mf0Var.show();
                        break;
                    } else {
                        xjVar.O((wj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                s80 s80Var = (s80) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                o80 o80Var = s80Var.f;
                ArrayList arrayList3 = s80Var.r;
                if (!s80Var.G && arrayList3.get(i10) != s80Var.x) {
                    s80Var.x = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof org.telegram.ui.Cells.f4;
                    if (z12) {
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = o80Var.getChildCount();
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = o80Var.getChildAt(i16);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.f4) childAt).c(false, true);
                            } else if (view instanceof org.telegram.ui.Cells.g7) {
                                ((org.telegram.ui.Cells.g7) childAt).b(false, true);
                            }
                        }
                    }
                    if (s80Var.w != 0) {
                        s80Var.x(chat, true);
                        break;
                    }
                }
                break;
            case 12:
                jb0 jb0Var2 = (jb0) this.b;
                gb0 gb0Var = (gb0) this.c;
                if (i10 == 0) {
                    jb0Var2.getClass();
                    break;
                } else {
                    hg.j1 adapter2 = jb0Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i17 = i10 - 1;
                        Object J = jb0Var2.getAdapter().J(i17);
                        int i18 = jb0Var2.getAdapter().X;
                        int i19 = jb0Var2.getAdapter().Y;
                        if (jb0Var2.getAdapter().F != null && i17 == 1) {
                            TLRPC.Chat chat2 = jb0Var2.getAdapter().l0;
                            if (chat2 == null && jb0Var2.getAdapter().G0 != null) {
                                chat2 = jb0Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jb0Var2.getAdapter().F);
                            gb0Var.I(i18, i19, a1.g.s(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                            break;
                        } else if (jb0Var2.getAdapter().F != null && i17 == 0) {
                            gb0Var.I(i18, i19, a1.g.s(new StringBuilder(), jb0Var2.getAdapter().F, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.c8) {
                                    ((org.telegram.ui.Cells.c8) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                gb0Var.B(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), jb0Var2.getAdapter().L(i17));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        gb0Var.I(i18, i19, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(si.o0.u(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        jb0Var = jb0Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new t61(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        gb0Var.I(i18, i19, spannableString, false);
                                    }
                                } else {
                                    jb0Var = jb0Var2;
                                    if (J instanceof String) {
                                        gb0Var.I(i18, i19, J + " ", false);
                                    } else if (J instanceof MediaDataController.KeywordResult) {
                                        String str8 = ((MediaDataController.KeywordResult) J).emoji;
                                        gb0Var.L(str8);
                                        if (str8 == null || !str8.startsWith("animated_")) {
                                            gb0Var.I(i18, i19, str8, true);
                                        } else {
                                            try {
                                                try {
                                                    fontMetricsInt = gb0Var.v();
                                                } catch (Exception e) {
                                                    FileLog.e((Throwable) e, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str8.substring(9));
                                                TLRPC.Document f10 = org.telegram.ui.Components.r5.f(UserConfig.selectedAccount, parseLong);
                                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                                spannableString2.setSpan(f10 != null ? new org.telegram.ui.Components.a6(f10, fontMetricsInt) : new org.telegram.ui.Components.a6(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                gb0Var.I(i18, i19, spannableString2, false);
                                            } catch (Exception unused) {
                                                gb0Var.I(i18, i19, str8, true);
                                            }
                                        }
                                        jb0Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        gb0Var.i(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(jb0Var.getAdapter().R);
                                        jb0Var.P = arrayList4;
                                        PhotoViewer.u1().M2(null, jb0Var.h, jb0Var.a);
                                        PhotoViewer.u1().i2(arrayList4, jb0Var.getAdapter().M(i17), 3, false, jb0Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) J);
                                if (publicUsername != null) {
                                    gb0Var.I(i18, i19, a1.g.p("@", publicUsername, " "), false);
                                }
                            }
                            jb0Var = jb0Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                oh0.p((oh0) this.b, (Context) this.c, view, i10);
                break;
            case 14:
                k51.S((k51) this.b, (org.telegram.ui.ActionBar.g6) this.c, i10);
                break;
            case 15:
                uu uuVar = (uu) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                vp vpVar = (vp) uuVar.c.d.get(i10);
                org.telegram.ui.ActionBar.j6 i20 = vpVar.a.i(uuVar.v);
                gg.b bVar = vpVar.a.c;
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
                    gg.b bVar2 = vpVar.a.c;
                    if (bVar2 != null && (str9 = bVar2.b) == null) {
                        str9 = bVar2.a;
                    }
                    if (!str9.equals("🎨")) {
                        i11 = -1;
                        if (i20 == null) {
                            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) vpVar.a.f.get(uuVar.v)).b;
                            org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) vpVar.a.f.get(uuVar.v)).d)));
                            if (P0 != null) {
                                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) P0.c0.get(tL_theme.id);
                                if (i6Var == null) {
                                    i6Var = P0.f(tL_theme, o2Var2.getCurrentAccount(), 0);
                                }
                                i11 = i6Var.a;
                                P0.u(i11);
                            }
                            i20 = P0;
                        }
                        org.telegram.ui.ActionBar.k6.H1(i20, false, i11, view);
                        uuVar.r = i10;
                        i12 = 0;
                        while (true) {
                            z10 = true;
                            if (i12 < uuVar.c.d.size()) {
                                uuVar.c.E(uuVar.r);
                                for (int i21 = 0; i21 < uuVar.a.getChildCount(); i21++) {
                                    v21 v21Var = (v21) uuVar.a.getChildAt(i21);
                                    if (v21Var != view && (kr0Var = v21Var.J) != null) {
                                        AndroidUtilities.cancelRunOnUIThread(kr0Var);
                                        v21Var.J.run();
                                    }
                                }
                                ((v21) view).d();
                                if (i20 != null) {
                                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                                    edit.putString((uuVar.s == 1 || i20.q()) ? "lastDarkTheme" : "lastDayTheme", i20.m());
                                    edit.commit();
                                }
                                org.telegram.ui.ActionBar.k6.J1(o2Var2);
                                break;
                            } else {
                                vp vpVar2 = (vp) uuVar.c.d.get(i12);
                                if (i12 != uuVar.r) {
                                    z10 = false;
                                }
                                vpVar2.d = z10;
                                i12++;
                            }
                        }
                    }
                }
                i11 = ((org.telegram.ui.ActionBar.e4) vpVar.a.f.get(uuVar.v)).e;
                if (i20 == null) {
                }
                org.telegram.ui.ActionBar.k6.H1(i20, false, i11, view);
                uuVar.r = i10;
                i12 = 0;
                while (true) {
                    z10 = true;
                    if (i12 < uuVar.c.d.size()) {
                    }
                    vpVar2.d = z10;
                    i12++;
                }
                break;
            case 16:
                ny.U((ny) this.b, (Context) this.c, i10);
                break;
            case 17:
                p60.U((p60) this.b, (Context) this.c, view, i10);
                break;
            case 18:
                sc0 sc0Var = (sc0) this.b;
                org.telegram.ui.ActionBar.y yVar2 = (org.telegram.ui.ActionBar.y) this.c;
                TLRPC.TL_messageMediaVenue I = sc0Var.W.I(i10);
                if (I != null && I.icon != null && sc0Var.G0 == 8 && sc0Var.I != null) {
                    sc0Var.C0 = true;
                    yVar2.j(true);
                    if ("pin".equals(I.icon)) {
                        maxZoomLevel = sc0Var.I.getMaxZoomLevel();
                        f7 = 4.0f;
                    } else {
                        maxZoomLevel = sc0Var.I.getMaxZoomLevel();
                        f7 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f7;
                    IMapsProvider.IMap iMap = sc0Var.I;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = I.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = sc0Var.x0;
                    if (location != null) {
                        location.setLatitude(I.geo.lat);
                        sc0Var.x0.setLongitude(I.geo._long);
                    }
                    sc0Var.T.L(sc0Var.x0);
                    break;
                } else if (I != null && (nc0Var = sc0Var.F0) != null) {
                    nc0Var.b(I, sc0Var.G0, true, 0, 0L);
                    sc0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                mh0 mh0Var = (mh0) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = mh0Var.k0;
                if (i10 == mh0Var.Q) {
                    TLRPC.User user4 = (TLRPC.User) hashMap.get(Long.valueOf(mh0Var.e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        mh0Var.presentFragment(new ProfileActivity(bundle3, null));
                        break;
                    }
                } else if (i10 == mh0Var.x) {
                    org.telegram.ui.gb0 gb0Var2 = new org.telegram.ui.gb0(0, mh0Var.n);
                    gb0Var2.T = mh0Var.s0;
                    mh0Var.presentFragment(gb0Var2);
                    break;
                } else {
                    int i22 = mh0Var.y;
                    if (i10 >= i22 && i10 < mh0Var.E) {
                        m70 m70Var = new m70(context2, (TLRPC.TL_chatInviteExported) mh0Var.i0.get(i10 - i22), mh0Var.d, hashMap, mh0Var, mh0Var.n, false, mh0Var.h);
                        mh0Var.l0 = m70Var;
                        m70Var.k0 = mh0Var.p0;
                        m70Var.show();
                        break;
                    } else {
                        int i23 = mh0Var.H;
                        if (i10 >= i23 && i10 < mh0Var.I) {
                            m70 m70Var2 = new m70(context2, (TLRPC.TL_chatInviteExported) mh0Var.j0.get(i10 - i23), mh0Var.d, hashMap, mh0Var, mh0Var.n, false, mh0Var.h);
                            mh0Var.l0 = m70Var2;
                            m70Var2.show();
                            break;
                        } else if (i10 != mh0Var.N) {
                            int i24 = mh0Var.U;
                            if (i10 >= i24 && i10 < mh0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) mh0Var.m0.get(i10 - i24);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    mh0Var.getMessagesController().putUser((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                mh0 mh0Var2 = new mh0(mh0Var.n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                mh0Var2.h0(mh0Var.d, null);
                                mh0Var.presentFragment(mh0Var2);
                                break;
                            }
                        } else if (!mh0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mh0Var.getParentActivity());
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new xg0(mh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            mh0Var.showDialog(alertDialog$Builder2.a);
                            break;
                        }
                    }
                }
                break;
            case 20:
                nk0.U((nk0) this.b, (Context) this.c, view, i10);
                break;
            case 21:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
                break;
            case 22:
                UsersSelectActivity.U((UsersSelectActivity) this.b, (Context) this.c, view, i10);
                break;
            case 23:
                ug.y.Q((ug.y) this.b, (org.telegram.ui.ActionBar.o2) this.c, view);
                break;
            default:
                ug.q0.P((ug.q0) this.b, (TLRPC.Chat) this.c, view);
                break;
        }
    }
}
