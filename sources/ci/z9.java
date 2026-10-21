package ci;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class z9 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ aa b;

    public z9(aa aaVar, SurfaceView surfaceView, s9 s9Var) {
        this.b = aaVar;
        if (aaVar.a) {
            with(surfaceView);
        } else {
            with(s9Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        aa aaVar = this.b;
        p4 p4Var = aaVar.G0;
        if (p4Var == null) {
            return;
        }
        p4Var.a = true;
        this.firstFrameRendered = true;
        p4Var.b();
        if (!this.paused || aaVar.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ci.y9
                    public final /* synthetic */ z9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.O1;
                                    if (o4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.O1;
                                    if (o4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ci.y9
                    public final /* synthetic */ z9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                q4 t10 = this.b.b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.O1;
                                    if (o4Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q4 t11 = this.b.b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.O1;
                                    if (o4Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var2.a.id, sb3);
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
