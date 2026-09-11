package bi;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class ob extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ pb b;

    public ob(pb pbVar, SurfaceView surfaceView, hb hbVar) {
        this.b = pbVar;
        if (pbVar.a) {
            with(surfaceView);
        } else {
            with(hbVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        pb pbVar = this.b;
        n5 n5Var = pbVar.G0;
        if (n5Var == null) {
            return;
        }
        n5Var.a = true;
        this.firstFrameRendered = true;
        n5Var.b();
        if (!this.paused || pbVar.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bi.nb
                    public final /* synthetic */ ob b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                o5 t10 = this.b.b.t();
                                if (t10 != null) {
                                    m5 m5Var = t10.O1;
                                    if (m5Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i2.g.o(m5Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                o5 t11 = this.b.b.t();
                                if (t11 != null) {
                                    m5 m5Var2 = t11.O1;
                                    if (m5Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i2.g.o(m5Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bi.nb
                    public final /* synthetic */ ob b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                o5 t10 = this.b.b.t();
                                if (t10 != null) {
                                    m5 m5Var = t10.O1;
                                    if (m5Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i2.g.o(m5Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                o5 t11 = this.b.b.t();
                                if (t11 != null) {
                                    m5 m5Var2 = t11.O1;
                                    if (m5Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i2.g.o(m5Var2.a.id, sb3);
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
