// default package

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ew extends i98 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ o c;

    public ew(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override // i98, o98
    public final void C() {
        this.c.k();
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i < 0) {
            return null;
        }
        List list = this.b;
        if (i >= list.size()) {
            return null;
        }
        o oVar = this.c;
        hw hwVar = oVar.v0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i);
        int[] iArr = this.a;
        ImageReceiver d0 = d0(hwVar, pageBlock, iArr);
        if (d0 == null) {
            return null;
        }
        p98 p98Var = new p98();
        p98Var.b = iArr[0];
        p98Var.c = iArr[1];
        p98Var.d = oVar.v0[0].b;
        p98Var.a = d0;
        p98Var.e = d0.p();
        p98Var.h = d0.z();
        p98Var.j = oVar.K0;
        return p98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i) {
        TL_iv.PageBlock pageBlock;
        lbc lbcVar;
        TextureView textureView;
        vf6 vf6Var;
        int i2;
        int childCount;
        yv yvVar;
        Bitmap bitmap;
        yv yvVar2;
        Bitmap bitmap2;
        xv xvVar = null;
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i);
                lbcVar = PhotoViewer.r0().G2;
                textureView = PhotoViewer.r0().C2;
                SurfaceView surfaceView = PhotoViewer.r0().D2;
                o oVar = this.c;
                m[] mVarArr = oVar.v0;
                vf6Var = oVar.E;
                i2 = 0;
                hw hwVar = mVarArr[0].b;
                childCount = hwVar.getChildCount();
                while (true) {
                    if (i2 < childCount) {
                        break;
                    }
                    View childAt = hwVar.getChildAt(i2);
                    if (childAt instanceof xv) {
                        xv xvVar2 = (xv) childAt;
                        if (xvVar2.M == pageBlock) {
                            xvVar = xvVar2;
                            break;
                        }
                    }
                    i2++;
                }
                if (xvVar != null && lbcVar != null && textureView != null) {
                    long j = xvVar.M.video_id;
                    yv yvVar3 = new yv();
                    yvVar3.a = lbcVar.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            gl.x0(surface, createBitmap);
                            surface.release();
                            yvVar3.b = createBitmap;
                        } else {
                            yvVar3.b = textureView.getBitmap();
                        }
                    }
                    xvVar.c(yvVar3);
                    vf6Var.k(yvVar3, j);
                    xvVar.n.setAlpha(0.0f);
                    yvVar2 = xvVar.N;
                    if (yvVar2 != null && (bitmap2 = yvVar2.b) != null) {
                        xvVar.e.f0(bitmap2);
                    }
                }
                if (xvVar != null && lbcVar != null && surfaceView != null) {
                    long j2 = xvVar.M.video_id;
                    yv yvVar4 = new yv();
                    yvVar4.a = lbcVar.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        gl.y0(surfaceView, createBitmap2);
                        yvVar4.b = createBitmap2;
                    }
                    xvVar.c(yvVar4);
                    vf6Var.k(yvVar4, j2);
                    xvVar.n.setAlpha(0.0f);
                    yvVar = xvVar.N;
                    if (yvVar != null && (bitmap = yvVar.b) != null) {
                        xvVar.e.f0(bitmap);
                    }
                }
                oVar.k();
            }
        }
        pageBlock = null;
        lbcVar = PhotoViewer.r0().G2;
        textureView = PhotoViewer.r0().C2;
        SurfaceView surfaceView2 = PhotoViewer.r0().D2;
        o oVar2 = this.c;
        m[] mVarArr2 = oVar2.v0;
        vf6Var = oVar2.E;
        i2 = 0;
        hw hwVar2 = mVarArr2[0].b;
        childCount = hwVar2.getChildCount();
        while (true) {
            if (i2 < childCount) {
            }
            i2++;
        }
        if (xvVar != null) {
            long j3 = xvVar.M.video_id;
            yv yvVar32 = new yv();
            yvVar32.a = lbcVar.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            xvVar.c(yvVar32);
            vf6Var.k(yvVar32, j3);
            xvVar.n.setAlpha(0.0f);
            yvVar2 = xvVar.N;
            if (yvVar2 != null) {
                xvVar.e.f0(bitmap2);
            }
        }
        if (xvVar != null) {
            long j22 = xvVar.M.video_id;
            yv yvVar42 = new yv();
            yvVar42.a = lbcVar.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            xvVar.c(yvVar42);
            vf6Var.k(yvVar42, j22);
            xvVar.n.setAlpha(0.0f);
            yvVar = xvVar.N;
            if (yvVar != null) {
                xvVar.e.f0(bitmap);
            }
        }
        oVar2.k();
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageReceiver e0 = e0(viewGroup.getChildAt(i), pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        y29 y29Var;
        ImageReceiver e0;
        ImageReceiver e02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof cv) {
            cv cvVar = (cv) view;
            if (cvVar.O != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return cvVar.e;
        }
        if (view instanceof xv) {
            xv xvVar = (xv) view;
            ImageReceiver imageReceiver = xvVar.e;
            TextureView textureView = xvVar.n;
            if (xvVar.M != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            o oVar = this.c;
            if (xvVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    gl.x0(surface, createBitmap);
                    surface.release();
                    imageReceiver.f0(createBitmap);
                } else {
                    imageReceiver.f0(textureView.getBitmap());
                }
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof mu) {
            ImageReceiver d0 = d0(((mu) view).a, pageBlock, iArr);
            if (d0 != null) {
                return d0;
            }
            return null;
        }
        if (view instanceof pv) {
            ImageReceiver d02 = d0(((pv) view).b, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        }
        if (view instanceof xu) {
            y29 y29Var2 = ((xu) view).d;
            if (y29Var2 == null || (e02 = e0(y29Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e02;
        }
        if (!(view instanceof av) || (y29Var = ((av) view).d) == null || (e0 = e0(y29Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e0;
    }
}
