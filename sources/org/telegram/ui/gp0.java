package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class gp0 extends View {
    public boolean E;
    public boolean F;
    public int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 n;
    public int r;
    public int s;
    public int v;
    public int w;
    public RadialGradient x;
    public final Paint y;

    public gp0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.h = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.n = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.y = new Paint(1);
        this.b = f6Var;
        this.a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, f6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i11);
        }
        c(peerColor, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, f6Var);
            this.f = v02;
            this.e = v02;
        } else {
            boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
            this.e = peerColor.getBgColor1(a2);
            this.f = peerColor.getBgColor2(a2);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int a2 = this.h.a(this.e, false);
        int a10 = this.n.a(this.f, false);
        RadialGradient radialGradient = this.x;
        Paint paint = this.y;
        if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != getWidth() || this.w != getHeight()) {
            this.v = getWidth();
            this.w = getHeight();
            float f7 = this.v;
            float f10 = this.w;
            float distance = AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f;
            this.s = a10;
            this.r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, distance, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c >= 1.0f || this.E) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        }
        paint.setAlpha(this.E ? 255 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        return i0.a.d(this.c, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.d ? org.telegram.ui.ActionBar.j6.v0(i10, f6Var) : -1);
    }

    public int getColor() {
        return i0.a.d(this.c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.b), i0.a.d(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int v02 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var) : org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        org.telegram.ui.Components.g5 g5Var = this.h;
        int i11 = g5Var.c;
        org.telegram.ui.Components.g5 g5Var2 = this.n;
        return i0.a.d(this.c, v02, AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, g5Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var) : org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, g5Var.c, g5Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.em.C(230.0f, AndroidUtilities.statusBarHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.c - f7) > 0.001f) {
            this.c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
