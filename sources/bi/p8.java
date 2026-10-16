package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p8 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static p8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        p8 p8Var = new p8();
        p8Var.a = tL_storyAlbum.album_id;
        p8Var.b = tL_storyAlbum.title;
        p8Var.c = tL_storyAlbum.icon_photo;
        p8Var.d = tL_storyAlbum.icon_video;
        return p8Var;
    }
}
