package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e9 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static e9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        e9 e9Var = new e9();
        e9Var.a = tL_storyAlbum.album_id;
        e9Var.b = tL_storyAlbum.title;
        e9Var.c = tL_storyAlbum.icon_photo;
        e9Var.d = tL_storyAlbum.icon_video;
        return e9Var;
    }
}
