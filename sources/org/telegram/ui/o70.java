package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class o70 {
    public String C;
    public int D;
    public org.telegram.ui.ActionBar.p1 E;
    public org.telegram.ui.ActionBar.h3 F;
    public org.telegram.ui.Components.h90 b;
    public d3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.k90 v;
    public VideoPlayerHolderBase w;
    public z2 x;
    public int a = 0;
    public final org.telegram.ui.Components.d90 c = new org.telegram.ui.Components.d90();
    public final a0.h y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.o01 o01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
