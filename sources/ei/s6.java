package ei;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static s6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        s6 s6Var = new s6();
        s6Var.a = tL_storyAlbum.album_id;
        s6Var.b = tL_storyAlbum.title;
        s6Var.c = tL_storyAlbum.icon_photo;
        s6Var.d = tL_storyAlbum.icon_video;
        return s6Var;
    }
}
