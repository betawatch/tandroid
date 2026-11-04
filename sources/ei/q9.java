package ei;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ r9 b;

    public q9(r9 r9Var, SurfaceView surfaceView, j9 j9Var) {
        this.b = r9Var;
        if (r9Var.a) {
            with(surfaceView);
        } else {
            with(j9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.n1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        r9 r9Var = this.b;
        i4 i4Var = r9Var.H0;
        if (i4Var == null) {
            return;
        }
        i4Var.a = true;
        this.firstFrameRendered = true;
        i4Var.b();
        if (!this.paused || r9Var.D0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i3) {
        if (i3 == 3 || i3 == 2) {
            if (this.firstFrameRendered && i3 == 2) {
                this.a = true;
                final int i10 = 0;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: ei.p9
                    public final /* synthetic */ q9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j4 H = this.b.b.H();
                                if (H != null) {
                                    h4 h4Var = H.y1;
                                    if (h4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        k2.p1.q(h4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j4 H2 = this.b.b.H();
                                if (H2 != null) {
                                    h4 h4Var2 = H2.y1;
                                    if (h4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        k2.p1.q(h4Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i3 == 3) {
                this.a = false;
                final int i11 = 1;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: ei.p9
                    public final /* synthetic */ q9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j4 H = this.b.b.H();
                                if (H != null) {
                                    h4 h4Var = H.y1;
                                    if (h4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        k2.p1.q(h4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j4 H2 = this.b.b.H();
                                if (H2 != null) {
                                    h4 h4Var2 = H2.y1;
                                    if (h4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        k2.p1.q(h4Var2.a.id, sb3);
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
