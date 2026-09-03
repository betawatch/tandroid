package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class p70 {
    public String C;
    public int D;
    public org.telegram.ui.ActionBar.p1 E;
    public org.telegram.ui.ActionBar.g3 F;
    public org.telegram.ui.Components.g90 b;
    public f3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.j90 v;
    public VideoPlayerHolderBase w;
    public b3 x;
    public int a = 0;
    public final org.telegram.ui.Components.c90 c = new org.telegram.ui.Components.c90();
    public final a0.h y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(l4 l4Var, org.telegram.ui.Components.o01 o01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, l4 l4Var);
}
