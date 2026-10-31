package jf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i2.i0;
import java.util.HashMap;
import k2.q0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f {
    public static int n;
    public static final Rect o = new Rect();
    public final j2.f a;
    public final lf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final lf.a g;
    public final q0 h;
    public final ji.f i;
    public View j;
    public View k;
    public i0 l;
    public boolean m;

    public f(j2.f fVar, e eVar) {
        int i10 = n;
        n = i10 + 1;
        q0 q0Var = new q0();
        this.h = q0Var;
        ji.f fVar2 = new ji.f(new d(this, 0));
        this.i = fVar2;
        StringBuilder sb2 = new StringBuilder();
        String str = eVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = eVar.b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f = eVar.f;
        this.a = fVar;
        q0Var.d(eVar.h, eVar.i);
        this.l = eVar.g;
        this.k = eVar.k;
        this.b = new lf.e(this);
        View view = eVar.j;
        fVar2.v(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) fVar.a).put(sb3, this);
        fVar.H();
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
        boolean z11 = this.h.c() && this.g.q();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                j2.f fVar = this.a;
                fVar.H();
                ((a) fVar.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.v(null);
        j2.f fVar = this.a;
        if (((HashMap) fVar.a).remove(this.c) != null) {
            fVar.H();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.a.m(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean d;
        j2.f fVar = this.a;
        if (org.telegram.messenger.i0.H1((LaunchActivity) fVar.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) fVar.d;
        int[] iArr = mf.b.a;
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
        int b10 = u.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = u.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = u.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = u.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        q0 q0Var = this.h;
        Rect rect2 = (Rect) q0Var.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                d = q0Var.d(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            fVar.m(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        d = q0Var.d(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= d;
        if (z10) {
        }
    }
}
