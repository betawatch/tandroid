package eh;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i extends dh.h {
    public final TLRPC.Document b;
    public final Object c;

    public i(TLRPC.Document document, Object obj) {
        this.b = document;
        this.c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.a;
        boolean z4 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
        MessageObject.isAnimatedStickerDocument(document, true);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "38_38", DocumentObject.getSvgThumb(document, j6.lc, 1.0f), document.size, z4 ? "webp" : null, obj, 0);
    }

    @Override // dh.h
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
