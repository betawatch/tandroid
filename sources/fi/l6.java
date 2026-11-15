package fi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static l6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        l6 l6Var = new l6();
        l6Var.a = tL_storyAlbum.album_id;
        l6Var.b = tL_storyAlbum.title;
        l6Var.c = tL_storyAlbum.icon_photo;
        l6Var.d = tL_storyAlbum.icon_video;
        return l6Var;
    }
}
