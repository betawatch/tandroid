package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qv0 {
    public MessagesController.PeerColor a;
    public org.telegram.ui.ActionBar.c6 b;
    public int c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        this.a = peerColor;
        if (peerColor == null) {
            this.c = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, this.b);
            this.c = i0.b.d(this.e, this.c, 603979776);
            this.d = i0.b.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int d = i0.b.d(0.75f, bgColor2, bgColor1);
        int v02 = AndroidUtilities.computePerceivedBrightness(d) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, d);
        this.c = v02;
        this.d = AndroidUtilities.computePerceivedBrightness(v02) > 0.721f ? -16777216 : -1;
        this.c = i0.b.d(this.e, this.c, 603979776);
        this.d = i0.b.d(this.e, this.d, -1);
    }
}
