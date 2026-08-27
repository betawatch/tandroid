package jh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static k6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        k6 k6Var = new k6();
        k6Var.a = tL_storyAlbum.album_id;
        k6Var.b = tL_storyAlbum.title;
        k6Var.c = tL_storyAlbum.icon_photo;
        k6Var.d = tL_storyAlbum.icon_video;
        return k6Var;
    }
}
