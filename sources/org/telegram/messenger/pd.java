package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ej h;
    public final /* synthetic */ zi n;
    public final /* synthetic */ zi r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ pd(MediaController mediaController, int i3, int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, zv zvVar) {
        this.b = mediaController;
        this.c = i3;
        this.d = i10;
        this.e = j10;
        this.f = j11;
        this.h = ejVar;
        this.n = ziVar;
        this.r = ziVar2;
        this.s = storyItem;
        this.w = zvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        int i3 = this.a;
        Object obj = this.w;
        switch (i3) {
            case 0:
                gi giVar = (gi) obj;
                long j10 = this.e;
                long j11 = this.f;
                ej ejVar = this.h;
                zi ziVar = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.j0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = giVar.e;
                int i10 = this.d;
                tL_document.user_id = h10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                az.y();
                mediaController.k1 = new he(giVar.a);
                w7.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = z0.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.a.add(absolutePath);
                }
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = giVar.d;
                    mediaController.m1 = giVar.c;
                    mediaController.w1 = giVar.b;
                    mediaController.v1 = giVar.f;
                    mediaController.n1 = j10;
                    mediaController.p1 = j11;
                    mediaController.q1 = ejVar;
                    zi ziVar2 = this.n;
                    mediaController.o1 = ziVar2 == null ? 0L : zi.c2(mediaController.i1, ziVar2.k, false, false);
                    mediaController.i1 = i10;
                    mediaController.r1 = ziVar;
                    mediaController.s1 = ziVar2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    g0.h3(new cn(mediaController, file2, tL_document3, file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null, giVar, 5));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.g1 = null;
                    z0.b(mediaController.k1);
                    mediaController.k1.delete();
                    mediaController.k1 = null;
                    try {
                        mediaController.f1.release();
                        mediaController.f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new ci.i9(mediaController, i10, j10, 3));
                    return;
                }
            default:
                MediaController.b(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (zv) obj);
                break;
        }
    }

    public /* synthetic */ pd(MediaController mediaController, int i3, gi giVar, int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i3;
        this.w = giVar;
        this.d = i10;
        this.e = j10;
        this.f = j11;
        this.h = ejVar;
        this.n = ziVar;
        this.r = ziVar2;
        this.s = storyItem;
    }
}
