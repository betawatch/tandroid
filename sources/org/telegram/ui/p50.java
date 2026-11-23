package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class p50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.ActionBar.w2 J;
    public org.telegram.ui.Components.n80 b;
    public z2 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.q80 w;
    public VideoPlayerHolderBase x;
    public v2 y;
    public int a = 0;
    public final n2.o0 c = new n2.o0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.bz0 bz0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
