package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class b7 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static b7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        b7 b7Var = new b7();
        b7Var.a = tL_storyAlbum.album_id;
        b7Var.b = tL_storyAlbum.title;
        b7Var.c = tL_storyAlbum.icon_photo;
        b7Var.d = tL_storyAlbum.icon_video;
        return b7Var;
    }
}
