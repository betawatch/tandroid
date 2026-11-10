package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ nj h;
    public final /* synthetic */ ij n;
    public final /* synthetic */ ij r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ wd(MediaController mediaController, int i7, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        this.b = mediaController;
        this.c = i7;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = njVar;
        this.n = ijVar;
        this.r = ijVar2;
        this.s = storyItem;
        this.w = hwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        int i7 = this.a;
        Object obj = this.w;
        switch (i7) {
            case 0:
                pi piVar = (pi) obj;
                long j3 = this.e;
                long j10 = this.f;
                nj njVar = this.h;
                ij ijVar = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.j0(true);
                MediaController mediaController = this.b;
                mediaController.B1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f1 = tL_document;
                mediaController.g1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = piVar.e;
                int i10 = this.d;
                tL_document.user_id = p10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                iz.y();
                mediaController.j1 = new ne(piVar.a);
                w7.z(4).mkdirs();
                File file = mediaController.j1;
                Set set = z0.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.a.add(absolutePath);
                }
                try {
                    mediaController.d1 = true;
                    mediaController.k1 = piVar.d;
                    mediaController.l1 = piVar.c;
                    mediaController.v1 = piVar.b;
                    mediaController.u1 = piVar.f;
                    mediaController.m1 = j3;
                    mediaController.o1 = j10;
                    mediaController.p1 = njVar;
                    ij ijVar2 = this.n;
                    mediaController.n1 = ijVar2 == null ? 0L : ij.b2(mediaController.h1, ijVar2.k, false, false);
                    mediaController.h1 = i10;
                    mediaController.q1 = ijVar;
                    mediaController.r1 = ijVar2;
                    mediaController.s1 = storyItem;
                    mediaController.t1 = mediaController.t1;
                    TLRPC.TL_document tL_document3 = mediaController.f1;
                    File file2 = mediaController.j1;
                    g0.h3(new mn(mediaController, file2, tL_document3, file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null, piVar, 5));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f1 = null;
                    z0.b(mediaController.j1);
                    mediaController.j1.delete();
                    mediaController.j1 = null;
                    try {
                        mediaController.e1.release();
                        mediaController.e1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new bi.ia(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (hw) obj);
                break;
        }
    }

    public /* synthetic */ wd(MediaController mediaController, int i7, pi piVar, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i7;
        this.w = piVar;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = njVar;
        this.n = ijVar;
        this.r = ijVar2;
        this.s = storyItem;
    }
}
