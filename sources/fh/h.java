package fh;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h extends eh.h {
    public final MessageObject b;
    public final RadialProgress2 c;

    public h(MessageObject messageObject) {
        this.b = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.c = radialProgress2;
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isDocumentHasThumb(document)) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
            radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = MessageObject.getArtworkUrl(document, true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        radialProgress2.g(k6.ie, k6.je, k6.uc, k6.vc);
    }

    @Override // eh.h
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.m(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override // eh.h
    public final void b() {
        super.b();
        this.c.f();
    }

    @Override // eh.h
    public final void c(Canvas canvas, int i10, int i11) {
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.setCircleRadius(i10 / 2);
        radialProgress2.q(0, 0, i10, i11);
        radialProgress2.draw(canvas);
    }
}
