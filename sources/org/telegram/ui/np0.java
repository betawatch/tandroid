package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class np0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.xc l;
    public boolean m;
    public final org.telegram.ui.Components.h6 n;
    public int o;
    public final /* synthetic */ op0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public np0(op0 op0Var) {
        this.r = op0Var;
        this.l = new org.telegram.ui.Components.xc(op0Var);
        this.n = new org.telegram.ui.Components.h6(op0Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        op0 op0Var = this.r;
        org.telegram.ui.ActionBar.u6 u6Var = op0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q5 = u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a();
        int i10 = op0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, u6Var));
            paint.setColor(peerColor.hasColor6(q5) ? peerColor.getColor(1, u6Var) : peerColor.getColor(0, u6Var));
            this.f = peerColor.hasColor6(q5);
            this.g = false;
            return;
        }
        if (q5 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, u6Var));
            paint.setColor(peerColor.getColor(0, u6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, u6Var));
            paint.setColor(peerColor.getColor(1, u6Var));
        }
        this.c.setColor(peerColor.getColor(2, u6Var));
        this.f = peerColor.hasColor2(q5);
        this.g = peerColor.hasColor3(q5);
    }
}
