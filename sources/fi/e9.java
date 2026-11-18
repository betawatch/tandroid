package fi;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ f9 b;

    public e9(f9 f9Var, SurfaceView surfaceView, x8 x8Var) {
        this.b = f9Var;
        if (f9Var.a) {
            with(surfaceView);
        } else {
            with(x8Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        f9 f9Var = this.b;
        y3 y3Var = f9Var.G0;
        if (y3Var == null) {
            return;
        }
        y3Var.a = true;
        this.firstFrameRendered = true;
        y3Var.b();
        if (!this.paused || f9Var.D0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.a = true;
                final int i10 = 0;
                org.telegram.messenger.g0.g3(new Runnable(this) { // from class: fi.d9
                    public final /* synthetic */ e9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                z3 z11 = this.b.b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.y1;
                                    if (x3Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                z3 z12 = this.b.b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.y1;
                                    if (x3Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.a.id, sb3);
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
                org.telegram.messenger.g0.g3(new Runnable(this) { // from class: fi.d9
                    public final /* synthetic */ e9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                z3 z11 = this.b.b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.y1;
                                    if (x3Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                z3 z12 = this.b.b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.y1;
                                    if (x3Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.a.id, sb3);
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
