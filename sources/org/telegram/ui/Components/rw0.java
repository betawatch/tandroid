package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rw0 {
    public MessagesController.PeerColor a;
    public org.telegram.ui.ActionBar.f6 b;
    public int c;
    public int d;
    public float e;

    public final void a(MessagesController.PeerColor peerColor) {
        this.a = peerColor;
        if (peerColor == null) {
            this.c = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.b);
            this.c = i0.a.d(this.e, this.c, 603979776);
            this.d = i0.a.d(this.e, this.d, -1);
            return;
        }
        int bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int d = i0.a.d(0.75f, bgColor2, bgColor1);
        int v02 = AndroidUtilities.computePerceivedBrightness(d) > 0.721f ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var) : org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, d);
        this.c = v02;
        this.d = AndroidUtilities.computePerceivedBrightness(v02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.d(this.e, this.c, 603979776);
        this.d = i0.a.d(this.e, this.d, -1);
    }
}
