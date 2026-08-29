package af;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.s;
import i7.w;
import j3.k0;
import java.util.HashMap;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static int n;
    public static final Rect o = new Rect();
    public final s3 a;
    public final cf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final cf.a g;
    public final df.c h;
    public final s i;
    public View j;
    public View k;
    public k0 l;
    public boolean m;

    public g(s3 s3Var, f fVar) {
        int i10 = n;
        n = i10 + 1;
        df.c cVar = new df.c();
        this.h = cVar;
        s sVar = new s(new e(this, 0));
        this.i = sVar;
        StringBuilder sb2 = new StringBuilder();
        String str = fVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = fVar.b;
        this.d = fVar.e;
        this.e = fVar.d;
        this.f = fVar.f;
        this.a = s3Var;
        cVar.c(fVar.h, fVar.i);
        this.l = fVar.g;
        this.k = fVar.k;
        this.b = new cf.e(this);
        View view = fVar.j;
        sVar.O(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) s3Var.a).put(sb3, this);
        s3Var.g();
    }

    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            a2.setAutoEnterEnabled(i10 >= 31);
        }
        return a2.build();
    }

    public final void b(boolean z10) {
        boolean z11 = this.h.b() && this.g.g();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                s3 s3Var = this.a;
                s3Var.g();
                ((a) s3Var.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.O(null);
        s3 s3Var = this.a;
        if (((HashMap) s3Var.a).remove(this.c) != null) {
            s3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.a.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean c3;
        s3 s3Var = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) s3Var.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) s3Var.d;
        int[] iArr = df.d.a;
        view.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int width = view.getWidth() + i12;
        int height = view.getHeight() + i13;
        int i14 = iArr[0];
        int b10 = w.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = w.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = w.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = w.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        df.c cVar = this.h;
        Rect rect2 = cVar.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                c3 = cVar.c(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            s3Var.a(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        c3 = cVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= c3;
        if (z10) {
        }
    }
}
