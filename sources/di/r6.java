package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static r6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        r6 r6Var = new r6();
        r6Var.a = tL_storyAlbum.album_id;
        r6Var.b = tL_storyAlbum.title;
        r6Var.c = tL_storyAlbum.icon_photo;
        r6Var.d = tL_storyAlbum.icon_video;
        return r6Var;
    }
}
