package di;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ p9 b;

    public o9(p9 p9Var, SurfaceView surfaceView, h9 h9Var) {
        this.b = p9Var;
        if (p9Var.a) {
            with(surfaceView);
        } else {
            with(h9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.l1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        p9 p9Var = this.b;
        h4 h4Var = p9Var.F0;
        if (h4Var == null) {
            return;
        }
        h4Var.a = true;
        this.firstFrameRendered = true;
        h4Var.b();
        if (!this.paused || p9Var.C0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z9, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.a = true;
                final int i10 = 0;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: di.n9
                    public final /* synthetic */ o9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i4 z10 = this.b.b.z();
                                if (z10 != null) {
                                    g4 g4Var = z10.x1;
                                    if (g4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(g4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    g4 g4Var2 = z11.x1;
                                    if (g4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(g4Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i7 == 3) {
                this.a = false;
                final int i11 = 1;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: di.n9
                    public final /* synthetic */ o9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i4 z10 = this.b.b.z();
                                if (z10 != null) {
                                    g4 g4Var = z10.x1;
                                    if (g4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(g4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    g4 g4Var2 = z11.x1;
                                    if (g4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(g4Var2.a.id, sb3);
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
