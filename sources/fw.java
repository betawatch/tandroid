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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fw extends yc8 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ o c;

    public fw(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override // yc8, ed8
    public final void C() {
        this.c.k();
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i < 0) {
            return null;
        }
        List list = this.b;
        if (i >= list.size()) {
            return null;
        }
        o oVar = this.c;
        iw iwVar = oVar.v0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i);
        int[] iArr = this.a;
        ImageReceiver e0 = e0(iwVar, pageBlock, iArr);
        if (e0 == null) {
            return null;
        }
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = oVar.v0[0].b;
        fd8Var.a = e0;
        fd8Var.e = e0.p();
        fd8Var.h = e0.z();
        fd8Var.j = oVar.K0;
        return fd8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(int i) {
        TL_iv.PageBlock pageBlock;
        kfc kfcVar;
        TextureView textureView;
        zh6 zh6Var;
        int i2;
        int childCount;
        zv zvVar;
        Bitmap bitmap;
        zv zvVar2;
        Bitmap bitmap2;
        yv yvVar = null;
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i);
                kfcVar = PhotoViewer.q0().G2;
                textureView = PhotoViewer.q0().C2;
                SurfaceView surfaceView = PhotoViewer.q0().D2;
                o oVar = this.c;
                m[] mVarArr = oVar.v0;
                zh6Var = oVar.E;
                i2 = 0;
                iw iwVar = mVarArr[0].b;
                childCount = iwVar.getChildCount();
                while (true) {
                    if (i2 < childCount) {
                        break;
                    }
                    View childAt = iwVar.getChildAt(i2);
                    if (childAt instanceof yv) {
                        yv yvVar2 = (yv) childAt;
                        if (yvVar2.M == pageBlock) {
                            yvVar = yvVar2;
                            break;
                        }
                    }
                    i2++;
                }
                if (yvVar != null && kfcVar != null && textureView != null) {
                    long j = yvVar.M.video_id;
                    zv zvVar3 = new zv();
                    zvVar3.a = kfcVar.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            hl.x0(surface, createBitmap);
                            surface.release();
                            zvVar3.b = createBitmap;
                        } else {
                            zvVar3.b = textureView.getBitmap();
                        }
                    }
                    yvVar.c(zvVar3);
                    zh6Var.k(j, zvVar3);
                    yvVar.n.setAlpha(0.0f);
                    zvVar2 = yvVar.N;
                    if (zvVar2 != null && (bitmap2 = zvVar2.b) != null) {
                        yvVar.e.f0(bitmap2);
                    }
                }
                if (yvVar != null && kfcVar != null && surfaceView != null) {
                    long j2 = yvVar.M.video_id;
                    zv zvVar4 = new zv();
                    zvVar4.a = kfcVar.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        hl.y0(surfaceView, createBitmap2);
                        zvVar4.b = createBitmap2;
                    }
                    yvVar.c(zvVar4);
                    zh6Var.k(j2, zvVar4);
                    yvVar.n.setAlpha(0.0f);
                    zvVar = yvVar.N;
                    if (zvVar != null && (bitmap = zvVar.b) != null) {
                        yvVar.e.f0(bitmap);
                    }
                }
                oVar.k();
            }
        }
        pageBlock = null;
        kfcVar = PhotoViewer.q0().G2;
        textureView = PhotoViewer.q0().C2;
        SurfaceView surfaceView2 = PhotoViewer.q0().D2;
        o oVar2 = this.c;
        m[] mVarArr2 = oVar2.v0;
        zh6Var = oVar2.E;
        i2 = 0;
        iw iwVar2 = mVarArr2[0].b;
        childCount = iwVar2.getChildCount();
        while (true) {
            if (i2 < childCount) {
            }
            i2++;
        }
        if (yvVar != null) {
            long j3 = yvVar.M.video_id;
            zv zvVar32 = new zv();
            zvVar32.a = kfcVar.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            yvVar.c(zvVar32);
            zh6Var.k(j3, zvVar32);
            yvVar.n.setAlpha(0.0f);
            zvVar2 = yvVar.N;
            if (zvVar2 != null) {
                yvVar.e.f0(bitmap2);
            }
        }
        if (yvVar != null) {
            long j22 = yvVar.M.video_id;
            zv zvVar42 = new zv();
            zvVar42.a = kfcVar.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            yvVar.c(zvVar42);
            zh6Var.k(j22, zvVar42);
            yvVar.n.setAlpha(0.0f);
            zvVar = yvVar.N;
            if (zvVar != null) {
                yvVar.e.f0(bitmap);
            }
        }
        oVar2.k();
    }

    public final ImageReceiver e0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageReceiver f0 = f0(viewGroup.getChildAt(i), pageBlock, iArr);
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }

    public final ImageReceiver f0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        n69 n69Var;
        ImageReceiver f0;
        ImageReceiver f02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof dv) {
            dv dvVar = (dv) view;
            if (dvVar.O != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return dvVar.e;
        }
        if (view instanceof yv) {
            yv yvVar = (yv) view;
            ImageReceiver imageReceiver = yvVar.e;
            TextureView textureView = yvVar.n;
            if (yvVar.M != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            o oVar = this.c;
            if (yvVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    hl.x0(surface, createBitmap);
                    surface.release();
                    imageReceiver.f0(createBitmap);
                } else {
                    imageReceiver.f0(textureView.getBitmap());
                }
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof nu) {
            ImageReceiver e0 = e0(((nu) view).a, pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
            return null;
        }
        if (view instanceof qv) {
            ImageReceiver e02 = e0(((qv) view).b, pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
            return null;
        }
        if (view instanceof yu) {
            n69 n69Var2 = ((yu) view).d;
            if (n69Var2 == null || (f02 = f0(n69Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return f02;
        }
        if (!(view instanceof bv) || (n69Var = ((bv) view).d) == null || (f0 = f0(n69Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return f0;
    }
}
