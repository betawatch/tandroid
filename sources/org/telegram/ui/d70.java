package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.o1 D;
    public org.telegram.ui.ActionBar.f3 E;
    public org.telegram.ui.Components.z80 b;
    public f3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.c90 v;
    public VideoPlayerHolderBase w;
    public b3 x;
    public int a = 0;
    public final org.telegram.ui.Components.v80 c = new org.telegram.ui.Components.v80();
    public final a0.h y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(k4 k4Var, org.telegram.ui.Components.d01 d01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, k4 k4Var);
}
