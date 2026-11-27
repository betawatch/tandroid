// default package

import java.io.File;
import java.util.Set;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class en6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ b77 h;
    public final /* synthetic */ r47 n;
    public final /* synthetic */ r47 r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ en6(MediaController mediaController, int i, int i2, long j, long j2, b77 b77Var, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, c5a c5aVar) {
        this.b = mediaController;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = b77Var;
        this.n = r47Var;
        this.r = r47Var2;
        this.s = storyItem;
        this.w = c5aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        byte b = this.a;
        Object obj = this.w;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (c5a) obj);
                break;
            default:
                gs6 gs6Var = (gs6) obj;
                long j = this.e;
                long j2 = this.f;
                b77 b77Var = this.h;
                r47 r47Var = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.l0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = (byte) 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = gs6Var.e;
                int i = this.d;
                tL_document.user_id = yac.h(i).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                xea.x();
                mediaController.k1 = new tn6(gs6Var.a);
                xb4.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = u60.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    u60.a.add(absolutePath);
                }
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = gs6Var.d;
                    mediaController.m1 = gs6Var.c;
                    mediaController.w1 = gs6Var.b;
                    mediaController.v1 = gs6Var.f;
                    mediaController.n1 = j;
                    mediaController.p1 = j2;
                    mediaController.q1 = b77Var;
                    r47 r47Var2 = this.n;
                    mediaController.o1 = r47Var2 == null ? 0L : r47.b2(mediaController.i1, r47Var2.k, false, false);
                    mediaController.i1 = i;
                    mediaController.r1 = r47Var;
                    mediaController.s1 = r47Var2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    hl.c3(new tw4((Object) mediaController, (Object) file2, (Object) tL_document3, (Object) (file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null), (Object) gs6Var, (byte) 20));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    mediaController.g1 = null;
                    u60.b(mediaController.k1);
                    mediaController.k1.delete();
                    mediaController.k1 = null;
                    try {
                        mediaController.f1.release();
                        mediaController.f1 = null;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    MediaController.l0(false);
                    hl.c3(new lb2((Object) mediaController, i, j, (byte) 2));
                }
                break;
        }
    }

    public /* synthetic */ en6(MediaController mediaController, int i, gs6 gs6Var, int i2, long j, long j2, b77 b77Var, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i;
        this.w = gs6Var;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = b77Var;
        this.n = r47Var;
        this.r = r47Var2;
        this.s = storyItem;
    }
}
