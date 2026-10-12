package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p8 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static p8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        p8 p8Var = new p8();
        p8Var.a = tL_storyAlbum.album_id;
        p8Var.b = tL_storyAlbum.title;
        p8Var.c = tL_storyAlbum.icon_photo;
        p8Var.d = tL_storyAlbum.icon_video;
        return p8Var;
    }
}
