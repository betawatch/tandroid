package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class px implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ly f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ly n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ px(zy zyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = zyVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = fjVar;
        this.e = str;
        this.f = lyVar;
        this.h = z10;
        this.n = lyVar2;
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
                zy zyVar = this.b;
                zyVar.getClass();
                TLObject tLObject2 = this.c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                fj fjVar = this.d;
                String str = this.e;
                ly lyVar = this.f;
                boolean z11 = this.h;
                ly lyVar2 = this.n;
                Object obj = this.r;
                HashMap hashMap = this.s;
                boolean z12 = this.w;
                if (!z10) {
                    if (!(tLObject2 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (lyVar2 != null) {
                            lyVar2.c();
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
                        zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
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
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.x;
                TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) this.y;
                Context context = g2Var.getContext();
                org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
                cg.a j3 = cg.a.j(tL_inputMediaStakeDice.ton_amount, cg.b.b);
                zy zyVar2 = this.b;
                TLObject tLObject3 = this.c;
                fj fjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new hw(zyVar2, tLObject3, fjVar2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar2);
                zyVar2.f(arrayList);
                break;
        }
    }

    public /* synthetic */ px(zy zyVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = zyVar;
        this.x = g2Var;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = fjVar;
        this.e = str;
        this.f = lyVar;
        this.h = z10;
        this.n = lyVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }
}
