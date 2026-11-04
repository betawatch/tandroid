package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class px implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ky n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ px(yy yyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = yyVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = ziVar;
        this.e = str;
        this.f = kyVar;
        this.h = z10;
        this.n = kyVar2;
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
                yy yyVar = this.b;
                yyVar.getClass();
                TLObject tLObject2 = this.c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                zi ziVar = this.d;
                String str = this.e;
                ky kyVar = this.f;
                boolean z11 = this.h;
                ky kyVar2 = this.n;
                Object obj = this.r;
                HashMap hashMap = this.s;
                boolean z12 = this.w;
                if (!z10) {
                    if (!(tLObject2 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (kyVar2 != null) {
                            kyVar2.c();
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
                        yyVar.O(tLObject, ziVar, str, kyVar, z11, kyVar2, obj, hashMap, z12);
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
                    yyVar.O(tLObject, ziVar, str, kyVar, z11, kyVar2, obj, hashMap, z12);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.x;
                TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) this.y;
                Context context = d2Var.getContext();
                org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
                dg.a i3 = dg.a.i(tL_inputMediaStakeDice.ton_amount, dg.b.b);
                yy yyVar2 = this.b;
                TLObject tLObject3 = this.c;
                zi ziVar2 = this.d;
                new hi.f(context, resourceProvider, i3, false, new gw(yyVar2, tLObject3, ziVar2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ziVar2);
                yyVar2.f(arrayList);
                break;
        }
    }

    public /* synthetic */ px(yy yyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = yyVar;
        this.x = d2Var;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = ziVar;
        this.e = str;
        this.f = kyVar;
        this.h = z10;
        this.n = kyVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }
}
