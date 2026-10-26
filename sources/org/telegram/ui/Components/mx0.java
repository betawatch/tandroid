package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mx0 {
    public MessagesController.PeerColor a;
    public org.telegram.ui.ActionBar.u6 b;
    public int c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        this.a = peerColor;
        if (peerColor == null) {
            this.c = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, this.b);
            this.c = i0.a.f(this.e, this.c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.y6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        int f7 = i0.a.f(0.75f, bgColor2, bgColor1);
        int w02 = AndroidUtilities.computePerceivedBrightness(f7) > 0.721f ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, u6Var) : org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, f7);
        this.c = w02;
        this.d = AndroidUtilities.computePerceivedBrightness(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.f(this.e, this.c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
