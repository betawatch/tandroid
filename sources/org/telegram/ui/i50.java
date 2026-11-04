package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class i50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.f1 I;
    public org.telegram.ui.ActionBar.t2 J;
    public org.telegram.ui.Components.t70 b;
    public a3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.w70 w;
    public VideoPlayerHolderBase x;
    public w2 y;
    public int a = 0;
    public final m2.p0 c = new m2.p0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(g4 g4Var, org.telegram.ui.Components.py0 py0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, g4 g4Var);
}
