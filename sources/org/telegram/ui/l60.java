package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class l60 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.k1 H;
    public org.telegram.ui.ActionBar.z2 I;
    public org.telegram.ui.Components.q80 b;
    public z2 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.t80 w;
    public VideoPlayerHolderBase x;
    public v2 y;
    public int a = 0;
    public final ji.a c = new ji.a();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(f4 f4Var, org.telegram.ui.Components.vz0 vz0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, f4 f4Var);
}
