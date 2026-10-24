package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class f70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.h3 I;
    public org.telegram.ui.Components.z90 b;
    public c3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.ca0 v;
    public VideoPlayerHolderBase w;
    public y2 x;
    public int a = 0;
    public final org.telegram.ui.Components.v90 c = new org.telegram.ui.Components.v90();
    public final a0.h y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(i4 i4Var, org.telegram.ui.Components.m11 m11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, i4 i4Var);
}
