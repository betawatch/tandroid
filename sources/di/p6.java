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
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xd;
import org.telegram.ui.Components.za0;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ah;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fo;
import org.telegram.ui.g60;
import org.telegram.ui.ho;
import org.telegram.ui.jy;
import org.telegram.ui.mm;
import org.telegram.ui.po;
import org.telegram.ui.qo;
import org.telegram.ui.sw;
import org.telegram.ui.uo;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    /* JADX WARN: Code restructure failed: missing block: B:273:0x04d3, code lost:
    
        if (r3 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05ce, code lost:
    
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
        int i11 = 2;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((p10) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.f0) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bi.h8) obj2).a(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                tr trVar = (tr) obj2;
                w10 w10Var = (w10) obj;
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
                            hi.i1 i1Var = new hi.i1(byteBufferValue);
                            i1Var.a = longValue;
                            arrayList2.add(i1Var);
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
                org.telegram.messenger.g0.g3(new hi.c(i11, w10Var, arrayList2));
                return;
            case 4:
                hi.l3 l3Var = (hi.l3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = l3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    l3Var.h = messages_botresults.next_offset;
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
                    l3Var.d = false;
                    l3Var.F(false);
                    l3Var.f();
                    return;
                }
                return;
            case 5:
                kg.z zVar = (kg.z) obj2;
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
                    org.telegram.messenger.g0.g3(new ai.e(zVar, arrayList5, arrayList6, arrayList7, this.b, 3));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((ni.a) obj2).e1((w10) obj, z10, false);
                return;
            case 7:
                ((p10) obj2).a((Bitmap) obj, Boolean.valueOf(z10));
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
                if (view instanceof org.telegram.ui.ActionBar.o5) {
                    org.telegram.ui.ActionBar.o5 o5Var2 = (org.telegram.ui.ActionBar.o5) view;
                    if (o5Var2.a) {
                        o5Var2.a = false;
                        o5Var2.invalidate();
                    }
                }
                if (z10) {
                    t1Var.dismiss();
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
                    org.telegram.ui.Components.kc.b0(bnVar).Q(R.raw.error, 36, gd.N0(z10 ? 2131754432 : 2131754382, null)).k(true);
                    return;
                }
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
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
                    jw0 jw0Var = new jw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.a0, bnVar.Ba);
                    boolean V9 = bnVar.V9();
                    jw0Var.i0 = V9;
                    jw0Var.n = V9;
                    bnVar.showDialog(jw0Var);
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
                fo foVar = (fo) obj2;
                ho hoVar = foVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), hoVar.o2);
                String N0 = gd.N0(2131743425, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = N0;
                t1Var2.U = gd.N0(2131743426, null);
                alertDialog$Builder.k(gd.N0(2131747637, null), new ab.j(foVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.p();
                return;
            case 17:
                qo qoVar = (qo) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                uo uoVar = qoVar.y.d;
                uoVar.P = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                uoVar.Q = true;
                uoVar.getMessagesController().o5(chat.id, 0L, false, false, false, new po(qoVar, i12), new ah(16, qoVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.B((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 19:
                ti tiVar = (ti) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!tiVar.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    tiVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        org.telegram.messenger.g0.g3(new xd(7, tiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((g00) obj2).f1((d00) obj, !z10);
                return;
            case 21:
                h90 h90Var = (h90) obj2;
                h90Var.getMessagesController().R1().r0(h90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                oc0 oc0Var = (oc0) obj2;
                za0 za0Var = (za0) obj;
                if (z10) {
                    za0Var.w(true);
                } else {
                    za0Var.x();
                }
                oc0Var.b(za0Var);
                return;
            case 23:
                ah.j jVar = (ah.j) obj2;
                za0 za0Var2 = (za0) obj;
                if (z10) {
                    za0Var2.w(true);
                } else {
                    za0Var2.x();
                }
                ((oc0) jVar.b).b(za0Var2);
                return;
            case 24:
                nf0 nf0Var = (nf0) obj2;
                g51 g51Var = nf0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = nf0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (g51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < g51Var.getChildCount(); i18++) {
                        if (!(g51Var.getChildAt(i18) instanceof vz)) {
                        }
                    }
                    return;
                }
                nf0Var.a(false);
                return;
            case 25:
                x60 x60Var = (x60) obj;
                ((Runnable) obj2).run();
                if (z10) {
                    x60Var.v();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) obj2;
                org.telegram.ui.Components.voip.z zVar3 = (org.telegram.ui.Components.voip.z) obj;
                if (z10) {
                    zVar2.y.removeView(zVar3);
                }
                zVar3.setVisibility(8);
                zVar2.D0 = null;
                return;
            case 27:
                ArrayList arrayList13 = (ArrayList) obj;
                bx bxVar = ((sw) obj2).b;
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList13.size(); i20++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i20);
                    if (dialog != null) {
                        bxVar.getNotificationsController().T(dialog.id, z10 ? 3 : 4, 0L);
                        i19++;
                    }
                }
                org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bxVar.getParentActivity(), null);
                nbVar.b.setText(z10 ? gd.G(i19, "NotificationsMutedHintChats", new Object[0]) : gd.G(i19, "NotificationsUnmutedHintChats", new Object[0]));
                if (z10) {
                    nbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    nbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.fc.g(bxVar, nbVar, 1500).j();
                return;
            case 28:
                ((jy) obj2).e0((d00) obj, !z10);
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
