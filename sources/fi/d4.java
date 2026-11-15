package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d4 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.u5 f;
    public final org.telegram.ui.Components.u5 g;
    public final org.telegram.ui.Components.u5 h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public d4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        er erVar = er.h;
        this.f = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.g = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.h = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.P();
        }
        i10[] i10VarArr = l7.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = np.s1(imageReceiver.d).e2(storyItem.dialogId);
            t8Var.l(e22);
            imageReceiver.i0(e22, t8Var, null);
        } else {
            if (messageMedia != null && (document = messageMedia.document) != null) {
                imageReceiver.r0(gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, fc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                imageReceiver.f();
            } else {
                imageReceiver.u0(null, null, gc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, fc.m(photo.sizes), 0L, null, storyItem, 0);
            }
        }
    }
}
