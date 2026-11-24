// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a4b {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static a4b a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        a4b a4bVar = new a4b();
        a4bVar.a = tL_storyAlbum.album_id;
        a4bVar.b = tL_storyAlbum.title;
        a4bVar.c = tL_storyAlbum.icon_photo;
        a4bVar.d = tL_storyAlbum.icon_video;
        return a4bVar;
    }
}
