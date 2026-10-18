package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
