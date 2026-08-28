package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class a70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.o1 D;
    public org.telegram.ui.ActionBar.f3 E;
    public org.telegram.ui.Components.m80 b;
    public e3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.p80 v;
    public VideoPlayerHolderBase w;
    public a3 x;
    public int a = 0;
    public final org.telegram.ui.Components.i80 c = new org.telegram.ui.Components.i80();
    public final a0.h y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.rz0 rz0Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
