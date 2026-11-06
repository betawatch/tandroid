package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
