package cf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.s;
import j3.f0;
import java.util.HashMap;
import k7.o;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f {
    public static int n;
    public static final Rect o = new Rect();
    public final r3 a;
    public final ef.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final ef.a g;
    public final ff.c h;
    public final s i;
    public View j;
    public View k;
    public f0 l;
    public boolean m;

    public f(r3 r3Var, e eVar) {
        int i10 = n;
        n = i10 + 1;
        ff.c cVar = new ff.c();
        this.h = cVar;
        d dVar = new d(this, 0);
        s sVar = new s();
        sVar.d = new ff.b(sVar, 0);
        sVar.a = dVar;
        this.i = sVar;
        StringBuilder sb = new StringBuilder();
        String str = eVar.c;
        sb.append(str == null ? "pip-source" : str);
        sb.append("-");
        sb.append(i10);
        String sb2 = sb.toString();
        this.c = sb2;
        this.g = eVar.b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f = eVar.f;
        this.a = r3Var;
        cVar.c(eVar.h, eVar.i);
        this.l = eVar.g;
        this.k = eVar.k;
        this.b = new ef.e(this);
        View view = eVar.j;
        sVar.o(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) r3Var.a).put(sb2, this);
        r3Var.g();
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

    public final void b(boolean z4) {
        boolean z10 = this.h.b() && this.g.g();
        if (this.m != z10) {
            this.m = z10;
            if (z4) {
                r3 r3Var = this.a;
                r3Var.g();
                ((a) r3Var.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.o(null);
        r3 r3Var = this.a;
        if (((HashMap) r3Var.a).remove(this.c) != null) {
            r3Var.g();
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
        r3 r3Var = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) r3Var.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) r3Var.d;
        int[] iArr = ff.d.a;
        view.getLocationOnScreen(iArr);
        boolean z4 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int width = view.getWidth() + i12;
        int height = view.getHeight() + i13;
        int i14 = iArr[0];
        int b10 = o.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = o.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = o.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = o.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        ff.c cVar = this.h;
        Rect rect2 = cVar.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z4 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                c3 = cVar.c(view.getWidth(), view.getHeight());
            }
            if (z4) {
                return;
            }
            b(true);
            r3Var.a(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        c3 = cVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z4 |= c3;
        if (z4) {
        }
    }
}
