package ih;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static o6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        o6 o6Var = new o6();
        o6Var.a = tL_storyAlbum.album_id;
        o6Var.b = tL_storyAlbum.title;
        o6Var.c = tL_storyAlbum.icon_photo;
        o6Var.d = tL_storyAlbum.icon_video;
        return o6Var;
    }
}
