package di;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ q9 b;

    public p9(q9 q9Var, SurfaceView surfaceView, i9 i9Var) {
        this.b = q9Var;
        if (q9Var.a) {
            with(surfaceView);
        } else {
            with(i9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.l1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        q9 q9Var = this.b;
        i4 i4Var = q9Var.F0;
        if (i4Var == null) {
            return;
        }
        i4Var.a = true;
        this.firstFrameRendered = true;
        i4Var.b();
        if (!this.paused || q9Var.C0 == null) {
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
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: di.o9
                    public final /* synthetic */ p9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j4 z10 = this.b.b.z();
                                if (z10 != null) {
                                    h4 h4Var = z10.x1;
                                    if (h4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(h4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    h4 h4Var2 = z11.x1;
                                    if (h4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(h4Var2.a.id, sb3);
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
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: di.o9
                    public final /* synthetic */ p9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j4 z10 = this.b.b.z();
                                if (z10 != null) {
                                    h4 h4Var = z10.x1;
                                    if (h4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(h4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    h4 h4Var2 = z11.x1;
                                    if (h4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(h4Var2.a.id, sb3);
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
