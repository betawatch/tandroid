package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ lj h;
    public final /* synthetic */ gj n;
    public final /* synthetic */ gj r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ vd(MediaController mediaController, int i7, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, fw fwVar) {
        this.b = mediaController;
        this.c = i7;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = ljVar;
        this.n = gjVar;
        this.r = gjVar2;
        this.s = storyItem;
        this.w = fwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        int i7 = this.a;
        Object obj = this.w;
        switch (i7) {
            case 0:
                ni niVar = (ni) obj;
                long j3 = this.e;
                long j10 = this.f;
                lj ljVar = this.h;
                gj gjVar = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.j0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = niVar.e;
                int i10 = this.d;
                tL_document.user_id = m10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                gz.y();
                mediaController.k1 = new me(niVar.a);
                w7.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = z0.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.a.add(absolutePath);
                }
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = niVar.d;
                    mediaController.m1 = niVar.c;
                    mediaController.w1 = niVar.b;
                    mediaController.v1 = niVar.f;
                    mediaController.n1 = j3;
                    mediaController.p1 = j10;
                    mediaController.q1 = ljVar;
                    gj gjVar2 = this.n;
                    mediaController.o1 = gjVar2 == null ? 0L : gj.b2(mediaController.i1, gjVar2.k, false, false);
                    mediaController.i1 = i10;
                    mediaController.r1 = gjVar;
                    mediaController.s1 = gjVar2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    g0.h3(new jn(mediaController, file2, tL_document3, file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null, niVar, 5));
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
                    g0.h3(new di.y8(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (fw) obj);
                break;
        }
    }

    public /* synthetic */ vd(MediaController mediaController, int i7, ni niVar, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i7;
        this.w = niVar;
        this.d = i10;
        this.e = j3;
        this.f = j10;
        this.h = ljVar;
        this.n = gjVar;
        this.r = gjVar2;
        this.s = storyItem;
    }
}
