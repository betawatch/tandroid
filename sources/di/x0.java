package di;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.aq;
import org.telegram.ui.fo;
import org.telegram.ui.h00;
import org.telegram.ui.kp;
import org.telegram.ui.mp;
import org.telegram.ui.qn;
import org.telegram.ui.rp;
import org.telegram.ui.u80;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.xw;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = yVar;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:331:0x06ec, code lost:
    
        if (r6 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x07f3, code lost:
    
        if (r6 == null) goto L349;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0478  */
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
        int i12 = 4;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                boolean z10 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
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
                                z0 z0Var = new z0(byteBufferValue);
                                z0Var.a = longValue;
                                arrayList2.add(z0Var);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                arrayList3.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList3.size() > 0) {
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i14)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new bi.u8(25, callback, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                u3 u3Var = (u3) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z11 = this.b;
                ArrayList arrayList4 = u3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    u3Var.h = messages_botresults.next_offset;
                    if (z11) {
                        arrayList4.clear();
                    }
                    for (int i15 = 0; i15 < messages_botresults.results.size(); i15++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i15);
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
                ig.y yVar = (ig.y) this.d;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                boolean z12 = this.b;
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
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i16);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i17 = 0; i17 < tL_businessChatLink.entities.size(); i17++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i17);
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
                    AndroidUtilities.runOnUIThread(new t1(yVar, arrayList5, arrayList6, arrayList7, z12, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                ((ii.b) this.c).Q((Utilities.Callback) this.d, this.b, false);
                return;
            case 4:
                ((Utilities.Callback2) this.c).run((Bitmap) this.d, Boolean.valueOf(this.b));
                return;
            case 5:
                ji.x3 x3Var = (ji.x3) this.c;
                ji.u5 u5Var = (ji.u5) this.d;
                boolean z13 = this.b;
                boolean z14 = !z13;
                ji.w5 w5Var = u5Var.v;
                Iterator it = u5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ji.x5 m10 = w5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.m6.h(pagetablecell));
                        Object[] objArr = spannableStringBuilder.length() > 0 && (ji.k6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ji.m6.l(pagetablecell, z14);
                        if (!z13 && spannableStringBuilder.length() > 0) {
                            ji.k6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z13 && objArr != false) {
                            ji.k6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ji.m6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        Object[] objArr2 = spannableStringBuilder2.length() > 0 && (ji.k6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ji.m6.l(m10.b, z14);
                        if (z13) {
                            if (objArr2 != false) {
                                ji.k6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ji.k6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ji.m6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                w5Var.invalidate();
                ji.d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.a != null) {
                    d3Var.a();
                }
                x3Var.N2();
                return;
            case 6:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                ji.w3 w3Var = (ji.w3) this.d;
                boolean z15 = this.b;
                w3Var.f.p3(true);
                ji.l4.k(m2Var, z15, new ji.i4(w3Var, 2));
                return;
            case 7:
                li.u uVar = (li.u) this.c;
                boolean z16 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (uVar.f) {
                    uVar.F = z16;
                    Size size = z16 ? uVar.c : uVar.b;
                    uVar.a = size;
                    int i18 = z16 ? uVar.l : uVar.k;
                    uVar.j = i18;
                    uVar.m = z16 ? uVar.o : uVar.n;
                    li.e0 e0Var = uVar.N;
                    if (e0Var != null) {
                        e0Var.c = size;
                        e0Var.d = i18;
                        e0Var.q = li.e0.j(size, i18, false);
                        e0Var.r = li.e0.j(size, i18, true);
                        e0Var.A = false;
                        e0Var.z = 0L;
                    }
                    uVar.Q = -1L;
                    uVar.u0 = runnable;
                    uVar.i.b("GL dual input selected: input=" + (z16 ? 1 : 0));
                    return;
                }
                return;
            case 8:
                ji.d4 d4Var = (ji.d4) this.c;
                li.i iVar = (li.i) this.d;
                boolean z17 = this.b;
                li.u0 u0Var = (li.u0) d4Var.b;
                int i19 = u0Var.W;
                if (i19 == 7 || i19 == 8 || i19 == 9 || i19 == 10) {
                    return;
                }
                li.n0 n0Var = iVar.a;
                li.p0 p0Var = iVar.c;
                li.o0 o0Var = iVar.b;
                u0Var.q = n0Var;
                u0Var.r = o0Var;
                u0Var.s = p0Var;
                u0Var.t = iVar.f;
                if (n0Var != li.n0.a) {
                    if (iVar.g) {
                        i10 = 2;
                        u0Var.X = i10;
                        u0Var.n();
                        li.p pVar = u0Var.m;
                        StringBuilder sb3 = new StringBuilder("camera configured: facing=");
                        sb3.append(n0Var);
                        sb3.append(", mode=");
                        sb3.append(o0Var);
                        sb3.append(", preview=");
                        sb3.append(iVar.d);
                        sb3.append(", recording=");
                        sb3.append(iVar.e);
                        sb3.append(", fps=");
                        sb3.append(p0Var.a);
                        sb3.append(", maxZoom=");
                        sb3.append(u0Var.t);
                        sb3.append(", flash=");
                        int i20 = u0Var.X;
                        sb3.append(i20 == 1 ? i20 != 2 ? i20 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                        sb3.append(", switch=");
                        sb3.append(z17);
                        pVar.b(sb3.toString());
                        if (z17) {
                        }
                        u0Var.w = false;
                        o60 o60Var = (o60) u0Var.d.b;
                        o60Var.o0 = true;
                        StringBuilder sb4 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb4.append(n0Var);
                        sb4.append(", elapsedMs=");
                        cameraFlipElapsedMs = o60Var.getCameraFlipElapsedMs();
                        sb4.append(cameraFlipElapsedMs);
                        FileLog.d(sb4.toString());
                        o60.l(o60Var);
                        u0Var.o();
                        return;
                    }
                    i10 = 1;
                    u0Var.X = i10;
                    u0Var.n();
                    li.p pVar2 = u0Var.m;
                    StringBuilder sb32 = new StringBuilder("camera configured: facing=");
                    sb32.append(n0Var);
                    sb32.append(", mode=");
                    sb32.append(o0Var);
                    sb32.append(", preview=");
                    sb32.append(iVar.d);
                    sb32.append(", recording=");
                    sb32.append(iVar.e);
                    sb32.append(", fps=");
                    sb32.append(p0Var.a);
                    sb32.append(", maxZoom=");
                    sb32.append(u0Var.t);
                    sb32.append(", flash=");
                    int i202 = u0Var.X;
                    sb32.append(i202 == 1 ? i202 != 2 ? i202 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb32.append(", switch=");
                    sb32.append(z17);
                    pVar2.b(sb32.toString());
                    if (z17) {
                    }
                    u0Var.w = false;
                    o60 o60Var2 = (o60) u0Var.d.b;
                    o60Var2.o0 = true;
                    StringBuilder sb42 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb42.append(n0Var);
                    sb42.append(", elapsedMs=");
                    cameraFlipElapsedMs = o60Var2.getCameraFlipElapsedMs();
                    sb42.append(cameraFlipElapsedMs);
                    FileLog.d(sb42.toString());
                    o60.l(o60Var2);
                    u0Var.o();
                    return;
                }
                if (u0Var.f != null) {
                    i10 = 3;
                    u0Var.X = i10;
                    u0Var.n();
                    li.p pVar22 = u0Var.m;
                    StringBuilder sb322 = new StringBuilder("camera configured: facing=");
                    sb322.append(n0Var);
                    sb322.append(", mode=");
                    sb322.append(o0Var);
                    sb322.append(", preview=");
                    sb322.append(iVar.d);
                    sb322.append(", recording=");
                    sb322.append(iVar.e);
                    sb322.append(", fps=");
                    sb322.append(p0Var.a);
                    sb322.append(", maxZoom=");
                    sb322.append(u0Var.t);
                    sb322.append(", flash=");
                    int i2022 = u0Var.X;
                    sb322.append(i2022 == 1 ? i2022 != 2 ? i2022 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb322.append(", switch=");
                    sb322.append(z17);
                    pVar22.b(sb322.toString());
                    if (!z17 || u0Var.w) {
                        u0Var.w = false;
                        o60 o60Var22 = (o60) u0Var.d.b;
                        o60Var22.o0 = true;
                        StringBuilder sb422 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb422.append(n0Var);
                        sb422.append(", elapsedMs=");
                        cameraFlipElapsedMs = o60Var22.getCameraFlipElapsedMs();
                        sb422.append(cameraFlipElapsedMs);
                        FileLog.d(sb422.toString());
                        o60.l(o60Var22);
                        u0Var.o();
                        return;
                    }
                    return;
                }
                i10 = 1;
                u0Var.X = i10;
                u0Var.n();
                li.p pVar222 = u0Var.m;
                StringBuilder sb3222 = new StringBuilder("camera configured: facing=");
                sb3222.append(n0Var);
                sb3222.append(", mode=");
                sb3222.append(o0Var);
                sb3222.append(", preview=");
                sb3222.append(iVar.d);
                sb3222.append(", recording=");
                sb3222.append(iVar.e);
                sb3222.append(", fps=");
                sb3222.append(p0Var.a);
                sb3222.append(", maxZoom=");
                sb3222.append(u0Var.t);
                sb3222.append(", flash=");
                int i20222 = u0Var.X;
                sb3222.append(i20222 == 1 ? i20222 != 2 ? i20222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                sb3222.append(", switch=");
                sb3222.append(z17);
                pVar222.b(sb3222.toString());
                if (z17) {
                }
                u0Var.w = false;
                o60 o60Var222 = (o60) u0Var.d.b;
                o60Var222.o0 = true;
                StringBuilder sb4222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb4222.append(n0Var);
                sb4222.append(", elapsedMs=");
                cameraFlipElapsedMs = o60Var222.getCameraFlipElapsedMs();
                sb4222.append(cameraFlipElapsedMs);
                FileLog.d(sb4222.toString());
                o60.l(o60Var222);
                u0Var.o();
                return;
            case 9:
                ((CameraController) this.c).lambda$initCamera$4(this.b, (Runnable) this.d);
                return;
            case 10:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$52((ArrayList) this.d, this.b);
                return;
            case 11:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                View view = (View) this.d;
                boolean z18 = this.b;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.a) {
                        i5Var.a = false;
                        i5Var.invalidate();
                    }
                }
                if (z18) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                boolean z19 = this.b;
                int i21 = b6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.g6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.g6.I.k(false))) {
                    org.telegram.ui.ActionBar.g6.p1(true);
                }
                if (!z19) {
                    HashMap hashMap = b6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i21).removeObserver(b6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i21).removeObserver(b6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (b6Var.b != null) {
                    NotificationCenter.getInstance(i21).addObserver(b6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i21).addObserver(b6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = b6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i21).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.a6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 13:
                ((fo) this.c).vc((MessageObject) this.d, this.b);
                return;
            case 14:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                boolean z20 = this.b;
                if (e6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.e6 k10 = f6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, Integer.valueOf(e6Var.a));
                if (z20) {
                    org.telegram.ui.ActionBar.g6.k0(f6Var, k10, true);
                    return;
                }
                return;
            case 15:
                qn qnVar = (qn) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                boolean z21 = this.b;
                fo foVar = qnVar.a;
                foVar.Ab.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString(z21 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet, false);
                if (foVar.getParentActivity() == null || foVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z21) {
                    ty0 ty0Var = new ty0(foVar.getParentActivity(), foVar, tL_inputStickerSetID, null, foVar.Y, foVar.ea);
                    ty0Var.setCalcMandatoryInsets(foVar.C9());
                    foVar.showDialog(ty0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    ew ewVar = new ew(foVar, foVar.getParentActivity(), foVar.ea, arrayList11);
                    ewVar.setCalcMandatoryInsets(foVar.C9());
                    foVar.showDialog(ewVar);
                    return;
                }
            case 16:
                kp kpVar = (kp) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z22 = this.b;
                mp mpVar = kpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getContext(), 0, mpVar.n2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(kpVar, tL_username, z22, i12));
                alertDialog$Builder.o();
                return;
            case 17:
                wp wpVar = (wp) this.c;
                boolean z23 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                aq aqVar = wpVar.x.d;
                aqVar.O = false;
                if (z23 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                aqVar.P = true;
                aqVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new vp(wpVar, i13), new rp(5, wpVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) this.c, this.b, (String) this.d);
                return;
            case 19:
                vi viVar = (vi) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.b;
                if (!viVar.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    viVar.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new rp(21, viVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((o10) this.c).S((l10) this.d, !this.b);
                return;
            case 21:
                cb0 cb0Var = (cb0) this.c;
                cb0Var.getMessagesController().getStoriesController().o0(cb0Var.e, (ArrayList) this.d, this.b, null);
                return;
            case 22:
                re0 re0Var = (re0) this.c;
                boolean z25 = this.b;
                cd0 cd0Var = (cd0) this.d;
                if (z25) {
                    cd0Var.x(true);
                } else {
                    cd0Var.y();
                }
                re0Var.b(cd0Var);
                return;
            case 23:
                h2 h2Var = (h2) this.c;
                boolean z26 = this.b;
                cd0 cd0Var2 = (cd0) this.d;
                if (z26) {
                    cd0Var2.x(true);
                } else {
                    cd0Var2.y();
                }
                ((re0) h2Var.b).b(cd0Var2);
                return;
            case 24:
                zh0 zh0Var = (zh0) this.c;
                h71 h71Var = zh0Var.c;
                boolean z27 = this.b;
                ArrayList arrayList12 = (ArrayList) this.d;
                if (z27) {
                    arrayList12 = zh0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (h71Var.canScrollVertically(1)) {
                    for (int i22 = 0; i22 < h71Var.getChildCount(); i22++) {
                        if (!(h71Var.getChildAt(i22) instanceof f10)) {
                        }
                    }
                    return;
                }
                zh0Var.a(false);
                return;
            case 25:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                boolean z28 = this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.d;
                if (z28) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.C0 = null;
                return;
            case 26:
                ((xw) this.c).b.presentFragment(this.b ? new FiltersSetupActivity() : new org.telegram.ui.l10((MessagesController.DialogFilter) this.d, null));
                return;
            case 27:
                xw xwVar = (xw) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                boolean z29 = this.b;
                yy yyVar = xwVar.b;
                int i23 = 0;
                for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i24);
                    if (dialog != null) {
                        yyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z29 ? 3 : 4);
                        i23++;
                    }
                }
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(yyVar.getParentActivity(), null);
                acVar.b.setText(z29 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i23, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i23, new Object[0]));
                if (z29) {
                    acVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    acVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.sc.g(yyVar, acVar, 1500).j();
                return;
            case 28:
                ((h00) this.c).Z((l10) this.d, !this.b);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.d;
                boolean z30 = this.b;
                a2Var2.dismiss();
                if (z30) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new u80(languageSelectActivity, 1), 10L);
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
