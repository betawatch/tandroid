package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jx0 {
    public MessagesController.PeerColor a;
    public org.telegram.ui.ActionBar.e6 b;
    public int c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        this.a = peerColor;
        if (peerColor == null) {
            this.c = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s8, this.b);
            this.c = i0.a.d(this.e, this.c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.i6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.i6.I.q());
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        int w02 = AndroidUtilities.computePerceivedBrightness(d) > 0.721f ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.v6, e6Var) : org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, d);
        this.c = w02;
        this.d = AndroidUtilities.computePerceivedBrightness(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.d(this.e, this.c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
