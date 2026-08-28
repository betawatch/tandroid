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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class io0 extends View {
    public boolean A;
    public int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.b5 h;
    public final org.telegram.ui.Components.b5 n;
    public int r;
    public int s;
    public int v;
    public int w;
    public RadialGradient x;
    public final Paint y;

    public io0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.n = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.y = new Paint(1);
        this.b = b6Var;
        this.a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, b6Var);
        b(-1, -1, false);
    }

    public final void b(int i9, int i10, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i10 >= 0 && i9 >= 0 && (peerColors = MessagesController.getInstance(i9).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i10);
        }
        c(peerColor, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, b6Var);
            this.f = v02;
            this.e = v02;
        } else {
            boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
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
        int a3 = this.n.a(this.f, false);
        RadialGradient radialGradient = this.x;
        Paint paint = this.y;
        if (radialGradient == null || this.r != a2 || this.s != a3 || this.v != getWidth() || this.w != getHeight()) {
            this.v = getWidth();
            this.w = getHeight();
            int i9 = this.v;
            int i10 = this.w;
            float distance = AndroidUtilities.distance(0.0f, 0.0f, i9, i10) * 0.75f;
            this.s = a3;
            this.r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i9 / 2.0f, i10 * 0.4f, distance, new int[]{a3, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        float f10 = this.c;
        if (f10 > 0.0f) {
            paint.setAlpha((int) (f10 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i9 = org.telegram.ui.ActionBar.f6.v8;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        return i0.a.d(this.c, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.d ? org.telegram.ui.ActionBar.f6.v0(i9, b6Var) : -1);
    }

    public int getColor() {
        return i0.a.d(this.c, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, this.b), i0.a.d(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        int v02 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) > 0.721f ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, b6Var) : org.telegram.ui.ActionBar.f6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        org.telegram.ui.Components.b5 b5Var = this.h;
        int i10 = b5Var.c;
        org.telegram.ui.Components.b5 b5Var2 = this.n;
        return i0.a.d(this.c, v02, AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i10, b5Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, b6Var) : org.telegram.ui.ActionBar.f6.b(0.08f, -0.08f, i0.a.d(0.75f, b5Var.c, b5Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        if (!this.A) {
            i10 = org.telegram.messenger.ll.C(230.0f, AndroidUtilities.statusBarHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.c - f10) > 0.001f) {
            this.c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
