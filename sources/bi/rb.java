package bi;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class rb extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ sb b;

    public rb(sb sbVar, SurfaceView surfaceView, kb kbVar) {
        this.b = sbVar;
        if (sbVar.a) {
            with(surfaceView);
        } else {
            with(kbVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        sb sbVar = this.b;
        p5 p5Var = sbVar.G0;
        if (p5Var == null) {
            return;
        }
        p5Var.a = true;
        this.firstFrameRendered = true;
        p5Var.b();
        if (!this.paused || sbVar.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bi.qb
                    public final /* synthetic */ rb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q5 t10 = this.b.b.t();
                                if (t10 != null) {
                                    o5 o5Var = t10.O1;
                                    if (o5Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q5 t11 = this.b.b.t();
                                if (t11 != null) {
                                    o5 o5Var2 = t11.O1;
                                    if (o5Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bi.qb
                    public final /* synthetic */ rb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                q5 t10 = this.b.b.t();
                                if (t10 != null) {
                                    o5 o5Var = t10.O1;
                                    if (o5Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q5 t11 = this.b.b.t();
                                if (t11 != null) {
                                    o5 o5Var2 = t11.O1;
                                    if (o5Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var2.a.id, sb3);
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
