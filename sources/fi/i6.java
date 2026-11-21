package fi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static i6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        i6 i6Var = new i6();
        i6Var.a = tL_storyAlbum.album_id;
        i6Var.b = tL_storyAlbum.title;
        i6Var.c = tL_storyAlbum.icon_photo;
        i6Var.d = tL_storyAlbum.icon_video;
        return i6Var;
    }
}
