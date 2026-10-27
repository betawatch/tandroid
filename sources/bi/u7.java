package bi;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.bp;
import org.telegram.ui.ey;
import org.telegram.ui.hn;
import org.telegram.ui.jp;
import org.telegram.ui.kp;
import org.telegram.ui.lp;
import org.telegram.ui.oz;
import org.telegram.ui.pp;
import org.telegram.ui.q00;
import org.telegram.ui.ux;
import org.telegram.ui.wn;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u7(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x056c, code lost:
    
        if (r2 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0679, code lost:
    
        if (r5 == null) goto L295;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        ArrayList arrayList;
        int i10;
        switch (this.a) {
            case 0:
                ((Utilities.Callback2) this.d).run(Boolean.valueOf(this.b), (String) this.c);
                return;
            case 1:
                ((lc) this.d).run(Boolean.valueOf(this.b), (String) this.c);
                return;
            case 2:
                ((org.telegram.ui.Wallet.r1) this.d).run(Boolean.valueOf(this.b), (String) this.c);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                ArrayList arrayList2 = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                    if (database == null) {
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                    sb2.append(this.b ? "2" : "0 OR type = 1");
                    sb2.append(" ORDER BY date DESC");
                    sQLiteCursor = database.queryFinalized(sb2.toString(), new Object[0]);
                    while (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(0);
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            try {
                                fi.z0 z0Var = new fi.z0(byteBufferValue);
                                z0Var.a = longValue;
                                arrayList2.add(z0Var);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                arrayList3.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList3.size() > 0) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i11)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new e2.q0(4, callback, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 4:
                fi.n3 n3Var = (fi.n3) this.d;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList4 = n3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    n3Var.h = messages_botresults.next_offset;
                    if (this.b) {
                        arrayList4.clear();
                    }
                    for (int i12 = 0; i12 < messages_botresults.results.size(); i12++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i12);
                        TLRPC.Document document = botInlineResult.document;
                        if (document != null) {
                            arrayList4.add(document);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList4.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList4.add(botInlineResult);
                            }
                        }
                    }
                    n3Var.d = false;
                    n3Var.F(false);
                    n3Var.l();
                    return;
                }
                return;
            case 5:
                jg.z zVar = (jg.z) this.d;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                SQLiteCursor sQLiteCursor2 = null;
                try {
                    try {
                        sQLiteCursor2 = messagesStorage2.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor2.dispose();
                        ArrayList<Long> arrayList8 = new ArrayList<>();
                        ArrayList arrayList9 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i13);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i14 = 0; i14 < tL_businessChatLink.entities.size(); i14++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i14);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList8, arrayList6);
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        break;
                    }
                    sQLiteCursor2.dispose();
                    AndroidUtilities.runOnUIThread(new fi.r1(zVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                }
            case 6:
                ((ki.a) this.d).P((Utilities.Callback) this.c, this.b, false);
                return;
            case 7:
                ((Utilities.Callback2) this.d).run((Bitmap) this.c, Boolean.valueOf(this.b));
                return;
            case 8:
                li.v3 v3Var = (li.v3) this.d;
                li.p5 p5Var = (li.p5) this.c;
                boolean z10 = this.b;
                boolean z11 = !z10;
                li.r5 r5Var = p5Var.v;
                Iterator it = p5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    li.s5 m10 = r5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.h6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (li.f6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        li.h6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            li.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            li.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        li.h6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (li.f6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        li.h6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                li.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            li.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        li.h6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                r5Var.invalidate();
                li.b3 b3Var = p5Var.E;
                if (b3Var != null && p5Var.a != null) {
                    b3Var.a();
                }
                v3Var.S2();
                return;
            case 9:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                li.u3 u3Var = (li.u3) this.c;
                u3Var.f.u3(true);
                li.j4.k(r2Var, this.b, new li.g4(u3Var, 2));
                return;
            case 10:
                ((CameraController) this.d).lambda$initCamera$4(this.b, (Runnable) this.c);
                return;
            case 11:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$52((ArrayList) this.c, this.b);
                return;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.c6) {
                    org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) view;
                    if (c6Var.a) {
                        c6Var.a = false;
                        c6Var.invalidate();
                    }
                }
                if (this.b) {
                    e2Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.d;
                ArrayList arrayList10 = (ArrayList) this.c;
                int i15 = t6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.y6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.y6.I.k(false))) {
                    org.telegram.ui.ActionBar.y6.r1(true);
                }
                if (!this.b) {
                    HashMap hashMap = t6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i15).removeObserver(t6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i15).removeObserver(t6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (t6Var.b != null) {
                    NotificationCenter.getInstance(i15).addObserver(t6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i15).addObserver(t6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = t6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i15).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.s6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((wn) this.d).Ic((MessageObject) this.c, this.b);
                return;
            case 15:
                hn hnVar = (hn) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                wn wnVar = hnVar.a;
                wnVar.ac.b();
                boolean z14 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                boolean z15 = this.b;
                if (!z14) {
                    org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString(z15 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (wnVar.getParentActivity() == null || wnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z15) {
                    dz0 dz0Var = new dz0(wnVar.getParentActivity(), wnVar, tL_inputStickerSetID, null, wnVar.Y, wnVar.ua);
                    dz0Var.setCalcMandatoryInsets(wnVar.I9());
                    wnVar.showDialog(dz0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    aw awVar = new aw(wnVar, wnVar.getParentActivity(), wnVar.ua, arrayList11);
                    awVar.setCalcMandatoryInsets(wnVar.I9());
                    wnVar.showDialog(awVar);
                    return;
                }
            case 16:
                zo zoVar = (zo) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                bp bpVar = zoVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bpVar.getContext(), 0, bpVar.n2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new z3(zoVar, tL_username, this.b, 5));
                alertDialog$Builder.p();
                return;
            case 17:
                lp lpVar = (lp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                pp ppVar = lpVar.x.d;
                ppVar.O = false;
                if (this.b || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                ppVar.P = true;
                ppVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new jp(lpVar, 1), new kp(0, lpVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) this.d, this.b, (String) this.c);
                return;
            case 19:
                ti tiVar = (ti) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!tiVar.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    tiVar.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (this.b) {
                        AndroidUtilities.runOnUIThread(new kp(16, tiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((n10) this.d).S((k10) this.c, !this.b);
                return;
            case 21:
                ua0 ua0Var = (ua0) this.d;
                ua0Var.getMessagesController().getStoriesController().r0(ua0Var.e, (ArrayList) this.c, this.b, null);
                return;
            case 22:
                me0 me0Var = (me0) this.d;
                vc0 vc0Var = (vc0) this.c;
                if (this.b) {
                    vc0Var.w(true);
                } else {
                    vc0Var.x();
                }
                me0Var.b(vc0Var);
                return;
            case 23:
                u uVar = (u) this.d;
                vc0 vc0Var2 = (vc0) this.c;
                if (this.b) {
                    vc0Var2.w(true);
                } else {
                    vc0Var2.x();
                }
                ((me0) uVar.b).b(vc0Var2);
                return;
            case 24:
                xh0 xh0Var = (xh0) this.d;
                s71 s71Var = xh0Var.c;
                ArrayList arrayList12 = (ArrayList) this.c;
                if (this.b) {
                    arrayList12 = xh0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (s71Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < s71Var.getChildCount(); i16++) {
                        if (!(s71Var.getChildAt(i16) instanceof c10)) {
                        }
                    }
                    return;
                }
                xh0Var.a(false);
                return;
            case 25:
                Runnable runnable = (Runnable) this.d;
                l80 l80Var = (l80) this.c;
                runnable.run();
                if (this.b) {
                    l80Var.u();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                if (this.b) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.C0 = null;
                return;
            case 27:
                ((ux) this.d).b.presentFragment(this.b ? new FiltersSetupActivity() : new q00((MessagesController.DialogFilter) this.c, null));
                return;
            case 28:
                ux uxVar = (ux) this.d;
                ArrayList arrayList13 = (ArrayList) this.c;
                ey eyVar = uxVar.b;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    int size = arrayList13.size();
                    boolean z16 = this.b;
                    if (i17 >= size) {
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(eyVar.getParentActivity(), null);
                        ybVar.b.setText(z16 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i18, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i18, new Object[0]));
                        if (z16) {
                            ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                        } else {
                            ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                        }
                        org.telegram.ui.Components.qc.g(eyVar, ybVar, 1500).j();
                        return;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i17);
                    if (dialog != null) {
                        eyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z16 ? 3 : 4);
                        i18++;
                    }
                    i17++;
                }
            default:
                ((oz) this.d).a0((k10) this.c, !this.b);
                return;
        }
    }

    public /* synthetic */ u7(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
