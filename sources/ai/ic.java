package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class ic extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ jc b;

    public ic(jc jcVar, SurfaceView surfaceView, bc bcVar) {
        this.b = jcVar;
        if (jcVar.a) {
            with(surfaceView);
        } else {
            with(bcVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        jc jcVar = this.b;
        d6 d6Var = jcVar.G0;
        if (d6Var == null) {
            return;
        }
        d6Var.a = true;
        this.firstFrameRendered = true;
        d6Var.b();
        if (!this.paused || jcVar.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ai.hc
                    public final /* synthetic */ ic b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e6 t10 = this.b.b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.z0.n(c6Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e6 t11 = this.b.b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.z0.n(c6Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ai.hc
                    public final /* synthetic */ ic b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e6 t10 = this.b.b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.z0.n(c6Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e6 t11 = this.b.b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.z0.n(c6Var2.a.id, sb3);
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
