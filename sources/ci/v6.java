package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.ao;
import org.telegram.ui.cy;
import org.telegram.ui.ez;
import org.telegram.ui.hm;
import org.telegram.ui.ko;
import org.telegram.ui.kw;
import org.telegram.ui.lo;
import org.telegram.ui.mo;
import org.telegram.ui.qo;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v6(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x04da, code lost:
    
        if (r5 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x05d8, code lost:
    
        if (r5 == null) goto L292;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList;
        int i3;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 8;
        int i13 = 4;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((n10) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.s1) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((ai.d6) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                qr qrVar = (qr) obj2;
                u10 u10Var = (u10) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = qrVar.b;
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
                                gi.y0 y0Var = new gi.y0(byteBufferValue);
                                y0Var.a = longValue;
                                arrayList2.add(y0Var);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                                arrayList3.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList3.size() > 0) {
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i15)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new g2.c(i12, u10Var, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 4:
                gi.c3 c3Var = (gi.c3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = c3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    c3Var.h = messages_botresults.next_offset;
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
                    c3Var.d = false;
                    c3Var.F(false);
                    c3Var.f();
                    return;
                }
                return;
            case 5:
                lg.z zVar = (lg.z) obj2;
                qr qrVar2 = (qr) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = qrVar2.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor.dispose();
                        ArrayList arrayList8 = new ArrayList();
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
                            qrVar2.n0(arrayList8, arrayList6, false);
                        }
                        if (!arrayList9.isEmpty()) {
                            qrVar2.Q(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new gi.q1(zVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((li.a) obj2).d1((u10) obj, z10, false);
                return;
            case 7:
                ((n10) obj2).a((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 8:
                mi.t3 t3Var = (mi.t3) obj2;
                mi.n5 n5Var = (mi.n5) obj;
                boolean z11 = !z10;
                mi.p5 p5Var = n5Var.w;
                Iterator it = n5Var.I.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    mi.q5 m10 = p5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mi.f6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (mi.d6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        mi.f6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            mi.d6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            mi.d6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        mi.f6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (mi.d6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        mi.f6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                mi.d6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            mi.d6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        mi.f6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                p5Var.invalidate();
                mi.b3 b3Var = n5Var.F;
                if (b3Var != null && n5Var.a != null) {
                    b3Var.a();
                }
                t3Var.P2();
                return;
            case 9:
                mi.s3 s3Var = (mi.s3) obj;
                s3Var.f.r3(true);
                mi.i4.k((org.telegram.ui.ActionBar.d2) obj2, z10, new mi.f4(s3Var, 2));
                return;
            case 10:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.l5) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
                    if (l5Var.a) {
                        l5Var.a = false;
                        l5Var.invalidate();
                    }
                }
                if (z10) {
                    s1Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i19 = d6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.k6.I.c0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.k6.I.k(false))) {
                    org.telegram.ui.ActionBar.k6.u1(true);
                }
                if (!z10) {
                    HashMap hashMap = d6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        hs.f(i19).n(d6Var, hs.Y1);
                        hs.f(i19).n(d6Var, hs.Z1);
                        return;
                    }
                    return;
                }
                if (d6Var.b != null) {
                    hs.f(i19).b(d6Var, hs.Y1);
                    hs.f(i19).b(d6Var, hs.Z1);
                    Iterator it2 = d6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        org.telegram.messenger.w7.G(i19).W(org.telegram.messenger.ac.b(((org.telegram.ui.ActionBar.c6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((wm) obj2).Vc((zi) obj, z10);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) obj;
                wm wmVar = ((hm) obj2).a;
                wmVar.bc.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, bd.M0(z10 ? 2131754435 : 2131754385, null)).k(true);
                    return;
                }
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                li.b0(i3).I1(tL_messages_stickerSet, false);
                if (wmVar.getParentActivity() == null || wmVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    xv0 xv0Var = new xv0(wmVar.getParentActivity(), wmVar, tL_inputStickerSetID, null, wmVar.a0, wmVar.ya);
                    boolean T9 = wmVar.T9();
                    xv0Var.i0 = T9;
                    xv0Var.n = T9;
                    wmVar.showDialog(xv0Var);
                    return;
                }
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(tL_inputStickerSetID);
                pu puVar = new pu(wmVar, wmVar.getParentActivity(), wmVar.ya, arrayList11);
                boolean T92 = wmVar.T9();
                puVar.i0 = T92;
                puVar.n = T92;
                wmVar.showDialog(puVar);
                return;
            case 16:
                yn ynVar = (yn) obj2;
                ao aoVar = ynVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, aoVar.getContext(), aoVar.o2);
                String M0 = bd.M0(2131743682, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                s1Var2.S = M0;
                s1Var2.U = bd.M0(2131743683, null);
                alertDialog$Builder.k(bd.M0(2131747839, null), new l3(ynVar, (TLRPC.TL_username) obj, z10, i13));
                alertDialog$Builder.p();
                return;
            case 17:
                mo moVar = (mo) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qo qoVar = moVar.y.d;
                qoVar.P = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                qoVar.Q = true;
                qoVar.getMessagesController().c5(chat.id, 0L, false, false, false, new ko(moVar, i14), new lo(i11, moVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.A((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 19:
                bi biVar = (bi) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!biVar.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    biVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        org.telegram.messenger.g0.h3(new lo(18, biVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((rz) obj2).e1((oz) obj, !z10);
                return;
            case 21:
                r80 r80Var = (r80) obj2;
                r80Var.getMessagesController().P1().r0(r80Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                zb0 zb0Var = (zb0) obj2;
                la0 la0Var = (la0) obj;
                if (z10) {
                    la0Var.w(true);
                } else {
                    la0Var.x();
                }
                zb0Var.b(la0Var);
                return;
            case 23:
                bh.h hVar = (bh.h) obj2;
                la0 la0Var2 = (la0) obj;
                if (z10) {
                    la0Var2.w(true);
                } else {
                    la0Var2.x();
                }
                ((zb0) hVar.b).b(la0Var2);
                return;
            case 24:
                bf0 bf0Var = (bf0) obj2;
                l41 l41Var = bf0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = bf0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (l41Var.canScrollVertically(1)) {
                    for (int i20 = 0; i20 < l41Var.getChildCount(); i20++) {
                        if (!(l41Var.getChildAt(i20) instanceof iz)) {
                        }
                    }
                    return;
                }
                bf0Var.a(false);
                return;
            case 25:
                f60 f60Var = (f60) obj;
                ((Runnable) obj2).run();
                if (z10) {
                    f60Var.u();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) obj2;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) obj;
                if (z10) {
                    rVar.y.removeView(rVar2);
                }
                rVar2.setVisibility(8);
                rVar.D0 = null;
                return;
            case 27:
                ((kw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new ez((org.telegram.messenger.mo) obj, null));
                return;
            case 28:
                ArrayList arrayList13 = (ArrayList) obj;
                uw uwVar = ((kw) obj2).b;
                int i21 = 0;
                for (int i22 = 0; i22 < arrayList13.size(); i22++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i22);
                    if (dialog != null) {
                        uwVar.getNotificationsController().T(dialog.id, z10 ? 3 : 4, 0L);
                        i21++;
                    }
                }
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(uwVar.getParentActivity(), null);
                ibVar.b.setText(z10 ? bd.G(i21, "NotificationsMutedHintChats", new Object[0]) : bd.G(i21, "NotificationsUnmutedHintChats", new Object[0]));
                if (z10) {
                    ibVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ibVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.ac.g(uwVar, ibVar, 1500).j();
                return;
            default:
                ((cy) obj2).e0((oz) obj, !z10);
                return;
        }
    }

    public /* synthetic */ v6(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
