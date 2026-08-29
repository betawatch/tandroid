package lh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ i9 b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.b = i9Var;
        if (i9Var.a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.i1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.b;
        c4 c4Var = i9Var.C0;
        if (c4Var == null) {
            return;
        }
        c4Var.f = true;
        this.firstFrameRendered = true;
        c4Var.a();
        if (!this.paused || i9Var.y0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.a = true;
                final int i11 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: lh.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    b4 b4Var = t10.K1;
                                    if (b4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        j7.l1.t(b4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    b4 b4Var2 = t11.K1;
                                    if (b4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        j7.l1.t(b4Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i10 == 3) {
                this.a = false;
                final int i12 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: lh.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    b4 b4Var = t10.K1;
                                    if (b4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        j7.l1.t(b4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    b4 b4Var2 = t11.K1;
                                    if (b4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        j7.l1.t(b4Var2.a.id, sb3);
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
