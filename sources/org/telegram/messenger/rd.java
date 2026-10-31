package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ oj h;
    public final /* synthetic */ jj n;
    public final /* synthetic */ jj r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ rd(MediaController mediaController, int i10, int i11, long j10, long j11, oj ojVar, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, sw swVar) {
        this.b = mediaController;
        this.c = i10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.h = ojVar;
        this.n = jjVar;
        this.r = jjVar2;
        this.s = storyItem;
        this.w = swVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        int i10 = this.a;
        Object obj = this.w;
        switch (i10) {
            case 0:
                pi piVar = (pi) obj;
                long j10 = this.e;
                long j11 = this.f;
                oj ojVar = this.h;
                jj jjVar = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.j0(true);
                MediaController mediaController = this.b;
                mediaController.A1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.e1 = tL_document;
                mediaController.f1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = piVar.e;
                int i11 = this.d;
                tL_document.user_id = d20.i(i11).e();
                TLRPC.TL_document tL_document2 = mediaController.e1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                tz.y();
                mediaController.i1 = new ne(piVar.a);
                b8.z(4).mkdirs();
                File file = mediaController.i1;
                Set set = c1.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    c1.a.add(absolutePath);
                }
                try {
                    mediaController.c1 = true;
                    mediaController.j1 = piVar.d;
                    mediaController.k1 = piVar.c;
                    mediaController.u1 = piVar.b;
                    mediaController.t1 = piVar.f;
                    mediaController.l1 = j10;
                    mediaController.n1 = j11;
                    mediaController.o1 = ojVar;
                    jj jjVar2 = this.n;
                    mediaController.m1 = jjVar2 == null ? 0L : jj.c2(mediaController.g1, jjVar2.k, false, false);
                    mediaController.g1 = i11;
                    mediaController.p1 = jjVar;
                    mediaController.q1 = jjVar2;
                    mediaController.r1 = storyItem;
                    mediaController.s1 = mediaController.s1;
                    TLRPC.TL_document tL_document3 = mediaController.e1;
                    File file2 = mediaController.i1;
                    i0.g3(new cn(mediaController, file2, tL_document3, file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null, piVar, 5));
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    mediaController.e1 = null;
                    c1.b(mediaController.i1);
                    mediaController.i1.delete();
                    mediaController.i1 = null;
                    try {
                        mediaController.d1.release();
                        mediaController.d1 = null;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    MediaController.j0(false);
                    i0.g3(new dd(mediaController, i11, j10, 1));
                    return;
                }
            default:
                MediaController.b(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (sw) obj);
                break;
        }
    }

    public /* synthetic */ rd(MediaController mediaController, int i10, pi piVar, int i11, long j10, long j11, oj ojVar, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i10;
        this.w = piVar;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.h = ojVar;
        this.n = jjVar;
        this.r = jjVar2;
        this.s = storyItem;
    }
}
