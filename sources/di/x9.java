package di;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ y9 b;

    public x9(y9 y9Var, SurfaceView surfaceView, q9 q9Var) {
        this.b = y9Var;
        if (y9Var.a) {
            with(surfaceView);
        } else {
            with(q9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        y9 y9Var = this.b;
        p4 p4Var = y9Var.G0;
        if (p4Var == null) {
            return;
        }
        p4Var.a = true;
        this.firstFrameRendered = true;
        p4Var.b();
        if (!this.paused || y9Var.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: di.w9
                    public final /* synthetic */ x9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q4 u10 = this.b.b.u();
                                if (u10 != null) {
                                    o4 o4Var = u10.D1;
                                    if (o4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(u10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q4 u11 = this.b.b.u();
                                if (u11 != null) {
                                    o4 o4Var2 = u11.D1;
                                    if (o4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(u11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: di.w9
                    public final /* synthetic */ x9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                q4 u10 = this.b.b.u();
                                if (u10 != null) {
                                    o4 o4Var = u10.D1;
                                    if (o4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(u10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q4 u11 = this.b.b.u();
                                if (u11 != null) {
                                    o4 o4Var2 = u11.D1;
                                    if (o4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(u11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var2.a.id, sb3);
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
