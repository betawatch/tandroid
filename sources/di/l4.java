package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l4 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.v5 f;
    public final org.telegram.ui.Components.v5 g;
    public final org.telegram.ui.Components.v5 h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public l4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        wq wqVar = wq.h;
        this.f = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.g = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.h = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.P();
        }
        e10[] e10VarArr = s7.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = qp.s1(imageReceiver.d).e2(storyItem.dialogId);
            v8Var.l(e22);
            imageReceiver.i0(e22, v8Var, null);
        } else {
            if (messageMedia != null && (document = messageMedia.document) != null) {
                imageReceiver.r0(hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                imageReceiver.f();
            } else {
                imageReceiver.u0(null, null, hc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
            }
        }
    }
}
