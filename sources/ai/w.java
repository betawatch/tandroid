package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.x1;
import di.s6;
import fi.g6;
import fi.i6;
import fi.ia;
import java.io.File;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a80;
import org.telegram.ui.cq0;
import org.telegram.ui.d80;
import org.telegram.ui.ey;
import org.telegram.ui.gq0;
import org.telegram.ui.jm0;
import org.telegram.ui.kh1;
import org.telegram.ui.kn0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.tq0;
import org.telegram.ui.up0;
import org.telegram.ui.vg1;
import org.telegram.ui.w40;
import org.telegram.ui.wn;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        int i10 = this.a;
        int i11 = 2;
        final int i12 = 0;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                x0 x0Var = ((x) obj).h;
                s4.t tVar = x0Var.d;
                ArrayList arrayList = x0Var.n;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    x0Var.v = true;
                    x0Var.h.a(i13, true);
                    int i14 = ((u) arrayList.get(i13)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i14) != null || Math.abs(i14 - L0) <= x0Var.r * 9) && SharedConfig.animationsEnabled()) {
                        n nVar = new n(x0Var.getContext());
                        nVar.a = ((u) arrayList.get(i13)).d;
                        tVar.w0(nVar);
                        break;
                    } else {
                        x0Var.c.C0();
                        ql0 ql0Var = x0Var.f;
                        ql0Var.b = L0 < i14 ? 0 : 1;
                        ql0Var.c(i14, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                bi.w1 w1Var = ((x1) obj).j0;
                int i15 = bi.w1.v;
                w1Var.a(i13);
                break;
            case 2:
                ((bi.w1) obj).a(i13);
                break;
            case 3:
                ia iaVar = (ia) obj;
                if (!iaVar.e.contains(Integer.valueOf(i13))) {
                    iaVar.e.add(Integer.valueOf(i13));
                } else if (iaVar.e.size() > 1) {
                    iaVar.e.remove(Integer.valueOf(i13));
                }
                AndroidUtilities.forEachViews((RecyclerView) iaVar.b, (Utilities.Callback<View>) new i(iaVar, 20));
                break;
            case 4:
                i6 i6Var = ((g6) obj).b;
                if (i6Var.r && (callback = i6Var.f) != null) {
                    callback.run(Integer.valueOf(i13));
                    break;
                }
                break;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).b[i13];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.i(i13);
                    break;
                }
                break;
            case 7:
                ((b2) obj).P.e4(i13);
                break;
            case 8:
                ((s3) obj).c.run(Integer.valueOf(i13));
                break;
            case 9:
                ((wn) obj).S9(i13);
                break;
            case 10:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i13 == 0) {
                    g0Var.d0 = !g0Var.d0;
                } else if (i13 == 1) {
                    g0Var.e0 = !g0Var.e0;
                } else if (i13 == 2) {
                    g0Var.f0 = !g0Var.f0;
                }
                g0Var.X.O(true);
                g0Var.s();
                break;
            case 11:
                boolean[] zArr = (boolean[]) obj;
                boolean z11 = !zArr[i13];
                zArr[i13] = z11;
                ((y1) view).c(z11, true);
                break;
            case 12:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.w.U(null, null);
                break;
            case 13:
                ((w40) obj).b.x(i13, true);
                break;
            case 14:
                w40 w40Var = ((v30) obj).c;
                w40Var.n(i13);
                w40Var.dismiss();
                break;
            case 15:
                ((ua0) obj).R.e1(i13 + 8);
                break;
            case 16:
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.e.getAdapter() instanceof vd0) {
                    sz szVar = ((ky) ((vd0) xd0Var.e.getAdapter())).c;
                    if ((i13 != 1 && i13 != 2) || !szVar.w1) {
                        if (i13 == 0 && szVar.v1) {
                            szVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        szVar.Q(true, false, i13 == 1);
                        break;
                    }
                }
                xd0Var.e.x(i13, false);
                break;
            case 17:
                s4 s4Var = (s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                break;
            case 18:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i13, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 19:
                final bw0 bw0Var = (bw0) obj;
                vs0 vs0Var = bw0Var.W;
                mv0 mv0Var = bw0Var.T;
                u6 u6Var = bw0Var.H1;
                long j10 = bw0Var.l1;
                SparseArray[] sparseArrayArr = bw0Var.b1;
                r2 r2Var = bw0Var.x1;
                if (i13 == 101) {
                    if (!bw0.w0(bw0Var.getSelectedTab()) && bw0Var.getSelectedTab() != 13) {
                        if (bw0Var.getSelectedTab() == 11) {
                            SavedMessagesController savedMessagesController = r2Var.getMessagesController().getSavedMessagesController();
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i16 = 0; i16 < savedMessagesController.allDialogs.size(); i16++) {
                                long j11 = savedMessagesController.allDialogs.get(i16).dialogId;
                                if (mv0Var.w.contains(Long.valueOf(j11))) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                            }
                            String str = "";
                            if (arrayList2.isEmpty()) {
                                z10 = false;
                            } else {
                                Long l4 = (Long) arrayList2.get(0);
                                long longValue = l4.longValue();
                                boolean z13 = longValue == r2Var.getUserConfig().getClientUserId();
                                z10 = z13;
                                if (longValue < 0) {
                                    TLRPC.Chat chat2 = r2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                                    z10 = z13;
                                    if (chat2 != null) {
                                        str = chat2.title;
                                        z10 = z13;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User user2 = r2Var.getMessagesController().getUser(l4);
                                    z10 = z13;
                                    if (user2 != null) {
                                        if (UserObject.isAnonymous(user2)) {
                                            str = LocaleController.getString(R.string.AnonymousForward);
                                            z10 = z13;
                                        } else {
                                            str = UserObject.getUserName(user2);
                                            z10 = z13;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                            String formatString = arrayList2.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList2.size(), new Object[0]);
                            e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = formatString;
                            e2Var.T = arrayList2.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList2.size(), new Object[0]);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Components.ps0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i17) {
                                    switch (r3) {
                                        case 0:
                                            bw0 bw0Var2 = bw0Var;
                                            org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var2.x1;
                                            di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                            long j12 = bw0Var2.l1;
                                            ArrayList arrayList3 = arrayList2;
                                            storiesController.s(j12, arrayList3);
                                            wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList3.size(), new Object[0])).j();
                                            bw0Var2.S(false);
                                            break;
                                        default:
                                            bw0 bw0Var3 = bw0Var;
                                            bw0Var3.getClass();
                                            int i18 = 0;
                                            while (true) {
                                                ArrayList arrayList4 = arrayList2;
                                                if (i18 >= arrayList4.size()) {
                                                    bw0Var3.S(true);
                                                    break;
                                                } else {
                                                    bw0Var3.x1.getMessagesController().deleteSavedDialog(((Long) arrayList4.get(i18)).longValue());
                                                    i18++;
                                                }
                                            }
                                    }
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            r2Var.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                f7.V(textView, y6.q7, null);
                                break;
                            }
                        } else {
                            if (DialogObject.isEncryptedDialog(j10)) {
                                encryptedChat = org.telegram.messenger.t.m(r2Var.getMessagesController(), j10);
                                user = null;
                                chat = null;
                            } else if (DialogObject.isUserDialog(j10)) {
                                user = r2Var.getMessagesController().getUser(Long.valueOf(j10));
                                chat = null;
                                encryptedChat = null;
                            } else {
                                chat = r2Var.getMessagesController().getChat(Long.valueOf(-j10));
                                user = null;
                                encryptedChat = null;
                            }
                            g5.y(r2Var, user, chat, encryptedChat, null, bw0Var.e1, null, bw0Var.b1, null, 0, 0, null, new wr0(bw0Var, 12), null, bw0Var.H1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (bw0Var.y0() && vs0Var != null && vs0Var.getCurrentList() != null) {
                            s6 currentList = vs0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                                String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                                e2 e2Var2 = alertDialog$Builder2.a;
                                e2Var2.R = string;
                                e2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList3.size(), new Object[0]);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new qy(bw0Var, currentList, arrayList3, 3));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new rd0(20));
                                e2Var2.show();
                                e2Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList4 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                                TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i18)).storyItem;
                                if (storyItem2 != null) {
                                    arrayList4.add(storyItem2);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                                e2 e2Var3 = alertDialog$Builder3.a;
                                e2Var3.R = string2;
                                e2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList4.size(), new Object[0]);
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Components.ps0
                                    @Override // org.telegram.ui.ActionBar.b2
                                    public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i172) {
                                        switch (i12) {
                                            case 0:
                                                bw0 bw0Var2 = bw0Var;
                                                org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var2.x1;
                                                di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                                long j12 = bw0Var2.l1;
                                                ArrayList arrayList32 = arrayList4;
                                                storiesController.s(j12, arrayList32);
                                                wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList32.size(), new Object[0])).j();
                                                bw0Var2.S(false);
                                                break;
                                            default:
                                                bw0 bw0Var3 = bw0Var;
                                                bw0Var3.getClass();
                                                int i182 = 0;
                                                while (true) {
                                                    ArrayList arrayList42 = arrayList4;
                                                    if (i182 >= arrayList42.size()) {
                                                        bw0Var3.S(true);
                                                        break;
                                                    } else {
                                                        bw0Var3.x1.getMessagesController().deleteSavedDialog(((Long) arrayList42.get(i182)).longValue());
                                                        i182++;
                                                    }
                                                }
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new rd0(21));
                                e2Var3.show();
                                e2Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i13 == 100) {
                    if (bw0Var.g1 == null || !r2Var.getMessagesController().isUserNoForwards(bw0Var.g1)) {
                        if (bw0Var.f1 != null) {
                            TLRPC.Chat chat3 = r2Var.getMessagesController().getChat(Long.valueOf(bw0Var.f1.id));
                            if (r2Var.getMessagesController().isChatNoForwards(chat3)) {
                                t40 t40Var = bw0Var.G1;
                                if (t40Var != null) {
                                    t40Var.setText((!ChatObject.isChannel(chat3) || chat3.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                                    bw0Var.G1.f(view, true);
                                    break;
                                }
                            }
                        }
                        if (bw0Var.r0()) {
                            t40 t40Var2 = bw0Var.G1;
                            if (t40Var2 != null) {
                                t40Var2.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                                bw0Var.G1.f(view, true);
                                break;
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("canSelectTopics", true);
                            bundle.putInt("dialogsType", 3);
                            ey eyVar = new ey(bundle);
                            eyVar.C2 = new xr0(bw0Var);
                            r2Var.presentFragment(eyVar);
                            break;
                        }
                    } else {
                        t40 t40Var3 = bw0Var.G1;
                        if (t40Var3 != null) {
                            t40Var3.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                            bw0Var.G1.f(view, true);
                            break;
                        }
                    }
                } else if (i13 != 102) {
                    if (i13 == 103 || i13 == 104) {
                        if (bw0Var.getClosestTab() != 8) {
                            SavedMessagesController savedMessagesController2 = r2Var.getMessagesController().getSavedMessagesController();
                            ArrayList<Long> arrayList5 = new ArrayList<>();
                            for (int i19 = 0; i19 < savedMessagesController2.allDialogs.size(); i19++) {
                                long j12 = savedMessagesController2.allDialogs.get(i19).dialogId;
                                if (mv0Var.w.contains(Long.valueOf(j12))) {
                                    arrayList5.add(Long.valueOf(j12));
                                }
                            }
                            if (savedMessagesController2.updatePinned(arrayList5, i13 == 103, true)) {
                                int i20 = 0;
                                while (true) {
                                    uu0[] uu0VarArr = bw0Var.m0;
                                    if (i20 < uu0VarArr.length) {
                                        uu0 uu0Var = uu0VarArr[i20];
                                        if (uu0Var.E == 11) {
                                            uu0Var.w.h1(0, 0);
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                            } else {
                                r2Var.showDialog(new tg.j0(33, r2Var.getCurrentAccount(), bw0Var.getContext(), r2Var, null));
                            }
                            bw0Var.S(true);
                            break;
                        } else {
                            iu0 iu0Var = bw0Var.e0;
                            if (iu0Var != null && iu0Var.s != null) {
                                ArrayList arrayList6 = new ArrayList();
                                for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                    arrayList6.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i21)).getId()));
                                }
                                bw0Var.Z0(arrayList6, i13 == 103);
                                bw0Var.S(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long dialogId = messageObject.getDialogId();
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                        bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                    } else if (DialogObject.isUserDialog(dialogId)) {
                        bundle2.putLong("user_id", dialogId);
                    } else {
                        TLRPC.Chat chat4 = r2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                        if (chat4 != null && chat4.migrated_to != null) {
                            bundle2.putLong("migrated_to", dialogId);
                            dialogId = -chat4.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -dialogId);
                    }
                    bundle2.putInt("message_id", messageObject.getId());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    wn wnVar = new wn(bundle2);
                    wnVar.b8 = messageObject.getId();
                    long j13 = bw0Var.F;
                    if (j13 != 0) {
                        pg.d.a(wnVar, MessagesStorage.TopicKey.of(dialogId, j13));
                        bundle2.putInt("message_id", messageObject.getId());
                    }
                    r2Var.presentFragment(wnVar, false);
                    break;
                }
                break;
            case 20:
                z71 z71Var = (z71) obj;
                int i22 = z71Var.b.i.q;
                if (i22 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    z71Var.updateAppUpdateViews(i13, true);
                    break;
                } else if (i22 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    z71Var.updateAppUpdateViews(i13, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", z71Var.d, null, false);
                        break;
                    }
                }
                break;
            case 21:
                ((org.telegram.ui.Components.voip.v0) obj).b.x(i13, true);
                break;
            case 22:
                kh1 kh1Var = (kh1) obj;
                if (kh1Var.U == null && view.getAlpha() != 0.0f) {
                    kh1Var.c(i13, true);
                    break;
                }
                break;
            case 23:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                break;
            case 24:
                d80 d80Var = (d80) obj;
                d80Var.Q.dismiss();
                int i23 = d80Var.c0;
                if (i23 >= 0) {
                    d80Var.d0.setKeepMedia(i23, i13);
                    a80 a80Var = d80Var.e0;
                    if (a80Var != null) {
                        a80Var.a(i13);
                        break;
                    }
                } else {
                    a80 a80Var2 = d80Var.e0;
                    if (a80Var2 != null) {
                        a80Var2.a(i13);
                        break;
                    }
                }
                break;
            case 25:
                rg0 rg0Var = (rg0) obj;
                ValueAnimator valueAnimator = rg0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    vg1 vg1Var = rg0Var.c;
                    if (!vg1Var.H) {
                        if (vg1Var.getCurrentPosition() == i13) {
                            Object X = rg0Var.X();
                            if (X instanceof qg0) {
                                ((qg0) X).s();
                                break;
                            }
                        } else {
                            rg0Var.j0(i13, true);
                            rg0Var.c.E(i13);
                            break;
                        }
                    }
                }
                break;
            case 26:
                ((yj0) obj).d.v.E(i13);
                break;
            case 27:
                kn0 kn0Var = (kn0) obj;
                jm0 jm0Var = kn0Var.D1;
                kn0Var.S0 = i13;
                if (i13 == 1) {
                    kn0Var.i0 = kn0Var.g0;
                } else if (i13 == 4) {
                    kn0Var.i0 = kn0Var.h0;
                } else if (i13 == 2) {
                    kn0Var.i0 = kn0Var.e0;
                } else if (i13 == 3) {
                    kn0Var.i0 = kn0Var.f0;
                } else {
                    kn0Var.i0 = kn0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.v1().N2(null, kn0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(kn0Var.j1);
                    PhotoViewer.v1().f2(arrayList7, 0, jm0Var);
                    break;
                } else if (i13 == 2) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(kn0Var.l1);
                    PhotoViewer.v1().f2(arrayList8, 0, jm0Var);
                    break;
                } else if (i13 == 3) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(kn0Var.m1);
                    PhotoViewer.v1().f2(arrayList9, 0, jm0Var);
                    break;
                } else if (i13 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList10 = kn0Var.i1;
                    v12.f2(arrayList10, arrayList10.indexOf(secureDocument), jm0Var);
                    break;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList11 = kn0Var.k1;
                    v13.f2(arrayList11, arrayList11.indexOf(secureDocument), jm0Var);
                    break;
                }
            case 28:
                cq0 cq0Var = (cq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = cq0Var.I;
                if (o1Var != null && o1Var.isShowing()) {
                    cq0Var.I.d(true);
                }
                if (i13 == 0) {
                    g5.K(cq0Var.getParentActivity(), cq0Var.F.a(), new up0(cq0Var, i11));
                    break;
                } else {
                    cq0Var.W(cq0Var.b, cq0Var.c, true, 0);
                    cq0Var.finishFragment();
                    break;
                }
                break;
            default:
                tq0 tq0Var = (tq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = tq0Var.m0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    tq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    g5.K(tq0Var.getParentActivity(), tq0Var.U.a(), new gq0(tq0Var, r9));
                    break;
                } else {
                    tq0Var.f0(0, true);
                    break;
                }
                break;
        }
    }
}
