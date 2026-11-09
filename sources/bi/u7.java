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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.vo;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.cn;
import org.telegram.ui.fo;
import org.telegram.ui.ho;
import org.telegram.ui.iy;
import org.telegram.ui.iz;
import org.telegram.ui.nm;
import org.telegram.ui.po;
import org.telegram.ui.pw;
import org.telegram.ui.qo;
import org.telegram.ui.rf;
import org.telegram.ui.uo;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u7(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x04d7, code lost:
    
        if (r3 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x05d2, code lost:
    
        if (r3 == null) goto L293;
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
        boolean z9 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((v10) obj2).a(Boolean.valueOf(z9), (String) obj);
                return;
            case 1:
                ((org.telegram.ui.Wallet.t1) obj2).a(Boolean.valueOf(z9), (String) obj);
                return;
            case 2:
                ((mc) obj2).a(Boolean.valueOf(z9), (String) obj);
                return;
            case 3:
                yr yrVar = (yr) obj2;
                c20 c20Var = (c20) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = yrVar.b;
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
                sb2.append(z9 ? "2" : "0 OR type = 1");
                sb2.append(" ORDER BY date DESC");
                sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        try {
                            fi.y0 y0Var = new fi.y0(byteBufferValue);
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
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i13)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.h3(new f2.h(i11, c20Var, arrayList2));
                return;
            case 4:
                fi.e3 e3Var = (fi.e3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = e3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    e3Var.h = messages_botresults.next_offset;
                    if (z9) {
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
                    e3Var.d = false;
                    e3Var.F(false);
                    e3Var.f();
                    return;
                }
                return;
            case 5:
                kg.y yVar = (kg.y) obj2;
                yr yrVar2 = (yr) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = yrVar2.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
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
                            yrVar2.n0(arrayList8, arrayList6, false);
                        }
                        if (!arrayList9.isEmpty()) {
                            yrVar2.Q(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new fi.q1(yVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 6:
                ((ki.a) obj2).d1((c20) obj, z9, false);
                return;
            case 7:
                ((v10) obj2).a((Bitmap) obj, Boolean.valueOf(z9));
                return;
            case 8:
                li.t3 t3Var = (li.t3) obj2;
                li.m5 m5Var = (li.m5) obj;
                boolean z10 = !z9;
                li.o5 o5Var = m5Var.w;
                Iterator it = m5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    li.p5 m10 = o5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.e6.h(pagetablecell));
                        boolean z11 = spannableStringBuilder.length() > 0 && (li.c6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        li.e6.l(pagetablecell, z10);
                        if (!z9 && spannableStringBuilder.length() > 0) {
                            li.c6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z9 && z11) {
                            li.c6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        li.e6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z12 = spannableStringBuilder2.length() > 0 && (li.c6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        li.e6.l(m10.b, z10);
                        if (z9) {
                            if (z12) {
                                li.c6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            li.c6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        li.e6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                o5Var.invalidate();
                li.a3 a3Var = m5Var.E;
                if (a3Var != null && m5Var.a != null) {
                    a3Var.a();
                }
                t3Var.P2();
                return;
            case 9:
                li.s3 s3Var = (li.s3) obj;
                s3Var.f.r3(true);
                li.h4.k((org.telegram.ui.ActionBar.f2) obj2, z9, new li.e4(s3Var, 2));
                return;
            case 10:
                ((CameraController) obj2).lambda$initCamera$4(z9, (Runnable) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z9);
                return;
            case 12:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.m5) {
                    org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) view;
                    if (m5Var2.a) {
                        m5Var2.a = false;
                        m5Var2.invalidate();
                    }
                }
                if (z9) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i17 = f6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.l6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.l6.I.k(false))) {
                    org.telegram.ui.ActionBar.l6.u1(true);
                }
                if (!z9) {
                    HashMap hashMap = f6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        qs.f(i17).n(f6Var, qs.Y1);
                        qs.f(i17).n(f6Var, qs.Z1);
                        return;
                    }
                    return;
                }
                if (f6Var.b != null) {
                    qs.f(i17).b(f6Var, qs.Y1);
                    qs.f(i17).b(f6Var, qs.Z1);
                    Iterator it2 = f6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        org.telegram.messenger.w7.G(i17).V(org.telegram.messenger.hc.b(((org.telegram.ui.ActionBar.e6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((cn) obj2).Yc((ij) obj, z9);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) obj;
                cn cnVar = ((nm) obj2).a;
                cnVar.cc.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0(z9 ? 2131754435 : 2131754385, null)).k(true);
                    return;
                }
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ui.b0(i7).I1(tL_messages_stickerSet, false);
                if (cnVar.getParentActivity() == null || cnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z9) {
                    zv0 zv0Var = new zv0(cnVar.getParentActivity(), cnVar, tL_inputStickerSetID, null, cnVar.Z, cnVar.za);
                    boolean U9 = cnVar.U9();
                    zv0Var.h0 = U9;
                    zv0Var.n = U9;
                    cnVar.showDialog(zv0Var);
                    return;
                }
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(tL_inputStickerSetID);
                ru ruVar = new ru(cnVar, cnVar.getParentActivity(), cnVar.za, arrayList11);
                boolean U92 = cnVar.U9();
                ruVar.h0 = U92;
                ruVar.n = U92;
                cnVar.showDialog(ruVar);
                return;
            case 16:
                fo foVar = (fo) obj2;
                ho hoVar = foVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), hoVar.n2);
                String M0 = org.telegram.messenger.id.M0(2131743672, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743673, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new ab.j(foVar, (TLRPC.TL_username) obj, z9, 5));
                alertDialog$Builder.p();
                return;
            case 17:
                qo qoVar = (qo) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                uo uoVar = qoVar.y.d;
                uoVar.O = false;
                if (z9 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                uoVar.P = true;
                uoVar.getMessagesController().c5(chat.id, 0L, false, false, false, new po(qoVar, i12), new rf(27, qoVar, chat));
                return;
            case 18:
                AnimatedPhoneNumberEditText.A((AnimatedPhoneNumberEditText) obj2, z9, (String) obj);
                return;
            case 19:
                di diVar = (di) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!diVar.I && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    diVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z9) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(13, diVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((wz) obj2).e1((tz) obj, !z9);
                return;
            case 21:
                v80 v80Var = (v80) obj2;
                v80Var.getMessagesController().P1().r0(v80Var.e, (ArrayList) obj, this.b, null);
                return;
            case 22:
                fc0 fc0Var = (fc0) obj2;
                ra0 ra0Var = (ra0) obj;
                if (z9) {
                    ra0Var.w(true);
                } else {
                    ra0Var.x();
                }
                fc0Var.b(ra0Var);
                return;
            case 23:
                ah.j jVar = (ah.j) obj2;
                ra0 ra0Var2 = (ra0) obj;
                if (z9) {
                    ra0Var2.w(true);
                } else {
                    ra0Var2.x();
                }
                ((fc0) jVar.b).b(ra0Var2);
                return;
            case 24:
                af0 af0Var = (af0) obj2;
                r41 r41Var = af0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z9) {
                    arrayList12 = af0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (r41Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < r41Var.getChildCount(); i18++) {
                        if (!(r41Var.getChildAt(i18) instanceof mz)) {
                        }
                    }
                    return;
                }
                af0Var.a(false);
                return;
            case 25:
                l60 l60Var = (l60) obj;
                ((Runnable) obj2).run();
                if (z9) {
                    l60Var.u();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj2;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) obj;
                if (z9) {
                    yVar2.y.removeView(yVar3);
                }
                yVar3.setVisibility(8);
                yVar2.C0 = null;
                return;
            case 27:
                ((pw) obj2).b.presentFragment(z9 ? new FiltersSetupActivity() : new iz((vo) obj, null));
                return;
            case 28:
                ArrayList arrayList13 = (ArrayList) obj;
                yw ywVar = ((pw) obj2).b;
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList13.size(); i20++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i20);
                    if (dialog != null) {
                        ywVar.getNotificationsController().T(dialog.id, z9 ? 3 : 4, 0L);
                        i19++;
                    }
                }
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(ywVar.getParentActivity(), null);
                kbVar.b.setText(z9 ? org.telegram.messenger.id.G(i19, "NotificationsMutedHintChats", new Object[0]) : org.telegram.messenger.id.G(i19, "NotificationsUnmutedHintChats", new Object[0]));
                if (z9) {
                    kbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    kbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.cc.g(ywVar, kbVar, 1500).j();
                return;
            default:
                ((iy) obj2).e0((tz) obj, !z9);
                return;
        }
    }

    public /* synthetic */ u7(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z9;
        this.c = obj2;
    }
}
