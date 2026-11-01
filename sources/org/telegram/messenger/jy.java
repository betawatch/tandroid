package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jy implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ kj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ dz f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ dz n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ jy(rz rzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = rzVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = kjVar;
        this.e = str;
        this.f = dzVar;
        this.h = z10;
        this.n = dzVar2;
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
                rz rzVar = this.b;
                rzVar.getClass();
                TLObject tLObject2 = this.c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                kj kjVar = this.d;
                String str = this.e;
                dz dzVar = this.f;
                boolean z11 = this.h;
                dz dzVar2 = this.n;
                Object obj = this.r;
                HashMap hashMap = this.s;
                boolean z12 = this.w;
                if (!z10) {
                    if (!(tLObject2 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (dzVar2 != null) {
                            dzVar2.c();
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
                        rzVar.O(tLObject, kjVar, str, dzVar, z11, dzVar2, obj, hashMap, z12);
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
                    rzVar.O(tLObject, kjVar, str, dzVar, z11, dzVar2, obj, hashMap, z12);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.x;
                TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) this.y;
                Context context = k2Var.getContext();
                org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
                sf.a i10 = sf.a.i(tL_inputMediaStakeDice.ton_amount, sf.b.b);
                rz rzVar2 = this.b;
                TLObject tLObject3 = this.c;
                kj kjVar2 = this.d;
                new wh.f(context, resourceProvider, i10, false, new ax(rzVar2, tLObject3, kjVar2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(kjVar2);
                rzVar2.f(arrayList);
                break;
        }
    }

    public /* synthetic */ jy(rz rzVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = rzVar;
        this.x = k2Var;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = kjVar;
        this.e = str;
        this.f = dzVar;
        this.h = z10;
        this.n = dzVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }
}
