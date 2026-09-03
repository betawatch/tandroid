package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jp0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.rc l;
    public boolean m;
    public final org.telegram.ui.Components.z5 n;
    public int o;
    public final /* synthetic */ kp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public jp0(kp0 kp0Var) {
        this.r = kp0Var;
        this.l = new org.telegram.ui.Components.rc(kp0Var);
        this.n = new org.telegram.ui.Components.z5(kp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        kp0 kp0Var = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = kp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q10 = g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a();
        int i10 = kp0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, g6Var));
            paint.setColor(peerColor.hasColor6(q10) ? peerColor.getColor(1, g6Var) : peerColor.getColor(0, g6Var));
            this.f = peerColor.hasColor6(q10);
            this.g = false;
            return;
        }
        if (q10 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, g6Var));
            paint.setColor(peerColor.getColor(0, g6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, g6Var));
            paint.setColor(peerColor.getColor(1, g6Var));
        }
        this.c.setColor(peerColor.getColor(2, g6Var));
        this.f = peerColor.hasColor2(q10);
        this.g = peerColor.hasColor3(q10);
    }
}
