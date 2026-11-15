package fi;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.b;
        a4 a4Var = i9Var.G0;
        if (a4Var == null) {
            return;
        }
        a4Var.a = true;
        this.firstFrameRendered = true;
        a4Var.b();
        if (!this.paused || i9Var.D0 == null) {
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
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: fi.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                b4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    z3 z3Var = z11.y1;
                                    if (z3Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.r(z3Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                b4 z12 = this.b.b.z();
                                if (z12 != null) {
                                    z3 z3Var2 = z12.y1;
                                    if (z3Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.r(z3Var2.a.id, sb3);
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
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: fi.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                b4 z11 = this.b.b.z();
                                if (z11 != null) {
                                    z3 z3Var = z11.y1;
                                    if (z3Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.r(z3Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                b4 z12 = this.b.b.z();
                                if (z12 != null) {
                                    z3 z3Var2 = z12.y1;
                                    if (z3Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.r(z3Var2.a.id, sb3);
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
