package oh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        return this.b.j1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.b;
        e4 e4Var = i9Var.D0;
        if (e4Var == null) {
            return;
        }
        e4Var.f = true;
        this.firstFrameRendered = true;
        e4Var.a();
        if (!this.paused || i9Var.z0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z4, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.a = true;
                final int i11 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: oh.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f4 t6 = this.b.b.t();
                                if (t6 != null) {
                                    d4 d4Var = t6.L1;
                                    if (d4Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        l.d.t(d4Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f4 t9 = this.b.b.t();
                                if (t9 != null) {
                                    d4 d4Var2 = t9.L1;
                                    if (d4Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        l.d.t(d4Var2.a.id, sb2);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: oh.g9
                    public final /* synthetic */ h9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f4 t6 = this.b.b.t();
                                if (t6 != null) {
                                    d4 d4Var = t6.L1;
                                    if (d4Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        l.d.t(d4Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f4 t9 = this.b.b.t();
                                if (t9 != null) {
                                    d4 d4Var2 = t9.L1;
                                    if (d4Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        l.d.t(d4Var2.a.id, sb2);
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
