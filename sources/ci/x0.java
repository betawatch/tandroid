package ci;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c00;
import org.telegram.ui.f10;
import org.telegram.ui.fp;
import org.telegram.ui.hp;
import org.telegram.ui.ln;
import org.telegram.ui.pp;
import org.telegram.ui.q80;
import org.telegram.ui.qp;
import org.telegram.ui.sg;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.up;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x0(hg.z zVar, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = zVar;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:317:0x0610, code lost:
    
        if (r7 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0714, code lost:
    
        if (r7 == null) goto L330;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0412  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        int i10;
        long cameraFlipElapsedMs;
        ArrayList arrayList;
        int i11;
        int i12 = this.a;
        int i13 = 10;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                                z0 z0Var = new z0(byteBufferValue);
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
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i15)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new ai.ca(14, callback, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                u3 u3Var = (u3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = u3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    u3Var.h = messages_botresults.next_offset;
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
                    u3Var.d = false;
                    u3Var.F(false);
                    u3Var.l();
                    return;
                }
                return;
            case 2:
                hg.z zVar = (hg.z) obj;
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
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new t1(zVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                return;
            case 3:
                ((hi.b) obj2).Q((Utilities.Callback) obj, z10, false);
                return;
            case 4:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 5:
                ii.x3 x3Var = (ii.x3) obj2;
                ii.q5 q5Var = (ii.q5) obj;
                boolean z11 = !z10;
                ii.s5 s5Var = q5Var.v;
                Iterator it = q5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ii.t5 m10 = s5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.j6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ii.h6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ii.j6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ii.h6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ii.h6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ii.j6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ii.h6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ii.j6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ii.h6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ii.h6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ii.j6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                s5Var.invalidate();
                ii.d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.a != null) {
                    d3Var.a();
                }
                x3Var.N2();
                return;
            case 6:
                ii.w3 w3Var = (ii.w3) obj;
                w3Var.f.p3(true);
                ii.l4.k((org.telegram.ui.ActionBar.n2) obj2, z10, new ii.i4(w3Var, 2));
                return;
            case 7:
                ki.h hVar = (ki.h) obj;
                ki.t0 t0Var = (ki.t0) ((xa.d) obj2).b;
                int i19 = t0Var.W;
                if (i19 == 7 || i19 == 8 || i19 == 9 || i19 == 10) {
                    return;
                }
                ki.m0 m0Var = hVar.a;
                ki.o0 o0Var = hVar.c;
                ki.n0 n0Var = hVar.b;
                t0Var.q = m0Var;
                t0Var.r = n0Var;
                t0Var.s = o0Var;
                t0Var.t = hVar.f;
                if (m0Var != ki.m0.a) {
                    if (hVar.g) {
                        i10 = 2;
                        t0Var.X = i10;
                        t0Var.n();
                        ki.n nVar = t0Var.m;
                        StringBuilder sb3 = new StringBuilder("camera configured: facing=");
                        sb3.append(m0Var);
                        sb3.append(", mode=");
                        sb3.append(n0Var);
                        sb3.append(", preview=");
                        sb3.append(hVar.d);
                        sb3.append(", recording=");
                        sb3.append(hVar.e);
                        sb3.append(", fps=");
                        sb3.append(o0Var.a);
                        sb3.append(", maxZoom=");
                        sb3.append(t0Var.t);
                        sb3.append(", flash=");
                        int i20 = t0Var.X;
                        sb3.append(i20 == 1 ? i20 != 2 ? i20 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb3.append(", switch=");
                        sb3.append(z10);
                        nVar.b(sb3.toString());
                        if (z10) {
                        }
                        t0Var.w = false;
                        s60 s60Var = (s60) t0Var.d.b;
                        s60Var.n0 = true;
                        StringBuilder sb4 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb4.append(m0Var);
                        sb4.append(", elapsedMs=");
                        cameraFlipElapsedMs = s60Var.getCameraFlipElapsedMs();
                        sb4.append(cameraFlipElapsedMs);
                        FileLog.d(sb4.toString());
                        s60Var.s();
                        t0Var.o();
                        return;
                    }
                    i10 = 1;
                    t0Var.X = i10;
                    t0Var.n();
                    ki.n nVar2 = t0Var.m;
                    StringBuilder sb32 = new StringBuilder("camera configured: facing=");
                    sb32.append(m0Var);
                    sb32.append(", mode=");
                    sb32.append(n0Var);
                    sb32.append(", preview=");
                    sb32.append(hVar.d);
                    sb32.append(", recording=");
                    sb32.append(hVar.e);
                    sb32.append(", fps=");
                    sb32.append(o0Var.a);
                    sb32.append(", maxZoom=");
                    sb32.append(t0Var.t);
                    sb32.append(", flash=");
                    int i202 = t0Var.X;
                    sb32.append(i202 == 1 ? i202 != 2 ? i202 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb32.append(", switch=");
                    sb32.append(z10);
                    nVar2.b(sb32.toString());
                    if (z10) {
                    }
                    t0Var.w = false;
                    s60 s60Var2 = (s60) t0Var.d.b;
                    s60Var2.n0 = true;
                    StringBuilder sb42 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb42.append(m0Var);
                    sb42.append(", elapsedMs=");
                    cameraFlipElapsedMs = s60Var2.getCameraFlipElapsedMs();
                    sb42.append(cameraFlipElapsedMs);
                    FileLog.d(sb42.toString());
                    s60Var2.s();
                    t0Var.o();
                    return;
                }
                if (t0Var.f != null) {
                    i10 = 3;
                    t0Var.X = i10;
                    t0Var.n();
                    ki.n nVar22 = t0Var.m;
                    StringBuilder sb322 = new StringBuilder("camera configured: facing=");
                    sb322.append(m0Var);
                    sb322.append(", mode=");
                    sb322.append(n0Var);
                    sb322.append(", preview=");
                    sb322.append(hVar.d);
                    sb322.append(", recording=");
                    sb322.append(hVar.e);
                    sb322.append(", fps=");
                    sb322.append(o0Var.a);
                    sb322.append(", maxZoom=");
                    sb322.append(t0Var.t);
                    sb322.append(", flash=");
                    int i2022 = t0Var.X;
                    sb322.append(i2022 == 1 ? i2022 != 2 ? i2022 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb322.append(", switch=");
                    sb322.append(z10);
                    nVar22.b(sb322.toString());
                    if (!z10 || t0Var.w) {
                        t0Var.w = false;
                        s60 s60Var22 = (s60) t0Var.d.b;
                        s60Var22.n0 = true;
                        StringBuilder sb422 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb422.append(m0Var);
                        sb422.append(", elapsedMs=");
                        cameraFlipElapsedMs = s60Var22.getCameraFlipElapsedMs();
                        sb422.append(cameraFlipElapsedMs);
                        FileLog.d(sb422.toString());
                        s60Var22.s();
                        t0Var.o();
                        return;
                    }
                    return;
                }
                i10 = 1;
                t0Var.X = i10;
                t0Var.n();
                ki.n nVar222 = t0Var.m;
                StringBuilder sb3222 = new StringBuilder("camera configured: facing=");
                sb3222.append(m0Var);
                sb3222.append(", mode=");
                sb3222.append(n0Var);
                sb3222.append(", preview=");
                sb3222.append(hVar.d);
                sb3222.append(", recording=");
                sb3222.append(hVar.e);
                sb3222.append(", fps=");
                sb3222.append(o0Var.a);
                sb3222.append(", maxZoom=");
                sb3222.append(t0Var.t);
                sb3222.append(", flash=");
                int i20222 = t0Var.X;
                sb3222.append(i20222 == 1 ? i20222 != 2 ? i20222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb3222.append(", switch=");
                sb3222.append(z10);
                nVar222.b(sb3222.toString());
                if (z10) {
                }
                t0Var.w = false;
                s60 s60Var222 = (s60) t0Var.d.b;
                s60Var222.n0 = true;
                StringBuilder sb4222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb4222.append(m0Var);
                sb4222.append(", elapsedMs=");
                cameraFlipElapsedMs = s60Var222.getCameraFlipElapsedMs();
                sb4222.append(cameraFlipElapsedMs);
                FileLog.d(sb4222.toString());
                s60Var222.s();
                t0Var.o();
                return;
            case 8:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 9:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.k5) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                    if (k5Var.a) {
                        k5Var.a = false;
                        k5Var.invalidate();
                    }
                }
                if (z10) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i21 = d6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.i6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.i6.I.k(false))) {
                    org.telegram.ui.ActionBar.i6.p1(true);
                }
                if (!z10) {
                    HashMap hashMap = d6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i21).removeObserver(d6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i21).removeObserver(d6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (d6Var.b != null) {
                    NotificationCenter.getInstance(i21).addObserver(d6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i21).addObserver(d6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = d6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i21).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.c6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 12:
                ((zn) obj2).vc((MessageObject) obj, z10);
                return;
            case 13:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (g6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.g6 k10 = h6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, Integer.valueOf(g6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.i6.k0(h6Var, k10, true);
                    return;
                }
                return;
            case 14:
                TLObject tLObject2 = (TLObject) obj;
                zn znVar = ((ln) obj2).a;
                znVar.Ab.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.ad.a0(znVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet, false);
                if (znVar.getParentActivity() == null || znVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    xy0 xy0Var = new xy0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.Y, znVar.ea);
                    xy0Var.setCalcMandatoryInsets(znVar.C9());
                    znVar.showDialog(xy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    iw iwVar = new iw(znVar, znVar.getParentActivity(), znVar.ea, arrayList11);
                    iwVar.setCalcMandatoryInsets(znVar.C9());
                    znVar.showDialog(iwVar);
                    return;
                }
            case 15:
                fp fpVar = (fp) obj2;
                hp hpVar = fpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getContext(), 0, hpVar.n2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string;
                b2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(fpVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.o();
                return;
            case 16:
                qp qpVar = (qp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                up upVar = qpVar.x.d;
                upVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                upVar.P = true;
                upVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new pp(qpVar, i14), new sg(24, qpVar, chat));
                return;
            case 17:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 18:
                yi yiVar = (yi) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!yiVar.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    yiVar.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea(i13, yiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((s10) obj2).S((p10) obj, !z10);
                return;
            case 20:
                db0 db0Var = (db0) obj2;
                db0Var.getMessagesController().getStoriesController().o0(db0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 21:
                te0 te0Var = (te0) obj2;
                cd0 cd0Var = (cd0) obj;
                if (z10) {
                    cd0Var.x(true);
                } else {
                    cd0Var.y();
                }
                te0Var.b(cd0Var);
                return;
            case 22:
                h2 h2Var = (h2) obj2;
                cd0 cd0Var2 = (cd0) obj;
                if (z10) {
                    cd0Var2.x(true);
                } else {
                    cd0Var2.y();
                }
                ((te0) h2Var.b).b(cd0Var2);
                return;
            case 23:
                di0 di0Var = (di0) obj2;
                k71 k71Var = di0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = di0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (k71Var.canScrollVertically(1)) {
                    for (int i22 = 0; i22 < k71Var.getChildCount(); i22++) {
                        if (!(k71Var.getChildAt(i22) instanceof j10)) {
                        }
                    }
                    return;
                }
                di0Var.a(false);
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
                ((sw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new f10((MessagesController.DialogFilter) obj, null));
                return;
            case 26:
                ArrayList arrayList13 = (ArrayList) obj;
                ty tyVar = ((sw) obj2).b;
                int i23 = 0;
                for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i24);
                    if (dialog != null) {
                        tyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i23++;
                    }
                }
                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(tyVar.getParentActivity(), null);
                bcVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i23, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i23, new Object[0]));
                if (z10) {
                    bcVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    bcVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.tc.g(tyVar, bcVar, 1500).j();
                return;
            case 27:
                ((c00) obj2).Z((p10) obj, !z10);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q80(languageSelectActivity, 1), 10L);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.n2) obj, z10, false);
                return;
        }
    }

    public /* synthetic */ x0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ x0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
