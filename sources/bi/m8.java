package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
