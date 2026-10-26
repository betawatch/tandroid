package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class h70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.k3 I;
    public org.telegram.ui.Components.aa0 b;
    public a3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.da0 v;
    public VideoPlayerHolderBase w;
    public w2 x;
    public int a = 0;
    public final org.telegram.ui.Components.w90 c = new org.telegram.ui.Components.w90();
    public final a0.h y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.u11 u11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
