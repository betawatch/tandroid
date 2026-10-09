package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f9 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static f9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        f9 f9Var = new f9();
        f9Var.a = tL_storyAlbum.album_id;
        f9Var.b = tL_storyAlbum.title;
        f9Var.c = tL_storyAlbum.icon_photo;
        f9Var.d = tL_storyAlbum.icon_video;
        return f9Var;
    }
}
