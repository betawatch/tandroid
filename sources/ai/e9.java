package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
