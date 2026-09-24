package ci;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.wi;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b10;
import org.telegram.ui.cp;
import org.telegram.ui.dh;
import org.telegram.ui.ep;
import org.telegram.ui.in;
import org.telegram.ui.l80;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.pw;
import org.telegram.ui.qy;
import org.telegram.ui.rp;
import org.telegram.ui.wn;
import org.telegram.ui.yz;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y0(hg.a0 a0Var, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = a0Var;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x05f4, code lost:
    
        if (r6 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06f6, code lost:
    
        if (r6 == null) goto L324;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03fc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 1;
        boolean z10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
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
                    sb2.append(z10 ? "2" : "0 OR type = 1");
                    sb2.append(" ORDER BY date DESC");
                    sQLiteCursor = database.queryFinalized(sb2.toString(), new Object[0]);
                    while (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(0);
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            try {
                                a1 a1Var = new a1(byteBufferValue);
                                a1Var.a = longValue;
                                arrayList2.add(a1Var);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                arrayList3.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList3.size() > 0) {
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i15)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new ai.ba(14, callback, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                v3 v3Var = (v3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = v3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    v3Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i16 = 0; i16 < messages_botresults.results.size(); i16++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i16);
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
                    v3Var.d = false;
                    v3Var.F(false);
                    v3Var.l();
                    return;
                }
                return;
            case 2:
                hg.a0 a0Var = (hg.a0) obj;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                try {
                    try {
                        sQLiteCursor = messagesStorage2.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor.dispose();
                        ArrayList<Long> arrayList8 = new ArrayList<>();
                        ArrayList arrayList9 = new ArrayList();
                        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i17);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i18 = 0; i18 < tL_businessChatLink.entities.size(); i18++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i18);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new u1(a0Var, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                ((hi.b) obj2).P((Utilities.Callback) obj, z10, false);
                return;
            case 4:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 5:
                ii.x3 x3Var = (ii.x3) obj2;
                ii.p5 p5Var = (ii.p5) obj;
                boolean z11 = !z10;
                ii.r5 r5Var = p5Var.v;
                Iterator it = p5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ii.s5 m10 = r5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.i6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ii.g6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ii.i6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ii.g6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ii.g6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ii.i6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ii.g6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ii.i6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ii.g6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ii.g6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ii.i6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                r5Var.invalidate();
                ii.d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.a != null) {
                    d3Var.a();
                }
                x3Var.M2();
                return;
            case 6:
                ii.w3 w3Var = (ii.w3) obj;
                w3Var.f.o3(true);
                ii.k4.k((org.telegram.ui.ActionBar.m2) obj2, z10, new ii.h4(w3Var, i13));
                return;
            case 7:
                ki.g gVar = (ki.g) obj;
                ki.k0 k0Var = gVar.a;
                ki.r0 r0Var = (ki.r0) ((k2.u) obj2).b;
                int i19 = r0Var.V;
                if (i19 == 7 || i19 == 8 || i19 == 9 || i19 == 10) {
                    return;
                }
                ki.m0 m0Var = gVar.c;
                ki.l0 l0Var = gVar.b;
                r0Var.p = k0Var;
                r0Var.q = l0Var;
                r0Var.r = m0Var;
                r0Var.s = gVar.f;
                if (k0Var != ki.k0.a) {
                    if (gVar.g) {
                        i10 = 2;
                        r0Var.W = i10;
                        r0Var.m();
                        ki.l lVar = r0Var.l;
                        StringBuilder sb3 = new StringBuilder("camera configured: facing=");
                        sb3.append(k0Var);
                        sb3.append(", mode=");
                        sb3.append(l0Var);
                        sb3.append(", preview=");
                        sb3.append(gVar.d);
                        sb3.append(", recording=");
                        sb3.append(gVar.e);
                        sb3.append(", fps=");
                        sb3.append(m0Var.a);
                        sb3.append(", maxZoom=");
                        sb3.append(r0Var.s);
                        sb3.append(", flash=");
                        int i20 = r0Var.W;
                        sb3.append(i20 == 1 ? i20 != 2 ? i20 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                        sb3.append(", switch=");
                        sb3.append(z10);
                        lVar.b(sb3.toString());
                        if (z10) {
                        }
                        r0Var.v = false;
                        FrameLayout frameLayout = ((b60) r0Var.c.a).x;
                        frameLayout.animate().cancel();
                        frameLayout.setRotationY(-90.0f);
                        frameLayout.animate().rotationY(0.0f).setDuration(140L).start();
                        r0Var.n();
                        return;
                    }
                    i10 = 1;
                    r0Var.W = i10;
                    r0Var.m();
                    ki.l lVar2 = r0Var.l;
                    StringBuilder sb32 = new StringBuilder("camera configured: facing=");
                    sb32.append(k0Var);
                    sb32.append(", mode=");
                    sb32.append(l0Var);
                    sb32.append(", preview=");
                    sb32.append(gVar.d);
                    sb32.append(", recording=");
                    sb32.append(gVar.e);
                    sb32.append(", fps=");
                    sb32.append(m0Var.a);
                    sb32.append(", maxZoom=");
                    sb32.append(r0Var.s);
                    sb32.append(", flash=");
                    int i202 = r0Var.W;
                    sb32.append(i202 == 1 ? i202 != 2 ? i202 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb32.append(", switch=");
                    sb32.append(z10);
                    lVar2.b(sb32.toString());
                    if (z10) {
                    }
                    r0Var.v = false;
                    FrameLayout frameLayout2 = ((b60) r0Var.c.a).x;
                    frameLayout2.animate().cancel();
                    frameLayout2.setRotationY(-90.0f);
                    frameLayout2.animate().rotationY(0.0f).setDuration(140L).start();
                    r0Var.n();
                    return;
                }
                if (r0Var.e != null) {
                    i10 = 3;
                    r0Var.W = i10;
                    r0Var.m();
                    ki.l lVar22 = r0Var.l;
                    StringBuilder sb322 = new StringBuilder("camera configured: facing=");
                    sb322.append(k0Var);
                    sb322.append(", mode=");
                    sb322.append(l0Var);
                    sb322.append(", preview=");
                    sb322.append(gVar.d);
                    sb322.append(", recording=");
                    sb322.append(gVar.e);
                    sb322.append(", fps=");
                    sb322.append(m0Var.a);
                    sb322.append(", maxZoom=");
                    sb322.append(r0Var.s);
                    sb322.append(", flash=");
                    int i2022 = r0Var.W;
                    sb322.append(i2022 == 1 ? i2022 != 2 ? i2022 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb322.append(", switch=");
                    sb322.append(z10);
                    lVar22.b(sb322.toString());
                    if (!z10 || r0Var.v) {
                        r0Var.v = false;
                        FrameLayout frameLayout22 = ((b60) r0Var.c.a).x;
                        frameLayout22.animate().cancel();
                        frameLayout22.setRotationY(-90.0f);
                        frameLayout22.animate().rotationY(0.0f).setDuration(140L).start();
                        r0Var.n();
                        return;
                    }
                    return;
                }
                i10 = 1;
                r0Var.W = i10;
                r0Var.m();
                ki.l lVar222 = r0Var.l;
                StringBuilder sb3222 = new StringBuilder("camera configured: facing=");
                sb3222.append(k0Var);
                sb3222.append(", mode=");
                sb3222.append(l0Var);
                sb3222.append(", preview=");
                sb3222.append(gVar.d);
                sb3222.append(", recording=");
                sb3222.append(gVar.e);
                sb3222.append(", fps=");
                sb3222.append(m0Var.a);
                sb3222.append(", maxZoom=");
                sb3222.append(r0Var.s);
                sb3222.append(", flash=");
                int i20222 = r0Var.W;
                sb3222.append(i20222 == 1 ? i20222 != 2 ? i20222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                sb3222.append(", switch=");
                sb3222.append(z10);
                lVar222.b(sb3222.toString());
                if (z10) {
                }
                r0Var.v = false;
                FrameLayout frameLayout222 = ((b60) r0Var.c.a).x;
                frameLayout222.animate().cancel();
                frameLayout222.setRotationY(-90.0f);
                frameLayout222.animate().rotationY(0.0f).setDuration(140L).start();
                r0Var.n();
                return;
            case 8:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 9:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.a) {
                        i5Var.a = false;
                        i5Var.invalidate();
                    }
                }
                if (z10) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i21 = c6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.h6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.h6.I.k(false))) {
                    org.telegram.ui.ActionBar.h6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = c6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i21).removeObserver(c6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i21).removeObserver(c6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (c6Var.b != null) {
                    NotificationCenter.getInstance(i21).addObserver(c6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i21).addObserver(c6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = c6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i21).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.b6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 12:
                ((wn) obj2).rc((MessageObject) obj, z10);
                return;
            case 13:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (f6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.f6 k10 = g6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, Integer.valueOf(f6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.h6.j0(g6Var, k10, true);
                    return;
                }
                return;
            case 14:
                TLObject tLObject2 = (TLObject) obj;
                wn wnVar = ((in) obj2).a;
                wnVar.zb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet, false);
                if (wnVar.getParentActivity() == null || wnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    fy0 fy0Var = new fy0(wnVar.getParentActivity(), wnVar, tL_inputStickerSetID, null, wnVar.Y, wnVar.ea);
                    fy0Var.setCalcMandatoryInsets(wnVar.x9());
                    wnVar.showDialog(fy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    uv uvVar = new uv(wnVar, wnVar.getParentActivity(), wnVar.ea, arrayList11);
                    uvVar.setCalcMandatoryInsets(wnVar.x9());
                    wnVar.showDialog(uvVar);
                    return;
                }
            case 15:
                cp cpVar = (cp) obj2;
                ep epVar = cpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getContext(), 0, epVar.p2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                a2Var2.R = string;
                a2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(cpVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.o();
                return;
            case 16:
                np npVar = (np) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                rp rpVar = npVar.x.d;
                rpVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                rpVar.P = true;
                rpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new mp(npVar, i14), new dh(22, npVar, chat));
                return;
            case 17:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((wi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i14, editTextBoldCursor));
                    return;
                }
                return;
            case 19:
                ((d10) obj2).R((a10) obj, !z10);
                return;
            case 20:
                na0 na0Var = (na0) obj2;
                na0Var.getMessagesController().getStoriesController().o0(na0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 21:
                ce0 ce0Var = (ce0) obj2;
                mc0 mc0Var = (mc0) obj;
                if (z10) {
                    mc0Var.x(true);
                } else {
                    mc0Var.y();
                }
                ce0Var.b(mc0Var);
                return;
            case 22:
                i2 i2Var = (i2) obj2;
                mc0 mc0Var2 = (mc0) obj;
                if (z10) {
                    mc0Var2.x(true);
                } else {
                    mc0Var2.y();
                }
                ((ce0) i2Var.b).b(mc0Var2);
                return;
            case 23:
                jh0 jh0Var = (jh0) obj2;
                r61 r61Var = jh0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = jh0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (r61Var.canScrollVertically(1)) {
                    for (int i22 = 0; i22 < r61Var.getChildCount(); i22++) {
                        if (!(r61Var.getChildAt(i22) instanceof u00)) {
                        }
                    }
                    return;
                }
                jh0Var.a(false);
                return;
            case 24:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                if (z10) {
                    uVar.x.removeView(uVar2);
                }
                uVar2.setVisibility(8);
                uVar.C0 = null;
                return;
            case 25:
                ((pw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new b10((MessagesController.DialogFilter) obj, null));
                return;
            case 26:
                ArrayList arrayList13 = (ArrayList) obj;
                qy qyVar = ((pw) obj2).b;
                int i23 = 0;
                for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i24);
                    if (dialog != null) {
                        qyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i23++;
                    }
                }
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(qyVar.getParentActivity(), null);
                ybVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i23, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i23, new Object[0]));
                if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.qc.g(qyVar, ybVar, 1500).j();
                return;
            case 27:
                ((yz) obj2).Z((a10) obj, !z10);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new l80(languageSelectActivity, i14), 10L);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.m2) obj, z10, false);
                return;
        }
    }

    public /* synthetic */ y0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ y0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
