// default package

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class l8b extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ m8b b;

    public l8b(m8b m8bVar, SurfaceView surfaceView, e8b e8bVar) {
        this.b = m8bVar;
        if (m8bVar.a) {
            with(surfaceView);
        } else {
            with(e8bVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        m8b m8bVar = this.b;
        c30 c30Var = m8bVar.G0;
        if (c30Var != null) {
            c30Var.a = true;
            this.firstFrameRendered = true;
            c30Var.m();
            if (!this.paused || m8bVar.D0 == null) {
                return;
            }
            prepareStub();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                final byte b = 0;
                gl.c3(new Runnable(this) { // from class: k8b
                    public final /* synthetic */ l8b b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        l8b l8bVar = this.b;
                        switch (b2) {
                            case 0:
                                y28 w = l8bVar.b.w();
                                if (w != null) {
                                    x28 x28Var = w.E1;
                                    if (x28Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b00.p(x28Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                y28 w2 = l8bVar.b.w();
                                if (w2 != null) {
                                    x28 x28Var2 = w2.E1;
                                    if (x28Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b00.p(x28Var2.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i == 3) {
                this.a = false;
                final byte b2 = 1;
                gl.c3(new Runnable(this) { // from class: k8b
                    public final /* synthetic */ l8b b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        l8b l8bVar = this.b;
                        switch (b22) {
                            case 0:
                                y28 w = l8bVar.b.w();
                                if (w != null) {
                                    x28 x28Var = w.E1;
                                    if (x28Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b00.p(x28Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                y28 w2 = l8bVar.b.w();
                                if (w2 != null) {
                                    x28 x28Var2 = w2.E1;
                                    if (x28Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b00.p(x28Var2.a.id, sb2);
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
