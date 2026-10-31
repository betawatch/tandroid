package ig;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.pu0;
import v7.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 {
    public final Bitmap a;
    public int b;

    public r1(Bitmap bitmap) {
        this.a = bitmap;
    }

    public static int b(pu0 pu0Var) {
        int i10 = (int) pu0Var.a;
        int i11 = (int) pu0Var.b;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i12 = iArr[0];
        GLES20.glBindTexture(3553, i12);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
        return i12;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        this.b = 0;
        if (!z10 || (bitmap = this.a) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public final int c() {
        int i10 = this.b;
        if (i10 != 0) {
            return i10;
        }
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.b = i11;
        GLES20.glBindTexture(3553, i11);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        try {
            GLUtils.texImage2D(3553, 0, 6408, this.a, 5121, 0);
        } catch (Exception e) {
            f8.g(e, true);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i12 = width * height;
            int[] iArr2 = new int[i12];
            this.a.getPixels(iArr2, 0, width, 0, 0, width, height);
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = iArr2[i13];
                iArr2[i13] = ((i14 >> 16) & zs.e4) | (i14 & (-16711936)) | ((i14 & zs.e4) << 16);
            }
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, IntBuffer.wrap(iArr2));
        }
        if (!bitmap.isRecycled() && Build.VERSION.SDK_INT <= 28) {
            int pixel = bitmap.getPixel(0, 0);
            int i15 = ((pixel >> 16) & zs.e4) | (pixel & (-16711936)) | ((pixel & zs.e4) << 16);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.putInt(i15).position(0);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, 1, 1, 6408, 5121, allocateDirect);
        }
        h8.a();
        return this.b;
    }
}
