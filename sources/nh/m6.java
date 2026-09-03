package nh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m6 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static m6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        m6 m6Var = new m6();
        m6Var.a = tL_storyAlbum.album_id;
        m6Var.b = tL_storyAlbum.title;
        m6Var.c = tL_storyAlbum.icon_photo;
        m6Var.d = tL_storyAlbum.icon_video;
        return m6Var;
    }
}
