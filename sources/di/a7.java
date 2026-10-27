package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a7 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static a7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        a7 a7Var = new a7();
        a7Var.a = tL_storyAlbum.album_id;
        a7Var.b = tL_storyAlbum.title;
        a7Var.c = tL_storyAlbum.icon_photo;
        a7Var.d = tL_storyAlbum.icon_video;
        return a7Var;
    }
}
