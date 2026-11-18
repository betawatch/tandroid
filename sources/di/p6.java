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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ci;
import org.telegram.ui.cx;
import org.telegram.ui.g60;
import org.telegram.ui.go;
import org.telegram.ui.io;
import org.telegram.ui.ky;
import org.telegram.ui.mm;
import org.telegram.ui.qo;
import org.telegram.ui.ro;
import org.telegram.ui.tw;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    /* JADX WARN: Code restructure failed: missing block: B:272:0x04d2, code lost:
    
        if (r3 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x05cd, code lost:
    
        if (r3 == null) goto L290;
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
        int i11 = 3;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((q10) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.e0) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bi.c8) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                tr trVar = (tr) obj2;
                x10 x10Var = (x10) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = trVar.b;
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
                org.telegram.messenger.g0.g3(new fi.a6(29, x10Var, arrayList2));
                return;
            case 4:
                hi.d3 d3Var = (hi.d3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = d3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    d3Var.h = messages_botresults.next_offset;
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
                    d3Var.d = false;
                    d3Var.F(false);
                    d3Var.f();
                    return;
                }
                return;
            case 5:
                kg.y yVar = (kg.y) obj2;
                tr trVar2 = (tr) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = trVar2.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
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
                            trVar2.n0(arrayList8, arrayList6, false);
                        }
                        if (!arrayList9.isEmpty()) {
                            trVar2.Q(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.g3(new ai.n(yVar, arrayList5, arrayList6, arrayList7, this.b, 3));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((ni.a) obj2).e1((x10) obj, z10, false);
                return;
            case 7:
                ((q10) obj2).a((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 8:
                oi.s3 s3Var = (oi.s3) obj2;
                oi.l5 l5Var = (oi.l5) obj;
                boolean z11 = !z10;
                oi.n5 n5Var = l5Var.w;
                Iterator it = l5Var.I.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    oi.o5 m10 = n5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.d6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (oi.b6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        oi.d6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            oi.b6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            oi.b6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        oi.d6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (oi.b6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        oi.d6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                oi.b6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            oi.b6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        oi.d6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                n5Var.invalidate();
                oi.a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.a != null) {
                    a3Var.a();
                }
                s3Var.P2();
                return;
            case 9:
                oi.r3 r3Var = (oi.r3) obj;
                r3Var.f.r3(true);
                oi.g4.k((org.telegram.ui.ActionBar.h2) obj2, z10, new oi.d4(r3Var, 2));
                return;
            case 10:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.o5) {
                    org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) view;
                    if (o5Var.a) {
                        o5Var.a = false;
                        o5Var.invalidate();
                    }
                }
                if (z10) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i17 = h6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.n6.I.c0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.n6.I.k(false))) {
                    org.telegram.ui.ActionBar.n6.u1(true);
                }
                if (!z10) {
                    HashMap hashMap = h6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        ks.f(i17).n(h6Var, ks.Y1);
                        ks.f(i17).n(h6Var, ks.Z1);
                        return;
                    }
                    return;
                }
                if (h6Var.b != null) {
                    ks.f(i17).b(h6Var, ks.Y1);
                    ks.f(i17).b(h6Var, ks.Z1);
                    Iterator it2 = h6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        org.telegram.messenger.w7.G(i17).V(org.telegram.messenger.fc.b(((org.telegram.ui.ActionBar.g6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((bn) obj2).Zc((fj) obj, z10);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) obj;
                bn bnVar = ((mm) obj2).a;
                bnVar.ec.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, gd.M0(z10 ? 2131754433 : 2131754383, null)).k(true);
                    return;
                }
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ri.d0(i7).N1(tL_messages_stickerSet, false);
                if (bnVar.getParentActivity() == null || bnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    iw0 iw0Var = new iw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.a0, bnVar.Ba);
                    boolean V9 = bnVar.V9();
                    iw0Var.i0 = V9;
                    iw0Var.n = V9;
                    bnVar.showDialog(iw0Var);
                    return;
                }
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(tL_inputStickerSetID);
                bv bvVar = new bv(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList11);
                boolean V92 = bnVar.V9();
                bvVar.i0 = V92;
                bvVar.n = V92;
                bnVar.showDialog(bvVar);
                return;
            case 16:
                go goVar = (go) obj2;
                io ioVar = goVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), ioVar.o2);
                String M0 = gd.M0(2131743435, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.S = M0;
                u1Var2.U = gd.M0(2131743436, null);
                alertDialog$Builder.k(gd.M0(2131747638, null), new ab.j(goVar, (TLRPC.TL_username) obj, z10, 5));
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
                voVar.getMessagesController().o5(chat.id, 0L, false, false, false, new qo(roVar, i12), new ci(12, roVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.B((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 19:
                si siVar = (si) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!siVar.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    siVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        org.telegram.messenger.g0.g3(new mg(i11, siVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((g00) obj2).f1((d00) obj, !z10);
                return;
            case 21:
                i90 i90Var = (i90) obj2;
                i90Var.getMessagesController().R1().r0(i90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                pc0 pc0Var = (pc0) obj2;
                bb0 bb0Var = (bb0) obj;
                if (z10) {
                    bb0Var.w(true);
                } else {
                    bb0Var.x();
                }
                pc0Var.b(bb0Var);
                return;
            case 23:
                ah.j jVar = (ah.j) obj2;
                bb0 bb0Var2 = (bb0) obj;
                if (z10) {
                    bb0Var2.w(true);
                } else {
                    bb0Var2.x();
                }
                ((pc0) jVar.b).b(bb0Var2);
                return;
            case 24:
                mf0 mf0Var = (mf0) obj2;
                e51 e51Var = mf0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = mf0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (e51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < e51Var.getChildCount(); i18++) {
                        if (!(e51Var.getChildAt(i18) instanceof wz)) {
                        }
                    }
                    return;
                }
                mf0Var.a(false);
                return;
            case 25:
                y60 y60Var = (y60) obj;
                ((Runnable) obj2).run();
                if (z10) {
                    y60Var.v();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj2;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) obj;
                if (z10) {
                    yVar2.y.removeView(yVar3);
                }
                yVar3.setVisibility(8);
                yVar2.D0 = null;
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
                obVar.b.setText(z10 ? gd.G(i19, "NotificationsMutedHintChats", new Object[0]) : gd.G(i19, "NotificationsUnmutedHintChats", new Object[0]));
                if (z10) {
                    obVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    obVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.gc.g(cxVar, obVar, 1500).j();
                return;
            case 28:
                ((ky) obj2).e0((d00) obj, !z10);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
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
