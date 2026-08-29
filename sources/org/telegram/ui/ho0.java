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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ho0 extends View {
    public boolean A;
    public int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 n;
    public int r;
    public int s;
    public int v;
    public int w;
    public RadialGradient x;
    public final Paint y;

    public ho0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.n = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.y = new Paint(1);
        this.b = c6Var;
        this.a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, c6Var);
            this.f = v02;
            this.e = v02;
        } else {
            boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
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
            int i10 = this.v;
            int i11 = this.w;
            float distance = AndroidUtilities.distance(0.0f, 0.0f, i10, i11) * 0.75f;
            this.s = a10;
            this.r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i10 / 2.0f, i11 * 0.4f, distance, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        } else {
            canvas2 = canvas;
        }
        float f9 = this.c;
        if (f9 > 0.0f) {
            paint.setAlpha((int) (f9 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i10 = org.telegram.ui.ActionBar.g6.v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        return i0.a.d(this.c, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.d ? org.telegram.ui.ActionBar.g6.v0(i10, c6Var) : -1);
    }

    public int getColor() {
        return i0.a.d(this.c, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, this.b), i0.a.d(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int v02 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i11 = f5Var.c;
        org.telegram.ui.Components.f5 f5Var2 = this.n;
        return i0.a.d(this.c, v02, AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, f5Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, i0.a.d(0.75f, f5Var.c, f5Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.A) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f9) {
        if (Math.abs(this.c - f9) > 0.001f) {
            this.c = f9;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
