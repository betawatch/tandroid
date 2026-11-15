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
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.so;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.zz;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.an;
import org.telegram.ui.eo;
import org.telegram.ui.go;
import org.telegram.ui.hy;
import org.telegram.ui.hz;
import org.telegram.ui.lm;
import org.telegram.ui.oo;
import org.telegram.ui.po;
import org.telegram.ui.pw;
import org.telegram.ui.to;
import org.telegram.ui.yw;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m6(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x04d6, code lost:
    
        if (r2 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x05d1, code lost:
    
        if (r2 == null) goto L293;
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
        SQLiteCursor sQLiteCursor = null;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((s10) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.t1) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bi.v5) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                vr vrVar = (vr) obj2;
                z10 z10Var = (z10) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = vrVar.b;
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
                            hi.z0 z0Var = new hi.z0(byteBufferValue);
                            z0Var.a = longValue;
                            arrayList2.add(z0Var);
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            arrayList3.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList3.size() > 0) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i12)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.h3(new fi.f6(27, z10Var, arrayList2));
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
                    for (int i13 = 0; i13 < messages_botresults.results.size(); i13++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i13);
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
                kg.y yVar = (kg.y) obj2;
                vr vrVar2 = (vr) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = vrVar2.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor.dispose();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i14);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i15 = 0; i15 < tL_businessChatLink.entities.size(); i15++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i15);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            vrVar2.n0(arrayList8, arrayList6, false);
                        }
                        if (!arrayList9.isEmpty()) {
                            vrVar2.Q(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new ai.j(yVar, arrayList5, arrayList6, arrayList7, this.b, 4));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((ni.a) obj2).d1((z10) obj, z10, false);
                return;
            case 7:
                ((s10) obj2).a((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 8:
                oi.q3 q3Var = (oi.q3) obj2;
                oi.k5 k5Var = (oi.k5) obj;
                boolean z11 = !z10;
                oi.m5 m5Var = k5Var.w;
                Iterator it = k5Var.I.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    oi.n5 m10 = m5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.c6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (oi.a6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        oi.c6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            oi.a6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            oi.a6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        oi.c6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (oi.a6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        oi.c6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                oi.a6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            oi.a6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        oi.c6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                m5Var.invalidate();
                oi.y2 y2Var = k5Var.F;
                if (y2Var != null && k5Var.a != null) {
                    y2Var.a();
                }
                q3Var.P2();
                return;
            case 9:
                oi.p3 p3Var = (oi.p3) obj;
                p3Var.f.r3(true);
                oi.e4.k((org.telegram.ui.ActionBar.e2) obj2, z10, new oi.b4(p3Var, 2));
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
                if (view instanceof org.telegram.ui.ActionBar.k5) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) view;
                    if (k5Var2.a) {
                        k5Var2.a = false;
                        k5Var2.invalidate();
                    }
                }
                if (z10) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i16 = d6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.c0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.u1(true);
                }
                if (!z10) {
                    HashMap hashMap = d6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        ns.f(i16).n(d6Var, ns.Y1);
                        ns.f(i16).n(d6Var, ns.Z1);
                        return;
                    }
                    return;
                }
                if (d6Var.b != null) {
                    ns.f(i16).b(d6Var, ns.Y1);
                    ns.f(i16).b(d6Var, ns.Z1);
                    Iterator it2 = d6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        org.telegram.messenger.w7.G(i16).V(org.telegram.messenger.gc.b(((org.telegram.ui.ActionBar.c6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((an) obj2).Zc((gj) obj, z10);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) obj;
                an anVar = ((lm) obj2).a;
                anVar.dc.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, hd.M0(z10 ? 2131754435 : 2131754385, null)).k(true);
                    return;
                }
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                si.b0(i7).I1(tL_messages_stickerSet, false);
                if (anVar.getParentActivity() == null || anVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    bw0 bw0Var = new bw0(anVar.getParentActivity(), anVar, tL_inputStickerSetID, null, anVar.a0, anVar.Aa);
                    boolean V9 = anVar.V9();
                    bw0Var.i0 = V9;
                    bw0Var.n = V9;
                    anVar.showDialog(bw0Var);
                    return;
                }
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(tL_inputStickerSetID);
                wu wuVar = new wu(anVar, anVar.getParentActivity(), anVar.Aa, arrayList11);
                boolean V92 = anVar.V9();
                wuVar.i0 = V92;
                wuVar.n = V92;
                anVar.showDialog(wuVar);
                return;
            case 16:
                eo eoVar = (eo) obj2;
                go goVar = eoVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, goVar.getContext(), goVar.o2);
                String M0 = hd.M0(2131743672, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = M0;
                t1Var2.U = hd.M0(2131743673, null);
                alertDialog$Builder.k(hd.M0(2131747831, null), new ab.j(eoVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.p();
                return;
            case 17:
                po poVar = (po) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                to toVar = poVar.y.d;
                toVar.P = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                toVar.Q = true;
                toVar.getMessagesController().d5(chat.id, 0L, false, false, false, new oo(poVar, i11), new zg(16, poVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.B((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 19:
                ki kiVar = (ki) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!kiVar.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    kiVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        org.telegram.messenger.g0.h3(new od(7, kiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((zz) obj2).e1((wz) obj, !z10);
                return;
            case 21:
                x80 x80Var = (x80) obj2;
                x80Var.getMessagesController().P1().r0(x80Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                fc0 fc0Var = (fc0) obj2;
                ra0 ra0Var = (ra0) obj;
                if (z10) {
                    ra0Var.w(true);
                } else {
                    ra0Var.x();
                }
                fc0Var.b(ra0Var);
                return;
            case 23:
                ah.j jVar = (ah.j) obj2;
                ra0 ra0Var2 = (ra0) obj;
                if (z10) {
                    ra0Var2.w(true);
                } else {
                    ra0Var2.x();
                }
                ((fc0) jVar.b).b(ra0Var2);
                return;
            case 24:
                cf0 cf0Var = (cf0) obj2;
                u41 u41Var = cf0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = cf0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (u41Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < u41Var.getChildCount(); i17++) {
                        if (!(u41Var.getChildAt(i17) instanceof pz)) {
                        }
                    }
                    return;
                }
                cf0Var.a(false);
                return;
            case 25:
                m60 m60Var = (m60) obj;
                ((Runnable) obj2).run();
                if (z10) {
                    m60Var.u();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) obj2;
                org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) obj;
                if (z10) {
                    zVar.y.removeView(zVar2);
                }
                zVar2.setVisibility(8);
                zVar.D0 = null;
                return;
            case 27:
                ((pw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new hz((so) obj, null));
                return;
            case 28:
                ArrayList arrayList13 = (ArrayList) obj;
                yw ywVar = ((pw) obj2).b;
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList13.size(); i19++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i19);
                    if (dialog != null) {
                        ywVar.getNotificationsController().T(dialog.id, z10 ? 3 : 4, 0L);
                        i18++;
                    }
                }
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(ywVar.getParentActivity(), null);
                fbVar.b.setText(z10 ? hd.G(i18, "NotificationsMutedHintChats", new Object[0]) : hd.G(i18, "NotificationsUnmutedHintChats", new Object[0]));
                if (z10) {
                    fbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    fbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.xb.g(ywVar, fbVar, 1500).j();
                return;
            default:
                ((hy) obj2).e0((wz) obj, !z10);
                return;
        }
    }

    public /* synthetic */ m6(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
