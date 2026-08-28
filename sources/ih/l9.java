package ih;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ m9 b;

    public l9(m9 m9Var, SurfaceView surfaceView, e9 e9Var) {
        this.b = m9Var;
        if (m9Var.a) {
            with(surfaceView);
        } else {
            with(e9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.i1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        m9 m9Var = this.b;
        h4 h4Var = m9Var.C0;
        if (h4Var == null) {
            return;
        }
        h4Var.f = true;
        this.firstFrameRendered = true;
        h4Var.a();
        if (!this.paused || m9Var.y0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i9) {
        if (i9 == 3 || i9 == 2) {
            if (this.firstFrameRendered && i9 == 2) {
                this.a = true;
                final int i10 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ih.k9
                    public final /* synthetic */ l9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    g4 g4Var = t10.K1;
                                    if (g4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    g4 g4Var2 = t11.K1;
                                    if (g4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i9 == 3) {
                this.a = false;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ih.k9
                    public final /* synthetic */ l9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    g4 g4Var = t10.K1;
                                    if (g4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    g4 g4Var2 = t11.K1;
                                    if (g4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var2.a.id, sb3);
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
