package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ String e;
    public final /* synthetic */ sy f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ sy n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ wx(gz gzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.b = gzVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = ijVar;
        this.e = str;
        this.f = syVar;
        this.h = z9;
        this.n = syVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.y;
                TLObject tLObject = (TLObject) this.x;
                gz gzVar = this.b;
                gzVar.getClass();
                TLObject tLObject2 = this.c;
                boolean z9 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                ij ijVar = this.d;
                String str = this.e;
                sy syVar = this.f;
                boolean z10 = this.h;
                sy syVar2 = this.n;
                Object obj = this.r;
                HashMap hashMap = this.s;
                boolean z11 = this.w;
                if (!z9) {
                    if (!(tLObject2 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (syVar2 != null) {
                            syVar2.c();
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
                        gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
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
                    gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.x;
                TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) this.y;
                Context context = f2Var.getContext();
                org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
                cg.a i7 = cg.a.i(tL_inputMediaStakeDice.ton_amount, cg.b.b);
                gz gzVar2 = this.b;
                TLObject tLObject3 = this.c;
                ij ijVar2 = this.d;
                new gi.e(context, resourceProvider, i7, false, new nw(gzVar2, tLObject3, ijVar2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar2);
                gzVar2.f(arrayList);
                break;
        }
    }

    public /* synthetic */ wx(gz gzVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.b = gzVar;
        this.x = f2Var;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = ijVar;
        this.e = str;
        this.f = syVar;
        this.h = z9;
        this.n = syVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z10;
    }
}
