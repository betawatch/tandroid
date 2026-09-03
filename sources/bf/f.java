package bf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.r;
import j3.f0;
import java.util.HashMap;
import k7.n;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f {
    public static int n;
    public static final Rect o = new Rect();
    public final s3 a;
    public final df.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final df.a g;
    public final ef.c h;
    public final r i;
    public View j;
    public View k;
    public f0 l;
    public boolean m;

    public f(s3 s3Var, e eVar) {
        int i10 = n;
        n = i10 + 1;
        ef.c cVar = new ef.c();
        this.h = cVar;
        d dVar = new d(this, 0);
        r rVar = new r();
        rVar.d = new ef.b(rVar, 0);
        rVar.a = dVar;
        this.i = rVar;
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
        this.a = s3Var;
        cVar.c(eVar.h, eVar.i);
        this.l = eVar.g;
        this.k = eVar.k;
        this.b = new df.e(this);
        View view = eVar.j;
        rVar.o(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) s3Var.a).put(sb2, this);
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

    public final void b(boolean z4) {
        boolean z10 = this.h.b() && this.g.g();
        if (this.m != z10) {
            this.m = z10;
            if (z4) {
                s3 s3Var = this.a;
                s3Var.g();
                ((a) s3Var.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.o(null);
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
        int[] iArr = ef.d.a;
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
        int b10 = n.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = n.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = n.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = n.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        ef.c cVar = this.h;
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
            s3Var.a(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        c3 = cVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z4 |= c3;
        if (z4) {
        }
    }
}
