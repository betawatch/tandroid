package ci;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
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
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z00;
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
import org.telegram.ui.qh;
import org.telegram.ui.qp;
import org.telegram.ui.tw;
import org.telegram.ui.up;
import org.telegram.ui.uy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y0(hg.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = yVar;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x05f9, code lost:
    
        if (r6 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06fb, code lost:
    
        if (r6 == null) goto L324;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0403  */
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
                w3 w3Var = (w3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = w3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    w3Var.h = messages_botresults.next_offset;
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
                    w3Var.d = false;
                    w3Var.F(false);
                    w3Var.l();
                    return;
                }
                return;
            case 2:
                hg.y yVar = (hg.y) obj;
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
                    AndroidUtilities.runOnUIThread(new u1(yVar, arrayList5, arrayList6, arrayList7, this.b, 2));
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
                ii.w3 w3Var2 = (ii.w3) obj2;
                ii.o5 o5Var = (ii.o5) obj;
                boolean z11 = !z10;
                ii.q5 q5Var = o5Var.v;
                Iterator it = o5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ii.r5 m10 = q5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.h6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ii.f6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ii.h6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ii.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ii.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ii.h6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ii.f6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ii.h6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ii.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ii.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ii.h6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                q5Var.invalidate();
                ii.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.a != null) {
                    c3Var.a();
                }
                w3Var2.N2();
                return;
            case 6:
                ii.v3 v3Var = (ii.v3) obj;
                v3Var.f.p3(true);
                ii.j4.k((org.telegram.ui.ActionBar.n2) obj2, z10, new ii.g4(v3Var, i13));
                return;
            case 7:
                ki.f fVar = (ki.f) obj;
                int i19 = fVar.a;
                ki.h0 h0Var = (ki.h0) ((k2.u) obj2).b;
                l.d dVar = h0Var.c;
                int i20 = h0Var.Q;
                if (i20 == 7 || i20 == 8 || i20 == 9 || i20 == 10) {
                    return;
                }
                int i21 = fVar.b;
                h0Var.S = i19;
                h0Var.T = i21;
                h0Var.n = fVar.e;
                if (i19 != 1) {
                    if (fVar.f) {
                        i10 = 2;
                        h0Var.U = i10;
                        b2.q0 q0Var = new b2.q0(h0Var.R, i10);
                        a60 a60Var = (a60) dVar.a;
                        a60Var.L = q0Var;
                        a60.l(a60Var);
                        ki.j jVar = h0Var.l;
                        StringBuilder sb3 = new StringBuilder("camera configured: facing=");
                        sb3.append(hg.k0.z(i19));
                        sb3.append(", mode=");
                        sb3.append(hg.k0.A(i21));
                        sb3.append(", preview=");
                        sb3.append(fVar.c);
                        sb3.append(", recording=");
                        sb3.append(fVar.d);
                        sb3.append(", maxZoom=");
                        sb3.append(h0Var.n);
                        sb3.append(", flash=");
                        int i22 = h0Var.U;
                        sb3.append(i22 == 1 ? i22 != 2 ? i22 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                        sb3.append(", switch=");
                        sb3.append(z10);
                        jVar.b(sb3.toString());
                        if (z10) {
                        }
                        h0Var.q = false;
                        TextureView textureView = ((a60) dVar.a).v;
                        textureView.animate().cancel();
                        textureView.setRotationY(-90.0f);
                        textureView.animate().rotationY(0.0f).setDuration(140L).start();
                        h0Var.m();
                        return;
                    }
                    i10 = 1;
                    h0Var.U = i10;
                    b2.q0 q0Var2 = new b2.q0(h0Var.R, i10);
                    a60 a60Var2 = (a60) dVar.a;
                    a60Var2.L = q0Var2;
                    a60.l(a60Var2);
                    ki.j jVar2 = h0Var.l;
                    StringBuilder sb32 = new StringBuilder("camera configured: facing=");
                    sb32.append(hg.k0.z(i19));
                    sb32.append(", mode=");
                    sb32.append(hg.k0.A(i21));
                    sb32.append(", preview=");
                    sb32.append(fVar.c);
                    sb32.append(", recording=");
                    sb32.append(fVar.d);
                    sb32.append(", maxZoom=");
                    sb32.append(h0Var.n);
                    sb32.append(", flash=");
                    int i222 = h0Var.U;
                    sb32.append(i222 == 1 ? i222 != 2 ? i222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb32.append(", switch=");
                    sb32.append(z10);
                    jVar2.b(sb32.toString());
                    if (z10) {
                    }
                    h0Var.q = false;
                    TextureView textureView2 = ((a60) dVar.a).v;
                    textureView2.animate().cancel();
                    textureView2.setRotationY(-90.0f);
                    textureView2.animate().rotationY(0.0f).setDuration(140L).start();
                    h0Var.m();
                    return;
                }
                if (h0Var.e != null) {
                    i10 = 3;
                    h0Var.U = i10;
                    b2.q0 q0Var22 = new b2.q0(h0Var.R, i10);
                    a60 a60Var22 = (a60) dVar.a;
                    a60Var22.L = q0Var22;
                    a60.l(a60Var22);
                    ki.j jVar22 = h0Var.l;
                    StringBuilder sb322 = new StringBuilder("camera configured: facing=");
                    sb322.append(hg.k0.z(i19));
                    sb322.append(", mode=");
                    sb322.append(hg.k0.A(i21));
                    sb322.append(", preview=");
                    sb322.append(fVar.c);
                    sb322.append(", recording=");
                    sb322.append(fVar.d);
                    sb322.append(", maxZoom=");
                    sb322.append(h0Var.n);
                    sb322.append(", flash=");
                    int i2222 = h0Var.U;
                    sb322.append(i2222 == 1 ? i2222 != 2 ? i2222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb322.append(", switch=");
                    sb322.append(z10);
                    jVar22.b(sb322.toString());
                    if (!z10 || h0Var.q) {
                        h0Var.q = false;
                        TextureView textureView22 = ((a60) dVar.a).v;
                        textureView22.animate().cancel();
                        textureView22.setRotationY(-90.0f);
                        textureView22.animate().rotationY(0.0f).setDuration(140L).start();
                        h0Var.m();
                        return;
                    }
                    return;
                }
                i10 = 1;
                h0Var.U = i10;
                b2.q0 q0Var222 = new b2.q0(h0Var.R, i10);
                a60 a60Var222 = (a60) dVar.a;
                a60Var222.L = q0Var222;
                a60.l(a60Var222);
                ki.j jVar222 = h0Var.l;
                StringBuilder sb3222 = new StringBuilder("camera configured: facing=");
                sb3222.append(hg.k0.z(i19));
                sb3222.append(", mode=");
                sb3222.append(hg.k0.A(i21));
                sb3222.append(", preview=");
                sb3222.append(fVar.c);
                sb3222.append(", recording=");
                sb3222.append(fVar.d);
                sb3222.append(", maxZoom=");
                sb3222.append(h0Var.n);
                sb3222.append(", flash=");
                int i22222 = h0Var.U;
                sb3222.append(i22222 == 1 ? i22222 != 2 ? i22222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                sb3222.append(", switch=");
                sb3222.append(z10);
                jVar222.b(sb3222.toString());
                if (z10) {
                }
                h0Var.q = false;
                TextureView textureView222 = ((a60) dVar.a).v;
                textureView222.animate().cancel();
                textureView222.setRotationY(-90.0f);
                textureView222.animate().rotationY(0.0f).setDuration(140L).start();
                h0Var.m();
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
                int i23 = d6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = d6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i23).removeObserver(d6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i23).removeObserver(d6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (d6Var.b != null) {
                    NotificationCenter.getInstance(i23).addObserver(d6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i23).addObserver(d6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = d6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i23).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.c6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 12:
                ((zn) obj2).rc((MessageObject) obj, z10);
                return;
            case 13:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (g6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.g6 k10 = i6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, Integer.valueOf(g6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.j6.j0(i6Var, k10, true);
                    return;
                }
                return;
            case 14:
                TLObject tLObject2 = (TLObject) obj;
                zn znVar = ((ln) obj2).a;
                znVar.zb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
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
                    hy0 hy0Var = new hy0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.Y, znVar.ea);
                    hy0Var.setCalcMandatoryInsets(znVar.x9());
                    znVar.showDialog(hy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    sv svVar = new sv(znVar, znVar.getParentActivity(), znVar.ea, arrayList11);
                    svVar.setCalcMandatoryInsets(znVar.x9());
                    znVar.showDialog(svVar);
                    return;
                }
            case 15:
                fp fpVar = (fp) obj2;
                hp hpVar = fpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getContext(), 0, hpVar.p2);
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
                upVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new pp(qpVar, i14), new qh(20, qpVar, chat));
                return;
            case 17:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((vi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i14, editTextBoldCursor));
                    return;
                }
                return;
            case 19:
                ((c10) obj2).R((z00) obj, !z10);
                return;
            case 20:
                ka0 ka0Var = (ka0) obj2;
                ka0Var.getMessagesController().getStoriesController().o0(ka0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 21:
                be0 be0Var = (be0) obj2;
                lc0 lc0Var = (lc0) obj;
                if (z10) {
                    lc0Var.x(true);
                } else {
                    lc0Var.y();
                }
                be0Var.b(lc0Var);
                return;
            case 22:
                i2 i2Var = (i2) obj2;
                lc0 lc0Var2 = (lc0) obj;
                if (z10) {
                    lc0Var2.x(true);
                } else {
                    lc0Var2.y();
                }
                ((be0) i2Var.b).b(lc0Var2);
                return;
            case 23:
                jh0 jh0Var = (jh0) obj2;
                t61 t61Var = jh0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = jh0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (t61Var.canScrollVertically(1)) {
                    for (int i24 = 0; i24 < t61Var.getChildCount(); i24++) {
                        if (!(t61Var.getChildAt(i24) instanceof t00)) {
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
                ((tw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new f10((MessagesController.DialogFilter) obj, null));
                return;
            case 26:
                ArrayList arrayList13 = (ArrayList) obj;
                uy uyVar = ((tw) obj2).b;
                int i25 = 0;
                for (int i26 = 0; i26 < arrayList13.size(); i26++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i26);
                    if (dialog != null) {
                        uyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i25++;
                    }
                }
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(uyVar.getParentActivity(), null);
                ybVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i25, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i25, new Object[0]));
                if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.qc.g(uyVar, ybVar, 1500).j();
                return;
            case 27:
                ((c00) obj2).Z((z00) obj, !z10);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q80(languageSelectActivity, i14), 10L);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.n2) obj, z10, false);
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
