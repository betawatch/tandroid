package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class d70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.n1 D;
    public org.telegram.ui.ActionBar.e3 E;
    public org.telegram.ui.Components.q80 b;
    public f3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.t80 v;
    public VideoPlayerHolderBase w;
    public b3 x;
    public int a = 0;
    public final org.telegram.ui.Components.m80 c = new org.telegram.ui.Components.m80();
    public final a0.h y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(k4 k4Var, org.telegram.ui.Components.tz0 tz0Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, k4 k4Var);
}
