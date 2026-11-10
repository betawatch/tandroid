package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class db extends mi.l {
    public int W;
    public jq0 X;
    public final /* synthetic */ mb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(mb mbVar, org.telegram.ui.Components.pj0 pj0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, pj0Var, h6Var);
        this.Y = mbVar;
        this.W = -1;
    }

    @Override // mi.l, v4.k
    public final void N() {
        super.N();
        jq0 jq0Var = this.X;
        if (jq0Var != null) {
            org.telegram.messenger.g0.r(jq0Var);
        }
        jq0 jq0Var2 = new jq0(this, 20);
        this.X = jq0Var2;
        org.telegram.messenger.g0.h3(jq0Var2);
    }

    @Override // mi.l
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(mb.R0, this.W, false);
        }
        jq0 jq0Var = this.X;
        if (jq0Var != null) {
            org.telegram.messenger.g0.r(jq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
