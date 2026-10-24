package ci;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class y9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ z9 b;

    public y9(z9 z9Var, SurfaceView surfaceView, r9 r9Var) {
        this.b = z9Var;
        if (z9Var.a) {
            with(surfaceView);
        } else {
            with(r9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        z9 z9Var = this.b;
        o4 o4Var = z9Var.G0;
        if (o4Var == null) {
            return;
        }
        o4Var.a = true;
        this.firstFrameRendered = true;
        o4Var.b();
        if (!this.paused || z9Var.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ci.x9
                    public final /* synthetic */ y9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    n4 n4Var = t10.O1;
                                    if (n4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.v0.n(n4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                p4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    n4 n4Var2 = t11.O1;
                                    if (n4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.v0.n(n4Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ci.x9
                    public final /* synthetic */ y9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                p4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    n4 n4Var = t10.O1;
                                    if (n4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.v0.n(n4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                p4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    n4 n4Var2 = t11.O1;
                                    if (n4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.v0.n(n4Var2.a.id, sb3);
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
