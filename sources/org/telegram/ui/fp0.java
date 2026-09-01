package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fp0 {
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
    public final /* synthetic */ gp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public fp0(gp0 gp0Var) {
        this.r = gp0Var;
        this.l = new org.telegram.ui.Components.rc(gp0Var);
        this.n = new org.telegram.ui.Components.z5(gp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        gp0 gp0Var = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = gp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q10 = g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a();
        int i10 = gp0Var.c;
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
