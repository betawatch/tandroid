package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ kj h;
    public final /* synthetic */ fj n;
    public final /* synthetic */ fj r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ ud(MediaController mediaController, int i7, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, bw bwVar) {
        this.b = mediaController;
        this.c = i7;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = kjVar;
        this.n = fjVar;
        this.r = fjVar2;
        this.s = storyItem;
        this.w = bwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        int i7 = this.a;
        Object obj = this.w;
        switch (i7) {
            case 0:
                mi miVar = (mi) obj;
                long j3 = this.e;
                long j10 = this.f;
                kj kjVar = this.h;
                fj fjVar = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.j0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = miVar.e;
                int i10 = this.d;
                tL_document.user_id = i10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                bz.y();
                mediaController.k1 = new le(miVar.a);
                w7.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = z0.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.a.add(absolutePath);
                }
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = miVar.d;
                    mediaController.m1 = miVar.c;
                    mediaController.w1 = miVar.b;
                    mediaController.v1 = miVar.f;
                    mediaController.n1 = j3;
                    mediaController.p1 = j10;
                    mediaController.q1 = kjVar;
                    fj fjVar2 = this.n;
                    mediaController.o1 = fjVar2 == null ? 0L : fj.b2(mediaController.i1, fjVar2.k, false, false);
                    mediaController.i1 = i10;
                    mediaController.r1 = fjVar;
                    mediaController.s1 = fjVar2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    g0.g3(new fn(mediaController, file2, tL_document3, file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null, miVar, 5));
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
                    g0.g3(new di.c9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (bw) obj);
                break;
        }
    }

    public /* synthetic */ ud(MediaController mediaController, int i7, mi miVar, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i7;
        this.w = miVar;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = kjVar;
        this.n = fjVar;
        this.r = fjVar2;
        this.s = storyItem;
    }
}
