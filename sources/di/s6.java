package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
