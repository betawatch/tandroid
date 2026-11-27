// default package

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class kcb extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ lcb b;

    public kcb(lcb lcbVar, SurfaceView surfaceView, dcb dcbVar) {
        this.b = lcbVar;
        if (lcbVar.a) {
            with(surfaceView);
        } else {
            with(dcbVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        lcb lcbVar = this.b;
        d30 d30Var = lcbVar.G0;
        if (d30Var != null) {
            d30Var.a = true;
            this.firstFrameRendered = true;
            d30Var.m();
            if (!this.paused || lcbVar.D0 == null) {
                return;
            }
            prepareStub();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                final byte b = 0;
                hl.c3(new Runnable(this) { // from class: jcb
                    public final /* synthetic */ kcb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        kcb kcbVar = this.b;
                        switch (b2) {
                            case 0:
                                o68 w = kcbVar.b.w();
                                if (w != null) {
                                    n68 n68Var = w.y1;
                                    if (n68Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        c00.q(n68Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                o68 w2 = kcbVar.b.w();
                                if (w2 != null) {
                                    n68 n68Var2 = w2.y1;
                                    if (n68Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        c00.q(n68Var2.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i == 3) {
                this.a = false;
                final byte b2 = 1;
                hl.c3(new Runnable(this) { // from class: jcb
                    public final /* synthetic */ kcb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        kcb kcbVar = this.b;
                        switch (b22) {
                            case 0:
                                o68 w = kcbVar.b.w();
                                if (w != null) {
                                    n68 n68Var = w.y1;
                                    if (n68Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        c00.q(n68Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                o68 w2 = kcbVar.b.w();
                                if (w2 != null) {
                                    n68 n68Var2 = w2.y1;
                                    if (n68Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        c00.q(n68Var2.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}
