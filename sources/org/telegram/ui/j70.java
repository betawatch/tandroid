package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class j70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.k3 I;
    public org.telegram.ui.Components.ba0 b;
    public a3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.ea0 v;
    public VideoPlayerHolderBase w;
    public w2 x;
    public int a = 0;
    public final org.telegram.ui.Components.x90 c = new org.telegram.ui.Components.x90();
    public final a0.h y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.v11 v11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
