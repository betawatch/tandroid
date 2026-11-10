package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
