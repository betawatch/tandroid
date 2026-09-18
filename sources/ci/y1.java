package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.nz;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class y1 extends nz {
    public final kv0 X;
    public final /* synthetic */ z1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var) {
        super(100, true);
        this.Y = z1Var;
        this.X = new kv0();
        this.O = new x1(this, 0);
    }

    @Override // s4.o0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final kv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        kv0 kv0Var = this.X;
        kv0Var.c = false;
        Object F = this.Y.c.F(i10);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    arrayList = webDocument2 != null ? webDocument2.attributes : null;
                }
            }
        } else {
            if (!(F instanceof TLRPC.Document)) {
                kv0Var.c = true;
                return kv0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        kv0Var.b = 100.0f;
        kv0Var.a = 100.0f;
        kv0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            kv0Var.a = i11;
            kv0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    kv0Var.a = documentAttribute.w;
                    kv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return kv0Var;
    }
}
