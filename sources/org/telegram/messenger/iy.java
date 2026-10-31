package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class iy implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cz f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cz n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ iy(qz qzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = qzVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = jjVar;
        this.e = str;
        this.f = czVar;
        this.h = z10;
        this.n = czVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.y;
                TLObject tLObject = (TLObject) this.x;
                qz qzVar = this.b;
                qzVar.getClass();
                TLObject tLObject2 = this.c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                jj jjVar = this.d;
                String str = this.e;
                cz czVar = this.f;
                boolean z11 = this.h;
                cz czVar2 = this.n;
                Object obj = this.r;
                HashMap hashMap = this.s;
                boolean z12 = this.w;
                if (!z10) {
                    if (!(tLObject2 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (czVar2 != null) {
                            czVar2.c();
                            break;
                        }
                    } else {
                        TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_inputPhoto.id = photo.id;
                        tL_inputPhoto.access_hash = photo.access_hash;
                        tL_inputPhoto.file_reference = photo.file_reference;
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                        tL_inputMediaPhoto.id = tL_inputPhoto;
                        tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                        qzVar.O(tLObject, jjVar, str, czVar, z11, czVar2, obj, hashMap, z12);
                        break;
                    }
                } else {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    qzVar.O(tLObject, jjVar, str, czVar, z11, czVar2, obj, hashMap, z12);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.x;
                TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) this.y;
                Context context = k2Var.getContext();
                org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
                sf.a i10 = sf.a.i(tL_inputMediaStakeDice.ton_amount, sf.b.b);
                qz qzVar2 = this.b;
                TLObject tLObject3 = this.c;
                jj jjVar2 = this.d;
                new wh.f(context, resourceProvider, i10, false, new zw(qzVar2, tLObject3, jjVar2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(jjVar2);
                qzVar2.f(arrayList);
                break;
        }
    }

    public /* synthetic */ iy(qz qzVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = qzVar;
        this.x = k2Var;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f = czVar;
        this.h = z10;
        this.n = czVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }
}
