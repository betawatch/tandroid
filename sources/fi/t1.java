package fi;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t1 extends vz {
    public final rw0 X;
    public final /* synthetic */ u1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var) {
        super(100, true);
        this.Y = u1Var;
        this.X = new rw0();
        this.O = new ai.l(this, 2);
    }

    @Override // s4.p0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.vz
    public final rw0 E1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        rw0 rw0Var = this.X;
        rw0Var.c = false;
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
                rw0Var.c = true;
                return rw0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        rw0Var.b = 100.0f;
        rw0Var.a = 100.0f;
        rw0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            rw0Var.a = i11;
            rw0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    rw0Var.a = documentAttribute.w;
                    rw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return rw0Var;
    }
}
