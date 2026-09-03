package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j31 implements m31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.qc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ nh.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public j31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = qcVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void b() {
        AndroidUtilities.runOnUIThread(new b11(6, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void c() {
        this.e.run();
    }
}
