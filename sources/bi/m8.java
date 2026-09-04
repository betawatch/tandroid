package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m8 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static m8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        m8 m8Var = new m8();
        m8Var.a = tL_storyAlbum.album_id;
        m8Var.b = tL_storyAlbum.title;
        m8Var.c = tL_storyAlbum.icon_photo;
        m8Var.d = tL_storyAlbum.icon_video;
        return m8Var;
    }
}
