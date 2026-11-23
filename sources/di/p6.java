package di;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.eh;
import org.telegram.ui.g60;
import org.telegram.ui.go;
import org.telegram.ui.io;
import org.telegram.ui.ky;
import org.telegram.ui.mm;
import org.telegram.ui.qo;
import org.telegram.ui.ro;
import org.telegram.ui.tw;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p6(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x04d2, code lost:
    
        if (r3 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05cd, code lost:
    
        if (r3 == null) goto L291;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList;
        int i7;
        int i10 = this.a;
        int i11 = 5;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((r10) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.e0) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bi.e8) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                ur urVar = (ur) obj2;
                y10 y10Var = (y10) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = urVar.b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    break;
                }
                if (sQLiteDatabase == null) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                sb2.append(z10 ? "2" : "0 OR type = 1");
                sb2.append(" ORDER BY date DESC");
                sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        try {
                            hi.a1 a1Var = new hi.a1(byteBufferValue);
                            a1Var.a = longValue;
                            arrayList2.add(a1Var);
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            arrayList3.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList3.size() > 0) {
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i13)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.g3(new hi.c(i12, y10Var, arrayList2));
                return;
            case 4:
                hi.c3 c3Var = (hi.c3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = c3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    c3Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i14 = 0; i14 < messages_botresults.results.size(); i14++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
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
                    c3Var.d = false;
                    c3Var.F(false);
                    c3Var.f();
                    return;
                }
                return;
            case 5:
                kg.z zVar = (kg.z) obj2;
                ur urVar2 = (ur) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = urVar2.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor.dispose();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i15);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i16 = 0; i16 < tL_businessChatLink.entities.size(); i16++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i16);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            urVar2.n0(arrayList8, arrayList6, false);
                        }
                        if (!arrayList9.isEmpty()) {
                            urVar2.Q(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.g3(new ai.i(zVar, arrayList5, arrayList6, arrayList7, this.b, 3));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((ni.a) obj2).e1((y10) obj, z10, false);
                return;
            case 7:
                ((r10) obj2).a((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 8:
                oi.t3 t3Var = (oi.t3) obj2;
                oi.m5 m5Var = (oi.m5) obj;
                boolean z11 = !z10;
                oi.o5 o5Var = m5Var.w;
                Iterator it = m5Var.I.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    oi.p5 m10 = o5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.e6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (oi.c6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        oi.e6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            oi.c6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            oi.c6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        oi.e6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (oi.c6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        oi.e6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                oi.c6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            oi.c6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        oi.e6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                o5Var.invalidate();
                oi.b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.a != null) {
                    b3Var.a();
                }
                t3Var.P2();
                return;
            case 9:
                oi.s3 s3Var = (oi.s3) obj;
                s3Var.f.r3(true);
                oi.h4.k((org.telegram.ui.ActionBar.g2) obj2, z10, new oi.e4(s3Var, 2));
                return;
            case 10:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.n5) {
                    org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) view;
                    if (n5Var.a) {
                        n5Var.a = false;
                        n5Var.invalidate();
                    }
                }
                if (z10) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i17 = g6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.m6.I.c0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.m6.I.k(false))) {
                    org.telegram.ui.ActionBar.m6.u1(true);
                }
                if (!z10) {
                    HashMap hashMap = g6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        ls.f(i17).n(g6Var, ls.Y1);
                        ls.f(i17).n(g6Var, ls.Z1);
                        return;
                    }
                    return;
                }
                if (g6Var.b != null) {
                    ls.f(i17).b(g6Var, ls.Y1);
                    ls.f(i17).b(g6Var, ls.Z1);
                    Iterator it2 = g6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        org.telegram.messenger.w7.G(i17).V(org.telegram.messenger.gc.b(((org.telegram.ui.ActionBar.f6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((bn) obj2).Zc((gj) obj, z10);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) obj;
                bn bnVar = ((mm) obj2).a;
                bnVar.ec.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, hd.N0(z10 ? 2131754432 : 2131754382, null)).k(true);
                    return;
                }
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                si.d0(i7).N1(tL_messages_stickerSet, false);
                if (bnVar.getParentActivity() == null || bnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    kw0 kw0Var = new kw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.a0, bnVar.Ba);
                    boolean V9 = bnVar.V9();
                    kw0Var.i0 = V9;
                    kw0Var.n = V9;
                    bnVar.showDialog(kw0Var);
                    return;
                }
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(tL_inputStickerSetID);
                ev evVar = new ev(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList11);
                boolean V92 = bnVar.V9();
                evVar.i0 = V92;
                evVar.n = V92;
                bnVar.showDialog(evVar);
                return;
            case 16:
                go goVar = (go) obj2;
                io ioVar = goVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), ioVar.o2);
                String N0 = hd.N0(2131743427, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = N0;
                t1Var2.U = hd.N0(2131743428, null);
                alertDialog$Builder.k(hd.N0(2131747637, null), new ab.j(goVar, (TLRPC.TL_username) obj, z10, i11));
                alertDialog$Builder.p();
                return;
            case 17:
                ro roVar = (ro) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                vo voVar = roVar.y.d;
                voVar.P = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                voVar.Q = true;
                voVar.getMessagesController().o5(chat.id, 0L, false, false, false, new qo(roVar, i12), new eh(14, roVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.B((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 19:
                ui uiVar = (ui) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!uiVar.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    uiVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        org.telegram.messenger.g0.g3(new mf(i11, uiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((i00) obj2).f1((f00) obj, !z10);
                return;
            case 21:
                k90 k90Var = (k90) obj2;
                k90Var.getMessagesController().R1().r0(k90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                qc0 qc0Var = (qc0) obj2;
                cb0 cb0Var = (cb0) obj;
                if (z10) {
                    cb0Var.w(true);
                } else {
                    cb0Var.x();
                }
                qc0Var.b(cb0Var);
                return;
            case 23:
                ah.j jVar = (ah.j) obj2;
                cb0 cb0Var2 = (cb0) obj;
                if (z10) {
                    cb0Var2.w(true);
                } else {
                    cb0Var2.x();
                }
                ((qc0) jVar.b).b(cb0Var2);
                return;
            case 24:
                of0 of0Var = (of0) obj2;
                h51 h51Var = of0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = of0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (h51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < h51Var.getChildCount(); i18++) {
                        if (!(h51Var.getChildAt(i18) instanceof yz)) {
                        }
                    }
                    return;
                }
                of0Var.a(false);
                return;
            case 25:
                a70 a70Var = (a70) obj;
                ((Runnable) obj2).run();
                if (z10) {
                    a70Var.v();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj2;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                if (z10) {
                    yVar.y.removeView(yVar2);
                }
                yVar2.setVisibility(8);
                yVar.D0 = null;
                return;
            case 27:
                ArrayList arrayList13 = (ArrayList) obj;
                cx cxVar = ((tw) obj2).b;
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList13.size(); i20++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i20);
                    if (dialog != null) {
                        cxVar.getNotificationsController().T(dialog.id, z10 ? 3 : 4, 0L);
                        i19++;
                    }
                }
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(cxVar.getParentActivity(), null);
                obVar.b.setText(z10 ? hd.G(i19, "NotificationsMutedHintChats", new Object[0]) : hd.G(i19, "NotificationsUnmutedHintChats", new Object[0]));
                if (z10) {
                    obVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    obVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.gc.g(cxVar, obVar, 1500).j();
                return;
            case 28:
                ((ky) obj2).e0((f00) obj, !z10);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                if (z10) {
                    return;
                }
                org.telegram.messenger.g0.h3(new g60(languageSelectActivity, 1), 10L);
                return;
        }
    }

    public /* synthetic */ p6(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
